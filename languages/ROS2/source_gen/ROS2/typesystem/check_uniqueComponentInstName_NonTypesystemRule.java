package ROS2.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SConcept;

public class check_uniqueComponentInstName_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_uniqueComponentInstName_NonTypesystemRule() {
  }
  public void applyRule(final SNode system, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    final List<String> component_names = ListSequence.fromList(new ArrayList<String>());
    ListSequence.fromList(SLinkOperations.getChildren(system, LINKS.components$OPPm)).visitAll(new IVisitor<SNode>() {
      public void visit(SNode instance) {
        // if a namespace is defined, then append the namespace to the component instance name 
        String name = ((AttributeOperations.getAttribute(instance, new IAttributeDescriptor.NodeAttribute(CONCEPTS.Namespace$XK)) == null) ? SPropertyOperations.getString(instance, PROPS.name$MnvL) : SPropertyOperations.getString(AttributeOperations.getAttribute(instance, new IAttributeDescriptor.NodeAttribute(CONCEPTS.Namespace$XK)), PROPS.name$MnvL) + "/" + SPropertyOperations.getString(instance, PROPS.name$MnvL));
        if ((int) ListSequence.fromList(component_names).indexOf(name) == -1) {
          ListSequence.fromList(component_names).addElement(name);
        } else {
          {
            final MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(instance, "Component instances names should be unique or be on a unique namespace", "r:32754cbf-4758-422a-8eaf-16202a1e987c(ROS2.typesystem)", "7739291674974241579", null, errorTarget);
          }
        }
      }
    });
  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.System$7o;
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink components$OPPm = MetaAdapterFactory.getContainmentLink(0x218e40b475d44de8L, 0x83e6b31e4da8bceeL, 0x17882579cafcccdbL, 0x17882579cafd2efbL, "components");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Namespace$XK = MetaAdapterFactory.getConcept(0x73f2d64e927d48dcL, 0x89c7793f38431f94L, 0x28eca1beb2f1bfe4L, "ROS2.structure.Namespace");
    /*package*/ static final SConcept System$7o = MetaAdapterFactory.getConcept(0x218e40b475d44de8L, 0x83e6b31e4da8bceeL, 0x17882579cafcccdbL, "Component.structure.System");
  }
}

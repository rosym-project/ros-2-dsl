package ROS2.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;
import jetbrains.mps.smodel.builder.SNodeBuilder;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SReferenceLink;

public final class AddCapabilityAnnotation_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public AddCapabilityAnnotation_Intention() {
    super(Kind.NORMAL, false, new SNodePointer("r:186844af-000e-4714-9838-4712fa7d54ad(ROS2.intentions)", "3597278078448416367"));
  }
  @Override
  public String getPresentation() {
    return "AddCapabilityAnnotation";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(CONCEPTS.CapabilityProfileAnnotation$9I)) == null)) {
        return "Add capabilities QoS profile";
      } else {
        return "Remove capabilities QoS profile";
      }
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(CONCEPTS.CapabilityProfileAnnotation$9I)) == null)) {
        AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(CONCEPTS.CapabilityProfileAnnotation$9I), createCapabilityProfileAnnotation_p1q0xw_a0a0a0a0());
      } else {
        AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(CONCEPTS.CapabilityProfileAnnotation$9I), null);
      }
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return AddCapabilityAnnotation_Intention.this;
    }
  }
  private static SNode createCapabilityProfileAnnotation_p1q0xw_a0a0a0a0() {
    SNodeBuilder n0 = new SNodeBuilder().init(CONCEPTS.CapabilityProfileAnnotation$9I);
    n0.setReferenceTarget(LINKS.profile$BWnM, null);
    return n0.getResult();
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept CapabilityProfileAnnotation$9I = MetaAdapterFactory.getConcept(0x73f2d64e927d48dcL, 0x89c7793f38431f94L, 0x22f0a573da97db52L, "ROS2.structure.CapabilityProfileAnnotation");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink profile$BWnM = MetaAdapterFactory.getReferenceLink(0x73f2d64e927d48dcL, 0x89c7793f38431f94L, 0x22f0a573da97db52L, 0x31ec195a68373325L, "profile");
  }
}

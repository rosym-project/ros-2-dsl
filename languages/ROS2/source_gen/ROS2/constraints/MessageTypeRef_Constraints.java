package ROS2.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class MessageTypeRef_Constraints extends BaseConstraintsDescriptor {
  public MessageTypeRef_Constraints() {
    super(CONCEPTS.MessageTypeRef$8j);
  }

  @Override
  protected ConstraintFunction<ConstraintContext_CanBeChild, Boolean> calculateCanBeChildConstraint() {
    return new ConstraintFunction<ConstraintContext_CanBeChild, Boolean>() {
      @NotNull
      public Boolean invoke(@NotNull ConstraintContext_CanBeChild context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = staticCanBeAChild(context.getNode(), context.getParentNode(), context.getConcept(), context.getLink());

        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
        }

        return result;
      }
    };
  }
  private static boolean staticCanBeAChild(SNode node, SNode parentNode, SAbstractConcept childConcept, SContainmentLink link) {
    return !(SNodeOperations.getConcept(parentNode).equals(CONCEPTS.Property$yZ));
  }
  private static final SNodePointer canBeChildBreakingPoint = new SNodePointer("r:c3fa9807-d69c-47fc-a7c2-7fd642e8f257(ROS2.constraints)", "7739291674976352887");

  private static final class CONCEPTS {
    /*package*/ static final SConcept MessageTypeRef$8j = MetaAdapterFactory.getConcept(0x73f2d64e927d48dcL, 0x89c7793f38431f94L, 0x6b677cc61c077ee4L, "ROS2.structure.MessageTypeRef");
    /*package*/ static final SConcept Property$yZ = MetaAdapterFactory.getConcept(0x218e40b475d44de8L, 0x83e6b31e4da8bceeL, 0x17882579cafccceaL, "Component.structure.Property");
  }
}
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
import org.jetbrains.mps.openapi.language.SContainmentLink;

public final class AddRemappings_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public AddRemappings_Intention() {
    super(Kind.NORMAL, false, new SNodePointer("r:186844af-000e-4714-9838-4712fa7d54ad(ROS2.intentions)", "3597278078448476954"));
  }
  @Override
  public String getPresentation() {
    return "AddRemappings";
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
      if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(CONCEPTS.Remappings$bb)) == null)) {
        return "Add remappings to component instance";
      } else {
        return "Remove remappings from component instance";
      }
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(CONCEPTS.Remappings$bb)) == null)) {
        AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(CONCEPTS.Remappings$bb), createRemappings_ibsxz0_a0a0a0a0());
      } else {
        AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(CONCEPTS.Remappings$bb), null);
      }
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return AddRemappings_Intention.this;
    }
  }
  private static SNode createRemappings_ibsxz0_a0a0a0a0() {
    SNodeBuilder n0 = new SNodeBuilder().init(CONCEPTS.Remappings$bb);
    n0.forChild(LINKS.remappings$v1W_).initNull();
    return n0.getResult();
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Remappings$bb = MetaAdapterFactory.getConcept(0x73f2d64e927d48dcL, 0x89c7793f38431f94L, 0x22f0a573da97db55L, "ROS2.structure.Remappings");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink remappings$v1W_ = MetaAdapterFactory.getContainmentLink(0x73f2d64e927d48dcL, 0x89c7793f38431f94L, 0x22f0a573da97db55L, 0x31ec195a6838a2b4L, "remappings");
  }
}

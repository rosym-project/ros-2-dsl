package ROS2.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionAspectDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public final class IntentionsDescriptor extends AbstractIntentionAspectDescriptor {
  private static final IntentionFactory[] EMPTY_ARRAY = new IntentionFactory[0];
  private Map<SAbstractConcept, IntentionFactory[]> myCached = new HashMap<SAbstractConcept, IntentionFactory[]>();

  public IntentionsDescriptor() {
  }

  @Nullable
  public Collection<IntentionFactory> getIntentions(@NotNull SAbstractConcept concept) {
    if (myCached.containsKey(concept)) {
      return Arrays.asList(myCached.get(concept));
    }

    IntentionFactory[] intentions = EMPTY_ARRAY;
    SAbstractConcept cncpt = concept;
    switch (conceptIndex.index(cncpt)) {
      case 0:
        if (true) {
          // concept 
          intentions = new IntentionFactory[1];
          intentions[0] = new AddOperationPort_Intention();
        }
        break;
      case 1:
        if (true) {
          // concept 
          intentions = new IntentionFactory[1];
          intentions[0] = new AddRequirementsAnnotationToConnections_Intention();
        }
        break;
      case 2:
        if (true) {
          // concept 
          intentions = new IntentionFactory[2];
          intentions[0] = new AddRemappings_Intention();
          intentions[1] = new AddNamespace_Intention();
        }
        break;
      case 3:
        if (true) {
          // concept 
          intentions = new IntentionFactory[1];
          intentions[0] = new AddCapabilityToOperationAnnotation_Intention();
        }
        break;
      case 4:
        if (true) {
          // concept 
          intentions = new IntentionFactory[1];
          intentions[0] = new AddCapabilityToIPortAnnotation_Intention();
        }
        break;
      case 5:
        if (true) {
          // concept 
          intentions = new IntentionFactory[1];
          intentions[0] = new AddRequirementsAnnotationToOperations_Intention();
        }
        break;
      case 6:
        if (true) {
          // concept 
          intentions = new IntentionFactory[3];
          intentions[0] = new AddMonitor_Intention();
          intentions[1] = new AddDefaultQoS_Intention();
          intentions[2] = new AddOperationConnectors_Intention();
        }
        break;
      default:
    }
    myCached.put(concept, intentions);
    return Arrays.asList(intentions);
  }

  @NotNull
  @Override
  public Collection<IntentionFactory> getAllIntentions() {
    IntentionFactory[] rv = new IntentionFactory[10];
    rv[0] = new AddCapabilityToIPortAnnotation_Intention();
    rv[1] = new AddRequirementsAnnotationToConnections_Intention();
    rv[2] = new AddRemappings_Intention();
    rv[3] = new AddMonitor_Intention();
    rv[4] = new AddNamespace_Intention();
    rv[5] = new AddOperationPort_Intention();
    rv[6] = new AddCapabilityToOperationAnnotation_Intention();
    rv[7] = new AddDefaultQoS_Intention();
    rv[8] = new AddOperationConnectors_Intention();
    rv[9] = new AddRequirementsAnnotationToOperations_Intention();
    return Arrays.asList(rv);
  }
  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x218e40b475d44de8L, 0x83e6b31e4da8bceeL, 0x17882579cafcccdaL), MetaIdFactory.conceptId(0x218e40b475d44de8L, 0x83e6b31e4da8bceeL, 0x17882579cafcccdcL), MetaIdFactory.conceptId(0x218e40b475d44de8L, 0x83e6b31e4da8bceeL, 0x5408c2d7e8f00aeeL), MetaIdFactory.conceptId(0x73f2d64e927d48dcL, 0x89c7793f38431f94L, 0x2cc4976fc53337a5L), MetaIdFactory.conceptId(0x218e40b475d44de8L, 0x83e6b31e4da8bceeL, 0x17882579cafcccdeL), MetaIdFactory.conceptId(0x73f2d64e927d48dcL, 0x89c7793f38431f94L, 0x69023be9ff802cb6L), MetaIdFactory.conceptId(0x218e40b475d44de8L, 0x83e6b31e4da8bceeL, 0x17882579cafcccdbL)).seal();
}

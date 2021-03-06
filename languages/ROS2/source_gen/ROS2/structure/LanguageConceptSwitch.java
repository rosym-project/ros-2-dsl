package ROS2.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int ActionDefinition = 0;
  public static final int CapabilityProfileAnnotation = 1;
  public static final int ClientPort = 2;
  public static final int ClientPortRef = 3;
  public static final int ConnectionRef = 4;
  public static final int DefaultQoS = 5;
  public static final int IOperationPort = 6;
  public static final int MessageDefinition = 7;
  public static final int MessageTypeRef = 8;
  public static final int Monitor = 9;
  public static final int Namespace = 10;
  public static final int OperationConnector = 11;
  public static final int OperationConnectorAnnotation = 12;
  public static final int OperationPortRef = 13;
  public static final int OperationPorts = 14;
  public static final int ROSDefinitions = 15;
  public static final int RemappingArgument = 16;
  public static final int Remappings = 17;
  public static final int RequirementsProfileAnnotation = 18;
  public static final int ServerPort = 19;
  public static final int ServiceDefinion = 20;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x73f2d64e927d48dcL, 0x89c7793f38431f94L);
    builder.put(0x22f0a573da97db56L, ActionDefinition);
    builder.put(0x22f0a573da97db52L, CapabilityProfileAnnotation);
    builder.put(0x2cc4976fc5328c81L, ClientPort);
    builder.put(0x69023be9ff8032b6L, ClientPortRef);
    builder.put(0x6b677cc61c2acea1L, ConnectionRef);
    builder.put(0x3717cb3de2d53f21L, DefaultQoS);
    builder.put(0x2cc4976fc53337a5L, IOperationPort);
    builder.put(0x6b677cc61c023dd1L, MessageDefinition);
    builder.put(0x6b677cc61c077ee4L, MessageTypeRef);
    builder.put(0x22f0a573da97db54L, Monitor);
    builder.put(0x28eca1beb2f1bfe4L, Namespace);
    builder.put(0x69023be9ff802cb6L, OperationConnector);
    builder.put(0x69023be9ff80807eL, OperationConnectorAnnotation);
    builder.put(0x69023be9ff7a5d38L, OperationPortRef);
    builder.put(0x2cc4976fc53337a2L, OperationPorts);
    builder.put(0x6b677cc61c023d64L, ROSDefinitions);
    builder.put(0x31ec195a6838a2aeL, RemappingArgument);
    builder.put(0x22f0a573da97db55L, Remappings);
    builder.put(0x31ec195a68373327L, RequirementsProfileAnnotation);
    builder.put(0x2cc4976fc5328c86L, ServerPort);
    builder.put(0x7e5647a816092644L, ServiceDefinion);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}

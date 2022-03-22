// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VideoDoorbell.proto

package ds.adam.VideoDoorbell;

public final class VideoDoorbellServiceImpl {
  private VideoDoorbellServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VideoDoorbell_Video_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VideoDoorbell_Video_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VideoDoorbell_BellRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VideoDoorbell_BellRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VideoDoorbell_DoorLockStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VideoDoorbell_DoorLockStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VideoDoorbell_DoorLockTamper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VideoDoorbell_DoorLockTamper_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023VideoDoorbell.proto\022\rVideoDoorbell\"\037\n\005" +
      "Video\022\026\n\016exampleNumber1\030\001 \001(\005\"\201\001\n\013BellRe" +
      "quest\022\026\n\016exampleNumber2\030\002 \001(\005\0221\n\006visual\030" +
      "\003 \001(\0162!.VideoDoorbell.BellRequest.Visual" +
      "\"\'\n\006Visual\022\t\n\005GREEN\020\000\022\007\n\003RED\020\002\022\t\n\005ERROR\020" +
      "\003\"\037\n\016DoorLockStatus\022\r\n\005check\030\001 \001(\010\"\"\n\016Do" +
      "orLockTamper\022\020\n\010intruder\030\001 \001(\0102\253\001\n\024Video" +
      "DoorbellService\022C\n\thomeVideo\022\024.VideoDoor" +
      "bell.Video\032\032.VideoDoorbell.BellRequest\"\000" +
      "(\0010\001\022N\n\ndoorStatus\022\035.VideoDoorbell.DoorL" +
      "ockStatus\032\035.VideoDoorbell.DoorLockTamper" +
      "\"\000(\001B3\n\025ds.adam.VideoDoorbellB\030VideoDoor" +
      "bellServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_VideoDoorbell_Video_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VideoDoorbell_Video_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VideoDoorbell_Video_descriptor,
        new java.lang.String[] { "ExampleNumber1", });
    internal_static_VideoDoorbell_BellRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_VideoDoorbell_BellRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VideoDoorbell_BellRequest_descriptor,
        new java.lang.String[] { "ExampleNumber2", "Visual", });
    internal_static_VideoDoorbell_DoorLockStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_VideoDoorbell_DoorLockStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VideoDoorbell_DoorLockStatus_descriptor,
        new java.lang.String[] { "Check", });
    internal_static_VideoDoorbell_DoorLockTamper_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_VideoDoorbell_DoorLockTamper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VideoDoorbell_DoorLockTamper_descriptor,
        new java.lang.String[] { "Intruder", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
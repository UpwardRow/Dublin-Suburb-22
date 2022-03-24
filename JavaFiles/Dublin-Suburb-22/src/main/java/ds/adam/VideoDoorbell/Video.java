// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VideoDoorbell.proto

package ds.adam.VideoDoorbell;

/**
 * Protobuf type {@code VideoDoorbell.Video}
 */
public  final class Video extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VideoDoorbell.Video)
    VideoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Video.newBuilder() to construct.
  private Video(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Video() {
    videoConfimrationFromBell_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Video(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 16: {

            videoConfimrationFromBell_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.adam.VideoDoorbell.VideoDoorbellServiceImpl.internal_static_VideoDoorbell_Video_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.adam.VideoDoorbell.VideoDoorbellServiceImpl.internal_static_VideoDoorbell_Video_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.adam.VideoDoorbell.Video.class, ds.adam.VideoDoorbell.Video.Builder.class);
  }

  public static final int VIDEOCONFIMRATIONFROMBELL_FIELD_NUMBER = 2;
  private boolean videoConfimrationFromBell_;
  /**
   * <code>bool videoConfimrationFromBell = 2;</code>
   */
  public boolean getVideoConfimrationFromBell() {
    return videoConfimrationFromBell_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (videoConfimrationFromBell_ != false) {
      output.writeBool(2, videoConfimrationFromBell_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (videoConfimrationFromBell_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, videoConfimrationFromBell_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.adam.VideoDoorbell.Video)) {
      return super.equals(obj);
    }
    ds.adam.VideoDoorbell.Video other = (ds.adam.VideoDoorbell.Video) obj;

    boolean result = true;
    result = result && (getVideoConfimrationFromBell()
        == other.getVideoConfimrationFromBell());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VIDEOCONFIMRATIONFROMBELL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getVideoConfimrationFromBell());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.adam.VideoDoorbell.Video parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.adam.VideoDoorbell.Video parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.adam.VideoDoorbell.Video parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.adam.VideoDoorbell.Video parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.adam.VideoDoorbell.Video parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.adam.VideoDoorbell.Video parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.adam.VideoDoorbell.Video parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.adam.VideoDoorbell.Video parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.adam.VideoDoorbell.Video parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.adam.VideoDoorbell.Video parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.adam.VideoDoorbell.Video parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.adam.VideoDoorbell.Video parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.adam.VideoDoorbell.Video prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code VideoDoorbell.Video}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VideoDoorbell.Video)
      ds.adam.VideoDoorbell.VideoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.adam.VideoDoorbell.VideoDoorbellServiceImpl.internal_static_VideoDoorbell_Video_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.adam.VideoDoorbell.VideoDoorbellServiceImpl.internal_static_VideoDoorbell_Video_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.adam.VideoDoorbell.Video.class, ds.adam.VideoDoorbell.Video.Builder.class);
    }

    // Construct using ds.adam.VideoDoorbell.Video.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      videoConfimrationFromBell_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.adam.VideoDoorbell.VideoDoorbellServiceImpl.internal_static_VideoDoorbell_Video_descriptor;
    }

    @java.lang.Override
    public ds.adam.VideoDoorbell.Video getDefaultInstanceForType() {
      return ds.adam.VideoDoorbell.Video.getDefaultInstance();
    }

    @java.lang.Override
    public ds.adam.VideoDoorbell.Video build() {
      ds.adam.VideoDoorbell.Video result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.adam.VideoDoorbell.Video buildPartial() {
      ds.adam.VideoDoorbell.Video result = new ds.adam.VideoDoorbell.Video(this);
      result.videoConfimrationFromBell_ = videoConfimrationFromBell_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.adam.VideoDoorbell.Video) {
        return mergeFrom((ds.adam.VideoDoorbell.Video)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.adam.VideoDoorbell.Video other) {
      if (other == ds.adam.VideoDoorbell.Video.getDefaultInstance()) return this;
      if (other.getVideoConfimrationFromBell() != false) {
        setVideoConfimrationFromBell(other.getVideoConfimrationFromBell());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.adam.VideoDoorbell.Video parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.adam.VideoDoorbell.Video) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean videoConfimrationFromBell_ ;
    /**
     * <code>bool videoConfimrationFromBell = 2;</code>
     */
    public boolean getVideoConfimrationFromBell() {
      return videoConfimrationFromBell_;
    }
    /**
     * <code>bool videoConfimrationFromBell = 2;</code>
     */
    public Builder setVideoConfimrationFromBell(boolean value) {
      
      videoConfimrationFromBell_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool videoConfimrationFromBell = 2;</code>
     */
    public Builder clearVideoConfimrationFromBell() {
      
      videoConfimrationFromBell_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:VideoDoorbell.Video)
  }

  // @@protoc_insertion_point(class_scope:VideoDoorbell.Video)
  private static final ds.adam.VideoDoorbell.Video DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.adam.VideoDoorbell.Video();
  }

  public static ds.adam.VideoDoorbell.Video getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Video>
      PARSER = new com.google.protobuf.AbstractParser<Video>() {
    @java.lang.Override
    public Video parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Video(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Video> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Video> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.adam.VideoDoorbell.Video getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dropwizard.proto

package io.dropwizard.jersey.protobuf.protos;

public final class DropwizardProtos {
  private DropwizardProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ErrorMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:dropwizard.ErrorMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string message = 1;</code>
     */
    boolean hasMessage();
    /**
     * <code>required string message = 1;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>required string message = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>optional int32 code = 2 [default = 500];</code>
     */
    boolean hasCode();
    /**
     * <code>optional int32 code = 2 [default = 500];</code>
     */
    int getCode();
  }
  /**
   * Protobuf type {@code dropwizard.ErrorMessage}
   */
  public static final class ErrorMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:dropwizard.ErrorMessage)
      ErrorMessageOrBuilder {
    // Use ErrorMessage.newBuilder() to construct.
    private ErrorMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ErrorMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ErrorMessage defaultInstance;
    public static ErrorMessage getDefaultInstance() {
      return defaultInstance;
    }

    public ErrorMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ErrorMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              message_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              code_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.dropwizard.jersey.protobuf.protos.DropwizardProtos.internal_static_dropwizard_ErrorMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.dropwizard.jersey.protobuf.protos.DropwizardProtos.internal_static_dropwizard_ErrorMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage.class, io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<ErrorMessage> PARSER =
        new com.google.protobuf.AbstractParser<ErrorMessage>() {
      public ErrorMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private java.lang.Object message_;
    /**
     * <code>required string message = 1;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CODE_FIELD_NUMBER = 2;
    private int code_;
    /**
     * <code>optional int32 code = 2 [default = 500];</code>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 code = 2 [default = 500];</code>
     */
    public int getCode() {
      return code_;
    }

    private void initFields() {
      message_ = "";
      code_ = 500;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, code_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, code_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code dropwizard.ErrorMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:dropwizard.ErrorMessage)
        io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.dropwizard.jersey.protobuf.protos.DropwizardProtos.internal_static_dropwizard_ErrorMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.dropwizard.jersey.protobuf.protos.DropwizardProtos.internal_static_dropwizard_ErrorMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage.class, io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage.Builder.class);
      }

      // Construct using io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 500;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.dropwizard.jersey.protobuf.protos.DropwizardProtos.internal_static_dropwizard_ErrorMessage_descriptor;
      }

      public io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage getDefaultInstanceForType() {
        return io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage.getDefaultInstance();
      }

      public io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage build() {
        io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage buildPartial() {
        io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage result = new io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.code_ = code_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage) {
          return mergeFrom((io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage other) {
        if (other == io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage.getDefaultInstance()) return this;
        if (other.hasMessage()) {
          bitField0_ |= 0x00000001;
          message_ = other.message_;
          onChanged();
        }
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMessage()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.dropwizard.jersey.protobuf.protos.DropwizardProtos.ErrorMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object message_ = "";
      /**
       * <code>required string message = 1;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string message = 1;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string message = 1;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string message = 1;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>required string message = 1;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }

      private int code_ = 500;
      /**
       * <code>optional int32 code = 2 [default = 500];</code>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 code = 2 [default = 500];</code>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>optional int32 code = 2 [default = 500];</code>
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000002;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 code = 2 [default = 500];</code>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        code_ = 500;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dropwizard.ErrorMessage)
    }

    static {
      defaultInstance = new ErrorMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:dropwizard.ErrorMessage)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dropwizard_ErrorMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_dropwizard_ErrorMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020dropwizard.proto\022\ndropwizard\"2\n\014ErrorM" +
      "essage\022\017\n\007message\030\001 \002(\t\022\021\n\004code\030\002 \001(\005:\0035" +
      "00B:\n$io.dropwizard.jersey.protobuf.prot" +
      "osB\020DropwizardProtosH\001"
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
    internal_static_dropwizard_ErrorMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dropwizard_ErrorMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_dropwizard_ErrorMessage_descriptor,
        new java.lang.String[] { "Message", "Code", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

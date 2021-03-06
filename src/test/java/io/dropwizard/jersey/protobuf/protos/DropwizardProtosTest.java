// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dropwizard.proto

package io.dropwizard.jersey.protobuf.protos;

public final class DropwizardProtosTest {
  private DropwizardProtosTest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ExampleOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int64 id = 1;
    /**
     * <code>required int64 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int64 id = 1;</code>
     */
    long getId();
  }
  /**
   * Protobuf type {@code dropwizard.Example}
   */
  public static final class Example extends
      com.google.protobuf.GeneratedMessage
      implements ExampleOrBuilder {
    // Use Example.newBuilder() to construct.
    private Example(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Example(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Example defaultInstance;
    public static Example getDefaultInstance() {
      return defaultInstance;
    }

    public Example getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Example(
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
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt64();
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
      return io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.internal_static_dropwizard_Example_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.internal_static_dropwizard_Example_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example.class, io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example.Builder.class);
    }

    public static com.google.protobuf.Parser<Example> PARSER =
        new com.google.protobuf.AbstractParser<Example>() {
      public Example parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Example(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Example> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int64 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>required int64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    private void initFields() {
      id_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasId()) {
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
        output.writeInt64(1, id_);
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
          .computeInt64Size(1, id_);
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

    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example prototype) {
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
     * Protobuf type {@code dropwizard.Example}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.ExampleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.internal_static_dropwizard_Example_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.internal_static_dropwizard_Example_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example.class, io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example.Builder.class);
      }

      // Construct using io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example.newBuilder()
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
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.internal_static_dropwizard_Example_descriptor;
      }

      public io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example getDefaultInstanceForType() {
        return io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example.getDefaultInstance();
      }

      public io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example build() {
        io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example buildPartial() {
        io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example result = new io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example) {
          return mergeFrom((io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example other) {
        if (other == io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.dropwizard.jersey.protobuf.protos.DropwizardProtosTest.Example) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int64 id = 1;
      private long id_ ;
      /**
       * <code>required int64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:dropwizard.Example)
    }

    static {
      defaultInstance = new Example(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:dropwizard.Example)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_dropwizard_Example_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_dropwizard_Example_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020dropwizard.proto\022\ndropwizard\"\025\n\007Exampl" +
      "e\022\n\n\002id\030\001 \002(\003B>\n$io.dropwizard.jersey.pr" +
      "otobuf.protosB\024DropwizardProtosTestH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_dropwizard_Example_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_dropwizard_Example_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_dropwizard_Example_descriptor,
              new java.lang.String[] { "Id", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}

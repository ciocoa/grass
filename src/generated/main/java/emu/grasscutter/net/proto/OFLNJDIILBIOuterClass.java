// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OFLNJDIILBI.proto

package emu.grasscutter.net.proto;

public final class OFLNJDIILBIOuterClass {
  private OFLNJDIILBIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OFLNJDIILBIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OFLNJDIILBI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 cur_avatar_guid = 1;</code>
     * @return The curAvatarGuid.
     */
    long getCurAvatarGuid();

    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @return A list containing the fIDDAAGKFDH.
     */
    java.util.List<java.lang.Long> getFIDDAAGKFDHList();
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @return The count of fIDDAAGKFDH.
     */
    int getFIDDAAGKFDHCount();
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @param index The index of the element to return.
     * @return The fIDDAAGKFDH at the given index.
     */
    long getFIDDAAGKFDH(int index);
  }
  /**
   * <pre>
   * CmdId: 9598
   * </pre>
   *
   * Protobuf type {@code OFLNJDIILBI}
   */
  public static final class OFLNJDIILBI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OFLNJDIILBI)
      OFLNJDIILBIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OFLNJDIILBI.newBuilder() to construct.
    private OFLNJDIILBI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OFLNJDIILBI() {
      fIDDAAGKFDH_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OFLNJDIILBI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OFLNJDIILBI(
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
            case 8: {

              curAvatarGuid_ = input.readUInt64();
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fIDDAAGKFDH_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              fIDDAAGKFDH_.addLong(input.readUInt64());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                fIDDAAGKFDH_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                fIDDAAGKFDH_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          fIDDAAGKFDH_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI.class, emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI.Builder.class);
    }

    public static final int CUR_AVATAR_GUID_FIELD_NUMBER = 1;
    private long curAvatarGuid_;
    /**
     * <code>uint64 cur_avatar_guid = 1;</code>
     * @return The curAvatarGuid.
     */
    @java.lang.Override
    public long getCurAvatarGuid() {
      return curAvatarGuid_;
    }

    public static final int FIDDAAGKFDH_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.LongList fIDDAAGKFDH_;
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @return A list containing the fIDDAAGKFDH.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getFIDDAAGKFDHList() {
      return fIDDAAGKFDH_;
    }
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @return The count of fIDDAAGKFDH.
     */
    public int getFIDDAAGKFDHCount() {
      return fIDDAAGKFDH_.size();
    }
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @param index The index of the element to return.
     * @return The fIDDAAGKFDH at the given index.
     */
    public long getFIDDAAGKFDH(int index) {
      return fIDDAAGKFDH_.getLong(index);
    }
    private int fIDDAAGKFDHMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (curAvatarGuid_ != 0L) {
        output.writeUInt64(1, curAvatarGuid_);
      }
      if (getFIDDAAGKFDHList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(fIDDAAGKFDHMemoizedSerializedSize);
      }
      for (int i = 0; i < fIDDAAGKFDH_.size(); i++) {
        output.writeUInt64NoTag(fIDDAAGKFDH_.getLong(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curAvatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, curAvatarGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fIDDAAGKFDH_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(fIDDAAGKFDH_.getLong(i));
        }
        size += dataSize;
        if (!getFIDDAAGKFDHList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fIDDAAGKFDHMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI other = (emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI) obj;

      if (getCurAvatarGuid()
          != other.getCurAvatarGuid()) return false;
      if (!getFIDDAAGKFDHList()
          .equals(other.getFIDDAAGKFDHList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CUR_AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCurAvatarGuid());
      if (getFIDDAAGKFDHCount() > 0) {
        hash = (37 * hash) + FIDDAAGKFDH_FIELD_NUMBER;
        hash = (53 * hash) + getFIDDAAGKFDHList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI prototype) {
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
     * <pre>
     * CmdId: 9598
     * </pre>
     *
     * Protobuf type {@code OFLNJDIILBI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OFLNJDIILBI)
        emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI.class, emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI.newBuilder()
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
        curAvatarGuid_ = 0L;

        fIDDAAGKFDH_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI build() {
        emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI buildPartial() {
        emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI result = new emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI(this);
        int from_bitField0_ = bitField0_;
        result.curAvatarGuid_ = curAvatarGuid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fIDDAAGKFDH_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fIDDAAGKFDH_ = fIDDAAGKFDH_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI) {
          return mergeFrom((emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI other) {
        if (other == emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI.getDefaultInstance()) return this;
        if (other.getCurAvatarGuid() != 0L) {
          setCurAvatarGuid(other.getCurAvatarGuid());
        }
        if (!other.fIDDAAGKFDH_.isEmpty()) {
          if (fIDDAAGKFDH_.isEmpty()) {
            fIDDAAGKFDH_ = other.fIDDAAGKFDH_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFIDDAAGKFDHIsMutable();
            fIDDAAGKFDH_.addAll(other.fIDDAAGKFDH_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long curAvatarGuid_ ;
      /**
       * <code>uint64 cur_avatar_guid = 1;</code>
       * @return The curAvatarGuid.
       */
      @java.lang.Override
      public long getCurAvatarGuid() {
        return curAvatarGuid_;
      }
      /**
       * <code>uint64 cur_avatar_guid = 1;</code>
       * @param value The curAvatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCurAvatarGuid(long value) {
        
        curAvatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cur_avatar_guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurAvatarGuid() {
        
        curAvatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList fIDDAAGKFDH_ = emptyLongList();
      private void ensureFIDDAAGKFDHIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fIDDAAGKFDH_ = mutableCopy(fIDDAAGKFDH_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @return A list containing the fIDDAAGKFDH.
       */
      public java.util.List<java.lang.Long>
          getFIDDAAGKFDHList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fIDDAAGKFDH_) : fIDDAAGKFDH_;
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @return The count of fIDDAAGKFDH.
       */
      public int getFIDDAAGKFDHCount() {
        return fIDDAAGKFDH_.size();
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @param index The index of the element to return.
       * @return The fIDDAAGKFDH at the given index.
       */
      public long getFIDDAAGKFDH(int index) {
        return fIDDAAGKFDH_.getLong(index);
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @param index The index to set the value at.
       * @param value The fIDDAAGKFDH to set.
       * @return This builder for chaining.
       */
      public Builder setFIDDAAGKFDH(
          int index, long value) {
        ensureFIDDAAGKFDHIsMutable();
        fIDDAAGKFDH_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @param value The fIDDAAGKFDH to add.
       * @return This builder for chaining.
       */
      public Builder addFIDDAAGKFDH(long value) {
        ensureFIDDAAGKFDHIsMutable();
        fIDDAAGKFDH_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @param values The fIDDAAGKFDH to add.
       * @return This builder for chaining.
       */
      public Builder addAllFIDDAAGKFDH(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureFIDDAAGKFDHIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fIDDAAGKFDH_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFIDDAAGKFDH() {
        fIDDAAGKFDH_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:OFLNJDIILBI)
    }

    // @@protoc_insertion_point(class_scope:OFLNJDIILBI)
    private static final emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI();
    }

    public static emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OFLNJDIILBI>
        PARSER = new com.google.protobuf.AbstractParser<OFLNJDIILBI>() {
      @java.lang.Override
      public OFLNJDIILBI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OFLNJDIILBI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OFLNJDIILBI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OFLNJDIILBI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OFLNJDIILBIOuterClass.OFLNJDIILBI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OFLNJDIILBI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OFLNJDIILBI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OFLNJDIILBI.proto\";\n\013OFLNJDIILBI\022\027\n\017cu" +
      "r_avatar_guid\030\001 \001(\004\022\023\n\013FIDDAAGKFDH\030\005 \003(\004" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OFLNJDIILBI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OFLNJDIILBI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OFLNJDIILBI_descriptor,
        new java.lang.String[] { "CurAvatarGuid", "FIDDAAGKFDH", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
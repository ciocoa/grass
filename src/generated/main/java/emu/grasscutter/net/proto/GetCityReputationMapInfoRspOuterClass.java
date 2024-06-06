// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetCityReputationMapInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetCityReputationMapInfoRspOuterClass {
  private GetCityReputationMapInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetCityReputationMapInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetCityReputationMapInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool JJGPNHBKGHG = 9;</code>
     * @return The jJGPNHBKGHG.
     */
    boolean getJJGPNHBKGHG();

    /**
     * <code>bool MOEFCHCBNGE = 8;</code>
     * @return The mOEFCHCBNGE.
     */
    boolean getMOEFCHCBNGE();

    /**
     * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
     * @return A list containing the bIDOKKBGJLG.
     */
    java.util.List<java.lang.Integer> getBIDOKKBGJLGList();
    /**
     * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
     * @return The count of bIDOKKBGJLG.
     */
    int getBIDOKKBGJLGCount();
    /**
     * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
     * @param index The index of the element to return.
     * @return The bIDOKKBGJLG at the given index.
     */
    int getBIDOKKBGJLG(int index);

    /**
     * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
     * @return A list containing the bOMGJJFKDOC.
     */
    java.util.List<java.lang.Integer> getBOMGJJFKDOCList();
    /**
     * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
     * @return The count of bOMGJJFKDOC.
     */
    int getBOMGJJFKDOCCount();
    /**
     * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
     * @param index The index of the element to return.
     * @return The bOMGJJFKDOC at the given index.
     */
    int getBOMGJJFKDOC(int index);
  }
  /**
   * <pre>
   * CmdId: 24830
   * Obf: NFLPNFKGHED
   * </pre>
   *
   * Protobuf type {@code GetCityReputationMapInfoRsp}
   */
  public static final class GetCityReputationMapInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetCityReputationMapInfoRsp)
      GetCityReputationMapInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetCityReputationMapInfoRsp.newBuilder() to construct.
    private GetCityReputationMapInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetCityReputationMapInfoRsp() {
      bIDOKKBGJLG_ = emptyIntList();
      bOMGJJFKDOC_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetCityReputationMapInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetCityReputationMapInfoRsp(
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
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                bIDOKKBGJLG_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              bIDOKKBGJLG_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                bIDOKKBGJLG_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                bIDOKKBGJLG_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                bOMGJJFKDOC_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              bOMGJJFKDOC_.addInt(input.readUInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                bOMGJJFKDOC_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                bOMGJJFKDOC_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 64: {

              mOEFCHCBNGE_ = input.readBool();
              break;
            }
            case 72: {

              jJGPNHBKGHG_ = input.readBool();
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
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
          bIDOKKBGJLG_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          bOMGJJFKDOC_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.internal_static_GetCityReputationMapInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.internal_static_GetCityReputationMapInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp.class, emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int JJGPNHBKGHG_FIELD_NUMBER = 9;
    private boolean jJGPNHBKGHG_;
    /**
     * <code>bool JJGPNHBKGHG = 9;</code>
     * @return The jJGPNHBKGHG.
     */
    @java.lang.Override
    public boolean getJJGPNHBKGHG() {
      return jJGPNHBKGHG_;
    }

    public static final int MOEFCHCBNGE_FIELD_NUMBER = 8;
    private boolean mOEFCHCBNGE_;
    /**
     * <code>bool MOEFCHCBNGE = 8;</code>
     * @return The mOEFCHCBNGE.
     */
    @java.lang.Override
    public boolean getMOEFCHCBNGE() {
      return mOEFCHCBNGE_;
    }

    public static final int BIDOKKBGJLG_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList bIDOKKBGJLG_;
    /**
     * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
     * @return A list containing the bIDOKKBGJLG.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getBIDOKKBGJLGList() {
      return bIDOKKBGJLG_;
    }
    /**
     * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
     * @return The count of bIDOKKBGJLG.
     */
    public int getBIDOKKBGJLGCount() {
      return bIDOKKBGJLG_.size();
    }
    /**
     * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
     * @param index The index of the element to return.
     * @return The bIDOKKBGJLG at the given index.
     */
    public int getBIDOKKBGJLG(int index) {
      return bIDOKKBGJLG_.getInt(index);
    }
    private int bIDOKKBGJLGMemoizedSerializedSize = -1;

    public static final int BOMGJJFKDOC_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList bOMGJJFKDOC_;
    /**
     * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
     * @return A list containing the bOMGJJFKDOC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getBOMGJJFKDOCList() {
      return bOMGJJFKDOC_;
    }
    /**
     * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
     * @return The count of bOMGJJFKDOC.
     */
    public int getBOMGJJFKDOCCount() {
      return bOMGJJFKDOC_.size();
    }
    /**
     * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
     * @param index The index of the element to return.
     * @return The bOMGJJFKDOC at the given index.
     */
    public int getBOMGJJFKDOC(int index) {
      return bOMGJJFKDOC_.getInt(index);
    }
    private int bOMGJJFKDOCMemoizedSerializedSize = -1;

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
      if (getBIDOKKBGJLGList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(bIDOKKBGJLGMemoizedSerializedSize);
      }
      for (int i = 0; i < bIDOKKBGJLG_.size(); i++) {
        output.writeUInt32NoTag(bIDOKKBGJLG_.getInt(i));
      }
      if (getBOMGJJFKDOCList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(bOMGJJFKDOCMemoizedSerializedSize);
      }
      for (int i = 0; i < bOMGJJFKDOC_.size(); i++) {
        output.writeUInt32NoTag(bOMGJJFKDOC_.getInt(i));
      }
      if (mOEFCHCBNGE_ != false) {
        output.writeBool(8, mOEFCHCBNGE_);
      }
      if (jJGPNHBKGHG_ != false) {
        output.writeBool(9, jJGPNHBKGHG_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < bIDOKKBGJLG_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(bIDOKKBGJLG_.getInt(i));
        }
        size += dataSize;
        if (!getBIDOKKBGJLGList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        bIDOKKBGJLGMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < bOMGJJFKDOC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(bOMGJJFKDOC_.getInt(i));
        }
        size += dataSize;
        if (!getBOMGJJFKDOCList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        bOMGJJFKDOCMemoizedSerializedSize = dataSize;
      }
      if (mOEFCHCBNGE_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, mOEFCHCBNGE_);
      }
      if (jJGPNHBKGHG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, jJGPNHBKGHG_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp other = (emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getJJGPNHBKGHG()
          != other.getJJGPNHBKGHG()) return false;
      if (getMOEFCHCBNGE()
          != other.getMOEFCHCBNGE()) return false;
      if (!getBIDOKKBGJLGList()
          .equals(other.getBIDOKKBGJLGList())) return false;
      if (!getBOMGJJFKDOCList()
          .equals(other.getBOMGJJFKDOCList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + JJGPNHBKGHG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getJJGPNHBKGHG());
      hash = (37 * hash) + MOEFCHCBNGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMOEFCHCBNGE());
      if (getBIDOKKBGJLGCount() > 0) {
        hash = (37 * hash) + BIDOKKBGJLG_FIELD_NUMBER;
        hash = (53 * hash) + getBIDOKKBGJLGList().hashCode();
      }
      if (getBOMGJJFKDOCCount() > 0) {
        hash = (37 * hash) + BOMGJJFKDOC_FIELD_NUMBER;
        hash = (53 * hash) + getBOMGJJFKDOCList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp prototype) {
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
     * CmdId: 24830
     * Obf: NFLPNFKGHED
     * </pre>
     *
     * Protobuf type {@code GetCityReputationMapInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetCityReputationMapInfoRsp)
        emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.internal_static_GetCityReputationMapInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.internal_static_GetCityReputationMapInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp.class, emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp.newBuilder()
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
        retcode_ = 0;

        jJGPNHBKGHG_ = false;

        mOEFCHCBNGE_ = false;

        bIDOKKBGJLG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        bOMGJJFKDOC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.internal_static_GetCityReputationMapInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp build() {
        emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp result = new emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        result.jJGPNHBKGHG_ = jJGPNHBKGHG_;
        result.mOEFCHCBNGE_ = mOEFCHCBNGE_;
        if (((bitField0_ & 0x00000001) != 0)) {
          bIDOKKBGJLG_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bIDOKKBGJLG_ = bIDOKKBGJLG_;
        if (((bitField0_ & 0x00000002) != 0)) {
          bOMGJJFKDOC_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.bOMGJJFKDOC_ = bOMGJJFKDOC_;
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
        if (other instanceof emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getJJGPNHBKGHG() != false) {
          setJJGPNHBKGHG(other.getJJGPNHBKGHG());
        }
        if (other.getMOEFCHCBNGE() != false) {
          setMOEFCHCBNGE(other.getMOEFCHCBNGE());
        }
        if (!other.bIDOKKBGJLG_.isEmpty()) {
          if (bIDOKKBGJLG_.isEmpty()) {
            bIDOKKBGJLG_ = other.bIDOKKBGJLG_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBIDOKKBGJLGIsMutable();
            bIDOKKBGJLG_.addAll(other.bIDOKKBGJLG_);
          }
          onChanged();
        }
        if (!other.bOMGJJFKDOC_.isEmpty()) {
          if (bOMGJJFKDOC_.isEmpty()) {
            bOMGJJFKDOC_ = other.bOMGJJFKDOC_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBOMGJJFKDOCIsMutable();
            bOMGJJFKDOC_.addAll(other.bOMGJJFKDOC_);
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
        emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean jJGPNHBKGHG_ ;
      /**
       * <code>bool JJGPNHBKGHG = 9;</code>
       * @return The jJGPNHBKGHG.
       */
      @java.lang.Override
      public boolean getJJGPNHBKGHG() {
        return jJGPNHBKGHG_;
      }
      /**
       * <code>bool JJGPNHBKGHG = 9;</code>
       * @param value The jJGPNHBKGHG to set.
       * @return This builder for chaining.
       */
      public Builder setJJGPNHBKGHG(boolean value) {
        
        jJGPNHBKGHG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool JJGPNHBKGHG = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearJJGPNHBKGHG() {
        
        jJGPNHBKGHG_ = false;
        onChanged();
        return this;
      }

      private boolean mOEFCHCBNGE_ ;
      /**
       * <code>bool MOEFCHCBNGE = 8;</code>
       * @return The mOEFCHCBNGE.
       */
      @java.lang.Override
      public boolean getMOEFCHCBNGE() {
        return mOEFCHCBNGE_;
      }
      /**
       * <code>bool MOEFCHCBNGE = 8;</code>
       * @param value The mOEFCHCBNGE to set.
       * @return This builder for chaining.
       */
      public Builder setMOEFCHCBNGE(boolean value) {
        
        mOEFCHCBNGE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool MOEFCHCBNGE = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMOEFCHCBNGE() {
        
        mOEFCHCBNGE_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList bIDOKKBGJLG_ = emptyIntList();
      private void ensureBIDOKKBGJLGIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          bIDOKKBGJLG_ = mutableCopy(bIDOKKBGJLG_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
       * @return A list containing the bIDOKKBGJLG.
       */
      public java.util.List<java.lang.Integer>
          getBIDOKKBGJLGList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(bIDOKKBGJLG_) : bIDOKKBGJLG_;
      }
      /**
       * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
       * @return The count of bIDOKKBGJLG.
       */
      public int getBIDOKKBGJLGCount() {
        return bIDOKKBGJLG_.size();
      }
      /**
       * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
       * @param index The index of the element to return.
       * @return The bIDOKKBGJLG at the given index.
       */
      public int getBIDOKKBGJLG(int index) {
        return bIDOKKBGJLG_.getInt(index);
      }
      /**
       * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
       * @param index The index to set the value at.
       * @param value The bIDOKKBGJLG to set.
       * @return This builder for chaining.
       */
      public Builder setBIDOKKBGJLG(
          int index, int value) {
        ensureBIDOKKBGJLGIsMutable();
        bIDOKKBGJLG_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
       * @param value The bIDOKKBGJLG to add.
       * @return This builder for chaining.
       */
      public Builder addBIDOKKBGJLG(int value) {
        ensureBIDOKKBGJLGIsMutable();
        bIDOKKBGJLG_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
       * @param values The bIDOKKBGJLG to add.
       * @return This builder for chaining.
       */
      public Builder addAllBIDOKKBGJLG(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBIDOKKBGJLGIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bIDOKKBGJLG_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 BIDOKKBGJLG = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBIDOKKBGJLG() {
        bIDOKKBGJLG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList bOMGJJFKDOC_ = emptyIntList();
      private void ensureBOMGJJFKDOCIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          bOMGJJFKDOC_ = mutableCopy(bOMGJJFKDOC_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
       * @return A list containing the bOMGJJFKDOC.
       */
      public java.util.List<java.lang.Integer>
          getBOMGJJFKDOCList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(bOMGJJFKDOC_) : bOMGJJFKDOC_;
      }
      /**
       * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
       * @return The count of bOMGJJFKDOC.
       */
      public int getBOMGJJFKDOCCount() {
        return bOMGJJFKDOC_.size();
      }
      /**
       * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
       * @param index The index of the element to return.
       * @return The bOMGJJFKDOC at the given index.
       */
      public int getBOMGJJFKDOC(int index) {
        return bOMGJJFKDOC_.getInt(index);
      }
      /**
       * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
       * @param index The index to set the value at.
       * @param value The bOMGJJFKDOC to set.
       * @return This builder for chaining.
       */
      public Builder setBOMGJJFKDOC(
          int index, int value) {
        ensureBOMGJJFKDOCIsMutable();
        bOMGJJFKDOC_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
       * @param value The bOMGJJFKDOC to add.
       * @return This builder for chaining.
       */
      public Builder addBOMGJJFKDOC(int value) {
        ensureBOMGJJFKDOCIsMutable();
        bOMGJJFKDOC_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
       * @param values The bOMGJJFKDOC to add.
       * @return This builder for chaining.
       */
      public Builder addAllBOMGJJFKDOC(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBOMGJJFKDOCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bOMGJJFKDOC_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 BOMGJJFKDOC = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBOMGJJFKDOC() {
        bOMGJJFKDOC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:GetCityReputationMapInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetCityReputationMapInfoRsp)
    private static final emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetCityReputationMapInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetCityReputationMapInfoRsp>() {
      @java.lang.Override
      public GetCityReputationMapInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCityReputationMapInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetCityReputationMapInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetCityReputationMapInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetCityReputationMapInfoRspOuterClass.GetCityReputationMapInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCityReputationMapInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCityReputationMapInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!GetCityReputationMapInfoRsp.proto\"\202\001\n\033" +
      "GetCityReputationMapInfoRsp\022\017\n\007retcode\030\016" +
      " \001(\005\022\023\n\013JJGPNHBKGHG\030\t \001(\010\022\023\n\013MOEFCHCBNGE" +
      "\030\010 \001(\010\022\023\n\013BIDOKKBGJLG\030\003 \003(\r\022\023\n\013BOMGJJFKD" +
      "OC\030\005 \003(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetCityReputationMapInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetCityReputationMapInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCityReputationMapInfoRsp_descriptor,
        new java.lang.String[] { "Retcode", "JJGPNHBKGHG", "MOEFCHCBNGE", "BIDOKKBGJLG", "BOMGJJFKDOC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
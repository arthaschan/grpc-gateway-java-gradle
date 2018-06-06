// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contactsapi/customfield/customfieldschema.proto

package contactsapi.customfield;

/**
 * Protobuf type {@code contactsapi.customfield.ListCustomFieldsRequest}
 */
public  final class ListCustomFieldsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:contactsapi.customfield.ListCustomFieldsRequest)
    ListCustomFieldsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCustomFieldsRequest.newBuilder() to construct.
  private ListCustomFieldsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCustomFieldsRequest() {
    pageToken_ = "";
    pageSize_ = 0;
    fieldMask_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListCustomFieldsRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
            break;
          }
          case 16: {

            pageSize_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              fieldMask_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            fieldMask_.add(s);
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        fieldMask_ = fieldMask_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            contactsapi.customfield.ListCustomFieldsRequest.class, contactsapi.customfield.ListCustomFieldsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PAGE_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object pageToken_;
  /**
   * <code>string page_token = 1;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string page_token = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   * <code>int32 page_size = 2;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList fieldMask_;
  /**
   * <pre>
   * TODO: string or array of strings?
   * </pre>
   *
   * <code>repeated string field_mask = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getFieldMaskList() {
    return fieldMask_;
  }
  /**
   * <pre>
   * TODO: string or array of strings?
   * </pre>
   *
   * <code>repeated string field_mask = 3;</code>
   */
  public int getFieldMaskCount() {
    return fieldMask_.size();
  }
  /**
   * <pre>
   * TODO: string or array of strings?
   * </pre>
   *
   * <code>repeated string field_mask = 3;</code>
   */
  public java.lang.String getFieldMask(int index) {
    return fieldMask_.get(index);
  }
  /**
   * <pre>
   * TODO: string or array of strings?
   * </pre>
   *
   * <code>repeated string field_mask = 3;</code>
   */
  public com.google.protobuf.ByteString
      getFieldMaskBytes(int index) {
    return fieldMask_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pageToken_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    for (int i = 0; i < fieldMask_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fieldMask_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pageToken_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fieldMask_.size(); i++) {
        dataSize += computeStringSizeNoTag(fieldMask_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldMaskList().size();
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
    if (!(obj instanceof contactsapi.customfield.ListCustomFieldsRequest)) {
      return super.equals(obj);
    }
    contactsapi.customfield.ListCustomFieldsRequest other = (contactsapi.customfield.ListCustomFieldsRequest) obj;

    boolean result = true;
    result = result && getPageToken()
        .equals(other.getPageToken());
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && getFieldMaskList()
        .equals(other.getFieldMaskList());
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
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    if (getFieldMaskCount() > 0) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMaskList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static contactsapi.customfield.ListCustomFieldsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(contactsapi.customfield.ListCustomFieldsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code contactsapi.customfield.ListCustomFieldsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:contactsapi.customfield.ListCustomFieldsRequest)
      contactsapi.customfield.ListCustomFieldsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              contactsapi.customfield.ListCustomFieldsRequest.class, contactsapi.customfield.ListCustomFieldsRequest.Builder.class);
    }

    // Construct using contactsapi.customfield.ListCustomFieldsRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      pageToken_ = "";

      pageSize_ = 0;

      fieldMask_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsRequest_descriptor;
    }

    public contactsapi.customfield.ListCustomFieldsRequest getDefaultInstanceForType() {
      return contactsapi.customfield.ListCustomFieldsRequest.getDefaultInstance();
    }

    public contactsapi.customfield.ListCustomFieldsRequest build() {
      contactsapi.customfield.ListCustomFieldsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public contactsapi.customfield.ListCustomFieldsRequest buildPartial() {
      contactsapi.customfield.ListCustomFieldsRequest result = new contactsapi.customfield.ListCustomFieldsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.pageToken_ = pageToken_;
      result.pageSize_ = pageSize_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        fieldMask_ = fieldMask_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.fieldMask_ = fieldMask_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof contactsapi.customfield.ListCustomFieldsRequest) {
        return mergeFrom((contactsapi.customfield.ListCustomFieldsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(contactsapi.customfield.ListCustomFieldsRequest other) {
      if (other == contactsapi.customfield.ListCustomFieldsRequest.getDefaultInstance()) return this;
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.fieldMask_.isEmpty()) {
        if (fieldMask_.isEmpty()) {
          fieldMask_ = other.fieldMask_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureFieldMaskIsMutable();
          fieldMask_.addAll(other.fieldMask_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      contactsapi.customfield.ListCustomFieldsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (contactsapi.customfield.ListCustomFieldsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object pageToken_ = "";
    /**
     * <code>string page_token = 1;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string page_token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string page_token = 1;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string page_token = 1;</code>
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string page_token = 1;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <code>int32 page_size = 2;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int32 page_size = 2;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_size = 2;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList fieldMask_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFieldMaskIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        fieldMask_ = new com.google.protobuf.LazyStringArrayList(fieldMask_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * TODO: string or array of strings?
     * </pre>
     *
     * <code>repeated string field_mask = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getFieldMaskList() {
      return fieldMask_.getUnmodifiableView();
    }
    /**
     * <pre>
     * TODO: string or array of strings?
     * </pre>
     *
     * <code>repeated string field_mask = 3;</code>
     */
    public int getFieldMaskCount() {
      return fieldMask_.size();
    }
    /**
     * <pre>
     * TODO: string or array of strings?
     * </pre>
     *
     * <code>repeated string field_mask = 3;</code>
     */
    public java.lang.String getFieldMask(int index) {
      return fieldMask_.get(index);
    }
    /**
     * <pre>
     * TODO: string or array of strings?
     * </pre>
     *
     * <code>repeated string field_mask = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFieldMaskBytes(int index) {
      return fieldMask_.getByteString(index);
    }
    /**
     * <pre>
     * TODO: string or array of strings?
     * </pre>
     *
     * <code>repeated string field_mask = 3;</code>
     */
    public Builder setFieldMask(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldMaskIsMutable();
      fieldMask_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: string or array of strings?
     * </pre>
     *
     * <code>repeated string field_mask = 3;</code>
     */
    public Builder addFieldMask(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldMaskIsMutable();
      fieldMask_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: string or array of strings?
     * </pre>
     *
     * <code>repeated string field_mask = 3;</code>
     */
    public Builder addAllFieldMask(
        java.lang.Iterable<java.lang.String> values) {
      ensureFieldMaskIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fieldMask_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: string or array of strings?
     * </pre>
     *
     * <code>repeated string field_mask = 3;</code>
     */
    public Builder clearFieldMask() {
      fieldMask_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: string or array of strings?
     * </pre>
     *
     * <code>repeated string field_mask = 3;</code>
     */
    public Builder addFieldMaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureFieldMaskIsMutable();
      fieldMask_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:contactsapi.customfield.ListCustomFieldsRequest)
  }

  // @@protoc_insertion_point(class_scope:contactsapi.customfield.ListCustomFieldsRequest)
  private static final contactsapi.customfield.ListCustomFieldsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new contactsapi.customfield.ListCustomFieldsRequest();
  }

  public static contactsapi.customfield.ListCustomFieldsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCustomFieldsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListCustomFieldsRequest>() {
    public ListCustomFieldsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListCustomFieldsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListCustomFieldsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCustomFieldsRequest> getParserForType() {
    return PARSER;
  }

  public contactsapi.customfield.ListCustomFieldsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

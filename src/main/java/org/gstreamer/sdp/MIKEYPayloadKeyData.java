package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The Key data payload contains key material. It should be added as sub
 * payload to the KEMAC.
 */
public class MIKEYPayloadKeyData extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPayloadKeyData";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.sdp.MIKEYPayload.getMemoryLayout().withName("pt"),
            Interop.valueLayout.C_INT.withName("key_type"),
            Interop.valueLayout.C_SHORT.withName("key_len"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.ADDRESS.withName("key_data"),
            Interop.valueLayout.C_SHORT.withName("salt_len"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("salt_data"),
            Interop.valueLayout.C_INT.withName("kv_type"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("kv_len"),
            MemoryLayout.paddingLayout(16),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("kv_data")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MIKEYPayloadKeyData}
     * @return A new, uninitialized @{link MIKEYPayloadKeyData}
     */
    public static MIKEYPayloadKeyData allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MIKEYPayloadKeyData newInstance = new MIKEYPayloadKeyData(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pt}
     * @return The value of the field {@code pt}
     */
    public org.gstreamer.sdp.MIKEYPayload getPt() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pt"));
        return org.gstreamer.sdp.MIKEYPayload.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code pt}
     * @param pt The new value of the field {@code pt}
     */
    public void setPt(org.gstreamer.sdp.MIKEYPayload pt) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pt"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code key_type}
     * @return The value of the field {@code key_type}
     */
    public org.gstreamer.sdp.MIKEYKeyDataType getKeyType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.sdp.MIKEYKeyDataType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code key_type}
     * @param keyType The new value of the field {@code key_type}
     */
    public void setKeyType(org.gstreamer.sdp.MIKEYKeyDataType keyType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (keyType == null ? MemoryAddress.NULL : keyType.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code key_len}
     * @return The value of the field {@code key_len}
     */
    public short getKeyLen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key_len"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code key_len}
     * @param keyLen The new value of the field {@code key_len}
     */
    public void setKeyLen(short keyLen) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key_len"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), keyLen);
        }
    }
    
    /**
     * Get the value of the field {@code key_data}
     * @return The value of the field {@code key_data}
     */
    public PointerByte getKeyData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code key_data}
     * @param keyData The new value of the field {@code key_data}
     */
    public void setKeyData(PointerByte keyData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (keyData == null ? MemoryAddress.NULL : keyData.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code salt_len}
     * @return The value of the field {@code salt_len}
     */
    public short getSaltLen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("salt_len"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code salt_len}
     * @param saltLen The new value of the field {@code salt_len}
     */
    public void setSaltLen(short saltLen) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("salt_len"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), saltLen);
        }
    }
    
    /**
     * Get the value of the field {@code salt_data}
     * @return The value of the field {@code salt_data}
     */
    public PointerByte getSaltData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("salt_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code salt_data}
     * @param saltData The new value of the field {@code salt_data}
     */
    public void setSaltData(PointerByte saltData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("salt_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (saltData == null ? MemoryAddress.NULL : saltData.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code kv_type}
     * @return The value of the field {@code kv_type}
     */
    public org.gstreamer.sdp.MIKEYKVType getKvType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kv_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.sdp.MIKEYKVType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code kv_type}
     * @param kvType The new value of the field {@code kv_type}
     */
    public void setKvType(org.gstreamer.sdp.MIKEYKVType kvType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kv_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (kvType == null ? MemoryAddress.NULL : kvType.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code kv_len}
     * @return The value of the field {@code kv_len}
     */
    public byte[] getKvLen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kv_len"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 2, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code kv_len}
     * @param kvLen The new value of the field {@code kv_len}
     */
    public void setKvLen(byte[] kvLen) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kv_len"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (kvLen == null ? MemoryAddress.NULL : Interop.allocateNativeArray(kvLen, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code kv_data}
     * @return The value of the field {@code kv_data}
     */
    public byte[] getKvData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kv_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 2, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code kv_data}
     * @param kvData The new value of the field {@code kv_data}
     */
    public void setKvData(byte[] kvData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kv_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (kvData == null ? MemoryAddress.NULL : Interop.allocateNativeArray(kvData, false, SCOPE)));
        }
    }
    
    /**
     * Create a MIKEYPayloadKeyData proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MIKEYPayloadKeyData(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYPayloadKeyData> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYPayloadKeyData(input);
    
    /**
     * A {@link MIKEYPayloadKeyData.Builder} object constructs a {@link MIKEYPayloadKeyData} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MIKEYPayloadKeyData.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MIKEYPayloadKeyData struct;
        
        private Builder() {
            struct = MIKEYPayloadKeyData.allocate();
        }
        
        /**
         * Finish building the {@link MIKEYPayloadKeyData} struct.
         * @return A new instance of {@code MIKEYPayloadKeyData} with the fields 
         *         that were set in the Builder object.
         */
        public MIKEYPayloadKeyData build() {
            return struct;
        }
        
        /**
         * the payload header
         * @param pt The value for the {@code pt} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPt(org.gstreamer.sdp.MIKEYPayload pt) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pt"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
                return this;
            }
        }
        
        /**
         * the {@link MIKEYKeyDataType} of {@code key_data}
         * @param keyType The value for the {@code keyType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKeyType(org.gstreamer.sdp.MIKEYKeyDataType keyType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("key_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (keyType == null ? MemoryAddress.NULL : keyType.getValue()));
                return this;
            }
        }
        
        /**
         * length of {@code key_data}
         * @param keyLen The value for the {@code keyLen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKeyLen(short keyLen) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("key_len"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), keyLen);
                return this;
            }
        }
        
        /**
         * the key data
         * @param keyData The value for the {@code keyData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKeyData(PointerByte keyData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("key_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (keyData == null ? MemoryAddress.NULL : keyData.handle()));
                return this;
            }
        }
        
        /**
         * the length of {@code salt_data}, can be 0
         * @param saltLen The value for the {@code saltLen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSaltLen(short saltLen) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("salt_len"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), saltLen);
                return this;
            }
        }
        
        /**
         * salt data
         * @param saltData The value for the {@code saltData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSaltData(PointerByte saltData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("salt_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (saltData == null ? MemoryAddress.NULL : saltData.handle()));
                return this;
            }
        }
        
        /**
         * the Key Validity type
         * @param kvType The value for the {@code kvType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKvType(org.gstreamer.sdp.MIKEYKVType kvType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("kv_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (kvType == null ? MemoryAddress.NULL : kvType.getValue()));
                return this;
            }
        }
        
        /**
         * length of {@code kv_data}
         * @param kvLen The value for the {@code kvLen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKvLen(byte[] kvLen) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("kv_len"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (kvLen == null ? MemoryAddress.NULL : Interop.allocateNativeArray(kvLen, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * key validity data
         * @param kvData The value for the {@code kvData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKvData(byte[] kvData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("kv_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (kvData == null ? MemoryAddress.NULL : Interop.allocateNativeArray(kvData, false, SCOPE)));
                return this;
            }
        }
    }
}

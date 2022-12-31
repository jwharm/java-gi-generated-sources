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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYPayloadKeyData newInstance = new MIKEYPayloadKeyData(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pt}
     * @return The value of the field {@code pt}
     */
    public org.gstreamer.sdp.MIKEYPayload getPt() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pt"));
        return org.gstreamer.sdp.MIKEYPayload.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pt}
     * @param pt The new value of the field {@code pt}
     */
    public void setPt(org.gstreamer.sdp.MIKEYPayload pt) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pt"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
    }
    
    /**
     * Get the value of the field {@code key_type}
     * @return The value of the field {@code key_type}
     */
    public org.gstreamer.sdp.MIKEYKeyDataType getKeyType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYKeyDataType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code key_type}
     * @param keyType The new value of the field {@code key_type}
     */
    public void setKeyType(org.gstreamer.sdp.MIKEYKeyDataType keyType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (keyType == null ? MemoryAddress.NULL : keyType.getValue()));
    }
    
    /**
     * Get the value of the field {@code key_len}
     * @return The value of the field {@code key_len}
     */
    public short getKeyLen() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key_len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code key_len}
     * @param keyLen The new value of the field {@code key_len}
     */
    public void setKeyLen(short keyLen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key_len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), keyLen);
    }
    
    /**
     * Get the value of the field {@code key_data}
     * @return The value of the field {@code key_data}
     */
    public PointerByte getKeyData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code key_data}
     * @param keyData The new value of the field {@code key_data}
     */
    public void setKeyData(PointerByte keyData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (keyData == null ? MemoryAddress.NULL : keyData.handle()));
    }
    
    /**
     * Get the value of the field {@code salt_len}
     * @return The value of the field {@code salt_len}
     */
    public short getSaltLen() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("salt_len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code salt_len}
     * @param saltLen The new value of the field {@code salt_len}
     */
    public void setSaltLen(short saltLen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("salt_len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), saltLen);
    }
    
    /**
     * Get the value of the field {@code salt_data}
     * @return The value of the field {@code salt_data}
     */
    public PointerByte getSaltData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("salt_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code salt_data}
     * @param saltData The new value of the field {@code salt_data}
     */
    public void setSaltData(PointerByte saltData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("salt_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (saltData == null ? MemoryAddress.NULL : saltData.handle()));
    }
    
    /**
     * Get the value of the field {@code kv_type}
     * @return The value of the field {@code kv_type}
     */
    public org.gstreamer.sdp.MIKEYKVType getKvType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("kv_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYKVType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code kv_type}
     * @param kvType The new value of the field {@code kv_type}
     */
    public void setKvType(org.gstreamer.sdp.MIKEYKVType kvType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("kv_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (kvType == null ? MemoryAddress.NULL : kvType.getValue()));
    }
    
    /**
     * Get the value of the field {@code kv_len}
     * @return The value of the field {@code kv_len}
     */
    public byte[] getKvLen() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("kv_len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 2, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code kv_len}
     * @param kvLen The new value of the field {@code kv_len}
     */
    public void setKvLen(byte[] kvLen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("kv_len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (kvLen == null ? MemoryAddress.NULL : Interop.allocateNativeArray(kvLen, false)));
    }
    
    /**
     * Get the value of the field {@code kv_data}
     * @return The value of the field {@code kv_data}
     */
    public byte[] getKvData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("kv_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 2, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code kv_data}
     * @param kvData The new value of the field {@code kv_data}
     */
    public void setKvData(byte[] kvData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("kv_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (kvData == null ? MemoryAddress.NULL : Interop.allocateNativeArray(kvData, false)));
    }
    
    /**
     * Create a MIKEYPayloadKeyData proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MIKEYPayloadKeyData(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYPayloadKeyData> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYPayloadKeyData(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
            return this;
        }
        
        /**
         * the {@link MIKEYKeyDataType} of {@code key_data}
         * @param keyType The value for the {@code keyType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKeyType(org.gstreamer.sdp.MIKEYKeyDataType keyType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (keyType == null ? MemoryAddress.NULL : keyType.getValue()));
            return this;
        }
        
        /**
         * length of {@code key_data}
         * @param keyLen The value for the {@code keyLen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKeyLen(short keyLen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key_len"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), keyLen);
            return this;
        }
        
        /**
         * the key data
         * @param keyData The value for the {@code keyData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKeyData(PointerByte keyData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (keyData == null ? MemoryAddress.NULL : keyData.handle()));
            return this;
        }
        
        /**
         * the length of {@code salt_data}, can be 0
         * @param saltLen The value for the {@code saltLen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSaltLen(short saltLen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("salt_len"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), saltLen);
            return this;
        }
        
        /**
         * salt data
         * @param saltData The value for the {@code saltData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSaltData(PointerByte saltData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("salt_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (saltData == null ? MemoryAddress.NULL : saltData.handle()));
            return this;
        }
        
        /**
         * the Key Validity type
         * @param kvType The value for the {@code kvType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKvType(org.gstreamer.sdp.MIKEYKVType kvType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kv_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (kvType == null ? MemoryAddress.NULL : kvType.getValue()));
            return this;
        }
        
        /**
         * length of {@code kv_data}
         * @param kvLen The value for the {@code kvLen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKvLen(byte[] kvLen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kv_len"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (kvLen == null ? MemoryAddress.NULL : Interop.allocateNativeArray(kvLen, false)));
            return this;
        }
        
        /**
         * key validity data
         * @param kvData The value for the {@code kvData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKvData(byte[] kvData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kv_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (kvData == null ? MemoryAddress.NULL : Interop.allocateNativeArray(kvData, false)));
            return this;
        }
    }
}

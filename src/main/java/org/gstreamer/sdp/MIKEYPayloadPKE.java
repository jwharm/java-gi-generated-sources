package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The Envelope data payload contains the encrypted envelope key that is
 * used in the public-key transport to protect the data in the Key data
 * transport payload.  The encryption algorithm used is implicit from
 * the certificate/public key used.
 */
public class MIKEYPayloadPKE extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPayloadPKE";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.sdp.MIKEYPayload.getMemoryLayout().withName("pt"),
            Interop.valueLayout.C_INT.withName("C"),
            Interop.valueLayout.C_SHORT.withName("data_len"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.ADDRESS.withName("data")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MIKEYPayloadPKE}
     * @return A new, uninitialized @{link MIKEYPayloadPKE}
     */
    public static MIKEYPayloadPKE allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYPayloadPKE newInstance = new MIKEYPayloadPKE(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code C}
     * @return The value of the field {@code C}
     */
    public org.gstreamer.sdp.MIKEYCacheType getC() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("C"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYCacheType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code C}
     * @param C The new value of the field {@code C}
     */
    public void setC(org.gstreamer.sdp.MIKEYCacheType C) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("C"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (C == null ? MemoryAddress.NULL : C.getValue()));
    }
    
    /**
     * Get the value of the field {@code data_len}
     * @return The value of the field {@code data_len}
     */
    public short getDataLen() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data_len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data_len}
     * @param dataLen The new value of the field {@code data_len}
     */
    public void setDataLen(short dataLen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data_len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dataLen);
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public PointerByte getData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(PointerByte data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
    }
    
    /**
     * Create a MIKEYPayloadPKE proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MIKEYPayloadPKE(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYPayloadPKE> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYPayloadPKE(input, ownership);
    
    /**
     * A {@link MIKEYPayloadPKE.Builder} object constructs a {@link MIKEYPayloadPKE} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MIKEYPayloadPKE.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MIKEYPayloadPKE struct;
        
        private Builder() {
            struct = MIKEYPayloadPKE.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYPayloadPKE} struct.
         * @return A new instance of {@code MIKEYPayloadPKE} with the fields 
         *         that were set in the Builder object.
         */
        public MIKEYPayloadPKE build() {
            return struct;
        }
        
        /**
         * the common {@link MIKEYPayload}
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
         * envelope key cache indicator
         * @param C The value for the {@code C} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setC(org.gstreamer.sdp.MIKEYCacheType C) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("C"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (C == null ? MemoryAddress.NULL : C.getValue()));
            return this;
        }
        
        /**
         * length of {@code data}
         * @param dataLen The value for the {@code dataLen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDataLen(short dataLen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data_len"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dataLen);
            return this;
        }
        
        /**
         * the encrypted envelope key
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(PointerByte data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
            return this;
        }
    }
}

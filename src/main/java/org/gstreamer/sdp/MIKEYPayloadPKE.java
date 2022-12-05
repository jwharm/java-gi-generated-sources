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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.sdp.MIKEYPayload.getMemoryLayout().withName("pt"),
        Interop.valueLayout.C_INT.withName("C"),
        Interop.valueLayout.C_SHORT.withName("data_len"),
        MemoryLayout.paddingLayout(16),
        Interop.valueLayout.ADDRESS.withName("data")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
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
    public org.gstreamer.sdp.MIKEYPayload pt$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pt"));
        return new org.gstreamer.sdp.MIKEYPayload(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code C}
     * @return The value of the field {@code C}
     */
    public org.gstreamer.sdp.MIKEYCacheType C$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("C"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYCacheType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code C}
     * @param C The new value of the field {@code C}
     */
    public void C$set(org.gstreamer.sdp.MIKEYCacheType C) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("C"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), C.getValue());
    }
    
    /**
     * Get the value of the field {@code data_len}
     * @return The value of the field {@code data_len}
     */
    public short dataLen$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data_len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data_len}
     * @param dataLen The new value of the field {@code data_len}
     */
    public void dataLen$set(short dataLen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data_len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dataLen);
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public PointerByte data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(PointerByte data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), data.handle());
    }
    
    /**
     * Create a MIKEYPayloadPKE proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MIKEYPayloadPKE(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MIKEYPayloadPKE struct;
        
         /**
         * A {@link MIKEYPayloadPKE.Build} object constructs a {@link MIKEYPayloadPKE} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MIKEYPayloadPKE.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYPayloadPKE} struct.
         * @return A new instance of {@code MIKEYPayloadPKE} with the fields 
         *         that were set in the Build object.
         */
        public MIKEYPayloadPKE construct() {
            return struct;
        }
        
        /**
         * the common {@link MIKEYPayload}
         * @param pt The value for the {@code pt} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPt(org.gstreamer.sdp.MIKEYPayload pt) {
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
        public Build setC(org.gstreamer.sdp.MIKEYCacheType C) {
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
        public Build setDataLen(short dataLen) {
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
        public Build setData(PointerByte data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
            return this;
        }
    }
}

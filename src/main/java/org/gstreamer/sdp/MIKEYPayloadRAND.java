package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The RAND payload consists of a (pseudo-)random bit-string
 */
public class MIKEYPayloadRAND extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPayloadRAND";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.sdp.MIKEYPayload.getMemoryLayout().withName("pt"),
        Interop.valueLayout.C_BYTE.withName("len"),
        MemoryLayout.paddingLayout(56),
        Interop.valueLayout.ADDRESS.withName("rand")
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
     * Allocate a new {@link MIKEYPayloadRAND}
     * @return A new, uninitialized @{link MIKEYPayloadRAND}
     */
    public static MIKEYPayloadRAND allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYPayloadRAND newInstance = new MIKEYPayloadRAND(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code len}
     * @return The value of the field {@code len}
     */
    public byte len$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code len}
     * @param len The new value of the field {@code len}
     */
    public void len$set(byte len) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), len);
    }
    
    /**
     * Get the value of the field {@code rand}
     * @return The value of the field {@code rand}
     */
    public PointerByte rand$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rand"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code rand}
     * @param rand The new value of the field {@code rand}
     */
    public void rand$set(PointerByte rand) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rand"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), rand.handle());
    }
    
    /**
     * Create a MIKEYPayloadRAND proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MIKEYPayloadRAND(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MIKEYPayloadRAND struct;
        
         /**
         * A {@link MIKEYPayloadRAND.Build} object constructs a {@link MIKEYPayloadRAND} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MIKEYPayloadRAND.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYPayloadRAND} struct.
         * @return A new instance of {@code MIKEYPayloadRAND} with the fields 
         *         that were set in the Build object.
         */
        public MIKEYPayloadRAND construct() {
            return struct;
        }
        
        /**
         * the payload header
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
         * the length of {@code rand}
         * @param len The value for the {@code len} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLen(byte len) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("len"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), len);
            return this;
        }
        
        /**
         * random values
         * @param rand The value for the {@code rand} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRand(PointerByte rand) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rand"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rand == null ? MemoryAddress.NULL : rand.handle()));
            return this;
        }
    }
}

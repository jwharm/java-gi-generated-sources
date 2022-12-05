package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Audio CD source base class.
 */
public class AudioCdSrcClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioCdSrcClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.PushSrcClass.getMemoryLayout().withName("pushsrc_class"),
        Interop.valueLayout.ADDRESS.withName("open"),
        Interop.valueLayout.ADDRESS.withName("close"),
        Interop.valueLayout.ADDRESS.withName("read_sector"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AudioCdSrcClass}
     * @return A new, uninitialized @{link AudioCdSrcClass}
     */
    public static AudioCdSrcClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioCdSrcClass newInstance = new AudioCdSrcClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pushsrc_class}
     * @return The value of the field {@code pushsrc_class}
     */
    public org.gstreamer.base.PushSrcClass pushsrcClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pushsrc_class"));
        return new org.gstreamer.base.PushSrcClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AudioCdSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioCdSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioCdSrcClass struct;
        
         /**
         * A {@link AudioCdSrcClass.Build} object constructs a {@link AudioCdSrcClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioCdSrcClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioCdSrcClass} struct.
         * @return A new instance of {@code AudioCdSrcClass} with the fields 
         *         that were set in the Build object.
         */
        public AudioCdSrcClass construct() {
            return struct;
        }
        
        /**
         * the parent class
         * @param pushsrcClass The value for the {@code pushsrcClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPushsrcClass(org.gstreamer.base.PushSrcClass pushsrcClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pushsrc_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pushsrcClass == null ? MemoryAddress.NULL : pushsrcClass.handle()));
            return this;
        }
        
        public Build setOpen(java.lang.foreign.MemoryAddress open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open));
            return this;
        }
        
        public Build setClose(java.lang.foreign.MemoryAddress close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close));
            return this;
        }
        
        public Build setReadSector(java.lang.foreign.MemoryAddress readSector) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_sector"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readSector == null ? MemoryAddress.NULL : readSector));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}

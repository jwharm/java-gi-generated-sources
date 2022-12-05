package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AudioSrc} class. Override the vmethod to implement
 * functionality.
 */
public class AudioSrcClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioSrcClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.audio.AudioBaseSrcClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("open"),
        Interop.valueLayout.ADDRESS.withName("prepare"),
        Interop.valueLayout.ADDRESS.withName("unprepare"),
        Interop.valueLayout.ADDRESS.withName("close"),
        Interop.valueLayout.ADDRESS.withName("read"),
        Interop.valueLayout.ADDRESS.withName("delay"),
        Interop.valueLayout.ADDRESS.withName("reset"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AudioSrcClass}
     * @return A new, uninitialized @{link AudioSrcClass}
     */
    public static AudioSrcClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioSrcClass newInstance = new AudioSrcClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.audio.AudioBaseSrcClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.audio.AudioBaseSrcClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AudioSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioSrcClass struct;
        
         /**
         * A {@link AudioSrcClass.Build} object constructs a {@link AudioSrcClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioSrcClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioSrcClass} struct.
         * @return A new instance of {@code AudioSrcClass} with the fields 
         *         that were set in the Build object.
         */
        public AudioSrcClass construct() {
            return struct;
        }
        
        /**
         * the parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.audio.AudioBaseSrcClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setOpen(java.lang.foreign.MemoryAddress open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open));
            return this;
        }
        
        public Build setPrepare(java.lang.foreign.MemoryAddress prepare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare));
            return this;
        }
        
        public Build setUnprepare(java.lang.foreign.MemoryAddress unprepare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unprepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unprepare == null ? MemoryAddress.NULL : unprepare));
            return this;
        }
        
        public Build setClose(java.lang.foreign.MemoryAddress close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close));
            return this;
        }
        
        public Build setRead(java.lang.foreign.MemoryAddress read) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read == null ? MemoryAddress.NULL : read));
            return this;
        }
        
        public Build setDelay(java.lang.foreign.MemoryAddress delay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delay"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delay == null ? MemoryAddress.NULL : delay));
            return this;
        }
        
        public Build setReset(java.lang.foreign.MemoryAddress reset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset));
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

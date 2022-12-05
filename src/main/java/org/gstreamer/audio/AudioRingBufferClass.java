package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The vmethods that subclasses can override to implement the ringbuffer.
 */
public class AudioRingBufferClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioRingBufferClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("open_device"),
        Interop.valueLayout.ADDRESS.withName("acquire"),
        Interop.valueLayout.ADDRESS.withName("release"),
        Interop.valueLayout.ADDRESS.withName("close_device"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("pause"),
        Interop.valueLayout.ADDRESS.withName("resume"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("delay"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        Interop.valueLayout.ADDRESS.withName("commit"),
        Interop.valueLayout.ADDRESS.withName("clear_all"),
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
     * Allocate a new {@link AudioRingBufferClass}
     * @return A new, uninitialized @{link AudioRingBufferClass}
     */
    public static AudioRingBufferClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioRingBufferClass newInstance = new AudioRingBufferClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AudioRingBufferClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioRingBufferClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioRingBufferClass struct;
        
         /**
         * A {@link AudioRingBufferClass.Build} object constructs a {@link AudioRingBufferClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioRingBufferClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioRingBufferClass} struct.
         * @return A new instance of {@code AudioRingBufferClass} with the fields 
         *         that were set in the Build object.
         */
        public AudioRingBufferClass construct() {
            return struct;
        }
        
        /**
         * parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setOpenDevice(java.lang.foreign.MemoryAddress openDevice) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_device"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openDevice == null ? MemoryAddress.NULL : openDevice));
            return this;
        }
        
        public Build setAcquire(java.lang.foreign.MemoryAddress acquire) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquire == null ? MemoryAddress.NULL : acquire));
            return this;
        }
        
        public Build setRelease(java.lang.foreign.MemoryAddress release) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (release == null ? MemoryAddress.NULL : release));
            return this;
        }
        
        public Build setCloseDevice(java.lang.foreign.MemoryAddress closeDevice) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_device"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeDevice == null ? MemoryAddress.NULL : closeDevice));
            return this;
        }
        
        public Build setStart(java.lang.foreign.MemoryAddress start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start));
            return this;
        }
        
        public Build setPause(java.lang.foreign.MemoryAddress pause) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pause"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pause == null ? MemoryAddress.NULL : pause));
            return this;
        }
        
        public Build setResume(java.lang.foreign.MemoryAddress resume) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resume"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resume == null ? MemoryAddress.NULL : resume));
            return this;
        }
        
        public Build setStop(java.lang.foreign.MemoryAddress stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop));
            return this;
        }
        
        public Build setDelay(java.lang.foreign.MemoryAddress delay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delay"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delay == null ? MemoryAddress.NULL : delay));
            return this;
        }
        
        public Build setActivate(java.lang.foreign.MemoryAddress activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate));
            return this;
        }
        
        public Build setCommit(java.lang.foreign.MemoryAddress commit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("commit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (commit == null ? MemoryAddress.NULL : commit));
            return this;
        }
        
        public Build setClearAll(java.lang.foreign.MemoryAddress clearAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clear_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clearAll == null ? MemoryAddress.NULL : clearAll));
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

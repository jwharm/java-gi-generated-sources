package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioSinkClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioSinkClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.audio.AudioBaseSinkClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("open"),
        Interop.valueLayout.ADDRESS.withName("prepare"),
        Interop.valueLayout.ADDRESS.withName("unprepare"),
        Interop.valueLayout.ADDRESS.withName("close"),
        Interop.valueLayout.ADDRESS.withName("write"),
        Interop.valueLayout.ADDRESS.withName("delay"),
        Interop.valueLayout.ADDRESS.withName("reset"),
        Interop.valueLayout.ADDRESS.withName("pause"),
        Interop.valueLayout.ADDRESS.withName("resume"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("extension")
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
     * Allocate a new {@link AudioSinkClass}
     * @return A new, uninitialized @{link AudioSinkClass}
     */
    public static AudioSinkClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioSinkClass newInstance = new AudioSinkClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.audio.AudioBaseSinkClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.audio.AudioBaseSinkClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code extension}
     * @return The value of the field {@code extension}
     */
    public org.gstreamer.audio.AudioSinkClassExtension extension$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("extension"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.audio.AudioSinkClassExtension(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code extension}
     * @param extension The new value of the field {@code extension}
     */
    public void extension$set(org.gstreamer.audio.AudioSinkClassExtension extension) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("extension"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), extension.handle());
    }
    
    /**
     * Create a AudioSinkClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioSinkClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioSinkClass struct;
        
         /**
         * A {@link AudioSinkClass.Build} object constructs a {@link AudioSinkClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioSinkClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioSinkClass} struct.
         * @return A new instance of {@code AudioSinkClass} with the fields 
         *         that were set in the Build object.
         */
        public AudioSinkClass construct() {
            return struct;
        }
        
        /**
         * the parent class structure.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.audio.AudioBaseSinkClass parentClass) {
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
        
        public Build setWrite(java.lang.foreign.MemoryAddress write) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write == null ? MemoryAddress.NULL : write));
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
        
        /**
         * class extension structure. Since: 1.18
         * @param extension The value for the {@code extension} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setExtension(org.gstreamer.audio.AudioSinkClassExtension extension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (extension == null ? MemoryAddress.NULL : extension.handle()));
            return this;
        }
    }
}

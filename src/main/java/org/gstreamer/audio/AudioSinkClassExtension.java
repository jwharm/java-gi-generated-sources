package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioSinkClassExtension extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioSinkClassExtension";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("clear_all")
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
     * Allocate a new {@link AudioSinkClassExtension}
     * @return A new, uninitialized @{link AudioSinkClassExtension}
     */
    public static AudioSinkClassExtension allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioSinkClassExtension newInstance = new AudioSinkClassExtension(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AudioSinkClassExtension proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioSinkClassExtension(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioSinkClassExtension struct;
        
         /**
         * A {@link AudioSinkClassExtension.Build} object constructs a {@link AudioSinkClassExtension} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioSinkClassExtension.allocate();
        }
        
         /**
         * Finish building the {@link AudioSinkClassExtension} struct.
         * @return A new instance of {@code AudioSinkClassExtension} with the fields 
         *         that were set in the Build object.
         */
        public AudioSinkClassExtension construct() {
            return struct;
        }
        
        public Build setClearAll(java.lang.foreign.MemoryAddress clearAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clear_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clearAll == null ? MemoryAddress.NULL : clearAll));
            return this;
        }
    }
}

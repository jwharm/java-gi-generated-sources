package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioVisualizerClass extends Struct {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioVisualizerClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("setup"),
        Interop.valueLayout.ADDRESS.withName("render"),
        Interop.valueLayout.ADDRESS.withName("decide_allocation")
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
     * Allocate a new {@link AudioVisualizerClass}
     * @return A new, uninitialized @{link AudioVisualizerClass}
     */
    public static AudioVisualizerClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioVisualizerClass newInstance = new AudioVisualizerClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AudioVisualizerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioVisualizerClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioVisualizerClass struct;
        
         /**
         * A {@link AudioVisualizerClass.Build} object constructs a {@link AudioVisualizerClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioVisualizerClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioVisualizerClass} struct.
         * @return A new instance of {@code AudioVisualizerClass} with the fields 
         *         that were set in the Build object.
         */
        public AudioVisualizerClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setSetup(java.lang.foreign.MemoryAddress setup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setup == null ? MemoryAddress.NULL : setup));
            return this;
        }
        
        public Build setRender(java.lang.foreign.MemoryAddress render) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (render == null ? MemoryAddress.NULL : render));
            return this;
        }
        
        public Build setDecideAllocation(java.lang.foreign.MemoryAddress decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation));
            return this;
        }
    }
}

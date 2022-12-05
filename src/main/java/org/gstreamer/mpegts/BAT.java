package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * DVB Bouquet Association Table (EN 300 468)
 */
public class BAT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsBAT";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("descriptors"),
        Interop.valueLayout.ADDRESS.withName("streams")
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
     * Allocate a new {@link BAT}
     * @return A new, uninitialized @{link BAT}
     */
    public static BAT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BAT newInstance = new BAT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BAT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BAT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BAT struct;
        
         /**
         * A {@link BAT.Build} object constructs a {@link BAT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BAT.allocate();
        }
        
         /**
         * Finish building the {@link BAT} struct.
         * @return A new instance of {@code BAT} with the fields 
         *         that were set in the Build object.
         */
        public BAT construct() {
            return struct;
        }
        
        public Build setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
            return this;
        }
        
        public Build setStreams(org.gstreamer.mpegts.BATStream[] streams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("streams"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streams == null ? MemoryAddress.NULL : Interop.allocateNativeArray(streams, org.gstreamer.mpegts.BATStream.getMemoryLayout(), false)));
            return this;
        }
    }
}

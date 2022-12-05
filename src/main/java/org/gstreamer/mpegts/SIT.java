package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Selection Information Table (EN 300 468)
 * @version 1.20
 */
public class SIT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSIT";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("descriptors"),
        Interop.valueLayout.ADDRESS.withName("services")
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
     * Allocate a new {@link SIT}
     * @return A new, uninitialized @{link SIT}
     */
    public static SIT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SIT newInstance = new SIT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SIT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SIT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SIT struct;
        
         /**
         * A {@link SIT.Build} object constructs a {@link SIT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SIT.allocate();
        }
        
         /**
         * Finish building the {@link SIT} struct.
         * @return A new instance of {@code SIT} with the fields 
         *         that were set in the Build object.
         */
        public SIT construct() {
            return struct;
        }
        
        /**
         * List of descriptors
         * @param descriptors The value for the {@code descriptors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * List of services
         * @param services The value for the {@code services} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setServices(org.gstreamer.mpegts.SITService[] services) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("services"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (services == null ? MemoryAddress.NULL : Interop.allocateNativeArray(services, org.gstreamer.mpegts.SITService.getMemoryLayout(), false)));
            return this;
        }
    }
}

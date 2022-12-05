package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Time Offset Table (EN 300 468)
 */
public class TOT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsTOT";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("utc_time"),
        Interop.valueLayout.ADDRESS.withName("descriptors")
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
     * Allocate a new {@link TOT}
     * @return A new, uninitialized @{link TOT}
     */
    public static TOT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TOT newInstance = new TOT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code utc_time}
     * @return The value of the field {@code utc_time}
     */
    public org.gstreamer.gst.DateTime utcTime$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("utc_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.DateTime(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code utc_time}
     * @param utcTime The new value of the field {@code utc_time}
     */
    public void utcTime$set(org.gstreamer.gst.DateTime utcTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("utc_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), utcTime.handle());
    }
    
    /**
     * Create a TOT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TOT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TOT struct;
        
         /**
         * A {@link TOT.Build} object constructs a {@link TOT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TOT.allocate();
        }
        
         /**
         * Finish building the {@link TOT} struct.
         * @return A new instance of {@code TOT} with the fields 
         *         that were set in the Build object.
         */
        public TOT construct() {
            return struct;
        }
        
        public Build setUtcTime(org.gstreamer.gst.DateTime utcTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("utc_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (utcTime == null ? MemoryAddress.NULL : utcTime.handle()));
            return this;
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
    }
}

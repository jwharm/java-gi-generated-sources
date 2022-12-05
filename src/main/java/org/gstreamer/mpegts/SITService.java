package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * SIT Service entry
 * @version 1.20
 */
public class SITService extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSITService";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("service_id"),
        MemoryLayout.paddingLayout(16),
        Interop.valueLayout.C_INT.withName("running_status"),
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
     * Allocate a new {@link SITService}
     * @return A new, uninitialized @{link SITService}
     */
    public static SITService allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SITService newInstance = new SITService(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code service_id}
     * @return The value of the field {@code service_id}
     */
    public short serviceId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code service_id}
     * @param serviceId The new value of the field {@code service_id}
     */
    public void serviceId$set(short serviceId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), serviceId);
    }
    
    /**
     * Get the value of the field {@code running_status}
     * @return The value of the field {@code running_status}
     */
    public org.gstreamer.mpegts.RunningStatus runningStatus$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("running_status"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.RunningStatus.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code running_status}
     * @param runningStatus The new value of the field {@code running_status}
     */
    public void runningStatus$set(org.gstreamer.mpegts.RunningStatus runningStatus) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("running_status"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), runningStatus.getValue());
    }
    
    /**
     * Create a SITService proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SITService(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SITService struct;
        
         /**
         * A {@link SITService.Build} object constructs a {@link SITService} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SITService.allocate();
        }
        
         /**
         * Finish building the {@link SITService} struct.
         * @return A new instance of {@code SITService} with the fields 
         *         that were set in the Build object.
         */
        public SITService construct() {
            return struct;
        }
        
        /**
         * The Program number this table belongs to
         * @param serviceId The value for the {@code serviceId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setServiceId(short serviceId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), serviceId);
            return this;
        }
        
        /**
         * Status of this service
         * @param runningStatus The value for the {@code runningStatus} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRunningStatus(org.gstreamer.mpegts.RunningStatus runningStatus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("running_status"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (runningStatus == null ? MemoryAddress.NULL : runningStatus.getValue()));
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

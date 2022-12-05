package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SDTService extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSDTService";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("service_id"),
        MemoryLayout.paddingLayout(16),
        Interop.valueLayout.C_INT.withName("EIT_schedule_flag"),
        Interop.valueLayout.C_INT.withName("EIT_present_following_flag"),
        Interop.valueLayout.C_INT.withName("running_status"),
        Interop.valueLayout.C_INT.withName("free_CA_mode"),
        MemoryLayout.paddingLayout(32),
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
     * Allocate a new {@link SDTService}
     * @return A new, uninitialized @{link SDTService}
     */
    public static SDTService allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDTService newInstance = new SDTService(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code EIT_schedule_flag}
     * @return The value of the field {@code EIT_schedule_flag}
     */
    public boolean EITScheduleFlag$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("EIT_schedule_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code EIT_schedule_flag}
     * @param EITScheduleFlag The new value of the field {@code EIT_schedule_flag}
     */
    public void EITScheduleFlag$set(boolean EITScheduleFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("EIT_schedule_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), EITScheduleFlag ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code EIT_present_following_flag}
     * @return The value of the field {@code EIT_present_following_flag}
     */
    public boolean EITPresentFollowingFlag$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("EIT_present_following_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code EIT_present_following_flag}
     * @param EITPresentFollowingFlag The new value of the field {@code EIT_present_following_flag}
     */
    public void EITPresentFollowingFlag$set(boolean EITPresentFollowingFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("EIT_present_following_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), EITPresentFollowingFlag ? 1 : 0);
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
     * Get the value of the field {@code free_CA_mode}
     * @return The value of the field {@code free_CA_mode}
     */
    public boolean freeCAMode$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free_CA_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code free_CA_mode}
     * @param freeCAMode The new value of the field {@code free_CA_mode}
     */
    public void freeCAMode$set(boolean freeCAMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free_CA_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), freeCAMode ? 1 : 0);
    }
    
    /**
     * Create a SDTService proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SDTService(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_sdt_service_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initializes a {@link SDTService}.
     */
    public SDTService() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_sdt_service_new = Interop.downcallHandle(
            "gst_mpegts_sdt_service_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SDTService struct;
        
         /**
         * A {@link SDTService.Build} object constructs a {@link SDTService} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SDTService.allocate();
        }
        
         /**
         * Finish building the {@link SDTService} struct.
         * @return A new instance of {@code SDTService} with the fields 
         *         that were set in the Build object.
         */
        public SDTService construct() {
            return struct;
        }
        
        /**
         * The program number this table belongs to
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
         * EIT schedule information is present in this transport stream
         * @param EITScheduleFlag The value for the {@code EITScheduleFlag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEITScheduleFlag(boolean EITScheduleFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("EIT_schedule_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), EITScheduleFlag ? 1 : 0);
            return this;
        }
        
        /**
         * EIT present/following information is present in this transport stream
         * @param EITPresentFollowingFlag The value for the {@code EITPresentFollowingFlag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEITPresentFollowingFlag(boolean EITPresentFollowingFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("EIT_present_following_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), EITPresentFollowingFlag ? 1 : 0);
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
         * True if one or more streams is controlled by a CA system
         * @param freeCAMode The value for the {@code freeCAMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFreeCAMode(boolean freeCAMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_CA_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), freeCAMode ? 1 : 0);
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

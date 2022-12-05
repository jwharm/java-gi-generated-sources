package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class LogicalChannel extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsLogicalChannel";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("service_id"),
        MemoryLayout.paddingLayout(16),
        Interop.valueLayout.C_INT.withName("visible_service"),
        Interop.valueLayout.C_SHORT.withName("logical_channel_number")
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
     * Allocate a new {@link LogicalChannel}
     * @return A new, uninitialized @{link LogicalChannel}
     */
    public static LogicalChannel allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LogicalChannel newInstance = new LogicalChannel(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code visible_service}
     * @return The value of the field {@code visible_service}
     */
    public boolean visibleService$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("visible_service"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code visible_service}
     * @param visibleService The new value of the field {@code visible_service}
     */
    public void visibleService$set(boolean visibleService) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("visible_service"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), visibleService ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code logical_channel_number}
     * @return The value of the field {@code logical_channel_number}
     */
    public short logicalChannelNumber$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("logical_channel_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code logical_channel_number}
     * @param logicalChannelNumber The new value of the field {@code logical_channel_number}
     */
    public void logicalChannelNumber$set(short logicalChannelNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("logical_channel_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), logicalChannelNumber);
    }
    
    /**
     * Create a LogicalChannel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LogicalChannel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private LogicalChannel struct;
        
         /**
         * A {@link LogicalChannel.Build} object constructs a {@link LogicalChannel} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = LogicalChannel.allocate();
        }
        
         /**
         * Finish building the {@link LogicalChannel} struct.
         * @return A new instance of {@code LogicalChannel} with the fields 
         *         that were set in the Build object.
         */
        public LogicalChannel construct() {
            return struct;
        }
        
        public Build setServiceId(short serviceId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), serviceId);
            return this;
        }
        
        public Build setVisibleService(boolean visibleService) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible_service"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), visibleService ? 1 : 0);
            return this;
        }
        
        public Build setLogicalChannelNumber(short logicalChannelNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("logical_channel_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), logicalChannelNumber);
            return this;
        }
    }
}

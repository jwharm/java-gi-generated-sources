package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A time range.
 */
public class RTSPTimeRange extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPTimeRange";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("unit"),
        MemoryLayout.paddingLayout(32),
        org.gstreamer.rtsp.RTSPTime.getMemoryLayout().withName("min"),
        org.gstreamer.rtsp.RTSPTime.getMemoryLayout().withName("max"),
        org.gstreamer.rtsp.RTSPTime2.getMemoryLayout().withName("min2"),
        org.gstreamer.rtsp.RTSPTime2.getMemoryLayout().withName("max2")
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
     * Allocate a new {@link RTSPTimeRange}
     * @return A new, uninitialized @{link RTSPTimeRange}
     */
    public static RTSPTimeRange allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPTimeRange newInstance = new RTSPTimeRange(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code unit}
     * @return The value of the field {@code unit}
     */
    public org.gstreamer.rtsp.RTSPRangeUnit unit$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unit"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.rtsp.RTSPRangeUnit.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code unit}
     * @param unit The new value of the field {@code unit}
     */
    public void unit$set(org.gstreamer.rtsp.RTSPRangeUnit unit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unit"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), unit.getValue());
    }
    
    /**
     * Get the value of the field {@code min}
     * @return The value of the field {@code min}
     */
    public org.gstreamer.rtsp.RTSPTime min$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("min"));
        return new org.gstreamer.rtsp.RTSPTime(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code max}
     * @return The value of the field {@code max}
     */
    public org.gstreamer.rtsp.RTSPTime max$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("max"));
        return new org.gstreamer.rtsp.RTSPTime(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code min2}
     * @return The value of the field {@code min2}
     */
    public org.gstreamer.rtsp.RTSPTime2 min2$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("min2"));
        return new org.gstreamer.rtsp.RTSPTime2(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code max2}
     * @return The value of the field {@code max2}
     */
    public org.gstreamer.rtsp.RTSPTime2 max2$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("max2"));
        return new org.gstreamer.rtsp.RTSPTime2(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a RTSPTimeRange proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTSPTimeRange(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTSPTimeRange struct;
        
         /**
         * A {@link RTSPTimeRange.Build} object constructs a {@link RTSPTimeRange} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTSPTimeRange.allocate();
        }
        
         /**
         * Finish building the {@link RTSPTimeRange} struct.
         * @return A new instance of {@code RTSPTimeRange} with the fields 
         *         that were set in the Build object.
         */
        public RTSPTimeRange construct() {
            return struct;
        }
        
        /**
         * the time units used
         * @param unit The value for the {@code unit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUnit(org.gstreamer.rtsp.RTSPRangeUnit unit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unit == null ? MemoryAddress.NULL : unit.getValue()));
            return this;
        }
        
        /**
         * the minimum interval
         * @param min The value for the {@code min} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMin(org.gstreamer.rtsp.RTSPTime min) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (min == null ? MemoryAddress.NULL : min.handle()));
            return this;
        }
        
        /**
         * the maximum interval
         * @param max The value for the {@code max} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMax(org.gstreamer.rtsp.RTSPTime max) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (max == null ? MemoryAddress.NULL : max.handle()));
            return this;
        }
        
        /**
         * extra fields in the minimum interval (Since: 1.2)
         * @param min2 The value for the {@code min2} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMin2(org.gstreamer.rtsp.RTSPTime2 min2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (min2 == null ? MemoryAddress.NULL : min2.handle()));
            return this;
        }
        
        /**
         * extra fields in the maximum interval (Since: 1.2)
         * @param max2 The value for the {@code max2} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMax2(org.gstreamer.rtsp.RTSPTime2 max2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (max2 == null ? MemoryAddress.NULL : max2.handle()));
            return this;
        }
    }
}

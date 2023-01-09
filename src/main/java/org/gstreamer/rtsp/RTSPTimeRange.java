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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("unit"),
            MemoryLayout.paddingLayout(32),
            org.gstreamer.rtsp.RTSPTime.getMemoryLayout().withName("min"),
            org.gstreamer.rtsp.RTSPTime.getMemoryLayout().withName("max"),
            org.gstreamer.rtsp.RTSPTime2.getMemoryLayout().withName("min2"),
            org.gstreamer.rtsp.RTSPTime2.getMemoryLayout().withName("max2")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTSPTimeRange}
     * @return A new, uninitialized @{link RTSPTimeRange}
     */
    public static RTSPTimeRange allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RTSPTimeRange newInstance = new RTSPTimeRange(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code unit}
     * @return The value of the field {@code unit}
     */
    public org.gstreamer.rtsp.RTSPRangeUnit getUnit() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unit"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.rtsp.RTSPRangeUnit.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code unit}
     * @param unit The new value of the field {@code unit}
     */
    public void setUnit(org.gstreamer.rtsp.RTSPRangeUnit unit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unit"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unit == null ? MemoryAddress.NULL : unit.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code min}
     * @return The value of the field {@code min}
     */
    public org.gstreamer.rtsp.RTSPTime getMin() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("min"));
        return org.gstreamer.rtsp.RTSPTime.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code min}
     * @param min The new value of the field {@code min}
     */
    public void setMin(org.gstreamer.rtsp.RTSPTime min) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (min == null ? MemoryAddress.NULL : min.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code max}
     * @return The value of the field {@code max}
     */
    public org.gstreamer.rtsp.RTSPTime getMax() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("max"));
        return org.gstreamer.rtsp.RTSPTime.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code max}
     * @param max The new value of the field {@code max}
     */
    public void setMax(org.gstreamer.rtsp.RTSPTime max) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (max == null ? MemoryAddress.NULL : max.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code min2}
     * @return The value of the field {@code min2}
     */
    public org.gstreamer.rtsp.RTSPTime2 getMin2() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("min2"));
        return org.gstreamer.rtsp.RTSPTime2.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code min2}
     * @param min2 The new value of the field {@code min2}
     */
    public void setMin2(org.gstreamer.rtsp.RTSPTime2 min2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (min2 == null ? MemoryAddress.NULL : min2.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code max2}
     * @return The value of the field {@code max2}
     */
    public org.gstreamer.rtsp.RTSPTime2 getMax2() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("max2"));
        return org.gstreamer.rtsp.RTSPTime2.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code max2}
     * @param max2 The new value of the field {@code max2}
     */
    public void setMax2(org.gstreamer.rtsp.RTSPTime2 max2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (max2 == null ? MemoryAddress.NULL : max2.handle()));
        }
    }
    
    /**
     * Create a RTSPTimeRange proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTSPTimeRange(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPTimeRange> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTSPTimeRange(input);
    
    /**
     * A {@link RTSPTimeRange.Builder} object constructs a {@link RTSPTimeRange} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTSPTimeRange.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTSPTimeRange struct;
        
        private Builder() {
            struct = RTSPTimeRange.allocate();
        }
        
        /**
         * Finish building the {@link RTSPTimeRange} struct.
         * @return A new instance of {@code RTSPTimeRange} with the fields 
         *         that were set in the Builder object.
         */
        public RTSPTimeRange build() {
            return struct;
        }
        
        /**
         * the time units used
         * @param unit The value for the {@code unit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnit(org.gstreamer.rtsp.RTSPRangeUnit unit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unit"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unit == null ? MemoryAddress.NULL : unit.getValue()));
                return this;
            }
        }
        
        /**
         * the minimum interval
         * @param min The value for the {@code min} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMin(org.gstreamer.rtsp.RTSPTime min) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("min"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (min == null ? MemoryAddress.NULL : min.handle()));
                return this;
            }
        }
        
        /**
         * the maximum interval
         * @param max The value for the {@code max} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMax(org.gstreamer.rtsp.RTSPTime max) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("max"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (max == null ? MemoryAddress.NULL : max.handle()));
                return this;
            }
        }
        
        /**
         * extra fields in the minimum interval (Since: 1.2)
         * @param min2 The value for the {@code min2} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMin2(org.gstreamer.rtsp.RTSPTime2 min2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("min2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (min2 == null ? MemoryAddress.NULL : min2.handle()));
                return this;
            }
        }
        
        /**
         * extra fields in the maximum interval (Since: 1.2)
         * @param max2 The value for the {@code max2} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMax2(org.gstreamer.rtsp.RTSPTime2 max2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("max2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (max2 == null ? MemoryAddress.NULL : max2.handle()));
                return this;
            }
        }
    }
}

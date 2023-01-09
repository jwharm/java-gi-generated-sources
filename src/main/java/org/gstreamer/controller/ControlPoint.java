package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An internal structure for value+time and various temporary
 * values used for interpolation. This "inherits" from
 * GstTimedValue.
 */
public class ControlPoint extends Struct {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstControlPoint";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("timestamp"),
            Interop.valueLayout.C_DOUBLE.withName("value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ControlPoint}
     * @return A new, uninitialized @{link ControlPoint}
     */
    public static ControlPoint allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ControlPoint newInstance = new ControlPoint(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code timestamp}
     * @return The value of the field {@code timestamp}
     */
    public org.gstreamer.gst.ClockTime getTimestamp() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.gst.ClockTime(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code timestamp}
     * @param timestamp The new value of the field {@code timestamp}
     */
    public void setTimestamp(org.gstreamer.gst.ClockTime timestamp) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (timestamp == null ? MemoryAddress.NULL : timestamp.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public double getValue() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(double value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), value);
        }
    }
    
    /**
     * Create a ControlPoint proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ControlPoint(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ControlPoint> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ControlPoint(input);
    
    /**
     * Copies a {@link ControlPoint}
     * @return A copy of {@code cp}
     */
    public org.gstreamer.controller.ControlPoint copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_control_point_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.controller.ControlPoint.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees all data allocated by a {@link ControlPoint} instance.
     */
    public void free() {
        try {
            DowncallHandles.gst_control_point_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_control_point_copy = Interop.downcallHandle(
                "gst_control_point_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_control_point_free = Interop.downcallHandle(
                "gst_control_point_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link ControlPoint.Builder} object constructs a {@link ControlPoint} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ControlPoint.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ControlPoint struct;
        
        private Builder() {
            struct = ControlPoint.allocate();
        }
        
        /**
         * Finish building the {@link ControlPoint} struct.
         * @return A new instance of {@code ControlPoint} with the fields 
         *         that were set in the Builder object.
         */
        public ControlPoint build() {
            return struct;
        }
        
        /**
         * timestamp of the value change
         * @param timestamp The value for the {@code timestamp} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimestamp(org.gstreamer.gst.ClockTime timestamp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (timestamp == null ? MemoryAddress.NULL : timestamp.getValue().longValue()));
                return this;
            }
        }
        
        /**
         * the new value
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(double value) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), value);
                return this;
            }
        }
    }
}

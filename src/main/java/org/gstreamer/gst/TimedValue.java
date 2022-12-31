package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure for storing a timestamp and a value.
 */
public class TimedValue extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTimedValue";
    
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
     * Allocate a new {@link TimedValue}
     * @return A new, uninitialized @{link TimedValue}
     */
    public static TimedValue allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TimedValue newInstance = new TimedValue(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code timestamp}
     * @return The value of the field {@code timestamp}
     */
    public org.gstreamer.gst.ClockTime getTimestamp() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Change the value of the field {@code timestamp}
     * @param timestamp The new value of the field {@code timestamp}
     */
    public void setTimestamp(org.gstreamer.gst.ClockTime timestamp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (timestamp == null ? MemoryAddress.NULL : timestamp.getValue().longValue()));
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public double getValue() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(double value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
    }
    
    /**
     * Create a TimedValue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TimedValue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TimedValue> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TimedValue(input, ownership);
    
    /**
     * A {@link TimedValue.Builder} object constructs a {@link TimedValue} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TimedValue.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TimedValue struct;
        
        private Builder() {
            struct = TimedValue.allocate();
        }
        
         /**
         * Finish building the {@link TimedValue} struct.
         * @return A new instance of {@code TimedValue} with the fields 
         *         that were set in the Builder object.
         */
        public TimedValue build() {
            return struct;
        }
        
        /**
         * timestamp of the value change
         * @param timestamp The value for the {@code timestamp} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimestamp(org.gstreamer.gst.ClockTime timestamp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (timestamp == null ? MemoryAddress.NULL : timestamp.getValue().longValue()));
            return this;
        }
        
        /**
         * the corresponding value
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(double value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
            return this;
        }
    }
}

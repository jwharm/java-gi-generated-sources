package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkTimeCoord} stores a single event in a motion history.
 * <p>
 * To check whether an axis is present, check whether the corresponding
 * flag from the {@code Gdk.AxisFlags} enumeration is set in the {@code flags}
 * To access individual axis values, use the values of the values of
 * the {@code Gdk.AxisUse} enumerations as indices.
 */
public class TimeCoord extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkTimeCoord";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("time"),
            Interop.valueLayout.C_INT.withName("flags"),
            MemoryLayout.sequenceLayout(12, Interop.valueLayout.C_DOUBLE).withName("axes")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TimeCoord}
     * @return A new, uninitialized @{link TimeCoord}
     */
    public static TimeCoord allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TimeCoord newInstance = new TimeCoord(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code time}
     * @return The value of the field {@code time}
     */
    public int getTime() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code time}
     * @param time The new value of the field {@code time}
     */
    public void setTime(int time) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), time);
        }
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gtk.gdk.AxisFlags getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.gdk.AxisFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gtk.gdk.AxisFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code axes}
     * @return The value of the field {@code axes}
     */
    public double[] getAxes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("axes"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 12, SCOPE).toArray(Interop.valueLayout.C_DOUBLE);
        }
    }
    
    /**
     * Change the value of the field {@code axes}
     * @param axes The new value of the field {@code axes}
     */
    public void setAxes(double[] axes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("axes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (axes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(axes, false, SCOPE)));
        }
    }
    
    /**
     * Create a TimeCoord proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TimeCoord(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TimeCoord> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TimeCoord(input);
    
    /**
     * A {@link TimeCoord.Builder} object constructs a {@link TimeCoord} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TimeCoord.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TimeCoord struct;
        
        private Builder() {
            struct = TimeCoord.allocate();
        }
        
        /**
         * Finish building the {@link TimeCoord} struct.
         * @return A new instance of {@code TimeCoord} with the fields 
         *         that were set in the Builder object.
         */
        public TimeCoord build() {
            return struct;
        }
        
        /**
         * The timestamp for this event
         * @param time The value for the {@code time} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTime(int time) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("time"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), time);
                return this;
            }
        }
        
        /**
         * Flags indicating what axes are present, see {@code Gdk.AxisFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gtk.gdk.AxisFlags flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
                return this;
            }
        }
        
        /**
         * axis values, indexed by {@code Gdk.AxisUse}
         * @param axes The value for the {@code axes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAxes(double[] axes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("axes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (axes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(axes, false, SCOPE)));
                return this;
            }
        }
    }
}

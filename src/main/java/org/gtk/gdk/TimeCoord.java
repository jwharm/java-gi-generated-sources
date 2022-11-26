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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("time"),
        Interop.valueLayout.C_INT.withName("flags"),
        MemoryLayout.sequenceLayout(12, Interop.valueLayout.C_DOUBLE).withName("axes")
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
     * Allocate a new {@link TimeCoord}
     * @return A new, uninitialized @{link TimeCoord}
     */
    public static TimeCoord allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TimeCoord newInstance = new TimeCoord(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code time}
     * @return The value of the field {@code time}
     */
    public int time$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code time}
     * @param time The new value of the field {@code time}
     */
    public void time$set(int time) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), time);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gtk.gdk.AxisFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gdk.AxisFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gtk.gdk.AxisFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Create a TimeCoord proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TimeCoord(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TimeCoord struct;
        
         /**
         * A {@link TimeCoord.Build} object constructs a {@link TimeCoord} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TimeCoord.allocate();
        }
        
         /**
         * Finish building the {@link TimeCoord} struct.
         * @return A new instance of {@code TimeCoord} with the fields 
         *         that were set in the Build object.
         */
        public TimeCoord construct() {
            return struct;
        }
        
        /**
         * The timestamp for this event
         * @param time The value for the {@code time} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTime(int time) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), time);
            return this;
        }
        
        /**
         * Flags indicating what axes are present, see {@code Gdk.AxisFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gtk.gdk.AxisFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * axis values, indexed by {@code Gdk.AxisUse}
         * @param axes The value for the {@code axes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAxes(double[] axes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("axes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (axes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(axes, false)));
            return this;
        }
    }
}

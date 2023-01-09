package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GStreamer core provides a GstSystemClock based on the system time.
 * Asynchronous callbacks are scheduled from an internal thread.
 * <p>
 * Clock implementors are encouraged to subclass this systemclock as it
 * implements the async notification.
 * <p>
 * Subclasses can however override all of the important methods for sync and
 * async notifications to implement their own callback methods or blocking
 * wait operations.
 */
public class SystemClock extends org.gstreamer.gst.Clock {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSystemClock";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Clock.getMemoryLayout().withName("clock"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a SystemClock proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SystemClock(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SystemClock> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SystemClock(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_system_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Get a handle to the default system clock. The refcount of the
     * clock will be increased so you need to unref the clock after
     * usage.
     * @return the default clock.
     * <p>
     * MT safe.
     */
    public static org.gstreamer.gst.Clock obtain() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_system_clock_obtain.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Clock) Interop.register(RESULT, org.gstreamer.gst.Clock.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Sets the default system clock that can be obtained with
     * gst_system_clock_obtain().
     * <p>
     * This is mostly used for testing and debugging purposes when you
     * want to have control over the time reported by the default system
     * clock.
     * <p>
     * MT safe.
     * @param newClock a {@link Clock}
     */
    public static void setDefault(@Nullable org.gstreamer.gst.Clock newClock) {
        try {
            DowncallHandles.gst_system_clock_set_default.invokeExact((Addressable) (newClock == null ? MemoryAddress.NULL : newClock.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link SystemClock.Builder} object constructs a {@link SystemClock} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SystemClock.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Clock.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SystemClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SystemClock}.
         * @return A new instance of {@code SystemClock} with the properties 
         *         that were set in the Builder object.
         */
        public SystemClock build() {
            return (SystemClock) org.gtk.gobject.GObject.newWithProperties(
                SystemClock.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setClockType(org.gstreamer.gst.ClockType clockType) {
            names.add("clock-type");
            values.add(org.gtk.gobject.Value.create(clockType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_system_clock_get_type = Interop.downcallHandle(
                "gst_system_clock_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_system_clock_obtain = Interop.downcallHandle(
                "gst_system_clock_obtain",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_system_clock_set_default = Interop.downcallHandle(
                "gst_system_clock_set_default",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_system_clock_get_type != null;
    }
}

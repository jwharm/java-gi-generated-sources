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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Clock.getMemoryLayout().withName("clock"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a SystemClock proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SystemClock(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SystemClock if its GType is a (or inherits from) "GstSystemClock".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SystemClock} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstSystemClock", a ClassCastException will be thrown.
     */
    public static SystemClock castFrom(org.gtk.gobject.Object gobject) {
            return new SystemClock(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.gstreamer.gst.Clock obtain() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_system_clock_obtain.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Clock(RESULT, Ownership.FULL);
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
            DowncallHandles.gst_system_clock_set_default.invokeExact(
                    (Addressable) (newClock == null ? MemoryAddress.NULL : newClock.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Clock.Build {
        
         /**
         * A {@link SystemClock.Build} object constructs a {@link SystemClock} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SystemClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SystemClock} using {@link SystemClock#castFrom}.
         * @return A new instance of {@code SystemClock} with the properties 
         *         that were set in the Build object.
         */
        public SystemClock construct() {
            return SystemClock.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SystemClock.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setClockType(org.gstreamer.gst.ClockType clockType) {
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
}

package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkDevice} object represents an input device, such
 * as a keyboard, a mouse, or a touchpad.
 * <p>
 * See the {@link Seat} documentation for more information
 * about the various kinds of devices, and their relationships.
 */
public class Device extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Device(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Device */
    public static Device castFrom(org.gtk.gobject.Object gobject) {
        return new Device(gobject.refcounted());
    }
    
    /**
     * Retrieves whether the Caps Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     * @return {@code true} if Caps Lock is on for {@code device}
     */
    public boolean getCapsLockState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_caps_lock_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the current tool for {@code device}.
     * @return the {@code GdkDeviceTool}
     */
    public @Nullable org.gtk.gdk.DeviceTool getDeviceTool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_device_tool.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DeviceTool(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the direction of effective layout of the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     * <p>
     * The direction of a layout is the direction of the majority
     * of its symbols. See {@link org.pango.Pango#unicharDirection}.
     * @return {@link org.pango.Direction#LTR} or {@link org.pango.Direction#RTL}
     *   if it can determine the direction. {@link org.pango.Direction#NEUTRAL}
     *   otherwise
     */
    public @NotNull org.pango.Direction getDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_direction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Direction(RESULT);
    }
    
    /**
     * Returns the {@code GdkDisplay} to which {@code device} pertains.
     * @return a {@code GdkDisplay}
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Determines whether the pointer follows device motion.
     * <p>
     * This is not meaningful for keyboard devices, which
     * don't have a pointer.
     * @return {@code true} if the pointer follows device motion
     */
    public boolean getHasCursor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_has_cursor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the current modifier state of the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     * @return the current modifier state
     */
    public @NotNull org.gtk.gdk.ModifierType getModifierState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_modifier_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    /**
     * The name of the device, suitable for showing in a user interface.
     * @return a name
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves whether the Num Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     * @return {@code true} if Num Lock is on for {@code device}
     */
    public boolean getNumLockState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_num_lock_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the number of touch points associated to {@code device}.
     * @return the number of touch points
     */
    public int getNumTouches() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_num_touches.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the product ID of this device.
     * <p>
     * This ID is retrieved from the device, and does not change.
     * See {@link Device#getVendorId} for more information.
     * @return the product ID
     */
    public @Nullable java.lang.String getProductId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_product_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves whether the Scroll Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     * @return {@code true} if Scroll Lock is on for {@code device}
     */
    public boolean getScrollLockState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_scroll_lock_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code GdkSeat} the device belongs to.
     * @return a {@code GdkSeat}
     */
    public @NotNull org.gtk.gdk.Seat getSeat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_seat.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Seat(Refcounted.get(RESULT, false));
    }
    
    /**
     * Determines the type of the device.
     * @return a {@code GdkInputSource}
     */
    public @NotNull org.gtk.gdk.InputSource getSource() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.InputSource(RESULT);
    }
    
    /**
     * Obtains the surface underneath {@code device}, returning the location of the
     * device in {@code win_x} and {@code win_y}.
     * <p>
     * Returns {@code null} if the surface tree under {@code device} is not known to GDK
     * (for example, belongs to another application).
     * @param winX return location for the X coordinate
     *   of the device location relative to the surface origin
     * @param winY return location for the Y coordinate
     *   of the device location relative to the surface origin
     * @return the {@code GdkSurface} under the
     *   device position
     */
    public @Nullable org.gtk.gdk.Surface getSurfaceAtPosition(Out<Double> winX, Out<Double> winY) {
        java.util.Objects.requireNonNull(winX, "Parameter 'winX' must not be null");
        java.util.Objects.requireNonNull(winY, "Parameter 'winY' must not be null");
        MemorySegment winXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment winYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_surface_at_position.invokeExact(handle(), (Addressable) winXPOINTER.address(), (Addressable) winYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        winX.set(winXPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        winY.set(winYPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return new org.gtk.gdk.Surface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the timestamp of the last activity for this device.
     * <p>
     * In practice, this means the timestamp of the last event that was
     * received from the OS for this device. (GTK may occasionally produce
     * events for a device that are not received from the OS, and will not
     * update the timestamp).
     * @return the timestamp of the last activity for this device
     */
    public int getTimestamp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_timestamp.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the vendor ID of this device.
     * <p>
     * This ID is retrieved from the device, and does not change.
     * <p>
     * This function, together with {@link Device#getProductId},
     * can be used to eg. compose {@code GSettings} paths to store settings
     * for this device.
     * <pre>{@code c
     *  static GSettings *
     *  get_device_settings (GdkDevice *device)
     *  {
     *    const char *vendor, *product;
     *    GSettings *settings;
     *    GdkDevice *device;
     *    char *path;
     * 
     *    vendor = gdk_device_get_vendor_id (device);
     *    product = gdk_device_get_product_id (device);
     * 
     *    path = g_strdup_printf ("/org/example/app/devices/%s:%s/", vendor, product);
     *    settings = g_settings_new_with_path (DEVICE_SCHEMA, path);
     *    g_free (path);
     * 
     *    return settings;
     *  }
     * }</pre>
     * @return the vendor ID
     */
    public @Nullable java.lang.String getVendorId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_vendor_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines if layouts for both right-to-left and
     * left-to-right languages are in use on the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     * @return {@code true} if there are layouts with both directions, {@code false} otherwise
     */
    public boolean hasBidiLayouts() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_has_bidi_layouts.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(Device source);
    }
    
    /**
     * Emitted either when the number of either axes or keys changes.
     * <p>
     * On X11 this will normally happen when the physical device
     * routing events through the logical device changes (for
     * example, user switches from the USB mouse to a tablet); in
     * that case the logical device will change to reflect the axes
     * and keys on the new physical device.
     */
    public Signal<Device.Changed> onChanged(Device.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Device.Callbacks.class, "signalDeviceChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Device.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolChanged {
        void signalReceived(Device source, @NotNull org.gtk.gdk.DeviceTool tool);
    }
    
    /**
     * Emitted on pen/eraser devices whenever tools enter or leave proximity.
     */
    public Signal<Device.ToolChanged> onToolChanged(Device.ToolChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tool-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Device.Callbacks.class, "signalDeviceToolChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Device.ToolChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_device_get_caps_lock_state = Interop.downcallHandle(
            "gdk_device_get_caps_lock_state",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_device_tool = Interop.downcallHandle(
            "gdk_device_get_device_tool",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_direction = Interop.downcallHandle(
            "gdk_device_get_direction",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_display = Interop.downcallHandle(
            "gdk_device_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_has_cursor = Interop.downcallHandle(
            "gdk_device_get_has_cursor",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_modifier_state = Interop.downcallHandle(
            "gdk_device_get_modifier_state",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_name = Interop.downcallHandle(
            "gdk_device_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_num_lock_state = Interop.downcallHandle(
            "gdk_device_get_num_lock_state",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_num_touches = Interop.downcallHandle(
            "gdk_device_get_num_touches",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_product_id = Interop.downcallHandle(
            "gdk_device_get_product_id",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_scroll_lock_state = Interop.downcallHandle(
            "gdk_device_get_scroll_lock_state",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_seat = Interop.downcallHandle(
            "gdk_device_get_seat",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_source = Interop.downcallHandle(
            "gdk_device_get_source",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_surface_at_position = Interop.downcallHandle(
            "gdk_device_get_surface_at_position",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_timestamp = Interop.downcallHandle(
            "gdk_device_get_timestamp",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_get_vendor_id = Interop.downcallHandle(
            "gdk_device_get_vendor_id",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_has_bidi_layouts = Interop.downcallHandle(
            "gdk_device_has_bidi_layouts",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalDeviceChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Device.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Device(Refcounted.get(source)));
        }
        
        public static void signalDeviceToolChanged(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Device.ToolChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Device(Refcounted.get(source)), new org.gtk.gdk.DeviceTool(Refcounted.get(tool, false)));
        }
    }
}

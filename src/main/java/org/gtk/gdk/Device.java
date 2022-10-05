package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkDevice} object represents an input device, such
 * as a keyboard, a mouse, or a touchpad.
 * <p>
 * See the {@link Seat} documentation for more information
 * about the various kinds of devices, and their relationships.
 */
public class Device extends org.gtk.gobject.Object {

    public Device(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Device */
    public static Device castFrom(org.gtk.gobject.Object gobject) {
        return new Device(gobject.refcounted());
    }
    
    static final MethodHandle gdk_device_get_caps_lock_state = Interop.downcallHandle(
        "gdk_device_get_caps_lock_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the Caps Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public boolean getCapsLockState() {
        try {
            var RESULT = (int) gdk_device_get_caps_lock_state.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_device_tool = Interop.downcallHandle(
        "gdk_device_get_device_tool",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the current tool for {@code device}.
     */
    public DeviceTool getDeviceTool() {
        try {
            var RESULT = (MemoryAddress) gdk_device_get_device_tool.invokeExact(handle());
            return new DeviceTool(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_direction = Interop.downcallHandle(
        "gdk_device_get_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the direction of effective layout of the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     * <p>
     * The direction of a layout is the direction of the majority
     * of its symbols. See {@link Pango#unicharDirection}.
     */
    public org.pango.Direction getDirection() {
        try {
            var RESULT = (int) gdk_device_get_direction.invokeExact(handle());
            return new org.pango.Direction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_display = Interop.downcallHandle(
        "gdk_device_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkDisplay} to which {@code device} pertains.
     */
    public Display getDisplay() {
        try {
            var RESULT = (MemoryAddress) gdk_device_get_display.invokeExact(handle());
            return new Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_has_cursor = Interop.downcallHandle(
        "gdk_device_get_has_cursor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines whether the pointer follows device motion.
     * <p>
     * This is not meaningful for keyboard devices, which
     * don't have a pointer.
     */
    public boolean getHasCursor() {
        try {
            var RESULT = (int) gdk_device_get_has_cursor.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_modifier_state = Interop.downcallHandle(
        "gdk_device_get_modifier_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the current modifier state of the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public ModifierType getModifierState() {
        try {
            var RESULT = (int) gdk_device_get_modifier_state.invokeExact(handle());
            return new ModifierType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_name = Interop.downcallHandle(
        "gdk_device_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * The name of the device, suitable for showing in a user interface.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) gdk_device_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_num_lock_state = Interop.downcallHandle(
        "gdk_device_get_num_lock_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the Num Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public boolean getNumLockState() {
        try {
            var RESULT = (int) gdk_device_get_num_lock_state.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_num_touches = Interop.downcallHandle(
        "gdk_device_get_num_touches",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of touch points associated to {@code device}.
     */
    public int getNumTouches() {
        try {
            var RESULT = (int) gdk_device_get_num_touches.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_product_id = Interop.downcallHandle(
        "gdk_device_get_product_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the product ID of this device.
     * <p>
     * This ID is retrieved from the device, and does not change.
     * See {@link Device#getVendorId} for more information.
     */
    public java.lang.String getProductId() {
        try {
            var RESULT = (MemoryAddress) gdk_device_get_product_id.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_scroll_lock_state = Interop.downcallHandle(
        "gdk_device_get_scroll_lock_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the Scroll Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public boolean getScrollLockState() {
        try {
            var RESULT = (int) gdk_device_get_scroll_lock_state.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_seat = Interop.downcallHandle(
        "gdk_device_get_seat",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkSeat} the device belongs to.
     */
    public Seat getSeat() {
        try {
            var RESULT = (MemoryAddress) gdk_device_get_seat.invokeExact(handle());
            return new Seat(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_source = Interop.downcallHandle(
        "gdk_device_get_source",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines the type of the device.
     */
    public InputSource getSource() {
        try {
            var RESULT = (int) gdk_device_get_source.invokeExact(handle());
            return new InputSource(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_surface_at_position = Interop.downcallHandle(
        "gdk_device_get_surface_at_position",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the surface underneath {@code device}, returning the location of the
     * device in {@code win_x} and {@code win_y}.
     * <p>
     * Returns {@code null} if the surface tree under {@code device} is not known to GDK
     * (for example, belongs to another application).
     */
    public Surface getSurfaceAtPosition(PointerDouble winX, PointerDouble winY) {
        try {
            var RESULT = (MemoryAddress) gdk_device_get_surface_at_position.invokeExact(handle(), winX.handle(), winY.handle());
            return new Surface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_timestamp = Interop.downcallHandle(
        "gdk_device_get_timestamp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the timestamp of the last activity for this device.
     * <p>
     * In practice, this means the timestamp of the last event that was
     * received from the OS for this device. (GTK may occasionally produce
     * events for a device that are not received from the OS, and will not
     * update the timestamp).
     */
    public int getTimestamp() {
        try {
            var RESULT = (int) gdk_device_get_timestamp.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_get_vendor_id = Interop.downcallHandle(
        "gdk_device_get_vendor_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the vendor ID of this device.
     * <p>
     * This ID is retrieved from the device, and does not change.
     * <p>
     * This function, together with {@link Device#getProductId},
     * can be used to eg. compose {@code GSettings} paths to store settings
     * for this device.
     * <p>
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
     */
    public java.lang.String getVendorId() {
        try {
            var RESULT = (MemoryAddress) gdk_device_get_vendor_id.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_has_bidi_layouts = Interop.downcallHandle(
        "gdk_device_has_bidi_layouts",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines if layouts for both right-to-left and
     * left-to-right languages are in use on the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public boolean hasBidiLayouts() {
        try {
            var RESULT = (int) gdk_device_has_bidi_layouts.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
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
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Device.Callbacks.class, "signalDeviceChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolChangedHandler {
        void signalReceived(Device source, DeviceTool tool);
    }
    
    /**
     * Emitted on pen/eraser devices whenever tools enter or leave proximity.
     */
    public SignalHandle onToolChanged(ToolChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tool-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Device.Callbacks.class, "signalDeviceToolChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDeviceChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Device.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Device(Refcounted.get(source)));
        }
        
        public static void signalDeviceToolChanged(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Device.ToolChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Device(Refcounted.get(source)), new DeviceTool(Refcounted.get(tool, false)));
        }
        
    }
}
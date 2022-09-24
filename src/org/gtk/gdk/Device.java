package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public Device(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Device */
    public static Device castFrom(org.gtk.gobject.Object gobject) {
        return new Device(gobject.getReference());
    }
    
    /**
     * Retrieves whether the Caps Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public boolean getCapsLockState() {
        var RESULT = gtk_h.gdk_device_get_caps_lock_state(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the current tool for {@code device}.
     */
    public DeviceTool getDeviceTool() {
        var RESULT = gtk_h.gdk_device_get_device_tool(handle());
        return new DeviceTool(References.get(RESULT, false));
    }
    
    /**
     * Returns the direction of effective layout of the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     * <p>
     * The direction of a layout is the direction of the majority
     * of its symbols. See {@link Pango#unicharDirection}.
     */
    public org.pango.Direction getDirection() {
        var RESULT = gtk_h.gdk_device_get_direction(handle());
        return org.pango.Direction.fromValue(RESULT);
    }
    
    /**
     * Returns the {@code GdkDisplay} to which {@code device} pertains.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_device_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Determines whether the pointer follows device motion.
     * <p>
     * This is not meaningful for keyboard devices, which
     * don't have a pointer.
     */
    public boolean getHasCursor() {
        var RESULT = gtk_h.gdk_device_get_has_cursor(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the current modifier state of the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public int getModifierState() {
        var RESULT = gtk_h.gdk_device_get_modifier_state(handle());
        return RESULT;
    }
    
    /**
     * The name of the device, suitable for showing in a user interface.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gdk_device_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves whether the Num Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public boolean getNumLockState() {
        var RESULT = gtk_h.gdk_device_get_num_lock_state(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the number of touch points associated to {@code device}.
     */
    public int getNumTouches() {
        var RESULT = gtk_h.gdk_device_get_num_touches(handle());
        return RESULT;
    }
    
    /**
     * Returns the product ID of this device.
     * <p>
     * This ID is retrieved from the device, and does not change.
     * See {@link Device#getVendorId} for more information.
     */
    public java.lang.String getProductId() {
        var RESULT = gtk_h.gdk_device_get_product_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves whether the Scroll Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public boolean getScrollLockState() {
        var RESULT = gtk_h.gdk_device_get_scroll_lock_state(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the {@code GdkSeat} the device belongs to.
     */
    public Seat getSeat() {
        var RESULT = gtk_h.gdk_device_get_seat(handle());
        return new Seat(References.get(RESULT, false));
    }
    
    /**
     * Determines the type of the device.
     */
    public InputSource getSource() {
        var RESULT = gtk_h.gdk_device_get_source(handle());
        return InputSource.fromValue(RESULT);
    }
    
    /**
     * Returns the timestamp of the last activity for this device.
     * <p>
     * In practice, this means the timestamp of the last event that was
     * received from the OS for this device. (GTK may occasionally produce
     * events for a device that are not received from the OS, and will not
     * update the timestamp).
     */
    public int getTimestamp() {
        var RESULT = gtk_h.gdk_device_get_timestamp(handle());
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
        var RESULT = gtk_h.gdk_device_get_vendor_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines if layouts for both right-to-left and
     * left-to-right languages are in use on the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     */
    public boolean hasBidiLayouts() {
        var RESULT = gtk_h.gdk_device_has_bidi_layouts(handle());
        return (RESULT != 0);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Device.class, "__signalDeviceChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDeviceChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Device.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Device(References.get(source)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("tool-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Device.class, "__signalDeviceToolChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDeviceToolChanged(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Device.ToolChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Device(References.get(source)), new DeviceTool(References.get(tool, false)));
    }
    
}

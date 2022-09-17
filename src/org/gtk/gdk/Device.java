package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GdkDevice</code> object represents an input device, such
 * as a keyboard, a mouse, or a touchpad.
 * 
 * See the {@link org.gtk.gdk.Seat} documentation for more information
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
     * 
     * This is only relevant for keyboard devices.
     */
    public boolean getCapsLockState() {
        var RESULT = gtk_h.gdk_device_get_caps_lock_state(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the current tool for @device.
     */
    public DeviceTool getDeviceTool() {
        var RESULT = gtk_h.gdk_device_get_device_tool(handle());
        return new DeviceTool(References.get(RESULT, false));
    }
    
    /**
     * Returns the direction of effective layout of the keyboard.
     * 
     * This is only relevant for keyboard devices.
     * 
     * The direction of a layout is the direction of the majority
     * of its symbols. See {@link Pango#unicharDirection}.
     */
    public org.pango.Direction getDirection() {
        var RESULT = gtk_h.gdk_device_get_direction(handle());
        return org.pango.Direction.fromValue(RESULT);
    }
    
    /**
     * Returns the <code>GdkDisplay</code> to which @device pertains.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_device_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Determines whether the pointer follows device motion.
     * 
     * This is not meaningful for keyboard devices, which
     * don&#39;t have a pointer.
     */
    public boolean getHasCursor() {
        var RESULT = gtk_h.gdk_device_get_has_cursor(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the current modifier state of the keyboard.
     * 
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
     * 
     * This is only relevant for keyboard devices.
     */
    public boolean getNumLockState() {
        var RESULT = gtk_h.gdk_device_get_num_lock_state(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the number of touch points associated to @device.
     */
    public int getNumTouches() {
        var RESULT = gtk_h.gdk_device_get_num_touches(handle());
        return RESULT;
    }
    
    /**
     * Returns the product ID of this device.
     * 
     * This ID is retrieved from the device, and does not change.
     * See {@link org.gtk.gdk.Device#getVendorId} for more information.
     */
    public java.lang.String getProductId() {
        var RESULT = gtk_h.gdk_device_get_product_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves whether the Scroll Lock modifier of the keyboard is locked.
     * 
     * This is only relevant for keyboard devices.
     */
    public boolean getScrollLockState() {
        var RESULT = gtk_h.gdk_device_get_scroll_lock_state(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the <code>GdkSeat</code> the device belongs to.
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
     * 
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
     * This function, together with {@link org.gtk.gdk.Device#getProductId},
     * can be used to eg. compose <code>GSettings</code> paths to store settings
     * for this device.
     * <p><pre>c
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
     *    path = g_strdup_printf (&#34;/org/example/app/devices/<code>s:%s/&#34;,</code> vendor, product);
     *    settings = g_settings_new_with_path (DEVICE_SCHEMA, path);
     *    g_free (path);
     * 
     *    return settings;
     *  }
     * </pre>
     */
    public java.lang.String getVendorId() {
        var RESULT = gtk_h.gdk_device_get_vendor_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines if layouts for both right-to-left and
     * left-to-right languages are in use on the keyboard.
     * 
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
     * 
     * On X11 this will normally happen when the physical device
     * routing events through the logical device changes (for
     * example, user switches from the USB mouse to a tablet); in
     * that case the logical device will change to reflect the axes
     * and keys on the new physical device.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDeviceChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDeviceToolChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("tool-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

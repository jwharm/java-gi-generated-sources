package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkDevice` object represents an input device, such
 * as a keyboard, a mouse, or a touchpad.
 * 
 * See the [class@Gdk.Seat] documentation for more information
 * about the various kinds of devices, and their relationships.
 */
public class Device extends org.gtk.gobject.Object {

    public Device(io.github.jwharm.javagi.interop.Reference reference) {
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_caps_lock_state(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the current tool for @device.
     */
    public DeviceTool getDeviceTool() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_device_tool(HANDLE());
        return new DeviceTool(References.get(RESULT, false));
    }
    
    /**
     * Returns the direction of effective layout of the keyboard.
     * 
     * This is only relevant for keyboard devices.
     * 
     * The direction of a layout is the direction of the majority
     * of its symbols. See [func@Pango.unichar_direction].
     */
    public org.pango.Direction getDirection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_direction(HANDLE());
        return org.pango.Direction.fromValue(RESULT);
    }
    
    /**
     * Returns the `GdkDisplay` to which @device pertains.
     */
    public Display getDisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_display(HANDLE());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Determines whether the pointer follows device motion.
     * 
     * This is not meaningful for keyboard devices, which
     * don't have a pointer.
     */
    public boolean getHasCursor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_has_cursor(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the current modifier state of the keyboard.
     * 
     * This is only relevant for keyboard devices.
     */
    public int getModifierState() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_modifier_state(HANDLE());
        return RESULT;
    }
    
    /**
     * The name of the device, suitable for showing in a user interface.
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves whether the Num Lock modifier of the keyboard is locked.
     * 
     * This is only relevant for keyboard devices.
     */
    public boolean getNumLockState() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_num_lock_state(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the number of touch points associated to @device.
     */
    public int getNumTouches() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_num_touches(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the product ID of this device.
     * 
     * This ID is retrieved from the device, and does not change.
     * See [method@Gdk.Device.get_vendor_id] for more information.
     */
    public java.lang.String getProductId() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_product_id(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves whether the Scroll Lock modifier of the keyboard is locked.
     * 
     * This is only relevant for keyboard devices.
     */
    public boolean getScrollLockState() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_scroll_lock_state(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the `GdkSeat` the device belongs to.
     */
    public Seat getSeat() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_seat(HANDLE());
        return new Seat(References.get(RESULT, false));
    }
    
    /**
     * Determines the type of the device.
     */
    public InputSource getSource() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_source(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_timestamp(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the vendor ID of this device.
     * 
     * This ID is retrieved from the device, and does not change.
     * 
     * This function, together with [method@Gdk.Device.get_product_id],
     * can be used to eg. compose `GSettings` paths to store settings
     * for this device.
     * 
     * ```c
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
     * ```
     */
    public java.lang.String getVendorId() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_get_vendor_id(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines if layouts for both right-to-left and
     * left-to-right languages are in use on the keyboard.
     * 
     * This is only relevant for keyboard devices.
     */
    public boolean hasBidiLayouts() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_device_has_bidi_layouts(HANDLE());
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
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDeviceChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onToolChanged(ToolChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDeviceToolChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("tool-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

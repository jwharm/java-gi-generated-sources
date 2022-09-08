package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GdkMonitor` objects represent the individual outputs that are
 * associated with a `GdkDisplay`.
 * 
 * `GdkDisplay` keeps a `GListModel` to enumerate and monitor
 * monitors with [method@Gdk.Display.get_monitors]. You can use
 * [method@Gdk.Display.get_monitor_at_surface] to find a particular
 * monitor.
 */
public class Monitor extends org.gtk.gobject.Object {

    public Monitor(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Monitor */
    public static Monitor castFrom(org.gtk.gobject.Object gobject) {
        return new Monitor(gobject.getReference());
    }
    
    /**
     * Gets the name of the monitor's connector, if available.
     */
    public java.lang.String getConnector() {
        var RESULT = gtk_h.gdk_monitor_get_connector(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the display that this monitor belongs to.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_monitor_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the size and position of the monitor within the
     * display coordinate space.
     * 
     * The returned geometry is in  ”application pixels”, not in
     * ”device pixels” (see [method@Gdk.Monitor.get_scale_factor]).
     */
    public void getGeometry(Rectangle geometry) {
        gtk_h.gdk_monitor_get_geometry(handle(), geometry.handle());
    }
    
    /**
     * Gets the height in millimeters of the monitor.
     */
    public int getHeightMm() {
        var RESULT = gtk_h.gdk_monitor_get_height_mm(handle());
        return RESULT;
    }
    
    /**
     * Gets the name or PNP ID of the monitor's manufacturer.
     * 
     * Note that this value might also vary depending on actual
     * display backend.
     * 
     * The PNP ID registry is located at
     * [https://uefi.org/pnp_id_list](https://uefi.org/pnp_id_list).
     */
    public java.lang.String getManufacturer() {
        var RESULT = gtk_h.gdk_monitor_get_manufacturer(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the string identifying the monitor model, if available.
     */
    public java.lang.String getModel() {
        var RESULT = gtk_h.gdk_monitor_get_model(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the refresh rate of the monitor, if available.
     * 
     * The value is in milli-Hertz, so a refresh rate of 60Hz
     * is returned as 60000.
     */
    public int getRefreshRate() {
        var RESULT = gtk_h.gdk_monitor_get_refresh_rate(handle());
        return RESULT;
    }
    
    /**
     * Gets the internal scale factor that maps from monitor coordinates
     * to device pixels.
     * 
     * On traditional systems this is 1, but on very high density outputs
     * it can be a higher value (often 2).
     * 
     * This can be used if you want to create pixel based data for a
     * particular monitor, but most of the time you’re drawing to a surface
     * where it is better to use [method@Gdk.Surface.get_scale_factor] instead.
     */
    public int getScaleFactor() {
        var RESULT = gtk_h.gdk_monitor_get_scale_factor(handle());
        return RESULT;
    }
    
    /**
     * Gets information about the layout of red, green and blue
     * primaries for pixels.
     */
    public SubpixelLayout getSubpixelLayout() {
        var RESULT = gtk_h.gdk_monitor_get_subpixel_layout(handle());
        return SubpixelLayout.fromValue(RESULT);
    }
    
    /**
     * Gets the width in millimeters of the monitor.
     */
    public int getWidthMm() {
        var RESULT = gtk_h.gdk_monitor_get_width_mm(handle());
        return RESULT;
    }
    
    /**
     * Returns %TRUE if the @monitor object corresponds to a
     * physical monitor.
     * 
     * The @monitor becomes invalid when the physical monitor
     * is unplugged or removed.
     */
    public boolean isValid() {
        var RESULT = gtk_h.gdk_monitor_is_valid(handle());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface InvalidateHandler {
        void signalReceived(Monitor source);
    }
    
    /**
     * Emitted when the output represented by @monitor gets disconnected.
     */
    public void onInvalidate(InvalidateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMonitorInvalidate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("invalidate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

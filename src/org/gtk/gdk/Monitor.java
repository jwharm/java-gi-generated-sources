package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GdkMonitor} objects represent the individual outputs that are
 * associated with a {@code GdkDisplay}.
 * <p>
 * {@code GdkDisplay} keeps a {@code GListModel} to enumerate and monitor
 * monitors with {@link Display#getMonitors}. You can use
 * {@link Display#getMonitorAtSurface} to find a particular
 * monitor.
 */
public class Monitor extends org.gtk.gobject.Object {

    public Monitor(io.github.jwharm.javagi.Reference reference) {
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
     * <p>
     * The returned geometry is in  ”application pixels”, not in
     * ”device pixels” (see {@link Monitor#getScaleFactor}).
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
     * <p>
     * Note that this value might also vary depending on actual
     * display backend.
     * <p>
     * The PNP ID registry is located at
     * <a href="https://uefi.org/pnp_id_list">https://uefi.org/pnp_id_list</a>.
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
     * <p>
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
     * <p>
     * On traditional systems this is 1, but on very high density outputs
     * it can be a higher value (often 2).
     * <p>
     * This can be used if you want to create pixel based data for a
     * particular monitor, but most of the time you’re drawing to a surface
     * where it is better to use {@link Surface#getScaleFactor} instead.
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
        return new SubpixelLayout(RESULT);
    }
    
    /**
     * Gets the width in millimeters of the monitor.
     */
    public int getWidthMm() {
        var RESULT = gtk_h.gdk_monitor_get_width_mm(handle());
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the {@code monitor} object corresponds to a
     * physical monitor.
     * <p>
     * The {@code monitor} becomes invalid when the physical monitor
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
     * Emitted when the output represented by {@code monitor} gets disconnected.
     */
    public SignalHandle onInvalidate(InvalidateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("invalidate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Monitor.class, "__signalMonitorInvalidate",
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
    
    public static void __signalMonitorInvalidate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Monitor.InvalidateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Monitor(References.get(source)));
    }
    
}

package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GdkMonitor</code> objects represent the individual outputs that are
 * associated with a <code>GdkDisplay</code>.
 * <p><code>GdkDisplay</code> keeps a <code>GListModel</code> to enumerate and monitor
 * monitors with {@link org.gtk.gdk.Display<code>#getMonitors</code> . You can use
 * {@link org.gtk.gdk.Display<code>#getMonitorAtSurface</code>  to find a particular
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
     * Gets the name of the monitor&<code>#39</code> s connector, if available.
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
     * The returned geometry is in  &<code>#8221</code> application pixels&<code>#8221</code> , not in
     * &<code>#8221</code> device pixels&<code>#8221</code>  (see {@link org.gtk.gdk.Monitor<code>#getScaleFactor</code> ).
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
     * Gets the name or PNP ID of the monitor&<code>#39</code> s manufacturer.
     * 
     * Note that this value might also vary depending on actual
     * display backend.
     * 
     * The PNP ID registry is located at
     * {@link [https://uefi.org/pnp_id_list]}(https://uefi.org/pnp_id_list).
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
     * particular monitor, but most of the time you&<code>#8217</code> re drawing to a surface
     * where it is better to use {@link org.gtk.gdk.Surface<code>#getScaleFactor</code>  instead.
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
     * Returns <code>true</code> if the @monitor object corresponds to a
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
    public SignalHandle onInvalidate(InvalidateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMonitorInvalidate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("invalidate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

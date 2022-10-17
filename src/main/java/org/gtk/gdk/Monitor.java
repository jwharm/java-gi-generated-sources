package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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

    public Monitor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Monitor */
    public static Monitor castFrom(org.gtk.gobject.Object gobject) {
        return new Monitor(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_monitor_get_connector = Interop.downcallHandle(
        "gdk_monitor_get_connector",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the monitor's connector, if available.
     */
    public @Nullable java.lang.String getConnector() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_monitor_get_connector.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gdk_monitor_get_display = Interop.downcallHandle(
        "gdk_monitor_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the display that this monitor belongs to.
     */
    public @NotNull Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_monitor_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Display(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_monitor_get_geometry = Interop.downcallHandle(
        "gdk_monitor_get_geometry",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size and position of the monitor within the
     * display coordinate space.
     * <p>
     * The returned geometry is in  ”application pixels”, not in
     * ”device pixels” (see {@link Monitor#getScaleFactor}).
     */
    public @NotNull void getGeometry(@NotNull Out<Rectangle> geometry) {
        MemorySegment geometryPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gdk_monitor_get_geometry.invokeExact(handle(), (Addressable) geometryPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        geometry.set(new Rectangle(Refcounted.get(geometryPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gdk_monitor_get_height_mm = Interop.downcallHandle(
        "gdk_monitor_get_height_mm",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the height in millimeters of the monitor.
     */
    public int getHeightMm() {
        int RESULT;
        try {
            RESULT = (int) gdk_monitor_get_height_mm.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_monitor_get_manufacturer = Interop.downcallHandle(
        "gdk_monitor_get_manufacturer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name or PNP ID of the monitor's manufacturer.
     * <p>
     * Note that this value might also vary depending on actual
     * display backend.
     * <p>
     * The PNP ID registry is located at
     * <a href="https://uefi.org/pnp_id_list">https://uefi.org/pnp_id_list</a>.
     */
    public @Nullable java.lang.String getManufacturer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_monitor_get_manufacturer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gdk_monitor_get_model = Interop.downcallHandle(
        "gdk_monitor_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the string identifying the monitor model, if available.
     */
    public @Nullable java.lang.String getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_monitor_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gdk_monitor_get_refresh_rate = Interop.downcallHandle(
        "gdk_monitor_get_refresh_rate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the refresh rate of the monitor, if available.
     * <p>
     * The value is in milli-Hertz, so a refresh rate of 60Hz
     * is returned as 60000.
     */
    public int getRefreshRate() {
        int RESULT;
        try {
            RESULT = (int) gdk_monitor_get_refresh_rate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_monitor_get_scale_factor = Interop.downcallHandle(
        "gdk_monitor_get_scale_factor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        int RESULT;
        try {
            RESULT = (int) gdk_monitor_get_scale_factor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_monitor_get_subpixel_layout = Interop.downcallHandle(
        "gdk_monitor_get_subpixel_layout",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets information about the layout of red, green and blue
     * primaries for pixels.
     */
    public @NotNull SubpixelLayout getSubpixelLayout() {
        int RESULT;
        try {
            RESULT = (int) gdk_monitor_get_subpixel_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SubpixelLayout(RESULT);
    }
    
    private static final MethodHandle gdk_monitor_get_width_mm = Interop.downcallHandle(
        "gdk_monitor_get_width_mm",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the width in millimeters of the monitor.
     */
    public int getWidthMm() {
        int RESULT;
        try {
            RESULT = (int) gdk_monitor_get_width_mm.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_monitor_is_valid = Interop.downcallHandle(
        "gdk_monitor_is_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the {@code monitor} object corresponds to a
     * physical monitor.
     * <p>
     * The {@code monitor} becomes invalid when the physical monitor
     * is unplugged or removed.
     */
    public boolean isValid() {
        int RESULT;
        try {
            RESULT = (int) gdk_monitor_is_valid.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("invalidate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Monitor.Callbacks.class, "signalMonitorInvalidate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalMonitorInvalidate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Monitor.InvalidateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Monitor(Refcounted.get(source)));
        }
        
    }
}

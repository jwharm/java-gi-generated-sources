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
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkMonitor";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public Monitor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Monitor if its GType is a (or inherits from) "GdkMonitor".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Monitor" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkMonitor", a ClassCastException will be thrown.
     */
    public static Monitor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkMonitor"))) {
            return new Monitor(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkMonitor");
        }
    }
    
    /**
     * Gets the name of the monitor's connector, if available.
     * @return the name of the connector
     */
    public @Nullable java.lang.String getConnector() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_monitor_get_connector.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the display that this monitor belongs to.
     * @return the display
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_monitor_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the size and position of the monitor within the
     * display coordinate space.
     * <p>
     * The returned geometry is in  ”application pixels”, not in
     * ”device pixels” (see {@link Monitor#getScaleFactor}).
     * @param geometry a {@code GdkRectangle} to be filled with the monitor geometry
     */
    public void getGeometry(@NotNull org.gtk.gdk.Rectangle geometry) {
        java.util.Objects.requireNonNull(geometry, "Parameter 'geometry' must not be null");
        try {
            DowncallHandles.gdk_monitor_get_geometry.invokeExact(
                    handle(),
                    geometry.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the height in millimeters of the monitor.
     * @return the physical height of the monitor
     */
    public int getHeightMm() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_monitor_get_height_mm.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the name of the manufacturer
     */
    public @Nullable java.lang.String getManufacturer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_monitor_get_manufacturer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the string identifying the monitor model, if available.
     * @return the monitor model
     */
    public @Nullable java.lang.String getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_monitor_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the refresh rate of the monitor, if available.
     * <p>
     * The value is in milli-Hertz, so a refresh rate of 60Hz
     * is returned as 60000.
     * @return the refresh rate in milli-Hertz, or 0
     */
    public int getRefreshRate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_monitor_get_refresh_rate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the scale factor
     */
    public int getScaleFactor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_monitor_get_scale_factor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets information about the layout of red, green and blue
     * primaries for pixels.
     * @return the subpixel layout
     */
    public @NotNull org.gtk.gdk.SubpixelLayout getSubpixelLayout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_monitor_get_subpixel_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.SubpixelLayout(RESULT);
    }
    
    /**
     * Gets the width in millimeters of the monitor.
     * @return the physical width of the monitor
     */
    public int getWidthMm() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_monitor_get_width_mm.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the {@code monitor} object corresponds to a
     * physical monitor.
     * <p>
     * The {@code monitor} becomes invalid when the physical monitor
     * is unplugged or removed.
     * @return {@code true} if the object corresponds to a physical monitor
     */
    public boolean isValid() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_monitor_is_valid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface Invalidate {
        void signalReceived(Monitor source);
    }
    
    /**
     * Emitted when the output represented by {@code monitor} gets disconnected.
     */
    public Signal<Monitor.Invalidate> onInvalidate(Monitor.Invalidate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("invalidate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Monitor.Callbacks.class, "signalMonitorInvalidate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Monitor.Invalidate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_monitor_get_connector = Interop.downcallHandle(
            "gdk_monitor_get_connector",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_get_display = Interop.downcallHandle(
            "gdk_monitor_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_get_geometry = Interop.downcallHandle(
            "gdk_monitor_get_geometry",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_get_height_mm = Interop.downcallHandle(
            "gdk_monitor_get_height_mm",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_get_manufacturer = Interop.downcallHandle(
            "gdk_monitor_get_manufacturer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_get_model = Interop.downcallHandle(
            "gdk_monitor_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_get_refresh_rate = Interop.downcallHandle(
            "gdk_monitor_get_refresh_rate",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_get_scale_factor = Interop.downcallHandle(
            "gdk_monitor_get_scale_factor",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_get_subpixel_layout = Interop.downcallHandle(
            "gdk_monitor_get_subpixel_layout",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_get_width_mm = Interop.downcallHandle(
            "gdk_monitor_get_width_mm",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_monitor_is_valid = Interop.downcallHandle(
            "gdk_monitor_is_valid",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalMonitorInvalidate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Monitor.Invalidate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Monitor(Refcounted.get(source)));
        }
    }
}

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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Monitor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Monitor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Monitor if its GType is a (or inherits from) "GdkMonitor".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Monitor} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkMonitor", a ClassCastException will be thrown.
     */
    public static Monitor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Monitor.getType())) {
            return new Monitor(gobject.handle(), gobject.yieldOwnership());
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
        return new org.gtk.gdk.Display(RESULT, Ownership.NONE);
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
        return org.gtk.gdk.SubpixelLayout.of(RESULT);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Invalidate {
        void signalReceived(Monitor sourceMonitor);
    }
    
    /**
     * Emitted when the output represented by {@code monitor} gets disconnected.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Monitor.Invalidate> onInvalidate(Monitor.Invalidate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("invalidate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Monitor.Callbacks.class, "signalMonitorInvalidate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Monitor.Invalidate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Monitor.Build} object constructs a {@link Monitor} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Monitor} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Monitor} using {@link Monitor#castFrom}.
         * @return A new instance of {@code Monitor} with the properties 
         *         that were set in the Build object.
         */
        public Monitor construct() {
            return Monitor.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Monitor.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The connector name.
         * @param connector The value for the {@code connector} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setConnector(java.lang.String connector) {
            names.add("connector");
            values.add(org.gtk.gobject.Value.create(connector));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} of the monitor.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * The geometry of the monitor.
         * @param geometry The value for the {@code geometry} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGeometry(org.gtk.gdk.Rectangle geometry) {
            names.add("geometry");
            values.add(org.gtk.gobject.Value.create(geometry));
            return this;
        }
        
        /**
         * The height of the monitor, in millimeters.
         * @param heightMm The value for the {@code height-mm} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHeightMm(int heightMm) {
            names.add("height-mm");
            values.add(org.gtk.gobject.Value.create(heightMm));
            return this;
        }
        
        /**
         * The manufacturer name.
         * @param manufacturer The value for the {@code manufacturer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setManufacturer(java.lang.String manufacturer) {
            names.add("manufacturer");
            values.add(org.gtk.gobject.Value.create(manufacturer));
            return this;
        }
        
        /**
         * The model name.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModel(java.lang.String model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The refresh rate, in milli-Hertz.
         * @param refreshRate The value for the {@code refresh-rate} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRefreshRate(int refreshRate) {
            names.add("refresh-rate");
            values.add(org.gtk.gobject.Value.create(refreshRate));
            return this;
        }
        
        /**
         * The scale factor.
         * @param scaleFactor The value for the {@code scale-factor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScaleFactor(int scaleFactor) {
            names.add("scale-factor");
            values.add(org.gtk.gobject.Value.create(scaleFactor));
            return this;
        }
        
        /**
         * The subpixel layout.
         * @param subpixelLayout The value for the {@code subpixel-layout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSubpixelLayout(org.gtk.gdk.SubpixelLayout subpixelLayout) {
            names.add("subpixel-layout");
            values.add(org.gtk.gobject.Value.create(subpixelLayout));
            return this;
        }
        
        /**
         * Whether the object is still valid.
         * @param valid The value for the {@code valid} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValid(boolean valid) {
            names.add("valid");
            values.add(org.gtk.gobject.Value.create(valid));
            return this;
        }
        
        /**
         * The width of the monitor, in millimeters.
         * @param widthMm The value for the {@code width-mm} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWidthMm(int widthMm) {
            names.add("width-mm");
            values.add(org.gtk.gobject.Value.create(widthMm));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_monitor_get_connector = Interop.downcallHandle(
            "gdk_monitor_get_connector",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_display = Interop.downcallHandle(
            "gdk_monitor_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_geometry = Interop.downcallHandle(
            "gdk_monitor_get_geometry",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_height_mm = Interop.downcallHandle(
            "gdk_monitor_get_height_mm",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_manufacturer = Interop.downcallHandle(
            "gdk_monitor_get_manufacturer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_model = Interop.downcallHandle(
            "gdk_monitor_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_refresh_rate = Interop.downcallHandle(
            "gdk_monitor_get_refresh_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_scale_factor = Interop.downcallHandle(
            "gdk_monitor_get_scale_factor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_subpixel_layout = Interop.downcallHandle(
            "gdk_monitor_get_subpixel_layout",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_width_mm = Interop.downcallHandle(
            "gdk_monitor_get_width_mm",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_is_valid = Interop.downcallHandle(
            "gdk_monitor_is_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_monitor_get_type = Interop.downcallHandle(
            "gdk_monitor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalMonitorInvalidate(MemoryAddress sourceMonitor, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Monitor.Invalidate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Monitor(sourceMonitor, Ownership.NONE));
        }
    }
}

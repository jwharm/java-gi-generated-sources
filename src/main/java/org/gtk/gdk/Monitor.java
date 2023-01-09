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
public class Monitor extends org.gtk.gobject.GObject {
    
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
     */
    protected Monitor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Monitor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Monitor(input);
    
    /**
     * Gets the name of the monitor's connector, if available.
     * @return the name of the connector
     */
    public @Nullable java.lang.String getConnector() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_monitor_get_connector.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the display that this monitor belongs to.
     * @return the display
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_monitor_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the size and position of the monitor within the
     * display coordinate space.
     * <p>
     * The returned geometry is in  ”application pixels”, not in
     * ”device pixels” (see {@link Monitor#getScaleFactor}).
     * @param geometry a {@code GdkRectangle} to be filled with the monitor geometry
     */
    public void getGeometry(org.gtk.gdk.Rectangle geometry) {
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
            RESULT = (int) DowncallHandles.gdk_monitor_get_height_mm.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_monitor_get_manufacturer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the string identifying the monitor model, if available.
     * @return the monitor model
     */
    public @Nullable java.lang.String getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_monitor_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.gdk_monitor_get_refresh_rate.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gdk_monitor_get_scale_factor.invokeExact(handle());
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
    public org.gtk.gdk.SubpixelLayout getSubpixelLayout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_monitor_get_subpixel_layout.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gdk_monitor_get_width_mm.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gdk_monitor_is_valid.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Invalidate} callback.
     */
    @FunctionalInterface
    public interface Invalidate {
    
        /**
         * Emitted when the output represented by {@code monitor} gets disconnected.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceMonitor) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Invalidate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the output represented by {@code monitor} gets disconnected.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Monitor.Invalidate> onInvalidate(Monitor.Invalidate handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("invalidate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Monitor.Builder} object constructs a {@link Monitor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Monitor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Monitor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Monitor}.
         * @return A new instance of {@code Monitor} with the properties 
         *         that were set in the Builder object.
         */
        public Monitor build() {
            return (Monitor) org.gtk.gobject.GObject.newWithProperties(
                Monitor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The connector name.
         * @param connector The value for the {@code connector} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConnector(java.lang.String connector) {
            names.add("connector");
            values.add(org.gtk.gobject.Value.create(connector));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} of the monitor.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * The geometry of the monitor.
         * @param geometry The value for the {@code geometry} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGeometry(org.gtk.gdk.Rectangle geometry) {
            names.add("geometry");
            values.add(org.gtk.gobject.Value.create(geometry));
            return this;
        }
        
        /**
         * The height of the monitor, in millimeters.
         * @param heightMm The value for the {@code height-mm} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeightMm(int heightMm) {
            names.add("height-mm");
            values.add(org.gtk.gobject.Value.create(heightMm));
            return this;
        }
        
        /**
         * The manufacturer name.
         * @param manufacturer The value for the {@code manufacturer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setManufacturer(java.lang.String manufacturer) {
            names.add("manufacturer");
            values.add(org.gtk.gobject.Value.create(manufacturer));
            return this;
        }
        
        /**
         * The model name.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(java.lang.String model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The refresh rate, in milli-Hertz.
         * @param refreshRate The value for the {@code refresh-rate} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRefreshRate(int refreshRate) {
            names.add("refresh-rate");
            values.add(org.gtk.gobject.Value.create(refreshRate));
            return this;
        }
        
        /**
         * The scale factor.
         * @param scaleFactor The value for the {@code scale-factor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScaleFactor(int scaleFactor) {
            names.add("scale-factor");
            values.add(org.gtk.gobject.Value.create(scaleFactor));
            return this;
        }
        
        /**
         * The subpixel layout.
         * @param subpixelLayout The value for the {@code subpixel-layout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSubpixelLayout(org.gtk.gdk.SubpixelLayout subpixelLayout) {
            names.add("subpixel-layout");
            values.add(org.gtk.gobject.Value.create(subpixelLayout));
            return this;
        }
        
        /**
         * Whether the object is still valid.
         * @param valid The value for the {@code valid} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValid(boolean valid) {
            names.add("valid");
            values.add(org.gtk.gobject.Value.create(valid));
            return this;
        }
        
        /**
         * The width of the monitor, in millimeters.
         * @param widthMm The value for the {@code width-mm} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidthMm(int widthMm) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_monitor_get_type != null;
    }
}

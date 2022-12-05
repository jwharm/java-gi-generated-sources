package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkDevice} object represents an input device, such
 * as a keyboard, a mouse, or a touchpad.
 * <p>
 * See the {@link Seat} documentation for more information
 * about the various kinds of devices, and their relationships.
 */
public class Device extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDevice";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Device proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Device(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Device if its GType is a (or inherits from) "GdkDevice".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Device} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkDevice", a ClassCastException will be thrown.
     */
    public static Device castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Device.getType())) {
            return new Device(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkDevice");
        }
    }
    
    /**
     * Retrieves whether the Caps Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     * @return {@code true} if Caps Lock is on for {@code device}
     */
    public boolean getCapsLockState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_caps_lock_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the current tool for {@code device}.
     * @return the {@code GdkDeviceTool}
     */
    public @Nullable org.gtk.gdk.DeviceTool getDeviceTool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_device_tool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DeviceTool(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the direction of effective layout of the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     * <p>
     * The direction of a layout is the direction of the majority
     * of its symbols. See {@link org.pango.Pango#unicharDirection}.
     * @return {@link org.pango.Direction#LTR} or {@link org.pango.Direction#RTL}
     *   if it can determine the direction. {@link org.pango.Direction#NEUTRAL}
     *   otherwise
     */
    public @NotNull org.pango.Direction getDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_direction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Direction.of(RESULT);
    }
    
    /**
     * Returns the {@code GdkDisplay} to which {@code device} pertains.
     * @return a {@code GdkDisplay}
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(RESULT, Ownership.NONE);
    }
    
    /**
     * Determines whether the pointer follows device motion.
     * <p>
     * This is not meaningful for keyboard devices, which
     * don't have a pointer.
     * @return {@code true} if the pointer follows device motion
     */
    public boolean getHasCursor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_has_cursor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the current modifier state of the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     * @return the current modifier state
     */
    public @NotNull org.gtk.gdk.ModifierType getModifierState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_modifier_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    /**
     * The name of the device, suitable for showing in a user interface.
     * @return a name
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves whether the Num Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     * @return {@code true} if Num Lock is on for {@code device}
     */
    public boolean getNumLockState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_num_lock_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the number of touch points associated to {@code device}.
     * @return the number of touch points
     */
    public int getNumTouches() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_num_touches.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the product ID of this device.
     * <p>
     * This ID is retrieved from the device, and does not change.
     * See {@link Device#getVendorId} for more information.
     * @return the product ID
     */
    public @Nullable java.lang.String getProductId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_product_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves whether the Scroll Lock modifier of the keyboard is locked.
     * <p>
     * This is only relevant for keyboard devices.
     * @return {@code true} if Scroll Lock is on for {@code device}
     */
    public boolean getScrollLockState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_scroll_lock_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code GdkSeat} the device belongs to.
     * @return a {@code GdkSeat}
     */
    public @NotNull org.gtk.gdk.Seat getSeat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_seat.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Seat(RESULT, Ownership.NONE);
    }
    
    /**
     * Determines the type of the device.
     * @return a {@code GdkInputSource}
     */
    public @NotNull org.gtk.gdk.InputSource getSource() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_source.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.InputSource.of(RESULT);
    }
    
    /**
     * Obtains the surface underneath {@code device}, returning the location of the
     * device in {@code win_x} and {@code win_y}.
     * <p>
     * Returns {@code null} if the surface tree under {@code device} is not known to GDK
     * (for example, belongs to another application).
     * @param winX return location for the X coordinate
     *   of the device location relative to the surface origin
     * @param winY return location for the Y coordinate
     *   of the device location relative to the surface origin
     * @return the {@code GdkSurface} under the
     *   device position
     */
    public @Nullable org.gtk.gdk.Surface getSurfaceAtPosition(Out<Double> winX, Out<Double> winY) {
        java.util.Objects.requireNonNull(winX, "Parameter 'winX' must not be null");
        MemorySegment winXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(winY, "Parameter 'winY' must not be null");
        MemorySegment winYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_surface_at_position.invokeExact(
                    handle(),
                    (Addressable) winXPOINTER.address(),
                    (Addressable) winYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        winX.set(winXPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        winY.set(winYPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return new org.gtk.gdk.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the timestamp of the last activity for this device.
     * <p>
     * In practice, this means the timestamp of the last event that was
     * received from the OS for this device. (GTK may occasionally produce
     * events for a device that are not received from the OS, and will not
     * update the timestamp).
     * @return the timestamp of the last activity for this device
     */
    public int getTimestamp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_get_timestamp.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the vendor ID
     */
    public @Nullable java.lang.String getVendorId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_vendor_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Determines if layouts for both right-to-left and
     * left-to-right languages are in use on the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     * @return {@code true} if there are layouts with both directions, {@code false} otherwise
     */
    public boolean hasBidiLayouts() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_has_bidi_layouts.invokeExact(
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
            RESULT = (long) DowncallHandles.gdk_device_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(Device sourceDevice);
    }
    
    /**
     * Emitted either when the number of either axes or keys changes.
     * <p>
     * On X11 this will normally happen when the physical device
     * routing events through the logical device changes (for
     * example, user switches from the USB mouse to a tablet); in
     * that case the logical device will change to reflect the axes
     * and keys on the new physical device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Device.Changed> onChanged(Device.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Device.Callbacks.class, "signalDeviceChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Device.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolChanged {
        void signalReceived(Device sourceDevice, @NotNull org.gtk.gdk.DeviceTool tool);
    }
    
    /**
     * Emitted on pen/eraser devices whenever tools enter or leave proximity.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Device.ToolChanged> onToolChanged(Device.ToolChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tool-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Device.Callbacks.class, "signalDeviceToolChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Device.ToolChanged>(handle(), RESULT);
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
         * A {@link Device.Build} object constructs a {@link Device} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Device} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Device} using {@link Device#castFrom}.
         * @return A new instance of {@code Device} with the properties 
         *         that were set in the Build object.
         */
        public Device construct() {
            return Device.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Device.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether Caps Lock is on.
         * <p>
         * This is only relevant for keyboard devices.
         * @param capsLockState The value for the {@code caps-lock-state} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCapsLockState(boolean capsLockState) {
            names.add("caps-lock-state");
            values.add(org.gtk.gobject.Value.create(capsLockState));
            return this;
        }
        
        /**
         * The direction of the current layout.
         * <p>
         * This is only relevant for keyboard devices.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDirection(org.pango.Direction direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} the {@code GdkDevice} pertains to.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * Whether the device has both right-to-left and left-to-right layouts.
         * <p>
         * This is only relevant for keyboard devices.
         * @param hasBidiLayouts The value for the {@code has-bidi-layouts} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHasBidiLayouts(boolean hasBidiLayouts) {
            names.add("has-bidi-layouts");
            values.add(org.gtk.gobject.Value.create(hasBidiLayouts));
            return this;
        }
        
        /**
         * Whether the device is represented by a cursor on the screen.
         * @param hasCursor The value for the {@code has-cursor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHasCursor(boolean hasCursor) {
            names.add("has-cursor");
            values.add(org.gtk.gobject.Value.create(hasCursor));
            return this;
        }
        
        /**
         * The current modifier state of the device.
         * <p>
         * This is only relevant for keyboard devices.
         * @param modifierState The value for the {@code modifier-state} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModifierState(org.gtk.gdk.ModifierType modifierState) {
            names.add("modifier-state");
            values.add(org.gtk.gobject.Value.create(modifierState));
            return this;
        }
        
        /**
         * Number of axes in the device.
         * @param nAxes The value for the {@code n-axes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNAxes(int nAxes) {
            names.add("n-axes");
            values.add(org.gtk.gobject.Value.create(nAxes));
            return this;
        }
        
        /**
         * The device name.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * Whether Num Lock is on.
         * <p>
         * This is only relevant for keyboard devices.
         * @param numLockState The value for the {@code num-lock-state} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNumLockState(boolean numLockState) {
            names.add("num-lock-state");
            values.add(org.gtk.gobject.Value.create(numLockState));
            return this;
        }
        
        /**
         * The maximal number of concurrent touches on a touch device.
         * <p>
         * Will be 0 if the device is not a touch device or if the number
         * of touches is unknown.
         * @param numTouches The value for the {@code num-touches} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNumTouches(int numTouches) {
            names.add("num-touches");
            values.add(org.gtk.gobject.Value.create(numTouches));
            return this;
        }
        
        /**
         * Product ID of this device.
         * <p>
         * See {@link Device#getProductId}.
         * @param productId The value for the {@code product-id} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProductId(java.lang.String productId) {
            names.add("product-id");
            values.add(org.gtk.gobject.Value.create(productId));
            return this;
        }
        
        /**
         * Whether Scroll Lock is on.
         * <p>
         * This is only relevant for keyboard devices.
         * @param scrollLockState The value for the {@code scroll-lock-state} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScrollLockState(boolean scrollLockState) {
            names.add("scroll-lock-state");
            values.add(org.gtk.gobject.Value.create(scrollLockState));
            return this;
        }
        
        /**
         * {@code GdkSeat} of this device.
         * @param seat The value for the {@code seat} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSeat(org.gtk.gdk.Seat seat) {
            names.add("seat");
            values.add(org.gtk.gobject.Value.create(seat));
            return this;
        }
        
        /**
         * Source type for the device.
         * @param source The value for the {@code source} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSource(org.gtk.gdk.InputSource source) {
            names.add("source");
            values.add(org.gtk.gobject.Value.create(source));
            return this;
        }
        
        /**
         * The {@code GdkDeviceTool} that is currently used with this device.
         * @param tool The value for the {@code tool} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTool(org.gtk.gdk.DeviceTool tool) {
            names.add("tool");
            values.add(org.gtk.gobject.Value.create(tool));
            return this;
        }
        
        /**
         * Vendor ID of this device.
         * <p>
         * See {@link Device#getVendorId}.
         * @param vendorId The value for the {@code vendor-id} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVendorId(java.lang.String vendorId) {
            names.add("vendor-id");
            values.add(org.gtk.gobject.Value.create(vendorId));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_device_get_caps_lock_state = Interop.downcallHandle(
            "gdk_device_get_caps_lock_state",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_device_tool = Interop.downcallHandle(
            "gdk_device_get_device_tool",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_direction = Interop.downcallHandle(
            "gdk_device_get_direction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_display = Interop.downcallHandle(
            "gdk_device_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_has_cursor = Interop.downcallHandle(
            "gdk_device_get_has_cursor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_modifier_state = Interop.downcallHandle(
            "gdk_device_get_modifier_state",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_name = Interop.downcallHandle(
            "gdk_device_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_num_lock_state = Interop.downcallHandle(
            "gdk_device_get_num_lock_state",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_num_touches = Interop.downcallHandle(
            "gdk_device_get_num_touches",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_product_id = Interop.downcallHandle(
            "gdk_device_get_product_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_scroll_lock_state = Interop.downcallHandle(
            "gdk_device_get_scroll_lock_state",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_seat = Interop.downcallHandle(
            "gdk_device_get_seat",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_source = Interop.downcallHandle(
            "gdk_device_get_source",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_surface_at_position = Interop.downcallHandle(
            "gdk_device_get_surface_at_position",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_timestamp = Interop.downcallHandle(
            "gdk_device_get_timestamp",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_vendor_id = Interop.downcallHandle(
            "gdk_device_get_vendor_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_has_bidi_layouts = Interop.downcallHandle(
            "gdk_device_has_bidi_layouts",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_get_type = Interop.downcallHandle(
            "gdk_device_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalDeviceChanged(MemoryAddress sourceDevice, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Device.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Device(sourceDevice, Ownership.NONE));
        }
        
        public static void signalDeviceToolChanged(MemoryAddress sourceDevice, MemoryAddress tool, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Device.ToolChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Device(sourceDevice, Ownership.NONE), new org.gtk.gdk.DeviceTool(tool, Ownership.NONE));
        }
    }
}

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
public class Device extends org.gtk.gobject.GObject {
    
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
    protected Device(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Device> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Device(input, ownership);
    
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return (org.gtk.gdk.DeviceTool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.DeviceTool.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public org.pango.Direction getDirection() {
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
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Display.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the current modifier state of the keyboard.
     * <p>
     * This is only relevant for keyboard devices.
     * @return the current modifier state
     */
    public org.gtk.gdk.ModifierType getModifierState() {
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
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the {@code GdkSeat} the device belongs to.
     * @return a {@code GdkSeat}
     */
    public org.gtk.gdk.Seat getSeat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_seat.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Seat) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Seat.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Determines the type of the device.
     * @return a {@code GdkInputSource}
     */
    public org.gtk.gdk.InputSource getSource() {
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
        MemorySegment winXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment winYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_device_get_surface_at_position.invokeExact(
                    handle(),
                    (Addressable) (winX == null ? MemoryAddress.NULL : (Addressable) winXPOINTER.address()),
                    (Addressable) (winY == null ? MemoryAddress.NULL : (Addressable) winYPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (winX != null) winX.set(winXPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        if (winY != null) winY.set(winYPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return (org.gtk.gdk.Surface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Surface.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDevice) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Changed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolChanged {
        void run(org.gtk.gdk.DeviceTool tool);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDevice, MemoryAddress tool) {
            run((org.gtk.gdk.DeviceTool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(tool)), org.gtk.gdk.DeviceTool.fromAddress).marshal(tool, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToolChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted on pen/eraser devices whenever tools enter or leave proximity.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Device.ToolChanged> onToolChanged(Device.ToolChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("tool-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Device.Builder} object constructs a {@link Device} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Device.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Device} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Device}.
         * @return A new instance of {@code Device} with the properties 
         *         that were set in the Builder object.
         */
        public Device build() {
            return (Device) org.gtk.gobject.GObject.newWithProperties(
                Device.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether Caps Lock is on.
         * <p>
         * This is only relevant for keyboard devices.
         * @param capsLockState The value for the {@code caps-lock-state} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCapsLockState(boolean capsLockState) {
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
        public Builder setDirection(org.pango.Direction direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} the {@code GdkDevice} pertains to.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
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
        public Builder setHasBidiLayouts(boolean hasBidiLayouts) {
            names.add("has-bidi-layouts");
            values.add(org.gtk.gobject.Value.create(hasBidiLayouts));
            return this;
        }
        
        /**
         * Whether the device is represented by a cursor on the screen.
         * @param hasCursor The value for the {@code has-cursor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasCursor(boolean hasCursor) {
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
        public Builder setModifierState(org.gtk.gdk.ModifierType modifierState) {
            names.add("modifier-state");
            values.add(org.gtk.gobject.Value.create(modifierState));
            return this;
        }
        
        /**
         * Number of axes in the device.
         * @param nAxes The value for the {@code n-axes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNAxes(int nAxes) {
            names.add("n-axes");
            values.add(org.gtk.gobject.Value.create(nAxes));
            return this;
        }
        
        /**
         * The device name.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
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
        public Builder setNumLockState(boolean numLockState) {
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
        public Builder setNumTouches(int numTouches) {
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
        public Builder setProductId(java.lang.String productId) {
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
        public Builder setScrollLockState(boolean scrollLockState) {
            names.add("scroll-lock-state");
            values.add(org.gtk.gobject.Value.create(scrollLockState));
            return this;
        }
        
        /**
         * {@code GdkSeat} of this device.
         * @param seat The value for the {@code seat} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSeat(org.gtk.gdk.Seat seat) {
            names.add("seat");
            values.add(org.gtk.gobject.Value.create(seat));
            return this;
        }
        
        /**
         * Source type for the device.
         * @param source The value for the {@code source} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSource(org.gtk.gdk.InputSource source) {
            names.add("source");
            values.add(org.gtk.gobject.Value.create(source));
            return this;
        }
        
        /**
         * The {@code GdkDeviceTool} that is currently used with this device.
         * @param tool The value for the {@code tool} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTool(org.gtk.gdk.DeviceTool tool) {
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
        public Builder setVendorId(java.lang.String vendorId) {
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
}

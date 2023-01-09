package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkSeat} object represents a collection of input devices
 * that belong to a user.
 */
public class Seat extends org.gtk.gobject.GObject {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkSeat";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Seat proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Seat(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Seat> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Seat(input);
    
    /**
     * Returns the capabilities this {@code GdkSeat} currently has.
     * @return the seat capabilities
     */
    public org.gtk.gdk.SeatCapabilities getCapabilities() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_seat_get_capabilities.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.SeatCapabilities(RESULT);
    }
    
    /**
     * Returns the devices that match the given capabilities.
     * @param capabilities capabilities to get devices for
     * @return A list
     *   of {@code GdkDevices}. The list must be freed with g_list_free(),
     *   the elements are owned by GTK and must not be freed.
     */
    public org.gtk.glib.List getDevices(org.gtk.gdk.SeatCapabilities capabilities) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_devices.invokeExact(
                    handle(),
                    capabilities.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@code GdkDisplay} this seat belongs to.
     * @return a {@code GdkDisplay}. This object
     *   is owned by GTK and must not be freed.
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the device that routes keyboard events.
     * @return a {@code GdkDevice} with keyboard
     *   capabilities. This object is owned by GTK and must not be freed.
     */
    public @Nullable org.gtk.gdk.Device getKeyboard() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_keyboard.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Device) Interop.register(RESULT, org.gtk.gdk.Device.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the device that routes pointer events.
     * @return a {@code GdkDevice} with pointer
     *   capabilities. This object is owned by GTK and must not be freed.
     */
    public @Nullable org.gtk.gdk.Device getPointer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_pointer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Device) Interop.register(RESULT, org.gtk.gdk.Device.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns all {@code GdkDeviceTools} that are known to the application.
     * @return A list of tools. Free with g_list_free().
     */
    public org.gtk.glib.List getTools() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_tools.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_seat_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code DeviceAdded} callback.
     */
    @FunctionalInterface
    public interface DeviceAdded {
    
        /**
         * Emitted when a new input device is related to this seat.
         */
        void run(org.gtk.gdk.Device device);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSeat, MemoryAddress device) {
            run((org.gtk.gdk.Device) Interop.register(device, org.gtk.gdk.Device.fromAddress).marshal(device, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeviceAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a new input device is related to this seat.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Seat.DeviceAdded> onDeviceAdded(Seat.DeviceAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("device-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeviceRemoved} callback.
     */
    @FunctionalInterface
    public interface DeviceRemoved {
    
        /**
         * Emitted when an input device is removed (e.g. unplugged).
         */
        void run(org.gtk.gdk.Device device);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSeat, MemoryAddress device) {
            run((org.gtk.gdk.Device) Interop.register(device, org.gtk.gdk.Device.fromAddress).marshal(device, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeviceRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when an input device is removed (e.g. unplugged).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Seat.DeviceRemoved> onDeviceRemoved(Seat.DeviceRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("device-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToolAdded} callback.
     */
    @FunctionalInterface
    public interface ToolAdded {
    
        /**
         * Emitted whenever a new tool is made known to the seat.
         * <p>
         * The tool may later be assigned to a device (i.e. on
         * proximity with a tablet). The device will emit the
         * {@code Gdk.Device::tool-changed} signal accordingly.
         * <p>
         * A same tool may be used by several devices.
         */
        void run(org.gtk.gdk.DeviceTool tool);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSeat, MemoryAddress tool) {
            run((org.gtk.gdk.DeviceTool) Interop.register(tool, org.gtk.gdk.DeviceTool.fromAddress).marshal(tool, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToolAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever a new tool is made known to the seat.
     * <p>
     * The tool may later be assigned to a device (i.e. on
     * proximity with a tablet). The device will emit the
     * {@code Gdk.Device::tool-changed} signal accordingly.
     * <p>
     * A same tool may be used by several devices.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Seat.ToolAdded> onToolAdded(Seat.ToolAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("tool-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToolRemoved} callback.
     */
    @FunctionalInterface
    public interface ToolRemoved {
    
        /**
         * Emitted whenever a tool is no longer known to this {@code seat}.
         */
        void run(org.gtk.gdk.DeviceTool tool);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSeat, MemoryAddress tool) {
            run((org.gtk.gdk.DeviceTool) Interop.register(tool, org.gtk.gdk.DeviceTool.fromAddress).marshal(tool, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToolRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever a tool is no longer known to this {@code seat}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Seat.ToolRemoved> onToolRemoved(Seat.ToolRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("tool-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Seat.Builder} object constructs a {@link Seat} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Seat.Builder#build()}. 
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
         * Finish building the {@link Seat} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Seat}.
         * @return A new instance of {@code Seat} with the properties 
         *         that were set in the Builder object.
         */
        public Seat build() {
            return (Seat) org.gtk.gobject.GObject.newWithProperties(
                Seat.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@code GdkDisplay} of this seat.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_seat_get_capabilities = Interop.downcallHandle(
                "gdk_seat_get_capabilities",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_seat_get_devices = Interop.downcallHandle(
                "gdk_seat_get_devices",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gdk_seat_get_display = Interop.downcallHandle(
                "gdk_seat_get_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_seat_get_keyboard = Interop.downcallHandle(
                "gdk_seat_get_keyboard",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_seat_get_pointer = Interop.downcallHandle(
                "gdk_seat_get_pointer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_seat_get_tools = Interop.downcallHandle(
                "gdk_seat_get_tools",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_seat_get_type = Interop.downcallHandle(
                "gdk_seat_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_seat_get_type != null;
    }
}

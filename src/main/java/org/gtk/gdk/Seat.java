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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Seat(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Seat> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Seat(input, ownership);
    
    /**
     * Returns the capabilities this {@code GdkSeat} currently has.
     * @return the seat capabilities
     */
    public org.gtk.gdk.SeatCapabilities getCapabilities() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_seat_get_capabilities.invokeExact(
                    handle());
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
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Returns the {@code GdkDisplay} this seat belongs to.
     * @return a {@code GdkDisplay}. This object
     *   is owned by GTK and must not be freed.
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Display.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the device that routes keyboard events.
     * @return a {@code GdkDevice} with keyboard
     *   capabilities. This object is owned by GTK and must not be freed.
     */
    public @Nullable org.gtk.gdk.Device getKeyboard() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_keyboard.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Device) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Device.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the device that routes pointer events.
     * @return a {@code GdkDevice} with pointer
     *   capabilities. This object is owned by GTK and must not be freed.
     */
    public @Nullable org.gtk.gdk.Device getPointer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_pointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Device) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Device.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns all {@code GdkDeviceTools} that are known to the application.
     * @return A list of tools. Free with g_list_free().
     */
    public org.gtk.glib.List getTools() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_tools.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.CONTAINER);
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
    
    @FunctionalInterface
    public interface DeviceAdded {
        void run(org.gtk.gdk.Device device);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceSeat, MemoryAddress device) {
            run((org.gtk.gdk.Device) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(device)), org.gtk.gdk.Device.fromAddress).marshal(device, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeviceAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a new input device is related to this seat.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Seat.DeviceAdded> onDeviceAdded(Seat.DeviceAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("device-added"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeviceRemoved {
        void run(org.gtk.gdk.Device device);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceSeat, MemoryAddress device) {
            run((org.gtk.gdk.Device) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(device)), org.gtk.gdk.Device.fromAddress).marshal(device, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeviceRemoved.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when an input device is removed (e.g. unplugged).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Seat.DeviceRemoved> onDeviceRemoved(Seat.DeviceRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("device-removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolAdded {
        void run(org.gtk.gdk.DeviceTool tool);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceSeat, MemoryAddress tool) {
            run((org.gtk.gdk.DeviceTool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(tool)), org.gtk.gdk.DeviceTool.fromAddress).marshal(tool, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToolAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("tool-added"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolRemoved {
        void run(org.gtk.gdk.DeviceTool tool);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceSeat, MemoryAddress tool) {
            run((org.gtk.gdk.DeviceTool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(tool)), org.gtk.gdk.DeviceTool.fromAddress).marshal(tool, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToolRemoved.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever a tool is no longer known to this {@code seat}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Seat.ToolRemoved> onToolRemoved(Seat.ToolRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("tool-removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
}

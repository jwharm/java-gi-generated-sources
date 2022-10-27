package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkSeat} object represents a collection of input devices
 * that belong to a user.
 */
public class Seat extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName("GdkSeat");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Seat(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Seat */
    public static Seat castFrom(org.gtk.gobject.Object gobject) {
        return new Seat(gobject.refcounted());
    }
    
    /**
     * Returns the capabilities this {@code GdkSeat} currently has.
     * @return the seat capabilities
     */
    public @NotNull org.gtk.gdk.SeatCapabilities getCapabilities() {
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
    public @NotNull org.gtk.glib.List getDevices(@NotNull org.gtk.gdk.SeatCapabilities capabilities) {
        java.util.Objects.requireNonNull(capabilities, "Parameter 'capabilities' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_devices.invokeExact(handle(), capabilities.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GdkDisplay} this seat belongs to.
     * @return a {@code GdkDisplay}. This object
     *   is owned by GTK and must not be freed.
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
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
        return new org.gtk.gdk.Device(Refcounted.get(RESULT, false));
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
        return new org.gtk.gdk.Device(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns all {@code GdkDeviceTools} that are known to the application.
     * @return A list of tools. Free with g_list_free().
     */
    public @NotNull org.gtk.glib.List getTools() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_seat_get_tools.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface DeviceAdded {
        void signalReceived(Seat source, @NotNull org.gtk.gdk.Device device);
    }
    
    /**
     * Emitted when a new input device is related to this seat.
     */
    public Signal<Seat.DeviceAdded> onDeviceAdded(Seat.DeviceAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("device-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.Callbacks.class, "signalSeatDeviceAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Seat.DeviceAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeviceRemoved {
        void signalReceived(Seat source, @NotNull org.gtk.gdk.Device device);
    }
    
    /**
     * Emitted when an input device is removed (e.g. unplugged).
     */
    public Signal<Seat.DeviceRemoved> onDeviceRemoved(Seat.DeviceRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("device-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.Callbacks.class, "signalSeatDeviceRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Seat.DeviceRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolAdded {
        void signalReceived(Seat source, @NotNull org.gtk.gdk.DeviceTool tool);
    }
    
    /**
     * Emitted whenever a new tool is made known to the seat.
     * <p>
     * The tool may later be assigned to a device (i.e. on
     * proximity with a tablet). The device will emit the
     * {@code Gdk.Device::tool-changed} signal accordingly.
     * <p>
     * A same tool may be used by several devices.
     */
    public Signal<Seat.ToolAdded> onToolAdded(Seat.ToolAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tool-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.Callbacks.class, "signalSeatToolAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Seat.ToolAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolRemoved {
        void signalReceived(Seat source, @NotNull org.gtk.gdk.DeviceTool tool);
    }
    
    /**
     * Emitted whenever a tool is no longer known to this {@code seat}.
     */
    public Signal<Seat.ToolRemoved> onToolRemoved(Seat.ToolRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tool-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.Callbacks.class, "signalSeatToolRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Seat.ToolRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_seat_get_capabilities = Interop.downcallHandle(
            "gdk_seat_get_capabilities",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_seat_get_devices = Interop.downcallHandle(
            "gdk_seat_get_devices",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_seat_get_display = Interop.downcallHandle(
            "gdk_seat_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_seat_get_keyboard = Interop.downcallHandle(
            "gdk_seat_get_keyboard",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_seat_get_pointer = Interop.downcallHandle(
            "gdk_seat_get_pointer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_seat_get_tools = Interop.downcallHandle(
            "gdk_seat_get_tools",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalSeatDeviceAdded(MemoryAddress source, MemoryAddress device, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Seat.DeviceAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Seat(Refcounted.get(source)), new org.gtk.gdk.Device(Refcounted.get(device, false)));
        }
        
        public static void signalSeatDeviceRemoved(MemoryAddress source, MemoryAddress device, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Seat.DeviceRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Seat(Refcounted.get(source)), new org.gtk.gdk.Device(Refcounted.get(device, false)));
        }
        
        public static void signalSeatToolAdded(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Seat.ToolAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Seat(Refcounted.get(source)), new org.gtk.gdk.DeviceTool(Refcounted.get(tool, false)));
        }
        
        public static void signalSeatToolRemoved(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Seat.ToolRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Seat(Refcounted.get(source)), new org.gtk.gdk.DeviceTool(Refcounted.get(tool, false)));
        }
    }
}

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

    public Seat(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Seat */
    public static Seat castFrom(org.gtk.gobject.Object gobject) {
        return new Seat(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_seat_get_capabilities = Interop.downcallHandle(
        "gdk_seat_get_capabilities",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the capabilities this {@code GdkSeat} currently has.
     */
    public @NotNull SeatCapabilities getCapabilities() {
        int RESULT;
        try {
            RESULT = (int) gdk_seat_get_capabilities.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SeatCapabilities(RESULT);
    }
    
    private static final MethodHandle gdk_seat_get_devices = Interop.downcallHandle(
        "gdk_seat_get_devices",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the devices that match the given capabilities.
     */
    public @NotNull org.gtk.glib.List getDevices(@NotNull SeatCapabilities capabilities) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_seat_get_devices.invokeExact(handle(), capabilities.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_seat_get_display = Interop.downcallHandle(
        "gdk_seat_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkDisplay} this seat belongs to.
     */
    public @NotNull Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_seat_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Display(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_seat_get_keyboard = Interop.downcallHandle(
        "gdk_seat_get_keyboard",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the device that routes keyboard events.
     */
    public @Nullable Device getKeyboard() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_seat_get_keyboard.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Device(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_seat_get_pointer = Interop.downcallHandle(
        "gdk_seat_get_pointer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the device that routes pointer events.
     */
    public @Nullable Device getPointer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_seat_get_pointer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Device(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_seat_get_tools = Interop.downcallHandle(
        "gdk_seat_get_tools",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns all {@code GdkDeviceTools} that are known to the application.
     */
    public @NotNull org.gtk.glib.List getTools() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_seat_get_tools.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface DeviceAddedHandler {
        void signalReceived(Seat source, @NotNull Device device);
    }
    
    /**
     * Emitted when a new input device is related to this seat.
     */
    public SignalHandle onDeviceAdded(DeviceAddedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("device-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.Callbacks.class, "signalSeatDeviceAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeviceRemovedHandler {
        void signalReceived(Seat source, @NotNull Device device);
    }
    
    /**
     * Emitted when an input device is removed (e.g. unplugged).
     */
    public SignalHandle onDeviceRemoved(DeviceRemovedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("device-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.Callbacks.class, "signalSeatDeviceRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolAddedHandler {
        void signalReceived(Seat source, @NotNull DeviceTool tool);
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
    public SignalHandle onToolAdded(ToolAddedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tool-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.Callbacks.class, "signalSeatToolAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToolRemovedHandler {
        void signalReceived(Seat source, @NotNull DeviceTool tool);
    }
    
    /**
     * Emitted whenever a tool is no longer known to this {@code seat}.
     */
    public SignalHandle onToolRemoved(ToolRemovedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tool-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.Callbacks.class, "signalSeatToolRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalSeatDeviceAdded(MemoryAddress source, MemoryAddress device, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Seat.DeviceAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Seat(Refcounted.get(source)), new Device(Refcounted.get(device, false)));
        }
        
        public static void signalSeatDeviceRemoved(MemoryAddress source, MemoryAddress device, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Seat.DeviceRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Seat(Refcounted.get(source)), new Device(Refcounted.get(device, false)));
        }
        
        public static void signalSeatToolAdded(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Seat.ToolAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Seat(Refcounted.get(source)), new DeviceTool(Refcounted.get(tool, false)));
        }
        
        public static void signalSeatToolRemoved(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Seat.ToolRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Seat(Refcounted.get(source)), new DeviceTool(Refcounted.get(tool, false)));
        }
        
    }
}

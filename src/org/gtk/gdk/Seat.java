package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkSeat} object represents a collection of input devices
 * that belong to a user.
 */
public class Seat extends org.gtk.gobject.Object {

    public Seat(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Seat */
    public static Seat castFrom(org.gtk.gobject.Object gobject) {
        return new Seat(gobject.getReference());
    }
    
    /**
     * Returns the capabilities this {@code GdkSeat} currently has.
     */
    public int getCapabilities() {
        var RESULT = gtk_h.gdk_seat_get_capabilities(handle());
        return RESULT;
    }
    
    /**
     * Returns the devices that match the given capabilities.
     */
    public org.gtk.glib.List getDevices(int capabilities) {
        var RESULT = gtk_h.gdk_seat_get_devices(handle(), capabilities);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GdkDisplay} this seat belongs to.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_seat_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Returns the device that routes keyboard events.
     */
    public Device getKeyboard() {
        var RESULT = gtk_h.gdk_seat_get_keyboard(handle());
        return new Device(References.get(RESULT, false));
    }
    
    /**
     * Returns the device that routes pointer events.
     */
    public Device getPointer() {
        var RESULT = gtk_h.gdk_seat_get_pointer(handle());
        return new Device(References.get(RESULT, false));
    }
    
    /**
     * Returns all {@code GdkDeviceTools} that are known to the application.
     */
    public org.gtk.glib.List getTools() {
        var RESULT = gtk_h.gdk_seat_get_tools(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface DeviceAddedHandler {
        void signalReceived(Seat source, Device device);
    }
    
    /**
     * Emitted when a new input device is related to this seat.
     */
    public SignalHandle onDeviceAdded(DeviceAddedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("device-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.class, "__signalSeatDeviceAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSeatDeviceAdded(MemoryAddress source, MemoryAddress device, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Seat.DeviceAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Seat(References.get(source)), new Device(References.get(device, false)));
    }
    
    @FunctionalInterface
    public interface DeviceRemovedHandler {
        void signalReceived(Seat source, Device device);
    }
    
    /**
     * Emitted when an input device is removed (e.g. unplugged).
     */
    public SignalHandle onDeviceRemoved(DeviceRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("device-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.class, "__signalSeatDeviceRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSeatDeviceRemoved(MemoryAddress source, MemoryAddress device, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Seat.DeviceRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Seat(References.get(source)), new Device(References.get(device, false)));
    }
    
    @FunctionalInterface
    public interface ToolAddedHandler {
        void signalReceived(Seat source, DeviceTool tool);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("tool-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.class, "__signalSeatToolAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSeatToolAdded(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Seat.ToolAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Seat(References.get(source)), new DeviceTool(References.get(tool, false)));
    }
    
    @FunctionalInterface
    public interface ToolRemovedHandler {
        void signalReceived(Seat source, DeviceTool tool);
    }
    
    /**
     * Emitted whenever a tool is no longer known to this {@code seat}.
     */
    public SignalHandle onToolRemoved(ToolRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("tool-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Seat.class, "__signalSeatToolRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSeatToolRemoved(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Seat.ToolRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Seat(References.get(source)), new DeviceTool(References.get(tool, false)));
    }
    
}

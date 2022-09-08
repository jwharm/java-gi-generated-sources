package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkSeat` object represents a collection of input devices
 * that belong to a user.
 */
public class Seat extends org.gtk.gobject.Object {

    public Seat(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Seat */
    public static Seat castFrom(org.gtk.gobject.Object gobject) {
        return new Seat(gobject.getReference());
    }
    
    /**
     * Returns the capabilities this `GdkSeat` currently has.
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
     * Returns the `GdkDisplay` this seat belongs to.
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
     * Returns all `GdkDeviceTools` that are known to the application.
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
    public void onDeviceAdded(DeviceAddedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSeatDeviceAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("device-added").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DeviceRemovedHandler {
        void signalReceived(Seat source, Device device);
    }
    
    /**
     * Emitted when an input device is removed (e.g. unplugged).
     */
    public void onDeviceRemoved(DeviceRemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSeatDeviceRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("device-removed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToolAddedHandler {
        void signalReceived(Seat source, DeviceTool tool);
    }
    
    /**
     * Emitted whenever a new tool is made known to the seat.
     * 
     * The tool may later be assigned to a device (i.e. on
     * proximity with a tablet). The device will emit the
     * [signal@Gdk.Device::tool-changed] signal accordingly.
     * 
     * A same tool may be used by several devices.
     */
    public void onToolAdded(ToolAddedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSeatToolAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("tool-added").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToolRemovedHandler {
        void signalReceived(Seat source, DeviceTool tool);
    }
    
    /**
     * Emitted whenever a tool is no longer known to this @seat.
     */
    public void onToolRemoved(ToolRemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSeatToolRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("tool-removed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

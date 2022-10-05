package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link DBusObject} type is the base type for D-Bus objects on both
 * the service side (see {@link DBusObjectSkeleton}) and the client side
 * (see {@link DBusObjectProxy}). It is essentially just a container of
 * interfaces.
 */
public interface DBusObject extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_dbus_object_get_interface = Interop.downcallHandle(
        "g_dbus_object_get_interface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the D-Bus interface with name {@code interface_name} associated with
     * {@code object}, if any.
     */
    public default DBusInterface getInterface(java.lang.String interfaceName) {
        try {
            var RESULT = (MemoryAddress) g_dbus_object_get_interface.invokeExact(handle(), Interop.allocateNativeString(interfaceName).handle());
            return new DBusInterface.DBusInterfaceImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_object_get_interfaces = Interop.downcallHandle(
        "g_dbus_object_get_interfaces",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the D-Bus interfaces associated with {@code object}.
     */
    public default org.gtk.glib.List getInterfaces() {
        try {
            var RESULT = (MemoryAddress) g_dbus_object_get_interfaces.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_object_get_object_path = Interop.downcallHandle(
        "g_dbus_object_get_object_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the object path for {@code object}.
     */
    public default java.lang.String getObjectPath() {
        try {
            var RESULT = (MemoryAddress) g_dbus_object_get_object_path.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceAddedHandler {
        void signalReceived(DBusObject source, DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is added to {@code object}.
     */
    public default SignalHandle onInterfaceAdded(InterfaceAddedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-added").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObject.Callbacks.class, "signalDBusObjectInterfaceAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceRemovedHandler {
        void signalReceived(DBusObject source, DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is removed from {@code object}.
     */
    public default SignalHandle onInterfaceRemoved(InterfaceRemovedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-removed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObject.Callbacks.class, "signalDBusObjectInterfaceRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDBusObjectInterfaceAdded(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusObject.InterfaceAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DBusObject.DBusObjectImpl(Refcounted.get(source)), new DBusInterface.DBusInterfaceImpl(Refcounted.get(interface_, false)));
        }
        
        public static void signalDBusObjectInterfaceRemoved(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusObject.InterfaceRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DBusObject.DBusObjectImpl(Refcounted.get(source)), new DBusInterface.DBusInterfaceImpl(Refcounted.get(interface_, false)));
        }
        
    }
    
    class DBusObjectImpl extends org.gtk.gobject.Object implements DBusObject {
        public DBusObjectImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

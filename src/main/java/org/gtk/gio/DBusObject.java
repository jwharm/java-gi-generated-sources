package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link DBusObject} type is the base type for D-Bus objects on both
 * the service side (see {@link DBusObjectSkeleton}) and the client side
 * (see {@link DBusObjectProxy}). It is essentially just a container of
 * interfaces.
 */
public interface DBusObject extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_dbus_object_get_interface = Interop.downcallHandle(
        "g_dbus_object_get_interface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the D-Bus interface with name {@code interface_name} associated with
     * {@code object}, if any.
     */
    default @Nullable DBusInterface getInterface(@NotNull java.lang.String interfaceName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_object_get_interface.invokeExact(handle(), Interop.allocateNativeString(interfaceName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusInterface.DBusInterfaceImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_dbus_object_get_interfaces = Interop.downcallHandle(
        "g_dbus_object_get_interfaces",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the D-Bus interfaces associated with {@code object}.
     */
    default @NotNull org.gtk.glib.List getInterfaces() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_object_get_interfaces.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_dbus_object_get_object_path = Interop.downcallHandle(
        "g_dbus_object_get_object_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the object path for {@code object}.
     */
    default @NotNull java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_object_get_object_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @FunctionalInterface
    public interface InterfaceAddedHandler {
        void signalReceived(DBusObject source, @NotNull DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is added to {@code object}.
     */
    public default SignalHandle onInterfaceAdded(InterfaceAddedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObject.Callbacks.class, "signalDBusObjectInterfaceAdded",
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
    public interface InterfaceRemovedHandler {
        void signalReceived(DBusObject source, @NotNull DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is removed from {@code object}.
     */
    public default SignalHandle onInterfaceRemoved(InterfaceRemovedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObject.Callbacks.class, "signalDBusObjectInterfaceRemoved",
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

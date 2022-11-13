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
    
    /**
     * Cast object to DBusObject if its GType is a (or inherits from) "GDBusObject".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DBusObject} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusObject", a ClassCastException will be thrown.
     */
    public static DBusObject castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusObject"))) {
            return new DBusObjectImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusObject");
        }
    }
    
    /**
     * Gets the D-Bus interface with name {@code interface_name} associated with
     * {@code object}, if any.
     * @param interfaceName A D-Bus interface name.
     * @return {@code null} if not found, otherwise a
     *   {@link DBusInterface} that must be freed with g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusInterface getInterface(@NotNull java.lang.String interfaceName) {
        java.util.Objects.requireNonNull(interfaceName, "Parameter 'interfaceName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_get_interface.invokeExact(
                    handle(),
                    Interop.allocateNativeString(interfaceName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterface.DBusInterfaceImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the D-Bus interfaces associated with {@code object}.
     * @return A list of {@link DBusInterface} instances.
     *   The returned list must be freed by g_list_free() after each element has been freed
     *   with g_object_unref().
     */
    default @NotNull org.gtk.glib.List getInterfaces() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_get_interfaces.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the object path for {@code object}.
     * @return A string owned by {@code object}. Do not free.
     */
    default @NotNull java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_get_object_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    @FunctionalInterface
    public interface InterfaceAdded {
        void signalReceived(DBusObject source, @NotNull org.gtk.gio.DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is added to {@code object}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObject.InterfaceAdded> onInterfaceAdded(DBusObject.InterfaceAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObject.Callbacks.class, "signalDBusObjectInterfaceAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusObject.InterfaceAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceRemoved {
        void signalReceived(DBusObject source, @NotNull org.gtk.gio.DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is removed from {@code object}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObject.InterfaceRemoved> onInterfaceRemoved(DBusObject.InterfaceRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObject.Callbacks.class, "signalDBusObjectInterfaceRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusObject.InterfaceRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_get_interface = Interop.downcallHandle(
            "g_dbus_object_get_interface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_get_interfaces = Interop.downcallHandle(
            "g_dbus_object_get_interfaces",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_get_object_path = Interop.downcallHandle(
            "g_dbus_object_get_object_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalDBusObjectInterfaceAdded(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DBusObject.InterfaceAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DBusObject.DBusObjectImpl(source, Ownership.UNKNOWN), new org.gtk.gio.DBusInterface.DBusInterfaceImpl(interface_, Ownership.NONE));
        }
        
        public static void signalDBusObjectInterfaceRemoved(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DBusObject.InterfaceRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DBusObject.DBusObjectImpl(source, Ownership.UNKNOWN), new org.gtk.gio.DBusInterface.DBusInterfaceImpl(interface_, Ownership.NONE));
        }
    }
    
    class DBusObjectImpl extends org.gtk.gobject.Object implements DBusObject {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DBusObjectImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}

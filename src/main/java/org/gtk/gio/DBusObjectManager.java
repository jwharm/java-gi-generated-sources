package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link DBusObjectManager} type is the base type for service- and
 * client-side implementations of the standardized
 * <a href="http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager">org.freedesktop.DBus.ObjectManager</a>
 * interface.
 * <p>
 * See {@link DBusObjectManagerClient} for the client-side implementation
 * and {@link DBusObjectManagerServer} for the service-side implementation.
 */
public interface DBusObjectManager extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to DBusObjectManager if its GType is a (or inherits from) "GDBusObjectManager".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DBusObjectManager} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusObjectManager", a ClassCastException will be thrown.
     */
    public static DBusObjectManager castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), DBusObjectManager.getType())) {
            return new DBusObjectManagerImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusObjectManager");
        }
    }
    
    /**
     * Gets the interface proxy for {@code interface_name} at {@code object_path}, if
     * any.
     * @param objectPath Object path to look up.
     * @param interfaceName D-Bus interface name to look up.
     * @return A {@link DBusInterface} instance or {@code null}. Free
     *   with g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusInterface getInterface(@NotNull java.lang.String objectPath, @NotNull java.lang.String interfaceName) {
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        java.util.Objects.requireNonNull(interfaceName, "Parameter 'interfaceName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_interface.invokeExact(
                    handle(),
                    Interop.allocateNativeString(objectPath),
                    Interop.allocateNativeString(interfaceName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterface.DBusInterfaceImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the {@link DBusObject} at {@code object_path}, if any.
     * @param objectPath Object path to look up.
     * @return A {@link DBusObject} or {@code null}. Free with
     *   g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusObject getObject(@NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_object.invokeExact(
                    handle(),
                    Interop.allocateNativeString(objectPath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusObject.DBusObjectImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the object path that {@code manager} is for.
     * @return A string owned by {@code manager}. Do not free.
     */
    default @NotNull java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_object_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets all {@link DBusObject} objects known to {@code manager}.
     * @return A list of
     *   {@link DBusObject} objects. The returned list should be freed with
     *   g_list_free() after each element has been freed with
     *   g_object_unref().
     */
    default @NotNull org.gtk.glib.List getObjects() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_objects.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_object_manager_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface InterfaceAdded {
        void signalReceived(DBusObjectManager source, @NotNull org.gtk.gio.DBusObject object, @NotNull org.gtk.gio.DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is added to {@code object}.
     * <p>
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all objects managed by {@code manager}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObjectManager.InterfaceAdded> onInterfaceAdded(DBusObjectManager.InterfaceAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManager.Callbacks.class, "signalDBusObjectManagerInterfaceAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusObjectManager.InterfaceAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceRemoved {
        void signalReceived(DBusObjectManager source, @NotNull org.gtk.gio.DBusObject object, @NotNull org.gtk.gio.DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} has been removed from {@code object}.
     * <p>
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all objects managed by {@code manager}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObjectManager.InterfaceRemoved> onInterfaceRemoved(DBusObjectManager.InterfaceRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManager.Callbacks.class, "signalDBusObjectManagerInterfaceRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusObjectManager.InterfaceRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ObjectAdded {
        void signalReceived(DBusObjectManager source, @NotNull org.gtk.gio.DBusObject object);
    }
    
    /**
     * Emitted when {@code object} is added to {@code manager}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObjectManager.ObjectAdded> onObjectAdded(DBusObjectManager.ObjectAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("object-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManager.Callbacks.class, "signalDBusObjectManagerObjectAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusObjectManager.ObjectAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ObjectRemoved {
        void signalReceived(DBusObjectManager source, @NotNull org.gtk.gio.DBusObject object);
    }
    
    /**
     * Emitted when {@code object} is removed from {@code manager}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObjectManager.ObjectRemoved> onObjectRemoved(DBusObjectManager.ObjectRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("object-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManager.Callbacks.class, "signalDBusObjectManagerObjectRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusObjectManager.ObjectRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_manager_get_interface = Interop.downcallHandle(
            "g_dbus_object_manager_get_interface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_manager_get_object = Interop.downcallHandle(
            "g_dbus_object_manager_get_object",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_manager_get_object_path = Interop.downcallHandle(
            "g_dbus_object_manager_get_object_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_manager_get_objects = Interop.downcallHandle(
            "g_dbus_object_manager_get_objects",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_manager_get_type = Interop.downcallHandle(
            "g_dbus_object_manager_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalDBusObjectManagerInterfaceAdded(MemoryAddress source, MemoryAddress object, MemoryAddress interface_, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DBusObjectManager.InterfaceAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(source, Ownership.NONE), new org.gtk.gio.DBusObject.DBusObjectImpl(object, Ownership.NONE), new org.gtk.gio.DBusInterface.DBusInterfaceImpl(interface_, Ownership.NONE));
        }
        
        public static void signalDBusObjectManagerInterfaceRemoved(MemoryAddress source, MemoryAddress object, MemoryAddress interface_, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DBusObjectManager.InterfaceRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(source, Ownership.NONE), new org.gtk.gio.DBusObject.DBusObjectImpl(object, Ownership.NONE), new org.gtk.gio.DBusInterface.DBusInterfaceImpl(interface_, Ownership.NONE));
        }
        
        public static void signalDBusObjectManagerObjectAdded(MemoryAddress source, MemoryAddress object, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DBusObjectManager.ObjectAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(source, Ownership.NONE), new org.gtk.gio.DBusObject.DBusObjectImpl(object, Ownership.NONE));
        }
        
        public static void signalDBusObjectManagerObjectRemoved(MemoryAddress source, MemoryAddress object, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DBusObjectManager.ObjectRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(source, Ownership.NONE), new org.gtk.gio.DBusObject.DBusObjectImpl(object, Ownership.NONE));
        }
    }
    
    class DBusObjectManagerImpl extends org.gtk.gobject.Object implements DBusObjectManager {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DBusObjectManagerImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}

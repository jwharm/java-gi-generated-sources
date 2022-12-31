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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectManagerImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectManagerImpl(input, ownership);
    
    /**
     * Gets the interface proxy for {@code interface_name} at {@code object_path}, if
     * any.
     * @param objectPath Object path to look up.
     * @param interfaceName D-Bus interface name to look up.
     * @return A {@link DBusInterface} instance or {@code null}. Free
     *   with g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusInterface getInterface(java.lang.String objectPath, java.lang.String interfaceName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_interface.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    Marshal.stringToAddress.marshal(interfaceName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusInterface.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the {@link DBusObject} at {@code object_path}, if any.
     * @param objectPath Object path to look up.
     * @return A {@link DBusObject} or {@code null}. Free with
     *   g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusObject getObject(java.lang.String objectPath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_object.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(objectPath, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusObject.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the object path that {@code manager} is for.
     * @return A string owned by {@code manager}. Do not free.
     */
    default java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_object_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets all {@link DBusObject} objects known to {@code manager}.
     * @return A list of
     *   {@link DBusObject} objects. The returned list should be freed with
     *   g_list_free() after each element has been freed with
     *   g_object_unref().
     */
    default org.gtk.glib.List getObjects() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_objects.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
        void run(org.gtk.gio.DBusObject object, org.gtk.gio.DBusInterface interface_);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManager, MemoryAddress object, MemoryAddress interface_) {
            run((org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE), (org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("interface-added"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceRemoved {
        void run(org.gtk.gio.DBusObject object, org.gtk.gio.DBusInterface interface_);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManager, MemoryAddress object, MemoryAddress interface_) {
            run((org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE), (org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceRemoved.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("interface-removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ObjectAdded {
        void run(org.gtk.gio.DBusObject object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManager, MemoryAddress object) {
            run((org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ObjectAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code object} is added to {@code manager}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObjectManager.ObjectAdded> onObjectAdded(DBusObjectManager.ObjectAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("object-added"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ObjectRemoved {
        void run(org.gtk.gio.DBusObject object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManager, MemoryAddress object) {
            run((org.gtk.gio.DBusObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gio.DBusObject.fromAddress).marshal(object, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ObjectRemoved.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code object} is removed from {@code manager}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObjectManager.ObjectRemoved> onObjectRemoved(DBusObjectManager.ObjectRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("object-removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
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
    
    class DBusObjectManagerImpl extends org.gtk.gobject.GObject implements DBusObjectManager {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DBusObjectManagerImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}

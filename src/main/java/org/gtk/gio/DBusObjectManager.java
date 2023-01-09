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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectManagerImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectManagerImpl(input);
    
    /**
     * Gets the interface proxy for {@code interface_name} at {@code object_path}, if
     * any.
     * @param objectPath Object path to look up.
     * @param interfaceName D-Bus interface name to look up.
     * @return A {@link DBusInterface} instance or {@code null}. Free
     *   with g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusInterface getInterface(java.lang.String objectPath, java.lang.String interfaceName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_interface.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(objectPath, SCOPE),
                        Marshal.stringToAddress.marshal(interfaceName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gio.DBusInterface) Interop.register(RESULT, org.gtk.gio.DBusInterface.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the {@link DBusObject} at {@code object_path}, if any.
     * @param objectPath Object path to look up.
     * @return A {@link DBusObject} or {@code null}. Free with
     *   g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusObject getObject(java.lang.String objectPath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_object.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(objectPath, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gio.DBusObject) Interop.register(RESULT, org.gtk.gio.DBusObject.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the object path that {@code manager} is for.
     * @return A string owned by {@code manager}. Do not free.
     */
    default java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_object_path.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_get_objects.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    
    /**
     * Functional interface declaration of the {@code InterfaceAdded} callback.
     */
    @FunctionalInterface
    public interface InterfaceAdded {
    
        /**
         * Emitted when {@code interface} is added to {@code object}.
         * <p>
         * This signal exists purely as a convenience to avoid having to
         * connect signals to all objects managed by {@code manager}.
         */
        void run(org.gtk.gio.DBusObject object, org.gtk.gio.DBusInterface interface_);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManager, MemoryAddress object, MemoryAddress interface_) {
            run((org.gtk.gio.DBusObject) Interop.register(object, org.gtk.gio.DBusObject.fromAddress).marshal(object, null), (org.gtk.gio.DBusInterface) Interop.register(interface_, org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InterfaceAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("interface-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code InterfaceRemoved} callback.
     */
    @FunctionalInterface
    public interface InterfaceRemoved {
    
        /**
         * Emitted when {@code interface} has been removed from {@code object}.
         * <p>
         * This signal exists purely as a convenience to avoid having to
         * connect signals to all objects managed by {@code manager}.
         */
        void run(org.gtk.gio.DBusObject object, org.gtk.gio.DBusInterface interface_);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManager, MemoryAddress object, MemoryAddress interface_) {
            run((org.gtk.gio.DBusObject) Interop.register(object, org.gtk.gio.DBusObject.fromAddress).marshal(object, null), (org.gtk.gio.DBusInterface) Interop.register(interface_, org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InterfaceRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("interface-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ObjectAdded} callback.
     */
    @FunctionalInterface
    public interface ObjectAdded {
    
        /**
         * Emitted when {@code object} is added to {@code manager}.
         */
        void run(org.gtk.gio.DBusObject object);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManager, MemoryAddress object) {
            run((org.gtk.gio.DBusObject) Interop.register(object, org.gtk.gio.DBusObject.fromAddress).marshal(object, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ObjectAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when {@code object} is added to {@code manager}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObjectManager.ObjectAdded> onObjectAdded(DBusObjectManager.ObjectAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("object-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ObjectRemoved} callback.
     */
    @FunctionalInterface
    public interface ObjectRemoved {
    
        /**
         * Emitted when {@code object} is removed from {@code manager}.
         */
        void run(org.gtk.gio.DBusObject object);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManager, MemoryAddress object) {
            run((org.gtk.gio.DBusObject) Interop.register(object, org.gtk.gio.DBusObject.fromAddress).marshal(object, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ObjectRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when {@code object} is removed from {@code manager}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObjectManager.ObjectRemoved> onObjectRemoved(DBusObjectManager.ObjectRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("object-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
    
    /**
     * The DBusObjectManagerImpl type represents a native instance of the DBusObjectManager interface.
     */
    class DBusObjectManagerImpl extends org.gtk.gobject.GObject implements DBusObjectManager {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of DBusObjectManager for the provided memory address.
         * @param address the memory address of the instance
         */
        public DBusObjectManagerImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_dbus_object_manager_get_type != null;
    }
}

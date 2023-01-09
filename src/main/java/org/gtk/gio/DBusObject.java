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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectImpl(input);
    
    /**
     * Gets the D-Bus interface with name {@code interface_name} associated with
     * {@code object}, if any.
     * @param interfaceName A D-Bus interface name.
     * @return {@code null} if not found, otherwise a
     *   {@link DBusInterface} that must be freed with g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusInterface getInterface(java.lang.String interfaceName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_get_interface.invokeExact(
                        handle(),
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
     * Gets the D-Bus interfaces associated with {@code object}.
     * @return A list of {@link DBusInterface} instances.
     *   The returned list must be freed by g_list_free() after each element has been freed
     *   with g_object_unref().
     */
    default org.gtk.glib.List getInterfaces() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_get_interfaces.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the object path for {@code object}.
     * @return A string owned by {@code object}. Do not free.
     */
    default java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_get_object_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_object_get_type.invokeExact();
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
         */
        void run(org.gtk.gio.DBusInterface interface_);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObject, MemoryAddress interface_) {
            run((org.gtk.gio.DBusInterface) Interop.register(interface_, org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObject.InterfaceAdded> onInterfaceAdded(DBusObject.InterfaceAdded handler) {
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
         * Emitted when {@code interface} is removed from {@code object}.
         */
        void run(org.gtk.gio.DBusInterface interface_);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObject, MemoryAddress interface_) {
            run((org.gtk.gio.DBusInterface) Interop.register(interface_, org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
     * Emitted when {@code interface} is removed from {@code object}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObject.InterfaceRemoved> onInterfaceRemoved(DBusObject.InterfaceRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("interface-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_get_interface = Interop.downcallHandle(
                "g_dbus_object_get_interface",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_get_interfaces = Interop.downcallHandle(
                "g_dbus_object_get_interfaces",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_get_object_path = Interop.downcallHandle(
                "g_dbus_object_get_object_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_object_get_type = Interop.downcallHandle(
                "g_dbus_object_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The DBusObjectImpl type represents a native instance of the DBusObject interface.
     */
    class DBusObjectImpl extends org.gtk.gobject.GObject implements DBusObject {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of DBusObject for the provided memory address.
         * @param address the memory address of the instance
         */
        public DBusObjectImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_dbus_object_get_type != null;
    }
}

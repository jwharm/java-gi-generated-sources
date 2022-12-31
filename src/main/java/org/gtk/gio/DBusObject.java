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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectImpl(input, ownership);
    
    /**
     * Gets the D-Bus interface with name {@code interface_name} associated with
     * {@code object}, if any.
     * @param interfaceName A D-Bus interface name.
     * @return {@code null} if not found, otherwise a
     *   {@link DBusInterface} that must be freed with g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusInterface getInterface(java.lang.String interfaceName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_get_interface.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(interfaceName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusInterface.fromAddress).marshal(RESULT, Ownership.FULL);
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
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_get_interfaces.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the object path for {@code object}.
     * @return A string owned by {@code object}. Do not free.
     */
    default java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_get_object_path.invokeExact(
                    handle());
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
    
    @FunctionalInterface
    public interface InterfaceAdded {
        void run(org.gtk.gio.DBusInterface interface_);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObject, MemoryAddress interface_) {
            run((org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code interface} is added to {@code object}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObject.InterfaceAdded> onInterfaceAdded(DBusObject.InterfaceAdded handler) {
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
        void run(org.gtk.gio.DBusInterface interface_);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObject, MemoryAddress interface_) {
            run((org.gtk.gio.DBusInterface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterface.fromAddress).marshal(interface_, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceRemoved.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when {@code interface} is removed from {@code object}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<DBusObject.InterfaceRemoved> onInterfaceRemoved(DBusObject.InterfaceRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("interface-removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
    
    class DBusObjectImpl extends org.gtk.gobject.GObject implements DBusObject {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DBusObjectImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}

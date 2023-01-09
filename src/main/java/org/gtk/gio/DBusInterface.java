package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link DBusInterface} type is the base type for D-Bus interfaces both
 * on the service side (see {@link DBusInterfaceSkeleton}) and client side
 * (see {@link DBusProxy}).
 * @version 2.30
 */
public interface DBusInterface extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusInterfaceImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusInterfaceImpl(input);
    
    /**
     * Gets the {@link DBusObject} that {@code interface_} belongs to, if any.
     * @return A {@link DBusObject} or {@code null}. The returned
     * reference should be freed with g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusObject getObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_dup_object.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.DBusObject) Interop.register(RESULT, org.gtk.gio.DBusObject.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by {@code interface_}.
     * @return A {@link DBusInterfaceInfo}. Do not free.
     */
    default org.gtk.gio.DBusInterfaceInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_get_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DBusInterfaceInfo.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Sets the {@link DBusObject} for {@code interface_} to {@code object}.
     * <p>
     * Note that {@code interface_} will hold a weak reference to {@code object}.
     * @param object A {@link DBusObject} or {@code null}.
     */
    default void setObject(@Nullable org.gtk.gio.DBusObject object) {
        try {
            DowncallHandles.g_dbus_interface_set_object.invokeExact(
                    handle(),
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_interface_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_interface_dup_object = Interop.downcallHandle(
                "g_dbus_interface_dup_object",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_interface_get_info = Interop.downcallHandle(
                "g_dbus_interface_get_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_interface_set_object = Interop.downcallHandle(
                "g_dbus_interface_set_object",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_interface_get_type = Interop.downcallHandle(
                "g_dbus_interface_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The DBusInterfaceImpl type represents a native instance of the DBusInterface interface.
     */
    class DBusInterfaceImpl extends org.gtk.gobject.GObject implements DBusInterface {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of DBusInterface for the provided memory address.
         * @param address the memory address of the instance
         */
        public DBusInterfaceImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_dbus_interface_get_type != null;
    }
}

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
     * Cast object to DBusInterface if its GType is a (or inherits from) "GDBusInterface".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DBusInterface} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusInterface", a ClassCastException will be thrown.
     */
    public static DBusInterface castFrom(org.gtk.gobject.Object gobject) {
            return new DBusInterfaceImpl(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Gets the {@link DBusObject} that {@code interface_} belongs to, if any.
     * @return A {@link DBusObject} or {@code null}. The returned
     * reference should be freed with g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusObject dupObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_dup_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusObject.DBusObjectImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by {@code interface_}.
     * @return A {@link DBusInterfaceInfo}. Do not free.
     */
    default @NotNull org.gtk.gio.DBusInterfaceInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_get_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterfaceInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@link DBusObject} that {@code interface_} belongs to, if any.
     * <p>
     * It is not safe to use the returned object if {@code interface_} or
     * the returned object is being used from other threads. See
     * g_dbus_interface_dup_object() for a thread-safe alternative.
     * @return A {@link DBusObject} or {@code null}. The returned
     *     reference belongs to {@code interface_} and should not be freed.
     */
    default @Nullable org.gtk.gio.DBusObject getObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_get_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusObject.DBusObjectImpl(RESULT, Ownership.NONE);
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
    public static @NotNull org.gtk.glib.Type getType() {
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
        static final MethodHandle g_dbus_interface_get_object = Interop.downcallHandle(
            "g_dbus_interface_get_object",
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
    
    class DBusInterfaceImpl extends org.gtk.gobject.Object implements DBusInterface {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DBusInterfaceImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}

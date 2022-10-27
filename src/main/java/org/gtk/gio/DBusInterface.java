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
     * Gets the {@link DBusObject} that {@code interface_} belongs to, if any.
     * @return A {@link DBusObject} or {@code null}. The returned
     * reference should be freed with g_object_unref().
     */
    default @Nullable org.gtk.gio.DBusObject dupObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_dup_object.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusObject.DBusObjectImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by {@code interface_}.
     * @return A {@link DBusInterfaceInfo}. Do not free.
     */
    default @NotNull org.gtk.gio.DBusInterfaceInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_get_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterfaceInfo(Refcounted.get(RESULT, false));
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
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_get_object.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusObject.DBusObjectImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the {@link DBusObject} for {@code interface_} to {@code object}.
     * <p>
     * Note that {@code interface_} will hold a weak reference to {@code object}.
     * @param object A {@link DBusObject} or {@code null}.
     */
    default void setObject(@Nullable org.gtk.gio.DBusObject object) {
        java.util.Objects.requireNonNullElse(object, MemoryAddress.NULL);
        try {
            DowncallHandles.g_dbus_interface_set_object.invokeExact(handle(), object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_interface_dup_object = Interop.downcallHandle(
            "g_dbus_interface_dup_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_interface_get_info = Interop.downcallHandle(
            "g_dbus_interface_get_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_interface_get_object = Interop.downcallHandle(
            "g_dbus_interface_get_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dbus_interface_set_object = Interop.downcallHandle(
            "g_dbus_interface_set_object",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class DBusInterfaceImpl extends org.gtk.gobject.Object implements DBusInterface {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DBusInterfaceImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

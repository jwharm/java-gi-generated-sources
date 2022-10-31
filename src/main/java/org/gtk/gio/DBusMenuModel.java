package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DBusMenuModel} is an implementation of {@link MenuModel} that can be used
 * as a proxy for a menu model that is exported over D-Bus with
 * g_dbus_connection_export_menu_model().
 */
public class DBusMenuModel extends org.gtk.gio.MenuModel {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusMenuModel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public DBusMenuModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DBusMenuModel if its GType is a (or inherits from) "GDBusMenuModel".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DBusMenuModel" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusMenuModel", a ClassCastException will be thrown.
     */
    public static DBusMenuModel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusMenuModel"))) {
            return new DBusMenuModel(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusMenuModel");
        }
    }
    
    /**
     * Obtains a {@link DBusMenuModel} for the menu model which is exported
     * at the given {@code bus_name} and {@code object_path}.
     * <p>
     * The thread default main context is taken at the time of this call.
     * All signals on the menu model (and any linked models) are reported
     * with respect to this context.  All calls on the returned menu model
     * (and linked models) must also originate from this same context, with
     * the thread default main context unchanged.
     * @param connection a {@link DBusConnection}
     * @param busName the bus name which exports the menu model
     *     or {@code null} if {@code connection} is not a message bus connection
     * @param objectPath the object path at which the menu model is exported
     * @return a {@link DBusMenuModel} object. Free with
     *     g_object_unref().
     */
    public static @NotNull org.gtk.gio.DBusMenuModel get(@NotNull org.gtk.gio.DBusConnection connection, @Nullable java.lang.String busName, @NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_menu_model_get.invokeExact(
                    connection.handle(),
                    (Addressable) (busName == null ? MemoryAddress.NULL : Interop.allocateNativeString(busName)),
                    Interop.allocateNativeString(objectPath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusMenuModel(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_menu_model_get = Interop.downcallHandle(
            "g_dbus_menu_model_get",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}

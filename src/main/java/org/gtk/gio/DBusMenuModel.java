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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DBusMenuModel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusMenuModel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusMenuModel> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusMenuModel(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_menu_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
    public static org.gtk.gio.DBusMenuModel get(org.gtk.gio.DBusConnection connection, @Nullable java.lang.String busName, java.lang.String objectPath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_menu_model_get.invokeExact(
                    connection.handle(),
                    (Addressable) (busName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(busName, null)),
                    Marshal.stringToAddress.marshal(objectPath, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusMenuModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusMenuModel.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * A {@link DBusMenuModel.Builder} object constructs a {@link DBusMenuModel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusMenuModel.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.MenuModel.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DBusMenuModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusMenuModel}.
         * @return A new instance of {@code DBusMenuModel} with the properties 
         *         that were set in the Builder object.
         */
        public DBusMenuModel build() {
            return (DBusMenuModel) org.gtk.gobject.GObject.newWithProperties(
                DBusMenuModel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_menu_model_get_type = Interop.downcallHandle(
            "g_dbus_menu_model_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_dbus_menu_model_get = Interop.downcallHandle(
            "g_dbus_menu_model_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}

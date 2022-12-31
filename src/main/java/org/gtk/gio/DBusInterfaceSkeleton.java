package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Abstract base class for D-Bus interfaces on the service side.
 * @version 2.30
 */
public class DBusInterfaceSkeleton extends org.gtk.gobject.GObject implements org.gtk.gio.DBusInterface {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceSkeleton";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DBusInterfaceSkeleton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusInterfaceSkeleton(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusInterfaceSkeleton> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusInterfaceSkeleton(input, ownership);
    
    /**
     * Exports {@code interface_} at {@code object_path} on {@code connection}.
     * <p>
     * This can be called multiple times to export the same {@code interface_}
     * onto multiple connections however the {@code object_path} provided must be
     * the same for all connections.
     * <p>
     * Use g_dbus_interface_skeleton_unexport() to unexport the object.
     * @param connection A {@link DBusConnection} to export {@code interface_} on.
     * @param objectPath The path to export the interface at.
     * @return {@code true} if the interface was exported on {@code connection}, otherwise {@code false} with
     * {@code error} set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean export(org.gtk.gio.DBusConnection connection, java.lang.String objectPath) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_interface_skeleton_export.invokeExact(
                    handle(),
                    connection.handle(),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * If {@code interface_} has outstanding changes, request for these changes to be
     * emitted immediately.
     * <p>
     * For example, an exported D-Bus interface may queue up property
     * changes and emit the
     * {@code org.freedesktop.DBus.Properties.PropertiesChanged}
     * signal later (e.g. in an idle handler). This technique is useful
     * for collapsing multiple property changes into one.
     */
    public void flush() {
        try {
            DowncallHandles.g_dbus_interface_skeleton_flush.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the first connection that {@code interface_} is exported on, if any.
     * @return A {@link DBusConnection} or {@code null} if {@code interface_} is
     * not exported anywhere. Do not free, the object belongs to {@code interface_}.
     */
    public @Nullable org.gtk.gio.DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_connection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets a list of the connections that {@code interface_} is exported on.
     * @return A list of
     *   all the connections that {@code interface_} is exported on. The returned
     *   list should be freed with g_list_free() after each element has
     *   been freed with g_object_unref().
     */
    public org.gtk.glib.List getConnections() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_connections.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the {@link DBusInterfaceSkeletonFlags} that describes what the behavior
     * of {@code interface_}
     * @return One or more flags from the {@link DBusInterfaceSkeletonFlags} enumeration.
     */
    public org.gtk.gio.DBusInterfaceSkeletonFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_interface_skeleton_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterfaceSkeletonFlags(RESULT);
    }
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by {@code interface_}.
     * @return A {@link DBusInterfaceInfo} (never {@code null}). Do not free.
     */
    public org.gtk.gio.DBusInterfaceInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DBusInterfaceInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the object path that {@code interface_} is exported on, if any.
     * @return A string owned by {@code interface_} or {@code null} if {@code interface_} is not exported
     * anywhere. Do not free, the string belongs to {@code interface_}.
     */
    public @Nullable java.lang.String getObjectPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_object_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets all D-Bus properties for {@code interface_}.
     * @return A {@link org.gtk.glib.Variant} of type
     * ['a{sv}'][G-VARIANT-TYPE-VARDICT:CAPS].
     * Free with g_variant_unref().
     */
    public org.gtk.glib.Variant getProperties() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_properties.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the interface vtable for the D-Bus interface implemented by
     * {@code interface_}. The returned function pointers should expect {@code interface_}
     * itself to be passed as {@code user_data}.
     * @return A {@link DBusInterfaceVTable} (never {@code null}).
     */
    public org.gtk.gio.DBusInterfaceVTable getVtable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_vtable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DBusInterfaceVTable.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Checks if {@code interface_} is exported on {@code connection}.
     * @param connection A {@link DBusConnection}.
     * @return {@code true} if {@code interface_} is exported on {@code connection}, {@code false} otherwise.
     */
    public boolean hasConnection(org.gtk.gio.DBusConnection connection) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_interface_skeleton_has_connection.invokeExact(
                    handle(),
                    connection.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets flags describing what the behavior of {@code skeleton} should be.
     * @param flags Flags from the {@link DBusInterfaceSkeletonFlags} enumeration.
     */
    public void setFlags(org.gtk.gio.DBusInterfaceSkeletonFlags flags) {
        try {
            DowncallHandles.g_dbus_interface_skeleton_set_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops exporting {@code interface_} on all connections it is exported on.
     * <p>
     * To unexport {@code interface_} from only a single connection, use
     * g_dbus_interface_skeleton_unexport_from_connection()
     */
    public void unexport() {
        try {
            DowncallHandles.g_dbus_interface_skeleton_unexport.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops exporting {@code interface_} on {@code connection}.
     * <p>
     * To stop exporting on all connections the interface is exported on,
     * use g_dbus_interface_skeleton_unexport().
     * @param connection A {@link DBusConnection}.
     */
    public void unexportFromConnection(org.gtk.gio.DBusConnection connection) {
        try {
            DowncallHandles.g_dbus_interface_skeleton_unexport_from_connection.invokeExact(
                    handle(),
                    connection.handle());
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
            RESULT = (long) DowncallHandles.g_dbus_interface_skeleton_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface GAuthorizeMethod {
        boolean run(org.gtk.gio.DBusMethodInvocation invocation);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDBusInterfaceSkeleton, MemoryAddress invocation) {
            var RESULT = run((org.gtk.gio.DBusMethodInvocation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(invocation)), org.gtk.gio.DBusMethodInvocation.fromAddress).marshal(invocation, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GAuthorizeMethod.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a method is invoked by a remote caller and used to
     * determine if the method call is authorized.
     * <p>
     * Note that this signal is emitted in a thread dedicated to
     * handling the method call so handlers are allowed to perform
     * blocking IO. This means that it is appropriate to call e.g.
     * <a href="http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html#polkit-authority-check-authorization-sync">polkit_authority_check_authorization_sync()</a>
     * with the
     * <a href="http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html#POLKIT-CHECK-AUTHORIZATION-FLAGS-ALLOW-USER-INTERACTION:CAPS">POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION</a>
     * flag set.
     * <p>
     * If {@code false} is returned then no further handlers are run and the
     * signal handler must take a reference to {@code invocation} and finish
     * handling the call (e.g. return an error via
     * g_dbus_method_invocation_return_error()).
     * <p>
     * Otherwise, if {@code true} is returned, signal emission continues. If no
     * handlers return {@code false}, then the method is dispatched. If
     * {@code interface} has an enclosing {@link DBusObjectSkeleton}, then the
     * {@link DBusObjectSkeleton}::authorize-method signal handlers run before
     * the handlers for this signal.
     * <p>
     * The default class handler just returns {@code true}.
     * <p>
     * Please note that the common case is optimized: if no signals
     * handlers are connected and the default class handler isn't
     * overridden (for both {@code interface} and the enclosing
     * {@link DBusObjectSkeleton}, if any) and {@link DBusInterfaceSkeleton}:g-flags does
     * not have the
     * {@link DBusInterfaceSkeletonFlags#HANDLE_METHOD_INVOCATIONS_IN_THREAD}
     * flags set, no dedicated thread is ever used and the call will be
     * handled in the same thread as the object that {@code interface} belongs
     * to was exported in.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusInterfaceSkeleton.GAuthorizeMethod> onGAuthorizeMethod(DBusInterfaceSkeleton.GAuthorizeMethod handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("g-authorize-method"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DBusInterfaceSkeleton.Builder} object constructs a {@link DBusInterfaceSkeleton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusInterfaceSkeleton.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DBusInterfaceSkeleton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusInterfaceSkeleton}.
         * @return A new instance of {@code DBusInterfaceSkeleton} with the properties 
         *         that were set in the Builder object.
         */
        public DBusInterfaceSkeleton build() {
            return (DBusInterfaceSkeleton) org.gtk.gobject.GObject.newWithProperties(
                DBusInterfaceSkeleton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Flags from the {@link DBusInterfaceSkeletonFlags} enumeration.
         * @param gFlags The value for the {@code g-flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGFlags(org.gtk.gio.DBusInterfaceSkeletonFlags gFlags) {
            names.add("g-flags");
            values.add(org.gtk.gobject.Value.create(gFlags));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_interface_skeleton_export = Interop.downcallHandle(
            "g_dbus_interface_skeleton_export",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_flush = Interop.downcallHandle(
            "g_dbus_interface_skeleton_flush",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_connection = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_connection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_connections = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_connections",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_flags = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_info = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_object_path = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_object_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_properties = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_properties",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_vtable = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_vtable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_has_connection = Interop.downcallHandle(
            "g_dbus_interface_skeleton_has_connection",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_set_flags = Interop.downcallHandle(
            "g_dbus_interface_skeleton_set_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_unexport = Interop.downcallHandle(
            "g_dbus_interface_skeleton_unexport",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_unexport_from_connection = Interop.downcallHandle(
            "g_dbus_interface_skeleton_unexport_from_connection",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_type = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}

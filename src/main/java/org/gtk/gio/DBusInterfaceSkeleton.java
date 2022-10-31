package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Abstract base class for D-Bus interfaces on the service side.
 * @version 2.30
 */
public class DBusInterfaceSkeleton extends org.gtk.gobject.Object implements org.gtk.gio.DBusInterface {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceSkeleton";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    @ApiStatus.Internal
    public DBusInterfaceSkeleton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DBusInterfaceSkeleton if its GType is a (or inherits from) "GDBusInterfaceSkeleton".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DBusInterfaceSkeleton" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusInterfaceSkeleton", a ClassCastException will be thrown.
     */
    public static DBusInterfaceSkeleton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusInterfaceSkeleton"))) {
            return new DBusInterfaceSkeleton(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusInterfaceSkeleton");
        }
    }
    
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
    public boolean export(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String objectPath) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_interface_skeleton_export.invokeExact(
                    handle(),
                    connection.handle(),
                    Interop.allocateNativeString(objectPath), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
        return new org.gtk.gio.DBusConnection(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets a list of the connections that {@code interface_} is exported on.
     * @return A list of
     *   all the connections that {@code interface_} is exported on. The returned
     *   list should be freed with g_list_free() after each element has
     *   been freed with g_object_unref().
     */
    public @NotNull org.gtk.glib.List getConnections() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_connections.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the {@link DBusInterfaceSkeletonFlags} that describes what the behavior
     * of {@code interface_}
     * @return One or more flags from the {@link DBusInterfaceSkeletonFlags} enumeration.
     */
    public @NotNull org.gtk.gio.DBusInterfaceSkeletonFlags getFlags() {
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
    public @NotNull org.gtk.gio.DBusInterfaceInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_info.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterfaceInfo(Refcounted.get(RESULT, false));
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
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets all D-Bus properties for {@code interface_}.
     * @return A {@link org.gtk.glib.Variant} of type
     * ['a{sv}'][G-VARIANT-TYPE-VARDICT:CAPS].
     * Free with g_variant_unref().
     */
    public @NotNull org.gtk.glib.Variant getProperties() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_properties.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the interface vtable for the D-Bus interface implemented by
     * {@code interface_}. The returned function pointers should expect {@code interface_}
     * itself to be passed as {@code user_data}.
     * @return A {@link DBusInterfaceVTable} (never {@code null}).
     */
    public @NotNull org.gtk.gio.DBusInterfaceVTable getVtable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_skeleton_get_vtable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterfaceVTable(Refcounted.get(RESULT, false));
    }
    
    /**
     * Checks if {@code interface_} is exported on {@code connection}.
     * @param connection A {@link DBusConnection}.
     * @return {@code true} if {@code interface_} is exported on {@code connection}, {@code false} otherwise.
     */
    public boolean hasConnection(@NotNull org.gtk.gio.DBusConnection connection) {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_interface_skeleton_has_connection.invokeExact(
                    handle(),
                    connection.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets flags describing what the behavior of {@code skeleton} should be.
     * @param flags Flags from the {@link DBusInterfaceSkeletonFlags} enumeration.
     */
    public void setFlags(@NotNull org.gtk.gio.DBusInterfaceSkeletonFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
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
    public void unexportFromConnection(@NotNull org.gtk.gio.DBusConnection connection) {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        try {
            DowncallHandles.g_dbus_interface_skeleton_unexport_from_connection.invokeExact(
                    handle(),
                    connection.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface GAuthorizeMethod {
        boolean signalReceived(DBusInterfaceSkeleton source, @NotNull org.gtk.gio.DBusMethodInvocation invocation);
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
     */
    public Signal<DBusInterfaceSkeleton.GAuthorizeMethod> onGAuthorizeMethod(DBusInterfaceSkeleton.GAuthorizeMethod handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("g-authorize-method"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusInterfaceSkeleton.Callbacks.class, "signalDBusInterfaceSkeletonGAuthorizeMethod",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusInterfaceSkeleton.GAuthorizeMethod>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_interface_skeleton_export = Interop.downcallHandle(
            "g_dbus_interface_skeleton_export",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_flush = Interop.downcallHandle(
            "g_dbus_interface_skeleton_flush",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_connection = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_connection",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_connections = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_connections",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_flags = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_info = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_object_path = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_object_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_properties = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_properties",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_get_vtable = Interop.downcallHandle(
            "g_dbus_interface_skeleton_get_vtable",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_has_connection = Interop.downcallHandle(
            "g_dbus_interface_skeleton_has_connection",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_set_flags = Interop.downcallHandle(
            "g_dbus_interface_skeleton_set_flags",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_unexport = Interop.downcallHandle(
            "g_dbus_interface_skeleton_unexport",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_skeleton_unexport_from_connection = Interop.downcallHandle(
            "g_dbus_interface_skeleton_unexport_from_connection",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalDBusInterfaceSkeletonGAuthorizeMethod(MemoryAddress source, MemoryAddress invocation, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DBusInterfaceSkeleton.GAuthorizeMethod) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DBusInterfaceSkeleton(Refcounted.get(source)), new org.gtk.gio.DBusMethodInvocation(Refcounted.get(invocation, false)));
        }
    }
}

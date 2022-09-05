package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Abstract base class for D-Bus interfaces on the service side.
 */
public class DBusInterfaceSkeleton extends org.gtk.gobject.Object implements DBusInterface {

    public DBusInterfaceSkeleton(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DBusInterfaceSkeleton */
    public static DBusInterfaceSkeleton castFrom(org.gtk.gobject.Object gobject) {
        return new DBusInterfaceSkeleton(gobject.getProxy());
    }
    
    /**
     * Exports @interface_ at @object_path on @connection.
     * 
     * This can be called multiple times to export the same @interface_
     * onto multiple connections however the @object_path provided must be
     * the same for all connections.
     * 
     * Use g_dbus_interface_skeleton_unexport() to unexport the object.
     */
    public boolean export(DBusConnection connection, java.lang.String objectPath) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_export(HANDLE(), connection.HANDLE(), Interop.getAllocator().allocateUtf8String(objectPath), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * If @interface_ has outstanding changes, request for these changes to be
     * emitted immediately.
     * 
     * For example, an exported D-Bus interface may queue up property
     * changes and emit the
     * `org.freedesktop.DBus.Properties.PropertiesChanged`
     * signal later (e.g. in an idle handler). This technique is useful
     * for collapsing multiple property changes into one.
     */
    public void flush() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_flush(HANDLE());
    }
    
    /**
     * Gets the first connection that @interface_ is exported on, if any.
     */
    public DBusConnection getConnection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_get_connection(HANDLE());
        return new DBusConnection(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets a list of the connections that @interface_ is exported on.
     */
    public org.gtk.glib.List getConnections() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_get_connections(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the #GDBusInterfaceSkeletonFlags that describes what the behavior
     * of @interface_
     */
    public int getFlags() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_get_flags(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by @interface_.
     */
    public DBusInterfaceInfo getInfo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_get_info(HANDLE());
        return new DBusInterfaceInfo(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the object path that @interface_ is exported on, if any.
     */
    public java.lang.String getObjectPath() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_get_object_path(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets all D-Bus properties for @interface_.
     */
    public org.gtk.glib.Variant getProperties() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_get_properties(HANDLE());
        return new org.gtk.glib.Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the interface vtable for the D-Bus interface implemented by
     * @interface_. The returned function pointers should expect @interface_
     * itself to be passed as @user_data.
     */
    public DBusInterfaceVTable getVtable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_get_vtable(HANDLE());
        return new DBusInterfaceVTable(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Checks if @interface_ is exported on @connection.
     */
    public boolean hasConnection(DBusConnection connection) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_has_connection(HANDLE(), connection.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets flags describing what the behavior of @skeleton should be.
     */
    public void setFlags(int flags) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_set_flags(HANDLE(), flags);
    }
    
    /**
     * Stops exporting @interface_ on all connections it is exported on.
     * 
     * To unexport @interface_ from only a single connection, use
     * g_dbus_interface_skeleton_unexport_from_connection()
     */
    public void unexport() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_unexport(HANDLE());
    }
    
    /**
     * Stops exporting @interface_ on @connection.
     * 
     * To stop exporting on all connections the interface is exported on,
     * use g_dbus_interface_skeleton_unexport().
     */
    public void unexportFromConnection(DBusConnection connection) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_interface_skeleton_unexport_from_connection(HANDLE(), connection.HANDLE());
    }
    
    @FunctionalInterface
    public interface GAuthorizeMethodHandler {
        boolean signalReceived(DBusInterfaceSkeleton source, DBusMethodInvocation invocation);
    }
    
    /**
     * Emitted when a method is invoked by a remote caller and used to
     * determine if the method call is authorized.
     * 
     * Note that this signal is emitted in a thread dedicated to
     * handling the method call so handlers are allowed to perform
     * blocking IO. This means that it is appropriate to call e.g.
     * [polkit_authority_check_authorization_sync()](http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html#polkit-authority-check-authorization-sync)
     * with the
     * [POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION](http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html#POLKIT-CHECK-AUTHORIZATION-FLAGS-ALLOW-USER-INTERACTION:CAPS)
     * flag set.
     * 
     * If %FALSE is returned then no further handlers are run and the
     * signal handler must take a reference to @invocation and finish
     * handling the call (e.g. return an error via
     * g_dbus_method_invocation_return_error()).
     * 
     * Otherwise, if %TRUE is returned, signal emission continues. If no
     * handlers return %FALSE, then the method is dispatched. If
     * @interface has an enclosing #GDBusObjectSkeleton, then the
     * #GDBusObjectSkeleton::authorize-method signal handlers run before
     * the handlers for this signal.
     * 
     * The default class handler just returns %TRUE.
     * 
     * Please note that the common case is optimized: if no signals
     * handlers are connected and the default class handler isn't
     * overridden (for both @interface and the enclosing
     * #GDBusObjectSkeleton, if any) and #GDBusInterfaceSkeleton:g-flags does
     * not have the
     * %G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD
     * flags set, no dedicated thread is ever used and the call will be
     * handled in the same thread as the object that @interface belongs
     * to was exported in.
     */
    public void onGAuthorizeMethod(GAuthorizeMethodHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusInterfaceSkeletonGAuthorizeMethod", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("g-authorize-method"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

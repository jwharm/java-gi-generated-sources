package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Abstract base class for D-Bus interfaces on the service side.
 */
public class DBusInterfaceSkeleton extends org.gtk.gobject.Object implements DBusInterface {

    public DBusInterfaceSkeleton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusInterfaceSkeleton */
    public static DBusInterfaceSkeleton castFrom(org.gtk.gobject.Object gobject) {
        return new DBusInterfaceSkeleton(gobject.getReference());
    }
    
    /**
     * Exports {@code interface_} at {@code object_path} on {@code connection}.
     * <p>
     * This can be called multiple times to export the same {@code interface_}
     * onto multiple connections however the {@code object_path} provided must be
     * the same for all connections.
     * <p>
     * Use g_dbus_interface_skeleton_unexport() to unexport the object.
     */
    public boolean export(DBusConnection connection, java.lang.String objectPath) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_interface_skeleton_export(handle(), connection.handle(), Interop.allocateNativeString(objectPath).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
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
        gtk_h.g_dbus_interface_skeleton_flush(handle());
    }
    
    /**
     * Gets the first connection that {@code interface_} is exported on, if any.
     */
    public DBusConnection getConnection() {
        var RESULT = gtk_h.g_dbus_interface_skeleton_get_connection(handle());
        return new DBusConnection(References.get(RESULT, false));
    }
    
    /**
     * Gets a list of the connections that {@code interface_} is exported on.
     */
    public org.gtk.glib.List getConnections() {
        var RESULT = gtk_h.g_dbus_interface_skeleton_get_connections(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the {@link DBusInterfaceSkeletonFlags} that describes what the behavior
     * of {@code interface_}
     */
    public int getFlags() {
        var RESULT = gtk_h.g_dbus_interface_skeleton_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by {@code interface_}.
     */
    public DBusInterfaceInfo getInfo() {
        var RESULT = gtk_h.g_dbus_interface_skeleton_get_info(handle());
        return new DBusInterfaceInfo(References.get(RESULT, false));
    }
    
    /**
     * Gets the object path that {@code interface_} is exported on, if any.
     */
    public java.lang.String getObjectPath() {
        var RESULT = gtk_h.g_dbus_interface_skeleton_get_object_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets all D-Bus properties for {@code interface_}.
     */
    public org.gtk.glib.Variant getProperties() {
        var RESULT = gtk_h.g_dbus_interface_skeleton_get_properties(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Gets the interface vtable for the D-Bus interface implemented by
     * {@code interface_}. The returned function pointers should expect {@code interface_}
     * itself to be passed as {@code user_data}.
     */
    public DBusInterfaceVTable getVtable() {
        var RESULT = gtk_h.g_dbus_interface_skeleton_get_vtable(handle());
        return new DBusInterfaceVTable(References.get(RESULT, false));
    }
    
    /**
     * Checks if {@code interface_} is exported on {@code connection}.
     */
    public boolean hasConnection(DBusConnection connection) {
        var RESULT = gtk_h.g_dbus_interface_skeleton_has_connection(handle(), connection.handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets flags describing what the behavior of {@code skeleton} should be.
     */
    public void setFlags(int flags) {
        gtk_h.g_dbus_interface_skeleton_set_flags(handle(), flags);
    }
    
    /**
     * Stops exporting {@code interface_} on all connections it is exported on.
     * <p>
     * To unexport {@code interface_} from only a single connection, use
     * g_dbus_interface_skeleton_unexport_from_connection()
     */
    public void unexport() {
        gtk_h.g_dbus_interface_skeleton_unexport(handle());
    }
    
    /**
     * Stops exporting {@code interface_} on {@code connection}.
     * <p>
     * To stop exporting on all connections the interface is exported on,
     * use g_dbus_interface_skeleton_unexport().
     */
    public void unexportFromConnection(DBusConnection connection) {
        gtk_h.g_dbus_interface_skeleton_unexport_from_connection(handle(), connection.handle());
    }
    
    @FunctionalInterface
    public interface GAuthorizeMethodHandler {
        boolean signalReceived(DBusInterfaceSkeleton source, DBusMethodInvocation invocation);
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
     * If <code>false</code> is returned then no further handlers are run and the
     * signal handler must take a reference to {@code invocation} and finish
     * handling the call (e.g. return an error via
     * g_dbus_method_invocation_return_error()).
     * <p>
     * Otherwise, if <code>true</code> is returned, signal emission continues. If no
     * handlers return <code>false</code>, then the method is dispatched. If
     * {@code interface} has an enclosing {@link DBusObjectSkeleton}, then the
     * {@link DBusObjectSkeleton}::authorize-method signal handlers run before
     * the handlers for this signal.
     * <p>
     * The default class handler just returns <code>true</code>.
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
    public SignalHandle onGAuthorizeMethod(GAuthorizeMethodHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusInterfaceSkeletonGAuthorizeMethod", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("g-authorize-method").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

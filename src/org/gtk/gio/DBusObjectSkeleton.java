package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link DBusObjectSkeleton} instance is essentially a group of D-Bus
 * interfaces. The set of exported interfaces on the object may be
 * dynamic and change at runtime.
 * <p>
 * This type is intended to be used with {@link DBusObjectManager}.
 */
public class DBusObjectSkeleton extends org.gtk.gobject.Object implements DBusObject {

    public DBusObjectSkeleton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusObjectSkeleton */
    public static DBusObjectSkeleton castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectSkeleton(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String objectPath) {
        Reference RESULT = References.get(gtk_h.g_dbus_object_skeleton_new(Interop.allocateNativeString(objectPath).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusObjectSkeleton}.
     */
    public DBusObjectSkeleton(java.lang.String objectPath) {
        super(constructNew(objectPath));
    }
    
    /**
     * Adds {@code interface_} to {@code object}.
     * <p>
     * If {@code object} already contains a {@link DBusInterfaceSkeleton} with the same
     * interface name, it is removed before {@code interface_} is added.
     * <p>
     * Note that {@code object} takes its own reference on {@code interface_} and holds
     * it until removed.
     */
    public void addInterface(DBusInterfaceSkeleton interface_) {
        gtk_h.g_dbus_object_skeleton_add_interface(handle(), interface_.handle());
    }
    
    /**
     * This method simply calls g_dbus_interface_skeleton_flush() on all
     * interfaces belonging to {@code object}. See that method for when flushing
     * is useful.
     */
    public void flush() {
        gtk_h.g_dbus_object_skeleton_flush(handle());
    }
    
    /**
     * Removes {@code interface_} from {@code object}.
     */
    public void removeInterface(DBusInterfaceSkeleton interface_) {
        gtk_h.g_dbus_object_skeleton_remove_interface(handle(), interface_.handle());
    }
    
    /**
     * Removes the {@link DBusInterface} with {@code interface_name} from {@code object}.
     * <p>
     * If no D-Bus interface of the given interface exists, this function
     * does nothing.
     */
    public void removeInterfaceByName(java.lang.String interfaceName) {
        gtk_h.g_dbus_object_skeleton_remove_interface_by_name(handle(), Interop.allocateNativeString(interfaceName).handle());
    }
    
    /**
     * Sets the object path for {@code object}.
     */
    public void setObjectPath(java.lang.String objectPath) {
        gtk_h.g_dbus_object_skeleton_set_object_path(handle(), Interop.allocateNativeString(objectPath).handle());
    }
    
    @FunctionalInterface
    public interface AuthorizeMethodHandler {
        boolean signalReceived(DBusObjectSkeleton source, DBusInterfaceSkeleton interface_, DBusMethodInvocation invocation);
    }
    
    /**
     * Emitted when a method is invoked by a remote caller and used to
     * determine if the method call is authorized.
     * <p>
     * This signal is like {@link DBusInterfaceSkeleton}'s
     * {@link DBusInterfaceSkeleton}::g-authorize-method signal,
     * except that it is for the enclosing object.
     * <p>
     * The default class handler just returns {@code true}.
     */
    public SignalHandle onAuthorizeMethod(AuthorizeMethodHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("authorize-method").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectSkeleton.class, "__signalDBusObjectSkeletonAuthorizeMethod",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalDBusObjectSkeletonAuthorizeMethod(MemoryAddress source, MemoryAddress interface_, MemoryAddress invocation, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (DBusObjectSkeleton.AuthorizeMethodHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DBusObjectSkeleton(References.get(source)), new DBusInterfaceSkeleton(References.get(interface_, false)), new DBusMethodInvocation(References.get(invocation, false)));
    }
    
}

package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GDBusObjectSkeleton instance is essentially a group of D-Bus
 * interfaces. The set of exported interfaces on the object may be
 * dynamic and change at runtime.
 * 
 * This type is intended to be used with #GDBusObjectManager.
 */
public class DBusObjectSkeleton extends org.gtk.gobject.Object implements DBusObject {

    public DBusObjectSkeleton(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusObjectSkeleton */
    public static DBusObjectSkeleton castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectSkeleton(gobject.getReference());
    }
    
    /**
     * Creates a new #GDBusObjectSkeleton.
     */
    public DBusObjectSkeleton(java.lang.String objectPath) {
        super(References.get(gtk_h.g_dbus_object_skeleton_new(Interop.allocateNativeString(objectPath).handle()), true));
    }
    
    /**
     * Adds @interface_ to @object.
     * 
     * If @object already contains a #GDBusInterfaceSkeleton with the same
     * interface name, it is removed before @interface_ is added.
     * 
     * Note that @object takes its own reference on @interface_ and holds
     * it until removed.
     */
    public void addInterface(DBusInterfaceSkeleton interface_) {
        gtk_h.g_dbus_object_skeleton_add_interface(handle(), interface_.handle());
    }
    
    /**
     * This method simply calls g_dbus_interface_skeleton_flush() on all
     * interfaces belonging to @object. See that method for when flushing
     * is useful.
     */
    public void flush() {
        gtk_h.g_dbus_object_skeleton_flush(handle());
    }
    
    /**
     * Removes @interface_ from @object.
     */
    public void removeInterface(DBusInterfaceSkeleton interface_) {
        gtk_h.g_dbus_object_skeleton_remove_interface(handle(), interface_.handle());
    }
    
    /**
     * Removes the #GDBusInterface with @interface_name from @object.
     * 
     * If no D-Bus interface of the given interface exists, this function
     * does nothing.
     */
    public void removeInterfaceByName(java.lang.String interfaceName) {
        gtk_h.g_dbus_object_skeleton_remove_interface_by_name(handle(), Interop.allocateNativeString(interfaceName).handle());
    }
    
    /**
     * Sets the object path for @object.
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
     * 
     * This signal is like #GDBusInterfaceSkeleton's
     * #GDBusInterfaceSkeleton::g-authorize-method signal,
     * except that it is for the enclosing object.
     * 
     * The default class handler just returns %TRUE.
     */
    public void onAuthorizeMethod(AuthorizeMethodHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectSkeletonAuthorizeMethod", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("authorize-method").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

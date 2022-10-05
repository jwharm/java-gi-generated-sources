package org.gtk.gio;

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

    public DBusObjectSkeleton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusObjectSkeleton */
    public static DBusObjectSkeleton castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectSkeleton(gobject.refcounted());
    }
    
    static final MethodHandle g_dbus_object_skeleton_new = Interop.downcallHandle(
        "g_dbus_object_skeleton_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String objectPath) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_object_skeleton_new.invokeExact(Interop.allocateNativeString(objectPath).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link DBusObjectSkeleton}.
     */
    public DBusObjectSkeleton(java.lang.String objectPath) {
        super(constructNew(objectPath));
    }
    
    static final MethodHandle g_dbus_object_skeleton_add_interface = Interop.downcallHandle(
        "g_dbus_object_skeleton_add_interface",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            g_dbus_object_skeleton_add_interface.invokeExact(handle(), interface_.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_object_skeleton_flush = Interop.downcallHandle(
        "g_dbus_object_skeleton_flush",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * This method simply calls g_dbus_interface_skeleton_flush() on all
     * interfaces belonging to {@code object}. See that method for when flushing
     * is useful.
     */
    public void flush() {
        try {
            g_dbus_object_skeleton_flush.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_object_skeleton_remove_interface = Interop.downcallHandle(
        "g_dbus_object_skeleton_remove_interface",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code interface_} from {@code object}.
     */
    public void removeInterface(DBusInterfaceSkeleton interface_) {
        try {
            g_dbus_object_skeleton_remove_interface.invokeExact(handle(), interface_.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_object_skeleton_remove_interface_by_name = Interop.downcallHandle(
        "g_dbus_object_skeleton_remove_interface_by_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the {@link DBusInterface} with {@code interface_name} from {@code object}.
     * <p>
     * If no D-Bus interface of the given interface exists, this function
     * does nothing.
     */
    public void removeInterfaceByName(java.lang.String interfaceName) {
        try {
            g_dbus_object_skeleton_remove_interface_by_name.invokeExact(handle(), Interop.allocateNativeString(interfaceName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_object_skeleton_set_object_path = Interop.downcallHandle(
        "g_dbus_object_skeleton_set_object_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the object path for {@code object}.
     */
    public void setObjectPath(java.lang.String objectPath) {
        try {
            g_dbus_object_skeleton_set_object_path.invokeExact(handle(), Interop.allocateNativeString(objectPath).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("authorize-method").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectSkeleton.Callbacks.class, "signalDBusObjectSkeletonAuthorizeMethod",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalDBusObjectSkeletonAuthorizeMethod(MemoryAddress source, MemoryAddress interface_, MemoryAddress invocation, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusObjectSkeleton.AuthorizeMethodHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DBusObjectSkeleton(Refcounted.get(source)), new DBusInterfaceSkeleton(Refcounted.get(interface_, false)), new DBusMethodInvocation(Refcounted.get(invocation, false)));
        }
        
    }
}

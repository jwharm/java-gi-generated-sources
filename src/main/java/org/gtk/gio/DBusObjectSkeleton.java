package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link DBusObjectSkeleton} instance is essentially a group of D-Bus
 * interfaces. The set of exported interfaces on the object may be
 * dynamic and change at runtime.
 * <p>
 * This type is intended to be used with {@link DBusObjectManager}.
 * @version 2.30
 */
public class DBusObjectSkeleton extends org.gtk.gobject.Object implements org.gtk.gio.DBusObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.DBusObjectSkeletonPrivate.getMemoryLayout().withName("priv")
    ).withName("GDBusObjectSkeleton");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public DBusObjectSkeleton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusObjectSkeleton */
    public static DBusObjectSkeleton castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectSkeleton(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_dbus_object_skeleton_new.invokeExact(Interop.allocateNativeString(objectPath)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusObjectSkeleton}.
     * @param objectPath An object path.
     */
    public DBusObjectSkeleton(@NotNull java.lang.String objectPath) {
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
     * @param interface_ A {@link DBusInterfaceSkeleton}.
     */
    public void addInterface(@NotNull org.gtk.gio.DBusInterfaceSkeleton interface_) {
        java.util.Objects.requireNonNull(interface_, "Parameter 'interface_' must not be null");
        try {
            DowncallHandles.g_dbus_object_skeleton_add_interface.invokeExact(handle(), interface_.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This method simply calls g_dbus_interface_skeleton_flush() on all
     * interfaces belonging to {@code object}. See that method for when flushing
     * is useful.
     */
    public void flush() {
        try {
            DowncallHandles.g_dbus_object_skeleton_flush.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code interface_} from {@code object}.
     * @param interface_ A {@link DBusInterfaceSkeleton}.
     */
    public void removeInterface(@NotNull org.gtk.gio.DBusInterfaceSkeleton interface_) {
        java.util.Objects.requireNonNull(interface_, "Parameter 'interface_' must not be null");
        try {
            DowncallHandles.g_dbus_object_skeleton_remove_interface.invokeExact(handle(), interface_.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the {@link DBusInterface} with {@code interface_name} from {@code object}.
     * <p>
     * If no D-Bus interface of the given interface exists, this function
     * does nothing.
     * @param interfaceName A D-Bus interface name.
     */
    public void removeInterfaceByName(@NotNull java.lang.String interfaceName) {
        java.util.Objects.requireNonNull(interfaceName, "Parameter 'interfaceName' must not be null");
        try {
            DowncallHandles.g_dbus_object_skeleton_remove_interface_by_name.invokeExact(handle(), Interop.allocateNativeString(interfaceName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the object path for {@code object}.
     * @param objectPath A valid D-Bus object path.
     */
    public void setObjectPath(@NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        try {
            DowncallHandles.g_dbus_object_skeleton_set_object_path.invokeExact(handle(), Interop.allocateNativeString(objectPath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AuthorizeMethod {
        boolean signalReceived(DBusObjectSkeleton source, @NotNull org.gtk.gio.DBusInterfaceSkeleton interface_, @NotNull org.gtk.gio.DBusMethodInvocation invocation);
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
    public Signal<DBusObjectSkeleton.AuthorizeMethod> onAuthorizeMethod(DBusObjectSkeleton.AuthorizeMethod handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("authorize-method"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectSkeleton.Callbacks.class, "signalDBusObjectSkeletonAuthorizeMethod",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusObjectSkeleton.AuthorizeMethod>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_object_skeleton_new = Interop.downcallHandle(
            "g_dbus_object_skeleton_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_skeleton_add_interface = Interop.downcallHandle(
            "g_dbus_object_skeleton_add_interface",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_skeleton_flush = Interop.downcallHandle(
            "g_dbus_object_skeleton_flush",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_skeleton_remove_interface = Interop.downcallHandle(
            "g_dbus_object_skeleton_remove_interface",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_skeleton_remove_interface_by_name = Interop.downcallHandle(
            "g_dbus_object_skeleton_remove_interface_by_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_skeleton_set_object_path = Interop.downcallHandle(
            "g_dbus_object_skeleton_set_object_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalDBusObjectSkeletonAuthorizeMethod(MemoryAddress source, MemoryAddress interface_, MemoryAddress invocation, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DBusObjectSkeleton.AuthorizeMethod) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DBusObjectSkeleton(Refcounted.get(source)), new org.gtk.gio.DBusInterfaceSkeleton(Refcounted.get(interface_, false)), new org.gtk.gio.DBusMethodInvocation(Refcounted.get(invocation, false)));
        }
    }
}

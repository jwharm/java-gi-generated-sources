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
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectSkeleton";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a DBusObjectSkeleton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusObjectSkeleton(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DBusObjectSkeleton if its GType is a (or inherits from) "GDBusObjectSkeleton".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DBusObjectSkeleton} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusObjectSkeleton", a ClassCastException will be thrown.
     */
    public static DBusObjectSkeleton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusObjectSkeleton"))) {
            return new DBusObjectSkeleton(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusObjectSkeleton");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String objectPath) {
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_skeleton_new.invokeExact(
                    Interop.allocateNativeString(objectPath));
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
        super(constructNew(objectPath), Ownership.FULL);
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
            DowncallHandles.g_dbus_object_skeleton_add_interface.invokeExact(
                    handle(),
                    interface_.handle());
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
            DowncallHandles.g_dbus_object_skeleton_flush.invokeExact(
                    handle());
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
            DowncallHandles.g_dbus_object_skeleton_remove_interface.invokeExact(
                    handle(),
                    interface_.handle());
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
            DowncallHandles.g_dbus_object_skeleton_remove_interface_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(interfaceName));
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
            DowncallHandles.g_dbus_object_skeleton_set_object_path.invokeExact(
                    handle(),
                    Interop.allocateNativeString(objectPath));
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
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
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_add_interface = Interop.downcallHandle(
            "g_dbus_object_skeleton_add_interface",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_flush = Interop.downcallHandle(
            "g_dbus_object_skeleton_flush",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_remove_interface = Interop.downcallHandle(
            "g_dbus_object_skeleton_remove_interface",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_remove_interface_by_name = Interop.downcallHandle(
            "g_dbus_object_skeleton_remove_interface_by_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_set_object_path = Interop.downcallHandle(
            "g_dbus_object_skeleton_set_object_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalDBusObjectSkeletonAuthorizeMethod(MemoryAddress source, MemoryAddress interface_, MemoryAddress invocation, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DBusObjectSkeleton.AuthorizeMethod) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DBusObjectSkeleton(source, Ownership.UNKNOWN), new org.gtk.gio.DBusInterfaceSkeleton(interface_, Ownership.NONE), new org.gtk.gio.DBusMethodInvocation(invocation, Ownership.NONE));
        }
    }
}

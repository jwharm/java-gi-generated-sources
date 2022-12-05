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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DBusObjectSkeleton.getType())) {
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_object_skeleton_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface AuthorizeMethod {
        boolean signalReceived(DBusObjectSkeleton sourceDBusObjectSkeleton, @NotNull org.gtk.gio.DBusInterfaceSkeleton interface_, @NotNull org.gtk.gio.DBusMethodInvocation invocation);
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
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusObjectSkeleton.AuthorizeMethod>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link DBusObjectSkeleton.Build} object constructs a {@link DBusObjectSkeleton} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DBusObjectSkeleton} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusObjectSkeleton} using {@link DBusObjectSkeleton#castFrom}.
         * @return A new instance of {@code DBusObjectSkeleton} with the properties 
         *         that were set in the Build object.
         */
        public DBusObjectSkeleton construct() {
            return DBusObjectSkeleton.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DBusObjectSkeleton.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The object path where the object is exported.
         * @param gObjectPath The value for the {@code g-object-path} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGObjectPath(java.lang.String gObjectPath) {
            names.add("g-object-path");
            values.add(org.gtk.gobject.Value.create(gObjectPath));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_object_skeleton_new = Interop.downcallHandle(
            "g_dbus_object_skeleton_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_add_interface = Interop.downcallHandle(
            "g_dbus_object_skeleton_add_interface",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_flush = Interop.downcallHandle(
            "g_dbus_object_skeleton_flush",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_remove_interface = Interop.downcallHandle(
            "g_dbus_object_skeleton_remove_interface",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_remove_interface_by_name = Interop.downcallHandle(
            "g_dbus_object_skeleton_remove_interface_by_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_set_object_path = Interop.downcallHandle(
            "g_dbus_object_skeleton_set_object_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_skeleton_get_type = Interop.downcallHandle(
            "g_dbus_object_skeleton_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalDBusObjectSkeletonAuthorizeMethod(MemoryAddress sourceDBusObjectSkeleton, MemoryAddress interface_, MemoryAddress invocation, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DBusObjectSkeleton.AuthorizeMethod) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DBusObjectSkeleton(sourceDBusObjectSkeleton, Ownership.NONE), new org.gtk.gio.DBusInterfaceSkeleton(interface_, Ownership.NONE), new org.gtk.gio.DBusMethodInvocation(invocation, Ownership.NONE));
        }
    }
}

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
public class DBusObjectSkeleton extends org.gtk.gobject.GObject implements org.gtk.gio.DBusObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectSkeleton";
    
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
     * Create a DBusObjectSkeleton proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusObjectSkeleton(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectSkeleton> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectSkeleton(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String objectPath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_skeleton_new.invokeExact(
                    Marshal.stringToAddress.marshal(objectPath, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusObjectSkeleton}.
     * @param objectPath An object path.
     */
    public DBusObjectSkeleton(java.lang.String objectPath) {
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
    public void addInterface(org.gtk.gio.DBusInterfaceSkeleton interface_) {
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
    public void removeInterface(org.gtk.gio.DBusInterfaceSkeleton interface_) {
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
    public void removeInterfaceByName(java.lang.String interfaceName) {
        try {
            DowncallHandles.g_dbus_object_skeleton_remove_interface_by_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(interfaceName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the object path for {@code object}.
     * @param objectPath A valid D-Bus object path.
     */
    public void setObjectPath(java.lang.String objectPath) {
        try {
            DowncallHandles.g_dbus_object_skeleton_set_object_path.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(objectPath, null));
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
            RESULT = (long) DowncallHandles.g_dbus_object_skeleton_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface AuthorizeMethod {
        boolean run(org.gtk.gio.DBusInterfaceSkeleton interface_, org.gtk.gio.DBusMethodInvocation invocation);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDBusObjectSkeleton, MemoryAddress interface_, MemoryAddress invocation) {
            var RESULT = run((org.gtk.gio.DBusInterfaceSkeleton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interface_)), org.gtk.gio.DBusInterfaceSkeleton.fromAddress).marshal(interface_, Ownership.NONE), (org.gtk.gio.DBusMethodInvocation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(invocation)), org.gtk.gio.DBusMethodInvocation.fromAddress).marshal(invocation, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AuthorizeMethod.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("authorize-method"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DBusObjectSkeleton.Builder} object constructs a {@link DBusObjectSkeleton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusObjectSkeleton.Builder#build()}. 
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
         * Finish building the {@link DBusObjectSkeleton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusObjectSkeleton}.
         * @return A new instance of {@code DBusObjectSkeleton} with the properties 
         *         that were set in the Builder object.
         */
        public DBusObjectSkeleton build() {
            return (DBusObjectSkeleton) org.gtk.gobject.GObject.newWithProperties(
                DBusObjectSkeleton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The object path where the object is exported.
         * @param gObjectPath The value for the {@code g-object-path} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGObjectPath(java.lang.String gObjectPath) {
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
}

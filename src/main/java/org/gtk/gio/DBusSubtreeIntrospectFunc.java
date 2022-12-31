package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code introspect} function in {@link DBusSubtreeVTable}.
 * <p>
 * Subtrees are flat.  {@code node}, if non-{@code null}, is always exactly one
 * segment of the object path (ie: it never contains a slash).
 * <p>
 * This function should return {@code null} to indicate that there is no object
 * at this node.
 * <p>
 * If this function returns non-{@code null}, the return value is expected to
 * be a {@code null}-terminated array of pointers to {@link DBusInterfaceInfo}
 * structures describing the interfaces implemented by {@code node}.  This
 * array will have g_dbus_interface_info_unref() called on each item
 * before being freed with g_free().
 * <p>
 * The difference between returning {@code null} and an array containing zero
 * items is that the standard DBus interfaces will returned to the
 * remote introspector in the empty array case, but not in the {@code null}
 * case.
 * @version 2.26
 */
@FunctionalInterface
public interface DBusSubtreeIntrospectFunc {
    @Nullable org.gtk.gio.DBusInterfaceInfo[] run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String node);

    @ApiStatus.Internal default void upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress node, MemoryAddress userData) {
        run((org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(node, null));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DBusSubtreeIntrospectFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

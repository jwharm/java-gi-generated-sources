package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code dispatch} function in {@link DBusSubtreeVTable}.
 * <p>
 * Subtrees are flat.  {@code node}, if non-{@code null}, is always exactly one
 * segment of the object path (ie: it never contains a slash).
 * @version 2.26
 */
@FunctionalInterface
public interface DBusSubtreeDispatchFunc {
    @Nullable org.gtk.gio.DBusInterfaceVTable run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String node, java.lang.foreign.MemoryAddress outUserData);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress node, MemoryAddress outUserData, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(node, null), outUserData);
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DBusSubtreeDispatchFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

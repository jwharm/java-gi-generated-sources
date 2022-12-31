package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code method_call} function in {@link DBusInterfaceVTable}.
 * @version 2.26
 */
@FunctionalInterface
public interface DBusInterfaceMethodCallFunc {
    void run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.gio.DBusMethodInvocation invocation);

    @ApiStatus.Internal default void upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress methodName, MemoryAddress parameters, MemoryAddress invocation, MemoryAddress userData) {
        run((org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(methodName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, Ownership.NONE), (org.gtk.gio.DBusMethodInvocation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(invocation)), org.gtk.gio.DBusMethodInvocation.fromAddress).marshal(invocation, Ownership.FULL));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DBusInterfaceMethodCallFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code method_call} function in {@link DBusInterfaceVTable}.
 * @version 2.26
 */
/**
 * Functional interface declaration of the {@code DBusInterfaceMethodCallFunc} callback.
 */
@FunctionalInterface
public interface DBusInterfaceMethodCallFunc {

    /**
     * The type of the {@code method_call} function in {@link DBusInterfaceVTable}.
     * @version 2.26
     */
    void run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, org.gtk.gio.DBusMethodInvocation invocation);
    
    @ApiStatus.Internal default void upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress methodName, MemoryAddress parameters, MemoryAddress invocation, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run((org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(methodName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, null), (org.gtk.gio.DBusMethodInvocation) Interop.register(invocation, org.gtk.gio.DBusMethodInvocation.fromAddress).marshal(invocation, null));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DBusInterfaceMethodCallFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

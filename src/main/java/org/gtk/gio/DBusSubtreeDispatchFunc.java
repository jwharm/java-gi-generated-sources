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
/**
 * Functional interface declaration of the {@code DBusSubtreeDispatchFunc} callback.
 */
@FunctionalInterface
public interface DBusSubtreeDispatchFunc {

    /**
     * The type of the {@code dispatch} function in {@link DBusSubtreeVTable}.
     * <p>
     * Subtrees are flat.  {@code node}, if non-{@code null}, is always exactly one
     * segment of the object path (ie: it never contains a slash).
     * @version 2.26
     */
    @Nullable org.gtk.gio.DBusInterfaceVTable run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String node, java.lang.foreign.MemoryAddress outUserData);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress node, MemoryAddress outUserData, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run((org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(node, null), outUserData);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DBusSubtreeDispatchFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

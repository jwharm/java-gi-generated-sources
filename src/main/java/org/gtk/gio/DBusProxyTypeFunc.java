package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function signature for a function used to determine the {@link org.gtk.glib.Type} to
 * use for an interface proxy (if {@code interface_name} is not {@code null}) or
 * object proxy (if {@code interface_name} is {@code null}).
 * <p>
 * This function is called in the
 * [thread-default main loop][g-main-context-push-thread-default]
 * that {@code manager} was constructed in.
 * @version 2.30
 */
/**
 * Functional interface declaration of the {@code DBusProxyTypeFunc} callback.
 */
@FunctionalInterface
public interface DBusProxyTypeFunc {

    /**
     * Function signature for a function used to determine the {@link org.gtk.glib.Type} to
     * use for an interface proxy (if {@code interface_name} is not {@code null}) or
     * object proxy (if {@code interface_name} is {@code null}).
     * <p>
     * This function is called in the
     * [thread-default main loop][g-main-context-push-thread-default]
     * that {@code manager} was constructed in.
     * @version 2.30
     */
    org.gtk.glib.Type run(org.gtk.gio.DBusObjectManagerClient manager, java.lang.String objectPath, @Nullable java.lang.String interfaceName);
    
    @ApiStatus.Internal default long upcall(MemoryAddress manager, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run((org.gtk.gio.DBusObjectManagerClient) Interop.register(manager, org.gtk.gio.DBusObjectManagerClient.fromAddress).marshal(manager, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null));
            return RESULT.getValue().longValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DBusProxyTypeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

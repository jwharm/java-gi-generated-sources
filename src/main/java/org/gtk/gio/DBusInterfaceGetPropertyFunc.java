package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code get_property} function in {@link DBusInterfaceVTable}.
 * @version 2.26
 */
/**
 * Functional interface declaration of the {@code DBusInterfaceGetPropertyFunc} callback.
 */
@FunctionalInterface
public interface DBusInterfaceGetPropertyFunc {

    /**
     * The type of the {@code get_property} function in {@link DBusInterfaceVTable}.
     * @version 2.26
     */
    org.gtk.glib.Variant run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName, PointerProxy<org.gtk.glib.Error> error);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress propertyName, MemoryAddress error, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run((org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(propertyName, null), new PointerProxy<org.gtk.glib.Error>(error, org.gtk.glib.Error.fromAddress));
            RESULT.yieldOwnership();
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
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DBusInterfaceGetPropertyFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

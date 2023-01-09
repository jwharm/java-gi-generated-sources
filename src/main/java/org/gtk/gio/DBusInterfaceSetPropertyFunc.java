package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code set_property} function in {@link DBusInterfaceVTable}.
 * @version 2.26
 */
/**
 * Functional interface declaration of the {@code DBusInterfaceSetPropertyFunc} callback.
 */
@FunctionalInterface
public interface DBusInterfaceSetPropertyFunc {

    /**
     * The type of the {@code set_property} function in {@link DBusInterfaceVTable}.
     * @version 2.26
     */
    boolean run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName, org.gtk.glib.Variant value, PointerProxy<org.gtk.glib.Error> error);
    
    @ApiStatus.Internal default int upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress propertyName, MemoryAddress value, MemoryAddress error, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run((org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(propertyName, null), org.gtk.glib.Variant.fromAddress.marshal(value, null), new PointerProxy<org.gtk.glib.Error>(error, org.gtk.glib.Error.fromAddress));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DBusInterfaceSetPropertyFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

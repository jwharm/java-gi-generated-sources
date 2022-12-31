package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code get_property} function in {@link DBusInterfaceVTable}.
 * @version 2.26
 */
@FunctionalInterface
public interface DBusInterfaceGetPropertyFunc {
    org.gtk.glib.Variant run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName, PointerProxy<org.gtk.glib.Error> error);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress propertyName, MemoryAddress error, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(propertyName, null), new PointerProxy<org.gtk.glib.Error>(error, org.gtk.glib.Error.fromAddress));
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DBusInterfaceGetPropertyFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

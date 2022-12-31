package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code set_property} function in {@link DBusInterfaceVTable}.
 * @version 2.26
 */
@FunctionalInterface
public interface DBusInterfaceSetPropertyFunc {
    boolean run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName, org.gtk.glib.Variant value, PointerProxy<org.gtk.glib.Error> error);

    @ApiStatus.Internal default int upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress propertyName, MemoryAddress value, MemoryAddress error, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(propertyName, null), org.gtk.glib.Variant.fromAddress.marshal(value, Ownership.NONE), new PointerProxy<org.gtk.glib.Error>(error, org.gtk.glib.Error.fromAddress));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DBusInterfaceSetPropertyFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

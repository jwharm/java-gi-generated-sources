package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Signature for callback function used in g_dbus_connection_signal_subscribe().
 * @version 2.26
 */
@FunctionalInterface
public interface DBusSignalCallback {
    void run(org.gtk.gio.DBusConnection connection, @Nullable java.lang.String senderName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String signalName, org.gtk.glib.Variant parameters);

    @ApiStatus.Internal default void upcall(MemoryAddress connection, MemoryAddress senderName, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress userData) {
        run((org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(senderName, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(signalName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DBusSignalCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

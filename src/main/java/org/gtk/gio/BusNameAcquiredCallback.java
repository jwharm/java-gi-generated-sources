package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when the name is acquired.
 * @version 2.26
 */
@FunctionalInterface
public interface BusNameAcquiredCallback {
    void run(org.gtk.gio.DBusConnection connection, java.lang.String name);

    @ApiStatus.Internal default void upcall(MemoryAddress connection, MemoryAddress name, MemoryAddress userData) {
        run((org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(name, null));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BusNameAcquiredCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

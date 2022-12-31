package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code enumerate} function in {@link DBusSubtreeVTable}.
 * <p>
 * This function is called when generating introspection data and also
 * when preparing to dispatch incoming messages in the event that the
 * {@link DBusSubtreeFlags#DISPATCH_TO_UNENUMERATED_NODES} flag is not
 * specified (ie: to verify that the object path is valid).
 * <p>
 * Hierarchies are not supported; the items that you return should not
 * contain the {@code /} character.
 * <p>
 * The return value will be freed with g_strfreev().
 * @version 2.26
 */
@FunctionalInterface
public interface DBusSubtreeEnumerateFunc {
    java.lang.String[] run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath);

    @ApiStatus.Internal default void upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress userData) {
        run((org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DBusConnection.fromAddress).marshal(connection, Ownership.NONE), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DBusSubtreeEnumerateFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

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
/**
 * Functional interface declaration of the {@code DBusSubtreeEnumerateFunc} callback.
 */
@FunctionalInterface
public interface DBusSubtreeEnumerateFunc {

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
    java.lang.String[] run(org.gtk.gio.DBusConnection connection, java.lang.String sender, java.lang.String objectPath);
    
    @ApiStatus.Internal default void upcall(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run((org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), Marshal.addressToString.marshal(sender, null), Marshal.addressToString.marshal(objectPath, null));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DBusSubtreeEnumerateFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

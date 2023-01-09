package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Signature for callback function used in g_dbus_connection_signal_subscribe().
 * @version 2.26
 */
/**
 * Functional interface declaration of the {@code DBusSignalCallback} callback.
 */
@FunctionalInterface
public interface DBusSignalCallback {

    /**
     * Signature for callback function used in g_dbus_connection_signal_subscribe().
     * @version 2.26
     */
    void run(org.gtk.gio.DBusConnection connection, @Nullable java.lang.String senderName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String signalName, org.gtk.glib.Variant parameters);
    
    @ApiStatus.Internal default void upcall(MemoryAddress connection, MemoryAddress senderName, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run((org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), Marshal.addressToString.marshal(senderName, null), Marshal.addressToString.marshal(objectPath, null), Marshal.addressToString.marshal(interfaceName, null), Marshal.addressToString.marshal(signalName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, null));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DBusSignalCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

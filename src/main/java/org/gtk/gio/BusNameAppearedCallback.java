package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when the name being watched is known to have to have an owner.
 * @version 2.26
 */
/**
 * Functional interface declaration of the {@code BusNameAppearedCallback} callback.
 */
@FunctionalInterface
public interface BusNameAppearedCallback {

    /**
     * Invoked when the name being watched is known to have to have an owner.
     * @version 2.26
     */
    void run(org.gtk.gio.DBusConnection connection, java.lang.String name, java.lang.String nameOwner);
    
    @ApiStatus.Internal default void upcall(MemoryAddress connection, MemoryAddress name, MemoryAddress nameOwner, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run((org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), Marshal.addressToString.marshal(name, null), Marshal.addressToString.marshal(nameOwner, null));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BusNameAppearedCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the message handler function.
 */
@FunctionalInterface
public interface ScannerMsgFunc {
    void run(org.gtk.glib.Scanner scanner, java.lang.String message, boolean error);

    @ApiStatus.Internal default void upcall(MemoryAddress scanner, MemoryAddress message, int error) {
        run(org.gtk.glib.Scanner.fromAddress.marshal(scanner, Ownership.NONE), Marshal.addressToString.marshal(message, null), Marshal.integerToBoolean.marshal(error, null).booleanValue());
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ScannerMsgFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

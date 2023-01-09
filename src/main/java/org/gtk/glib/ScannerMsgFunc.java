package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the message handler function.
 */
/**
 * Functional interface declaration of the {@code ScannerMsgFunc} callback.
 */
@FunctionalInterface
public interface ScannerMsgFunc {

    /**
     * Specifies the type of the message handler function.
     */
    void run(org.gtk.glib.Scanner scanner, java.lang.String message, boolean error);
    
    @ApiStatus.Internal default void upcall(MemoryAddress scanner, MemoryAddress message, int error) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run(org.gtk.glib.Scanner.fromAddress.marshal(scanner, null), Marshal.addressToString.marshal(message, null), Marshal.integerToBoolean.marshal(error, null).booleanValue());
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ScannerMsgFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the print handler functions.
 * These are called with the complete formatted string to output.
 */
/**
 * Functional interface declaration of the {@code PrintFunc} callback.
 */
@FunctionalInterface
public interface PrintFunc {

    /**
     * Specifies the type of the print handler functions.
     * These are called with the complete formatted string to output.
     */
    void run(java.lang.String string);
    
    @ApiStatus.Internal default void upcall(MemoryAddress string) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run(Marshal.addressToString.marshal(string, null));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrintFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

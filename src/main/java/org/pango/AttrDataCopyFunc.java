package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of a function that can duplicate user data for an attribute.
 */
/**
 * Functional interface declaration of the {@code AttrDataCopyFunc} callback.
 */
@FunctionalInterface
public interface AttrDataCopyFunc {

    /**
     * Type of a function that can duplicate user data for an attribute.
     */
    @Nullable java.lang.foreign.MemoryAddress run();
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress userData) {
        var RESULT = run();
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AttrDataCopyFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

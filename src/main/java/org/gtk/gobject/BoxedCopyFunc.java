package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function is provided by the user and should produce a copy
 * of the passed in boxed structure.
 */
/**
 * Functional interface declaration of the {@code BoxedCopyFunc} callback.
 */
@FunctionalInterface
public interface BoxedCopyFunc {

    /**
     * This function is provided by the user and should produce a copy
     * of the passed in boxed structure.
     */
    java.lang.foreign.MemoryAddress run(java.lang.foreign.MemoryAddress boxed);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress boxed) {
        var RESULT = run(boxed);
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BoxedCopyFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

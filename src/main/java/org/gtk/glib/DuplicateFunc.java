package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of functions that are used to 'duplicate' an object.
 * What this means depends on the context, it could just be
 * incrementing the reference count, if {@code data} is a ref-counted
 * object.
 */
/**
 * Functional interface declaration of the {@code DuplicateFunc} callback.
 */
@FunctionalInterface
public interface DuplicateFunc {

    /**
     * The type of functions that are used to 'duplicate' an object.
     * What this means depends on the context, it could just be
     * incrementing the reference count, if {@code data} is a ref-counted
     * object.
     */
    @Nullable java.lang.foreign.MemoryAddress run();
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress data, MemoryAddress userData) {
        var RESULT = run();
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DuplicateFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of a function used to test two values for
 * equality. The function should return {@code true} if both values are equal
 * and {@code false} otherwise.
 */
/**
 * Functional interface declaration of the {@code EqualFunc} callback.
 */
@FunctionalInterface
public interface EqualFunc {

    /**
     * Specifies the type of a function used to test two values for
     * equality. The function should return {@code true} if both values are equal
     * and {@code false} otherwise.
     */
    boolean run(@Nullable java.lang.foreign.MemoryAddress a, @Nullable java.lang.foreign.MemoryAddress b);
    
    @ApiStatus.Internal default int upcall(MemoryAddress a, MemoryAddress b) {
        var RESULT = run(a, b);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EqualFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

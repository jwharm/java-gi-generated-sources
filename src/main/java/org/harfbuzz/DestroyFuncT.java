package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for destroy user-data callbacks.
 */
/**
 * Functional interface declaration of the {@code DestroyFuncT} callback.
 */
@FunctionalInterface
public interface DestroyFuncT {

    /**
     * A virtual method for destroy user-data callbacks.
     */
    void run(@Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default void upcall(MemoryAddress userData) {
        run(userData);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DestroyFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

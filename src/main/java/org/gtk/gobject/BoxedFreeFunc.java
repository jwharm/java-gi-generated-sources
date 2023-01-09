package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function is provided by the user and should free the boxed
 * structure passed.
 */
/**
 * Functional interface declaration of the {@code BoxedFreeFunc} callback.
 */
@FunctionalInterface
public interface BoxedFreeFunc {

    /**
     * This function is provided by the user and should free the boxed
     * structure passed.
     */
    void run(java.lang.foreign.MemoryAddress boxed);
    
    @ApiStatus.Internal default void upcall(MemoryAddress boxed) {
        run(boxed);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BoxedFreeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

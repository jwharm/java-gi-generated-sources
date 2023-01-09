package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Free any dynamically allocated data.  The subclass must call the superclass'
 * free.
 */
/**
 * Functional interface declaration of the {@code GLAllocationParamsFreeFunc} callback.
 */
@FunctionalInterface
public interface GLAllocationParamsFreeFunc {

    /**
     * Free any dynamically allocated data.  The subclass must call the superclass'
     * free.
     */
    void run(@Nullable java.lang.foreign.MemoryAddress params);
    
    @ApiStatus.Internal default void upcall(MemoryAddress params) {
        run(params);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GLAllocationParamsFreeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

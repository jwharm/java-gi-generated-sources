package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prototype for animation targets based on user callbacks.
 * @version 1.0
 */
/**
 * Functional interface declaration of the {@code AnimationTargetFunc} callback.
 */
@FunctionalInterface
public interface AnimationTargetFunc {

    /**
     * Prototype for animation targets based on user callbacks.
     * @version 1.0
     */
    void run(double value);
    
    @ApiStatus.Internal default void upcall(double value, MemoryAddress userData) {
        run(value);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AnimationTargetFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

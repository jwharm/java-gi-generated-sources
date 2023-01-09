package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Task function, see gst_task_pool_push().
 */
/**
 * Functional interface declaration of the {@code TaskPoolFunction} callback.
 */
@FunctionalInterface
public interface TaskPoolFunction {

    /**
     * Task function, see gst_task_pool_push().
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
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TaskPoolFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

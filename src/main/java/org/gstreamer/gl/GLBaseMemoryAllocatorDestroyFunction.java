package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Destroy any resources allocated throughout the lifetime of {@code mem}
 * @version 1.8
 */
/**
 * Functional interface declaration of the {@code GLBaseMemoryAllocatorDestroyFunction} callback.
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorDestroyFunction {

    /**
     * Destroy any resources allocated throughout the lifetime of {@code mem}
     * @version 1.8
     */
    void run(org.gstreamer.gl.GLBaseMemory mem);
    
    @ApiStatus.Internal default void upcall(MemoryAddress mem) {
        run(org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(mem, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GLBaseMemoryAllocatorDestroyFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

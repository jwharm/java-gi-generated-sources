package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * As this virtual method is called with an OpenGL context current, use this
 * function to allocate and OpenGL resources needed for your application
 * @version 1.8
 */
/**
 * Functional interface declaration of the {@code GLBaseMemoryAllocatorCreateFunction} callback.
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorCreateFunction {

    /**
     * As this virtual method is called with an OpenGL context current, use this
     * function to allocate and OpenGL resources needed for your application
     * @version 1.8
     */
    boolean run(org.gstreamer.gl.GLBaseMemory mem);
    
    @ApiStatus.Internal default int upcall(MemoryAddress mem) {
        var RESULT = run(org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(mem, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GLBaseMemoryAllocatorCreateFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

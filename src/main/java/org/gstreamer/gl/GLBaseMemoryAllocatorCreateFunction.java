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
@FunctionalInterface
public interface GLBaseMemoryAllocatorCreateFunction {
    boolean run(org.gstreamer.gl.GLBaseMemory mem);

    @ApiStatus.Internal default int upcall(MemoryAddress mem) {
        var RESULT = run(org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(mem, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GLBaseMemoryAllocatorCreateFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

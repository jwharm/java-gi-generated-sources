package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Destroy any resources allocated throughout the lifetime of {@code mem}
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorDestroyFunction {
    void run(org.gstreamer.gl.GLBaseMemory mem);

    @ApiStatus.Internal default void upcall(MemoryAddress mem) {
        run(org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(mem, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GLBaseMemoryAllocatorDestroyFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

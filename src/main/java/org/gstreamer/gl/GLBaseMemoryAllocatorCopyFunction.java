package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Also see gst_memory_copy();
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorCopyFunction {
    org.gstreamer.gl.GLBaseMemory run(org.gstreamer.gl.GLBaseMemory mem, long offset, long size);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress mem, long offset, long size) {
        var RESULT = run(org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(mem, Ownership.NONE), offset, size);
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GLBaseMemoryAllocatorCopyFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

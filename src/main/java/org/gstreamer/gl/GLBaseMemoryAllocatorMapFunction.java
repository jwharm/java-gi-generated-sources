package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Also see gst_memory_map();
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorMapFunction {
    @Nullable java.lang.foreign.MemoryAddress run(org.gstreamer.gl.GLBaseMemory mem, org.gstreamer.gst.MapInfo info, long maxsize);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress mem, MemoryAddress info, long maxsize) {
        var RESULT = run(org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(mem, Ownership.NONE), org.gstreamer.gst.MapInfo.fromAddress.marshal(info, Ownership.NONE), maxsize);
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GLBaseMemoryAllocatorMapFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

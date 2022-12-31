package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Also see gst_memory_unmap();
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorUnmapFunction {
    void run(org.gstreamer.gl.GLBaseMemory mem, org.gstreamer.gst.MapInfo info);

    @ApiStatus.Internal default void upcall(MemoryAddress mem, MemoryAddress info) {
        run(org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(mem, Ownership.NONE), org.gstreamer.gst.MapInfo.fromAddress.marshal(info, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GLBaseMemoryAllocatorUnmapFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

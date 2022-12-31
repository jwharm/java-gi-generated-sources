package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Release the pointer previously retrieved with gst_memory_map() with {@code info}.
 */
@FunctionalInterface
public interface MemoryUnmapFullFunction {
    void run(org.gstreamer.gst.Memory mem, org.gstreamer.gst.MapInfo info);

    @ApiStatus.Internal default void upcall(MemoryAddress mem, MemoryAddress info) {
        run(org.gstreamer.gst.Memory.fromAddress.marshal(mem, Ownership.NONE), org.gstreamer.gst.MapInfo.fromAddress.marshal(info, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MemoryUnmapFullFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

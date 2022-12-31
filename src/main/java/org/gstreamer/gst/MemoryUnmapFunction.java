package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Release the pointer previously retrieved with gst_memory_map().
 */
@FunctionalInterface
public interface MemoryUnmapFunction {
    void run(org.gstreamer.gst.Memory mem);

    @ApiStatus.Internal default void upcall(MemoryAddress mem) {
        run(org.gstreamer.gst.Memory.fromAddress.marshal(mem, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MemoryUnmapFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

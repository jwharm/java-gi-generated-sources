package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Get the memory of {@code mem} that can be accessed according to the mode specified
 * in {@code flags}. The function should return a pointer that contains at least
 * {@code maxsize} bytes.
 */
@FunctionalInterface
public interface MemoryMapFunction {
    @Nullable java.lang.foreign.MemoryAddress run(org.gstreamer.gst.Memory mem, long maxsize, org.gstreamer.gst.MapFlags flags);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress mem, long maxsize, int flags) {
        var RESULT = run(org.gstreamer.gst.Memory.fromAddress.marshal(mem, Ownership.NONE), maxsize, new org.gstreamer.gst.MapFlags(flags));
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MemoryMapFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Get the memory of {@code mem} that can be accessed according to the mode specified
 * in {@code info}'s flags. The function should return a pointer that contains at least
 * {@code maxsize} bytes.
 */
@FunctionalInterface
public interface MemoryMapFullFunction {
    @Nullable java.lang.foreign.MemoryAddress run(org.gstreamer.gst.Memory mem, org.gstreamer.gst.MapInfo info, long maxsize);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress mem, MemoryAddress info, long maxsize) {
        var RESULT = run(org.gstreamer.gst.Memory.fromAddress.marshal(mem, Ownership.NONE), org.gstreamer.gst.MapInfo.fromAddress.marshal(info, Ownership.NONE), maxsize);
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MemoryMapFullFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Share {@code size} bytes from {@code mem} starting at {@code offset} and return them wrapped in a
 * new GstMemory object. If {@code size} is set to -1, all bytes starting at {@code offset} are
 * shared. This function does not make a copy of the bytes in {@code mem}.
 */
@FunctionalInterface
public interface MemoryShareFunction {
    org.gstreamer.gst.Memory run(org.gstreamer.gst.Memory mem, long offset, long size);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress mem, long offset, long size) {
        var RESULT = run(org.gstreamer.gst.Memory.fromAddress.marshal(mem, Ownership.NONE), offset, size);
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MemoryShareFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

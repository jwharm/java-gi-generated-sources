package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Check if {@code mem1} and {@code mem2} occupy contiguous memory and return the offset of
 * {@code mem1} in the parent buffer in {@code offset}.
 */
@FunctionalInterface
public interface MemoryIsSpanFunction {
    boolean run(org.gstreamer.gst.Memory mem1, org.gstreamer.gst.Memory mem2, PointerLong offset);

    @ApiStatus.Internal default int upcall(MemoryAddress mem1, MemoryAddress mem2, MemoryAddress offset) {
        var RESULT = run(org.gstreamer.gst.Memory.fromAddress.marshal(mem1, Ownership.NONE), org.gstreamer.gst.Memory.fromAddress.marshal(mem2, Ownership.NONE), new PointerLong(offset));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MemoryIsSpanFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

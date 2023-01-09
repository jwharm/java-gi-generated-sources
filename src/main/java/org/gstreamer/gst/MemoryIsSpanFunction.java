package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Check if {@code mem1} and {@code mem2} occupy contiguous memory and return the offset of
 * {@code mem1} in the parent buffer in {@code offset}.
 */
/**
 * Functional interface declaration of the {@code MemoryIsSpanFunction} callback.
 */
@FunctionalInterface
public interface MemoryIsSpanFunction {

    /**
     * Check if {@code mem1} and {@code mem2} occupy contiguous memory and return the offset of
     * {@code mem1} in the parent buffer in {@code offset}.
     */
    boolean run(org.gstreamer.gst.Memory mem1, org.gstreamer.gst.Memory mem2, PointerLong offset);
    
    @ApiStatus.Internal default int upcall(MemoryAddress mem1, MemoryAddress mem2, MemoryAddress offset) {
        var RESULT = run(org.gstreamer.gst.Memory.fromAddress.marshal(mem1, null), org.gstreamer.gst.Memory.fromAddress.marshal(mem2, null), new PointerLong(offset));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MemoryIsSpanFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

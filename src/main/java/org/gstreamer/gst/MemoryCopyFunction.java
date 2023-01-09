package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Copy {@code size} bytes from {@code mem} starting at {@code offset} and return them wrapped in a
 * new GstMemory object.
 * If {@code size} is set to -1, all bytes starting at {@code offset} are copied.
 */
/**
 * Functional interface declaration of the {@code MemoryCopyFunction} callback.
 */
@FunctionalInterface
public interface MemoryCopyFunction {

    /**
     * Copy {@code size} bytes from {@code mem} starting at {@code offset} and return them wrapped in a
     * new GstMemory object.
     * If {@code size} is set to -1, all bytes starting at {@code offset} are copied.
     */
    org.gstreamer.gst.Memory run(org.gstreamer.gst.Memory mem, long offset, long size);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress mem, long offset, long size) {
        var RESULT = run(org.gstreamer.gst.Memory.fromAddress.marshal(mem, null), offset, size);
        RESULT.yieldOwnership();
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MemoryCopyFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

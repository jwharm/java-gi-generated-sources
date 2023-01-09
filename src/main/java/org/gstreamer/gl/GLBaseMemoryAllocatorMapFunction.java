package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Also see gst_memory_map();
 * @version 1.8
 */
/**
 * Functional interface declaration of the {@code GLBaseMemoryAllocatorMapFunction} callback.
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorMapFunction {

    /**
     * Also see gst_memory_map();
     * @version 1.8
     */
    @Nullable java.lang.foreign.MemoryAddress run(org.gstreamer.gl.GLBaseMemory mem, org.gstreamer.gst.MapInfo info, long maxsize);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress mem, MemoryAddress info, long maxsize) {
        var RESULT = run(org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(mem, null), org.gstreamer.gst.MapInfo.fromAddress.marshal(info, null), maxsize);
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GLBaseMemoryAllocatorMapFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

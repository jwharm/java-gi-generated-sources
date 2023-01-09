package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Note: not called with a GL context current
 * @version 1.8
 */
/**
 * Functional interface declaration of the {@code GLBaseMemoryAllocatorAllocFunction} callback.
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorAllocFunction {

    /**
     * Note: not called with a GL context current
     * @version 1.8
     */
    org.gstreamer.gl.GLBaseMemory run(org.gstreamer.gl.GLBaseMemoryAllocator allocator, org.gstreamer.gl.GLAllocationParams params);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress allocator, MemoryAddress params) {
        var RESULT = run((org.gstreamer.gl.GLBaseMemoryAllocator) Interop.register(allocator, org.gstreamer.gl.GLBaseMemoryAllocator.fromAddress).marshal(allocator, null), org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(params, null));
        RESULT.yieldOwnership();
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GLBaseMemoryAllocatorAllocFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

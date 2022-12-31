package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Note: not called with a GL context current
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorAllocFunction {
    org.gstreamer.gl.GLBaseMemory run(org.gstreamer.gl.GLBaseMemoryAllocator allocator, org.gstreamer.gl.GLAllocationParams params);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress allocator, MemoryAddress params) {
        var RESULT = run((org.gstreamer.gl.GLBaseMemoryAllocator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(allocator)), org.gstreamer.gl.GLBaseMemoryAllocator.fromAddress).marshal(allocator, Ownership.NONE), org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(params, Ownership.NONE));
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GLBaseMemoryAllocatorAllocFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

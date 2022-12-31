package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Copies the parameters from {@code src} into {@code dest}.  The subclass must compose copy
 * functions from the superclass.
 */
@FunctionalInterface
public interface GLAllocationParamsCopyFunc {
    void run(org.gstreamer.gl.GLAllocationParams src, org.gstreamer.gl.GLAllocationParams dest);

    @ApiStatus.Internal default void upcall(MemoryAddress src, MemoryAddress dest) {
        run(org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(src, Ownership.NONE), org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(dest, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GLAllocationParamsCopyFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

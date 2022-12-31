package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Free any dynamically allocated data.  The subclass must call the superclass'
 * free.
 */
@FunctionalInterface
public interface GLAllocationParamsFreeFunc {
    void run(@Nullable java.lang.foreign.MemoryAddress params);

    @ApiStatus.Internal default void upcall(MemoryAddress params) {
        run(params);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GLAllocationParamsFreeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

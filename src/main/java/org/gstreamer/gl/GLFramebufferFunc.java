package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * callback definition for operating through a {@link GLFramebuffer} object
 */
/**
 * Functional interface declaration of the {@code GLFramebufferFunc} callback.
 */
@FunctionalInterface
public interface GLFramebufferFunc {

    /**
     * callback definition for operating through a {@link GLFramebuffer} object
     */
    boolean run(@Nullable java.lang.foreign.MemoryAddress stuff);
    
    @ApiStatus.Internal default int upcall(MemoryAddress stuff) {
        var RESULT = run(stuff);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GLFramebufferFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

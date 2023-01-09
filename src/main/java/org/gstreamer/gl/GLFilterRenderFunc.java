package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functional interface declaration of the {@code GLFilterRenderFunc} callback.
 */
@FunctionalInterface
public interface GLFilterRenderFunc {

    boolean run(org.gstreamer.gl.GLFilter filter, org.gstreamer.gl.GLMemory inTex);
    
    @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress inTex, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gl.GLFilter) Interop.register(filter, org.gstreamer.gl.GLFilter.fromAddress).marshal(filter, null), org.gstreamer.gl.GLMemory.fromAddress.marshal(inTex, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GLFilterRenderFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

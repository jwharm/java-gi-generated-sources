package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a function to run in the GL thread with {@code context} and {@code data}
 */
/**
 * Functional interface declaration of the {@code GLContextThreadFunc} callback.
 */
@FunctionalInterface
public interface GLContextThreadFunc {

    /**
     * Represents a function to run in the GL thread with {@code context} and {@code data}
     */
    void run(org.gstreamer.gl.GLContext context);
    
    @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress data) {
        run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GLContextThreadFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Copies the parameters from {@code src} into {@code dest}.  The subclass must compose copy
 * functions from the superclass.
 */
/**
 * Functional interface declaration of the {@code GLAllocationParamsCopyFunc} callback.
 */
@FunctionalInterface
public interface GLAllocationParamsCopyFunc {

    /**
     * Copies the parameters from {@code src} into {@code dest}.  The subclass must compose copy
     * functions from the superclass.
     */
    void run(org.gstreamer.gl.GLAllocationParams src, org.gstreamer.gl.GLAllocationParams dest);
    
    @ApiStatus.Internal default void upcall(MemoryAddress src, MemoryAddress dest) {
        run(org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(src, null), org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(dest, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GLAllocationParamsCopyFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

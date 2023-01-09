package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function to be called when the GstEGLImage is destroyed. It should free
 * the associated {@code EGLImage} if necessary
 */
/**
 * Functional interface declaration of the {@code EGLImageDestroyNotify} callback.
 */
@FunctionalInterface
public interface EGLImageDestroyNotify {

    /**
     * Function to be called when the GstEGLImage is destroyed. It should free
     * the associated {@code EGLImage} if necessary
     */
    void run(org.gstreamer.gl.egl.EGLImage image);
    
    @ApiStatus.Internal default void upcall(MemoryAddress image, MemoryAddress data) {
        run(org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(image, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EGLImageDestroyNotify.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

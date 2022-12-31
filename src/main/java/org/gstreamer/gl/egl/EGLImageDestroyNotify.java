package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function to be called when the GstEGLImage is destroyed. It should free
 * the associated {@code EGLImage} if necessary
 */
@FunctionalInterface
public interface EGLImageDestroyNotify {
    void run(org.gstreamer.gl.egl.EGLImage image);

    @ApiStatus.Internal default void upcall(MemoryAddress image, MemoryAddress data) {
        run(org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(image, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EGLImageDestroyNotify.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

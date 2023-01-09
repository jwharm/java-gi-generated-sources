package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functional interface declaration of the {@code VideoGLTextureUpload} callback.
 */
@FunctionalInterface
public interface VideoGLTextureUpload {

    boolean run(org.gstreamer.video.VideoGLTextureUploadMeta meta, PointerInteger textureId);
    
    @ApiStatus.Internal default int upcall(MemoryAddress meta, MemoryAddress textureId) {
        var RESULT = run(org.gstreamer.video.VideoGLTextureUploadMeta.fromAddress.marshal(meta, null), new PointerInteger(textureId));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VideoGLTextureUpload.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

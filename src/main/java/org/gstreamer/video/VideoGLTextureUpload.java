package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface VideoGLTextureUpload {
    boolean run(org.gstreamer.video.VideoGLTextureUploadMeta meta, PointerInteger textureId);

    @ApiStatus.Internal default int upcall(MemoryAddress meta, MemoryAddress textureId) {
        var RESULT = run(org.gstreamer.video.VideoGLTextureUploadMeta.fromAddress.marshal(meta, Ownership.NONE), new PointerInteger(textureId));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VideoGLTextureUpload.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

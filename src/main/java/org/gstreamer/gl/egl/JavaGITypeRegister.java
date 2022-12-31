package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(GLDisplayEGL.getType(), GLDisplayEGL.fromAddress);
        Interop.typeRegister.put(GLDisplayEGLDevice.getType(), GLDisplayEGLDevice.fromAddress);
        Interop.typeRegister.put(GLMemoryEGLAllocator.getType(), GLMemoryEGLAllocator.fromAddress);
    }
}

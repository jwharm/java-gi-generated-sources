package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(GLBaseFilter.getType(), GLBaseFilter.fromAddress);
        Interop.typeRegister.put(GLBaseMemoryAllocator.getType(), GLBaseMemoryAllocator.fromAddress);
        Interop.typeRegister.put(GLBaseSrc.getType(), GLBaseSrc.fromAddress);
        Interop.typeRegister.put(GLBufferAllocator.getType(), GLBufferAllocator.fromAddress);
        Interop.typeRegister.put(GLBufferPool.getType(), GLBufferPool.fromAddress);
        Interop.typeRegister.put(GLColorConvert.getType(), GLColorConvert.fromAddress);
        Interop.typeRegister.put(GLContext.getType(), GLContext.fromAddress);
        Interop.typeRegister.put(GLDisplay.getType(), GLDisplay.fromAddress);
        Interop.typeRegister.put(GLFilter.getType(), GLFilter.fromAddress);
        Interop.typeRegister.put(GLFramebuffer.getType(), GLFramebuffer.fromAddress);
        Interop.typeRegister.put(GLMemoryAllocator.getType(), GLMemoryAllocator.fromAddress);
        Interop.typeRegister.put(GLMemoryPBOAllocator.getType(), GLMemoryPBOAllocator.fromAddress);
        Interop.typeRegister.put(GLOverlayCompositor.getType(), GLOverlayCompositor.fromAddress);
        Interop.typeRegister.put(GLRenderbufferAllocator.getType(), GLRenderbufferAllocator.fromAddress);
        Interop.typeRegister.put(GLSLStage.getType(), GLSLStage.fromAddress);
        Interop.typeRegister.put(GLShader.getType(), GLShader.fromAddress);
        Interop.typeRegister.put(GLUpload.getType(), GLUpload.fromAddress);
        Interop.typeRegister.put(GLViewConvert.getType(), GLViewConvert.fromAddress);
        Interop.typeRegister.put(GLWindow.getType(), GLWindow.fromAddress);
    }
}

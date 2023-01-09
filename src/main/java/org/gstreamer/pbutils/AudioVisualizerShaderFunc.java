package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Functional interface declaration of the {@code AudioVisualizerShaderFunc} callback.
 */
@FunctionalInterface
public interface AudioVisualizerShaderFunc {

    void run(org.gstreamer.pbutils.AudioVisualizer scope, org.gstreamer.video.VideoFrame s, org.gstreamer.video.VideoFrame d);
    
    @ApiStatus.Internal default void upcall(MemoryAddress scope, MemoryAddress s, MemoryAddress d) {
        run((org.gstreamer.pbutils.AudioVisualizer) Interop.register(scope, org.gstreamer.pbutils.AudioVisualizer.fromAddress).marshal(scope, null), org.gstreamer.video.VideoFrame.fromAddress.marshal(s, null), org.gstreamer.video.VideoFrame.fromAddress.marshal(d, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AudioVisualizerShaderFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

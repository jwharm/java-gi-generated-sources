package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface AudioVisualizerShaderFunc {
    void run(org.gstreamer.pbutils.AudioVisualizer scope, org.gstreamer.video.VideoFrame s, org.gstreamer.video.VideoFrame d);

    @ApiStatus.Internal default void upcall(MemoryAddress scope, MemoryAddress s, MemoryAddress d) {
        run((org.gstreamer.pbutils.AudioVisualizer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(scope)), org.gstreamer.pbutils.AudioVisualizer.fromAddress).marshal(scope, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(s, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(d, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AudioVisualizerShaderFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

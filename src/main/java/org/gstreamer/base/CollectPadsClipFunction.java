package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when {@code inbuffer} is received on the pad managed
 * by {@code data} in the collectpad object {@code pads}.
 * <p>
 * The function should use the segment of {@code data} and the negotiated media type on
 * the pad to perform clipping of {@code inbuffer}.
 * <p>
 * This function takes ownership of {@code inbuffer} and should output a buffer in
 * {@code outbuffer} or return {@code null} in {@code outbuffer} if the buffer should be dropped.
 */
/**
 * Functional interface declaration of the {@code CollectPadsClipFunction} callback.
 */
@FunctionalInterface
public interface CollectPadsClipFunction {

    /**
     * A function that will be called when {@code inbuffer} is received on the pad managed
     * by {@code data} in the collectpad object {@code pads}.
     * <p>
     * The function should use the segment of {@code data} and the negotiated media type on
     * the pad to perform clipping of {@code inbuffer}.
     * <p>
     * This function takes ownership of {@code inbuffer} and should output a buffer in
     * {@code outbuffer} or return {@code null} in {@code outbuffer} if the buffer should be dropped.
     */
    org.gstreamer.gst.FlowReturn run(org.gstreamer.base.CollectPads pads, org.gstreamer.base.CollectData data, org.gstreamer.gst.Buffer inbuffer, Out<org.gstreamer.gst.Buffer> outbuffer);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress data, MemoryAddress inbuffer, MemoryAddress outbuffer, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            Out<org.gstreamer.gst.Buffer> outbufferOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(outbuffer, null));
            var RESULT = run((org.gstreamer.base.CollectPads) Interop.register(pads, org.gstreamer.base.CollectPads.fromAddress).marshal(pads, null), org.gstreamer.base.CollectData.fromAddress.marshal(data, null), org.gstreamer.gst.Buffer.fromAddress.marshal(inbuffer, null), outbufferOUT);
            outbuffer.set(Interop.valueLayout.ADDRESS, 0, outbufferOUT.get().handle());
            return RESULT.getValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CollectPadsClipFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

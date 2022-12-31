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
@FunctionalInterface
public interface CollectPadsClipFunction {
    org.gstreamer.gst.FlowReturn run(org.gstreamer.base.CollectPads pads, org.gstreamer.base.CollectData data, org.gstreamer.gst.Buffer inbuffer, Out<org.gstreamer.gst.Buffer> outbuffer);

    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress data, MemoryAddress inbuffer, MemoryAddress outbuffer, MemoryAddress userData) {
        Out<org.gstreamer.gst.Buffer> outbufferOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(outbuffer, Ownership.FULL));
        var RESULT = run((org.gstreamer.base.CollectPads) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pads)), org.gstreamer.base.CollectPads.fromAddress).marshal(pads, Ownership.NONE), org.gstreamer.base.CollectData.fromAddress.marshal(data, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(inbuffer, Ownership.FULL), outbufferOUT);
        outbuffer.set(Interop.valueLayout.ADDRESS, 0, outbufferOUT.get().handle());
        return RESULT.getValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CollectPadsClipFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

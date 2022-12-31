package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when a (considered oldest) buffer can be muxed.
 * If all pads have reached EOS, this function is called with {@code null} {@code buffer}
 * and {@code null} {@code data}.
 */
@FunctionalInterface
public interface CollectPadsBufferFunction {
    org.gstreamer.gst.FlowReturn run(org.gstreamer.base.CollectPads pads, org.gstreamer.base.CollectData data, org.gstreamer.gst.Buffer buffer);

    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress data, MemoryAddress buffer, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.base.CollectPads) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pads)), org.gstreamer.base.CollectPads.fromAddress).marshal(pads, Ownership.NONE), org.gstreamer.base.CollectData.fromAddress.marshal(data, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.FULL));
        return RESULT.getValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CollectPadsBufferFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

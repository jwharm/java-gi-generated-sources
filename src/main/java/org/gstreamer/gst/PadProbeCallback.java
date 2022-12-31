package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback used by gst_pad_add_probe(). Gets called to notify about the current
 * blocking type.
 * <p>
 * The callback is allowed to modify the data pointer in {@code info}.
 */
@FunctionalInterface
public interface PadProbeCallback {
    org.gstreamer.gst.PadProbeReturn run(org.gstreamer.gst.Pad pad, org.gstreamer.gst.PadProbeInfo info);

    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress info, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), org.gstreamer.gst.PadProbeInfo.fromAddress.marshal(info, Ownership.NONE));
        return RESULT.getValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PadProbeCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

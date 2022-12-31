package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function signature to handle a new link on the pad.
 */
@FunctionalInterface
public interface PadLinkFunction {
    org.gstreamer.gst.PadLinkReturn run(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.Pad peer);

    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress parent, MemoryAddress peer) {
        var RESULT = run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gstreamer.gst.GstObject.fromAddress).marshal(parent, Ownership.NONE), (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(peer)), org.gstreamer.gst.Pad.fromAddress).marshal(peer, Ownership.NONE));
        return RESULT.getValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PadLinkFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

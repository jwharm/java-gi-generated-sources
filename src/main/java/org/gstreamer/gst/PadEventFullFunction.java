package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function signature to handle an event for the pad.
 * <p>
 * This variant is for specific elements that will take into account the
 * last downstream flow return (from a pad push), in which case they can
 * return it.
 * @version 1.8
 */
@FunctionalInterface
public interface PadEventFullFunction {
    org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.Event event);

    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress parent, MemoryAddress event) {
        var RESULT = run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gstreamer.gst.GstObject.fromAddress).marshal(parent, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.FULL));
        return RESULT.getValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PadEventFullFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

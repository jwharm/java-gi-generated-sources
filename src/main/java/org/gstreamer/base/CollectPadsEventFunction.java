package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called while processing an event. It takes
 * ownership of the event and is responsible for chaining up (to
 * gst_collect_pads_event_default()) or dropping events (such typical cases
 * being handled by the default handler).
 */
@FunctionalInterface
public interface CollectPadsEventFunction {
    boolean run(org.gstreamer.base.CollectPads pads, org.gstreamer.base.CollectData pad, org.gstreamer.gst.Event event);

    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress pad, MemoryAddress event, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.base.CollectPads) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pads)), org.gstreamer.base.CollectPads.fromAddress).marshal(pads, Ownership.NONE), org.gstreamer.base.CollectData.fromAddress.marshal(pad, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CollectPadsEventFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

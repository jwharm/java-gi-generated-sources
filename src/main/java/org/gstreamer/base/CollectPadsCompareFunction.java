package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function for comparing two timestamps of buffers or newsegments collected on one pad.
 */
@FunctionalInterface
public interface CollectPadsCompareFunction {
    int run(org.gstreamer.base.CollectPads pads, org.gstreamer.base.CollectData data1, org.gstreamer.gst.ClockTime timestamp1, org.gstreamer.base.CollectData data2, org.gstreamer.gst.ClockTime timestamp2);

    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress data1, long timestamp1, MemoryAddress data2, long timestamp2, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.base.CollectPads) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pads)), org.gstreamer.base.CollectPads.fromAddress).marshal(pads, Ownership.NONE), org.gstreamer.base.CollectData.fromAddress.marshal(data1, Ownership.NONE), new org.gstreamer.gst.ClockTime(timestamp1), org.gstreamer.base.CollectData.fromAddress.marshal(data2, Ownership.NONE), new org.gstreamer.gst.ClockTime(timestamp2));
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CollectPadsCompareFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

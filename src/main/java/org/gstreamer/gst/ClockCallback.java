package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The function prototype of the callback.
 */
@FunctionalInterface
public interface ClockCallback {
    boolean run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockTime time, org.gstreamer.gst.ClockID id);

    @ApiStatus.Internal default int upcall(MemoryAddress clock, long time, java.lang.foreign.MemoryAddress id, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clock)), org.gstreamer.gst.Clock.fromAddress).marshal(clock, Ownership.NONE), new org.gstreamer.gst.ClockTime(time), new org.gstreamer.gst.ClockID(id));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClockCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

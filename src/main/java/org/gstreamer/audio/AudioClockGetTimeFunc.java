package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function will be called whenever the current clock time needs to be
 * calculated. If this function returns {@code GST_CLOCK_TIME_NONE}, the last reported
 * time will be returned by the clock.
 */
@FunctionalInterface
public interface AudioClockGetTimeFunc {
    org.gstreamer.gst.ClockTime run(org.gstreamer.gst.Clock clock);

    @ApiStatus.Internal default long upcall(MemoryAddress clock, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clock)), org.gstreamer.gst.Clock.fromAddress).marshal(clock, Ownership.NONE));
        return RESULT.getValue().longValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AudioClockGetTimeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

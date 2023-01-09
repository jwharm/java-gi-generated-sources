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
/**
 * Functional interface declaration of the {@code AudioClockGetTimeFunc} callback.
 */
@FunctionalInterface
public interface AudioClockGetTimeFunc {

    /**
     * This function will be called whenever the current clock time needs to be
     * calculated. If this function returns {@code GST_CLOCK_TIME_NONE}, the last reported
     * time will be returned by the clock.
     */
    org.gstreamer.gst.ClockTime run(org.gstreamer.gst.Clock clock);
    
    @ApiStatus.Internal default long upcall(MemoryAddress clock, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Clock) Interop.register(clock, org.gstreamer.gst.Clock.fromAddress).marshal(clock, null));
        return RESULT.getValue().longValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AudioClockGetTimeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The function prototype of the callback.
 */
/**
 * Functional interface declaration of the {@code ClockCallback} callback.
 */
@FunctionalInterface
public interface ClockCallback {

    /**
     * The function prototype of the callback.
     */
    boolean run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockTime time, org.gstreamer.gst.ClockID id);
    
    @ApiStatus.Internal default int upcall(MemoryAddress clock, long time, java.lang.foreign.MemoryAddress id, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Clock) Interop.register(clock, org.gstreamer.gst.Clock.fromAddress).marshal(clock, null), new org.gstreamer.gst.ClockTime(time), new org.gstreamer.gst.ClockID(id));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ClockCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function for returning a value for a given timestamp.
 */
/**
 * Functional interface declaration of the {@code ControlSourceGetValue} callback.
 */
@FunctionalInterface
public interface ControlSourceGetValue {

    /**
     * Function for returning a value for a given timestamp.
     */
    boolean run(org.gstreamer.gst.ControlSource self, org.gstreamer.gst.ClockTime timestamp, PointerDouble value);
    
    @ApiStatus.Internal default int upcall(MemoryAddress self, long timestamp, MemoryAddress value) {
        var RESULT = run((org.gstreamer.gst.ControlSource) Interop.register(self, org.gstreamer.gst.ControlSource.fromAddress).marshal(self, null), new org.gstreamer.gst.ClockTime(timestamp), new PointerDouble(value));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ControlSourceGetValue.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

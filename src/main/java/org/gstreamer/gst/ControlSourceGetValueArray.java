package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function for returning an array of values starting at a given timestamp.
 */
/**
 * Functional interface declaration of the {@code ControlSourceGetValueArray} callback.
 */
@FunctionalInterface
public interface ControlSourceGetValueArray {

    /**
     * Function for returning an array of values starting at a given timestamp.
     */
    boolean run(org.gstreamer.gst.ControlSource self, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime interval, int nValues, PointerDouble values);
    
    @ApiStatus.Internal default int upcall(MemoryAddress self, long timestamp, long interval, int nValues, MemoryAddress values) {
        var RESULT = run((org.gstreamer.gst.ControlSource) Interop.register(self, org.gstreamer.gst.ControlSource.fromAddress).marshal(self, null), new org.gstreamer.gst.ClockTime(timestamp), new org.gstreamer.gst.ClockTime(interval), nValues, new PointerDouble(values));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ControlSourceGetValueArray.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

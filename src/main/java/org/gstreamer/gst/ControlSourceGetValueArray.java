package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function for returning an array of values starting at a given timestamp.
 */
@FunctionalInterface
public interface ControlSourceGetValueArray {
    boolean run(org.gstreamer.gst.ControlSource self, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime interval, int nValues, PointerDouble values);

    @ApiStatus.Internal default int upcall(MemoryAddress self, long timestamp, long interval, int nValues, MemoryAddress values) {
        var RESULT = run((org.gstreamer.gst.ControlSource) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.gst.ControlSource.fromAddress).marshal(self, Ownership.NONE), new org.gstreamer.gst.ClockTime(timestamp), new org.gstreamer.gst.ClockTime(interval), nValues, new PointerDouble(values));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ControlSourceGetValueArray.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

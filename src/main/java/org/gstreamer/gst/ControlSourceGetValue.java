package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function for returning a value for a given timestamp.
 */
@FunctionalInterface
public interface ControlSourceGetValue {
    boolean run(org.gstreamer.gst.ControlSource self, org.gstreamer.gst.ClockTime timestamp, PointerDouble value);

    @ApiStatus.Internal default int upcall(MemoryAddress self, long timestamp, MemoryAddress value) {
        var RESULT = run((org.gstreamer.gst.ControlSource) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.gst.ControlSource.fromAddress).marshal(self, Ownership.NONE), new org.gstreamer.gst.ClockTime(timestamp), new PointerDouble(value));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ControlSourceGetValue.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

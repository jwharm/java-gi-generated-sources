package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A forward function is called for all internally linked pads, see
 * gst_pad_forward().
 */
@FunctionalInterface
public interface PadForwardFunction {
    boolean run(org.gstreamer.gst.Pad pad);

    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PadForwardFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The prototype of the push and pull activate functions.
 */
@FunctionalInterface
public interface PadActivateModeFunction {
    boolean run(org.gstreamer.gst.Pad pad, org.gstreamer.gst.GstObject parent, org.gstreamer.gst.PadMode mode, boolean active);

    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress parent, int mode, int active) {
        var RESULT = run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gstreamer.gst.GstObject.fromAddress).marshal(parent, Ownership.NONE), org.gstreamer.gst.PadMode.of(mode), Marshal.integerToBoolean.marshal(active, null).booleanValue());
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PadActivateModeFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

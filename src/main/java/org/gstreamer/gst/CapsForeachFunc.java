package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_caps_foreach(). The function may
 * not modify {@code features} or {@code structure}.
 * @version 1.6
 */
@FunctionalInterface
public interface CapsForeachFunc {
    boolean run(org.gstreamer.gst.CapsFeatures features, org.gstreamer.gst.Structure structure);

    @ApiStatus.Internal default int upcall(MemoryAddress features, MemoryAddress structure, MemoryAddress userData) {
        var RESULT = run(org.gstreamer.gst.CapsFeatures.fromAddress.marshal(features, Ownership.NONE), org.gstreamer.gst.Structure.fromAddress.marshal(structure, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CapsForeachFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

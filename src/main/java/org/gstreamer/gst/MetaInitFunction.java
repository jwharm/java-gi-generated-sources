package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called when {@code meta} is initialized in {@code buffer}.
 */
@FunctionalInterface
public interface MetaInitFunction {
    boolean run(org.gstreamer.gst.Meta meta, @Nullable java.lang.foreign.MemoryAddress params, org.gstreamer.gst.Buffer buffer);

    @ApiStatus.Internal default int upcall(MemoryAddress meta, MemoryAddress params, MemoryAddress buffer) {
        var RESULT = run(org.gstreamer.gst.Meta.fromAddress.marshal(meta, Ownership.NONE), params, org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MetaInitFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

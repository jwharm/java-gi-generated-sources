package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The prototype of the function used to inform the queue that it should be
 * considered as full.
 */
@FunctionalInterface
public interface DataQueueCheckFullFunction {
    boolean run(org.gstreamer.base.DataQueue queue, int visible, int bytes, long time);

    @ApiStatus.Internal default int upcall(MemoryAddress queue, int visible, int bytes, long time, MemoryAddress checkdata) {
        var RESULT = run((org.gstreamer.base.DataQueue) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(queue)), org.gstreamer.base.DataQueue.fromAddress).marshal(queue, Ownership.NONE), visible, bytes, time);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DataQueueCheckFullFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

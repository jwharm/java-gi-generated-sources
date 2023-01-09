package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The prototype of the function used to inform the queue that it should be
 * considered as full.
 */
/**
 * Functional interface declaration of the {@code DataQueueCheckFullFunction} callback.
 */
@FunctionalInterface
public interface DataQueueCheckFullFunction {

    /**
     * The prototype of the function used to inform the queue that it should be
     * considered as full.
     */
    boolean run(org.gstreamer.base.DataQueue queue, int visible, int bytes, long time);
    
    @ApiStatus.Internal default int upcall(MemoryAddress queue, int visible, int bytes, long time, MemoryAddress checkdata) {
        var RESULT = run((org.gstreamer.base.DataQueue) Interop.register(queue, org.gstreamer.base.DataQueue.fromAddress).marshal(queue, null), visible, bytes, time);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DataQueueCheckFullFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

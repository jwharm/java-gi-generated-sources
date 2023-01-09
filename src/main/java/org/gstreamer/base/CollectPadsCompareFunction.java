package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function for comparing two timestamps of buffers or newsegments collected on one pad.
 */
/**
 * Functional interface declaration of the {@code CollectPadsCompareFunction} callback.
 */
@FunctionalInterface
public interface CollectPadsCompareFunction {

    /**
     * A function for comparing two timestamps of buffers or newsegments collected on one pad.
     */
    int run(org.gstreamer.base.CollectPads pads, org.gstreamer.base.CollectData data1, org.gstreamer.gst.ClockTime timestamp1, org.gstreamer.base.CollectData data2, org.gstreamer.gst.ClockTime timestamp2);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress data1, long timestamp1, MemoryAddress data2, long timestamp2, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.base.CollectPads) Interop.register(pads, org.gstreamer.base.CollectPads.fromAddress).marshal(pads, null), org.gstreamer.base.CollectData.fromAddress.marshal(data1, null), new org.gstreamer.gst.ClockTime(timestamp1), org.gstreamer.base.CollectData.fromAddress.marshal(data2, null), new org.gstreamer.gst.ClockTime(timestamp2));
        return RESULT;
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CollectPadsCompareFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

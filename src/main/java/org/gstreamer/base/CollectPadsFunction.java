package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when all pads have received data.
 */
/**
 * Functional interface declaration of the {@code CollectPadsFunction} callback.
 */
@FunctionalInterface
public interface CollectPadsFunction {

    /**
     * A function that will be called when all pads have received data.
     */
    org.gstreamer.gst.FlowReturn run(org.gstreamer.base.CollectPads pads);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.base.CollectPads) Interop.register(pads, org.gstreamer.base.CollectPads.fromAddress).marshal(pads, null));
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CollectPadsFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

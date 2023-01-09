package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when a (considered oldest) buffer can be muxed.
 * If all pads have reached EOS, this function is called with {@code null} {@code buffer}
 * and {@code null} {@code data}.
 */
/**
 * Functional interface declaration of the {@code CollectPadsBufferFunction} callback.
 */
@FunctionalInterface
public interface CollectPadsBufferFunction {

    /**
     * A function that will be called when a (considered oldest) buffer can be muxed.
     * If all pads have reached EOS, this function is called with {@code null} {@code buffer}
     * and {@code null} {@code data}.
     */
    org.gstreamer.gst.FlowReturn run(org.gstreamer.base.CollectPads pads, org.gstreamer.base.CollectData data, org.gstreamer.gst.Buffer buffer);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress data, MemoryAddress buffer, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.base.CollectPads) Interop.register(pads, org.gstreamer.base.CollectPads.fromAddress).marshal(pads, null), org.gstreamer.base.CollectData.fromAddress.marshal(data, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CollectPadsBufferFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called on sinkpads when chaining buffers.
 * The function typically processes the data contained in the buffer and
 * either consumes the data or passes it on to the internally linked pad(s).
 * <p>
 * The implementer of this function receives a refcount to {@code buffer} and should
 * gst_buffer_unref() when the buffer is no longer needed.
 * <p>
 * When a chain function detects an error in the data stream, it must post an
 * error on the bus and return an appropriate {@link FlowReturn} value.
 */
/**
 * Functional interface declaration of the {@code PadChainFunction} callback.
 */
@FunctionalInterface
public interface PadChainFunction {

    /**
     * A function that will be called on sinkpads when chaining buffers.
     * The function typically processes the data contained in the buffer and
     * either consumes the data or passes it on to the internally linked pad(s).
     * <p>
     * The implementer of this function receives a refcount to {@code buffer} and should
     * gst_buffer_unref() when the buffer is no longer needed.
     * <p>
     * When a chain function detects an error in the data stream, it must post an
     * error on the bus and return an appropriate {@link FlowReturn} value.
     */
    org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.Buffer buffer);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress parent, MemoryAddress buffer) {
        var RESULT = run((org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null), (org.gstreamer.gst.GstObject) Interop.register(parent, org.gstreamer.gst.GstObject.fromAddress).marshal(parent, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadChainFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

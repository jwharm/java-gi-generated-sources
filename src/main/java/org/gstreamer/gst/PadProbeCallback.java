package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback used by gst_pad_add_probe(). Gets called to notify about the current
 * blocking type.
 * <p>
 * The callback is allowed to modify the data pointer in {@code info}.
 */
/**
 * Functional interface declaration of the {@code PadProbeCallback} callback.
 */
@FunctionalInterface
public interface PadProbeCallback {

    /**
     * Callback used by gst_pad_add_probe(). Gets called to notify about the current
     * blocking type.
     * <p>
     * The callback is allowed to modify the data pointer in {@code info}.
     */
    org.gstreamer.gst.PadProbeReturn run(org.gstreamer.gst.Pad pad, org.gstreamer.gst.PadProbeInfo info);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress info, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null), org.gstreamer.gst.PadProbeInfo.fromAddress.marshal(info, null));
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadProbeCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function signature to handle an event for the pad.
 * <p>
 * This variant is for specific elements that will take into account the
 * last downstream flow return (from a pad push), in which case they can
 * return it.
 * @version 1.8
 */
/**
 * Functional interface declaration of the {@code PadEventFullFunction} callback.
 */
@FunctionalInterface
public interface PadEventFullFunction {

    /**
     * Function signature to handle an event for the pad.
     * <p>
     * This variant is for specific elements that will take into account the
     * last downstream flow return (from a pad push), in which case they can
     * return it.
     * @version 1.8
     */
    org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.Event event);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress parent, MemoryAddress event) {
        var RESULT = run((org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null), (org.gstreamer.gst.GstObject) Interop.register(parent, org.gstreamer.gst.GstObject.fromAddress).marshal(parent, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadEventFullFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

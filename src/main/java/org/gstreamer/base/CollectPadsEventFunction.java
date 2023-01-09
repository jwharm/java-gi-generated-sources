package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called while processing an event. It takes
 * ownership of the event and is responsible for chaining up (to
 * gst_collect_pads_event_default()) or dropping events (such typical cases
 * being handled by the default handler).
 */
/**
 * Functional interface declaration of the {@code CollectPadsEventFunction} callback.
 */
@FunctionalInterface
public interface CollectPadsEventFunction {

    /**
     * A function that will be called while processing an event. It takes
     * ownership of the event and is responsible for chaining up (to
     * gst_collect_pads_event_default()) or dropping events (such typical cases
     * being handled by the default handler).
     */
    boolean run(org.gstreamer.base.CollectPads pads, org.gstreamer.base.CollectData pad, org.gstreamer.gst.Event event);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pads, MemoryAddress pad, MemoryAddress event, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.base.CollectPads) Interop.register(pads, org.gstreamer.base.CollectPads.fromAddress).marshal(pads, null), org.gstreamer.base.CollectData.fromAddress.marshal(pad, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CollectPadsEventFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

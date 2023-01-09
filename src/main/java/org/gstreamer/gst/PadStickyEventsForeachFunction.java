package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback used by gst_pad_sticky_events_foreach().
 * <p>
 * When this function returns {@code true}, the next event will be
 * returned. When {@code false} is returned, gst_pad_sticky_events_foreach() will return.
 * <p>
 * When {@code event} is set to {@code null}, the item will be removed from the list of sticky events.
 * {@code event} can be replaced by assigning a new reference to it.
 * This function is responsible for unreffing the old event when
 * removing or modifying.
 */
/**
 * Functional interface declaration of the {@code PadStickyEventsForeachFunction} callback.
 */
@FunctionalInterface
public interface PadStickyEventsForeachFunction {

    /**
     * Callback used by gst_pad_sticky_events_foreach().
     * <p>
     * When this function returns {@code true}, the next event will be
     * returned. When {@code false} is returned, gst_pad_sticky_events_foreach() will return.
     * <p>
     * When {@code event} is set to {@code null}, the item will be removed from the list of sticky events.
     * {@code event} can be replaced by assigning a new reference to it.
     * This function is responsible for unreffing the old event when
     * removing or modifying.
     */
    boolean run(org.gstreamer.gst.Pad pad, @Nullable PointerProxy<org.gstreamer.gst.Event> event);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress event, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null), new PointerProxy<org.gstreamer.gst.Event>(event, org.gstreamer.gst.Event.fromAddress));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadStickyEventsForeachFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

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
@FunctionalInterface
public interface PadStickyEventsForeachFunction {
    boolean run(org.gstreamer.gst.Pad pad, @Nullable PointerProxy<org.gstreamer.gst.Event> event);

    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress event, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), new PointerProxy<org.gstreamer.gst.Event>(event, org.gstreamer.gst.Event.fromAddress));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PadStickyEventsForeachFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

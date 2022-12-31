package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called while processing a flushing seek event.
 * <p>
 * The function should flush any internal state of the element and the state of
 * all the pads. It should clear only the state not directly managed by the
 * {@code pads} object. It is therefore not necessary to call
 * gst_collect_pads_set_flushing nor gst_collect_pads_clear from this function.
 * @version 1.4
 */
@FunctionalInterface
public interface CollectPadsFlushFunction {
    void run(org.gstreamer.base.CollectPads pads);

    @ApiStatus.Internal default void upcall(MemoryAddress pads, MemoryAddress userData) {
        run((org.gstreamer.base.CollectPads) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pads)), org.gstreamer.base.CollectPads.fromAddress).marshal(pads, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CollectPadsFlushFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

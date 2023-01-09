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
/**
 * Functional interface declaration of the {@code CollectPadsFlushFunction} callback.
 */
@FunctionalInterface
public interface CollectPadsFlushFunction {

    /**
     * A function that will be called while processing a flushing seek event.
     * <p>
     * The function should flush any internal state of the element and the state of
     * all the pads. It should clear only the state not directly managed by the
     * {@code pads} object. It is therefore not necessary to call
     * gst_collect_pads_set_flushing nor gst_collect_pads_clear from this function.
     * @version 1.4
     */
    void run(org.gstreamer.base.CollectPads pads);
    
    @ApiStatus.Internal default void upcall(MemoryAddress pads, MemoryAddress userData) {
        run((org.gstreamer.base.CollectPads) Interop.register(pads, org.gstreamer.base.CollectPads.fromAddress).marshal(pads, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CollectPadsFlushFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

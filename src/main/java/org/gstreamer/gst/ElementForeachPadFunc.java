package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called for each pad when using gst_element_foreach_sink_pad(),
 * gst_element_foreach_src_pad(), or gst_element_foreach_pad().
 * @version 1.14
 */
/**
 * Functional interface declaration of the {@code ElementForeachPadFunc} callback.
 */
@FunctionalInterface
public interface ElementForeachPadFunc {

    /**
     * Function called for each pad when using gst_element_foreach_sink_pad(),
     * gst_element_foreach_src_pad(), or gst_element_foreach_pad().
     * @version 1.14
     */
    boolean run(org.gstreamer.gst.Element element, org.gstreamer.gst.Pad pad);
    
    @ApiStatus.Internal default int upcall(MemoryAddress element, MemoryAddress pad, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), (org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ElementForeachPadFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_caps_foreach(). The function may
 * not modify {@code features} or {@code structure}.
 * @version 1.6
 */
/**
 * Functional interface declaration of the {@code CapsForeachFunc} callback.
 */
@FunctionalInterface
public interface CapsForeachFunc {

    /**
     * A function that will be called in gst_caps_foreach(). The function may
     * not modify {@code features} or {@code structure}.
     * @version 1.6
     */
    boolean run(org.gstreamer.gst.CapsFeatures features, org.gstreamer.gst.Structure structure);
    
    @ApiStatus.Internal default int upcall(MemoryAddress features, MemoryAddress structure, MemoryAddress userData) {
        var RESULT = run(org.gstreamer.gst.CapsFeatures.fromAddress.marshal(features, null), org.gstreamer.gst.Structure.fromAddress.marshal(structure, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CapsForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called when {@code meta} is initialized in {@code buffer}.
 */
/**
 * Functional interface declaration of the {@code MetaInitFunction} callback.
 */
@FunctionalInterface
public interface MetaInitFunction {

    /**
     * Function called when {@code meta} is initialized in {@code buffer}.
     */
    boolean run(org.gstreamer.gst.Meta meta, @Nullable java.lang.foreign.MemoryAddress params, org.gstreamer.gst.Buffer buffer);
    
    @ApiStatus.Internal default int upcall(MemoryAddress meta, MemoryAddress params, MemoryAddress buffer) {
        var RESULT = run(org.gstreamer.gst.Meta.fromAddress.marshal(meta, null), params, org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MetaInitFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

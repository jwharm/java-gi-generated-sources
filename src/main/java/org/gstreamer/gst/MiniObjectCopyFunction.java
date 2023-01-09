package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function prototype for methods to create copies of instances.
 */
/**
 * Functional interface declaration of the {@code MiniObjectCopyFunction} callback.
 */
@FunctionalInterface
public interface MiniObjectCopyFunction {

    /**
     * Function prototype for methods to create copies of instances.
     */
    org.gstreamer.gst.MiniObject run(org.gstreamer.gst.MiniObject obj);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress obj) {
        var RESULT = run(org.gstreamer.gst.MiniObject.fromAddress.marshal(obj, null));
        RESULT.yieldOwnership();
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MiniObjectCopyFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

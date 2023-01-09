package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual function prototype for methods to free resources used by
 * mini-objects.
 */
/**
 * Functional interface declaration of the {@code MiniObjectFreeFunction} callback.
 */
@FunctionalInterface
public interface MiniObjectFreeFunction {

    /**
     * Virtual function prototype for methods to free resources used by
     * mini-objects.
     */
    void run(org.gstreamer.gst.MiniObject obj);
    
    @ApiStatus.Internal default void upcall(MemoryAddress obj) {
        run(org.gstreamer.gst.MiniObject.fromAddress.marshal(obj, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MiniObjectFreeFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

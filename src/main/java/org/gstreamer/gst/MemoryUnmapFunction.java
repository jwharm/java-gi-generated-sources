package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Release the pointer previously retrieved with gst_memory_map().
 */
/**
 * Functional interface declaration of the {@code MemoryUnmapFunction} callback.
 */
@FunctionalInterface
public interface MemoryUnmapFunction {

    /**
     * Release the pointer previously retrieved with gst_memory_map().
     */
    void run(org.gstreamer.gst.Memory mem);
    
    @ApiStatus.Internal default void upcall(MemoryAddress mem) {
        run(org.gstreamer.gst.Memory.fromAddress.marshal(mem, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MemoryUnmapFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

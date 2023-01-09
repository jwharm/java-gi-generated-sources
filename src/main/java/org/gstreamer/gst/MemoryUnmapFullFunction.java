package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Release the pointer previously retrieved with gst_memory_map() with {@code info}.
 */
/**
 * Functional interface declaration of the {@code MemoryUnmapFullFunction} callback.
 */
@FunctionalInterface
public interface MemoryUnmapFullFunction {

    /**
     * Release the pointer previously retrieved with gst_memory_map() with {@code info}.
     */
    void run(org.gstreamer.gst.Memory mem, org.gstreamer.gst.MapInfo info);
    
    @ApiStatus.Internal default void upcall(MemoryAddress mem, MemoryAddress info) {
        run(org.gstreamer.gst.Memory.fromAddress.marshal(mem, null), org.gstreamer.gst.MapInfo.fromAddress.marshal(info, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MemoryUnmapFullFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

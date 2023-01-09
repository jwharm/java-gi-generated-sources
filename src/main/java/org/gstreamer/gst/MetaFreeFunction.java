package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called when {@code meta} is freed in {@code buffer}.
 */
/**
 * Functional interface declaration of the {@code MetaFreeFunction} callback.
 */
@FunctionalInterface
public interface MetaFreeFunction {

    /**
     * Function called when {@code meta} is freed in {@code buffer}.
     */
    void run(org.gstreamer.gst.Meta meta, org.gstreamer.gst.Buffer buffer);
    
    @ApiStatus.Internal default void upcall(MemoryAddress meta, MemoryAddress buffer) {
        run(org.gstreamer.gst.Meta.fromAddress.marshal(meta, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MetaFreeFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

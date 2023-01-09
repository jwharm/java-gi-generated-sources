package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function will be called when creating a copy of {@code it} and should
 * create a copy of all custom iterator fields or increase their
 * reference counts.
 */
/**
 * Functional interface declaration of the {@code IteratorCopyFunction} callback.
 */
@FunctionalInterface
public interface IteratorCopyFunction {

    /**
     * This function will be called when creating a copy of {@code it} and should
     * create a copy of all custom iterator fields or increase their
     * reference counts.
     */
    void run(org.gstreamer.gst.Iterator it, org.gstreamer.gst.Iterator copy);
    
    @ApiStatus.Internal default void upcall(MemoryAddress it, MemoryAddress copy) {
        run(org.gstreamer.gst.Iterator.fromAddress.marshal(it, null), org.gstreamer.gst.Iterator.fromAddress.marshal(copy, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IteratorCopyFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

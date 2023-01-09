package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The function that will be called when the next element of the iterator
 * should be retrieved.
 * <p>
 * Implementors of a {@link Iterator} should implement this
 * function and pass it to the constructor of the custom iterator.
 * The function will be called with the iterator lock held.
 */
/**
 * Functional interface declaration of the {@code IteratorNextFunction} callback.
 */
@FunctionalInterface
public interface IteratorNextFunction {

    /**
     * The function that will be called when the next element of the iterator
     * should be retrieved.
     * <p>
     * Implementors of a {@link Iterator} should implement this
     * function and pass it to the constructor of the custom iterator.
     * The function will be called with the iterator lock held.
     */
    org.gstreamer.gst.IteratorResult run(org.gstreamer.gst.Iterator it, org.gtk.gobject.Value result);
    
    @ApiStatus.Internal default int upcall(MemoryAddress it, MemoryAddress result) {
        var RESULT = run(org.gstreamer.gst.Iterator.fromAddress.marshal(it, null), org.gtk.gobject.Value.fromAddress.marshal(result, null));
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IteratorNextFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

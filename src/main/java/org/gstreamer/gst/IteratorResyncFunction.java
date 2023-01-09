package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function will be called whenever a concurrent update happened
 * to the iterated datastructure. The implementor of the iterator should
 * restart the iterator from the beginning and clean up any state it might
 * have.
 * <p>
 * Implementors of a {@link Iterator} should implement this
 * function and pass it to the constructor of the custom iterator.
 * The function will be called with the iterator lock held.
 */
/**
 * Functional interface declaration of the {@code IteratorResyncFunction} callback.
 */
@FunctionalInterface
public interface IteratorResyncFunction {

    /**
     * This function will be called whenever a concurrent update happened
     * to the iterated datastructure. The implementor of the iterator should
     * restart the iterator from the beginning and clean up any state it might
     * have.
     * <p>
     * Implementors of a {@link Iterator} should implement this
     * function and pass it to the constructor of the custom iterator.
     * The function will be called with the iterator lock held.
     */
    void run(org.gstreamer.gst.Iterator it);
    
    @ApiStatus.Internal default void upcall(MemoryAddress it) {
        run(org.gstreamer.gst.Iterator.fromAddress.marshal(it, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IteratorResyncFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

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
@FunctionalInterface
public interface IteratorResyncFunction {
    void run(org.gstreamer.gst.Iterator it);

    @ApiStatus.Internal default void upcall(MemoryAddress it) {
        run(org.gstreamer.gst.Iterator.fromAddress.marshal(it, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IteratorResyncFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

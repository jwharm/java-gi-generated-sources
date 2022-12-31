package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function will be called when the iterator is freed.
 * <p>
 * Implementors of a {@link Iterator} should implement this
 * function and pass it to the constructor of the custom iterator.
 * The function will be called with the iterator lock held.
 */
@FunctionalInterface
public interface IteratorFreeFunction {
    void run(org.gstreamer.gst.Iterator it);

    @ApiStatus.Internal default void upcall(MemoryAddress it) {
        run(org.gstreamer.gst.Iterator.fromAddress.marshal(it, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IteratorFreeFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

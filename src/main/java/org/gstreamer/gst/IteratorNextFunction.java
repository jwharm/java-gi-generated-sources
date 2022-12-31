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
@FunctionalInterface
public interface IteratorNextFunction {
    org.gstreamer.gst.IteratorResult run(org.gstreamer.gst.Iterator it, org.gtk.gobject.Value result);

    @ApiStatus.Internal default int upcall(MemoryAddress it, MemoryAddress result) {
        var RESULT = run(org.gstreamer.gst.Iterator.fromAddress.marshal(it, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(result, Ownership.NONE));
        return RESULT.getValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IteratorNextFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

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
@FunctionalInterface
public interface IteratorCopyFunction {
    void run(org.gstreamer.gst.Iterator it, org.gstreamer.gst.Iterator copy);

    @ApiStatus.Internal default void upcall(MemoryAddress it, MemoryAddress copy) {
        run(org.gstreamer.gst.Iterator.fromAddress.marshal(it, Ownership.NONE), org.gstreamer.gst.Iterator.fromAddress.marshal(copy, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IteratorCopyFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

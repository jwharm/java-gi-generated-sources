package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that is called by gst_iterator_foreach() for every element.
 */
@FunctionalInterface
public interface IteratorForeachFunction {
    void run(org.gtk.gobject.Value item);

    @ApiStatus.Internal default void upcall(MemoryAddress item, MemoryAddress userData) {
        run(org.gtk.gobject.Value.fromAddress.marshal(item, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IteratorForeachFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

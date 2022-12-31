package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The function that will be called after the next item of the iterator
 * has been retrieved. This function can be used to skip items or stop
 * the iterator.
 * <p>
 * The function will be called with the iterator lock held.
 */
@FunctionalInterface
public interface IteratorItemFunction {
    org.gstreamer.gst.IteratorItem run(org.gstreamer.gst.Iterator it, org.gtk.gobject.Value item);

    @ApiStatus.Internal default int upcall(MemoryAddress it, MemoryAddress item) {
        var RESULT = run(org.gstreamer.gst.Iterator.fromAddress.marshal(it, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(item, Ownership.NONE));
        return RESULT.getValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IteratorItemFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

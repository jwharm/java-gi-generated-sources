package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to be passed to gst_iterator_fold().
 */
@FunctionalInterface
public interface IteratorFoldFunction {
    boolean run(org.gtk.gobject.Value item, org.gtk.gobject.Value ret);

    @ApiStatus.Internal default int upcall(MemoryAddress item, MemoryAddress ret, MemoryAddress userData) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(item, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(ret, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IteratorFoldFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

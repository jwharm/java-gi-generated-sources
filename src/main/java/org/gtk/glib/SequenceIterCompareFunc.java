package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link SequenceIterCompareFunc} is a function used to compare iterators.
 * It must return zero if the iterators compare equal, a negative value
 * if {@code a} comes before {@code b}, and a positive value if {@code b} comes before {@code a}.
 */
@FunctionalInterface
public interface SequenceIterCompareFunc {
    int run(org.gtk.glib.SequenceIter a, org.gtk.glib.SequenceIter b);

    @ApiStatus.Internal default int upcall(MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.SequenceIter.fromAddress.marshal(a, Ownership.NONE), org.gtk.glib.SequenceIter.fromAddress.marshal(b, Ownership.NONE));
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SequenceIterCompareFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

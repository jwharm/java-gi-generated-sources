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
/**
 * Functional interface declaration of the {@code SequenceIterCompareFunc} callback.
 */
@FunctionalInterface
public interface SequenceIterCompareFunc {

    /**
     * A {@link SequenceIterCompareFunc} is a function used to compare iterators.
     * It must return zero if the iterators compare equal, a negative value
     * if {@code a} comes before {@code b}, and a positive value if {@code b} comes before {@code a}.
     */
    int run(org.gtk.glib.SequenceIter a, org.gtk.glib.SequenceIter b);
    
    @ApiStatus.Internal default int upcall(MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.SequenceIter.fromAddress.marshal(a, null), org.gtk.glib.SequenceIter.fromAddress.marshal(b, null));
        return RESULT;
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SequenceIterCompareFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

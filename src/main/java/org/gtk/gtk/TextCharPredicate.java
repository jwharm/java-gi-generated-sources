package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The predicate function used by gtk_text_iter_forward_find_char() and
 * gtk_text_iter_backward_find_char().
 */
/**
 * Functional interface declaration of the {@code TextCharPredicate} callback.
 */
@FunctionalInterface
public interface TextCharPredicate {

    /**
     * The predicate function used by gtk_text_iter_forward_find_char() and
     * gtk_text_iter_backward_find_char().
     */
    boolean run(int ch);
    
    @ApiStatus.Internal default int upcall(int ch, MemoryAddress userData) {
        var RESULT = run(ch);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TextCharPredicate.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

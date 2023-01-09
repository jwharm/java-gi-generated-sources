package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function of this signature is used to copy the node data
 * when doing a deep-copy of a tree.
 * @version 2.4
 */
/**
 * Functional interface declaration of the {@code CopyFunc} callback.
 */
@FunctionalInterface
public interface CopyFunc {

    /**
     * A function of this signature is used to copy the node data
     * when doing a deep-copy of a tree.
     * @version 2.4
     */
    java.lang.foreign.MemoryAddress run(java.lang.foreign.MemoryAddress src);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress src, MemoryAddress userData) {
        var RESULT = run(src);
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

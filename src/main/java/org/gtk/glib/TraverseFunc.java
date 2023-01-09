package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_tree_traverse(). It is
 * passed the key and value of each node, together with the {@code user_data}
 * parameter passed to g_tree_traverse(). If the function returns
 * {@code true}, the traversal is stopped.
 */
/**
 * Functional interface declaration of the {@code TraverseFunc} callback.
 */
@FunctionalInterface
public interface TraverseFunc {

    /**
     * Specifies the type of function passed to g_tree_traverse(). It is
     * passed the key and value of each node, together with the {@code user_data}
     * parameter passed to g_tree_traverse(). If the function returns
     * {@code true}, the traversal is stopped.
     */
    boolean run(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value);
    
    @ApiStatus.Internal default int upcall(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        var RESULT = run(key, value);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TraverseFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

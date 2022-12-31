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
@FunctionalInterface
public interface TraverseFunc {
    boolean run(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value);

    @ApiStatus.Internal default int upcall(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        var RESULT = run(key, value);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TraverseFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

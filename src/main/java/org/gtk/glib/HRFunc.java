package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the function passed to
 * g_hash_table_foreach_remove(). It is called with each key/value
 * pair, together with the {@code user_data} parameter passed to
 * g_hash_table_foreach_remove(). It should return {@code true} if the
 * key/value pair should be removed from the {@link HashTable}.
 */
@FunctionalInterface
public interface HRFunc {
    boolean run(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value);

    @ApiStatus.Internal default int upcall(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        var RESULT = run(key, value);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HRFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

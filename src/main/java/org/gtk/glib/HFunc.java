package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the function passed to g_hash_table_foreach().
 * It is called with each key/value pair, together with the {@code user_data}
 * parameter which is passed to g_hash_table_foreach().
 */
@FunctionalInterface
public interface HFunc {
    void run(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value);

    @ApiStatus.Internal default void upcall(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        run(key, value);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

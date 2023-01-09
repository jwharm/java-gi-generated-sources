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
/**
 * Functional interface declaration of the {@code HFunc} callback.
 */
@FunctionalInterface
public interface HFunc {

    /**
     * Specifies the type of the function passed to g_hash_table_foreach().
     * It is called with each key/value pair, together with the {@code user_data}
     * parameter which is passed to g_hash_table_foreach().
     */
    void run(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value);
    
    @ApiStatus.Internal default void upcall(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        run(key, value);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

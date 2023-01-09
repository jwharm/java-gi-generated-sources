package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_clear_handle_id().
 * The implementation is expected to free the resource identified
 * by {@code handle_id}; for instance, if {@code handle_id} is a {@link Source} ID,
 * g_source_remove() can be used.
 * @version 2.56
 */
/**
 * Functional interface declaration of the {@code ClearHandleFunc} callback.
 */
@FunctionalInterface
public interface ClearHandleFunc {

    /**
     * Specifies the type of function passed to g_clear_handle_id().
     * The implementation is expected to free the resource identified
     * by {@code handle_id}; for instance, if {@code handle_id} is a {@link Source} ID,
     * g_source_remove() can be used.
     * @version 2.56
     */
    void run(int handleId);
    
    @ApiStatus.Internal default void upcall(int handleId) {
        run(handleId);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ClearHandleFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

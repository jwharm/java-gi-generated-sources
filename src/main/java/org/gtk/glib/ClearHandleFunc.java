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
@FunctionalInterface
public interface ClearHandleFunc {
    void run(int handleId);

    @ApiStatus.Internal default void upcall(int handleId) {
        run(handleId);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClearHandleFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A source function that is only called once before being removed from the main
 * context automatically.
 * <p>
 * See: g_idle_add_once(), g_timeout_add_once()
 * @version 2.74
 */
@FunctionalInterface
public interface SourceOnceFunc {
    void run();

    @ApiStatus.Internal default void upcall(MemoryAddress userData) {
        run();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SourceOnceFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

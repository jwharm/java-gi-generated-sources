package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type used for callback functions in structure definitions and function
 * signatures.
 * <p>
 * This doesn't mean that all callback functions must take no  parameters and
 * return void. The required signature of a callback function is determined by
 * the context in which is used (e.g. the signal to which it is connected).
 * <p>
 * Use G_CALLBACK() to cast the callback function to a {@link Callback}.
 */
@FunctionalInterface
public interface Callback {
    void run();

    @ApiStatus.Internal default void upcall() {
        run();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Callback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

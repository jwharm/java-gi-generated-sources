package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Declares a type of function which takes no arguments
 * and has no return value. It is used to specify the type
 * function passed to g_atexit().
 */
@FunctionalInterface
public interface VoidFunc {
    void run();

    @ApiStatus.Internal default void upcall() {
        run();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VoidFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

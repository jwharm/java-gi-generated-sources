package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type used for the various notification callbacks which can be registered
 * on closures.
 */
/**
 * Functional interface declaration of the {@code ClosureNotify} callback.
 */
@FunctionalInterface
public interface ClosureNotify {

    /**
     * The type used for the various notification callbacks which can be registered
     * on closures.
     */
    void run(org.gtk.gobject.Closure closure);
    
    @ApiStatus.Internal default void upcall(MemoryAddress data, MemoryAddress closure) {
        run(org.gtk.gobject.Closure.fromAddress.marshal(closure, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ClosureNotify.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

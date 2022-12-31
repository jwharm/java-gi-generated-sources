package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type used for the various notification callbacks which can be registered
 * on closures.
 */
@FunctionalInterface
public interface ClosureNotify {
    void run(org.gtk.gobject.Closure closure);

    @ApiStatus.Internal default void upcall(MemoryAddress data, MemoryAddress closure) {
        run(org.gtk.gobject.Closure.fromAddress.marshal(closure, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClosureNotify.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

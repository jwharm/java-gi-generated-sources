package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is just a placeholder for {@link org.gtk.gobject.ClosureMarshal},
 * which cannot be used here for dependency reasons.
 */
@FunctionalInterface
public interface SourceDummyMarshal {
    void run();

    @ApiStatus.Internal default void upcall() {
        run();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SourceDummyMarshal.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

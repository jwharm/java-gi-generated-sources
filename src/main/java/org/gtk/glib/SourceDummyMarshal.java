package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is just a placeholder for {@link org.gtk.gobject.ClosureMarshal},
 * which cannot be used here for dependency reasons.
 */
/**
 * Functional interface declaration of the {@code SourceDummyMarshal} callback.
 */
@FunctionalInterface
public interface SourceDummyMarshal {

    /**
     * This is just a placeholder for {@link org.gtk.gobject.ClosureMarshal},
     * which cannot be used here for dependency reasons.
     */
    void run();
    
    @ApiStatus.Internal default void upcall() {
        run();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SourceDummyMarshal.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

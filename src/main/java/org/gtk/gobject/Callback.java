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
/**
 * Functional interface declaration of the {@code Callback} callback.
 */
@FunctionalInterface
public interface Callback {

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
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Callback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

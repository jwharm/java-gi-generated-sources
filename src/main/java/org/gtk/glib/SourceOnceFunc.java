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
/**
 * Functional interface declaration of the {@code SourceOnceFunc} callback.
 */
@FunctionalInterface
public interface SourceOnceFunc {

    /**
     * A source function that is only called once before being removed from the main
     * context automatically.
     * <p>
     * See: g_idle_add_once(), g_timeout_add_once()
     * @version 2.74
     */
    void run();
    
    @ApiStatus.Internal default void upcall(MemoryAddress userData) {
        run();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SourceOnceFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

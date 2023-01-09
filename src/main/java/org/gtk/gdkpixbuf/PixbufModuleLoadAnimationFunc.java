package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Loads a file from a standard C file stream into a new {@code GdkPixbufAnimation}.
 * <p>
 * In case of error, this function should return {@code NULL} and set the {@code error} argument.
 */
/**
 * Functional interface declaration of the {@code PixbufModuleLoadAnimationFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleLoadAnimationFunc {

    /**
     * Loads a file from a standard C file stream into a new {@code GdkPixbufAnimation}.
     * <p>
     * In case of error, this function should return {@code NULL} and set the {@code error} argument.
     */
    org.gtk.gdkpixbuf.PixbufAnimation run(@Nullable java.lang.foreign.MemoryAddress f);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress f) {
        var RESULT = run(f);
        RESULT.yieldOwnership();
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleLoadAnimationFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

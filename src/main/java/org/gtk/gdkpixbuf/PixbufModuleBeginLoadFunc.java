package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Sets up the image loading state.
 * <p>
 * The image loader is responsible for storing the given function pointers
 * and user data, and call them when needed.
 * <p>
 * The image loader should set up an internal state object, and return it
 * from this function; the state object will then be updated from the
 * {@code GdkPixbuf.PixbufModuleIncrementLoadFunc} callback, and will be freed
 * by {@code GdkPixbuf.PixbufModuleStopLoadFunc} callback.
 */
/**
 * Functional interface declaration of the {@code PixbufModuleBeginLoadFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleBeginLoadFunc {

    /**
     * Sets up the image loading state.
     * <p>
     * The image loader is responsible for storing the given function pointers
     * and user data, and call them when needed.
     * <p>
     * The image loader should set up an internal state object, and return it
     * from this function; the state object will then be updated from the
     * {@code GdkPixbuf.PixbufModuleIncrementLoadFunc} callback, and will be freed
     * by {@code GdkPixbuf.PixbufModuleStopLoadFunc} callback.
     */
    @Nullable java.lang.foreign.MemoryAddress run(org.gtk.gdkpixbuf.PixbufModuleSizeFunc sizeFunc, org.gtk.gdkpixbuf.PixbufModulePreparedFunc preparedFunc, org.gtk.gdkpixbuf.PixbufModuleUpdatedFunc updatedFunc);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress sizeFunc, MemoryAddress preparedFunc, MemoryAddress updatedFunc, MemoryAddress userData) {
        var RESULT = run(null /* Unsupported parameter type */, null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleBeginLoadFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

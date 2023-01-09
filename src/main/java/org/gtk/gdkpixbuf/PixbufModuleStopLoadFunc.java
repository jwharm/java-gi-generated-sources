package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Finalizes the image loading state.
 * <p>
 * This function is called on success and error states.
 */
/**
 * Functional interface declaration of the {@code PixbufModuleStopLoadFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleStopLoadFunc {

    /**
     * Finalizes the image loading state.
     * <p>
     * This function is called on success and error states.
     */
    boolean run(@Nullable java.lang.foreign.MemoryAddress context);
    
    @ApiStatus.Internal default int upcall(MemoryAddress context) {
        var RESULT = run(context);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleStopLoadFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

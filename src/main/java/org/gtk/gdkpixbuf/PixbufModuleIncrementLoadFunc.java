package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Incrementally loads a buffer into the image data.
 */
/**
 * Functional interface declaration of the {@code PixbufModuleIncrementLoadFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleIncrementLoadFunc {

    /**
     * Incrementally loads a buffer into the image data.
     */
    boolean run(@Nullable java.lang.foreign.MemoryAddress context, byte[] buf, int size);
    
    @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress buf, int size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(context, MemorySegment.ofAddress(buf, size, SCOPE).toArray(Interop.valueLayout.C_BYTE), size);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleIncrementLoadFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

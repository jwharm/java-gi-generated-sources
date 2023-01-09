package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback method for {@link BufferT}. The method gets called with the
 * {@link BufferT} it was set on, the {@link FontT} the buffer is shaped with and a
 * message describing what step of the shaping process will be performed.
 * Returning {@code false} from this method will skip this shaping step and move to
 * the next one.
 * @version 1.1.3
 */
/**
 * Functional interface declaration of the {@code BufferMessageFuncT} callback.
 */
@FunctionalInterface
public interface BufferMessageFuncT {

    /**
     * A callback method for {@link BufferT}. The method gets called with the
     * {@link BufferT} it was set on, the {@link FontT} the buffer is shaped with and a
     * message describing what step of the shaping process will be performed.
     * Returning {@code false} from this method will skip this shaping step and move to
     * the next one.
     * @version 1.1.3
     */
    org.harfbuzz.BoolT run(org.harfbuzz.BufferT buffer, org.harfbuzz.FontT font, java.lang.String message, @Nullable java.lang.foreign.MemoryAddress userData);
    
    @ApiStatus.Internal default int upcall(MemoryAddress buffer, MemoryAddress font, MemoryAddress message, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(org.harfbuzz.BufferT.fromAddress.marshal(buffer, null), org.harfbuzz.FontT.fromAddress.marshal(font, null), Marshal.addressToString.marshal(message, null), userData);
            return RESULT.getValue().intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BufferMessageFuncT.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

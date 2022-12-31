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
@FunctionalInterface
public interface BufferMessageFuncT {
    org.harfbuzz.BoolT run(org.harfbuzz.BufferT buffer, org.harfbuzz.FontT font, java.lang.String message, @Nullable java.lang.foreign.MemoryAddress userData);

    @ApiStatus.Internal default int upcall(MemoryAddress buffer, MemoryAddress font, MemoryAddress message, MemoryAddress userData) {
        var RESULT = run(org.harfbuzz.BufferT.fromAddress.marshal(buffer, Ownership.NONE), org.harfbuzz.FontT.fromAddress.marshal(font, Ownership.NONE), Marshal.addressToString.marshal(message, null), userData);
        return RESULT.getValue().intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BufferMessageFuncT.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

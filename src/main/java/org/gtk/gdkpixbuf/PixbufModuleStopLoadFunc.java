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
@FunctionalInterface
public interface PixbufModuleStopLoadFunc {
    boolean run(@Nullable java.lang.foreign.MemoryAddress context);

    @ApiStatus.Internal default int upcall(MemoryAddress context) {
        var RESULT = run(context);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleStopLoadFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

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
@FunctionalInterface
public interface PixbufModuleLoadAnimationFunc {
    org.gtk.gdkpixbuf.PixbufAnimation run(@Nullable java.lang.foreign.MemoryAddress f);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress f) {
        var RESULT = run(f);
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleLoadAnimationFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

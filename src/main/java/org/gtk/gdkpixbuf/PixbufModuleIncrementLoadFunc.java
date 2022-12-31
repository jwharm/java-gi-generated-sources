package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Incrementally loads a buffer into the image data.
 */
@FunctionalInterface
public interface PixbufModuleIncrementLoadFunc {
    boolean run(@Nullable java.lang.foreign.MemoryAddress context, byte[] buf, int size);

    @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress buf, int size) {
        var RESULT = run(context, MemorySegment.ofAddress(buf, size, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), size);
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleIncrementLoadFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

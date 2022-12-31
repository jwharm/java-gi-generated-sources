package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Checks whether the given {@code option_key} is supported when saving.
 */
@FunctionalInterface
public interface PixbufModuleSaveOptionSupportedFunc {
    boolean run(java.lang.String optionKey);

    @ApiStatus.Internal default int upcall(MemoryAddress optionKey) {
        var RESULT = run(Marshal.addressToString.marshal(optionKey, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleSaveOptionSupportedFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

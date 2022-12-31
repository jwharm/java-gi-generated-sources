package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function to be passed as callback for {@link OptionArg#CALLBACK}
 * options.
 */
@FunctionalInterface
public interface OptionArgFunc {
    boolean run(java.lang.String optionName, java.lang.String value);

    @ApiStatus.Internal default int upcall(MemoryAddress optionName, MemoryAddress value, MemoryAddress userData) {
        var RESULT = run(Marshal.addressToString.marshal(optionName, null), Marshal.addressToString.marshal(value, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OptionArgFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

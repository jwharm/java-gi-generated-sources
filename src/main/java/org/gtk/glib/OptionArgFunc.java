package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function to be passed as callback for {@link OptionArg#CALLBACK}
 * options.
 */
/**
 * Functional interface declaration of the {@code OptionArgFunc} callback.
 */
@FunctionalInterface
public interface OptionArgFunc {

    /**
     * The type of function to be passed as callback for {@link OptionArg#CALLBACK}
     * options.
     */
    boolean run(java.lang.String optionName, java.lang.String value);
    
    @ApiStatus.Internal default int upcall(MemoryAddress optionName, MemoryAddress value, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(Marshal.addressToString.marshal(optionName, null), Marshal.addressToString.marshal(value, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OptionArgFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

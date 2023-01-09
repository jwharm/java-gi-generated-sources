package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the prototype of fatal log handler functions.
 * @version 2.22
 */
/**
 * Functional interface declaration of the {@code TestLogFatalFunc} callback.
 */
@FunctionalInterface
public interface TestLogFatalFunc {

    /**
     * Specifies the prototype of fatal log handler functions.
     * @version 2.22
     */
    boolean run(java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, java.lang.String message);
    
    @ApiStatus.Internal default int upcall(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(Marshal.addressToString.marshal(logDomain, null), new org.gtk.glib.LogLevelFlags(logLevel), Marshal.addressToString.marshal(message, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TestLogFatalFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

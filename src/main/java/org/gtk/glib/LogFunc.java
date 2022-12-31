package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the prototype of log handler functions.
 * <p>
 * The default log handler, g_log_default_handler(), automatically appends a
 * new-line character to {@code message} when printing it. It is advised that any
 * custom log handler functions behave similarly, so that logging calls in user
 * code do not need modifying to add a new-line character to the message if the
 * log handler is changed.
 * <p>
 * This is not used if structured logging is enabled; see
 * [Using Structured Logging][using-structured-logging].
 */
@FunctionalInterface
public interface LogFunc {
    void run(java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, java.lang.String message);

    @ApiStatus.Internal default void upcall(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
        run(Marshal.addressToString.marshal(logDomain, null), new org.gtk.glib.LogLevelFlags(logLevel), Marshal.addressToString.marshal(message, null));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LogFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

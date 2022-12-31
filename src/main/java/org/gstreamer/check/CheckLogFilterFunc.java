package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that is called for messages matching the filter added by
 * {@code gst_check_add_log_filter}.
 * @version 1.12
 */
@FunctionalInterface
public interface CheckLogFilterFunc {
    boolean run(java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, java.lang.String message);

    @ApiStatus.Internal default int upcall(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
        var RESULT = run(Marshal.addressToString.marshal(logDomain, null), new org.gtk.glib.LogLevelFlags(logLevel), Marshal.addressToString.marshal(message, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CheckLogFilterFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

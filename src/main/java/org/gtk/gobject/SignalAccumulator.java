package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The signal accumulator is a special callback function that can be used
 * to collect return values of the various callbacks that are called
 * during a signal emission.
 * <p>
 * The signal accumulator is specified at signal creation time, if it is
 * left {@code null}, no accumulation of callback return values is performed.
 * The return value of signal emissions is then the value returned by the
 * last callback.
 */
@FunctionalInterface
public interface SignalAccumulator {
    boolean run(org.gtk.gobject.SignalInvocationHint ihint, org.gtk.gobject.Value returnAccu, org.gtk.gobject.Value handlerReturn);

    @ApiStatus.Internal default int upcall(MemoryAddress ihint, MemoryAddress returnAccu, MemoryAddress handlerReturn, MemoryAddress userData) {
        var RESULT = run(org.gtk.gobject.SignalInvocationHint.fromAddress.marshal(ihint, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(returnAccu, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(handlerReturn, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SignalAccumulator.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

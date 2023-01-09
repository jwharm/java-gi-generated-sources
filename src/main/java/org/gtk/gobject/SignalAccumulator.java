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
/**
 * Functional interface declaration of the {@code SignalAccumulator} callback.
 */
@FunctionalInterface
public interface SignalAccumulator {

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
    boolean run(org.gtk.gobject.SignalInvocationHint ihint, org.gtk.gobject.Value returnAccu, org.gtk.gobject.Value handlerReturn);
    
    @ApiStatus.Internal default int upcall(MemoryAddress ihint, MemoryAddress returnAccu, MemoryAddress handlerReturn, MemoryAddress userData) {
        var RESULT = run(org.gtk.gobject.SignalInvocationHint.fromAddress.marshal(ihint, null), org.gtk.gobject.Value.fromAddress.marshal(returnAccu, null), org.gtk.gobject.Value.fromAddress.marshal(handlerReturn, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SignalAccumulator.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

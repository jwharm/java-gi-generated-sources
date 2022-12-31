package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A simple function pointer to get invoked when the signal is emitted.
 * <p>
 * Emission hooks allow you to tie a hook to the signal type, so that it will
 * trap all emissions of that signal, from any object.
 * <p>
 * You may not attach these to signals created with the {@link SignalFlags#NO_HOOKS} flag.
 */
@FunctionalInterface
public interface SignalEmissionHook {
    boolean run(org.gtk.gobject.SignalInvocationHint ihint, int nParamValues, org.gtk.gobject.Value[] paramValues);

    @ApiStatus.Internal default int upcall(MemoryAddress ihint, int nParamValues, MemoryAddress paramValues, MemoryAddress userData) {
        var RESULT = run(org.gtk.gobject.SignalInvocationHint.fromAddress.marshal(ihint, Ownership.NONE), nParamValues, new PointerProxy<org.gtk.gobject.Value>(paramValues, org.gtk.gobject.Value.fromAddress).toArray((int) nParamValues, org.gtk.gobject.Value.class));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SignalEmissionHook.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

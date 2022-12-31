package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type used for marshaller functions.
 */
@FunctionalInterface
public interface ClosureMarshal {
    void run(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value[] paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint);

    @ApiStatus.Internal default void upcall(MemoryAddress closure, MemoryAddress returnValue, int nParamValues, MemoryAddress paramValues, MemoryAddress invocationHint, MemoryAddress userData) {
        run(org.gtk.gobject.Closure.fromAddress.marshal(closure, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(returnValue, Ownership.NONE), nParamValues, new PointerProxy<org.gtk.gobject.Value>(paramValues, org.gtk.gobject.Value.fromAddress).toArray((int) nParamValues, org.gtk.gobject.Value.class), invocationHint);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClosureMarshal.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

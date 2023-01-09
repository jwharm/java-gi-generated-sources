package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type used for marshaller functions.
 */
/**
 * Functional interface declaration of the {@code ClosureMarshal} callback.
 */
@FunctionalInterface
public interface ClosureMarshal {

    /**
     * The type used for marshaller functions.
     */
    void run(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value[] paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint);
    
    @ApiStatus.Internal default void upcall(MemoryAddress closure, MemoryAddress returnValue, int nParamValues, MemoryAddress paramValues, MemoryAddress invocationHint, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run(org.gtk.gobject.Closure.fromAddress.marshal(closure, null), org.gtk.gobject.Value.fromAddress.marshal(returnValue, null), nParamValues, new PointerProxy<org.gtk.gobject.Value>(paramValues, org.gtk.gobject.Value.fromAddress).toArray((int) nParamValues, org.gtk.gobject.Value.class), invocationHint);
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ClosureMarshal.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

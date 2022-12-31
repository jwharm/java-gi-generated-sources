package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function used to compare {@link Hook} elements in
 * g_hook_insert_sorted().
 */
@FunctionalInterface
public interface HookCompareFunc {
    int run(org.gtk.glib.Hook newHook, org.gtk.glib.Hook sibling);

    @ApiStatus.Internal default int upcall(MemoryAddress newHook, MemoryAddress sibling) {
        var RESULT = run(org.gtk.glib.Hook.fromAddress.marshal(newHook, Ownership.NONE), org.gtk.glib.Hook.fromAddress.marshal(sibling, Ownership.NONE));
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HookCompareFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

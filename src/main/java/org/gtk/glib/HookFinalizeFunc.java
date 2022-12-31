package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function to be called when a hook in a
 * list of hooks gets finalized.
 */
@FunctionalInterface
public interface HookFinalizeFunc {
    void run(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook);

    @ApiStatus.Internal default void upcall(MemoryAddress hookList, MemoryAddress hook) {
        run(org.gtk.glib.HookList.fromAddress.marshal(hookList, Ownership.NONE), org.gtk.glib.Hook.fromAddress.marshal(hook, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HookFinalizeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

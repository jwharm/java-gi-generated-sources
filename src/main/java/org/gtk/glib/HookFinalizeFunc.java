package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function to be called when a hook in a
 * list of hooks gets finalized.
 */
/**
 * Functional interface declaration of the {@code HookFinalizeFunc} callback.
 */
@FunctionalInterface
public interface HookFinalizeFunc {

    /**
     * Defines the type of function to be called when a hook in a
     * list of hooks gets finalized.
     */
    void run(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook);
    
    @ApiStatus.Internal default void upcall(MemoryAddress hookList, MemoryAddress hook) {
        run(org.gtk.glib.HookList.fromAddress.marshal(hookList, null), org.gtk.glib.Hook.fromAddress.marshal(hook, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HookFinalizeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function used to compare {@link Hook} elements in
 * g_hook_insert_sorted().
 */
/**
 * Functional interface declaration of the {@code HookCompareFunc} callback.
 */
@FunctionalInterface
public interface HookCompareFunc {

    /**
     * Defines the type of function used to compare {@link Hook} elements in
     * g_hook_insert_sorted().
     */
    int run(org.gtk.glib.Hook newHook, org.gtk.glib.Hook sibling);
    
    @ApiStatus.Internal default int upcall(MemoryAddress newHook, MemoryAddress sibling) {
        var RESULT = run(org.gtk.glib.Hook.fromAddress.marshal(newHook, null), org.gtk.glib.Hook.fromAddress.marshal(sibling, null));
        return RESULT;
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HookCompareFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

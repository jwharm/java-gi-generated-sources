package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function used by g_hook_list_marshal().
 */
/**
 * Functional interface declaration of the {@code HookMarshaller} callback.
 */
@FunctionalInterface
public interface HookMarshaller {

    /**
     * Defines the type of function used by g_hook_list_marshal().
     */
    void run(org.gtk.glib.Hook hook);
    
    @ApiStatus.Internal default void upcall(MemoryAddress hook, MemoryAddress userData) {
        run(org.gtk.glib.Hook.fromAddress.marshal(hook, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HookMarshaller.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

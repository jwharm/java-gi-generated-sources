package org.gtk.gmodule;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the module function called when it is unloaded.
 * If a module contains a function named g_module_unload() it is called
 * automatically when the module is unloaded.
 * It is passed the {@link Module} structure.
 */
/**
 * Functional interface declaration of the {@code ModuleUnload} callback.
 */
@FunctionalInterface
public interface ModuleUnload {

    /**
     * Specifies the type of the module function called when it is unloaded.
     * If a module contains a function named g_module_unload() it is called
     * automatically when the module is unloaded.
     * It is passed the {@link Module} structure.
     */
    void run(org.gtk.gmodule.Module module);
    
    @ApiStatus.Internal default void upcall(MemoryAddress module) {
        run(org.gtk.gmodule.Module.fromAddress.marshal(module, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ModuleUnload.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

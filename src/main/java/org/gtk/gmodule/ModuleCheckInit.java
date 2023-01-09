package org.gtk.gmodule;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the module initialization function.
 * If a module contains a function named g_module_check_init() it is called
 * automatically when the module is loaded. It is passed the {@link Module} structure
 * and should return {@code null} on success or a string describing the initialization
 * error.
 */
/**
 * Functional interface declaration of the {@code ModuleCheckInit} callback.
 */
@FunctionalInterface
public interface ModuleCheckInit {

    /**
     * Specifies the type of the module initialization function.
     * If a module contains a function named g_module_check_init() it is called
     * automatically when the module is loaded. It is passed the {@link Module} structure
     * and should return {@code null} on success or a string describing the initialization
     * error.
     */
    java.lang.String run(org.gtk.gmodule.Module module);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress module) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(org.gtk.gmodule.Module.fromAddress.marshal(module, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ModuleCheckInit.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

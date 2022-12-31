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
@FunctionalInterface
public interface ModuleCheckInit {
    java.lang.String run(org.gtk.gmodule.Module module);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress module) {
        var RESULT = run(org.gtk.gmodule.Module.fromAddress.marshal(module, Ownership.NONE));
        return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ModuleCheckInit.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

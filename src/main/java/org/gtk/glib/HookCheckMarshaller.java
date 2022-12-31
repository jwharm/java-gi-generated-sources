package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of function used by g_hook_list_marshal_check().
 */
@FunctionalInterface
public interface HookCheckMarshaller {
    boolean run(org.gtk.glib.Hook hook);

    @ApiStatus.Internal default int upcall(MemoryAddress hook, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.Hook.fromAddress.marshal(hook, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HookCheckMarshaller.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

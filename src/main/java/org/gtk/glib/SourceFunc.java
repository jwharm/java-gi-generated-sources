package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_timeout_add(),
 * g_timeout_add_full(), g_idle_add(), and g_idle_add_full().
 * <p>
 * When calling g_source_set_callback(), you may need to cast a function of a
 * different type to this type. Use G_SOURCE_FUNC() to avoid warnings about
 * incompatible function types.
 */
@FunctionalInterface
public interface SourceFunc {
    boolean run();

    @ApiStatus.Internal default int upcall(MemoryAddress userData) {
        var RESULT = run();
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SourceFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

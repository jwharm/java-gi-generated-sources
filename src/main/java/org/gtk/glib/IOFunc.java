package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_io_add_watch() or
 * g_io_add_watch_full(), which is called when the requested condition
 * on a {@link IOChannel} is satisfied.
 */
@FunctionalInterface
public interface IOFunc {
    boolean run(org.gtk.glib.IOChannel source, org.gtk.glib.IOCondition condition);

    @ApiStatus.Internal default int upcall(MemoryAddress source, int condition, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(source, Ownership.NONE), new org.gtk.glib.IOCondition(condition));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IOFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

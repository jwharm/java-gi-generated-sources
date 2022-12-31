package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of functions to be called when a UNIX fd watch source
 * triggers.
 */
@FunctionalInterface
public interface UnixFDSourceFunc {
    boolean run(int fd, org.gtk.glib.IOCondition condition);

    @ApiStatus.Internal default int upcall(int fd, int condition, MemoryAddress userData) {
        var RESULT = run(fd, new org.gtk.glib.IOCondition(condition));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnixFDSourceFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

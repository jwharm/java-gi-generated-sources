package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of functions to be called when a UNIX fd watch source
 * triggers.
 */
/**
 * Functional interface declaration of the {@code UnixFDSourceFunc} callback.
 */
@FunctionalInterface
public interface UnixFDSourceFunc {

    /**
     * The type of functions to be called when a UNIX fd watch source
     * triggers.
     */
    boolean run(int fd, org.gtk.glib.IOCondition condition);
    
    @ApiStatus.Internal default int upcall(int fd, int condition, MemoryAddress userData) {
        var RESULT = run(fd, new org.gtk.glib.IOCondition(condition));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnixFDSourceFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

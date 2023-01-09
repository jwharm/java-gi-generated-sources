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
/**
 * Functional interface declaration of the {@code IOFunc} callback.
 */
@FunctionalInterface
public interface IOFunc {

    /**
     * Specifies the type of function passed to g_io_add_watch() or
     * g_io_add_watch_full(), which is called when the requested condition
     * on a {@link IOChannel} is satisfied.
     */
    boolean run(org.gtk.glib.IOChannel source, org.gtk.glib.IOCondition condition);
    
    @ApiStatus.Internal default int upcall(MemoryAddress source, int condition, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.IOChannel.fromAddress.marshal(source, null), new org.gtk.glib.IOCondition(condition));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IOFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

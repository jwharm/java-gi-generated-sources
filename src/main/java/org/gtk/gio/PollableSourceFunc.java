package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_pollable_input_stream_create_source() and
 * g_pollable_output_stream_create_source().
 * @version 2.28
 */
/**
 * Functional interface declaration of the {@code PollableSourceFunc} callback.
 */
@FunctionalInterface
public interface PollableSourceFunc {

    /**
     * This is the function type of the callback used for the {@link org.gtk.glib.Source}
     * returned by g_pollable_input_stream_create_source() and
     * g_pollable_output_stream_create_source().
     * @version 2.28
     */
    boolean run(org.gtk.gobject.GObject pollableStream);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pollableStream, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.GObject) Interop.register(pollableStream, org.gtk.gobject.GObject.fromAddress).marshal(pollableStream, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PollableSourceFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

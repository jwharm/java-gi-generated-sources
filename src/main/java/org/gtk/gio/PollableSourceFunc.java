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
@FunctionalInterface
public interface PollableSourceFunc {
    boolean run(org.gtk.gobject.GObject pollableStream);

    @ApiStatus.Internal default int upcall(MemoryAddress pollableStream, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pollableStream)), org.gtk.gobject.GObject.fromAddress).marshal(pollableStream, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PollableSourceFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

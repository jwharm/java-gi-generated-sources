package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_socket_create_source().
 * @version 2.22
 */
@FunctionalInterface
public interface SocketSourceFunc {
    boolean run(org.gtk.gio.Socket socket, org.gtk.glib.IOCondition condition);

    @ApiStatus.Internal default int upcall(MemoryAddress socket, int condition, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.Socket) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(socket)), org.gtk.gio.Socket.fromAddress).marshal(socket, Ownership.NONE), new org.gtk.glib.IOCondition(condition));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SocketSourceFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

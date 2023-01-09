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
/**
 * Functional interface declaration of the {@code SocketSourceFunc} callback.
 */
@FunctionalInterface
public interface SocketSourceFunc {

    /**
     * This is the function type of the callback used for the {@link org.gtk.glib.Source}
     * returned by g_socket_create_source().
     * @version 2.22
     */
    boolean run(org.gtk.gio.Socket socket, org.gtk.glib.IOCondition condition);
    
    @ApiStatus.Internal default int upcall(MemoryAddress socket, int condition, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.Socket) Interop.register(socket, org.gtk.gio.Socket.fromAddress).marshal(socket, null), new org.gtk.glib.IOCondition(condition));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SocketSourceFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

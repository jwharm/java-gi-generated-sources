package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_datagram_based_create_source().
 * @version 2.48
 */
/**
 * Functional interface declaration of the {@code DatagramBasedSourceFunc} callback.
 */
@FunctionalInterface
public interface DatagramBasedSourceFunc {

    /**
     * This is the function type of the callback used for the {@link org.gtk.glib.Source}
     * returned by g_datagram_based_create_source().
     * @version 2.48
     */
    boolean run(org.gtk.gio.DatagramBased datagramBased, org.gtk.glib.IOCondition condition);
    
    @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, int condition, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.DatagramBased) Interop.register(datagramBased, org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, null), new org.gtk.glib.IOCondition(condition));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DatagramBasedSourceFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

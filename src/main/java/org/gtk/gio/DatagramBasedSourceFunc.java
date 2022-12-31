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
@FunctionalInterface
public interface DatagramBasedSourceFunc {
    boolean run(org.gtk.gio.DatagramBased datagramBased, org.gtk.glib.IOCondition condition);

    @ApiStatus.Internal default int upcall(MemoryAddress datagramBased, int condition, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.DatagramBased) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(datagramBased)), org.gtk.gio.DatagramBased.fromAddress).marshal(datagramBased, Ownership.NONE), new org.gtk.glib.IOCondition(condition));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DatagramBasedSourceFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

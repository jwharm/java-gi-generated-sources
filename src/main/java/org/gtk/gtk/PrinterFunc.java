package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function passed to gtk_enumerate_printers().
 * <p>
 * Note that you need to ref {@code printer}, if you want to keep
 * a reference to it after the function has returned.
 */
@FunctionalInterface
public interface PrinterFunc {
    boolean run(org.gtk.gtk.Printer printer);

    @ApiStatus.Internal default int upcall(MemoryAddress printer, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.Printer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(printer)), org.gtk.gtk.Printer.fromAddress).marshal(printer, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrinterFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

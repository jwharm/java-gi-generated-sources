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
/**
 * Functional interface declaration of the {@code PrinterFunc} callback.
 */
@FunctionalInterface
public interface PrinterFunc {

    /**
     * The type of function passed to gtk_enumerate_printers().
     * <p>
     * Note that you need to ref {@code printer}, if you want to keep
     * a reference to it after the function has returned.
     */
    boolean run(org.gtk.gtk.Printer printer);
    
    @ApiStatus.Internal default int upcall(MemoryAddress printer, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.Printer) Interop.register(printer, org.gtk.gtk.Printer.fromAddress).marshal(printer, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrinterFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Will be called whenever the row changes or is added and lets you control
 * if the row should be visible or not.
 */
/**
 * Functional interface declaration of the {@code ListBoxFilterFunc} callback.
 */
@FunctionalInterface
public interface ListBoxFilterFunc {

    /**
     * Will be called whenever the row changes or is added and lets you control
     * if the row should be visible or not.
     */
    boolean run(org.gtk.gtk.ListBoxRow row);
    
    @ApiStatus.Internal default int upcall(MemoryAddress row, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.ListBoxRow) Interop.register(row, org.gtk.gtk.ListBoxRow.fromAddress).marshal(row, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListBoxFilterFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

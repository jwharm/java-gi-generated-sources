package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Will be called whenever the row changes or is added and lets you control
 * if the row should be visible or not.
 */
@FunctionalInterface
public interface ListBoxFilterFunc {
    boolean run(org.gtk.gtk.ListBoxRow row);

    @ApiStatus.Internal default int upcall(MemoryAddress row, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.ListBoxRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(row)), org.gtk.gtk.ListBoxRow.fromAddress).marshal(row, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ListBoxFilterFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

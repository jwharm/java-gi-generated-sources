package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Compare two rows to determine which should be first.
 */
@FunctionalInterface
public interface ListBoxSortFunc {
    int run(org.gtk.gtk.ListBoxRow row1, org.gtk.gtk.ListBoxRow row2);

    @ApiStatus.Internal default int upcall(MemoryAddress row1, MemoryAddress row2, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.ListBoxRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(row1)), org.gtk.gtk.ListBoxRow.fromAddress).marshal(row1, Ownership.NONE), (org.gtk.gtk.ListBoxRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(row2)), org.gtk.gtk.ListBoxRow.fromAddress).marshal(row2, Ownership.NONE));
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ListBoxSortFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

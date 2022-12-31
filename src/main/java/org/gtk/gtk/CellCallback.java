package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the callback functions used for iterating over
 * the cell renderers of a {@code GtkCellArea}, see gtk_cell_area_foreach().
 */
@FunctionalInterface
public interface CellCallback {
    boolean run(org.gtk.gtk.CellRenderer renderer);

    @ApiStatus.Internal default int upcall(MemoryAddress renderer, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CellCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the callback functions used for iterating over the
 * cell renderers and their allocated areas inside a {@code GtkCellArea},
 * see gtk_cell_area_foreach_alloc().
 */
@FunctionalInterface
public interface CellAllocCallback {
    boolean run(org.gtk.gtk.CellRenderer renderer, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle cellBackground);

    @ApiStatus.Internal default int upcall(MemoryAddress renderer, MemoryAddress cellArea, MemoryAddress cellBackground, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(cellBackground, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CellAllocCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

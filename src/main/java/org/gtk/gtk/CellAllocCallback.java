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
/**
 * Functional interface declaration of the {@code CellAllocCallback} callback.
 */
@FunctionalInterface
public interface CellAllocCallback {

    /**
     * The type of the callback functions used for iterating over the
     * cell renderers and their allocated areas inside a {@code GtkCellArea},
     * see gtk_cell_area_foreach_alloc().
     */
    boolean run(org.gtk.gtk.CellRenderer renderer, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle cellBackground);
    
    @ApiStatus.Internal default int upcall(MemoryAddress renderer, MemoryAddress cellArea, MemoryAddress cellBackground, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.CellRenderer) Interop.register(renderer, org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, null), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, null), org.gtk.gdk.Rectangle.fromAddress.marshal(cellBackground, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CellAllocCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

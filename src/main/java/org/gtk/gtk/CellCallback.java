package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the callback functions used for iterating over
 * the cell renderers of a {@code GtkCellArea}, see gtk_cell_area_foreach().
 */
/**
 * Functional interface declaration of the {@code CellCallback} callback.
 */
@FunctionalInterface
public interface CellCallback {

    /**
     * The type of the callback functions used for iterating over
     * the cell renderers of a {@code GtkCellArea}, see gtk_cell_area_foreach().
     */
    boolean run(org.gtk.gtk.CellRenderer renderer);
    
    @ApiStatus.Internal default int upcall(MemoryAddress renderer, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.CellRenderer) Interop.register(renderer, org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CellCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

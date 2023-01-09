package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to set the properties of a cell instead of just using the
 * straight mapping between the cell and the model.
 * <p>
 * This function is useful for customizing the cell renderer. For example,
 * a function might get an* integer from the {@code tree_model}, and render it to
 * the “text” attribute of “cell” by converting it to its written equivalent.
 * <p>
 * See also: gtk_tree_view_column_set_cell_data_func()
 */
/**
 * Functional interface declaration of the {@code TreeCellDataFunc} callback.
 */
@FunctionalInterface
public interface TreeCellDataFunc {

    /**
     * A function to set the properties of a cell instead of just using the
     * straight mapping between the cell and the model.
     * <p>
     * This function is useful for customizing the cell renderer. For example,
     * a function might get an* integer from the {@code tree_model}, and render it to
     * the “text” attribute of “cell” by converting it to its written equivalent.
     * <p>
     * See also: gtk_tree_view_column_set_cell_data_func()
     */
    void run(org.gtk.gtk.TreeViewColumn treeColumn, org.gtk.gtk.CellRenderer cell, org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);
    
    @ApiStatus.Internal default void upcall(MemoryAddress treeColumn, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        run((org.gtk.gtk.TreeViewColumn) Interop.register(treeColumn, org.gtk.gtk.TreeViewColumn.fromAddress).marshal(treeColumn, null), (org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeCellDataFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

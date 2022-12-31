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
@FunctionalInterface
public interface TreeCellDataFunc {
    void run(org.gtk.gtk.TreeViewColumn treeColumn, org.gtk.gtk.CellRenderer cell, org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);

    @ApiStatus.Internal default void upcall(MemoryAddress treeColumn, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        run((org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeColumn)), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(treeColumn, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TreeCellDataFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}

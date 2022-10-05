package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for Drag-and-Drop destinations in {@code GtkTreeView}.
 */
public interface TreeDragSource extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_tree_drag_source_drag_data_delete = Interop.downcallHandle(
        "gtk_tree_drag_source_drag_data_delete",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asks the {@code GtkTreeDragSource} to delete the row at {@code path}, because
     * it was moved somewhere else via drag-and-drop. Returns {@code false}
     * if the deletion fails because {@code path} no longer exists, or for
     * some model-specific reason. Should robustly handle a {@code path} no
     * longer found in the model!
     */
    public default boolean dragDataDelete(TreePath path) {
        try {
            var RESULT = (int) gtk_tree_drag_source_drag_data_delete.invokeExact(handle(), path.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_drag_source_drag_data_get = Interop.downcallHandle(
        "gtk_tree_drag_source_drag_data_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asks the {@code GtkTreeDragSource} to return a {@code GdkContentProvider} representing
     * the row at {@code path}. Should robustly handle a {@code path} no
     * longer found in the model!
     */
    public default org.gtk.gdk.ContentProvider dragDataGet(TreePath path) {
        try {
            var RESULT = (MemoryAddress) gtk_tree_drag_source_drag_data_get.invokeExact(handle(), path.handle());
            return new org.gtk.gdk.ContentProvider(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_drag_source_row_draggable = Interop.downcallHandle(
        "gtk_tree_drag_source_row_draggable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asks the {@code GtkTreeDragSource} whether a particular row can be used as
     * the source of a DND operation. If the source doesn’t implement
     * this interface, the row is assumed draggable.
     */
    public default boolean rowDraggable(TreePath path) {
        try {
            var RESULT = (int) gtk_tree_drag_source_row_draggable.invokeExact(handle(), path.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class TreeDragSourceImpl extends org.gtk.gobject.Object implements TreeDragSource {
        public TreeDragSourceImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

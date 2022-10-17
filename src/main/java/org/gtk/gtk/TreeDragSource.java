package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for Drag-and-Drop destinations in {@code GtkTreeView}.
 */
public interface TreeDragSource extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle gtk_tree_drag_source_drag_data_delete = Interop.downcallHandle(
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
    default boolean dragDataDelete(@NotNull TreePath path) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_drag_source_drag_data_delete.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_drag_source_drag_data_get = Interop.downcallHandle(
        "gtk_tree_drag_source_drag_data_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asks the {@code GtkTreeDragSource} to return a {@code GdkContentProvider} representing
     * the row at {@code path}. Should robustly handle a {@code path} no
     * longer found in the model!
     */
    default @Nullable org.gtk.gdk.ContentProvider dragDataGet(@NotNull TreePath path) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_drag_source_drag_data_get.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentProvider(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_drag_source_row_draggable = Interop.downcallHandle(
        "gtk_tree_drag_source_row_draggable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asks the {@code GtkTreeDragSource} whether a particular row can be used as
     * the source of a DND operation. If the source doesn’t implement
     * this interface, the row is assumed draggable.
     */
    default boolean rowDraggable(@NotNull TreePath path) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_drag_source_row_draggable.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    class TreeDragSourceImpl extends org.gtk.gobject.Object implements TreeDragSource {
        public TreeDragSourceImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

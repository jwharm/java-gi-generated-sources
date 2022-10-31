package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for Drag-and-Drop destinations in {@code GtkTreeView}.
 */
public interface TreeDragSource extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to TreeDragSource if its GType is a (or inherits from) "GtkTreeDragSource".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TreeDragSource" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTreeDragSource", a ClassCastException will be thrown.
     */
    public static TreeDragSource castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkTreeDragSource"))) {
            return new TreeDragSourceImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTreeDragSource");
        }
    }
    
    /**
     * Asks the {@code GtkTreeDragSource} to delete the row at {@code path}, because
     * it was moved somewhere else via drag-and-drop. Returns {@code false}
     * if the deletion fails because {@code path} no longer exists, or for
     * some model-specific reason. Should robustly handle a {@code path} no
     * longer found in the model!
     * @param path row that was being dragged
     * @return {@code true} if the row was successfully deleted
     */
    default boolean dragDataDelete(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_drag_source_drag_data_delete.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asks the {@code GtkTreeDragSource} to return a {@code GdkContentProvider} representing
     * the row at {@code path}. Should robustly handle a {@code path} no
     * longer found in the model!
     * @param path row that was dragged
     * @return a {@code GdkContentProvider} for the
     *    given {@code path}
     */
    default @Nullable org.gtk.gdk.ContentProvider dragDataGet(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_drag_source_drag_data_get.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentProvider(Refcounted.get(RESULT, true));
    }
    
    /**
     * Asks the {@code GtkTreeDragSource} whether a particular row can be used as
     * the source of a DND operation. If the source doesn’t implement
     * this interface, the row is assumed draggable.
     * @param path row on which user is initiating a drag
     * @return {@code true} if the row can be dragged
     */
    default boolean rowDraggable(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_drag_source_row_draggable.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_source_drag_data_delete = Interop.downcallHandle(
            "gtk_tree_drag_source_drag_data_delete",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_source_drag_data_get = Interop.downcallHandle(
            "gtk_tree_drag_source_drag_data_get",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_drag_source_row_draggable = Interop.downcallHandle(
            "gtk_tree_drag_source_row_draggable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class TreeDragSourceImpl extends org.gtk.gobject.Object implements TreeDragSource {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public TreeDragSourceImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for Drag-and-Drop destinations in {@code GtkTreeView}.
 */
public interface TreeDragDest extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle gtk_tree_drag_dest_drag_data_received = Interop.downcallHandle(
        "gtk_tree_drag_dest_drag_data_received",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asks the {@code GtkTreeDragDest} to insert a row before the path {@code dest},
     * deriving the contents of the row from {@code value}. If {@code dest} is
     * outside the tree so that inserting before it is impossible, {@code false}
     * will be returned. Also, {@code false} may be returned if the new row is
     * not created for some model-specific reason.  Should robustly handle
     * a {@code dest} no longer found in the model!
     */
    default boolean dragDataReceived(@NotNull TreePath dest, @NotNull org.gtk.gobject.Value value) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_drag_dest_drag_data_received.invokeExact(handle(), dest.handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_tree_drag_dest_row_drop_possible = Interop.downcallHandle(
        "gtk_tree_drag_dest_row_drop_possible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines whether a drop is possible before the given {@code dest_path},
     * at the same depth as {@code dest_path}. i.e., can we drop the data in
     * {@code value} at that location. {@code dest_path} does not have to
     * exist; the return value will almost certainly be {@code false} if the
     * parent of {@code dest_path} doesn’t exist, though.
     */
    default boolean rowDropPossible(@NotNull TreePath destPath, @NotNull org.gtk.gobject.Value value) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_drag_dest_row_drop_possible.invokeExact(handle(), destPath.handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    class TreeDragDestImpl extends org.gtk.gobject.Object implements TreeDragDest {
        public TreeDragDestImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

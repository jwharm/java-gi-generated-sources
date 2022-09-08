package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for Drag-and-Drop destinations in `GtkTreeView`.
 */
public interface TreeDragDest extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Asks the `GtkTreeDragDest` to insert a row before the path @dest,
     * deriving the contents of the row from @value. If @dest is
     * outside the tree so that inserting before it is impossible, %FALSE
     * will be returned. Also, %FALSE may be returned if the new row is
     * not created for some model-specific reason.  Should robustly handle
     * a @dest no longer found in the model!
     */
    public default boolean dragDataReceived(TreePath dest, org.gtk.gobject.Value value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_drag_dest_drag_data_received(HANDLE(), dest.HANDLE(), value.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a drop is possible before the given @dest_path,
     * at the same depth as @dest_path. i.e., can we drop the data in
     * @value at that location. @dest_path does not have to
     * exist; the return value will almost certainly be %FALSE if the
     * parent of @dest_path doesn’t exist, though.
     */
    public default boolean rowDropPossible(TreePath destPath, org.gtk.gobject.Value value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_drag_dest_row_drop_possible(HANDLE(), destPath.HANDLE(), value.HANDLE());
        return (RESULT != 0);
    }
    
    class TreeDragDestImpl extends org.gtk.gobject.Object implements TreeDragDest {
        public TreeDragDestImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}

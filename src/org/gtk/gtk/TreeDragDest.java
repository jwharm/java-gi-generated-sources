package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for Drag-and-Drop destinations in {@code GtkTreeView}.
 */
public interface TreeDragDest extends io.github.jwharm.javagi.Proxy {

    /**
     * Asks the {@code GtkTreeDragDest} to insert a row before the path {@code dest},
     * deriving the contents of the row from {@code value}. If {@code dest} is
     * outside the tree so that inserting before it is impossible, {@code false}
     * will be returned. Also, {@code false} may be returned if the new row is
     * not created for some model-specific reason.  Should robustly handle
     * a {@code dest} no longer found in the model!
     */
    public default boolean dragDataReceived(TreePath dest, org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gtk_tree_drag_dest_drag_data_received(handle(), dest.handle(), value.handle());
        return RESULT != 0;
    }
    
    /**
     * Determines whether a drop is possible before the given {@code dest_path},
     * at the same depth as {@code dest_path}. i.e., can we drop the data in
     * {@code value} at that location. {@code dest_path} does not have to
     * exist; the return value will almost certainly be {@code false} if the
     * parent of {@code dest_path} doesn’t exist, though.
     */
    public default boolean rowDropPossible(TreePath destPath, org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gtk_tree_drag_dest_row_drop_possible(handle(), destPath.handle(), value.handle());
        return RESULT != 0;
    }
    
    class TreeDragDestImpl extends org.gtk.gobject.Object implements TreeDragDest {
        public TreeDragDestImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}

package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for Drag-and-Drop destinations in <code>GtkTreeView</code>.
 */
public interface TreeDragDest extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Asks the <code>GtkTreeDragDest</code> to insert a row before the path @dest,
     * deriving the contents of the row from @value. If @dest is
     * outside the tree so that inserting before it is impossible, <code>false</code> will be returned. Also, <code>false</code> may be returned if the new row is
     * not created for some model-specific reason.  Should robustly handle
     * a @dest no longer found in the model!
     */
    public default boolean dragDataReceived(TreePath dest, org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gtk_tree_drag_dest_drag_data_received(handle(), dest.handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a drop is possible before the given @dest_path,
     * at the same depth as @dest_path. i.e., can we drop the data in
     * @value at that location. @dest_path does not have to
     * exist; the return value will almost certainly be <code>false</code> if the
     * parent of @dest_path doesn&<code>#8217</code> t exist, though.
     */
    public default boolean rowDropPossible(TreePath destPath, org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gtk_tree_drag_dest_row_drop_possible(handle(), destPath.handle(), value.handle());
        return (RESULT != 0);
    }
    
    class TreeDragDestImpl extends org.gtk.gobject.Object implements TreeDragDest {
        public TreeDragDestImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}

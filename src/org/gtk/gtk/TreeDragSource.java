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
public interface TreeDragSource extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Asks the <code>GtkTreeDragSource</code> to delete the row at @path, because
     * it was moved somewhere else via drag-and-drop. Returns <code>FALSE
     * if</code> the deletion fails because @path no longer exists, or for
     * some model-specific reason. Should robustly handle a @path no
     * longer found in the model!
     */
    public default boolean dragDataDelete(TreePath path) {
        var RESULT = gtk_h.gtk_tree_drag_source_drag_data_delete(handle(), path.handle());
        return (RESULT != 0);
    }
    
    /**
     * Asks the <code>GtkTreeDragSource</code> to return a <code>GdkContentProvider</code> representing
     * the row at @path. Should robustly handle a @path no
     * longer found in the model!
     */
    public default org.gtk.gdk.ContentProvider dragDataGet(TreePath path) {
        var RESULT = gtk_h.gtk_tree_drag_source_drag_data_get(handle(), path.handle());
        return new org.gtk.gdk.ContentProvider(References.get(RESULT, true));
    }
    
    /**
     * Asks the <code>GtkTreeDragSource</code> whether a particular row can be used as
     * the source of a DND operation. If the source doesn&#8217;t implement
     * this interface, the row is assumed draggable.
     */
    public default boolean rowDraggable(TreePath path) {
        var RESULT = gtk_h.gtk_tree_drag_source_row_draggable(handle(), path.handle());
        return (RESULT != 0);
    }
    
    class TreeDragSourceImpl extends org.gtk.gobject.Object implements TreeDragSource {
        public TreeDragSourceImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}

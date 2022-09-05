package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for Drag-and-Drop destinations in `GtkTreeView`.
 */
public interface TreeDragSource extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Asks the `GtkTreeDragSource` to delete the row at @path, because
     * it was moved somewhere else via drag-and-drop. Returns %FALSE
     * if the deletion fails because @path no longer exists, or for
     * some model-specific reason. Should robustly handle a @path no
     * longer found in the model!
     */
    public default boolean dragDataDelete(TreePath path) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_drag_source_drag_data_delete(HANDLE(), path.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Asks the `GtkTreeDragSource` to return a `GdkContentProvider` representing
     * the row at @path. Should robustly handle a @path no
     * longer found in the model!
     */
    public default org.gtk.gdk.ContentProvider dragDataGet(TreePath path) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_drag_source_drag_data_get(HANDLE(), path.HANDLE());
        return new org.gtk.gdk.ContentProvider(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Asks the `GtkTreeDragSource` whether a particular row can be used as
     * the source of a DND operation. If the source doesn’t implement
     * this interface, the row is assumed draggable.
     */
    public default boolean rowDraggable(TreePath path) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_drag_source_row_draggable(HANDLE(), path.HANDLE());
        return (RESULT != 0);
    }
    
    class TreeDragSourceImpl extends org.gtk.gobject.Object implements TreeDragSource {
        public TreeDragSourceImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}

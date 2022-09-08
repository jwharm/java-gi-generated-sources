package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders a pixbuf in a cell
 * 
 * A `GtkCellRendererPixbuf` can be used to render an image in a cell. It allows
 * to render either a given `GdkPixbuf` (set via the
 * `GtkCellRendererPixbuf:pixbuf` property) or a named icon (set via the
 * `GtkCellRendererPixbuf:icon-name` property).
 * 
 * To support the tree view, `GtkCellRendererPixbuf` also supports rendering two
 * alternative pixbufs, when the `GtkCellRenderer:is-expander` property is %TRUE.
 * If the `GtkCellRenderer:is-expanded property` is %TRUE and the
 * `GtkCellRendererPixbuf:pixbuf-expander-open` property is set to a pixbuf, it
 * renders that pixbuf, if the `GtkCellRenderer:is-expanded` property is %FALSE
 * and the `GtkCellRendererPixbuf:pixbuf-expander-closed` property is set to a
 * pixbuf, it renders that one.
 */
public class CellRendererPixbuf extends CellRenderer {

    public CellRendererPixbuf(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRendererPixbuf */
    public static CellRendererPixbuf castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererPixbuf(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkCellRendererPixbuf`. Adjust rendering
     * parameters using object properties. Object properties can be set
     * globally (with g_object_set()). Also, with `GtkTreeViewColumn`, you
     * can bind a property to a value in a `GtkTreeModel`. For example, you
     * can bind the “pixbuf” property on the cell renderer to a pixbuf value
     * in the model, thus rendering a different image in each row of the
     * `GtkTreeView`.
     */
    public CellRendererPixbuf() {
        super(References.get(gtk_h.gtk_cell_renderer_pixbuf_new(), false));
    }
    
}

package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a pixbuf in a cell
 * <p>
 * A {@code GtkCellRendererPixbuf} can be used to render an image in a cell. It allows
 * to render either a given {@code GdkPixbuf} (set via the
 * {@code GtkCellRendererPixbuf:pixbuf} property) or a named icon (set via the
 * {@code GtkCellRendererPixbuf:icon-name} property).
 * <p>
 * To support the tree view, {@code GtkCellRendererPixbuf} also supports rendering two
 * alternative pixbufs, when the {@code GtkCellRenderer:is-expander} property is {@code true}.
 * If the {@code GtkCellRenderer:is-expanded property} is {@code true} and the
 * {@code GtkCellRendererPixbuf:pixbuf-expander-open} property is set to a pixbuf, it
 * renders that pixbuf, if the {@code GtkCellRenderer:is-expanded} property is {@code false}
 * and the {@code GtkCellRendererPixbuf:pixbuf-expander-closed} property is set to a
 * pixbuf, it renders that one.
 */
public class CellRendererPixbuf extends org.gtk.gtk.CellRenderer {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public CellRendererPixbuf(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRendererPixbuf */
    public static CellRendererPixbuf castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererPixbuf(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_cell_renderer_pixbuf_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererPixbuf}. Adjust rendering
     * parameters using object properties. Object properties can be set
     * globally (with g_object_set()). Also, with {@code GtkTreeViewColumn}, you
     * can bind a property to a value in a {@code GtkTreeModel}. For example, you
     * can bind the “pixbuf” property on the cell renderer to a pixbuf value
     * in the model, thus rendering a different image in each row of the
     * {@code GtkTreeView}.
     */
    public CellRendererPixbuf() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_pixbuf_new = Interop.downcallHandle(
            "gtk_cell_renderer_pixbuf_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}

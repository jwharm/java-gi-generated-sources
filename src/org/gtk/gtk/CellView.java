package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A widget displaying a single row of a GtkTreeModel
 * 
 * A `GtkCellView` displays a single row of a `GtkTreeModel` using a `GtkCellArea`
 * and `GtkCellAreaContext`. A `GtkCellAreaContext` can be provided to the
 * `GtkCellView` at construction time in order to keep the cellview in context
 * of a group of cell views, this ensures that the renderers displayed will
 * be properly aligned with each other (like the aligned cells in the menus
 * of `GtkComboBox`).
 * 
 * `GtkCellView` is `GtkOrientable` in order to decide in which orientation
 * the underlying `GtkCellAreaContext` should be allocated. Taking the `GtkComboBox`
 * menu as an example, cellviews should be oriented horizontally if the menus are
 * listed top-to-bottom and thus all share the same width but may have separate
 * individual heights (left-to-right menus should be allocated vertically since
 * they all share the same height but may have variable widths).
 * 
 * # CSS nodes
 * 
 * GtkCellView has a single CSS node with name cellview.
 */
public class CellView extends Widget implements Accessible, Buildable, CellLayout, ConstraintTarget, Orientable {

    public CellView(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellView */
    public static CellView castFrom(org.gtk.gobject.Object gobject) {
        return new CellView(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_cell_view_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkCellView` widget.
     */
    public CellView() {
        super(constructNew());
    }
    
    private static Reference constructNewWithContext(CellArea area, CellAreaContext context) {
        Reference RESULT = References.get(gtk_h.gtk_cell_view_new_with_context(area.handle(), context.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkCellView` widget with a specific `GtkCellArea`
     * to layout cells and a specific `GtkCellAreaContext`.
     * 
     * Specifying the same context for a handful of cells lets
     * the underlying area synchronize the geometry for those cells,
     * in this way alignments with cellviews for other rows are
     * possible.
     */
    public static CellView newWithContext(CellArea area, CellAreaContext context) {
        return new CellView(constructNewWithContext(area, context));
    }
    
    private static Reference constructNewWithMarkup(java.lang.String markup) {
        Reference RESULT = References.get(gtk_h.gtk_cell_view_new_with_markup(Interop.allocateNativeString(markup).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText`
     * to it, and makes it show @markup. The text can be marked up with
     * the [Pango text markup language](https://docs.gtk.org/Pango/pango_markup.html).
     */
    public static CellView newWithMarkup(java.lang.String markup) {
        return new CellView(constructNewWithMarkup(markup));
    }
    
    private static Reference constructNewWithText(java.lang.String text) {
        Reference RESULT = References.get(gtk_h.gtk_cell_view_new_with_text(Interop.allocateNativeString(text).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText`
     * to it, and makes it show @text.
     */
    public static CellView newWithText(java.lang.String text) {
        return new CellView(constructNewWithText(text));
    }
    
    private static Reference constructNewWithTexture(org.gtk.gdk.Texture texture) {
        Reference RESULT = References.get(gtk_h.gtk_cell_view_new_with_texture(texture.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererPixbuf`
     * to it, and makes it show @texture.
     */
    public static CellView newWithTexture(org.gtk.gdk.Texture texture) {
        return new CellView(constructNewWithTexture(texture));
    }
    
    /**
     * Returns a `GtkTreePath` referring to the currently
     * displayed row. If no row is currently displayed,
     * %NULL is returned.
     */
    public TreePath getDisplayedRow() {
        var RESULT = gtk_h.gtk_cell_view_get_displayed_row(handle());
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Gets whether @cell_view is configured to draw all of its
     * cells in a sensitive state.
     */
    public boolean getDrawSensitive() {
        var RESULT = gtk_h.gtk_cell_view_get_draw_sensitive(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether @cell_view is configured to request space
     * to fit the entire `GtkTreeModel`.
     */
    public boolean getFitModel() {
        var RESULT = gtk_h.gtk_cell_view_get_fit_model(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the model for @cell_view. If no model is used %NULL is
     * returned.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_cell_view_get_model(handle());
        return new TreeModel.TreeModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets the row of the model that is currently displayed
     * by the `GtkCellView`. If the path is unset, then the
     * contents of the cellview “stick” at their last value;
     * this is not normally a desired result, but may be
     * a needed intermediate state if say, the model for
     * the `GtkCellView` becomes temporarily empty.
     */
    public void setDisplayedRow(TreePath path) {
        gtk_h.gtk_cell_view_set_displayed_row(handle(), path.handle());
    }
    
    /**
     * Sets whether @cell_view should draw all of its
     * cells in a sensitive state, this is used by `GtkComboBox` menus
     * to ensure that rows with insensitive cells that contain
     * children appear sensitive in the parent menu item.
     */
    public void setDrawSensitive(boolean drawSensitive) {
        gtk_h.gtk_cell_view_set_draw_sensitive(handle(), drawSensitive ? 1 : 0);
    }
    
    /**
     * Sets whether @cell_view should request space to fit the entire `GtkTreeModel`.
     * 
     * This is used by `GtkComboBox` to ensure that the cell view displayed on
     * the combo box’s button always gets enough space and does not resize
     * when selection changes.
     */
    public void setFitModel(boolean fitModel) {
        gtk_h.gtk_cell_view_set_fit_model(handle(), fitModel ? 1 : 0);
    }
    
    /**
     * Sets the model for @cell_view.  If @cell_view already has a model
     * set, it will remove it before setting the new model.  If @model is
     * %NULL, then it will unset the old model.
     */
    public void setModel(TreeModel model) {
        gtk_h.gtk_cell_view_set_model(handle(), model.handle());
    }
    
}

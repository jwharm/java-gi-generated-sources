package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A widget displaying a single row of a GtkTreeModel
 * <p>
 * A {@code GtkCellView} displays a single row of a {@code GtkTreeModel} using a {@code GtkCellArea}
 * and {@code GtkCellAreaContext}. A {@code GtkCellAreaContext} can be provided to the
 * {@code GtkCellView} at construction time in order to keep the cellview in context
 * of a group of cell views, this ensures that the renderers displayed will
 * be properly aligned with each other (like the aligned cells in the menus
 * of {@code GtkComboBox}).
 * <p>
 * {@code GtkCellView} is {@code GtkOrientable} in order to decide in which orientation
 * the underlying {@code GtkCellAreaContext} should be allocated. Taking the {@code GtkComboBox}
 * menu as an example, cellviews should be oriented horizontally if the menus are
 * listed top-to-bottom and thus all share the same width but may have separate
 * individual heights (left-to-right menus should be allocated vertically since
 * they all share the same height but may have variable widths).
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * GtkCellView has a single CSS node with name cellview.
 */
public class CellView extends Widget implements Accessible, Buildable, CellLayout, ConstraintTarget, Orientable {

    public CellView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellView */
    public static CellView castFrom(org.gtk.gobject.Object gobject) {
        return new CellView(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_cell_view_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget.
     */
    public CellView() {
        super(constructNew());
    }
    
    private static Refcounted constructNewWithContext(CellArea area, CellAreaContext context) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_cell_view_new_with_context(area.handle(), context.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget with a specific {@code GtkCellArea}
     * to layout cells and a specific {@code GtkCellAreaContext}.
     * <p>
     * Specifying the same context for a handful of cells lets
     * the underlying area synchronize the geometry for those cells,
     * in this way alignments with cellviews for other rows are
     * possible.
     */
    public static CellView newWithContext(CellArea area, CellAreaContext context) {
        return new CellView(constructNewWithContext(area, context));
    }
    
    private static Refcounted constructNewWithMarkup(java.lang.String markup) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_cell_view_new_with_markup(Interop.allocateNativeString(markup).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget, adds a {@code GtkCellRendererText}
     * to it, and makes it show {@code markup}. The text can be marked up with
     * the <a href="https://docs.gtk.org/Pango/pango_markup.html">Pango text markup language</a>.
     */
    public static CellView newWithMarkup(java.lang.String markup) {
        return new CellView(constructNewWithMarkup(markup));
    }
    
    private static Refcounted constructNewWithText(java.lang.String text) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_cell_view_new_with_text(Interop.allocateNativeString(text).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget, adds a {@code GtkCellRendererText}
     * to it, and makes it show {@code text}.
     */
    public static CellView newWithText(java.lang.String text) {
        return new CellView(constructNewWithText(text));
    }
    
    private static Refcounted constructNewWithTexture(org.gtk.gdk.Texture texture) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_cell_view_new_with_texture(texture.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget, adds a {@code GtkCellRendererPixbuf}
     * to it, and makes it show {@code texture}.
     */
    public static CellView newWithTexture(org.gtk.gdk.Texture texture) {
        return new CellView(constructNewWithTexture(texture));
    }
    
    /**
     * Returns a {@code GtkTreePath} referring to the currently
     * displayed row. If no row is currently displayed,
     * {@code null} is returned.
     */
    public TreePath getDisplayedRow() {
        var RESULT = gtk_h.gtk_cell_view_get_displayed_row(handle());
        return new TreePath(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets whether {@code cell_view} is configured to draw all of its
     * cells in a sensitive state.
     */
    public boolean getDrawSensitive() {
        var RESULT = gtk_h.gtk_cell_view_get_draw_sensitive(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code cell_view} is configured to request space
     * to fit the entire {@code GtkTreeModel}.
     */
    public boolean getFitModel() {
        var RESULT = gtk_h.gtk_cell_view_get_fit_model(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the model for {@code cell_view}. If no model is used {@code null} is
     * returned.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_cell_view_get_model(handle());
        return new TreeModel.TreeModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the row of the model that is currently displayed
     * by the {@code GtkCellView}. If the path is unset, then the
     * contents of the cellview “stick” at their last value;
     * this is not normally a desired result, but may be
     * a needed intermediate state if say, the model for
     * the {@code GtkCellView} becomes temporarily empty.
     */
    public void setDisplayedRow(TreePath path) {
        gtk_h.gtk_cell_view_set_displayed_row(handle(), path.handle());
    }
    
    /**
     * Sets whether {@code cell_view} should draw all of its
     * cells in a sensitive state, this is used by {@code GtkComboBox} menus
     * to ensure that rows with insensitive cells that contain
     * children appear sensitive in the parent menu item.
     */
    public void setDrawSensitive(boolean drawSensitive) {
        gtk_h.gtk_cell_view_set_draw_sensitive(handle(), drawSensitive ? 1 : 0);
    }
    
    /**
     * Sets whether {@code cell_view} should request space to fit the entire {@code GtkTreeModel}.
     * <p>
     * This is used by {@code GtkComboBox} to ensure that the cell view displayed on
     * the combo box’s button always gets enough space and does not resize
     * when selection changes.
     */
    public void setFitModel(boolean fitModel) {
        gtk_h.gtk_cell_view_set_fit_model(handle(), fitModel ? 1 : 0);
    }
    
    /**
     * Sets the model for {@code cell_view}.  If {@code cell_view} already has a model
     * set, it will remove it before setting the new model.  If {@code model} is
     * {@code null}, then it will unset the old model.
     */
    public void setModel(TreeModel model) {
        gtk_h.gtk_cell_view_set_model(handle(), model.handle());
    }
    
}

package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gtk.ListBoxRow} used to choose from a list of items.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="combo-row-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="combo-row.png" alt="combo-row"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwComboRow} widget allows the user to choose from a list of valid
 * choices. The row displays the selected choice. When activated, the row
 * displays a popover which allows the user to make a new choice.
 * <p>
 * {@code AdwComboRow} mirrors {@link org.gtk.gtk.DropDown}, see that widget for details.
 * <p>
 * {@code AdwComboRow} is {@code Gtk.ListBoxRow:activatable} if a model is set.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwComboRow} has a main CSS node with name {@code row} and the {@code .combo} style
 * class.
 * <p>
 * Its popover has the node named {@code popover} with the {@code .menu} style class, it
 * contains a {@link org.gtk.gtk.ScrolledWindow}, which in turn contains a
 * {@link org.gtk.gtk.ListView}, both are accessible via their regular nodes.
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code AdwComboRow} uses the {@code GTK_ACCESSIBLE_ROLE_COMBO_BOX} role.
 */
public class ComboRow extends ActionRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ComboRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ComboRow */
    public static ComboRow castFrom(org.gtk.gobject.Object gobject) {
        return new ComboRow(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.adw_combo_row_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwComboRow}.
     */
    public ComboRow() {
        super(constructNew());
    }
    
    /**
     * Gets the expression used to obtain strings from items.
     */
    public org.gtk.gtk.Expression getExpression() {
        var RESULT = gtk_h.adw_combo_row_get_expression(handle());
        return new org.gtk.gtk.Expression(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     */
    public org.gtk.gtk.ListItemFactory getFactory() {
        var RESULT = gtk_h.adw_combo_row_get_factory(handle());
        return new org.gtk.gtk.ListItemFactory(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the factory that's currently used to populate list items in the popup.
     */
    public org.gtk.gtk.ListItemFactory getListFactory() {
        var RESULT = gtk_h.adw_combo_row_get_list_factory(handle());
        return new org.gtk.gtk.ListItemFactory(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the model that provides the displayed items.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.adw_combo_row_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the position of the selected item.
     */
    public int getSelected() {
        var RESULT = gtk_h.adw_combo_row_get_selected(handle());
        return RESULT;
    }
    
    /**
     * Gets the selected item.
     */
    public org.gtk.gobject.Object getSelectedItem() {
        var RESULT = gtk_h.adw_combo_row_get_selected_item(handle());
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether to use the current value as the subtitle.
     */
    public boolean getUseSubtitle() {
        var RESULT = gtk_h.adw_combo_row_get_use_subtitle(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the expression used to obtain strings from items.
     * <p>
     * The expression must have a value type of {@code G_TYPE_STRING}.
     */
    public void setExpression(org.gtk.gtk.Expression expression) {
        gtk_h.adw_combo_row_set_expression(handle(), expression.handle());
    }
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items.
     */
    public void setFactory(org.gtk.gtk.ListItemFactory factory) {
        gtk_h.adw_combo_row_set_factory(handle(), factory.handle());
    }
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items in the popup.
     */
    public void setListFactory(org.gtk.gtk.ListItemFactory factory) {
        gtk_h.adw_combo_row_set_list_factory(handle(), factory.handle());
    }
    
    /**
     * Sets the {@code Gio.ListModel} to use.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.adw_combo_row_set_model(handle(), model.handle());
    }
    
    /**
     * Selects the item at the given position.
     */
    public void setSelected(int position) {
        gtk_h.adw_combo_row_set_selected(handle(), position);
    }
    
    /**
     * Sets whether to use the current value as the subtitle.
     */
    public void setUseSubtitle(boolean useSubtitle) {
        gtk_h.adw_combo_row_set_use_subtitle(handle(), useSubtitle ? 1 : 0);
    }
    
}

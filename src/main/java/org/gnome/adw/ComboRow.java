package org.gnome.adw;

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
    
    static final MethodHandle adw_combo_row_new = Interop.downcallHandle(
        "adw_combo_row_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_combo_row_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwComboRow}.
     */
    public ComboRow() {
        super(constructNew());
    }
    
    static final MethodHandle adw_combo_row_get_expression = Interop.downcallHandle(
        "adw_combo_row_get_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the expression used to obtain strings from items.
     */
    public org.gtk.gtk.Expression getExpression() {
        try {
            var RESULT = (MemoryAddress) adw_combo_row_get_expression.invokeExact(handle());
            return new org.gtk.gtk.Expression(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_get_factory = Interop.downcallHandle(
        "adw_combo_row_get_factory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the factory that's currently used to populate list items.
     */
    public org.gtk.gtk.ListItemFactory getFactory() {
        try {
            var RESULT = (MemoryAddress) adw_combo_row_get_factory.invokeExact(handle());
            return new org.gtk.gtk.ListItemFactory(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_get_list_factory = Interop.downcallHandle(
        "adw_combo_row_get_list_factory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the factory that's currently used to populate list items in the popup.
     */
    public org.gtk.gtk.ListItemFactory getListFactory() {
        try {
            var RESULT = (MemoryAddress) adw_combo_row_get_list_factory.invokeExact(handle());
            return new org.gtk.gtk.ListItemFactory(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_get_model = Interop.downcallHandle(
        "adw_combo_row_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that provides the displayed items.
     */
    public org.gtk.gio.ListModel getModel() {
        try {
            var RESULT = (MemoryAddress) adw_combo_row_get_model.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_get_selected = Interop.downcallHandle(
        "adw_combo_row_get_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the position of the selected item.
     */
    public int getSelected() {
        try {
            var RESULT = (int) adw_combo_row_get_selected.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_get_selected_item = Interop.downcallHandle(
        "adw_combo_row_get_selected_item",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the selected item.
     */
    public org.gtk.gobject.Object getSelectedItem() {
        try {
            var RESULT = (MemoryAddress) adw_combo_row_get_selected_item.invokeExact(handle());
            return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_get_use_subtitle = Interop.downcallHandle(
        "adw_combo_row_get_use_subtitle",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether to use the current value as the subtitle.
     */
    public boolean getUseSubtitle() {
        try {
            var RESULT = (int) adw_combo_row_get_use_subtitle.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_set_expression = Interop.downcallHandle(
        "adw_combo_row_set_expression",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the expression used to obtain strings from items.
     * <p>
     * The expression must have a value type of {@code G_TYPE_STRING}.
     */
    public void setExpression(org.gtk.gtk.Expression expression) {
        try {
            adw_combo_row_set_expression.invokeExact(handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_set_factory = Interop.downcallHandle(
        "adw_combo_row_set_factory",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items.
     */
    public void setFactory(org.gtk.gtk.ListItemFactory factory) {
        try {
            adw_combo_row_set_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_set_list_factory = Interop.downcallHandle(
        "adw_combo_row_set_list_factory",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items in the popup.
     */
    public void setListFactory(org.gtk.gtk.ListItemFactory factory) {
        try {
            adw_combo_row_set_list_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_set_model = Interop.downcallHandle(
        "adw_combo_row_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code Gio.ListModel} to use.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        try {
            adw_combo_row_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_set_selected = Interop.downcallHandle(
        "adw_combo_row_set_selected",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Selects the item at the given position.
     */
    public void setSelected(int position) {
        try {
            adw_combo_row_set_selected.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_combo_row_set_use_subtitle = Interop.downcallHandle(
        "adw_combo_row_set_use_subtitle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to use the current value as the subtitle.
     */
    public void setUseSubtitle(boolean useSubtitle) {
        try {
            adw_combo_row_set_use_subtitle.invokeExact(handle(), useSubtitle ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
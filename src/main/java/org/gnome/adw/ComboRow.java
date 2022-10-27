package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
 * {@code AdwComboRow} has a main CSS node with name {@code row} and the {@code .combo} style
 * class.
 * <p>
 * Its popover has the node named {@code popover} with the {@code .menu} style class, it
 * contains a {@link org.gtk.gtk.ScrolledWindow}, which in turn contains a
 * {@link org.gtk.gtk.ListView}, both are accessible via their regular nodes.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwComboRow} uses the {@code GTK_ACCESSIBLE_ROLE_COMBO_BOX} role.
 * @version 1.0
 */
public class ComboRow extends org.gnome.adw.ActionRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gnome.adw.ActionRow.getMemoryLayout().withName("parent_instance")
    ).withName("AdwComboRow");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ComboRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ComboRow */
    public static ComboRow castFrom(org.gtk.gobject.Object gobject) {
        return new ComboRow(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_combo_row_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the expression used to obtain strings from items
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_expression.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Expression(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     * @return the factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_factory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ListItemFactory(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the factory that's currently used to populate list items in the popup.
     * @return the factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getListFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_list_factory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ListItemFactory(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the model that provides the displayed items.
     * @return The model in use
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the position of the selected item.
     * @return the position of the selected item, or
     *   {@code Gtk.INVALID_LIST_POSITION} if no item is selected
     */
    public int getSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_combo_row_get_selected.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the selected item.
     * @return the selected item
     */
    public @Nullable org.gtk.gobject.Object getSelectedItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_selected_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether to use the current value as the subtitle.
     * @return whether to use the current value as the subtitle
     */
    public boolean getUseSubtitle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_combo_row_get_use_subtitle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the expression used to obtain strings from items.
     * <p>
     * The expression must have a value type of {@code G_TYPE_STRING}.
     * @param expression an expression
     */
    public void setExpression(@Nullable org.gtk.gtk.Expression expression) {
        java.util.Objects.requireNonNullElse(expression, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_combo_row_set_expression.invokeExact(handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items.
     * @param factory the factory to use
     */
    public void setFactory(@Nullable org.gtk.gtk.ListItemFactory factory) {
        java.util.Objects.requireNonNullElse(factory, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_combo_row_set_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items in the popup.
     * @param factory the factory to use
     */
    public void setListFactory(@Nullable org.gtk.gtk.ListItemFactory factory) {
        java.util.Objects.requireNonNullElse(factory, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_combo_row_set_list_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code Gio.ListModel} to use.
     * @param model the model to use
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_combo_row_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects the item at the given position.
     * @param position the position of the item to select, or
     *   {@code Gtk.INVALID_LIST_POSITION}
     */
    public void setSelected(int position) {
        try {
            DowncallHandles.adw_combo_row_set_selected.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to use the current value as the subtitle.
     * @param useSubtitle whether to use the current value as the subtitle
     */
    public void setUseSubtitle(boolean useSubtitle) {
        try {
            DowncallHandles.adw_combo_row_set_use_subtitle.invokeExact(handle(), useSubtitle ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_combo_row_new = Interop.downcallHandle(
            "adw_combo_row_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_get_expression = Interop.downcallHandle(
            "adw_combo_row_get_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_get_factory = Interop.downcallHandle(
            "adw_combo_row_get_factory",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_get_list_factory = Interop.downcallHandle(
            "adw_combo_row_get_list_factory",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_get_model = Interop.downcallHandle(
            "adw_combo_row_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_get_selected = Interop.downcallHandle(
            "adw_combo_row_get_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_get_selected_item = Interop.downcallHandle(
            "adw_combo_row_get_selected_item",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_get_use_subtitle = Interop.downcallHandle(
            "adw_combo_row_get_use_subtitle",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_set_expression = Interop.downcallHandle(
            "adw_combo_row_set_expression",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_set_factory = Interop.downcallHandle(
            "adw_combo_row_set_factory",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_set_list_factory = Interop.downcallHandle(
            "adw_combo_row_set_list_factory",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_set_model = Interop.downcallHandle(
            "adw_combo_row_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_combo_row_set_selected = Interop.downcallHandle(
            "adw_combo_row_set_selected",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_combo_row_set_use_subtitle = Interop.downcallHandle(
            "adw_combo_row_set_use_subtitle",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}

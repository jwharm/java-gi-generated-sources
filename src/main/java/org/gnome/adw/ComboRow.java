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
 * Example of an {@code AdwComboRow} UI definition:
 * <pre>{@code xml
 * <object class="AdwComboRow">
 *   <property name="title" translatable="yes">Combo Row</property>
 *   <property name="model">
 *     <object class="GtkStringList">
 *       <items>
 *         <item translatable="yes">Foo</item>
 *         <item translatable="yes">Bar</item>
 *         <item translatable="yes">Baz</item>
 *       </items>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * The {@code ComboRow:selected] and [property@ComboRow:selected-item}
 * properties can be used to keep track of the selected item and react to their
 * changes.
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
    
    private static final java.lang.String C_TYPE_NAME = "AdwComboRow";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gnome.adw.ActionRow.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ComboRow proxy instance for the provided memory address.
     * <p>
     * Because ComboRow is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ComboRow(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ComboRow> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ComboRow(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwComboRow}.
     */
    public ComboRow() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the expression used to obtain strings from items.
     * @return the expression used to obtain strings from items
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_expression.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Expression) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Expression.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the factory for populating list items.
     * @return the factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_factory.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ListItemFactory) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.ListItemFactory.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the factory for populating list items in the popup.
     * @return the factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getListFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_list_factory.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ListItemFactory) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.ListItemFactory.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the model that provides the displayed items.
     * @return The model in use
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.ListModel.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the position of the selected item.
     * @return the position of the selected item, or
     *   {@code Gtk.INVALID_LIST_POSITION} if no item is selected
     */
    public int getSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_combo_row_get_selected.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the selected item.
     * @return the selected item
     */
    public @Nullable org.gtk.gobject.GObject getSelectedItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_combo_row_get_selected_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.GObject.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether to use the current value as the subtitle.
     * @return whether to use the current value as the subtitle
     */
    public boolean getUseSubtitle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_combo_row_get_use_subtitle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the expression used to obtain strings from items.
     * <p>
     * The expression must have a value type of {@code G_TYPE_STRING}.
     * <p>
     * It's used to bind strings to labels produced by the default factory if
     * {@code ComboRow:factory} is not set, or when
     * {@code ComboRow:use-subtitle} is set to {@code TRUE}.
     * @param expression an expression
     */
    public void setExpression(@Nullable org.gtk.gtk.Expression expression) {
        try {
            DowncallHandles.adw_combo_row_set_expression.invokeExact(
                    handle(),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the factory for populating list items.
     * <p>
     * This factory is always used for the item in the row. It is also used for
     * items in the popup unless {@code ComboRow:list-factory} is set.
     * @param factory the factory to use
     */
    public void setFactory(@Nullable org.gtk.gtk.ListItemFactory factory) {
        try {
            DowncallHandles.adw_combo_row_set_factory.invokeExact(
                    handle(),
                    (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the factory for populating list items in the popup.
     * <p>
     * If this is not set, {@code ComboRow:factory} is used.
     * @param factory the factory to use
     */
    public void setListFactory(@Nullable org.gtk.gtk.ListItemFactory factory) {
        try {
            DowncallHandles.adw_combo_row_set_list_factory.invokeExact(
                    handle(),
                    (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model that provides the displayed items.
     * @param model the model to use
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.adw_combo_row_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
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
            DowncallHandles.adw_combo_row_set_selected.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to use the current value as the subtitle.
     * <p>
     * If you use a custom list item factory, you will need to give the row a
     * name conversion expression with {@code ComboRow:expression}.
     * <p>
     * If set to {@code TRUE}, you should not access {@code ActionRow:subtitle}.
     * <p>
     * The subtitle is interpreted as Pango markup if
     * {@code PreferencesRow:use-markup} is set to {@code TRUE}.
     * @param useSubtitle whether to use the current value as the subtitle
     */
    public void setUseSubtitle(boolean useSubtitle) {
        try {
            DowncallHandles.adw_combo_row_set_use_subtitle.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(useSubtitle, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_combo_row_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ComboRow.Builder} object constructs a {@link ComboRow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ComboRow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gnome.adw.ActionRow.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ComboRow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ComboRow}.
         * @return A new instance of {@code ComboRow} with the properties 
         *         that were set in the Builder object.
         */
        public ComboRow build() {
            return (ComboRow) org.gtk.gobject.GObject.newWithProperties(
                ComboRow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * An expression used to obtain strings from items.
         * <p>
         * The expression must have a value type of {@code G_TYPE_STRING}.
         * <p>
         * It's used to bind strings to labels produced by the default factory if
         * {@code ComboRow:factory} is not set, or when
         * {@code ComboRow:use-subtitle} is set to {@code TRUE}.
         * @param expression The value for the {@code expression} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExpression(org.gtk.gtk.Expression expression) {
            names.add("expression");
            values.add(org.gtk.gobject.Value.create(expression));
            return this;
        }
        
        /**
         * Factory for populating list items.
         * <p>
         * This factory is always used for the item in the row. It is also used for
         * items in the popup unless {@code ComboRow:list-factory} is set.
         * @param factory The value for the {@code factory} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFactory(org.gtk.gtk.ListItemFactory factory) {
            names.add("factory");
            values.add(org.gtk.gobject.Value.create(factory));
            return this;
        }
        
        /**
         * The factory for populating list items in the popup.
         * <p>
         * If this is not set, {@code ComboRow:factory} is used.
         * @param listFactory The value for the {@code list-factory} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setListFactory(org.gtk.gtk.ListItemFactory listFactory) {
            names.add("list-factory");
            values.add(org.gtk.gobject.Value.create(listFactory));
            return this;
        }
        
        /**
         * The model that provides the displayed items.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gio.ListModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The position of the selected item.
         * <p>
         * If no item is selected, the property has the value
         * {@code Gtk.INVALID_LIST_POSITION}
         * @param selected The value for the {@code selected} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelected(int selected) {
            names.add("selected");
            values.add(org.gtk.gobject.Value.create(selected));
            return this;
        }
        
        /**
         * The selected item.
         * @param selectedItem The value for the {@code selected-item} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelectedItem(org.gtk.gobject.GObject selectedItem) {
            names.add("selected-item");
            values.add(org.gtk.gobject.Value.create(selectedItem));
            return this;
        }
        
        /**
         * Whether to use the current value as the subtitle.
         * <p>
         * If you use a custom list item factory, you will need to give the row a
         * name conversion expression with {@code ComboRow:expression}.
         * <p>
         * If set to {@code TRUE}, you should not access {@code ActionRow:subtitle}.
         * <p>
         * The subtitle is interpreted as Pango markup if
         * {@code PreferencesRow:use-markup} is set to {@code TRUE}.
         * @param useSubtitle The value for the {@code use-subtitle} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseSubtitle(boolean useSubtitle) {
            names.add("use-subtitle");
            values.add(org.gtk.gobject.Value.create(useSubtitle));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_combo_row_new = Interop.downcallHandle(
            "adw_combo_row_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_get_expression = Interop.downcallHandle(
            "adw_combo_row_get_expression",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_get_factory = Interop.downcallHandle(
            "adw_combo_row_get_factory",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_get_list_factory = Interop.downcallHandle(
            "adw_combo_row_get_list_factory",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_get_model = Interop.downcallHandle(
            "adw_combo_row_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_get_selected = Interop.downcallHandle(
            "adw_combo_row_get_selected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_get_selected_item = Interop.downcallHandle(
            "adw_combo_row_get_selected_item",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_get_use_subtitle = Interop.downcallHandle(
            "adw_combo_row_get_use_subtitle",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_set_expression = Interop.downcallHandle(
            "adw_combo_row_set_expression",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_set_factory = Interop.downcallHandle(
            "adw_combo_row_set_factory",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_set_list_factory = Interop.downcallHandle(
            "adw_combo_row_set_list_factory",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_set_model = Interop.downcallHandle(
            "adw_combo_row_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_combo_row_set_selected = Interop.downcallHandle(
            "adw_combo_row_set_selected",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_combo_row_set_use_subtitle = Interop.downcallHandle(
            "adw_combo_row_set_use_subtitle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_combo_row_get_type = Interop.downcallHandle(
            "adw_combo_row_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}

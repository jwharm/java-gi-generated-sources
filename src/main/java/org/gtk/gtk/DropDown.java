package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkDropDown} is a widget that allows the user to choose an item
 * from a list of options.
 * <p>
 * <img src="./doc-files/drop-down.png" alt="An example GtkDropDown">
 * <p>
 * The {@code GtkDropDown} displays the selected choice.
 * <p>
 * The options are given to {@code GtkDropDown} in the form of {@code GListModel}
 * and how the individual options are represented is determined by
 * a {@link ListItemFactory}. The default factory displays simple strings.
 * <p>
 * {@code GtkDropDown} knows how to obtain strings from the items in a
 * {@link StringList}; for other models, you have to provide an expression
 * to find the strings via {@link DropDown#setExpression}.
 * <p>
 * {@code GtkDropDown} can optionally allow search in the popup, which is
 * useful if the list of options is long. To enable the search entry,
 * use {@link DropDown#setEnableSearch}.
 * <p>
 * Here is a UI definition example for {@code GtkDropDown} with a simple model:
 * <pre>{@code xml
 * <object class="GtkDropDown">
 *   <property name="model">
 *     <object class="GtkStringList">
 *       <items>
 *         <item translatable="yes">Factory</item>
 *         <item translatable="yes">Home</item>
 *         <item translatable="yes">Subway</item>
 *       </items>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkDropDown} has a single CSS node with name dropdown,
 * with the button and popover nodes as children.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkDropDown} uses the {@link AccessibleRole#COMBO_BOX} role.
 */
public class DropDown extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDropDown";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DropDown proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DropDown(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DropDown> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DropDown(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Expression expression) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.yieldOwnership();
        expression.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDropDown}.
     * <p>
     * You may want to call {@link DropDown#setFactory}
     * to set up a way to map its items to widgets.
     * @param model the model to use
     * @param expression the expression to use
     */
    public DropDown(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Expression expression) {
        super(constructNew(model, expression));
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromStrings(java.lang.String[] strings) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_new_from_strings.invokeExact(Interop.allocateNativeArray(strings, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkDropDown} that is populated with
     * the strings.
     * @param strings The strings to put in the dropdown
     * @return a new {@code GtkDropDown}
     */
    public static DropDown newFromStrings(java.lang.String[] strings) {
        var RESULT = constructNewFromStrings(strings);
        var OBJECT = (org.gtk.gtk.DropDown) Interop.register(RESULT, org.gtk.gtk.DropDown.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns whether search is enabled.
     * @return {@code true} if the popup includes a search entry
     */
    public boolean getEnableSearch() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_down_get_enable_search.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the expression set that is used to obtain strings from items.
     * <p>
     * See {@link DropDown#setExpression}.
     * @return a {@code GtkExpression}
     */
    public @Nullable org.gtk.gtk.Expression getExpression() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_expression.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Expression) Interop.register(RESULT, org.gtk.gtk.Expression.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     * <p>
     * The factory returned by this function is always used for the
     * item in the button. It is also used for items in the popup
     * if {@code Gtk.DropDown:list-factory} is not set.
     * @return The factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_factory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ListItemFactory) Interop.register(RESULT, org.gtk.gtk.ListItemFactory.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the factory that's currently used to populate list items in the popup.
     * @return The factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getListFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_list_factory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ListItemFactory) Interop.register(RESULT, org.gtk.gtk.ListItemFactory.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the model that provides the displayed items.
     * @return The model in use
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) Interop.register(RESULT, org.gtk.gio.ListModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the position of the selected item.
     * @return the position of the selected item, or {@code GTK_INVALID_LIST_POSITION}
     *   if not item is selected
     */
    public int getSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_down_get_selected.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the selected item. If no item is selected, {@code null} is returned.
     * @return The selected item
     */
    public @Nullable org.gtk.gobject.GObject getSelectedItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_selected_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns whether to show an arrow within the widget.
     * @return {@code true} if an arrow will be shown.
     */
    public boolean getShowArrow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_down_get_show_arrow.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets whether a search entry will be shown in the popup that
     * allows to search for items in the list.
     * <p>
     * Note that {@code Gtk.DropDown:expression} must be set for
     * search to work.
     * @param enableSearch whether to enable search
     */
    public void setEnableSearch(boolean enableSearch) {
        try {
            DowncallHandles.gtk_drop_down_set_enable_search.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enableSearch, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the expression that gets evaluated to obtain strings from items.
     * <p>
     * This is used for search in the popup. The expression must have
     * a value type of {@code G_TYPE_STRING}.
     * @param expression a {@code GtkExpression}
     */
    public void setExpression(@Nullable org.gtk.gtk.Expression expression) {
        try {
            DowncallHandles.gtk_drop_down_set_expression.invokeExact(
                    handle(),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items.
     * @param factory the factory to use
     */
    public void setFactory(@Nullable org.gtk.gtk.ListItemFactory factory) {
        try {
            DowncallHandles.gtk_drop_down_set_factory.invokeExact(
                    handle(),
                    (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items in the popup.
     * @param factory the factory to use
     */
    public void setListFactory(@Nullable org.gtk.gtk.ListItemFactory factory) {
        try {
            DowncallHandles.gtk_drop_down_set_list_factory.invokeExact(
                    handle(),
                    (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GListModel} to use.
     * @param model the model to use
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.gtk_drop_down_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects the item at the given position.
     * @param position the position of the item to select, or {@code GTK_INVALID_LIST_POSITION}
     */
    public void setSelected(int position) {
        try {
            DowncallHandles.gtk_drop_down_set_selected.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether an arrow will be displayed within the widget.
     * @param showArrow whether to show an arrow within the widget
     */
    public void setShowArrow(boolean showArrow) {
        try {
            DowncallHandles.gtk_drop_down_set_show_arrow.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(showArrow, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_drop_down_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Activate} callback.
     */
    @FunctionalInterface
    public interface Activate {
    
        /**
         * Emitted to when the drop down is activated.
         * <p>
         * The {@code ::activate} signal on {@code GtkDropDown} is an action signal and
         * emitting it causes the drop down to pop up its dropdown.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDropDown) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Activate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to when the drop down is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkDropDown} is an action signal and
     * emitting it causes the drop down to pop up its dropdown.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropDown.Activate> onActivate(DropDown.Activate handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DropDown.Builder} object constructs a {@link DropDown} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DropDown.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DropDown} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DropDown}.
         * @return A new instance of {@code DropDown} with the properties 
         *         that were set in the Builder object.
         */
        public DropDown build() {
            return (DropDown) org.gtk.gobject.GObject.newWithProperties(
                DropDown.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to show a search entry in the popup.
         * <p>
         * Note that search requires {@code Gtk.DropDown:expression}
         * to be set.
         * @param enableSearch The value for the {@code enable-search} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnableSearch(boolean enableSearch) {
            names.add("enable-search");
            values.add(org.gtk.gobject.Value.create(enableSearch));
            return this;
        }
        
        /**
         * An expression to evaluate to obtain strings to match against the search
         * term.
         * <p>
         * See {@code Gtk.DropDown:enable-search} for how to enable search.
         * If {@code Gtk.DropDown:factory} is not set, the expression is also
         * used to bind strings to labels produced by a default factory.
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
         * If this is not set, {@code Gtk.DropDown:factory} is used.
         * @param listFactory The value for the {@code list-factory} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setListFactory(org.gtk.gtk.ListItemFactory listFactory) {
            names.add("list-factory");
            values.add(org.gtk.gobject.Value.create(listFactory));
            return this;
        }
        
        /**
         * Model for the displayed items.
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
         * {@code GTK_INVALID_LIST_POSITION}.
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
         * Whether to show an arrow within the GtkDropDown widget.
         * @param showArrow The value for the {@code show-arrow} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowArrow(boolean showArrow) {
            names.add("show-arrow");
            values.add(org.gtk.gobject.Value.create(showArrow));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_drop_down_new = Interop.downcallHandle(
                "gtk_drop_down_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_new_from_strings = Interop.downcallHandle(
                "gtk_drop_down_new_from_strings",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_get_enable_search = Interop.downcallHandle(
                "gtk_drop_down_get_enable_search",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_get_expression = Interop.downcallHandle(
                "gtk_drop_down_get_expression",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_get_factory = Interop.downcallHandle(
                "gtk_drop_down_get_factory",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_get_list_factory = Interop.downcallHandle(
                "gtk_drop_down_get_list_factory",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_get_model = Interop.downcallHandle(
                "gtk_drop_down_get_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_get_selected = Interop.downcallHandle(
                "gtk_drop_down_get_selected",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_get_selected_item = Interop.downcallHandle(
                "gtk_drop_down_get_selected_item",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_get_show_arrow = Interop.downcallHandle(
                "gtk_drop_down_get_show_arrow",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_set_enable_search = Interop.downcallHandle(
                "gtk_drop_down_set_enable_search",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_drop_down_set_expression = Interop.downcallHandle(
                "gtk_drop_down_set_expression",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_set_factory = Interop.downcallHandle(
                "gtk_drop_down_set_factory",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_set_list_factory = Interop.downcallHandle(
                "gtk_drop_down_set_list_factory",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_set_model = Interop.downcallHandle(
                "gtk_drop_down_set_model",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_drop_down_set_selected = Interop.downcallHandle(
                "gtk_drop_down_set_selected",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_drop_down_set_show_arrow = Interop.downcallHandle(
                "gtk_drop_down_set_show_arrow",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_drop_down_get_type = Interop.downcallHandle(
                "gtk_drop_down_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_drop_down_get_type != null;
    }
}

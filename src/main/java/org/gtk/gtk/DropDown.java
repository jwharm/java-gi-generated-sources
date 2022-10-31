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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public DropDown(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DropDown if its GType is a (or inherits from) "GtkDropDown".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DropDown" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkDropDown", a ClassCastException will be thrown.
     */
    public static DropDown castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkDropDown"))) {
            return new DropDown(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkDropDown");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Expression expression) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_drop_down_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.refcounted().unowned().handle()),
                    (Addressable) (expression == null ? MemoryAddress.NULL : expression.refcounted().unowned().handle())), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    }
    
    private static Refcounted constructNewFromStrings(java.lang.String[] strings) {
        java.util.Objects.requireNonNull(strings, "Parameter 'strings' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_drop_down_new_from_strings.invokeExact(
                    Interop.allocateNativeArray(strings, false)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDropDown} that is populated with
     * the strings.
     * @param strings The strings to put in the dropdown
     * @return a new {@code GtkDropDown}
     */
    public static DropDown newFromStrings(java.lang.String[] strings) {
        return new DropDown(constructNewFromStrings(strings));
    }
    
    /**
     * Returns whether search is enabled.
     * @return {@code true} if the popup includes a search entry
     */
    public boolean getEnableSearch() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_down_get_enable_search.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_expression.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Expression(Refcounted.get(RESULT, false));
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_factory.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ListItemFactory(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the factory that's currently used to populate list items in the popup.
     * @return The factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getListFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_list_factory.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the position of the selected item.
     * @return the position of the selected item, or {@code GTK_INVALID_LIST_POSITION}
     *   if not item is selected
     */
    public int getSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_down_get_selected.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the selected item. If no item is selected, {@code null} is returned.
     * @return The selected item
     */
    public @Nullable org.gtk.gobject.Object getSelectedItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_down_get_selected_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether to show an arrow within the widget.
     * @return {@code true} if an arrow will be shown.
     */
    public boolean getShowArrow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_down_get_show_arrow.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
                    enableSearch ? 1 : 0);
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
                    showArrow ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(DropDown source);
    }
    
    /**
     * Emitted to when the drop down is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkDropDown} is an action signal and
     * emitting it causes the drop down to pop up its dropdown.
     */
    public Signal<DropDown.Activate> onActivate(DropDown.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropDown.Callbacks.class, "signalDropDownActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DropDown.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_drop_down_new = Interop.downcallHandle(
            "gtk_drop_down_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_new_from_strings = Interop.downcallHandle(
            "gtk_drop_down_new_from_strings",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_get_enable_search = Interop.downcallHandle(
            "gtk_drop_down_get_enable_search",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_get_expression = Interop.downcallHandle(
            "gtk_drop_down_get_expression",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_get_factory = Interop.downcallHandle(
            "gtk_drop_down_get_factory",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_get_list_factory = Interop.downcallHandle(
            "gtk_drop_down_get_list_factory",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_get_model = Interop.downcallHandle(
            "gtk_drop_down_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_get_selected = Interop.downcallHandle(
            "gtk_drop_down_get_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_get_selected_item = Interop.downcallHandle(
            "gtk_drop_down_get_selected_item",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_get_show_arrow = Interop.downcallHandle(
            "gtk_drop_down_get_show_arrow",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_set_enable_search = Interop.downcallHandle(
            "gtk_drop_down_set_enable_search",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_drop_down_set_expression = Interop.downcallHandle(
            "gtk_drop_down_set_expression",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_set_factory = Interop.downcallHandle(
            "gtk_drop_down_set_factory",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_set_list_factory = Interop.downcallHandle(
            "gtk_drop_down_set_list_factory",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_set_model = Interop.downcallHandle(
            "gtk_drop_down_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drop_down_set_selected = Interop.downcallHandle(
            "gtk_drop_down_set_selected",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_drop_down_set_show_arrow = Interop.downcallHandle(
            "gtk_drop_down_set_show_arrow",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalDropDownActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DropDown.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DropDown(Refcounted.get(source)));
        }
    }
}

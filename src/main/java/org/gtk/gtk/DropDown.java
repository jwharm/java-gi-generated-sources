package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkDropDown} has a single CSS node with name dropdown,
 * with the button and popover nodes as children.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkDropDown} uses the {@link AccessibleRole#COMBO_BOX} role.
 */
public class DropDown extends Widget implements Accessible, Buildable, ConstraintTarget {

    public DropDown(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DropDown */
    public static DropDown castFrom(org.gtk.gobject.Object gobject) {
        return new DropDown(gobject.refcounted());
    }
    
    static final MethodHandle gtk_drop_down_new = Interop.downcallHandle(
        "gtk_drop_down_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gio.ListModel model, Expression expression) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_drop_down_new.invokeExact(model.refcounted().unowned().handle(), expression.refcounted().unowned().handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkDropDown}.
     * <p>
     * You may want to call {@link DropDown#setFactory}
     * to set up a way to map its items to widgets.
     */
    public DropDown(org.gtk.gio.ListModel model, Expression expression) {
        super(constructNew(model, expression));
    }
    
    static final MethodHandle gtk_drop_down_new_from_strings = Interop.downcallHandle(
        "gtk_drop_down_new_from_strings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromStrings(java.lang.String[] strings) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_drop_down_new_from_strings.invokeExact(Interop.allocateNativeArray(strings).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkDropDown} that is populated with
     * the strings.
     */
    public static DropDown newFromStrings(java.lang.String[] strings) {
        return new DropDown(constructNewFromStrings(strings));
    }
    
    static final MethodHandle gtk_drop_down_get_enable_search = Interop.downcallHandle(
        "gtk_drop_down_get_enable_search",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether search is enabled.
     */
    public boolean getEnableSearch() {
        try {
            var RESULT = (int) gtk_drop_down_get_enable_search.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_get_expression = Interop.downcallHandle(
        "gtk_drop_down_get_expression",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the expression set that is used to obtain strings from items.
     * <p>
     * See {@link DropDown#setExpression}.
     */
    public Expression getExpression() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_down_get_expression.invokeExact(handle());
            return new Expression(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_get_factory = Interop.downcallHandle(
        "gtk_drop_down_get_factory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the factory that's currently used to populate list items.
     * <p>
     * The factory returned by this function is always used for the
     * item in the button. It is also used for items in the popup
     * if {@code Gtk.DropDown:list-factory} is not set.
     */
    public ListItemFactory getFactory() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_down_get_factory.invokeExact(handle());
            return new ListItemFactory(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_get_list_factory = Interop.downcallHandle(
        "gtk_drop_down_get_list_factory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the factory that's currently used to populate list items in the popup.
     */
    public ListItemFactory getListFactory() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_down_get_list_factory.invokeExact(handle());
            return new ListItemFactory(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_get_model = Interop.downcallHandle(
        "gtk_drop_down_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that provides the displayed items.
     */
    public org.gtk.gio.ListModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_down_get_model.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_get_selected = Interop.downcallHandle(
        "gtk_drop_down_get_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the position of the selected item.
     */
    public int getSelected() {
        try {
            var RESULT = (int) gtk_drop_down_get_selected.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_get_selected_item = Interop.downcallHandle(
        "gtk_drop_down_get_selected_item",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the selected item. If no item is selected, {@code null} is returned.
     */
    public org.gtk.gobject.Object getSelectedItem() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_down_get_selected_item.invokeExact(handle());
            return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_get_show_arrow = Interop.downcallHandle(
        "gtk_drop_down_get_show_arrow",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether to show an arrow within the widget.
     */
    public boolean getShowArrow() {
        try {
            var RESULT = (int) gtk_drop_down_get_show_arrow.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_set_enable_search = Interop.downcallHandle(
        "gtk_drop_down_set_enable_search",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether a search entry will be shown in the popup that
     * allows to search for items in the list.
     * <p>
     * Note that {@code Gtk.DropDown:expression} must be set for
     * search to work.
     */
    public void setEnableSearch(boolean enableSearch) {
        try {
            gtk_drop_down_set_enable_search.invokeExact(handle(), enableSearch ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_set_expression = Interop.downcallHandle(
        "gtk_drop_down_set_expression",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the expression that gets evaluated to obtain strings from items.
     * <p>
     * This is used for search in the popup. The expression must have
     * a value type of {@code G_TYPE_STRING}.
     */
    public void setExpression(Expression expression) {
        try {
            gtk_drop_down_set_expression.invokeExact(handle(), expression.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_set_factory = Interop.downcallHandle(
        "gtk_drop_down_set_factory",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items.
     */
    public void setFactory(ListItemFactory factory) {
        try {
            gtk_drop_down_set_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_set_list_factory = Interop.downcallHandle(
        "gtk_drop_down_set_list_factory",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items in the popup.
     */
    public void setListFactory(ListItemFactory factory) {
        try {
            gtk_drop_down_set_list_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_set_model = Interop.downcallHandle(
        "gtk_drop_down_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GListModel} to use.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        try {
            gtk_drop_down_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_set_selected = Interop.downcallHandle(
        "gtk_drop_down_set_selected",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Selects the item at the given position.
     */
    public void setSelected(int position) {
        try {
            gtk_drop_down_set_selected.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_down_set_show_arrow = Interop.downcallHandle(
        "gtk_drop_down_set_show_arrow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether an arrow will be displayed within the widget.
     */
    public void setShowArrow(boolean showArrow) {
        try {
            gtk_drop_down_set_show_arrow.invokeExact(handle(), showArrow ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(DropDown source);
    }
    
    /**
     * Emitted to when the drop down is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkDropDown} is an action signal and
     * emitting it causes the drop down to pop up its dropdown.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropDown.Callbacks.class, "signalDropDownActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDropDownActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropDown.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropDown(Refcounted.get(source)));
        }
        
    }
}

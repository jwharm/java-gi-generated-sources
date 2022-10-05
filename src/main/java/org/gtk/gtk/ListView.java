package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkListView} presents a large dynamic list of items.
 * <p>
 * {@code GtkListView} uses its factory to generate one row widget for each visible
 * item and shows them in a linear display, either vertically or horizontally.
 * <p>
 * The {@code Gtk.ListView:show-separators} property offers a simple way to
 * display separators between the rows.
 * <p>
 * {@code GtkListView} allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on _rubberband selection_, using
 * {@code Gtk.ListView:enable-rubberband}.
 * <p>
 * If you need multiple columns with headers, see {@link ColumnView}.
 * <p>
 * To learn more about the list widget framework, see the
 * <a href="section-list-widget.html">overview</a>.
 * <p>
 * An example of using {@code GtkListView}:
 * <pre>{@code c
 * static void
 * setup_listitem_cb (GtkListItemFactory *factory,
 *                    GtkListItem        *list_item)
 * {
 *   GtkWidget *image;
 * 
 *   image = gtk_image_new ();
 *   gtk_image_set_icon_size (GTK_IMAGE (image), GTK_ICON_SIZE_LARGE);
 *   gtk_list_item_set_child (list_item, image);
 * }
 * 
 * static void
 * bind_listitem_cb (GtkListItemFactory *factory,
 *                   GtkListItem        *list_item)
 * {
 *   GtkWidget *image;
 *   GAppInfo *app_info;
 * 
 *   image = gtk_list_item_get_child (list_item);
 *   app_info = gtk_list_item_get_item (list_item);
 *   gtk_image_set_from_gicon (GTK_IMAGE (image), g_app_info_get_icon (app_info));
 * }
 * 
 * static void
 * activate_cb (GtkListView  *list,
 *              guint         position,
 *              gpointer      unused)
 * {
 *   GAppInfo *app_info;
 * 
 *   app_info = g_list_model_get_item (G_LIST_MODEL (gtk_list_view_get_model (list)), position);
 *   g_app_info_launch (app_info, NULL, NULL, NULL);
 *   g_object_unref (app_info);
 * }
 * 
 * ...
 * 
 *   model = create_application_list ();
 * 
 *   factory = gtk_signal_list_item_factory_new ();
 *   g_signal_connect (factory, "setup", G_CALLBACK (setup_listitem_cb), NULL);
 *   g_signal_connect (factory, "bind", G_CALLBACK (bind_listitem_cb), NULL);
 * 
 *   list = gtk_list_view_new (GTK_SELECTION_MODEL (gtk_single_selection_new (model)), factory);
 * 
 *   g_signal_connect (list, "activate", G_CALLBACK (activate_cb), NULL);
 * 
 *   gtk_scrolled_window_set_child (GTK_SCROLLED_WINDOW (sw), list);
 * }</pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * listview[.separators][.rich-list][.navigation-sidebar][.data-table]
 * ├── row[.activatable]
 * │
 * ├── row[.activatable]
 * │
 * ┊
 * ╰── [rubberband]
 * }</pre>
 * <p>
 * {@code GtkListView} uses a single CSS node named {@code listview}. It may carry the
 * {@code .separators} style class, when {@code Gtk.ListView:show-separators}
 * property is set. Each child widget uses a single CSS node named {@code row}.
 * If the {@code Gtk.ListItem:activatable} property is set, the
 * corresponding row will have the {@code .activatable} style class. For
 * rubberband selection, a node with name {@code rubberband} is used.
 * <p>
 * The main listview node may also carry style classes to select
 * the style of <a href="ListContainers.html#list-styles">list presentation</a>:
 * .rich-list, .navigation-sidebar or .data-table.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkListView} uses the {@link AccessibleRole#LIST} role, and the list
 * items use the {@link AccessibleRole#LIST_ITEM} role.
 */
public class ListView extends ListBase implements Accessible, Buildable, ConstraintTarget, Orientable, Scrollable {

    public ListView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ListView */
    public static ListView castFrom(org.gtk.gobject.Object gobject) {
        return new ListView(gobject.refcounted());
    }
    
    static final MethodHandle gtk_list_view_new = Interop.downcallHandle(
        "gtk_list_view_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(SelectionModel model, ListItemFactory factory) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_list_view_new.invokeExact(model.refcounted().unowned().handle(), factory.refcounted().unowned().handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkListView} that uses the given {@code factory} for
     * mapping items to widgets.
     * <p>
     * The function takes ownership of the
     * arguments, so you can write code like
     * <pre>{@code c
     * list_view = gtk_list_view_new (create_model (),
     *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
     * }</pre>
     */
    public ListView(SelectionModel model, ListItemFactory factory) {
        super(constructNew(model, factory));
    }
    
    static final MethodHandle gtk_list_view_get_enable_rubberband = Interop.downcallHandle(
        "gtk_list_view_get_enable_rubberband",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     */
    public boolean getEnableRubberband() {
        try {
            var RESULT = (int) gtk_list_view_get_enable_rubberband.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_view_get_factory = Interop.downcallHandle(
        "gtk_list_view_get_factory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the factory that's currently used to populate list items.
     */
    public ListItemFactory getFactory() {
        try {
            var RESULT = (MemoryAddress) gtk_list_view_get_factory.invokeExact(handle());
            return new ListItemFactory(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_view_get_model = Interop.downcallHandle(
        "gtk_list_view_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that's currently used to read the items displayed.
     */
    public SelectionModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_list_view_get_model.invokeExact(handle());
            return new SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_view_get_show_separators = Interop.downcallHandle(
        "gtk_list_view_get_show_separators",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the list box should show separators
     * between rows.
     */
    public boolean getShowSeparators() {
        try {
            var RESULT = (int) gtk_list_view_get_show_separators.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_view_get_single_click_activate = Interop.downcallHandle(
        "gtk_list_view_get_single_click_activate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether rows will be activated on single click and
     * selected on hover.
     */
    public boolean getSingleClickActivate() {
        try {
            var RESULT = (int) gtk_list_view_get_single_click_activate.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_view_set_enable_rubberband = Interop.downcallHandle(
        "gtk_list_view_set_enable_rubberband",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     */
    public void setEnableRubberband(boolean enableRubberband) {
        try {
            gtk_list_view_set_enable_rubberband.invokeExact(handle(), enableRubberband ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_view_set_factory = Interop.downcallHandle(
        "gtk_list_view_set_factory",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items.
     */
    public void setFactory(ListItemFactory factory) {
        try {
            gtk_list_view_set_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_view_set_model = Interop.downcallHandle(
        "gtk_list_view_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model to use.
     * <p>
     * This must be a {@code Gtk.SelectionModel} to use.
     */
    public void setModel(SelectionModel model) {
        try {
            gtk_list_view_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_view_set_show_separators = Interop.downcallHandle(
        "gtk_list_view_set_show_separators",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the list box should show separators
     * between rows.
     */
    public void setShowSeparators(boolean showSeparators) {
        try {
            gtk_list_view_set_show_separators.invokeExact(handle(), showSeparators ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_view_set_single_click_activate = Interop.downcallHandle(
        "gtk_list_view_set_single_click_activate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether rows should be activated on single click and
     * selected on hover.
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        try {
            gtk_list_view_set_single_click_activate.invokeExact(handle(), singleClickActivate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(ListView source, int position);
    }
    
    /**
     * Emitted when a row has been activated by the user,
     * usually via activating the GtkListView|list.activate-item action.
     * <p>
     * This allows for a convenient way to handle activation in a listview.
     * See {@link ListItem#setActivatable} for details on how to use
     * this signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListView.Callbacks.class, "signalListViewActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalListViewActivate(MemoryAddress source, int position, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListView.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListView(Refcounted.get(source)), position);
        }
        
    }
}

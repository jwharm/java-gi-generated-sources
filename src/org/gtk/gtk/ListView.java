package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkListView` presents a large dynamic list of items.
 * 
 * `GtkListView` uses its factory to generate one row widget for each visible
 * item and shows them in a linear display, either vertically or horizontally.
 * 
 * The [property@Gtk.ListView:show-separators] property offers a simple way to
 * display separators between the rows.
 * 
 * `GtkListView` allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on _rubberband selection_, using
 * [property@Gtk.ListView:enable-rubberband].
 * 
 * If you need multiple columns with headers, see [class@Gtk.ColumnView].
 * 
 * To learn more about the list widget framework, see the
 * [overview](section-list-widget.html).
 * 
 * An example of using `GtkListView`:
 * ```c
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
 * ```
 * 
 * # CSS nodes
 * 
 * ```
 * listview[.separators][.rich-list][.navigation-sidebar][.data-table]
 * ├── row[.activatable]
 * │
 * ├── row[.activatable]
 * │
 * ┊
 * ╰── [rubberband]
 * ```
 * 
 * `GtkListView` uses a single CSS node named `listview`. It may carry the
 * `.separators` style class, when [property@Gtk.ListView:show-separators]
 * property is set. Each child widget uses a single CSS node named `row`.
 * If the [property@Gtk.ListItem:activatable] property is set, the
 * corresponding row will have the `.activatable` style class. For
 * rubberband selection, a node with name `rubberband` is used.
 * 
 * The main listview node may also carry style classes to select
 * the style of [list presentation](ListContainers.html#list-styles):
 * .rich-list, .navigation-sidebar or .data-table.
 * 
 * # Accessibility
 * 
 * `GtkListView` uses the %GTK_ACCESSIBLE_ROLE_LIST role, and the list
 * items use the %GTK_ACCESSIBLE_ROLE_LIST_ITEM role.
 */
public class ListView extends ListBase implements Accessible, Buildable, ConstraintTarget, Orientable, Scrollable {

    public ListView(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ListView */
    public static ListView castFrom(org.gtk.gobject.Object gobject) {
        return new ListView(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkListView` that uses the given @factory for
     * mapping items to widgets.
     * 
     * The function takes ownership of the
     * arguments, so you can write code like
     * ```c
     * list_view = gtk_list_view_new (create_model (),
     *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
     * ```
     */
    public ListView(SelectionModel model, ListItemFactory factory) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_new(model.getProxy().unowned().HANDLE(), factory.getProxy().unowned().HANDLE()), false));
    }
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     */
    public boolean getEnableRubberband() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_get_enable_rubberband(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     */
    public ListItemFactory getFactory() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_get_factory(HANDLE());
        return new ListItemFactory(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the model that's currently used to read the items displayed.
     */
    public SelectionModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_get_model(HANDLE());
        return new SelectionModel.SelectionModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether the list box should show separators
     * between rows.
     */
    public boolean getShowSeparators() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_get_show_separators(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether rows will be activated on single click and
     * selected on hover.
     */
    public boolean getSingleClickActivate() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_get_single_click_activate(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     */
    public void setEnableRubberband(boolean enableRubberband) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_set_enable_rubberband(HANDLE(), enableRubberband ? 1 : 0);
    }
    
    /**
     * Sets the `GtkListItemFactory` to use for populating list items.
     */
    public void setFactory(ListItemFactory factory) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_set_factory(HANDLE(), factory.HANDLE());
    }
    
    /**
     * Sets the model to use.
     * 
     * This must be a [iface@Gtk.SelectionModel] to use.
     */
    public void setModel(SelectionModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_set_model(HANDLE(), model.HANDLE());
    }
    
    /**
     * Sets whether the list box should show separators
     * between rows.
     */
    public void setShowSeparators(boolean showSeparators) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_set_show_separators(HANDLE(), showSeparators ? 1 : 0);
    }
    
    /**
     * Sets whether rows should be activated on single click and
     * selected on hover.
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_view_set_single_click_activate(HANDLE(), singleClickActivate ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(ListView source, int position);
    }
    
    /**
     * Emitted when a row has been activated by the user,
     * usually via activating the GtkListView|list.activate-item action.
     * 
     * This allows for a convenient way to handle activation in a listview.
     * See [method@Gtk.ListItem.set_activatable] for details on how to use
     * this signal.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListViewActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

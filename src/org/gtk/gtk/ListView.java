package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkListView</code> presents a large dynamic list of items.
 * <p><code>GtkListView</code> uses its factory to generate one row widget for each visible
 * item and shows them in a linear display, either vertically or horizontally.
 * <p>
 * The {@link [property@Gtk.ListView:show-separators] (ref=property)} property offers a simple way to
 * display separators between the rows.
 * <p><code>GtkListView</code> allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on _rubberband selection_, using
 * {@link [property@Gtk.ListView:enable-rubberband] (ref=property)}.
 * <p>
 * If you need multiple columns with headers, see {@link org.gtk.gtk.ColumnView}.
 * <p>
 * To learn more about the list widget framework, see the
 * {@link [overview]}(section-list-widget.html).
 * <p>
 * An example of using <code>GtkListView</code>:<pre>c
 * static void
 * setup_listitem_cb (GtkListItemFactory *factory,
 *                    GtkListItem        *list_item)
 * {
 *   GtkWidget *image;
 * <p>
 *   image = gtk_image_new ();
 *   gtk_image_set_icon_size (GTK_IMAGE (image), GTK_ICON_SIZE_LARGE);
 *   gtk_list_item_set_child (list_item, image);
 * }
 * <p>
 * static void
 * bind_listitem_cb (GtkListItemFactory *factory,
 *                   GtkListItem        *list_item)
 * {
 *   GtkWidget *image;
 *   GAppInfo *app_info;
 * <p>
 *   image = gtk_list_item_get_child (list_item);
 *   app_info = gtk_list_item_get_item (list_item);
 *   gtk_image_set_from_gicon (GTK_IMAGE (image), g_app_info_get_icon (app_info));
 * }
 * <p>
 * static void
 * activate_cb (GtkListView  *list,
 *              guint         position,
 *              gpointer      unused)
 * {
 *   GAppInfo *app_info;
 * <p>
 *   app_info = g_list_model_get_item (G_LIST_MODEL (gtk_list_view_get_model (list)), position);
 *   g_app_info_launch (app_info, NULL, NULL, NULL);
 *   g_object_unref (app_info);
 * }
 * <p>
 * ...
 * <p>
 *   model = create_application_list ();
 * <p>
 *   factory = gtk_signal_list_item_factory_new ();
 *   g_signal_connect (factory, &#34;setup&#34;, G_CALLBACK (setup_listitem_cb), NULL);
 *   g_signal_connect (factory, &#34;bind&#34;, G_CALLBACK (bind_listitem_cb), NULL);
 * <p>
 *   list = gtk_list_view_new (GTK_SELECTION_MODEL (gtk_single_selection_new (model)), factory);
 * <p>
 *   g_signal_connect (list, &#34;activate&#34;, G_CALLBACK (activate_cb), NULL);
 * <p>
 *   gtk_scrolled_window_set_child (GTK_SCROLLED_WINDOW (sw), list);
 * </pre>
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * listview{@link [.separators]}{@link [.rich-list]}{@link [.navigation-sidebar]}{@link [.data-table]}
 * &#9500;&#9472;&#9472; row{@link [.activatable]}
 * &#9474;
 * &#9500;&#9472;&#9472; row{@link [.activatable]}
 * &#9474;
 * &#9482;
 * &#9584;&#9472;&#9472; {@link [rubberband]}
 * </pre>
 * <p><code>GtkListView</code> uses a single CSS node named <code>listview</code>. It may carry the<code>.separators</code> style class, when {@link [property@Gtk.ListView:show-separators] (ref=property)}
 * property is set. Each child widget uses a single CSS node named <code>row</code>.
 * If the {@link [property@Gtk.ListItem:activatable] (ref=property)} property is set, the
 * corresponding row will have the <code>.activatable</code> style class. For
 * rubberband selection, a node with name <code>rubberband</code> is used.
 * <p>
 * The main listview node may also carry style classes to select
 * the style of {@link [list presentation]}(ListContainers.html#list-styles):
 * .rich-list, .navigation-sidebar or .data-table.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkListView</code> uses the {@link org.gtk.gtk.AccessibleRole#LIST} role, and the list
 * items use the {@link org.gtk.gtk.AccessibleRole#LIST_ITEM} role.
 */
public class ListView extends ListBase implements Accessible, Buildable, ConstraintTarget, Orientable, Scrollable {

    public ListView(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ListView */
    public static ListView castFrom(org.gtk.gobject.Object gobject) {
        return new ListView(gobject.getReference());
    }
    
    private static Reference constructNew(SelectionModel model, ListItemFactory factory) {
        Reference RESULT = References.get(gtk_h.gtk_list_view_new(model.getReference().unowned().handle(), factory.getReference().unowned().handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkListView</code> that uses the given @factory for
     * mapping items to widgets.
     * <p>
     * The function takes ownership of the
     * arguments, so you can write code like<pre>c
     * list_view = gtk_list_view_new (create_model (),
     *   gtk_builder_list_item_factory_new_from_resource (&#34;/resource.ui&#34;));
     * </pre>
     */
    public ListView(SelectionModel model, ListItemFactory factory) {
        super(constructNew(model, factory));
    }
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     */
    public boolean getEnableRubberband() {
        var RESULT = gtk_h.gtk_list_view_get_enable_rubberband(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the factory that&#39;s currently used to populate list items.
     */
    public ListItemFactory getFactory() {
        var RESULT = gtk_h.gtk_list_view_get_factory(handle());
        return new ListItemFactory(References.get(RESULT, false));
    }
    
    /**
     * Gets the model that&#39;s currently used to read the items displayed.
     */
    public SelectionModel getModel() {
        var RESULT = gtk_h.gtk_list_view_get_model(handle());
        return new SelectionModel.SelectionModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the list box should show separators
     * between rows.
     */
    public boolean getShowSeparators() {
        var RESULT = gtk_h.gtk_list_view_get_show_separators(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether rows will be activated on single click and
     * selected on hover.
     */
    public boolean getSingleClickActivate() {
        var RESULT = gtk_h.gtk_list_view_get_single_click_activate(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     */
    public void setEnableRubberband(boolean enableRubberband) {
        gtk_h.gtk_list_view_set_enable_rubberband(handle(), enableRubberband ? 1 : 0);
    }
    
    /**
     * Sets the <code>GtkListItemFactory</code> to use for populating list items.
     */
    public void setFactory(ListItemFactory factory) {
        gtk_h.gtk_list_view_set_factory(handle(), factory.handle());
    }
    
    /**
     * Sets the model to use.
     * 
     * This must be a {@link [iface@Gtk.SelectionModel] (ref=iface)} to use.
     */
    public void setModel(SelectionModel model) {
        gtk_h.gtk_list_view_set_model(handle(), model.handle());
    }
    
    /**
     * Sets whether the list box should show separators
     * between rows.
     */
    public void setShowSeparators(boolean showSeparators) {
        gtk_h.gtk_list_view_set_show_separators(handle(), showSeparators ? 1 : 0);
    }
    
    /**
     * Sets whether rows should be activated on single click and
     * selected on hover.
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        gtk_h.gtk_list_view_set_single_click_activate(handle(), singleClickActivate ? 1 : 0);
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
     * See {@link org.gtk.gtk.ListItem#setActivatable} for details on how to use
     * this signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListViewActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

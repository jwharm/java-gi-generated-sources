package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkListView} uses the {@link AccessibleRole#LIST} role, and the list
 * items use the {@link AccessibleRole#LIST_ITEM} role.
 */
public class ListView extends org.gtk.gtk.ListBase implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable, org.gtk.gtk.Scrollable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkListView";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ListView proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ListView(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ListView if its GType is a (or inherits from) "GtkListView".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ListView} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkListView", a ClassCastException will be thrown.
     */
    public static ListView castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ListView.getType())) {
            return new ListView(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkListView");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.SelectionModel model, @Nullable org.gtk.gtk.ListItemFactory factory) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_view_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.yieldOwnership();
        factory.yieldOwnership();
        return RESULT;
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
     * @param model the model to use
     * @param factory The factory to populate items with
     */
    public ListView(@Nullable org.gtk.gtk.SelectionModel model, @Nullable org.gtk.gtk.ListItemFactory factory) {
        super(constructNew(model, factory), Ownership.NONE);
    }
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     * @return {@code true} if rubberband selection is enabled
     */
    public boolean getEnableRubberband() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_view_get_enable_rubberband.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     * @return The factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_view_get_factory.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ListItemFactory(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the model that's currently used to read the items displayed.
     * @return The model in use
     */
    public @Nullable org.gtk.gtk.SelectionModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_view_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the list box should show separators
     * between rows.
     * @return {@code true} if the list box shows separators
     */
    public boolean getShowSeparators() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_view_get_show_separators.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether rows will be activated on single click and
     * selected on hover.
     * @return {@code true} if rows are activated on single click
     */
    public boolean getSingleClickActivate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_view_get_single_click_activate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     * @param enableRubberband {@code true} to enable rubberband selection
     */
    public void setEnableRubberband(boolean enableRubberband) {
        try {
            DowncallHandles.gtk_list_view_set_enable_rubberband.invokeExact(
                    handle(),
                    enableRubberband ? 1 : 0);
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
            DowncallHandles.gtk_list_view_set_factory.invokeExact(
                    handle(),
                    (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model to use.
     * <p>
     * This must be a {@code Gtk.SelectionModel} to use.
     * @param model the model to use
     */
    public void setModel(@Nullable org.gtk.gtk.SelectionModel model) {
        try {
            DowncallHandles.gtk_list_view_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the list box should show separators
     * between rows.
     * @param showSeparators {@code true} to show separators
     */
    public void setShowSeparators(boolean showSeparators) {
        try {
            DowncallHandles.gtk_list_view_set_show_separators.invokeExact(
                    handle(),
                    showSeparators ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether rows should be activated on single click and
     * selected on hover.
     * @param singleClickActivate {@code true} to activate items on single click
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        try {
            DowncallHandles.gtk_list_view_set_single_click_activate.invokeExact(
                    handle(),
                    singleClickActivate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_list_view_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(ListView source, int position);
    }
    
    /**
     * Emitted when a row has been activated by the user,
     * usually via activating the GtkListView|list.activate-item action.
     * <p>
     * This allows for a convenient way to handle activation in a listview.
     * See {@link ListItem#setActivatable} for details on how to use
     * this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ListView.Activate> onActivate(ListView.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListView.Callbacks.class, "signalListViewActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListView.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.ListBase.Build {
        
         /**
         * A {@link ListView.Build} object constructs a {@link ListView} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ListView} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ListView} using {@link ListView#castFrom}.
         * @return A new instance of {@code ListView} with the properties 
         *         that were set in the Build object.
         */
        public ListView construct() {
            return ListView.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ListView.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Allow rubberband selection.
         * @param enableRubberband The value for the {@code enable-rubberband} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEnableRubberband(boolean enableRubberband) {
            names.add("enable-rubberband");
            values.add(org.gtk.gobject.Value.create(enableRubberband));
            return this;
        }
        
        /**
         * Factory for populating list items.
         * @param factory The value for the {@code factory} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFactory(org.gtk.gtk.ListItemFactory factory) {
            names.add("factory");
            values.add(org.gtk.gobject.Value.create(factory));
            return this;
        }
        
        /**
         * Model for the items displayed.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModel(org.gtk.gtk.SelectionModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * Show separators between rows.
         * @param showSeparators The value for the {@code show-separators} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowSeparators(boolean showSeparators) {
            names.add("show-separators");
            values.add(org.gtk.gobject.Value.create(showSeparators));
            return this;
        }
        
        /**
         * Activate rows on single click and select them on hover.
         * @param singleClickActivate The value for the {@code single-click-activate} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSingleClickActivate(boolean singleClickActivate) {
            names.add("single-click-activate");
            values.add(org.gtk.gobject.Value.create(singleClickActivate));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_list_view_new = Interop.downcallHandle(
            "gtk_list_view_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_view_get_enable_rubberband = Interop.downcallHandle(
            "gtk_list_view_get_enable_rubberband",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_view_get_factory = Interop.downcallHandle(
            "gtk_list_view_get_factory",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_view_get_model = Interop.downcallHandle(
            "gtk_list_view_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_view_get_show_separators = Interop.downcallHandle(
            "gtk_list_view_get_show_separators",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_view_get_single_click_activate = Interop.downcallHandle(
            "gtk_list_view_get_single_click_activate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_view_set_enable_rubberband = Interop.downcallHandle(
            "gtk_list_view_set_enable_rubberband",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_list_view_set_factory = Interop.downcallHandle(
            "gtk_list_view_set_factory",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_view_set_model = Interop.downcallHandle(
            "gtk_list_view_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_view_set_show_separators = Interop.downcallHandle(
            "gtk_list_view_set_show_separators",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_list_view_set_single_click_activate = Interop.downcallHandle(
            "gtk_list_view_set_single_click_activate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_list_view_get_type = Interop.downcallHandle(
            "gtk_list_view_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalListViewActivate(MemoryAddress source, int position, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ListView.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListView(source, Ownership.NONE), position);
        }
    }
}

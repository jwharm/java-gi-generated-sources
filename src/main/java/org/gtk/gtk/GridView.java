package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGridView} presents a large dynamic grid of items.
 * <p>
 * {@code GtkGridView} uses its factory to generate one child widget for each
 * visible item and shows them in a grid. The orientation of the grid view
 * determines if the grid reflows vertically or horizontally.
 * <p>
 * {@code GtkGridView} allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on _rubberband selection_, using
 * {@code Gtk.GridView:enable-rubberband}.
 * <p>
 * To learn more about the list widget framework, see the
 * <a href="section-list-widget.html">overview</a>.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * gridview
 * ├── child[.activatable]
 * │
 * ├── child[.activatable]
 * │
 * ┊
 * ╰── [rubberband]
 * }</pre>
 * <p>
 * {@code GtkGridView} uses a single CSS node with name {@code gridview}. Each child uses
 * a single CSS node with name {@code child}. If the {@code Gtk.ListItem:activatable}
 * property is set, the corresponding row will have the {@code .activatable} style
 * class. For rubberband selection, a subnode with name {@code rubberband} is used.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkGridView} uses the {@link AccessibleRole#GRID} role, and the items
 * use the {@link AccessibleRole#GRID_CELL} role.
 */
public class GridView extends org.gtk.gtk.ListBase implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable, org.gtk.gtk.Scrollable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGridView";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GridView proxy instance for the provided memory address.
     * <p>
     * Because GridView is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GridView(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, GridView> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GridView(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.SelectionModel model, @Nullable org.gtk.gtk.ListItemFactory factory) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_grid_view_new.invokeExact(
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
     * Creates a new {@code GtkGridView} that uses the given {@code factory} for
     * mapping items to widgets.
     * <p>
     * The function takes ownership of the
     * arguments, so you can write code like
     * <pre>{@code c
     * grid_view = gtk_grid_view_new (create_model (),
     *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
     * }</pre>
     * @param model the model to use
     * @param factory The factory to populate items with
     */
    public GridView(@Nullable org.gtk.gtk.SelectionModel model, @Nullable org.gtk.gtk.ListItemFactory factory) {
        super(constructNew(model, factory), Ownership.NONE);
    }
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     * @return {@code true} if rubberband selection is enabled
     */
    public boolean getEnableRubberband() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_view_get_enable_rubberband.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     * @return The factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_grid_view_get_factory.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ListItemFactory) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.ListItemFactory.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the maximum number of columns that the grid will use.
     * @return The maximum number of columns
     */
    public int getMaxColumns() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_view_get_max_columns.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the minimum number of columns that the grid will use.
     * @return The minimum number of columns
     */
    public int getMinColumns() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_view_get_min_columns.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the model that's currently used to read the items displayed.
     * @return The model in use
     */
    public @Nullable org.gtk.gtk.SelectionModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_grid_view_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.SelectionModel.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether items will be activated on single click and
     * selected on hover.
     * @return {@code true} if items are activated on single click
     */
    public boolean getSingleClickActivate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_view_get_single_click_activate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     * @param enableRubberband {@code true} to enable rubberband selection
     */
    public void setEnableRubberband(boolean enableRubberband) {
        try {
            DowncallHandles.gtk_grid_view_set_enable_rubberband.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enableRubberband, null).intValue());
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
            DowncallHandles.gtk_grid_view_set_factory.invokeExact(
                    handle(),
                    (Addressable) (factory == null ? MemoryAddress.NULL : factory.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum number of columns to use.
     * <p>
     * This number must be at least 1.
     * <p>
     * If {@code max_columns} is smaller than the minimum set via
     * {@link GridView#setMinColumns}, that value is used instead.
     * @param maxColumns The maximum number of columns
     */
    public void setMaxColumns(int maxColumns) {
        try {
            DowncallHandles.gtk_grid_view_set_max_columns.invokeExact(
                    handle(),
                    maxColumns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum number of columns to use.
     * <p>
     * This number must be at least 1.
     * <p>
     * If {@code min_columns} is smaller than the minimum set via
     * {@link GridView#setMaxColumns}, that value is ignored.
     * @param minColumns The minimum number of columns
     */
    public void setMinColumns(int minColumns) {
        try {
            DowncallHandles.gtk_grid_view_set_min_columns.invokeExact(
                    handle(),
                    minColumns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the imodel to use.
     * <p>
     * This must be a {@code Gtk.SelectionModel}.
     * @param model the model to use
     */
    public void setModel(@Nullable org.gtk.gtk.SelectionModel model) {
        try {
            DowncallHandles.gtk_grid_view_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether items should be activated on single click and
     * selected on hover.
     * @param singleClickActivate {@code true} to activate items on single click
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        try {
            DowncallHandles.gtk_grid_view_set_single_click_activate.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(singleClickActivate, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_grid_view_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void run(int position);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGridView, int position) {
            run(position);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Activate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a cell has been activated by the user,
     * usually via activating the GtkGridView|list.activate-item action.
     * <p>
     * This allows for a convenient way to handle activation in a gridview.
     * See {@code Gtk.ListItem:activatable} for details on how to use
     * this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GridView.Activate> onActivate(GridView.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GridView.Builder} object constructs a {@link GridView} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GridView.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ListBase.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GridView} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GridView}.
         * @return A new instance of {@code GridView} with the properties 
         *         that were set in the Builder object.
         */
        public GridView build() {
            return (GridView) org.gtk.gobject.GObject.newWithProperties(
                GridView.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Allow rubberband selection.
         * @param enableRubberband The value for the {@code enable-rubberband} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnableRubberband(boolean enableRubberband) {
            names.add("enable-rubberband");
            values.add(org.gtk.gobject.Value.create(enableRubberband));
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
         * Maximum number of columns per row.
         * <p>
         * If this number is smaller than {@code Gtk.GridView:min-columns},
         * that value is used instead.
         * @param maxColumns The value for the {@code max-columns} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxColumns(int maxColumns) {
            names.add("max-columns");
            values.add(org.gtk.gobject.Value.create(maxColumns));
            return this;
        }
        
        /**
         * Minimum number of columns per row.
         * @param minColumns The value for the {@code min-columns} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinColumns(int minColumns) {
            names.add("min-columns");
            values.add(org.gtk.gobject.Value.create(minColumns));
            return this;
        }
        
        /**
         * Model for the items displayed.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gtk.SelectionModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * Activate rows on single click and select them on hover.
         * @param singleClickActivate The value for the {@code single-click-activate} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSingleClickActivate(boolean singleClickActivate) {
            names.add("single-click-activate");
            values.add(org.gtk.gobject.Value.create(singleClickActivate));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_grid_view_new = Interop.downcallHandle(
            "gtk_grid_view_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_view_get_enable_rubberband = Interop.downcallHandle(
            "gtk_grid_view_get_enable_rubberband",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_view_get_factory = Interop.downcallHandle(
            "gtk_grid_view_get_factory",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_view_get_max_columns = Interop.downcallHandle(
            "gtk_grid_view_get_max_columns",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_view_get_min_columns = Interop.downcallHandle(
            "gtk_grid_view_get_min_columns",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_view_get_model = Interop.downcallHandle(
            "gtk_grid_view_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_view_get_single_click_activate = Interop.downcallHandle(
            "gtk_grid_view_get_single_click_activate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_view_set_enable_rubberband = Interop.downcallHandle(
            "gtk_grid_view_set_enable_rubberband",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_view_set_factory = Interop.downcallHandle(
            "gtk_grid_view_set_factory",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_view_set_max_columns = Interop.downcallHandle(
            "gtk_grid_view_set_max_columns",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_view_set_min_columns = Interop.downcallHandle(
            "gtk_grid_view_set_min_columns",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_view_set_model = Interop.downcallHandle(
            "gtk_grid_view_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_view_set_single_click_activate = Interop.downcallHandle(
            "gtk_grid_view_set_single_click_activate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_view_get_type = Interop.downcallHandle(
            "gtk_grid_view_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}

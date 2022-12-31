package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkMapListModel} maps the items in a list model to different items.
 * <p>
 * {@code GtkMapListModel} uses a {@code Gtk.MapListModelMapFunc}.
 * <p>
 * Example: Create a list of {@code GtkEventControllers}
 * <pre>{@code c
 * static gpointer
 * map_to_controllers (gpointer widget,
 *                     gpointer data)
 * {
 *   gpointer result = gtk_widget_observe_controllers (widget);
 *   g_object_unref (widget);
 *   return result;
 * }
 * 
 * widgets = gtk_widget_observe_children (widget);
 * 
 * controllers = gtk_map_list_model_new (widgets,
 *                                       map_to_controllers,
 *                                       NULL, NULL);
 * 
 * model = gtk_flatten_list_model_new (GTK_TYPE_EVENT_CONTROLLER,
 *                                     controllers);
 * }</pre>
 * <p>
 * {@code GtkMapListModel} will attempt to discard the mapped objects as soon as
 * they are no longer needed and recreate them if necessary.
 */
public class MapListModel extends org.gtk.gobject.GObject implements org.gtk.gio.ListModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMapListModel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a MapListModel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MapListModel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MapListModel> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MapListModel(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.MapListModelMapFunc mapFunc, org.gtk.glib.DestroyNotify userDestroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_map_list_model_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) (mapFunc == null ? MemoryAddress.NULL : (Addressable) mapFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDestroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkMapListModel} for the given arguments.
     * @param model The model to map
     * @param mapFunc map function
     * @param userDestroy destroy notifier for {@code user_data}
     */
    public MapListModel(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.MapListModelMapFunc mapFunc, org.gtk.glib.DestroyNotify userDestroy) {
        super(constructNew(model, mapFunc, userDestroy), Ownership.FULL);
    }
    
    /**
     * Gets the model that is currently being mapped or {@code null} if none.
     * @return The model that gets mapped
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_map_list_model_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.ListModel.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if a map function is currently set on {@code self}.
     * @return {@code true} if a map function is set
     */
    public boolean hasMap() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_map_list_model_has_map.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the function used to map items.
     * <p>
     * The function will be called whenever an item needs to be mapped
     * and must return the item to use for the given input item.
     * <p>
     * Note that {@code GtkMapListModel} may call this function multiple times
     * on the same item, because it may delete items it doesn't need anymore.
     * <p>
     * GTK makes no effort to ensure that {@code map_func} conforms to the item type
     * of {@code self}. It assumes that the caller knows what they are doing and the map
     * function returns items of the appropriate type.
     * @param mapFunc map function
     * @param userDestroy destroy notifier for {@code user_data}
     */
    public void setMapFunc(@Nullable org.gtk.gtk.MapListModelMapFunc mapFunc, org.gtk.glib.DestroyNotify userDestroy) {
        try {
            DowncallHandles.gtk_map_list_model_set_map_func.invokeExact(
                    handle(),
                    (Addressable) (mapFunc == null ? MemoryAddress.NULL : (Addressable) mapFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDestroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model to be mapped.
     * <p>
     * GTK makes no effort to ensure that {@code model} conforms to the item type
     * expected by the map function. It assumes that the caller knows what
     * they are doing and have set up an appropriate map function.
     * @param model The model to be mapped
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.gtk_map_list_model_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
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
            RESULT = (long) DowncallHandles.gtk_map_list_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MapListModel.Builder} object constructs a {@link MapListModel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MapListModel.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MapListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MapListModel}.
         * @return A new instance of {@code MapListModel} with the properties 
         *         that were set in the Builder object.
         */
        public MapListModel build() {
            return (MapListModel) org.gtk.gobject.GObject.newWithProperties(
                MapListModel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If a map is set for this model
         * @param hasMap The value for the {@code has-map} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasMap(boolean hasMap) {
            names.add("has-map");
            values.add(org.gtk.gobject.Value.create(hasMap));
            return this;
        }
        
        /**
         * The type of items. See {@link org.gtk.gio.ListModel#getItemType}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The model being mapped.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gio.ListModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_map_list_model_new = Interop.downcallHandle(
            "gtk_map_list_model_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_map_list_model_get_model = Interop.downcallHandle(
            "gtk_map_list_model_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_map_list_model_has_map = Interop.downcallHandle(
            "gtk_map_list_model_has_map",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_map_list_model_set_map_func = Interop.downcallHandle(
            "gtk_map_list_model_set_map_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_map_list_model_set_model = Interop.downcallHandle(
            "gtk_map_list_model_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_map_list_model_get_type = Interop.downcallHandle(
            "gtk_map_list_model_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}

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
public class MapListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {
    
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
    @ApiStatus.Internal
    public MapListModel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MapListModel if its GType is a (or inherits from) "GtkMapListModel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MapListModel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMapListModel", a ClassCastException will be thrown.
     */
    public static MapListModel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), MapListModel.getType())) {
            return new MapListModel(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMapListModel");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.MapListModelMapFunc mapFunc) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_map_list_model_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) (mapFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbMapListModelMapFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (mapFunc == null ? MemoryAddress.NULL : Interop.registerCallback(mapFunc)),
                    Interop.cbDestroyNotifySymbol());
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
     */
    public MapListModel(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.MapListModelMapFunc mapFunc) {
        super(constructNew(model, mapFunc), Ownership.FULL);
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
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.NONE);
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
        return RESULT != 0;
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
     */
    public void setMapFunc(@Nullable org.gtk.gtk.MapListModelMapFunc mapFunc) {
        try {
            DowncallHandles.gtk_map_list_model_set_map_func.invokeExact(
                    handle(),
                    (Addressable) (mapFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbMapListModelMapFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (mapFunc == null ? MemoryAddress.NULL : Interop.registerCallback(mapFunc)),
                    Interop.cbDestroyNotifySymbol());
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_map_list_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link MapListModel.Build} object constructs a {@link MapListModel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MapListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MapListModel} using {@link MapListModel#castFrom}.
         * @return A new instance of {@code MapListModel} with the properties 
         *         that were set in the Build object.
         */
        public MapListModel construct() {
            return MapListModel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MapListModel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If a map is set for this model
         * @param hasMap The value for the {@code has-map} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHasMap(boolean hasMap) {
            names.add("has-map");
            values.add(org.gtk.gobject.Value.create(hasMap));
            return this;
        }
        
        /**
         * The type of items. See {@link org.gtk.gio.ListModel#getItemType}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The model being mapped.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModel(org.gtk.gio.ListModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNItems(int nItems) {
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

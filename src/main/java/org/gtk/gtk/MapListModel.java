package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public MapListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MapListModel */
    public static MapListModel castFrom(org.gtk.gobject.Object gobject) {
        return new MapListModel(gobject.refcounted());
    }
    
    static final MethodHandle gtk_map_list_model_new = Interop.downcallHandle(
        "gtk_map_list_model_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gio.ListModel model, MapListModelMapFunc mapFunc) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_map_list_model_new.invokeExact(model.refcounted().unowned().handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbMapListModelMapFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(mapFunc.hashCode(), mapFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkMapListModel} for the given arguments.
     */
    public MapListModel(org.gtk.gio.ListModel model, MapListModelMapFunc mapFunc) {
        super(constructNew(model, mapFunc));
    }
    
    static final MethodHandle gtk_map_list_model_get_model = Interop.downcallHandle(
        "gtk_map_list_model_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that is currently being mapped or {@code null} if none.
     */
    public org.gtk.gio.ListModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_map_list_model_get_model.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_map_list_model_has_map = Interop.downcallHandle(
        "gtk_map_list_model_has_map",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a map function is currently set on {@code self}.
     */
    public boolean hasMap() {
        try {
            var RESULT = (int) gtk_map_list_model_has_map.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_map_list_model_set_map_func = Interop.downcallHandle(
        "gtk_map_list_model_set_map_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setMapFunc(MapListModelMapFunc mapFunc) {
        try {
            gtk_map_list_model_set_map_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbMapListModelMapFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(mapFunc.hashCode(), mapFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_map_list_model_set_model = Interop.downcallHandle(
        "gtk_map_list_model_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model to be mapped.
     * <p>
     * GTK makes no effort to ensure that {@code model} conforms to the item type
     * expected by the map function. It assumes that the caller knows what
     * they are doing and have set up an appropriate map function.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        try {
            gtk_map_list_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

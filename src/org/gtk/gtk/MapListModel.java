package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkMapListModel` maps the items in a list model to different items.
 * 
 * `GtkMapListModel` uses a [callback@Gtk.MapListModelMapFunc].
 * 
 * Example: Create a list of `GtkEventControllers`
 * ```c
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
 * ```
 * 
 * `GtkMapListModel` will attempt to discard the mapped objects as soon as
 * they are no longer needed and recreate them if necessary.
 */
public class MapListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public MapListModel(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MapListModel */
    public static MapListModel castFrom(org.gtk.gobject.Object gobject) {
        return new MapListModel(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkMapListModel` for the given arguments.
     */
    public MapListModel(org.gtk.gio.ListModel model, MapListModelMapFunc mapFunc, jdk.incubator.foreign.MemoryAddress userData, org.gtk.glib.DestroyNotify userDestroy) {
        super(References.get(gtk_h.gtk_map_list_model_new(model.getReference().unowned().handle(), mapFunc, userData, userDestroy), true));
    }
    
    /**
     * Gets the model that is currently being mapped or %NULL if none.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_map_list_model_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Checks if a map function is currently set on @self.
     */
    public boolean hasMap() {
        var RESULT = gtk_h.gtk_map_list_model_has_map(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the function used to map items.
     * 
     * The function will be called whenever an item needs to be mapped
     * and must return the item to use for the given input item.
     * 
     * Note that `GtkMapListModel` may call this function multiple times
     * on the same item, because it may delete items it doesn't need anymore.
     * 
     * GTK makes no effort to ensure that @map_func conforms to the item type
     * of @self. It assumes that the caller knows what they are doing and the map
     * function returns items of the appropriate type.
     */
    public void setMapFunc(MapListModel self, MapListModelMapFunc mapFunc) {
        try {
            int hash = mapFunc.hashCode();
            Interop.signalRegistry.put(hash, mapFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbMapListModelMapFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gtk_map_list_model_set_map_func(handle(), nativeSymbol, intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the model to be mapped.
     * 
     * GTK makes no effort to ensure that @model conforms to the item type
     * expected by the map function. It assumes that the caller knows what
     * they are doing and have set up an appropriate map function.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_map_list_model_set_model(handle(), model.handle());
    }
    
}

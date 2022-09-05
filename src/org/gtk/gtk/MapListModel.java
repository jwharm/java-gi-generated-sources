package org.gtk.gtk;

import org.gtk.gobject.*;
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

    public MapListModel(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MapListModel */
    public static MapListModel castFrom(org.gtk.gobject.Object gobject) {
        return new MapListModel(gobject.getProxy());
    }
    
    /**
     * Gets the model that is currently being mapped or %NULL if none.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_map_list_model_get_model(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Checks if a map function is currently set on @self.
     */
    public boolean hasMap() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_map_list_model_has_map(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the model to be mapped.
     * 
     * GTK makes no effort to ensure that @model conforms to the item type
     * expected by the map function. It assumes that the caller knows what
     * they are doing and have set up an appropriate map function.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_map_list_model_set_model(HANDLE(), model.HANDLE());
    }
    
}

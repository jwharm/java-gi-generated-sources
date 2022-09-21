package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    public MapListModel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MapListModel */
    public static MapListModel castFrom(org.gtk.gobject.Object gobject) {
        return new MapListModel(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ListModel model, MapListModelMapFunc mapFunc) {
        try {
            Reference RESULT = References.get(gtk_h.gtk_map_list_model_new(model.getReference().unowned().handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbMapListModelMapFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(mapFunc.hashCode(), mapFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new {@code GtkMapListModel} for the given arguments.
     */
    public MapListModel(org.gtk.gio.ListModel model, MapListModelMapFunc mapFunc) {
        super(constructNew(model, mapFunc));
    }
    
    /**
     * Gets the model that is currently being mapped or <code>null</code> if none.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_map_list_model_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Checks if a map function is currently set on {@code self}.
     */
    public boolean hasMap() {
        var RESULT = gtk_h.gtk_map_list_model_has_map(handle());
        return (RESULT != 0);
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
     */
    public void setMapFunc(MapListModelMapFunc mapFunc) {
        try {
            gtk_h.gtk_map_list_model_set_map_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbMapListModelMapFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(mapFunc.hashCode(), mapFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the model to be mapped.
     * <p>
     * GTK makes no effort to ensure that {@code model} conforms to the item type
     * expected by the map function. It assumes that the caller knows what
     * they are doing and have set up an appropriate map function.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_map_list_model_set_model(handle(), model.handle());
    }
    
}

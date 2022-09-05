package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkFlattenListModel` is a list model that concatenates other list models.
 * 
 * `GtkFlattenListModel` takes a list model containing list models,
 *  and flattens it into a single model.
 */
public class FlattenListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public FlattenListModel(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FlattenListModel */
    public static FlattenListModel castFrom(org.gtk.gobject.Object gobject) {
        return new FlattenListModel(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkFlattenListModel` that flattens @list.
     */
    public FlattenListModel(org.gtk.gio.ListModel model) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flatten_list_model_new(model.getProxy().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the model set via gtk_flatten_list_model_set_model().
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flatten_list_model_get_model(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the model containing the item at the given position.
     */
    public org.gtk.gio.ListModel getModelForItem(int position) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flatten_list_model_get_model_for_item(HANDLE(), position);
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Sets a new model to be flattened.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_flatten_list_model_set_model(HANDLE(), model.HANDLE());
    }
    
}

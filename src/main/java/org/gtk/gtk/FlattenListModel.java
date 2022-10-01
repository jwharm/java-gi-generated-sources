package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFlattenListModel} is a list model that concatenates other list models.
 * <p>
 * {@code GtkFlattenListModel} takes a list model containing list models,
 *  and flattens it into a single model.
 */
public class FlattenListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public FlattenListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FlattenListModel */
    public static FlattenListModel castFrom(org.gtk.gobject.Object gobject) {
        return new FlattenListModel(gobject.refcounted());
    }
    
    private static Refcounted constructNew(org.gtk.gio.ListModel model) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_flatten_list_model_new(model.refcounted().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFlattenListModel} that flattens {@code list}.
     */
    public FlattenListModel(org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    /**
     * Gets the model set via gtk_flatten_list_model_set_model().
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_flatten_list_model_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the model containing the item at the given position.
     */
    public org.gtk.gio.ListModel getModelForItem(int position) {
        var RESULT = gtk_h.gtk_flatten_list_model_get_model_for_item(handle(), position);
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets a new model to be flattened.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_flatten_list_model_set_model(handle(), model.handle());
    }
    
}

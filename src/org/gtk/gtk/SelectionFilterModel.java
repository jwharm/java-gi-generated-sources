package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSelectionFilterModel` is a list model that presents the selection from
 * a `GtkSelectionModel`.
 */
public class SelectionFilterModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public SelectionFilterModel(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to SelectionFilterModel */
    public static SelectionFilterModel castFrom(org.gtk.gobject.Object gobject) {
        return new SelectionFilterModel(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkSelectionFilterModel` that will include the
     * selected items from the underlying selection model.
     */
    public SelectionFilterModel(SelectionModel model) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_selection_filter_model_new(model.HANDLE()), true));
    }
    
    /**
     * Gets the model currently filtered or %NULL if none.
     */
    public SelectionModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_selection_filter_model_get_model(HANDLE());
        return new SelectionModel.SelectionModelImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Sets the model to be filtered.
     * 
     * Note that GTK makes no effort to ensure that @model conforms to
     * the item type of @self. It assumes that the caller knows what they
     * are doing and have set up an appropriate filter to ensure that item
     * types match.
     */
    public void setModel(SelectionModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_selection_filter_model_set_model(HANDLE(), model.HANDLE());
    }
    
}

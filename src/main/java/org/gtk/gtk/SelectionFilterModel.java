package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSelectionFilterModel} is a list model that presents the selection from
 * a {@code GtkSelectionModel}.
 */
public class SelectionFilterModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public SelectionFilterModel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SelectionFilterModel */
    public static SelectionFilterModel castFrom(org.gtk.gobject.Object gobject) {
        return new SelectionFilterModel(gobject.getReference());
    }
    
    private static Reference constructNew(SelectionModel model) {
        Reference RESULT = References.get(gtk_h.gtk_selection_filter_model_new(model.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSelectionFilterModel} that will include the
     * selected items from the underlying selection model.
     */
    public SelectionFilterModel(SelectionModel model) {
        super(constructNew(model));
    }
    
    /**
     * Gets the model currently filtered or {@code null} if none.
     */
    public SelectionModel getModel() {
        var RESULT = gtk_h.gtk_selection_filter_model_get_model(handle());
        return new SelectionModel.SelectionModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets the model to be filtered.
     * <p>
     * Note that GTK makes no effort to ensure that {@code model} conforms to
     * the item type of {@code self}. It assumes that the caller knows what they
     * are doing and have set up an appropriate filter to ensure that item
     * types match.
     */
    public void setModel(SelectionModel model) {
        gtk_h.gtk_selection_filter_model_set_model(handle(), model.handle());
    }
    
}

package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkNoSelection</code> is a <code>GtkSelectionModel</code> that does not allow selecting
 * anything.
 * <p>
 * This model is meant to be used as a simple wrapper around a <code>GListModel</code>
 * when a <code>GtkSelectionModel</code> is required.
 */
public class NoSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, SelectionModel {

    public NoSelection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NoSelection */
    public static NoSelection castFrom(org.gtk.gobject.Object gobject) {
        return new NoSelection(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ListModel model) {
        Reference RESULT = References.get(gtk_h.gtk_no_selection_new(model.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new selection to handle @model.
     */
    public NoSelection(org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    /**
     * Gets the model that @self is wrapping.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_no_selection_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets the model that @self should wrap.
     * 
     * If @model is <code>null</code>  this model will be empty.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_no_selection_set_model(handle(), model.handle());
    }
    
}

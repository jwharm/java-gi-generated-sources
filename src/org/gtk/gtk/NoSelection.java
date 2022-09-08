package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkNoSelection` is a `GtkSelectionModel` that does not allow selecting
 * anything.
 * 
 * This model is meant to be used as a simple wrapper around a `GListModel`
 * when a `GtkSelectionModel` is required.
 */
public class NoSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, SelectionModel {

    public NoSelection(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NoSelection */
    public static NoSelection castFrom(org.gtk.gobject.Object gobject) {
        return new NoSelection(gobject.getReference());
    }
    
    /**
     * Creates a new selection to handle @model.
     */
    public NoSelection(org.gtk.gio.ListModel model) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_no_selection_new(model.getReference().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the model that @self is wrapping.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_no_selection_get_model(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets the model that @self should wrap.
     * 
     * If @model is %NULL, this model will be empty.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_no_selection_set_model(HANDLE(), model.HANDLE());
    }
    
}

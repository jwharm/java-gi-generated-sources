package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkNoSelection} is a {@code GtkSelectionModel} that does not allow selecting
 * anything.
 * <p>
 * This model is meant to be used as a simple wrapper around a {@code GListModel}
 * when a {@code GtkSelectionModel} is required.
 */
public class NoSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, SelectionModel {

    public NoSelection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NoSelection */
    public static NoSelection castFrom(org.gtk.gobject.Object gobject) {
        return new NoSelection(gobject.refcounted());
    }
    
    private static Refcounted constructNew(org.gtk.gio.ListModel model) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_no_selection_new(model.refcounted().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     */
    public NoSelection(org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    /**
     * Gets the model that {@code self} is wrapping.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_no_selection_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is {@code null}, this model will be empty.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_no_selection_set_model(handle(), model.handle());
    }
    
}

package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkMultiSelection} is a {@code GtkSelectionModel} that allows selecting multiple
 * elements.
 */
public class MultiSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, SelectionModel {

    public MultiSelection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MultiSelection */
    public static MultiSelection castFrom(org.gtk.gobject.Object gobject) {
        return new MultiSelection(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ListModel model) {
        Reference RESULT = References.get(gtk_h.gtk_multi_selection_new(model.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     */
    public MultiSelection(org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    /**
     * Returns the underlying model of {@code self}.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_multi_selection_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is <code>null</code>, {@code self} will be empty.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_multi_selection_set_model(handle(), model.handle());
    }
    
}

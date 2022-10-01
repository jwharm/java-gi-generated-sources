package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkRequisition} represents the desired size of a widget. See
 * <a href="class.Widget.html#height-for-width-geometry-management">GtkWidget’s geometry management section</a> for
 * more information.
 */
public class Requisition extends io.github.jwharm.javagi.ResourceBase {

    public Requisition(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_requisition_new(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@code GtkRequisition}.
     * <p>
     * The struct is initialized to zero.
     */
    public Requisition() {
        super(constructNew());
    }
    
    /**
     * Copies a {@code GtkRequisition}.
     */
    public Requisition copy() {
        var RESULT = gtk_h.gtk_requisition_copy(handle());
        return new Requisition(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a {@code GtkRequisition}.
     */
    public void free() {
        gtk_h.gtk_requisition_free(handle());
    }
    
}

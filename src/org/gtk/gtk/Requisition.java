package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkRequisition</code> represents the desired size of a widget. See
 * {@link [GtkWidget&#8217;s geometry management section]}(class.Widget.html#height-for-width-geometry-management) for
 * more information.
 */
public class Requisition extends io.github.jwharm.javagi.ResourceBase {

    public Requisition(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_requisition_new(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new <code>GtkRequisition</code>.
     * 
     * The struct is initialized to zero.
     */
    public Requisition() {
        super(constructNew());
    }
    
    /**
     * Copies a <code>GtkRequisition</code>.
     */
    public Requisition copy() {
        var RESULT = gtk_h.gtk_requisition_copy(handle());
        return new Requisition(References.get(RESULT, true));
    }
    
    /**
     * Frees a <code>GtkRequisition</code>.
     */
    public void free() {
        gtk_h.gtk_requisition_free(handle());
    }
    
}

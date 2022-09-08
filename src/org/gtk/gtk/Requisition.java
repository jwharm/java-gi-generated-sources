package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkRequisition` represents the desired size of a widget. See
 * [GtkWidget’s geometry management section](class.Widget.html#height-for-width-geometry-management) for
 * more information.
 */
public class Requisition extends io.github.jwharm.javagi.interop.ResourceBase {

    public Requisition(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new `GtkRequisition`.
     * 
     * The struct is initialized to zero.
     */
    public Requisition() {
        super(References.get(gtk_h.gtk_requisition_new(), true));
    }
    
    /**
     * Copies a `GtkRequisition`.
     */
    public Requisition copy() {
        var RESULT = gtk_h.gtk_requisition_copy(handle());
        return new Requisition(References.get(RESULT, true));
    }
    
    /**
     * Frees a `GtkRequisition`.
     */
    public void free() {
        gtk_h.gtk_requisition_free(handle());
    }
    
}

package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkRequisition` represents the desired size of a widget. See
 * [GtkWidget’s geometry management section](class.Widget.html#height-for-width-geometry-management) for
 * more information.
 */
public class Requisition extends io.github.jwharm.javagi.interop.ResourceBase {

    public Requisition(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Allocates a new `GtkRequisition`.
     * 
     * The struct is initialized to zero.
     */
    public Requisition() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_requisition_new(), true));
    }
    
    /**
     * Copies a `GtkRequisition`.
     */
    public Requisition copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_requisition_copy(HANDLE());
        return new Requisition(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Frees a `GtkRequisition`.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_requisition_free(HANDLE());
    }
    
}

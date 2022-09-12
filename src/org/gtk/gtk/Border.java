package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A struct that specifies a border around a rectangular area.
 * 
 * Each side can have different width.
 */
public class Border extends io.github.jwharm.javagi.ResourceBase {

    public Border(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_border_new(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new `GtkBorder` struct and initializes its elements to zero.
     */
    public Border() {
        super(constructNew());
    }
    
    /**
     * Copies a `GtkBorder`.
     */
    public Border copy() {
        var RESULT = gtk_h.gtk_border_copy(handle());
        return new Border(References.get(RESULT, true));
    }
    
    /**
     * Frees a `GtkBorder`.
     */
    public void free() {
        gtk_h.gtk_border_free(handle());
    }
    
}

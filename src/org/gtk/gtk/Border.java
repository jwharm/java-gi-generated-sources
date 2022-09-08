package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A struct that specifies a border around a rectangular area.
 * 
 * Each side can have different width.
 */
public class Border extends io.github.jwharm.javagi.interop.ResourceBase {

    public Border(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new `GtkBorder` struct and initializes its elements to zero.
     */
    public Border() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_border_new(), true));
    }
    
    /**
     * Copies a `GtkBorder`.
     */
    public Border copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_border_copy(HANDLE());
        return new Border(References.get(RESULT, true));
    }
    
    /**
     * Frees a `GtkBorder`.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_border_free(HANDLE());
    }
    
}

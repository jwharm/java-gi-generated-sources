package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A struct that specifies a border around a rectangular area.
 * <p>
 * Each side can have different width.
 */
public class Border extends io.github.jwharm.javagi.ResourceBase {

    public Border(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_border_new(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@code GtkBorder} struct and initializes its elements to zero.
     */
    public Border() {
        super(constructNew());
    }
    
    /**
     * Copies a {@code GtkBorder}.
     */
    public Border copy() {
        var RESULT = gtk_h.gtk_border_copy(handle());
        return new Border(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a {@code GtkBorder}.
     */
    public void free() {
        gtk_h.gtk_border_free(handle());
    }
    
}

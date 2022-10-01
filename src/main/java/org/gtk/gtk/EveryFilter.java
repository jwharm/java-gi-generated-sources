package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkEveryFilter} matches an item when each of its filters matches.
 * <p>
 * To add filters to a {@code GtkEveryFilter}, use {@link MultiFilter#append}.
 */
public class EveryFilter extends MultiFilter implements org.gtk.gio.ListModel, Buildable {

    public EveryFilter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EveryFilter */
    public static EveryFilter castFrom(org.gtk.gobject.Object gobject) {
        return new EveryFilter(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_every_filter_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty "every" filter.
     * <p>
     * Use {@link MultiFilter#append} to add filters to it.
     * <p>
     * This filter matches an item if each of the filters added to it
     * matches the item. In particular, this means that if no filter
     * has been added to it, the filter matches every item.
     */
    public EveryFilter() {
        super(constructNew());
    }
    
}

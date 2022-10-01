package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkAnyFilter} matches an item when at least one of its filters matches.
 * <p>
 * To add filters to a {@code GtkAnyFilter}, use {@link MultiFilter#append}.
 */
public class AnyFilter extends MultiFilter implements org.gtk.gio.ListModel, Buildable {

    public AnyFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AnyFilter */
    public static AnyFilter castFrom(org.gtk.gobject.Object gobject) {
        return new AnyFilter(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_any_filter_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty "any" filter.
     * <p>
     * Use {@link MultiFilter#append} to add filters to it.
     * <p>
     * This filter matches an item if any of the filters added to it
     * matches the item. In particular, this means that if no filter
     * has been added to it, the filter matches no item.
     */
    public AnyFilter() {
        super(constructNew());
    }
    
}

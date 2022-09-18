package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkAnyFilter</code> matches an item when at least one of its filters matches.
 * <p>
 * To add filters to a <code>GtkAnyFilter</code>, use {@link org.gtk.gtk.MultiFilter<code>#append</code> .
 */
public class AnyFilter extends MultiFilter implements org.gtk.gio.ListModel, Buildable {

    public AnyFilter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AnyFilter */
    public static AnyFilter castFrom(org.gtk.gobject.Object gobject) {
        return new AnyFilter(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_any_filter_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty &<code>#34</code> any&<code>#34</code>  filter.
     * 
     * Use {@link org.gtk.gtk.MultiFilter<code>#append</code>  to add filters to it.
     * 
     * This filter matches an item if any of the filters added to it
     * matches the item. In particular, this means that if no filter
     * has been added to it, the filter matches no item.
     */
    public AnyFilter() {
        super(constructNew());
    }
    
}

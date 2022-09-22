package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkMultiFilter} is the base class for filters that combine multiple filters.
 */
public class MultiFilter extends Filter implements org.gtk.gio.ListModel, Buildable {

    public MultiFilter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MultiFilter */
    public static MultiFilter castFrom(org.gtk.gobject.Object gobject) {
        return new MultiFilter(gobject.getReference());
    }
    
    /**
     * Adds a {@code filter} to {@code self} to use for matching.
     */
    public void append(Filter filter) {
        gtk_h.gtk_multi_filter_append(handle(), filter.getReference().unowned().handle());
    }
    
    /**
     * Removes the filter at the given {@code position} from the list of filters used
     * by {@code self}.
     * <p>
     * If {@code position} is larger than the number of filters, nothing happens and
     * the function returns.
     */
    public void remove(int position) {
        gtk_h.gtk_multi_filter_remove(handle(), position);
    }
    
}

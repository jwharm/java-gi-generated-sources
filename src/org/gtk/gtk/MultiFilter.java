package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkMultiFilter` is the base class for filters that combine multiple filters.
 */
public class MultiFilter extends Filter implements org.gtk.gio.ListModel, Buildable {

    public MultiFilter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MultiFilter */
    public static MultiFilter castFrom(org.gtk.gobject.Object gobject) {
        return new MultiFilter(gobject.getReference());
    }
    
    /**
     * Adds a @filter to @self to use for matching.
     */
    public void append(Filter filter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_multi_filter_append(HANDLE(), filter.getReference().unowned().HANDLE());
    }
    
    /**
     * Removes the filter at the given @position from the list of filters used
     * by @self.
     * 
     * If @position is larger than the number of filters, nothing happens and
     * the function returns.
     */
    public void remove(int position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_multi_filter_remove(HANDLE(), position);
    }
    
}

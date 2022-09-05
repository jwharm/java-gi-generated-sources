package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAnyFilter` matches an item when at least one of its filters matches.
 * 
 * To add filters to a `GtkAnyFilter`, use [method@Gtk.MultiFilter.append].
 */
public class AnyFilter extends MultiFilter implements org.gtk.gio.ListModel, Buildable {

    public AnyFilter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to AnyFilter */
    public static AnyFilter castFrom(org.gtk.gobject.Object gobject) {
        return new AnyFilter(gobject.getProxy());
    }
    
    /**
     * Creates a new empty "any" filter.
     * 
     * Use [method@Gtk.MultiFilter.append] to add filters to it.
     * 
     * This filter matches an item if any of the filters added to it
     * matches the item. In particular, this means that if no filter
     * has been added to it, the filter matches no item.
     */
    public AnyFilter() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_any_filter_new(), true));
    }
    
}

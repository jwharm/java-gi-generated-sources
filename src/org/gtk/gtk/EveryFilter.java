package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkEveryFilter` matches an item when each of its filters matches.
 * 
 * To add filters to a `GtkEveryFilter`, use [method@Gtk.MultiFilter.append].
 */
public class EveryFilter extends MultiFilter implements org.gtk.gio.ListModel, Buildable {

    public EveryFilter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to EveryFilter */
    public static EveryFilter castFrom(org.gtk.gobject.Object gobject) {
        return new EveryFilter(gobject.getProxy());
    }
    
    /**
     * Creates a new empty "every" filter.
     * 
     * Use [method@Gtk.MultiFilter.append] to add filters to it.
     * 
     * This filter matches an item if each of the filters added to it
     * matches the item. In particular, this means that if no filter
     * has been added to it, the filter matches every item.
     */
    public EveryFilter() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_every_filter_new(), true));
    }
    
}

package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Base type for snapshot operations.
 * 
 * The subclass of `GdkSnapshot` used by GTK is [class@Gtk.Snapshot].
 */
public class Snapshot extends org.gtk.gobject.Object {

    public Snapshot(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Snapshot */
    public static Snapshot castFrom(org.gtk.gobject.Object gobject) {
        return new Snapshot(gobject.getProxy());
    }
    
}

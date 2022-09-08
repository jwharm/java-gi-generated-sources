package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Base type for snapshot operations.
 * 
 * The subclass of `GdkSnapshot` used by GTK is [class@Gtk.Snapshot].
 */
public class Snapshot extends org.gtk.gobject.Object {

    public Snapshot(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Snapshot */
    public static Snapshot castFrom(org.gtk.gobject.Object gobject) {
        return new Snapshot(gobject.getReference());
    }
    
}

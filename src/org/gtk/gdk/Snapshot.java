package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Base type for snapshot operations.
 * <p>
 * The subclass of <code>GdkSnapshot</code> used by GTK is {@link org.gtk.gtk.Snapshot}.
 */
public class Snapshot extends org.gtk.gobject.Object {

    public Snapshot(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Snapshot */
    public static Snapshot castFrom(org.gtk.gobject.Object gobject) {
        return new Snapshot(gobject.getReference());
    }
    
}

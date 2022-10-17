package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base type for snapshot operations.
 * <p>
 * The subclass of {@code GdkSnapshot} used by GTK is {@link org.gtk.gtk.Snapshot}.
 */
public class Snapshot extends org.gtk.gobject.Object {

    public Snapshot(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Snapshot */
    public static Snapshot castFrom(org.gtk.gobject.Object gobject) {
        return new Snapshot(gobject.refcounted());
    }
    
}

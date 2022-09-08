package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkOrientable` interface is implemented by all widgets that can be
 * oriented horizontally or vertically.
 * 
 * `GtkOrientable` is more flexible in that it allows the orientation to be
 * changed at runtime, allowing the widgets to “flip”.
 */
public interface Orientable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Retrieves the orientation of the @orientable.
     */
    public default Orientation getOrientation() {
        var RESULT = gtk_h.gtk_orientable_get_orientation(handle());
        return Orientation.fromValue(RESULT);
    }
    
    /**
     * Sets the orientation of the @orientable.
     */
    public default void setOrientation(Orientation orientation) {
        gtk_h.gtk_orientable_set_orientation(handle(), orientation.getValue());
    }
    
    class OrientableImpl extends org.gtk.gobject.Object implements Orientable {
        public OrientableImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}

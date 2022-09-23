package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An interface for swipeable widgets.
 */
public class SwipeableInterface extends io.github.jwharm.javagi.ResourceBase {

    public SwipeableInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SwipeableInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwSwipeableInterface.allocate(Interop.getAllocator()).address()));
    }
    
}

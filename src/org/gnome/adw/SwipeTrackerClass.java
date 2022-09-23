package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class SwipeTrackerClass extends io.github.jwharm.javagi.ResourceBase {

    public SwipeTrackerClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public SwipeTrackerClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.AdwSwipeTrackerClass.allocate(Interop.getAllocator()).address()));
    }
    
}

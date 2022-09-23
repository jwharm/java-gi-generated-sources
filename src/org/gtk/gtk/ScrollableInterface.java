package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ScrollableInterface extends io.github.jwharm.javagi.ResourceBase {

    public ScrollableInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public ScrollableInterface() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkScrollableInterface.allocate(Interop.getAllocator()).address()));
    }
    
}

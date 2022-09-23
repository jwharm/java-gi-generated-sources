package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkRecentManagerClass} contains only private data.
 */
public class RecentManagerClass extends io.github.jwharm.javagi.ResourceBase {

    public RecentManagerClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public RecentManagerClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkRecentManagerClass.allocate(Interop.getAllocator()).address()));
    }
    
}

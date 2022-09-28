package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

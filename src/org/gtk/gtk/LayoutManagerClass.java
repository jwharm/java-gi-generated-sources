package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkLayoutManagerClass} structure contains only private data, and
 * should only be accessed through the provided API, or when subclassing
 * {@code GtkLayoutManager}.
 */
public class LayoutManagerClass extends io.github.jwharm.javagi.ResourceBase {

    public LayoutManagerClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public LayoutManagerClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkLayoutManagerClass.allocate(Interop.getAllocator()).address()));
    }
    
}

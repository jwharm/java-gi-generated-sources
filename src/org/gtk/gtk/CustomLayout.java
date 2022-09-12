package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCustomLayout` uses closures for size negotiation.
 * 
 * A `GtkCustomLayout `uses closures matching to the old `GtkWidget`
 * virtual functions for size negotiation, as a convenience API to
 * ease the porting towards the corresponding `GtkLayoutManager
 * virtual functions.
 */
public class CustomLayout extends LayoutManager {

    public CustomLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CustomLayout */
    public static CustomLayout castFrom(org.gtk.gobject.Object gobject) {
        return new CustomLayout(gobject.getReference());
    }
    
}

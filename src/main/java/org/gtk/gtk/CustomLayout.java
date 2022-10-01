package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkCustomLayout} uses closures for size negotiation.
 * <p>
 * A {@code GtkCustomLayout }uses closures matching to the old {@code GtkWidget}
 * virtual functions for size negotiation, as a convenience API to
 * ease the porting towards the corresponding `GtkLayoutManager
 * virtual functions.
 */
public class CustomLayout extends LayoutManager {

    public CustomLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CustomLayout */
    public static CustomLayout castFrom(org.gtk.gobject.Object gobject) {
        return new CustomLayout(gobject.refcounted());
    }
    
}

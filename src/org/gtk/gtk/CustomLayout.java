package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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

    public CustomLayout(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CustomLayout */
    public static CustomLayout castFrom(org.gtk.gobject.Object gobject) {
        return new CustomLayout(gobject.getProxy());
    }
    
}
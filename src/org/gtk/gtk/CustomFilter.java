package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCustomFilter` determines whether to include items with a callback.
 */
public class CustomFilter extends Filter {

    public CustomFilter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CustomFilter */
    public static CustomFilter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomFilter(gobject.getProxy());
    }
    
}

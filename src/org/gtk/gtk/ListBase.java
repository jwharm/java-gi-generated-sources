package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkListBase` is the abstract base class for GTK's list widgets.
 */
public class ListBase extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable, Scrollable {

    public ListBase(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ListBase */
    public static ListBase castFrom(org.gtk.gobject.Object gobject) {
        return new ListBase(gobject.getProxy());
    }
    
}

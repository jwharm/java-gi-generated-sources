package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutTrigger` that never triggers.
 */
public class NeverTrigger extends ShortcutTrigger {

    public NeverTrigger(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to NeverTrigger */
    public static NeverTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new NeverTrigger(gobject.getProxy());
    }
    
}

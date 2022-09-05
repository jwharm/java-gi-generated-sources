package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutAction` that does nothing.
 */
public class NothingAction extends ShortcutAction {

    public NothingAction(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to NothingAction */
    public static NothingAction castFrom(org.gtk.gobject.Object gobject) {
        return new NothingAction(gobject.getProxy());
    }
    
}

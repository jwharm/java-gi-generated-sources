package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutAction` that invokes a callback.
 */
public class CallbackAction extends ShortcutAction {

    public CallbackAction(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CallbackAction */
    public static CallbackAction castFrom(org.gtk.gobject.Object gobject) {
        return new CallbackAction(gobject.getReference());
    }
    
    /**
     * Create a custom action that calls the given @callback when
     * activated.
     */
    public CallbackAction(ShortcutFunc callback, jdk.incubator.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify destroy) {
        super(References.get(gtk_h.gtk_callback_action_new(callback, data, destroy), true));
    }
    
}

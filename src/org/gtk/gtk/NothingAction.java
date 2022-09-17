package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkShortcutAction</code> that does nothing.
 */
public class NothingAction extends ShortcutAction {

    public NothingAction(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NothingAction */
    public static NothingAction castFrom(org.gtk.gobject.Object gobject) {
        return new NothingAction(gobject.getReference());
    }
    
    /**
     * Gets the nothing action.
     * 
     * This is an action that does nothing and where
     * activating it always fails.
     */
    public static NothingAction get() {
        var RESULT = gtk_h.gtk_nothing_action_get();
        return new NothingAction(References.get(RESULT, false));
    }
    
}

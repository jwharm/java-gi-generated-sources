package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutAction} that does nothing.
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
     * <p>
     * This is an action that does nothing and where
     * activating it always fails.
     */
    public static NothingAction get() {
        var RESULT = gtk_h.gtk_nothing_action_get();
        return new NothingAction(References.get(RESULT, false));
    }
    
}

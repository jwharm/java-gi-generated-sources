package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutAction} that calls gtk_widget_activate().
 */
public class ActivateAction extends ShortcutAction {

    public ActivateAction(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ActivateAction */
    public static ActivateAction castFrom(org.gtk.gobject.Object gobject) {
        return new ActivateAction(gobject.getReference());
    }
    
    /**
     * Gets the activate action.
     * <p>
     * This is an action that calls gtk_widget_activate()
     * on the given widget upon activation.
     */
    public static ActivateAction get() {
        var RESULT = gtk_h.gtk_activate_action_get();
        return new ActivateAction(References.get(RESULT, false));
    }
    
}

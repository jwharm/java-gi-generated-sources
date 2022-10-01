package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutAction} that activates an action by name.
 */
public class NamedAction extends ShortcutAction {

    public NamedAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NamedAction */
    public static NamedAction castFrom(org.gtk.gobject.Object gobject) {
        return new NamedAction(gobject.refcounted());
    }
    
    private static Refcounted constructNew(java.lang.String name) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_named_action_new(Interop.allocateNativeString(name).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates an action that when activated, activates
     * the named action on the widget.
     * <p>
     * It also passes the given arguments to it.
     * <p>
     * See {@link Widget#insertActionGroup} for
     * how to add actions to widgets.
     */
    public NamedAction(java.lang.String name) {
        super(constructNew(name));
    }
    
    /**
     * Returns the name of the action that will be activated.
     */
    public java.lang.String getActionName() {
        var RESULT = gtk_h.gtk_named_action_get_action_name(handle());
        return RESULT.getUtf8String(0);
    }
    
}

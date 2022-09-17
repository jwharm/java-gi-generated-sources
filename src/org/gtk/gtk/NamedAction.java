package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkShortcutAction</code> that activates an action by name.
 */
public class NamedAction extends ShortcutAction {

    public NamedAction(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NamedAction */
    public static NamedAction castFrom(org.gtk.gobject.Object gobject) {
        return new NamedAction(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String name) {
        Reference RESULT = References.get(gtk_h.gtk_named_action_new(Interop.allocateNativeString(name).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates an action that when activated, activates
     * the named action on the widget.
     * 
     * It also passes the given arguments to it.
     * 
     * See {@link org.gtk.gtk.Widget#insertActionGroup} for
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

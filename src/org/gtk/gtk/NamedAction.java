package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutAction` that activates an action by name.
 */
public class NamedAction extends ShortcutAction {

    public NamedAction(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to NamedAction */
    public static NamedAction castFrom(org.gtk.gobject.Object gobject) {
        return new NamedAction(gobject.getProxy());
    }
    
    /**
     * Creates an action that when activated, activates
     * the named action on the widget.
     * 
     * It also passes the given arguments to it.
     * 
     * See [method@Gtk.Widget.insert_action_group] for
     * how to add actions to widgets.
     */
    public NamedAction(java.lang.String name) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_named_action_new(Interop.getAllocator().allocateUtf8String(name)), true));
    }
    
    /**
     * Returns the name of the action that will be activated.
     */
    public java.lang.String getActionName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_named_action_get_action_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
}

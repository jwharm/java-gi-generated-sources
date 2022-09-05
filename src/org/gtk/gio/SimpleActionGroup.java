package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSimpleActionGroup is a hash table filled with #GAction objects,
 * implementing the #GActionGroup and #GActionMap interfaces.
 */
public class SimpleActionGroup extends org.gtk.gobject.Object implements ActionGroup, ActionMap {

    public SimpleActionGroup(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to SimpleActionGroup */
    public static SimpleActionGroup castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleActionGroup(gobject.getProxy());
    }
    
    /**
     * Creates a new, empty, #GSimpleActionGroup.
     */
    public SimpleActionGroup() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_simple_action_group_new(), true));
    }
    
}

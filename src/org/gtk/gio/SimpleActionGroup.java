package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.SimpleActionGroup} is a hash table filled with {@link org.gtk.gio.Action} objects,
 * implementing the {@link org.gtk.gio.ActionGroup} and {@link org.gtk.gio.ActionMap} interfaces.
 */
public class SimpleActionGroup extends org.gtk.gobject.Object implements ActionGroup, ActionMap {

    public SimpleActionGroup(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SimpleActionGroup */
    public static SimpleActionGroup castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleActionGroup(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_simple_action_group_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new, empty, {@link org.gtk.gio.SimpleActionGroup}
     */
    public SimpleActionGroup() {
        super(constructNew());
    }
    
}

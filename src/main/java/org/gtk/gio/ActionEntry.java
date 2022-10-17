package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This struct defines a single action.  It is for use with
 * g_action_map_add_action_entries().
 * <p>
 * The order of the items in the structure are intended to reflect
 * frequency of use.  It is permissible to use an incomplete initialiser
 * in order to leave some of the later values as {@code null}.  All values
 * after {@code name} are optional.  Additional optional fields may be added in
 * the future.
 * <p>
 * See g_action_map_add_action_entries() for an example.
 */
public class ActionEntry extends io.github.jwharm.javagi.ResourceBase {

    public ActionEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}

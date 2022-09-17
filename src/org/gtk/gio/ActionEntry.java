package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This struct defines a single action.  It is for use with
 * g_action_map_add_action_entries().
 * 
 * The order of the items in the structure are intended to reflect
 * frequency of use.  It is permissible to use an incomplete initialiser
 * in order to leave some of the later values as <code>NULL.</code>  All values
 * after @name are optional.  Additional optional fields may be added in
 * the future.
 * 
 * See g_action_map_add_action_entries() for an example.
 */
public class ActionEntry extends io.github.jwharm.javagi.ResourceBase {

    public ActionEntry(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}

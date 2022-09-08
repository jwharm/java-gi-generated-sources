package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GHook struct represents a single hook function in a #GHookList.
 */
public class Hook extends io.github.jwharm.javagi.interop.ResourceBase {

    public Hook(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Compares the ids of two #GHook elements, returning a negative value
     * if the second id is greater than the first.
     */
    public int compareIds(Hook sibling) {
        var RESULT = gtk_h.g_hook_compare_ids(handle(), sibling.handle());
        return RESULT;
    }
    
}

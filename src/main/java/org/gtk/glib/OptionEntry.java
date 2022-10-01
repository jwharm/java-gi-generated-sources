package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A GOptionEntry struct defines a single option. To have an effect, they
 * must be added to a {@link OptionGroup} with g_option_context_add_main_entries()
 * or g_option_group_add_entries().
 */
public class OptionEntry extends io.github.jwharm.javagi.ResourceBase {

    public OptionEntry(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public OptionEntry() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GOptionEntry.allocate(Interop.getAllocator()).address()));
    }
    
}

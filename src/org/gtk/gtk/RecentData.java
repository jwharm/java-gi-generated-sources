package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Meta-data to be passed to gtk_recent_manager_add_full() when
 * registering a recently used resource.
 */
public class RecentData extends io.github.jwharm.javagi.ResourceBase {

    public RecentData(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public RecentData() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkRecentData.allocate(Interop.getAllocator()).address()));
    }
    
}

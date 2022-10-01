package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A set of functions used to perform memory allocation. The same {@link MemVTable} must
 * be used for all allocations in the same program; a call to g_mem_set_vtable(),
 * if it exists, should be prior to any use of GLib.
 * <p>
 * This functions related to this has been deprecated in 2.46, and no longer work.
 */
public class MemVTable extends io.github.jwharm.javagi.ResourceBase {

    public MemVTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public MemVTable() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GMemVTable.allocate(Interop.getAllocator()).address()));
    }
    
}

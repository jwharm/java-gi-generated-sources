package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A set of functions used to perform memory allocation. The same #GMemVTable must
 * be used for all allocations in the same program; a call to g_mem_set_vtable(),
 * if it exists, should be prior to any use of GLib.
 * 
 * This functions related to this has been deprecated in 2.46, and no longer work.
 */
public class MemVTable extends io.github.jwharm.javagi.interop.ResourceBase {

    public MemVTable(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}

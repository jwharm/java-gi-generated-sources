package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkTreeIter` is the primary structure
 * for accessing a `GtkTreeModel`. Models are expected to put a unique
 * integer in the @stamp member, and put
 * model-specific data in the three @user_data
 * members.
 */
public class TreeIter extends io.github.jwharm.javagi.interop.ResourceBase {

    public TreeIter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a dynamically allocated tree iterator as a copy of @iter.
     * 
     * This function is not intended for use in applications,
     * because you can just copy the structs by value
     * (`GtkTreeIter new_iter = iter;`).
     * You must free this iter with gtk_tree_iter_free().
     */
    public TreeIter copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_iter_copy(HANDLE());
        return new TreeIter(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Frees an iterator that has been allocated by gtk_tree_iter_copy().
     * 
     * This function is mainly used for language bindings.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_iter_free(HANDLE());
    }
    
}

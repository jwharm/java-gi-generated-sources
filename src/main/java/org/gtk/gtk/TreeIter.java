package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkTreeIter} is the primary structure
 * for accessing a {@code GtkTreeModel}. Models are expected to put a unique
 * integer in the {@code stamp} member, and put
 * model-specific data in the three {@code user_data}
 * members.
 */
public class TreeIter extends io.github.jwharm.javagi.ResourceBase {

    public TreeIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TreeIter() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTreeIter.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Creates a dynamically allocated tree iterator as a copy of {@code iter}.
     * <p>
     * This function is not intended for use in applications,
     * because you can just copy the structs by value
     * ({@code GtkTreeIter new_iter = iter;}).
     * You must free this iter with gtk_tree_iter_free().
     */
    public TreeIter copy() {
        var RESULT = gtk_h.gtk_tree_iter_copy(handle());
        return new TreeIter(References.get(RESULT, true));
    }
    
    /**
     * Frees an iterator that has been allocated by gtk_tree_iter_copy().
     * <p>
     * This function is mainly used for language bindings.
     */
    public void free() {
        gtk_h.gtk_tree_iter_free(handle());
    }
    
}

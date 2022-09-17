package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkTreeIter</code> is the primary structure
 * for accessing a <code>GtkTreeModel</code>. Models are expected to put a unique
 * integer in the @stamp member, and put
 * model-specific data in the three @user_data
 * members.
 */
public class TreeIter extends io.github.jwharm.javagi.ResourceBase {

    public TreeIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a dynamically allocated tree iterator as a copy of @iter.
     * <p>
     * This function is not intended for use in applications,
     * because you can just copy the structs by value
     * (<code>GtkTreeIter new_iter = iter;</code>).
     * You must free this iter with gtk_tree_iter_free().
     */
    public TreeIter copy() {
        var RESULT = gtk_h.gtk_tree_iter_copy(handle());
        return new TreeIter(References.get(RESULT, true));
    }
    
    /**
     * Frees an iterator that has been allocated by gtk_tree_iter_copy().
     * 
     * This function is mainly used for language bindings.
     */
    public void free() {
        gtk_h.gtk_tree_iter_free(handle());
    }
    
}

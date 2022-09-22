package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque type which identifies a specific node in a {@link Tree}.
 */
public class TreeNode extends io.github.jwharm.javagi.ResourceBase {

    public TreeNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Gets the key stored at a particular tree node.
     */
    public java.lang.foreign.MemoryAddress key() {
        var RESULT = gtk_h.g_tree_node_key(handle());
        return RESULT;
    }
    
    /**
     * Returns the next in-order node of the tree, or <code>null</code>
     * if the passed node was already the last one.
     */
    public TreeNode next() {
        var RESULT = gtk_h.g_tree_node_next(handle());
        return new TreeNode(References.get(RESULT, false));
    }
    
    /**
     * Returns the previous in-order node of the tree, or <code>null</code>
     * if the passed node was already the first one.
     */
    public TreeNode previous() {
        var RESULT = gtk_h.g_tree_node_previous(handle());
        return new TreeNode(References.get(RESULT, false));
    }
    
    /**
     * Gets the value stored at a particular tree node.
     */
    public java.lang.foreign.MemoryAddress value() {
        var RESULT = gtk_h.g_tree_node_value(handle());
        return RESULT;
    }
    
}

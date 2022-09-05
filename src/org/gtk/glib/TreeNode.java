package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque type which identifies a specific node in a #GTree.
 */
public class TreeNode extends io.github.jwharm.javagi.interop.ResourceBase {

    public TreeNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Gets the key stored at a particular tree node.
     */
    public jdk.incubator.foreign.MemoryAddress key() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tree_node_key(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the next in-order node of the tree, or %NULL
     * if the passed node was already the last one.
     */
    public TreeNode next() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tree_node_next(HANDLE());
        return new TreeNode(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the previous in-order node of the tree, or %NULL
     * if the passed node was already the first one.
     */
    public TreeNode previous() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tree_node_previous(HANDLE());
        return new TreeNode(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the value stored at a particular tree node.
     */
    public jdk.incubator.foreign.MemoryAddress value() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tree_node_value(HANDLE());
        return RESULT;
    }
    
}

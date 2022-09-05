package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a path to a row in a model.
 */
public class TreePath extends io.github.jwharm.javagi.interop.ResourceBase {

    public TreePath(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new `GtkTreePath`
     * This refers to a row.
     */
    public TreePath() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_new(), true));
    }
    
    /**
     * Creates a new `GtkTreePath`.
     * 
     * The string representation of this path is “0”.
     */
    public static TreePath newFirst() {
        return new TreePath(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_new_first(), true));
    }
    
    /**
     * Creates a new path with the given @indices array of @length.
     */
    public TreePath(int[] indices, long length) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_new_from_indicesv(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, indices), length), true));
    }
    
    /**
     * Creates a new `GtkTreePath` initialized to @path.
     * 
     * @path is expected to be a colon separated list of numbers.
     * For example, the string “10:4:0” would create a path of depth
     * 3 pointing to the 11th child of the root node, the 5th
     * child of that 11th child, and the 1st child of that 5th child.
     * If an invalid path string is passed in, %NULL is returned.
     */
    public TreePath(java.lang.String path) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_new_from_string(Interop.getAllocator().allocateUtf8String(path)), true));
    }
    
    /**
     * Appends a new index to a path.
     * 
     * As a result, the depth of the path is increased.
     */
    public void appendIndex(int index) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_append_index(HANDLE(), index);
    }
    
    /**
     * Compares two paths.
     * 
     * If @a appears before @b in a tree, then -1 is returned.
     * If @b appears before @a, then 1 is returned.
     * If the two nodes are equal, then 0 is returned.
     */
    public int compare(TreePath b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_compare(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Creates a new `GtkTreePath` as a copy of @path.
     */
    public TreePath copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_copy(HANDLE());
        return new TreePath(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Moves @path to point to the first child of the current path.
     */
    public void down() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_down(HANDLE());
    }
    
    /**
     * Frees @path. If @path is %NULL, it simply returns.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_free(HANDLE());
    }
    
    /**
     * Returns the current depth of @path.
     */
    public int getDepth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_get_depth(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns %TRUE if @descendant is a descendant of @path.
     */
    public boolean isAncestor(TreePath descendant) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_is_ancestor(HANDLE(), descendant.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if @path is a descendant of @ancestor.
     */
    public boolean isDescendant(TreePath ancestor) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_is_descendant(HANDLE(), ancestor.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves the @path to point to the next node at the current depth.
     */
    public void next() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_next(HANDLE());
    }
    
    /**
     * Prepends a new index to a path.
     * 
     * As a result, the depth of the path is increased.
     */
    public void prependIndex(int index) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_prepend_index(HANDLE(), index);
    }
    
    /**
     * Moves the @path to point to the previous node at the
     * current depth, if it exists.
     */
    public boolean prev() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_prev(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Generates a string representation of the path.
     * 
     * This string is a “:” separated list of numbers.
     * For example, “4:10:0:3” would be an acceptable
     * return value for this string. If the path has
     * depth 0, %NULL is returned.
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Moves the @path to point to its parent node, if it has a parent.
     */
    public boolean up() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_path_up(HANDLE());
        return (RESULT != 0);
    }
    
}

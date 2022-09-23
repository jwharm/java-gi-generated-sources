package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a path to a row in a model.
 */
public class TreePath extends io.github.jwharm.javagi.ResourceBase {

    public TreePath(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_tree_path_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreePath}
     * This refers to a row.
     */
    public TreePath() {
        super(constructNew());
    }
    
    private static Reference constructNewFirst() {
        Reference RESULT = References.get(gtk_h.gtk_tree_path_new_first(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreePath}.
     * <p>
     * The string representation of this path is “0”.
     */
    public static TreePath newFirst() {
        return new TreePath(constructNewFirst());
    }
    
    private static Reference constructNewFromIndicesv(int[] indices, long length) {
        Reference RESULT = References.get(gtk_h.gtk_tree_path_new_from_indicesv(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, indices)).handle(), length), true);
        return RESULT;
    }
    
    /**
     * Creates a new path with the given {@code indices} array of {@code length}.
     */
    public static TreePath newFromIndicesv(int[] indices, long length) {
        return new TreePath(constructNewFromIndicesv(indices, length));
    }
    
    private static Reference constructNewFromString(java.lang.String path) {
        Reference RESULT = References.get(gtk_h.gtk_tree_path_new_from_string(Interop.allocateNativeString(path).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreePath} initialized to {@code path}.
     * <p>
     * {@code path} is expected to be a colon separated list of numbers.
     * For example, the string “10:4:0” would create a path of depth
     * 3 pointing to the 11th child of the root node, the 5th
     * child of that 11th child, and the 1st child of that 5th child.
     * If an invalid path string is passed in, {@code null} is returned.
     */
    public static TreePath newFromString(java.lang.String path) {
        return new TreePath(constructNewFromString(path));
    }
    
    /**
     * Appends a new index to a path.
     * <p>
     * As a result, the depth of the path is increased.
     */
    public void appendIndex(int index) {
        gtk_h.gtk_tree_path_append_index(handle(), index);
    }
    
    /**
     * Compares two paths.
     * <p>
     * If @a appears before @b in a tree, then -1 is returned.
     * If @b appears before @a, then 1 is returned.
     * If the two nodes are equal, then 0 is returned.
     */
    public int compare(TreePath b) {
        var RESULT = gtk_h.gtk_tree_path_compare(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreePath} as a copy of {@code path}.
     */
    public TreePath copy() {
        var RESULT = gtk_h.gtk_tree_path_copy(handle());
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Moves {@code path} to point to the first child of the current path.
     */
    public void down() {
        gtk_h.gtk_tree_path_down(handle());
    }
    
    /**
     * Frees {@code path}. If {@code path} is {@code null}, it simply returns.
     */
    public void free() {
        gtk_h.gtk_tree_path_free(handle());
    }
    
    /**
     * Returns the current depth of {@code path}.
     */
    public int getDepth() {
        var RESULT = gtk_h.gtk_tree_path_get_depth(handle());
        return RESULT;
    }
    
    /**
     * Returns {@code true} if {@code descendant} is a descendant of {@code path}.
     */
    public boolean isAncestor(TreePath descendant) {
        var RESULT = gtk_h.gtk_tree_path_is_ancestor(handle(), descendant.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns {@code true} if {@code path} is a descendant of {@code ancestor}.
     */
    public boolean isDescendant(TreePath ancestor) {
        var RESULT = gtk_h.gtk_tree_path_is_descendant(handle(), ancestor.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves the {@code path} to point to the next node at the current depth.
     */
    public void next() {
        gtk_h.gtk_tree_path_next(handle());
    }
    
    /**
     * Prepends a new index to a path.
     * <p>
     * As a result, the depth of the path is increased.
     */
    public void prependIndex(int index) {
        gtk_h.gtk_tree_path_prepend_index(handle(), index);
    }
    
    /**
     * Moves the {@code path} to point to the previous node at the
     * current depth, if it exists.
     */
    public boolean prev() {
        var RESULT = gtk_h.gtk_tree_path_prev(handle());
        return (RESULT != 0);
    }
    
    /**
     * Generates a string representation of the path.
     * <p>
     * This string is a “:” separated list of numbers.
     * For example, “4:10:0:3” would be an acceptable
     * return value for this string. If the path has
     * depth 0, {@code null} is returned.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.gtk_tree_path_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Moves the {@code path} to point to its parent node, if it has a parent.
     */
    public boolean up() {
        var RESULT = gtk_h.gtk_tree_path_up(handle());
        return (RESULT != 0);
    }
    
}

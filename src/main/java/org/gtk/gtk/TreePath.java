package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a path to a row in a model.
 */
public class TreePath extends io.github.jwharm.javagi.ResourceBase {

    public TreePath(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_tree_path_new = Interop.downcallHandle(
        "gtk_tree_path_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_path_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTreePath}
     * This refers to a row.
     */
    public TreePath() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_tree_path_new_first = Interop.downcallHandle(
        "gtk_tree_path_new_first",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFirst() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_path_new_first.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTreePath}.
     * <p>
     * The string representation of this path is “0”.
     */
    public static TreePath newFirst() {
        return new TreePath(constructNewFirst());
    }
    
    static final MethodHandle gtk_tree_path_new_from_indicesv = Interop.downcallHandle(
        "gtk_tree_path_new_from_indicesv",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewFromIndicesv(int[] indices, long length) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_path_new_from_indicesv.invokeExact(Interop.allocateNativeArray(indices).handle(), length), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new path with the given {@code indices} array of {@code length}.
     */
    public static TreePath newFromIndicesv(int[] indices, long length) {
        return new TreePath(constructNewFromIndicesv(indices, length));
    }
    
    static final MethodHandle gtk_tree_path_new_from_string = Interop.downcallHandle(
        "gtk_tree_path_new_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromString(java.lang.String path) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_path_new_from_string.invokeExact(Interop.allocateNativeString(path).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gtk_tree_path_append_index = Interop.downcallHandle(
        "gtk_tree_path_append_index",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Appends a new index to a path.
     * <p>
     * As a result, the depth of the path is increased.
     */
    public void appendIndex(int index) {
        try {
            gtk_tree_path_append_index.invokeExact(handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_compare = Interop.downcallHandle(
        "gtk_tree_path_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two paths.
     * <p>
     * If @a appears before @b in a tree, then -1 is returned.
     * If @b appears before @a, then 1 is returned.
     * If the two nodes are equal, then 0 is returned.
     */
    public int compare(TreePath b) {
        try {
            var RESULT = (int) gtk_tree_path_compare.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_copy = Interop.downcallHandle(
        "gtk_tree_path_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code GtkTreePath} as a copy of {@code path}.
     */
    public TreePath copy() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_path_copy.invokeExact(handle());
            return new TreePath(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_down = Interop.downcallHandle(
        "gtk_tree_path_down",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code path} to point to the first child of the current path.
     */
    public void down() {
        try {
            gtk_tree_path_down.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_free = Interop.downcallHandle(
        "gtk_tree_path_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees {@code path}. If {@code path} is {@code null}, it simply returns.
     */
    public void free() {
        try {
            gtk_tree_path_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_get_depth = Interop.downcallHandle(
        "gtk_tree_path_get_depth",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current depth of {@code path}.
     */
    public int getDepth() {
        try {
            var RESULT = (int) gtk_tree_path_get_depth.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_get_indices = Interop.downcallHandle(
        "gtk_tree_path_get_indices",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current indices of {@code path}.
     * <p>
     * This is an array of integers, each representing a node in a tree.
     * This value should not be freed.
     * <p>
     * The length of the array can be obtained with gtk_tree_path_get_depth().
     */
    public PointerInteger getIndices() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_path_get_indices.invokeExact(handle());
            return new PointerInteger(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_get_indices_with_depth = Interop.downcallHandle(
        "gtk_tree_path_get_indices_with_depth",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current indices of {@code path}.
     * <p>
     * This is an array of integers, each representing a node in a tree.
     * It also returns the number of elements in the array.
     * The array should not be freed.
     */
    public PointerIterator<Integer> getIndicesWithDepth(PointerInteger depth) {
        try {
            var RESULT = (MemoryAddress) gtk_tree_path_get_indices_with_depth.invokeExact(handle(), depth.handle());
            return new PointerInteger(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_is_ancestor = Interop.downcallHandle(
        "gtk_tree_path_is_ancestor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code descendant} is a descendant of {@code path}.
     */
    public boolean isAncestor(TreePath descendant) {
        try {
            var RESULT = (int) gtk_tree_path_is_ancestor.invokeExact(handle(), descendant.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_is_descendant = Interop.downcallHandle(
        "gtk_tree_path_is_descendant",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code path} is a descendant of {@code ancestor}.
     */
    public boolean isDescendant(TreePath ancestor) {
        try {
            var RESULT = (int) gtk_tree_path_is_descendant.invokeExact(handle(), ancestor.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_next = Interop.downcallHandle(
        "gtk_tree_path_next",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the {@code path} to point to the next node at the current depth.
     */
    public void next() {
        try {
            gtk_tree_path_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_prepend_index = Interop.downcallHandle(
        "gtk_tree_path_prepend_index",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Prepends a new index to a path.
     * <p>
     * As a result, the depth of the path is increased.
     */
    public void prependIndex(int index) {
        try {
            gtk_tree_path_prepend_index.invokeExact(handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_prev = Interop.downcallHandle(
        "gtk_tree_path_prev",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the {@code path} to point to the previous node at the
     * current depth, if it exists.
     */
    public boolean prev() {
        try {
            var RESULT = (int) gtk_tree_path_prev.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_to_string = Interop.downcallHandle(
        "gtk_tree_path_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Generates a string representation of the path.
     * <p>
     * This string is a “:” separated list of numbers.
     * For example, “4:10:0:3” would be an acceptable
     * return value for this string. If the path has
     * depth 0, {@code null} is returned.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_path_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_path_up = Interop.downcallHandle(
        "gtk_tree_path_up",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the {@code path} to point to its parent node, if it has a parent.
     */
    public boolean up() {
        try {
            var RESULT = (int) gtk_tree_path_up.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

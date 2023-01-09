package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing a path to a row in a model.
 */
public class TreePath extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreePath";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TreePath}
     * @return A new, uninitialized @{link TreePath}
     */
    public static TreePath allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TreePath newInstance = new TreePath(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TreePath proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreePath(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreePath> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreePath(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_path_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreePath}
     * This refers to a row.
     */
    public TreePath() {
        super(constructNew());
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFirst() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_path_new_first.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkTreePath}.
     * <p>
     * The string representation of this path is “0”.
     * @return A new {@code GtkTreePath}
     */
    public static TreePath newFirst() {
        var RESULT = constructNewFirst();
        var OBJECT = org.gtk.gtk.TreePath.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromIndices(int firstIndex, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_path_new_from_indices.invokeExact(
                    firstIndex,
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new path with {@code first_index} and {@code varargs} as indices.
     * @param firstIndex first integer
     * @param varargs list of integers terminated by -1
     * @return A newly created {@code GtkTreePath}
     */
    public static TreePath newFromIndices(int firstIndex, java.lang.Object... varargs) {
        var RESULT = constructNewFromIndices(firstIndex, varargs);
        var OBJECT = org.gtk.gtk.TreePath.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromIndicesv(int[] indices, long length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_tree_path_new_from_indicesv.invokeExact(
                        Interop.allocateNativeArray(indices, false, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new path with the given {@code indices} array of {@code length}.
     * @param indices array of indices
     * @param length length of {@code indices} array
     * @return A newly created {@code GtkTreePath}
     */
    public static TreePath newFromIndicesv(int[] indices, long length) {
        var RESULT = constructNewFromIndicesv(indices, length);
        var OBJECT = org.gtk.gtk.TreePath.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromString(java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_tree_path_new_from_string.invokeExact(Marshal.stringToAddress.marshal(path, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
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
     * @param path The string representation of a path
     * @return A newly-created {@code GtkTreePath}
     */
    public static TreePath newFromString(java.lang.String path) {
        var RESULT = constructNewFromString(path);
        var OBJECT = org.gtk.gtk.TreePath.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Appends a new index to a path.
     * <p>
     * As a result, the depth of the path is increased.
     * @param index the index
     */
    public void appendIndex(int index) {
        try {
            DowncallHandles.gtk_tree_path_append_index.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares two paths.
     * <p>
     * If {@code a} appears before {@code b} in a tree, then -1 is returned.
     * If {@code b} appears before {@code a}, then 1 is returned.
     * If the two nodes are equal, then 0 is returned.
     * @param b a {@code GtkTreePath} to compare with
     * @return the relative positions of {@code a} and {@code b}
     */
    public int compare(org.gtk.gtk.TreePath b) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_path_compare.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreePath} as a copy of {@code path}.
     * @return a new {@code GtkTreePath}
     */
    public org.gtk.gtk.TreePath copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_path_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gtk.TreePath.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Moves {@code path} to point to the first child of the current path.
     */
    public void down() {
        try {
            DowncallHandles.gtk_tree_path_down.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees {@code path}. If {@code path} is {@code null}, it simply returns.
     */
    public void free() {
        try {
            DowncallHandles.gtk_tree_path_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the current depth of {@code path}.
     * @return The depth of {@code path}
     */
    public int getDepth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_path_get_depth.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the current indices of {@code path}.
     * <p>
     * This is an array of integers, each representing a node in a tree.
     * It also returns the number of elements in the array.
     * The array should not be freed.
     * @param depth return location for number of elements
     *   returned in the integer array
     * @return The current
     *   indices
     */
    public int[] getIndices(Out<Integer> depth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment depthPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_tree_path_get_indices_with_depth.invokeExact(
                        handle(),
                        (Addressable) (depth == null ? MemoryAddress.NULL : (Addressable) depthPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (depth != null) depth.set(depthPOINTER.get(Interop.valueLayout.C_INT, 0));
            if (RESULT.equals(MemoryAddress.NULL)) return null;
            return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), depth.get().intValue() * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Returns {@code true} if {@code descendant} is a descendant of {@code path}.
     * @param descendant another {@code GtkTreePath}
     * @return {@code true} if {@code descendant} is contained inside {@code path}
     */
    public boolean isAncestor(org.gtk.gtk.TreePath descendant) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_path_is_ancestor.invokeExact(
                    handle(),
                    descendant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if {@code path} is a descendant of {@code ancestor}.
     * @param ancestor another {@code GtkTreePath}
     * @return {@code true} if {@code ancestor} contains {@code path} somewhere below it
     */
    public boolean isDescendant(org.gtk.gtk.TreePath ancestor) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_path_is_descendant.invokeExact(
                    handle(),
                    ancestor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Moves the {@code path} to point to the next node at the current depth.
     */
    public void next() {
        try {
            DowncallHandles.gtk_tree_path_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepends a new index to a path.
     * <p>
     * As a result, the depth of the path is increased.
     * @param index the index
     */
    public void prependIndex(int index) {
        try {
            DowncallHandles.gtk_tree_path_prepend_index.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves the {@code path} to point to the previous node at the
     * current depth, if it exists.
     * @return {@code true} if {@code path} has a previous node, and
     *   the move was made
     */
    public boolean prev() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_path_prev.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Generates a string representation of the path.
     * <p>
     * This string is a “:” separated list of numbers.
     * For example, “4:10:0:3” would be an acceptable
     * return value for this string. If the path has
     * depth 0, {@code null} is returned.
     * @return A newly-allocated string
     */
    public @Nullable java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_path_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Moves the {@code path} to point to its parent node, if it has a parent.
     * @return {@code true} if {@code path} has a parent, and the move was made
     */
    public boolean up() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_path_up.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_path_new = Interop.downcallHandle(
                "gtk_tree_path_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_new_first = Interop.downcallHandle(
                "gtk_tree_path_new_first",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_new_from_indices = Interop.downcallHandle(
                "gtk_tree_path_new_from_indices",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                true
        );
        
        private static final MethodHandle gtk_tree_path_new_from_indicesv = Interop.downcallHandle(
                "gtk_tree_path_new_from_indicesv",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_tree_path_new_from_string = Interop.downcallHandle(
                "gtk_tree_path_new_from_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_append_index = Interop.downcallHandle(
                "gtk_tree_path_append_index",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_path_compare = Interop.downcallHandle(
                "gtk_tree_path_compare",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_copy = Interop.downcallHandle(
                "gtk_tree_path_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_down = Interop.downcallHandle(
                "gtk_tree_path_down",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_free = Interop.downcallHandle(
                "gtk_tree_path_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_get_depth = Interop.downcallHandle(
                "gtk_tree_path_get_depth",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_get_indices_with_depth = Interop.downcallHandle(
                "gtk_tree_path_get_indices_with_depth",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_is_ancestor = Interop.downcallHandle(
                "gtk_tree_path_is_ancestor",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_is_descendant = Interop.downcallHandle(
                "gtk_tree_path_is_descendant",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_next = Interop.downcallHandle(
                "gtk_tree_path_next",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_prepend_index = Interop.downcallHandle(
                "gtk_tree_path_prepend_index",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_path_prev = Interop.downcallHandle(
                "gtk_tree_path_prev",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_to_string = Interop.downcallHandle(
                "gtk_tree_path_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_path_up = Interop.downcallHandle(
                "gtk_tree_path_up",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
}

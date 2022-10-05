package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The GTree struct is an opaque data structure representing a
 * [balanced binary tree][glib-Balanced-Binary-Trees]. It should be
 * accessed only by using the following functions.
 */
public class Tree extends io.github.jwharm.javagi.ResourceBase {

    public Tree(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_tree_new_full = Interop.downcallHandle(
        "g_tree_new_full",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFull(CompareDataFunc keyCompareFunc) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_tree_new_full.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(keyCompareFunc.hashCode(), keyCompareFunc)), 
                    Interop.cbDestroyNotifySymbol(), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Tree} like g_tree_new() and allows to specify functions
     * to free the memory allocated for the key and value that get called when
     * removing the entry from the {@link Tree}.
     */
    public static Tree newFull(CompareDataFunc keyCompareFunc) {
        return new Tree(constructNewFull(keyCompareFunc));
    }
    
    static final MethodHandle g_tree_new_with_data = Interop.downcallHandle(
        "g_tree_new_with_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithData(CompareDataFunc keyCompareFunc) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_tree_new_with_data.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(keyCompareFunc.hashCode(), keyCompareFunc))), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Tree} with a comparison function that accepts user data.
     * See g_tree_new() for more details.
     */
    public static Tree newWithData(CompareDataFunc keyCompareFunc) {
        return new Tree(constructNewWithData(keyCompareFunc));
    }
    
    static final MethodHandle g_tree_destroy = Interop.downcallHandle(
        "g_tree_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all keys and values from the {@link Tree} and decreases its
     * reference count by one. If keys and/or values are dynamically
     * allocated, you should either free them first or create the {@link Tree}
     * using g_tree_new_full(). In the latter case the destroy functions
     * you supplied will be called on all keys and values before destroying
     * the {@link Tree}.
     */
    public void destroy() {
        try {
            g_tree_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_foreach = Interop.downcallHandle(
        "g_tree_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the given function for each of the key/value pairs in the {@link Tree}.
     * The function is passed the key and value of each pair, and the given
     * {@code data} parameter. The tree is traversed in sorted order.
     * <p>
     * The tree may not be modified while iterating over it (you can't
     * add/remove items). To remove all items matching a predicate, you need
     * to add each item to a list in your {@link TraverseFunc} as you walk over
     * the tree, then walk the list and remove each item.
     */
    public void foreach(TraverseFunc func) {
        try {
            g_tree_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTraverseFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_foreach_node = Interop.downcallHandle(
        "g_tree_foreach_node",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the given function for each of the nodes in the {@link Tree}.
     * The function is passed the pointer to the particular node, and the given
     * {@code data} parameter. The tree traversal happens in-order.
     * <p>
     * The tree may not be modified while iterating over it (you can't
     * add/remove items). To remove all items matching a predicate, you need
     * to add each item to a list in your {@link TraverseFunc} as you walk over
     * the tree, then walk the list and remove each item.
     */
    public void foreachNode(TraverseNodeFunc func) {
        try {
            g_tree_foreach_node.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTraverseNodeFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_height = Interop.downcallHandle(
        "g_tree_height",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the height of a {@link Tree}.
     * <p>
     * If the {@link Tree} contains no nodes, the height is 0.
     * If the {@link Tree} contains only one root node the height is 1.
     * If the root node has children the height is 2, etc.
     */
    public int height() {
        try {
            var RESULT = (int) g_tree_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_insert = Interop.downcallHandle(
        "g_tree_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a key/value pair into a {@link Tree}.
     * <p>
     * Inserts a new key and value into a {@link Tree} as g_tree_insert_node() does,
     * only this function does not return the inserted or set node.
     */
    public void insert(java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value) {
        try {
            g_tree_insert.invokeExact(handle(), key, value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_insert_node = Interop.downcallHandle(
        "g_tree_insert_node",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a key/value pair into a {@link Tree}.
     * <p>
     * If the given key already exists in the {@link Tree} its corresponding value
     * is set to the new value. If you supplied a {@code value_destroy_func} when
     * creating the {@link Tree}, the old value is freed using that function. If
     * you supplied a {@code key_destroy_func} when creating the {@link Tree}, the passed
     * key is freed using that function.
     * <p>
     * The tree is automatically 'balanced' as new key/value pairs are added,
     * so that the distance from the root to every leaf is as small as possible.
     * The cost of maintaining a balanced tree while inserting new key/value
     * result in a O(n log(n)) operation where most of the other operations
     * are O(log(n)).
     */
    public TreeNode insertNode(java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (MemoryAddress) g_tree_insert_node.invokeExact(handle(), key, value);
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_lookup = Interop.downcallHandle(
        "g_tree_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value corresponding to the given key. Since a {@link Tree} is
     * automatically balanced as key/value pairs are added, key lookup
     * is O(log n) (where n is the number of key/value pairs in the tree).
     */
    public java.lang.foreign.MemoryAddress lookup(java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (MemoryAddress) g_tree_lookup.invokeExact(handle(), key);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_lookup_extended = Interop.downcallHandle(
        "g_tree_lookup_extended",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a key in the {@link Tree}, returning the original key and the
     * associated value. This is useful if you need to free the memory
     * allocated for the original key, for example before calling
     * g_tree_remove().
     */
    public boolean lookupExtended(java.lang.foreign.MemoryAddress lookupKey, java.lang.foreign.MemoryAddress origKey, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (int) g_tree_lookup_extended.invokeExact(handle(), lookupKey, origKey, value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_lookup_node = Interop.downcallHandle(
        "g_tree_lookup_node",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the tree node corresponding to the given key. Since a {@link Tree} is
     * automatically balanced as key/value pairs are added, key lookup
     * is O(log n) (where n is the number of key/value pairs in the tree).
     */
    public TreeNode lookupNode(java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (MemoryAddress) g_tree_lookup_node.invokeExact(handle(), key);
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_lower_bound = Interop.downcallHandle(
        "g_tree_lower_bound",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the lower bound node corresponding to the given key,
     * or {@code null} if the tree is empty or all the nodes in the tree
     * have keys that are strictly lower than the searched key.
     * <p>
     * The lower bound is the first node that has its key greater
     * than or equal to the searched key.
     */
    public TreeNode lowerBound(java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (MemoryAddress) g_tree_lower_bound.invokeExact(handle(), key);
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_nnodes = Interop.downcallHandle(
        "g_tree_nnodes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of nodes in a {@link Tree}.
     */
    public int nnodes() {
        try {
            var RESULT = (int) g_tree_nnodes.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_node_first = Interop.downcallHandle(
        "g_tree_node_first",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the first in-order node of the tree, or {@code null}
     * for an empty tree.
     */
    public TreeNode nodeFirst() {
        try {
            var RESULT = (MemoryAddress) g_tree_node_first.invokeExact(handle());
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_node_last = Interop.downcallHandle(
        "g_tree_node_last",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the last in-order node of the tree, or {@code null}
     * for an empty tree.
     */
    public TreeNode nodeLast() {
        try {
            var RESULT = (MemoryAddress) g_tree_node_last.invokeExact(handle());
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_ref = Interop.downcallHandle(
        "g_tree_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count of {@code tree} by one.
     * <p>
     * It is safe to call this function from any thread.
     */
    public Tree ref() {
        try {
            var RESULT = (MemoryAddress) g_tree_ref.invokeExact(handle());
            return new Tree(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_remove = Interop.downcallHandle(
        "g_tree_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a key/value pair from a {@link Tree}.
     * <p>
     * If the {@link Tree} was created using g_tree_new_full(), the key and value
     * are freed using the supplied destroy functions, otherwise you have to
     * make sure that any dynamically allocated values are freed yourself.
     * If the key does not exist in the {@link Tree}, the function does nothing.
     * <p>
     * The cost of maintaining a balanced tree while removing a key/value
     * result in a O(n log(n)) operation where most of the other operations
     * are O(log(n)).
     */
    public boolean remove(java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_tree_remove.invokeExact(handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_remove_all = Interop.downcallHandle(
        "g_tree_remove_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all nodes from a {@link Tree} and destroys their keys and values,
     * then resets the {@link Tree}’s root to {@code null}.
     */
    public void removeAll() {
        try {
            g_tree_remove_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_replace = Interop.downcallHandle(
        "g_tree_replace",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new key and value into a {@link Tree} as g_tree_replace_node() does,
     * only this function does not return the inserted or set node.
     */
    public void replace(java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value) {
        try {
            g_tree_replace.invokeExact(handle(), key, value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_replace_node = Interop.downcallHandle(
        "g_tree_replace_node",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new key and value into a {@link Tree} similar to g_tree_insert_node().
     * The difference is that if the key already exists in the {@link Tree}, it gets
     * replaced by the new key. If you supplied a {@code value_destroy_func} when
     * creating the {@link Tree}, the old value is freed using that function. If you
     * supplied a {@code key_destroy_func} when creating the {@link Tree}, the old key is
     * freed using that function.
     * <p>
     * The tree is automatically 'balanced' as new key/value pairs are added,
     * so that the distance from the root to every leaf is as small as possible.
     */
    public TreeNode replaceNode(java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (MemoryAddress) g_tree_replace_node.invokeExact(handle(), key, value);
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_search = Interop.downcallHandle(
        "g_tree_search",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Searches a {@link Tree} using {@code search_func}.
     * <p>
     * The {@code search_func} is called with a pointer to the key of a key/value
     * pair in the tree, and the passed in {@code user_data}. If {@code search_func} returns
     * 0 for a key/value pair, then the corresponding value is returned as
     * the result of g_tree_search(). If {@code search_func} returns -1, searching
     * will proceed among the key/value pairs that have a smaller key; if
     * {@code search_func} returns 1, searching will proceed among the key/value
     * pairs that have a larger key.
     */
    public java.lang.foreign.MemoryAddress search(CompareFunc searchFunc) {
        try {
            var RESULT = (MemoryAddress) g_tree_search.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(searchFunc.hashCode(), searchFunc)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_search_node = Interop.downcallHandle(
        "g_tree_search_node",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Searches a {@link Tree} using {@code search_func}.
     * <p>
     * The {@code search_func} is called with a pointer to the key of a key/value
     * pair in the tree, and the passed in {@code user_data}. If {@code search_func} returns
     * 0 for a key/value pair, then the corresponding node is returned as
     * the result of g_tree_search(). If {@code search_func} returns -1, searching
     * will proceed among the key/value pairs that have a smaller key; if
     * {@code search_func} returns 1, searching will proceed among the key/value
     * pairs that have a larger key.
     */
    public TreeNode searchNode(CompareFunc searchFunc) {
        try {
            var RESULT = (MemoryAddress) g_tree_search_node.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(searchFunc.hashCode(), searchFunc)));
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_steal = Interop.downcallHandle(
        "g_tree_steal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a key and its associated value from a {@link Tree} without calling
     * the key and value destroy functions.
     * <p>
     * If the key does not exist in the {@link Tree}, the function does nothing.
     */
    public boolean steal(java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_tree_steal.invokeExact(handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_unref = Interop.downcallHandle(
        "g_tree_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of {@code tree} by one.
     * If the reference count drops to 0, all keys and values will
     * be destroyed (if destroy functions were specified) and all
     * memory allocated by {@code tree} will be released.
     * <p>
     * It is safe to call this function from any thread.
     */
    public void unref() {
        try {
            g_tree_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_upper_bound = Interop.downcallHandle(
        "g_tree_upper_bound",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the upper bound node corresponding to the given key,
     * or {@code null} if the tree is empty or all the nodes in the tree
     * have keys that are lower than or equal to the searched key.
     * <p>
     * The upper bound is the first node that has its key strictly greater
     * than the searched key.
     */
    public TreeNode upperBound(java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (MemoryAddress) g_tree_upper_bound.invokeExact(handle(), key);
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

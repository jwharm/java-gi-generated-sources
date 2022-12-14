package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GTree struct is an opaque data structure representing a
 * [balanced binary tree][glib-Balanced-Binary-Trees]. It should be
 * accessed only by using the following functions.
 */
public class Tree extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTree";
    
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
     * Allocate a new {@link Tree}
     * @return A new, uninitialized @{link Tree}
     */
    public static Tree allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Tree newInstance = new Tree(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Tree proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Tree(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Tree> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Tree(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.CompareFunc keyCompareFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_new.invokeExact((Addressable) keyCompareFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Tree}.
     * @param keyCompareFunc the function used to order the nodes in the {@link Tree}.
     *   It should return values similar to the standard strcmp() function -
     *   0 if the two arguments are equal, a negative value if the first argument
     *   comes before the second, or a positive value if the first argument comes
     *   after the second.
     */
    public Tree(org.gtk.glib.CompareFunc keyCompareFunc) {
        super(constructNew(keyCompareFunc));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFull(org.gtk.glib.CompareDataFunc keyCompareFunc, org.gtk.glib.DestroyNotify keyDestroyFunc, org.gtk.glib.DestroyNotify valueDestroyFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_new_full.invokeExact(
                    (Addressable) keyCompareFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) keyDestroyFunc.toCallback(),
                    (Addressable) valueDestroyFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link Tree} like g_tree_new() and allows to specify functions
     * to free the memory allocated for the key and value that get called when
     * removing the entry from the {@link Tree}.
     * @param keyCompareFunc qsort()-style comparison function
     * @param keyDestroyFunc a function to free the memory allocated for the key
     *   used when removing the entry from the {@link Tree} or {@code null} if you don't
     *   want to supply such a function
     * @param valueDestroyFunc a function to free the memory allocated for the
     *   value used when removing the entry from the {@link Tree} or {@code null} if you
     *   don't want to supply such a function
     * @return a newly allocated {@link Tree}
     */
    public static Tree newFull(org.gtk.glib.CompareDataFunc keyCompareFunc, org.gtk.glib.DestroyNotify keyDestroyFunc, org.gtk.glib.DestroyNotify valueDestroyFunc) {
        var RESULT = constructNewFull(keyCompareFunc, keyDestroyFunc, valueDestroyFunc);
        var OBJECT = org.gtk.glib.Tree.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithData(org.gtk.glib.CompareDataFunc keyCompareFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_new_with_data.invokeExact(
                    (Addressable) keyCompareFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link Tree} with a comparison function that accepts user data.
     * See g_tree_new() for more details.
     * @param keyCompareFunc qsort()-style comparison function
     * @return a newly allocated {@link Tree}
     */
    public static Tree newWithData(org.gtk.glib.CompareDataFunc keyCompareFunc) {
        var RESULT = constructNewWithData(keyCompareFunc);
        var OBJECT = org.gtk.glib.Tree.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
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
            DowncallHandles.g_tree_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls the given function for each of the key/value pairs in the {@link Tree}.
     * The function is passed the key and value of each pair, and the given
     * {@code data} parameter. The tree is traversed in sorted order.
     * <p>
     * The tree may not be modified while iterating over it (you can't
     * add/remove items). To remove all items matching a predicate, you need
     * to add each item to a list in your {@link TraverseFunc} as you walk over
     * the tree, then walk the list and remove each item.
     * @param func the function to call for each node visited.
     *     If this function returns {@code true}, the traversal is stopped.
     */
    public void foreach(org.gtk.glib.TraverseFunc func) {
        try {
            DowncallHandles.g_tree_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls the given function for each of the nodes in the {@link Tree}.
     * The function is passed the pointer to the particular node, and the given
     * {@code data} parameter. The tree traversal happens in-order.
     * <p>
     * The tree may not be modified while iterating over it (you can't
     * add/remove items). To remove all items matching a predicate, you need
     * to add each item to a list in your {@link TraverseFunc} as you walk over
     * the tree, then walk the list and remove each item.
     * @param func the function to call for each node visited.
     *     If this function returns {@code true}, the traversal is stopped.
     */
    public void foreachNode(org.gtk.glib.TraverseNodeFunc func) {
        try {
            DowncallHandles.g_tree_foreach_node.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the height of a {@link Tree}.
     * <p>
     * If the {@link Tree} contains no nodes, the height is 0.
     * If the {@link Tree} contains only one root node the height is 1.
     * If the root node has children the height is 2, etc.
     * @return the height of {@code tree}
     */
    public int height() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tree_height.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts a key/value pair into a {@link Tree}.
     * <p>
     * Inserts a new key and value into a {@link Tree} as g_tree_insert_node() does,
     * only this function does not return the inserted or set node.
     * @param key the key to insert
     * @param value the value corresponding to the key
     */
    public void insert(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value) {
        try {
            DowncallHandles.g_tree_insert.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param key the key to insert
     * @param value the value corresponding to the key
     * @return the inserted (or set) node.
     */
    public org.gtk.glib.TreeNode insertNode(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_insert_node.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the value corresponding to the given key. Since a {@link Tree} is
     * automatically balanced as key/value pairs are added, key lookup
     * is O(log n) (where n is the number of key/value pairs in the tree).
     * @param key the key to look up
     * @return the value corresponding to the key, or {@code null}
     *     if the key was not found
     */
    public @Nullable java.lang.foreign.MemoryAddress lookup(@Nullable java.lang.foreign.MemoryAddress key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_lookup.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Looks up a key in the {@link Tree}, returning the original key and the
     * associated value. This is useful if you need to free the memory
     * allocated for the original key, for example before calling
     * g_tree_remove().
     * @param lookupKey the key to look up
     * @param origKey returns the original key
     * @param value returns the value associated with the key
     * @return {@code true} if the key was found in the {@link Tree}
     */
    public boolean lookupExtended(@Nullable java.lang.foreign.MemoryAddress lookupKey, @Nullable Out<java.lang.foreign.MemoryAddress> origKey, @Nullable Out<java.lang.foreign.MemoryAddress> value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment origKeyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_tree_lookup_extended.invokeExact(
                        handle(),
                        (Addressable) (lookupKey == null ? MemoryAddress.NULL : (Addressable) lookupKey),
                        (Addressable) (origKey == null ? MemoryAddress.NULL : (Addressable) origKeyPOINTER.address()),
                        (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (origKey != null) origKey.set(origKeyPOINTER.get(Interop.valueLayout.ADDRESS, 0));
                    if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the tree node corresponding to the given key. Since a {@link Tree} is
     * automatically balanced as key/value pairs are added, key lookup
     * is O(log n) (where n is the number of key/value pairs in the tree).
     * @param key the key to look up
     * @return the tree node corresponding to
     *          the key, or {@code null} if the key was not found
     */
    public @Nullable org.gtk.glib.TreeNode lookupNode(@Nullable java.lang.foreign.MemoryAddress key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_lookup_node.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the lower bound node corresponding to the given key,
     * or {@code null} if the tree is empty or all the nodes in the tree
     * have keys that are strictly lower than the searched key.
     * <p>
     * The lower bound is the first node that has its key greater
     * than or equal to the searched key.
     * @param key the key to calculate the lower bound for
     * @return the tree node corresponding to
     *          the lower bound, or {@code null} if the tree is empty or has only
     *          keys strictly lower than the searched key.
     */
    public @Nullable org.gtk.glib.TreeNode lowerBound(@Nullable java.lang.foreign.MemoryAddress key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_lower_bound.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the number of nodes in a {@link Tree}.
     * @return the number of nodes in {@code tree}
     */
    public int nnodes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tree_nnodes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the first in-order node of the tree, or {@code null}
     * for an empty tree.
     * @return the first node in the tree
     */
    public @Nullable org.gtk.glib.TreeNode nodeFirst() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_node_first.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the last in-order node of the tree, or {@code null}
     * for an empty tree.
     * @return the last node in the tree
     */
    public @Nullable org.gtk.glib.TreeNode nodeLast() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_node_last.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Increments the reference count of {@code tree} by one.
     * <p>
     * It is safe to call this function from any thread.
     * @return the passed in {@link Tree}
     */
    public org.gtk.glib.Tree ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Tree.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
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
     * @param key the key to remove
     * @return {@code true} if the key was found (prior to 2.8, this function
     *     returned nothing)
     */
    public boolean remove(@Nullable java.lang.foreign.MemoryAddress key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tree_remove.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes all nodes from a {@link Tree} and destroys their keys and values,
     * then resets the {@link Tree}???s root to {@code null}.
     */
    public void removeAll() {
        try {
            DowncallHandles.g_tree_remove_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts a new key and value into a {@link Tree} as g_tree_replace_node() does,
     * only this function does not return the inserted or set node.
     * @param key the key to insert
     * @param value the value corresponding to the key
     */
    public void replace(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value) {
        try {
            DowncallHandles.g_tree_replace.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param key the key to insert
     * @param value the value corresponding to the key
     * @return the inserted (or set) node.
     */
    public org.gtk.glib.TreeNode replaceNode(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_replace_node.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
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
     * @param searchFunc a function used to search the {@link Tree}
     * @return the value corresponding to the found key, or {@code null}
     *     if the key was not found
     */
    public @Nullable java.lang.foreign.MemoryAddress search(org.gtk.glib.CompareFunc searchFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_search.invokeExact(
                    handle(),
                    (Addressable) searchFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param searchFunc a function used to search the {@link Tree}
     * @return the node corresponding to the
     *          found key, or {@code null} if the key was not found
     */
    public @Nullable org.gtk.glib.TreeNode searchNode(org.gtk.glib.CompareFunc searchFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_search_node.invokeExact(
                    handle(),
                    (Addressable) searchFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Removes a key and its associated value from a {@link Tree} without calling
     * the key and value destroy functions.
     * <p>
     * If the key does not exist in the {@link Tree}, the function does nothing.
     * @param key the key to remove
     * @return {@code true} if the key was found (prior to 2.8, this function
     *     returned nothing)
     */
    public boolean steal(@Nullable java.lang.foreign.MemoryAddress key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tree_steal.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calls the given function for each node in the {@link Tree}.
     * @param traverseFunc the function to call for each node visited. If this
     *   function returns {@code true}, the traversal is stopped.
     * @param traverseType the order in which nodes are visited, one of {@link TraverseType#IN_ORDER},
     *   {@link TraverseType#PRE_ORDER} and {@link TraverseType#POST_ORDER}
     * @deprecated The order of a balanced tree is somewhat arbitrary.
     *     If you just want to visit all nodes in sorted order, use
     *     g_tree_foreach() instead. If you really need to visit nodes in
     *     a different order, consider using an [n-ary tree][glib-N-ary-Trees].
     */
    @Deprecated
    public void traverse(org.gtk.glib.TraverseFunc traverseFunc, org.gtk.glib.TraverseType traverseType) {
        try {
            DowncallHandles.g_tree_traverse.invokeExact(
                    handle(),
                    (Addressable) traverseFunc.toCallback(),
                    traverseType.getValue(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
            DowncallHandles.g_tree_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the upper bound node corresponding to the given key,
     * or {@code null} if the tree is empty or all the nodes in the tree
     * have keys that are lower than or equal to the searched key.
     * <p>
     * The upper bound is the first node that has its key strictly greater
     * than the searched key.
     * @param key the key to calculate the upper bound for
     * @return the tree node corresponding to the
     *          upper bound, or {@code null} if the tree is empty or has only keys
     *          lower than or equal to the searched key.
     */
    public @Nullable org.gtk.glib.TreeNode upperBound(@Nullable java.lang.foreign.MemoryAddress key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_upper_bound.invokeExact(
                    handle(),
                    (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tree_new = Interop.downcallHandle(
                "g_tree_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_new_full = Interop.downcallHandle(
                "g_tree_new_full",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_new_with_data = Interop.downcallHandle(
                "g_tree_new_with_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_destroy = Interop.downcallHandle(
                "g_tree_destroy",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_foreach = Interop.downcallHandle(
                "g_tree_foreach",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_foreach_node = Interop.downcallHandle(
                "g_tree_foreach_node",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_height = Interop.downcallHandle(
                "g_tree_height",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_insert = Interop.downcallHandle(
                "g_tree_insert",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_insert_node = Interop.downcallHandle(
                "g_tree_insert_node",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_lookup = Interop.downcallHandle(
                "g_tree_lookup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_lookup_extended = Interop.downcallHandle(
                "g_tree_lookup_extended",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_lookup_node = Interop.downcallHandle(
                "g_tree_lookup_node",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_lower_bound = Interop.downcallHandle(
                "g_tree_lower_bound",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_nnodes = Interop.downcallHandle(
                "g_tree_nnodes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_node_first = Interop.downcallHandle(
                "g_tree_node_first",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_node_last = Interop.downcallHandle(
                "g_tree_node_last",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_ref = Interop.downcallHandle(
                "g_tree_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_remove = Interop.downcallHandle(
                "g_tree_remove",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_remove_all = Interop.downcallHandle(
                "g_tree_remove_all",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_replace = Interop.downcallHandle(
                "g_tree_replace",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_replace_node = Interop.downcallHandle(
                "g_tree_replace_node",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_search = Interop.downcallHandle(
                "g_tree_search",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_search_node = Interop.downcallHandle(
                "g_tree_search_node",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_steal = Interop.downcallHandle(
                "g_tree_steal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_traverse = Interop.downcallHandle(
                "g_tree_traverse",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_unref = Interop.downcallHandle(
                "g_tree_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_upper_bound = Interop.downcallHandle(
                "g_tree_upper_bound",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
}

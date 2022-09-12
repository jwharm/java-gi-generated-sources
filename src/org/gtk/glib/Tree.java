package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GTree struct is an opaque data structure representing a
 * [balanced binary tree][glib-Balanced-Binary-Trees]. It should be
 * accessed only by using the following functions.
 */
public class Tree extends io.github.jwharm.javagi.ResourceBase {

    public Tree(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNewFull(CompareDataFunc keyCompareFunc) {
        try {
            Reference RESULT = References.get(gtk_h.g_tree_new_full(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(keyCompareFunc.hashCode(), keyCompareFunc)), 
                    Interop.cbDestroyNotifySymbol(), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new #GTree like g_tree_new() and allows to specify functions
     * to free the memory allocated for the key and value that get called when
     * removing the entry from the #GTree.
     */
    public static Tree newFull(CompareDataFunc keyCompareFunc) {
        return new Tree(constructNewFull(keyCompareFunc));
    }
    
    private static Reference constructNewWithData(CompareDataFunc keyCompareFunc) {
        try {
            Reference RESULT = References.get(gtk_h.g_tree_new_with_data(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(keyCompareFunc.hashCode(), keyCompareFunc))), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new #GTree with a comparison function that accepts user data.
     * See g_tree_new() for more details.
     */
    public static Tree newWithData(CompareDataFunc keyCompareFunc) {
        return new Tree(constructNewWithData(keyCompareFunc));
    }
    
    /**
     * Removes all keys and values from the #GTree and decreases its
     * reference count by one. If keys and/or values are dynamically
     * allocated, you should either free them first or create the #GTree
     * using g_tree_new_full(). In the latter case the destroy functions
     * you supplied will be called on all keys and values before destroying
     * the #GTree.
     */
    public void destroy() {
        gtk_h.g_tree_destroy(handle());
    }
    
    /**
     * Calls the given function for each of the key/value pairs in the #GTree.
     * The function is passed the key and value of each pair, and the given
     * @data parameter. The tree is traversed in sorted order.
     * 
     * The tree may not be modified while iterating over it (you can't
     * add/remove items). To remove all items matching a predicate, you need
     * to add each item to a list in your #GTraverseFunc as you walk over
     * the tree, then walk the list and remove each item.
     */
    public void foreach(TraverseFunc func) {
        try {
            gtk_h.g_tree_foreach(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTraverseFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls the given function for each of the nodes in the #GTree.
     * The function is passed the pointer to the particular node, and the given
     * @data parameter. The tree traversal happens in-order.
     * 
     * The tree may not be modified while iterating over it (you can't
     * add/remove items). To remove all items matching a predicate, you need
     * to add each item to a list in your #GTraverseFunc as you walk over
     * the tree, then walk the list and remove each item.
     */
    public void foreachNode(TraverseNodeFunc func) {
        try {
            gtk_h.g_tree_foreach_node(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTraverseNodeFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the height of a #GTree.
     * 
     * If the #GTree contains no nodes, the height is 0.
     * If the #GTree contains only one root node the height is 1.
     * If the root node has children the height is 2, etc.
     */
    public int height() {
        var RESULT = gtk_h.g_tree_height(handle());
        return RESULT;
    }
    
    /**
     * Inserts a key/value pair into a #GTree.
     * 
     * Inserts a new key and value into a #GTree as g_tree_insert_node() does,
     * only this function does not return the inserted or set node.
     */
    public void insert(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        gtk_h.g_tree_insert(handle(), key, value);
    }
    
    /**
     * Inserts a key/value pair into a #GTree.
     * 
     * If the given key already exists in the #GTree its corresponding value
     * is set to the new value. If you supplied a @value_destroy_func when
     * creating the #GTree, the old value is freed using that function. If
     * you supplied a @key_destroy_func when creating the #GTree, the passed
     * key is freed using that function.
     * 
     * The tree is automatically 'balanced' as new key/value pairs are added,
     * so that the distance from the root to every leaf is as small as possible.
     * The cost of maintaining a balanced tree while inserting new key/value
     * result in a O(n log(n)) operation where most of the other operations
     * are O(log(n)).
     */
    public TreeNode insertNode(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_tree_insert_node(handle(), key, value);
        return new TreeNode(References.get(RESULT, false));
    }
    
    /**
     * Gets the value corresponding to the given key. Since a #GTree is
     * automatically balanced as key/value pairs are added, key lookup
     * is O(log n) (where n is the number of key/value pairs in the tree).
     */
    public jdk.incubator.foreign.MemoryAddress lookup(jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_tree_lookup(handle(), key);
        return RESULT;
    }
    
    /**
     * Looks up a key in the #GTree, returning the original key and the
     * associated value. This is useful if you need to free the memory
     * allocated for the original key, for example before calling
     * g_tree_remove().
     */
    public boolean lookupExtended(jdk.incubator.foreign.MemoryAddress lookupKey, jdk.incubator.foreign.MemoryAddress origKey, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_tree_lookup_extended(handle(), lookupKey, origKey, value);
        return (RESULT != 0);
    }
    
    /**
     * Gets the tree node corresponding to the given key. Since a #GTree is
     * automatically balanced as key/value pairs are added, key lookup
     * is O(log n) (where n is the number of key/value pairs in the tree).
     */
    public TreeNode lookupNode(jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_tree_lookup_node(handle(), key);
        return new TreeNode(References.get(RESULT, false));
    }
    
    /**
     * Gets the lower bound node corresponding to the given key,
     * or %NULL if the tree is empty or all the nodes in the tree
     * have keys that are strictly lower than the searched key.
     * 
     * The lower bound is the first node that has its key greater
     * than or equal to the searched key.
     */
    public TreeNode lowerBound(jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_tree_lower_bound(handle(), key);
        return new TreeNode(References.get(RESULT, false));
    }
    
    /**
     * Gets the number of nodes in a #GTree.
     */
    public int nnodes() {
        var RESULT = gtk_h.g_tree_nnodes(handle());
        return RESULT;
    }
    
    /**
     * Returns the first in-order node of the tree, or %NULL
     * for an empty tree.
     */
    public TreeNode nodeFirst() {
        var RESULT = gtk_h.g_tree_node_first(handle());
        return new TreeNode(References.get(RESULT, false));
    }
    
    /**
     * Returns the last in-order node of the tree, or %NULL
     * for an empty tree.
     */
    public TreeNode nodeLast() {
        var RESULT = gtk_h.g_tree_node_last(handle());
        return new TreeNode(References.get(RESULT, false));
    }
    
    /**
     * Increments the reference count of @tree by one.
     * 
     * It is safe to call this function from any thread.
     */
    public Tree ref() {
        var RESULT = gtk_h.g_tree_ref(handle());
        return new Tree(References.get(RESULT, true));
    }
    
    /**
     * Removes a key/value pair from a #GTree.
     * 
     * If the #GTree was created using g_tree_new_full(), the key and value
     * are freed using the supplied destroy functions, otherwise you have to
     * make sure that any dynamically allocated values are freed yourself.
     * If the key does not exist in the #GTree, the function does nothing.
     * 
     * The cost of maintaining a balanced tree while removing a key/value
     * result in a O(n log(n)) operation where most of the other operations
     * are O(log(n)).
     */
    public boolean remove(jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_tree_remove(handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Removes all nodes from a #GTree and destroys their keys and values,
     * then resets the #GTree’s root to %NULL.
     */
    public void removeAll() {
        gtk_h.g_tree_remove_all(handle());
    }
    
    /**
     * Inserts a new key and value into a #GTree as g_tree_replace_node() does,
     * only this function does not return the inserted or set node.
     */
    public void replace(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        gtk_h.g_tree_replace(handle(), key, value);
    }
    
    /**
     * Inserts a new key and value into a #GTree similar to g_tree_insert_node().
     * The difference is that if the key already exists in the #GTree, it gets
     * replaced by the new key. If you supplied a @value_destroy_func when
     * creating the #GTree, the old value is freed using that function. If you
     * supplied a @key_destroy_func when creating the #GTree, the old key is
     * freed using that function.
     * 
     * The tree is automatically 'balanced' as new key/value pairs are added,
     * so that the distance from the root to every leaf is as small as possible.
     */
    public TreeNode replaceNode(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_tree_replace_node(handle(), key, value);
        return new TreeNode(References.get(RESULT, false));
    }
    
    /**
     * Searches a #GTree using @search_func.
     * 
     * The @search_func is called with a pointer to the key of a key/value
     * pair in the tree, and the passed in @user_data. If @search_func returns
     * 0 for a key/value pair, then the corresponding value is returned as
     * the result of g_tree_search(). If @search_func returns -1, searching
     * will proceed among the key/value pairs that have a smaller key; if
     * @search_func returns 1, searching will proceed among the key/value
     * pairs that have a larger key.
     */
    public jdk.incubator.foreign.MemoryAddress search(CompareFunc searchFunc) {
        try {
            var RESULT = gtk_h.g_tree_search(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(searchFunc.hashCode(), searchFunc)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Searches a #GTree using @search_func.
     * 
     * The @search_func is called with a pointer to the key of a key/value
     * pair in the tree, and the passed in @user_data. If @search_func returns
     * 0 for a key/value pair, then the corresponding node is returned as
     * the result of g_tree_search(). If @search_func returns -1, searching
     * will proceed among the key/value pairs that have a smaller key; if
     * @search_func returns 1, searching will proceed among the key/value
     * pairs that have a larger key.
     */
    public TreeNode searchNode(CompareFunc searchFunc) {
        try {
            var RESULT = gtk_h.g_tree_search_node(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(searchFunc.hashCode(), searchFunc)));
            return new TreeNode(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes a key and its associated value from a #GTree without calling
     * the key and value destroy functions.
     * 
     * If the key does not exist in the #GTree, the function does nothing.
     */
    public boolean steal(jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_tree_steal(handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Decrements the reference count of @tree by one.
     * If the reference count drops to 0, all keys and values will
     * be destroyed (if destroy functions were specified) and all
     * memory allocated by @tree will be released.
     * 
     * It is safe to call this function from any thread.
     */
    public void unref() {
        gtk_h.g_tree_unref(handle());
    }
    
    /**
     * Gets the upper bound node corresponding to the given key,
     * or %NULL if the tree is empty or all the nodes in the tree
     * have keys that are lower than or equal to the searched key.
     * 
     * The upper bound is the first node that has its key strictly greater
     * than the searched key.
     */
    public TreeNode upperBound(jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_tree_upper_bound(handle(), key);
        return new TreeNode(References.get(RESULT, false));
    }
    
}

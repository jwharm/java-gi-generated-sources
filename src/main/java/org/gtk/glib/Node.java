package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Node} struct represents one node in a [n-ary tree][glib-N-ary-Trees].
 */
public class Node extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNode";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.ADDRESS.withName("next"),
            Interop.valueLayout.ADDRESS.withName("prev"),
            Interop.valueLayout.ADDRESS.withName("parent"),
            Interop.valueLayout.ADDRESS.withName("children")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Node}
     * @return A new, uninitialized @{link Node}
     */
    public static Node allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Node newInstance = new Node(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress getData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
    }
    
    /**
     * Get the value of the field {@code next}
     * @return The value of the field {@code next}
     */
    public org.gtk.glib.Node getNext() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void setNext(org.gtk.glib.Node next) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next == null ? MemoryAddress.NULL : next.handle()));
    }
    
    /**
     * Get the value of the field {@code prev}
     * @return The value of the field {@code prev}
     */
    public org.gtk.glib.Node getPrev() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prev"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code prev}
     * @param prev The new value of the field {@code prev}
     */
    public void setPrev(org.gtk.glib.Node prev) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prev"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prev == null ? MemoryAddress.NULL : prev.handle()));
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.glib.Node getParent() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.glib.Node parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    /**
     * Get the value of the field {@code children}
     * @return The value of the field {@code children}
     */
    public org.gtk.glib.Node getChildren() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("children"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code children}
     * @param children The new value of the field {@code children}
     */
    public void setChildren(org.gtk.glib.Node children) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("children"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (children == null ? MemoryAddress.NULL : children.handle()));
    }
    
    /**
     * Create a Node proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Node(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Node> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Node(input, ownership);
    
    /**
     * Gets the position of the first child of a {@link Node}
     * which contains the given data.
     * @return the index of the child of {@code node} which contains
     *     {@code data}, or -1 if the data is not found
     */
    public int childIndex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_node_child_index.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the position of a {@link Node} with respect to its siblings.
     * {@code child} must be a child of {@code node}. The first child is numbered 0,
     * the second 1, and so on.
     * @param child a child of {@code node}
     * @return the position of {@code child} with respect to its siblings
     */
    public int childPosition(org.gtk.glib.Node child) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_node_child_position.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Calls a function for each of the children of a {@link Node}. Note that it
     * doesn't descend beneath the child nodes. {@code func} must not do anything
     * that would modify the structure of the tree.
     * @param flags which types of children are to be visited, one of
     *     {@link TraverseFlags#ALL}, {@link TraverseFlags#LEAVES} and {@link TraverseFlags#NON_LEAVES}
     * @param func the function to call for each visited node
     */
    public void childrenForeach(org.gtk.glib.TraverseFlags flags, org.gtk.glib.NodeForeachFunc func) {
        try {
            DowncallHandles.g_node_children_foreach.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Recursively copies a {@link Node} (but does not deep-copy the data inside the
     * nodes, see g_node_copy_deep() if you need that).
     * @return a new {@link Node} containing the same data pointers
     */
    public org.gtk.glib.Node copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Recursively copies a {@link Node} and its data.
     * @param copyFunc the function which is called to copy the data inside each node,
     *   or {@code null} to use the original data.
     * @return a new {@link Node} containing copies of the data in {@code node}.
     */
    public org.gtk.glib.Node copyDeep(org.gtk.glib.CopyFunc copyFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_copy_deep.invokeExact(
                    handle(),
                    (Addressable) copyFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the depth of a {@link Node}.
     * <p>
     * If {@code node} is {@code null} the depth is 0. The root node has a depth of 1.
     * For the children of the root node the depth is 2. And so on.
     * @return the depth of the {@link Node}
     */
    public int depth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_node_depth.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes {@code root} and its children from the tree, freeing any memory
     * allocated.
     */
    public void destroy() {
        try {
            DowncallHandles.g_node_destroy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finds a {@link Node} in a tree.
     * @param order the order in which nodes are visited - {@link TraverseType#IN_ORDER},
     *     {@link TraverseType#PRE_ORDER}, {@link TraverseType#POST_ORDER}, or {@link TraverseType#LEVEL_ORDER}
     * @param flags which types of children are to be searched, one of
     *     {@link TraverseFlags#ALL}, {@link TraverseFlags#LEAVES} and {@link TraverseFlags#NON_LEAVES}
     * @return the found {@link Node}, or {@code null} if the data is not found
     */
    public org.gtk.glib.Node find(org.gtk.glib.TraverseType order, org.gtk.glib.TraverseFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_find.invokeExact(
                    handle(),
                    order.getValue(),
                    flags.getValue(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Finds the first child of a {@link Node} with the given data.
     * @param flags which types of children are to be searched, one of
     *     {@link TraverseFlags#ALL}, {@link TraverseFlags#LEAVES} and {@link TraverseFlags#NON_LEAVES}
     * @return the found child {@link Node}, or {@code null} if the data is not found
     */
    public org.gtk.glib.Node findChild(org.gtk.glib.TraverseFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_find_child.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the first sibling of a {@link Node}.
     * This could possibly be the node itself.
     * @return the first sibling of {@code node}
     */
    public org.gtk.glib.Node firstSibling() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_first_sibling.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the root of a tree.
     * @return the root of the tree
     */
    public org.gtk.glib.Node getRoot() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_get_root.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts a {@link Node} beneath the parent at the given position.
     * @param position the position to place {@code node} at, with respect to its siblings
     *     If position is -1, {@code node} is inserted as the last child of {@code parent}
     * @param node the {@link Node} to insert
     * @return the inserted {@link Node}
     */
    public org.gtk.glib.Node insert(int position, org.gtk.glib.Node node) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_insert.invokeExact(
                    handle(),
                    position,
                    node.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts a {@link Node} beneath the parent after the given sibling.
     * @param sibling the sibling {@link Node} to place {@code node} after.
     *     If sibling is {@code null}, the node is inserted as the first child of {@code parent}.
     * @param node the {@link Node} to insert
     * @return the inserted {@link Node}
     */
    public org.gtk.glib.Node insertAfter(org.gtk.glib.Node sibling, org.gtk.glib.Node node) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_insert_after.invokeExact(
                    handle(),
                    sibling.handle(),
                    node.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts a {@link Node} beneath the parent before the given sibling.
     * @param sibling the sibling {@link Node} to place {@code node} before.
     *     If sibling is {@code null}, the node is inserted as the last child of {@code parent}.
     * @param node the {@link Node} to insert
     * @return the inserted {@link Node}
     */
    public org.gtk.glib.Node insertBefore(org.gtk.glib.Node sibling, org.gtk.glib.Node node) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_insert_before.invokeExact(
                    handle(),
                    sibling.handle(),
                    node.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Returns {@code true} if {@code node} is an ancestor of {@code descendant}.
     * This is true if node is the parent of {@code descendant},
     * or if node is the grandparent of {@code descendant} etc.
     * @param descendant a {@link Node}
     * @return {@code true} if {@code node} is an ancestor of {@code descendant}
     */
    public boolean isAncestor(org.gtk.glib.Node descendant) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_node_is_ancestor.invokeExact(
                    handle(),
                    descendant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the last child of a {@link Node}.
     * @return the last child of {@code node}, or {@code null} if {@code node} has no children
     */
    public org.gtk.glib.Node lastChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_last_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the last sibling of a {@link Node}.
     * This could possibly be the node itself.
     * @return the last sibling of {@code node}
     */
    public org.gtk.glib.Node lastSibling() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_last_sibling.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the maximum height of all branches beneath a {@link Node}.
     * This is the maximum distance from the {@link Node} to all leaf nodes.
     * <p>
     * If {@code root} is {@code null}, 0 is returned. If {@code root} has no children,
     * 1 is returned. If {@code root} has children, 2 is returned. And so on.
     * @return the maximum height of the tree beneath {@code root}
     */
    public int maxHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_node_max_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the number of children of a {@link Node}.
     * @return the number of children of {@code node}
     */
    public int nChildren() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_node_n_children.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the number of nodes in a tree.
     * @param flags which types of children are to be counted, one of
     *     {@link TraverseFlags#ALL}, {@link TraverseFlags#LEAVES} and {@link TraverseFlags#NON_LEAVES}
     * @return the number of nodes in the tree
     */
    public int nNodes(org.gtk.glib.TraverseFlags flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_node_n_nodes.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets a child of a {@link Node}, using the given index.
     * The first child is at index 0. If the index is
     * too big, {@code null} is returned.
     * @param n the index of the desired child
     * @return the child of {@code node} at index {@code n}
     */
    public org.gtk.glib.Node nthChild(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_nth_child.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts a {@link Node} as the first child of the given parent.
     * @param node the {@link Node} to insert
     * @return the inserted {@link Node}
     */
    public org.gtk.glib.Node prepend(org.gtk.glib.Node node) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_prepend.invokeExact(
                    handle(),
                    node.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Reverses the order of the children of a {@link Node}.
     * (It doesn't change the order of the grandchildren.)
     */
    public void reverseChildren() {
        try {
            DowncallHandles.g_node_reverse_children.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Traverses a tree starting at the given root {@link Node}.
     * It calls the given function for each node visited.
     * The traversal can be halted at any point by returning {@code true} from {@code func}.
     * {@code func} must not do anything that would modify the structure of the tree.
     * @param order the order in which nodes are visited - {@link TraverseType#IN_ORDER},
     *     {@link TraverseType#PRE_ORDER}, {@link TraverseType#POST_ORDER}, or {@link TraverseType#LEVEL_ORDER}.
     * @param flags which types of children are to be visited, one of
     *     {@link TraverseFlags#ALL}, {@link TraverseFlags#LEAVES} and {@link TraverseFlags#NON_LEAVES}
     * @param maxDepth the maximum depth of the traversal. Nodes below this
     *     depth will not be visited. If max_depth is -1 all nodes in
     *     the tree are visited. If depth is 1, only the root is visited.
     *     If depth is 2, the root and its children are visited. And so on.
     * @param func the function to call for each visited {@link Node}
     */
    public void traverse(org.gtk.glib.TraverseType order, org.gtk.glib.TraverseFlags flags, int maxDepth, org.gtk.glib.NodeTraverseFunc func) {
        try {
            DowncallHandles.g_node_traverse.invokeExact(
                    handle(),
                    order.getValue(),
                    flags.getValue(),
                    maxDepth,
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unlinks a {@link Node} from a tree, resulting in two separate trees.
     */
    public void unlink() {
        try {
            DowncallHandles.g_node_unlink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Node} containing the given data.
     * Used to create the first node in a tree.
     * @return a new {@link Node}
     */
    public static org.gtk.glib.Node new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_node_new.invokeExact(
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Node.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_node_child_index = Interop.downcallHandle(
            "g_node_child_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_child_position = Interop.downcallHandle(
            "g_node_child_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_children_foreach = Interop.downcallHandle(
            "g_node_children_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_copy = Interop.downcallHandle(
            "g_node_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_copy_deep = Interop.downcallHandle(
            "g_node_copy_deep",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_depth = Interop.downcallHandle(
            "g_node_depth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_destroy = Interop.downcallHandle(
            "g_node_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_find = Interop.downcallHandle(
            "g_node_find",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_find_child = Interop.downcallHandle(
            "g_node_find_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_first_sibling = Interop.downcallHandle(
            "g_node_first_sibling",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_get_root = Interop.downcallHandle(
            "g_node_get_root",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_insert = Interop.downcallHandle(
            "g_node_insert",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_insert_after = Interop.downcallHandle(
            "g_node_insert_after",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_insert_before = Interop.downcallHandle(
            "g_node_insert_before",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_is_ancestor = Interop.downcallHandle(
            "g_node_is_ancestor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_last_child = Interop.downcallHandle(
            "g_node_last_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_last_sibling = Interop.downcallHandle(
            "g_node_last_sibling",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_max_height = Interop.downcallHandle(
            "g_node_max_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_n_children = Interop.downcallHandle(
            "g_node_n_children",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_n_nodes = Interop.downcallHandle(
            "g_node_n_nodes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_node_nth_child = Interop.downcallHandle(
            "g_node_nth_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_node_prepend = Interop.downcallHandle(
            "g_node_prepend",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_reverse_children = Interop.downcallHandle(
            "g_node_reverse_children",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_traverse = Interop.downcallHandle(
            "g_node_traverse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_unlink = Interop.downcallHandle(
            "g_node_unlink",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_node_new = Interop.downcallHandle(
            "g_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Node.Builder} object constructs a {@link Node} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Node.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Node struct;
        
        private Builder() {
            struct = Node.allocate();
        }
        
         /**
         * Finish building the {@link Node} struct.
         * @return A new instance of {@code Node} with the fields 
         *         that were set in the Builder object.
         */
        public Node build() {
            return struct;
        }
        
        /**
         * contains the actual data of the node.
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
            return this;
        }
        
        /**
         * points to the node's next sibling (a sibling is another
         *        {@link Node} with the same parent).
         * @param next The value for the {@code next} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNext(org.gtk.glib.Node next) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next == null ? MemoryAddress.NULL : next.handle()));
            return this;
        }
        
        /**
         * points to the node's previous sibling.
         * @param prev The value for the {@code prev} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrev(org.gtk.glib.Node prev) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prev"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prev == null ? MemoryAddress.NULL : prev.handle()));
            return this;
        }
        
        /**
         * points to the parent of the {@link Node}, or is {@code null} if the
         *          {@link Node} is the root of the tree.
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gtk.glib.Node parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * points to the first child of the {@link Node}.  The other
         *            children are accessed by using the {@code next} pointer of each
         *            child.
         * @param children The value for the {@code children} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChildren(org.gtk.glib.Node children) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (children == null ? MemoryAddress.NULL : children.handle()));
            return this;
        }
    }
}

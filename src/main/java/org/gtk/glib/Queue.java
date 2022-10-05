package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a
 * [Queue][glib-Double-ended-Queues].
 */
public class Queue extends io.github.jwharm.javagi.ResourceBase {

    public Queue(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_queue_clear = Interop.downcallHandle(
        "g_queue_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all the elements in {@code queue}. If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     */
    public void clear() {
        try {
            g_queue_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_copy = Interop.downcallHandle(
        "g_queue_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code queue}. Note that is a shallow copy. If the elements in the
     * queue consist of pointers to data, the pointers are copied, but the
     * actual data is not.
     */
    public Queue copy() {
        try {
            var RESULT = (MemoryAddress) g_queue_copy.invokeExact(handle());
            return new Queue(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_delete_link = Interop.downcallHandle(
        "g_queue_delete_link",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code link_} from {@code queue} and frees it.
     * <p>
     * {@code link_} must be part of {@code queue}.
     */
    public void deleteLink(org.gtk.glib.List link) {
        try {
            g_queue_delete_link.invokeExact(handle(), link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_find = Interop.downcallHandle(
        "g_queue_find",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the first link in {@code queue} which contains {@code data}.
     */
    public org.gtk.glib.List find(java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_queue_find.invokeExact(handle(), data);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_find_custom = Interop.downcallHandle(
        "g_queue_find_custom",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds an element in a {@link Queue}, using a supplied function to find the
     * desired element. It iterates over the queue, calling the given function
     * which should return 0 when the desired element is found. The function
     * takes two gconstpointer arguments, the {@link Queue} element's data as the
     * first argument and the given user data as the second argument.
     */
    public org.gtk.glib.List findCustom(CompareFunc func) {
        try {
            var RESULT = (MemoryAddress) g_queue_find_custom.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_foreach = Interop.downcallHandle(
        "g_queue_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code func} for each element in the queue passing {@code user_data} to the
     * function.
     * <p>
     * It is safe for {@code func} to remove the element from {@code queue}, but it must
     * not modify any part of the queue after that element.
     */
    public void foreach(Func func) {
        try {
            g_queue_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_free = Interop.downcallHandle(
        "g_queue_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the memory allocated for the {@link Queue}. Only call this function
     * if {@code queue} was created with g_queue_new(). If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     * <p>
     * If queue elements contain dynamically-allocated memory, you should
     * either use g_queue_free_full() or free them manually first.
     */
    public void free() {
        try {
            g_queue_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_get_length = Interop.downcallHandle(
        "g_queue_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of items in {@code queue}.
     */
    public int getLength() {
        try {
            var RESULT = (int) g_queue_get_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_index = Interop.downcallHandle(
        "g_queue_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the position of the first element in {@code queue} which contains {@code data}.
     */
    public int index(java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (int) g_queue_index.invokeExact(handle(), data);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_init = Interop.downcallHandle(
        "g_queue_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * A statically-allocated {@link Queue} must be initialized with this function
     * before it can be used. Alternatively you can initialize it with
     * {@code G_QUEUE_INIT}. It is not necessary to initialize queues created with
     * g_queue_new().
     */
    public void init() {
        try {
            g_queue_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_insert_after = Interop.downcallHandle(
        "g_queue_insert_after",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code data} into {@code queue} after {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}. Since GLib 2.44 a {@code null} sibling pushes the
     * data at the head of the queue.
     */
    public void insertAfter(org.gtk.glib.List sibling, java.lang.foreign.MemoryAddress data) {
        try {
            g_queue_insert_after.invokeExact(handle(), sibling.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_insert_after_link = Interop.downcallHandle(
        "g_queue_insert_after_link",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code link_} into {@code queue} after {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}.
     */
    public void insertAfterLink(org.gtk.glib.List sibling, org.gtk.glib.List link) {
        try {
            g_queue_insert_after_link.invokeExact(handle(), sibling.handle(), link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_insert_before = Interop.downcallHandle(
        "g_queue_insert_before",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code data} into {@code queue} before {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}. Since GLib 2.44 a {@code null} sibling pushes the
     * data at the tail of the queue.
     */
    public void insertBefore(org.gtk.glib.List sibling, java.lang.foreign.MemoryAddress data) {
        try {
            g_queue_insert_before.invokeExact(handle(), sibling.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_insert_before_link = Interop.downcallHandle(
        "g_queue_insert_before_link",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code link_} into {@code queue} before {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}.
     */
    public void insertBeforeLink(org.gtk.glib.List sibling, org.gtk.glib.List link) {
        try {
            g_queue_insert_before_link.invokeExact(handle(), sibling.handle(), link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_insert_sorted = Interop.downcallHandle(
        "g_queue_insert_sorted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code data} into {@code queue} using {@code func} to determine the new position.
     */
    public void insertSorted(CompareDataFunc func) {
        try {
            g_queue_insert_sorted.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_is_empty = Interop.downcallHandle(
        "g_queue_is_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the queue is empty.
     */
    public boolean isEmpty() {
        try {
            var RESULT = (int) g_queue_is_empty.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_link_index = Interop.downcallHandle(
        "g_queue_link_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the position of {@code link_} in {@code queue}.
     */
    public int linkIndex(org.gtk.glib.List link) {
        try {
            var RESULT = (int) g_queue_link_index.invokeExact(handle(), link.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_peek_head = Interop.downcallHandle(
        "g_queue_peek_head",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the first element of the queue.
     */
    public java.lang.foreign.MemoryAddress peekHead() {
        try {
            var RESULT = (MemoryAddress) g_queue_peek_head.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_peek_head_link = Interop.downcallHandle(
        "g_queue_peek_head_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the first link in {@code queue}.
     */
    public org.gtk.glib.List peekHeadLink() {
        try {
            var RESULT = (MemoryAddress) g_queue_peek_head_link.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_peek_nth = Interop.downcallHandle(
        "g_queue_peek_nth",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the @n'th element of {@code queue}.
     */
    public java.lang.foreign.MemoryAddress peekNth(int n) {
        try {
            var RESULT = (MemoryAddress) g_queue_peek_nth.invokeExact(handle(), n);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_peek_nth_link = Interop.downcallHandle(
        "g_queue_peek_nth_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the link at the given position
     */
    public org.gtk.glib.List peekNthLink(int n) {
        try {
            var RESULT = (MemoryAddress) g_queue_peek_nth_link.invokeExact(handle(), n);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_peek_tail = Interop.downcallHandle(
        "g_queue_peek_tail",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the last element of the queue.
     */
    public java.lang.foreign.MemoryAddress peekTail() {
        try {
            var RESULT = (MemoryAddress) g_queue_peek_tail.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_peek_tail_link = Interop.downcallHandle(
        "g_queue_peek_tail_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the last link in {@code queue}.
     */
    public org.gtk.glib.List peekTailLink() {
        try {
            var RESULT = (MemoryAddress) g_queue_peek_tail_link.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_pop_head = Interop.downcallHandle(
        "g_queue_pop_head",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the first element of the queue and returns its data.
     */
    public java.lang.foreign.MemoryAddress popHead() {
        try {
            var RESULT = (MemoryAddress) g_queue_pop_head.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_pop_head_link = Interop.downcallHandle(
        "g_queue_pop_head_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes and returns the first element of the queue.
     */
    public org.gtk.glib.List popHeadLink() {
        try {
            var RESULT = (MemoryAddress) g_queue_pop_head_link.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_pop_nth = Interop.downcallHandle(
        "g_queue_pop_nth",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the @n'th element of {@code queue} and returns its data.
     */
    public java.lang.foreign.MemoryAddress popNth(int n) {
        try {
            var RESULT = (MemoryAddress) g_queue_pop_nth.invokeExact(handle(), n);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_pop_nth_link = Interop.downcallHandle(
        "g_queue_pop_nth_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes and returns the link at the given position.
     */
    public org.gtk.glib.List popNthLink(int n) {
        try {
            var RESULT = (MemoryAddress) g_queue_pop_nth_link.invokeExact(handle(), n);
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_pop_tail = Interop.downcallHandle(
        "g_queue_pop_tail",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the last element of the queue and returns its data.
     */
    public java.lang.foreign.MemoryAddress popTail() {
        try {
            var RESULT = (MemoryAddress) g_queue_pop_tail.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_pop_tail_link = Interop.downcallHandle(
        "g_queue_pop_tail_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes and returns the last element of the queue.
     */
    public org.gtk.glib.List popTailLink() {
        try {
            var RESULT = (MemoryAddress) g_queue_pop_tail_link.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_push_head = Interop.downcallHandle(
        "g_queue_push_head",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new element at the head of the queue.
     */
    public void pushHead(java.lang.foreign.MemoryAddress data) {
        try {
            g_queue_push_head.invokeExact(handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_push_head_link = Interop.downcallHandle(
        "g_queue_push_head_link",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new element at the head of the queue.
     */
    public void pushHeadLink(org.gtk.glib.List link) {
        try {
            g_queue_push_head_link.invokeExact(handle(), link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_push_nth = Interop.downcallHandle(
        "g_queue_push_nth",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts a new element into {@code queue} at the given position.
     */
    public void pushNth(java.lang.foreign.MemoryAddress data, int n) {
        try {
            g_queue_push_nth.invokeExact(handle(), data, n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_push_nth_link = Interop.downcallHandle(
        "g_queue_push_nth_link",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code link} into {@code queue} at the given position.
     */
    public void pushNthLink(int n, org.gtk.glib.List link) {
        try {
            g_queue_push_nth_link.invokeExact(handle(), n, link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_push_tail = Interop.downcallHandle(
        "g_queue_push_tail",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new element at the tail of the queue.
     */
    public void pushTail(java.lang.foreign.MemoryAddress data) {
        try {
            g_queue_push_tail.invokeExact(handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_push_tail_link = Interop.downcallHandle(
        "g_queue_push_tail_link",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new element at the tail of the queue.
     */
    public void pushTailLink(org.gtk.glib.List link) {
        try {
            g_queue_push_tail_link.invokeExact(handle(), link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_remove = Interop.downcallHandle(
        "g_queue_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the first element in {@code queue} that contains {@code data}.
     */
    public boolean remove(java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (int) g_queue_remove.invokeExact(handle(), data);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_remove_all = Interop.downcallHandle(
        "g_queue_remove_all",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Remove all elements whose data equals {@code data} from {@code queue}.
     */
    public int removeAll(java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (int) g_queue_remove_all.invokeExact(handle(), data);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_reverse = Interop.downcallHandle(
        "g_queue_reverse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reverses the order of the items in {@code queue}.
     */
    public void reverse() {
        try {
            g_queue_reverse.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_sort = Interop.downcallHandle(
        "g_queue_sort",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sorts {@code queue} using {@code compare_func}.
     */
    public void sort(CompareDataFunc compareFunc) {
        try {
            g_queue_sort.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_unlink = Interop.downcallHandle(
        "g_queue_unlink",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unlinks {@code link_} so that it will no longer be part of {@code queue}.
     * The link is not freed.
     * <p>
     * {@code link_} must be part of {@code queue}.
     */
    public void unlink(org.gtk.glib.List link) {
        try {
            g_queue_unlink.invokeExact(handle(), link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_queue_new = Interop.downcallHandle(
        "g_queue_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link Queue}.
     */
    public static Queue new_() {
        try {
            var RESULT = (MemoryAddress) g_queue_new.invokeExact();
            return new Queue(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

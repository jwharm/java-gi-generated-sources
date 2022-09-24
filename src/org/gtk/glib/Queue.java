package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a
 * [Queue][glib-Double-ended-Queues].
 */
public class Queue extends io.github.jwharm.javagi.ResourceBase {

    public Queue(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Queue() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GQueue.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Removes all the elements in {@code queue}. If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     */
    public void clear() {
        gtk_h.g_queue_clear(handle());
    }
    
    /**
     * Copies a {@code queue}. Note that is a shallow copy. If the elements in the
     * queue consist of pointers to data, the pointers are copied, but the
     * actual data is not.
     */
    public Queue copy() {
        var RESULT = gtk_h.g_queue_copy(handle());
        return new Queue(References.get(RESULT, false));
    }
    
    /**
     * Removes {@code link_} from {@code queue} and frees it.
     * <p>
     * {@code link_} must be part of {@code queue}.
     */
    public void deleteLink(org.gtk.glib.List link) {
        gtk_h.g_queue_delete_link(handle(), link.handle());
    }
    
    /**
     * Finds the first link in {@code queue} which contains {@code data}.
     */
    public org.gtk.glib.List find(java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_queue_find(handle(), data);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Finds an element in a {@link Queue}, using a supplied function to find the
     * desired element. It iterates over the queue, calling the given function
     * which should return 0 when the desired element is found. The function
     * takes two gconstpointer arguments, the {@link Queue} element's data as the
     * first argument and the given user data as the second argument.
     */
    public org.gtk.glib.List findCustom(CompareFunc func) {
        try {
            var RESULT = gtk_h.g_queue_find_custom(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
            return new org.gtk.glib.List(References.get(RESULT, false));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls {@code func} for each element in the queue passing {@code user_data} to the
     * function.
     * <p>
     * It is safe for {@code func} to remove the element from {@code queue}, but it must
     * not modify any part of the queue after that element.
     */
    public void foreach(Func func) {
        try {
            gtk_h.g_queue_foreach(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Frees the memory allocated for the {@link Queue}. Only call this function
     * if {@code queue} was created with g_queue_new(). If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     * <p>
     * If queue elements contain dynamically-allocated memory, you should
     * either use g_queue_free_full() or free them manually first.
     */
    public void free() {
        gtk_h.g_queue_free(handle());
    }
    
    /**
     * Returns the number of items in {@code queue}.
     */
    public int getLength() {
        var RESULT = gtk_h.g_queue_get_length(handle());
        return RESULT;
    }
    
    /**
     * Returns the position of the first element in {@code queue} which contains {@code data}.
     */
    public int index(java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_queue_index(handle(), data);
        return RESULT;
    }
    
    /**
     * A statically-allocated {@link Queue} must be initialized with this function
     * before it can be used. Alternatively you can initialize it with
     * {@code G_QUEUE_INIT}. It is not necessary to initialize queues created with
     * g_queue_new().
     */
    public void init() {
        gtk_h.g_queue_init(handle());
    }
    
    /**
     * Inserts {@code data} into {@code queue} after {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}. Since GLib 2.44 a {@code null} sibling pushes the
     * data at the head of the queue.
     */
    public void insertAfter(org.gtk.glib.List sibling, java.lang.foreign.MemoryAddress data) {
        gtk_h.g_queue_insert_after(handle(), sibling.handle(), data);
    }
    
    /**
     * Inserts {@code link_} into {@code queue} after {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}.
     */
    public void insertAfterLink(org.gtk.glib.List sibling, org.gtk.glib.List link) {
        gtk_h.g_queue_insert_after_link(handle(), sibling.handle(), link.handle());
    }
    
    /**
     * Inserts {@code data} into {@code queue} before {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}. Since GLib 2.44 a {@code null} sibling pushes the
     * data at the tail of the queue.
     */
    public void insertBefore(org.gtk.glib.List sibling, java.lang.foreign.MemoryAddress data) {
        gtk_h.g_queue_insert_before(handle(), sibling.handle(), data);
    }
    
    /**
     * Inserts {@code link_} into {@code queue} before {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}.
     */
    public void insertBeforeLink(org.gtk.glib.List sibling, org.gtk.glib.List link) {
        gtk_h.g_queue_insert_before_link(handle(), sibling.handle(), link.handle());
    }
    
    /**
     * Inserts {@code data} into {@code queue} using {@code func} to determine the new position.
     */
    public void insertSorted(CompareDataFunc func) {
        try {
            gtk_h.g_queue_insert_sorted(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns {@code true} if the queue is empty.
     */
    public boolean isEmpty() {
        var RESULT = gtk_h.g_queue_is_empty(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the position of {@code link_} in {@code queue}.
     */
    public int linkIndex(org.gtk.glib.List link) {
        var RESULT = gtk_h.g_queue_link_index(handle(), link.handle());
        return RESULT;
    }
    
    /**
     * Returns the first element of the queue.
     */
    public java.lang.foreign.MemoryAddress peekHead() {
        var RESULT = gtk_h.g_queue_peek_head(handle());
        return RESULT;
    }
    
    /**
     * Returns the first link in {@code queue}.
     */
    public org.gtk.glib.List peekHeadLink() {
        var RESULT = gtk_h.g_queue_peek_head_link(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Returns the @n'th element of {@code queue}.
     */
    public java.lang.foreign.MemoryAddress peekNth(int n) {
        var RESULT = gtk_h.g_queue_peek_nth(handle(), n);
        return RESULT;
    }
    
    /**
     * Returns the link at the given position
     */
    public org.gtk.glib.List peekNthLink(int n) {
        var RESULT = gtk_h.g_queue_peek_nth_link(handle(), n);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Returns the last element of the queue.
     */
    public java.lang.foreign.MemoryAddress peekTail() {
        var RESULT = gtk_h.g_queue_peek_tail(handle());
        return RESULT;
    }
    
    /**
     * Returns the last link in {@code queue}.
     */
    public org.gtk.glib.List peekTailLink() {
        var RESULT = gtk_h.g_queue_peek_tail_link(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes the first element of the queue and returns its data.
     */
    public java.lang.foreign.MemoryAddress popHead() {
        var RESULT = gtk_h.g_queue_pop_head(handle());
        return RESULT;
    }
    
    /**
     * Removes and returns the first element of the queue.
     */
    public org.gtk.glib.List popHeadLink() {
        var RESULT = gtk_h.g_queue_pop_head_link(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes the @n'th element of {@code queue} and returns its data.
     */
    public java.lang.foreign.MemoryAddress popNth(int n) {
        var RESULT = gtk_h.g_queue_pop_nth(handle(), n);
        return RESULT;
    }
    
    /**
     * Removes and returns the link at the given position.
     */
    public org.gtk.glib.List popNthLink(int n) {
        var RESULT = gtk_h.g_queue_pop_nth_link(handle(), n);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes the last element of the queue and returns its data.
     */
    public java.lang.foreign.MemoryAddress popTail() {
        var RESULT = gtk_h.g_queue_pop_tail(handle());
        return RESULT;
    }
    
    /**
     * Removes and returns the last element of the queue.
     */
    public org.gtk.glib.List popTailLink() {
        var RESULT = gtk_h.g_queue_pop_tail_link(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Adds a new element at the head of the queue.
     */
    public void pushHead(java.lang.foreign.MemoryAddress data) {
        gtk_h.g_queue_push_head(handle(), data);
    }
    
    /**
     * Adds a new element at the head of the queue.
     */
    public void pushHeadLink(org.gtk.glib.List link) {
        gtk_h.g_queue_push_head_link(handle(), link.handle());
    }
    
    /**
     * Inserts a new element into {@code queue} at the given position.
     */
    public void pushNth(java.lang.foreign.MemoryAddress data, int n) {
        gtk_h.g_queue_push_nth(handle(), data, n);
    }
    
    /**
     * Inserts {@code link} into {@code queue} at the given position.
     */
    public void pushNthLink(int n, org.gtk.glib.List link) {
        gtk_h.g_queue_push_nth_link(handle(), n, link.handle());
    }
    
    /**
     * Adds a new element at the tail of the queue.
     */
    public void pushTail(java.lang.foreign.MemoryAddress data) {
        gtk_h.g_queue_push_tail(handle(), data);
    }
    
    /**
     * Adds a new element at the tail of the queue.
     */
    public void pushTailLink(org.gtk.glib.List link) {
        gtk_h.g_queue_push_tail_link(handle(), link.handle());
    }
    
    /**
     * Removes the first element in {@code queue} that contains {@code data}.
     */
    public boolean remove(java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_queue_remove(handle(), data);
        return (RESULT != 0);
    }
    
    /**
     * Remove all elements whose data equals {@code data} from {@code queue}.
     */
    public int removeAll(java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_queue_remove_all(handle(), data);
        return RESULT;
    }
    
    /**
     * Reverses the order of the items in {@code queue}.
     */
    public void reverse() {
        gtk_h.g_queue_reverse(handle());
    }
    
    /**
     * Sorts {@code queue} using {@code compare_func}.
     */
    public void sort(CompareDataFunc compareFunc) {
        try {
            gtk_h.g_queue_sort(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unlinks {@code link_} so that it will no longer be part of {@code queue}.
     * The link is not freed.
     * <p>
     * {@code link_} must be part of {@code queue}.
     */
    public void unlink(org.gtk.glib.List link) {
        gtk_h.g_queue_unlink(handle(), link.handle());
    }
    
    /**
     * Creates a new {@link Queue}.
     */
    public static Queue new_() {
        var RESULT = gtk_h.g_queue_new();
        return new Queue(References.get(RESULT, false));
    }
    
}

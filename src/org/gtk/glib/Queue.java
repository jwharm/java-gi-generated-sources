package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a
 * [Queue][glib-Double-ended-Queues].
 */
public class Queue extends io.github.jwharm.javagi.interop.ResourceBase {

    public Queue(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Removes all the elements in @queue. If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     */
    public void clear() {
        gtk_h.g_queue_clear(handle());
    }
    
    /**
     * Copies a @queue. Note that is a shallow copy. If the elements in the
     * queue consist of pointers to data, the pointers are copied, but the
     * actual data is not.
     */
    public Queue copy() {
        var RESULT = gtk_h.g_queue_copy(handle());
        return new Queue(References.get(RESULT, false));
    }
    
    /**
     * Removes @link_ from @queue and frees it.
     * 
     * @link_ must be part of @queue.
     */
    public void deleteLink(org.gtk.glib.List link) {
        gtk_h.g_queue_delete_link(handle(), link.handle());
    }
    
    /**
     * Finds the first link in @queue which contains @data.
     */
    public org.gtk.glib.List find(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_queue_find(handle(), data);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Finds an element in a #GQueue, using a supplied function to find the
     * desired element. It iterates over the queue, calling the given function
     * which should return 0 when the desired element is found. The function
     * takes two gconstpointer arguments, the #GQueue element's data as the
     * first argument and the given user data as the second argument.
     */
    /**
     * Calls @func for each element in the queue passing @user_data to the
     * function.
     * 
     * It is safe for @func to remove the element from @queue, but it must
     * not modify any part of the queue after that element.
     */
    public void foreach(Queue queue, Func func) {
        try {
            int hash = func.hashCode();
            Interop.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_queue_foreach(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Frees the memory allocated for the #GQueue. Only call this function
     * if @queue was created with g_queue_new(). If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     * 
     * If queue elements contain dynamically-allocated memory, you should
     * either use g_queue_free_full() or free them manually first.
     */
    public void free() {
        gtk_h.g_queue_free(handle());
    }
    
    /**
     * Returns the number of items in @queue.
     */
    public int getLength() {
        var RESULT = gtk_h.g_queue_get_length(handle());
        return RESULT;
    }
    
    /**
     * Returns the position of the first element in @queue which contains @data.
     */
    public int index(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_queue_index(handle(), data);
        return RESULT;
    }
    
    /**
     * A statically-allocated #GQueue must be initialized with this function
     * before it can be used. Alternatively you can initialize it with
     * %G_QUEUE_INIT. It is not necessary to initialize queues created with
     * g_queue_new().
     */
    public void init() {
        gtk_h.g_queue_init(handle());
    }
    
    /**
     * Inserts @data into @queue after @sibling.
     * 
     * @sibling must be part of @queue. Since GLib 2.44 a %NULL sibling pushes the
     * data at the head of the queue.
     */
    public void insertAfter(org.gtk.glib.List sibling, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_queue_insert_after(handle(), sibling.handle(), data);
    }
    
    /**
     * Inserts @link_ into @queue after @sibling.
     * 
     * @sibling must be part of @queue.
     */
    public void insertAfterLink(org.gtk.glib.List sibling, org.gtk.glib.List link) {
        gtk_h.g_queue_insert_after_link(handle(), sibling.handle(), link.handle());
    }
    
    /**
     * Inserts @data into @queue before @sibling.
     * 
     * @sibling must be part of @queue. Since GLib 2.44 a %NULL sibling pushes the
     * data at the tail of the queue.
     */
    public void insertBefore(org.gtk.glib.List sibling, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_queue_insert_before(handle(), sibling.handle(), data);
    }
    
    /**
     * Inserts @link_ into @queue before @sibling.
     * 
     * @sibling must be part of @queue.
     */
    public void insertBeforeLink(org.gtk.glib.List sibling, org.gtk.glib.List link) {
        gtk_h.g_queue_insert_before_link(handle(), sibling.handle(), link.handle());
    }
    
    /**
     * Inserts @data into @queue using @func to determine the new position.
     */
    public void insertSorted(Queue queue, CompareDataFunc func) {
        try {
            int hash = func.hashCode();
            Interop.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_queue_insert_sorted(handle(), intSegment, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns %TRUE if the queue is empty.
     */
    public boolean isEmpty() {
        var RESULT = gtk_h.g_queue_is_empty(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the position of @link_ in @queue.
     */
    public int linkIndex(org.gtk.glib.List link) {
        var RESULT = gtk_h.g_queue_link_index(handle(), link.handle());
        return RESULT;
    }
    
    /**
     * Returns the first element of the queue.
     */
    public jdk.incubator.foreign.MemoryAddress peekHead() {
        var RESULT = gtk_h.g_queue_peek_head(handle());
        return RESULT;
    }
    
    /**
     * Returns the first link in @queue.
     */
    public org.gtk.glib.List peekHeadLink() {
        var RESULT = gtk_h.g_queue_peek_head_link(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Returns the @n'th element of @queue.
     */
    public jdk.incubator.foreign.MemoryAddress peekNth(int n) {
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
    public jdk.incubator.foreign.MemoryAddress peekTail() {
        var RESULT = gtk_h.g_queue_peek_tail(handle());
        return RESULT;
    }
    
    /**
     * Returns the last link in @queue.
     */
    public org.gtk.glib.List peekTailLink() {
        var RESULT = gtk_h.g_queue_peek_tail_link(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes the first element of the queue and returns its data.
     */
    public jdk.incubator.foreign.MemoryAddress popHead() {
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
     * Removes the @n'th element of @queue and returns its data.
     */
    public jdk.incubator.foreign.MemoryAddress popNth(int n) {
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
    public jdk.incubator.foreign.MemoryAddress popTail() {
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
    public void pushHead(jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_queue_push_head(handle(), data);
    }
    
    /**
     * Adds a new element at the head of the queue.
     */
    public void pushHeadLink(org.gtk.glib.List link) {
        gtk_h.g_queue_push_head_link(handle(), link.handle());
    }
    
    /**
     * Inserts a new element into @queue at the given position.
     */
    public void pushNth(jdk.incubator.foreign.MemoryAddress data, int n) {
        gtk_h.g_queue_push_nth(handle(), data, n);
    }
    
    /**
     * Inserts @link into @queue at the given position.
     */
    public void pushNthLink(int n, org.gtk.glib.List link) {
        gtk_h.g_queue_push_nth_link(handle(), n, link.handle());
    }
    
    /**
     * Adds a new element at the tail of the queue.
     */
    public void pushTail(jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_queue_push_tail(handle(), data);
    }
    
    /**
     * Adds a new element at the tail of the queue.
     */
    public void pushTailLink(org.gtk.glib.List link) {
        gtk_h.g_queue_push_tail_link(handle(), link.handle());
    }
    
    /**
     * Removes the first element in @queue that contains @data.
     */
    public boolean remove(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_queue_remove(handle(), data);
        return (RESULT != 0);
    }
    
    /**
     * Remove all elements whose data equals @data from @queue.
     */
    public int removeAll(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_queue_remove_all(handle(), data);
        return RESULT;
    }
    
    /**
     * Reverses the order of the items in @queue.
     */
    public void reverse() {
        gtk_h.g_queue_reverse(handle());
    }
    
    /**
     * Sorts @queue using @compare_func.
     */
    public void sort(Queue queue, CompareDataFunc compareFunc) {
        try {
            int hash = compareFunc.hashCode();
            Interop.signalRegistry.put(hash, compareFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_queue_sort(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unlinks @link_ so that it will no longer be part of @queue.
     * The link is not freed.
     * 
     * @link_ must be part of @queue.
     */
    public void unlink(org.gtk.glib.List link) {
        gtk_h.g_queue_unlink(handle(), link.handle());
    }
    
    /**
     * Creates a new #GQueue.
     */
    public static Queue new_() {
        var RESULT = gtk_h.g_queue_new();
        return new Queue(References.get(RESULT, false));
    }
    
}

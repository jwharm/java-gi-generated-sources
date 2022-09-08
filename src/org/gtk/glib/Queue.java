package org.gtk.glib;

import org.gtk.gobject.*;
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_clear(HANDLE());
    }
    
    /**
     * Copies a @queue. Note that is a shallow copy. If the elements in the
     * queue consist of pointers to data, the pointers are copied, but the
     * actual data is not.
     */
    public Queue copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_copy(HANDLE());
        return new Queue(References.get(RESULT, false));
    }
    
    /**
     * Removes @link_ from @queue and frees it.
     * 
     * @link_ must be part of @queue.
     */
    public void deleteLink(org.gtk.glib.List link) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_delete_link(HANDLE(), link.HANDLE());
    }
    
    /**
     * Finds the first link in @queue which contains @data.
     */
    public org.gtk.glib.List find(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_find(HANDLE(), data);
        return new org.gtk.glib.List(References.get(RESULT, false));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_free(HANDLE());
    }
    
    /**
     * Returns the number of items in @queue.
     */
    public int getLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_get_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the position of the first element in @queue which contains @data.
     */
    public int index(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_index(HANDLE(), data);
        return RESULT;
    }
    
    /**
     * A statically-allocated #GQueue must be initialized with this function
     * before it can be used. Alternatively you can initialize it with
     * %G_QUEUE_INIT. It is not necessary to initialize queues created with
     * g_queue_new().
     */
    public void init() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_init(HANDLE());
    }
    
    /**
     * Inserts @data into @queue after @sibling.
     * 
     * @sibling must be part of @queue. Since GLib 2.44 a %NULL sibling pushes the
     * data at the head of the queue.
     */
    public void insertAfter(org.gtk.glib.List sibling, jdk.incubator.foreign.MemoryAddress data) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_insert_after(HANDLE(), sibling.HANDLE(), data);
    }
    
    /**
     * Inserts @link_ into @queue after @sibling.
     * 
     * @sibling must be part of @queue.
     */
    public void insertAfterLink(org.gtk.glib.List sibling, org.gtk.glib.List link) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_insert_after_link(HANDLE(), sibling.HANDLE(), link.HANDLE());
    }
    
    /**
     * Inserts @data into @queue before @sibling.
     * 
     * @sibling must be part of @queue. Since GLib 2.44 a %NULL sibling pushes the
     * data at the tail of the queue.
     */
    public void insertBefore(org.gtk.glib.List sibling, jdk.incubator.foreign.MemoryAddress data) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_insert_before(HANDLE(), sibling.HANDLE(), data);
    }
    
    /**
     * Inserts @link_ into @queue before @sibling.
     * 
     * @sibling must be part of @queue.
     */
    public void insertBeforeLink(org.gtk.glib.List sibling, org.gtk.glib.List link) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_insert_before_link(HANDLE(), sibling.HANDLE(), link.HANDLE());
    }
    
    /**
     * Returns %TRUE if the queue is empty.
     */
    public boolean isEmpty() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_is_empty(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the position of @link_ in @queue.
     */
    public int linkIndex(org.gtk.glib.List link) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_link_index(HANDLE(), link.HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the first element of the queue.
     */
    public jdk.incubator.foreign.MemoryAddress peekHead() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_peek_head(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the first link in @queue.
     */
    public org.gtk.glib.List peekHeadLink() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_peek_head_link(HANDLE());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Returns the @n'th element of @queue.
     */
    public jdk.incubator.foreign.MemoryAddress peekNth(int n) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_peek_nth(HANDLE(), n);
        return RESULT;
    }
    
    /**
     * Returns the link at the given position
     */
    public org.gtk.glib.List peekNthLink(int n) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_peek_nth_link(HANDLE(), n);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Returns the last element of the queue.
     */
    public jdk.incubator.foreign.MemoryAddress peekTail() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_peek_tail(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the last link in @queue.
     */
    public org.gtk.glib.List peekTailLink() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_peek_tail_link(HANDLE());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes the first element of the queue and returns its data.
     */
    public jdk.incubator.foreign.MemoryAddress popHead() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_pop_head(HANDLE());
        return RESULT;
    }
    
    /**
     * Removes and returns the first element of the queue.
     */
    public org.gtk.glib.List popHeadLink() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_pop_head_link(HANDLE());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes the @n'th element of @queue and returns its data.
     */
    public jdk.incubator.foreign.MemoryAddress popNth(int n) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_pop_nth(HANDLE(), n);
        return RESULT;
    }
    
    /**
     * Removes and returns the link at the given position.
     */
    public org.gtk.glib.List popNthLink(int n) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_pop_nth_link(HANDLE(), n);
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Removes the last element of the queue and returns its data.
     */
    public jdk.incubator.foreign.MemoryAddress popTail() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_pop_tail(HANDLE());
        return RESULT;
    }
    
    /**
     * Removes and returns the last element of the queue.
     */
    public org.gtk.glib.List popTailLink() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_pop_tail_link(HANDLE());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Adds a new element at the head of the queue.
     */
    public void pushHead(jdk.incubator.foreign.MemoryAddress data) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_push_head(HANDLE(), data);
    }
    
    /**
     * Adds a new element at the head of the queue.
     */
    public void pushHeadLink(org.gtk.glib.List link) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_push_head_link(HANDLE(), link.HANDLE());
    }
    
    /**
     * Inserts a new element into @queue at the given position.
     */
    public void pushNth(jdk.incubator.foreign.MemoryAddress data, int n) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_push_nth(HANDLE(), data, n);
    }
    
    /**
     * Inserts @link into @queue at the given position.
     */
    public void pushNthLink(int n, org.gtk.glib.List link) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_push_nth_link(HANDLE(), n, link.HANDLE());
    }
    
    /**
     * Adds a new element at the tail of the queue.
     */
    public void pushTail(jdk.incubator.foreign.MemoryAddress data) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_push_tail(HANDLE(), data);
    }
    
    /**
     * Adds a new element at the tail of the queue.
     */
    public void pushTailLink(org.gtk.glib.List link) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_push_tail_link(HANDLE(), link.HANDLE());
    }
    
    /**
     * Removes the first element in @queue that contains @data.
     */
    public boolean remove(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_remove(HANDLE(), data);
        return (RESULT != 0);
    }
    
    /**
     * Remove all elements whose data equals @data from @queue.
     */
    public int removeAll(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_remove_all(HANDLE(), data);
        return RESULT;
    }
    
    /**
     * Reverses the order of the items in @queue.
     */
    public void reverse() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_reverse(HANDLE());
    }
    
    /**
     * Unlinks @link_ so that it will no longer be part of @queue.
     * The link is not freed.
     * 
     * @link_ must be part of @queue.
     */
    public void unlink(org.gtk.glib.List link) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_queue_unlink(HANDLE(), link.HANDLE());
    }
    
}

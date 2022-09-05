package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque data structure which represents an asynchronous queue.
 * 
 * It should only be accessed through the `g_async_queue_*` functions.
 */
public class AsyncQueue extends io.github.jwharm.javagi.interop.ResourceBase {

    public AsyncQueue(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Returns the length of the queue.
     * 
     * Actually this function returns the number of data items in
     * the queue minus the number of waiting threads, so a negative
     * value means waiting threads, and a positive value means available
     * entries in the @queue. A return value of 0 could mean n entries
     * in the queue and n threads waiting. This can happen due to locking
     * of the queue or due to scheduling.
     */
    public int length() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the length of the queue.
     * 
     * Actually this function returns the number of data items in
     * the queue minus the number of waiting threads, so a negative
     * value means waiting threads, and a positive value means available
     * entries in the @queue. A return value of 0 could mean n entries
     * in the queue and n threads waiting. This can happen due to locking
     * of the queue or due to scheduling.
     * 
     * This function must be called while holding the @queue's lock.
     */
    public int lengthUnlocked() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_length_unlocked(HANDLE());
        return RESULT;
    }
    
    /**
     * Acquires the @queue's lock. If another thread is already
     * holding the lock, this call will block until the lock
     * becomes available.
     * 
     * Call g_async_queue_unlock() to drop the lock again.
     * 
     * While holding the lock, you can only call the
     * g_async_queue_*_unlocked() functions on @queue. Otherwise,
     * deadlock may occur.
     */
    public void lock() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_lock(HANDLE());
    }
    
    /**
     * Pops data from the @queue. If @queue is empty, this function
     * blocks until data becomes available.
     */
    public jdk.incubator.foreign.MemoryAddress pop() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_pop(HANDLE());
        return RESULT;
    }
    
    /**
     * Pops data from the @queue. If @queue is empty, this function
     * blocks until data becomes available.
     * 
     * This function must be called while holding the @queue's lock.
     */
    public jdk.incubator.foreign.MemoryAddress popUnlocked() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_pop_unlocked(HANDLE());
        return RESULT;
    }
    
    /**
     * Pushes the @data into the @queue. @data must not be %NULL.
     */
    public void push(jdk.incubator.foreign.MemoryAddress data) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_push(HANDLE(), data);
    }
    
    /**
     * Pushes the @item into the @queue. @item must not be %NULL.
     * In contrast to g_async_queue_push(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     */
    public void pushFront(jdk.incubator.foreign.MemoryAddress item) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_push_front(HANDLE(), item);
    }
    
    /**
     * Pushes the @item into the @queue. @item must not be %NULL.
     * In contrast to g_async_queue_push_unlocked(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     * 
     * This function must be called while holding the @queue's lock.
     */
    public void pushFrontUnlocked(jdk.incubator.foreign.MemoryAddress item) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_push_front_unlocked(HANDLE(), item);
    }
    
    /**
     * Pushes the @data into the @queue. @data must not be %NULL.
     * 
     * This function must be called while holding the @queue's lock.
     */
    public void pushUnlocked(jdk.incubator.foreign.MemoryAddress data) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_push_unlocked(HANDLE(), data);
    }
    
    /**
     * Increases the reference count of the asynchronous @queue by 1.
     * You do not need to hold the lock to call this function.
     */
    public AsyncQueue ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_ref(HANDLE());
        return new AsyncQueue(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Remove an item from the queue.
     */
    public boolean remove(jdk.incubator.foreign.MemoryAddress item) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_remove(HANDLE(), item);
        return (RESULT != 0);
    }
    
    /**
     * Remove an item from the queue.
     * 
     * This function must be called while holding the @queue's lock.
     */
    public boolean removeUnlocked(jdk.incubator.foreign.MemoryAddress item) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_remove_unlocked(HANDLE(), item);
        return (RESULT != 0);
    }
    
    /**
     * Pops data from the @queue. If the queue is empty, blocks for
     * @timeout microseconds, or until data becomes available.
     * 
     * If no data is received before the timeout, %NULL is returned.
     */
    public jdk.incubator.foreign.MemoryAddress timeoutPop(long timeout) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_timeout_pop(HANDLE(), timeout);
        return RESULT;
    }
    
    /**
     * Pops data from the @queue. If the queue is empty, blocks for
     * @timeout microseconds, or until data becomes available.
     * 
     * If no data is received before the timeout, %NULL is returned.
     * 
     * This function must be called while holding the @queue's lock.
     */
    public jdk.incubator.foreign.MemoryAddress timeoutPopUnlocked(long timeout) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_timeout_pop_unlocked(HANDLE(), timeout);
        return RESULT;
    }
    
    /**
     * Tries to pop data from the @queue. If no data is available,
     * %NULL is returned.
     */
    public jdk.incubator.foreign.MemoryAddress tryPop() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_try_pop(HANDLE());
        return RESULT;
    }
    
    /**
     * Tries to pop data from the @queue. If no data is available,
     * %NULL is returned.
     * 
     * This function must be called while holding the @queue's lock.
     */
    public jdk.incubator.foreign.MemoryAddress tryPopUnlocked() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_try_pop_unlocked(HANDLE());
        return RESULT;
    }
    
    /**
     * Releases the queue's lock.
     * 
     * Calling this function when you have not acquired
     * the with g_async_queue_lock() leads to undefined
     * behaviour.
     */
    public void unlock() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_unlock(HANDLE());
    }
    
    /**
     * Decreases the reference count of the asynchronous @queue by 1.
     * 
     * If the reference count went to 0, the @queue will be destroyed
     * and the memory allocated will be freed. So you are not allowed
     * to use the @queue afterwards, as it might have disappeared.
     * You do not need to hold the lock to call this function.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_queue_unref(HANDLE());
    }
    
}

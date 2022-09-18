package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque data structure which represents an asynchronous queue.
 * <p>
 * It should only be accessed through the <code>g_async_queue_*</code> functions.
 */
public class AsyncQueue extends io.github.jwharm.javagi.ResourceBase {

    public AsyncQueue(io.github.jwharm.javagi.Reference reference) {
        super(reference);
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
        var RESULT = gtk_h.g_async_queue_length(handle());
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
     * This function must be called while holding the @queue&<code>#39</code> s lock.
     */
    public int lengthUnlocked() {
        var RESULT = gtk_h.g_async_queue_length_unlocked(handle());
        return RESULT;
    }
    
    /**
     * Acquires the @queue&<code>#39</code> s lock. If another thread is already
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
        gtk_h.g_async_queue_lock(handle());
    }
    
    /**
     * Pops data from the @queue. If @queue is empty, this function
     * blocks until data becomes available.
     */
    public jdk.incubator.foreign.MemoryAddress pop() {
        var RESULT = gtk_h.g_async_queue_pop(handle());
        return RESULT;
    }
    
    /**
     * Pops data from the @queue. If @queue is empty, this function
     * blocks until data becomes available.
     * 
     * This function must be called while holding the @queue&<code>#39</code> s lock.
     */
    public jdk.incubator.foreign.MemoryAddress popUnlocked() {
        var RESULT = gtk_h.g_async_queue_pop_unlocked(handle());
        return RESULT;
    }
    
    /**
     * Pushes the @data into the @queue. @data must not be <code>null</code>
     */
    public void push(jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_async_queue_push(handle(), data);
    }
    
    /**
     * Pushes the @item into the @queue. @item must not be <code>null</code> 
     * In contrast to g_async_queue_push(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     */
    public void pushFront(jdk.incubator.foreign.MemoryAddress item) {
        gtk_h.g_async_queue_push_front(handle(), item);
    }
    
    /**
     * Pushes the @item into the @queue. @item must not be <code>null</code> 
     * In contrast to g_async_queue_push_unlocked(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     * 
     * This function must be called while holding the @queue&<code>#39</code> s lock.
     */
    public void pushFrontUnlocked(jdk.incubator.foreign.MemoryAddress item) {
        gtk_h.g_async_queue_push_front_unlocked(handle(), item);
    }
    
    /**
     * Inserts @data into @queue using @func to determine the new
     * position.
     * 
     * This function requires that the @queue is sorted before pushing on
     * new elements, see g_async_queue_sort().
     * 
     * This function will lock @queue before it sorts the queue and unlock
     * it when it is finished.
     * 
     * For an example of @func see g_async_queue_sort().
     */
    public void pushSorted(CompareDataFunc func) {
        try {
            gtk_h.g_async_queue_push_sorted(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Inserts @data into @queue using @func to determine the new
     * position.
     * 
     * The sort function @func is passed two elements of the @queue.
     * It should return 0 if they are equal, a negative value if the
     * first element should be higher in the @queue or a positive value
     * if the first element should be lower in the @queue than the second
     * element.
     * 
     * This function requires that the @queue is sorted before pushing on
     * new elements, see g_async_queue_sort().
     * 
     * This function must be called while holding the @queue&<code>#39</code> s lock.
     * 
     * For an example of @func see g_async_queue_sort().
     */
    public void pushSortedUnlocked(CompareDataFunc func) {
        try {
            gtk_h.g_async_queue_push_sorted_unlocked(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Pushes the @data into the @queue. @data must not be <code>null</code> 
     * 
     * This function must be called while holding the @queue&<code>#39</code> s lock.
     */
    public void pushUnlocked(jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_async_queue_push_unlocked(handle(), data);
    }
    
    /**
     * Increases the reference count of the asynchronous @queue by 1.
     * You do not need to hold the lock to call this function.
     */
    public AsyncQueue ref() {
        var RESULT = gtk_h.g_async_queue_ref(handle());
        return new AsyncQueue(References.get(RESULT, false));
    }
    
    /**
     * Remove an item from the queue.
     */
    public boolean remove(jdk.incubator.foreign.MemoryAddress item) {
        var RESULT = gtk_h.g_async_queue_remove(handle(), item);
        return (RESULT != 0);
    }
    
    /**
     * Remove an item from the queue.
     * 
     * This function must be called while holding the @queue&<code>#39</code> s lock.
     */
    public boolean removeUnlocked(jdk.incubator.foreign.MemoryAddress item) {
        var RESULT = gtk_h.g_async_queue_remove_unlocked(handle(), item);
        return (RESULT != 0);
    }
    
    /**
     * Sorts @queue using @func.
     * 
     * The sort function @func is passed two elements of the @queue.
     * It should return 0 if they are equal, a negative value if the
     * first element should be higher in the @queue or a positive value
     * if the first element should be lower in the @queue than the second
     * element.
     * 
     * This function will lock @queue before it sorts the queue and unlock
     * it when it is finished.
     * 
     * If you were sorting a list of priority numbers to make sure the
     * lowest priority would be at the top of the queue, you could use:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *  gint32 id1;
     *  gint32 id2;
     * 
     *  id1 = GPOINTER_TO_INT (element1);
     *  id2 = GPOINTER_TO_INT (element2);
     * 
     *  return (id1 &<code>#62</code>  id2 ? +1 : id1 == id2 ? 0 : -1);
     * ]}|
     */
    public void sort(CompareDataFunc func) {
        try {
            gtk_h.g_async_queue_sort(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sorts @queue using @func.
     * 
     * The sort function @func is passed two elements of the @queue.
     * It should return 0 if they are equal, a negative value if the
     * first element should be higher in the @queue or a positive value
     * if the first element should be lower in the @queue than the second
     * element.
     * 
     * This function must be called while holding the @queue&<code>#39</code> s lock.
     */
    public void sortUnlocked(CompareDataFunc func) {
        try {
            gtk_h.g_async_queue_sort_unlocked(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Pops data from the @queue. If the queue is empty, blocks for
     * @timeout microseconds, or until data becomes available.
     * 
     * If no data is received before the timeout, <code>null</code> is returned.
     */
    public jdk.incubator.foreign.MemoryAddress timeoutPop(long timeout) {
        var RESULT = gtk_h.g_async_queue_timeout_pop(handle(), timeout);
        return RESULT;
    }
    
    /**
     * Pops data from the @queue. If the queue is empty, blocks for
     * @timeout microseconds, or until data becomes available.
     * 
     * If no data is received before the timeout, <code>null</code> is returned.
     * 
     * This function must be called while holding the @queue&<code>#39</code> s lock.
     */
    public jdk.incubator.foreign.MemoryAddress timeoutPopUnlocked(long timeout) {
        var RESULT = gtk_h.g_async_queue_timeout_pop_unlocked(handle(), timeout);
        return RESULT;
    }
    
    /**
     * Tries to pop data from the @queue. If no data is available,
     * <code>null</code> is returned.
     */
    public jdk.incubator.foreign.MemoryAddress tryPop() {
        var RESULT = gtk_h.g_async_queue_try_pop(handle());
        return RESULT;
    }
    
    /**
     * Tries to pop data from the @queue. If no data is available,
     * <code>null</code> is returned.
     * 
     * This function must be called while holding the @queue&<code>#39</code> s lock.
     */
    public jdk.incubator.foreign.MemoryAddress tryPopUnlocked() {
        var RESULT = gtk_h.g_async_queue_try_pop_unlocked(handle());
        return RESULT;
    }
    
    /**
     * Releases the queue&<code>#39</code> s lock.
     * 
     * Calling this function when you have not acquired
     * the with g_async_queue_lock() leads to undefined
     * behaviour.
     */
    public void unlock() {
        gtk_h.g_async_queue_unlock(handle());
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
        gtk_h.g_async_queue_unref(handle());
    }
    
    /**
     * Creates a new asynchronous queue.
     */
    public static AsyncQueue new_() {
        var RESULT = gtk_h.g_async_queue_new();
        return new AsyncQueue(References.get(RESULT, false));
    }
    
}

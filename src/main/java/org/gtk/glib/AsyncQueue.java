package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque data structure which represents an asynchronous queue.
 * <p>
 * It should only be accessed through the {@code g_async_queue_*} functions.
 */
public class AsyncQueue extends io.github.jwharm.javagi.ResourceBase {

    public AsyncQueue(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Returns the length of the queue.
     * <p>
     * Actually this function returns the number of data items in
     * the queue minus the number of waiting threads, so a negative
     * value means waiting threads, and a positive value means available
     * entries in the {@code queue}. A return value of 0 could mean n entries
     * in the queue and n threads waiting. This can happen due to locking
     * of the queue or due to scheduling.
     */
    public int length() {
        var RESULT = gtk_h.g_async_queue_length(handle());
        return RESULT;
    }
    
    /**
     * Returns the length of the queue.
     * <p>
     * Actually this function returns the number of data items in
     * the queue minus the number of waiting threads, so a negative
     * value means waiting threads, and a positive value means available
     * entries in the {@code queue}. A return value of 0 could mean n entries
     * in the queue and n threads waiting. This can happen due to locking
     * of the queue or due to scheduling.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public int lengthUnlocked() {
        var RESULT = gtk_h.g_async_queue_length_unlocked(handle());
        return RESULT;
    }
    
    /**
     * Acquires the {@code queue}'s lock. If another thread is already
     * holding the lock, this call will block until the lock
     * becomes available.
     * <p>
     * Call g_async_queue_unlock() to drop the lock again.
     * <p>
     * While holding the lock, you can only call the
     * g_async_queue_*_unlocked() functions on {@code queue}. Otherwise,
     * deadlock may occur.
     */
    public void lock() {
        gtk_h.g_async_queue_lock(handle());
    }
    
    /**
     * Pops data from the {@code queue}. If {@code queue} is empty, this function
     * blocks until data becomes available.
     */
    public java.lang.foreign.MemoryAddress pop() {
        var RESULT = gtk_h.g_async_queue_pop(handle());
        return RESULT;
    }
    
    /**
     * Pops data from the {@code queue}. If {@code queue} is empty, this function
     * blocks until data becomes available.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public java.lang.foreign.MemoryAddress popUnlocked() {
        var RESULT = gtk_h.g_async_queue_pop_unlocked(handle());
        return RESULT;
    }
    
    /**
     * Pushes the {@code data} into the {@code queue}. {@code data} must not be {@code null}.
     */
    public void push(java.lang.foreign.MemoryAddress data) {
        gtk_h.g_async_queue_push(handle(), data);
    }
    
    /**
     * Pushes the {@code item} into the {@code queue}. {@code item} must not be {@code null}.
     * In contrast to g_async_queue_push(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     */
    public void pushFront(java.lang.foreign.MemoryAddress item) {
        gtk_h.g_async_queue_push_front(handle(), item);
    }
    
    /**
     * Pushes the {@code item} into the {@code queue}. {@code item} must not be {@code null}.
     * In contrast to g_async_queue_push_unlocked(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public void pushFrontUnlocked(java.lang.foreign.MemoryAddress item) {
        gtk_h.g_async_queue_push_front_unlocked(handle(), item);
    }
    
    /**
     * Inserts {@code data} into {@code queue} using {@code func} to determine the new
     * position.
     * <p>
     * This function requires that the {@code queue} is sorted before pushing on
     * new elements, see g_async_queue_sort().
     * <p>
     * This function will lock {@code queue} before it sorts the queue and unlock
     * it when it is finished.
     * <p>
     * For an example of {@code func} see g_async_queue_sort().
     */
    public void pushSorted(CompareDataFunc func) {
        try {
            gtk_h.g_async_queue_push_sorted(handle(), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Inserts {@code data} into {@code queue} using {@code func} to determine the new
     * position.
     * <p>
     * The sort function {@code func} is passed two elements of the {@code queue}.
     * It should return 0 if they are equal, a negative value if the
     * first element should be higher in the {@code queue} or a positive value
     * if the first element should be lower in the {@code queue} than the second
     * element.
     * <p>
     * This function requires that the {@code queue} is sorted before pushing on
     * new elements, see g_async_queue_sort().
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     * <p>
     * For an example of {@code func} see g_async_queue_sort().
     */
    public void pushSortedUnlocked(CompareDataFunc func) {
        try {
            gtk_h.g_async_queue_push_sorted_unlocked(handle(), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Pushes the {@code data} into the {@code queue}. {@code data} must not be {@code null}.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public void pushUnlocked(java.lang.foreign.MemoryAddress data) {
        gtk_h.g_async_queue_push_unlocked(handle(), data);
    }
    
    /**
     * Increases the reference count of the asynchronous {@code queue} by 1.
     * You do not need to hold the lock to call this function.
     */
    public AsyncQueue ref() {
        var RESULT = gtk_h.g_async_queue_ref(handle());
        return new AsyncQueue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Remove an item from the queue.
     */
    public boolean remove(java.lang.foreign.MemoryAddress item) {
        var RESULT = gtk_h.g_async_queue_remove(handle(), item);
        return RESULT != 0;
    }
    
    /**
     * Remove an item from the queue.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public boolean removeUnlocked(java.lang.foreign.MemoryAddress item) {
        var RESULT = gtk_h.g_async_queue_remove_unlocked(handle(), item);
        return RESULT != 0;
    }
    
    /**
     * Sorts {@code queue} using {@code func}.
     * <p>
     * The sort function {@code func} is passed two elements of the {@code queue}.
     * It should return 0 if they are equal, a negative value if the
     * first element should be higher in the {@code queue} or a positive value
     * if the first element should be lower in the {@code queue} than the second
     * element.
     * <p>
     * This function will lock {@code queue} before it sorts the queue and unlock
     * it when it is finished.
     * <p>
     * If you were sorting a list of priority numbers to make sure the
     * lowest priority would be at the top of the queue, you could use:
     * <pre>{@code <!-- language="C" -->
     *  gint32 id1;
     *  gint32 id2;
     * 
     *  id1 = GPOINTER_TO_INT (element1);
     *  id2 = GPOINTER_TO_INT (element2);
     * 
     *  return (id1 > id2 ? +1 : id1 == id2 ? 0 : -1);
     * }</pre>
     */
    public void sort(CompareDataFunc func) {
        try {
            gtk_h.g_async_queue_sort(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sorts {@code queue} using {@code func}.
     * <p>
     * The sort function {@code func} is passed two elements of the {@code queue}.
     * It should return 0 if they are equal, a negative value if the
     * first element should be higher in the {@code queue} or a positive value
     * if the first element should be lower in the {@code queue} than the second
     * element.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public void sortUnlocked(CompareDataFunc func) {
        try {
            gtk_h.g_async_queue_sort_unlocked(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Pops data from the {@code queue}. If the queue is empty, blocks for
     * {@code timeout} microseconds, or until data becomes available.
     * <p>
     * If no data is received before the timeout, {@code null} is returned.
     */
    public java.lang.foreign.MemoryAddress timeoutPop(long timeout) {
        var RESULT = gtk_h.g_async_queue_timeout_pop(handle(), timeout);
        return RESULT;
    }
    
    /**
     * Pops data from the {@code queue}. If the queue is empty, blocks for
     * {@code timeout} microseconds, or until data becomes available.
     * <p>
     * If no data is received before the timeout, {@code null} is returned.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public java.lang.foreign.MemoryAddress timeoutPopUnlocked(long timeout) {
        var RESULT = gtk_h.g_async_queue_timeout_pop_unlocked(handle(), timeout);
        return RESULT;
    }
    
    /**
     * Tries to pop data from the {@code queue}. If no data is available,
     * {@code null} is returned.
     */
    public java.lang.foreign.MemoryAddress tryPop() {
        var RESULT = gtk_h.g_async_queue_try_pop(handle());
        return RESULT;
    }
    
    /**
     * Tries to pop data from the {@code queue}. If no data is available,
     * {@code null} is returned.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public java.lang.foreign.MemoryAddress tryPopUnlocked() {
        var RESULT = gtk_h.g_async_queue_try_pop_unlocked(handle());
        return RESULT;
    }
    
    /**
     * Releases the queue's lock.
     * <p>
     * Calling this function when you have not acquired
     * the with g_async_queue_lock() leads to undefined
     * behaviour.
     */
    public void unlock() {
        gtk_h.g_async_queue_unlock(handle());
    }
    
    /**
     * Decreases the reference count of the asynchronous {@code queue} by 1.
     * <p>
     * If the reference count went to 0, the {@code queue} will be destroyed
     * and the memory allocated will be freed. So you are not allowed
     * to use the {@code queue} afterwards, as it might have disappeared.
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
        return new AsyncQueue(Refcounted.get(RESULT, false));
    }
    
}

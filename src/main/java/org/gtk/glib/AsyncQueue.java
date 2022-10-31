package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque data structure which represents an asynchronous queue.
 * <p>
 * It should only be accessed through the {@code g_async_queue_*} functions.
 */
public class AsyncQueue extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAsyncQueue";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static AsyncQueue allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AsyncQueue newInstance = new AsyncQueue(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
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
     * @return the length of the {@code queue}
     */
    public int length() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_async_queue_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the length of the {@code queue}.
     */
    public int lengthUnlocked() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_async_queue_length_unlocked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_async_queue_lock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pops data from the {@code queue}. If {@code queue} is empty, this function
     * blocks until data becomes available.
     * @return data from the queue
     */
    public @Nullable java.lang.foreign.MemoryAddress pop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_pop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Pops data from the {@code queue}. If {@code queue} is empty, this function
     * blocks until data becomes available.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     * @return data from the queue.
     */
    public @Nullable java.lang.foreign.MemoryAddress popUnlocked() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_pop_unlocked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Pushes the {@code data} into the {@code queue}. {@code data} must not be {@code null}.
     * @param data {@code data} to push into the {@code queue}
     */
    public void push(@Nullable java.lang.foreign.MemoryAddress data) {
        try {
            DowncallHandles.g_async_queue_push.invokeExact(
                    handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pushes the {@code item} into the {@code queue}. {@code item} must not be {@code null}.
     * In contrast to g_async_queue_push(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     * @param item data to push into the {@code queue}
     */
    public void pushFront(@Nullable java.lang.foreign.MemoryAddress item) {
        try {
            DowncallHandles.g_async_queue_push_front.invokeExact(
                    handle(),
                    (Addressable) (item == null ? MemoryAddress.NULL : item));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pushes the {@code item} into the {@code queue}. {@code item} must not be {@code null}.
     * In contrast to g_async_queue_push_unlocked(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     * @param item data to push into the {@code queue}
     */
    public void pushFrontUnlocked(@Nullable java.lang.foreign.MemoryAddress item) {
        try {
            DowncallHandles.g_async_queue_push_front_unlocked.invokeExact(
                    handle(),
                    (Addressable) (item == null ? MemoryAddress.NULL : item));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param func the {@link CompareDataFunc} is used to sort {@code queue}
     */
    public void pushSorted(@NotNull org.gtk.glib.CompareDataFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_async_queue_push_sorted.invokeExact(
                    handle(),
                    (Addressable) (Interop.registerCallback(func)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * @param func the {@link CompareDataFunc} is used to sort {@code queue}
     */
    public void pushSortedUnlocked(@NotNull org.gtk.glib.CompareDataFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_async_queue_push_sorted_unlocked.invokeExact(
                    handle(),
                    (Addressable) (Interop.registerCallback(func)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pushes the {@code data} into the {@code queue}. {@code data} must not be {@code null}.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     * @param data {@code data} to push into the {@code queue}
     */
    public void pushUnlocked(@Nullable java.lang.foreign.MemoryAddress data) {
        try {
            DowncallHandles.g_async_queue_push_unlocked.invokeExact(
                    handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count of the asynchronous {@code queue} by 1.
     * You do not need to hold the lock to call this function.
     * @return the {@code queue} that was passed in (since 2.6)
     */
    public @NotNull org.gtk.glib.AsyncQueue ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.AsyncQueue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Increases the reference count of the asynchronous {@code queue} by 1.
     * @deprecated Reference counting is done atomically.
     * so g_async_queue_ref() can be used regardless of the {@code queue}'s
     * lock.
     */
    @Deprecated
    public void refUnlocked() {
        try {
            DowncallHandles.g_async_queue_ref_unlocked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Remove an item from the queue.
     * @param item the data to remove from the {@code queue}
     * @return {@code true} if the item was removed
     */
    public boolean remove(@Nullable java.lang.foreign.MemoryAddress item) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_async_queue_remove.invokeExact(
                    handle(),
                    (Addressable) (item == null ? MemoryAddress.NULL : item));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Remove an item from the queue.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     * @param item the data to remove from the {@code queue}
     * @return {@code true} if the item was removed
     */
    public boolean removeUnlocked(@Nullable java.lang.foreign.MemoryAddress item) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_async_queue_remove_unlocked.invokeExact(
                    handle(),
                    (Addressable) (item == null ? MemoryAddress.NULL : item));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param func the {@link CompareDataFunc} is used to sort {@code queue}
     */
    public void sort(@NotNull org.gtk.glib.CompareDataFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_async_queue_sort.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * @param func the {@link CompareDataFunc} is used to sort {@code queue}
     */
    public void sortUnlocked(@NotNull org.gtk.glib.CompareDataFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_async_queue_sort_unlocked.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pops data from the {@code queue}. If the queue is empty, blocks until
     * {@code end_time} or until data becomes available.
     * <p>
     * If no data is received before {@code end_time}, {@code null} is returned.
     * <p>
     * To easily calculate {@code end_time}, a combination of g_get_real_time()
     * and g_time_val_add() can be used.
     * @param endTime a {@link TimeVal}, determining the final time
     * @return data from the queue or {@code null}, when no data is
     *     received before {@code end_time}.
     * @deprecated use g_async_queue_timeout_pop().
     */
    @Deprecated
    public @Nullable java.lang.foreign.MemoryAddress timedPop(@NotNull org.gtk.glib.TimeVal endTime) {
        java.util.Objects.requireNonNull(endTime, "Parameter 'endTime' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_timed_pop.invokeExact(
                    handle(),
                    endTime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Pops data from the {@code queue}. If the queue is empty, blocks until
     * {@code end_time} or until data becomes available.
     * <p>
     * If no data is received before {@code end_time}, {@code null} is returned.
     * <p>
     * To easily calculate {@code end_time}, a combination of g_get_real_time()
     * and g_time_val_add() can be used.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     * @param endTime a {@link TimeVal}, determining the final time
     * @return data from the queue or {@code null}, when no data is
     *     received before {@code end_time}.
     * @deprecated use g_async_queue_timeout_pop_unlocked().
     */
    @Deprecated
    public @Nullable java.lang.foreign.MemoryAddress timedPopUnlocked(@NotNull org.gtk.glib.TimeVal endTime) {
        java.util.Objects.requireNonNull(endTime, "Parameter 'endTime' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_timed_pop_unlocked.invokeExact(
                    handle(),
                    endTime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Pops data from the {@code queue}. If the queue is empty, blocks for
     * {@code timeout} microseconds, or until data becomes available.
     * <p>
     * If no data is received before the timeout, {@code null} is returned.
     * @param timeout the number of microseconds to wait
     * @return data from the queue or {@code null}, when no data is
     *     received before the timeout.
     */
    public @Nullable java.lang.foreign.MemoryAddress timeoutPop(long timeout) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_timeout_pop.invokeExact(
                    handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Pops data from the {@code queue}. If the queue is empty, blocks for
     * {@code timeout} microseconds, or until data becomes available.
     * <p>
     * If no data is received before the timeout, {@code null} is returned.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     * @param timeout the number of microseconds to wait
     * @return data from the queue or {@code null}, when no data is
     *     received before the timeout.
     */
    public @Nullable java.lang.foreign.MemoryAddress timeoutPopUnlocked(long timeout) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_timeout_pop_unlocked.invokeExact(
                    handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tries to pop data from the {@code queue}. If no data is available,
     * {@code null} is returned.
     * @return data from the queue or {@code null}, when no data is
     *     available immediately.
     */
    public @Nullable java.lang.foreign.MemoryAddress tryPop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_try_pop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tries to pop data from the {@code queue}. If no data is available,
     * {@code null} is returned.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     * @return data from the queue or {@code null}, when no data is
     *     available immediately.
     */
    public @Nullable java.lang.foreign.MemoryAddress tryPopUnlocked() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_try_pop_unlocked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_async_queue_unlock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_async_queue_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count of the asynchronous {@code queue} by 1
     * and releases the lock. This function must be called while holding
     * the {@code queue}'s lock. If the reference count went to 0, the {@code queue}
     * will be destroyed and the memory allocated will be freed.
     * @deprecated Reference counting is done atomically.
     * so g_async_queue_unref() can be used regardless of the {@code queue}'s
     * lock.
     */
    @Deprecated
    public void unrefAndUnlock() {
        try {
            DowncallHandles.g_async_queue_unref_and_unlock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new asynchronous queue.
     * @return a new {@link AsyncQueue}. Free with g_async_queue_unref()
     */
    public static @NotNull org.gtk.glib.AsyncQueue new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_async_queue_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.AsyncQueue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Creates a new asynchronous queue and sets up a destroy notify
     * function that is used to free any remaining queue items when
     * the queue is destroyed after the final unref.
     * @param itemFreeFunc function to free queue elements
     * @return a new {@link AsyncQueue}. Free with g_async_queue_unref()
     */
    public static @NotNull org.gtk.glib.AsyncQueue newFull(@Nullable org.gtk.glib.DestroyNotify itemFreeFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_async_queue_length = Interop.downcallHandle(
            "g_async_queue_length",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_length_unlocked = Interop.downcallHandle(
            "g_async_queue_length_unlocked",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_lock = Interop.downcallHandle(
            "g_async_queue_lock",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_pop = Interop.downcallHandle(
            "g_async_queue_pop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_pop_unlocked = Interop.downcallHandle(
            "g_async_queue_pop_unlocked",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_push = Interop.downcallHandle(
            "g_async_queue_push",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_push_front = Interop.downcallHandle(
            "g_async_queue_push_front",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_push_front_unlocked = Interop.downcallHandle(
            "g_async_queue_push_front_unlocked",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_push_sorted = Interop.downcallHandle(
            "g_async_queue_push_sorted",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_push_sorted_unlocked = Interop.downcallHandle(
            "g_async_queue_push_sorted_unlocked",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_push_unlocked = Interop.downcallHandle(
            "g_async_queue_push_unlocked",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_ref = Interop.downcallHandle(
            "g_async_queue_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_ref_unlocked = Interop.downcallHandle(
            "g_async_queue_ref_unlocked",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_remove = Interop.downcallHandle(
            "g_async_queue_remove",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_remove_unlocked = Interop.downcallHandle(
            "g_async_queue_remove_unlocked",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_sort = Interop.downcallHandle(
            "g_async_queue_sort",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_sort_unlocked = Interop.downcallHandle(
            "g_async_queue_sort_unlocked",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_timed_pop = Interop.downcallHandle(
            "g_async_queue_timed_pop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_timed_pop_unlocked = Interop.downcallHandle(
            "g_async_queue_timed_pop_unlocked",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_timeout_pop = Interop.downcallHandle(
            "g_async_queue_timeout_pop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_async_queue_timeout_pop_unlocked = Interop.downcallHandle(
            "g_async_queue_timeout_pop_unlocked",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_async_queue_try_pop = Interop.downcallHandle(
            "g_async_queue_try_pop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_try_pop_unlocked = Interop.downcallHandle(
            "g_async_queue_try_pop_unlocked",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_unlock = Interop.downcallHandle(
            "g_async_queue_unlock",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_unref = Interop.downcallHandle(
            "g_async_queue_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_unref_and_unlock = Interop.downcallHandle(
            "g_async_queue_unref_and_unlock",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_new = Interop.downcallHandle(
            "g_async_queue_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_async_queue_new_full = Interop.downcallHandle(
            "g_async_queue_new_full",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}

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

    public AsyncQueue(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_async_queue_length = Interop.downcallHandle(
        "g_async_queue_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        int RESULT;
        try {
            RESULT = (int) g_async_queue_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_async_queue_length_unlocked = Interop.downcallHandle(
        "g_async_queue_length_unlocked",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        int RESULT;
        try {
            RESULT = (int) g_async_queue_length_unlocked.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_async_queue_lock = Interop.downcallHandle(
        "g_async_queue_lock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void lock() {
        try {
            g_async_queue_lock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_pop = Interop.downcallHandle(
        "g_async_queue_pop",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Pops data from the {@code queue}. If {@code queue} is empty, this function
     * blocks until data becomes available.
     */
    public @Nullable java.lang.foreign.MemoryAddress pop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_queue_pop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_async_queue_pop_unlocked = Interop.downcallHandle(
        "g_async_queue_pop_unlocked",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Pops data from the {@code queue}. If {@code queue} is empty, this function
     * blocks until data becomes available.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public @Nullable java.lang.foreign.MemoryAddress popUnlocked() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_queue_pop_unlocked.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_async_queue_push = Interop.downcallHandle(
        "g_async_queue_push",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Pushes the {@code data} into the {@code queue}. {@code data} must not be {@code null}.
     */
    public @NotNull void push(@Nullable java.lang.foreign.MemoryAddress data) {
        try {
            g_async_queue_push.invokeExact(handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_push_front = Interop.downcallHandle(
        "g_async_queue_push_front",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Pushes the {@code item} into the {@code queue}. {@code item} must not be {@code null}.
     * In contrast to g_async_queue_push(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     */
    public @NotNull void pushFront(@Nullable java.lang.foreign.MemoryAddress item) {
        try {
            g_async_queue_push_front.invokeExact(handle(), item);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_push_front_unlocked = Interop.downcallHandle(
        "g_async_queue_push_front_unlocked",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Pushes the {@code item} into the {@code queue}. {@code item} must not be {@code null}.
     * In contrast to g_async_queue_push_unlocked(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public @NotNull void pushFrontUnlocked(@Nullable java.lang.foreign.MemoryAddress item) {
        try {
            g_async_queue_push_front_unlocked.invokeExact(handle(), item);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_push_sorted = Interop.downcallHandle(
        "g_async_queue_push_sorted",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void pushSorted(@NotNull CompareDataFunc func) {
        try {
            g_async_queue_push_sorted.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_push_sorted_unlocked = Interop.downcallHandle(
        "g_async_queue_push_sorted_unlocked",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void pushSortedUnlocked(@NotNull CompareDataFunc func) {
        try {
            g_async_queue_push_sorted_unlocked.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_push_unlocked = Interop.downcallHandle(
        "g_async_queue_push_unlocked",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Pushes the {@code data} into the {@code queue}. {@code data} must not be {@code null}.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public @NotNull void pushUnlocked(@Nullable java.lang.foreign.MemoryAddress data) {
        try {
            g_async_queue_push_unlocked.invokeExact(handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_ref = Interop.downcallHandle(
        "g_async_queue_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of the asynchronous {@code queue} by 1.
     * You do not need to hold the lock to call this function.
     */
    public @NotNull AsyncQueue ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_queue_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AsyncQueue(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_async_queue_remove = Interop.downcallHandle(
        "g_async_queue_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Remove an item from the queue.
     */
    public boolean remove(@Nullable java.lang.foreign.MemoryAddress item) {
        int RESULT;
        try {
            RESULT = (int) g_async_queue_remove.invokeExact(handle(), item);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_async_queue_remove_unlocked = Interop.downcallHandle(
        "g_async_queue_remove_unlocked",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Remove an item from the queue.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public boolean removeUnlocked(@Nullable java.lang.foreign.MemoryAddress item) {
        int RESULT;
        try {
            RESULT = (int) g_async_queue_remove_unlocked.invokeExact(handle(), item);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_async_queue_sort = Interop.downcallHandle(
        "g_async_queue_sort",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void sort(@NotNull CompareDataFunc func) {
        try {
            g_async_queue_sort.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_sort_unlocked = Interop.downcallHandle(
        "g_async_queue_sort_unlocked",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void sortUnlocked(@NotNull CompareDataFunc func) {
        try {
            g_async_queue_sort_unlocked.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_timeout_pop = Interop.downcallHandle(
        "g_async_queue_timeout_pop",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Pops data from the {@code queue}. If the queue is empty, blocks for
     * {@code timeout} microseconds, or until data becomes available.
     * <p>
     * If no data is received before the timeout, {@code null} is returned.
     */
    public @Nullable java.lang.foreign.MemoryAddress timeoutPop(@NotNull long timeout) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_queue_timeout_pop.invokeExact(handle(), timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_async_queue_timeout_pop_unlocked = Interop.downcallHandle(
        "g_async_queue_timeout_pop_unlocked",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Pops data from the {@code queue}. If the queue is empty, blocks for
     * {@code timeout} microseconds, or until data becomes available.
     * <p>
     * If no data is received before the timeout, {@code null} is returned.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public @Nullable java.lang.foreign.MemoryAddress timeoutPopUnlocked(@NotNull long timeout) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_queue_timeout_pop_unlocked.invokeExact(handle(), timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_async_queue_try_pop = Interop.downcallHandle(
        "g_async_queue_try_pop",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to pop data from the {@code queue}. If no data is available,
     * {@code null} is returned.
     */
    public @Nullable java.lang.foreign.MemoryAddress tryPop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_queue_try_pop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_async_queue_try_pop_unlocked = Interop.downcallHandle(
        "g_async_queue_try_pop_unlocked",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to pop data from the {@code queue}. If no data is available,
     * {@code null} is returned.
     * <p>
     * This function must be called while holding the {@code queue}'s lock.
     */
    public @Nullable java.lang.foreign.MemoryAddress tryPopUnlocked() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_queue_try_pop_unlocked.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_async_queue_unlock = Interop.downcallHandle(
        "g_async_queue_unlock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases the queue's lock.
     * <p>
     * Calling this function when you have not acquired
     * the with g_async_queue_lock() leads to undefined
     * behaviour.
     */
    public @NotNull void unlock() {
        try {
            g_async_queue_unlock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_unref = Interop.downcallHandle(
        "g_async_queue_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of the asynchronous {@code queue} by 1.
     * <p>
     * If the reference count went to 0, the {@code queue} will be destroyed
     * and the memory allocated will be freed. So you are not allowed
     * to use the {@code queue} afterwards, as it might have disappeared.
     * You do not need to hold the lock to call this function.
     */
    public @NotNull void unref() {
        try {
            g_async_queue_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_async_queue_new = Interop.downcallHandle(
        "g_async_queue_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new asynchronous queue.
     */
    public static @NotNull AsyncQueue new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_queue_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AsyncQueue(Refcounted.get(RESULT, false));
    }
    
}

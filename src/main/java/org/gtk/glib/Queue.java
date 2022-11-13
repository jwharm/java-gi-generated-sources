package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains the public fields of a
 * [Queue][glib-Double-ended-Queues].
 */
public class Queue extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GQueue";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("head"),
        Interop.valueLayout.ADDRESS.withName("tail"),
        ValueLayout.JAVA_INT.withName("length")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Queue allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Queue newInstance = new Queue(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code head}
     * @return The value of the field {@code head}
     */
    public org.gtk.glib.List head$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("head"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code head}
     * @param head The new value of the field {@code head}
     */
    public void head$set(org.gtk.glib.List head) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("head"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), head.handle());
    }
    
    /**
     * Get the value of the field {@code tail}
     * @return The value of the field {@code tail}
     */
    public org.gtk.glib.List tail$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tail"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code tail}
     * @param tail The new value of the field {@code tail}
     */
    public void tail$set(org.gtk.glib.List tail) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tail"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tail.handle());
    }
    
    /**
     * Get the value of the field {@code length}
     * @return The value of the field {@code length}
     */
    public int length$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code length}
     * @param length The new value of the field {@code length}
     */
    public void length$set(int length) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
    }
    
    /**
     * Create a Queue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Queue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Removes all the elements in {@code queue}. If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     */
    public void clear() {
        try {
            DowncallHandles.g_queue_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience method, which frees all the memory used by a {@link Queue},
     * and calls the provided {@code free_func} on each item in the {@link Queue}.
     * @param freeFunc the function to be called to free memory allocated
     */
    public void clearFull(@Nullable org.gtk.glib.DestroyNotify freeFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Copies a {@code queue}. Note that is a shallow copy. If the elements in the
     * queue consist of pointers to data, the pointers are copied, but the
     * actual data is not.
     * @return a copy of {@code queue}
     */
    public @NotNull org.gtk.glib.Queue copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Queue(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes {@code link_} from {@code queue} and frees it.
     * <p>
     * {@code link_} must be part of {@code queue}.
     * @param link a {@link List} link that must be part of {@code queue}
     */
    public void deleteLink(@NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        try {
            DowncallHandles.g_queue_delete_link.invokeExact(
                    handle(),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finds the first link in {@code queue} which contains {@code data}.
     * @param data data to find
     * @return the first link in {@code queue} which contains {@code data}
     */
    public @NotNull org.gtk.glib.List find(@Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_find.invokeExact(
                    handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Finds an element in a {@link Queue}, using a supplied function to find the
     * desired element. It iterates over the queue, calling the given function
     * which should return 0 when the desired element is found. The function
     * takes two gconstpointer arguments, the {@link Queue} element's data as the
     * first argument and the given user data as the second argument.
     * @param func a {@link CompareFunc} to call for each element. It should return 0
     *     when the desired element is found
     * @return the found link, or {@code null} if it wasn't found
     */
    public @NotNull org.gtk.glib.List findCustom(@NotNull org.gtk.glib.CompareFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_find_custom.invokeExact(
                    handle(),
                    (Addressable) (Interop.registerCallback(func)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Calls {@code func} for each element in the queue passing {@code user_data} to the
     * function.
     * <p>
     * It is safe for {@code func} to remove the element from {@code queue}, but it must
     * not modify any part of the queue after that element.
     * @param func the function to call for each element's data
     */
    public void foreach(@NotNull org.gtk.glib.Func func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_queue_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
        try {
            DowncallHandles.g_queue_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience method, which frees all the memory used by a {@link Queue},
     * and calls the specified destroy function on every element's data.
     * <p>
     * {@code free_func} should not modify the queue (eg, by removing the freed
     * element from it).
     * @param freeFunc the function to be called to free each element's data
     */
    public void freeFull(@NotNull org.gtk.glib.DestroyNotify freeFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Returns the number of items in {@code queue}.
     * @return the number of items in {@code queue}
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_queue_get_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the position of the first element in {@code queue} which contains {@code data}.
     * @param data the data to find
     * @return the position of the first element in {@code queue} which
     *     contains {@code data}, or -1 if no element in {@code queue} contains {@code data}
     */
    public int index(@Nullable java.lang.foreign.MemoryAddress data) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_queue_index.invokeExact(
                    handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * A statically-allocated {@link Queue} must be initialized with this function
     * before it can be used. Alternatively you can initialize it with
     * {@code G_QUEUE_INIT}. It is not necessary to initialize queues created with
     * g_queue_new().
     */
    public void init() {
        try {
            DowncallHandles.g_queue_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code data} into {@code queue} after {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}. Since GLib 2.44 a {@code null} sibling pushes the
     * data at the head of the queue.
     * @param sibling a {@link List} link that must be part of {@code queue}, or {@code null} to
     *   push at the head of the queue.
     * @param data the data to insert
     */
    public void insertAfter(@Nullable org.gtk.glib.List sibling, @Nullable java.lang.foreign.MemoryAddress data) {
        try {
            DowncallHandles.g_queue_insert_after.invokeExact(
                    handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code link_} into {@code queue} after {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}.
     * @param sibling a {@link List} link that must be part of {@code queue}, or {@code null} to
     *   push at the head of the queue.
     * @param link a {@link List} link to insert which must not be part of any other list.
     */
    public void insertAfterLink(@Nullable org.gtk.glib.List sibling, @NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        try {
            DowncallHandles.g_queue_insert_after_link.invokeExact(
                    handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code data} into {@code queue} before {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}. Since GLib 2.44 a {@code null} sibling pushes the
     * data at the tail of the queue.
     * @param sibling a {@link List} link that must be part of {@code queue}, or {@code null} to
     *   push at the tail of the queue.
     * @param data the data to insert
     */
    public void insertBefore(@Nullable org.gtk.glib.List sibling, @Nullable java.lang.foreign.MemoryAddress data) {
        try {
            DowncallHandles.g_queue_insert_before.invokeExact(
                    handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code link_} into {@code queue} before {@code sibling}.
     * <p>
     * {@code sibling} must be part of {@code queue}.
     * @param sibling a {@link List} link that must be part of {@code queue}, or {@code null} to
     *   push at the tail of the queue.
     * @param link a {@link List} link to insert which must not be part of any other list.
     */
    public void insertBeforeLink(@Nullable org.gtk.glib.List sibling, @NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        try {
            DowncallHandles.g_queue_insert_before_link.invokeExact(
                    handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code data} into {@code queue} using {@code func} to determine the new position.
     * @param func the {@link CompareDataFunc} used to compare elements in the queue. It is
     *     called with two elements of the {@code queue} and {@code user_data}. It should
     *     return 0 if the elements are equal, a negative value if the first
     *     element comes before the second, and a positive value if the second
     *     element comes before the first.
     */
    public void insertSorted(@NotNull org.gtk.glib.CompareDataFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_queue_insert_sorted.invokeExact(
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
     * Returns {@code true} if the queue is empty.
     * @return {@code true} if the queue is empty
     */
    public boolean isEmpty() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_queue_is_empty.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the position of {@code link_} in {@code queue}.
     * @param link a {@link List} link
     * @return the position of {@code link_}, or -1 if the link is
     *     not part of {@code queue}
     */
    public int linkIndex(@NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_queue_link_index.invokeExact(
                    handle(),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the first element of the queue.
     * @return the data of the first element in the queue, or {@code null}
     *     if the queue is empty
     */
    public @Nullable java.lang.foreign.MemoryAddress peekHead() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_peek_head.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the first link in {@code queue}.
     * @return the first link in {@code queue}, or {@code null} if {@code queue} is empty
     */
    public @NotNull org.gtk.glib.List peekHeadLink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_peek_head_link.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Returns the {@code n}'th element of {@code queue}.
     * @param n the position of the element
     * @return the data for the {@code n}'th element of {@code queue},
     *     or {@code null} if {@code n} is off the end of {@code queue}
     */
    public @Nullable java.lang.foreign.MemoryAddress peekNth(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_peek_nth.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the link at the given position
     * @param n the position of the link
     * @return the link at the {@code n}'th position, or {@code null}
     *     if {@code n} is off the end of the list
     */
    public @NotNull org.gtk.glib.List peekNthLink(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_peek_nth_link.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Returns the last element of the queue.
     * @return the data of the last element in the queue, or {@code null}
     *     if the queue is empty
     */
    public @Nullable java.lang.foreign.MemoryAddress peekTail() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_peek_tail.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the last link in {@code queue}.
     * @return the last link in {@code queue}, or {@code null} if {@code queue} is empty
     */
    public @NotNull org.gtk.glib.List peekTailLink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_peek_tail_link.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes the first element of the queue and returns its data.
     * @return the data of the first element in the queue, or {@code null}
     *     if the queue is empty
     */
    public @Nullable java.lang.foreign.MemoryAddress popHead() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_pop_head.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes and returns the first element of the queue.
     * @return the {@link List} element at the head of the queue, or {@code null}
     *     if the queue is empty
     */
    public @NotNull org.gtk.glib.List popHeadLink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_pop_head_link.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes the {@code n}'th element of {@code queue} and returns its data.
     * @param n the position of the element
     * @return the element's data, or {@code null} if {@code n} is off the end of {@code queue}
     */
    public @Nullable java.lang.foreign.MemoryAddress popNth(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_pop_nth.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes and returns the link at the given position.
     * @param n the link's position
     * @return the {@code n}'th link, or {@code null} if {@code n} is off the end of {@code queue}
     */
    public @NotNull org.gtk.glib.List popNthLink(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_pop_nth_link.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes the last element of the queue and returns its data.
     * @return the data of the last element in the queue, or {@code null}
     *     if the queue is empty
     */
    public @Nullable java.lang.foreign.MemoryAddress popTail() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_pop_tail.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes and returns the last element of the queue.
     * @return the {@link List} element at the tail of the queue, or {@code null}
     *     if the queue is empty
     */
    public @NotNull org.gtk.glib.List popTailLink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_pop_tail_link.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Adds a new element at the head of the queue.
     * @param data the data for the new element.
     */
    public void pushHead(@Nullable java.lang.foreign.MemoryAddress data) {
        try {
            DowncallHandles.g_queue_push_head.invokeExact(
                    handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a new element at the head of the queue.
     * @param link a single {@link List} element, not a list with more than one element
     */
    public void pushHeadLink(@NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        try {
            DowncallHandles.g_queue_push_head_link.invokeExact(
                    handle(),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts a new element into {@code queue} at the given position.
     * @param data the data for the new element
     * @param n the position to insert the new element. If {@code n} is negative or
     *     larger than the number of elements in the {@code queue}, the element is
     *     added to the end of the queue.
     */
    public void pushNth(@Nullable java.lang.foreign.MemoryAddress data, int n) {
        try {
            DowncallHandles.g_queue_push_nth.invokeExact(
                    handle(),
                    data,
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code link} into {@code queue} at the given position.
     * @param n the position to insert the link. If this is negative or larger than
     *     the number of elements in {@code queue}, the link is added to the end of
     *     {@code queue}.
     * @param link the link to add to {@code queue}
     */
    public void pushNthLink(int n, @NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        try {
            DowncallHandles.g_queue_push_nth_link.invokeExact(
                    handle(),
                    n,
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a new element at the tail of the queue.
     * @param data the data for the new element
     */
    public void pushTail(@Nullable java.lang.foreign.MemoryAddress data) {
        try {
            DowncallHandles.g_queue_push_tail.invokeExact(
                    handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a new element at the tail of the queue.
     * @param link a single {@link List} element, not a list with more than one element
     */
    public void pushTailLink(@NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        try {
            DowncallHandles.g_queue_push_tail_link.invokeExact(
                    handle(),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the first element in {@code queue} that contains {@code data}.
     * @param data the data to remove
     * @return {@code true} if {@code data} was found and removed from {@code queue}
     */
    public boolean remove(@Nullable java.lang.foreign.MemoryAddress data) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_queue_remove.invokeExact(
                    handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Remove all elements whose data equals {@code data} from {@code queue}.
     * @param data the data to remove
     * @return the number of elements removed from {@code queue}
     */
    public int removeAll(@Nullable java.lang.foreign.MemoryAddress data) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_queue_remove_all.invokeExact(
                    handle(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Reverses the order of the items in {@code queue}.
     */
    public void reverse() {
        try {
            DowncallHandles.g_queue_reverse.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sorts {@code queue} using {@code compare_func}.
     * @param compareFunc the {@link CompareDataFunc} used to sort {@code queue}. This function
     *     is passed two elements of the queue and should return 0 if they are
     *     equal, a negative value if the first comes before the second, and
     *     a positive value if the second comes before the first.
     */
    public void sort(@NotNull org.gtk.glib.CompareDataFunc compareFunc) {
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        try {
            DowncallHandles.g_queue_sort.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unlinks {@code link_} so that it will no longer be part of {@code queue}.
     * The link is not freed.
     * <p>
     * {@code link_} must be part of {@code queue}.
     * @param link a {@link List} link that must be part of {@code queue}
     */
    public void unlink(@NotNull org.gtk.glib.List link) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        try {
            DowncallHandles.g_queue_unlink.invokeExact(
                    handle(),
                    link.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Queue}.
     * @return a newly allocated {@link Queue}
     */
    public static @NotNull org.gtk.glib.Queue new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Queue(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_queue_clear = Interop.downcallHandle(
            "g_queue_clear",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_clear_full = Interop.downcallHandle(
            "g_queue_clear_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_copy = Interop.downcallHandle(
            "g_queue_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_delete_link = Interop.downcallHandle(
            "g_queue_delete_link",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_find = Interop.downcallHandle(
            "g_queue_find",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_find_custom = Interop.downcallHandle(
            "g_queue_find_custom",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_foreach = Interop.downcallHandle(
            "g_queue_foreach",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_free = Interop.downcallHandle(
            "g_queue_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_free_full = Interop.downcallHandle(
            "g_queue_free_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_get_length = Interop.downcallHandle(
            "g_queue_get_length",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_index = Interop.downcallHandle(
            "g_queue_index",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_init = Interop.downcallHandle(
            "g_queue_init",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_after = Interop.downcallHandle(
            "g_queue_insert_after",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_after_link = Interop.downcallHandle(
            "g_queue_insert_after_link",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_before = Interop.downcallHandle(
            "g_queue_insert_before",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_before_link = Interop.downcallHandle(
            "g_queue_insert_before_link",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_sorted = Interop.downcallHandle(
            "g_queue_insert_sorted",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_is_empty = Interop.downcallHandle(
            "g_queue_is_empty",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_link_index = Interop.downcallHandle(
            "g_queue_link_index",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_peek_head = Interop.downcallHandle(
            "g_queue_peek_head",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_peek_head_link = Interop.downcallHandle(
            "g_queue_peek_head_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_peek_nth = Interop.downcallHandle(
            "g_queue_peek_nth",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_queue_peek_nth_link = Interop.downcallHandle(
            "g_queue_peek_nth_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_queue_peek_tail = Interop.downcallHandle(
            "g_queue_peek_tail",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_peek_tail_link = Interop.downcallHandle(
            "g_queue_peek_tail_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_pop_head = Interop.downcallHandle(
            "g_queue_pop_head",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_pop_head_link = Interop.downcallHandle(
            "g_queue_pop_head_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_pop_nth = Interop.downcallHandle(
            "g_queue_pop_nth",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_queue_pop_nth_link = Interop.downcallHandle(
            "g_queue_pop_nth_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_queue_pop_tail = Interop.downcallHandle(
            "g_queue_pop_tail",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_pop_tail_link = Interop.downcallHandle(
            "g_queue_pop_tail_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_head = Interop.downcallHandle(
            "g_queue_push_head",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_head_link = Interop.downcallHandle(
            "g_queue_push_head_link",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_nth = Interop.downcallHandle(
            "g_queue_push_nth",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_queue_push_nth_link = Interop.downcallHandle(
            "g_queue_push_nth_link",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_tail = Interop.downcallHandle(
            "g_queue_push_tail",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_tail_link = Interop.downcallHandle(
            "g_queue_push_tail_link",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_remove = Interop.downcallHandle(
            "g_queue_remove",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_remove_all = Interop.downcallHandle(
            "g_queue_remove_all",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_reverse = Interop.downcallHandle(
            "g_queue_reverse",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_sort = Interop.downcallHandle(
            "g_queue_sort",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_unlink = Interop.downcallHandle(
            "g_queue_unlink",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_new = Interop.downcallHandle(
            "g_queue_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}

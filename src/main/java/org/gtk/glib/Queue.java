package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains the public fields of a
 * [Queue][glib-Double-ended-Queues].
 */
public class Queue extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GQueue";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("head"),
            Interop.valueLayout.ADDRESS.withName("tail"),
            Interop.valueLayout.C_INT.withName("length")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Queue}
     * @return A new, uninitialized @{link Queue}
     */
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
    public org.gtk.glib.List getHead() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("head"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code head}
     * @param head The new value of the field {@code head}
     */
    public void setHead(org.gtk.glib.List head) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("head"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (head == null ? MemoryAddress.NULL : head.handle()));
    }
    
    /**
     * Get the value of the field {@code tail}
     * @return The value of the field {@code tail}
     */
    public org.gtk.glib.List getTail() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tail"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code tail}
     * @param tail The new value of the field {@code tail}
     */
    public void setTail(org.gtk.glib.List tail) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tail"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tail == null ? MemoryAddress.NULL : tail.handle()));
    }
    
    /**
     * Get the value of the field {@code length}
     * @return The value of the field {@code length}
     */
    public int getLength_() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code length}
     * @param length The new value of the field {@code length}
     */
    public void setLength(int length) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
    }
    
    /**
     * Create a Queue proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Queue(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Queue> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Queue(input, ownership);
    
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
        try {
            DowncallHandles.g_queue_clear_full.invokeExact(
                    handle(),
                    (Addressable) (freeFunc == null ? MemoryAddress.NULL : (Addressable) freeFunc.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Copies a {@code queue}. Note that is a shallow copy. If the elements in the
     * queue consist of pointers to data, the pointers are copied, but the
     * actual data is not.
     * @return a copy of {@code queue}
     */
    public org.gtk.glib.Queue copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Queue.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes {@code link_} from {@code queue} and frees it.
     * <p>
     * {@code link_} must be part of {@code queue}.
     * @param link a {@link List} link that must be part of {@code queue}
     */
    public void deleteLink(org.gtk.glib.List link) {
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
     * @return the first link in {@code queue} which contains {@code data}
     */
    public org.gtk.glib.List find() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_find.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
    public org.gtk.glib.List findCustom(org.gtk.glib.CompareFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_find_custom.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) func.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Calls {@code func} for each element in the queue passing {@code user_data} to the
     * function.
     * <p>
     * It is safe for {@code func} to remove the element from {@code queue}, but it must
     * not modify any part of the queue after that element.
     * @param func the function to call for each element's data
     */
    public void foreach(org.gtk.glib.Func func) {
        try {
            DowncallHandles.g_queue_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public void freeFull(org.gtk.glib.DestroyNotify freeFunc) {
        try {
            DowncallHandles.g_queue_free_full.invokeExact(
                    handle(),
                    (Addressable) freeFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the position of the first element in {@code queue} which
     *     contains {@code data}, or -1 if no element in {@code queue} contains {@code data}
     */
    public int index() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_queue_index.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
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
     */
    public void insertAfter(@Nullable org.gtk.glib.List sibling) {
        try {
            DowncallHandles.g_queue_insert_after.invokeExact(
                    handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                    (Addressable) MemoryAddress.NULL);
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
    public void insertAfterLink(@Nullable org.gtk.glib.List sibling, org.gtk.glib.List link) {
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
     */
    public void insertBefore(@Nullable org.gtk.glib.List sibling) {
        try {
            DowncallHandles.g_queue_insert_before.invokeExact(
                    handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                    (Addressable) MemoryAddress.NULL);
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
    public void insertBeforeLink(@Nullable org.gtk.glib.List sibling, org.gtk.glib.List link) {
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
    public void insertSorted(org.gtk.glib.CompareDataFunc func) {
        try {
            DowncallHandles.g_queue_insert_sorted.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the position of {@code link_} in {@code queue}.
     * @param link a {@link List} link
     * @return the position of {@code link_}, or -1 if the link is
     *     not part of {@code queue}
     */
    public int linkIndex(org.gtk.glib.List link) {
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
    public org.gtk.glib.List peekHeadLink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_peek_head_link.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
    public org.gtk.glib.List peekNthLink(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_peek_nth_link.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
    public org.gtk.glib.List peekTailLink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_peek_tail_link.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
    public org.gtk.glib.List popHeadLink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_pop_head_link.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
    public org.gtk.glib.List popNthLink(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_pop_nth_link.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
    public org.gtk.glib.List popTailLink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_pop_tail_link.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Adds a new element at the head of the queue.
     */
    public void pushHead() {
        try {
            DowncallHandles.g_queue_push_head.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a new element at the head of the queue.
     * @param link a single {@link List} element, not a list with more than one element
     */
    public void pushHeadLink(org.gtk.glib.List link) {
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
     * @param n the position to insert the new element. If {@code n} is negative or
     *     larger than the number of elements in the {@code queue}, the element is
     *     added to the end of the queue.
     */
    public void pushNth(int n) {
        try {
            DowncallHandles.g_queue_push_nth.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
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
    public void pushNthLink(int n, org.gtk.glib.List link) {
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
     */
    public void pushTail() {
        try {
            DowncallHandles.g_queue_push_tail.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a new element at the tail of the queue.
     * @param link a single {@link List} element, not a list with more than one element
     */
    public void pushTailLink(org.gtk.glib.List link) {
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
     * @return {@code true} if {@code data} was found and removed from {@code queue}
     */
    public boolean remove() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_queue_remove.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Remove all elements whose data equals {@code data} from {@code queue}.
     * @return the number of elements removed from {@code queue}
     */
    public int removeAll() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_queue_remove_all.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
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
    public void sort(org.gtk.glib.CompareDataFunc compareFunc) {
        try {
            DowncallHandles.g_queue_sort.invokeExact(
                    handle(),
                    (Addressable) compareFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public void unlink(org.gtk.glib.List link) {
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
    public static org.gtk.glib.Queue new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_queue_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Queue.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_queue_clear = Interop.downcallHandle(
            "g_queue_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_clear_full = Interop.downcallHandle(
            "g_queue_clear_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_copy = Interop.downcallHandle(
            "g_queue_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_delete_link = Interop.downcallHandle(
            "g_queue_delete_link",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_find = Interop.downcallHandle(
            "g_queue_find",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_find_custom = Interop.downcallHandle(
            "g_queue_find_custom",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_foreach = Interop.downcallHandle(
            "g_queue_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_free = Interop.downcallHandle(
            "g_queue_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_free_full = Interop.downcallHandle(
            "g_queue_free_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_get_length = Interop.downcallHandle(
            "g_queue_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_index = Interop.downcallHandle(
            "g_queue_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_init = Interop.downcallHandle(
            "g_queue_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_after = Interop.downcallHandle(
            "g_queue_insert_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_after_link = Interop.downcallHandle(
            "g_queue_insert_after_link",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_before = Interop.downcallHandle(
            "g_queue_insert_before",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_before_link = Interop.downcallHandle(
            "g_queue_insert_before_link",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_insert_sorted = Interop.downcallHandle(
            "g_queue_insert_sorted",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_is_empty = Interop.downcallHandle(
            "g_queue_is_empty",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_link_index = Interop.downcallHandle(
            "g_queue_link_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_peek_head = Interop.downcallHandle(
            "g_queue_peek_head",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_peek_head_link = Interop.downcallHandle(
            "g_queue_peek_head_link",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_peek_nth = Interop.downcallHandle(
            "g_queue_peek_nth",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_queue_peek_nth_link = Interop.downcallHandle(
            "g_queue_peek_nth_link",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_queue_peek_tail = Interop.downcallHandle(
            "g_queue_peek_tail",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_peek_tail_link = Interop.downcallHandle(
            "g_queue_peek_tail_link",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_pop_head = Interop.downcallHandle(
            "g_queue_pop_head",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_pop_head_link = Interop.downcallHandle(
            "g_queue_pop_head_link",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_pop_nth = Interop.downcallHandle(
            "g_queue_pop_nth",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_queue_pop_nth_link = Interop.downcallHandle(
            "g_queue_pop_nth_link",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_queue_pop_tail = Interop.downcallHandle(
            "g_queue_pop_tail",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_pop_tail_link = Interop.downcallHandle(
            "g_queue_pop_tail_link",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_head = Interop.downcallHandle(
            "g_queue_push_head",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_head_link = Interop.downcallHandle(
            "g_queue_push_head_link",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_nth = Interop.downcallHandle(
            "g_queue_push_nth",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_queue_push_nth_link = Interop.downcallHandle(
            "g_queue_push_nth_link",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_tail = Interop.downcallHandle(
            "g_queue_push_tail",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_push_tail_link = Interop.downcallHandle(
            "g_queue_push_tail_link",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_remove = Interop.downcallHandle(
            "g_queue_remove",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_remove_all = Interop.downcallHandle(
            "g_queue_remove_all",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_reverse = Interop.downcallHandle(
            "g_queue_reverse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_sort = Interop.downcallHandle(
            "g_queue_sort",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_unlink = Interop.downcallHandle(
            "g_queue_unlink",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_queue_new = Interop.downcallHandle(
            "g_queue_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Queue.Builder} object constructs a {@link Queue} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Queue.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Queue struct;
        
        private Builder() {
            struct = Queue.allocate();
        }
        
         /**
         * Finish building the {@link Queue} struct.
         * @return A new instance of {@code Queue} with the fields 
         *         that were set in the Builder object.
         */
        public Queue build() {
            return struct;
        }
        
        /**
         * a pointer to the first element of the queue
         * @param head The value for the {@code head} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHead(org.gtk.glib.List head) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("head"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (head == null ? MemoryAddress.NULL : head.handle()));
            return this;
        }
        
        /**
         * a pointer to the last element of the queue
         * @param tail The value for the {@code tail} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTail(org.gtk.glib.List tail) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tail"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tail == null ? MemoryAddress.NULL : tail.handle()));
            return this;
        }
        
        /**
         * the number of elements in the queue
         * @param length The value for the {@code length} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLength(int length) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
            return this;
        }
    }
}

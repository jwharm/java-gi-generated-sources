package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Sequence} struct is an opaque data type representing a
 * [sequence][glib-Sequences] data type.
 */
public class Sequence extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSequence";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Sequence}
     * @return A new, uninitialized @{link Sequence}
     */
    public static Sequence allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Sequence newInstance = new Sequence(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Sequence proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Sequence(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Sequence> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Sequence(input);
    
    /**
     * Adds a new item to the end of {@code seq}.
     * @return an iterator pointing to the new item
     */
    public org.gtk.glib.SequenceIter append() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_append.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Calls {@code func} for each item in the sequence passing {@code user_data}
     * to the function. {@code func} must not modify the sequence itself.
     * @param func the function to call for each item in {@code seq}
     */
    public void foreach(org.gtk.glib.Func func) {
        try {
            DowncallHandles.g_sequence_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the memory allocated for {@code seq}. If {@code seq} has a data destroy
     * function associated with it, that function is called on all items
     * in {@code seq}.
     */
    public void free() {
        try {
            DowncallHandles.g_sequence_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the begin iterator for {@code seq}.
     * @return the begin iterator for {@code seq}.
     */
    public org.gtk.glib.SequenceIter getBeginIter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_get_begin_iter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the end iterator for {@code seg}
     * @return the end iterator for {@code seq}
     */
    public org.gtk.glib.SequenceIter getEndIter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_get_end_iter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the iterator at position {@code pos}. If {@code pos} is negative or larger
     * than the number of items in {@code seq}, the end iterator is returned.
     * @param pos a position in {@code seq}, or -1 for the end
     * @return The {@link SequenceIter} at position {@code pos}
     */
    public org.gtk.glib.SequenceIter getIterAtPos(int pos) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_get_iter_at_pos.invokeExact(
                    handle(),
                    pos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the positive length (&gt;= 0) of {@code seq}. Note that this method is
     * O(h) where `h' is the height of the tree. It is thus more efficient
     * to use g_sequence_is_empty() when comparing the length to zero.
     * @return the length of {@code seq}
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_sequence_get_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts {@code data} into {@code seq} using {@code cmp_func} to determine the new
     * position. The sequence must already be sorted according to {@code cmp_func};
     * otherwise the new position of {@code data} is undefined.
     * <p>
     * {@code cmp_func} is called with two items of the {@code seq}, and {@code cmp_data}.
     * It should return 0 if the items are equal, a negative value
     * if the first item comes before the second, and a positive value
     * if the second item comes before the first.
     * <p>
     * Note that when adding a large amount of data to a {@link Sequence},
     * it is more efficient to do unsorted insertions and then call
     * g_sequence_sort() or g_sequence_sort_iter().
     * @param cmpFunc the function used to compare items in the sequence
     * @return a {@link SequenceIter} pointing to the new item.
     */
    public org.gtk.glib.SequenceIter insertSorted(org.gtk.glib.CompareDataFunc cmpFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_insert_sorted.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) cmpFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Like g_sequence_insert_sorted(), but uses
     * a {@link SequenceIterCompareFunc} instead of a {@link CompareDataFunc} as
     * the compare function.
     * <p>
     * {@code iter_cmp} is called with two iterators pointing into {@code seq}.
     * It should return 0 if the iterators are equal, a negative
     * value if the first iterator comes before the second, and a
     * positive value if the second iterator comes before the first.
     * <p>
     * Note that when adding a large amount of data to a {@link Sequence},
     * it is more efficient to do unsorted insertions and then call
     * g_sequence_sort() or g_sequence_sort_iter().
     * @param iterCmp the function used to compare iterators in the sequence
     * @return a {@link SequenceIter} pointing to the new item
     */
    public org.gtk.glib.SequenceIter insertSortedIter(org.gtk.glib.SequenceIterCompareFunc iterCmp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_insert_sorted_iter.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) iterCmp.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns {@code true} if the sequence contains zero items.
     * <p>
     * This function is functionally identical to checking the result of
     * g_sequence_get_length() being equal to zero. However this function is
     * implemented in O(1) running time.
     * @return {@code true} if the sequence is empty, otherwise {@code false}.
     */
    public boolean isEmpty() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_sequence_is_empty.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns an iterator pointing to the position of the first item found
     * equal to {@code data} according to {@code cmp_func} and {@code cmp_data}. If more than one
     * item is equal, it is not guaranteed that it is the first which is
     * returned. In that case, you can use g_sequence_iter_next() and
     * g_sequence_iter_prev() to get others.
     * <p>
     * {@code cmp_func} is called with two items of the {@code seq}, and {@code cmp_data}.
     * It should return 0 if the items are equal, a negative value if
     * the first item comes before the second, and a positive value if
     * the second item comes before the first.
     * <p>
     * This function will fail if the data contained in the sequence is
     * unsorted.
     * @param cmpFunc the function used to compare items in the sequence
     * @return an {@link SequenceIter} pointing to the position of the
     *     first item found equal to {@code data} according to {@code cmp_func} and
     *     {@code cmp_data}, or {@code null} if no such item exists
     */
    public @Nullable org.gtk.glib.SequenceIter lookup(org.gtk.glib.CompareDataFunc cmpFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_lookup.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) cmpFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Like g_sequence_lookup(), but uses a {@link SequenceIterCompareFunc}
     * instead of a {@link CompareDataFunc} as the compare function.
     * <p>
     * {@code iter_cmp} is called with two iterators pointing into {@code seq}.
     * It should return 0 if the iterators are equal, a negative value
     * if the first iterator comes before the second, and a positive
     * value if the second iterator comes before the first.
     * <p>
     * This function will fail if the data contained in the sequence is
     * unsorted.
     * @param iterCmp the function used to compare iterators in the sequence
     * @return an {@link SequenceIter} pointing to the position of
     *     the first item found equal to {@code data} according to {@code iter_cmp}
     *     and {@code cmp_data}, or {@code null} if no such item exists
     */
    public @Nullable org.gtk.glib.SequenceIter lookupIter(org.gtk.glib.SequenceIterCompareFunc iterCmp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_lookup_iter.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) iterCmp.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Adds a new item to the front of {@code seq}
     * @return an iterator pointing to the new item
     */
    public org.gtk.glib.SequenceIter prepend() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_prepend.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns an iterator pointing to the position where {@code data} would
     * be inserted according to {@code cmp_func} and {@code cmp_data}.
     * <p>
     * {@code cmp_func} is called with two items of the {@code seq}, and {@code cmp_data}.
     * It should return 0 if the items are equal, a negative value if
     * the first item comes before the second, and a positive value if
     * the second item comes before the first.
     * <p>
     * If you are simply searching for an existing element of the sequence,
     * consider using g_sequence_lookup().
     * <p>
     * This function will fail if the data contained in the sequence is
     * unsorted.
     * @param cmpFunc the function used to compare items in the sequence
     * @return an {@link SequenceIter} pointing to the position where {@code data}
     *     would have been inserted according to {@code cmp_func} and {@code cmp_data}
     */
    public org.gtk.glib.SequenceIter search(org.gtk.glib.CompareDataFunc cmpFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_search.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) cmpFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Like g_sequence_search(), but uses a {@link SequenceIterCompareFunc}
     * instead of a {@link CompareDataFunc} as the compare function.
     * <p>
     * {@code iter_cmp} is called with two iterators pointing into {@code seq}.
     * It should return 0 if the iterators are equal, a negative value
     * if the first iterator comes before the second, and a positive
     * value if the second iterator comes before the first.
     * <p>
     * If you are simply searching for an existing element of the sequence,
     * consider using g_sequence_lookup_iter().
     * <p>
     * This function will fail if the data contained in the sequence is
     * unsorted.
     * @param iterCmp the function used to compare iterators in the sequence
     * @return a {@link SequenceIter} pointing to the position in {@code seq}
     *     where {@code data} would have been inserted according to {@code iter_cmp}
     *     and {@code cmp_data}
     */
    public org.gtk.glib.SequenceIter searchIter(org.gtk.glib.SequenceIterCompareFunc iterCmp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_search_iter.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) iterCmp.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Sorts {@code seq} using {@code cmp_func}.
     * <p>
     * {@code cmp_func} is passed two items of {@code seq} and should
     * return 0 if they are equal, a negative value if the
     * first comes before the second, and a positive value
     * if the second comes before the first.
     * @param cmpFunc the function used to sort the sequence
     */
    public void sort(org.gtk.glib.CompareDataFunc cmpFunc) {
        try {
            DowncallHandles.g_sequence_sort.invokeExact(
                    handle(),
                    (Addressable) cmpFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like g_sequence_sort(), but uses a {@link SequenceIterCompareFunc} instead
     * of a {@link CompareDataFunc} as the compare function
     * <p>
     * {@code cmp_func} is called with two iterators pointing into {@code seq}. It should
     * return 0 if the iterators are equal, a negative value if the first
     * iterator comes before the second, and a positive value if the second
     * iterator comes before the first.
     * @param cmpFunc the function used to compare iterators in the sequence
     */
    public void sortIter(org.gtk.glib.SequenceIterCompareFunc cmpFunc) {
        try {
            DowncallHandles.g_sequence_sort_iter.invokeExact(
                    handle(),
                    (Addressable) cmpFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls {@code func} for each item in the range ({@code begin}, {@code end}) passing
     * {@code user_data} to the function. {@code func} must not modify the sequence
     * itself.
     * @param begin a {@link SequenceIter}
     * @param end a {@link SequenceIter}
     * @param func a {@link Func}
     */
    public static void foreachRange(org.gtk.glib.SequenceIter begin, org.gtk.glib.SequenceIter end, org.gtk.glib.Func func) {
        try {
            DowncallHandles.g_sequence_foreach_range.invokeExact(
                    begin.handle(),
                    end.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the data that {@code iter} points to.
     * @param iter a {@link SequenceIter}
     * @return the data that {@code iter} points to
     */
    public static @Nullable java.lang.foreign.MemoryAddress get(org.gtk.glib.SequenceIter iter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_get.invokeExact(iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts a new item just before the item pointed to by {@code iter}.
     * @param iter a {@link SequenceIter}
     * @return an iterator pointing to the new item
     */
    public static org.gtk.glib.SequenceIter insertBefore(org.gtk.glib.SequenceIter iter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_insert_before.invokeExact(
                    iter.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Moves the item pointed to by {@code src} to the position indicated by {@code dest}.
     * After calling this function {@code dest} will point to the position immediately
     * after {@code src}. It is allowed for {@code src} and {@code dest} to point into different
     * sequences.
     * @param src a {@link SequenceIter} pointing to the item to move
     * @param dest a {@link SequenceIter} pointing to the position to which
     *     the item is moved
     */
    public static void move(org.gtk.glib.SequenceIter src, org.gtk.glib.SequenceIter dest) {
        try {
            DowncallHandles.g_sequence_move.invokeExact(
                    src.handle(),
                    dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts the ({@code begin}, {@code end}) range at the destination pointed to by {@code dest}.
     * The {@code begin} and {@code end} iters must point into the same sequence. It is
     * allowed for {@code dest} to point to a different sequence than the one pointed
     * into by {@code begin} and {@code end}.
     * <p>
     * If {@code dest} is {@code null}, the range indicated by {@code begin} and {@code end} is
     * removed from the sequence. If {@code dest} points to a place within
     * the ({@code begin}, {@code end}) range, the range does not move.
     * @param dest a {@link SequenceIter}
     * @param begin a {@link SequenceIter}
     * @param end a {@link SequenceIter}
     */
    public static void moveRange(org.gtk.glib.SequenceIter dest, org.gtk.glib.SequenceIter begin, org.gtk.glib.SequenceIter end) {
        try {
            DowncallHandles.g_sequence_move_range.invokeExact(
                    dest.handle(),
                    begin.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new GSequence. The {@code data_destroy} function, if non-{@code null} will
     * be called on all items when the sequence is destroyed and on items that
     * are removed from the sequence.
     * @param dataDestroy a {@link DestroyNotify} function, or {@code null}
     * @return a new {@link Sequence}
     */
    public static org.gtk.glib.Sequence new_(@Nullable org.gtk.glib.DestroyNotify dataDestroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_new.invokeExact((Addressable) (dataDestroy == null ? MemoryAddress.NULL : (Addressable) dataDestroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Sequence.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Finds an iterator somewhere in the range ({@code begin}, {@code end}). This
     * iterator will be close to the middle of the range, but is not
     * guaranteed to be exactly in the middle.
     * <p>
     * The {@code begin} and {@code end} iterators must both point to the same sequence
     * and {@code begin} must come before or be equal to {@code end} in the sequence.
     * @param begin a {@link SequenceIter}
     * @param end a {@link SequenceIter}
     * @return a {@link SequenceIter} pointing somewhere in the
     *    ({@code begin}, {@code end}) range
     */
    public static org.gtk.glib.SequenceIter rangeGetMidpoint(org.gtk.glib.SequenceIter begin, org.gtk.glib.SequenceIter end) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_range_get_midpoint.invokeExact(
                    begin.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Removes the item pointed to by {@code iter}. It is an error to pass the
     * end iterator to this function.
     * <p>
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed item.
     * @param iter a {@link SequenceIter}
     */
    public static void remove(org.gtk.glib.SequenceIter iter) {
        try {
            DowncallHandles.g_sequence_remove.invokeExact(iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all items in the ({@code begin}, {@code end}) range.
     * <p>
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed items.
     * @param begin a {@link SequenceIter}
     * @param end a {@link SequenceIter}
     */
    public static void removeRange(org.gtk.glib.SequenceIter begin, org.gtk.glib.SequenceIter end) {
        try {
            DowncallHandles.g_sequence_remove_range.invokeExact(
                    begin.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Changes the data for the item pointed to by {@code iter} to be {@code data}. If
     * the sequence has a data destroy function associated with it, that
     * function is called on the existing data that {@code iter} pointed to.
     * @param iter a {@link SequenceIter}
     */
    public static void set(org.gtk.glib.SequenceIter iter) {
        try {
            DowncallHandles.g_sequence_set.invokeExact(
                    iter.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves the data pointed to by {@code iter} to a new position as indicated by
     * {@code cmp_func}. This
     * function should be called for items in a sequence already sorted according
     * to {@code cmp_func} whenever some aspect of an item changes so that {@code cmp_func}
     * may return different values for that item.
     * <p>
     * {@code cmp_func} is called with two items of the {@code seq}, and {@code cmp_data}.
     * It should return 0 if the items are equal, a negative value if
     * the first item comes before the second, and a positive value if
     * the second item comes before the first.
     * @param iter A {@link SequenceIter}
     * @param cmpFunc the function used to compare items in the sequence
     */
    public static void sortChanged(org.gtk.glib.SequenceIter iter, org.gtk.glib.CompareDataFunc cmpFunc) {
        try {
            DowncallHandles.g_sequence_sort_changed.invokeExact(
                    iter.handle(),
                    (Addressable) cmpFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like g_sequence_sort_changed(), but uses
     * a {@link SequenceIterCompareFunc} instead of a {@link CompareDataFunc} as
     * the compare function.
     * <p>
     * {@code iter_cmp} is called with two iterators pointing into the {@link Sequence} that
     * {@code iter} points into. It should
     * return 0 if the iterators are equal, a negative value if the first
     * iterator comes before the second, and a positive value if the second
     * iterator comes before the first.
     * @param iter a {@link SequenceIter}
     * @param iterCmp the function used to compare iterators in the sequence
     */
    public static void sortChangedIter(org.gtk.glib.SequenceIter iter, org.gtk.glib.SequenceIterCompareFunc iterCmp) {
        try {
            DowncallHandles.g_sequence_sort_changed_iter.invokeExact(
                    iter.handle(),
                    (Addressable) iterCmp.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Swaps the items pointed to by {@code a} and {@code b}. It is allowed for {@code a} and {@code b}
     * to point into difference sequences.
     * @param a a {@link SequenceIter}
     * @param b a {@link SequenceIter}
     */
    public static void swap(org.gtk.glib.SequenceIter a, org.gtk.glib.SequenceIter b) {
        try {
            DowncallHandles.g_sequence_swap.invokeExact(
                    a.handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_sequence_append = Interop.downcallHandle(
                "g_sequence_append",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_foreach = Interop.downcallHandle(
                "g_sequence_foreach",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_free = Interop.downcallHandle(
                "g_sequence_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_get_begin_iter = Interop.downcallHandle(
                "g_sequence_get_begin_iter",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_get_end_iter = Interop.downcallHandle(
                "g_sequence_get_end_iter",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_get_iter_at_pos = Interop.downcallHandle(
                "g_sequence_get_iter_at_pos",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_sequence_get_length = Interop.downcallHandle(
                "g_sequence_get_length",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_insert_sorted = Interop.downcallHandle(
                "g_sequence_insert_sorted",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_insert_sorted_iter = Interop.downcallHandle(
                "g_sequence_insert_sorted_iter",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_is_empty = Interop.downcallHandle(
                "g_sequence_is_empty",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_lookup = Interop.downcallHandle(
                "g_sequence_lookup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_lookup_iter = Interop.downcallHandle(
                "g_sequence_lookup_iter",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_prepend = Interop.downcallHandle(
                "g_sequence_prepend",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_search = Interop.downcallHandle(
                "g_sequence_search",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_search_iter = Interop.downcallHandle(
                "g_sequence_search_iter",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_sort = Interop.downcallHandle(
                "g_sequence_sort",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_sort_iter = Interop.downcallHandle(
                "g_sequence_sort_iter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_foreach_range = Interop.downcallHandle(
                "g_sequence_foreach_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_get = Interop.downcallHandle(
                "g_sequence_get",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_insert_before = Interop.downcallHandle(
                "g_sequence_insert_before",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_move = Interop.downcallHandle(
                "g_sequence_move",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_move_range = Interop.downcallHandle(
                "g_sequence_move_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_new = Interop.downcallHandle(
                "g_sequence_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_range_get_midpoint = Interop.downcallHandle(
                "g_sequence_range_get_midpoint",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_remove = Interop.downcallHandle(
                "g_sequence_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_remove_range = Interop.downcallHandle(
                "g_sequence_remove_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_set = Interop.downcallHandle(
                "g_sequence_set",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_sort_changed = Interop.downcallHandle(
                "g_sequence_sort_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_sort_changed_iter = Interop.downcallHandle(
                "g_sequence_sort_changed_iter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_sequence_swap = Interop.downcallHandle(
                "g_sequence_swap",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
}

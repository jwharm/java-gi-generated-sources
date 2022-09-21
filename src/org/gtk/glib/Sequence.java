package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link Sequence} struct is an opaque data type representing a
 * [sequence][glib-Sequences] data type.
 */
public class Sequence extends io.github.jwharm.javagi.ResourceBase {

    public Sequence(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds a new item to the end of {@code seq}.
     */
    public SequenceIter append(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_append(handle(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Calls {@code func} for each item in the sequence passing {@code user_data}
     * to the function. {@code func} must not modify the sequence itself.
     */
    public void foreach(Func func) {
        try {
            gtk_h.g_sequence_foreach(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Frees the memory allocated for {@code seq}. If {@code seq} has a data destroy
     * function associated with it, that function is called on all items
     * in {@code seq}.
     */
    public void free() {
        gtk_h.g_sequence_free(handle());
    }
    
    /**
     * Returns the begin iterator for {@code seq}.
     */
    public SequenceIter getBeginIter() {
        var RESULT = gtk_h.g_sequence_get_begin_iter(handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the end iterator for {@code seg}
     */
    public SequenceIter getEndIter() {
        var RESULT = gtk_h.g_sequence_get_end_iter(handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the iterator at position {@code pos}. If {@code pos} is negative or larger
     * than the number of items in {@code seq}, the end iterator is returned.
     */
    public SequenceIter getIterAtPos(int pos) {
        var RESULT = gtk_h.g_sequence_get_iter_at_pos(handle(), pos);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the positive length (>= 0) of {@code seq}. Note that this method is
     * O(h) where `h' is the height of the tree. It is thus more efficient
     * to use g_sequence_is_empty() when comparing the length to zero.
     */
    public int getLength() {
        var RESULT = gtk_h.g_sequence_get_length(handle());
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
     */
    public SequenceIter insertSorted(CompareDataFunc cmpFunc) {
        try {
            var RESULT = gtk_h.g_sequence_insert_sorted(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cmpFunc.hashCode(), cmpFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cmpFunc.hashCode(), cmpFunc)));
            return new SequenceIter(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
     */
    public SequenceIter insertSortedIter(SequenceIterCompareFunc iterCmp) {
        try {
            var RESULT = gtk_h.g_sequence_insert_sorted_iter(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(iterCmp.hashCode(), iterCmp)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(iterCmp.hashCode(), iterCmp)));
            return new SequenceIter(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns <code>true</code> if the sequence contains zero items.
     * <p>
     * This function is functionally identical to checking the result of
     * g_sequence_get_length() being equal to zero. However this function is
     * implemented in O(1) running time.
     */
    public boolean isEmpty() {
        var RESULT = gtk_h.g_sequence_is_empty(handle());
        return (RESULT != 0);
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
     */
    public SequenceIter lookup(CompareDataFunc cmpFunc) {
        try {
            var RESULT = gtk_h.g_sequence_lookup(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cmpFunc.hashCode(), cmpFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cmpFunc.hashCode(), cmpFunc)));
            return new SequenceIter(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
     */
    public SequenceIter lookupIter(SequenceIterCompareFunc iterCmp) {
        try {
            var RESULT = gtk_h.g_sequence_lookup_iter(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(iterCmp.hashCode(), iterCmp)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(iterCmp.hashCode(), iterCmp)));
            return new SequenceIter(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Adds a new item to the front of {@code seq}
     */
    public SequenceIter prepend(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_prepend(handle(), data);
        return new SequenceIter(References.get(RESULT, false));
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
     */
    public SequenceIter search(CompareDataFunc cmpFunc) {
        try {
            var RESULT = gtk_h.g_sequence_search(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cmpFunc.hashCode(), cmpFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cmpFunc.hashCode(), cmpFunc)));
            return new SequenceIter(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
     */
    public SequenceIter searchIter(SequenceIterCompareFunc iterCmp) {
        try {
            var RESULT = gtk_h.g_sequence_search_iter(handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(iterCmp.hashCode(), iterCmp)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(iterCmp.hashCode(), iterCmp)));
            return new SequenceIter(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sorts {@code seq} using {@code cmp_func}.
     * <p>
     * {@code cmp_func} is passed two items of {@code seq} and should
     * return 0 if they are equal, a negative value if the
     * first comes before the second, and a positive value
     * if the second comes before the first.
     */
    public void sort(CompareDataFunc cmpFunc) {
        try {
            gtk_h.g_sequence_sort(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cmpFunc.hashCode(), cmpFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
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
     */
    public void sortIter(SequenceIterCompareFunc cmpFunc) {
        try {
            gtk_h.g_sequence_sort_iter(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cmpFunc.hashCode(), cmpFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls {@code func} for each item in the range ({@code begin}, {@code end}) passing
     * {@code user_data} to the function. {@code func} must not modify the sequence
     * itself.
     */
    public static void foreachRange(SequenceIter begin, SequenceIter end, Func func) {
        try {
            gtk_h.g_sequence_foreach_range(begin.handle(), end.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns the data that {@code iter} points to.
     */
    public static jdk.incubator.foreign.MemoryAddress get(SequenceIter iter) {
        var RESULT = gtk_h.g_sequence_get(iter.handle());
        return RESULT;
    }
    
    /**
     * Inserts a new item just before the item pointed to by {@code iter}.
     */
    public static SequenceIter insertBefore(SequenceIter iter, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_insert_before(iter.handle(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Moves the item pointed to by {@code src} to the position indicated by {@code dest}.
     * After calling this function {@code dest} will point to the position immediately
     * after {@code src}. It is allowed for {@code src} and {@code dest} to point into different
     * sequences.
     */
    public static void move(SequenceIter src, SequenceIter dest) {
        gtk_h.g_sequence_move(src.handle(), dest.handle());
    }
    
    /**
     * Inserts the ({@code begin}, {@code end}) range at the destination pointed to by {@code dest}.
     * The {@code begin} and {@code end} iters must point into the same sequence. It is
     * allowed for {@code dest} to point to a different sequence than the one pointed
     * into by {@code begin} and {@code end}.
     * <p>
     * If {@code dest} is <code>null</code>, the range indicated by {@code begin} and {@code end} is
     * removed from the sequence. If {@code dest} points to a place within
     * the ({@code begin}, {@code end}) range, the range does not move.
     */
    public static void moveRange(SequenceIter dest, SequenceIter begin, SequenceIter end) {
        gtk_h.g_sequence_move_range(dest.handle(), begin.handle(), end.handle());
    }
    
    /**
     * Finds an iterator somewhere in the range ({@code begin}, {@code end}). This
     * iterator will be close to the middle of the range, but is not
     * guaranteed to be exactly in the middle.
     * <p>
     * The {@code begin} and {@code end} iterators must both point to the same sequence
     * and {@code begin} must come before or be equal to {@code end} in the sequence.
     */
    public static SequenceIter rangeGetMidpoint(SequenceIter begin, SequenceIter end) {
        var RESULT = gtk_h.g_sequence_range_get_midpoint(begin.handle(), end.handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Removes the item pointed to by {@code iter}. It is an error to pass the
     * end iterator to this function.
     * <p>
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed item.
     */
    public static void remove(SequenceIter iter) {
        gtk_h.g_sequence_remove(iter.handle());
    }
    
    /**
     * Removes all items in the ({@code begin}, {@code end}) range.
     * <p>
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed items.
     */
    public static void removeRange(SequenceIter begin, SequenceIter end) {
        gtk_h.g_sequence_remove_range(begin.handle(), end.handle());
    }
    
    /**
     * Changes the data for the item pointed to by {@code iter} to be {@code data}. If
     * the sequence has a data destroy function associated with it, that
     * function is called on the existing data that {@code iter} pointed to.
     */
    public static void set(SequenceIter iter, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_sequence_set(iter.handle(), data);
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
     */
    public static void sortChanged(SequenceIter iter, CompareDataFunc cmpFunc) {
        try {
            gtk_h.g_sequence_sort_changed(iter.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cmpFunc.hashCode(), cmpFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
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
     */
    public static void sortChangedIter(SequenceIter iter, SequenceIterCompareFunc iterCmp) {
        try {
            gtk_h.g_sequence_sort_changed_iter(iter.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(iterCmp.hashCode(), iterCmp)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Swaps the items pointed to by @a and @b. It is allowed for @a and @b
     * to point into difference sequences.
     */
    public static void swap(SequenceIter a, SequenceIter b) {
        gtk_h.g_sequence_swap(a.handle(), b.handle());
    }
    
}

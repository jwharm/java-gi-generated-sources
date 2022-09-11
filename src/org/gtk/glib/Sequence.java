package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GSequence struct is an opaque data type representing a
 * [sequence][glib-Sequences] data type.
 */
public class Sequence extends io.github.jwharm.javagi.interop.ResourceBase {

    public Sequence(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds a new item to the end of @seq.
     */
    public SequenceIter append(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_append(handle(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Calls @func for each item in the sequence passing @user_data
     * to the function. @func must not modify the sequence itself.
     */
    public void foreach(Sequence seq, Func func) {
        try {
            int hash = func.hashCode();
            Interop.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_foreach(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Frees the memory allocated for @seq. If @seq has a data destroy
     * function associated with it, that function is called on all items
     * in @seq.
     */
    public void free() {
        gtk_h.g_sequence_free(handle());
    }
    
    /**
     * Returns the begin iterator for @seq.
     */
    public SequenceIter getBeginIter() {
        var RESULT = gtk_h.g_sequence_get_begin_iter(handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the end iterator for @seg
     */
    public SequenceIter getEndIter() {
        var RESULT = gtk_h.g_sequence_get_end_iter(handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the iterator at position @pos. If @pos is negative or larger
     * than the number of items in @seq, the end iterator is returned.
     */
    public SequenceIter getIterAtPos(int pos) {
        var RESULT = gtk_h.g_sequence_get_iter_at_pos(handle(), pos);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the positive length (>= 0) of @seq. Note that this method is
     * O(h) where `h' is the height of the tree. It is thus more efficient
     * to use g_sequence_is_empty() when comparing the length to zero.
     */
    public int getLength() {
        var RESULT = gtk_h.g_sequence_get_length(handle());
        return RESULT;
    }
    
    /**
     * Inserts @data into @seq using @cmp_func to determine the new
     * position. The sequence must already be sorted according to @cmp_func;
     * otherwise the new position of @data is undefined.
     * 
     * @cmp_func is called with two items of the @seq, and @cmp_data.
     * It should return 0 if the items are equal, a negative value
     * if the first item comes before the second, and a positive value
     * if the second item comes before the first.
     * 
     * Note that when adding a large amount of data to a #GSequence,
     * it is more efficient to do unsorted insertions and then call
     * g_sequence_sort() or g_sequence_sort_iter().
     */
    public SequenceIter insertSorted(Sequence seq, CompareDataFunc cmpFunc) {
        try {
            int hash = cmpFunc.hashCode();
            Interop.signalRegistry.put(hash, cmpFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_insert_sorted(handle(), intSegment, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_sequence_insert_sorted(), but uses
     * a #GSequenceIterCompareFunc instead of a #GCompareDataFunc as
     * the compare function.
     * 
     * @iter_cmp is called with two iterators pointing into @seq.
     * It should return 0 if the iterators are equal, a negative
     * value if the first iterator comes before the second, and a
     * positive value if the second iterator comes before the first.
     * 
     * Note that when adding a large amount of data to a #GSequence,
     * it is more efficient to do unsorted insertions and then call
     * g_sequence_sort() or g_sequence_sort_iter().
     */
    public SequenceIter insertSortedIter(Sequence seq, SequenceIterCompareFunc iterCmp) {
        try {
            int hash = iterCmp.hashCode();
            Interop.signalRegistry.put(hash, iterCmp);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_insert_sorted_iter(handle(), intSegment, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns %TRUE if the sequence contains zero items.
     * 
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
     * equal to @data according to @cmp_func and @cmp_data. If more than one
     * item is equal, it is not guaranteed that it is the first which is
     * returned. In that case, you can use g_sequence_iter_next() and
     * g_sequence_iter_prev() to get others.
     * 
     * @cmp_func is called with two items of the @seq, and @cmp_data.
     * It should return 0 if the items are equal, a negative value if
     * the first item comes before the second, and a positive value if
     * the second item comes before the first.
     * 
     * This function will fail if the data contained in the sequence is
     * unsorted.
     */
    public SequenceIter lookup(Sequence seq, CompareDataFunc cmpFunc) {
        try {
            int hash = cmpFunc.hashCode();
            Interop.signalRegistry.put(hash, cmpFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_lookup(handle(), intSegment, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_sequence_lookup(), but uses a #GSequenceIterCompareFunc
     * instead of a #GCompareDataFunc as the compare function.
     * 
     * @iter_cmp is called with two iterators pointing into @seq.
     * It should return 0 if the iterators are equal, a negative value
     * if the first iterator comes before the second, and a positive
     * value if the second iterator comes before the first.
     * 
     * This function will fail if the data contained in the sequence is
     * unsorted.
     */
    public SequenceIter lookupIter(Sequence seq, SequenceIterCompareFunc iterCmp) {
        try {
            int hash = iterCmp.hashCode();
            Interop.signalRegistry.put(hash, iterCmp);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_lookup_iter(handle(), intSegment, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Adds a new item to the front of @seq
     */
    public SequenceIter prepend(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_prepend(handle(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns an iterator pointing to the position where @data would
     * be inserted according to @cmp_func and @cmp_data.
     * 
     * @cmp_func is called with two items of the @seq, and @cmp_data.
     * It should return 0 if the items are equal, a negative value if
     * the first item comes before the second, and a positive value if
     * the second item comes before the first.
     * 
     * If you are simply searching for an existing element of the sequence,
     * consider using g_sequence_lookup().
     * 
     * This function will fail if the data contained in the sequence is
     * unsorted.
     */
    public SequenceIter search(Sequence seq, CompareDataFunc cmpFunc) {
        try {
            int hash = cmpFunc.hashCode();
            Interop.signalRegistry.put(hash, cmpFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_search(handle(), intSegment, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_sequence_search(), but uses a #GSequenceIterCompareFunc
     * instead of a #GCompareDataFunc as the compare function.
     * 
     * @iter_cmp is called with two iterators pointing into @seq.
     * It should return 0 if the iterators are equal, a negative value
     * if the first iterator comes before the second, and a positive
     * value if the second iterator comes before the first.
     * 
     * If you are simply searching for an existing element of the sequence,
     * consider using g_sequence_lookup_iter().
     * 
     * This function will fail if the data contained in the sequence is
     * unsorted.
     */
    public SequenceIter searchIter(Sequence seq, SequenceIterCompareFunc iterCmp) {
        try {
            int hash = iterCmp.hashCode();
            Interop.signalRegistry.put(hash, iterCmp);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_search_iter(handle(), intSegment, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sorts @seq using @cmp_func.
     * 
     * @cmp_func is passed two items of @seq and should
     * return 0 if they are equal, a negative value if the
     * first comes before the second, and a positive value
     * if the second comes before the first.
     */
    public void sort(Sequence seq, CompareDataFunc cmpFunc) {
        try {
            int hash = cmpFunc.hashCode();
            Interop.signalRegistry.put(hash, cmpFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_sort(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_sequence_sort(), but uses a #GSequenceIterCompareFunc instead
     * of a #GCompareDataFunc as the compare function
     * 
     * @cmp_func is called with two iterators pointing into @seq. It should
     * return 0 if the iterators are equal, a negative value if the first
     * iterator comes before the second, and a positive value if the second
     * iterator comes before the first.
     */
    public void sortIter(Sequence seq, SequenceIterCompareFunc cmpFunc) {
        try {
            int hash = cmpFunc.hashCode();
            Interop.signalRegistry.put(hash, cmpFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_sort_iter(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls @func for each item in the range (@begin, @end) passing
     * @user_data to the function. @func must not modify the sequence
     * itself.
     */
    public void foreachRange(SequenceIter begin, SequenceIter end, Func func) {
        try {
            int hash = func.hashCode();
            Interop.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_foreach_range(begin.handle(), end.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns the data that @iter points to.
     */
    public static jdk.incubator.foreign.MemoryAddress get(SequenceIter iter) {
        var RESULT = gtk_h.g_sequence_get(iter.handle());
        return RESULT;
    }
    
    /**
     * Inserts a new item just before the item pointed to by @iter.
     */
    public static SequenceIter insertBefore(SequenceIter iter, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_insert_before(iter.handle(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Moves the item pointed to by @src to the position indicated by @dest.
     * After calling this function @dest will point to the position immediately
     * after @src. It is allowed for @src and @dest to point into different
     * sequences.
     */
    public static void move(SequenceIter src, SequenceIter dest) {
        gtk_h.g_sequence_move(src.handle(), dest.handle());
    }
    
    /**
     * Inserts the (@begin, @end) range at the destination pointed to by @dest.
     * The @begin and @end iters must point into the same sequence. It is
     * allowed for @dest to point to a different sequence than the one pointed
     * into by @begin and @end.
     * 
     * If @dest is %NULL, the range indicated by @begin and @end is
     * removed from the sequence. If @dest points to a place within
     * the (@begin, @end) range, the range does not move.
     */
    public static void moveRange(SequenceIter dest, SequenceIter begin, SequenceIter end) {
        gtk_h.g_sequence_move_range(dest.handle(), begin.handle(), end.handle());
    }
    
    /**
     * Finds an iterator somewhere in the range (@begin, @end). This
     * iterator will be close to the middle of the range, but is not
     * guaranteed to be exactly in the middle.
     * 
     * The @begin and @end iterators must both point to the same sequence
     * and @begin must come before or be equal to @end in the sequence.
     */
    public static SequenceIter rangeGetMidpoint(SequenceIter begin, SequenceIter end) {
        var RESULT = gtk_h.g_sequence_range_get_midpoint(begin.handle(), end.handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Removes the item pointed to by @iter. It is an error to pass the
     * end iterator to this function.
     * 
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed item.
     */
    public static void remove(SequenceIter iter) {
        gtk_h.g_sequence_remove(iter.handle());
    }
    
    /**
     * Removes all items in the (@begin, @end) range.
     * 
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed items.
     */
    public static void removeRange(SequenceIter begin, SequenceIter end) {
        gtk_h.g_sequence_remove_range(begin.handle(), end.handle());
    }
    
    /**
     * Changes the data for the item pointed to by @iter to be @data. If
     * the sequence has a data destroy function associated with it, that
     * function is called on the existing data that @iter pointed to.
     */
    public static void set(SequenceIter iter, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_sequence_set(iter.handle(), data);
    }
    
    /**
     * Moves the data pointed to by @iter to a new position as indicated by
     * @cmp_func. This
     * function should be called for items in a sequence already sorted according
     * to @cmp_func whenever some aspect of an item changes so that @cmp_func
     * may return different values for that item.
     * 
     * @cmp_func is called with two items of the @seq, and @cmp_data.
     * It should return 0 if the items are equal, a negative value if
     * the first item comes before the second, and a positive value if
     * the second item comes before the first.
     */
    public void sortChanged(SequenceIter iter, CompareDataFunc cmpFunc) {
        try {
            int hash = cmpFunc.hashCode();
            Interop.signalRegistry.put(hash, cmpFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_sort_changed(iter.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_sequence_sort_changed(), but uses
     * a #GSequenceIterCompareFunc instead of a #GCompareDataFunc as
     * the compare function.
     * 
     * @iter_cmp is called with two iterators pointing into the #GSequence that
     * @iter points into. It should
     * return 0 if the iterators are equal, a negative value if the first
     * iterator comes before the second, and a positive value if the second
     * iterator comes before the first.
     */
    public void sortChangedIter(SequenceIter iter, SequenceIterCompareFunc iterCmp) {
        try {
            int hash = iterCmp.hashCode();
            Interop.signalRegistry.put(hash, iterCmp);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSequenceIterCompareFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_sequence_sort_changed_iter(iter.handle(), nativeSymbol, intSegment);
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

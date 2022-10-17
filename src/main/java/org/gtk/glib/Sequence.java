package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Sequence} struct is an opaque data type representing a
 * [sequence][glib-Sequences] data type.
 */
public class Sequence extends io.github.jwharm.javagi.ResourceBase {

    public Sequence(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_sequence_append = Interop.downcallHandle(
        "g_sequence_append",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new item to the end of {@code seq}.
     */
    public @NotNull SequenceIter append(@Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_append.invokeExact(handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_foreach = Interop.downcallHandle(
        "g_sequence_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code func} for each item in the sequence passing {@code user_data}
     * to the function. {@code func} must not modify the sequence itself.
     */
    public @NotNull void foreach(@NotNull Func func) {
        try {
            g_sequence_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_free = Interop.downcallHandle(
        "g_sequence_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the memory allocated for {@code seq}. If {@code seq} has a data destroy
     * function associated with it, that function is called on all items
     * in {@code seq}.
     */
    public @NotNull void free() {
        try {
            g_sequence_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_get_begin_iter = Interop.downcallHandle(
        "g_sequence_get_begin_iter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the begin iterator for {@code seq}.
     */
    public @NotNull SequenceIter getBeginIter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_get_begin_iter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_get_end_iter = Interop.downcallHandle(
        "g_sequence_get_end_iter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the end iterator for {@code seg}
     */
    public @NotNull SequenceIter getEndIter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_get_end_iter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_get_iter_at_pos = Interop.downcallHandle(
        "g_sequence_get_iter_at_pos",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the iterator at position {@code pos}. If {@code pos} is negative or larger
     * than the number of items in {@code seq}, the end iterator is returned.
     */
    public @NotNull SequenceIter getIterAtPos(@NotNull int pos) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_get_iter_at_pos.invokeExact(handle(), pos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_get_length = Interop.downcallHandle(
        "g_sequence_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the positive length (>= 0) of {@code seq}. Note that this method is
     * O(h) where `h' is the height of the tree. It is thus more efficient
     * to use g_sequence_is_empty() when comparing the length to zero.
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) g_sequence_get_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_sequence_insert_sorted = Interop.downcallHandle(
        "g_sequence_insert_sorted",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull SequenceIter insertSorted(@NotNull CompareDataFunc cmpFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_insert_sorted.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cmpFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cmpFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_insert_sorted_iter = Interop.downcallHandle(
        "g_sequence_insert_sorted_iter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull SequenceIter insertSortedIter(@NotNull SequenceIterCompareFunc iterCmp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_insert_sorted_iter.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(iterCmp)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(iterCmp)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_is_empty = Interop.downcallHandle(
        "g_sequence_is_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the sequence contains zero items.
     * <p>
     * This function is functionally identical to checking the result of
     * g_sequence_get_length() being equal to zero. However this function is
     * implemented in O(1) running time.
     */
    public boolean isEmpty() {
        int RESULT;
        try {
            RESULT = (int) g_sequence_is_empty.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_sequence_lookup = Interop.downcallHandle(
        "g_sequence_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @Nullable SequenceIter lookup(@NotNull CompareDataFunc cmpFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_lookup.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cmpFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cmpFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_lookup_iter = Interop.downcallHandle(
        "g_sequence_lookup_iter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @Nullable SequenceIter lookupIter(@NotNull SequenceIterCompareFunc iterCmp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_lookup_iter.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(iterCmp)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(iterCmp)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_prepend = Interop.downcallHandle(
        "g_sequence_prepend",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new item to the front of {@code seq}
     */
    public @NotNull SequenceIter prepend(@Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_prepend.invokeExact(handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_search = Interop.downcallHandle(
        "g_sequence_search",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull SequenceIter search(@NotNull CompareDataFunc cmpFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_search.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cmpFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cmpFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_search_iter = Interop.downcallHandle(
        "g_sequence_search_iter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull SequenceIter searchIter(@NotNull SequenceIterCompareFunc iterCmp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_search_iter.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(iterCmp)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(iterCmp)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_sort = Interop.downcallHandle(
        "g_sequence_sort",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sorts {@code seq} using {@code cmp_func}.
     * <p>
     * {@code cmp_func} is passed two items of {@code seq} and should
     * return 0 if they are equal, a negative value if the
     * first comes before the second, and a positive value
     * if the second comes before the first.
     */
    public @NotNull void sort(@NotNull CompareDataFunc cmpFunc) {
        try {
            g_sequence_sort.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cmpFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_sort_iter = Interop.downcallHandle(
        "g_sequence_sort_iter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_sequence_sort(), but uses a {@link SequenceIterCompareFunc} instead
     * of a {@link CompareDataFunc} as the compare function
     * <p>
     * {@code cmp_func} is called with two iterators pointing into {@code seq}. It should
     * return 0 if the iterators are equal, a negative value if the first
     * iterator comes before the second, and a positive value if the second
     * iterator comes before the first.
     */
    public @NotNull void sortIter(@NotNull SequenceIterCompareFunc cmpFunc) {
        try {
            g_sequence_sort_iter.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cmpFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_foreach_range = Interop.downcallHandle(
        "g_sequence_foreach_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code func} for each item in the range ({@code begin}, {@code end}) passing
     * {@code user_data} to the function. {@code func} must not modify the sequence
     * itself.
     */
    public static @NotNull void foreachRange(@NotNull SequenceIter begin, @NotNull SequenceIter end, @NotNull Func func) {
        try {
            g_sequence_foreach_range.invokeExact(begin.handle(), end.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_get = Interop.downcallHandle(
        "g_sequence_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the data that {@code iter} points to.
     */
    public static @Nullable java.lang.foreign.MemoryAddress get(@NotNull SequenceIter iter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_get.invokeExact(iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_sequence_insert_before = Interop.downcallHandle(
        "g_sequence_insert_before",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new item just before the item pointed to by {@code iter}.
     */
    public static @NotNull SequenceIter insertBefore(@NotNull SequenceIter iter, @Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_insert_before.invokeExact(iter.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_move = Interop.downcallHandle(
        "g_sequence_move",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the item pointed to by {@code src} to the position indicated by {@code dest}.
     * After calling this function {@code dest} will point to the position immediately
     * after {@code src}. It is allowed for {@code src} and {@code dest} to point into different
     * sequences.
     */
    public static @NotNull void move(@NotNull SequenceIter src, @NotNull SequenceIter dest) {
        try {
            g_sequence_move.invokeExact(src.handle(), dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_move_range = Interop.downcallHandle(
        "g_sequence_move_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts the ({@code begin}, {@code end}) range at the destination pointed to by {@code dest}.
     * The {@code begin} and {@code end} iters must point into the same sequence. It is
     * allowed for {@code dest} to point to a different sequence than the one pointed
     * into by {@code begin} and {@code end}.
     * <p>
     * If {@code dest} is {@code null}, the range indicated by {@code begin} and {@code end} is
     * removed from the sequence. If {@code dest} points to a place within
     * the ({@code begin}, {@code end}) range, the range does not move.
     */
    public static @NotNull void moveRange(@NotNull SequenceIter dest, @NotNull SequenceIter begin, @NotNull SequenceIter end) {
        try {
            g_sequence_move_range.invokeExact(dest.handle(), begin.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_range_get_midpoint = Interop.downcallHandle(
        "g_sequence_range_get_midpoint",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds an iterator somewhere in the range ({@code begin}, {@code end}). This
     * iterator will be close to the middle of the range, but is not
     * guaranteed to be exactly in the middle.
     * <p>
     * The {@code begin} and {@code end} iterators must both point to the same sequence
     * and {@code begin} must come before or be equal to {@code end} in the sequence.
     */
    public static @NotNull SequenceIter rangeGetMidpoint(@NotNull SequenceIter begin, @NotNull SequenceIter end) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_range_get_midpoint.invokeExact(begin.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_remove = Interop.downcallHandle(
        "g_sequence_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the item pointed to by {@code iter}. It is an error to pass the
     * end iterator to this function.
     * <p>
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed item.
     */
    public static @NotNull void remove(@NotNull SequenceIter iter) {
        try {
            g_sequence_remove.invokeExact(iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_remove_range = Interop.downcallHandle(
        "g_sequence_remove_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all items in the ({@code begin}, {@code end}) range.
     * <p>
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed items.
     */
    public static @NotNull void removeRange(@NotNull SequenceIter begin, @NotNull SequenceIter end) {
        try {
            g_sequence_remove_range.invokeExact(begin.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_set = Interop.downcallHandle(
        "g_sequence_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Changes the data for the item pointed to by {@code iter} to be {@code data}. If
     * the sequence has a data destroy function associated with it, that
     * function is called on the existing data that {@code iter} pointed to.
     */
    public static @NotNull void set(@NotNull SequenceIter iter, @Nullable java.lang.foreign.MemoryAddress data) {
        try {
            g_sequence_set.invokeExact(iter.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_sort_changed = Interop.downcallHandle(
        "g_sequence_sort_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public static @NotNull void sortChanged(@NotNull SequenceIter iter, @NotNull CompareDataFunc cmpFunc) {
        try {
            g_sequence_sort_changed.invokeExact(iter.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cmpFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_sort_changed_iter = Interop.downcallHandle(
        "g_sequence_sort_changed_iter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public static @NotNull void sortChangedIter(@NotNull SequenceIter iter, @NotNull SequenceIterCompareFunc iterCmp) {
        try {
            g_sequence_sort_changed_iter.invokeExact(iter.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSequenceIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(iterCmp)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_sequence_swap = Interop.downcallHandle(
        "g_sequence_swap",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Swaps the items pointed to by @a and @b. It is allowed for @a and @b
     * to point into difference sequences.
     */
    public static @NotNull void swap(@NotNull SequenceIter a, @NotNull SequenceIter b) {
        try {
            g_sequence_swap.invokeExact(a.handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

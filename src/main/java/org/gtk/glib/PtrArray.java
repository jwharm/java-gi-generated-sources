package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains the public fields of a pointer array.
 */
public class PtrArray extends io.github.jwharm.javagi.ResourceBase {

    public PtrArray(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_ptr_array_add = Interop.downcallHandle(
        "g_ptr_array_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a pointer to the end of the pointer array. The array will grow
     * in size automatically if necessary.
     */
    public static @NotNull void add(@NotNull java.lang.foreign.MemoryAddress[] array, @Nullable java.lang.foreign.MemoryAddress data) {
        try {
            g_ptr_array_add.invokeExact(Interop.allocateNativeArray(array), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_ptr_array_copy = Interop.downcallHandle(
        "g_ptr_array_copy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a full (deep) copy of a {@link PtrArray}.
     * <p>
     * {@code func}, as a {@link CopyFunc}, takes two arguments, the data to be copied
     * and a {@code user_data} pointer. On common processor architectures, it's safe to
     * pass {@code null} as {@code user_data} if the copy function takes only one argument. You
     * may get compiler warnings from this though if compiling with GCC’s
     * {@code -Wcast-function-type} warning.
     * <p>
     * If {@code func} is {@code null}, then only the pointers (and not what they are
     * pointing to) are copied to the new {@link PtrArray}.
     * <p>
     * The copy of {@code array} will have the same {@link DestroyNotify} for its elements as
     * {@code array}.
     */
    public static PointerAddress copy(@NotNull java.lang.foreign.MemoryAddress[] array, @Nullable CopyFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_copy.invokeExact(Interop.allocateNativeArray(array), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_ptr_array_extend = Interop.downcallHandle(
        "g_ptr_array_extend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds all pointers of {@code array} to the end of the array {@code array_to_extend}.
     * The array will grow in size automatically if needed. {@code array_to_extend} is
     * modified in-place.
     * <p>
     * {@code func}, as a {@link CopyFunc}, takes two arguments, the data to be copied
     * and a {@code user_data} pointer. On common processor architectures, it's safe to
     * pass {@code null} as {@code user_data} if the copy function takes only one argument. You
     * may get compiler warnings from this though if compiling with GCC’s
     * {@code -Wcast-function-type} warning.
     * <p>
     * If {@code func} is {@code null}, then only the pointers (and not what they are
     * pointing to) are copied to the new {@link PtrArray}.
     */
    public static @NotNull void extend(@NotNull java.lang.foreign.MemoryAddress[] arrayToExtend, @NotNull java.lang.foreign.MemoryAddress[] array, @Nullable CopyFunc func) {
        try {
            g_ptr_array_extend.invokeExact(Interop.allocateNativeArray(arrayToExtend), Interop.allocateNativeArray(array), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_ptr_array_extend_and_steal = Interop.downcallHandle(
        "g_ptr_array_extend_and_steal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds all the pointers in {@code array} to the end of {@code array_to_extend}, transferring
     * ownership of each element from {@code array} to {@code array_to_extend} and modifying
     * {@code array_to_extend} in-place. {@code array} is then freed.
     * <p>
     * As with g_ptr_array_free(), {@code array} will be destroyed if its reference count
     * is 1. If its reference count is higher, it will be decremented and the
     * length of {@code array} set to zero.
     */
    public static @NotNull void extendAndSteal(@NotNull java.lang.foreign.MemoryAddress[] arrayToExtend, @NotNull java.lang.foreign.MemoryAddress[] array) {
        try {
            g_ptr_array_extend_and_steal.invokeExact(Interop.allocateNativeArray(arrayToExtend), Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_ptr_array_find = Interop.downcallHandle(
        "g_ptr_array_find",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code needle} exists in {@code haystack}. If the element is found, {@code true} is
     * returned and the element’s index is returned in {@code index_} (if non-{@code null}).
     * Otherwise, {@code false} is returned and {@code index_} is undefined. If {@code needle} exists
     * multiple times in {@code haystack}, the index of the first instance is returned.
     * <p>
     * This does pointer comparisons only. If you want to use more complex equality
     * checks, such as string comparisons, use g_ptr_array_find_with_equal_func().
     */
    public static boolean find(@NotNull java.lang.foreign.MemoryAddress[] haystack, @Nullable java.lang.foreign.MemoryAddress needle, @NotNull Out<Integer> index) {
        MemorySegment indexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) g_ptr_array_find.invokeExact(Interop.allocateNativeArray(haystack), needle, (Addressable) indexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        index.set(indexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    private static final MethodHandle g_ptr_array_foreach = Interop.downcallHandle(
        "g_ptr_array_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function for each element of a {@link PtrArray}. {@code func} must not
     * add elements to or remove elements from the array.
     */
    public static @NotNull void foreach(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull Func func) {
        try {
            g_ptr_array_foreach.invokeExact(Interop.allocateNativeArray(array), 
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
    
    private static final MethodHandle g_ptr_array_free = Interop.downcallHandle(
        "g_ptr_array_free",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Frees the memory allocated for the {@link PtrArray}. If {@code free_seg} is {@code true}
     * it frees the memory block holding the elements as well. Pass {@code false}
     * if you want to free the {@link PtrArray} wrapper but preserve the
     * underlying array for use elsewhere. If the reference count of {@code array}
     * is greater than one, the {@link PtrArray} wrapper is preserved but the
     * size of {@code array} will be set to zero.
     * <p>
     * If array contents point to dynamically-allocated memory, they should
     * be freed separately if {@code free_seg} is {@code true} and no {@link DestroyNotify}
     * function has been set for {@code array}.
     * <p>
     * This function is not thread-safe. If using a {@link PtrArray} from multiple
     * threads, use only the atomic g_ptr_array_ref() and g_ptr_array_unref()
     * functions.
     */
    public static @Nullable java.lang.foreign.MemoryAddress free(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull boolean freeSeg) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_free.invokeExact(Interop.allocateNativeArray(array), freeSeg ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_ptr_array_insert = Interop.downcallHandle(
        "g_ptr_array_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts an element into the pointer array at the given index. The
     * array will grow in size automatically if necessary.
     */
    public static @NotNull void insert(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index, @Nullable java.lang.foreign.MemoryAddress data) {
        try {
            g_ptr_array_insert.invokeExact(Interop.allocateNativeArray(array), index, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_ptr_array_new = Interop.downcallHandle(
        "g_ptr_array_new",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Creates a new {@link PtrArray} with a reference count of 1.
     */
    public static PointerAddress new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_ptr_array_ref = Interop.downcallHandle(
        "g_ptr_array_ref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically increments the reference count of {@code array} by one.
     * This function is thread-safe and may be called from any thread.
     */
    public static PointerAddress ref(@NotNull java.lang.foreign.MemoryAddress[] array) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_ref.invokeExact(Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_ptr_array_remove = Interop.downcallHandle(
        "g_ptr_array_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the first occurrence of the given pointer from the pointer
     * array. The following elements are moved down one place. If {@code array}
     * has a non-{@code null} {@link DestroyNotify} function it is called for the
     * removed element.
     * <p>
     * It returns {@code true} if the pointer was removed, or {@code false} if the
     * pointer was not found.
     */
    public static boolean remove(@NotNull java.lang.foreign.MemoryAddress[] array, @Nullable java.lang.foreign.MemoryAddress data) {
        int RESULT;
        try {
            RESULT = (int) g_ptr_array_remove.invokeExact(Interop.allocateNativeArray(array), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_ptr_array_remove_fast = Interop.downcallHandle(
        "g_ptr_array_remove_fast",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the first occurrence of the given pointer from the pointer
     * array. The last element in the array is used to fill in the space,
     * so this function does not preserve the order of the array. But it
     * is faster than g_ptr_array_remove(). If {@code array} has a non-{@code null}
     * {@link DestroyNotify} function it is called for the removed element.
     * <p>
     * It returns {@code true} if the pointer was removed, or {@code false} if the
     * pointer was not found.
     */
    public static boolean removeFast(@NotNull java.lang.foreign.MemoryAddress[] array, @Nullable java.lang.foreign.MemoryAddress data) {
        int RESULT;
        try {
            RESULT = (int) g_ptr_array_remove_fast.invokeExact(Interop.allocateNativeArray(array), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_ptr_array_remove_index = Interop.downcallHandle(
        "g_ptr_array_remove_index",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The following elements are moved down one place. If {@code array} has
     * a non-{@code null} {@link DestroyNotify} function it is called for the removed
     * element. If so, the return value from this function will potentially point
     * to freed memory (depending on the {@link DestroyNotify} implementation).
     */
    public static @Nullable java.lang.foreign.MemoryAddress removeIndex(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_remove_index.invokeExact(Interop.allocateNativeArray(array), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_ptr_array_remove_index_fast = Interop.downcallHandle(
        "g_ptr_array_remove_index_fast",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The last element in the array is used to fill in the space, so
     * this function does not preserve the order of the array. But it
     * is faster than g_ptr_array_remove_index(). If {@code array} has a non-{@code null}
     * {@link DestroyNotify} function it is called for the removed element. If so, the
     * return value from this function will potentially point to freed memory
     * (depending on the {@link DestroyNotify} implementation).
     */
    public static @Nullable java.lang.foreign.MemoryAddress removeIndexFast(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_remove_index_fast.invokeExact(Interop.allocateNativeArray(array), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_ptr_array_remove_range = Interop.downcallHandle(
        "g_ptr_array_remove_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the given number of pointers starting at the given index
     * from a {@link PtrArray}. The following elements are moved to close the
     * gap. If {@code array} has a non-{@code null} {@link DestroyNotify} function it is
     * called for the removed elements.
     */
    public static PointerAddress removeRange(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index, @NotNull int length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_remove_range.invokeExact(Interop.allocateNativeArray(array), index, length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_ptr_array_set_size = Interop.downcallHandle(
        "g_ptr_array_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size of the array. When making the array larger,
     * newly-added elements will be set to {@code null}. When making it smaller,
     * if {@code array} has a non-{@code null} {@link DestroyNotify} function then it will be
     * called for the removed elements.
     */
    public static @NotNull void setSize(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int length) {
        try {
            g_ptr_array_set_size.invokeExact(Interop.allocateNativeArray(array), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_ptr_array_sized_new = Interop.downcallHandle(
        "g_ptr_array_sized_new",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link PtrArray} with {@code reserved_size} pointers preallocated
     * and a reference count of 1. This avoids frequent reallocation, if
     * you are going to add many pointers to the array. Note however that
     * the size of the array is still 0.
     */
    public static PointerAddress sizedNew(@NotNull int reservedSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_sized_new.invokeExact(reservedSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_ptr_array_sort_with_data = Interop.downcallHandle(
        "g_ptr_array_sort_with_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_ptr_array_sort(), but the comparison function has an extra
     * user data argument.
     * <p>
     * Note that the comparison function for g_ptr_array_sort_with_data()
     * doesn't take the pointers from the array as arguments, it takes
     * pointers to the pointers in the array. Here is a full example of use:
     * <p>
     * <pre>{@code <!-- language="C" -->
     * typedef enum { SORT_NAME, SORT_SIZE } SortMode;
     * 
     * typedef struct
     * {
     *   gchar *name;
     *   gint size;
     * } FileListEntry;
     * 
     * static gint
     * sort_filelist (gconstpointer a, gconstpointer b, gpointer user_data)
     * {
     *   gint order;
     *   const SortMode sort_mode = GPOINTER_TO_INT (user_data);
     *   const FileListEntry *entry1 = *((FileListEntry **) a);
     *   const FileListEntry *entry2 = *((FileListEntry **) b);
     * 
     *   switch (sort_mode)
     *     {
     *     case SORT_NAME:
     *       order = g_ascii_strcasecmp (entry1->name, entry2->name);
     *       break;
     *     case SORT_SIZE:
     *       order = entry1->size - entry2->size;
     *       break;
     *     default:
     *       order = 0;
     *       break;
     *     }
     *   return order;
     * }
     * 
     * ...
     * g_autoptr (GPtrArray) file_list = NULL;
     * SortMode sort_mode;
     * 
     * // initialize file_list array and load with many FileListEntry entries
     * ...
     * // now sort it with
     * sort_mode = SORT_NAME;
     * g_ptr_array_sort_with_data (file_list,
     *                             sort_filelist,
     *                             GINT_TO_POINTER (sort_mode));
     * }</pre>
     * <p>
     * This is guaranteed to be a stable sort since version 2.32.
     */
    public static @NotNull void sortWithData(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull CompareDataFunc compareFunc) {
        try {
            g_ptr_array_sort_with_data.invokeExact(Interop.allocateNativeArray(array), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_ptr_array_steal = Interop.downcallHandle(
        "g_ptr_array_steal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the data in the array and resets the size to zero, while
     * the underlying array is preserved for use elsewhere and returned
     * to the caller.
     * <p>
     * Even if set, the {@link DestroyNotify} function will never be called
     * on the current contents of the array and the caller is
     * responsible for freeing the array elements.
     * <p>
     * An example of use:
     * <pre>{@code <!-- language="C" -->
     * g_autoptr(GPtrArray) chunk_buffer = g_ptr_array_new_with_free_func (g_bytes_unref);
     * 
     * // Some part of your application appends a number of chunks to the pointer array.
     * g_ptr_array_add (chunk_buffer, g_bytes_new_static ("hello", 5));
     * g_ptr_array_add (chunk_buffer, g_bytes_new_static ("world", 5));
     * 
     * …
     * 
     * // Periodically, the chunks need to be sent as an array-and-length to some
     * // other part of the program.
     * GBytes **chunks;
     * gsize n_chunks;
     * 
     * chunks = g_ptr_array_steal (chunk_buffer, &n_chunks);
     * for (gsize i = 0; i < n_chunks; i++)
     *   {
     *     // Do something with each chunk here, and then free them, since
     *     // g_ptr_array_steal() transfers ownership of all the elements and the
     *     // array to the caller.
     *     …
     * 
     *     g_bytes_unref (chunks[i]);
     *   }
     * 
     * g_free (chunks);
     * 
     * // After calling g_ptr_array_steal(), the pointer array can be reused for the
     * // next set of chunks.
     * g_assert (chunk_buffer->len == 0);
     * }</pre>
     */
    public static @Nullable java.lang.foreign.MemoryAddress steal(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull Out<Long> len) {
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_steal.invokeExact(Interop.allocateNativeArray(array), (Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return RESULT;
    }
    
    private static final MethodHandle g_ptr_array_steal_index = Interop.downcallHandle(
        "g_ptr_array_steal_index",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The following elements are moved down one place. The {@link DestroyNotify} for
     * {@code array} is <strong>not</strong> called on the removed element; ownership is transferred to
     * the caller of this function.
     */
    public static @Nullable java.lang.foreign.MemoryAddress stealIndex(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_steal_index.invokeExact(Interop.allocateNativeArray(array), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_ptr_array_steal_index_fast = Interop.downcallHandle(
        "g_ptr_array_steal_index_fast",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The last element in the array is used to fill in the space, so
     * this function does not preserve the order of the array. But it
     * is faster than g_ptr_array_steal_index(). The {@link DestroyNotify} for {@code array} is
     * <strong>not</strong> called on the removed element; ownership is transferred to the caller
     * of this function.
     */
    public static @Nullable java.lang.foreign.MemoryAddress stealIndexFast(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_ptr_array_steal_index_fast.invokeExact(Interop.allocateNativeArray(array), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_ptr_array_unref = Interop.downcallHandle(
        "g_ptr_array_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, the effect is the same as calling
     * g_ptr_array_free() with {@code free_segment} set to {@code true}. This function
     * is thread-safe and may be called from any thread.
     */
    public static @NotNull void unref(@NotNull java.lang.foreign.MemoryAddress[] array) {
        try {
            g_ptr_array_unref.invokeExact(Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

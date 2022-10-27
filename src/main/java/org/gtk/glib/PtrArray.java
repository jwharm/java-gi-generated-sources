package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains the public fields of a pointer array.
 */
public class PtrArray extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("pdata"),
        ValueLayout.JAVA_INT.withName("len")
    ).withName("GPtrArray");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PtrArray(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Adds a pointer to the end of the pointer array. The array will grow
     * in size automatically if necessary.
     * @param array a {@link PtrArray}
     * @param data the pointer to add
     */
    public static void add(java.lang.foreign.MemoryAddress[] array, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        try {
            DowncallHandles.g_ptr_array_add.invokeExact(Interop.allocateNativeArray(array, false), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param array {@link PtrArray} to duplicate
     * @param func a copy function used to copy every element in the array
     * @return a deep copy of the initial {@link PtrArray}.
     */
    public static @NotNull PointerAddress copy(java.lang.foreign.MemoryAddress[] array, @Nullable org.gtk.glib.CopyFunc func) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        java.util.Objects.requireNonNullElse(func, MemoryAddress.NULL);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_copy.invokeExact(Interop.allocateNativeArray(array, false), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (func == null ? MemoryAddress.NULL : Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
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
     * @param arrayToExtend a {@link PtrArray}.
     * @param array a {@link PtrArray} to add to the end of {@code array_to_extend}.
     * @param func a copy function used to copy every element in the array
     */
    public static void extend(java.lang.foreign.MemoryAddress[] arrayToExtend, java.lang.foreign.MemoryAddress[] array, @Nullable org.gtk.glib.CopyFunc func) {
        java.util.Objects.requireNonNull(arrayToExtend, "Parameter 'arrayToExtend' must not be null");
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        java.util.Objects.requireNonNullElse(func, MemoryAddress.NULL);
        try {
            DowncallHandles.g_ptr_array_extend.invokeExact(Interop.allocateNativeArray(arrayToExtend, false), Interop.allocateNativeArray(array, false), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (func == null ? MemoryAddress.NULL : Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds all the pointers in {@code array} to the end of {@code array_to_extend}, transferring
     * ownership of each element from {@code array} to {@code array_to_extend} and modifying
     * {@code array_to_extend} in-place. {@code array} is then freed.
     * <p>
     * As with g_ptr_array_free(), {@code array} will be destroyed if its reference count
     * is 1. If its reference count is higher, it will be decremented and the
     * length of {@code array} set to zero.
     * @param arrayToExtend a {@link PtrArray}.
     * @param array a {@link PtrArray} to add to the end of
     *     {@code array_to_extend}.
     */
    public static void extendAndSteal(java.lang.foreign.MemoryAddress[] arrayToExtend, java.lang.foreign.MemoryAddress[] array) {
        java.util.Objects.requireNonNull(arrayToExtend, "Parameter 'arrayToExtend' must not be null");
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        try {
            DowncallHandles.g_ptr_array_extend_and_steal.invokeExact(Interop.allocateNativeArray(arrayToExtend, false), Interop.allocateNativeArray(array, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks whether {@code needle} exists in {@code haystack}. If the element is found, {@code true} is
     * returned and the element’s index is returned in {@code index_} (if non-{@code null}).
     * Otherwise, {@code false} is returned and {@code index_} is undefined. If {@code needle} exists
     * multiple times in {@code haystack}, the index of the first instance is returned.
     * <p>
     * This does pointer comparisons only. If you want to use more complex equality
     * checks, such as string comparisons, use g_ptr_array_find_with_equal_func().
     * @param haystack pointer array to be searched
     * @param needle pointer to look for
     * @param index return location for the index of
     *    the element, if found
     * @return {@code true} if {@code needle} is one of the elements of {@code haystack}
     */
    public static boolean find(java.lang.foreign.MemoryAddress[] haystack, @Nullable java.lang.foreign.MemoryAddress needle, Out<Integer> index) {
        java.util.Objects.requireNonNull(haystack, "Parameter 'haystack' must not be null");
        java.util.Objects.requireNonNullElse(needle, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(index, "Parameter 'index' must not be null");
        MemorySegment indexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_ptr_array_find.invokeExact(Interop.allocateNativeArray(haystack, false), needle, (Addressable) indexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        index.set(indexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Checks whether {@code needle} exists in {@code haystack}, using the given {@code equal_func}.
     * If the element is found, {@code true} is returned and the element’s index is
     * returned in {@code index_} (if non-{@code null}). Otherwise, {@code false} is returned and {@code index_}
     * is undefined. If {@code needle} exists multiple times in {@code haystack}, the index of
     * the first instance is returned.
     * <p>
     * {@code equal_func} is called with the element from the array as its first parameter,
     * and {@code needle} as its second parameter. If {@code equal_func} is {@code null}, pointer
     * equality is used.
     * @param haystack pointer array to be searched
     * @param needle pointer to look for
     * @param equalFunc the function to call for each element, which should
     *    return {@code true} when the desired element is found; or {@code null} to use pointer
     *    equality
     * @param index return location for the index of
     *    the element, if found
     * @return {@code true} if {@code needle} is one of the elements of {@code haystack}
     */
    public static boolean findWithEqualFunc(java.lang.foreign.MemoryAddress[] haystack, @Nullable java.lang.foreign.MemoryAddress needle, @Nullable org.gtk.glib.EqualFunc equalFunc, Out<Integer> index) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Calls a function for each element of a {@link PtrArray}. {@code func} must not
     * add elements to or remove elements from the array.
     * @param array a {@link PtrArray}
     * @param func the function to call for each array element
     */
    public static void foreach(java.lang.foreign.MemoryAddress[] array, @NotNull org.gtk.glib.Func func) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.g_ptr_array_foreach.invokeExact(Interop.allocateNativeArray(array, false), 
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
     * @param array a {@link PtrArray}
     * @param freeSeg if {@code true} the actual pointer array is freed as well
     * @return the pointer array if {@code free_seg} is
     *     {@code false}, otherwise {@code null}. The pointer array should be freed using g_free().
     */
    public static @Nullable java.lang.foreign.MemoryAddress free(java.lang.foreign.MemoryAddress[] array, boolean freeSeg) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_free.invokeExact(Interop.allocateNativeArray(array, false), freeSeg ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts an element into the pointer array at the given index. The
     * array will grow in size automatically if necessary.
     * @param array a {@link PtrArray}
     * @param index the index to place the new element at, or -1 to append
     * @param data the pointer to add.
     */
    public static void insert(java.lang.foreign.MemoryAddress[] array, int index, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        try {
            DowncallHandles.g_ptr_array_insert.invokeExact(Interop.allocateNativeArray(array, false), index, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link PtrArray} with a reference count of 1.
     * @return the new {@link PtrArray}
     */
    public static @NotNull PointerAddress new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    /**
     * Creates a new {@link PtrArray} with {@code reserved_size} pointers preallocated
     * and a reference count of 1. This avoids frequent reallocation, if
     * you are going to add many pointers to the array. Note however that
     * the size of the array is still 0. It also set {@code element_free_func}
     * for freeing each element when the array is destroyed either via
     * g_ptr_array_unref(), when g_ptr_array_free() is called with
     * {@code free_segment} set to {@code true} or when removing elements.
     * @param reservedSize number of pointers preallocated
     * @param elementFreeFunc A function to free elements with
     *     destroy {@code array} or {@code null}
     * @return A new {@link PtrArray}
     */
    public static @NotNull PointerAddress newFull(int reservedSize, @Nullable org.gtk.glib.DestroyNotify elementFreeFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new {@link PtrArray} with a reference count of 1 and use
     * {@code element_free_func} for freeing each element when the array is destroyed
     * either via g_ptr_array_unref(), when g_ptr_array_free() is called with
     * {@code free_segment} set to {@code true} or when removing elements.
     * @param elementFreeFunc A function to free elements with
     *     destroy {@code array} or {@code null}
     * @return A new {@link PtrArray}
     */
    public static @NotNull PointerAddress newWithFreeFunc(@Nullable org.gtk.glib.DestroyNotify elementFreeFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Atomically increments the reference count of {@code array} by one.
     * This function is thread-safe and may be called from any thread.
     * @param array a {@link PtrArray}
     * @return The passed in {@link PtrArray}
     */
    public static @NotNull PointerAddress ref(java.lang.foreign.MemoryAddress[] array) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_ref.invokeExact(Interop.allocateNativeArray(array, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    /**
     * Removes the first occurrence of the given pointer from the pointer
     * array. The following elements are moved down one place. If {@code array}
     * has a non-{@code null} {@link DestroyNotify} function it is called for the
     * removed element.
     * <p>
     * It returns {@code true} if the pointer was removed, or {@code false} if the
     * pointer was not found.
     * @param array a {@link PtrArray}
     * @param data the pointer to remove
     * @return {@code true} if the pointer is removed, {@code false} if the pointer
     *     is not found in the array
     */
    public static boolean remove(java.lang.foreign.MemoryAddress[] array, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_ptr_array_remove.invokeExact(Interop.allocateNativeArray(array, false), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes the first occurrence of the given pointer from the pointer
     * array. The last element in the array is used to fill in the space,
     * so this function does not preserve the order of the array. But it
     * is faster than g_ptr_array_remove(). If {@code array} has a non-{@code null}
     * {@link DestroyNotify} function it is called for the removed element.
     * <p>
     * It returns {@code true} if the pointer was removed, or {@code false} if the
     * pointer was not found.
     * @param array a {@link PtrArray}
     * @param data the pointer to remove
     * @return {@code true} if the pointer was found in the array
     */
    public static boolean removeFast(java.lang.foreign.MemoryAddress[] array, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_ptr_array_remove_fast.invokeExact(Interop.allocateNativeArray(array, false), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The following elements are moved down one place. If {@code array} has
     * a non-{@code null} {@link DestroyNotify} function it is called for the removed
     * element. If so, the return value from this function will potentially point
     * to freed memory (depending on the {@link DestroyNotify} implementation).
     * @param array a {@link PtrArray}
     * @param index the index of the pointer to remove
     * @return the pointer which was removed
     */
    public static @Nullable java.lang.foreign.MemoryAddress removeIndex(java.lang.foreign.MemoryAddress[] array, int index) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_remove_index.invokeExact(Interop.allocateNativeArray(array, false), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The last element in the array is used to fill in the space, so
     * this function does not preserve the order of the array. But it
     * is faster than g_ptr_array_remove_index(). If {@code array} has a non-{@code null}
     * {@link DestroyNotify} function it is called for the removed element. If so, the
     * return value from this function will potentially point to freed memory
     * (depending on the {@link DestroyNotify} implementation).
     * @param array a {@link PtrArray}
     * @param index the index of the pointer to remove
     * @return the pointer which was removed
     */
    public static @Nullable java.lang.foreign.MemoryAddress removeIndexFast(java.lang.foreign.MemoryAddress[] array, int index) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_remove_index_fast.invokeExact(Interop.allocateNativeArray(array, false), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes the given number of pointers starting at the given index
     * from a {@link PtrArray}. The following elements are moved to close the
     * gap. If {@code array} has a non-{@code null} {@link DestroyNotify} function it is
     * called for the removed elements.
     * @param array a {@code GPtrArray}
     * @param index the index of the first pointer to remove
     * @param length the number of pointers to remove
     * @return the {@code array}
     */
    public static @NotNull PointerAddress removeRange(java.lang.foreign.MemoryAddress[] array, int index, int length) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_remove_range.invokeExact(Interop.allocateNativeArray(array, false), index, length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    /**
     * Sets a function for freeing each element when {@code array} is destroyed
     * either via g_ptr_array_unref(), when g_ptr_array_free() is called
     * with {@code free_segment} set to {@code true} or when removing elements.
     * @param array A {@link PtrArray}
     * @param elementFreeFunc A function to free elements with
     *     destroy {@code array} or {@code null}
     */
    public static void setFreeFunc(java.lang.foreign.MemoryAddress[] array, @Nullable org.gtk.glib.DestroyNotify elementFreeFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets the size of the array. When making the array larger,
     * newly-added elements will be set to {@code null}. When making it smaller,
     * if {@code array} has a non-{@code null} {@link DestroyNotify} function then it will be
     * called for the removed elements.
     * @param array a {@link PtrArray}
     * @param length the new length of the pointer array
     */
    public static void setSize(java.lang.foreign.MemoryAddress[] array, int length) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        try {
            DowncallHandles.g_ptr_array_set_size.invokeExact(Interop.allocateNativeArray(array, false), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link PtrArray} with {@code reserved_size} pointers preallocated
     * and a reference count of 1. This avoids frequent reallocation, if
     * you are going to add many pointers to the array. Note however that
     * the size of the array is still 0.
     * @param reservedSize number of pointers preallocated
     * @return the new {@link PtrArray}
     */
    public static @NotNull PointerAddress sizedNew(int reservedSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_sized_new.invokeExact(reservedSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    /**
     * Sorts the array, using {@code compare_func} which should be a qsort()-style
     * comparison function (returns less than zero for first arg is less
     * than second arg, zero for equal, greater than zero if irst arg is
     * greater than second arg).
     * <p>
     * Note that the comparison function for g_ptr_array_sort() doesn't
     * take the pointers from the array as arguments, it takes pointers to
     * the pointers in the array. Here is a full example of usage:
     * <pre>{@code <!-- language="C" -->
     * typedef struct
     * {
     *   gchar *name;
     *   gint size;
     * } FileListEntry;
     * 
     * static gint
     * sort_filelist (gconstpointer a, gconstpointer b)
     * {
     *   const FileListEntry *entry1 = *((FileListEntry **) a);
     *   const FileListEntry *entry2 = *((FileListEntry **) b);
     * 
     *   return g_ascii_strcasecmp (entry1->name, entry2->name);
     * }
     * 
     * …
     * g_autoptr (GPtrArray) file_list = NULL;
     * 
     * // initialize file_list array and load with many FileListEntry entries
     * ...
     * // now sort it with
     * g_ptr_array_sort (file_list, sort_filelist);
     * }</pre>
     * <p>
     * This is guaranteed to be a stable sort since version 2.32.
     * @param array a {@link PtrArray}
     * @param compareFunc comparison function
     */
    public static void sort(java.lang.foreign.MemoryAddress[] array, @NotNull org.gtk.glib.CompareFunc compareFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Like g_ptr_array_sort(), but the comparison function has an extra
     * user data argument.
     * <p>
     * Note that the comparison function for g_ptr_array_sort_with_data()
     * doesn't take the pointers from the array as arguments, it takes
     * pointers to the pointers in the array. Here is a full example of use:
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
     * @param array a {@link PtrArray}
     * @param compareFunc comparison function
     */
    public static void sortWithData(java.lang.foreign.MemoryAddress[] array, @NotNull org.gtk.glib.CompareDataFunc compareFunc) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        try {
            DowncallHandles.g_ptr_array_sort_with_data.invokeExact(Interop.allocateNativeArray(array, false), 
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
     * @param array a {@link PtrArray}.
     * @param len pointer to retrieve the number of
     *    elements of the original array
     * @return the element data, which should be
     *     freed using g_free().
     */
    public static @Nullable java.lang.foreign.MemoryAddress steal(java.lang.foreign.MemoryAddress[] array, Out<Long> len) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        java.util.Objects.requireNonNull(len, "Parameter 'len' must not be null");
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_steal.invokeExact(Interop.allocateNativeArray(array, false), (Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return RESULT;
    }
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The following elements are moved down one place. The {@link DestroyNotify} for
     * {@code array} is <em>not</em> called on the removed element; ownership is transferred to
     * the caller of this function.
     * @param array a {@link PtrArray}
     * @param index the index of the pointer to steal
     * @return the pointer which was removed
     */
    public static @Nullable java.lang.foreign.MemoryAddress stealIndex(java.lang.foreign.MemoryAddress[] array, int index) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_steal_index.invokeExact(Interop.allocateNativeArray(array, false), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The last element in the array is used to fill in the space, so
     * this function does not preserve the order of the array. But it
     * is faster than g_ptr_array_steal_index(). The {@link DestroyNotify} for {@code array} is
     * <em>not</em> called on the removed element; ownership is transferred to the caller
     * of this function.
     * @param array a {@link PtrArray}
     * @param index the index of the pointer to steal
     * @return the pointer which was removed
     */
    public static @Nullable java.lang.foreign.MemoryAddress stealIndexFast(java.lang.foreign.MemoryAddress[] array, int index) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ptr_array_steal_index_fast.invokeExact(Interop.allocateNativeArray(array, false), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, the effect is the same as calling
     * g_ptr_array_free() with {@code free_segment} set to {@code true}. This function
     * is thread-safe and may be called from any thread.
     * @param array A {@link PtrArray}
     */
    public static void unref(java.lang.foreign.MemoryAddress[] array) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        try {
            DowncallHandles.g_ptr_array_unref.invokeExact(Interop.allocateNativeArray(array, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_ptr_array_add = Interop.downcallHandle(
            "g_ptr_array_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_copy = Interop.downcallHandle(
            "g_ptr_array_copy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_extend = Interop.downcallHandle(
            "g_ptr_array_extend",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_extend_and_steal = Interop.downcallHandle(
            "g_ptr_array_extend_and_steal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_find = Interop.downcallHandle(
            "g_ptr_array_find",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_find_with_equal_func = Interop.downcallHandle(
            "g_ptr_array_find_with_equal_func",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_foreach = Interop.downcallHandle(
            "g_ptr_array_foreach",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_free = Interop.downcallHandle(
            "g_ptr_array_free",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_ptr_array_insert = Interop.downcallHandle(
            "g_ptr_array_insert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_new = Interop.downcallHandle(
            "g_ptr_array_new",
            FunctionDescriptor.ofVoid()
        );
        
        private static final MethodHandle g_ptr_array_new_full = Interop.downcallHandle(
            "g_ptr_array_new_full",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_new_with_free_func = Interop.downcallHandle(
            "g_ptr_array_new_with_free_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_ref = Interop.downcallHandle(
            "g_ptr_array_ref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_remove = Interop.downcallHandle(
            "g_ptr_array_remove",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_remove_fast = Interop.downcallHandle(
            "g_ptr_array_remove_fast",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_remove_index = Interop.downcallHandle(
            "g_ptr_array_remove_index",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_ptr_array_remove_index_fast = Interop.downcallHandle(
            "g_ptr_array_remove_index_fast",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_ptr_array_remove_range = Interop.downcallHandle(
            "g_ptr_array_remove_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_ptr_array_set_free_func = Interop.downcallHandle(
            "g_ptr_array_set_free_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_set_size = Interop.downcallHandle(
            "g_ptr_array_set_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_ptr_array_sized_new = Interop.downcallHandle(
            "g_ptr_array_sized_new",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_ptr_array_sort = Interop.downcallHandle(
            "g_ptr_array_sort",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_sort_with_data = Interop.downcallHandle(
            "g_ptr_array_sort_with_data",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_steal = Interop.downcallHandle(
            "g_ptr_array_steal",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_ptr_array_steal_index = Interop.downcallHandle(
            "g_ptr_array_steal_index",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_ptr_array_steal_index_fast = Interop.downcallHandle(
            "g_ptr_array_steal_index_fast",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_ptr_array_unref = Interop.downcallHandle(
            "g_ptr_array_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}

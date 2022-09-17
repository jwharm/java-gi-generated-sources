package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a pointer array.
 */
public class PtrArray extends io.github.jwharm.javagi.ResourceBase {

    public PtrArray(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds a pointer to the end of the pointer array. The array will grow
     * in size automatically if necessary.
     */
    public static void add(jdk.incubator.foreign.MemoryAddress[] array, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_ptr_array_add(Interop.allocateNativeArray(array).handle(), data);
    }
    
    /**
     * Adds all pointers of @array to the end of the array @array_to_extend.
     * The array will grow in size automatically if needed. @array_to_extend is
     * modified in-place.
     * <p>
     * @func, as a #GCopyFunc, takes two arguments, the data to be copied
     * and a @user_data pointer. On common processor architectures, it&#39;s safe to
     * pass <code>null</code> as @user_data if the copy function takes only one argument. You
     * may get compiler warnings from this though if compiling with GCC&#8217;s<code>-Wcast-function-type</code> warning.
     * 
     * If @func is <code>NULL,</code> then only the pointers (and not what they are
     * pointing to) are copied to the new #GPtrArray.
     */
    public static void extend(jdk.incubator.foreign.MemoryAddress[] arrayToExtend, jdk.incubator.foreign.MemoryAddress[] array, CopyFunc func) {
        try {
            gtk_h.g_ptr_array_extend(Interop.allocateNativeArray(arrayToExtend).handle(), Interop.allocateNativeArray(array).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Adds all the pointers in @array to the end of @array_to_extend, transferring
     * ownership of each element from @array to @array_to_extend and modifying
     * @array_to_extend in-place. @array is then freed.
     * 
     * As with g_ptr_array_free(), @array will be destroyed if its reference count
     * is 1. If its reference count is higher, it will be decremented and the
     * length of @array set to zero.
     */
    public static void extendAndSteal(jdk.incubator.foreign.MemoryAddress[] arrayToExtend, jdk.incubator.foreign.MemoryAddress[] array) {
        gtk_h.g_ptr_array_extend_and_steal(Interop.allocateNativeArray(arrayToExtend).handle(), Interop.allocateNativeArray(array).handle());
    }
    
    /**
     * Calls a function for each element of a #GPtrArray. @func must not
     * add elements to or remove elements from the array.
     */
    public static void foreach(jdk.incubator.foreign.MemoryAddress[] array, Func func) {
        try {
            gtk_h.g_ptr_array_foreach(Interop.allocateNativeArray(array).handle(), 
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
     * Frees the memory allocated for the #GPtrArray. If @free_seg is <code>TRUE
     * it</code> frees the memory block holding the elements as well. Pass <code>FALSE
     * if</code> you want to free the #GPtrArray wrapper but preserve the
     * underlying array for use elsewhere. If the reference count of @array
     * is greater than one, the #GPtrArray wrapper is preserved but the
     * size of @array will be set to zero.
     * 
     * If array contents point to dynamically-allocated memory, they should
     * be freed separately if @free_seg is <code>true</code> and no #GDestroyNotify
     * function has been set for @array.
     * 
     * This function is not thread-safe. If using a #GPtrArray from multiple
     * threads, use only the atomic g_ptr_array_ref() and g_ptr_array_unref()
     * functions.
     */
    public static jdk.incubator.foreign.MemoryAddress free(jdk.incubator.foreign.MemoryAddress[] array, boolean freeSeg) {
        var RESULT = gtk_h.g_ptr_array_free(Interop.allocateNativeArray(array).handle(), freeSeg ? 1 : 0);
        return RESULT;
    }
    
    /**
     * Inserts an element into the pointer array at the given index. The
     * array will grow in size automatically if necessary.
     */
    public static void insert(jdk.incubator.foreign.MemoryAddress[] array, int index, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_ptr_array_insert(Interop.allocateNativeArray(array).handle(), index, data);
    }
    
    /**
     * Removes the first occurrence of the given pointer from the pointer
     * array. The following elements are moved down one place. If @array
     * has a non-<code>null</code> #GDestroyNotify function it is called for the
     * removed element.
     * 
     * It returns <code>true</code> if the pointer was removed, or <code>false</code> if the
     * pointer was not found.
     */
    public static boolean remove(jdk.incubator.foreign.MemoryAddress[] array, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_ptr_array_remove(Interop.allocateNativeArray(array).handle(), data);
        return (RESULT != 0);
    }
    
    /**
     * Removes the first occurrence of the given pointer from the pointer
     * array. The last element in the array is used to fill in the space,
     * so this function does not preserve the order of the array. But it
     * is faster than g_ptr_array_remove(). If @array has a non-<code>NULL
     * #GDestroyNotify</code> function it is called for the removed element.
     * 
     * It returns <code>true</code> if the pointer was removed, or <code>false</code> if the
     * pointer was not found.
     */
    public static boolean removeFast(jdk.incubator.foreign.MemoryAddress[] array, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_ptr_array_remove_fast(Interop.allocateNativeArray(array).handle(), data);
        return (RESULT != 0);
    }
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The following elements are moved down one place. If @array has
     * a non-<code>null</code> #GDestroyNotify function it is called for the removed
     * element. If so, the return value from this function will potentially point
     * to freed memory (depending on the #GDestroyNotify implementation).
     */
    public static jdk.incubator.foreign.MemoryAddress removeIndex(jdk.incubator.foreign.MemoryAddress[] array, int index) {
        var RESULT = gtk_h.g_ptr_array_remove_index(Interop.allocateNativeArray(array).handle(), index);
        return RESULT;
    }
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The last element in the array is used to fill in the space, so
     * this function does not preserve the order of the array. But it
     * is faster than g_ptr_array_remove_index(). If @array has a non-<code>NULL
     * #GDestroyNotify</code> function it is called for the removed element. If so, the
     * return value from this function will potentially point to freed memory
     * (depending on the #GDestroyNotify implementation).
     */
    public static jdk.incubator.foreign.MemoryAddress removeIndexFast(jdk.incubator.foreign.MemoryAddress[] array, int index) {
        var RESULT = gtk_h.g_ptr_array_remove_index_fast(Interop.allocateNativeArray(array).handle(), index);
        return RESULT;
    }
    
    /**
     * Sets the size of the array. When making the array larger,
     * newly-added elements will be set to <code>NULL.</code> When making it smaller,
     * if @array has a non-<code>null</code> #GDestroyNotify function then it will be
     * called for the removed elements.
     */
    public static void setSize(jdk.incubator.foreign.MemoryAddress[] array, int length) {
        gtk_h.g_ptr_array_set_size(Interop.allocateNativeArray(array).handle(), length);
    }
    
    /**
     * Like g_ptr_array_sort(), but the comparison function has an extra
     * user data argument.
     * 
     * Note that the comparison function for g_ptr_array_sort_with_data()
     * doesn&#39;t take the pointers from the array as arguments, it takes
     * pointers to the pointers in the array. Here is a full example of use:
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
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
     *       order = g_ascii_strcasecmp (entry1-&#62;name, entry2-&#62;name);
     *       break;
     *     case SORT_SIZE:
     *       order = entry1-&#62;size - entry2-&#62;size;
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
     * ]}|
     * 
     * This is guaranteed to be a stable sort since version 2.32.
     */
    public static void sortWithData(jdk.incubator.foreign.MemoryAddress[] array, CompareDataFunc compareFunc) {
        try {
            gtk_h.g_ptr_array_sort_with_data(Interop.allocateNativeArray(array).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The following elements are moved down one place. The #GDestroyNotify for
     * @array is *not* called on the removed element; ownership is transferred to
     * the caller of this function.
     */
    public static jdk.incubator.foreign.MemoryAddress stealIndex(jdk.incubator.foreign.MemoryAddress[] array, int index) {
        var RESULT = gtk_h.g_ptr_array_steal_index(Interop.allocateNativeArray(array).handle(), index);
        return RESULT;
    }
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The last element in the array is used to fill in the space, so
     * this function does not preserve the order of the array. But it
     * is faster than g_ptr_array_steal_index(). The #GDestroyNotify for @array is
     * *not* called on the removed element; ownership is transferred to the caller
     * of this function.
     */
    public static jdk.incubator.foreign.MemoryAddress stealIndexFast(jdk.incubator.foreign.MemoryAddress[] array, int index) {
        var RESULT = gtk_h.g_ptr_array_steal_index_fast(Interop.allocateNativeArray(array).handle(), index);
        return RESULT;
    }
    
    /**
     * Atomically decrements the reference count of @array by one. If the
     * reference count drops to 0, the effect is the same as calling
     * g_ptr_array_free() with @free_segment set to <code>TRUE.</code> This function
     * is thread-safe and may be called from any thread.
     */
    public static void unref(jdk.incubator.foreign.MemoryAddress[] array) {
        gtk_h.g_ptr_array_unref(Interop.allocateNativeArray(array).handle());
    }
    
}

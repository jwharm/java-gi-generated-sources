package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a pointer array.
 */
public class PtrArray extends io.github.jwharm.javagi.interop.ResourceBase {

    public PtrArray(io.github.jwharm.javagi.interop.Reference reference) {
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
     * Frees the memory allocated for the #GPtrArray. If @free_seg is %TRUE
     * it frees the memory block holding the elements as well. Pass %FALSE
     * if you want to free the #GPtrArray wrapper but preserve the
     * underlying array for use elsewhere. If the reference count of @array
     * is greater than one, the #GPtrArray wrapper is preserved but the
     * size of @array will be set to zero.
     * 
     * If array contents point to dynamically-allocated memory, they should
     * be freed separately if @free_seg is %TRUE and no #GDestroyNotify
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
     * has a non-%NULL #GDestroyNotify function it is called for the
     * removed element.
     * 
     * It returns %TRUE if the pointer was removed, or %FALSE if the
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
     * is faster than g_ptr_array_remove(). If @array has a non-%NULL
     * #GDestroyNotify function it is called for the removed element.
     * 
     * It returns %TRUE if the pointer was removed, or %FALSE if the
     * pointer was not found.
     */
    public static boolean removeFast(jdk.incubator.foreign.MemoryAddress[] array, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_ptr_array_remove_fast(Interop.allocateNativeArray(array).handle(), data);
        return (RESULT != 0);
    }
    
    /**
     * Removes the pointer at the given index from the pointer array.
     * The following elements are moved down one place. If @array has
     * a non-%NULL #GDestroyNotify function it is called for the removed
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
     * is faster than g_ptr_array_remove_index(). If @array has a non-%NULL
     * #GDestroyNotify function it is called for the removed element. If so, the
     * return value from this function will potentially point to freed memory
     * (depending on the #GDestroyNotify implementation).
     */
    public static jdk.incubator.foreign.MemoryAddress removeIndexFast(jdk.incubator.foreign.MemoryAddress[] array, int index) {
        var RESULT = gtk_h.g_ptr_array_remove_index_fast(Interop.allocateNativeArray(array).handle(), index);
        return RESULT;
    }
    
    /**
     * Sets the size of the array. When making the array larger,
     * newly-added elements will be set to %NULL. When making it smaller,
     * if @array has a non-%NULL #GDestroyNotify function then it will be
     * called for the removed elements.
     */
    public static void setSize(jdk.incubator.foreign.MemoryAddress[] array, int length) {
        gtk_h.g_ptr_array_set_size(Interop.allocateNativeArray(array).handle(), length);
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
     * g_ptr_array_free() with @free_segment set to %TRUE. This function
     * is thread-safe and may be called from any thread.
     */
    public static void unref(jdk.incubator.foreign.MemoryAddress[] array) {
        gtk_h.g_ptr_array_unref(Interop.allocateNativeArray(array).handle());
    }
    
}

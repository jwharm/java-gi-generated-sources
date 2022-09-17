package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a GArray.
 */
public class Array extends io.github.jwharm.javagi.ResourceBase {

    public Array(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Frees the memory allocated for the #GArray. If @free_segment is
     * <code>true</code> it frees the memory block holding the elements as well. Pass
     * <code>false</code> if you want to free the #GArray wrapper but preserve the
     * underlying array for use elsewhere. If the reference count of
     * @array is greater than one, the #GArray wrapper is preserved but
     * the size of  @array will be set to zero.
     * 
     * If array contents point to dynamically-allocated memory, they should
     * be freed separately if @free_seg is <code>true</code> and no @clear_func
     * function has been set for @array.
     * 
     * This function is not thread-safe. If using a #GArray from multiple
     * threads, use only the atomic g_array_ref() and g_array_unref()
     * functions.
     */
    public static java.lang.String free(jdk.incubator.foreign.MemoryAddress[] array, boolean freeSegment) {
        var RESULT = gtk_h.g_array_free(Interop.allocateNativeArray(array).handle(), freeSegment ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the size of the elements in @array.
     */
    public static int getElementSize(jdk.incubator.foreign.MemoryAddress[] array) {
        var RESULT = gtk_h.g_array_get_element_size(Interop.allocateNativeArray(array).handle());
        return RESULT;
    }
    
    /**
     * Like g_array_sort(), but the comparison function receives an extra
     * user data argument.
     * 
     * This is guaranteed to be a stable sort since version 2.32.
     * 
     * There used to be a comment here about making the sort stable by
     * using the addresses of the elements in the comparison function.
     * This did not actually work, so any such code should be removed.
     */
    public static void sortWithData(jdk.incubator.foreign.MemoryAddress[] array, CompareDataFunc compareFunc) {
        try {
            gtk_h.g_array_sort_with_data(Interop.allocateNativeArray(array).handle(), 
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
     * Atomically decrements the reference count of @array by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static void unref(jdk.incubator.foreign.MemoryAddress[] array) {
        gtk_h.g_array_unref(Interop.allocateNativeArray(array).handle());
    }
    
}

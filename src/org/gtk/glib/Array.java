package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a GArray.
 */
public class Array extends io.github.jwharm.javagi.ResourceBase {

    public Array(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Array() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GArray.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Frees the memory allocated for the {@link Array}. If {@code free_segment} is
     * {@code true} it frees the memory block holding the elements as well. Pass
     * {@code false} if you want to free the {@link Array} wrapper but preserve the
     * underlying array for use elsewhere. If the reference count of
     * {@code array} is greater than one, the {@link Array} wrapper is preserved but
     * the size of  {@code array} will be set to zero.
     * <p>
     * If array contents point to dynamically-allocated memory, they should
     * be freed separately if {@code free_seg} is {@code true} and no {@code clear_func}
     * function has been set for {@code array}.
     * <p>
     * This function is not thread-safe. If using a {@link Array} from multiple
     * threads, use only the atomic g_array_ref() and g_array_unref()
     * functions.
     */
    public static java.lang.String free(java.lang.foreign.MemoryAddress[] array, boolean freeSegment) {
        var RESULT = gtk_h.g_array_free(Interop.allocateNativeArray(array).handle(), freeSegment ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the size of the elements in {@code array}.
     */
    public static int getElementSize(java.lang.foreign.MemoryAddress[] array) {
        var RESULT = gtk_h.g_array_get_element_size(Interop.allocateNativeArray(array).handle());
        return RESULT;
    }
    
    /**
     * Like g_array_sort(), but the comparison function receives an extra
     * user data argument.
     * <p>
     * This is guaranteed to be a stable sort since version 2.32.
     * <p>
     * There used to be a comment here about making the sort stable by
     * using the addresses of the elements in the comparison function.
     * This did not actually work, so any such code should be removed.
     */
    public static void sortWithData(java.lang.foreign.MemoryAddress[] array, CompareDataFunc compareFunc) {
        try {
            gtk_h.g_array_sort_with_data(Interop.allocateNativeArray(array).handle(), 
                    Linker.nativeLinker().upcallStub(
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
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static void unref(java.lang.foreign.MemoryAddress[] array) {
        gtk_h.g_array_unref(Interop.allocateNativeArray(array).handle());
    }
    
}

package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains the public fields of a GArray.
 */
public class Array extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GArray";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.C_INT.withName("len")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Array}
     * @return A new, uninitialized @{link Array}
     */
    public static Array allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Array newInstance = new Array(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.String getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.String data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(data, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code len}
     * @return The value of the field {@code len}
     */
    public int getLen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("len"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code len}
     * @param len The new value of the field {@code len}
     */
    public void setLen(int len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("len"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), len);
        }
    }
    
    /**
     * Create a Array proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Array(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Array> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Array(input);
    
    /**
     * Adds {@code len} elements onto the end of the array.
     * @param array a {@link Array}
     * @param len the number of elements to append
     * @return the {@link Array}
     */
    public static PointerAddress appendVals(java.lang.foreign.MemoryAddress[] array, int len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_append_vals.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        (Addressable) MemoryAddress.NULL,
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Checks whether {@code target} exists in {@code array} by performing a binary
     * search based on the given comparison function {@code compare_func} which
     * get pointers to items as arguments. If the element is found, {@code true}
     * is returned and the element???s index is returned in {@code out_match_index}
     * (if non-{@code null}). Otherwise, {@code false} is returned and {@code out_match_index}
     * is undefined. If {@code target} exists multiple times in {@code array}, the index
     * of the first instance is returned. This search is using a binary
     * search, so the {@code array} must absolutely be sorted to return a correct
     * result (if not, the function may produce false-negative).
     * <p>
     * This example defines a comparison function and search an element in a {@link Array}:
     * <pre>{@code <!-- language="C" -->
     * static gint*
     * cmpint (gconstpointer a, gconstpointer b)
     * {
     *   const gint *_a = a;
     *   const gint *_b = b;
     * 
     *   return *_a - *_b;
     * }
     * ...
     * gint i = 424242;
     * guint matched_index;
     * gboolean result = g_array_binary_search (garray, &i, cmpint, &matched_index);
     * ...
     * }</pre>
     * @param array a {@link Array}.
     * @param target a pointer to the item to look up.
     * @param compareFunc A {@link CompareFunc} used to locate {@code target}.
     * @param outMatchIndex return location
     *    for the index of the element, if found.
     * @return {@code true} if {@code target} is one of the elements of {@code array}, {@code false} otherwise.
     */
    public static boolean binarySearch(java.lang.foreign.MemoryAddress[] array, @Nullable java.lang.foreign.MemoryAddress target, org.gtk.glib.CompareFunc compareFunc, Out<Integer> outMatchIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outMatchIndexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_array_binary_search.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        (Addressable) (target == null ? MemoryAddress.NULL : (Addressable) target),
                        (Addressable) compareFunc.toCallback(),
                        (Addressable) (outMatchIndex == null ? MemoryAddress.NULL : (Addressable) outMatchIndexPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (outMatchIndex != null) outMatchIndex.set(outMatchIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Create a shallow copy of a {@link Array}. If the array elements consist of
     * pointers to data, the pointers are copied but the actual data is not.
     * @param array A {@link Array}.
     * @return A copy of {@code array}.
     */
    public static PointerAddress copy(java.lang.foreign.MemoryAddress[] array) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_copy.invokeExact(Interop.allocateNativeArray(array, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
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
     * @param array a {@link Array}
     * @param freeSegment if {@code true} the actual element data is freed as well
     * @return the element data if {@code free_segment} is {@code false}, otherwise
     *     {@code null}. The element data should be freed using g_free().
     */
    public static java.lang.String free(java.lang.foreign.MemoryAddress[] array, boolean freeSegment) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_free.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        Marshal.booleanToInteger.marshal(freeSegment, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets the size of the elements in {@code array}.
     * @param array A {@link Array}
     * @return Size of each element, in bytes
     */
    public static int getElementSize(java.lang.foreign.MemoryAddress[] array) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_array_get_element_size.invokeExact(Interop.allocateNativeArray(array, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Inserts {@code len} elements into a {@link Array} at the given index.
     * <p>
     * If {@code index_} is greater than the array???s current length, the array is expanded.
     * The elements between the old end of the array and the newly inserted elements
     * will be initialised to zero if the array was configured to clear elements;
     * otherwise their values will be undefined.
     * <p>
     * If {@code index_} is less than the array???s current length, new entries will be
     * inserted into the array, and the existing entries above {@code index_} will be moved
     * upwards.
     * <p>
     * {@code data} may be {@code null} if (and only if) {@code len} is zero. If {@code len} is zero, this
     * function is a no-op.
     * @param array a {@link Array}
     * @param index the index to place the elements at
     * @param len the number of elements to insert
     * @return the {@link Array}
     */
    public static PointerAddress insertVals(java.lang.foreign.MemoryAddress[] array, int index, int len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_insert_vals.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        index,
                        (Addressable) MemoryAddress.NULL,
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Creates a new {@link Array} with a reference count of 1.
     * @param zeroTerminated {@code true} if the array should have an extra element at
     *     the end which is set to 0
     * @param clear {@code true} if {@link Array} elements should be automatically cleared
     *     to 0 when they are allocated
     * @param elementSize the size of each element in bytes
     * @return the new {@link Array}
     */
    public static PointerAddress new_(boolean zeroTerminated, boolean clear, int elementSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_new.invokeExact(
                        Marshal.booleanToInteger.marshal(zeroTerminated, null).intValue(),
                        Marshal.booleanToInteger.marshal(clear, null).intValue(),
                        elementSize);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Adds {@code len} elements onto the start of the array.
     * <p>
     * {@code data} may be {@code null} if (and only if) {@code len} is zero. If {@code len} is zero, this
     * function is a no-op.
     * <p>
     * This operation is slower than g_array_append_vals() since the
     * existing elements in the array have to be moved to make space for
     * the new elements.
     * @param array a {@link Array}
     * @param len the number of elements to prepend, which may be zero
     * @return the {@link Array}
     */
    public static PointerAddress prependVals(java.lang.foreign.MemoryAddress[] array, int len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_prepend_vals.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        (Addressable) MemoryAddress.NULL,
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Atomically increments the reference count of {@code array} by one.
     * This function is thread-safe and may be called from any thread.
     * @param array A {@link Array}
     * @return The passed in {@link Array}
     */
    public static PointerAddress ref(java.lang.foreign.MemoryAddress[] array) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_ref.invokeExact(Interop.allocateNativeArray(array, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Removes the element at the given index from a {@link Array}. The following
     * elements are moved down one place.
     * @param array a {@link Array}
     * @param index the index of the element to remove
     * @return the {@link Array}
     */
    public static PointerAddress removeIndex(java.lang.foreign.MemoryAddress[] array, int index) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_remove_index.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        index);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Removes the element at the given index from a {@link Array}. The last
     * element in the array is used to fill in the space, so this function
     * does not preserve the order of the {@link Array}. But it is faster than
     * g_array_remove_index().
     * @param array a {@code GArray}
     * @param index the index of the element to remove
     * @return the {@link Array}
     */
    public static PointerAddress removeIndexFast(java.lang.foreign.MemoryAddress[] array, int index) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_remove_index_fast.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        index);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Removes the given number of elements starting at the given index
     * from a {@link Array}.  The following elements are moved to close the gap.
     * @param array a {@code GArray}
     * @param index the index of the first element to remove
     * @param length the number of elements to remove
     * @return the {@link Array}
     */
    public static PointerAddress removeRange(java.lang.foreign.MemoryAddress[] array, int index, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_remove_range.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        index,
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Sets a function to clear an element of {@code array}.
     * <p>
     * The {@code clear_func} will be called when an element in the array
     * data segment is removed and when the array is freed and data
     * segment is deallocated as well. {@code clear_func} will be passed a
     * pointer to the element to clear, rather than the element itself.
     * <p>
     * Note that in contrast with other uses of {@link DestroyNotify}
     * functions, {@code clear_func} is expected to clear the contents of
     * the array element it is given, but not free the element itself.
     * <pre>{@code <!-- language="C" -->
     * typedef struct
     * {
     *   gchar *str;
     *   GObject *obj;
     * } ArrayElement;
     * 
     * static void
     * array_element_clear (ArrayElement *element)
     * {
     *   g_clear_pointer (&element->str, g_free);
     *   g_clear_object (&element->obj);
     * }
     * 
     * // main code
     * GArray *garray = g_array_new (FALSE, FALSE, sizeof (ArrayElement));
     * g_array_set_clear_func (garray, (GDestroyNotify) array_element_clear);
     * // assign data to the structure
     * g_array_free (garray, TRUE);
     * }</pre>
     * @param array A {@link Array}
     * @param clearFunc a function to clear an element of {@code array}
     */
    public static void setClearFunc(java.lang.foreign.MemoryAddress[] array, org.gtk.glib.DestroyNotify clearFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_array_set_clear_func.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        (Addressable) clearFunc.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the size of the array, expanding it if necessary. If the array
     * was created with {@code clear_} set to {@code true}, the new elements are set to 0.
     * @param array a {@link Array}
     * @param length the new size of the {@link Array}
     * @return the {@link Array}
     */
    public static PointerAddress setSize(java.lang.foreign.MemoryAddress[] array, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_set_size.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Creates a new {@link Array} with {@code reserved_size} elements preallocated and
     * a reference count of 1. This avoids frequent reallocation, if you
     * are going to add many elements to the array. Note however that the
     * size of the array is still 0.
     * @param zeroTerminated {@code true} if the array should have an extra element at
     *     the end with all bits cleared
     * @param clear {@code true} if all bits in the array should be cleared to 0 on
     *     allocation
     * @param elementSize size of each element in the array
     * @param reservedSize number of elements preallocated
     * @return the new {@link Array}
     */
    public static PointerAddress sizedNew(boolean zeroTerminated, boolean clear, int elementSize, int reservedSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_sized_new.invokeExact(
                        Marshal.booleanToInteger.marshal(zeroTerminated, null).intValue(),
                        Marshal.booleanToInteger.marshal(clear, null).intValue(),
                        elementSize,
                        reservedSize);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Sorts a {@link Array} using {@code compare_func} which should be a qsort()-style
     * comparison function (returns less than zero for first arg is less
     * than second arg, zero for equal, greater zero if first arg is
     * greater than second arg).
     * <p>
     * This is guaranteed to be a stable sort since version 2.32.
     * @param array a {@link Array}
     * @param compareFunc comparison function
     */
    public static void sort(java.lang.foreign.MemoryAddress[] array, org.gtk.glib.CompareFunc compareFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_array_sort.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        (Addressable) compareFunc.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
     * @param array a {@link Array}
     * @param compareFunc comparison function
     */
    public static void sortWithData(java.lang.foreign.MemoryAddress[] array, org.gtk.glib.CompareDataFunc compareFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_array_sort_with_data.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        (Addressable) compareFunc.toCallback(),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Frees the data in the array and resets the size to zero, while
     * the underlying array is preserved for use elsewhere and returned
     * to the caller.
     * <p>
     * If the array was created with the {@code zero_terminate} property
     * set to {@code true}, the returned data is zero terminated too.
     * <p>
     * If array elements contain dynamically-allocated memory,
     * the array elements should also be freed by the caller.
     * <p>
     * A short example of use:
     * <pre>{@code <!-- language="C" -->
     * ...
     * gpointer data;
     * gsize data_len;
     * data = g_array_steal (some_array, &data_len);
     * ...
     * }</pre>
     * @param array a {@link Array}.
     * @param len pointer to retrieve the number of
     *    elements of the original array
     * @return the element data, which should be
     *     freed using g_free().
     */
    public static @Nullable java.lang.foreign.MemoryAddress steal(java.lang.foreign.MemoryAddress[] array, Out<Long> len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_array_steal.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        (Addressable) (len == null ? MemoryAddress.NULL : (Addressable) lenPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (len != null) len.set(lenPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return RESULT;
        }
    }
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     * @param array A {@link Array}
     */
    public static void unref(java.lang.foreign.MemoryAddress[] array) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_array_unref.invokeExact(Interop.allocateNativeArray(array, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_array_append_vals = Interop.downcallHandle(
                "g_array_append_vals",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_binary_search = Interop.downcallHandle(
                "g_array_binary_search",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_array_copy = Interop.downcallHandle(
                "g_array_copy",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_array_free = Interop.downcallHandle(
                "g_array_free",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_get_element_size = Interop.downcallHandle(
                "g_array_get_element_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_array_insert_vals = Interop.downcallHandle(
                "g_array_insert_vals",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_new = Interop.downcallHandle(
                "g_array_new",
                FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_prepend_vals = Interop.downcallHandle(
                "g_array_prepend_vals",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_ref = Interop.downcallHandle(
                "g_array_ref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_array_remove_index = Interop.downcallHandle(
                "g_array_remove_index",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_remove_index_fast = Interop.downcallHandle(
                "g_array_remove_index_fast",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_remove_range = Interop.downcallHandle(
                "g_array_remove_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_set_clear_func = Interop.downcallHandle(
                "g_array_set_clear_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_array_set_size = Interop.downcallHandle(
                "g_array_set_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_sized_new = Interop.downcallHandle(
                "g_array_sized_new",
                FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_array_sort = Interop.downcallHandle(
                "g_array_sort",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_array_sort_with_data = Interop.downcallHandle(
                "g_array_sort_with_data",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_array_steal = Interop.downcallHandle(
                "g_array_steal",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_array_unref = Interop.downcallHandle(
                "g_array_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Array.Builder} object constructs a {@link Array} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Array.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Array struct;
        
        private Builder() {
            struct = Array.allocate();
        }
        
        /**
         * Finish building the {@link Array} struct.
         * @return A new instance of {@code Array} with the fields 
         *         that were set in the Builder object.
         */
        public Array build() {
            return struct;
        }
        
        /**
         * a pointer to the element data. The data may be moved as
         *     elements are added to the {@link Array}.
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.String data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(data, SCOPE)));
                return this;
            }
        }
        
        /**
         * the number of elements in the {@link Array} not including the
         *     possible terminating zero element.
         * @param len The value for the {@code len} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLen(int len) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("len"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), len);
                return this;
            }
        }
    }
}

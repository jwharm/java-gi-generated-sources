package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains the public fields of a GArray.
 */
public class Array extends io.github.jwharm.javagi.ResourceBase {

    public Array(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_array_append_vals = Interop.downcallHandle(
        "g_array_append_vals",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds {@code len} elements onto the end of the array.
     */
    public static PointerAddress appendVals(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull java.lang.foreign.MemoryAddress data, @NotNull int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_append_vals.invokeExact(Interop.allocateNativeArray(array), data, len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_copy = Interop.downcallHandle(
        "g_array_copy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Create a shallow copy of a {@link Array}. If the array elements consist of
     * pointers to data, the pointers are copied but the actual data is not.
     */
    public static PointerAddress copy(@NotNull java.lang.foreign.MemoryAddress[] array) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_copy.invokeExact(Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_free = Interop.downcallHandle(
        "g_array_free",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public static @NotNull java.lang.String free(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull boolean freeSegment) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_free.invokeExact(Interop.allocateNativeArray(array), freeSegment ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_array_get_element_size = Interop.downcallHandle(
        "g_array_get_element_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size of the elements in {@code array}.
     */
    public static int getElementSize(@NotNull java.lang.foreign.MemoryAddress[] array) {
        int RESULT;
        try {
            RESULT = (int) g_array_get_element_size.invokeExact(Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_array_insert_vals = Interop.downcallHandle(
        "g_array_insert_vals",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts {@code len} elements into a {@link Array} at the given index.
     * <p>
     * If {@code index_} is greater than the array’s current length, the array is expanded.
     * The elements between the old end of the array and the newly inserted elements
     * will be initialised to zero if the array was configured to clear elements;
     * otherwise their values will be undefined.
     * <p>
     * If {@code index_} is less than the array’s current length, new entries will be
     * inserted into the array, and the existing entries above {@code index_} will be moved
     * upwards.
     * <p>
     * {@code data} may be {@code null} if (and only if) {@code len} is zero. If {@code len} is zero, this
     * function is a no-op.
     */
    public static PointerAddress insertVals(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index, @Nullable java.lang.foreign.MemoryAddress data, @NotNull int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_insert_vals.invokeExact(Interop.allocateNativeArray(array), index, data, len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_new = Interop.downcallHandle(
        "g_array_new",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link Array} with a reference count of 1.
     */
    public static PointerAddress new_(@NotNull boolean zeroTerminated, @NotNull boolean clear, @NotNull int elementSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_new.invokeExact(zeroTerminated ? 1 : 0, clear ? 1 : 0, elementSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_prepend_vals = Interop.downcallHandle(
        "g_array_prepend_vals",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds {@code len} elements onto the start of the array.
     * <p>
     * {@code data} may be {@code null} if (and only if) {@code len} is zero. If {@code len} is zero, this
     * function is a no-op.
     * <p>
     * This operation is slower than g_array_append_vals() since the
     * existing elements in the array have to be moved to make space for
     * the new elements.
     */
    public static PointerAddress prependVals(@NotNull java.lang.foreign.MemoryAddress[] array, @Nullable java.lang.foreign.MemoryAddress data, @NotNull int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_prepend_vals.invokeExact(Interop.allocateNativeArray(array), data, len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_ref = Interop.downcallHandle(
        "g_array_ref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically increments the reference count of {@code array} by one.
     * This function is thread-safe and may be called from any thread.
     */
    public static PointerAddress ref(@NotNull java.lang.foreign.MemoryAddress[] array) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_ref.invokeExact(Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_remove_index = Interop.downcallHandle(
        "g_array_remove_index",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the element at the given index from a {@link Array}. The following
     * elements are moved down one place.
     */
    public static PointerAddress removeIndex(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_remove_index.invokeExact(Interop.allocateNativeArray(array), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_remove_index_fast = Interop.downcallHandle(
        "g_array_remove_index_fast",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the element at the given index from a {@link Array}. The last
     * element in the array is used to fill in the space, so this function
     * does not preserve the order of the {@link Array}. But it is faster than
     * g_array_remove_index().
     */
    public static PointerAddress removeIndexFast(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_remove_index_fast.invokeExact(Interop.allocateNativeArray(array), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_remove_range = Interop.downcallHandle(
        "g_array_remove_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the given number of elements starting at the given index
     * from a {@link Array}.  The following elements are moved to close the gap.
     */
    public static PointerAddress removeRange(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int index, @NotNull int length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_remove_range.invokeExact(Interop.allocateNativeArray(array), index, length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_set_size = Interop.downcallHandle(
        "g_array_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size of the array, expanding it if necessary. If the array
     * was created with {@code clear_} set to {@code true}, the new elements are set to 0.
     */
    public static PointerAddress setSize(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull int length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_set_size.invokeExact(Interop.allocateNativeArray(array), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_sized_new = Interop.downcallHandle(
        "g_array_sized_new",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link Array} with {@code reserved_size} elements preallocated and
     * a reference count of 1. This avoids frequent reallocation, if you
     * are going to add many elements to the array. Note however that the
     * size of the array is still 0.
     */
    public static PointerAddress sizedNew(@NotNull boolean zeroTerminated, @NotNull boolean clear, @NotNull int elementSize, @NotNull int reservedSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_sized_new.invokeExact(zeroTerminated ? 1 : 0, clear ? 1 : 0, elementSize, reservedSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerAddress(RESULT);
    }
    
    private static final MethodHandle g_array_sort_with_data = Interop.downcallHandle(
        "g_array_sort_with_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public static @NotNull void sortWithData(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull CompareDataFunc compareFunc) {
        try {
            g_array_sort_with_data.invokeExact(Interop.allocateNativeArray(array), 
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
    
    private static final MethodHandle g_array_steal = Interop.downcallHandle(
        "g_array_steal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static @Nullable java.lang.foreign.MemoryAddress steal(@NotNull java.lang.foreign.MemoryAddress[] array, @NotNull Out<Long> len) {
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_array_steal.invokeExact(Interop.allocateNativeArray(array), (Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return RESULT;
    }
    
    private static final MethodHandle g_array_unref = Interop.downcallHandle(
        "g_array_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static @NotNull void unref(@NotNull java.lang.foreign.MemoryAddress[] array) {
        try {
            g_array_unref.invokeExact(Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

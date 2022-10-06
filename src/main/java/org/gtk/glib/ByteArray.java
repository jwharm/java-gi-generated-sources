package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Contains the public fields of a GByteArray.
 */
public class ByteArray extends io.github.jwharm.javagi.ResourceBase {

    public ByteArray(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_byte_array_append = Interop.downcallHandle(
        "g_byte_array_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds the given bytes to the end of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     */
    public static PointerByte append(byte[] array, PointerByte data, int len) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_append.invokeExact(Interop.allocateNativeArray(array).handle(), data.handle(), len);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_free = Interop.downcallHandle(
        "g_byte_array_free",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Frees the memory allocated by the {@link ByteArray}. If {@code free_segment} is
     * {@code true} it frees the actual byte data. If the reference count of
     * {@code array} is greater than one, the {@link ByteArray} wrapper is preserved but
     * the size of {@code array} will be set to zero.
     */
    public static PointerByte free(byte[] array, boolean freeSegment) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_free.invokeExact(Interop.allocateNativeArray(array).handle(), freeSegment ? 1 : 0);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_free_to_bytes = Interop.downcallHandle(
        "g_byte_array_free_to_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transfers the data from the {@link ByteArray} into a new immutable {@link Bytes}.
     * <p>
     * The {@link ByteArray} is freed unless the reference count of {@code array} is greater
     * than one, the {@link ByteArray} wrapper is preserved but the size of {@code array}
     * will be set to zero.
     * <p>
     * This is identical to using g_bytes_new_take() and g_byte_array_free()
     * together.
     */
    public static Bytes freeToBytes(byte[] array) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_free_to_bytes.invokeExact(Interop.allocateNativeArray(array).handle());
            return new Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_new = Interop.downcallHandle(
        "g_byte_array_new",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Creates a new {@link ByteArray} with a reference count of 1.
     */
    public static PointerByte new_() {
        try {
            var RESULT = (MemoryAddress) g_byte_array_new.invokeExact();
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_new_take = Interop.downcallHandle(
        "g_byte_array_new_take",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Create byte array containing the data. The data will be owned by the array
     * and will be freed with g_free(), i.e. it could be allocated using g_strdup().
     * <p>
     * Do not use it if {@code len} is greater than {@code G_MAXUINT}. {@link ByteArray}
     * stores the length of its data in {@code guint}, which may be shorter than
     * {@code gsize}.
     */
    public static PointerByte newTake(byte[] data, long len) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_new_take.invokeExact(Interop.allocateNativeArray(data).handle(), len);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_prepend = Interop.downcallHandle(
        "g_byte_array_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds the given data to the start of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     */
    public static PointerByte prepend(byte[] array, PointerByte data, int len) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_prepend.invokeExact(Interop.allocateNativeArray(array).handle(), data.handle(), len);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_ref = Interop.downcallHandle(
        "g_byte_array_ref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically increments the reference count of {@code array} by one.
     * This function is thread-safe and may be called from any thread.
     */
    public static PointerByte ref(byte[] array) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_ref.invokeExact(Interop.allocateNativeArray(array).handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_remove_index = Interop.downcallHandle(
        "g_byte_array_remove_index",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the byte at the given index from a {@link ByteArray}.
     * The following bytes are moved down one place.
     */
    public static PointerByte removeIndex(byte[] array, int index) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_remove_index.invokeExact(Interop.allocateNativeArray(array).handle(), index);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_remove_index_fast = Interop.downcallHandle(
        "g_byte_array_remove_index_fast",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the byte at the given index from a {@link ByteArray}. The last
     * element in the array is used to fill in the space, so this function
     * does not preserve the order of the {@link ByteArray}. But it is faster
     * than g_byte_array_remove_index().
     */
    public static PointerByte removeIndexFast(byte[] array, int index) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_remove_index_fast.invokeExact(Interop.allocateNativeArray(array).handle(), index);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_remove_range = Interop.downcallHandle(
        "g_byte_array_remove_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the given number of bytes starting at the given index from a
     * {@link ByteArray}.  The following elements are moved to close the gap.
     */
    public static PointerByte removeRange(byte[] array, int index, int length) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_remove_range.invokeExact(Interop.allocateNativeArray(array).handle(), index, length);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_set_size = Interop.downcallHandle(
        "g_byte_array_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size of the {@link ByteArray}, expanding it if necessary.
     */
    public static PointerByte setSize(byte[] array, int length) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_set_size.invokeExact(Interop.allocateNativeArray(array).handle(), length);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_sized_new = Interop.downcallHandle(
        "g_byte_array_sized_new",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ByteArray} with {@code reserved_size} bytes preallocated.
     * This avoids frequent reallocation, if you are going to add many
     * bytes to the array. Note however that the size of the array is still
     * 0.
     */
    public static PointerByte sizedNew(int reservedSize) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_sized_new.invokeExact(reservedSize);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_sort_with_data = Interop.downcallHandle(
        "g_byte_array_sort_with_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_byte_array_sort(), but the comparison function takes an extra
     * user data argument.
     */
    public static void sortWithData(byte[] array, CompareDataFunc compareFunc) {
        try {
            g_byte_array_sort_with_data.invokeExact(Interop.allocateNativeArray(array).handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_steal = Interop.downcallHandle(
        "g_byte_array_steal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the data in the array and resets the size to zero, while
     * the underlying array is preserved for use elsewhere and returned
     * to the caller.
     */
    public static PointerByte steal(byte[] array, PointerLong len) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_steal.invokeExact(Interop.allocateNativeArray(array).handle(), len.handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_unref = Interop.downcallHandle(
        "g_byte_array_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static void unref(byte[] array) {
        try {
            g_byte_array_unref.invokeExact(Interop.allocateNativeArray(array).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

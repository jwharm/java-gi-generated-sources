package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains the public fields of a GByteArray.
 */
public class ByteArray extends io.github.jwharm.javagi.ResourceBase {

    public ByteArray(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_byte_array_append = Interop.downcallHandle(
        "g_byte_array_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds the given bytes to the end of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     */
    public static PointerByte append(@NotNull byte[] array, @NotNull PointerByte data, @NotNull int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_append.invokeExact(Interop.allocateNativeArray(array), data.handle(), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_free = Interop.downcallHandle(
        "g_byte_array_free",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Frees the memory allocated by the {@link ByteArray}. If {@code free_segment} is
     * {@code true} it frees the actual byte data. If the reference count of
     * {@code array} is greater than one, the {@link ByteArray} wrapper is preserved but
     * the size of {@code array} will be set to zero.
     */
    public static PointerByte free(@NotNull byte[] array, @NotNull boolean freeSegment) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_free.invokeExact(Interop.allocateNativeArray(array), freeSegment ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_free_to_bytes = Interop.downcallHandle(
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
    public static @NotNull Bytes freeToBytes(@NotNull byte[] array) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_free_to_bytes.invokeExact(Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Bytes(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_byte_array_new = Interop.downcallHandle(
        "g_byte_array_new",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Creates a new {@link ByteArray} with a reference count of 1.
     */
    public static PointerByte new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_new_take = Interop.downcallHandle(
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
    public static PointerByte newTake(@NotNull byte[] data, @NotNull long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_new_take.invokeExact(Interop.allocateNativeArray(data), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_prepend = Interop.downcallHandle(
        "g_byte_array_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds the given data to the start of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     */
    public static PointerByte prepend(@NotNull byte[] array, @NotNull PointerByte data, @NotNull int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_prepend.invokeExact(Interop.allocateNativeArray(array), data.handle(), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_ref = Interop.downcallHandle(
        "g_byte_array_ref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically increments the reference count of {@code array} by one.
     * This function is thread-safe and may be called from any thread.
     */
    public static PointerByte ref(@NotNull byte[] array) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_ref.invokeExact(Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_remove_index = Interop.downcallHandle(
        "g_byte_array_remove_index",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the byte at the given index from a {@link ByteArray}.
     * The following bytes are moved down one place.
     */
    public static PointerByte removeIndex(@NotNull byte[] array, @NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_remove_index.invokeExact(Interop.allocateNativeArray(array), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_remove_index_fast = Interop.downcallHandle(
        "g_byte_array_remove_index_fast",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the byte at the given index from a {@link ByteArray}. The last
     * element in the array is used to fill in the space, so this function
     * does not preserve the order of the {@link ByteArray}. But it is faster
     * than g_byte_array_remove_index().
     */
    public static PointerByte removeIndexFast(@NotNull byte[] array, @NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_remove_index_fast.invokeExact(Interop.allocateNativeArray(array), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_remove_range = Interop.downcallHandle(
        "g_byte_array_remove_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the given number of bytes starting at the given index from a
     * {@link ByteArray}.  The following elements are moved to close the gap.
     */
    public static PointerByte removeRange(@NotNull byte[] array, @NotNull int index, @NotNull int length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_remove_range.invokeExact(Interop.allocateNativeArray(array), index, length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_set_size = Interop.downcallHandle(
        "g_byte_array_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size of the {@link ByteArray}, expanding it if necessary.
     */
    public static PointerByte setSize(@NotNull byte[] array, @NotNull int length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_set_size.invokeExact(Interop.allocateNativeArray(array), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_sized_new = Interop.downcallHandle(
        "g_byte_array_sized_new",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ByteArray} with {@code reserved_size} bytes preallocated.
     * This avoids frequent reallocation, if you are going to add many
     * bytes to the array. Note however that the size of the array is still
     * 0.
     */
    public static PointerByte sizedNew(@NotNull int reservedSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_sized_new.invokeExact(reservedSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_sort_with_data = Interop.downcallHandle(
        "g_byte_array_sort_with_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_byte_array_sort(), but the comparison function takes an extra
     * user data argument.
     */
    public static @NotNull void sortWithData(@NotNull byte[] array, @NotNull CompareDataFunc compareFunc) {
        try {
            g_byte_array_sort_with_data.invokeExact(Interop.allocateNativeArray(array), 
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
    
    private static final MethodHandle g_byte_array_steal = Interop.downcallHandle(
        "g_byte_array_steal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the data in the array and resets the size to zero, while
     * the underlying array is preserved for use elsewhere and returned
     * to the caller.
     */
    public static PointerByte steal(@NotNull byte[] array, @NotNull Out<Long> len) {
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_byte_array_steal.invokeExact(Interop.allocateNativeArray(array), (Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_byte_array_unref = Interop.downcallHandle(
        "g_byte_array_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static @NotNull void unref(@NotNull byte[] array) {
        try {
            g_byte_array_unref.invokeExact(Interop.allocateNativeArray(array));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

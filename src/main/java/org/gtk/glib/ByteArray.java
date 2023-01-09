package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Contains the public fields of a GByteArray.
 */
public class ByteArray extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GByteArray";
    
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
     * Allocate a new {@link ByteArray}
     * @return A new, uninitialized @{link ByteArray}
     */
    public static ByteArray allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ByteArray newInstance = new ByteArray(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public PointerByte getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(PointerByte data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
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
     * Create a ByteArray proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ByteArray(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ByteArray> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ByteArray(input);
    
    /**
     * Adds the given bytes to the end of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     * @param array a {@link ByteArray}
     * @param data the byte data to be added
     * @param len the number of bytes to add
     * @return the {@link ByteArray}
     */
    public static PointerByte append(byte[] array, PointerByte data, int len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_append.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        data.handle(),
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Frees the memory allocated by the {@link ByteArray}. If {@code free_segment} is
     * {@code true} it frees the actual byte data. If the reference count of
     * {@code array} is greater than one, the {@link ByteArray} wrapper is preserved but
     * the size of {@code array} will be set to zero.
     * @param array a {@link ByteArray}
     * @param freeSegment if {@code true} the actual byte data is freed as well
     * @return the element data if {@code free_segment} is {@code false}, otherwise
     *          {@code null}.  The element data should be freed using g_free().
     */
    public static PointerByte free(byte[] array, boolean freeSegment) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_free.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        Marshal.booleanToInteger.marshal(freeSegment, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Transfers the data from the {@link ByteArray} into a new immutable {@link Bytes}.
     * <p>
     * The {@link ByteArray} is freed unless the reference count of {@code array} is greater
     * than one, the {@link ByteArray} wrapper is preserved but the size of {@code array}
     * will be set to zero.
     * <p>
     * This is identical to using g_bytes_new_take() and g_byte_array_free()
     * together.
     * @param array a {@link ByteArray}
     * @return a new immutable {@link Bytes} representing same
     *     byte data that was in the array
     */
    public static org.gtk.glib.Bytes freeToBytes(byte[] array) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_free_to_bytes.invokeExact(Interop.allocateNativeArray(array, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Creates a new {@link ByteArray} with a reference count of 1.
     * @return the new {@link ByteArray}
     */
    public static PointerByte new_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_new.invokeExact();
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Create byte array containing the data. The data will be owned by the array
     * and will be freed with g_free(), i.e. it could be allocated using g_strdup().
     * <p>
     * Do not use it if {@code len} is greater than {@code G_MAXUINT}. {@link ByteArray}
     * stores the length of its data in {@code guint}, which may be shorter than
     * {@code gsize}.
     * @param data byte data for the array
     * @param len length of {@code data}
     * @return a new {@link ByteArray}
     */
    public static PointerByte newTake(byte[] data, long len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_new_take.invokeExact(
                        Interop.allocateNativeArray(data, false, SCOPE),
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Adds the given data to the start of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     * @param array a {@link ByteArray}
     * @param data the byte data to be added
     * @param len the number of bytes to add
     * @return the {@link ByteArray}
     */
    public static PointerByte prepend(byte[] array, PointerByte data, int len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_prepend.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        data.handle(),
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Atomically increments the reference count of {@code array} by one.
     * This function is thread-safe and may be called from any thread.
     * @param array A {@link ByteArray}
     * @return The passed in {@link ByteArray}
     */
    public static PointerByte ref(byte[] array) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_ref.invokeExact(Interop.allocateNativeArray(array, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Removes the byte at the given index from a {@link ByteArray}.
     * The following bytes are moved down one place.
     * @param array a {@link ByteArray}
     * @param index the index of the byte to remove
     * @return the {@link ByteArray}
     */
    public static PointerByte removeIndex(byte[] array, int index) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_remove_index.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        index);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Removes the byte at the given index from a {@link ByteArray}. The last
     * element in the array is used to fill in the space, so this function
     * does not preserve the order of the {@link ByteArray}. But it is faster
     * than g_byte_array_remove_index().
     * @param array a {@link ByteArray}
     * @param index the index of the byte to remove
     * @return the {@link ByteArray}
     */
    public static PointerByte removeIndexFast(byte[] array, int index) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_remove_index_fast.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        index);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Removes the given number of bytes starting at the given index from a
     * {@link ByteArray}.  The following elements are moved to close the gap.
     * @param array a {@code GByteArray}
     * @param index the index of the first byte to remove
     * @param length the number of bytes to remove
     * @return the {@link ByteArray}
     */
    public static PointerByte removeRange(byte[] array, int index, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_remove_range.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        index,
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Sets the size of the {@link ByteArray}, expanding it if necessary.
     * @param array a {@link ByteArray}
     * @param length the new size of the {@link ByteArray}
     * @return the {@link ByteArray}
     */
    public static PointerByte setSize(byte[] array, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_set_size.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Creates a new {@link ByteArray} with {@code reserved_size} bytes preallocated.
     * This avoids frequent reallocation, if you are going to add many
     * bytes to the array. Note however that the size of the array is still
     * 0.
     * @param reservedSize number of bytes preallocated
     * @return the new {@link ByteArray}
     */
    public static PointerByte sizedNew(int reservedSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_sized_new.invokeExact(reservedSize);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Sorts a byte array, using {@code compare_func} which should be a
     * qsort()-style comparison function (returns less than zero for first
     * arg is less than second arg, zero for equal, greater than zero if
     * first arg is greater than second arg).
     * <p>
     * If two array elements compare equal, their order in the sorted array
     * is undefined. If you want equal elements to keep their order (i.e.
     * you want a stable sort) you can write a comparison function that,
     * if two elements would otherwise compare equal, compares them by
     * their addresses.
     * @param array a {@link ByteArray}
     * @param compareFunc comparison function
     */
    public static void sort(byte[] array, org.gtk.glib.CompareFunc compareFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_byte_array_sort.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        (Addressable) compareFunc.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Like g_byte_array_sort(), but the comparison function takes an extra
     * user data argument.
     * @param array a {@link ByteArray}
     * @param compareFunc comparison function
     */
    public static void sortWithData(byte[] array, org.gtk.glib.CompareDataFunc compareFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_byte_array_sort_with_data.invokeExact(
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
     * @param array a {@link ByteArray}.
     * @param len pointer to retrieve the number of
     *    elements of the original array
     * @return the element data, which should be
     *     freed using g_free().
     */
    public static PointerByte steal(byte[] array, Out<Long> len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_byte_array_steal.invokeExact(
                        Interop.allocateNativeArray(array, false, SCOPE),
                        (Addressable) (len == null ? MemoryAddress.NULL : (Addressable) lenPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (len != null) len.set(lenPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     * @param array A {@link ByteArray}
     */
    public static void unref(byte[] array) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_byte_array_unref.invokeExact(Interop.allocateNativeArray(array, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_byte_array_append = Interop.downcallHandle(
                "g_byte_array_append",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_byte_array_free = Interop.downcallHandle(
                "g_byte_array_free",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_byte_array_free_to_bytes = Interop.downcallHandle(
                "g_byte_array_free_to_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_byte_array_new = Interop.downcallHandle(
                "g_byte_array_new",
                FunctionDescriptor.ofVoid(),
                false
        );
        
        private static final MethodHandle g_byte_array_new_take = Interop.downcallHandle(
                "g_byte_array_new_take",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_byte_array_prepend = Interop.downcallHandle(
                "g_byte_array_prepend",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_byte_array_ref = Interop.downcallHandle(
                "g_byte_array_ref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_byte_array_remove_index = Interop.downcallHandle(
                "g_byte_array_remove_index",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_byte_array_remove_index_fast = Interop.downcallHandle(
                "g_byte_array_remove_index_fast",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_byte_array_remove_range = Interop.downcallHandle(
                "g_byte_array_remove_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_byte_array_set_size = Interop.downcallHandle(
                "g_byte_array_set_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_byte_array_sized_new = Interop.downcallHandle(
                "g_byte_array_sized_new",
                FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_byte_array_sort = Interop.downcallHandle(
                "g_byte_array_sort",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_byte_array_sort_with_data = Interop.downcallHandle(
                "g_byte_array_sort_with_data",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_byte_array_steal = Interop.downcallHandle(
                "g_byte_array_steal",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_byte_array_unref = Interop.downcallHandle(
                "g_byte_array_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link ByteArray.Builder} object constructs a {@link ByteArray} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ByteArray.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ByteArray struct;
        
        private Builder() {
            struct = ByteArray.allocate();
        }
        
        /**
         * Finish building the {@link ByteArray} struct.
         * @return A new instance of {@code ByteArray} with the fields 
         *         that were set in the Builder object.
         */
        public ByteArray build() {
            return struct;
        }
        
        /**
         * a pointer to the element data. The data may be moved as
         *     elements are added to the {@link ByteArray}
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(PointerByte data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
                return this;
            }
        }
        
        /**
         * the number of elements in the {@link ByteArray}
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

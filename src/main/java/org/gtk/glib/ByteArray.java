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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.C_INT.withName("len")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ByteArray}
     * @return A new, uninitialized @{link ByteArray}
     */
    public static ByteArray allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ByteArray newInstance = new ByteArray(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public PointerByte data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(PointerByte data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), data.handle());
    }
    
    /**
     * Get the value of the field {@code len}
     * @return The value of the field {@code len}
     */
    public int len$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code len}
     * @param len The new value of the field {@code len}
     */
    public void len$set(int len) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), len);
    }
    
    /**
     * Create a ByteArray proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ByteArray(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Adds the given bytes to the end of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     * @param array a {@link ByteArray}
     * @param data the byte data to be added
     * @param len the number of bytes to add
     * @return the {@link ByteArray}
     */
    public static @NotNull PointerByte append(@NotNull byte[] array, PointerByte data, int len) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_append.invokeExact(
                    Interop.allocateNativeArray(array, false),
                    data.handle(),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
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
    public static PointerByte free(@NotNull byte[] array, boolean freeSegment) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_free.invokeExact(
                    Interop.allocateNativeArray(array, false),
                    freeSegment ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
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
    public static @NotNull org.gtk.glib.Bytes freeToBytes(@NotNull byte[] array) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_free_to_bytes.invokeExact(
                    Interop.allocateNativeArray(array, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ByteArray} with a reference count of 1.
     * @return the new {@link ByteArray}
     */
    public static @NotNull PointerByte new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
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
    public static @NotNull PointerByte newTake(@NotNull byte[] data, long len) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_new_take.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Adds the given data to the start of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     * @param array a {@link ByteArray}
     * @param data the byte data to be added
     * @param len the number of bytes to add
     * @return the {@link ByteArray}
     */
    public static @NotNull PointerByte prepend(@NotNull byte[] array, PointerByte data, int len) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_prepend.invokeExact(
                    Interop.allocateNativeArray(array, false),
                    data.handle(),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Atomically increments the reference count of {@code array} by one.
     * This function is thread-safe and may be called from any thread.
     * @param array A {@link ByteArray}
     * @return The passed in {@link ByteArray}
     */
    public static @NotNull PointerByte ref(@NotNull byte[] array) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_ref.invokeExact(
                    Interop.allocateNativeArray(array, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Removes the byte at the given index from a {@link ByteArray}.
     * The following bytes are moved down one place.
     * @param array a {@link ByteArray}
     * @param index the index of the byte to remove
     * @return the {@link ByteArray}
     */
    public static @NotNull PointerByte removeIndex(@NotNull byte[] array, int index) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_remove_index.invokeExact(
                    Interop.allocateNativeArray(array, false),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
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
    public static @NotNull PointerByte removeIndexFast(@NotNull byte[] array, int index) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_remove_index_fast.invokeExact(
                    Interop.allocateNativeArray(array, false),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Removes the given number of bytes starting at the given index from a
     * {@link ByteArray}.  The following elements are moved to close the gap.
     * @param array a {@code GByteArray}
     * @param index the index of the first byte to remove
     * @param length the number of bytes to remove
     * @return the {@link ByteArray}
     */
    public static @NotNull PointerByte removeRange(@NotNull byte[] array, int index, int length) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_remove_range.invokeExact(
                    Interop.allocateNativeArray(array, false),
                    index,
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Sets the size of the {@link ByteArray}, expanding it if necessary.
     * @param array a {@link ByteArray}
     * @param length the new size of the {@link ByteArray}
     * @return the {@link ByteArray}
     */
    public static @NotNull PointerByte setSize(@NotNull byte[] array, int length) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_set_size.invokeExact(
                    Interop.allocateNativeArray(array, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Creates a new {@link ByteArray} with {@code reserved_size} bytes preallocated.
     * This avoids frequent reallocation, if you are going to add many
     * bytes to the array. Note however that the size of the array is still
     * 0.
     * @param reservedSize number of bytes preallocated
     * @return the new {@link ByteArray}
     */
    public static @NotNull PointerByte sizedNew(int reservedSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_sized_new.invokeExact(
                    reservedSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
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
    public static void sort(@NotNull byte[] array, @NotNull org.gtk.glib.CompareFunc compareFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Like g_byte_array_sort(), but the comparison function takes an extra
     * user data argument.
     * @param array a {@link ByteArray}
     * @param compareFunc comparison function
     */
    public static void sortWithData(@NotNull byte[] array, @NotNull org.gtk.glib.CompareDataFunc compareFunc) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        java.util.Objects.requireNonNull(compareFunc, "Parameter 'compareFunc' must not be null");
        try {
            DowncallHandles.g_byte_array_sort_with_data.invokeExact(
                    Interop.allocateNativeArray(array, false),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
     * @param array a {@link ByteArray}.
     * @param len pointer to retrieve the number of
     *    elements of the original array
     * @return the element data, which should be
     *     freed using g_free().
     */
    public static PointerByte steal(@NotNull byte[] array, Out<Long> len) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        java.util.Objects.requireNonNull(len, "Parameter 'len' must not be null");
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_steal.invokeExact(
                    Interop.allocateNativeArray(array, false),
                    (Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new PointerByte(RESULT);
    }
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     * @param array A {@link ByteArray}
     */
    public static void unref(@NotNull byte[] array) {
        java.util.Objects.requireNonNull(array, "Parameter 'array' must not be null");
        try {
            DowncallHandles.g_byte_array_unref.invokeExact(
                    Interop.allocateNativeArray(array, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ByteArray struct;
        
         /**
         * A {@link ByteArray.Build} object constructs a {@link ByteArray} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ByteArray.allocate();
        }
        
         /**
         * Finish building the {@link ByteArray} struct.
         * @return A new instance of {@code ByteArray} with the fields 
         *         that were set in the Build object.
         */
        public ByteArray construct() {
            return struct;
        }
        
        /**
         * a pointer to the element data. The data may be moved as
         *     elements are added to the {@link ByteArray}
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(PointerByte data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
            return this;
        }
        
        /**
         * the number of elements in the {@link ByteArray}
         * @param len The value for the {@code len} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLen(int len) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("len"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), len);
            return this;
        }
    }
}

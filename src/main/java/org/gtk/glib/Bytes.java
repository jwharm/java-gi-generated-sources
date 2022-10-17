package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A simple refcounted data type representing an immutable sequence of zero or
 * more bytes from an unspecified origin.
 * <p>
 * The purpose of a {@link Bytes} is to keep the memory region that it holds
 * alive for as long as anyone holds a reference to the bytes.  When
 * the last reference count is dropped, the memory is released. Multiple
 * unrelated callers can use byte data in the {@link Bytes} without coordinating
 * their activities, resting assured that the byte data will not change or
 * move while they hold a reference.
 * <p>
 * A {@link Bytes} can come from many different origins that may have
 * different procedures for freeing the memory region.  Examples are
 * memory from g_malloc(), from memory slices, from a {@link MappedFile} or
 * memory from other allocators.
 * <p>
 * {@link Bytes} work well as keys in {@link HashTable}. Use g_bytes_equal() and
 * g_bytes_hash() as parameters to g_hash_table_new() or g_hash_table_new_full().
 * {@link Bytes} can also be used as keys in a {@link Tree} by passing the g_bytes_compare()
 * function to g_tree_new().
 * <p>
 * The data pointed to by this bytes must not be modified. For a mutable
 * array of bytes see {@link ByteArray}. Use g_bytes_unref_to_array() to create a
 * mutable array for a {@link Bytes} sequence. To create an immutable {@link Bytes} from
 * a mutable {@link ByteArray}, use the g_byte_array_free_to_bytes() function.
 */
public class Bytes extends io.github.jwharm.javagi.ResourceBase {

    public Bytes(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_bytes_new = Interop.downcallHandle(
        "g_bytes_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(@Nullable byte[] data, @NotNull long size) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_bytes_new.invokeExact(Interop.allocateNativeArray(data), size), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Bytes} from {@code data}.
     * <p>
     * {@code data} is copied. If {@code size} is 0, {@code data} may be {@code null}.
     */
    public Bytes(@Nullable byte[] data, @NotNull long size) {
        super(constructNew(data, size));
    }
    
    private static final MethodHandle g_bytes_new_static = Interop.downcallHandle(
        "g_bytes_new_static",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewStatic(@Nullable byte[] data, @NotNull long size) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_bytes_new_static.invokeExact(Interop.allocateNativeArray(data), size), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Bytes} from static data.
     * <p>
     * {@code data} must be static (ie: never modified or freed). It may be {@code null} if {@code size}
     * is 0.
     */
    public static Bytes newStatic(@Nullable byte[] data, @NotNull long size) {
        return new Bytes(constructNewStatic(data, size));
    }
    
    private static final MethodHandle g_bytes_new_take = Interop.downcallHandle(
        "g_bytes_new_take",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewTake(@Nullable byte[] data, @NotNull long size) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_bytes_new_take.invokeExact(Interop.allocateNativeArray(data), size), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Bytes} from {@code data}.
     * <p>
     * After this call, {@code data} belongs to the bytes and may no longer be
     * modified by the caller.  g_free() will be called on {@code data} when the
     * bytes is no longer in use. Because of this {@code data} must have been created by
     * a call to g_malloc(), g_malloc0() or g_realloc() or by one of the many
     * functions that wrap these calls (such as g_new(), g_strdup(), etc).
     * <p>
     * For creating {@link Bytes} with memory from other allocators, see
     * g_bytes_new_with_free_func().
     * <p>
     * {@code data} may be {@code null} if {@code size} is 0.
     */
    public static Bytes newTake(@Nullable byte[] data, @NotNull long size) {
        return new Bytes(constructNewTake(data, size));
    }
    
    private static final MethodHandle g_bytes_new_with_free_func = Interop.downcallHandle(
        "g_bytes_new_with_free_func",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithFreeFunc(@Nullable byte[] data, @NotNull long size, @NotNull DestroyNotify freeFunc, @Nullable java.lang.foreign.MemoryAddress userData) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_bytes_new_with_free_func.invokeExact(Interop.allocateNativeArray(data), size, 
                    Interop.cbDestroyNotifySymbol(), userData), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link Bytes} from {@code data}.
     * <p>
     * When the last reference is dropped, {@code free_func} will be called with the
     * {@code user_data} argument.
     * <p>
     * {@code data} must not be modified after this call is made until {@code free_func} has
     * been called to indicate that the bytes is no longer in use.
     * <p>
     * {@code data} may be {@code null} if {@code size} is 0.
     */
    public static Bytes newWithFreeFunc(@Nullable byte[] data, @NotNull long size, @NotNull DestroyNotify freeFunc, @Nullable java.lang.foreign.MemoryAddress userData) {
        return new Bytes(constructNewWithFreeFunc(data, size, freeFunc, userData));
    }
    
    private static final MethodHandle g_bytes_compare = Interop.downcallHandle(
        "g_bytes_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares the two {@link Bytes} values.
     * <p>
     * This function can be used to sort GBytes instances in lexicographical order.
     * <p>
     * If {@code bytes1} and {@code bytes2} have different length but the shorter one is a
     * prefix of the longer one then the shorter one is considered to be less than
     * the longer one. Otherwise the first byte where both differ is used for
     * comparison. If {@code bytes1} has a smaller value at that position it is
     * considered less, otherwise greater than {@code bytes2}.
     */
    public int compare(@NotNull Bytes bytes2) {
        int RESULT;
        try {
            RESULT = (int) g_bytes_compare.invokeExact(handle(), bytes2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_bytes_equal = Interop.downcallHandle(
        "g_bytes_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares the two {@link Bytes} values being pointed to and returns
     * {@code true} if they are equal.
     * <p>
     * This function can be passed to g_hash_table_new() as the {@code key_equal_func}
     * parameter, when using non-{@code null} {@link Bytes} pointers as keys in a {@link HashTable}.
     */
    public boolean equal(@NotNull Bytes bytes2) {
        int RESULT;
        try {
            RESULT = (int) g_bytes_equal.invokeExact(handle(), bytes2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bytes_get_data = Interop.downcallHandle(
        "g_bytes_get_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the byte data in the {@link Bytes}. This data should not be modified.
     * <p>
     * This function will always return the same pointer for a given {@link Bytes}.
     * <p>
     * {@code null} may be returned if {@code size} is 0. This is not guaranteed, as the {@link Bytes}
     * may represent an empty string with {@code data} non-{@code null} and {@code size} as 0. {@code null} will
     * not be returned if {@code size} is non-zero.
     */
    public byte[] getData(@NotNull Out<Long> size) {
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bytes_get_data.invokeExact(handle(), (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(ValueLayout.JAVA_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), size.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE);
    }
    
    private static final MethodHandle g_bytes_get_region = Interop.downcallHandle(
        "g_bytes_get_region",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Gets a pointer to a region in {@code bytes}.
     * <p>
     * The region starts at {@code offset} many bytes from the start of the data
     * and contains {@code n_elements} many elements of {@code element_size} size.
     * <p>
     * {@code n_elements} may be zero, but {@code element_size} must always be non-zero.
     * Ideally, {@code element_size} is a static constant (eg: sizeof a struct).
     * <p>
     * This function does careful bounds checking (including checking for
     * arithmetic overflows) and returns a non-{@code null} pointer if the
     * specified region lies entirely within the {@code bytes}. If the region is
     * in some way out of range, or if an overflow has occurred, then {@code null}
     * is returned.
     * <p>
     * Note: it is possible to have a valid zero-size region. In this case,
     * the returned pointer will be equal to the base pointer of the data of
     * {@code bytes}, plus {@code offset}.  This will be non-{@code null} except for the case
     * where {@code bytes} itself was a zero-sized region.  Since it is unlikely
     * that you will be using this function to check for a zero-sized region
     * in a zero-sized {@code bytes}, {@code null} effectively always means "error".
     */
    public @Nullable java.lang.foreign.MemoryAddress getRegion(@NotNull long elementSize, @NotNull long offset, @NotNull long nElements) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bytes_get_region.invokeExact(handle(), elementSize, offset, nElements);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_bytes_get_size = Interop.downcallHandle(
        "g_bytes_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the size of the byte data in the {@link Bytes}.
     * <p>
     * This function will always return the same value for a given {@link Bytes}.
     */
    public long getSize() {
        long RESULT;
        try {
            RESULT = (long) g_bytes_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_bytes_hash = Interop.downcallHandle(
        "g_bytes_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates an integer hash code for the byte data in the {@link Bytes}.
     * <p>
     * This function can be passed to g_hash_table_new() as the {@code key_hash_func}
     * parameter, when using non-{@code null} {@link Bytes} pointers as keys in a {@link HashTable}.
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) g_bytes_hash.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_bytes_new_from_bytes = Interop.downcallHandle(
        "g_bytes_new_from_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Creates a {@link Bytes} which is a subsection of another {@link Bytes}. The {@code offset} +
     * {@code length} may not be longer than the size of {@code bytes}.
     * <p>
     * A reference to {@code bytes} will be held by the newly created {@link Bytes} until
     * the byte data is no longer needed.
     * <p>
     * Since 2.56, if {@code offset} is 0 and {@code length} matches the size of {@code bytes}, then
     * {@code bytes} will be returned with the reference count incremented by 1. If {@code bytes}
     * is a slice of another {@link Bytes}, then the resulting {@link Bytes} will reference
     * the same {@link Bytes} instead of {@code bytes}. This allows consumers to simplify the
     * usage of {@link Bytes} when asynchronously writing to streams.
     */
    public @NotNull Bytes newFromBytes(@NotNull long offset, @NotNull long length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bytes_new_from_bytes.invokeExact(handle(), offset, length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Bytes(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_bytes_ref = Interop.downcallHandle(
        "g_bytes_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increase the reference count on {@code bytes}.
     */
    public @NotNull Bytes ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bytes_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Bytes(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_bytes_unref = Interop.downcallHandle(
        "g_bytes_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases a reference on {@code bytes}.  This may result in the bytes being
     * freed. If {@code bytes} is {@code null}, it will return immediately.
     */
    public @NotNull void unref() {
        try {
            g_bytes_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bytes_unref_to_array = Interop.downcallHandle(
        "g_bytes_unref_to_array",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unreferences the bytes, and returns a new mutable {@link ByteArray} containing
     * the same byte data.
     * <p>
     * As an optimization, the byte data is transferred to the array without copying
     * if this was the last reference to bytes and bytes was created with
     * g_bytes_new(), g_bytes_new_take() or g_byte_array_free_to_bytes(). In all
     * other cases the data is copied.
     * <p>
     * Do not use it if {@code bytes} contains more than {@code G_MAXUINT}
     * bytes. {@link ByteArray} stores the length of its data in {@code guint}, which
     * may be shorter than {@code gsize}, that {@code bytes} is using.
     */
    public PointerByte unrefToArray() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bytes_unref_to_array.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_bytes_unref_to_data = Interop.downcallHandle(
        "g_bytes_unref_to_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unreferences the bytes, and returns a pointer the same byte data
     * contents.
     * <p>
     * As an optimization, the byte data is returned without copying if this was
     * the last reference to bytes and bytes was created with g_bytes_new(),
     * g_bytes_new_take() or g_byte_array_free_to_bytes(). In all other cases the
     * data is copied.
     */
    public byte[] unrefToData(@NotNull Out<Long> size) {
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bytes_unref_to_data.invokeExact(handle(), (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(ValueLayout.JAVA_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), size.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE);
    }
    
}

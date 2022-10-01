package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    public ByteArray() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GByteArray.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Adds the given bytes to the end of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     */
    public static PointerIterator<Byte> append(byte[] array, PointerByte data, int len) {
        var RESULT = gtk_h.g_byte_array_append(Interop.allocateNativeArray(array).handle(), data.handle(), len);
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Frees the memory allocated by the {@link ByteArray}. If {@code free_segment} is
     * {@code true} it frees the actual byte data. If the reference count of
     * {@code array} is greater than one, the {@link ByteArray} wrapper is preserved but
     * the size of {@code array} will be set to zero.
     */
    public static PointerByte free(byte[] array, boolean freeSegment) {
        var RESULT = gtk_h.g_byte_array_free(Interop.allocateNativeArray(array).handle(), freeSegment ? 1 : 0);
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
     */
    public static Bytes freeToBytes(byte[] array) {
        var RESULT = gtk_h.g_byte_array_free_to_bytes(Interop.allocateNativeArray(array).handle());
        return new Bytes(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ByteArray} with a reference count of 1.
     */
    public static PointerIterator<Byte> new_() {
        var RESULT = gtk_h.g_byte_array_new();
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Create byte array containing the data. The data will be owned by the array
     * and will be freed with g_free(), i.e. it could be allocated using g_strdup().
     * <p>
     * Do not use it if {@code len} is greater than {@code G_MAXUINT}. {@link ByteArray}
     * stores the length of its data in {@code guint}, which may be shorter than
     * {@code gsize}.
     */
    public static PointerIterator<Byte> newTake(byte[] data, long len) {
        var RESULT = gtk_h.g_byte_array_new_take(Interop.allocateNativeArray(data).handle(), len);
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Adds the given data to the start of the {@link ByteArray}.
     * The array will grow in size automatically if necessary.
     */
    public static PointerIterator<Byte> prepend(byte[] array, PointerByte data, int len) {
        var RESULT = gtk_h.g_byte_array_prepend(Interop.allocateNativeArray(array).handle(), data.handle(), len);
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Atomically increments the reference count of {@code array} by one.
     * This function is thread-safe and may be called from any thread.
     */
    public static PointerIterator<Byte> ref(byte[] array) {
        var RESULT = gtk_h.g_byte_array_ref(Interop.allocateNativeArray(array).handle());
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Removes the byte at the given index from a {@link ByteArray}.
     * The following bytes are moved down one place.
     */
    public static PointerIterator<Byte> removeIndex(byte[] array, int index) {
        var RESULT = gtk_h.g_byte_array_remove_index(Interop.allocateNativeArray(array).handle(), index);
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Removes the byte at the given index from a {@link ByteArray}. The last
     * element in the array is used to fill in the space, so this function
     * does not preserve the order of the {@link ByteArray}. But it is faster
     * than g_byte_array_remove_index().
     */
    public static PointerIterator<Byte> removeIndexFast(byte[] array, int index) {
        var RESULT = gtk_h.g_byte_array_remove_index_fast(Interop.allocateNativeArray(array).handle(), index);
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Removes the given number of bytes starting at the given index from a
     * {@link ByteArray}.  The following elements are moved to close the gap.
     */
    public static PointerIterator<Byte> removeRange(byte[] array, int index, int length) {
        var RESULT = gtk_h.g_byte_array_remove_range(Interop.allocateNativeArray(array).handle(), index, length);
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Sets the size of the {@link ByteArray}, expanding it if necessary.
     */
    public static PointerIterator<Byte> setSize(byte[] array, int length) {
        var RESULT = gtk_h.g_byte_array_set_size(Interop.allocateNativeArray(array).handle(), length);
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Creates a new {@link ByteArray} with {@code reserved_size} bytes preallocated.
     * This avoids frequent reallocation, if you are going to add many
     * bytes to the array. Note however that the size of the array is still
     * 0.
     */
    public static PointerIterator<Byte> sizedNew(int reservedSize) {
        var RESULT = gtk_h.g_byte_array_sized_new(reservedSize);
        return new PointerByte(RESULT).iterator();
    }
    
    /**
     * Like g_byte_array_sort(), but the comparison function takes an extra
     * user data argument.
     */
    public static void sortWithData(byte[] array, CompareDataFunc compareFunc) {
        try {
            gtk_h.g_byte_array_sort_with_data(Interop.allocateNativeArray(array).handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Frees the data in the array and resets the size to zero, while
     * the underlying array is preserved for use elsewhere and returned
     * to the caller.
     */
    public static PointerByte steal(byte[] array, PointerLong len) {
        var RESULT = gtk_h.g_byte_array_steal(Interop.allocateNativeArray(array).handle(), len.handle());
        return new PointerByte(RESULT);
    }
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static void unref(byte[] array) {
        gtk_h.g_byte_array_unref(Interop.allocateNativeArray(array).handle());
    }
    
}

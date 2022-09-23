package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public Bytes(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(byte[] data, long size) {
        Reference RESULT = References.get(gtk_h.g_bytes_new(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), size), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Bytes} from {@code data}.
     * <p>
     * {@code data} is copied. If {@code size} is 0, {@code data} may be {@code null}.
     */
    public Bytes(byte[] data, long size) {
        super(constructNew(data, size));
    }
    
    private static Reference constructNewStatic(byte[] data, long size) {
        Reference RESULT = References.get(gtk_h.g_bytes_new_static(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), size), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Bytes} from static data.
     * <p>
     * {@code data} must be static (ie: never modified or freed). It may be {@code null} if {@code size}
     * is 0.
     */
    public static Bytes newStatic(byte[] data, long size) {
        return new Bytes(constructNewStatic(data, size));
    }
    
    private static Reference constructNewTake(byte[] data, long size) {
        Reference RESULT = References.get(gtk_h.g_bytes_new_take(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), size), true);
        return RESULT;
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
    public static Bytes newTake(byte[] data, long size) {
        return new Bytes(constructNewTake(data, size));
    }
    
    private static Reference constructNewWithFreeFunc(byte[] data, long size, DestroyNotify freeFunc, java.lang.foreign.MemoryAddress userData) {
        Reference RESULT = References.get(gtk_h.g_bytes_new_with_free_func(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), size, 
                    Interop.cbDestroyNotifySymbol(), userData), true);
        return RESULT;
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
    public static Bytes newWithFreeFunc(byte[] data, long size, DestroyNotify freeFunc, java.lang.foreign.MemoryAddress userData) {
        return new Bytes(constructNewWithFreeFunc(data, size, freeFunc, userData));
    }
    
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
    public int compare(Bytes bytes2) {
        var RESULT = gtk_h.g_bytes_compare(handle(), bytes2.handle());
        return RESULT;
    }
    
    /**
     * Compares the two {@link Bytes} values being pointed to and returns
     * {@code true} if they are equal.
     * <p>
     * This function can be passed to g_hash_table_new() as the {@code key_equal_func}
     * parameter, when using non-{@code null} {@link Bytes} pointers as keys in a {@link HashTable}.
     */
    public boolean equal(Bytes bytes2) {
        var RESULT = gtk_h.g_bytes_equal(handle(), bytes2.handle());
        return (RESULT != 0);
    }
    
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
    public java.lang.foreign.MemoryAddress getRegion(long elementSize, long offset, long nElements) {
        var RESULT = gtk_h.g_bytes_get_region(handle(), elementSize, offset, nElements);
        return RESULT;
    }
    
    /**
     * Get the size of the byte data in the {@link Bytes}.
     * <p>
     * This function will always return the same value for a given {@link Bytes}.
     */
    public long getSize() {
        var RESULT = gtk_h.g_bytes_get_size(handle());
        return RESULT;
    }
    
    /**
     * Creates an integer hash code for the byte data in the {@link Bytes}.
     * <p>
     * This function can be passed to g_hash_table_new() as the {@code key_hash_func}
     * parameter, when using non-{@code null} {@link Bytes} pointers as keys in a {@link HashTable}.
     */
    public int hash() {
        var RESULT = gtk_h.g_bytes_hash(handle());
        return RESULT;
    }
    
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
    public Bytes newFromBytes(long offset, long length) {
        var RESULT = gtk_h.g_bytes_new_from_bytes(handle(), offset, length);
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Increase the reference count on {@code bytes}.
     */
    public Bytes ref() {
        var RESULT = gtk_h.g_bytes_ref(handle());
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on {@code bytes}.  This may result in the bytes being
     * freed. If {@code bytes} is {@code null}, it will return immediately.
     */
    public void unref() {
        gtk_h.g_bytes_unref(handle());
    }
    
}

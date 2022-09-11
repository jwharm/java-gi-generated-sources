package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A simple refcounted data type representing an immutable sequence of zero or
 * more bytes from an unspecified origin.
 * 
 * The purpose of a #GBytes is to keep the memory region that it holds
 * alive for as long as anyone holds a reference to the bytes.  When
 * the last reference count is dropped, the memory is released. Multiple
 * unrelated callers can use byte data in the #GBytes without coordinating
 * their activities, resting assured that the byte data will not change or
 * move while they hold a reference.
 * 
 * A #GBytes can come from many different origins that may have
 * different procedures for freeing the memory region.  Examples are
 * memory from g_malloc(), from memory slices, from a #GMappedFile or
 * memory from other allocators.
 * 
 * #GBytes work well as keys in #GHashTable. Use g_bytes_equal() and
 * g_bytes_hash() as parameters to g_hash_table_new() or g_hash_table_new_full().
 * #GBytes can also be used as keys in a #GTree by passing the g_bytes_compare()
 * function to g_tree_new().
 * 
 * The data pointed to by this bytes must not be modified. For a mutable
 * array of bytes see #GByteArray. Use g_bytes_unref_to_array() to create a
 * mutable array for a #GBytes sequence. To create an immutable #GBytes from
 * a mutable #GByteArray, use the g_byte_array_free_to_bytes() function.
 */
public class Bytes extends io.github.jwharm.javagi.interop.ResourceBase {

    public Bytes(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a new #GBytes from @data.
     * 
     * @data is copied. If @size is 0, @data may be %NULL.
     */
    public Bytes(byte[] data, long size) {
        super(References.get(gtk_h.g_bytes_new(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), size), true));
    }
    
    /**
     * Creates a new #GBytes from static data.
     * 
     * @data must be static (ie: never modified or freed). It may be %NULL if @size
     * is 0.
     */
    public static Bytes newStatic(byte[] data, long size) {
        return new Bytes(References.get(gtk_h.g_bytes_new_static(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), size), true));
    }
    
    /**
     * Creates a new #GBytes from @data.
     * 
     * After this call, @data belongs to the bytes and may no longer be
     * modified by the caller.  g_free() will be called on @data when the
     * bytes is no longer in use. Because of this @data must have been created by
     * a call to g_malloc(), g_malloc0() or g_realloc() or by one of the many
     * functions that wrap these calls (such as g_new(), g_strdup(), etc).
     * 
     * For creating #GBytes with memory from other allocators, see
     * g_bytes_new_with_free_func().
     * 
     * @data may be %NULL if @size is 0.
     */
    public static Bytes newTake(byte[] data, long size) {
        return new Bytes(References.get(gtk_h.g_bytes_new_take(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), size), true));
    }
    
    /**
     * Creates a #GBytes from @data.
     * 
     * When the last reference is dropped, @free_func will be called with the
     * @user_data argument.
     * 
     * @data must not be modified after this call is made until @free_func has
     * been called to indicate that the bytes is no longer in use.
     * 
     * @data may be %NULL if @size is 0.
     */
    public static Bytes newWithFreeFunc(byte[] data, long size, DestroyNotify freeFunc, jdk.incubator.foreign.MemoryAddress userData) {
        return new Bytes(References.get(gtk_h.g_bytes_new_with_free_func(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), size, freeFunc, userData), true));
    }
    
    /**
     * Compares the two #GBytes values.
     * 
     * This function can be used to sort GBytes instances in lexicographical order.
     * 
     * If @bytes1 and @bytes2 have different length but the shorter one is a
     * prefix of the longer one then the shorter one is considered to be less than
     * the longer one. Otherwise the first byte where both differ is used for
     * comparison. If @bytes1 has a smaller value at that position it is
     * considered less, otherwise greater than @bytes2.
     */
    public int compare(Bytes bytes2) {
        var RESULT = gtk_h.g_bytes_compare(handle(), bytes2.handle());
        return RESULT;
    }
    
    /**
     * Compares the two #GBytes values being pointed to and returns
     * %TRUE if they are equal.
     * 
     * This function can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using non-%NULL #GBytes pointers as keys in a #GHashTable.
     */
    public boolean equal(Bytes bytes2) {
        var RESULT = gtk_h.g_bytes_equal(handle(), bytes2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets a pointer to a region in @bytes.
     * 
     * The region starts at @offset many bytes from the start of the data
     * and contains @n_elements many elements of @element_size size.
     * 
     * @n_elements may be zero, but @element_size must always be non-zero.
     * Ideally, @element_size is a static constant (eg: sizeof a struct).
     * 
     * This function does careful bounds checking (including checking for
     * arithmetic overflows) and returns a non-%NULL pointer if the
     * specified region lies entirely within the @bytes. If the region is
     * in some way out of range, or if an overflow has occurred, then %NULL
     * is returned.
     * 
     * Note: it is possible to have a valid zero-size region. In this case,
     * the returned pointer will be equal to the base pointer of the data of
     * @bytes, plus @offset.  This will be non-%NULL except for the case
     * where @bytes itself was a zero-sized region.  Since it is unlikely
     * that you will be using this function to check for a zero-sized region
     * in a zero-sized @bytes, %NULL effectively always means "error".
     */
    public jdk.incubator.foreign.MemoryAddress getRegion(long elementSize, long offset, long nElements) {
        var RESULT = gtk_h.g_bytes_get_region(handle(), elementSize, offset, nElements);
        return RESULT;
    }
    
    /**
     * Get the size of the byte data in the #GBytes.
     * 
     * This function will always return the same value for a given #GBytes.
     */
    public long getSize() {
        var RESULT = gtk_h.g_bytes_get_size(handle());
        return RESULT;
    }
    
    /**
     * Creates an integer hash code for the byte data in the #GBytes.
     * 
     * This function can be passed to g_hash_table_new() as the @key_hash_func
     * parameter, when using non-%NULL #GBytes pointers as keys in a #GHashTable.
     */
    public int hash() {
        var RESULT = gtk_h.g_bytes_hash(handle());
        return RESULT;
    }
    
    /**
     * Creates a #GBytes which is a subsection of another #GBytes. The @offset +
     * @length may not be longer than the size of @bytes.
     * 
     * A reference to @bytes will be held by the newly created #GBytes until
     * the byte data is no longer needed.
     * 
     * Since 2.56, if @offset is 0 and @length matches the size of @bytes, then
     * @bytes will be returned with the reference count incremented by 1. If @bytes
     * is a slice of another #GBytes, then the resulting #GBytes will reference
     * the same #GBytes instead of @bytes. This allows consumers to simplify the
     * usage of #GBytes when asynchronously writing to streams.
     */
    public Bytes newFromBytes(long offset, long length) {
        var RESULT = gtk_h.g_bytes_new_from_bytes(handle(), offset, length);
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Increase the reference count on @bytes.
     */
    public Bytes ref() {
        var RESULT = gtk_h.g_bytes_ref(handle());
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on @bytes.  This may result in the bytes being
     * freed. If @bytes is %NULL, it will return immediately.
     */
    public void unref() {
        gtk_h.g_bytes_unref(handle());
    }
    
}

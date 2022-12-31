package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque data structure representing String Chunks.
 * It should only be accessed by using the following functions.
 */
public class StringChunk extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GStringChunk";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link StringChunk}
     * @return A new, uninitialized @{link StringChunk}
     */
    public static StringChunk allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        StringChunk newInstance = new StringChunk(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a StringChunk proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected StringChunk(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, StringChunk> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new StringChunk(input, ownership);
    
    /**
     * Frees all strings contained within the {@link StringChunk}.
     * After calling g_string_chunk_clear() it is not safe to
     * access any of the strings which were contained within it.
     */
    public void clear() {
        try {
            DowncallHandles.g_string_chunk_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees all memory allocated by the {@link StringChunk}.
     * After calling g_string_chunk_free() it is not safe to
     * access any of the strings which were contained within it.
     */
    public void free() {
        try {
            DowncallHandles.g_string_chunk_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a copy of {@code string} to the {@link StringChunk}.
     * It returns a pointer to the new copy of the string
     * in the {@link StringChunk}. The characters in the string
     * can be changed, if necessary, though you should not
     * change anything after the end of the string.
     * <p>
     * Unlike g_string_chunk_insert_const(), this function
     * does not check for duplicates. Also strings added
     * with g_string_chunk_insert() will not be searched
     * by g_string_chunk_insert_const() when looking for
     * duplicates.
     * @param string the string to add
     * @return a pointer to the copy of {@code string} within
     *     the {@link StringChunk}
     */
    public java.lang.String insert(java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_chunk_insert.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Adds a copy of {@code string} to the {@link StringChunk}, unless the same
     * string has already been added to the {@link StringChunk} with
     * g_string_chunk_insert_const().
     * <p>
     * This function is useful if you need to copy a large number
     * of strings but do not want to waste space storing duplicates.
     * But you must remember that there may be several pointers to
     * the same string, and so any changes made to the strings
     * should be done very carefully.
     * <p>
     * Note that g_string_chunk_insert_const() will not return a
     * pointer to a string added with g_string_chunk_insert(), even
     * if they do match.
     * @param string the string to add
     * @return a pointer to the new or existing copy of {@code string}
     *     within the {@link StringChunk}
     */
    public java.lang.String insertConst(java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_chunk_insert_const.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Adds a copy of the first {@code len} bytes of {@code string} to the {@link StringChunk}.
     * The copy is nul-terminated.
     * <p>
     * Since this function does not stop at nul bytes, it is the caller's
     * responsibility to ensure that {@code string} has at least {@code len} addressable
     * bytes.
     * <p>
     * The characters in the returned string can be changed, if necessary,
     * though you should not change anything after the end of the string.
     * @param string bytes to insert
     * @param len number of bytes of {@code string} to insert, or -1 to insert a
     *     nul-terminated string
     * @return a pointer to the copy of {@code string} within the {@link StringChunk}
     */
    public java.lang.String insertLen(java.lang.String string, long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_chunk_insert_len.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(string, null),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates a new {@link StringChunk}.
     * @param size the default size of the blocks of memory which are
     *     allocated to store the strings. If a particular string
     *     is larger than this default size, a larger block of
     *     memory will be allocated for it.
     * @return a new {@link StringChunk}
     */
    public static org.gtk.glib.StringChunk new_(long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_chunk_new.invokeExact(
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.StringChunk.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_string_chunk_clear = Interop.downcallHandle(
            "g_string_chunk_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_string_chunk_free = Interop.downcallHandle(
            "g_string_chunk_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_string_chunk_insert = Interop.downcallHandle(
            "g_string_chunk_insert",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_string_chunk_insert_const = Interop.downcallHandle(
            "g_string_chunk_insert_const",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_string_chunk_insert_len = Interop.downcallHandle(
            "g_string_chunk_insert_len",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_string_chunk_new = Interop.downcallHandle(
            "g_string_chunk_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }
}

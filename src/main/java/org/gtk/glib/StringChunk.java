package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque data structure representing String Chunks.
 * It should only be accessed by using the following functions.
 */
public class StringChunk extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public StringChunk(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Frees all strings contained within the {@link StringChunk}.
     * After calling g_string_chunk_clear() it is not safe to
     * access any of the strings which were contained within it.
     */
    public void clear() {
        try {
            DowncallHandles.g_string_chunk_clear.invokeExact(handle());
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
            DowncallHandles.g_string_chunk_free.invokeExact(handle());
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
    public @NotNull java.lang.String insert(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_chunk_insert.invokeExact(handle(), Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
    public @NotNull java.lang.String insertConst(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_chunk_insert_const.invokeExact(handle(), Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
    public @NotNull java.lang.String insertLen(@NotNull java.lang.String string, long len) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_chunk_insert_len.invokeExact(handle(), Interop.allocateNativeString(string), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a new {@link StringChunk}.
     * @param size the default size of the blocks of memory which are
     *     allocated to store the strings. If a particular string
     *     is larger than this default size, a larger block of
     *     memory will be allocated for it.
     * @return a new {@link StringChunk}
     */
    public static @NotNull org.gtk.glib.StringChunk new_(long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_chunk_new.invokeExact(size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.StringChunk(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_string_chunk_clear = Interop.downcallHandle(
            "g_string_chunk_clear",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_string_chunk_free = Interop.downcallHandle(
            "g_string_chunk_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_string_chunk_insert = Interop.downcallHandle(
            "g_string_chunk_insert",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_string_chunk_insert_const = Interop.downcallHandle(
            "g_string_chunk_insert_const",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_string_chunk_insert_len = Interop.downcallHandle(
            "g_string_chunk_insert_len",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_string_chunk_new = Interop.downcallHandle(
            "g_string_chunk_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}

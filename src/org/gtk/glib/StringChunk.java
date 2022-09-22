package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque data structure representing String Chunks.
 * It should only be accessed by using the following functions.
 */
public class StringChunk extends io.github.jwharm.javagi.ResourceBase {

    public StringChunk(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Frees all strings contained within the {@link StringChunk}.
     * After calling g_string_chunk_clear() it is not safe to
     * access any of the strings which were contained within it.
     */
    public void clear() {
        gtk_h.g_string_chunk_clear(handle());
    }
    
    /**
     * Frees all memory allocated by the {@link StringChunk}.
     * After calling g_string_chunk_free() it is not safe to
     * access any of the strings which were contained within it.
     */
    public void free() {
        gtk_h.g_string_chunk_free(handle());
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
     */
    public java.lang.String insert(java.lang.String string) {
        var RESULT = gtk_h.g_string_chunk_insert(handle(), Interop.allocateNativeString(string).handle());
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
     */
    public java.lang.String insertConst(java.lang.String string) {
        var RESULT = gtk_h.g_string_chunk_insert_const(handle(), Interop.allocateNativeString(string).handle());
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
     */
    public java.lang.String insertLen(java.lang.String string, long len) {
        var RESULT = gtk_h.g_string_chunk_insert_len(handle(), Interop.allocateNativeString(string).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a new {@link StringChunk}.
     */
    public static StringChunk new_(long size) {
        var RESULT = gtk_h.g_string_chunk_new(size);
        return new StringChunk(References.get(RESULT, false));
    }
    
}

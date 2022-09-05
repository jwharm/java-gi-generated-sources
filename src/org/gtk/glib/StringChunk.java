package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque data structure representing String Chunks.
 * It should only be accessed by using the following functions.
 */
public class StringChunk extends io.github.jwharm.javagi.interop.ResourceBase {

    public StringChunk(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Frees all strings contained within the #GStringChunk.
     * After calling g_string_chunk_clear() it is not safe to
     * access any of the strings which were contained within it.
     */
    public void clear() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_chunk_clear(HANDLE());
    }
    
    /**
     * Frees all memory allocated by the #GStringChunk.
     * After calling g_string_chunk_free() it is not safe to
     * access any of the strings which were contained within it.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_chunk_free(HANDLE());
    }
    
    /**
     * Adds a copy of @string to the #GStringChunk.
     * It returns a pointer to the new copy of the string
     * in the #GStringChunk. The characters in the string
     * can be changed, if necessary, though you should not
     * change anything after the end of the string.
     * 
     * Unlike g_string_chunk_insert_const(), this function
     * does not check for duplicates. Also strings added
     * with g_string_chunk_insert() will not be searched
     * by g_string_chunk_insert_const() when looking for
     * duplicates.
     */
    public java.lang.String insert(java.lang.String string) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_chunk_insert(HANDLE(), Interop.allocateNativeString(string).HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Adds a copy of @string to the #GStringChunk, unless the same
     * string has already been added to the #GStringChunk with
     * g_string_chunk_insert_const().
     * 
     * This function is useful if you need to copy a large number
     * of strings but do not want to waste space storing duplicates.
     * But you must remember that there may be several pointers to
     * the same string, and so any changes made to the strings
     * should be done very carefully.
     * 
     * Note that g_string_chunk_insert_const() will not return a
     * pointer to a string added with g_string_chunk_insert(), even
     * if they do match.
     */
    public java.lang.String insertConst(java.lang.String string) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_chunk_insert_const(HANDLE(), Interop.allocateNativeString(string).HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Adds a copy of the first @len bytes of @string to the #GStringChunk.
     * The copy is nul-terminated.
     * 
     * Since this function does not stop at nul bytes, it is the caller's
     * responsibility to ensure that @string has at least @len addressable
     * bytes.
     * 
     * The characters in the returned string can be changed, if necessary,
     * though you should not change anything after the end of the string.
     */
    public java.lang.String insertLen(java.lang.String string, long len) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_chunk_insert_len(HANDLE(), Interop.allocateNativeString(string).HANDLE(), len);
        return RESULT.getUtf8String(0);
    }
    
}

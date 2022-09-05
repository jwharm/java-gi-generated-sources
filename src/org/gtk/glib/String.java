package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GString struct contains the public fields of a GString.
 */
public class String extends io.github.jwharm.javagi.interop.ResourceBase {

    public String(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new #GString, initialized with the given string.
     */
    public String(java.lang.String init) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_new(Interop.getAllocator().allocateUtf8String(init)), true));
    }
    
    /**
     * Creates a new #GString with @len bytes of the @init buffer.
     * Because a length is provided, @init need not be nul-terminated,
     * and can contain embedded nul bytes.
     * 
     * Since this function does not stop at nul bytes, it is the caller's
     * responsibility to ensure that @init has at least @len addressable
     * bytes.
     */
    public String(java.lang.String init, long len) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_new_len(Interop.getAllocator().allocateUtf8String(init), len), true));
    }
    
    /**
     * Creates a new #GString, with enough space for @dfl_size
     * bytes. This is useful if you are going to add a lot of
     * text to the string and don't want it to be reallocated
     * too often.
     */
    public String(long dflSize) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_sized_new(dflSize), true));
    }
    
    /**
     * Adds a string onto the end of a #GString, expanding
     * it if necessary.
     */
    public String append(java.lang.String val) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_append(HANDLE(), Interop.getAllocator().allocateUtf8String(val));
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Adds a byte onto the end of a #GString, expanding
     * it if necessary.
     */
    public String appendC(byte c) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_append_c(HANDLE(), c);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Appends @len bytes of @val to @string.
     * 
     * If @len is positive, @val may contain embedded nuls and need
     * not be nul-terminated. It is the caller's responsibility to
     * ensure that @val has at least @len addressable bytes.
     * 
     * If @len is negative, @val must be nul-terminated and @len
     * is considered to request the entire string length. This
     * makes g_string_append_len() equivalent to g_string_append().
     */
    public String appendLen(java.lang.String val, long len) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_append_len(HANDLE(), Interop.getAllocator().allocateUtf8String(val), len);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Converts a Unicode character into UTF-8, and appends it
     * to the string.
     */
    public String appendUnichar(int wc) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_append_unichar(HANDLE(), wc);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Appends @unescaped to @string, escaping any characters that
     * are reserved in URIs using URI-style escape sequences.
     */
    public String appendUriEscaped(java.lang.String unescaped, java.lang.String reservedCharsAllowed, boolean allowUtf8) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_append_uri_escaped(HANDLE(), Interop.getAllocator().allocateUtf8String(unescaped), Interop.getAllocator().allocateUtf8String(reservedCharsAllowed), allowUtf8 ? 1 : 0);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Appends a formatted string onto the end of a #GString.
     * This function is similar to g_string_append_printf()
     * except that the arguments to the format string are passed
     * as a va_list.
     */
    public void appendVprintf(java.lang.String format, VaList args) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_append_vprintf(HANDLE(), Interop.getAllocator().allocateUtf8String(format), args);
    }
    
    /**
     * Converts all uppercase ASCII letters to lowercase ASCII letters.
     */
    public String asciiDown() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_ascii_down(HANDLE());
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Converts all lowercase ASCII letters to uppercase ASCII letters.
     */
    public String asciiUp() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_ascii_up(HANDLE());
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Copies the bytes from a string into a #GString,
     * destroying any previous contents. It is rather like
     * the standard strcpy() function, except that you do not
     * have to worry about having enough space to copy the string.
     */
    public String assign(java.lang.String rval) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_assign(HANDLE(), Interop.getAllocator().allocateUtf8String(rval));
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Compares two strings for equality, returning %TRUE if they are equal.
     * For use with #GHashTable.
     */
    public boolean equal(String v2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_equal(HANDLE(), v2.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Removes @len bytes from a #GString, starting at position @pos.
     * The rest of the #GString is shifted down to fill the gap.
     */
    public String erase(long pos, long len) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_erase(HANDLE(), pos, len);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Frees the memory allocated for the #GString.
     * If @free_segment is %TRUE it also frees the character data.  If
     * it's %FALSE, the caller gains ownership of the buffer and must
     * free it after use with g_free().
     */
    public java.lang.String free(boolean freeSegment) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_free(HANDLE(), freeSegment ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Transfers ownership of the contents of @string to a newly allocated
     * #GBytes.  The #GString structure itself is deallocated, and it is
     * therefore invalid to use @string after invoking this function.
     * 
     * Note that while #GString ensures that its buffer always has a
     * trailing nul character (not reflected in its "len"), the returned
     * #GBytes does not include this extra nul; i.e. it has length exactly
     * equal to the "len" member.
     */
    public Bytes freeToBytes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_free_to_bytes(HANDLE());
        return new Bytes(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Creates a hash code for @str; for use with #GHashTable.
     */
    public int hash() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_hash(HANDLE());
        return RESULT;
    }
    
    /**
     * Inserts a copy of a string into a #GString,
     * expanding it if necessary.
     */
    public String insert(long pos, java.lang.String val) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_insert(HANDLE(), pos, Interop.getAllocator().allocateUtf8String(val));
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Inserts a byte into a #GString, expanding it if necessary.
     */
    public String insertC(long pos, byte c) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_insert_c(HANDLE(), pos, c);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Inserts @len bytes of @val into @string at @pos.
     * 
     * If @len is positive, @val may contain embedded nuls and need
     * not be nul-terminated. It is the caller's responsibility to
     * ensure that @val has at least @len addressable bytes.
     * 
     * If @len is negative, @val must be nul-terminated and @len
     * is considered to request the entire string length.
     * 
     * If @pos is -1, bytes are inserted at the end of the string.
     */
    public String insertLen(long pos, java.lang.String val, long len) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_insert_len(HANDLE(), pos, Interop.getAllocator().allocateUtf8String(val), len);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Converts a Unicode character into UTF-8, and insert it
     * into the string at the given position.
     */
    public String insertUnichar(long pos, int wc) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_insert_unichar(HANDLE(), pos, wc);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Overwrites part of a string, lengthening it if necessary.
     */
    public String overwrite(long pos, java.lang.String val) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_overwrite(HANDLE(), pos, Interop.getAllocator().allocateUtf8String(val));
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Overwrites part of a string, lengthening it if necessary.
     * This function will work with embedded nuls.
     */
    public String overwriteLen(long pos, java.lang.String val, long len) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_overwrite_len(HANDLE(), pos, Interop.getAllocator().allocateUtf8String(val), len);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Adds a string on to the start of a #GString,
     * expanding it if necessary.
     */
    public String prepend(java.lang.String val) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_prepend(HANDLE(), Interop.getAllocator().allocateUtf8String(val));
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Adds a byte onto the start of a #GString,
     * expanding it if necessary.
     */
    public String prependC(byte c) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_prepend_c(HANDLE(), c);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Prepends @len bytes of @val to @string.
     * 
     * If @len is positive, @val may contain embedded nuls and need
     * not be nul-terminated. It is the caller's responsibility to
     * ensure that @val has at least @len addressable bytes.
     * 
     * If @len is negative, @val must be nul-terminated and @len
     * is considered to request the entire string length. This
     * makes g_string_prepend_len() equivalent to g_string_prepend().
     */
    public String prependLen(java.lang.String val, long len) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_prepend_len(HANDLE(), Interop.getAllocator().allocateUtf8String(val), len);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Converts a Unicode character into UTF-8, and prepends it
     * to the string.
     */
    public String prependUnichar(int wc) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_prepend_unichar(HANDLE(), wc);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Replaces the string @find with the string @replace in a #GString up to
     * @limit times. If the number of instances of @find in the #GString is
     * less than @limit, all instances are replaced. If @limit is `0`,
     * all instances of @find are replaced.
     * 
     * If @find is the empty string, since versions 2.69.1 and 2.68.4 the
     * replacement will be inserted no more than once per possible position
     * (beginning of string, end of string and between characters). This did
     * not work correctly in earlier versions.
     */
    public int replace(java.lang.String find, java.lang.String replace, int limit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_replace(HANDLE(), Interop.getAllocator().allocateUtf8String(find), Interop.getAllocator().allocateUtf8String(replace), limit);
        return RESULT;
    }
    
    /**
     * Sets the length of a #GString. If the length is less than
     * the current length, the string will be truncated. If the
     * length is greater than the current length, the contents
     * of the newly added area are undefined. (However, as
     * always, string->str[string->len] will be a nul byte.)
     */
    public String setSize(long len) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_set_size(HANDLE(), len);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Cuts off the end of the GString, leaving the first @len bytes.
     */
    public String truncate(long len) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_truncate(HANDLE(), len);
        return new String(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Writes a formatted string into a #GString.
     * This function is similar to g_string_printf() except that
     * the arguments to the format string are passed as a va_list.
     */
    public void vprintf(java.lang.String format, VaList args) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_string_vprintf(HANDLE(), Interop.getAllocator().allocateUtf8String(format), args);
    }
    
}

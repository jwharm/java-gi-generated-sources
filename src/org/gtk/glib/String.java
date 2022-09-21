package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GString struct contains the public fields of a GString.
 */
public class String extends io.github.jwharm.javagi.ResourceBase {

    public String(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String init) {
        Reference RESULT = References.get(gtk_h.g_string_new(Interop.allocateNativeString(init).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link String}, initialized with the given string.
     */
    public String(java.lang.String init) {
        super(constructNew(init));
    }
    
    private static Reference constructNewLen(java.lang.String init, long len) {
        Reference RESULT = References.get(gtk_h.g_string_new_len(Interop.allocateNativeString(init).handle(), len), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link String} with {@code len} bytes of the {@code init} buffer.
     * Because a length is provided, {@code init} need not be nul-terminated,
     * and can contain embedded nul bytes.
     * <p>
     * Since this function does not stop at nul bytes, it is the caller's
     * responsibility to ensure that {@code init} has at least {@code len} addressable
     * bytes.
     */
    public static String newLen(java.lang.String init, long len) {
        return new String(constructNewLen(init, len));
    }
    
    private static Reference constructSizedNew(long dflSize) {
        Reference RESULT = References.get(gtk_h.g_string_sized_new(dflSize), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link String}, with enough space for {@code dfl_size}
     * bytes. This is useful if you are going to add a lot of
     * text to the string and don't want it to be reallocated
     * too often.
     */
    public static String sizedNew(long dflSize) {
        return new String(constructSizedNew(dflSize));
    }
    
    /**
     * Adds a string onto the end of a {@link String}, expanding
     * it if necessary.
     */
    public String append(java.lang.String val) {
        var RESULT = gtk_h.g_string_append(handle(), Interop.allocateNativeString(val).handle());
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Adds a byte onto the end of a {@link String}, expanding
     * it if necessary.
     */
    public String appendC(byte c) {
        var RESULT = gtk_h.g_string_append_c(handle(), c);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Appends {@code len} bytes of {@code val} to {@code string}.
     * <p>
     * If {@code len} is positive, {@code val} may contain embedded nuls and need
     * not be nul-terminated. It is the caller's responsibility to
     * ensure that {@code val} has at least {@code len} addressable bytes.
     * <p>
     * If {@code len} is negative, {@code val} must be nul-terminated and {@code len}
     * is considered to request the entire string length. This
     * makes g_string_append_len() equivalent to g_string_append().
     */
    public String appendLen(java.lang.String val, long len) {
        var RESULT = gtk_h.g_string_append_len(handle(), Interop.allocateNativeString(val).handle(), len);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Converts a Unicode character into UTF-8, and appends it
     * to the string.
     */
    public String appendUnichar(int wc) {
        var RESULT = gtk_h.g_string_append_unichar(handle(), wc);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Appends {@code unescaped} to {@code string}, escaping any characters that
     * are reserved in URIs using URI-style escape sequences.
     */
    public String appendUriEscaped(java.lang.String unescaped, java.lang.String reservedCharsAllowed, boolean allowUtf8) {
        var RESULT = gtk_h.g_string_append_uri_escaped(handle(), Interop.allocateNativeString(unescaped).handle(), Interop.allocateNativeString(reservedCharsAllowed).handle(), allowUtf8 ? 1 : 0);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Appends a formatted string onto the end of a {@link String}.
     * This function is similar to g_string_append_printf()
     * except that the arguments to the format string are passed
     * as a va_list.
     */
    public void appendVprintf(java.lang.String format, VaList args) {
        gtk_h.g_string_append_vprintf(handle(), Interop.allocateNativeString(format).handle(), args);
    }
    
    /**
     * Converts all uppercase ASCII letters to lowercase ASCII letters.
     */
    public String asciiDown() {
        var RESULT = gtk_h.g_string_ascii_down(handle());
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Converts all lowercase ASCII letters to uppercase ASCII letters.
     */
    public String asciiUp() {
        var RESULT = gtk_h.g_string_ascii_up(handle());
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Copies the bytes from a string into a {@link String},
     * destroying any previous contents. It is rather like
     * the standard strcpy() function, except that you do not
     * have to worry about having enough space to copy the string.
     */
    public String assign(java.lang.String rval) {
        var RESULT = gtk_h.g_string_assign(handle(), Interop.allocateNativeString(rval).handle());
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Compares two strings for equality, returning <code>true</code> if they are equal.
     * For use with {@link HashTable}.
     */
    public boolean equal(String v2) {
        var RESULT = gtk_h.g_string_equal(handle(), v2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Removes {@code len} bytes from a {@link String}, starting at position {@code pos}.
     * The rest of the {@link String} is shifted down to fill the gap.
     */
    public String erase(long pos, long len) {
        var RESULT = gtk_h.g_string_erase(handle(), pos, len);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Frees the memory allocated for the {@link String}.
     * If {@code free_segment} is <code>true</code> it also frees the character data.  If
     * it's <code>false</code>, the caller gains ownership of the buffer and must
     * free it after use with g_free().
     */
    public java.lang.String free(boolean freeSegment) {
        var RESULT = gtk_h.g_string_free(handle(), freeSegment ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Transfers ownership of the contents of {@code string} to a newly allocated
     * {@link Bytes}.  The {@link String} structure itself is deallocated, and it is
     * therefore invalid to use {@code string} after invoking this function.
     * <p>
     * Note that while {@link String} ensures that its buffer always has a
     * trailing nul character (not reflected in its "len"), the returned
     * {@link Bytes} does not include this extra nul; i.e. it has length exactly
     * equal to the "len" member.
     */
    public Bytes freeToBytes() {
        var RESULT = gtk_h.g_string_free_to_bytes(handle());
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Creates a hash code for {@code str}; for use with {@link HashTable}.
     */
    public int hash() {
        var RESULT = gtk_h.g_string_hash(handle());
        return RESULT;
    }
    
    /**
     * Inserts a copy of a string into a {@link String},
     * expanding it if necessary.
     */
    public String insert(long pos, java.lang.String val) {
        var RESULT = gtk_h.g_string_insert(handle(), pos, Interop.allocateNativeString(val).handle());
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Inserts a byte into a {@link String}, expanding it if necessary.
     */
    public String insertC(long pos, byte c) {
        var RESULT = gtk_h.g_string_insert_c(handle(), pos, c);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Inserts {@code len} bytes of {@code val} into {@code string} at {@code pos}.
     * <p>
     * If {@code len} is positive, {@code val} may contain embedded nuls and need
     * not be nul-terminated. It is the caller's responsibility to
     * ensure that {@code val} has at least {@code len} addressable bytes.
     * <p>
     * If {@code len} is negative, {@code val} must be nul-terminated and {@code len}
     * is considered to request the entire string length.
     * <p>
     * If {@code pos} is -1, bytes are inserted at the end of the string.
     */
    public String insertLen(long pos, java.lang.String val, long len) {
        var RESULT = gtk_h.g_string_insert_len(handle(), pos, Interop.allocateNativeString(val).handle(), len);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Converts a Unicode character into UTF-8, and insert it
     * into the string at the given position.
     */
    public String insertUnichar(long pos, int wc) {
        var RESULT = gtk_h.g_string_insert_unichar(handle(), pos, wc);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Overwrites part of a string, lengthening it if necessary.
     */
    public String overwrite(long pos, java.lang.String val) {
        var RESULT = gtk_h.g_string_overwrite(handle(), pos, Interop.allocateNativeString(val).handle());
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Overwrites part of a string, lengthening it if necessary.
     * This function will work with embedded nuls.
     */
    public String overwriteLen(long pos, java.lang.String val, long len) {
        var RESULT = gtk_h.g_string_overwrite_len(handle(), pos, Interop.allocateNativeString(val).handle(), len);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Adds a string on to the start of a {@link String},
     * expanding it if necessary.
     */
    public String prepend(java.lang.String val) {
        var RESULT = gtk_h.g_string_prepend(handle(), Interop.allocateNativeString(val).handle());
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Adds a byte onto the start of a {@link String},
     * expanding it if necessary.
     */
    public String prependC(byte c) {
        var RESULT = gtk_h.g_string_prepend_c(handle(), c);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Prepends {@code len} bytes of {@code val} to {@code string}.
     * <p>
     * If {@code len} is positive, {@code val} may contain embedded nuls and need
     * not be nul-terminated. It is the caller's responsibility to
     * ensure that {@code val} has at least {@code len} addressable bytes.
     * <p>
     * If {@code len} is negative, {@code val} must be nul-terminated and {@code len}
     * is considered to request the entire string length. This
     * makes g_string_prepend_len() equivalent to g_string_prepend().
     */
    public String prependLen(java.lang.String val, long len) {
        var RESULT = gtk_h.g_string_prepend_len(handle(), Interop.allocateNativeString(val).handle(), len);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Converts a Unicode character into UTF-8, and prepends it
     * to the string.
     */
    public String prependUnichar(int wc) {
        var RESULT = gtk_h.g_string_prepend_unichar(handle(), wc);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Replaces the string {@code find} with the string {@code replace} in a {@link String} up to
     * {@code limit} times. If the number of instances of {@code find} in the {@link String} is
     * less than {@code limit}, all instances are replaced. If {@code limit} is {@code 0},
     * all instances of {@code find} are replaced.
     * <p>
     * If {@code find} is the empty string, since versions 2.69.1 and 2.68.4 the
     * replacement will be inserted no more than once per possible position
     * (beginning of string, end of string and between characters). This did
     * not work correctly in earlier versions.
     */
    public int replace(java.lang.String find, java.lang.String replace, int limit) {
        var RESULT = gtk_h.g_string_replace(handle(), Interop.allocateNativeString(find).handle(), Interop.allocateNativeString(replace).handle(), limit);
        return RESULT;
    }
    
    /**
     * Sets the length of a {@link String}. If the length is less than
     * the current length, the string will be truncated. If the
     * length is greater than the current length, the contents
     * of the newly added area are undefined. (However, as
     * always, string->str[string->len] will be a nul byte.)
     */
    public String setSize(long len) {
        var RESULT = gtk_h.g_string_set_size(handle(), len);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Cuts off the end of the GString, leaving the first {@code len} bytes.
     */
    public String truncate(long len) {
        var RESULT = gtk_h.g_string_truncate(handle(), len);
        return new String(References.get(RESULT, false));
    }
    
    /**
     * Writes a formatted string into a {@link String}.
     * This function is similar to g_string_printf() except that
     * the arguments to the format string are passed as a va_list.
     */
    public void vprintf(java.lang.String format, VaList args) {
        gtk_h.g_string_vprintf(handle(), Interop.allocateNativeString(format).handle(), args);
    }
    
}

package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GString struct contains the public fields of a GString.
 */
public class GString extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GString";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("str"),
            Interop.valueLayout.C_LONG.withName("len"),
            Interop.valueLayout.C_LONG.withName("allocated_len")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GString}
     * @return A new, uninitialized @{link GString}
     */
    public static GString allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GString newInstance = new GString(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code str}
     * @return The value of the field {@code str}
     */
    public java.lang.String getStr() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("str"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code str}
     * @param str The new value of the field {@code str}
     */
    public void setStr(java.lang.String str) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("str"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (str == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(str, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code len}
     * @return The value of the field {@code len}
     */
    public long getLen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("len"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code len}
     * @param len The new value of the field {@code len}
     */
    public void setLen(long len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("len"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), len);
        }
    }
    
    /**
     * Get the value of the field {@code allocated_len}
     * @return The value of the field {@code allocated_len}
     */
    public long getAllocatedLen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("allocated_len"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code allocated_len}
     * @param allocatedLen The new value of the field {@code allocated_len}
     */
    public void setAllocatedLen(long allocatedLen) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("allocated_len"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), allocatedLen);
        }
    }
    
    /**
     * Create a GString proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GString(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GString> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GString(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String init) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_new.invokeExact((Addressable) (init == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(init, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link GString}, initialized with the given string.
     * @param init the initial text to copy into the string, or {@code null} to
     *   start with an empty string
     */
    public GString(@Nullable java.lang.String init) {
        super(constructNew(init));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewLen(java.lang.String init, long len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_new_len.invokeExact(
                        Marshal.stringToAddress.marshal(init, SCOPE),
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@link GString} with {@code len} bytes of the {@code init} buffer.
     * Because a length is provided, {@code init} need not be nul-terminated,
     * and can contain embedded nul bytes.
     * <p>
     * Since this function does not stop at nul bytes, it is the caller's
     * responsibility to ensure that {@code init} has at least {@code len} addressable
     * bytes.
     * @param init initial contents of the string
     * @param len length of {@code init} to use
     * @return a new {@link GString}
     */
    public static GString newLen(java.lang.String init, long len) {
        var RESULT = constructNewLen(init, len);
        var OBJECT = org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructSizedNew(long dflSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_sized_new.invokeExact(dflSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link GString}, with enough space for {@code dfl_size}
     * bytes. This is useful if you are going to add a lot of
     * text to the string and don't want it to be reallocated
     * too often.
     * @param dflSize the default size of the space allocated to hold the string
     * @return the new {@link GString}
     */
    public static GString sizedNew(long dflSize) {
        var RESULT = constructSizedNew(dflSize);
        var OBJECT = org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Adds a string onto the end of a {@link GString}, expanding
     * it if necessary.
     * @param val the string to append onto the end of {@code string}
     * @return {@code string}
     */
    public org.gtk.glib.GString append(java.lang.String val) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_append.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(val, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Adds a byte onto the end of a {@link GString}, expanding
     * it if necessary.
     * @param c the byte to append onto the end of {@code string}
     * @return {@code string}
     */
    public org.gtk.glib.GString appendC(byte c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_append_c.invokeExact(
                    handle(),
                    c);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
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
     * @param val bytes to append
     * @param len number of bytes of {@code val} to use, or -1 for all of {@code val}
     * @return {@code string}
     */
    public org.gtk.glib.GString appendLen(java.lang.String val, long len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_append_len.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(val, SCOPE),
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Appends a formatted string onto the end of a {@link GString}.
     * This function is similar to g_string_printf() except
     * that the text is appended to the {@link GString}.
     * @param format the string format. See the printf() documentation
     * @param varargs the parameters to insert into the format string
     */
    public void appendPrintf(java.lang.String format, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_string_append_printf.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Converts a Unicode character into UTF-8, and appends it
     * to the string.
     * @param wc a Unicode character
     * @return {@code string}
     */
    public org.gtk.glib.GString appendUnichar(int wc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_append_unichar.invokeExact(
                    handle(),
                    wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Appends {@code unescaped} to {@code string}, escaping any characters that
     * are reserved in URIs using URI-style escape sequences.
     * @param unescaped a string
     * @param reservedCharsAllowed a string of reserved characters allowed
     *     to be used, or {@code null}
     * @param allowUtf8 set {@code true} if the escaped string may include UTF8 characters
     * @return {@code string}
     */
    public org.gtk.glib.GString appendUriEscaped(java.lang.String unescaped, java.lang.String reservedCharsAllowed, boolean allowUtf8) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_append_uri_escaped.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(unescaped, SCOPE),
                        Marshal.stringToAddress.marshal(reservedCharsAllowed, SCOPE),
                        Marshal.booleanToInteger.marshal(allowUtf8, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Appends a formatted string onto the end of a {@link GString}.
     * This function is similar to g_string_append_printf()
     * except that the arguments to the format string are passed
     * as a va_list.
     * @param format the string format. See the printf() documentation
     * @param args the list of arguments to insert in the output
     */
    public void appendVprintf(java.lang.String format, VaList args) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_string_append_vprintf.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        args);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Converts all uppercase ASCII letters to lowercase ASCII letters.
     * @return passed-in {@code string} pointer, with all the
     *     uppercase characters converted to lowercase in place,
     *     with semantics that exactly match g_ascii_tolower().
     */
    public org.gtk.glib.GString asciiDown() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_ascii_down.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Converts all lowercase ASCII letters to uppercase ASCII letters.
     * @return passed-in {@code string} pointer, with all the
     *     lowercase characters converted to uppercase in place,
     *     with semantics that exactly match g_ascii_toupper().
     */
    public org.gtk.glib.GString asciiUp() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_ascii_up.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Copies the bytes from a string into a {@link GString},
     * destroying any previous contents. It is rather like
     * the standard strcpy() function, except that you do not
     * have to worry about having enough space to copy the string.
     * @param rval the string to copy into {@code string}
     * @return {@code string}
     */
    public org.gtk.glib.GString assign(java.lang.String rval) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_assign.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(rval, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Converts a {@link GString} to lowercase.
     * @return the {@link GString}
     * @deprecated This function uses the locale-specific
     *     tolower() function, which is almost never the right thing.
     *     Use g_string_ascii_down() or g_utf8_strdown() instead.
     */
    @Deprecated
    public org.gtk.glib.GString down() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_down.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Compares two strings for equality, returning {@code true} if they are equal.
     * For use with {@link HashTable}.
     * @param v2 another {@link GString}
     * @return {@code true} if the strings are the same length and contain the
     *     same bytes
     */
    public boolean equal(org.gtk.glib.GString v2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_string_equal.invokeExact(
                    handle(),
                    v2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes {@code len} bytes from a {@link GString}, starting at position {@code pos}.
     * The rest of the {@link GString} is shifted down to fill the gap.
     * @param pos the position of the content to remove
     * @param len the number of bytes to remove, or -1 to remove all
     *       following bytes
     * @return {@code string}
     */
    public org.gtk.glib.GString erase(long pos, long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_erase.invokeExact(
                    handle(),
                    pos,
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Frees the memory allocated for the {@link GString}.
     * If {@code free_segment} is {@code true} it also frees the character data.  If
     * it's {@code false}, the caller gains ownership of the buffer and must
     * free it after use with g_free().
     * @param freeSegment if {@code true}, the actual character data is freed as well
     * @return the character data of {@code string}
     *          (i.e. {@code null} if {@code free_segment} is {@code true})
     */
    public @Nullable java.lang.String free(boolean freeSegment) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_free.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(freeSegment, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Transfers ownership of the contents of {@code string} to a newly allocated
     * {@link Bytes}.  The {@link GString} structure itself is deallocated, and it is
     * therefore invalid to use {@code string} after invoking this function.
     * <p>
     * Note that while {@link GString} ensures that its buffer always has a
     * trailing nul character (not reflected in its "len"), the returned
     * {@link Bytes} does not include this extra nul; i.e. it has length exactly
     * equal to the "len" member.
     * @return A newly allocated {@link Bytes} containing contents of {@code string}; {@code string} itself is freed
     */
    public org.gtk.glib.Bytes freeToBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_free_to_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a hash code for {@code str}; for use with {@link HashTable}.
     * @return hash code for {@code str}
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_string_hash.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts a copy of a string into a {@link GString},
     * expanding it if necessary.
     * @param pos the position to insert the copy of the string
     * @param val the string to insert
     * @return {@code string}
     */
    public org.gtk.glib.GString insert(long pos, java.lang.String val) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_insert.invokeExact(
                        handle(),
                        pos,
                        Marshal.stringToAddress.marshal(val, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Inserts a byte into a {@link GString}, expanding it if necessary.
     * @param pos the position to insert the byte
     * @param c the byte to insert
     * @return {@code string}
     */
    public org.gtk.glib.GString insertC(long pos, byte c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_insert_c.invokeExact(
                    handle(),
                    pos,
                    c);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
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
     * @param pos position in {@code string} where insertion should
     *       happen, or -1 for at the end
     * @param val bytes to insert
     * @param len number of bytes of {@code val} to insert, or -1 for all of {@code val}
     * @return {@code string}
     */
    public org.gtk.glib.GString insertLen(long pos, java.lang.String val, long len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_insert_len.invokeExact(
                        handle(),
                        pos,
                        Marshal.stringToAddress.marshal(val, SCOPE),
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Converts a Unicode character into UTF-8, and insert it
     * into the string at the given position.
     * @param pos the position at which to insert character, or -1
     *     to append at the end of the string
     * @param wc a Unicode character
     * @return {@code string}
     */
    public org.gtk.glib.GString insertUnichar(long pos, int wc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_insert_unichar.invokeExact(
                    handle(),
                    pos,
                    wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Overwrites part of a string, lengthening it if necessary.
     * @param pos the position at which to start overwriting
     * @param val the string that will overwrite the {@code string} starting at {@code pos}
     * @return {@code string}
     */
    public org.gtk.glib.GString overwrite(long pos, java.lang.String val) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_overwrite.invokeExact(
                        handle(),
                        pos,
                        Marshal.stringToAddress.marshal(val, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Overwrites part of a string, lengthening it if necessary.
     * This function will work with embedded nuls.
     * @param pos the position at which to start overwriting
     * @param val the string that will overwrite the {@code string} starting at {@code pos}
     * @param len the number of bytes to write from {@code val}
     * @return {@code string}
     */
    public org.gtk.glib.GString overwriteLen(long pos, java.lang.String val, long len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_overwrite_len.invokeExact(
                        handle(),
                        pos,
                        Marshal.stringToAddress.marshal(val, SCOPE),
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Adds a string on to the start of a {@link GString},
     * expanding it if necessary.
     * @param val the string to prepend on the start of {@code string}
     * @return {@code string}
     */
    public org.gtk.glib.GString prepend(java.lang.String val) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_prepend.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(val, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Adds a byte onto the start of a {@link GString},
     * expanding it if necessary.
     * @param c the byte to prepend on the start of the {@link GString}
     * @return {@code string}
     */
    public org.gtk.glib.GString prependC(byte c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_prepend_c.invokeExact(
                    handle(),
                    c);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
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
     * @param val bytes to prepend
     * @param len number of bytes in {@code val} to prepend, or -1 for all of {@code val}
     * @return {@code string}
     */
    public org.gtk.glib.GString prependLen(java.lang.String val, long len) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_string_prepend_len.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(val, SCOPE),
                        len);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Converts a Unicode character into UTF-8, and prepends it
     * to the string.
     * @param wc a Unicode character
     * @return {@code string}
     */
    public org.gtk.glib.GString prependUnichar(int wc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_prepend_unichar.invokeExact(
                    handle(),
                    wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Writes a formatted string into a {@link GString}.
     * This is similar to the standard sprintf() function,
     * except that the {@link GString} buffer automatically expands
     * to contain the results. The previous contents of the
     * {@link GString} are destroyed.
     * @param format the string format. See the printf() documentation
     * @param varargs the parameters to insert into the format string
     */
    public void printf(java.lang.String format, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_string_printf.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Replaces the string {@code find} with the string {@code replace} in a {@link GString} up to
     * {@code limit} times. If the number of instances of {@code find} in the {@link GString} is
     * less than {@code limit}, all instances are replaced. If {@code limit} is {@code 0},
     * all instances of {@code find} are replaced.
     * <p>
     * If {@code find} is the empty string, since versions 2.69.1 and 2.68.4 the
     * replacement will be inserted no more than once per possible position
     * (beginning of string, end of string and between characters). This did
     * not work correctly in earlier versions.
     * @param find the string to find in {@code string}
     * @param replace the string to insert in place of {@code find}
     * @param limit the maximum instances of {@code find} to replace with {@code replace}, or {@code 0} for
     * no limit
     * @return the number of find and replace operations performed.
     */
    public int replace(java.lang.String find, java.lang.String replace, int limit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_string_replace.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(find, SCOPE),
                        Marshal.stringToAddress.marshal(replace, SCOPE),
                        limit);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Sets the length of a {@link GString}. If the length is less than
     * the current length, the string will be truncated. If the
     * length is greater than the current length, the contents
     * of the newly added area are undefined. (However, as
     * always, string-&gt;str[string-&gt;len] will be a nul byte.)
     * @param len the new length
     * @return {@code string}
     */
    public org.gtk.glib.GString setSize(long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_set_size.invokeExact(
                    handle(),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Cuts off the end of the GString, leaving the first {@code len} bytes.
     * @param len the new size of {@code string}
     * @return {@code string}
     */
    public org.gtk.glib.GString truncate(long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_truncate.invokeExact(
                    handle(),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Converts a {@link GString} to uppercase.
     * @return {@code string}
     * @deprecated This function uses the locale-specific
     *     toupper() function, which is almost never the right thing.
     *     Use g_string_ascii_up() or g_utf8_strup() instead.
     */
    @Deprecated
    public org.gtk.glib.GString up() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_string_up.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.GString.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Writes a formatted string into a {@link GString}.
     * This function is similar to g_string_printf() except that
     * the arguments to the format string are passed as a va_list.
     * @param format the string format. See the printf() documentation
     * @param args the parameters to insert into the format string
     */
    public void vprintf(java.lang.String format, VaList args) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_string_vprintf.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(format, SCOPE),
                        args);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_string_new = Interop.downcallHandle(
                "g_string_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_new_len = Interop.downcallHandle(
                "g_string_new_len",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_string_sized_new = Interop.downcallHandle(
                "g_string_sized_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_string_append = Interop.downcallHandle(
                "g_string_append",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_append_c = Interop.downcallHandle(
                "g_string_append_c",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
                false
        );
        
        private static final MethodHandle g_string_append_len = Interop.downcallHandle(
                "g_string_append_len",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_string_append_printf = Interop.downcallHandle(
                "g_string_append_printf",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_string_append_unichar = Interop.downcallHandle(
                "g_string_append_unichar",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_string_append_uri_escaped = Interop.downcallHandle(
                "g_string_append_uri_escaped",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_string_append_vprintf = Interop.downcallHandle(
                "g_string_append_vprintf",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_ascii_down = Interop.downcallHandle(
                "g_string_ascii_down",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_ascii_up = Interop.downcallHandle(
                "g_string_ascii_up",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_assign = Interop.downcallHandle(
                "g_string_assign",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_down = Interop.downcallHandle(
                "g_string_down",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_equal = Interop.downcallHandle(
                "g_string_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_erase = Interop.downcallHandle(
                "g_string_erase",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_string_free = Interop.downcallHandle(
                "g_string_free",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_string_free_to_bytes = Interop.downcallHandle(
                "g_string_free_to_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_hash = Interop.downcallHandle(
                "g_string_hash",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_insert = Interop.downcallHandle(
                "g_string_insert",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_insert_c = Interop.downcallHandle(
                "g_string_insert_c",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_BYTE),
                false
        );
        
        private static final MethodHandle g_string_insert_len = Interop.downcallHandle(
                "g_string_insert_len",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_string_insert_unichar = Interop.downcallHandle(
                "g_string_insert_unichar",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_string_overwrite = Interop.downcallHandle(
                "g_string_overwrite",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_overwrite_len = Interop.downcallHandle(
                "g_string_overwrite_len",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_string_prepend = Interop.downcallHandle(
                "g_string_prepend",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_prepend_c = Interop.downcallHandle(
                "g_string_prepend_c",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
                false
        );
        
        private static final MethodHandle g_string_prepend_len = Interop.downcallHandle(
                "g_string_prepend_len",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_string_prepend_unichar = Interop.downcallHandle(
                "g_string_prepend_unichar",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_string_printf = Interop.downcallHandle(
                "g_string_printf",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_string_replace = Interop.downcallHandle(
                "g_string_replace",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_string_set_size = Interop.downcallHandle(
                "g_string_set_size",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_string_truncate = Interop.downcallHandle(
                "g_string_truncate",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_string_up = Interop.downcallHandle(
                "g_string_up",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_string_vprintf = Interop.downcallHandle(
                "g_string_vprintf",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link GString.Builder} object constructs a {@link GString} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GString.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GString struct;
        
        private Builder() {
            struct = GString.allocate();
        }
        
        /**
         * Finish building the {@link GString} struct.
         * @return A new instance of {@code GString} with the fields 
         *         that were set in the Builder object.
         */
        public GString build() {
            return struct;
        }
        
        /**
         * points to the character data. It may move as text is added.
         *   The {@code str} field is null-terminated and so
         *   can be used as an ordinary C string.
         * @param str The value for the {@code str} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStr(java.lang.String str) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("str"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (str == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(str, SCOPE)));
                return this;
            }
        }
        
        /**
         * contains the length of the string, not including the
         *   terminating nul byte.
         * @param len The value for the {@code len} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLen(long len) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("len"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), len);
                return this;
            }
        }
        
        /**
         * the number of bytes that can be stored in the
         *   string before it needs to be reallocated. May be larger than {@code len}.
         * @param allocatedLen The value for the {@code allocatedLen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllocatedLen(long allocatedLen) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("allocated_len"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), allocatedLen);
                return this;
            }
        }
    }
}

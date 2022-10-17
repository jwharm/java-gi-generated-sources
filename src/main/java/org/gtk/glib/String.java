package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GString struct contains the public fields of a GString.
 */
public class String extends io.github.jwharm.javagi.ResourceBase {

    public String(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_string_new = Interop.downcallHandle(
        "g_string_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.String init) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_string_new.invokeExact(Interop.allocateNativeString(init)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link String}, initialized with the given string.
     */
    public String(@Nullable java.lang.String init) {
        super(constructNew(init));
    }
    
    private static final MethodHandle g_string_new_len = Interop.downcallHandle(
        "g_string_new_len",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewLen(@NotNull java.lang.String init, @NotNull long len) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_string_new_len.invokeExact(Interop.allocateNativeString(init), len), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public static String newLen(@NotNull java.lang.String init, @NotNull long len) {
        return new String(constructNewLen(init, len));
    }
    
    private static final MethodHandle g_string_sized_new = Interop.downcallHandle(
        "g_string_sized_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructSizedNew(@NotNull long dflSize) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_string_sized_new.invokeExact(dflSize), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link String}, with enough space for {@code dfl_size}
     * bytes. This is useful if you are going to add a lot of
     * text to the string and don't want it to be reallocated
     * too often.
     */
    public static String sizedNew(@NotNull long dflSize) {
        return new String(constructSizedNew(dflSize));
    }
    
    private static final MethodHandle g_string_append = Interop.downcallHandle(
        "g_string_append",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a string onto the end of a {@link String}, expanding
     * it if necessary.
     */
    public @NotNull String append(@NotNull java.lang.String val) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_append.invokeExact(handle(), Interop.allocateNativeString(val));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_append_c = Interop.downcallHandle(
        "g_string_append_c",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Adds a byte onto the end of a {@link String}, expanding
     * it if necessary.
     */
    public @NotNull String appendC(@NotNull byte c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_append_c.invokeExact(handle(), c);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_append_len = Interop.downcallHandle(
        "g_string_append_len",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
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
    public @NotNull String appendLen(@NotNull java.lang.String val, @NotNull long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_append_len.invokeExact(handle(), Interop.allocateNativeString(val), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_append_unichar = Interop.downcallHandle(
        "g_string_append_unichar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a Unicode character into UTF-8, and appends it
     * to the string.
     */
    public @NotNull String appendUnichar(@NotNull int wc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_append_unichar.invokeExact(handle(), wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_append_uri_escaped = Interop.downcallHandle(
        "g_string_append_uri_escaped",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Appends {@code unescaped} to {@code string}, escaping any characters that
     * are reserved in URIs using URI-style escape sequences.
     */
    public @NotNull String appendUriEscaped(@NotNull java.lang.String unescaped, @NotNull java.lang.String reservedCharsAllowed, @NotNull boolean allowUtf8) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_append_uri_escaped.invokeExact(handle(), Interop.allocateNativeString(unescaped), Interop.allocateNativeString(reservedCharsAllowed), allowUtf8 ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_append_vprintf = Interop.downcallHandle(
        "g_string_append_vprintf",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends a formatted string onto the end of a {@link String}.
     * This function is similar to g_string_append_printf()
     * except that the arguments to the format string are passed
     * as a va_list.
     */
    public @NotNull void appendVprintf(@NotNull java.lang.String format, @NotNull VaList args) {
        try {
            g_string_append_vprintf.invokeExact(handle(), Interop.allocateNativeString(format), args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_string_ascii_down = Interop.downcallHandle(
        "g_string_ascii_down",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts all uppercase ASCII letters to lowercase ASCII letters.
     */
    public @NotNull String asciiDown() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_ascii_down.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_ascii_up = Interop.downcallHandle(
        "g_string_ascii_up",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts all lowercase ASCII letters to uppercase ASCII letters.
     */
    public @NotNull String asciiUp() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_ascii_up.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_assign = Interop.downcallHandle(
        "g_string_assign",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the bytes from a string into a {@link String},
     * destroying any previous contents. It is rather like
     * the standard strcpy() function, except that you do not
     * have to worry about having enough space to copy the string.
     */
    public @NotNull String assign(@NotNull java.lang.String rval) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_assign.invokeExact(handle(), Interop.allocateNativeString(rval));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_equal = Interop.downcallHandle(
        "g_string_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two strings for equality, returning {@code true} if they are equal.
     * For use with {@link HashTable}.
     */
    public boolean equal(@NotNull String v2) {
        int RESULT;
        try {
            RESULT = (int) g_string_equal.invokeExact(handle(), v2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_string_erase = Interop.downcallHandle(
        "g_string_erase",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Removes {@code len} bytes from a {@link String}, starting at position {@code pos}.
     * The rest of the {@link String} is shifted down to fill the gap.
     */
    public @NotNull String erase(@NotNull long pos, @NotNull long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_erase.invokeExact(handle(), pos, len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_free = Interop.downcallHandle(
        "g_string_free",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Frees the memory allocated for the {@link String}.
     * If {@code free_segment} is {@code true} it also frees the character data.  If
     * it's {@code false}, the caller gains ownership of the buffer and must
     * free it after use with g_free().
     */
    public @Nullable java.lang.String free(@NotNull boolean freeSegment) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_free.invokeExact(handle(), freeSegment ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_string_free_to_bytes = Interop.downcallHandle(
        "g_string_free_to_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull Bytes freeToBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_free_to_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Bytes(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_string_hash = Interop.downcallHandle(
        "g_string_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a hash code for {@code str}; for use with {@link HashTable}.
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) g_string_hash.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_string_insert = Interop.downcallHandle(
        "g_string_insert",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a copy of a string into a {@link String},
     * expanding it if necessary.
     */
    public @NotNull String insert(@NotNull long pos, @NotNull java.lang.String val) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_insert.invokeExact(handle(), pos, Interop.allocateNativeString(val));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_insert_c = Interop.downcallHandle(
        "g_string_insert_c",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Inserts a byte into a {@link String}, expanding it if necessary.
     */
    public @NotNull String insertC(@NotNull long pos, @NotNull byte c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_insert_c.invokeExact(handle(), pos, c);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_insert_len = Interop.downcallHandle(
        "g_string_insert_len",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
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
    public @NotNull String insertLen(@NotNull long pos, @NotNull java.lang.String val, @NotNull long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_insert_len.invokeExact(handle(), pos, Interop.allocateNativeString(val), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_insert_unichar = Interop.downcallHandle(
        "g_string_insert_unichar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a Unicode character into UTF-8, and insert it
     * into the string at the given position.
     */
    public @NotNull String insertUnichar(@NotNull long pos, @NotNull int wc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_insert_unichar.invokeExact(handle(), pos, wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_overwrite = Interop.downcallHandle(
        "g_string_overwrite",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Overwrites part of a string, lengthening it if necessary.
     */
    public @NotNull String overwrite(@NotNull long pos, @NotNull java.lang.String val) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_overwrite.invokeExact(handle(), pos, Interop.allocateNativeString(val));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_overwrite_len = Interop.downcallHandle(
        "g_string_overwrite_len",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Overwrites part of a string, lengthening it if necessary.
     * This function will work with embedded nuls.
     */
    public @NotNull String overwriteLen(@NotNull long pos, @NotNull java.lang.String val, @NotNull long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_overwrite_len.invokeExact(handle(), pos, Interop.allocateNativeString(val), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_prepend = Interop.downcallHandle(
        "g_string_prepend",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a string on to the start of a {@link String},
     * expanding it if necessary.
     */
    public @NotNull String prepend(@NotNull java.lang.String val) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_prepend.invokeExact(handle(), Interop.allocateNativeString(val));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_prepend_c = Interop.downcallHandle(
        "g_string_prepend_c",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Adds a byte onto the start of a {@link String},
     * expanding it if necessary.
     */
    public @NotNull String prependC(@NotNull byte c) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_prepend_c.invokeExact(handle(), c);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_prepend_len = Interop.downcallHandle(
        "g_string_prepend_len",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
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
    public @NotNull String prependLen(@NotNull java.lang.String val, @NotNull long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_prepend_len.invokeExact(handle(), Interop.allocateNativeString(val), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_prepend_unichar = Interop.downcallHandle(
        "g_string_prepend_unichar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a Unicode character into UTF-8, and prepends it
     * to the string.
     */
    public @NotNull String prependUnichar(@NotNull int wc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_prepend_unichar.invokeExact(handle(), wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_replace = Interop.downcallHandle(
        "g_string_replace",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public int replace(@NotNull java.lang.String find, @NotNull java.lang.String replace, @NotNull int limit) {
        int RESULT;
        try {
            RESULT = (int) g_string_replace.invokeExact(handle(), Interop.allocateNativeString(find), Interop.allocateNativeString(replace), limit);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_string_set_size = Interop.downcallHandle(
        "g_string_set_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the length of a {@link String}. If the length is less than
     * the current length, the string will be truncated. If the
     * length is greater than the current length, the contents
     * of the newly added area are undefined. (However, as
     * always, string->str[string->len] will be a nul byte.)
     */
    public @NotNull String setSize(@NotNull long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_set_size.invokeExact(handle(), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_truncate = Interop.downcallHandle(
        "g_string_truncate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Cuts off the end of the GString, leaving the first {@code len} bytes.
     */
    public @NotNull String truncate(@NotNull long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_string_truncate.invokeExact(handle(), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new String(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_string_vprintf = Interop.downcallHandle(
        "g_string_vprintf",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Writes a formatted string into a {@link String}.
     * This function is similar to g_string_printf() except that
     * the arguments to the format string are passed as a va_list.
     */
    public @NotNull void vprintf(@NotNull java.lang.String format, @NotNull VaList args) {
        try {
            g_string_vprintf.invokeExact(handle(), Interop.allocateNativeString(format), args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

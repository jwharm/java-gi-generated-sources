package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class GLib {
    
    public static final int ANALYZER_ANALYZING = 1;

    public static final int ASCII_DTOSTR_BUF_SIZE = 39;

    public static final int BIG_ENDIAN = 4321;

    public static final java.lang.String CSET_A_2_Z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final java.lang.String CSET_DIGITS = "0123456789";

    public static final java.lang.String CSET_a_2_z = "abcdefghijklmnopqrstuvwxyz";

    public static final int DATALIST_FLAGS_MASK = 3;

    public static final int DATE_BAD_DAY = 0;

    public static final int DATE_BAD_JULIAN = 0;

    public static final int DATE_BAD_YEAR = 0;

    public static final int DIR_SEPARATOR = 47;

    public static final java.lang.String DIR_SEPARATOR_S = "/";

    public static final double E = 2.718282d;

    public static final java.lang.String GINT16_FORMAT = "hi";

    public static final java.lang.String GINT16_MODIFIER = "h";

    public static final java.lang.String GINT32_FORMAT = "i";

    public static final java.lang.String GINT32_MODIFIER = "";

    public static final java.lang.String GINT64_FORMAT = "li";

    public static final java.lang.String GINT64_MODIFIER = "l";

    public static final java.lang.String GINTPTR_FORMAT = "li";

    public static final java.lang.String GINTPTR_MODIFIER = "l";

    public static final java.lang.String GNUC_FUNCTION = "";

    public static final java.lang.String GNUC_PRETTY_FUNCTION = "";

    public static final java.lang.String GSIZE_FORMAT = "lu";

    public static final java.lang.String GSIZE_MODIFIER = "l";

    public static final java.lang.String GSSIZE_FORMAT = "li";

    public static final java.lang.String GSSIZE_MODIFIER = "l";

    public static final java.lang.String GUINT16_FORMAT = "hu";

    public static final java.lang.String GUINT32_FORMAT = "u";

    public static final java.lang.String GUINT64_FORMAT = "lu";

    public static final java.lang.String GUINTPTR_FORMAT = "lu";

    public static final int HAVE_GINT64 = 1;

    public static final int HAVE_GNUC_VARARGS = 1;

    public static final int HAVE_GNUC_VISIBILITY = 1;

    public static final int HAVE_GROWING_STACK = 0;

    public static final int HAVE_ISO_VARARGS = 1;

    public static final int HOOK_FLAG_USER_SHIFT = 4;

    public static final int IEEE754_DOUBLE_BIAS = 1023;

    public static final int IEEE754_FLOAT_BIAS = 127;

    public static final java.lang.String KEY_FILE_DESKTOP_GROUP = "Desktop Entry";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_ACTIONS = "Actions";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_CATEGORIES = "Categories";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_COMMENT = "Comment";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_DBUS_ACTIVATABLE = "DBusActivatable";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_EXEC = "Exec";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_GENERIC_NAME = "GenericName";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_HIDDEN = "Hidden";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_ICON = "Icon";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_MIME_TYPE = "MimeType";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_NAME = "Name";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_NOT_SHOW_IN = "NotShowIn";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_NO_DISPLAY = "NoDisplay";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_ONLY_SHOW_IN = "OnlyShowIn";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_PATH = "Path";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_STARTUP_NOTIFY = "StartupNotify";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_STARTUP_WM_CLASS = "StartupWMClass";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_TERMINAL = "Terminal";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_TRY_EXEC = "TryExec";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_TYPE = "Type";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_URL = "URL";

    public static final java.lang.String KEY_FILE_DESKTOP_KEY_VERSION = "Version";

    public static final java.lang.String KEY_FILE_DESKTOP_TYPE_APPLICATION = "Application";

    public static final java.lang.String KEY_FILE_DESKTOP_TYPE_DIRECTORY = "Directory";

    public static final java.lang.String KEY_FILE_DESKTOP_TYPE_LINK = "Link";

    public static final int LITTLE_ENDIAN = 1234;

    public static final double LN10 = 2.302585d;

    public static final double LN2 = 0.693147d;

    public static final double LOG_2_BASE_10 = 0.30103d;

    public static final byte LOG_DOMAIN = 0;

    public static final int LOG_FATAL_MASK = 5;

    public static final int LOG_LEVEL_USER_SHIFT = 8;

    public static final int MAJOR_VERSION = 2;

    public static final short MAXINT16 = 32767;

    public static final int MAXINT32 = 2147483647;

    public static final long MAXINT64 = 9223372036854775807L;

    public static final byte MAXINT8 = 127;

    public static final int MICRO_VERSION = 0;

    public static final short MININT16 = -32768;

    public static final int MININT32 = -2147483648;

    public static final long MININT64 = -9223372036854775808L;

    public static final byte MININT8 = -128;

    public static final int MINOR_VERSION = 72;

    public static final java.lang.String MODULE_SUFFIX = "so";

    public static final java.lang.String OPTION_REMAINING = "";

    public static final int PDP_ENDIAN = 3412;

    public static final double PI = 3.141593d;

    public static final java.lang.String PID_FORMAT = "i";

    public static final double PI_2 = 1.570796d;

    public static final double PI_4 = 0.785398d;

    public static final java.lang.String POLLFD_FORMAT = "%d";

    public static final int PRIORITY_DEFAULT = 0;

    public static final int PRIORITY_DEFAULT_IDLE = 200;

    public static final int PRIORITY_HIGH = -100;

    public static final int PRIORITY_HIGH_IDLE = 100;

    public static final int PRIORITY_LOW = 300;

    public static final int SEARCHPATH_SEPARATOR = 58;

    public static final java.lang.String SEARCHPATH_SEPARATOR_S = ":";

    public static final int SIZEOF_LONG = 8;

    public static final int SIZEOF_SIZE_T = 8;

    public static final int SIZEOF_SSIZE_T = 8;

    public static final int SIZEOF_VOID_P = 8;

    public static final boolean SOURCE_CONTINUE = true;

    public static final boolean SOURCE_REMOVE = false;

    public static final double SQRT2 = 1.414214d;

    public static final java.lang.String STR_DELIMITERS = "_-|> <.";

    public static final int SYSDEF_AF_INET = 2;

    public static final int SYSDEF_AF_INET6 = 10;

    public static final int SYSDEF_AF_UNIX = 1;

    public static final int SYSDEF_MSG_DONTROUTE = 4;

    public static final int SYSDEF_MSG_OOB = 1;

    public static final int SYSDEF_MSG_PEEK = 2;

    public static final java.lang.String TEST_OPTION_ISOLATE_DIRS = "isolate_dirs";

    public static final long TIME_SPAN_DAY = 86400000000L;

    public static final long TIME_SPAN_HOUR = 3600000000L;

    public static final long TIME_SPAN_MILLISECOND = 1000L;

    public static final long TIME_SPAN_MINUTE = 60000000L;

    public static final long TIME_SPAN_SECOND = 1000000L;

    public static final int UNICHAR_MAX_DECOMPOSITION_LENGTH = 18;

    public static final java.lang.String URI_RESERVED_CHARS_GENERIC_DELIMITERS = ":/?#[]@";

    public static final java.lang.String URI_RESERVED_CHARS_SUBCOMPONENT_DELIMITERS = "!$&'()*+,;=";

    public static final int USEC_PER_SEC = 1000000;

    public static final int VA_COPY_AS_ARRAY = 1;

    public static final int VERSION_MIN_REQUIRED = 2;

    public static final int WIN32_MSG_HANDLE = 19981206;

    public static final int macro__has_attribute___noreturn__ = 0;

    static final MethodHandle g_access = Interop.downcallHandle(
        "g_access",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * A wrapper for the POSIX access() function. This function is used to
     * test a pathname for one or several of read, write or execute
     * permissions, or just existence.
     * <p>
     * On Windows, the file protection mechanism is not at all POSIX-like,
     * and the underlying function in the C library only checks the
     * FAT-style READONLY attribute, and does not look at the ACL of a
     * file at all. This function is this in practise almost useless on
     * Windows. Software that needs to handle file permissions on Windows
     * more exactly should use the Win32 API.
     * <p>
     * See your C library manual for more details about access().
     */
    public static int access(java.lang.String filename, int mode) {
        try {
            var RESULT = (int) g_access.invokeExact(Interop.allocateNativeString(filename).handle(), mode);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_aligned_alloc = Interop.downcallHandle(
        "g_aligned_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is similar to g_malloc(), allocating ({@code n_blocks} * {@code n_block_bytes})
     * bytes, but care is taken to align the allocated memory to with the given
     * alignment value. Additionally, it will detect possible overflow during
     * multiplication.
     * <p>
     * Aligned memory allocations returned by this function can only be
     * freed using g_aligned_free().
     */
    public static java.lang.foreign.MemoryAddress alignedAlloc(long nBlocks, long nBlockBytes, long alignment) {
        try {
            var RESULT = (MemoryAddress) g_aligned_alloc.invokeExact(nBlocks, nBlockBytes, alignment);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_aligned_alloc0 = Interop.downcallHandle(
        "g_aligned_alloc0",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is similar to g_aligned_alloc(), but it will
     * also clear the allocated memory before returning it.
     */
    public static java.lang.foreign.MemoryAddress alignedAlloc0(long nBlocks, long nBlockBytes, long alignment) {
        try {
            var RESULT = (MemoryAddress) g_aligned_alloc0.invokeExact(nBlocks, nBlockBytes, alignment);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_aligned_free = Interop.downcallHandle(
        "g_aligned_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the memory allocated by g_aligned_alloc().
     */
    public static void alignedFree(java.lang.foreign.MemoryAddress mem) {
        try {
            g_aligned_free.invokeExact(mem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_digit_value = Interop.downcallHandle(
        "g_ascii_digit_value",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Determines the numeric value of a character as a decimal digit.
     * Differs from g_unichar_digit_value() because it takes a char, so
     * there's no worry about sign extension if characters are signed.
     */
    public static int asciiDigitValue(byte c) {
        try {
            var RESULT = (int) g_ascii_digit_value.invokeExact(c);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_dtostr = Interop.downcallHandle(
        "g_ascii_dtostr",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Converts a {@code gdouble} to a string, using the '.' as
     * decimal point.
     * <p>
     * This function generates enough precision that converting
     * the string back using g_ascii_strtod() gives the same machine-number
     * (on machines with IEEE compatible 64bit doubles). It is
     * guaranteed that the size of the resulting string will never
     * be larger than {@code G_ASCII_DTOSTR_BUF_SIZE} bytes, including the terminating
     * nul character, which is always added.
     */
    public static java.lang.String asciiDtostr(java.lang.String buffer, int bufLen, double d) {
        try {
            var RESULT = (MemoryAddress) g_ascii_dtostr.invokeExact(Interop.allocateNativeString(buffer).handle(), bufLen, d);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_formatd = Interop.downcallHandle(
        "g_ascii_formatd",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Converts a {@code gdouble} to a string, using the '.' as
     * decimal point. To format the number you pass in
     * a printf()-style format string. Allowed conversion
     * specifiers are 'e', 'E', 'f', 'F', 'g' and 'G'.
     * <p>
     * The {@code format} must just be a single format specifier
     * starting with {@code %}, expecting a {@code gdouble} argument.
     * <p>
     * The returned buffer is guaranteed to be nul-terminated.
     * <p>
     * If you just want to want to serialize the value into a
     * string, use g_ascii_dtostr().
     */
    public static java.lang.String asciiFormatd(java.lang.String buffer, int bufLen, java.lang.String format, double d) {
        try {
            var RESULT = (MemoryAddress) g_ascii_formatd.invokeExact(Interop.allocateNativeString(buffer).handle(), bufLen, Interop.allocateNativeString(format).handle(), d);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_strcasecmp = Interop.downcallHandle(
        "g_ascii_strcasecmp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compare two strings, ignoring the case of ASCII characters.
     * <p>
     * Unlike the BSD strcasecmp() function, this only recognizes standard
     * ASCII letters and ignores the locale, treating all non-ASCII
     * bytes as if they are not letters.
     * <p>
     * This function should be used only on strings that are known to be
     * in encodings where the bytes corresponding to ASCII letters always
     * represent themselves. This includes UTF-8 and the ISO-8859-*
     * charsets, but not for instance double-byte encodings like the
     * Windows Codepage 932, where the trailing bytes of double-byte
     * characters include all ASCII letters. If you compare two CP932
     * strings using this function, you will get false matches.
     * <p>
     * Both {@code s1} and {@code s2} must be non-{@code null}.
     */
    public static int asciiStrcasecmp(java.lang.String s1, java.lang.String s2) {
        try {
            var RESULT = (int) g_ascii_strcasecmp.invokeExact(Interop.allocateNativeString(s1).handle(), Interop.allocateNativeString(s2).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_strdown = Interop.downcallHandle(
        "g_ascii_strdown",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Converts all upper case ASCII letters to lower case ASCII letters.
     */
    public static java.lang.String asciiStrdown(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_ascii_strdown.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_string_to_signed = Interop.downcallHandle(
        "g_ascii_string_to_signed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function for converting a string to a signed number.
     * <p>
     * This function assumes that {@code str} contains only a number of the given
     * {@code base} that is within inclusive bounds limited by {@code min} and {@code max}. If
     * this is true, then the converted number is stored in {@code out_num}. An
     * empty string is not a valid input. A string with leading or
     * trailing whitespace is also an invalid input.
     * <p>
     * {@code base} can be between 2 and 36 inclusive. Hexadecimal numbers must
     * not be prefixed with "0x" or "0X". Such a problem does not exist
     * for octal numbers, since they were usually prefixed with a zero
     * which does not change the value of the parsed number.
     * <p>
     * Parsing failures result in an error with the {@code G_NUMBER_PARSER_ERROR}
     * domain. If the input is invalid, the error code will be
     * {@link NumberParserError#INVALID}. If the parsed number is out of
     * bounds - {@link NumberParserError#OUT_OF_BOUNDS}.
     * <p>
     * See g_ascii_strtoll() if you have more complex needs such as
     * parsing a string which starts with a number, but then has other
     * characters.
     */
    public static boolean asciiStringToSigned(java.lang.String str, int base, long min, long max, PointerLong outNum) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_ascii_string_to_signed.invokeExact(Interop.allocateNativeString(str).handle(), base, min, max, outNum.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_string_to_unsigned = Interop.downcallHandle(
        "g_ascii_string_to_unsigned",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function for converting a string to an unsigned number.
     * <p>
     * This function assumes that {@code str} contains only a number of the given
     * {@code base} that is within inclusive bounds limited by {@code min} and {@code max}. If
     * this is true, then the converted number is stored in {@code out_num}. An
     * empty string is not a valid input. A string with leading or
     * trailing whitespace is also an invalid input. A string with a leading sign
     * ({@code -} or {@code +}) is not a valid input for the unsigned parser.
     * <p>
     * {@code base} can be between 2 and 36 inclusive. Hexadecimal numbers must
     * not be prefixed with "0x" or "0X". Such a problem does not exist
     * for octal numbers, since they were usually prefixed with a zero
     * which does not change the value of the parsed number.
     * <p>
     * Parsing failures result in an error with the {@code G_NUMBER_PARSER_ERROR}
     * domain. If the input is invalid, the error code will be
     * {@link NumberParserError#INVALID}. If the parsed number is out of
     * bounds - {@link NumberParserError#OUT_OF_BOUNDS}.
     * <p>
     * See g_ascii_strtoull() if you have more complex needs such as
     * parsing a string which starts with a number, but then has other
     * characters.
     */
    public static boolean asciiStringToUnsigned(java.lang.String str, int base, long min, long max, PointerLong outNum) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_ascii_string_to_unsigned.invokeExact(Interop.allocateNativeString(str).handle(), base, min, max, outNum.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_strncasecmp = Interop.downcallHandle(
        "g_ascii_strncasecmp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Compare {@code s1} and {@code s2}, ignoring the case of ASCII characters and any
     * characters after the first @n in each string. If either string is
     * less than @n bytes long, comparison will stop at the first nul byte
     * encountered.
     * <p>
     * Unlike the BSD strcasecmp() function, this only recognizes standard
     * ASCII letters and ignores the locale, treating all non-ASCII
     * characters as if they are not letters.
     * <p>
     * The same warning as in g_ascii_strcasecmp() applies: Use this
     * function only on strings known to be in encodings where bytes
     * corresponding to ASCII letters always represent themselves.
     */
    public static int asciiStrncasecmp(java.lang.String s1, java.lang.String s2, long n) {
        try {
            var RESULT = (int) g_ascii_strncasecmp.invokeExact(Interop.allocateNativeString(s1).handle(), Interop.allocateNativeString(s2).handle(), n);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_strtod = Interop.downcallHandle(
        "g_ascii_strtod",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string to a {@code gdouble} value.
     * <p>
     * This function behaves like the standard strtod() function
     * does in the C locale. It does this without actually changing
     * the current locale, since that would not be thread-safe.
     * A limitation of the implementation is that this function
     * will still accept localized versions of infinities and NANs.
     * <p>
     * This function is typically used when reading configuration
     * files or other non-user input that should be locale independent.
     * To handle input from the user you should normally use the
     * locale-sensitive system strtod() function.
     * <p>
     * To convert from a {@code gdouble} to a string in a locale-insensitive
     * way, use g_ascii_dtostr().
     * <p>
     * If the correct value would cause overflow, plus or minus {@code HUGE_VAL}
     * is returned (according to the sign of the value), and {@code ERANGE} is
     * stored in {@code errno}. If the correct value would cause underflow,
     * zero is returned and {@code ERANGE} is stored in {@code errno}.
     * <p>
     * This function resets {@code errno} before calling strtod() so that
     * you can reliably detect overflow and underflow.
     */
    public static double asciiStrtod(java.lang.String nptr, PointerString endptr) {
        try {
            var RESULT = (double) g_ascii_strtod.invokeExact(Interop.allocateNativeString(nptr).handle(), endptr.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_strtoll = Interop.downcallHandle(
        "g_ascii_strtoll",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a string to a {@code gint64} value.
     * This function behaves like the standard strtoll() function
     * does in the C locale. It does this without actually
     * changing the current locale, since that would not be
     * thread-safe.
     * <p>
     * This function is typically used when reading configuration
     * files or other non-user input that should be locale independent.
     * To handle input from the user you should normally use the
     * locale-sensitive system strtoll() function.
     * <p>
     * If the correct value would cause overflow, {@code G_MAXINT64} or {@code G_MININT64}
     * is returned, and {@code ERANGE} is stored in {@code errno}.
     * If the base is outside the valid range, zero is returned, and
     * {@code EINVAL} is stored in {@code errno}. If the
     * string conversion fails, zero is returned, and {@code endptr} returns {@code nptr}
     * (if {@code endptr} is non-{@code null}).
     */
    public static long asciiStrtoll(java.lang.String nptr, PointerString endptr, int base) {
        try {
            var RESULT = (long) g_ascii_strtoll.invokeExact(Interop.allocateNativeString(nptr).handle(), endptr.handle(), base);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_strtoull = Interop.downcallHandle(
        "g_ascii_strtoull",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a string to a {@code guint64} value.
     * This function behaves like the standard strtoull() function
     * does in the C locale. It does this without actually
     * changing the current locale, since that would not be
     * thread-safe.
     * <p>
     * Note that input with a leading minus sign ({@code -}) is accepted, and will return
     * the negation of the parsed number, unless that would overflow a {@code guint64}.
     * Critically, this means you cannot assume that a short fixed length input will
     * never result in a low return value, as the input could have a leading {@code -}.
     * <p>
     * This function is typically used when reading configuration
     * files or other non-user input that should be locale independent.
     * To handle input from the user you should normally use the
     * locale-sensitive system strtoull() function.
     * <p>
     * If the correct value would cause overflow, {@code G_MAXUINT64}
     * is returned, and {@code ERANGE} is stored in {@code errno}.
     * If the base is outside the valid range, zero is returned, and
     * {@code EINVAL} is stored in {@code errno}.
     * If the string conversion fails, zero is returned, and {@code endptr} returns
     * {@code nptr} (if {@code endptr} is non-{@code null}).
     */
    public static long asciiStrtoull(java.lang.String nptr, PointerString endptr, int base) {
        try {
            var RESULT = (long) g_ascii_strtoull.invokeExact(Interop.allocateNativeString(nptr).handle(), endptr.handle(), base);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_strup = Interop.downcallHandle(
        "g_ascii_strup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Converts all lower case ASCII letters to upper case ASCII letters.
     */
    public static java.lang.String asciiStrup(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_ascii_strup.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_tolower = Interop.downcallHandle(
        "g_ascii_tolower",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Convert a character to ASCII lower case.
     * <p>
     * Unlike the standard C library tolower() function, this only
     * recognizes standard ASCII letters and ignores the locale, returning
     * all non-ASCII characters unchanged, even if they are lower case
     * letters in a particular character set. Also unlike the standard
     * library function, this takes and returns a char, not an int, so
     * don't call it on {@code EOF} but no need to worry about casting to {@code guchar}
     * before passing a possibly non-ASCII character in.
     */
    public static byte asciiTolower(byte c) {
        try {
            var RESULT = (byte) g_ascii_tolower.invokeExact(c);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_toupper = Interop.downcallHandle(
        "g_ascii_toupper",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Convert a character to ASCII upper case.
     * <p>
     * Unlike the standard C library toupper() function, this only
     * recognizes standard ASCII letters and ignores the locale, returning
     * all non-ASCII characters unchanged, even if they are upper case
     * letters in a particular character set. Also unlike the standard
     * library function, this takes and returns a char, not an int, so
     * don't call it on {@code EOF} but no need to worry about casting to {@code guchar}
     * before passing a possibly non-ASCII character in.
     */
    public static byte asciiToupper(byte c) {
        try {
            var RESULT = (byte) g_ascii_toupper.invokeExact(c);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ascii_xdigit_value = Interop.downcallHandle(
        "g_ascii_xdigit_value",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Determines the numeric value of a character as a hexadecimal
     * digit. Differs from g_unichar_xdigit_value() because it takes
     * a char, so there's no worry about sign extension if characters
     * are signed.
     */
    public static int asciiXdigitValue(byte c) {
        try {
            var RESULT = (int) g_ascii_xdigit_value.invokeExact(c);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_assert_warning = Interop.downcallHandle(
        "g_assert_warning",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static void assertWarning(java.lang.String logDomain, java.lang.String file, int line, java.lang.String prettyFunction, java.lang.String expression) {
        try {
            g_assert_warning.invokeExact(Interop.allocateNativeString(logDomain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(prettyFunction).handle(), Interop.allocateNativeString(expression).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_assertion_message = Interop.downcallHandle(
        "g_assertion_message",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static void assertionMessage(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String message) {
        try {
            g_assertion_message.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(message).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_assertion_message_cmpstr = Interop.downcallHandle(
        "g_assertion_message_cmpstr",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static void assertionMessageCmpstr(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, java.lang.String arg1, java.lang.String cmp, java.lang.String arg2) {
        try {
            g_assertion_message_cmpstr.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle(), Interop.allocateNativeString(arg1).handle(), Interop.allocateNativeString(cmp).handle(), Interop.allocateNativeString(arg2).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_assertion_message_cmpstrv = Interop.downcallHandle(
        "g_assertion_message_cmpstrv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static void assertionMessageCmpstrv(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, java.lang.String arg1, java.lang.String arg2, long firstWrongIdx) {
        try {
            g_assertion_message_cmpstrv.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle(), Interop.allocateNativeString(arg1).handle(), Interop.allocateNativeString(arg2).handle(), firstWrongIdx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_assertion_message_error = Interop.downcallHandle(
        "g_assertion_message_error",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    public static void assertionMessageError(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, Error error, Quark errorDomain, int errorCode) {
        try {
            g_assertion_message_error.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle(), error.handle(), errorDomain.getValue(), errorCode);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_assertion_message_expr = Interop.downcallHandle(
        "g_assertion_message_expr",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Internal function used to print messages from the public g_assert() and
     * g_assert_not_reached() macros.
     */
    public static void assertionMessageExpr(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr) {
        try {
            g_assertion_message_expr.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_int_add = Interop.downcallHandle(
        "g_atomic_int_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Atomically adds {@code val} to the value of {@code atomic}.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { tmp = *atomic; *atomic += val; return tmp; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * Before version 2.30, this function did not return a value
     * (but g_atomic_int_exchange_and_add() did, and had the same meaning).
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static int atomicIntAdd(PointerInteger atomic, int val) {
        try {
            var RESULT = (int) g_atomic_int_add.invokeExact(atomic.handle(), val);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_int_and = Interop.downcallHandle(
        "g_atomic_int_and",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Performs an atomic bitwise 'and' of the value of {@code atomic} and {@code val},
     * storing the result back in {@code atomic}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { tmp = *atomic; *atomic &= val; return tmp; }}.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static int atomicIntAnd(PointerInteger atomic, int val) {
        try {
            var RESULT = (int) g_atomic_int_and.invokeExact(atomic.handle(), val);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_int_compare_and_exchange = Interop.downcallHandle(
        "g_atomic_int_compare_and_exchange",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Compares {@code atomic} to {@code oldval} and, if equal, sets it to {@code newval}.
     * If {@code atomic} was not equal to {@code oldval} then no change occurs.
     * <p>
     * This compare and exchange is done atomically.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static boolean atomicIntCompareAndExchange(PointerInteger atomic, int oldval, int newval) {
        try {
            var RESULT = (int) g_atomic_int_compare_and_exchange.invokeExact(atomic.handle(), oldval, newval);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_int_dec_and_test = Interop.downcallHandle(
        "g_atomic_int_dec_and_test",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the value of {@code atomic} by 1.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { *atomic -= 1; return (*atomic == 0); }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static boolean atomicIntDecAndTest(PointerInteger atomic) {
        try {
            var RESULT = (int) g_atomic_int_dec_and_test.invokeExact(atomic.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_int_get = Interop.downcallHandle(
        "g_atomic_int_get",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current value of {@code atomic}.
     * <p>
     * This call acts as a full compiler and hardware
     * memory barrier (before the get).
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static int atomicIntGet(PointerInteger atomic) {
        try {
            var RESULT = (int) g_atomic_int_get.invokeExact(atomic.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_int_inc = Interop.downcallHandle(
        "g_atomic_int_inc",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the value of {@code atomic} by 1.
     * <p>
     * Think of this operation as an atomic version of {@code { *atomic += 1; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static void atomicIntInc(PointerInteger atomic) {
        try {
            g_atomic_int_inc.invokeExact(atomic.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_int_or = Interop.downcallHandle(
        "g_atomic_int_or",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Performs an atomic bitwise 'or' of the value of {@code atomic} and {@code val},
     * storing the result back in {@code atomic}.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { tmp = *atomic; *atomic |= val; return tmp; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static int atomicIntOr(PointerInteger atomic, int val) {
        try {
            var RESULT = (int) g_atomic_int_or.invokeExact(atomic.handle(), val);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_int_set = Interop.downcallHandle(
        "g_atomic_int_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of {@code atomic} to {@code newval}.
     * <p>
     * This call acts as a full compiler and hardware
     * memory barrier (after the set).
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static void atomicIntSet(PointerInteger atomic, int newval) {
        try {
            g_atomic_int_set.invokeExact(atomic.handle(), newval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_int_xor = Interop.downcallHandle(
        "g_atomic_int_xor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Performs an atomic bitwise 'xor' of the value of {@code atomic} and {@code val},
     * storing the result back in {@code atomic}.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { tmp = *atomic; *atomic ^= val; return tmp; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static int atomicIntXor(PointerInteger atomic, int val) {
        try {
            var RESULT = (int) g_atomic_int_xor.invokeExact(atomic.handle(), val);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_pointer_add = Interop.downcallHandle(
        "g_atomic_pointer_add",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Atomically adds {@code val} to the value of {@code atomic}.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { tmp = *atomic; *atomic += val; return tmp; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static long atomicPointerAdd(java.lang.foreign.MemoryAddress atomic, long val) {
        try {
            var RESULT = (long) g_atomic_pointer_add.invokeExact(atomic, val);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_pointer_and = Interop.downcallHandle(
        "g_atomic_pointer_and",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Performs an atomic bitwise 'and' of the value of {@code atomic} and {@code val},
     * storing the result back in {@code atomic}.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { tmp = *atomic; *atomic &= val; return tmp; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static long atomicPointerAnd(java.lang.foreign.MemoryAddress atomic, long val) {
        try {
            var RESULT = (long) g_atomic_pointer_and.invokeExact(atomic, val);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_pointer_compare_and_exchange = Interop.downcallHandle(
        "g_atomic_pointer_compare_and_exchange",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares {@code atomic} to {@code oldval} and, if equal, sets it to {@code newval}.
     * If {@code atomic} was not equal to {@code oldval} then no change occurs.
     * <p>
     * This compare and exchange is done atomically.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static boolean atomicPointerCompareAndExchange(java.lang.foreign.MemoryAddress atomic, java.lang.foreign.MemoryAddress oldval, java.lang.foreign.MemoryAddress newval) {
        try {
            var RESULT = (int) g_atomic_pointer_compare_and_exchange.invokeExact(atomic, oldval, newval);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_pointer_get = Interop.downcallHandle(
        "g_atomic_pointer_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current value of {@code atomic}.
     * <p>
     * This call acts as a full compiler and hardware
     * memory barrier (before the get).
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static java.lang.foreign.MemoryAddress atomicPointerGet(java.lang.foreign.MemoryAddress atomic) {
        try {
            var RESULT = (MemoryAddress) g_atomic_pointer_get.invokeExact(atomic);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_pointer_or = Interop.downcallHandle(
        "g_atomic_pointer_or",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Performs an atomic bitwise 'or' of the value of {@code atomic} and {@code val},
     * storing the result back in {@code atomic}.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { tmp = *atomic; *atomic |= val; return tmp; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static long atomicPointerOr(java.lang.foreign.MemoryAddress atomic, long val) {
        try {
            var RESULT = (long) g_atomic_pointer_or.invokeExact(atomic, val);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_pointer_set = Interop.downcallHandle(
        "g_atomic_pointer_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the value of {@code atomic} to {@code newval}.
     * <p>
     * This call acts as a full compiler and hardware
     * memory barrier (after the set).
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static void atomicPointerSet(java.lang.foreign.MemoryAddress atomic, java.lang.foreign.MemoryAddress newval) {
        try {
            g_atomic_pointer_set.invokeExact(atomic, newval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_pointer_xor = Interop.downcallHandle(
        "g_atomic_pointer_xor",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Performs an atomic bitwise 'xor' of the value of {@code atomic} and {@code val},
     * storing the result back in {@code atomic}.
     * <p>
     * Think of this operation as an atomic version of
     * {@code { tmp = *atomic; *atomic ^= val; return tmp; }}.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static long atomicPointerXor(java.lang.foreign.MemoryAddress atomic, long val) {
        try {
            var RESULT = (long) g_atomic_pointer_xor.invokeExact(atomic, val);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_rc_box_acquire = Interop.downcallHandle(
        "g_atomic_rc_box_acquire",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically acquires a reference on the data pointed by {@code mem_block}.
     */
    public static java.lang.foreign.MemoryAddress atomicRcBoxAcquire(java.lang.foreign.MemoryAddress memBlock) {
        try {
            var RESULT = (MemoryAddress) g_atomic_rc_box_acquire.invokeExact(memBlock);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_rc_box_alloc = Interop.downcallHandle(
        "g_atomic_rc_box_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Allocates {@code block_size} bytes of memory, and adds atomic
     * reference counting semantics to it.
     * <p>
     * The data will be freed when its reference count drops to
     * zero.
     * <p>
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     */
    public static java.lang.foreign.MemoryAddress atomicRcBoxAlloc(long blockSize) {
        try {
            var RESULT = (MemoryAddress) g_atomic_rc_box_alloc.invokeExact(blockSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_rc_box_alloc0 = Interop.downcallHandle(
        "g_atomic_rc_box_alloc0",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Allocates {@code block_size} bytes of memory, and adds atomic
     * reference counting semantics to it.
     * <p>
     * The contents of the returned data is set to zero.
     * <p>
     * The data will be freed when its reference count drops to
     * zero.
     * <p>
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     */
    public static java.lang.foreign.MemoryAddress atomicRcBoxAlloc0(long blockSize) {
        try {
            var RESULT = (MemoryAddress) g_atomic_rc_box_alloc0.invokeExact(blockSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_rc_box_dup = Interop.downcallHandle(
        "g_atomic_rc_box_dup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Allocates a new block of data with atomic reference counting
     * semantics, and copies {@code block_size} bytes of {@code mem_block}
     * into it.
     */
    public static java.lang.foreign.MemoryAddress atomicRcBoxDup(long blockSize, java.lang.foreign.MemoryAddress memBlock) {
        try {
            var RESULT = (MemoryAddress) g_atomic_rc_box_dup.invokeExact(blockSize, memBlock);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_rc_box_get_size = Interop.downcallHandle(
        "g_atomic_rc_box_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the reference counted data pointed by {@code mem_block}.
     */
    public static long atomicRcBoxGetSize(java.lang.foreign.MemoryAddress memBlock) {
        try {
            var RESULT = (long) g_atomic_rc_box_get_size.invokeExact(memBlock);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_rc_box_release = Interop.downcallHandle(
        "g_atomic_rc_box_release",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically releases a reference on the data pointed by {@code mem_block}.
     * <p>
     * If the reference was the last one, it will free the
     * resources allocated for {@code mem_block}.
     */
    public static void atomicRcBoxRelease(java.lang.foreign.MemoryAddress memBlock) {
        try {
            g_atomic_rc_box_release.invokeExact(memBlock);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_ref_count_compare = Interop.downcallHandle(
        "g_atomic_ref_count_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Atomically compares the current value of {@code arc} with {@code val}.
     */
    public static boolean atomicRefCountCompare(PointerInteger arc, int val) {
        try {
            var RESULT = (int) g_atomic_ref_count_compare.invokeExact(arc.handle(), val);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_ref_count_dec = Interop.downcallHandle(
        "g_atomic_ref_count_dec",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically decreases the reference count.
     * <p>
     * If {@code true} is returned, the reference count reached 0. After this point, {@code arc}
     * is an undefined state and must be reinitialized with
     * g_atomic_ref_count_init() to be used again.
     */
    public static boolean atomicRefCountDec(PointerInteger arc) {
        try {
            var RESULT = (int) g_atomic_ref_count_dec.invokeExact(arc.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_ref_count_inc = Interop.downcallHandle(
        "g_atomic_ref_count_inc",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically increases the reference count.
     */
    public static void atomicRefCountInc(PointerInteger arc) {
        try {
            g_atomic_ref_count_inc.invokeExact(arc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_atomic_ref_count_init = Interop.downcallHandle(
        "g_atomic_ref_count_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a reference count variable to 1.
     */
    public static void atomicRefCountInit(PointerInteger arc) {
        try {
            g_atomic_ref_count_init.invokeExact(arc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_base64_decode = Interop.downcallHandle(
        "g_base64_decode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Decode a sequence of Base-64 encoded text into binary data.  Note
     * that the returned binary data is not necessarily zero-terminated,
     * so it should not be used as a character string.
     */
    public static PointerByte base64Decode(java.lang.String text, PointerLong outLen) {
        try {
            var RESULT = (MemoryAddress) g_base64_decode.invokeExact(Interop.allocateNativeString(text).handle(), outLen.handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_base64_decode_inplace = Interop.downcallHandle(
        "g_base64_decode_inplace",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Decode a sequence of Base-64 encoded text into binary data
     * by overwriting the input data.
     */
    public static PointerByte base64DecodeInplace(PointerByte text, PointerLong outLen) {
        try {
            var RESULT = (MemoryAddress) g_base64_decode_inplace.invokeExact(text.handle(), outLen.handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_base64_decode_step = Interop.downcallHandle(
        "g_base64_decode_step",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Incrementally decode a sequence of binary data from its Base-64 stringified
     * representation. By calling this function multiple times you can convert
     * data in chunks to avoid having to have the full encoded data in memory.
     * <p>
     * The output buffer must be large enough to fit all the data that will
     * be written to it. Since base64 encodes 3 bytes in 4 chars you need
     * at least: ({@code len} / 4) * 3 + 3 bytes (+ 3 may be needed in case of non-zero
     * state).
     */
    public static long base64DecodeStep(byte[] in, long len, PointerByte out, PointerInteger state, PointerInteger save) {
        try {
            var RESULT = (long) g_base64_decode_step.invokeExact(Interop.allocateNativeArray(in).handle(), len, out.handle(), state.handle(), save.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_base64_encode = Interop.downcallHandle(
        "g_base64_encode",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Encode a sequence of binary data into its Base-64 stringified
     * representation.
     */
    public static java.lang.String base64Encode(byte[] data, long len) {
        try {
            var RESULT = (MemoryAddress) g_base64_encode.invokeExact(Interop.allocateNativeArray(data).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_base64_encode_close = Interop.downcallHandle(
        "g_base64_encode_close",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Flush the status from a sequence of calls to g_base64_encode_step().
     * <p>
     * The output buffer must be large enough to fit all the data that will
     * be written to it. It will need up to 4 bytes, or up to 5 bytes if
     * line-breaking is enabled.
     * <p>
     * The {@code out} array will not be automatically nul-terminated.
     */
    public static long base64EncodeClose(boolean breakLines, PointerByte out, PointerInteger state, PointerInteger save) {
        try {
            var RESULT = (long) g_base64_encode_close.invokeExact(breakLines ? 1 : 0, out.handle(), state.handle(), save.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_base64_encode_step = Interop.downcallHandle(
        "g_base64_encode_step",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Incrementally encode a sequence of binary data into its Base-64 stringified
     * representation. By calling this function multiple times you can convert
     * data in chunks to avoid having to have the full encoded data in memory.
     * <p>
     * When all of the data has been converted you must call
     * g_base64_encode_close() to flush the saved state.
     * <p>
     * The output buffer must be large enough to fit all the data that will
     * be written to it. Due to the way base64 encodes you will need
     * at least: ({@code len} / 3 + 1) * 4 + 4 bytes (+ 4 may be needed in case of
     * non-zero state). If you enable line-breaking you will need at least:
     * (({@code len} / 3 + 1) * 4 + 4) / 76 + 1 bytes of extra space.
     * <p>
     * {@code break_lines} is typically used when putting base64-encoded data in emails.
     * It breaks the lines at 76 columns instead of putting all of the text on
     * the same line. This avoids problems with long lines in the email system.
     * Note however that it breaks the lines with {@code LF} characters, not
     * {@code CR LF} sequences, so the result cannot be passed directly to SMTP
     * or certain other protocols.
     */
    public static long base64EncodeStep(byte[] in, long len, boolean breakLines, PointerByte out, PointerInteger state, PointerInteger save) {
        try {
            var RESULT = (long) g_base64_encode_step.invokeExact(Interop.allocateNativeArray(in).handle(), len, breakLines ? 1 : 0, out.handle(), state.handle(), save.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bit_lock = Interop.downcallHandle(
        "g_bit_lock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the indicated {@code lock_bit} in {@code address}.  If the bit is already
     * set, this call will block until g_bit_unlock() unsets the
     * corresponding bit.
     * <p>
     * Attempting to lock on two different bits within the same integer is
     * not supported and will very probably cause deadlocks.
     * <p>
     * The value of the bit that is set is (1u << {@code bit}).  If {@code bit} is not
     * between 0 and 31 then the result is undefined.
     * <p>
     * This function accesses {@code address} atomically.  All other accesses to
     * {@code address} must be atomic in order for this function to work
     * reliably. While {@code address} has a {@code volatile} qualifier, this is a historical
     * artifact and the argument passed to it should not be {@code volatile}.
     */
    public static void bitLock(PointerInteger address, int lockBit) {
        try {
            g_bit_lock.invokeExact(address.handle(), lockBit);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bit_nth_lsf = Interop.downcallHandle(
        "g_bit_nth_lsf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Find the position of the first bit set in {@code mask}, searching
     * from (but not including) {@code nth_bit} upwards. Bits are numbered
     * from 0 (least significant) to sizeof({@code gulong}) * 8 - 1 (31 or 63,
     * usually). To start searching from the 0th bit, set {@code nth_bit} to -1.
     */
    public static int bitNthLsf(long mask, int nthBit) {
        try {
            var RESULT = (int) g_bit_nth_lsf.invokeExact(mask, nthBit);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bit_nth_msf = Interop.downcallHandle(
        "g_bit_nth_msf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Find the position of the first bit set in {@code mask}, searching
     * from (but not including) {@code nth_bit} downwards. Bits are numbered
     * from 0 (least significant) to sizeof({@code gulong}) * 8 - 1 (31 or 63,
     * usually). To start searching from the last bit, set {@code nth_bit} to
     * -1 or GLIB_SIZEOF_LONG * 8.
     */
    public static int bitNthMsf(long mask, int nthBit) {
        try {
            var RESULT = (int) g_bit_nth_msf.invokeExact(mask, nthBit);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bit_storage = Interop.downcallHandle(
        "g_bit_storage",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Gets the number of bits used to hold {@code number},
     * e.g. if {@code number} is 4, 3 bits are needed.
     */
    public static int bitStorage(long number) {
        try {
            var RESULT = (int) g_bit_storage.invokeExact(number);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bit_trylock = Interop.downcallHandle(
        "g_bit_trylock",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the indicated {@code lock_bit} in {@code address}, returning {@code true} if
     * successful.  If the bit is already set, returns {@code false} immediately.
     * <p>
     * Attempting to lock on two different bits within the same integer is
     * not supported.
     * <p>
     * The value of the bit that is set is (1u << {@code bit}).  If {@code bit} is not
     * between 0 and 31 then the result is undefined.
     * <p>
     * This function accesses {@code address} atomically.  All other accesses to
     * {@code address} must be atomic in order for this function to work
     * reliably. While {@code address} has a {@code volatile} qualifier, this is a historical
     * artifact and the argument passed to it should not be {@code volatile}.
     */
    public static boolean bitTrylock(PointerInteger address, int lockBit) {
        try {
            var RESULT = (int) g_bit_trylock.invokeExact(address.handle(), lockBit);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bit_unlock = Interop.downcallHandle(
        "g_bit_unlock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Clears the indicated {@code lock_bit} in {@code address}.  If another thread is
     * currently blocked in g_bit_lock() on this same bit then it will be
     * woken up.
     * <p>
     * This function accesses {@code address} atomically.  All other accesses to
     * {@code address} must be atomic in order for this function to work
     * reliably. While {@code address} has a {@code volatile} qualifier, this is a historical
     * artifact and the argument passed to it should not be {@code volatile}.
     */
    public static void bitUnlock(PointerInteger address, int lockBit) {
        try {
            g_bit_unlock.invokeExact(address.handle(), lockBit);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_error_quark = Interop.downcallHandle(
        "g_bookmark_file_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark bookmarkFileErrorQuark() {
        try {
            var RESULT = (int) g_bookmark_file_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_build_filename_valist = Interop.downcallHandle(
        "g_build_filename_valist",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Behaves exactly like g_build_filename(), but takes the path elements
     * as a va_list. This function is mainly meant for language bindings.
     */
    public static java.lang.String buildFilenameValist(java.lang.String firstElement, VaList args) {
        try {
            var RESULT = (MemoryAddress) g_build_filename_valist.invokeExact(Interop.allocateNativeString(firstElement).handle(), args);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_build_filenamev = Interop.downcallHandle(
        "g_build_filenamev",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Behaves exactly like g_build_filename(), but takes the path elements
     * as a string array, instead of varargs. This function is mainly
     * meant for language bindings.
     */
    public static java.lang.String buildFilenamev(java.lang.String[] args) {
        try {
            var RESULT = (MemoryAddress) g_build_filenamev.invokeExact(Interop.allocateNativeArray(args).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_build_pathv = Interop.downcallHandle(
        "g_build_pathv",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Behaves exactly like g_build_path(), but takes the path elements
     * as a string array, instead of varargs. This function is mainly
     * meant for language bindings.
     */
    public static java.lang.String buildPathv(java.lang.String separator, java.lang.String[] args) {
        try {
            var RESULT = (MemoryAddress) g_build_pathv.invokeExact(Interop.allocateNativeString(separator).handle(), Interop.allocateNativeArray(args).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_free = Interop.downcallHandle(
        "g_byte_array_free",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Frees the memory allocated by the {@link ByteArray}. If {@code free_segment} is
     * {@code true} it frees the actual byte data. If the reference count of
     * {@code array} is greater than one, the {@link ByteArray} wrapper is preserved but
     * the size of {@code array} will be set to zero.
     */
    public static PointerByte byteArrayFree(byte[] array, boolean freeSegment) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_free.invokeExact(Interop.allocateNativeArray(array).handle(), freeSegment ? 1 : 0);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_free_to_bytes = Interop.downcallHandle(
        "g_byte_array_free_to_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transfers the data from the {@link ByteArray} into a new immutable {@link Bytes}.
     * <p>
     * The {@link ByteArray} is freed unless the reference count of {@code array} is greater
     * than one, the {@link ByteArray} wrapper is preserved but the size of {@code array}
     * will be set to zero.
     * <p>
     * This is identical to using g_bytes_new_take() and g_byte_array_free()
     * together.
     */
    public static Bytes byteArrayFreeToBytes(byte[] array) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_free_to_bytes.invokeExact(Interop.allocateNativeArray(array).handle());
            return new Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_new = Interop.downcallHandle(
        "g_byte_array_new",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Creates a new {@link ByteArray} with a reference count of 1.
     */
    public static PointerByte byteArrayNew() {
        try {
            var RESULT = (MemoryAddress) g_byte_array_new.invokeExact();
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_new_take = Interop.downcallHandle(
        "g_byte_array_new_take",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Create byte array containing the data. The data will be owned by the array
     * and will be freed with g_free(), i.e. it could be allocated using g_strdup().
     * <p>
     * Do not use it if {@code len} is greater than {@code G_MAXUINT}. {@link ByteArray}
     * stores the length of its data in {@code guint}, which may be shorter than
     * {@code gsize}.
     */
    public static PointerByte byteArrayNewTake(byte[] data, long len) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_new_take.invokeExact(Interop.allocateNativeArray(data).handle(), len);
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_steal = Interop.downcallHandle(
        "g_byte_array_steal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the data in the array and resets the size to zero, while
     * the underlying array is preserved for use elsewhere and returned
     * to the caller.
     */
    public static PointerByte byteArraySteal(byte[] array, PointerLong len) {
        try {
            var RESULT = (MemoryAddress) g_byte_array_steal.invokeExact(Interop.allocateNativeArray(array).handle(), len.handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_byte_array_unref = Interop.downcallHandle(
        "g_byte_array_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically decrements the reference count of {@code array} by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static void byteArrayUnref(byte[] array) {
        try {
            g_byte_array_unref.invokeExact(Interop.allocateNativeArray(array).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_canonicalize_filename = Interop.downcallHandle(
        "g_canonicalize_filename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the canonical file name from {@code filename}. All triple slashes are turned into
     * single slashes, and all {@code ..} and {@code .}s resolved against {@code relative_to}.
     * <p>
     * Symlinks are not followed, and the returned path is guaranteed to be absolute.
     * <p>
     * If {@code filename} is an absolute path, {@code relative_to} is ignored. Otherwise,
     * {@code relative_to} will be prepended to {@code filename} to make it absolute. {@code relative_to}
     * must be an absolute path, or {@code null}. If {@code relative_to} is {@code null}, it'll fallback
     * to g_get_current_dir().
     * <p>
     * This function never fails, and will canonicalize file paths even if they don't
     * exist.
     * <p>
     * No file system I/O is done.
     */
    public static java.lang.String canonicalizeFilename(java.lang.String filename, java.lang.String relativeTo) {
        try {
            var RESULT = (MemoryAddress) g_canonicalize_filename.invokeExact(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(relativeTo).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_chdir = Interop.downcallHandle(
        "g_chdir",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A wrapper for the POSIX chdir() function. The function changes the
     * current directory of the process to {@code path}.
     * <p>
     * See your C library manual for more details about chdir().
     */
    public static int chdir(java.lang.String path) {
        try {
            var RESULT = (int) g_chdir.invokeExact(Interop.allocateNativeString(path).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle glib_check_version = Interop.downcallHandle(
        "glib_check_version",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks that the GLib library in use is compatible with the
     * given version.
     * <p>
     * Generally you would pass in the constants {@code GLIB_MAJOR_VERSION},
     * {@code GLIB_MINOR_VERSION}, {@code GLIB_MICRO_VERSION} as the three arguments
     * to this function; that produces a check that the library in use
     * is compatible with the version of GLib the application or module
     * was compiled against.
     * <p>
     * Compatibility is defined by two things: first the version
     * of the running library is newer than the version
     * {@code @required_major.required_minor.@required_micro}. Second
     * the running library must be binary compatible with the
     * version {@code @required_major.@required_minor.@required_micro}
     * (same major version.)
     */
    public static java.lang.String checkVersion(int requiredMajor, int requiredMinor, int requiredMicro) {
        try {
            var RESULT = (MemoryAddress) glib_check_version.invokeExact(requiredMajor, requiredMinor, requiredMicro);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_checksum_type_get_length = Interop.downcallHandle(
        "g_checksum_type_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the length in bytes of digests of type {@code checksum_type}
     */
    public static long checksumTypeGetLength(ChecksumType checksumType) {
        try {
            var RESULT = (long) g_checksum_type_get_length.invokeExact(checksumType.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_child_watch_add = Interop.downcallHandle(
        "g_child_watch_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a function to be called when the child indicated by {@code pid}
     * exits, at a default priority, {@code G_PRIORITY_DEFAULT}.
     * <p>
     * If you obtain {@code pid} from g_spawn_async() or g_spawn_async_with_pipes()
     * you will need to pass {@link SpawnFlags#DO_NOT_REAP_CHILD} as flag to
     * the spawn function for the child watching to work.
     * <p>
     * Note that on platforms where {@link Pid} must be explicitly closed
     * (see g_spawn_close_pid()) {@code pid} must not be closed while the
     * source is still active. Typically, you will want to call
     * g_spawn_close_pid() in the callback function for the source.
     * <p>
     * GLib supports only a single callback per process id.
     * On POSIX platforms, the same restrictions mentioned for
     * g_child_watch_source_new() apply to this function.
     * <p>
     * This internally creates a main loop source using
     * g_child_watch_source_new() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you
     * need greater control.
     */
    public static int childWatchAdd(Pid pid, ChildWatchFunc function) {
        try {
            var RESULT = (int) g_child_watch_add.invokeExact(pid.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbChildWatchFunc",
                            MethodType.methodType(void.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_child_watch_add_full = Interop.downcallHandle(
        "g_child_watch_add_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a function to be called when the child indicated by {@code pid}
     * exits, at the priority {@code priority}.
     * <p>
     * If you obtain {@code pid} from g_spawn_async() or g_spawn_async_with_pipes()
     * you will need to pass {@link SpawnFlags#DO_NOT_REAP_CHILD} as flag to
     * the spawn function for the child watching to work.
     * <p>
     * In many programs, you will want to call g_spawn_check_wait_status()
     * in the callback to determine whether or not the child exited
     * successfully.
     * <p>
     * Also, note that on platforms where {@link Pid} must be explicitly closed
     * (see g_spawn_close_pid()) {@code pid} must not be closed while the source
     * is still active.  Typically, you should invoke g_spawn_close_pid()
     * in the callback function for the source.
     * <p>
     * GLib supports only a single callback per process id.
     * On POSIX platforms, the same restrictions mentioned for
     * g_child_watch_source_new() apply to this function.
     * <p>
     * This internally creates a main loop source using
     * g_child_watch_source_new() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you
     * need greater control.
     */
    public static int childWatchAddFull(int priority, Pid pid, ChildWatchFunc function) {
        try {
            var RESULT = (int) g_child_watch_add_full.invokeExact(priority, pid.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbChildWatchFunc",
                            MethodType.methodType(void.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_child_watch_source_new = Interop.downcallHandle(
        "g_child_watch_source_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new child_watch source.
     * <p>
     * The source will not initially be associated with any {@link MainContext}
     * and must be added to one with g_source_attach() before it will be
     * executed.
     * <p>
     * Note that child watch sources can only be used in conjunction with
     * {@code g_spawn...} when the {@link SpawnFlags#DO_NOT_REAP_CHILD} flag is used.
     * <p>
     * Note that on platforms where {@link Pid} must be explicitly closed
     * (see g_spawn_close_pid()) {@code pid} must not be closed while the
     * source is still active. Typically, you will want to call
     * g_spawn_close_pid() in the callback function for the source.
     * <p>
     * On POSIX platforms, the following restrictions apply to this API
     * due to limitations in POSIX process interfaces:
     * <p>
     * * {@code pid} must be a child of this process
     * * {@code pid} must be positive
     * * the application must not call {@code waitpid} with a non-positive
     *   first argument, for instance in another thread
     * * the application must not wait for {@code pid} to exit by any other
     *   mechanism, including {@code waitpid(pid, ...)} or a second child-watch
     *   source for the same {@code pid}
     * * the application must not ignore {@code SIGCHLD}
     * <p>
     * If any of those conditions are not met, this and related APIs will
     * not work correctly. This can often be diagnosed via a GLib warning
     * stating that {@code ECHILD} was received by {@code waitpid}.
     * <p>
     * Calling {@code waitpid} for specific processes other than {@code pid} remains a
     * valid thing to do.
     */
    public static Source childWatchSourceNew(Pid pid) {
        try {
            var RESULT = (MemoryAddress) g_child_watch_source_new.invokeExact(pid.getValue());
            return new Source(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_close = Interop.downcallHandle(
        "g_close",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * This wraps the close() call; in case of error, {@code errno} will be
     * preserved, but the error will also be stored as a {@link Error} in {@code error}.
     * <p>
     * Besides using {@link Error}, there is another major reason to prefer this
     * function over the call provided by the system; on Unix, it will
     * attempt to correctly handle {@code EINTR}, which has platform-specific
     * semantics.
     */
    public static boolean close(int fd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_close.invokeExact(fd, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_compute_checksum_for_bytes = Interop.downcallHandle(
        "g_compute_checksum_for_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the checksum for a binary {@code data}. This is a
     * convenience wrapper for g_checksum_new(), g_checksum_get_string()
     * and g_checksum_free().
     * <p>
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeChecksumForBytes(ChecksumType checksumType, Bytes data) {
        try {
            var RESULT = (MemoryAddress) g_compute_checksum_for_bytes.invokeExact(checksumType.getValue(), data.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_compute_checksum_for_data = Interop.downcallHandle(
        "g_compute_checksum_for_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Computes the checksum for a binary {@code data} of {@code length}. This is a
     * convenience wrapper for g_checksum_new(), g_checksum_get_string()
     * and g_checksum_free().
     * <p>
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeChecksumForData(ChecksumType checksumType, byte[] data, long length) {
        try {
            var RESULT = (MemoryAddress) g_compute_checksum_for_data.invokeExact(checksumType.getValue(), Interop.allocateNativeArray(data).handle(), length);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_compute_checksum_for_string = Interop.downcallHandle(
        "g_compute_checksum_for_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Computes the checksum of a string.
     * <p>
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeChecksumForString(ChecksumType checksumType, java.lang.String str, long length) {
        try {
            var RESULT = (MemoryAddress) g_compute_checksum_for_string.invokeExact(checksumType.getValue(), Interop.allocateNativeString(str).handle(), length);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_compute_hmac_for_bytes = Interop.downcallHandle(
        "g_compute_hmac_for_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the HMAC for a binary {@code data}. This is a
     * convenience wrapper for g_hmac_new(), g_hmac_get_string()
     * and g_hmac_unref().
     * <p>
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeHmacForBytes(ChecksumType digestType, Bytes key, Bytes data) {
        try {
            var RESULT = (MemoryAddress) g_compute_hmac_for_bytes.invokeExact(digestType.getValue(), key.handle(), data.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_compute_hmac_for_data = Interop.downcallHandle(
        "g_compute_hmac_for_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Computes the HMAC for a binary {@code data} of {@code length}. This is a
     * convenience wrapper for g_hmac_new(), g_hmac_get_string()
     * and g_hmac_unref().
     * <p>
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeHmacForData(ChecksumType digestType, byte[] key, long keyLen, byte[] data, long length) {
        try {
            var RESULT = (MemoryAddress) g_compute_hmac_for_data.invokeExact(digestType.getValue(), Interop.allocateNativeArray(key).handle(), keyLen, Interop.allocateNativeArray(data).handle(), length);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_compute_hmac_for_string = Interop.downcallHandle(
        "g_compute_hmac_for_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Computes the HMAC for a string.
     * <p>
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeHmacForString(ChecksumType digestType, byte[] key, long keyLen, java.lang.String str, long length) {
        try {
            var RESULT = (MemoryAddress) g_compute_hmac_for_string.invokeExact(digestType.getValue(), Interop.allocateNativeArray(key).handle(), keyLen, Interop.allocateNativeString(str).handle(), length);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_convert = Interop.downcallHandle(
        "g_convert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string from one character set to another.
     * <p>
     * Note that you should use g_iconv() for streaming conversions.
     * Despite the fact that {@code bytes_read} can return information about partial
     * characters, the g_convert_... functions are not generally suitable
     * for streaming. If the underlying converter maintains internal state,
     * then this won't be preserved across successive calls to g_convert(),
     * g_convert_with_iconv() or g_convert_with_fallback(). (An example of
     * this is the GNU C converter for CP1255 which does not emit a base
     * character until it knows that the next character is not a mark that
     * could combine with the base character.)
     * <p>
     * Using extensions such as "//TRANSLIT" may not work (or may not work
     * well) on many platforms.  Consider using g_str_to_ascii() instead.
     */
    public static PointerByte convert(byte[] str, long len, java.lang.String toCodeset, java.lang.String fromCodeset, PointerLong bytesRead, PointerLong bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_convert.invokeExact(Interop.allocateNativeArray(str).handle(), len, Interop.allocateNativeString(toCodeset).handle(), Interop.allocateNativeString(fromCodeset).handle(), bytesRead.handle(), bytesWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_convert_error_quark = Interop.downcallHandle(
        "g_convert_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark convertErrorQuark() {
        try {
            var RESULT = (int) g_convert_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_convert_with_fallback = Interop.downcallHandle(
        "g_convert_with_fallback",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string from one character set to another, possibly
     * including fallback sequences for characters not representable
     * in the output. Note that it is not guaranteed that the specification
     * for the fallback sequences in {@code fallback} will be honored. Some
     * systems may do an approximate conversion from {@code from_codeset}
     * to {@code to_codeset} in their iconv() functions,
     * in which case GLib will simply return that approximate conversion.
     * <p>
     * Note that you should use g_iconv() for streaming conversions.
     * Despite the fact that {@code bytes_read} can return information about partial
     * characters, the g_convert_... functions are not generally suitable
     * for streaming. If the underlying converter maintains internal state,
     * then this won't be preserved across successive calls to g_convert(),
     * g_convert_with_iconv() or g_convert_with_fallback(). (An example of
     * this is the GNU C converter for CP1255 which does not emit a base
     * character until it knows that the next character is not a mark that
     * could combine with the base character.)
     */
    public static PointerByte convertWithFallback(byte[] str, long len, java.lang.String toCodeset, java.lang.String fromCodeset, java.lang.String fallback, PointerLong bytesRead, PointerLong bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_convert_with_fallback.invokeExact(Interop.allocateNativeArray(str).handle(), len, Interop.allocateNativeString(toCodeset).handle(), Interop.allocateNativeString(fromCodeset).handle(), Interop.allocateNativeString(fallback).handle(), bytesRead.handle(), bytesWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_convert_with_iconv = Interop.downcallHandle(
        "g_convert_with_iconv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string from one character set to another.
     * <p>
     * Note that you should use g_iconv() for streaming conversions.
     * Despite the fact that {@code bytes_read} can return information about partial
     * characters, the g_convert_... functions are not generally suitable
     * for streaming. If the underlying converter maintains internal state,
     * then this won't be preserved across successive calls to g_convert(),
     * g_convert_with_iconv() or g_convert_with_fallback(). (An example of
     * this is the GNU C converter for CP1255 which does not emit a base
     * character until it knows that the next character is not a mark that
     * could combine with the base character.)
     * <p>
     * Characters which are valid in the input character set, but which have no
     * representation in the output character set will result in a
     * {@link ConvertError#ILLEGAL_SEQUENCE} error. This is in contrast to the iconv()
     * specification, which leaves this behaviour implementation defined. Note that
     * this is the same error code as is returned for an invalid byte sequence in
     * the input character set. To get defined behaviour for conversion of
     * unrepresentable characters, use g_convert_with_fallback().
     */
    public static PointerByte convertWithIconv(byte[] str, long len, IConv converter, PointerLong bytesRead, PointerLong bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_convert_with_iconv.invokeExact(Interop.allocateNativeArray(str).handle(), len, converter.handle(), bytesRead.handle(), bytesWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_clear = Interop.downcallHandle(
        "g_datalist_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees all the data elements of the datalist.
     * The data elements' destroy functions are called
     * if they have been set.
     */
    public static void datalistClear(Data[] datalist) {
        try {
            g_datalist_clear.invokeExact(Interop.allocateNativeArray(datalist).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_foreach = Interop.downcallHandle(
        "g_datalist_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the given function for each data element of the datalist. The
     * function is called with each data element's {@link Quark} id and data,
     * together with the given {@code user_data} parameter. Note that this
     * function is NOT thread-safe. So unless {@code datalist} can be protected
     * from any modifications during invocation of this function, it should
     * not be called.
     * <p>
     * {@code func} can make changes to {@code datalist}, but the iteration will not
     * reflect changes made during the g_datalist_foreach() call, other
     * than skipping over elements that are removed.
     */
    public static void datalistForeach(Data[] datalist, DataForeachFunc func) {
        try {
            g_datalist_foreach.invokeExact(Interop.allocateNativeArray(datalist).handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbDataForeachFunc",
                            MethodType.methodType(void.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_get_data = Interop.downcallHandle(
        "g_datalist_get_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a data element, using its string identifier. This is slower than
     * g_datalist_id_get_data() because it compares strings.
     */
    public static java.lang.foreign.MemoryAddress datalistGetData(Data[] datalist, java.lang.String key) {
        try {
            var RESULT = (MemoryAddress) g_datalist_get_data.invokeExact(Interop.allocateNativeArray(datalist).handle(), Interop.allocateNativeString(key).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_get_flags = Interop.downcallHandle(
        "g_datalist_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets flags values packed in together with the datalist.
     * See g_datalist_set_flags().
     */
    public static int datalistGetFlags(Data[] datalist) {
        try {
            var RESULT = (int) g_datalist_get_flags.invokeExact(Interop.allocateNativeArray(datalist).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_id_dup_data = Interop.downcallHandle(
        "g_datalist_id_dup_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is a variant of g_datalist_id_get_data() which
     * returns a 'duplicate' of the value. {@code dup_func} defines the
     * meaning of 'duplicate' in this context, it could e.g.
     * take a reference on a ref-counted object.
     * <p>
     * If the {@code key_id} is not set in the datalist then {@code dup_func}
     * will be called with a {@code null} argument.
     * <p>
     * Note that {@code dup_func} is called while the datalist is locked, so it
     * is not allowed to read or modify the datalist.
     * <p>
     * This function can be useful to avoid races when multiple
     * threads are using the same datalist and the same key.
     */
    public static java.lang.foreign.MemoryAddress datalistIdDupData(Data[] datalist, Quark keyId, DuplicateFunc dupFunc) {
        try {
            var RESULT = (MemoryAddress) g_datalist_id_dup_data.invokeExact(Interop.allocateNativeArray(datalist).handle(), keyId.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbDuplicateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(dupFunc.hashCode(), dupFunc)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_id_get_data = Interop.downcallHandle(
        "g_datalist_id_get_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the data element corresponding to {@code key_id}.
     */
    public static java.lang.foreign.MemoryAddress datalistIdGetData(Data[] datalist, Quark keyId) {
        try {
            var RESULT = (MemoryAddress) g_datalist_id_get_data.invokeExact(Interop.allocateNativeArray(datalist).handle(), keyId.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_id_remove_no_notify = Interop.downcallHandle(
        "g_datalist_id_remove_no_notify",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes an element, without calling its destroy notification
     * function.
     */
    public static java.lang.foreign.MemoryAddress datalistIdRemoveNoNotify(Data[] datalist, Quark keyId) {
        try {
            var RESULT = (MemoryAddress) g_datalist_id_remove_no_notify.invokeExact(Interop.allocateNativeArray(datalist).handle(), keyId.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_id_set_data_full = Interop.downcallHandle(
        "g_datalist_id_set_data_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the data corresponding to the given {@link Quark} id, and the
     * function to be called when the element is removed from the datalist.
     * Any previous data with the same key is removed, and its destroy
     * function is called.
     */
    public static void datalistIdSetDataFull(Data[] datalist, Quark keyId, java.lang.foreign.MemoryAddress data, DestroyNotify destroyFunc) {
        try {
            g_datalist_id_set_data_full.invokeExact(Interop.allocateNativeArray(datalist).handle(), keyId.getValue(), data, 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_init = Interop.downcallHandle(
        "g_datalist_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets the datalist to {@code null}. It does not free any memory or call
     * any destroy functions.
     */
    public static void datalistInit(Data[] datalist) {
        try {
            g_datalist_init.invokeExact(Interop.allocateNativeArray(datalist).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_set_flags = Interop.downcallHandle(
        "g_datalist_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Turns on flag values for a data list. This function is used
     * to keep a small number of boolean flags in an object with
     * a data list without using any additional space. It is
     * not generally useful except in circumstances where space
     * is very tight. (It is used in the base {@link org.gtk.gobject.Object} type, for
     * example.)
     */
    public static void datalistSetFlags(Data[] datalist, int flags) {
        try {
            g_datalist_set_flags.invokeExact(Interop.allocateNativeArray(datalist).handle(), flags);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_datalist_unset_flags = Interop.downcallHandle(
        "g_datalist_unset_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Turns off flag values for a data list. See g_datalist_unset_flags()
     */
    public static void datalistUnsetFlags(Data[] datalist, int flags) {
        try {
            g_datalist_unset_flags.invokeExact(Interop.allocateNativeArray(datalist).handle(), flags);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dataset_destroy = Interop.downcallHandle(
        "g_dataset_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroys the dataset, freeing all memory allocated, and calling any
     * destroy functions set for data elements.
     */
    public static void datasetDestroy(java.lang.foreign.MemoryAddress datasetLocation) {
        try {
            g_dataset_destroy.invokeExact(datasetLocation);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dataset_foreach = Interop.downcallHandle(
        "g_dataset_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the given function for each data element which is associated
     * with the given location. Note that this function is NOT thread-safe.
     * So unless {@code dataset_location} can be protected from any modifications
     * during invocation of this function, it should not be called.
     * <p>
     * {@code func} can make changes to the dataset, but the iteration will not
     * reflect changes made during the g_dataset_foreach() call, other
     * than skipping over elements that are removed.
     */
    public static void datasetForeach(java.lang.foreign.MemoryAddress datasetLocation, DataForeachFunc func) {
        try {
            g_dataset_foreach.invokeExact(datasetLocation, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbDataForeachFunc",
                            MethodType.methodType(void.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dataset_id_get_data = Interop.downcallHandle(
        "g_dataset_id_get_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the data element corresponding to a {@link Quark}.
     */
    public static java.lang.foreign.MemoryAddress datasetIdGetData(java.lang.foreign.MemoryAddress datasetLocation, Quark keyId) {
        try {
            var RESULT = (MemoryAddress) g_dataset_id_get_data.invokeExact(datasetLocation, keyId.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dataset_id_remove_no_notify = Interop.downcallHandle(
        "g_dataset_id_remove_no_notify",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes an element, without calling its destroy notification
     * function.
     */
    public static java.lang.foreign.MemoryAddress datasetIdRemoveNoNotify(java.lang.foreign.MemoryAddress datasetLocation, Quark keyId) {
        try {
            var RESULT = (MemoryAddress) g_dataset_id_remove_no_notify.invokeExact(datasetLocation, keyId.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dataset_id_set_data_full = Interop.downcallHandle(
        "g_dataset_id_set_data_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the data element associated with the given {@link Quark} id, and also
     * the function to call when the data element is destroyed. Any
     * previous data with the same key is removed, and its destroy function
     * is called.
     */
    public static void datasetIdSetDataFull(java.lang.foreign.MemoryAddress datasetLocation, Quark keyId, java.lang.foreign.MemoryAddress data, DestroyNotify destroyFunc) {
        try {
            g_dataset_id_set_data_full.invokeExact(datasetLocation, keyId.getValue(), data, 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_days_in_month = Interop.downcallHandle(
        "g_date_get_days_in_month",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns the number of days in a month, taking leap
     * years into account.
     */
    public static byte dateGetDaysInMonth(DateMonth month, DateYear year) {
        try {
            var RESULT = (byte) g_date_get_days_in_month.invokeExact(month.getValue(), year.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_monday_weeks_in_year = Interop.downcallHandle(
        "g_date_get_monday_weeks_in_year",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns the number of weeks in the year, where weeks
     * are taken to start on Monday. Will be 52 or 53. The
     * date must be valid. (Years always have 52 7-day periods,
     * plus 1 or 2 extra days depending on whether it's a leap
     * year. This function is basically telling you how many
     * Mondays are in the year, i.e. there are 53 Mondays if
     * one of the extra days happens to be a Monday.)
     */
    public static byte dateGetMondayWeeksInYear(DateYear year) {
        try {
            var RESULT = (byte) g_date_get_monday_weeks_in_year.invokeExact(year.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_sunday_weeks_in_year = Interop.downcallHandle(
        "g_date_get_sunday_weeks_in_year",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns the number of weeks in the year, where weeks
     * are taken to start on Sunday. Will be 52 or 53. The
     * date must be valid. (Years always have 52 7-day periods,
     * plus 1 or 2 extra days depending on whether it's a leap
     * year. This function is basically telling you how many
     * Sundays are in the year, i.e. there are 53 Sundays if
     * one of the extra days happens to be a Sunday.)
     */
    public static byte dateGetSundayWeeksInYear(DateYear year) {
        try {
            var RESULT = (byte) g_date_get_sunday_weeks_in_year.invokeExact(year.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_is_leap_year = Interop.downcallHandle(
        "g_date_is_leap_year",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns {@code true} if the year is a leap year.
     * <p>
     * For the purposes of this function, leap year is every year
     * divisible by 4 unless that year is divisible by 100. If it
     * is divisible by 100 it would be a leap year only if that year
     * is also divisible by 400.
     */
    public static boolean dateIsLeapYear(DateYear year) {
        try {
            var RESULT = (int) g_date_is_leap_year.invokeExact(year.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_strftime = Interop.downcallHandle(
        "g_date_strftime",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Generates a printed representation of the date, in a
     * [locale][setlocale]-specific way.
     * Works just like the platform's C library strftime() function,
     * but only accepts date-related formats; time-related formats
     * give undefined results. Date must be valid. Unlike strftime()
     * (which uses the locale encoding), works on a UTF-8 format
     * string and stores a UTF-8 result.
     * <p>
     * This function does not provide any conversion specifiers in
     * addition to those implemented by the platform's C library.
     * For example, don't expect that using g_date_strftime() would
     * make the \\{@code F} provided by the C99 strftime() work on Windows
     * where the C library only complies to C89.
     */
    public static long dateStrftime(java.lang.String s, long slen, java.lang.String format, Date date) {
        try {
            var RESULT = (long) g_date_strftime.invokeExact(Interop.allocateNativeString(s).handle(), slen, Interop.allocateNativeString(format).handle(), date.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_day = Interop.downcallHandle(
        "g_date_valid_day",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Returns {@code true} if the day of the month is valid (a day is valid if it's
     * between 1 and 31 inclusive).
     */
    public static boolean dateValidDay(DateDay day) {
        try {
            var RESULT = (int) g_date_valid_day.invokeExact(day.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_dmy = Interop.downcallHandle(
        "g_date_valid_dmy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns {@code true} if the day-month-year triplet forms a valid, existing day
     * in the range of days {@link Date} understands (Year 1 or later, no more than
     * a few thousand years in the future).
     */
    public static boolean dateValidDmy(DateDay day, DateMonth month, DateYear year) {
        try {
            var RESULT = (int) g_date_valid_dmy.invokeExact(day.getValue(), month.getValue(), year.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_julian = Interop.downcallHandle(
        "g_date_valid_julian",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} if the Julian day is valid. Anything greater than zero
     * is basically a valid Julian, though there is a 32-bit limit.
     */
    public static boolean dateValidJulian(int julianDate) {
        try {
            var RESULT = (int) g_date_valid_julian.invokeExact(julianDate);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_month = Interop.downcallHandle(
        "g_date_valid_month",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} if the month value is valid. The 12 {@link DateMonth}
     * enumeration values are the only valid months.
     */
    public static boolean dateValidMonth(DateMonth month) {
        try {
            var RESULT = (int) g_date_valid_month.invokeExact(month.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_weekday = Interop.downcallHandle(
        "g_date_valid_weekday",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} if the weekday is valid. The seven {@link DateWeekday} enumeration
     * values are the only valid weekdays.
     */
    public static boolean dateValidWeekday(DateWeekday weekday) {
        try {
            var RESULT = (int) g_date_valid_weekday.invokeExact(weekday.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_year = Interop.downcallHandle(
        "g_date_valid_year",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns {@code true} if the year is valid. Any year greater than 0 is valid,
     * though there is a 16-bit limit to what {@link Date} will understand.
     */
    public static boolean dateValidYear(DateYear year) {
        try {
            var RESULT = (int) g_date_valid_year.invokeExact(year.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dcgettext = Interop.downcallHandle(
        "g_dcgettext",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This is a variant of g_dgettext() that allows specifying a locale
     * category instead of always using {@code LC_MESSAGES}. See g_dgettext() for
     * more information about how this functions differs from calling
     * dcgettext() directly.
     */
    public static java.lang.String dcgettext(java.lang.String domain, java.lang.String msgid, int category) {
        try {
            var RESULT = (MemoryAddress) g_dcgettext.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(msgid).handle(), category);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dgettext = Interop.downcallHandle(
        "g_dgettext",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function is a wrapper of dgettext() which does not translate
     * the message if the default domain as set with textdomain() has no
     * translations for the current locale.
     * <p>
     * The advantage of using this function over dgettext() proper is that
     * libraries using this function (like GTK+) will not use translations
     * if the application using the library does not have translations for
     * the current locale.  This results in a consistent English-only
     * interface instead of one having partial translations.  For this
     * feature to work, the call to textdomain() and setlocale() should
     * precede any g_dgettext() invocations.  For GTK+, it means calling
     * textdomain() before gtk_init or its variants.
     * <p>
     * This function disables translations if and only if upon its first
     * call all the following conditions hold:
     * <p>
     * <ul>
     * <li>{@code domain} is not {@code null}
     * </ul>
     * <p>
     * <ul>
     * <li>textdomain() has been called to set a default text domain
     * </ul>
     * <p>
     * <ul>
     * <li>there is no translations available for the default text domain
     *   and the current locale
     * </ul>
     * <p>
     * <ul>
     * <li>current locale is not "C" or any English locales (those
     *   starting with "en_")
     * </ul>
     * <p>
     * Note that this behavior may not be desired for example if an application
     * has its untranslated messages in a language other than English. In those
     * cases the application should call textdomain() after initializing GTK+.
     * <p>
     * Applications should normally not use this function directly,
     * but use the _() macro for translations.
     */
    public static java.lang.String dgettext(java.lang.String domain, java.lang.String msgid) {
        try {
            var RESULT = (MemoryAddress) g_dgettext.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(msgid).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dir_make_tmp = Interop.downcallHandle(
        "g_dir_make_tmp",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a subdirectory in the preferred directory for temporary
     * files (as returned by g_get_tmp_dir()).
     * <p>
     * {@code tmpl} should be a string in the GLib file name encoding containing
     * a sequence of six 'X' characters, as the parameter to g_mkstemp().
     * However, unlike these functions, the template should only be a
     * basename, no directory components are allowed. If template is
     * {@code null}, a default template is used.
     * <p>
     * Note that in contrast to g_mkdtemp() (and mkdtemp()) {@code tmpl} is not
     * modified, and might thus be a read-only literal string.
     */
    public static java.lang.String dirMakeTmp(java.lang.String tmpl) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dir_make_tmp.invokeExact(Interop.allocateNativeString(tmpl).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_direct_equal = Interop.downcallHandle(
        "g_direct_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two {@code gpointer} arguments and returns {@code true} if they are equal.
     * It can be passed to g_hash_table_new() as the {@code key_equal_func}
     * parameter, when using opaque pointers compared by pointer value as
     * keys in a {@link HashTable}.
     * <p>
     * This equality function is also appropriate for keys that are integers
     * stored in pointers, such as {@code GINT_TO_POINTER (n)}.
     */
    public static boolean directEqual(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2) {
        try {
            var RESULT = (int) g_direct_equal.invokeExact(v1, v2);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_direct_hash = Interop.downcallHandle(
        "g_direct_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a gpointer to a hash value.
     * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
     * when using opaque pointers compared by pointer value as keys in a
     * {@link HashTable}.
     * <p>
     * This hash function is also appropriate for keys that are integers
     * stored in pointers, such as {@code GINT_TO_POINTER (n)}.
     */
    public static int directHash(java.lang.foreign.MemoryAddress v) {
        try {
            var RESULT = (int) g_direct_hash.invokeExact(v);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dngettext = Interop.downcallHandle(
        "g_dngettext",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is a wrapper of dngettext() which does not translate
     * the message if the default domain as set with textdomain() has no
     * translations for the current locale.
     * <p>
     * See g_dgettext() for details of how this differs from dngettext()
     * proper.
     */
    public static java.lang.String dngettext(java.lang.String domain, java.lang.String msgid, java.lang.String msgidPlural, long n) {
        try {
            var RESULT = (MemoryAddress) g_dngettext.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(msgid).handle(), Interop.allocateNativeString(msgidPlural).handle(), n);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_double_equal = Interop.downcallHandle(
        "g_double_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares the two {@code gdouble} values being pointed to and returns
     * {@code true} if they are equal.
     * It can be passed to g_hash_table_new() as the {@code key_equal_func}
     * parameter, when using non-{@code null} pointers to doubles as keys in a
     * {@link HashTable}.
     */
    public static boolean doubleEqual(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2) {
        try {
            var RESULT = (int) g_double_equal.invokeExact(v1, v2);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_double_hash = Interop.downcallHandle(
        "g_double_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a pointer to a {@code gdouble} to a hash value.
     * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
     * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
     * when using non-{@code null} pointers to doubles as keys in a {@link HashTable}.
     */
    public static int doubleHash(java.lang.foreign.MemoryAddress v) {
        try {
            var RESULT = (int) g_double_hash.invokeExact(v);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dpgettext = Interop.downcallHandle(
        "g_dpgettext",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is a variant of g_dgettext() which supports
     * a disambiguating message context. GNU gettext uses the
     * '\\004' character to separate the message context and
     * message id in {@code msgctxtid}.
     * If 0 is passed as {@code msgidoffset}, this function will fall back to
     * trying to use the deprecated convention of using "|" as a separation
     * character.
     * <p>
     * This uses g_dgettext() internally. See that functions for differences
     * with dgettext() proper.
     * <p>
     * Applications should normally not use this function directly,
     * but use the C_() macro for translations with context.
     */
    public static java.lang.String dpgettext(java.lang.String domain, java.lang.String msgctxtid, long msgidoffset) {
        try {
            var RESULT = (MemoryAddress) g_dpgettext.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(msgctxtid).handle(), msgidoffset);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dpgettext2 = Interop.downcallHandle(
        "g_dpgettext2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function is a variant of g_dgettext() which supports
     * a disambiguating message context. GNU gettext uses the
     * '\\004' character to separate the message context and
     * message id in {@code msgctxtid}.
     * <p>
     * This uses g_dgettext() internally. See that functions for differences
     * with dgettext() proper.
     * <p>
     * This function differs from C_() in that it is not a macro and
     * thus you may use non-string-literals as context and msgid arguments.
     */
    public static java.lang.String dpgettext2(java.lang.String domain, java.lang.String context, java.lang.String msgid) {
        try {
            var RESULT = (MemoryAddress) g_dpgettext2.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(context).handle(), Interop.allocateNativeString(msgid).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_environ_getenv = Interop.downcallHandle(
        "g_environ_getenv",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the environment variable {@code variable} in the
     * provided list {@code envp}.
     */
    public static java.lang.String environGetenv(java.lang.String[] envp, java.lang.String variable) {
        try {
            var RESULT = (MemoryAddress) g_environ_getenv.invokeExact(Interop.allocateNativeArray(envp).handle(), Interop.allocateNativeString(variable).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_environ_setenv = Interop.downcallHandle(
        "g_environ_setenv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the environment variable {@code variable} in the provided list
     * {@code envp} to {@code value}.
     */
    public static PointerString environSetenv(java.lang.String[] envp, java.lang.String variable, java.lang.String value, boolean overwrite) {
        try {
            var RESULT = (MemoryAddress) g_environ_setenv.invokeExact(Interop.allocateNativeArray(envp).handle(), Interop.allocateNativeString(variable).handle(), Interop.allocateNativeString(value).handle(), overwrite ? 1 : 0);
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_environ_unsetenv = Interop.downcallHandle(
        "g_environ_unsetenv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the environment variable {@code variable} from the provided
     * environment {@code envp}.
     */
    public static PointerString environUnsetenv(java.lang.String[] envp, java.lang.String variable) {
        try {
            var RESULT = (MemoryAddress) g_environ_unsetenv.invokeExact(Interop.allocateNativeArray(envp).handle(), Interop.allocateNativeString(variable).handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_error_from_errno = Interop.downcallHandle(
        "g_file_error_from_errno",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets a {@link FileError} constant based on the passed-in {@code err_no}.
     * <p>
     * For example, if you pass in {@code EEXIST} this function returns
     * {@link FileError#EXIST}. Unlike {@code errno} values, you can portably
     * assume that all {@link FileError} values will exist.
     * <p>
     * Normally a {@link FileError} value goes into a {@link Error} returned
     * from a function that manipulates files. So you would use
     * g_file_error_from_errno() when constructing a {@link Error}.
     */
    public static FileError fileErrorFromErrno(int errNo) {
        try {
            var RESULT = (int) g_file_error_from_errno.invokeExact(errNo);
            return new FileError(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_error_quark = Interop.downcallHandle(
        "g_file_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark fileErrorQuark() {
        try {
            var RESULT = (int) g_file_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_get_contents = Interop.downcallHandle(
        "g_file_get_contents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads an entire file into allocated memory, with good error
     * checking.
     * <p>
     * If the call was successful, it returns {@code true} and sets {@code contents} to the file
     * contents and {@code length} to the length of the file contents in bytes. The string
     * stored in {@code contents} will be nul-terminated, so for text files you can pass
     * {@code null} for the {@code length} argument. If the call was not successful, it returns
     * {@code false} and sets {@code error}. The error domain is {@code G_FILE_ERROR}. Possible error
     * codes are those in the {@link FileError} enumeration. In the error case,
     * {@code contents} is set to {@code null} and {@code length} is set to zero.
     */
    public static boolean fileGetContents(java.lang.String filename, PointerByte contents, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_get_contents.invokeExact(Interop.allocateNativeString(filename).handle(), contents.handle(), length.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_open_tmp = Interop.downcallHandle(
        "g_file_open_tmp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens a file for writing in the preferred directory for temporary
     * files (as returned by g_get_tmp_dir()).
     * <p>
     * {@code tmpl} should be a string in the GLib file name encoding containing
     * a sequence of six 'X' characters, as the parameter to g_mkstemp().
     * However, unlike these functions, the template should only be a
     * basename, no directory components are allowed. If template is
     * {@code null}, a default template is used.
     * <p>
     * Note that in contrast to g_mkstemp() (and mkstemp()) {@code tmpl} is not
     * modified, and might thus be a read-only literal string.
     * <p>
     * Upon success, and if {@code name_used} is non-{@code null}, the actual name used
     * is returned in {@code name_used}. This string should be freed with g_free()
     * when not needed any longer. The returned name is in the GLib file
     * name encoding.
     */
    public static int fileOpenTmp(java.lang.String tmpl, PointerString nameUsed) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_open_tmp.invokeExact(Interop.allocateNativeString(tmpl).handle(), nameUsed.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_read_link = Interop.downcallHandle(
        "g_file_read_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads the contents of the symbolic link {@code filename} like the POSIX
     * readlink() function.  The returned string is in the encoding used
     * for filenames. Use g_filename_to_utf8() to convert it to UTF-8.
     */
    public static java.lang.String fileReadLink(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_file_read_link.invokeExact(Interop.allocateNativeString(filename).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_contents = Interop.downcallHandle(
        "g_file_set_contents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Writes all of {@code contents} to a file named {@code filename}. This is a convenience
     * wrapper around calling g_file_set_contents_full() with {@code flags} set to
     * {@code G_FILE_SET_CONTENTS_CONSISTENT | G_FILE_SET_CONTENTS_ONLY_EXISTING} and
     * {@code mode} set to {@code 0666}.
     */
    public static boolean fileSetContents(java.lang.String filename, byte[] contents, long length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_contents.invokeExact(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeArray(contents).handle(), length, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_set_contents_full = Interop.downcallHandle(
        "g_file_set_contents_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Writes all of {@code contents} to a file named {@code filename}, with good error checking.
     * If a file called {@code filename} already exists it will be overwritten.
     * <p>
     * {@code flags} control the properties of the write operation: whether it’s atomic,
     * and what the tradeoff is between returning quickly or being resilient to
     * system crashes.
     * <p>
     * As this function performs file I/O, it is recommended to not call it anywhere
     * where blocking would cause problems, such as in the main loop of a graphical
     * application. In particular, if {@code flags} has any value other than
     * {@link FileSetContentsFlags#NONE} then this function may call {@code fsync()}.
     * <p>
     * If {@link FileSetContentsFlags#CONSISTENT} is set in {@code flags}, the operation is atomic
     * in the sense that it is first written to a temporary file which is then
     * renamed to the final name.
     * <p>
     * Notes:
     * <p>
     * <ul>
     * <li>On UNIX, if {@code filename} already exists hard links to {@code filename} will break.
     *   Also since the file is recreated, existing permissions, access control
     *   lists, metadata etc. may be lost. If {@code filename} is a symbolic link,
     *   the link itself will be replaced, not the linked file.
     * </ul>
     * <p>
     * <ul>
     * <li>On UNIX, if {@code filename} already exists and is non-empty, and if the system
     *   supports it (via a journalling filesystem or equivalent), and if
     *   {@link FileSetContentsFlags#CONSISTENT} is set in {@code flags}, the {@code fsync()} call (or
     *   equivalent) will be used to ensure atomic replacement: {@code filename}
     *   will contain either its old contents or {@code contents}, even in the face of
     *   system power loss, the disk being unsafely removed, etc.
     * </ul>
     * <p>
     * <ul>
     * <li>On UNIX, if {@code filename} does not already exist or is empty, there is a
     *   possibility that system power loss etc. after calling this function will
     *   leave {@code filename} empty or full of NUL bytes, depending on the underlying
     *   filesystem, unless {@link FileSetContentsFlags#DURABLE} and
     *   {@link FileSetContentsFlags#CONSISTENT} are set in {@code flags}.
     * </ul>
     * <p>
     * <ul>
     * <li>On Windows renaming a file will not remove an existing file with the
     *   new name, so on Windows there is a race condition between the existing
     *   file being removed and the temporary file being renamed.
     * </ul>
     * <p>
     * <ul>
     * <li>On Windows there is no way to remove a file that is open to some
     *   process, or mapped into memory. Thus, this function will fail if
     *   {@code filename} already exists and is open.
     * </ul>
     * <p>
     * If the call was successful, it returns {@code true}. If the call was not successful,
     * it returns {@code false} and sets {@code error}. The error domain is {@code G_FILE_ERROR}.
     * Possible error codes are those in the {@link FileError} enumeration.
     * <p>
     * Note that the name for the temporary file is constructed by appending up
     * to 7 characters to {@code filename}.
     * <p>
     * If the file didn’t exist before and is created, it will be given the
     * permissions from {@code mode}. Otherwise, the permissions of the existing file may
     * be changed to {@code mode} depending on {@code flags}, or they may remain unchanged.
     */
    public static boolean fileSetContentsFull(java.lang.String filename, byte[] contents, long length, FileSetContentsFlags flags, int mode) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_file_set_contents_full.invokeExact(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeArray(contents).handle(), length, flags.getValue(), mode, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_test = Interop.downcallHandle(
        "g_file_test",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} if any of the tests in the bitfield {@code test} are
     * {@code true}. For example, {@code (G_FILE_TEST_EXISTS | G_FILE_TEST_IS_DIR)}
     * will return {@code true} if the file exists; the check whether it's a
     * directory doesn't matter since the existence test is {@code true}. With
     * the current set of available tests, there's no point passing in
     * more than one test at a time.
     * <p>
     * Apart from {@link FileTest#IS_SYMLINK} all tests follow symbolic links,
     * so for a symbolic link to a regular file g_file_test() will return
     * {@code true} for both {@link FileTest#IS_SYMLINK} and {@link FileTest#IS_REGULAR}.
     * <p>
     * Note, that for a dangling symbolic link g_file_test() will return
     * {@code true} for {@link FileTest#IS_SYMLINK} and {@code false} for all other flags.
     * <p>
     * You should never use g_file_test() to test whether it is safe
     * to perform an operation, because there is always the possibility
     * of the condition changing before you actually perform the operation.
     * For example, you might think you could use {@link FileTest#IS_SYMLINK}
     * to know whether it is safe to write to a file without being
     * tricked into writing into a different location. It doesn't work!
     * <pre>{@code <!-- language="C" -->
     *  // DON'T DO THIS
     *  if (!g_file_test (filename, G_FILE_TEST_IS_SYMLINK))
     *    {
     *      fd = g_open (filename, O_WRONLY);
     *      // write to fd
     *    }
     * }</pre>
     * <p>
     * Another thing to note is that {@link FileTest#EXISTS} and
     * {@link FileTest#IS_EXECUTABLE} are implemented using the access()
     * system call. This usually doesn't matter, but if your program
     * is setuid or setgid it means that these tests will give you
     * the answer for the real user ID and group ID, rather than the
     * effective user ID and group ID.
     * <p>
     * On Windows, there are no symlinks, so testing for
     * {@link FileTest#IS_SYMLINK} will always return {@code false}. Testing for
     * {@link FileTest#IS_EXECUTABLE} will just check that the file exists and
     * its name indicates that it is executable, checking for well-known
     * extensions and those listed in the {@code PATHEXT} environment variable.
     */
    public static boolean fileTest(java.lang.String filename, FileTest test) {
        try {
            var RESULT = (int) g_file_test.invokeExact(Interop.allocateNativeString(filename).handle(), test.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_filename_display_basename = Interop.downcallHandle(
        "g_filename_display_basename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the display basename for the particular filename, guaranteed
     * to be valid UTF-8. The display name might not be identical to the filename,
     * for instance there might be problems converting it to UTF-8, and some files
     * can be translated in the display.
     * <p>
     * If GLib cannot make sense of the encoding of {@code filename}, as a last resort it
     * replaces unknown characters with U+FFFD, the Unicode replacement character.
     * You can search the result for the UTF-8 encoding of this character (which is
     * "\\357\\277\\275" in octal notation) to find out if {@code filename} was in an invalid
     * encoding.
     * <p>
     * You must pass the whole absolute pathname to this functions so that
     * translation of well known locations can be done.
     * <p>
     * This function is preferred over g_filename_display_name() if you know the
     * whole path, as it allows translation.
     */
    public static java.lang.String filenameDisplayBasename(java.lang.String filename) {
        try {
            var RESULT = (MemoryAddress) g_filename_display_basename.invokeExact(Interop.allocateNativeString(filename).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_filename_display_name = Interop.downcallHandle(
        "g_filename_display_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a filename into a valid UTF-8 string. The conversion is
     * not necessarily reversible, so you should keep the original around
     * and use the return value of this function only for display purposes.
     * Unlike g_filename_to_utf8(), the result is guaranteed to be non-{@code null}
     * even if the filename actually isn't in the GLib file name encoding.
     * <p>
     * If GLib cannot make sense of the encoding of {@code filename}, as a last resort it
     * replaces unknown characters with U+FFFD, the Unicode replacement character.
     * You can search the result for the UTF-8 encoding of this character (which is
     * "\\357\\277\\275" in octal notation) to find out if {@code filename} was in an invalid
     * encoding.
     * <p>
     * If you know the whole pathname of the file you should use
     * g_filename_display_basename(), since that allows location-based
     * translation of filenames.
     */
    public static java.lang.String filenameDisplayName(java.lang.String filename) {
        try {
            var RESULT = (MemoryAddress) g_filename_display_name.invokeExact(Interop.allocateNativeString(filename).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_filename_from_uri = Interop.downcallHandle(
        "g_filename_from_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an escaped ASCII-encoded URI to a local filename in the
     * encoding used for filenames.
     */
    public static java.lang.String filenameFromUri(java.lang.String uri, PointerString hostname) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_filename_from_uri.invokeExact(Interop.allocateNativeString(uri).handle(), hostname.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_filename_from_utf8 = Interop.downcallHandle(
        "g_filename_from_utf8",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string from UTF-8 to the encoding GLib uses for
     * filenames. Note that on Windows GLib uses UTF-8 for filenames;
     * on other platforms, this function indirectly depends on the
     * [current locale][setlocale].
     * <p>
     * The input string shall not contain nul characters even if the {@code len}
     * argument is positive. A nul character found inside the string will result
     * in error {@link ConvertError#ILLEGAL_SEQUENCE}. If the filename encoding is
     * not UTF-8 and the conversion output contains a nul character, the error
     * {@link ConvertError#EMBEDDED_NUL} is set and the function returns {@code null}.
     */
    public static java.lang.String filenameFromUtf8(java.lang.String utf8string, long len, PointerLong bytesRead, PointerLong bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_filename_from_utf8.invokeExact(Interop.allocateNativeString(utf8string).handle(), len, bytesRead.handle(), bytesWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_filename_to_uri = Interop.downcallHandle(
        "g_filename_to_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an absolute filename to an escaped ASCII-encoded URI, with the path
     * component following Section 3.3. of RFC 2396.
     */
    public static java.lang.String filenameToUri(java.lang.String filename, java.lang.String hostname) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_filename_to_uri.invokeExact(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(hostname).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_filename_to_utf8 = Interop.downcallHandle(
        "g_filename_to_utf8",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string which is in the encoding used by GLib for
     * filenames into a UTF-8 string. Note that on Windows GLib uses UTF-8
     * for filenames; on other platforms, this function indirectly depends on
     * the [current locale][setlocale].
     * <p>
     * The input string shall not contain nul characters even if the {@code len}
     * argument is positive. A nul character found inside the string will result
     * in error {@link ConvertError#ILLEGAL_SEQUENCE}.
     * If the source encoding is not UTF-8 and the conversion output contains a
     * nul character, the error {@link ConvertError#EMBEDDED_NUL} is set and the
     * function returns {@code null}. Use g_convert() to produce output that
     * may contain embedded nul characters.
     */
    public static java.lang.String filenameToUtf8(java.lang.String opsysstring, long len, PointerLong bytesRead, PointerLong bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_filename_to_utf8.invokeExact(Interop.allocateNativeString(opsysstring).handle(), len, bytesRead.handle(), bytesWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_find_program_in_path = Interop.downcallHandle(
        "g_find_program_in_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Locates the first executable named {@code program} in the user's path, in the
     * same way that execvp() would locate it. Returns an allocated string
     * with the absolute path name, or {@code null} if the program is not found in
     * the path. If {@code program} is already an absolute path, returns a copy of
     * {@code program} if {@code program} exists and is executable, and {@code null} otherwise.
     *  
     * On Windows, if {@code program} does not have a file type suffix, tries
     * with the suffixes .exe, .cmd, .bat and .com, and the suffixes in
     * the {@code PATHEXT} environment variable.
     * <p>
     * On Windows, it looks for the file in the same way as CreateProcess()
     * would. This means first in the directory where the executing
     * program was loaded from, then in the current directory, then in the
     * Windows 32-bit system directory, then in the Windows directory, and
     * finally in the directories in the {@code PATH} environment variable. If
     * the program is found, the return value contains the full name
     * including the type suffix.
     */
    public static java.lang.String findProgramInPath(java.lang.String program) {
        try {
            var RESULT = (MemoryAddress) g_find_program_in_path.invokeExact(Interop.allocateNativeString(program).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_format_size = Interop.downcallHandle(
        "g_format_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Formats a size (for example the size of a file) into a human readable
     * string.  Sizes are rounded to the nearest size prefix (kB, MB, GB)
     * and are displayed rounded to the nearest tenth. E.g. the file size
     * 3292528 bytes will be converted into the string "3.2 MB". The returned string
     * is UTF-8, and may use a non-breaking space to separate the number and units,
     * to ensure they aren’t separated when line wrapped.
     * <p>
     * The prefix units base is 1000 (i.e. 1 kB is 1000 bytes).
     * <p>
     * This string should be freed with g_free() when not needed any longer.
     * <p>
     * See g_format_size_full() for more options about how the size might be
     * formatted.
     */
    public static java.lang.String formatSize(long size) {
        try {
            var RESULT = (MemoryAddress) g_format_size.invokeExact(size);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_format_size_full = Interop.downcallHandle(
        "g_format_size_full",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Formats a size.
     * <p>
     * This function is similar to g_format_size() but allows for flags
     * that modify the output. See {@link FormatSizeFlags}.
     */
    public static java.lang.String formatSizeFull(long size, FormatSizeFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_format_size_full.invokeExact(size, flags.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_free = Interop.downcallHandle(
        "g_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the memory pointed to by {@code mem}.
     * <p>
     * If {@code mem} is {@code null} it simply returns, so there is no need to check {@code mem}
     * against {@code null} before calling this function.
     */
    public static void free(java.lang.foreign.MemoryAddress mem) {
        try {
            g_free.invokeExact(mem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_application_name = Interop.downcallHandle(
        "g_get_application_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a human-readable name for the application, as set by
     * g_set_application_name(). This name should be localized if
     * possible, and is intended for display to the user.  Contrast with
     * g_get_prgname(), which gets a non-localized name. If
     * g_set_application_name() has not been called, returns the result of
     * g_get_prgname() (which may be {@code null} if g_set_prgname() has also not
     * been called).
     */
    public static java.lang.String getApplicationName() {
        try {
            var RESULT = (MemoryAddress) g_get_application_name.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_charset = Interop.downcallHandle(
        "g_get_charset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the character set for the [current locale][setlocale]; you
     * might use this character set as an argument to g_convert(), to convert
     * from the current locale's encoding to some other encoding. (Frequently
     * g_locale_to_utf8() and g_locale_from_utf8() are nice shortcuts, though.)
     * <p>
     * On Windows the character set returned by this function is the
     * so-called system default ANSI code-page. That is the character set
     * used by the "narrow" versions of C library and Win32 functions that
     * handle file names. It might be different from the character set
     * used by the C library's current locale.
     * <p>
     * On Linux, the character set is found by consulting nl_langinfo() if
     * available. If not, the environment variables {@code LC_ALL}, {@code LC_CTYPE}, {@code LANG}
     * and {@code CHARSET} are queried in order.
     * <p>
     * The return value is {@code true} if the locale's encoding is UTF-8, in that
     * case you can perhaps avoid calling g_convert().
     * <p>
     * The string returned in {@code charset} is not allocated, and should not be
     * freed.
     */
    public static boolean getCharset(PointerString charset) {
        try {
            var RESULT = (int) g_get_charset.invokeExact(charset.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_codeset = Interop.downcallHandle(
        "g_get_codeset",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the character set for the current locale.
     */
    public static java.lang.String getCodeset() {
        try {
            var RESULT = (MemoryAddress) g_get_codeset.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_console_charset = Interop.downcallHandle(
        "g_get_console_charset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the character set used by the console attached to the process,
     * which is suitable for printing output to the terminal.
     * <p>
     * Usually this matches the result returned by g_get_charset(), but in
     * environments where the locale's character set does not match the encoding
     * of the console this function tries to guess a more suitable value instead.
     * <p>
     * On Windows the character set returned by this function is the
     * output code page used by the console associated with the calling process.
     * If the codepage can't be determined (for example because there is no
     * console attached) UTF-8 is assumed.
     * <p>
     * The return value is {@code true} if the locale's encoding is UTF-8, in that
     * case you can perhaps avoid calling g_convert().
     * <p>
     * The string returned in {@code charset} is not allocated, and should not be
     * freed.
     */
    public static boolean getConsoleCharset(PointerString charset) {
        try {
            var RESULT = (int) g_get_console_charset.invokeExact(charset.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_current_dir = Interop.downcallHandle(
        "g_get_current_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current directory.
     * <p>
     * The returned string should be freed when no longer needed.
     * The encoding of the returned string is system defined.
     * On Windows, it is always UTF-8.
     * <p>
     * Since GLib 2.40, this function will return the value of the "PWD"
     * environment variable if it is set and it happens to be the same as
     * the current directory.  This can make a difference in the case that
     * the current directory is the target of a symbolic link.
     */
    public static java.lang.String getCurrentDir() {
        try {
            var RESULT = (MemoryAddress) g_get_current_dir.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_environ = Interop.downcallHandle(
        "g_get_environ",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Gets the list of environment variables for the current process.
     * <p>
     * The list is {@code null} terminated and each item in the list is of the
     * form 'NAME=VALUE'.
     * <p>
     * This is equivalent to direct access to the 'environ' global variable,
     * except portable.
     * <p>
     * The return value is freshly allocated and it should be freed with
     * g_strfreev() when it is no longer needed.
     */
    public static PointerString getEnviron() {
        try {
            var RESULT = (MemoryAddress) g_get_environ.invokeExact();
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_filename_charsets = Interop.downcallHandle(
        "g_get_filename_charsets",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines the preferred character sets used for filenames.
     * The first character set from the {@code charsets} is the filename encoding, the
     * subsequent character sets are used when trying to generate a displayable
     * representation of a filename, see g_filename_display_name().
     * <p>
     * On Unix, the character sets are determined by consulting the
     * environment variables {@code G_FILENAME_ENCODING} and {@code G_BROKEN_FILENAMES}.
     * On Windows, the character set used in the GLib API is always UTF-8
     * and said environment variables have no effect.
     * <p>
     * {@code G_FILENAME_ENCODING} may be set to a comma-separated list of
     * character set names. The special token "\\{@code locale}" is taken
     * to  mean the character set for the [current locale][setlocale].
     * If {@code G_FILENAME_ENCODING} is not set, but {@code G_BROKEN_FILENAMES} is,
     * the character set of the current locale is taken as the filename
     * encoding. If neither environment variable  is set, UTF-8 is taken
     * as the filename encoding, but the character set of the current locale
     * is also put in the list of encodings.
     * <p>
     * The returned {@code charsets} belong to GLib and must not be freed.
     * <p>
     * Note that on Unix, regardless of the locale character set or
     * {@code G_FILENAME_ENCODING} value, the actual file names present
     * on a system might be in any random encoding or just gibberish.
     */
    public static boolean getFilenameCharsets(PointerString filenameCharsets) {
        try {
            var RESULT = (int) g_get_filename_charsets.invokeExact(filenameCharsets.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_home_dir = Interop.downcallHandle(
        "g_get_home_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current user's home directory.
     * <p>
     * As with most UNIX tools, this function will return the value of the
     * {@code HOME} environment variable if it is set to an existing absolute path
     * name, falling back to the {@code passwd} file in the case that it is unset.
     * <p>
     * If the path given in {@code HOME} is non-absolute, does not exist, or is
     * not a directory, the result is undefined.
     * <p>
     * Before version 2.36 this function would ignore the {@code HOME} environment
     * variable, taking the value from the {@code passwd} database instead. This was
     * changed to increase the compatibility of GLib with other programs (and
     * the XDG basedir specification) and to increase testability of programs
     * based on GLib (by making it easier to run them from test frameworks).
     * <p>
     * If your program has a strong requirement for either the new or the
     * old behaviour (and if you don't wish to increase your GLib
     * dependency to ensure that the new behaviour is in effect) then you
     * should either directly check the {@code HOME} environment variable yourself
     * or unset it before calling any functions in GLib.
     */
    public static java.lang.String getHomeDir() {
        try {
            var RESULT = (MemoryAddress) g_get_home_dir.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_host_name = Interop.downcallHandle(
        "g_get_host_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Return a name for the machine.
     * <p>
     * The returned name is not necessarily a fully-qualified domain name,
     * or even present in DNS or some other name service at all. It need
     * not even be unique on your local network or site, but usually it
     * is. Callers should not rely on the return value having any specific
     * properties like uniqueness for security purposes. Even if the name
     * of the machine is changed while an application is running, the
     * return value from this function does not change. The returned
     * string is owned by GLib and should not be modified or freed. If no
     * name can be determined, a default fixed string "localhost" is
     * returned.
     * <p>
     * The encoding of the returned string is UTF-8.
     */
    public static java.lang.String getHostName() {
        try {
            var RESULT = (MemoryAddress) g_get_host_name.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_language_names = Interop.downcallHandle(
        "g_get_language_names",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Computes a list of applicable locale names, which can be used to
     * e.g. construct locale-dependent filenames or search paths. The returned
     * list is sorted from most desirable to least desirable and always contains
     * the default locale "C".
     * <p>
     * For example, if LANGUAGE=de:en_US, then the returned list is
     * "de", "en_US", "en", "C".
     * <p>
     * This function consults the environment variables {@code LANGUAGE}, {@code LC_ALL},
     * {@code LC_MESSAGES} and {@code LANG} to find the list of locales specified by the
     * user.
     */
    public static PointerString getLanguageNames() {
        try {
            var RESULT = (MemoryAddress) g_get_language_names.invokeExact();
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_language_names_with_category = Interop.downcallHandle(
        "g_get_language_names_with_category",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Computes a list of applicable locale names with a locale category name,
     * which can be used to construct the fallback locale-dependent filenames
     * or search paths. The returned list is sorted from most desirable to
     * least desirable and always contains the default locale "C".
     * <p>
     * This function consults the environment variables {@code LANGUAGE}, {@code LC_ALL},
     * {@code category_name}, and {@code LANG} to find the list of locales specified by the
     * user.
     * <p>
     * g_get_language_names() returns g_get_language_names_with_category("LC_MESSAGES").
     */
    public static PointerString getLanguageNamesWithCategory(java.lang.String categoryName) {
        try {
            var RESULT = (MemoryAddress) g_get_language_names_with_category.invokeExact(Interop.allocateNativeString(categoryName).handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_locale_variants = Interop.downcallHandle(
        "g_get_locale_variants",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a list of derived variants of {@code locale}, which can be used to
     * e.g. construct locale-dependent filenames or search paths. The returned
     * list is sorted from most desirable to least desirable.
     * This function handles territory, charset and extra locale modifiers. See
     * <a href="man:setlocale">`setlocale(3)`</a> for information about locales and their format.
     * <p>
     * {@code locale} itself is guaranteed to be returned in the output.
     * <p>
     * For example, if {@code locale} is {@code fr_BE}, then the returned list
     * is {@code fr_BE}, {@code fr}. If {@code locale} is {@code en_GB.UTF-8@euro}, then the returned list
     * is {@code en_GB.UTF-8@euro}, {@code en_GB.UTF-8}, {@code en_GB@euro}, {@code en_GB}, {@code en.UTF-8@euro},
     * {@code en.UTF-8}, {@code en@euro}, {@code en}.
     * <p>
     * If you need the list of variants for the current locale,
     * use g_get_language_names().
     */
    public static PointerString getLocaleVariants(java.lang.String locale) {
        try {
            var RESULT = (MemoryAddress) g_get_locale_variants.invokeExact(Interop.allocateNativeString(locale).handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_monotonic_time = Interop.downcallHandle(
        "g_get_monotonic_time",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG)
    );
    
    /**
     * Queries the system monotonic time.
     * <p>
     * The monotonic clock will always increase and doesn't suffer
     * discontinuities when the user (or NTP) changes the system time.  It
     * may or may not continue to tick during times where the machine is
     * suspended.
     * <p>
     * We try to use the clock that corresponds as closely as possible to
     * the passage of time as measured by system calls such as poll() but it
     * may not always be possible to do this.
     */
    public static long getMonotonicTime() {
        try {
            var RESULT = (long) g_get_monotonic_time.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_num_processors = Interop.downcallHandle(
        "g_get_num_processors",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Determine the approximate number of threads that the system will
     * schedule simultaneously for this process.  This is intended to be
     * used as a parameter to g_thread_pool_new() for CPU bound tasks and
     * similar cases.
     */
    public static int getNumProcessors() {
        try {
            var RESULT = (int) g_get_num_processors.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_os_info = Interop.downcallHandle(
        "g_get_os_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get information about the operating system.
     * <p>
     * On Linux this comes from the {@code /etc/os-release} file. On other systems, it may
     * come from a variety of sources. You can either use the standard key names
     * like {@code G_OS_INFO_KEY_NAME} or pass any UTF-8 string key name. For example,
     * {@code /etc/os-release} provides a number of other less commonly used values that may
     * be useful. No key is guaranteed to be provided, so the caller should always
     * check if the result is {@code null}.
     */
    public static java.lang.String getOsInfo(java.lang.String keyName) {
        try {
            var RESULT = (MemoryAddress) g_get_os_info.invokeExact(Interop.allocateNativeString(keyName).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_prgname = Interop.downcallHandle(
        "g_get_prgname",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the program. This name should not be localized,
     * in contrast to g_get_application_name().
     * <p>
     * If you are using {@link org.gtk.gio.Application} the program name is set in
     * g_application_run(). In case of GDK or GTK+ it is set in
     * gdk_init(), which is called by gtk_init() and the
     * {@link org.gtk.gtk.Application}::startup handler. The program name is found by
     * taking the last component of {@code argv}[0].
     */
    public static java.lang.String getPrgname() {
        try {
            var RESULT = (MemoryAddress) g_get_prgname.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_real_name = Interop.downcallHandle(
        "g_get_real_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the real name of the user. This usually comes from the user's
     * entry in the {@code passwd} file. The encoding of the returned string is
     * system-defined. (On Windows, it is, however, always UTF-8.) If the
     * real user name cannot be determined, the string "Unknown" is
     * returned.
     */
    public static java.lang.String getRealName() {
        try {
            var RESULT = (MemoryAddress) g_get_real_name.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_real_time = Interop.downcallHandle(
        "g_get_real_time",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG)
    );
    
    /**
     * Queries the system wall-clock time.
     * <p>
     * This call is functionally equivalent to g_get_current_time() except
     * that the return value is often more convenient than dealing with a
     * {@link TimeVal}.
     * <p>
     * You should only use this call if you are actually interested in the real
     * wall-clock time.  g_get_monotonic_time() is probably more useful for
     * measuring intervals.
     */
    public static long getRealTime() {
        try {
            var RESULT = (long) g_get_real_time.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_system_config_dirs = Interop.downcallHandle(
        "g_get_system_config_dirs",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Returns an ordered list of base directories in which to access
     * system-wide configuration information.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * <a href="http://www.freedesktop.org/Standards/basedir-spec">XDG Base Directory Specification</a>.
     * In this case the list of directories retrieved will be {@code XDG_CONFIG_DIRS}.
     * <p>
     * On Windows it follows XDG Base Directory Specification if {@code XDG_CONFIG_DIRS} is defined.
     * If {@code XDG_CONFIG_DIRS} is undefined, the directory that contains application
     * data for all users is used instead. A typical path is
     * {@code C:\\Documents and Settings\\All Users\\Application Data}.
     * This folder is used for application data
     * that is not user specific. For example, an application can store
     * a spell-check dictionary, a database of clip art, or a log file in the
     * FOLDERID_ProgramData folder. This information will not roam and is available
     * to anyone using the computer.
     * <p>
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     */
    public static PointerString getSystemConfigDirs() {
        try {
            var RESULT = (MemoryAddress) g_get_system_config_dirs.invokeExact();
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_system_data_dirs = Interop.downcallHandle(
        "g_get_system_data_dirs",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Returns an ordered list of base directories in which to access
     * system-wide application data.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * <a href="http://www.freedesktop.org/Standards/basedir-spec">XDG Base Directory Specification</a>
     * In this case the list of directories retrieved will be {@code XDG_DATA_DIRS}.
     * <p>
     * On Windows it follows XDG Base Directory Specification if {@code XDG_DATA_DIRS} is defined.
     * If {@code XDG_DATA_DIRS} is undefined,
     * the first elements in the list are the Application Data
     * and Documents folders for All Users. (These can be determined only
     * on Windows 2000 or later and are not present in the list on other
     * Windows versions.) See documentation for FOLDERID_ProgramData and
     * FOLDERID_PublicDocuments.
     * <p>
     * Then follows the "share" subfolder in the installation folder for
     * the package containing the DLL that calls this function, if it can
     * be determined.
     * <p>
     * Finally the list contains the "share" subfolder in the installation
     * folder for GLib, and in the installation folder for the package the
     * application's .exe file belongs to.
     * <p>
     * The installation folders above are determined by looking up the
     * folder where the module (DLL or EXE) in question is located. If the
     * folder's name is "bin", its parent is used, otherwise the folder
     * itself.
     * <p>
     * Note that on Windows the returned list can vary depending on where
     * this function is called.
     * <p>
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     */
    public static PointerString getSystemDataDirs() {
        try {
            var RESULT = (MemoryAddress) g_get_system_data_dirs.invokeExact();
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_tmp_dir = Interop.downcallHandle(
        "g_get_tmp_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the directory to use for temporary files.
     * <p>
     * On UNIX, this is taken from the {@code TMPDIR} environment variable.
     * If the variable is not set, {@code P_tmpdir} is
     * used, as defined by the system C library. Failing that, a
     * hard-coded default of "/tmp" is returned.
     * <p>
     * On Windows, the {@code TEMP} environment variable is used, with the
     * root directory of the Windows installation (eg: "C:\\") used
     * as a default.
     * <p>
     * The encoding of the returned string is system-defined. On Windows,
     * it is always UTF-8. The return value is never {@code null} or the empty
     * string.
     */
    public static java.lang.String getTmpDir() {
        try {
            var RESULT = (MemoryAddress) g_get_tmp_dir.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_user_cache_dir = Interop.downcallHandle(
        "g_get_user_cache_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a base directory in which to store non-essential, cached
     * data specific to particular user.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * <a href="http://www.freedesktop.org/Standards/basedir-spec">XDG Base Directory Specification</a>.
     * In this case the directory retrieved will be {@code XDG_CACHE_HOME}.
     * <p>
     * On Windows it follows XDG Base Directory Specification if {@code XDG_CACHE_HOME} is defined.
     * If {@code XDG_CACHE_HOME} is undefined, the directory that serves as a common
     * repository for temporary Internet files is used instead. A typical path is
     * {@code C:\\Documents and Settings\\username\\Local Settings\\Temporary Internet Files}.
     * See the <a href="https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid">documentation for `FOLDERID_InternetCache`</a>.
     * <p>
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserCacheDir() {
        try {
            var RESULT = (MemoryAddress) g_get_user_cache_dir.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_user_config_dir = Interop.downcallHandle(
        "g_get_user_config_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a base directory in which to store user-specific application
     * configuration information such as user preferences and settings.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * <a href="http://www.freedesktop.org/Standards/basedir-spec">XDG Base Directory Specification</a>.
     * In this case the directory retrieved will be {@code XDG_CONFIG_HOME}.
     * <p>
     * On Windows it follows XDG Base Directory Specification if {@code XDG_CONFIG_HOME} is defined.
     * If {@code XDG_CONFIG_HOME} is undefined, the folder to use for local (as opposed
     * to roaming) application data is used instead. See the
     * <a href="https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid">documentation for `FOLDERID_LocalAppData`</a>.
     * Note that in this case on Windows it will be  the same
     * as what g_get_user_data_dir() returns.
     * <p>
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserConfigDir() {
        try {
            var RESULT = (MemoryAddress) g_get_user_config_dir.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_user_data_dir = Interop.downcallHandle(
        "g_get_user_data_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a base directory in which to access application data such
     * as icons that is customized for a particular user.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * <a href="http://www.freedesktop.org/Standards/basedir-spec">XDG Base Directory Specification</a>.
     * In this case the directory retrieved will be {@code XDG_DATA_HOME}.
     * <p>
     * On Windows it follows XDG Base Directory Specification if {@code XDG_DATA_HOME}
     * is defined. If {@code XDG_DATA_HOME} is undefined, the folder to use for local (as
     * opposed to roaming) application data is used instead. See the
     * <a href="https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid">documentation for `FOLDERID_LocalAppData`</a>.
     * Note that in this case on Windows it will be the same
     * as what g_get_user_config_dir() returns.
     * <p>
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserDataDir() {
        try {
            var RESULT = (MemoryAddress) g_get_user_data_dir.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_user_name = Interop.downcallHandle(
        "g_get_user_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the user name of the current user. The encoding of the returned
     * string is system-defined. On UNIX, it might be the preferred file name
     * encoding, or something else, and there is no guarantee that it is even
     * consistent on a machine. On Windows, it is always UTF-8.
     */
    public static java.lang.String getUserName() {
        try {
            var RESULT = (MemoryAddress) g_get_user_name.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_user_runtime_dir = Interop.downcallHandle(
        "g_get_user_runtime_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a directory that is unique to the current user on the local
     * system.
     * <p>
     * This is determined using the mechanisms described
     * in the
     * <a href="http://www.freedesktop.org/Standards/basedir-spec">XDG Base Directory Specification</a>.
     * This is the directory
     * specified in the {@code XDG_RUNTIME_DIR} environment variable.
     * In the case that this variable is not set, we return the value of
     * g_get_user_cache_dir(), after verifying that it exists.
     * <p>
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserRuntimeDir() {
        try {
            var RESULT = (MemoryAddress) g_get_user_runtime_dir.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_user_special_dir = Interop.downcallHandle(
        "g_get_user_special_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the full path of a special directory using its logical id.
     * <p>
     * On UNIX this is done using the XDG special user directories.
     * For compatibility with existing practise, {@link UserDirectory#DIRECTORY_DESKTOP}
     * falls back to {@code $HOME/Desktop} when XDG special user directories have
     * not been set up.
     * <p>
     * Depending on the platform, the user might be able to change the path
     * of the special directory without requiring the session to restart; GLib
     * will not reflect any change once the special directories are loaded.
     */
    public static java.lang.String getUserSpecialDir(UserDirectory directory) {
        try {
            var RESULT = (MemoryAddress) g_get_user_special_dir.invokeExact(directory.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_get_user_state_dir = Interop.downcallHandle(
        "g_get_user_state_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a base directory in which to store state files specific to
     * particular user.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * <a href="http://www.freedesktop.org/Standards/basedir-spec">XDG Base Directory Specification</a>.
     * In this case the directory retrieved will be {@code XDG_STATE_HOME}.
     * <p>
     * On Windows it follows XDG Base Directory Specification if {@code XDG_STATE_HOME} is defined.
     * If {@code XDG_STATE_HOME} is undefined, the folder to use for local (as opposed
     * to roaming) application data is used instead. See the
     * <a href="https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid">documentation for `FOLDERID_LocalAppData`</a>.
     * Note that in this case on Windows it will be the same
     * as what g_get_user_data_dir() returns.
     * <p>
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserStateDir() {
        try {
            var RESULT = (MemoryAddress) g_get_user_state_dir.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_getenv = Interop.downcallHandle(
        "g_getenv",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of an environment variable.
     * <p>
     * On UNIX, the name and value are byte strings which might or might not
     * be in some consistent character set and encoding. On Windows, they are
     * in UTF-8.
     * On Windows, in case the environment variable's value contains
     * references to other environment variables, they are expanded.
     */
    public static java.lang.String getenv(java.lang.String variable) {
        try {
            var RESULT = (MemoryAddress) g_getenv.invokeExact(Interop.allocateNativeString(variable).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_add = Interop.downcallHandle(
        "g_hash_table_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is a convenience function for using a {@link HashTable} as a set.  It
     * is equivalent to calling g_hash_table_replace() with {@code key} as both the
     * key and the value.
     * <p>
     * In particular, this means that if {@code key} already exists in the hash table, then
     * the old copy of {@code key} in the hash table is freed and {@code key} replaces it in the
     * table.
     * <p>
     * When a hash table only ever contains keys that have themselves as the
     * corresponding value it is able to be stored more efficiently.  See
     * the discussion in the section description.
     * <p>
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean hashTableAdd(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_hash_table_add.invokeExact(hashTable.handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_contains = Interop.downcallHandle(
        "g_hash_table_contains",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code key} is in {@code hash_table}.
     */
    public static boolean hashTableContains(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_hash_table_contains.invokeExact(hashTable.handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_destroy = Interop.downcallHandle(
        "g_hash_table_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroys all keys and values in the {@link HashTable} and decrements its
     * reference count by 1. If keys and/or values are dynamically allocated,
     * you should either free them first or create the {@link HashTable} with destroy
     * notifiers using g_hash_table_new_full(). In the latter case the destroy
     * functions you supplied will be called on all keys and values during the
     * destruction phase.
     */
    public static void hashTableDestroy(org.gtk.glib.HashTable hashTable) {
        try {
            g_hash_table_destroy.invokeExact(hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_insert = Interop.downcallHandle(
        "g_hash_table_insert",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new key and value into a {@link HashTable}.
     * <p>
     * If the key already exists in the {@link HashTable} its current
     * value is replaced with the new value. If you supplied a
     * {@code value_destroy_func} when creating the {@link HashTable}, the old
     * value is freed using that function. If you supplied a
     * {@code key_destroy_func} when creating the {@link HashTable}, the passed
     * key is freed using that function.
     * <p>
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean hashTableInsert(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (int) g_hash_table_insert.invokeExact(hashTable.handle(), key, value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_lookup = Interop.downcallHandle(
        "g_hash_table_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a key in a {@link HashTable}. Note that this function cannot
     * distinguish between a key that is not present and one which is present
     * and has the value {@code null}. If you need this distinction, use
     * g_hash_table_lookup_extended().
     */
    public static java.lang.foreign.MemoryAddress hashTableLookup(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (MemoryAddress) g_hash_table_lookup.invokeExact(hashTable.handle(), key);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_lookup_extended = Interop.downcallHandle(
        "g_hash_table_lookup_extended",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a key in the {@link HashTable}, returning the original key and the
     * associated value and a {@code gboolean} which is {@code true} if the key was found. This
     * is useful if you need to free the memory allocated for the original key,
     * for example before calling g_hash_table_remove().
     * <p>
     * You can actually pass {@code null} for {@code lookup_key} to test
     * whether the {@code null} key exists, provided the hash and equal functions
     * of {@code hash_table} are {@code null}-safe.
     */
    public static boolean hashTableLookupExtended(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress lookupKey, java.lang.foreign.MemoryAddress origKey, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (int) g_hash_table_lookup_extended.invokeExact(hashTable.handle(), lookupKey, origKey, value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_new_similar = Interop.downcallHandle(
        "g_hash_table_new_similar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link HashTable} like g_hash_table_new_full() with a reference
     * count of 1.
     * <p>
     * It inherits the hash function, the key equal function, the key destroy function,
     * as well as the value destroy function, from {@code other_hash_table}.
     * <p>
     * The returned hash table will be empty; it will not contain the keys
     * or values from {@code other_hash_table}.
     */
    public static org.gtk.glib.HashTable hashTableNewSimilar(org.gtk.glib.HashTable otherHashTable) {
        try {
            var RESULT = (MemoryAddress) g_hash_table_new_similar.invokeExact(otherHashTable.handle());
            return new org.gtk.glib.HashTable(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_remove = Interop.downcallHandle(
        "g_hash_table_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a key and its associated value from a {@link HashTable}.
     * <p>
     * If the {@link HashTable} was created using g_hash_table_new_full(), the
     * key and value are freed using the supplied destroy functions, otherwise
     * you have to make sure that any dynamically allocated values are freed
     * yourself.
     */
    public static boolean hashTableRemove(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_hash_table_remove.invokeExact(hashTable.handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_remove_all = Interop.downcallHandle(
        "g_hash_table_remove_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all keys and their associated values from a {@link HashTable}.
     * <p>
     * If the {@link HashTable} was created using g_hash_table_new_full(),
     * the keys and values are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     */
    public static void hashTableRemoveAll(org.gtk.glib.HashTable hashTable) {
        try {
            g_hash_table_remove_all.invokeExact(hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_replace = Interop.downcallHandle(
        "g_hash_table_replace",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new key and value into a {@link HashTable} similar to
     * g_hash_table_insert(). The difference is that if the key
     * already exists in the {@link HashTable}, it gets replaced by the
     * new key. If you supplied a {@code value_destroy_func} when creating
     * the {@link HashTable}, the old value is freed using that function.
     * If you supplied a {@code key_destroy_func} when creating the
     * {@link HashTable}, the old key is freed using that function.
     * <p>
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean hashTableReplace(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value) {
        try {
            var RESULT = (int) g_hash_table_replace.invokeExact(hashTable.handle(), key, value);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_size = Interop.downcallHandle(
        "g_hash_table_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of elements contained in the {@link HashTable}.
     */
    public static int hashTableSize(org.gtk.glib.HashTable hashTable) {
        try {
            var RESULT = (int) g_hash_table_size.invokeExact(hashTable.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_steal = Interop.downcallHandle(
        "g_hash_table_steal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a key and its associated value from a {@link HashTable} without
     * calling the key and value destroy functions.
     */
    public static boolean hashTableSteal(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress key) {
        try {
            var RESULT = (int) g_hash_table_steal.invokeExact(hashTable.handle(), key);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_steal_all = Interop.downcallHandle(
        "g_hash_table_steal_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all keys and their associated values from a {@link HashTable}
     * without calling the key and value destroy functions.
     */
    public static void hashTableStealAll(org.gtk.glib.HashTable hashTable) {
        try {
            g_hash_table_steal_all.invokeExact(hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_steal_extended = Interop.downcallHandle(
        "g_hash_table_steal_extended",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a key in the {@link HashTable}, stealing the original key and the
     * associated value and returning {@code true} if the key was found. If the key was
     * not found, {@code false} is returned.
     * <p>
     * If found, the stolen key and value are removed from the hash table without
     * calling the key and value destroy functions, and ownership is transferred to
     * the caller of this method; as with g_hash_table_steal().
     * <p>
     * You can pass {@code null} for {@code lookup_key}, provided the hash and equal functions
     * of {@code hash_table} are {@code null}-safe.
     */
    public static boolean hashTableStealExtended(org.gtk.glib.HashTable hashTable, java.lang.foreign.MemoryAddress lookupKey, java.lang.foreign.MemoryAddress stolenKey, java.lang.foreign.MemoryAddress stolenValue) {
        try {
            var RESULT = (int) g_hash_table_steal_extended.invokeExact(hashTable.handle(), lookupKey, stolenKey, stolenValue);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hash_table_unref = Interop.downcallHandle(
        "g_hash_table_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically decrements the reference count of {@code hash_table} by one.
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     */
    public static void hashTableUnref(org.gtk.glib.HashTable hashTable) {
        try {
            g_hash_table_unref.invokeExact(hashTable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_destroy = Interop.downcallHandle(
        "g_hook_destroy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Destroys a {@link Hook}, given its ID.
     */
    public static boolean hookDestroy(HookList hookList, long hookId) {
        try {
            var RESULT = (int) g_hook_destroy.invokeExact(hookList.handle(), hookId);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_destroy_link = Interop.downcallHandle(
        "g_hook_destroy_link",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes one {@link Hook} from a {@link HookList}, marking it
     * inactive and calling g_hook_unref() on it.
     */
    public static void hookDestroyLink(HookList hookList, Hook hook) {
        try {
            g_hook_destroy_link.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_free = Interop.downcallHandle(
        "g_hook_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the {@link HookList} {@code finalize_hook} function if it exists,
     * and frees the memory allocated for the {@link Hook}.
     */
    public static void hookFree(HookList hookList, Hook hook) {
        try {
            g_hook_free.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_insert_before = Interop.downcallHandle(
        "g_hook_insert_before",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a {@link Hook} into a {@link HookList}, before a given {@link Hook}.
     */
    public static void hookInsertBefore(HookList hookList, Hook sibling, Hook hook) {
        try {
            g_hook_insert_before.invokeExact(hookList.handle(), sibling.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_prepend = Interop.downcallHandle(
        "g_hook_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends a {@link Hook} on the start of a {@link HookList}.
     */
    public static void hookPrepend(HookList hookList, Hook hook) {
        try {
            g_hook_prepend.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_unref = Interop.downcallHandle(
        "g_hook_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of a {@link Hook}.
     * If the reference count falls to 0, the {@link Hook} is removed
     * from the {@link HookList} and g_hook_free() is called to free it.
     */
    public static void hookUnref(HookList hookList, Hook hook) {
        try {
            g_hook_unref.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hostname_is_ascii_encoded = Interop.downcallHandle(
        "g_hostname_is_ascii_encoded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests if {@code hostname} contains segments with an ASCII-compatible
     * encoding of an Internationalized Domain Name. If this returns
     * {@code true}, you should decode the hostname with g_hostname_to_unicode()
     * before displaying it to the user.
     * <p>
     * Note that a hostname might contain a mix of encoded and unencoded
     * segments, and so it is possible for g_hostname_is_non_ascii() and
     * g_hostname_is_ascii_encoded() to both return {@code true} for a name.
     */
    public static boolean hostnameIsAsciiEncoded(java.lang.String hostname) {
        try {
            var RESULT = (int) g_hostname_is_ascii_encoded.invokeExact(Interop.allocateNativeString(hostname).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hostname_is_ip_address = Interop.downcallHandle(
        "g_hostname_is_ip_address",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests if {@code hostname} is the string form of an IPv4 or IPv6 address.
     * (Eg, "192.168.0.1".)
     * <p>
     * Since 2.66, IPv6 addresses with a zone-id are accepted (RFC6874).
     */
    public static boolean hostnameIsIpAddress(java.lang.String hostname) {
        try {
            var RESULT = (int) g_hostname_is_ip_address.invokeExact(Interop.allocateNativeString(hostname).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hostname_is_non_ascii = Interop.downcallHandle(
        "g_hostname_is_non_ascii",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests if {@code hostname} contains Unicode characters. If this returns
     * {@code true}, you need to encode the hostname with g_hostname_to_ascii()
     * before using it in non-IDN-aware contexts.
     * <p>
     * Note that a hostname might contain a mix of encoded and unencoded
     * segments, and so it is possible for g_hostname_is_non_ascii() and
     * g_hostname_is_ascii_encoded() to both return {@code true} for a name.
     */
    public static boolean hostnameIsNonAscii(java.lang.String hostname) {
        try {
            var RESULT = (int) g_hostname_is_non_ascii.invokeExact(Interop.allocateNativeString(hostname).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hostname_to_ascii = Interop.downcallHandle(
        "g_hostname_to_ascii",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts {@code hostname} to its canonical ASCII form; an ASCII-only
     * string containing no uppercase letters and not ending with a
     * trailing dot.
     */
    public static java.lang.String hostnameToAscii(java.lang.String hostname) {
        try {
            var RESULT = (MemoryAddress) g_hostname_to_ascii.invokeExact(Interop.allocateNativeString(hostname).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hostname_to_unicode = Interop.downcallHandle(
        "g_hostname_to_unicode",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts {@code hostname} to its canonical presentation form; a UTF-8
     * string in Unicode normalization form C, containing no uppercase
     * letters, no forbidden characters, and no ASCII-encoded segments,
     * and not ending with a trailing dot.
     * <p>
     * Of course if {@code hostname} is not an internationalized hostname, then
     * the canonical presentation form will be entirely ASCII.
     */
    public static java.lang.String hostnameToUnicode(java.lang.String hostname) {
        try {
            var RESULT = (MemoryAddress) g_hostname_to_unicode.invokeExact(Interop.allocateNativeString(hostname).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_iconv = Interop.downcallHandle(
        "g_iconv",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Same as the standard UNIX routine iconv(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation.
     * <p>
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     * <p>
     * Note that the behaviour of iconv() for characters which are valid in the
     * input character set, but which have no representation in the output character
     * set, is implementation defined. This function may return success (with a
     * positive number of non-reversible conversions as replacement characters were
     * used), or it may return -1 and set an error such as {@code EILSEQ}, in such a
     * situation.
     */
    public static long iconv(IConv converter, java.lang.String[] inbuf, PointerLong inbytesLeft, java.lang.String[] outbuf, PointerLong outbytesLeft) {
        try {
            var RESULT = (long) g_iconv.invokeExact(converter.handle(), Interop.allocateNativeArray(inbuf).handle(), inbytesLeft.handle(), Interop.allocateNativeArray(outbuf).handle(), outbytesLeft.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_iconv_open = Interop.downcallHandle(
        "g_iconv_open",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Same as the standard UNIX routine iconv_open(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation.
     * <p>
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     */
    public static IConv iconvOpen(java.lang.String toCodeset, java.lang.String fromCodeset) {
        try {
            var RESULT = (MemoryAddress) g_iconv_open.invokeExact(Interop.allocateNativeString(toCodeset).handle(), Interop.allocateNativeString(fromCodeset).handle());
            return new IConv(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_idle_add = Interop.downcallHandle(
        "g_idle_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a function to be called whenever there are no higher priority
     * events pending to the default main loop. The function is given the
     * default idle priority, {@code G_PRIORITY_DEFAULT_IDLE}.  If the function
     * returns {@code false} it is automatically removed from the list of event
     * sources and will not be called again.
     * <p>
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle the return value and memory management of {@code data}.
     * <p>
     * This internally creates a main loop source using g_idle_source_new()
     * and attaches it to the global {@link MainContext} using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     */
    public static int idleAdd(SourceFunc function) {
        try {
            var RESULT = (int) g_idle_add.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_idle_add_full = Interop.downcallHandle(
        "g_idle_add_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a function to be called whenever there are no higher priority
     * events pending.
     * <p>
     * If the function returns {@code G_SOURCE_REMOVE} or {@code false} it is automatically
     * removed from the list of event sources and will not be called again.
     * <p>
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle the return value and memory management of {@code data}.
     * <p>
     * This internally creates a main loop source using g_idle_source_new()
     * and attaches it to the global {@link MainContext} using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     */
    public static int idleAddFull(int priority, SourceFunc function) {
        try {
            var RESULT = (int) g_idle_add_full.invokeExact(priority, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_idle_remove_by_data = Interop.downcallHandle(
        "g_idle_remove_by_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the idle function with the given data.
     */
    public static boolean idleRemoveByData(java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (int) g_idle_remove_by_data.invokeExact(data);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_idle_source_new = Interop.downcallHandle(
        "g_idle_source_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new idle source.
     * <p>
     * The source will not initially be associated with any {@link MainContext}
     * and must be added to one with g_source_attach() before it will be
     * executed. Note that the default priority for idle sources is
     * {@code G_PRIORITY_DEFAULT_IDLE}, as compared to other sources which
     * have a default priority of {@code G_PRIORITY_DEFAULT}.
     */
    public static Source idleSourceNew() {
        try {
            var RESULT = (MemoryAddress) g_idle_source_new.invokeExact();
            return new Source(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_int64_equal = Interop.downcallHandle(
        "g_int64_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares the two {@code gint64} values being pointed to and returns
     * {@code true} if they are equal.
     * It can be passed to g_hash_table_new() as the {@code key_equal_func}
     * parameter, when using non-{@code null} pointers to 64-bit integers as keys in a
     * {@link HashTable}.
     */
    public static boolean int64Equal(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2) {
        try {
            var RESULT = (int) g_int64_equal.invokeExact(v1, v2);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_int64_hash = Interop.downcallHandle(
        "g_int64_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a pointer to a {@code gint64} to a hash value.
     * <p>
     * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
     * when using non-{@code null} pointers to 64-bit integer values as keys in a
     * {@link HashTable}.
     */
    public static int int64Hash(java.lang.foreign.MemoryAddress v) {
        try {
            var RESULT = (int) g_int64_hash.invokeExact(v);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_int_equal = Interop.downcallHandle(
        "g_int_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares the two {@code gint} values being pointed to and returns
     * {@code true} if they are equal.
     * It can be passed to g_hash_table_new() as the {@code key_equal_func}
     * parameter, when using non-{@code null} pointers to integers as keys in a
     * {@link HashTable}.
     * <p>
     * Note that this function acts on pointers to {@code gint}, not on {@code gint}
     * directly: if your hash table's keys are of the form
     * {@code GINT_TO_POINTER (n)}, use g_direct_equal() instead.
     */
    public static boolean intEqual(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2) {
        try {
            var RESULT = (int) g_int_equal.invokeExact(v1, v2);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_int_hash = Interop.downcallHandle(
        "g_int_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a pointer to a {@code gint} to a hash value.
     * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
     * when using non-{@code null} pointers to integer values as keys in a {@link HashTable}.
     * <p>
     * Note that this function acts on pointers to {@code gint}, not on {@code gint}
     * directly: if your hash table's keys are of the form
     * {@code GINT_TO_POINTER (n)}, use g_direct_hash() instead.
     */
    public static int intHash(java.lang.foreign.MemoryAddress v) {
        try {
            var RESULT = (int) g_int_hash.invokeExact(v);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_intern_static_string = Interop.downcallHandle(
        "g_intern_static_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a canonical representation for {@code string}. Interned strings
     * can be compared for equality by comparing the pointers, instead of
     * using strcmp(). g_intern_static_string() does not copy the string,
     * therefore {@code string} must not be freed or modified.
     * <p>
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     */
    public static java.lang.String internStaticString(java.lang.String string) {
        try {
            var RESULT = (MemoryAddress) g_intern_static_string.invokeExact(Interop.allocateNativeString(string).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_intern_string = Interop.downcallHandle(
        "g_intern_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a canonical representation for {@code string}. Interned strings
     * can be compared for equality by comparing the pointers, instead of
     * using strcmp().
     * <p>
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     */
    public static java.lang.String internString(java.lang.String string) {
        try {
            var RESULT = (MemoryAddress) g_intern_string.invokeExact(Interop.allocateNativeString(string).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_add_watch = Interop.downcallHandle(
        "g_io_add_watch",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds the {@link IOChannel} into the default main loop context
     * with the default priority.
     */
    public static int ioAddWatch(IOChannel channel, IOCondition condition, IOFunc func) {
        try {
            var RESULT = (int) g_io_add_watch.invokeExact(channel.handle(), condition.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbIOFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_add_watch_full = Interop.downcallHandle(
        "g_io_add_watch_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds the {@link IOChannel} into the default main loop context
     * with the given priority.
     * <p>
     * This internally creates a main loop source using g_io_create_watch()
     * and attaches it to the main loop context with g_source_attach().
     * You can do these steps manually if you need greater control.
     */
    public static int ioAddWatchFull(IOChannel channel, int priority, IOCondition condition, IOFunc func) {
        try {
            var RESULT = (int) g_io_add_watch_full.invokeExact(channel.handle(), priority, condition.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbIOFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_channel_error_from_errno = Interop.downcallHandle(
        "g_io_channel_error_from_errno",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an {@code errno} error number to a {@link IOChannelError}.
     */
    public static IOChannelError ioChannelErrorFromErrno(int en) {
        try {
            var RESULT = (int) g_io_channel_error_from_errno.invokeExact(en);
            return new IOChannelError(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_channel_error_quark = Interop.downcallHandle(
        "g_io_channel_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark ioChannelErrorQuark() {
        try {
            var RESULT = (int) g_io_channel_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_create_watch = Interop.downcallHandle(
        "g_io_create_watch",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a {@link Source} that's dispatched when {@code condition} is met for the
     * given {@code channel}. For example, if condition is {@link IOCondition#IN}, the source will
     * be dispatched when there's data available for reading.
     * <p>
     * The callback function invoked by the {@link Source} should be added with
     * g_source_set_callback(), but it has type {@link IOFunc} (not {@link SourceFunc}).
     * <p>
     * g_io_add_watch() is a simpler interface to this same functionality, for
     * the case where you want to add the source to the default main loop context
     * at the default priority.
     * <p>
     * On Windows, polling a {@link Source} created to watch a channel for a socket
     * puts the socket in non-blocking mode. This is a side-effect of the
     * implementation and unavoidable.
     */
    public static Source ioCreateWatch(IOChannel channel, IOCondition condition) {
        try {
            var RESULT = (MemoryAddress) g_io_create_watch.invokeExact(channel.handle(), condition.getValue());
            return new Source(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_error_quark = Interop.downcallHandle(
        "g_key_file_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark keyFileErrorQuark() {
        try {
            var RESULT = (int) g_key_file_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_listenv = Interop.downcallHandle(
        "g_listenv",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Gets the names of all variables set in the environment.
     * <p>
     * Programs that want to be portable to Windows should typically use
     * this function and g_getenv() instead of using the environ array
     * from the C library directly. On Windows, the strings in the environ
     * array are in system codepage encoding, while in most of the typical
     * use cases for environment variables in GLib-using programs you want
     * the UTF-8 encoding that this function and g_getenv() provide.
     */
    public static PointerString listenv() {
        try {
            var RESULT = (MemoryAddress) g_listenv.invokeExact();
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_locale_from_utf8 = Interop.downcallHandle(
        "g_locale_from_utf8",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string from UTF-8 to the encoding used for strings by
     * the C runtime (usually the same as that used by the operating
     * system) in the [current locale][setlocale]. On Windows this means
     * the system codepage.
     * <p>
     * The input string shall not contain nul characters even if the {@code len}
     * argument is positive. A nul character found inside the string will result
     * in error {@link ConvertError#ILLEGAL_SEQUENCE}. Use g_convert() to convert
     * input that may contain embedded nul characters.
     */
    public static PointerByte localeFromUtf8(java.lang.String utf8string, long len, PointerLong bytesRead, PointerLong bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_locale_from_utf8.invokeExact(Interop.allocateNativeString(utf8string).handle(), len, bytesRead.handle(), bytesWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_locale_to_utf8 = Interop.downcallHandle(
        "g_locale_to_utf8",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string which is in the encoding used for strings by
     * the C runtime (usually the same as that used by the operating
     * system) in the [current locale][setlocale] into a UTF-8 string.
     * <p>
     * If the source encoding is not UTF-8 and the conversion output contains a
     * nul character, the error {@link ConvertError#EMBEDDED_NUL} is set and the
     * function returns {@code null}.
     * If the source encoding is UTF-8, an embedded nul character is treated with
     * the {@link ConvertError#ILLEGAL_SEQUENCE} error for backward compatibility with
     * earlier versions of this library. Use g_convert() to produce output that
     * may contain embedded nul characters.
     */
    public static java.lang.String localeToUtf8(byte[] opsysstring, long len, PointerLong bytesRead, PointerLong bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_locale_to_utf8.invokeExact(Interop.allocateNativeArray(opsysstring).handle(), len, bytesRead.handle(), bytesWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_default_handler = Interop.downcallHandle(
        "g_log_default_handler",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * The default log handler set up by GLib; g_log_set_default_handler()
     * allows to install an alternate default log handler.
     * This is used if no log handler has been set for the particular log
     * domain and log level combination. It outputs the message to stderr
     * or stdout and if the log level is fatal it calls G_BREAKPOINT(). It automatically
     * prints a new-line character after the message, so one does not need to be
     * manually included in {@code message}.
     * <p>
     * The behavior of this log handler can be influenced by a number of
     * environment variables:
     * <p>
     * <ul>
     * <li>{@code G_MESSAGES_PREFIXED}: A :-separated list of log levels for which
     *   messages should be prefixed by the program name and PID of the
     *   application.
     * </ul>
     * <p>
     * <ul>
     * <li>{@code G_MESSAGES_DEBUG}: A space-separated list of log domains for
     *   which debug and informational messages are printed. By default
     *   these messages are not printed.
     * </ul>
     * <p>
     * stderr is used for levels {@link LogLevelFlags#LEVEL_ERROR}, {@link LogLevelFlags#LEVEL_CRITICAL},
     * {@link LogLevelFlags#LEVEL_WARNING} and {@link LogLevelFlags#LEVEL_MESSAGE}. stdout is used for
     * the rest, unless stderr was requested by
     * g_log_writer_default_set_use_stderr().
     * <p>
     * This has no effect if structured logging is enabled; see
     * [Using Structured Logging][using-structured-logging].
     */
    public static void logDefaultHandler(java.lang.String logDomain, LogLevelFlags logLevel, java.lang.String message, java.lang.foreign.MemoryAddress unusedData) {
        try {
            g_log_default_handler.invokeExact(Interop.allocateNativeString(logDomain).handle(), logLevel.getValue(), Interop.allocateNativeString(message).handle(), unusedData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_get_debug_enabled = Interop.downcallHandle(
        "g_log_get_debug_enabled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Return whether debug output from the GLib logging system is enabled.
     * <p>
     * Note that this should not be used to conditionalise calls to g_debug() or
     * other logging functions; it should only be used from {@code GLogWriterFunc}
     * implementations.
     * <p>
     * Note also that the value of this does not depend on {@code G_MESSAGES_DEBUG}; see
     * the docs for g_log_set_debug_enabled().
     */
    public static boolean logGetDebugEnabled() {
        try {
            var RESULT = (int) g_log_get_debug_enabled.invokeExact();
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_remove_handler = Interop.downcallHandle(
        "g_log_remove_handler",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the log handler.
     * <p>
     * This has no effect if structured logging is enabled; see
     * [Using Structured Logging][using-structured-logging].
     */
    public static void logRemoveHandler(java.lang.String logDomain, int handlerId) {
        try {
            g_log_remove_handler.invokeExact(Interop.allocateNativeString(logDomain).handle(), handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_set_always_fatal = Interop.downcallHandle(
        "g_log_set_always_fatal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the message levels which are always fatal, in any log domain.
     * When a message with any of these levels is logged the program terminates.
     * You can only set the levels defined by GLib to be fatal.
     * {@link LogLevelFlags#LEVEL_ERROR} is always fatal.
     * <p>
     * You can also make some message levels fatal at runtime by setting
     * the {@code G_DEBUG} environment variable (see
     * <a href="glib-running.html)">Running GLib Applications</a>.
     * <p>
     * Libraries should not call this function, as it affects all messages logged
     * by a process, including those from other libraries.
     * <p>
     * Structured log messages (using g_log_structured() and
     * g_log_structured_array()) are fatal only if the default log writer is used;
     * otherwise it is up to the writer function to determine which log messages
     * are fatal. See [Using Structured Logging][using-structured-logging].
     */
    public static LogLevelFlags logSetAlwaysFatal(LogLevelFlags fatalMask) {
        try {
            var RESULT = (int) g_log_set_always_fatal.invokeExact(fatalMask.getValue());
            return new LogLevelFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_set_debug_enabled = Interop.downcallHandle(
        "g_log_set_debug_enabled",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * Enable or disable debug output from the GLib logging system for all domains.
     * This value interacts disjunctively with {@code G_MESSAGES_DEBUG} — if either of
     * them would allow a debug message to be outputted, it will be.
     * <p>
     * Note that this should not be used from within library code to enable debug
     * output — it is intended for external use.
     */
    public static void logSetDebugEnabled(boolean enabled) {
        try {
            g_log_set_debug_enabled.invokeExact(enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_set_fatal_mask = Interop.downcallHandle(
        "g_log_set_fatal_mask",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the log levels which are fatal in the given domain.
     * {@link LogLevelFlags#LEVEL_ERROR} is always fatal.
     * <p>
     * This has no effect on structured log messages (using g_log_structured() or
     * g_log_structured_array()). To change the fatal behaviour for specific log
     * messages, programs must install a custom log writer function using
     * g_log_set_writer_func(). See
     * [Using Structured Logging][using-structured-logging].
     * <p>
     * This function is mostly intended to be used with
     * {@link LogLevelFlags#LEVEL_CRITICAL}.  You should typically not set
     * {@link LogLevelFlags#LEVEL_WARNING}, {@link LogLevelFlags#LEVEL_MESSAGE}, {@link LogLevelFlags#LEVEL_INFO} or
     * {@link LogLevelFlags#LEVEL_DEBUG} as fatal except inside of test programs.
     */
    public static LogLevelFlags logSetFatalMask(java.lang.String logDomain, LogLevelFlags fatalMask) {
        try {
            var RESULT = (int) g_log_set_fatal_mask.invokeExact(Interop.allocateNativeString(logDomain).handle(), fatalMask.getValue());
            return new LogLevelFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_set_handler = Interop.downcallHandle(
        "g_log_set_handler",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the log handler for a domain and a set of log levels.
     * <p>
     * To handle fatal and recursive messages the {@code log_levels} parameter
     * must be combined with the {@link LogLevelFlags#FLAG_FATAL} and {@link LogLevelFlags#FLAG_RECURSION}
     * bit flags.
     * <p>
     * Note that since the {@link LogLevelFlags#LEVEL_ERROR} log level is always fatal, if
     * you want to set a handler for this log level you must combine it with
     * {@link LogLevelFlags#FLAG_FATAL}.
     * <p>
     * This has no effect if structured logging is enabled; see
     * [Using Structured Logging][using-structured-logging].
     * <p>
     * Here is an example for adding a log handler for all warning messages
     * in the default domain:
     * <p>
     * <pre>{@code <!-- language="C" -->
     * g_log_set_handler (NULL, G_LOG_LEVEL_WARNING | G_LOG_FLAG_FATAL
     *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
     * }</pre>
     * <p>
     * This example adds a log handler for all critical messages from GTK+:
     * <p>
     * <pre>{@code <!-- language="C" -->
     * g_log_set_handler ("Gtk", G_LOG_LEVEL_CRITICAL | G_LOG_FLAG_FATAL
     *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
     * }</pre>
     * <p>
     * This example adds a log handler for all messages from GLib:
     * <p>
     * <pre>{@code <!-- language="C" -->
     * g_log_set_handler ("GLib", G_LOG_LEVEL_MASK | G_LOG_FLAG_FATAL
     *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
     * }</pre>
     */
    public static int logSetHandler(java.lang.String logDomain, LogLevelFlags logLevels, LogFunc logFunc) {
        try {
            var RESULT = (int) g_log_set_handler.invokeExact(Interop.allocateNativeString(logDomain).handle(), logLevels.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbLogFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(logFunc.hashCode(), logFunc)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_set_handler_full = Interop.downcallHandle(
        "g_log_set_handler_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_log_set_handler(), but takes a destroy notify for the {@code user_data}.
     * <p>
     * This has no effect if structured logging is enabled; see
     * [Using Structured Logging][using-structured-logging].
     */
    public static int logSetHandlerFull(java.lang.String logDomain, LogLevelFlags logLevels, LogFunc logFunc) {
        try {
            var RESULT = (int) g_log_set_handler_full.invokeExact(Interop.allocateNativeString(logDomain).handle(), logLevels.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbLogFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(logFunc.hashCode(), logFunc)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_set_writer_func = Interop.downcallHandle(
        "g_log_set_writer_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set a writer function which will be called to format and write out each log
     * message. Each program should set a writer function, or the default writer
     * (g_log_writer_default()) will be used.
     * <p>
     * Libraries <strong>*must not*</strong> call this function — only programs are allowed to
     * install a writer function, as there must be a single, central point where
     * log messages are formatted and outputted.
     * <p>
     * There can only be one writer function. It is an error to set more than one.
     */
    public static void logSetWriterFunc(LogWriterFunc func) {
        try {
            g_log_set_writer_func.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbLogWriterFunc",
                            MethodType.methodType(int.class, int.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_structured_array = Interop.downcallHandle(
        "g_log_structured_array",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Log a message with structured data. The message will be passed through to the
     * log writer set by the application using g_log_set_writer_func(). If the
     * message is fatal (i.e. its log level is {@link LogLevelFlags#LEVEL_ERROR}), the program will
     * be aborted at the end of this function.
     * <p>
     * See g_log_structured() for more documentation.
     * <p>
     * This assumes that {@code log_level} is already present in {@code fields} (typically as the
     * {@code PRIORITY} field).
     */
    public static void logStructuredArray(LogLevelFlags logLevel, LogField[] fields, long nFields) {
        try {
            g_log_structured_array.invokeExact(logLevel.getValue(), Interop.allocateNativeArray(fields).handle(), nFields);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_variant = Interop.downcallHandle(
        "g_log_variant",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Log a message with structured data, accepting the data within a {@link Variant}. This
     * version is especially useful for use in other languages, via introspection.
     * <p>
     * The only mandatory item in the {@code fields} dictionary is the "MESSAGE" which must
     * contain the text shown to the user.
     * <p>
     * The values in the {@code fields} dictionary are likely to be of type String
     * ({@code G_VARIANT_TYPE_STRING}). Array of bytes ({@code G_VARIANT_TYPE_BYTESTRING}) is also
     * supported. In this case the message is handled as binary and will be forwarded
     * to the log writer as such. The size of the array should not be higher than
     * {@code G_MAXSSIZE}. Otherwise it will be truncated to this size. For other types
     * g_variant_print() will be used to convert the value into a string.
     * <p>
     * For more details on its usage and about the parameters, see g_log_structured().
     */
    public static void logVariant(java.lang.String logDomain, LogLevelFlags logLevel, Variant fields) {
        try {
            g_log_variant.invokeExact(Interop.allocateNativeString(logDomain).handle(), logLevel.getValue(), fields.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_writer_default = Interop.downcallHandle(
        "g_log_writer_default",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Format a structured log message and output it to the default log destination
     * for the platform. On Linux, this is typically the systemd journal, falling
     * back to {@code stdout} or {@code stderr} if running from the terminal or if output is
     * being redirected to a file.
     * <p>
     * Support for other platform-specific logging mechanisms may be added in
     * future. Distributors of GLib may modify this function to impose their own
     * (documented) platform-specific log writing policies.
     * <p>
     * This is suitable for use as a {@link LogWriterFunc}, and is the default writer used
     * if no other is set using g_log_set_writer_func().
     * <p>
     * As with g_log_default_handler(), this function drops debug and informational
     * messages unless their log domain (or {@code all}) is listed in the space-separated
     * {@code G_MESSAGES_DEBUG} environment variable.
     * <p>
     * g_log_writer_default() uses the mask set by g_log_set_always_fatal() to
     * determine which messages are fatal. When using a custom writer func instead it is
     * up to the writer function to determine which log messages are fatal.
     */
    public static LogWriterOutput logWriterDefault(LogLevelFlags logLevel, LogField[] fields, long nFields, java.lang.foreign.MemoryAddress userData) {
        try {
            var RESULT = (int) g_log_writer_default.invokeExact(logLevel.getValue(), Interop.allocateNativeArray(fields).handle(), nFields, userData);
            return new LogWriterOutput(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_writer_default_set_use_stderr = Interop.downcallHandle(
        "g_log_writer_default_set_use_stderr",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * Configure whether the built-in log functions
     * (g_log_default_handler() for the old-style API, and both
     * g_log_writer_default() and g_log_writer_standard_streams() for the
     * structured API) will output all log messages to {@code stderr}.
     * <p>
     * By default, log messages of levels {@link LogLevelFlags#LEVEL_INFO} and
     * {@link LogLevelFlags#LEVEL_DEBUG} are sent to {@code stdout}, and other log messages are
     * sent to {@code stderr}. This is problematic for applications that intend
     * to reserve {@code stdout} for structured output such as JSON or XML.
     * <p>
     * This function sets global state. It is not thread-aware, and should be
     * called at the very start of a program, before creating any other threads
     * or creating objects that could create worker threads of their own.
     */
    public static void logWriterDefaultSetUseStderr(boolean useStderr) {
        try {
            g_log_writer_default_set_use_stderr.invokeExact(useStderr ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_writer_default_would_drop = Interop.downcallHandle(
        "g_log_writer_default_would_drop",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check whether g_log_writer_default() and g_log_default_handler() would
     * ignore a message with the given domain and level.
     * <p>
     * As with g_log_default_handler(), this function drops debug and informational
     * messages unless their log domain (or {@code all}) is listed in the space-separated
     * {@code G_MESSAGES_DEBUG} environment variable.
     * <p>
     * This can be used when implementing log writers with the same filtering
     * behaviour as the default, but a different destination or output format:
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   if (g_log_writer_default_would_drop (log_level, log_domain))
     *     return G_LOG_WRITER_HANDLED;
     * }</pre>
     * <p>
     * or to skip an expensive computation if it is only needed for a debugging
     * message, and {@code G_MESSAGES_DEBUG} is not set:
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   if (!g_log_writer_default_would_drop (G_LOG_LEVEL_DEBUG, G_LOG_DOMAIN))
     *     {
     *       gchar *result = expensive_computation (my_object);
     * 
     *       g_debug ("my_object result: %s", result);
     *       g_free (result);
     *     }
     * }</pre>
     */
    public static boolean logWriterDefaultWouldDrop(LogLevelFlags logLevel, java.lang.String logDomain) {
        try {
            var RESULT = (int) g_log_writer_default_would_drop.invokeExact(logLevel.getValue(), Interop.allocateNativeString(logDomain).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_writer_format_fields = Interop.downcallHandle(
        "g_log_writer_format_fields",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Format a structured log message as a string suitable for outputting to the
     * terminal (or elsewhere). This will include the values of all fields it knows
     * how to interpret, which includes {@code MESSAGE} and {@code GLIB_DOMAIN} (see the
     * documentation for g_log_structured()). It does not include values from
     * unknown fields.
     * <p>
     * The returned string does <strong>*not*</strong> have a trailing new-line character. It is
     * encoded in the character set of the current locale, which is not necessarily
     * UTF-8.
     */
    public static java.lang.String logWriterFormatFields(LogLevelFlags logLevel, LogField[] fields, long nFields, boolean useColor) {
        try {
            var RESULT = (MemoryAddress) g_log_writer_format_fields.invokeExact(logLevel.getValue(), Interop.allocateNativeArray(fields).handle(), nFields, useColor ? 1 : 0);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_writer_is_journald = Interop.downcallHandle(
        "g_log_writer_is_journald",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Check whether the given {@code output_fd} file descriptor is a connection to the
     * systemd journal, or something else (like a log file or {@code stdout} or
     * {@code stderr}).
     * <p>
     * Invalid file descriptors are accepted and return {@code false}, which allows for
     * the following construct without needing any additional error handling:
     * <pre>{@code <!-- language="C" -->
     *   is_journald = g_log_writer_is_journald (fileno (stderr));
     * }</pre>
     */
    public static boolean logWriterIsJournald(int outputFd) {
        try {
            var RESULT = (int) g_log_writer_is_journald.invokeExact(outputFd);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_writer_journald = Interop.downcallHandle(
        "g_log_writer_journald",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Format a structured log message and send it to the systemd journal as a set
     * of key–value pairs. All fields are sent to the journal, but if a field has
     * length zero (indicating program-specific data) then only its key will be
     * sent.
     * <p>
     * This is suitable for use as a {@link LogWriterFunc}.
     * <p>
     * If GLib has been compiled without systemd support, this function is still
     * defined, but will always return {@link LogWriterOutput#UNHANDLED}.
     */
    public static LogWriterOutput logWriterJournald(LogLevelFlags logLevel, LogField[] fields, long nFields, java.lang.foreign.MemoryAddress userData) {
        try {
            var RESULT = (int) g_log_writer_journald.invokeExact(logLevel.getValue(), Interop.allocateNativeArray(fields).handle(), nFields, userData);
            return new LogWriterOutput(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_writer_standard_streams = Interop.downcallHandle(
        "g_log_writer_standard_streams",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Format a structured log message and print it to either {@code stdout} or {@code stderr},
     * depending on its log level. {@link LogLevelFlags#LEVEL_INFO} and {@link LogLevelFlags#LEVEL_DEBUG} messages
     * are sent to {@code stdout}, or to {@code stderr} if requested by
     * g_log_writer_default_set_use_stderr();
     * all other log levels are sent to {@code stderr}. Only fields
     * which are understood by this function are included in the formatted string
     * which is printed.
     * <p>
     * If the output stream supports ANSI color escape sequences, they will be used
     * in the output.
     * <p>
     * A trailing new-line character is added to the log message when it is printed.
     * <p>
     * This is suitable for use as a {@link LogWriterFunc}.
     */
    public static LogWriterOutput logWriterStandardStreams(LogLevelFlags logLevel, LogField[] fields, long nFields, java.lang.foreign.MemoryAddress userData) {
        try {
            var RESULT = (int) g_log_writer_standard_streams.invokeExact(logLevel.getValue(), Interop.allocateNativeArray(fields).handle(), nFields, userData);
            return new LogWriterOutput(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_log_writer_supports_color = Interop.downcallHandle(
        "g_log_writer_supports_color",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Check whether the given {@code output_fd} file descriptor supports ANSI color
     * escape sequences. If so, they can safely be used when formatting log
     * messages.
     */
    public static boolean logWriterSupportsColor(int outputFd) {
        try {
            var RESULT = (int) g_log_writer_supports_color.invokeExact(outputFd);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_logv = Interop.downcallHandle(
        "g_logv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Logs an error or debugging message.
     * <p>
     * If the log level has been set as fatal, G_BREAKPOINT() is called
     * to terminate the program. See the documentation for G_BREAKPOINT() for
     * details of the debugging options this provides.
     * <p>
     * If g_log_default_handler() is used as the log handler function, a new-line
     * character will automatically be appended to @..., and need not be entered
     * manually.
     * <p>
     * If [structured logging is enabled][using-structured-logging] this will
     * output via the structured log writer function (see g_log_set_writer_func()).
     */
    public static void logv(java.lang.String logDomain, LogLevelFlags logLevel, java.lang.String format, VaList args) {
        try {
            g_logv.invokeExact(Interop.allocateNativeString(logDomain).handle(), logLevel.getValue(), Interop.allocateNativeString(format).handle(), args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_default = Interop.downcallHandle(
        "g_main_context_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the global default main context. This is the main context
     * used for main loop functions when a main loop is not explicitly
     * specified, and corresponds to the "main" main loop. See also
     * g_main_context_get_thread_default().
     */
    public static MainContext mainContextDefault() {
        try {
            var RESULT = (MemoryAddress) g_main_context_default.invokeExact();
            return new MainContext(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_get_thread_default = Interop.downcallHandle(
        "g_main_context_get_thread_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the thread-default {@link MainContext} for this thread. Asynchronous
     * operations that want to be able to be run in contexts other than
     * the default one should call this method or
     * g_main_context_ref_thread_default() to get a {@link MainContext} to add
     * their {@code GSources} to. (Note that even in single-threaded
     * programs applications may sometimes want to temporarily push a
     * non-default context, so it is not safe to assume that this will
     * always return {@code null} if you are running in the default thread.)
     * <p>
     * If you need to hold a reference on the context, use
     * g_main_context_ref_thread_default() instead.
     */
    public static MainContext mainContextGetThreadDefault() {
        try {
            var RESULT = (MemoryAddress) g_main_context_get_thread_default.invokeExact();
            return new MainContext(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_ref_thread_default = Interop.downcallHandle(
        "g_main_context_ref_thread_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the thread-default {@link MainContext} for this thread, as with
     * g_main_context_get_thread_default(), but also adds a reference to
     * it with g_main_context_ref(). In addition, unlike
     * g_main_context_get_thread_default(), if the thread-default context
     * is the global default context, this will return that {@link MainContext}
     * (with a ref added to it) rather than returning {@code null}.
     */
    public static MainContext mainContextRefThreadDefault() {
        try {
            var RESULT = (MemoryAddress) g_main_context_ref_thread_default.invokeExact();
            return new MainContext(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_current_source = Interop.downcallHandle(
        "g_main_current_source",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the currently firing source for this thread.
     */
    public static Source mainCurrentSource() {
        try {
            var RESULT = (MemoryAddress) g_main_current_source.invokeExact();
            return new Source(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_depth = Interop.downcallHandle(
        "g_main_depth",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the depth of the stack of calls to
     * g_main_context_dispatch() on any {@link MainContext} in the current thread.
     *  That is, when called from the toplevel, it gives 0. When
     * called from within a callback from g_main_context_iteration()
     * (or g_main_loop_run(), etc.) it returns 1. When called from within
     * a callback to a recursive call to g_main_context_iteration(),
     * it returns 2. And so forth.
     * <p>
     * This function is useful in a situation like the following:
     * Imagine an extremely simple "garbage collected" system.
     * <p>
     * <pre>{@code <!-- language="C" -->
     * static GList *free_list;
     * 
     * gpointer
     * allocate_memory (gsize size)
     * {
     *   gpointer result = g_malloc (size);
     *   free_list = g_list_prepend (free_list, result);
     *   return result;
     * }
     * 
     * void
     * free_allocated_memory (void)
     * {
     *   GList *l;
     *   for (l = free_list; l; l = l->next);
     *     g_free (l->data);
     *   g_list_free (free_list);
     *   free_list = NULL;
     *  }
     * 
     * [...]
     * 
     * while (TRUE);
     *  {
     *    g_main_context_iteration (NULL, TRUE);
     *    free_allocated_memory();
     *   }
     * }</pre>
     * <p>
     * This works from an application, however, if you want to do the same
     * thing from a library, it gets more difficult, since you no longer
     * control the main loop. You might think you can simply use an idle
     * function to make the call to free_allocated_memory(), but that
     * doesn't work, since the idle function could be called from a
     * recursive callback. This can be fixed by using g_main_depth()
     * <p>
     * <pre>{@code <!-- language="C" -->
     * gpointer
     * allocate_memory (gsize size)
     * {
     *   FreeListBlock *block = g_new (FreeListBlock, 1);
     *   block->mem = g_malloc (size);
     *   block->depth = g_main_depth ();
     *   free_list = g_list_prepend (free_list, block);
     *   return block->mem;
     * }
     * 
     * void
     * free_allocated_memory (void)
     * {
     *   GList *l;
     *   
     *   int depth = g_main_depth ();
     *   for (l = free_list; l; );
     *     {
     *       GList *next = l->next;
     *       FreeListBlock *block = l->data;
     *       if (block->depth > depth)
     *         {
     *           g_free (block->mem);
     *           g_free (block);
     *           free_list = g_list_delete_link (free_list, l);
     *         }
     *               
     *       l = next;
     *     }
     *   }
     * }</pre>
     * <p>
     * There is a temptation to use g_main_depth() to solve
     * problems with reentrancy. For instance, while waiting for data
     * to be received from the network in response to a menu item,
     * the menu item might be selected again. It might seem that
     * one could make the menu item's callback return immediately
     * and do nothing if g_main_depth() returns a value greater than 1.
     * However, this should be avoided since the user then sees selecting
     * the menu item do nothing. Furthermore, you'll find yourself adding
     * these checks all over your code, since there are doubtless many,
     * many things that the user could do. Instead, you can use the
     * following techniques:
     * <p>
     * 1. Use gtk_widget_set_sensitive() or modal dialogs to prevent
     *    the user from interacting with elements while the main
     *    loop is recursing.
     * <p>
     * 2. Avoid main loop recursion in situations where you can't handle
     *    arbitrary  callbacks. Instead, structure your code so that you
     *    simply return to the main loop and then get called again when
     *    there is more work to do.
     */
    public static int mainDepth() {
        try {
            var RESULT = (int) g_main_depth.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_malloc = Interop.downcallHandle(
        "g_malloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Allocates {@code n_bytes} bytes of memory.
     * If {@code n_bytes} is 0 it returns {@code null}.
     */
    public static java.lang.foreign.MemoryAddress malloc(long nBytes) {
        try {
            var RESULT = (MemoryAddress) g_malloc.invokeExact(nBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_malloc0 = Interop.downcallHandle(
        "g_malloc0",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Allocates {@code n_bytes} bytes of memory, initialized to 0's.
     * If {@code n_bytes} is 0 it returns {@code null}.
     */
    public static java.lang.foreign.MemoryAddress malloc0(long nBytes) {
        try {
            var RESULT = (MemoryAddress) g_malloc0.invokeExact(nBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_malloc0_n = Interop.downcallHandle(
        "g_malloc0_n",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is similar to g_malloc0(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static java.lang.foreign.MemoryAddress malloc0N(long nBlocks, long nBlockBytes) {
        try {
            var RESULT = (MemoryAddress) g_malloc0_n.invokeExact(nBlocks, nBlockBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_malloc_n = Interop.downcallHandle(
        "g_malloc_n",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is similar to g_malloc(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static java.lang.foreign.MemoryAddress mallocN(long nBlocks, long nBlockBytes) {
        try {
            var RESULT = (MemoryAddress) g_malloc_n.invokeExact(nBlocks, nBlockBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_markup_error_quark = Interop.downcallHandle(
        "g_markup_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark markupErrorQuark() {
        try {
            var RESULT = (int) g_markup_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_markup_escape_text = Interop.downcallHandle(
        "g_markup_escape_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Escapes text so that the markup parser will parse it verbatim.
     * Less than, greater than, ampersand, etc. are replaced with the
     * corresponding entities. This function would typically be used
     * when writing out a file to be parsed with the markup parser.
     * <p>
     * Note that this function doesn't protect whitespace and line endings
     * from being processed according to the XML rules for normalization
     * of line endings and attribute values.
     * <p>
     * Note also that this function will produce character references in
     * the range of &{@code x1}; ... &{@code x1f}; for all control sequences
     * except for tabstop, newline and carriage return.  The character
     * references in this range are not valid XML 1.0, but they are
     * valid XML 1.1 and will be accepted by the GMarkup parser.
     */
    public static java.lang.String markupEscapeText(java.lang.String text, long length) {
        try {
            var RESULT = (MemoryAddress) g_markup_escape_text.invokeExact(Interop.allocateNativeString(text).handle(), length);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_markup_vprintf_escaped = Interop.downcallHandle(
        "g_markup_vprintf_escaped",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Formats the data in {@code args} according to {@code format}, escaping
     * all string and character arguments in the fashion
     * of g_markup_escape_text(). See g_markup_printf_escaped().
     */
    public static java.lang.String markupVprintfEscaped(java.lang.String format, VaList args) {
        try {
            var RESULT = (MemoryAddress) g_markup_vprintf_escaped.invokeExact(Interop.allocateNativeString(format).handle(), args);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_memdup2 = Interop.downcallHandle(
        "g_memdup2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Allocates {@code byte_size} bytes of memory, and copies {@code byte_size} bytes into it
     * from {@code mem}. If {@code mem} is {@code null} it returns {@code null}.
     * <p>
     * This replaces g_memdup(), which was prone to integer overflows when
     * converting the argument from a {@code gsize} to a {@code guint}.
     */
    public static java.lang.foreign.MemoryAddress memdup2(java.lang.foreign.MemoryAddress mem, long byteSize) {
        try {
            var RESULT = (MemoryAddress) g_memdup2.invokeExact(mem, byteSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_mkdir_with_parents = Interop.downcallHandle(
        "g_mkdir_with_parents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a directory if it doesn't already exist. Create intermediate
     * parent directories as needed, too.
     */
    public static int mkdirWithParents(java.lang.String pathname, int mode) {
        try {
            var RESULT = (int) g_mkdir_with_parents.invokeExact(Interop.allocateNativeString(pathname).handle(), mode);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_mkdtemp = Interop.downcallHandle(
        "g_mkdtemp",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a temporary directory. See the mkdtemp() documentation
     * on most UNIX-like systems.
     * <p>
     * The parameter is a string that should follow the rules for
     * mkdtemp() templates, i.e. contain the string "XXXXXX".
     * g_mkdtemp() is slightly more flexible than mkdtemp() in that the
     * sequence does not have to occur at the very end of the template.
     * The X string will be modified to form the name of a directory that
     * didn't exist.
     * The string should be in the GLib file name encoding. Most importantly,
     * on Windows it should be in UTF-8.
     * <p>
     * If you are going to be creating a temporary directory inside the
     * directory returned by g_get_tmp_dir(), you might want to use
     * g_dir_make_tmp() instead.
     */
    public static java.lang.String mkdtemp(java.lang.String tmpl) {
        try {
            var RESULT = (MemoryAddress) g_mkdtemp.invokeExact(Interop.allocateNativeString(tmpl).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_mkdtemp_full = Interop.downcallHandle(
        "g_mkdtemp_full",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a temporary directory. See the mkdtemp() documentation
     * on most UNIX-like systems.
     * <p>
     * The parameter is a string that should follow the rules for
     * mkdtemp() templates, i.e. contain the string "XXXXXX".
     * g_mkdtemp_full() is slightly more flexible than mkdtemp() in that the
     * sequence does not have to occur at the very end of the template
     * and you can pass a {@code mode}. The X string will be modified to form
     * the name of a directory that didn't exist. The string should be
     * in the GLib file name encoding. Most importantly, on Windows it
     * should be in UTF-8.
     * <p>
     * If you are going to be creating a temporary directory inside the
     * directory returned by g_get_tmp_dir(), you might want to use
     * g_dir_make_tmp() instead.
     */
    public static java.lang.String mkdtempFull(java.lang.String tmpl, int mode) {
        try {
            var RESULT = (MemoryAddress) g_mkdtemp_full.invokeExact(Interop.allocateNativeString(tmpl).handle(), mode);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_mkstemp = Interop.downcallHandle(
        "g_mkstemp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens a temporary file. See the mkstemp() documentation
     * on most UNIX-like systems.
     * <p>
     * The parameter is a string that should follow the rules for
     * mkstemp() templates, i.e. contain the string "XXXXXX".
     * g_mkstemp() is slightly more flexible than mkstemp() in that the
     * sequence does not have to occur at the very end of the template.
     * The X string will be modified to form the name of a file that
     * didn't exist. The string should be in the GLib file name encoding.
     * Most importantly, on Windows it should be in UTF-8.
     */
    public static int mkstemp(java.lang.String tmpl) {
        try {
            var RESULT = (int) g_mkstemp.invokeExact(Interop.allocateNativeString(tmpl).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_mkstemp_full = Interop.downcallHandle(
        "g_mkstemp_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Opens a temporary file. See the mkstemp() documentation
     * on most UNIX-like systems.
     * <p>
     * The parameter is a string that should follow the rules for
     * mkstemp() templates, i.e. contain the string "XXXXXX".
     * g_mkstemp_full() is slightly more flexible than mkstemp()
     * in that the sequence does not have to occur at the very end of the
     * template and you can pass a {@code mode} and additional {@code flags}. The X
     * string will be modified to form the name of a file that didn't exist.
     * The string should be in the GLib file name encoding. Most importantly,
     * on Windows it should be in UTF-8.
     */
    public static int mkstempFull(java.lang.String tmpl, int flags, int mode) {
        try {
            var RESULT = (int) g_mkstemp_full.invokeExact(Interop.allocateNativeString(tmpl).handle(), flags, mode);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_nullify_pointer = Interop.downcallHandle(
        "g_nullify_pointer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Set the pointer at the specified location to {@code null}.
     */
    public static void nullifyPointer(java.lang.foreign.MemoryAddress nullifyLocation) {
        try {
            g_nullify_pointer.invokeExact(nullifyLocation);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_number_parser_error_quark = Interop.downcallHandle(
        "g_number_parser_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark numberParserErrorQuark() {
        try {
            var RESULT = (int) g_number_parser_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_on_error_query = Interop.downcallHandle(
        "g_on_error_query",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Prompts the user with
     * {@code [E]xit, [H]alt, show [S]tack trace or [P]roceed}.
     * This function is intended to be used for debugging use only.
     * The following example shows how it can be used together with
     * the g_log() functions.
     * <p>
     * <pre>{@code <!-- language="C" -->
     * #include <glib.h>
     * 
     * static void
     * log_handler (const gchar   *log_domain,
     *              GLogLevelFlags log_level,
     *              const gchar   *message,
     *              gpointer       user_data)
     * {
     *   g_log_default_handler (log_domain, log_level, message, user_data);
     * 
     *   g_on_error_query (MY_PROGRAM_NAME);
     * }
     * 
     * int
     * main (int argc, char *argv[])
     * {
     *   g_log_set_handler (MY_LOG_DOMAIN,
     *                      G_LOG_LEVEL_WARNING |
     *                      G_LOG_LEVEL_ERROR |
     *                      G_LOG_LEVEL_CRITICAL,
     *                      log_handler,
     *                      NULL);
     *   ...
     * }</pre>
     * <p>
     * If "[E]xit" is selected, the application terminates with a call
     * to _exit(0).
     * <p>
     * If "[S]tack" trace is selected, g_on_error_stack_trace() is called.
     * This invokes gdb, which attaches to the current process and shows
     * a stack trace. The prompt is then shown again.
     * <p>
     * If "[P]roceed" is selected, the function returns.
     * <p>
     * This function may cause different actions on non-UNIX platforms.
     * <p>
     * On Windows consider using the {@code G_DEBUGGER} environment
     * variable (see <a href="glib-running.html)">Running GLib Applications</a> and
     * calling g_on_error_stack_trace() instead.
     */
    public static void onErrorQuery(java.lang.String prgName) {
        try {
            g_on_error_query.invokeExact(Interop.allocateNativeString(prgName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_on_error_stack_trace = Interop.downcallHandle(
        "g_on_error_stack_trace",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Invokes gdb, which attaches to the current process and shows a
     * stack trace. Called by g_on_error_query() when the "[S]tack trace"
     * option is selected. You can get the current process's program name
     * with g_get_prgname(), assuming that you have called gtk_init() or
     * gdk_init().
     * <p>
     * This function may cause different actions on non-UNIX platforms.
     * <p>
     * When running on Windows, this function is <strong>not</strong> called by
     * g_on_error_query(). If called directly, it will raise an
     * exception, which will crash the program. If the {@code G_DEBUGGER} environment
     * variable is set, a debugger will be invoked to attach and
     * handle that exception (see <a href="glib-running.html)">Running GLib Applications</a>.
     */
    public static void onErrorStackTrace(java.lang.String prgName) {
        try {
            g_on_error_stack_trace.invokeExact(Interop.allocateNativeString(prgName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_once_init_enter = Interop.downcallHandle(
        "g_once_init_enter",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Function to be called when starting a critical initialization
     * section. The argument {@code location} must point to a static
     * 0-initialized variable that will be set to a value other than 0 at
     * the end of the initialization section. In combination with
     * g_once_init_leave() and the unique address {@code value_location}, it can
     * be ensured that an initialization section will be executed only once
     * during a program's life time, and that concurrent threads are
     * blocked until initialization completed. To be used in constructs
     * like this:
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   static gsize initialization_value = 0;
     * 
     *   if (g_once_init_enter (&initialization_value))
     *     {
     *       gsize setup_value = 42; // initialization code here
     * 
     *       g_once_init_leave (&initialization_value, setup_value);
     *     }
     * 
     *   // use initialization_value here
     * }</pre>
     * <p>
     * While {@code location} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static boolean onceInitEnter(java.lang.foreign.MemoryAddress location) {
        try {
            var RESULT = (int) g_once_init_enter.invokeExact(location);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_once_init_leave = Interop.downcallHandle(
        "g_once_init_leave",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Counterpart to g_once_init_enter(). Expects a location of a static
     * 0-initialized initialization variable, and an initialization value
     * other than 0. Sets the variable to the initialization value, and
     * releases concurrent threads blocking in g_once_init_enter() on this
     * initialization variable.
     * <p>
     * While {@code location} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     */
    public static void onceInitLeave(java.lang.foreign.MemoryAddress location, long result) {
        try {
            g_once_init_leave.invokeExact(location, result);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_option_error_quark = Interop.downcallHandle(
        "g_option_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark optionErrorQuark() {
        try {
            var RESULT = (int) g_option_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_parse_debug_string = Interop.downcallHandle(
        "g_parse_debug_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses a string containing debugging options
     * into a {@code guint} containing bit flags. This is used
     * within GDK and GTK+ to parse the debug options passed on the
     * command line or through environment variables.
     * <p>
     * If {@code string} is equal to "all", all flags are set. Any flags
     * specified along with "all" in {@code string} are inverted; thus,
     * "all,foo,bar" or "foo,bar,all" sets all flags except those
     * corresponding to "foo" and "bar".
     * <p>
     * If {@code string} is equal to "help", all the available keys in {@code keys}
     * are printed out to standard error.
     */
    public static int parseDebugString(java.lang.String string, DebugKey[] keys, int nkeys) {
        try {
            var RESULT = (int) g_parse_debug_string.invokeExact(Interop.allocateNativeString(string).handle(), Interop.allocateNativeArray(keys).handle(), nkeys);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_path_get_basename = Interop.downcallHandle(
        "g_path_get_basename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the last component of the filename.
     * <p>
     * If {@code file_name} ends with a directory separator it gets the component
     * before the last slash. If {@code file_name} consists only of directory
     * separators (and on Windows, possibly a drive letter), a single
     * separator is returned. If {@code file_name} is empty, it gets ".".
     */
    public static java.lang.String pathGetBasename(java.lang.String fileName) {
        try {
            var RESULT = (MemoryAddress) g_path_get_basename.invokeExact(Interop.allocateNativeString(fileName).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_path_get_dirname = Interop.downcallHandle(
        "g_path_get_dirname",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the directory components of a file name. For example, the directory
     * component of {@code /usr/bin/test} is {@code /usr/bin}. The directory component of {@code /}
     * is {@code /}.
     * <p>
     * If the file name has no directory components "." is returned.
     * The returned string should be freed when no longer needed.
     */
    public static java.lang.String pathGetDirname(java.lang.String fileName) {
        try {
            var RESULT = (MemoryAddress) g_path_get_dirname.invokeExact(Interop.allocateNativeString(fileName).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_path_is_absolute = Interop.downcallHandle(
        "g_path_is_absolute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the given {@code file_name} is an absolute file name.
     * Note that this is a somewhat vague concept on Windows.
     * <p>
     * On POSIX systems, an absolute file name is well-defined. It always
     * starts from the single root directory. For example "/usr/local".
     * <p>
     * On Windows, the concepts of current drive and drive-specific
     * current directory introduce vagueness. This function interprets as
     * an absolute file name one that either begins with a directory
     * separator such as "\\Users\\tml" or begins with the root on a drive,
     * for example "C:\\Windows". The first case also includes UNC paths
     * such as "\\\\\\\\myserver\\docs\\foo". In all cases, either slashes or
     * backslashes are accepted.
     * <p>
     * Note that a file name relative to the current drive root does not
     * truly specify a file uniquely over time and across processes, as
     * the current drive is a per-process value and can be changed.
     * <p>
     * File names relative the current directory on some specific drive,
     * such as "D:foo/bar", are not interpreted as absolute by this
     * function, but they obviously are not relative to the normal current
     * directory as returned by getcwd() or g_get_current_dir()
     * either. Such paths should be avoided, or need to be handled using
     * Windows-specific code.
     */
    public static boolean pathIsAbsolute(java.lang.String fileName) {
        try {
            var RESULT = (int) g_path_is_absolute.invokeExact(Interop.allocateNativeString(fileName).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_path_skip_root = Interop.downcallHandle(
        "g_path_skip_root",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a pointer into {@code file_name} after the root component,
     * i.e. after the "/" in UNIX or "C:\\" under Windows. If {@code file_name}
     * is not an absolute path it returns {@code null}.
     */
    public static java.lang.String pathSkipRoot(java.lang.String fileName) {
        try {
            var RESULT = (MemoryAddress) g_path_skip_root.invokeExact(Interop.allocateNativeString(fileName).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_pattern_match_simple = Interop.downcallHandle(
        "g_pattern_match_simple",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Matches a string against a pattern given as a string. If this
     * function is to be called in a loop, it's more efficient to compile
     * the pattern once with g_pattern_spec_new() and call
     * g_pattern_match_string() repeatedly.
     */
    public static boolean patternMatchSimple(java.lang.String pattern, java.lang.String string) {
        try {
            var RESULT = (int) g_pattern_match_simple.invokeExact(Interop.allocateNativeString(pattern).handle(), Interop.allocateNativeString(string).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_pointer_bit_lock = Interop.downcallHandle(
        "g_pointer_bit_lock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This is equivalent to g_bit_lock, but working on pointers (or other
     * pointer-sized values).
     * <p>
     * For portability reasons, you may only lock on the bottom 32 bits of
     * the pointer.
     * <p>
     * While {@code address} has a {@code volatile} qualifier, this is a historical
     * artifact and the argument passed to it should not be {@code volatile}.
     */
    public static void pointerBitLock(java.lang.foreign.MemoryAddress address, int lockBit) {
        try {
            g_pointer_bit_lock.invokeExact(address, lockBit);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_pointer_bit_trylock = Interop.downcallHandle(
        "g_pointer_bit_trylock",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This is equivalent to g_bit_trylock(), but working on pointers (or
     * other pointer-sized values).
     * <p>
     * For portability reasons, you may only lock on the bottom 32 bits of
     * the pointer.
     * <p>
     * While {@code address} has a {@code volatile} qualifier, this is a historical
     * artifact and the argument passed to it should not be {@code volatile}.
     */
    public static boolean pointerBitTrylock(java.lang.foreign.MemoryAddress address, int lockBit) {
        try {
            var RESULT = (int) g_pointer_bit_trylock.invokeExact(address, lockBit);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_pointer_bit_unlock = Interop.downcallHandle(
        "g_pointer_bit_unlock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This is equivalent to g_bit_unlock, but working on pointers (or other
     * pointer-sized values).
     * <p>
     * For portability reasons, you may only lock on the bottom 32 bits of
     * the pointer.
     * <p>
     * While {@code address} has a {@code volatile} qualifier, this is a historical
     * artifact and the argument passed to it should not be {@code volatile}.
     */
    public static void pointerBitUnlock(java.lang.foreign.MemoryAddress address, int lockBit) {
        try {
            g_pointer_bit_unlock.invokeExact(address, lockBit);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_poll = Interop.downcallHandle(
        "g_poll",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Polls {@code fds}, as with the poll() system call, but portably. (On
     * systems that don't have poll(), it is emulated using select().)
     * This is used internally by {@link MainContext}, but it can be called
     * directly if you need to block until a file descriptor is ready, but
     * don't want to run the full main loop.
     * <p>
     * Each element of {@code fds} is a {@link PollFD} describing a single file
     * descriptor to poll. The {@code fd} field indicates the file descriptor,
     * and the {@code events} field indicates the events to poll for. On return,
     * the {@code revents} fields will be filled with the events that actually
     * occurred.
     * <p>
     * On POSIX systems, the file descriptors in {@code fds} can be any sort of
     * file descriptor, but the situation is much more complicated on
     * Windows. If you need to use g_poll() in code that has to run on
     * Windows, the easiest solution is to construct all of your
     * {@code GPollFDs} with g_io_channel_win32_make_pollfd().
     */
    public static int poll(PollFD fds, int nfds, int timeout) {
        try {
            var RESULT = (int) g_poll.invokeExact(fds.handle(), nfds, timeout);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_prefix_error_literal = Interop.downcallHandle(
        "g_prefix_error_literal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prefixes {@code prefix} to an existing error message. If {@code err} or *{@code err} is
     * {@code null} (i.e.: no error variable) then do nothing.
     */
    public static void prefixErrorLiteral(Error[] err, java.lang.String prefix) {
        try {
            g_prefix_error_literal.invokeExact(Interop.allocateNativeArray(err).handle(), Interop.allocateNativeString(prefix).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_printf_string_upper_bound = Interop.downcallHandle(
        "g_printf_string_upper_bound",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calculates the maximum space needed to store the output
     * of the sprintf() function.
     */
    public static long printfStringUpperBound(java.lang.String format, VaList args) {
        try {
            var RESULT = (long) g_printf_string_upper_bound.invokeExact(Interop.allocateNativeString(format).handle(), args);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_propagate_error = Interop.downcallHandle(
        "g_propagate_error",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code dest} is {@code null}, free {@code src}; otherwise, moves {@code src} into *{@code dest}.
     * The error variable {@code dest} points to must be {@code null}.
     * <p>
     * {@code src} must be non-{@code null}.
     * <p>
     * Note that {@code src} is no longer valid after this call. If you want
     * to keep using the same GError*, you need to set it to {@code null}
     * after calling this function on it.
     */
    public static void propagateError(PointerProxy<Error> dest, Error src) {
        try {
            g_propagate_error.invokeExact(dest.handle(), src.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ptr_array_find = Interop.downcallHandle(
        "g_ptr_array_find",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code needle} exists in {@code haystack}. If the element is found, {@code true} is
     * returned and the element’s index is returned in {@code index_} (if non-{@code null}).
     * Otherwise, {@code false} is returned and {@code index_} is undefined. If {@code needle} exists
     * multiple times in {@code haystack}, the index of the first instance is returned.
     * <p>
     * This does pointer comparisons only. If you want to use more complex equality
     * checks, such as string comparisons, use g_ptr_array_find_with_equal_func().
     */
    public static boolean ptrArrayFind(java.lang.foreign.MemoryAddress[] haystack, java.lang.foreign.MemoryAddress needle, PointerInteger index) {
        try {
            var RESULT = (int) g_ptr_array_find.invokeExact(Interop.allocateNativeArray(haystack).handle(), needle, index.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_qsort_with_data = Interop.downcallHandle(
        "g_qsort_with_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is just like the standard C qsort() function, but
     * the comparison routine accepts a user data argument.
     * <p>
     * This is guaranteed to be a stable sort since version 2.32.
     */
    public static void qsortWithData(java.lang.foreign.MemoryAddress pbase, int totalElems, long size, CompareDataFunc compareFunc) {
        try {
            g_qsort_with_data.invokeExact(pbase, totalElems, size, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_quark_from_static_string = Interop.downcallHandle(
        "g_quark_from_static_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link Quark} identifying the given (static) string. If the
     * string does not currently have an associated {@link Quark}, a new {@link Quark}
     * is created, linked to the given string.
     * <p>
     * Note that this function is identical to g_quark_from_string() except
     * that if a new {@link Quark} is created the string itself is used rather
     * than a copy. This saves memory, but can only be used if the string
     * will continue to exist until the program terminates. It can be used
     * with statically allocated strings in the main program, but not with
     * statically allocated memory in dynamically loaded modules, if you
     * expect to ever unload the module again (e.g. do not use this
     * function in GTK+ theme engines).
     * <p>
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     */
    public static Quark quarkFromStaticString(java.lang.String string) {
        try {
            var RESULT = (int) g_quark_from_static_string.invokeExact(Interop.allocateNativeString(string).handle());
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_quark_from_string = Interop.downcallHandle(
        "g_quark_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link Quark} identifying the given string. If the string does
     * not currently have an associated {@link Quark}, a new {@link Quark} is created,
     * using a copy of the string.
     * <p>
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     */
    public static Quark quarkFromString(java.lang.String string) {
        try {
            var RESULT = (int) g_quark_from_string.invokeExact(Interop.allocateNativeString(string).handle());
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_quark_to_string = Interop.downcallHandle(
        "g_quark_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the string associated with the given {@link Quark}.
     */
    public static java.lang.String quarkToString(Quark quark) {
        try {
            var RESULT = (MemoryAddress) g_quark_to_string.invokeExact(quark.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_quark_try_string = Interop.downcallHandle(
        "g_quark_try_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link Quark} associated with the given string, or 0 if string is
     * {@code null} or it has no associated {@link Quark}.
     * <p>
     * If you want the GQuark to be created if it doesn't already exist,
     * use g_quark_from_string() or g_quark_from_static_string().
     * <p>
     * This function must not be used before library constructors have finished
     * running.
     */
    public static Quark quarkTryString(java.lang.String string) {
        try {
            var RESULT = (int) g_quark_try_string.invokeExact(Interop.allocateNativeString(string).handle());
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_random_double = Interop.downcallHandle(
        "g_random_double",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Returns a random {@code gdouble} equally distributed over the range [0..1).
     */
    public static double randomDouble() {
        try {
            var RESULT = (double) g_random_double.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_random_double_range = Interop.downcallHandle(
        "g_random_double_range",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Returns a random {@code gdouble} equally distributed over the range
     * [{@code begin}..{@code end}).
     */
    public static double randomDoubleRange(double begin, double end) {
        try {
            var RESULT = (double) g_random_double_range.invokeExact(begin, end);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_random_int = Interop.downcallHandle(
        "g_random_int",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Return a random {@code guint32} equally distributed over the range
     * [0..2^32-1].
     */
    public static int randomInt() {
        try {
            var RESULT = (int) g_random_int.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_random_int_range = Interop.downcallHandle(
        "g_random_int_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns a random {@code gint32} equally distributed over the range
     * {@code end-1}.
     */
    public static int randomIntRange(int begin, int end) {
        try {
            var RESULT = (int) g_random_int_range.invokeExact(begin, end);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_random_set_seed = Interop.downcallHandle(
        "g_random_set_seed",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the seed for the global random number generator, which is used
     * by the g_random_* functions, to {@code seed}.
     */
    public static void randomSetSeed(int seed) {
        try {
            g_random_set_seed.invokeExact(seed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rc_box_acquire = Interop.downcallHandle(
        "g_rc_box_acquire",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Acquires a reference on the data pointed by {@code mem_block}.
     */
    public static java.lang.foreign.MemoryAddress rcBoxAcquire(java.lang.foreign.MemoryAddress memBlock) {
        try {
            var RESULT = (MemoryAddress) g_rc_box_acquire.invokeExact(memBlock);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rc_box_alloc = Interop.downcallHandle(
        "g_rc_box_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Allocates {@code block_size} bytes of memory, and adds reference
     * counting semantics to it.
     * <p>
     * The data will be freed when its reference count drops to
     * zero.
     * <p>
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     */
    public static java.lang.foreign.MemoryAddress rcBoxAlloc(long blockSize) {
        try {
            var RESULT = (MemoryAddress) g_rc_box_alloc.invokeExact(blockSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rc_box_alloc0 = Interop.downcallHandle(
        "g_rc_box_alloc0",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Allocates {@code block_size} bytes of memory, and adds reference
     * counting semantics to it.
     * <p>
     * The contents of the returned data is set to zero.
     * <p>
     * The data will be freed when its reference count drops to
     * zero.
     * <p>
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     */
    public static java.lang.foreign.MemoryAddress rcBoxAlloc0(long blockSize) {
        try {
            var RESULT = (MemoryAddress) g_rc_box_alloc0.invokeExact(blockSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rc_box_dup = Interop.downcallHandle(
        "g_rc_box_dup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Allocates a new block of data with reference counting
     * semantics, and copies {@code block_size} bytes of {@code mem_block}
     * into it.
     */
    public static java.lang.foreign.MemoryAddress rcBoxDup(long blockSize, java.lang.foreign.MemoryAddress memBlock) {
        try {
            var RESULT = (MemoryAddress) g_rc_box_dup.invokeExact(blockSize, memBlock);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rc_box_get_size = Interop.downcallHandle(
        "g_rc_box_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the size of the reference counted data pointed by {@code mem_block}.
     */
    public static long rcBoxGetSize(java.lang.foreign.MemoryAddress memBlock) {
        try {
            var RESULT = (long) g_rc_box_get_size.invokeExact(memBlock);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rc_box_release = Interop.downcallHandle(
        "g_rc_box_release",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases a reference on the data pointed by {@code mem_block}.
     * <p>
     * If the reference was the last one, it will free the
     * resources allocated for {@code mem_block}.
     */
    public static void rcBoxRelease(java.lang.foreign.MemoryAddress memBlock) {
        try {
            g_rc_box_release.invokeExact(memBlock);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_realloc = Interop.downcallHandle(
        "g_realloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Reallocates the memory pointed to by {@code mem}, so that it now has space for
     * {@code n_bytes} bytes of memory. It returns the new address of the memory, which may
     * have been moved. {@code mem} may be {@code null}, in which case it's considered to
     * have zero-length. {@code n_bytes} may be 0, in which case {@code null} will be returned
     * and {@code mem} will be freed unless it is {@code null}.
     */
    public static java.lang.foreign.MemoryAddress realloc(java.lang.foreign.MemoryAddress mem, long nBytes) {
        try {
            var RESULT = (MemoryAddress) g_realloc.invokeExact(mem, nBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_realloc_n = Interop.downcallHandle(
        "g_realloc_n",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is similar to g_realloc(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static java.lang.foreign.MemoryAddress reallocN(java.lang.foreign.MemoryAddress mem, long nBlocks, long nBlockBytes) {
        try {
            var RESULT = (MemoryAddress) g_realloc_n.invokeExact(mem, nBlocks, nBlockBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_count_compare = Interop.downcallHandle(
        "g_ref_count_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Compares the current value of {@code rc} with {@code val}.
     */
    public static boolean refCountCompare(PointerInteger rc, int val) {
        try {
            var RESULT = (int) g_ref_count_compare.invokeExact(rc.handle(), val);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_count_dec = Interop.downcallHandle(
        "g_ref_count_dec",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count.
     * <p>
     * If {@code true} is returned, the reference count reached 0. After this point, {@code rc}
     * is an undefined state and must be reinitialized with
     * g_ref_count_init() to be used again.
     */
    public static boolean refCountDec(PointerInteger rc) {
        try {
            var RESULT = (int) g_ref_count_dec.invokeExact(rc.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_count_inc = Interop.downcallHandle(
        "g_ref_count_inc",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count.
     */
    public static void refCountInc(PointerInteger rc) {
        try {
            g_ref_count_inc.invokeExact(rc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_count_init = Interop.downcallHandle(
        "g_ref_count_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a reference count variable to 1.
     */
    public static void refCountInit(PointerInteger rc) {
        try {
            g_ref_count_init.invokeExact(rc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_string_acquire = Interop.downcallHandle(
        "g_ref_string_acquire",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Acquires a reference on a string.
     */
    public static java.lang.String refStringAcquire(java.lang.String str) {
        try {
            var RESULT = (MemoryAddress) g_ref_string_acquire.invokeExact(Interop.allocateNativeString(str).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_string_length = Interop.downcallHandle(
        "g_ref_string_length",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the length of {@code str}.
     */
    public static long refStringLength(java.lang.String str) {
        try {
            var RESULT = (long) g_ref_string_length.invokeExact(Interop.allocateNativeString(str).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_string_new = Interop.downcallHandle(
        "g_ref_string_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new reference counted string and copies the contents of {@code str}
     * into it.
     */
    public static java.lang.String refStringNew(java.lang.String str) {
        try {
            var RESULT = (MemoryAddress) g_ref_string_new.invokeExact(Interop.allocateNativeString(str).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_string_new_intern = Interop.downcallHandle(
        "g_ref_string_new_intern",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new reference counted string and copies the content of {@code str}
     * into it.
     * <p>
     * If you call this function multiple times with the same {@code str}, or with
     * the same contents of {@code str}, it will return a new reference, instead of
     * creating a new string.
     */
    public static java.lang.String refStringNewIntern(java.lang.String str) {
        try {
            var RESULT = (MemoryAddress) g_ref_string_new_intern.invokeExact(Interop.allocateNativeString(str).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_string_new_len = Interop.downcallHandle(
        "g_ref_string_new_len",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Creates a new reference counted string and copies the contents of {@code str}
     * into it, up to {@code len} bytes.
     * <p>
     * Since this function does not stop at nul bytes, it is the caller's
     * responsibility to ensure that {@code str} has at least {@code len} addressable bytes.
     */
    public static java.lang.String refStringNewLen(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_ref_string_new_len.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ref_string_release = Interop.downcallHandle(
        "g_ref_string_release",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases a reference on a string; if it was the last reference, the
     * resources allocated by the string are freed as well.
     */
    public static void refStringRelease(java.lang.String str) {
        try {
            g_ref_string_release.invokeExact(Interop.allocateNativeString(str).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_check_replacement = Interop.downcallHandle(
        "g_regex_check_replacement",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks whether {@code replacement} is a valid replacement string
     * (see g_regex_replace()), i.e. that all escape sequences in
     * it are valid.
     * <p>
     * If {@code has_references} is not {@code null} then {@code replacement} is checked
     * for pattern references. For instance, replacement text 'foo\\n'
     * does not contain references and may be evaluated without information
     * about actual match, but '\\0\\1' (whole match followed by first
     * subpattern) requires valid {@link MatchInfo} object.
     */
    public static boolean regexCheckReplacement(java.lang.String replacement, PointerBoolean hasReferences) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_regex_check_replacement.invokeExact(Interop.allocateNativeString(replacement).handle(), hasReferences.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_error_quark = Interop.downcallHandle(
        "g_regex_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark regexErrorQuark() {
        try {
            var RESULT = (int) g_regex_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_escape_nul = Interop.downcallHandle(
        "g_regex_escape_nul",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Escapes the nul characters in {@code string} to "\\x00".  It can be used
     * to compile a regex with embedded nul characters.
     * <p>
     * For completeness, {@code length} can be -1 for a nul-terminated string.
     * In this case the output string will be of course equal to {@code string}.
     */
    public static java.lang.String regexEscapeNul(java.lang.String string, int length) {
        try {
            var RESULT = (MemoryAddress) g_regex_escape_nul.invokeExact(Interop.allocateNativeString(string).handle(), length);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_escape_string = Interop.downcallHandle(
        "g_regex_escape_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Escapes the special characters used for regular expressions
     * in {@code string}, for instance "a.b<strong>c" becomes "a\\.b\\</strong>c". This
     * function is useful to dynamically generate regular expressions.
     * <p>
     * {@code string} can contain nul characters that are replaced with "\\0",
     * in this case remember to specify the correct length of {@code string}
     * in {@code length}.
     */
    public static java.lang.String regexEscapeString(java.lang.String[] string, int length) {
        try {
            var RESULT = (MemoryAddress) g_regex_escape_string.invokeExact(Interop.allocateNativeArray(string).handle(), length);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_match_simple = Interop.downcallHandle(
        "g_regex_match_simple",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Scans for a match in {@code string} for {@code pattern}.
     * <p>
     * This function is equivalent to g_regex_match() but it does not
     * require to compile the pattern with g_regex_new(), avoiding some
     * lines of code when you need just to do a match without extracting
     * substrings, capture counts, and so on.
     * <p>
     * If this function is to be called on the same {@code pattern} more than
     * once, it's more efficient to compile the pattern once with
     * g_regex_new() and then use g_regex_match().
     */
    public static boolean regexMatchSimple(java.lang.String pattern, java.lang.String string, RegexCompileFlags compileOptions, RegexMatchFlags matchOptions) {
        try {
            var RESULT = (int) g_regex_match_simple.invokeExact(Interop.allocateNativeString(pattern).handle(), Interop.allocateNativeString(string).handle(), compileOptions.getValue(), matchOptions.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_split_simple = Interop.downcallHandle(
        "g_regex_split_simple",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Breaks the string on the pattern, and returns an array of
     * the tokens. If the pattern contains capturing parentheses,
     * then the text for each of the substrings will also be returned.
     * If the pattern does not match anywhere in the string, then the
     * whole string is returned as the first token.
     * <p>
     * This function is equivalent to g_regex_split() but it does
     * not require to compile the pattern with g_regex_new(), avoiding
     * some lines of code when you need just to do a split without
     * extracting substrings, capture counts, and so on.
     * <p>
     * If this function is to be called on the same {@code pattern} more than
     * once, it's more efficient to compile the pattern once with
     * g_regex_new() and then use g_regex_split().
     * <p>
     * As a special case, the result of splitting the empty string ""
     * is an empty vector, not a vector containing a single string.
     * The reason for this special case is that being able to represent
     * an empty vector is typically more useful than consistent handling
     * of empty elements. If you do need to represent empty elements,
     * you'll need to check for the empty string before calling this
     * function.
     * <p>
     * A pattern that can match empty strings splits {@code string} into
     * separate characters wherever it matches the empty string between
     * characters. For example splitting "ab c" using as a separator
     * "\\s*", you will get "a", "b" and "c".
     */
    public static PointerString regexSplitSimple(java.lang.String pattern, java.lang.String string, RegexCompileFlags compileOptions, RegexMatchFlags matchOptions) {
        try {
            var RESULT = (MemoryAddress) g_regex_split_simple.invokeExact(Interop.allocateNativeString(pattern).handle(), Interop.allocateNativeString(string).handle(), compileOptions.getValue(), matchOptions.getValue());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_reload_user_special_dirs_cache = Interop.downcallHandle(
        "g_reload_user_special_dirs_cache",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Resets the cache used for g_get_user_special_dir(), so
     * that the latest on-disk version is used. Call this only
     * if you just changed the data on disk yourself.
     * <p>
     * Due to thread safety issues this may cause leaking of strings
     * that were previously returned from g_get_user_special_dir()
     * that can't be freed. We ensure to only leak the data for
     * the directories that actually changed value though.
     */
    public static void reloadUserSpecialDirsCache() {
        try {
            g_reload_user_special_dirs_cache.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_return_if_fail_warning = Interop.downcallHandle(
        "g_return_if_fail_warning",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Internal function used to print messages from the public g_return_if_fail()
     * and g_return_val_if_fail() macros.
     */
    public static void returnIfFailWarning(java.lang.String logDomain, java.lang.String prettyFunction, java.lang.String expression) {
        try {
            g_return_if_fail_warning.invokeExact(Interop.allocateNativeString(logDomain).handle(), Interop.allocateNativeString(prettyFunction).handle(), Interop.allocateNativeString(expression).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_rmdir = Interop.downcallHandle(
        "g_rmdir",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A wrapper for the POSIX rmdir() function. The rmdir() function
     * deletes a directory from the filesystem.
     * <p>
     * See your C library manual for more details about how rmdir() works
     * on your system.
     */
    public static int rmdir(java.lang.String filename) {
        try {
            var RESULT = (int) g_rmdir.invokeExact(Interop.allocateNativeString(filename).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_get = Interop.downcallHandle(
        "g_sequence_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the data that {@code iter} points to.
     */
    public static java.lang.foreign.MemoryAddress sequenceGet(SequenceIter iter) {
        try {
            var RESULT = (MemoryAddress) g_sequence_get.invokeExact(iter.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_insert_before = Interop.downcallHandle(
        "g_sequence_insert_before",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a new item just before the item pointed to by {@code iter}.
     */
    public static SequenceIter sequenceInsertBefore(SequenceIter iter, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_sequence_insert_before.invokeExact(iter.handle(), data);
            return new SequenceIter(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_move = Interop.downcallHandle(
        "g_sequence_move",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the item pointed to by {@code src} to the position indicated by {@code dest}.
     * After calling this function {@code dest} will point to the position immediately
     * after {@code src}. It is allowed for {@code src} and {@code dest} to point into different
     * sequences.
     */
    public static void sequenceMove(SequenceIter src, SequenceIter dest) {
        try {
            g_sequence_move.invokeExact(src.handle(), dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_move_range = Interop.downcallHandle(
        "g_sequence_move_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts the ({@code begin}, {@code end}) range at the destination pointed to by {@code dest}.
     * The {@code begin} and {@code end} iters must point into the same sequence. It is
     * allowed for {@code dest} to point to a different sequence than the one pointed
     * into by {@code begin} and {@code end}.
     * <p>
     * If {@code dest} is {@code null}, the range indicated by {@code begin} and {@code end} is
     * removed from the sequence. If {@code dest} points to a place within
     * the ({@code begin}, {@code end}) range, the range does not move.
     */
    public static void sequenceMoveRange(SequenceIter dest, SequenceIter begin, SequenceIter end) {
        try {
            g_sequence_move_range.invokeExact(dest.handle(), begin.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_range_get_midpoint = Interop.downcallHandle(
        "g_sequence_range_get_midpoint",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds an iterator somewhere in the range ({@code begin}, {@code end}). This
     * iterator will be close to the middle of the range, but is not
     * guaranteed to be exactly in the middle.
     * <p>
     * The {@code begin} and {@code end} iterators must both point to the same sequence
     * and {@code begin} must come before or be equal to {@code end} in the sequence.
     */
    public static SequenceIter sequenceRangeGetMidpoint(SequenceIter begin, SequenceIter end) {
        try {
            var RESULT = (MemoryAddress) g_sequence_range_get_midpoint.invokeExact(begin.handle(), end.handle());
            return new SequenceIter(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_remove = Interop.downcallHandle(
        "g_sequence_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the item pointed to by {@code iter}. It is an error to pass the
     * end iterator to this function.
     * <p>
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed item.
     */
    public static void sequenceRemove(SequenceIter iter) {
        try {
            g_sequence_remove.invokeExact(iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_remove_range = Interop.downcallHandle(
        "g_sequence_remove_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all items in the ({@code begin}, {@code end}) range.
     * <p>
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed items.
     */
    public static void sequenceRemoveRange(SequenceIter begin, SequenceIter end) {
        try {
            g_sequence_remove_range.invokeExact(begin.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_set = Interop.downcallHandle(
        "g_sequence_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Changes the data for the item pointed to by {@code iter} to be {@code data}. If
     * the sequence has a data destroy function associated with it, that
     * function is called on the existing data that {@code iter} pointed to.
     */
    public static void sequenceSet(SequenceIter iter, java.lang.foreign.MemoryAddress data) {
        try {
            g_sequence_set.invokeExact(iter.handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_swap = Interop.downcallHandle(
        "g_sequence_swap",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Swaps the items pointed to by @a and @b. It is allowed for @a and @b
     * to point into difference sequences.
     */
    public static void sequenceSwap(SequenceIter a, SequenceIter b) {
        try {
            g_sequence_swap.invokeExact(a.handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_set_application_name = Interop.downcallHandle(
        "g_set_application_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a human-readable name for the application. This name should be
     * localized if possible, and is intended for display to the user.
     * Contrast with g_set_prgname(), which sets a non-localized name.
     * g_set_prgname() will be called automatically by gtk_init(),
     * but g_set_application_name() will not.
     * <p>
     * Note that for thread safety reasons, this function can only
     * be called once.
     * <p>
     * The application name will be used in contexts such as error messages,
     * or when displaying an application's name in the task list.
     */
    public static void setApplicationName(java.lang.String applicationName) {
        try {
            g_set_application_name.invokeExact(Interop.allocateNativeString(applicationName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_set_error_literal = Interop.downcallHandle(
        "g_set_error_literal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Does nothing if {@code err} is {@code null}; if {@code err} is non-{@code null}, then *{@code err}
     * must be {@code null}. A new {@link Error} is created and assigned to *{@code err}.
     * Unlike g_set_error(), {@code message} is not a printf()-style format string.
     * Use this function if {@code message} contains text you don't have control over,
     * that could include printf() escape sequences.
     */
    public static void setErrorLiteral(PointerProxy<Error> err, Quark domain, int code, java.lang.String message) {
        try {
            g_set_error_literal.invokeExact(err.handle(), domain.getValue(), code, Interop.allocateNativeString(message).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_set_prgname = Interop.downcallHandle(
        "g_set_prgname",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the program. This name should not be localized,
     * in contrast to g_set_application_name().
     * <p>
     * If you are using {@link org.gtk.gio.Application} the program name is set in
     * g_application_run(). In case of GDK or GTK+ it is set in
     * gdk_init(), which is called by gtk_init() and the
     * {@link org.gtk.gtk.Application}::startup handler. The program name is found by
     * taking the last component of {@code argv}[0].
     * <p>
     * Since GLib 2.72, this function can be called multiple times
     * and is fully thread safe. Prior to GLib 2.72, this function
     * could only be called once per process.
     */
    public static void setPrgname(java.lang.String prgname) {
        try {
            g_set_prgname.invokeExact(Interop.allocateNativeString(prgname).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_setenv = Interop.downcallHandle(
        "g_setenv",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets an environment variable. On UNIX, both the variable's name and
     * value can be arbitrary byte strings, except that the variable's name
     * cannot contain '='. On Windows, they should be in UTF-8.
     * <p>
     * Note that on some systems, when variables are overwritten, the memory
     * used for the previous variables and its value isn't reclaimed.
     * <p>
     * You should be mindful of the fact that environment variable handling
     * in UNIX is not thread-safe, and your program may crash if one thread
     * calls g_setenv() while another thread is calling getenv(). (And note
     * that many functions, such as gettext(), call getenv() internally.)
     * This function is only safe to use at the very start of your program,
     * before creating any other threads (or creating objects that create
     * worker threads of their own).
     * <p>
     * If you need to set up the environment for a child process, you can
     * use g_get_environ() to get an environment array, modify that with
     * g_environ_setenv() and g_environ_unsetenv(), and then pass that
     * array directly to execvpe(), g_spawn_async(), or the like.
     */
    public static boolean setenv(java.lang.String variable, java.lang.String value, boolean overwrite) {
        try {
            var RESULT = (int) g_setenv.invokeExact(Interop.allocateNativeString(variable).handle(), Interop.allocateNativeString(value).handle(), overwrite ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_shell_error_quark = Interop.downcallHandle(
        "g_shell_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark shellErrorQuark() {
        try {
            var RESULT = (int) g_shell_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_shell_parse_argv = Interop.downcallHandle(
        "g_shell_parse_argv",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses a command line into an argument vector, in much the same way
     * the shell would, but without many of the expansions the shell would
     * perform (variable expansion, globs, operators, filename expansion,
     * etc. are not supported).
     * <p>
     * The results are defined to be the same as those you would get from
     * a UNIX98 {@code /bin/sh}, as long as the input contains none of the
     * unsupported shell expansions. If the input does contain such expansions,
     * they are passed through literally.
     * <p>
     * Possible errors are those from the {@code G_SHELL_ERROR} domain.
     * <p>
     * In particular, if {@code command_line} is an empty string (or a string containing
     * only whitespace), {@link ShellError#EMPTY_STRING} will be returned. It’s
     * guaranteed that {@code argvp} will be a non-empty array if this function returns
     * successfully.
     * <p>
     * Free the returned vector with g_strfreev().
     */
    public static boolean shellParseArgv(java.lang.String commandLine, PointerInteger argcp, PointerString argvp) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_shell_parse_argv.invokeExact(Interop.allocateNativeString(commandLine).handle(), argcp.handle(), argvp.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_shell_quote = Interop.downcallHandle(
        "g_shell_quote",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Quotes a string so that the shell (/bin/sh) will interpret the
     * quoted string to mean {@code unquoted_string}.
     * <p>
     * If you pass a filename to the shell, for example, you should first
     * quote it with this function.
     * <p>
     * The return value must be freed with g_free().
     * <p>
     * The quoting style used is undefined (single or double quotes may be
     * used).
     */
    public static java.lang.String shellQuote(java.lang.String unquotedString) {
        try {
            var RESULT = (MemoryAddress) g_shell_quote.invokeExact(Interop.allocateNativeString(unquotedString).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_shell_unquote = Interop.downcallHandle(
        "g_shell_unquote",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unquotes a string as the shell (/bin/sh) would.
     * <p>
     * This function only handles quotes; if a string contains file globs,
     * arithmetic operators, variables, backticks, redirections, or other
     * special-to-the-shell features, the result will be different from the
     * result a real shell would produce (the variables, backticks, etc.
     * will be passed through literally instead of being expanded).
     * <p>
     * This function is guaranteed to succeed if applied to the result of
     * g_shell_quote(). If it fails, it returns {@code null} and sets the
     * error.
     * <p>
     * The {@code quoted_string} need not actually contain quoted or escaped text;
     * g_shell_unquote() simply goes through the string and unquotes/unescapes
     * anything that the shell would. Both single and double quotes are
     * handled, as are escapes including escaped newlines.
     * <p>
     * The return value must be freed with g_free().
     * <p>
     * Possible errors are in the {@code G_SHELL_ERROR} domain.
     * <p>
     * Shell quoting rules are a bit strange. Single quotes preserve the
     * literal string exactly. escape sequences are not allowed; not even
     * {@code \\'} - if you want a {@code '} in the quoted text, you have to do something
     * like {@code 'foo'\\''bar'}. Double quotes allow {@code $}, ``{@code , }"{@code , }\\`, and
     * newline to be escaped with backslash. Otherwise double quotes
     * preserve things literally.
     */
    public static java.lang.String shellUnquote(java.lang.String quotedString) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_shell_unquote.invokeExact(Interop.allocateNativeString(quotedString).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_slice_alloc = Interop.downcallHandle(
        "g_slice_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Allocates a block of memory from the slice allocator.
     * <p>
     * The block address handed out can be expected to be aligned
     * to at least {@code 1 * sizeof (void*)}, though in general slices
     * are {@code 2 * sizeof (void*)} bytes aligned; if a {@code malloc()}
     * fallback implementation is used instead, the alignment may
     * be reduced in a libc dependent fashion.
     * <p>
     * Note that the underlying slice allocation mechanism can
     * be changed with the [{@code G_SLICE=always-malloc}][G_SLICE]
     * environment variable.
     */
    public static java.lang.foreign.MemoryAddress sliceAlloc(long blockSize) {
        try {
            var RESULT = (MemoryAddress) g_slice_alloc.invokeExact(blockSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_slice_alloc0 = Interop.downcallHandle(
        "g_slice_alloc0",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Allocates a block of memory via g_slice_alloc() and initializes
     * the returned memory to 0. Note that the underlying slice allocation
     * mechanism can be changed with the [{@code G_SLICE=always-malloc}][G_SLICE]
     * environment variable.
     */
    public static java.lang.foreign.MemoryAddress sliceAlloc0(long blockSize) {
        try {
            var RESULT = (MemoryAddress) g_slice_alloc0.invokeExact(blockSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_slice_copy = Interop.downcallHandle(
        "g_slice_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Allocates a block of memory from the slice allocator
     * and copies {@code block_size} bytes into it from {@code mem_block}.
     * <p>
     * {@code mem_block} must be non-{@code null} if {@code block_size} is non-zero.
     */
    public static java.lang.foreign.MemoryAddress sliceCopy(long blockSize, java.lang.foreign.MemoryAddress memBlock) {
        try {
            var RESULT = (MemoryAddress) g_slice_copy.invokeExact(blockSize, memBlock);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_slice_free1 = Interop.downcallHandle(
        "g_slice_free1",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a block of memory.
     * <p>
     * The memory must have been allocated via g_slice_alloc() or
     * g_slice_alloc0() and the {@code block_size} has to match the size
     * specified upon allocation. Note that the exact release behaviour
     * can be changed with the [{@code G_DEBUG=gc-friendly}][G_DEBUG] environment
     * variable, also see [{@code G_SLICE}][G_SLICE] for related debugging options.
     * <p>
     * If {@code mem_block} is {@code null}, this function does nothing.
     */
    public static void sliceFree1(long blockSize, java.lang.foreign.MemoryAddress memBlock) {
        try {
            g_slice_free1.invokeExact(blockSize, memBlock);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_slice_free_chain_with_offset = Interop.downcallHandle(
        "g_slice_free_chain_with_offset",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Frees a linked list of memory blocks of structure type {@code type}.
     * <p>
     * The memory blocks must be equal-sized, allocated via
     * g_slice_alloc() or g_slice_alloc0() and linked together by a
     * {@code next} pointer (similar to {@link SList}). The offset of the {@code next}
     * field in each block is passed as third argument.
     * Note that the exact release behaviour can be changed with the
     * [{@code G_DEBUG=gc-friendly}][G_DEBUG] environment variable, also see
     * [{@code G_SLICE}][G_SLICE] for related debugging options.
     * <p>
     * If {@code mem_chain} is {@code null}, this function does nothing.
     */
    public static void sliceFreeChainWithOffset(long blockSize, java.lang.foreign.MemoryAddress memChain, long nextOffset) {
        try {
            g_slice_free_chain_with_offset.invokeExact(blockSize, memChain, nextOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_slice_get_config = Interop.downcallHandle(
        "g_slice_get_config",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    public static long sliceGetConfig(SliceConfig ckey) {
        try {
            var RESULT = (long) g_slice_get_config.invokeExact(ckey.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_slice_get_config_state = Interop.downcallHandle(
        "g_slice_get_config_state",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    public static PointerLong sliceGetConfigState(SliceConfig ckey, long address, PointerInteger nValues) {
        try {
            var RESULT = (MemoryAddress) g_slice_get_config_state.invokeExact(ckey.getValue(), address, nValues.handle());
            return new PointerLong(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_slice_set_config = Interop.downcallHandle(
        "g_slice_set_config",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    public static void sliceSetConfig(SliceConfig ckey, long value) {
        try {
            g_slice_set_config.invokeExact(ckey.getValue(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_source_remove = Interop.downcallHandle(
        "g_source_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the source with the given ID from the default main context. You must
     * use g_source_destroy() for sources added to a non-default main context.
     * <p>
     * The ID of a {@link Source} is given by g_source_get_id(), or will be
     * returned by the functions g_source_attach(), g_idle_add(),
     * g_idle_add_full(), g_timeout_add(), g_timeout_add_full(),
     * g_child_watch_add(), g_child_watch_add_full(), g_io_add_watch(), and
     * g_io_add_watch_full().
     * <p>
     * It is a programmer error to attempt to remove a non-existent source.
     * <p>
     * More specifically: source IDs can be reissued after a source has been
     * destroyed and therefore it is never valid to use this function with a
     * source ID which may have already been removed.  An example is when
     * scheduling an idle to run in another thread with g_idle_add(): the
     * idle may already have run and been removed by the time this function
     * is called on its (now invalid) source ID.  This source ID may have
     * been reissued, leading to the operation being performed against the
     * wrong source.
     */
    public static boolean sourceRemove(int tag) {
        try {
            var RESULT = (int) g_source_remove.invokeExact(tag);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_source_remove_by_funcs_user_data = Interop.downcallHandle(
        "g_source_remove_by_funcs_user_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a source from the default main loop context given the
     * source functions and user data. If multiple sources exist with the
     * same source functions and user data, only one will be destroyed.
     */
    public static boolean sourceRemoveByFuncsUserData(SourceFuncs funcs, java.lang.foreign.MemoryAddress userData) {
        try {
            var RESULT = (int) g_source_remove_by_funcs_user_data.invokeExact(funcs.handle(), userData);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_source_remove_by_user_data = Interop.downcallHandle(
        "g_source_remove_by_user_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a source from the default main loop context given the user
     * data for the callback. If multiple sources exist with the same user
     * data, only one will be destroyed.
     */
    public static boolean sourceRemoveByUserData(java.lang.foreign.MemoryAddress userData) {
        try {
            var RESULT = (int) g_source_remove_by_user_data.invokeExact(userData);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_source_set_name_by_id = Interop.downcallHandle(
        "g_source_set_name_by_id",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of a source using its ID.
     * <p>
     * This is a convenience utility to set source names from the return
     * value of g_idle_add(), g_timeout_add(), etc.
     * <p>
     * It is a programmer error to attempt to set the name of a non-existent
     * source.
     * <p>
     * More specifically: source IDs can be reissued after a source has been
     * destroyed and therefore it is never valid to use this function with a
     * source ID which may have already been removed.  An example is when
     * scheduling an idle to run in another thread with g_idle_add(): the
     * idle may already have run and been removed by the time this function
     * is called on its (now invalid) source ID.  This source ID may have
     * been reissued, leading to the operation being performed against the
     * wrong source.
     */
    public static void sourceSetNameById(int tag, java.lang.String name) {
        try {
            g_source_set_name_by_id.invokeExact(tag, Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spaced_primes_closest = Interop.downcallHandle(
        "g_spaced_primes_closest",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the smallest prime number from a built-in array of primes which
     * is larger than {@code num}. This is used within GLib to calculate the optimum
     * size of a {@link HashTable}.
     * <p>
     * The built-in array of primes ranges from 11 to 13845163 such that
     * each prime is approximately 1.5-2 times the previous prime.
     */
    public static int spacedPrimesClosest(int num) {
        try {
            var RESULT = (int) g_spaced_primes_closest.invokeExact(num);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_async = Interop.downcallHandle(
        "g_spawn_async",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Executes a child program asynchronously.
     * <p>
     * See g_spawn_async_with_pipes() for a full description; this function
     * simply calls the g_spawn_async_with_pipes() without any pipes.
     * <p>
     * You should call g_spawn_close_pid() on the returned child process
     * reference when you don't need it any more.
     * <p>
     * If you are writing a GTK application, and the program you are spawning is a
     * graphical application too, then to ensure that the spawned program opens its
     * windows on the right screen, you may want to use {@link org.gtk.gdk.AppLaunchContext},
     * {@link org.gtk.gio.AppLaunchContext}, or set the {@code DISPLAY} environment variable.
     * <p>
     * Note that the returned {@code child_pid} on Windows is a handle to the child
     * process and not its identifier. Process handles and process identifiers
     * are different concepts on Windows.
     */
    public static boolean spawnAsync(java.lang.String workingDirectory, java.lang.String[] argv, java.lang.String[] envp, SpawnFlags flags, SpawnChildSetupFunc childSetup, Pid childPid) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        PointerInteger childPidPOINTER = new PointerInteger(childPid.getValue());
        try {
            var RESULT = (int) g_spawn_async.invokeExact(Interop.allocateNativeString(workingDirectory).handle(), Interop.allocateNativeArray(argv).handle(), Interop.allocateNativeArray(envp).handle(), flags.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(childSetup.hashCode(), childSetup)), new PointerInteger(childPid.getValue()).handle(), GERROR);
            childPid.setValue(childPidPOINTER.get());
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_async_with_fds = Interop.downcallHandle(
        "g_spawn_async_with_fds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Executes a child program asynchronously.
     * <p>
     * Identical to g_spawn_async_with_pipes_and_fds() but with {@code n_fds} set to zero,
     * so no FD assignments are used.
     */
    public static boolean spawnAsyncWithFds(java.lang.String workingDirectory, java.lang.String[] argv, java.lang.String[] envp, SpawnFlags flags, SpawnChildSetupFunc childSetup, Pid childPid, int stdinFd, int stdoutFd, int stderrFd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        PointerInteger childPidPOINTER = new PointerInteger(childPid.getValue());
        try {
            var RESULT = (int) g_spawn_async_with_fds.invokeExact(Interop.allocateNativeString(workingDirectory).handle(), Interop.allocateNativeArray(argv).handle(), Interop.allocateNativeArray(envp).handle(), flags.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(childSetup.hashCode(), childSetup)), new PointerInteger(childPid.getValue()).handle(), stdinFd, stdoutFd, stderrFd, GERROR);
            childPid.setValue(childPidPOINTER.get());
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_async_with_pipes = Interop.downcallHandle(
        "g_spawn_async_with_pipes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Identical to g_spawn_async_with_pipes_and_fds() but with {@code n_fds} set to zero,
     * so no FD assignments are used.
     */
    public static boolean spawnAsyncWithPipes(java.lang.String workingDirectory, java.lang.String[] argv, java.lang.String[] envp, SpawnFlags flags, SpawnChildSetupFunc childSetup, Pid childPid, PointerInteger standardInput, PointerInteger standardOutput, PointerInteger standardError) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        PointerInteger childPidPOINTER = new PointerInteger(childPid.getValue());
        try {
            var RESULT = (int) g_spawn_async_with_pipes.invokeExact(Interop.allocateNativeString(workingDirectory).handle(), Interop.allocateNativeArray(argv).handle(), Interop.allocateNativeArray(envp).handle(), flags.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(childSetup.hashCode(), childSetup)), new PointerInteger(childPid.getValue()).handle(), standardInput.handle(), standardOutput.handle(), standardError.handle(), GERROR);
            childPid.setValue(childPidPOINTER.get());
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_async_with_pipes_and_fds = Interop.downcallHandle(
        "g_spawn_async_with_pipes_and_fds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Executes a child program asynchronously (your program will not
     * block waiting for the child to exit).
     * <p>
     * The child program is specified by the only argument that must be
     * provided, {@code argv}. {@code argv} should be a {@code null}-terminated array of strings,
     * to be passed as the argument vector for the child. The first string
     * in {@code argv} is of course the name of the program to execute. By default,
     * the name of the program must be a full path. If {@code flags} contains the
     * {@link SpawnFlags#SEARCH_PATH} flag, the {@code PATH} environment variable is used to
     * search for the executable. If {@code flags} contains the
     * {@link SpawnFlags#SEARCH_PATH_FROM_ENVP} flag, the {@code PATH} variable from {@code envp}
     * is used to search for the executable. If both the
     * {@link SpawnFlags#SEARCH_PATH} and {@link SpawnFlags#SEARCH_PATH_FROM_ENVP} flags are
     * set, the {@code PATH} variable from {@code envp} takes precedence over the
     * environment variable.
     * <p>
     * If the program name is not a full path and {@link SpawnFlags#SEARCH_PATH} flag
     * is not used, then the program will be run from the current directory
     * (or {@code working_directory}, if specified); this might be unexpected or even
     * dangerous in some cases when the current directory is world-writable.
     * <p>
     * On Windows, note that all the string or string vector arguments to
     * this function and the other {@code g_spawn*()} functions are in UTF-8, the
     * GLib file name encoding. Unicode characters that are not part of
     * the system codepage passed in these arguments will be correctly
     * available in the spawned program only if it uses wide character API
     * to retrieve its command line. For C programs built with Microsoft's
     * tools it is enough to make the program have a {@code wmain()} instead of
     * {@code main()}. {@code wmain()} has a wide character argument vector as parameter.
     * <p>
     * At least currently, mingw doesn't support {@code wmain()}, so if you use
     * mingw to develop the spawned program, it should call
     * g_win32_get_command_line() to get arguments in UTF-8.
     * <p>
     * On Windows the low-level child process creation API {@code CreateProcess()}
     * doesn't use argument vectors, but a command line. The C runtime
     * library's {@code spawn*()} family of functions (which g_spawn_async_with_pipes()
     * eventually calls) paste the argument vector elements together into
     * a command line, and the C runtime startup code does a corresponding
     * reconstruction of an argument vector from the command line, to be
     * passed to {@code main()}. Complications arise when you have argument vector
     * elements that contain spaces or double quotes. The {@code spawn*()} functions
     * don't do any quoting or escaping, but on the other hand the startup
     * code does do unquoting and unescaping in order to enable receiving
     * arguments with embedded spaces or double quotes. To work around this
     * asymmetry, g_spawn_async_with_pipes() will do quoting and escaping on
     * argument vector elements that need it before calling the C runtime
     * {@code spawn()} function.
     * <p>
     * The returned {@code child_pid} on Windows is a handle to the child
     * process, not its identifier. Process handles and process
     * identifiers are different concepts on Windows.
     * <p>
     * {@code envp} is a {@code null}-terminated array of strings, where each string
     * has the form {@code KEY=VALUE}. This will become the child's environment.
     * If {@code envp} is {@code null}, the child inherits its parent's environment.
     * <p>
     * {@code flags} should be the bitwise OR of any flags you want to affect the
     * function's behaviour. The {@link SpawnFlags#DO_NOT_REAP_CHILD} means that the
     * child will not automatically be reaped; you must use a child watch
     * (g_child_watch_add()) to be notified about the death of the child process,
     * otherwise it will stay around as a zombie process until this process exits.
     * Eventually you must call g_spawn_close_pid() on the {@code child_pid}, in order to
     * free resources which may be associated with the child process. (On Unix,
     * using a child watch is equivalent to calling waitpid() or handling
     * the {@code SIGCHLD} signal manually. On Windows, calling g_spawn_close_pid()
     * is equivalent to calling {@code CloseHandle()} on the process handle returned
     * in {@code child_pid}). See g_child_watch_add().
     * <p>
     * Open UNIX file descriptors marked as {@code FD_CLOEXEC} will be automatically
     * closed in the child process. {@link SpawnFlags#LEAVE_DESCRIPTORS_OPEN} means that
     * other open file descriptors will be inherited by the child; otherwise all
     * descriptors except stdin/stdout/stderr will be closed before calling {@code exec()}
     * in the child. {@link SpawnFlags#SEARCH_PATH} means that {@code argv}[0] need not be an
     * absolute path, it will be looked for in the {@code PATH} environment
     * variable. {@link SpawnFlags#SEARCH_PATH_FROM_ENVP} means need not be an
     * absolute path, it will be looked for in the {@code PATH} variable from
     * {@code envp}. If both {@link SpawnFlags#SEARCH_PATH} and {@link SpawnFlags#SEARCH_PATH_FROM_ENVP}
     * are used, the value from {@code envp} takes precedence over the environment.
     * <p>
     * {@link SpawnFlags#STDOUT_TO_DEV_NULL} means that the child's standard output
     * will be discarded, instead of going to the same location as the parent's
     * standard output. If you use this flag, {@code stdout_pipe_out} must be {@code null}.
     * <p>
     * {@link SpawnFlags#STDERR_TO_DEV_NULL} means that the child's standard error
     * will be discarded, instead of going to the same location as the parent's
     * standard error. If you use this flag, {@code stderr_pipe_out} must be {@code null}.
     * <p>
     * {@link SpawnFlags#CHILD_INHERITS_STDIN} means that the child will inherit the parent's
     * standard input (by default, the child's standard input is attached to
     * {@code /dev/null}). If you use this flag, {@code stdin_pipe_out} must be {@code null}.
     * <p>
     * It is valid to pass the same FD in multiple parameters (e.g. you can pass
     * a single FD for both {@code stdout_fd} and {@code stderr_fd}, and include it in
     * {@code source_fds} too).
     * <p>
     * {@code source_fds} and {@code target_fds} allow zero or more FDs from this process to be
     * remapped to different FDs in the spawned process. If {@code n_fds} is greater than
     * zero, {@code source_fds} and {@code target_fds} must both be non-{@code null} and the same length.
     * Each FD in {@code source_fds} is remapped to the FD number at the same index in
     * {@code target_fds}. The source and target FD may be equal to simply propagate an FD
     * to the spawned process. FD remappings are processed after standard FDs, so
     * any target FDs which equal {@code stdin_fd}, {@code stdout_fd} or {@code stderr_fd} will overwrite
     * them in the spawned process.
     * <p>
     * {@code source_fds} is supported on Windows since 2.72.
     * <p>
     * {@link SpawnFlags#FILE_AND_ARGV_ZERO} means that the first element of {@code argv} is
     * the file to execute, while the remaining elements are the actual
     * argument vector to pass to the file. Normally g_spawn_async_with_pipes()
     * uses {@code argv}[0] as the file to execute, and passes all of {@code argv} to the child.
     * <p>
     * {@code child_setup} and {@code user_data} are a function and user data. On POSIX
     * platforms, the function is called in the child after GLib has
     * performed all the setup it plans to perform (including creating
     * pipes, closing file descriptors, etc.) but before calling {@code exec()}.
     * That is, {@code child_setup} is called just before calling {@code exec()} in the
     * child. Obviously actions taken in this function will only affect
     * the child, not the parent.
     * <p>
     * On Windows, there is no separate {@code fork()} and {@code exec()} functionality.
     * Child processes are created and run with a single API call,
     * {@code CreateProcess()}. There is no sensible thing {@code child_setup}
     * could be used for on Windows so it is ignored and not called.
     * <p>
     * If non-{@code null}, {@code child_pid} will on Unix be filled with the child's
     * process ID. You can use the process ID to send signals to the child,
     * or to use g_child_watch_add() (or {@code waitpid()}) if you specified the
     * {@link SpawnFlags#DO_NOT_REAP_CHILD} flag. On Windows, {@code child_pid} will be
     * filled with a handle to the child process only if you specified the
     * {@link SpawnFlags#DO_NOT_REAP_CHILD} flag. You can then access the child
     * process using the Win32 API, for example wait for its termination
     * with the {@code WaitFor*()} functions, or examine its exit code with
     * {@code GetExitCodeProcess()}. You should close the handle with {@code CloseHandle()}
     * or g_spawn_close_pid() when you no longer need it.
     * <p>
     * If non-{@code null}, the {@code stdin_pipe_out}, {@code stdout_pipe_out}, {@code stderr_pipe_out}
     * locations will be filled with file descriptors for writing to the child's
     * standard input or reading from its standard output or standard error.
     * The caller of g_spawn_async_with_pipes() must close these file descriptors
     * when they are no longer in use. If these parameters are {@code null}, the
     * corresponding pipe won't be created.
     * <p>
     * If {@code stdin_pipe_out} is {@code null}, the child's standard input is attached to
     * {@code /dev/null} unless {@link SpawnFlags#CHILD_INHERITS_STDIN} is set.
     * <p>
     * If {@code stderr_pipe_out} is NULL, the child's standard error goes to the same
     * location as the parent's standard error unless {@link SpawnFlags#STDERR_TO_DEV_NULL}
     * is set.
     * <p>
     * If {@code stdout_pipe_out} is NULL, the child's standard output goes to the same
     * location as the parent's standard output unless {@link SpawnFlags#STDOUT_TO_DEV_NULL}
     * is set.
     * <p>
     * {@code error} can be {@code null} to ignore errors, or non-{@code null} to report errors.
     * If an error is set, the function returns {@code false}. Errors are reported
     * even if they occur in the child (for example if the executable in
     * {@code @argv[0]} is not found). Typically the {@code message} field of returned
     * errors should be displayed to users. Possible errors are those from
     * the {@code G_SPAWN_ERROR} domain.
     * <p>
     * If an error occurs, {@code child_pid}, {@code stdin_pipe_out}, {@code stdout_pipe_out},
     * and {@code stderr_pipe_out} will not be filled with valid values.
     * <p>
     * If {@code child_pid} is not {@code null} and an error does not occur then the returned
     * process reference must be closed using g_spawn_close_pid().
     * <p>
     * On modern UNIX platforms, GLib can use an efficient process launching
     * codepath driven internally by {@code posix_spawn()}. This has the advantage of
     * avoiding the fork-time performance costs of cloning the parent process
     * address space, and avoiding associated memory overcommit checks that are
     * not relevant in the context of immediately executing a distinct process.
     * This optimized codepath will be used provided that the following conditions
     * are met:
     * <p>
     * 1. {@link SpawnFlags#DO_NOT_REAP_CHILD} is set
     * 2. {@link SpawnFlags#LEAVE_DESCRIPTORS_OPEN} is set
     * 3. {@link SpawnFlags#SEARCH_PATH_FROM_ENVP} is not set
     * 4. {@code working_directory} is {@code null}
     * 5. {@code child_setup} is {@code null}
     * 6. The program is of a recognised binary format, or has a shebang.
     *    Otherwise, GLib will have to execute the program through the
     *    shell, which is not done using the optimized codepath.
     * <p>
     * If you are writing a GTK application, and the program you are spawning is a
     * graphical application too, then to ensure that the spawned program opens its
     * windows on the right screen, you may want to use {@link org.gtk.gdk.AppLaunchContext},
     * {@link org.gtk.gio.AppLaunchContext}, or set the {@code DISPLAY} environment variable.
     */
    public static boolean spawnAsyncWithPipesAndFds(java.lang.String workingDirectory, java.lang.String[] argv, java.lang.String[] envp, SpawnFlags flags, SpawnChildSetupFunc childSetup, int stdinFd, int stdoutFd, int stderrFd, int[] sourceFds, int[] targetFds, long nFds, Pid childPidOut, PointerInteger stdinPipeOut, PointerInteger stdoutPipeOut, PointerInteger stderrPipeOut) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        PointerInteger childPidOutPOINTER = new PointerInteger(childPidOut.getValue());
        try {
            var RESULT = (int) g_spawn_async_with_pipes_and_fds.invokeExact(Interop.allocateNativeString(workingDirectory).handle(), Interop.allocateNativeArray(argv).handle(), Interop.allocateNativeArray(envp).handle(), flags.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(childSetup.hashCode(), childSetup)), stdinFd, stdoutFd, stderrFd, Interop.allocateNativeArray(sourceFds).handle(), Interop.allocateNativeArray(targetFds).handle(), nFds, new PointerInteger(childPidOut.getValue()).handle(), stdinPipeOut.handle(), stdoutPipeOut.handle(), stderrPipeOut.handle(), GERROR);
            childPidOut.setValue(childPidOutPOINTER.get());
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_check_wait_status = Interop.downcallHandle(
        "g_spawn_check_wait_status",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set {@code error} if {@code wait_status} indicates the child exited abnormally
     * (e.g. with a nonzero exit code, or via a fatal signal).
     * <p>
     * The g_spawn_sync() and g_child_watch_add() family of APIs return the
     * status of subprocesses encoded in a platform-specific way.
     * On Unix, this is guaranteed to be in the same format waitpid() returns,
     * and on Windows it is guaranteed to be the result of GetExitCodeProcess().
     * <p>
     * Prior to the introduction of this function in GLib 2.34, interpreting
     * {@code wait_status} required use of platform-specific APIs, which is problematic
     * for software using GLib as a cross-platform layer.
     * <p>
     * Additionally, many programs simply want to determine whether or not
     * the child exited successfully, and either propagate a {@link Error} or
     * print a message to standard error. In that common case, this function
     * can be used. Note that the error message in {@code error} will contain
     * human-readable information about the wait status.
     * <p>
     * The {@code domain} and {@code code} of {@code error} have special semantics in the case
     * where the process has an "exit code", as opposed to being killed by
     * a signal. On Unix, this happens if WIFEXITED() would be true of
     * {@code wait_status}. On Windows, it is always the case.
     * <p>
     * The special semantics are that the actual exit code will be the
     * code set in {@code error}, and the domain will be {@code G_SPAWN_EXIT_ERROR}.
     * This allows you to differentiate between different exit codes.
     * <p>
     * If the process was terminated by some means other than an exit
     * status (for example if it was killed by a signal), the domain will be
     * {@code G_SPAWN_ERROR} and the code will be {@link SpawnError#FAILED}.
     * <p>
     * This function just offers convenience; you can of course also check
     * the available platform via a macro such as {@code G_OS_UNIX}, and use
     * WIFEXITED() and WEXITSTATUS() on {@code wait_status} directly. Do not attempt
     * to scan or parse the error message string; it may be translated and/or
     * change in future versions of GLib.
     * <p>
     * Prior to version 2.70, g_spawn_check_exit_status() provides the same
     * functionality, although under a misleading name.
     */
    public static boolean spawnCheckWaitStatus(int waitStatus) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_spawn_check_wait_status.invokeExact(waitStatus, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_close_pid = Interop.downcallHandle(
        "g_spawn_close_pid",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * On some platforms, notably Windows, the {@link Pid} type represents a resource
     * which must be closed to prevent resource leaking. g_spawn_close_pid()
     * is provided for this purpose. It should be used on all platforms, even
     * though it doesn't do anything under UNIX.
     */
    public static void spawnClosePid(Pid pid) {
        try {
            g_spawn_close_pid.invokeExact(pid.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_command_line_async = Interop.downcallHandle(
        "g_spawn_command_line_async",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A simple version of g_spawn_async() that parses a command line with
     * g_shell_parse_argv() and passes it to g_spawn_async().
     * <p>
     * Runs a command line in the background. Unlike g_spawn_async(), the
     * {@link SpawnFlags#SEARCH_PATH} flag is enabled, other flags are not. Note
     * that {@link SpawnFlags#SEARCH_PATH} can have security implications, so
     * consider using g_spawn_async() directly if appropriate. Possible
     * errors are those from g_shell_parse_argv() and g_spawn_async().
     * <p>
     * The same concerns on Windows apply as for g_spawn_command_line_sync().
     */
    public static boolean spawnCommandLineAsync(java.lang.String commandLine) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_spawn_command_line_async.invokeExact(Interop.allocateNativeString(commandLine).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_command_line_sync = Interop.downcallHandle(
        "g_spawn_command_line_sync",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A simple version of g_spawn_sync() with little-used parameters
     * removed, taking a command line instead of an argument vector.
     * <p>
     * See g_spawn_sync() for full details.
     * <p>
     * The {@code command_line} argument will be parsed by g_shell_parse_argv().
     * <p>
     * Unlike g_spawn_sync(), the {@link SpawnFlags#SEARCH_PATH} flag is enabled.
     * Note that {@link SpawnFlags#SEARCH_PATH} can have security implications, so
     * consider using g_spawn_sync() directly if appropriate.
     * <p>
     * Possible errors are those from g_spawn_sync() and those
     * from g_shell_parse_argv().
     * <p>
     * If {@code wait_status} is non-{@code null}, the platform-specific status of
     * the child is stored there; see the documentation of
     * g_spawn_check_wait_status() for how to use and interpret this.
     * On Unix platforms, note that it is usually not equal
     * to the integer passed to {@code exit()} or returned from {@code main()}.
     * <p>
     * On Windows, please note the implications of g_shell_parse_argv()
     * parsing {@code command_line}. Parsing is done according to Unix shell rules, not
     * Windows command interpreter rules.
     * Space is a separator, and backslashes are
     * special. Thus you cannot simply pass a {@code command_line} containing
     * canonical Windows paths, like "c:\\\\program files\\\\app\\\\app.exe", as
     * the backslashes will be eaten, and the space will act as a
     * separator. You need to enclose such paths with single quotes, like
     * "'c:\\\\program files\\\\app\\\\app.exe' 'e:\\\\folder\\\\argument.txt'".
     */
    public static boolean spawnCommandLineSync(java.lang.String commandLine, PointerByte standardOutput, PointerByte standardError, PointerInteger waitStatus) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_spawn_command_line_sync.invokeExact(Interop.allocateNativeString(commandLine).handle(), standardOutput.handle(), standardError.handle(), waitStatus.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_error_quark = Interop.downcallHandle(
        "g_spawn_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark spawnErrorQuark() {
        try {
            var RESULT = (int) g_spawn_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_exit_error_quark = Interop.downcallHandle(
        "g_spawn_exit_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark spawnExitErrorQuark() {
        try {
            var RESULT = (int) g_spawn_exit_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_spawn_sync = Interop.downcallHandle(
        "g_spawn_sync",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Executes a child synchronously (waits for the child to exit before returning).
     * <p>
     * All output from the child is stored in {@code standard_output} and {@code standard_error},
     * if those parameters are non-{@code null}. Note that you must set the
     * {@link SpawnFlags#STDOUT_TO_DEV_NULL} and {@link SpawnFlags#STDERR_TO_DEV_NULL} flags when
     * passing {@code null} for {@code standard_output} and {@code standard_error}.
     * <p>
     * If {@code wait_status} is non-{@code null}, the platform-specific status of
     * the child is stored there; see the documentation of
     * g_spawn_check_wait_status() for how to use and interpret this.
     * On Unix platforms, note that it is usually not equal
     * to the integer passed to {@code exit()} or returned from {@code main()}.
     * <p>
     * Note that it is invalid to pass {@link SpawnFlags#DO_NOT_REAP_CHILD} in
     * {@code flags}, and on POSIX platforms, the same restrictions as for
     * g_child_watch_source_new() apply.
     * <p>
     * If an error occurs, no data is returned in {@code standard_output},
     * {@code standard_error}, or {@code wait_status}.
     * <p>
     * This function calls g_spawn_async_with_pipes() internally; see that
     * function for full details on the other parameters and details on
     * how these functions work on Windows.
     */
    public static boolean spawnSync(java.lang.String workingDirectory, java.lang.String[] argv, java.lang.String[] envp, SpawnFlags flags, SpawnChildSetupFunc childSetup, PointerByte standardOutput, PointerByte standardError, PointerInteger waitStatus) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_spawn_sync.invokeExact(Interop.allocateNativeString(workingDirectory).handle(), Interop.allocateNativeArray(argv).handle(), Interop.allocateNativeArray(envp).handle(), flags.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSpawnChildSetupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(childSetup.hashCode(), childSetup)), standardOutput.handle(), standardError.handle(), waitStatus.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_stpcpy = Interop.downcallHandle(
        "g_stpcpy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a nul-terminated string into the dest buffer, include the
     * trailing nul, and return a pointer to the trailing nul byte.
     * This is useful for concatenating multiple strings together
     * without having to repeatedly scan for the end.
     */
    public static java.lang.String stpcpy(java.lang.String dest, java.lang.String src) {
        try {
            var RESULT = (MemoryAddress) g_stpcpy.invokeExact(Interop.allocateNativeString(dest).handle(), Interop.allocateNativeString(src).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_str_equal = Interop.downcallHandle(
        "g_str_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two strings for byte-by-byte equality and returns {@code true}
     * if they are equal. It can be passed to g_hash_table_new() as the
     * {@code key_equal_func} parameter, when using non-{@code null} strings as keys in a
     * {@link HashTable}.
     * <p>
     * This function is typically used for hash table comparisons, but can be used
     * for general purpose comparisons of non-{@code null} strings. For a {@code null}-safe string
     * comparison function, see g_strcmp0().
     */
    public static boolean strEqual(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2) {
        try {
            var RESULT = (int) g_str_equal.invokeExact(v1, v2);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_str_has_prefix = Interop.downcallHandle(
        "g_str_has_prefix",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks whether the string {@code str} begins with {@code prefix}.
     */
    public static boolean strHasPrefix(java.lang.String str, java.lang.String prefix) {
        try {
            var RESULT = (int) g_str_has_prefix.invokeExact(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(prefix).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_str_has_suffix = Interop.downcallHandle(
        "g_str_has_suffix",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks whether the string {@code str} ends with {@code suffix}.
     */
    public static boolean strHasSuffix(java.lang.String str, java.lang.String suffix) {
        try {
            var RESULT = (int) g_str_has_suffix.invokeExact(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(suffix).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_str_hash = Interop.downcallHandle(
        "g_str_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string to a hash value.
     * <p>
     * This function implements the widely used "djb" hash apparently
     * posted by Daniel Bernstein to comp.lang.c some time ago.  The 32
     * bit unsigned hash value starts at 5381 and for each byte 'c' in
     * the string, is updated: {@code hash = hash * 33 + c}. This function
     * uses the signed value of each byte.
     * <p>
     * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
     * when using non-{@code null} strings as keys in a {@link HashTable}.
     * <p>
     * Note that this function may not be a perfect fit for all use cases.
     * For example, it produces some hash collisions with strings as short
     * as 2.
     */
    public static int strHash(java.lang.foreign.MemoryAddress v) {
        try {
            var RESULT = (int) g_str_hash.invokeExact(v);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_str_is_ascii = Interop.downcallHandle(
        "g_str_is_ascii",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines if a string is pure ASCII. A string is pure ASCII if it
     * contains no bytes with the high bit set.
     */
    public static boolean strIsAscii(java.lang.String str) {
        try {
            var RESULT = (int) g_str_is_ascii.invokeExact(Interop.allocateNativeString(str).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_str_match_string = Interop.downcallHandle(
        "g_str_match_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks if a search conducted for {@code search_term} should match
     * {@code potential_hit}.
     * <p>
     * This function calls g_str_tokenize_and_fold() on both
     * {@code search_term} and {@code potential_hit}.  ASCII alternates are never taken
     * for {@code search_term} but will be taken for {@code potential_hit} according to
     * the value of {@code accept_alternates}.
     * <p>
     * A hit occurs when each folded token in {@code search_term} is a prefix of a
     * folded token from {@code potential_hit}.
     * <p>
     * Depending on how you're performing the search, it will typically be
     * faster to call g_str_tokenize_and_fold() on each string in
     * your corpus and build an index on the returned folded tokens, then
     * call g_str_tokenize_and_fold() on the search term and
     * perform lookups into that index.
     * <p>
     * As some examples, searching for ‘fred’ would match the potential hit
     * ‘Smith, Fred’ and also ‘Frédéric’.  Searching for ‘Fréd’ would match
     * ‘Frédéric’ but not ‘Frederic’ (due to the one-directional nature of
     * accent matching).  Searching ‘fo’ would match ‘Foo’ and ‘Bar Foo
     * Baz’, but not ‘SFO’ (because no word has ‘fo’ as a prefix).
     */
    public static boolean strMatchString(java.lang.String searchTerm, java.lang.String potentialHit, boolean acceptAlternates) {
        try {
            var RESULT = (int) g_str_match_string.invokeExact(Interop.allocateNativeString(searchTerm).handle(), Interop.allocateNativeString(potentialHit).handle(), acceptAlternates ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_str_to_ascii = Interop.downcallHandle(
        "g_str_to_ascii",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transliterate {@code str} to plain ASCII.
     * <p>
     * For best results, {@code str} should be in composed normalised form.
     * <p>
     * This function performs a reasonably good set of character
     * replacements.  The particular set of replacements that is done may
     * change by version or even by runtime environment.
     * <p>
     * If the source language of {@code str} is known, it can used to improve the
     * accuracy of the translation by passing it as {@code from_locale}.  It should
     * be a valid POSIX locale string (of the form
     * {@code language[_territory][.codeset][@modifier]}).
     * <p>
     * If {@code from_locale} is {@code null} then the current locale is used.
     * <p>
     * If you want to do translation for no specific locale, and you want it
     * to be done independently of the currently locale, specify {@code "C"} for
     * {@code from_locale}.
     */
    public static java.lang.String strToAscii(java.lang.String str, java.lang.String fromLocale) {
        try {
            var RESULT = (MemoryAddress) g_str_to_ascii.invokeExact(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(fromLocale).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_str_tokenize_and_fold = Interop.downcallHandle(
        "g_str_tokenize_and_fold",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tokenises {@code string} and performs folding on each token.
     * <p>
     * A token is a non-empty sequence of alphanumeric characters in the
     * source string, separated by non-alphanumeric characters.  An
     * "alphanumeric" character for this purpose is one that matches
     * g_unichar_isalnum() or g_unichar_ismark().
     * <p>
     * Each token is then (Unicode) normalised and case-folded.  If
     * {@code ascii_alternates} is non-{@code null} and some of the returned tokens
     * contain non-ASCII characters, ASCII alternatives will be generated.
     * <p>
     * The number of ASCII alternatives that are generated and the method
     * for doing so is unspecified, but {@code translit_locale} (if specified) may
     * improve the transliteration if the language of the source string is
     * known.
     */
    public static PointerString strTokenizeAndFold(java.lang.String string, java.lang.String translitLocale, PointerString asciiAlternates) {
        try {
            var RESULT = (MemoryAddress) g_str_tokenize_and_fold.invokeExact(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(translitLocale).handle(), asciiAlternates.handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strcanon = Interop.downcallHandle(
        "g_strcanon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * For each character in {@code string}, if the character is not in {@code valid_chars},
     * replaces the character with {@code substitutor}.
     * <p>
     * Modifies {@code string} in place, and return {@code string} itself, not a copy. The
     * return value is to allow nesting such as:
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   g_ascii_strup (g_strcanon (str, "abc", '?'))
     * }</pre>
     * <p>
     * In order to modify a copy, you may use g_strdup():
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   reformatted = g_strcanon (g_strdup (const_str), "abc", '?');
     *   ...
     *   g_free (reformatted);
     * }</pre>
     */
    public static java.lang.String strcanon(java.lang.String string, java.lang.String validChars, byte substitutor) {
        try {
            var RESULT = (MemoryAddress) g_strcanon.invokeExact(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(validChars).handle(), substitutor);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strchomp = Interop.downcallHandle(
        "g_strchomp",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes trailing whitespace from a string.
     * <p>
     * This function doesn't allocate or reallocate any memory;
     * it modifies {@code string} in place. Therefore, it cannot be used
     * on statically allocated strings.
     * <p>
     * The pointer to {@code string} is returned to allow the nesting of functions.
     * <p>
     * Also see g_strchug() and g_strstrip().
     */
    public static java.lang.String strchomp(java.lang.String string) {
        try {
            var RESULT = (MemoryAddress) g_strchomp.invokeExact(Interop.allocateNativeString(string).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strchug = Interop.downcallHandle(
        "g_strchug",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes leading whitespace from a string, by moving the rest
     * of the characters forward.
     * <p>
     * This function doesn't allocate or reallocate any memory;
     * it modifies {@code string} in place. Therefore, it cannot be used on
     * statically allocated strings.
     * <p>
     * The pointer to {@code string} is returned to allow the nesting of functions.
     * <p>
     * Also see g_strchomp() and g_strstrip().
     */
    public static java.lang.String strchug(java.lang.String string) {
        try {
            var RESULT = (MemoryAddress) g_strchug.invokeExact(Interop.allocateNativeString(string).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strcmp0 = Interop.downcallHandle(
        "g_strcmp0",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares {@code str1} and {@code str2} like strcmp(). Handles {@code null}
     * gracefully by sorting it before non-{@code null} strings.
     * Comparing two {@code null} pointers returns 0.
     */
    public static int strcmp0(java.lang.String str1, java.lang.String str2) {
        try {
            var RESULT = (int) g_strcmp0.invokeExact(Interop.allocateNativeString(str1).handle(), Interop.allocateNativeString(str2).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strcompress = Interop.downcallHandle(
        "g_strcompress",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Replaces all escaped characters with their one byte equivalent.
     * <p>
     * This function does the reverse conversion of g_strescape().
     */
    public static java.lang.String strcompress(java.lang.String source) {
        try {
            var RESULT = (MemoryAddress) g_strcompress.invokeExact(Interop.allocateNativeString(source).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strdelimit = Interop.downcallHandle(
        "g_strdelimit",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Converts any delimiter characters in {@code string} to {@code new_delimiter}.
     * <p>
     * Any characters in {@code string} which are found in {@code delimiters} are
     * changed to the {@code new_delimiter} character. Modifies {@code string} in place,
     * and returns {@code string} itself, not a copy.
     * <p>
     * The return value is to allow nesting such as:
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   g_ascii_strup (g_strdelimit (str, "abc", '?'))
     * }</pre>
     * <p>
     * In order to modify a copy, you may use g_strdup():
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   reformatted = g_strdelimit (g_strdup (const_str), "abc", '?');
     *   ...
     *   g_free (reformatted);
     * }</pre>
     */
    public static java.lang.String strdelimit(java.lang.String string, java.lang.String delimiters, byte newDelimiter) {
        try {
            var RESULT = (MemoryAddress) g_strdelimit.invokeExact(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(delimiters).handle(), newDelimiter);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strdup = Interop.downcallHandle(
        "g_strdup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Duplicates a string. If {@code str} is {@code null} it returns {@code null}.
     * The returned string should be freed with g_free()
     * when no longer needed.
     */
    public static java.lang.String strdup(java.lang.String str) {
        try {
            var RESULT = (MemoryAddress) g_strdup.invokeExact(Interop.allocateNativeString(str).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strdup_vprintf = Interop.downcallHandle(
        "g_strdup_vprintf",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Similar to the standard C vsprintf() function but safer, since it
     * calculates the maximum space required and allocates memory to hold
     * the result. The returned string should be freed with g_free() when
     * no longer needed.
     * <p>
     * The returned string is guaranteed to be non-NULL, unless {@code format}
     * contains {@code %lc} or {@code %ls} conversions, which can fail if no multibyte
     * representation is available for the given character.
     * <p>
     * See also g_vasprintf(), which offers the same functionality, but
     * additionally returns the length of the allocated string.
     */
    public static java.lang.String strdupVprintf(java.lang.String format, VaList args) {
        try {
            var RESULT = (MemoryAddress) g_strdup_vprintf.invokeExact(Interop.allocateNativeString(format).handle(), args);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strdupv = Interop.downcallHandle(
        "g_strdupv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Copies {@code null}-terminated array of strings. The copy is a deep copy;
     * the new array should be freed by first freeing each string, then
     * the array itself. g_strfreev() does this for you. If called
     * on a {@code null} value, g_strdupv() simply returns {@code null}.
     */
    public static PointerString strdupv(java.lang.String[] strArray) {
        try {
            var RESULT = (MemoryAddress) g_strdupv.invokeExact(Interop.allocateNativeArray(strArray).handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strerror = Interop.downcallHandle(
        "g_strerror",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns a string corresponding to the given error code, e.g. "no
     * such process". Unlike strerror(), this always returns a string in
     * UTF-8 encoding, and the pointer is guaranteed to remain valid for
     * the lifetime of the process.
     * <p>
     * Note that the string may be translated according to the current locale.
     * <p>
     * The value of {@code errno} will not be changed by this function. However, it may
     * be changed by intermediate function calls, so you should save its value
     * as soon as the call returns:
     * <pre>{@code 
     *   int saved_errno;
     * 
     *   ret = read (blah);
     *   saved_errno = errno;
     * 
     *   g_strerror (saved_errno);
     * }</pre>
     */
    public static java.lang.String strerror(int errnum) {
        try {
            var RESULT = (MemoryAddress) g_strerror.invokeExact(errnum);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strescape = Interop.downcallHandle(
        "g_strescape",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Escapes the special characters '\\b', '\\f', '\\n', '\\r', '\\t', '\\v', '\\'
     * and '"' in the string {@code source} by inserting a '\\' before
     * them. Additionally all characters in the range 0x01-0x1F (everything
     * below SPACE) and in the range 0x7F-0xFF (all non-ASCII chars) are
     * replaced with a '\\' followed by their octal representation.
     * Characters supplied in {@code exceptions} are not escaped.
     * <p>
     * g_strcompress() does the reverse conversion.
     */
    public static java.lang.String strescape(java.lang.String source, java.lang.String exceptions) {
        try {
            var RESULT = (MemoryAddress) g_strescape.invokeExact(Interop.allocateNativeString(source).handle(), Interop.allocateNativeString(exceptions).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strfreev = Interop.downcallHandle(
        "g_strfreev",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@code null}-terminated array of strings, as well as each
     * string it contains.
     * <p>
     * If {@code str_array} is {@code null}, this function simply returns.
     */
    public static void strfreev(java.lang.String[] strArray) {
        try {
            g_strfreev.invokeExact(Interop.allocateNativeArray(strArray).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strip_context = Interop.downcallHandle(
        "g_strip_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * An auxiliary function for gettext() support (see Q_()).
     */
    public static java.lang.String stripContext(java.lang.String msgid, java.lang.String msgval) {
        try {
            var RESULT = (MemoryAddress) g_strip_context.invokeExact(Interop.allocateNativeString(msgid).handle(), Interop.allocateNativeString(msgval).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strjoinv = Interop.downcallHandle(
        "g_strjoinv",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Joins a number of strings together to form one long string, with the
     * optional {@code separator} inserted between each of them. The returned string
     * should be freed with g_free().
     * <p>
     * If {@code str_array} has no items, the return value will be an
     * empty string. If {@code str_array} contains a single item, {@code separator} will not
     * appear in the resulting string.
     */
    public static java.lang.String strjoinv(java.lang.String separator, java.lang.String[] strArray) {
        try {
            var RESULT = (MemoryAddress) g_strjoinv.invokeExact(Interop.allocateNativeString(separator).handle(), Interop.allocateNativeArray(strArray).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strlcat = Interop.downcallHandle(
        "g_strlcat",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Portability wrapper that calls strlcat() on systems which have it,
     * and emulates it otherwise. Appends nul-terminated {@code src} string to {@code dest},
     * guaranteeing nul-termination for {@code dest}. The total size of {@code dest} won't
     * exceed {@code dest_size}.
     * <p>
     * At most {@code dest_size} - 1 characters will be copied. Unlike strncat(),
     * {@code dest_size} is the full size of dest, not the space left over. This
     * function does not allocate memory. It always nul-terminates (unless
     * {@code dest_size} == 0 or there were no nul characters in the {@code dest_size}
     * characters of dest to start with).
     * <p>
     * Caveat: this is supposedly a more secure alternative to strcat() or
     * strncat(), but for real security g_strconcat() is harder to mess up.
     */
    public static long strlcat(java.lang.String dest, java.lang.String src, long destSize) {
        try {
            var RESULT = (long) g_strlcat.invokeExact(Interop.allocateNativeString(dest).handle(), Interop.allocateNativeString(src).handle(), destSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strlcpy = Interop.downcallHandle(
        "g_strlcpy",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Portability wrapper that calls strlcpy() on systems which have it,
     * and emulates strlcpy() otherwise. Copies {@code src} to {@code dest}; {@code dest} is
     * guaranteed to be nul-terminated; {@code src} must be nul-terminated;
     * {@code dest_size} is the buffer size, not the number of bytes to copy.
     * <p>
     * At most {@code dest_size} - 1 characters will be copied. Always nul-terminates
     * (unless {@code dest_size} is 0). This function does not allocate memory. Unlike
     * strncpy(), this function doesn't pad {@code dest} (so it's often faster). It
     * returns the size of the attempted result, strlen (src), so if
     * {@code retval} >= {@code dest_size}, truncation occurred.
     * <p>
     * Caveat: strlcpy() is supposedly more secure than strcpy() or strncpy(),
     * but if you really want to avoid screwups, g_strdup() is an even better
     * idea.
     */
    public static long strlcpy(java.lang.String dest, java.lang.String src, long destSize) {
        try {
            var RESULT = (long) g_strlcpy.invokeExact(Interop.allocateNativeString(dest).handle(), Interop.allocateNativeString(src).handle(), destSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strndup = Interop.downcallHandle(
        "g_strndup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Duplicates the first @n bytes of a string, returning a newly-allocated
     * buffer @n + 1 bytes long which will always be nul-terminated. If {@code str}
     * is less than @n bytes long the buffer is padded with nuls. If {@code str} is
     * {@code null} it returns {@code null}. The returned value should be freed when no longer
     * needed.
     * <p>
     * To copy a number of characters from a UTF-8 encoded string,
     * use g_utf8_strncpy() instead.
     */
    public static java.lang.String strndup(java.lang.String str, long n) {
        try {
            var RESULT = (MemoryAddress) g_strndup.invokeExact(Interop.allocateNativeString(str).handle(), n);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strnfill = Interop.downcallHandle(
        "g_strnfill",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Creates a new string {@code length} bytes long filled with {@code fill_char}.
     * The returned string should be freed when no longer needed.
     */
    public static java.lang.String strnfill(long length, byte fillChar) {
        try {
            var RESULT = (MemoryAddress) g_strnfill.invokeExact(length, fillChar);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strreverse = Interop.downcallHandle(
        "g_strreverse",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reverses all of the bytes in a string. For example,
     * {@code g_strreverse ("abcdef")} will result in "fedcba".
     * <p>
     * Note that g_strreverse() doesn't work on UTF-8 strings
     * containing multibyte characters. For that purpose, use
     * g_utf8_strreverse().
     */
    public static java.lang.String strreverse(java.lang.String string) {
        try {
            var RESULT = (MemoryAddress) g_strreverse.invokeExact(Interop.allocateNativeString(string).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strrstr = Interop.downcallHandle(
        "g_strrstr",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Searches the string {@code haystack} for the last occurrence
     * of the string {@code needle}.
     */
    public static java.lang.String strrstr(java.lang.String haystack, java.lang.String needle) {
        try {
            var RESULT = (MemoryAddress) g_strrstr.invokeExact(Interop.allocateNativeString(haystack).handle(), Interop.allocateNativeString(needle).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strrstr_len = Interop.downcallHandle(
        "g_strrstr_len",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Searches the string {@code haystack} for the last occurrence
     * of the string {@code needle}, limiting the length of the search
     * to {@code haystack_len}.
     */
    public static java.lang.String strrstrLen(java.lang.String haystack, long haystackLen, java.lang.String needle) {
        try {
            var RESULT = (MemoryAddress) g_strrstr_len.invokeExact(Interop.allocateNativeString(haystack).handle(), haystackLen, Interop.allocateNativeString(needle).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strsignal = Interop.downcallHandle(
        "g_strsignal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns a string describing the given signal, e.g. "Segmentation fault".
     * You should use this function in preference to strsignal(), because it
     * returns a string in UTF-8 encoding, and since not all platforms support
     * the strsignal() function.
     */
    public static java.lang.String strsignal(int signum) {
        try {
            var RESULT = (MemoryAddress) g_strsignal.invokeExact(signum);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strsplit = Interop.downcallHandle(
        "g_strsplit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Splits a string into a maximum of {@code max_tokens} pieces, using the given
     * {@code delimiter}. If {@code max_tokens} is reached, the remainder of {@code string} is
     * appended to the last token.
     * <p>
     * As an example, the result of g_strsplit (":a:bc::d:", ":", -1) is a
     * {@code null}-terminated vector containing the six strings "", "a", "bc", "", "d"
     * and "".
     * <p>
     * As a special case, the result of splitting the empty string "" is an empty
     * vector, not a vector containing a single string. The reason for this
     * special case is that being able to represent an empty vector is typically
     * more useful than consistent handling of empty elements. If you do need
     * to represent empty elements, you'll need to check for the empty string
     * before calling g_strsplit().
     */
    public static PointerString strsplit(java.lang.String string, java.lang.String delimiter, int maxTokens) {
        try {
            var RESULT = (MemoryAddress) g_strsplit.invokeExact(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(delimiter).handle(), maxTokens);
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strsplit_set = Interop.downcallHandle(
        "g_strsplit_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Splits {@code string} into a number of tokens not containing any of the characters
     * in {@code delimiter}. A token is the (possibly empty) longest string that does not
     * contain any of the characters in {@code delimiters}. If {@code max_tokens} is reached, the
     * remainder is appended to the last token.
     * <p>
     * For example the result of g_strsplit_set ("abc:def/ghi", ":/", -1) is a
     * {@code null}-terminated vector containing the three strings "abc", "def",
     * and "ghi".
     * <p>
     * The result of g_strsplit_set (":def/ghi:", ":/", -1) is a {@code null}-terminated
     * vector containing the four strings "", "def", "ghi", and "".
     * <p>
     * As a special case, the result of splitting the empty string "" is an empty
     * vector, not a vector containing a single string. The reason for this
     * special case is that being able to represent an empty vector is typically
     * more useful than consistent handling of empty elements. If you do need
     * to represent empty elements, you'll need to check for the empty string
     * before calling g_strsplit_set().
     * <p>
     * Note that this function works on bytes not characters, so it can't be used
     * to delimit UTF-8 strings for anything but ASCII characters.
     */
    public static PointerString strsplitSet(java.lang.String string, java.lang.String delimiters, int maxTokens) {
        try {
            var RESULT = (MemoryAddress) g_strsplit_set.invokeExact(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(delimiters).handle(), maxTokens);
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strstr_len = Interop.downcallHandle(
        "g_strstr_len",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Searches the string {@code haystack} for the first occurrence
     * of the string {@code needle}, limiting the length of the search
     * to {@code haystack_len}.
     */
    public static java.lang.String strstrLen(java.lang.String haystack, long haystackLen, java.lang.String needle) {
        try {
            var RESULT = (MemoryAddress) g_strstr_len.invokeExact(Interop.allocateNativeString(haystack).handle(), haystackLen, Interop.allocateNativeString(needle).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strtod = Interop.downcallHandle(
        "g_strtod",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a string to a {@code gdouble} value.
     * It calls the standard strtod() function to handle the conversion, but
     * if the string is not completely converted it attempts the conversion
     * again with g_ascii_strtod(), and returns the best match.
     * <p>
     * This function should seldom be used. The normal situation when reading
     * numbers not for human consumption is to use g_ascii_strtod(). Only when
     * you know that you must expect both locale formatted and C formatted numbers
     * should you use this. Make sure that you don't pass strings such as comma
     * separated lists of values, since the commas may be interpreted as a decimal
     * point in some locales, causing unexpected results.
     */
    public static double strtod(java.lang.String nptr, PointerString endptr) {
        try {
            var RESULT = (double) g_strtod.invokeExact(Interop.allocateNativeString(nptr).handle(), endptr.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strv_contains = Interop.downcallHandle(
        "g_strv_contains",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code strv} contains {@code str}. {@code strv} must not be {@code null}.
     */
    public static boolean strvContains(java.lang.String strv, java.lang.String str) {
        try {
            var RESULT = (int) g_strv_contains.invokeExact(Interop.allocateNativeString(strv).handle(), Interop.allocateNativeString(str).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strv_equal = Interop.downcallHandle(
        "g_strv_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code strv1} and {@code strv2} contain exactly the same elements in exactly the
     * same order. Elements are compared using g_str_equal(). To match independently
     * of order, sort the arrays first (using g_qsort_with_data() or similar).
     * <p>
     * Two empty arrays are considered equal. Neither {@code strv1} not {@code strv2} may be
     * {@code null}.
     */
    public static boolean strvEqual(java.lang.String strv1, java.lang.String strv2) {
        try {
            var RESULT = (int) g_strv_equal.invokeExact(Interop.allocateNativeString(strv1).handle(), Interop.allocateNativeString(strv2).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strv_get_type = Interop.downcallHandle(
        "g_strv_get_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG)
    );
    
    public static org.gtk.gobject.Type strvGetType() {
        try {
            var RESULT = (long) g_strv_get_type.invokeExact();
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strv_length = Interop.downcallHandle(
        "g_strv_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the length of the given {@code null}-terminated
     * string array {@code str_array}. {@code str_array} must not be {@code null}.
     */
    public static int strvLength(java.lang.String[] strArray) {
        try {
            var RESULT = (int) g_strv_length.invokeExact(Interop.allocateNativeArray(strArray).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_add_data_func = Interop.downcallHandle(
        "g_test_add_data_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new test case, similar to g_test_create_case(). However
     * the test is assumed to use no fixture, and test suites are automatically
     * created on the fly and added to the root fixture, based on the
     * slash-separated portions of {@code testpath}. The {@code test_data} argument
     * will be passed as first argument to {@code test_func}.
     * <p>
     * If {@code testpath} includes the component "subprocess" anywhere in it,
     * the test will be skipped by default, and only run if explicitly
     * required via the {@code -p} command-line option or g_test_trap_subprocess().
     * <p>
     * No component of {@code testpath} may start with a dot ({@code .}) if the
     * {@code G_TEST_OPTION_ISOLATE_DIRS} option is being used; and it is recommended to
     * do so even if it isn’t.
     */
    public static void testAddDataFunc(java.lang.String testpath, TestDataFunc testFunc) {
        try {
            g_test_add_data_func.invokeExact(Interop.allocateNativeString(testpath).handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(testFunc.hashCode(), testFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTestDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_add_data_func_full = Interop.downcallHandle(
        "g_test_add_data_func_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new test case, as with g_test_add_data_func(), but freeing
     * {@code test_data} after the test run is complete.
     */
    public static void testAddDataFuncFull(java.lang.String testpath, TestDataFunc testFunc) {
        try {
            g_test_add_data_func_full.invokeExact(Interop.allocateNativeString(testpath).handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(testFunc.hashCode(), testFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTestDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_add_vtable = Interop.downcallHandle(
        "g_test_add_vtable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static void testAddVtable(java.lang.String testpath, long dataSize, TestFixtureFunc dataSetup, TestFixtureFunc dataTest, TestFixtureFunc dataTeardown) {
        try {
            g_test_add_vtable.invokeExact(Interop.allocateNativeString(testpath).handle(), dataSize, 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(dataSetup.hashCode(), dataSetup)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_assert_expected_messages_internal = Interop.downcallHandle(
        "g_test_assert_expected_messages_internal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    public static void testAssertExpectedMessagesInternal(java.lang.String domain, java.lang.String file, int line, java.lang.String func) {
        try {
            g_test_assert_expected_messages_internal.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_bug = Interop.downcallHandle(
        "g_test_bug",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * This function adds a message to test reports that
     * associates a bug URI with a test case.
     * <p>
     * Bug URIs are constructed from a base URI set with g_test_bug_base()
     * and {@code bug_uri_snippet}. If g_test_bug_base() has not been called, it is
     * assumed to be the empty string, so a full URI can be provided to
     * g_test_bug() instead.
     * <p>
     * Since GLib 2.70, the base URI is not prepended to {@code bug_uri_snippet} if it
     * is already a valid URI.
     */
    public static void testBug(java.lang.String bugUriSnippet) {
        try {
            g_test_bug.invokeExact(Interop.allocateNativeString(bugUriSnippet).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_bug_base = Interop.downcallHandle(
        "g_test_bug_base",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Specify the base URI for bug reports.
     * <p>
     * The base URI is used to construct bug report messages for
     * g_test_message() when g_test_bug() is called.
     * Calling this function outside of a test case sets the
     * default base URI for all test cases. Calling it from within
     * a test case changes the base URI for the scope of the test
     * case only.
     * Bug URIs are constructed by appending a bug specific URI
     * portion to {@code uri_pattern}, or by replacing the special string
     * {@code %s} within {@code uri_pattern} if that is present.
     * <p>
     * If g_test_bug_base() is not called, bug URIs are formed solely
     * from the value provided by g_test_bug().
     */
    public static void testBugBase(java.lang.String uriPattern) {
        try {
            g_test_bug_base.invokeExact(Interop.allocateNativeString(uriPattern).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_create_case = Interop.downcallHandle(
        "g_test_create_case",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new {@link TestCase}, named {@code test_name}.
     * <p>
     * This API is fairly low level, and calling g_test_add() or g_test_add_func()
     * is preferable.
     * <p>
     * When this test is executed, a fixture structure of size {@code data_size}
     * will be automatically allocated and filled with zeros. Then {@code data_setup} is
     * called to initialize the fixture. After fixture setup, the actual test
     * function {@code data_test} is called. Once the test run completes, the
     * fixture structure is torn down by calling {@code data_teardown} and
     * after that the memory is automatically released by the test framework.
     * <p>
     * Splitting up a test run into fixture setup, test function and
     * fixture teardown is most useful if the same fixture type is used for
     * multiple tests. In this cases, g_test_create_case() will be
     * called with the same type of fixture (the {@code data_size} argument), but varying
     * {@code test_name} and {@code data_test} arguments.
     */
    public static TestCase testCreateCase(java.lang.String testName, long dataSize, TestFixtureFunc dataSetup, TestFixtureFunc dataTest, TestFixtureFunc dataTeardown) {
        try {
            var RESULT = (MemoryAddress) g_test_create_case.invokeExact(Interop.allocateNativeString(testName).handle(), dataSize, 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(dataSetup.hashCode(), dataSetup)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
            return new TestCase(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_create_suite = Interop.downcallHandle(
        "g_test_create_suite",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new test suite with the name {@code suite_name}.
     */
    public static TestSuite testCreateSuite(java.lang.String suiteName) {
        try {
            var RESULT = (MemoryAddress) g_test_create_suite.invokeExact(Interop.allocateNativeString(suiteName).handle());
            return new TestSuite(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_expect_message = Interop.downcallHandle(
        "g_test_expect_message",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Indicates that a message with the given {@code log_domain} and {@code log_level},
     * with text matching {@code pattern}, is expected to be logged. When this
     * message is logged, it will not be printed, and the test case will
     * not abort.
     * <p>
     * This API may only be used with the old logging API (g_log() without
     * {@code G_LOG_USE_STRUCTURED} defined). It will not work with the structured logging
     * API. See [Testing for Messages][testing-for-messages].
     * <p>
     * Use g_test_assert_expected_messages() to assert that all
     * previously-expected messages have been seen and suppressed.
     * <p>
     * You can call this multiple times in a row, if multiple messages are
     * expected as a result of a single call. (The messages must appear in
     * the same order as the calls to g_test_expect_message().)
     * <p>
     * For example:
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   // g_main_context_push_thread_default() should fail if the
     *   // context is already owned by another thread.
     *   g_test_expect_message (G_LOG_DOMAIN,
     *                          G_LOG_LEVEL_CRITICAL,
     *                          "assertion*acquired_context*failed");
     *   g_main_context_push_thread_default (bad_context);
     *   g_test_assert_expected_messages ();
     * }</pre>
     * <p>
     * Note that you cannot use this to test g_error() messages, since
     * g_error() intentionally never returns even if the program doesn't
     * abort; use g_test_trap_subprocess() in this case.
     * <p>
     * If messages at {@link LogLevelFlags#LEVEL_DEBUG} are emitted, but not explicitly
     * expected via g_test_expect_message() then they will be ignored.
     */
    public static void testExpectMessage(java.lang.String logDomain, LogLevelFlags logLevel, java.lang.String pattern) {
        try {
            g_test_expect_message.invokeExact(Interop.allocateNativeString(logDomain).handle(), logLevel.getValue(), Interop.allocateNativeString(pattern).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_fail = Interop.downcallHandle(
        "g_test_fail",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Indicates that a test failed. This function can be called
     * multiple times from the same test. You can use this function
     * if your test failed in a recoverable way.
     * <p>
     * Do not use this function if the failure of a test could cause
     * other tests to malfunction.
     * <p>
     * Calling this function will not stop the test from running, you
     * need to return from the test function yourself. So you can
     * produce additional diagnostic messages or even continue running
     * the test.
     * <p>
     * If not called from inside a test, this function does nothing.
     * <p>
     * Note that unlike g_test_skip() and g_test_incomplete(), this
     * function does not log a message alongside the test failure.
     * If details of the test failure are available, either log them with
     * g_test_message() before g_test_fail(), or use g_test_fail_printf()
     * instead.
     */
    public static void testFail() {
        try {
            g_test_fail.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_failed = Interop.downcallHandle(
        "g_test_failed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns whether a test has already failed. This will
     * be the case when g_test_fail(), g_test_incomplete()
     * or g_test_skip() have been called, but also if an
     * assertion has failed.
     * <p>
     * This can be useful to return early from a test if
     * continuing after a failed assertion might be harmful.
     * <p>
     * The return value of this function is only meaningful
     * if it is called from inside a test function.
     */
    public static boolean testFailed() {
        try {
            var RESULT = (int) g_test_failed.invokeExact();
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_get_dir = Interop.downcallHandle(
        "g_test_get_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the pathname of the directory containing test files of the type
     * specified by {@code file_type}.
     * <p>
     * This is approximately the same as calling g_test_build_filename("."),
     * but you don't need to free the return value.
     */
    public static java.lang.String testGetDir(TestFileType fileType) {
        try {
            var RESULT = (MemoryAddress) g_test_get_dir.invokeExact(fileType.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_get_path = Interop.downcallHandle(
        "g_test_get_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the test path for the test currently being run.
     * <p>
     * In essence, it will be the same string passed as the first argument to
     * e.g. g_test_add() when the test was added.
     * <p>
     * This function returns a valid string only within a test function.
     */
    public static java.lang.String testGetPath() {
        try {
            var RESULT = (MemoryAddress) g_test_get_path.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_get_root = Interop.downcallHandle(
        "g_test_get_root",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Get the toplevel test suite for the test path API.
     */
    public static TestSuite testGetRoot() {
        try {
            var RESULT = (MemoryAddress) g_test_get_root.invokeExact();
            return new TestSuite(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_incomplete = Interop.downcallHandle(
        "g_test_incomplete",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Indicates that a test failed because of some incomplete
     * functionality. This function can be called multiple times
     * from the same test.
     * <p>
     * Calling this function will not stop the test from running, you
     * need to return from the test function yourself. So you can
     * produce additional diagnostic messages or even continue running
     * the test.
     * <p>
     * If not called from inside a test, this function does nothing.
     */
    public static void testIncomplete(java.lang.String msg) {
        try {
            g_test_incomplete.invokeExact(Interop.allocateNativeString(msg).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_log_set_fatal_handler = Interop.downcallHandle(
        "g_test_log_set_fatal_handler",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Installs a non-error fatal log handler which can be
     * used to decide whether log messages which are counted
     * as fatal abort the program.
     * <p>
     * The use case here is that you are running a test case
     * that depends on particular libraries or circumstances
     * and cannot prevent certain known critical or warning
     * messages. So you install a handler that compares the
     * domain and message to precisely not abort in such a case.
     * <p>
     * Note that the handler is reset at the beginning of
     * any test case, so you have to set it inside each test
     * function which needs the special behavior.
     * <p>
     * This handler has no effect on g_error messages.
     * <p>
     * This handler also has no effect on structured log messages (using
     * g_log_structured() or g_log_structured_array()). To change the fatal
     * behaviour for specific log messages, programs must install a custom log
     * writer function using g_log_set_writer_func().See
     * [Using Structured Logging][using-structured-logging].
     */
    public static void testLogSetFatalHandler(TestLogFatalFunc logFunc) {
        try {
            g_test_log_set_fatal_handler.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTestLogFatalFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(logFunc.hashCode(), logFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_log_type_name = Interop.downcallHandle(
        "g_test_log_type_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    public static java.lang.String testLogTypeName(TestLogType logType) {
        try {
            var RESULT = (MemoryAddress) g_test_log_type_name.invokeExact(logType.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_queue_destroy = Interop.downcallHandle(
        "g_test_queue_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function enqueus a callback {@code destroy_func} to be executed
     * during the next test case teardown phase. This is most useful
     * to auto destruct allocated test resources at the end of a test run.
     * Resources are released in reverse queue order, that means enqueueing
     * callback A before callback B will cause B() to be called before
     * A() during teardown.
     */
    public static void testQueueDestroy(DestroyNotify destroyFunc, java.lang.foreign.MemoryAddress destroyData) {
        try {
            g_test_queue_destroy.invokeExact(
                    Interop.cbDestroyNotifySymbol(), destroyData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_queue_free = Interop.downcallHandle(
        "g_test_queue_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Enqueue a pointer to be released with g_free() during the next
     * teardown phase. This is equivalent to calling g_test_queue_destroy()
     * with a destroy callback of g_free().
     */
    public static void testQueueFree(java.lang.foreign.MemoryAddress gfreePointer) {
        try {
            g_test_queue_free.invokeExact(gfreePointer);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_rand_double = Interop.downcallHandle(
        "g_test_rand_double",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Get a reproducible random floating point number,
     * see g_test_rand_int() for details on test case random numbers.
     */
    public static double testRandDouble() {
        try {
            var RESULT = (double) g_test_rand_double.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_rand_double_range = Interop.downcallHandle(
        "g_test_rand_double_range",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Get a reproducible random floating pointer number out of a specified range,
     * see g_test_rand_int() for details on test case random numbers.
     */
    public static double testRandDoubleRange(double rangeStart, double rangeEnd) {
        try {
            var RESULT = (double) g_test_rand_double_range.invokeExact(rangeStart, rangeEnd);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_rand_int = Interop.downcallHandle(
        "g_test_rand_int",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Get a reproducible random integer number.
     * <p>
     * The random numbers generated by the g_test_rand_*() family of functions
     * change with every new test program start, unless the --seed option is
     * given when starting test programs.
     * <p>
     * For individual test cases however, the random number generator is
     * reseeded, to avoid dependencies between tests and to make --seed
     * effective for all test cases.
     */
    public static int testRandInt() {
        try {
            var RESULT = (int) g_test_rand_int.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_rand_int_range = Interop.downcallHandle(
        "g_test_rand_int_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Get a reproducible random integer number out of a specified range,
     * see g_test_rand_int() for details on test case random numbers.
     */
    public static int testRandIntRange(int begin, int end) {
        try {
            var RESULT = (int) g_test_rand_int_range.invokeExact(begin, end);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_run = Interop.downcallHandle(
        "g_test_run",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Runs all tests under the toplevel suite which can be retrieved
     * with g_test_get_root(). Similar to g_test_run_suite(), the test
     * cases to be run are filtered according to test path arguments
     * ({@code -p testpath} and {@code -s testpath}) as parsed by g_test_init().
     * g_test_run_suite() or g_test_run() may only be called once in a
     * program.
     * <p>
     * In general, the tests and sub-suites within each suite are run in
     * the order in which they are defined. However, note that prior to
     * GLib 2.36, there was a bug in the {@code g_test_add_*}
     * functions which caused them to create multiple suites with the same
     * name, meaning that if you created tests "/foo/simple",
     * "/bar/simple", and "/foo/using-bar" in that order, they would get
     * run in that order (since g_test_run() would run the first "/foo"
     * suite, then the "/bar" suite, then the second "/foo" suite). As of
     * 2.36, this bug is fixed, and adding the tests in that order would
     * result in a running order of "/foo/simple", "/foo/using-bar",
     * "/bar/simple". If this new ordering is sub-optimal (because it puts
     * more-complicated tests before simpler ones, making it harder to
     * figure out exactly what has failed), you can fix it by changing the
     * test paths to group tests by suite in a way that will result in the
     * desired running order. Eg, "/simple/foo", "/simple/bar",
     * "/complex/foo-using-bar".
     * <p>
     * However, you should never make the actual result of a test depend
     * on the order that tests are run in. If you need to ensure that some
     * particular code runs before or after a given test case, use
     * g_test_add(), which lets you specify setup and teardown functions.
     * <p>
     * If all tests are skipped or marked as incomplete (expected failures),
     * this function will return 0 if producing TAP output, or 77 (treated
     * as "skip test" by Automake) otherwise.
     */
    public static int testRun() {
        try {
            var RESULT = (int) g_test_run.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_run_suite = Interop.downcallHandle(
        "g_test_run_suite",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Execute the tests within {@code suite} and all nested {@code GTestSuites}.
     * The test suites to be executed are filtered according to
     * test path arguments ({@code -p testpath} and {@code -s testpath}) as parsed by
     * g_test_init(). See the g_test_run() documentation for more
     * information on the order that tests are run in.
     * <p>
     * g_test_run_suite() or g_test_run() may only be called once
     * in a program.
     */
    public static int testRunSuite(TestSuite suite) {
        try {
            var RESULT = (int) g_test_run_suite.invokeExact(suite.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_set_nonfatal_assertions = Interop.downcallHandle(
        "g_test_set_nonfatal_assertions",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Changes the behaviour of the various {@code g_assert_*()} macros,
     * g_test_assert_expected_messages() and the various
     * {@code g_test_trap_assert_*()} macros to not abort to program, but instead
     * call g_test_fail() and continue. (This also changes the behavior of
     * g_test_fail() so that it will not cause the test program to abort
     * after completing the failed test.)
     * <p>
     * Note that the g_assert_not_reached() and g_assert() macros are not
     * affected by this.
     * <p>
     * This function can only be called after g_test_init().
     */
    public static void testSetNonfatalAssertions() {
        try {
            g_test_set_nonfatal_assertions.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_skip = Interop.downcallHandle(
        "g_test_skip",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Indicates that a test was skipped.
     * <p>
     * Calling this function will not stop the test from running, you
     * need to return from the test function yourself. So you can
     * produce additional diagnostic messages or even continue running
     * the test.
     * <p>
     * If not called from inside a test, this function does nothing.
     */
    public static void testSkip(java.lang.String msg) {
        try {
            g_test_skip.invokeExact(Interop.allocateNativeString(msg).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_subprocess = Interop.downcallHandle(
        "g_test_subprocess",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} (after g_test_init() has been called) if the test
     * program is running under g_test_trap_subprocess().
     */
    public static boolean testSubprocess() {
        try {
            var RESULT = (int) g_test_subprocess.invokeExact();
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_summary = Interop.downcallHandle(
        "g_test_summary",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Set the summary for a test, which describes what the test checks, and how it
     * goes about checking it. This may be included in test report output, and is
     * useful documentation for anyone reading the source code or modifying a test
     * in future. It must be a single line.
     * <p>
     * This should be called at the top of a test function.
     * <p>
     * For example:
     * <pre>{@code <!-- language="C" -->
     * static void
     * test_array_sort (void)
     * {
     *   g_test_summary ("Test my_array_sort() sorts the array correctly and stably, "
     *                   "including testing zero length and one-element arrays.");
     * 
     *   …
     * }
     * }</pre>
     */
    public static void testSummary(java.lang.String summary) {
        try {
            g_test_summary.invokeExact(Interop.allocateNativeString(summary).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_timer_elapsed = Interop.downcallHandle(
        "g_test_timer_elapsed",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Get the number of seconds since the last start of the timer with
     * g_test_timer_start().
     */
    public static double testTimerElapsed() {
        try {
            var RESULT = (double) g_test_timer_elapsed.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_timer_last = Interop.downcallHandle(
        "g_test_timer_last",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Report the last result of g_test_timer_elapsed().
     */
    public static double testTimerLast() {
        try {
            var RESULT = (double) g_test_timer_last.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_timer_start = Interop.downcallHandle(
        "g_test_timer_start",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Start a timing test. Call g_test_timer_elapsed() when the task is supposed
     * to be done. Call this function again to restart the timer.
     */
    public static void testTimerStart() {
        try {
            g_test_timer_start.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_trap_assertions = Interop.downcallHandle(
        "g_test_trap_assertions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    public static void testTrapAssertions(java.lang.String domain, java.lang.String file, int line, java.lang.String func, long assertionFlags, java.lang.String pattern) {
        try {
            g_test_trap_assertions.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), assertionFlags, Interop.allocateNativeString(pattern).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_trap_has_passed = Interop.downcallHandle(
        "g_test_trap_has_passed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Check the result of the last g_test_trap_subprocess() call.
     */
    public static boolean testTrapHasPassed() {
        try {
            var RESULT = (int) g_test_trap_has_passed.invokeExact();
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_trap_reached_timeout = Interop.downcallHandle(
        "g_test_trap_reached_timeout",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Check the result of the last g_test_trap_subprocess() call.
     */
    public static boolean testTrapReachedTimeout() {
        try {
            var RESULT = (int) g_test_trap_reached_timeout.invokeExact();
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_test_trap_subprocess = Interop.downcallHandle(
        "g_test_trap_subprocess",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Respawns the test program to run only {@code test_path} in a subprocess.
     * This can be used for a test case that might not return, or that
     * might abort.
     * <p>
     * If {@code test_path} is {@code null} then the same test is re-run in a subprocess.
     * You can use g_test_subprocess() to determine whether the test is in
     * a subprocess or not.
     * <p>
     * {@code test_path} can also be the name of the parent test, followed by
     * "{@code /subprocess/}" and then a name for the specific subtest (or just
     * ending with "{@code /subprocess}" if the test only has one child test);
     * tests with names of this form will automatically be skipped in the
     * parent process.
     * <p>
     * If {@code usec_timeout} is non-0, the test subprocess is aborted and
     * considered failing if its run time exceeds it.
     * <p>
     * The subprocess behavior can be configured with the
     * {@link TestSubprocessFlags} flags.
     * <p>
     * You can use methods such as g_test_trap_assert_passed(),
     * g_test_trap_assert_failed(), and g_test_trap_assert_stderr() to
     * check the results of the subprocess. (But note that
     * g_test_trap_assert_stdout() and g_test_trap_assert_stderr()
     * cannot be used if {@code test_flags} specifies that the child should
     * inherit the parent stdout/stderr.)
     * <p>
     * If your {@code main ()} needs to behave differently in
     * the subprocess, you can call g_test_subprocess() (after calling
     * g_test_init()) to see whether you are in a subprocess.
     * <p>
     * The following example tests that calling
     * {@code my_object_new(1000000)} will abort with an error
     * message.
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   static void
     *   test_create_large_object (void)
     *   {
     *     if (g_test_subprocess ())
     *       {
     *         my_object_new (1000000);
     *         return;
     *       }
     * 
     *     // Reruns this same test in a subprocess
     *     g_test_trap_subprocess (NULL, 0, 0);
     *     g_test_trap_assert_failed ();
     *     g_test_trap_assert_stderr ("*ERROR*too large*");
     *   }
     * 
     *   int
     *   main (int argc, char **argv)
     *   {
     *     g_test_init (&argc, &argv, NULL);
     * 
     *     g_test_add_func ("/myobject/create_large_object",
     *                      test_create_large_object);
     *     return g_test_run ();
     *   }
     * }</pre>
     */
    public static void testTrapSubprocess(java.lang.String testPath, long usecTimeout, TestSubprocessFlags testFlags) {
        try {
            g_test_trap_subprocess.invokeExact(Interop.allocateNativeString(testPath).handle(), usecTimeout, testFlags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_error_quark = Interop.downcallHandle(
        "g_thread_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark threadErrorQuark() {
        try {
            var RESULT = (int) g_thread_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_exit = Interop.downcallHandle(
        "g_thread_exit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Terminates the current thread.
     * <p>
     * If another thread is waiting for us using g_thread_join() then the
     * waiting thread will be woken up and get {@code retval} as the return value
     * of g_thread_join().
     * <p>
     * Calling g_thread_exit() with a parameter {@code retval} is equivalent to
     * returning {@code retval} from the function {@code func}, as given to g_thread_new().
     * <p>
     * You must only call g_thread_exit() from a thread that you created
     * yourself with g_thread_new() or related APIs. You must not call
     * this function from a thread created with another threading library
     * or or from within a {@link ThreadPool}.
     */
    public static void threadExit(java.lang.foreign.MemoryAddress retval) {
        try {
            g_thread_exit.invokeExact(retval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_pool_get_max_idle_time = Interop.downcallHandle(
        "g_thread_pool_get_max_idle_time",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * This function will return the maximum {@code interval} that a
     * thread will wait in the thread pool for new tasks before
     * being stopped.
     * <p>
     * If this function returns 0, threads waiting in the thread
     * pool for new work are not stopped.
     */
    public static int threadPoolGetMaxIdleTime() {
        try {
            var RESULT = (int) g_thread_pool_get_max_idle_time.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_pool_get_max_unused_threads = Interop.downcallHandle(
        "g_thread_pool_get_max_unused_threads",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the maximal allowed number of unused threads.
     */
    public static int threadPoolGetMaxUnusedThreads() {
        try {
            var RESULT = (int) g_thread_pool_get_max_unused_threads.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_pool_get_num_unused_threads = Interop.downcallHandle(
        "g_thread_pool_get_num_unused_threads",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the number of currently unused threads.
     */
    public static int threadPoolGetNumUnusedThreads() {
        try {
            var RESULT = (int) g_thread_pool_get_num_unused_threads.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_pool_set_max_idle_time = Interop.downcallHandle(
        "g_thread_pool_set_max_idle_time",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * This function will set the maximum {@code interval} that a thread
     * waiting in the pool for new tasks can be idle for before
     * being stopped. This function is similar to calling
     * g_thread_pool_stop_unused_threads() on a regular timeout,
     * except this is done on a per thread basis.
     * <p>
     * By setting {@code interval} to 0, idle threads will not be stopped.
     * <p>
     * The default value is 15000 (15 seconds).
     */
    public static void threadPoolSetMaxIdleTime(int interval) {
        try {
            g_thread_pool_set_max_idle_time.invokeExact(interval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_pool_set_max_unused_threads = Interop.downcallHandle(
        "g_thread_pool_set_max_unused_threads",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximal number of unused threads to {@code max_threads}.
     * If {@code max_threads} is -1, no limit is imposed on the number
     * of unused threads.
     * <p>
     * The default value is 2.
     */
    public static void threadPoolSetMaxUnusedThreads(int maxThreads) {
        try {
            g_thread_pool_set_max_unused_threads.invokeExact(maxThreads);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_pool_stop_unused_threads = Interop.downcallHandle(
        "g_thread_pool_stop_unused_threads",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Stops all currently unused threads. This does not change the
     * maximal number of unused threads. This function can be used to
     * regularly stop all unused threads e.g. from g_timeout_add().
     */
    public static void threadPoolStopUnusedThreads() {
        try {
            g_thread_pool_stop_unused_threads.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_self = Interop.downcallHandle(
        "g_thread_self",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * This function returns the {@link Thread} corresponding to the
     * current thread. Note that this function does not increase
     * the reference count of the returned struct.
     * <p>
     * This function will return a {@link Thread} even for threads that
     * were not created by GLib (i.e. those created by other threading
     * APIs). This may be useful for thread identification purposes
     * (i.e. comparisons) but you must not use GLib functions (such
     * as g_thread_join()) on these threads.
     */
    public static Thread threadSelf() {
        try {
            var RESULT = (MemoryAddress) g_thread_self.invokeExact();
            return new Thread(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_thread_yield = Interop.downcallHandle(
        "g_thread_yield",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Causes the calling thread to voluntarily relinquish the CPU, so
     * that other threads can run.
     * <p>
     * This function is often used as a method to make busy wait less evil.
     */
    public static void threadYield() {
        try {
            g_thread_yield.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timeout_add = Interop.downcallHandle(
        "g_timeout_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a function to be called at regular intervals, with the default
     * priority, {@code G_PRIORITY_DEFAULT}.
     * <p>
     * The given {@code function} is called repeatedly until it returns {@code G_SOURCE_REMOVE}
     * or {@code false}, at which point the timeout is automatically destroyed and the
     * function will not be called again. The first call to the function will be
     * at the end of the first {@code interval}.
     * <p>
     * Note that timeout functions may be delayed, due to the processing of other
     * event sources. Thus they should not be relied on for precise timing.
     * After each call to the timeout function, the time of the next
     * timeout is recalculated based on the current time and the given interval
     * (it does not try to 'catch up' time lost in delays).
     * <p>
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle the return value and memory management of {@code data}.
     * <p>
     * If you want to have a timer in the "seconds" range and do not care
     * about the exact time of the first call of the timer, use the
     * g_timeout_add_seconds() function; this function allows for more
     * optimizations and more efficient system power usage.
     * <p>
     * This internally creates a main loop source using g_timeout_source_new()
     * and attaches it to the global {@link MainContext} using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     * <p>
     * It is safe to call this function from any thread.
     * <p>
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     */
    public static int timeoutAdd(int interval, SourceFunc function) {
        try {
            var RESULT = (int) g_timeout_add.invokeExact(interval, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timeout_add_full = Interop.downcallHandle(
        "g_timeout_add_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a function to be called at regular intervals, with the given
     * priority.  The function is called repeatedly until it returns
     * {@code false}, at which point the timeout is automatically destroyed and
     * the function will not be called again.  The {@code notify} function is
     * called when the timeout is destroyed.  The first call to the
     * function will be at the end of the first {@code interval}.
     * <p>
     * Note that timeout functions may be delayed, due to the processing of other
     * event sources. Thus they should not be relied on for precise timing.
     * After each call to the timeout function, the time of the next
     * timeout is recalculated based on the current time and the given interval
     * (it does not try to 'catch up' time lost in delays).
     * <p>
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle the return value and memory management of {@code data}.
     * <p>
     * This internally creates a main loop source using g_timeout_source_new()
     * and attaches it to the global {@link MainContext} using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     * <p>
     * The interval given is in terms of monotonic time, not wall clock time.
     * See g_get_monotonic_time().
     */
    public static int timeoutAddFull(int priority, int interval, SourceFunc function) {
        try {
            var RESULT = (int) g_timeout_add_full.invokeExact(priority, interval, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timeout_add_seconds = Interop.downcallHandle(
        "g_timeout_add_seconds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a function to be called at regular intervals with the default
     * priority, {@code G_PRIORITY_DEFAULT}.
     * <p>
     * The function is called repeatedly until it returns {@code G_SOURCE_REMOVE}
     * or {@code false}, at which point the timeout is automatically destroyed
     * and the function will not be called again.
     * <p>
     * This internally creates a main loop source using
     * g_timeout_source_new_seconds() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you need
     * greater control. Also see g_timeout_add_seconds_full().
     * <p>
     * It is safe to call this function from any thread.
     * <p>
     * Note that the first call of the timer may not be precise for timeouts
     * of one second. If you need finer precision and have such a timeout,
     * you may want to use g_timeout_add() instead.
     * <p>
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle the return value and memory management of {@code data}.
     * <p>
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     */
    public static int timeoutAddSeconds(int interval, SourceFunc function) {
        try {
            var RESULT = (int) g_timeout_add_seconds.invokeExact(interval, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timeout_add_seconds_full = Interop.downcallHandle(
        "g_timeout_add_seconds_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a function to be called at regular intervals, with {@code priority}.
     * <p>
     * The function is called repeatedly until it returns {@code G_SOURCE_REMOVE}
     * or {@code false}, at which point the timeout is automatically destroyed and
     * the function will not be called again.
     * <p>
     * Unlike g_timeout_add(), this function operates at whole second granularity.
     * The initial starting point of the timer is determined by the implementation
     * and the implementation is expected to group multiple timers together so that
     * they fire all at the same time. To allow this grouping, the {@code interval} to the
     * first timer is rounded and can deviate up to one second from the specified
     * interval. Subsequent timer iterations will generally run at the specified
     * interval.
     * <p>
     * Note that timeout functions may be delayed, due to the processing of other
     * event sources. Thus they should not be relied on for precise timing.
     * After each call to the timeout function, the time of the next
     * timeout is recalculated based on the current time and the given {@code interval}
     * <p>
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle the return value and memory management of {@code data}.
     * <p>
     * If you want timing more precise than whole seconds, use g_timeout_add()
     * instead.
     * <p>
     * The grouping of timers to fire at the same time results in a more power
     * and CPU efficient behavior so if your timer is in multiples of seconds
     * and you don't require the first timer exactly one second from now, the
     * use of g_timeout_add_seconds() is preferred over g_timeout_add().
     * <p>
     * This internally creates a main loop source using
     * g_timeout_source_new_seconds() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you need
     * greater control.
     * <p>
     * It is safe to call this function from any thread.
     * <p>
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     */
    public static int timeoutAddSecondsFull(int priority, int interval, SourceFunc function) {
        try {
            var RESULT = (int) g_timeout_add_seconds_full.invokeExact(priority, interval, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timeout_source_new = Interop.downcallHandle(
        "g_timeout_source_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new timeout source.
     * <p>
     * The source will not initially be associated with any {@link MainContext}
     * and must be added to one with g_source_attach() before it will be
     * executed.
     * <p>
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     */
    public static Source timeoutSourceNew(int interval) {
        try {
            var RESULT = (MemoryAddress) g_timeout_source_new.invokeExact(interval);
            return new Source(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_timeout_source_new_seconds = Interop.downcallHandle(
        "g_timeout_source_new_seconds",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new timeout source.
     * <p>
     * The source will not initially be associated with any {@link MainContext}
     * and must be added to one with g_source_attach() before it will be
     * executed.
     * <p>
     * The scheduling granularity/accuracy of this timeout source will be
     * in seconds.
     * <p>
     * The interval given is in terms of monotonic time, not wall clock time.
     * See g_get_monotonic_time().
     */
    public static Source timeoutSourceNewSeconds(int interval) {
        try {
            var RESULT = (MemoryAddress) g_timeout_source_new_seconds.invokeExact(interval);
            return new Source(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_try_malloc = Interop.downcallHandle(
        "g_try_malloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Attempts to allocate {@code n_bytes}, and returns {@code null} on failure.
     * Contrast with g_malloc(), which aborts the program on failure.
     */
    public static java.lang.foreign.MemoryAddress tryMalloc(long nBytes) {
        try {
            var RESULT = (MemoryAddress) g_try_malloc.invokeExact(nBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_try_malloc0 = Interop.downcallHandle(
        "g_try_malloc0",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Attempts to allocate {@code n_bytes}, initialized to 0's, and returns {@code null} on
     * failure. Contrast with g_malloc0(), which aborts the program on failure.
     */
    public static java.lang.foreign.MemoryAddress tryMalloc0(long nBytes) {
        try {
            var RESULT = (MemoryAddress) g_try_malloc0.invokeExact(nBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_try_malloc0_n = Interop.downcallHandle(
        "g_try_malloc0_n",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is similar to g_try_malloc0(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static java.lang.foreign.MemoryAddress tryMalloc0N(long nBlocks, long nBlockBytes) {
        try {
            var RESULT = (MemoryAddress) g_try_malloc0_n.invokeExact(nBlocks, nBlockBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_try_malloc_n = Interop.downcallHandle(
        "g_try_malloc_n",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is similar to g_try_malloc(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static java.lang.foreign.MemoryAddress tryMallocN(long nBlocks, long nBlockBytes) {
        try {
            var RESULT = (MemoryAddress) g_try_malloc_n.invokeExact(nBlocks, nBlockBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_try_realloc = Interop.downcallHandle(
        "g_try_realloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Attempts to realloc {@code mem} to a new size, {@code n_bytes}, and returns {@code null}
     * on failure. Contrast with g_realloc(), which aborts the program
     * on failure.
     * <p>
     * If {@code mem} is {@code null}, behaves the same as g_try_malloc().
     */
    public static java.lang.foreign.MemoryAddress tryRealloc(java.lang.foreign.MemoryAddress mem, long nBytes) {
        try {
            var RESULT = (MemoryAddress) g_try_realloc.invokeExact(mem, nBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_try_realloc_n = Interop.downcallHandle(
        "g_try_realloc_n",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is similar to g_try_realloc(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static java.lang.foreign.MemoryAddress tryReallocN(java.lang.foreign.MemoryAddress mem, long nBlocks, long nBlockBytes) {
        try {
            var RESULT = (MemoryAddress) g_try_realloc_n.invokeExact(mem, nBlocks, nBlockBytes);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ucs4_to_utf16 = Interop.downcallHandle(
        "g_ucs4_to_utf16",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convert a string from UCS-4 to UTF-16. A 0 character will be
     * added to the result after the converted text.
     */
    public static PointerShort ucs4ToUtf16(PointerInteger str, long len, PointerLong itemsRead, PointerLong itemsWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_ucs4_to_utf16.invokeExact(str.handle(), len, itemsRead.handle(), itemsWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerShort(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_ucs4_to_utf8 = Interop.downcallHandle(
        "g_ucs4_to_utf8",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convert a string from a 32-bit fixed width representation as UCS-4.
     * to UTF-8. The result will be terminated with a 0 byte.
     */
    public static java.lang.String ucs4ToUtf8(PointerInteger str, long len, PointerLong itemsRead, PointerLong itemsWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_ucs4_to_utf8.invokeExact(str.handle(), len, itemsRead.handle(), itemsWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_break_type = Interop.downcallHandle(
        "g_unichar_break_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the break type of @c. @c should be a Unicode character
     * (to derive a character from UTF-8 encoded text, use
     * g_utf8_get_char()). The break type is used to find word and line
     * breaks ("text boundaries"), Pango implements the Unicode boundary
     * resolution algorithms and normally you would use a function such
     * as pango_break() instead of caring about break types yourself.
     */
    public static UnicodeBreakType unicharBreakType(int c) {
        try {
            var RESULT = (int) g_unichar_break_type.invokeExact(c);
            return new UnicodeBreakType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_combining_class = Interop.downcallHandle(
        "g_unichar_combining_class",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the canonical combining class of a Unicode character.
     */
    public static int unicharCombiningClass(int uc) {
        try {
            var RESULT = (int) g_unichar_combining_class.invokeExact(uc);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_compose = Interop.downcallHandle(
        "g_unichar_compose",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Performs a single composition step of the
     * Unicode canonical composition algorithm.
     * <p>
     * This function includes algorithmic Hangul Jamo composition,
     * but it is not exactly the inverse of g_unichar_decompose().
     * No composition can have either of @a or @b equal to zero.
     * To be precise, this function composes if and only if
     * there exists a Primary Composite P which is canonically
     * equivalent to the sequence &lt;@a,@b&gt;.  See the Unicode
     * Standard for the definition of Primary Composite.
     * <p>
     * If @a and @b do not compose a new character, {@code ch} is set to zero.
     * <p>
     * See
     * <a href="http://unicode.org/reports/tr15/">UAX#15</a>
     * for details.
     */
    public static boolean unicharCompose(int a, int b, PointerInteger ch) {
        try {
            var RESULT = (int) g_unichar_compose.invokeExact(a, b, ch.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_decompose = Interop.downcallHandle(
        "g_unichar_decompose",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Performs a single decomposition step of the
     * Unicode canonical decomposition algorithm.
     * <p>
     * This function does not include compatibility
     * decompositions. It does, however, include algorithmic
     * Hangul Jamo decomposition, as well as 'singleton'
     * decompositions which replace a character by a single
     * other character. In the case of singletons *@b will
     * be set to zero.
     * <p>
     * If {@code ch} is not decomposable, <strong>@a is set to @ch and </strong>@b
     * is set to zero.
     * <p>
     * Note that the way Unicode decomposition pairs are
     * defined, it is guaranteed that @b would not decompose
     * further, but @a may itself decompose.  To get the full
     * canonical decomposition for {@code ch}, one would need to
     * recursively call this function on @a.  Or use
     * g_unichar_fully_decompose().
     * <p>
     * See
     * <a href="http://unicode.org/reports/tr15/">UAX#15</a>
     * for details.
     */
    public static boolean unicharDecompose(int ch, PointerInteger a, PointerInteger b) {
        try {
            var RESULT = (int) g_unichar_decompose.invokeExact(ch, a.handle(), b.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_digit_value = Interop.downcallHandle(
        "g_unichar_digit_value",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the numeric value of a character as a decimal
     * digit.
     */
    public static int unicharDigitValue(int c) {
        try {
            var RESULT = (int) g_unichar_digit_value.invokeExact(c);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_fully_decompose = Interop.downcallHandle(
        "g_unichar_fully_decompose",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Computes the canonical or compatibility decomposition of a
     * Unicode character.  For compatibility decomposition,
     * pass {@code true} for {@code compat}; for canonical decomposition
     * pass {@code false} for {@code compat}.
     * <p>
     * The decomposed sequence is placed in {@code result}.  Only up to
     * {@code result_len} characters are written into {@code result}.  The length
     * of the full decomposition (irrespective of {@code result_len}) is
     * returned by the function.  For canonical decomposition,
     * currently all decompositions are of length at most 4, but
     * this may change in the future (very unlikely though).
     * At any rate, Unicode does guarantee that a buffer of length
     * 18 is always enough for both compatibility and canonical
     * decompositions, so that is the size recommended. This is provided
     * as {@code G_UNICHAR_MAX_DECOMPOSITION_LENGTH}.
     * <p>
     * See
     * <a href="http://unicode.org/reports/tr15/">UAX#15</a>
     * for details.
     */
    public static long unicharFullyDecompose(int ch, boolean compat, PointerInteger result, long resultLen) {
        try {
            var RESULT = (long) g_unichar_fully_decompose.invokeExact(ch, compat ? 1 : 0, result.handle(), resultLen);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_get_mirror_char = Interop.downcallHandle(
        "g_unichar_get_mirror_char",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * In Unicode, some characters are "mirrored". This means that their
     * images are mirrored horizontally in text that is laid out from right
     * to left. For instance, "(" would become its mirror image, ")", in
     * right-to-left text.
     * <p>
     * If {@code ch} has the Unicode mirrored property and there is another unicode
     * character that typically has a glyph that is the mirror image of {@code ch}'s
     * glyph and {@code mirrored_ch} is set, it puts that character in the address
     * pointed to by {@code mirrored_ch}.  Otherwise the original character is put.
     */
    public static boolean unicharGetMirrorChar(int ch, PointerInteger mirroredCh) {
        try {
            var RESULT = (int) g_unichar_get_mirror_char.invokeExact(ch, mirroredCh.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_get_script = Interop.downcallHandle(
        "g_unichar_get_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Looks up the {@link UnicodeScript} for a particular character (as defined
     * by Unicode Standard Annex \\{@code 24}). No check is made for {@code ch} being a
     * valid Unicode character; if you pass in invalid character, the
     * result is undefined.
     * <p>
     * This function is equivalent to pango_script_for_unichar() and the
     * two are interchangeable.
     */
    public static UnicodeScript unicharGetScript(int ch) {
        try {
            var RESULT = (int) g_unichar_get_script.invokeExact(ch);
            return new UnicodeScript(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_isalnum = Interop.downcallHandle(
        "g_unichar_isalnum",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is alphanumeric.
     * Given some UTF-8 text, obtain a character value
     * with g_utf8_get_char().
     */
    public static boolean unicharIsalnum(int c) {
        try {
            var RESULT = (int) g_unichar_isalnum.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_isalpha = Interop.downcallHandle(
        "g_unichar_isalpha",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is alphabetic (i.e. a letter).
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIsalpha(int c) {
        try {
            var RESULT = (int) g_unichar_isalpha.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_iscntrl = Interop.downcallHandle(
        "g_unichar_iscntrl",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is a control character.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIscntrl(int c) {
        try {
            var RESULT = (int) g_unichar_iscntrl.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_isdefined = Interop.downcallHandle(
        "g_unichar_isdefined",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if a given character is assigned in the Unicode
     * standard.
     */
    public static boolean unicharIsdefined(int c) {
        try {
            var RESULT = (int) g_unichar_isdefined.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_isdigit = Interop.downcallHandle(
        "g_unichar_isdigit",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is numeric (i.e. a digit).  This
     * covers ASCII 0-9 and also digits in other languages/scripts.  Given
     * some UTF-8 text, obtain a character value with g_utf8_get_char().
     */
    public static boolean unicharIsdigit(int c) {
        try {
            var RESULT = (int) g_unichar_isdigit.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_isgraph = Interop.downcallHandle(
        "g_unichar_isgraph",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is printable and not a space
     * (returns {@code false} for control characters, format characters, and
     * spaces). g_unichar_isprint() is similar, but returns {@code true} for
     * spaces. Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIsgraph(int c) {
        try {
            var RESULT = (int) g_unichar_isgraph.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_islower = Interop.downcallHandle(
        "g_unichar_islower",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is a lowercase letter.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIslower(int c) {
        try {
            var RESULT = (int) g_unichar_islower.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_ismark = Interop.downcallHandle(
        "g_unichar_ismark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is a mark (non-spacing mark,
     * combining mark, or enclosing mark in Unicode speak).
     * Given some UTF-8 text, obtain a character value
     * with g_utf8_get_char().
     * <p>
     * Note: in most cases where isalpha characters are allowed,
     * ismark characters should be allowed to as they are essential
     * for writing most European languages as well as many non-Latin
     * scripts.
     */
    public static boolean unicharIsmark(int c) {
        try {
            var RESULT = (int) g_unichar_ismark.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_isprint = Interop.downcallHandle(
        "g_unichar_isprint",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is printable.
     * Unlike g_unichar_isgraph(), returns {@code true} for spaces.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIsprint(int c) {
        try {
            var RESULT = (int) g_unichar_isprint.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_ispunct = Interop.downcallHandle(
        "g_unichar_ispunct",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is punctuation or a symbol.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIspunct(int c) {
        try {
            var RESULT = (int) g_unichar_ispunct.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_isspace = Interop.downcallHandle(
        "g_unichar_isspace",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines whether a character is a space, tab, or line separator
     * (newline, carriage return, etc.).  Given some UTF-8 text, obtain a
     * character value with g_utf8_get_char().
     * <p>
     * (Note: don't use this to do word breaking; you have to use
     * Pango or equivalent to get word breaking right, the algorithm
     * is fairly complex.)
     */
    public static boolean unicharIsspace(int c) {
        try {
            var RESULT = (int) g_unichar_isspace.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_istitle = Interop.downcallHandle(
        "g_unichar_istitle",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if a character is titlecase. Some characters in
     * Unicode which are composites, such as the DZ digraph
     * have three case variants instead of just two. The titlecase
     * form is used at the beginning of a word where only the
     * first letter is capitalized. The titlecase form of the DZ
     * digraph is U+01F2 LATIN CAPITAL LETTTER D WITH SMALL LETTER Z.
     */
    public static boolean unicharIstitle(int c) {
        try {
            var RESULT = (int) g_unichar_istitle.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_isupper = Interop.downcallHandle(
        "g_unichar_isupper",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if a character is uppercase.
     */
    public static boolean unicharIsupper(int c) {
        try {
            var RESULT = (int) g_unichar_isupper.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_iswide = Interop.downcallHandle(
        "g_unichar_iswide",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if a character is typically rendered in a double-width
     * cell.
     */
    public static boolean unicharIswide(int c) {
        try {
            var RESULT = (int) g_unichar_iswide.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_iswide_cjk = Interop.downcallHandle(
        "g_unichar_iswide_cjk",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if a character is typically rendered in a double-width
     * cell under legacy East Asian locales.  If a character is wide according to
     * g_unichar_iswide(), then it is also reported wide with this function, but
     * the converse is not necessarily true. See the
     * <a href="http://www.unicode.org/reports/tr11/">Unicode Standard Annex #11</a>
     * for details.
     * <p>
     * If a character passes the g_unichar_iswide() test then it will also pass
     * this test, but not the other way around.  Note that some characters may
     * pass both this test and g_unichar_iszerowidth().
     */
    public static boolean unicharIswideCjk(int c) {
        try {
            var RESULT = (int) g_unichar_iswide_cjk.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_isxdigit = Interop.downcallHandle(
        "g_unichar_isxdigit",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if a character is a hexadecimal digit.
     */
    public static boolean unicharIsxdigit(int c) {
        try {
            var RESULT = (int) g_unichar_isxdigit.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_iszerowidth = Interop.downcallHandle(
        "g_unichar_iszerowidth",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if a given character typically takes zero width when rendered.
     * The return value is {@code true} for all non-spacing and enclosing marks
     * (e.g., combining accents), format characters, zero-width
     * space, but not U+00AD SOFT HYPHEN.
     * <p>
     * A typical use of this function is with one of g_unichar_iswide() or
     * g_unichar_iswide_cjk() to determine the number of cells a string occupies
     * when displayed on a grid display (terminals).  However, note that not all
     * terminals support zero-width rendering of zero-width marks.
     */
    public static boolean unicharIszerowidth(int c) {
        try {
            var RESULT = (int) g_unichar_iszerowidth.invokeExact(c);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_to_utf8 = Interop.downcallHandle(
        "g_unichar_to_utf8",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a single character to UTF-8.
     */
    public static int unicharToUtf8(int c, java.lang.String outbuf) {
        try {
            var RESULT = (int) g_unichar_to_utf8.invokeExact(c, Interop.allocateNativeString(outbuf).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_tolower = Interop.downcallHandle(
        "g_unichar_tolower",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a character to lower case.
     */
    public static int unicharTolower(int c) {
        try {
            var RESULT = (int) g_unichar_tolower.invokeExact(c);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_totitle = Interop.downcallHandle(
        "g_unichar_totitle",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a character to the titlecase.
     */
    public static int unicharTotitle(int c) {
        try {
            var RESULT = (int) g_unichar_totitle.invokeExact(c);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_toupper = Interop.downcallHandle(
        "g_unichar_toupper",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a character to uppercase.
     */
    public static int unicharToupper(int c) {
        try {
            var RESULT = (int) g_unichar_toupper.invokeExact(c);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_type = Interop.downcallHandle(
        "g_unichar_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Classifies a Unicode character by type.
     */
    public static UnicodeType unicharType(int c) {
        try {
            var RESULT = (int) g_unichar_type.invokeExact(c);
            return new UnicodeType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_validate = Interop.downcallHandle(
        "g_unichar_validate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks whether {@code ch} is a valid Unicode character. Some possible
     * integer values of {@code ch} will not be valid. 0 is considered a valid
     * character, though it's normally a string terminator.
     */
    public static boolean unicharValidate(int ch) {
        try {
            var RESULT = (int) g_unichar_validate.invokeExact(ch);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unichar_xdigit_value = Interop.downcallHandle(
        "g_unichar_xdigit_value",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the numeric value of a character as a hexadecimal
     * digit.
     */
    public static int unicharXdigitValue(int c) {
        try {
            var RESULT = (int) g_unichar_xdigit_value.invokeExact(c);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unicode_canonical_ordering = Interop.downcallHandle(
        "g_unicode_canonical_ordering",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Computes the canonical ordering of a string in-place.
     * This rearranges decomposed characters in the string
     * according to their combining classes.  See the Unicode
     * manual for more information.
     */
    public static void unicodeCanonicalOrdering(PointerInteger string, long len) {
        try {
            g_unicode_canonical_ordering.invokeExact(string.handle(), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unicode_script_from_iso15924 = Interop.downcallHandle(
        "g_unicode_script_from_iso15924",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Looks up the Unicode script for {@code iso15924}.  ISO 15924 assigns four-letter
     * codes to scripts.  For example, the code for Arabic is 'Arab'.
     * This function accepts four letter codes encoded as a {@code guint32} in a
     * big-endian fashion.  That is, the code expected for Arabic is
     * 0x41726162 (0x41 is ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
     * <p>
     * See
     * <a href="http://unicode.org/iso15924/codelists.html">Codes for the representation of names of scripts</a>
     * for details.
     */
    public static UnicodeScript unicodeScriptFromIso15924(int iso15924) {
        try {
            var RESULT = (int) g_unicode_script_from_iso15924.invokeExact(iso15924);
            return new UnicodeScript(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unicode_script_to_iso15924 = Interop.downcallHandle(
        "g_unicode_script_to_iso15924",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Looks up the ISO 15924 code for {@code script}.  ISO 15924 assigns four-letter
     * codes to scripts.  For example, the code for Arabic is 'Arab'.  The
     * four letter codes are encoded as a {@code guint32} by this function in a
     * big-endian fashion.  That is, the code returned for Arabic is
     * 0x41726162 (0x41 is ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
     * <p>
     * See
     * <a href="http://unicode.org/iso15924/codelists.html">Codes for the representation of names of scripts</a>
     * for details.
     */
    public static int unicodeScriptToIso15924(UnicodeScript script) {
        try {
            var RESULT = (int) g_unicode_script_to_iso15924.invokeExact(script.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_error_quark = Interop.downcallHandle(
        "g_unix_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark unixErrorQuark() {
        try {
            var RESULT = (int) g_unix_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_fd_add = Interop.downcallHandle(
        "g_unix_fd_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a function to be called when the IO condition, as specified by
     * {@code condition} becomes true for {@code fd}.
     * <p>
     * {@code function} will be called when the specified IO condition becomes
     * {@code true}.  The function is expected to clear whatever event caused the
     * IO condition to become true and return {@code true} in order to be notified
     * when it happens again.  If {@code function} returns {@code false} then the watch
     * will be cancelled.
     * <p>
     * The return value of this function can be passed to g_source_remove()
     * to cancel the watch at any time that it exists.
     * <p>
     * The source will never close the fd -- you must do it yourself.
     */
    public static int unixFdAdd(int fd, IOCondition condition, UnixFDSourceFunc function) {
        try {
            var RESULT = (int) g_unix_fd_add.invokeExact(fd, condition.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbUnixFDSourceFunc",
                            MethodType.methodType(int.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_fd_add_full = Interop.downcallHandle(
        "g_unix_fd_add_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a function to be called when the IO condition, as specified by
     * {@code condition} becomes true for {@code fd}.
     * <p>
     * This is the same as g_unix_fd_add(), except that it allows you to
     * specify a non-default priority and a provide a {@link DestroyNotify} for
     * {@code user_data}.
     */
    public static int unixFdAddFull(int priority, int fd, IOCondition condition, UnixFDSourceFunc function) {
        try {
            var RESULT = (int) g_unix_fd_add_full.invokeExact(priority, fd, condition.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbUnixFDSourceFunc",
                            MethodType.methodType(int.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_fd_source_new = Interop.downcallHandle(
        "g_unix_fd_source_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a {@link Source} to watch for a particular IO condition on a file
     * descriptor.
     * <p>
     * The source will never close the fd -- you must do it yourself.
     */
    public static Source unixFdSourceNew(int fd, IOCondition condition) {
        try {
            var RESULT = (MemoryAddress) g_unix_fd_source_new.invokeExact(fd, condition.getValue());
            return new Source(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_get_passwd_entry = Interop.downcallHandle(
        "g_unix_get_passwd_entry",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the {@code passwd} file entry for the given {@code user_name} using {@code getpwnam_r()}.
     * This can fail if the given {@code user_name} doesn’t exist.
     * <p>
     * The returned {@code struct passwd} has been allocated using g_malloc() and should
     * be freed using g_free(). The strings referenced by the returned struct are
     * included in the same allocation, so are valid until the {@code struct passwd} is
     * freed.
     * <p>
     * This function is safe to call from multiple threads concurrently.
     * <p>
     * You will need to include {@code pwd.h} to get the definition of {@code struct passwd}.
     */
    public static java.lang.foreign.MemoryAddress unixGetPasswdEntry(java.lang.String userName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_unix_get_passwd_entry.invokeExact(Interop.allocateNativeString(userName).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_open_pipe = Interop.downcallHandle(
        "g_unix_open_pipe",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Similar to the UNIX pipe() call, but on modern systems like Linux
     * uses the pipe2() system call, which atomically creates a pipe with
     * the configured flags. The only supported flag currently is
     * {@code FD_CLOEXEC}. If for example you want to configure {@code O_NONBLOCK}, that
     * must still be done separately with fcntl().
     * <p>
     * This function does not take {@code O_CLOEXEC}, it takes {@code FD_CLOEXEC} as if
     * for fcntl(); these are different on Linux/glibc.
     */
    public static boolean unixOpenPipe(PointerInteger fds, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_unix_open_pipe.invokeExact(fds.handle(), flags, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_set_fd_nonblocking = Interop.downcallHandle(
        "g_unix_set_fd_nonblocking",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Control the non-blocking state of the given file descriptor,
     * according to {@code nonblock}. On most systems this uses {@code O_NONBLOCK}, but
     * on some older ones may use {@code O_NDELAY}.
     */
    public static boolean unixSetFdNonblocking(int fd, boolean nonblock) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_unix_set_fd_nonblocking.invokeExact(fd, nonblock ? 1 : 0, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_signal_add = Interop.downcallHandle(
        "g_unix_signal_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function for g_unix_signal_source_new(), which
     * attaches to the default {@link MainContext}.  You can remove the watch
     * using g_source_remove().
     */
    public static int unixSignalAdd(int signum, SourceFunc handler) {
        try {
            var RESULT = (int) g_unix_signal_add.invokeExact(signum, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)));
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_signal_add_full = Interop.downcallHandle(
        "g_unix_signal_add_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function for g_unix_signal_source_new(), which
     * attaches to the default {@link MainContext}.  You can remove the watch
     * using g_source_remove().
     */
    public static int unixSignalAddFull(int priority, int signum, SourceFunc handler) {
        try {
            var RESULT = (int) g_unix_signal_add_full.invokeExact(priority, signum, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_signal_source_new = Interop.downcallHandle(
        "g_unix_signal_source_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a {@link Source} that will be dispatched upon delivery of the UNIX
     * signal {@code signum}.  In GLib versions before 2.36, only {@code SIGHUP}, {@code SIGINT},
     * {@code SIGTERM} can be monitored.  In GLib 2.36, {@code SIGUSR1} and {@code SIGUSR2}
     * were added. In GLib 2.54, {@code SIGWINCH} was added.
     * <p>
     * Note that unlike the UNIX default, all sources which have created a
     * watch will be dispatched, regardless of which underlying thread
     * invoked g_unix_signal_source_new().
     * <p>
     * For example, an effective use of this function is to handle {@code SIGTERM}
     * cleanly; flushing any outstanding files, and then calling
     * g_main_loop_quit ().  It is not safe to do any of this a regular
     * UNIX signal handler; your handler may be invoked while malloc() or
     * another library function is running, causing reentrancy if you
     * attempt to use it from the handler.  None of the GLib/GObject API
     * is safe against this kind of reentrancy.
     * <p>
     * The interaction of this source when combined with native UNIX
     * functions like sigprocmask() is not defined.
     * <p>
     * The source will not initially be associated with any {@link MainContext}
     * and must be added to one with g_source_attach() before it will be
     * executed.
     */
    public static Source unixSignalSourceNew(int signum) {
        try {
            var RESULT = (MemoryAddress) g_unix_signal_source_new.invokeExact(signum);
            return new Source(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unlink = Interop.downcallHandle(
        "g_unlink",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A wrapper for the POSIX unlink() function. The unlink() function
     * deletes a name from the filesystem. If this was the last link to the
     * file and no processes have it opened, the diskspace occupied by the
     * file is freed.
     * <p>
     * See your C library manual for more details about unlink(). Note
     * that on Windows, it is in general not possible to delete files that
     * are open to some process, or mapped into memory.
     */
    public static int unlink(java.lang.String filename) {
        try {
            var RESULT = (int) g_unlink.invokeExact(Interop.allocateNativeString(filename).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unsetenv = Interop.downcallHandle(
        "g_unsetenv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes an environment variable from the environment.
     * <p>
     * Note that on some systems, when variables are overwritten, the
     * memory used for the previous variables and its value isn't reclaimed.
     * <p>
     * You should be mindful of the fact that environment variable handling
     * in UNIX is not thread-safe, and your program may crash if one thread
     * calls g_unsetenv() while another thread is calling getenv(). (And note
     * that many functions, such as gettext(), call getenv() internally.) This
     * function is only safe to use at the very start of your program, before
     * creating any other threads (or creating objects that create worker
     * threads of their own).
     * <p>
     * If you need to set up the environment for a child process, you can
     * use g_get_environ() to get an environment array, modify that with
     * g_environ_setenv() and g_environ_unsetenv(), and then pass that
     * array directly to execvpe(), g_spawn_async(), or the like.
     */
    public static void unsetenv(java.lang.String variable) {
        try {
            g_unsetenv.invokeExact(Interop.allocateNativeString(variable).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_build = Interop.downcallHandle(
        "g_uri_build",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link Uri} from the given components according to {@code flags}.
     * <p>
     * See also g_uri_build_with_user(), which allows specifying the
     * components of the "userinfo" separately.
     */
    public static Uri uriBuild(UriFlags flags, java.lang.String scheme, java.lang.String userinfo, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        try {
            var RESULT = (MemoryAddress) g_uri_build.invokeExact(flags.getValue(), Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(userinfo).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
            return new Uri(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_build_with_user = Interop.downcallHandle(
        "g_uri_build_with_user",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link Uri} from the given components according to {@code flags}
     * ({@link UriFlags#HAS_PASSWORD} is added unconditionally). The {@code flags} must be
     * coherent with the passed values, in particular use {@code %}-encoded values with
     * {@link UriFlags#ENCODED}.
     * <p>
     * In contrast to g_uri_build(), this allows specifying the components
     * of the ‘userinfo’ field separately. Note that {@code user} must be non-{@code null}
     * if either {@code password} or {@code auth_params} is non-{@code null}.
     */
    public static Uri uriBuildWithUser(UriFlags flags, java.lang.String scheme, java.lang.String user, java.lang.String password, java.lang.String authParams, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        try {
            var RESULT = (MemoryAddress) g_uri_build_with_user.invokeExact(flags.getValue(), Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(user).handle(), Interop.allocateNativeString(password).handle(), Interop.allocateNativeString(authParams).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
            return new Uri(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_error_quark = Interop.downcallHandle(
        "g_uri_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark uriErrorQuark() {
        try {
            var RESULT = (int) g_uri_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_escape_bytes = Interop.downcallHandle(
        "g_uri_escape_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Escapes arbitrary data for use in a URI.
     * <p>
     * Normally all characters that are not ‘unreserved’ (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in {@code reserved_chars_allowed}
     * they are not escaped. This is useful for the ‘reserved’ characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     * <p>
     * Though technically incorrect, this will also allow escaping nul
     * bytes as {@code %}{@code 00}.
     */
    public static java.lang.String uriEscapeBytes(byte[] unescaped, long length, java.lang.String reservedCharsAllowed) {
        try {
            var RESULT = (MemoryAddress) g_uri_escape_bytes.invokeExact(Interop.allocateNativeArray(unescaped).handle(), length, Interop.allocateNativeString(reservedCharsAllowed).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_escape_string = Interop.downcallHandle(
        "g_uri_escape_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Escapes a string for use in a URI.
     * <p>
     * Normally all characters that are not "unreserved" (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in {@code reserved_chars_allowed}
     * they are not escaped. This is useful for the "reserved" characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     */
    public static java.lang.String uriEscapeString(java.lang.String unescaped, java.lang.String reservedCharsAllowed, boolean allowUtf8) {
        try {
            var RESULT = (MemoryAddress) g_uri_escape_string.invokeExact(Interop.allocateNativeString(unescaped).handle(), Interop.allocateNativeString(reservedCharsAllowed).handle(), allowUtf8 ? 1 : 0);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_is_valid = Interop.downcallHandle(
        "g_uri_is_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses {@code uri_string} according to {@code flags}, to determine whether it is a valid
     * [absolute URI][relative-absolute-uris], i.e. it does not need to be resolved
     * relative to another URI using g_uri_parse_relative().
     * <p>
     * If it’s not a valid URI, an error is returned explaining how it’s invalid.
     * <p>
     * See g_uri_split(), and the definition of {@link UriFlags}, for more
     * information on the effect of {@code flags}.
     */
    public static boolean uriIsValid(java.lang.String uriString, UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_uri_is_valid.invokeExact(Interop.allocateNativeString(uriString).handle(), flags.getValue(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_join = Interop.downcallHandle(
        "g_uri_join",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Joins the given components together according to {@code flags} to create
     * an absolute URI string. {@code path} may not be {@code null} (though it may be the empty
     * string).
     * <p>
     * When {@code host} is present, {@code path} must either be empty or begin with a slash ({@code /})
     * character. When {@code host} is not present, {@code path} cannot begin with two slash
     *    characters ({@code //}). See
     * <a href="https://tools.ietf.org/html/rfc3986#section-3">RFC 3986, section 3</a>.
     * <p>
     * See also g_uri_join_with_user(), which allows specifying the
     * components of the ‘userinfo’ separately.
     * <p>
     * {@link UriFlags#HAS_PASSWORD} and {@link UriFlags#HAS_AUTH_PARAMS} are ignored if set
     * in {@code flags}.
     */
    public static java.lang.String uriJoin(UriFlags flags, java.lang.String scheme, java.lang.String userinfo, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        try {
            var RESULT = (MemoryAddress) g_uri_join.invokeExact(flags.getValue(), Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(userinfo).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_join_with_user = Interop.downcallHandle(
        "g_uri_join_with_user",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Joins the given components together according to {@code flags} to create
     * an absolute URI string. {@code path} may not be {@code null} (though it may be the empty
     * string).
     * <p>
     * In contrast to g_uri_join(), this allows specifying the components
     * of the ‘userinfo’ separately. It otherwise behaves the same.
     * <p>
     * {@link UriFlags#HAS_PASSWORD} and {@link UriFlags#HAS_AUTH_PARAMS} are ignored if set
     * in {@code flags}.
     */
    public static java.lang.String uriJoinWithUser(UriFlags flags, java.lang.String scheme, java.lang.String user, java.lang.String password, java.lang.String authParams, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        try {
            var RESULT = (MemoryAddress) g_uri_join_with_user.invokeExact(flags.getValue(), Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(user).handle(), Interop.allocateNativeString(password).handle(), Interop.allocateNativeString(authParams).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_list_extract_uris = Interop.downcallHandle(
        "g_uri_list_extract_uris",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Splits an URI list conforming to the text/uri-list
     * mime type defined in RFC 2483 into individual URIs,
     * discarding any comments. The URIs are not validated.
     */
    public static PointerString uriListExtractUris(java.lang.String uriList) {
        try {
            var RESULT = (MemoryAddress) g_uri_list_extract_uris.invokeExact(Interop.allocateNativeString(uriList).handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_parse = Interop.downcallHandle(
        "g_uri_parse",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses {@code uri_string} according to {@code flags}. If the result is not a
     * valid [absolute URI][relative-absolute-uris], it will be discarded, and an
     * error returned.
     */
    public static Uri uriParse(java.lang.String uriString, UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_uri_parse.invokeExact(Interop.allocateNativeString(uriString).handle(), flags.getValue(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Uri(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_parse_params = Interop.downcallHandle(
        "g_uri_parse_params",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Many URI schemes include one or more attribute/value pairs as part of the URI
     * value. This method can be used to parse them into a hash table. When an
     * attribute has multiple occurrences, the last value is the final returned
     * value. If you need to handle repeated attributes differently, use
     * {@link UriParamsIter}.
     * <p>
     * The {@code params} string is assumed to still be {@code %}-encoded, but the returned
     * values will be fully decoded. (Thus it is possible that the returned values
     * may contain {@code =} or {@code separators}, if the value was encoded in the input.)
     * Invalid {@code %}-encoding is treated as with the {@link UriFlags#PARSE_RELAXED}
     * rules for g_uri_parse(). (However, if {@code params} is the path or query string
     * from a {@link Uri} that was parsed without {@link UriFlags#PARSE_RELAXED} and
     * {@link UriFlags#ENCODED}, then you already know that it does not contain any
     * invalid encoding.)
     * <p>
     * {@link UriParamsFlags#WWW_FORM} is handled as documented for g_uri_params_iter_init().
     * <p>
     * If {@link UriParamsFlags#CASE_INSENSITIVE} is passed to {@code flags}, attributes will be
     * compared case-insensitively, so a params string {@code attr=123&Attr=456} will only
     * return a single attribute–value pair, {@code Attr=456}. Case will be preserved in
     * the returned attributes.
     * <p>
     * If {@code params} cannot be parsed (for example, it contains two {@code separators}
     * characters in a row), then {@code error} is set and {@code null} is returned.
     */
    public static org.gtk.glib.HashTable uriParseParams(java.lang.String params, long length, java.lang.String separators, UriParamsFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_uri_parse_params.invokeExact(Interop.allocateNativeString(params).handle(), length, Interop.allocateNativeString(separators).handle(), flags.getValue(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.HashTable(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_parse_scheme = Interop.downcallHandle(
        "g_uri_parse_scheme",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the scheme portion of a URI string.
     * <a href="https://tools.ietf.org/html/rfc3986#section-3">RFC 3986</a> decodes the scheme
     * as:
     * <pre>{@code 
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * }</pre>
     * Common schemes include {@code file}, {@code https}, {@code svn+ssh}, etc.
     */
    public static java.lang.String uriParseScheme(java.lang.String uri) {
        try {
            var RESULT = (MemoryAddress) g_uri_parse_scheme.invokeExact(Interop.allocateNativeString(uri).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_peek_scheme = Interop.downcallHandle(
        "g_uri_peek_scheme",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the scheme portion of a URI string.
     * <a href="https://tools.ietf.org/html/rfc3986#section-3">RFC 3986</a> decodes the scheme
     * as:
     * <pre>{@code 
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * }</pre>
     * Common schemes include {@code file}, {@code https}, {@code svn+ssh}, etc.
     * <p>
     * Unlike g_uri_parse_scheme(), the returned scheme is normalized to
     * all-lowercase and does not need to be freed.
     */
    public static java.lang.String uriPeekScheme(java.lang.String uri) {
        try {
            var RESULT = (MemoryAddress) g_uri_peek_scheme.invokeExact(Interop.allocateNativeString(uri).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_resolve_relative = Interop.downcallHandle(
        "g_uri_resolve_relative",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses {@code uri_ref} according to {@code flags} and, if it is a
     * [relative URI][relative-absolute-uris], resolves it relative to
     * {@code base_uri_string}. If the result is not a valid absolute URI, it will be
     * discarded, and an error returned.
     * <p>
     * (If {@code base_uri_string} is {@code null}, this just returns {@code uri_ref}, or
     * {@code null} if {@code uri_ref} is invalid or not absolute.)
     */
    public static java.lang.String uriResolveRelative(java.lang.String baseUriString, java.lang.String uriRef, UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_uri_resolve_relative.invokeExact(Interop.allocateNativeString(baseUriString).handle(), Interop.allocateNativeString(uriRef).handle(), flags.getValue(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_split = Interop.downcallHandle(
        "g_uri_split",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses {@code uri_ref} (which can be an
     * [absolute or relative URI][relative-absolute-uris]) according to {@code flags}, and
     * returns the pieces. Any component that doesn't appear in {@code uri_ref} will be
     * returned as {@code null} (but note that all URIs always have a path component,
     * though it may be the empty string).
     * <p>
     * If {@code flags} contains {@link UriFlags#ENCODED}, then {@code %}-encoded characters in
     * {@code uri_ref} will remain encoded in the output strings. (If not,
     * then all such characters will be decoded.) Note that decoding will
     * only work if the URI components are ASCII or UTF-8, so you will
     * need to use {@link UriFlags#ENCODED} if they are not.
     * <p>
     * Note that the {@link UriFlags#HAS_PASSWORD} and
     * {@link UriFlags#HAS_AUTH_PARAMS} {@code flags} are ignored by g_uri_split(),
     * since it always returns only the full userinfo; use
     * g_uri_split_with_user() if you want it split up.
     */
    public static boolean uriSplit(java.lang.String uriRef, UriFlags flags, PointerString scheme, PointerString userinfo, PointerString host, PointerInteger port, PointerString path, PointerString query, PointerString fragment) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_uri_split.invokeExact(Interop.allocateNativeString(uriRef).handle(), flags.getValue(), scheme.handle(), userinfo.handle(), host.handle(), port.handle(), path.handle(), query.handle(), fragment.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_split_network = Interop.downcallHandle(
        "g_uri_split_network",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses {@code uri_string} (which must be an [absolute URI][relative-absolute-uris])
     * according to {@code flags}, and returns the pieces relevant to connecting to a host.
     * See the documentation for g_uri_split() for more details; this is
     * mostly a wrapper around that function with simpler arguments.
     * However, it will return an error if {@code uri_string} is a relative URI,
     * or does not contain a hostname component.
     */
    public static boolean uriSplitNetwork(java.lang.String uriString, UriFlags flags, PointerString scheme, PointerString host, PointerInteger port) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_uri_split_network.invokeExact(Interop.allocateNativeString(uriString).handle(), flags.getValue(), scheme.handle(), host.handle(), port.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_split_with_user = Interop.downcallHandle(
        "g_uri_split_with_user",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses {@code uri_ref} (which can be an
     * [absolute or relative URI][relative-absolute-uris]) according to {@code flags}, and
     * returns the pieces. Any component that doesn't appear in {@code uri_ref} will be
     * returned as {@code null} (but note that all URIs always have a path component,
     * though it may be the empty string).
     * <p>
     * See g_uri_split(), and the definition of {@link UriFlags}, for more
     * information on the effect of {@code flags}. Note that {@code password} will only
     * be parsed out if {@code flags} contains {@link UriFlags#HAS_PASSWORD}, and
     * {@code auth_params} will only be parsed out if {@code flags} contains
     * {@link UriFlags#HAS_AUTH_PARAMS}.
     */
    public static boolean uriSplitWithUser(java.lang.String uriRef, UriFlags flags, PointerString scheme, PointerString user, PointerString password, PointerString authParams, PointerString host, PointerInteger port, PointerString path, PointerString query, PointerString fragment) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_uri_split_with_user.invokeExact(Interop.allocateNativeString(uriRef).handle(), flags.getValue(), scheme.handle(), user.handle(), password.handle(), authParams.handle(), host.handle(), port.handle(), path.handle(), query.handle(), fragment.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_unescape_bytes = Interop.downcallHandle(
        "g_uri_unescape_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Unescapes a segment of an escaped string as binary data.
     * <p>
     * Note that in contrast to g_uri_unescape_string(), this does allow
     * nul bytes to appear in the output.
     * <p>
     * If any of the characters in {@code illegal_characters} appears as an escaped
     * character in {@code escaped_string}, then that is an error and {@code null} will be
     * returned. This is useful if you want to avoid for instance having a slash
     * being expanded in an escaped path element, which might confuse pathname
     * handling.
     */
    public static Bytes uriUnescapeBytes(java.lang.String escapedString, long length, java.lang.String illegalCharacters) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_uri_unescape_bytes.invokeExact(Interop.allocateNativeString(escapedString).handle(), length, Interop.allocateNativeString(illegalCharacters).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_unescape_segment = Interop.downcallHandle(
        "g_uri_unescape_segment",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unescapes a segment of an escaped string.
     * <p>
     * If any of the characters in {@code illegal_characters} or the NUL
     * character appears as an escaped character in {@code escaped_string}, then
     * that is an error and {@code null} will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     * <p>
     * Note: {@code NUL} byte is not accepted in the output, in contrast to
     * g_uri_unescape_bytes().
     */
    public static java.lang.String uriUnescapeSegment(java.lang.String escapedString, java.lang.String escapedStringEnd, java.lang.String illegalCharacters) {
        try {
            var RESULT = (MemoryAddress) g_uri_unescape_segment.invokeExact(Interop.allocateNativeString(escapedString).handle(), Interop.allocateNativeString(escapedStringEnd).handle(), Interop.allocateNativeString(illegalCharacters).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uri_unescape_string = Interop.downcallHandle(
        "g_uri_unescape_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unescapes a whole escaped string.
     * <p>
     * If any of the characters in {@code illegal_characters} or the NUL
     * character appears as an escaped character in {@code escaped_string}, then
     * that is an error and {@code null} will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     */
    public static java.lang.String uriUnescapeString(java.lang.String escapedString, java.lang.String illegalCharacters) {
        try {
            var RESULT = (MemoryAddress) g_uri_unescape_string.invokeExact(Interop.allocateNativeString(escapedString).handle(), Interop.allocateNativeString(illegalCharacters).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_usleep = Interop.downcallHandle(
        "g_usleep",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG)
    );
    
    /**
     * Pauses the current thread for the given number of microseconds.
     * <p>
     * There are 1 million microseconds per second (represented by the
     * {@code G_USEC_PER_SEC} macro). g_usleep() may have limited precision,
     * depending on hardware and operating system; don't rely on the exact
     * length of the sleep.
     */
    public static void usleep(long microseconds) {
        try {
            g_usleep.invokeExact(microseconds);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf16_to_ucs4 = Interop.downcallHandle(
        "g_utf16_to_ucs4",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convert a string from UTF-16 to UCS-4. The result will be
     * nul-terminated.
     */
    public static PointerInteger utf16ToUcs4(PointerShort str, long len, PointerLong itemsRead, PointerLong itemsWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_utf16_to_ucs4.invokeExact(str.handle(), len, itemsRead.handle(), itemsWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerInteger(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf16_to_utf8 = Interop.downcallHandle(
        "g_utf16_to_utf8",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convert a string from UTF-16 to UTF-8. The result will be
     * terminated with a 0 byte.
     * <p>
     * Note that the input is expected to be already in native endianness,
     * an initial byte-order-mark character is not handled specially.
     * g_convert() can be used to convert a byte buffer of UTF-16 data of
     * ambiguous endianness.
     * <p>
     * Further note that this function does not validate the result
     * string; it may e.g. include embedded NUL characters. The only
     * validation done by this function is to ensure that the input can
     * be correctly interpreted as UTF-16, i.e. it doesn't contain
     * unpaired surrogates or partial character sequences.
     */
    public static java.lang.String utf16ToUtf8(PointerShort str, long len, PointerLong itemsRead, PointerLong itemsWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_utf16_to_utf8.invokeExact(str.handle(), len, itemsRead.handle(), itemsWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_casefold = Interop.downcallHandle(
        "g_utf8_casefold",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Converts a string into a form that is independent of case. The
     * result will not correspond to any particular case, but can be
     * compared for equality or ordered with the results of calling
     * g_utf8_casefold() on other strings.
     * <p>
     * Note that calling g_utf8_casefold() followed by g_utf8_collate() is
     * only an approximation to the correct linguistic case insensitive
     * ordering, though it is a fairly good one. Getting this exactly
     * right would require a more sophisticated collation function that
     * takes case sensitivity into account. GLib does not currently
     * provide such a function.
     */
    public static java.lang.String utf8Casefold(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_utf8_casefold.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_collate = Interop.downcallHandle(
        "g_utf8_collate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two strings for ordering using the linguistically
     * correct rules for the [current locale][setlocale].
     * When sorting a large number of strings, it will be significantly
     * faster to obtain collation keys with g_utf8_collate_key() and
     * compare the keys with strcmp() when sorting instead of sorting
     * the original strings.
     * <p>
     * If the two strings are not comparable due to being in different collation
     * sequences, the result is undefined. This can happen if the strings are in
     * different language scripts, for example.
     */
    public static int utf8Collate(java.lang.String str1, java.lang.String str2) {
        try {
            var RESULT = (int) g_utf8_collate.invokeExact(Interop.allocateNativeString(str1).handle(), Interop.allocateNativeString(str2).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_collate_key = Interop.downcallHandle(
        "g_utf8_collate_key",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Converts a string into a collation key that can be compared
     * with other collation keys produced by the same function using
     * strcmp().
     * <p>
     * The results of comparing the collation keys of two strings
     * with strcmp() will always be the same as comparing the two
     * original keys with g_utf8_collate().
     * <p>
     * Note that this function depends on the [current locale][setlocale].
     */
    public static java.lang.String utf8CollateKey(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_utf8_collate_key.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_collate_key_for_filename = Interop.downcallHandle(
        "g_utf8_collate_key_for_filename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Converts a string into a collation key that can be compared
     * with other collation keys produced by the same function using strcmp().
     * <p>
     * In order to sort filenames correctly, this function treats the dot '.'
     * as a special case. Most dictionary orderings seem to consider it
     * insignificant, thus producing the ordering "event.c" "eventgenerator.c"
     * "event.h" instead of "event.c" "event.h" "eventgenerator.c". Also, we
     * would like to treat numbers intelligently so that "file1" "file10" "file5"
     * is sorted as "file1" "file5" "file10".
     * <p>
     * Note that this function depends on the [current locale][setlocale].
     */
    public static java.lang.String utf8CollateKeyForFilename(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_utf8_collate_key_for_filename.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_find_next_char = Interop.downcallHandle(
        "g_utf8_find_next_char",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the start of the next UTF-8 character in the string after @p.
     * <p>
     * @p does not have to be at the beginning of a UTF-8 character. No check
     * is made to see if the character found is actually valid other than
     * it starts with an appropriate byte.
     * <p>
     * If {@code end} is {@code null}, the return value will never be {@code null}: if the end of the
     * string is reached, a pointer to the terminating nul byte is returned. If
     * {@code end} is non-{@code null}, the return value will be {@code null} if the end of the string
     * is reached.
     */
    public static java.lang.String utf8FindNextChar(java.lang.String p, java.lang.String end) {
        try {
            var RESULT = (MemoryAddress) g_utf8_find_next_char.invokeExact(Interop.allocateNativeString(p).handle(), Interop.allocateNativeString(end).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_find_prev_char = Interop.downcallHandle(
        "g_utf8_find_prev_char",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Given a position @p with a UTF-8 encoded string {@code str}, find the start
     * of the previous UTF-8 character starting before @p. Returns {@code null} if no
     * UTF-8 characters are present in {@code str} before @p.
     * <p>
     * @p does not have to be at the beginning of a UTF-8 character. No check
     * is made to see if the character found is actually valid other than
     * it starts with an appropriate byte.
     */
    public static java.lang.String utf8FindPrevChar(java.lang.String str, java.lang.String p) {
        try {
            var RESULT = (MemoryAddress) g_utf8_find_prev_char.invokeExact(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(p).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_get_char = Interop.downcallHandle(
        "g_utf8_get_char",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a sequence of bytes encoded as UTF-8 to a Unicode character.
     * <p>
     * If @p does not point to a valid UTF-8 encoded character, results
     * are undefined. If you are not sure that the bytes are complete
     * valid Unicode characters, you should use g_utf8_get_char_validated()
     * instead.
     */
    public static int utf8GetChar(java.lang.String p) {
        try {
            var RESULT = (int) g_utf8_get_char.invokeExact(Interop.allocateNativeString(p).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_get_char_validated = Interop.downcallHandle(
        "g_utf8_get_char_validated",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Convert a sequence of bytes encoded as UTF-8 to a Unicode character.
     * This function checks for incomplete characters, for invalid characters
     * such as characters that are out of the range of Unicode, and for
     * overlong encodings of valid characters.
     * <p>
     * Note that g_utf8_get_char_validated() returns (gunichar)-2 if
     * {@code max_len} is positive and any of the bytes in the first UTF-8 character
     * sequence are nul.
     */
    public static int utf8GetCharValidated(java.lang.String p, long maxLen) {
        try {
            var RESULT = (int) g_utf8_get_char_validated.invokeExact(Interop.allocateNativeString(p).handle(), maxLen);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_make_valid = Interop.downcallHandle(
        "g_utf8_make_valid",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * If the provided string is valid UTF-8, return a copy of it. If not,
     * return a copy in which bytes that could not be interpreted as valid Unicode
     * are replaced with the Unicode replacement character (U+FFFD).
     * <p>
     * For example, this is an appropriate function to use if you have received
     * a string that was incorrectly declared to be UTF-8, and you need a valid
     * UTF-8 version of it that can be logged or displayed to the user, with the
     * assumption that it is close enough to ASCII or UTF-8 to be mostly
     * readable as-is.
     */
    public static java.lang.String utf8MakeValid(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_utf8_make_valid.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_normalize = Interop.downcallHandle(
        "g_utf8_normalize",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a string into canonical form, standardizing
     * such issues as whether a character with an accent
     * is represented as a base character and combining
     * accent or as a single precomposed character. The
     * string has to be valid UTF-8, otherwise {@code null} is
     * returned. You should generally call g_utf8_normalize()
     * before comparing two Unicode strings.
     * <p>
     * The normalization mode {@link NormalizeMode#DEFAULT} only
     * standardizes differences that do not affect the
     * text content, such as the above-mentioned accent
     * representation. {@link NormalizeMode#ALL} also standardizes
     * the "compatibility" characters in Unicode, such
     * as SUPERSCRIPT THREE to the standard forms
     * (in this case DIGIT THREE). Formatting information
     * may be lost but for most text operations such
     * characters should be considered the same.
     * <p>
     * {@link NormalizeMode#DEFAULT_COMPOSE} and {@link NormalizeMode#ALL_COMPOSE}
     * are like {@link NormalizeMode#DEFAULT} and {@link NormalizeMode#ALL},
     * but returned a result with composed forms rather
     * than a maximally decomposed form. This is often
     * useful if you intend to convert the string to
     * a legacy encoding or pass it to a system with
     * less capable Unicode handling.
     */
    public static java.lang.String utf8Normalize(java.lang.String str, long len, NormalizeMode mode) {
        try {
            var RESULT = (MemoryAddress) g_utf8_normalize.invokeExact(Interop.allocateNativeString(str).handle(), len, mode.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_offset_to_pointer = Interop.downcallHandle(
        "g_utf8_offset_to_pointer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Converts from an integer character offset to a pointer to a position
     * within the string.
     * <p>
     * Since 2.10, this function allows to pass a negative {@code offset} to
     * step backwards. It is usually worth stepping backwards from the end
     * instead of forwards if {@code offset} is in the last fourth of the string,
     * since moving forward is about 3 times faster than moving backward.
     * <p>
     * Note that this function doesn't abort when reaching the end of {@code str}.
     * Therefore you should be sure that {@code offset} is within string boundaries
     * before calling that function. Call g_utf8_strlen() when unsure.
     * This limitation exists as this function is called frequently during
     * text rendering and therefore has to be as fast as possible.
     */
    public static java.lang.String utf8OffsetToPointer(java.lang.String str, long offset) {
        try {
            var RESULT = (MemoryAddress) g_utf8_offset_to_pointer.invokeExact(Interop.allocateNativeString(str).handle(), offset);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_pointer_to_offset = Interop.downcallHandle(
        "g_utf8_pointer_to_offset",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts from a pointer to position within a string to an integer
     * character offset.
     * <p>
     * Since 2.10, this function allows {@code pos} to be before {@code str}, and returns
     * a negative offset in this case.
     */
    public static long utf8PointerToOffset(java.lang.String str, java.lang.String pos) {
        try {
            var RESULT = (long) g_utf8_pointer_to_offset.invokeExact(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(pos).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_prev_char = Interop.downcallHandle(
        "g_utf8_prev_char",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the previous UTF-8 character in the string before @p.
     * <p>
     * @p does not have to be at the beginning of a UTF-8 character. No check
     * is made to see if the character found is actually valid other than
     * it starts with an appropriate byte. If @p might be the first
     * character of the string, you must use g_utf8_find_prev_char() instead.
     */
    public static java.lang.String utf8PrevChar(java.lang.String p) {
        try {
            var RESULT = (MemoryAddress) g_utf8_prev_char.invokeExact(Interop.allocateNativeString(p).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_strchr = Interop.downcallHandle(
        "g_utf8_strchr",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Finds the leftmost occurrence of the given Unicode character
     * in a UTF-8 encoded string, while limiting the search to {@code len} bytes.
     * If {@code len} is -1, allow unbounded search.
     */
    public static java.lang.String utf8Strchr(java.lang.String p, long len, int c) {
        try {
            var RESULT = (MemoryAddress) g_utf8_strchr.invokeExact(Interop.allocateNativeString(p).handle(), len, c);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_strdown = Interop.downcallHandle(
        "g_utf8_strdown",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Converts all Unicode characters in the string that have a case
     * to lowercase. The exact manner that this is done depends
     * on the current locale, and may result in the number of
     * characters in the string changing.
     */
    public static java.lang.String utf8Strdown(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_utf8_strdown.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_strlen = Interop.downcallHandle(
        "g_utf8_strlen",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Computes the length of the string in characters, not including
     * the terminating nul character. If the {@code max}'th byte falls in the
     * middle of a character, the last (partial) character is not counted.
     */
    public static long utf8Strlen(java.lang.String p, long max) {
        try {
            var RESULT = (long) g_utf8_strlen.invokeExact(Interop.allocateNativeString(p).handle(), max);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_strncpy = Interop.downcallHandle(
        "g_utf8_strncpy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Like the standard C strncpy() function, but copies a given number
     * of characters instead of a given number of bytes. The {@code src} string
     * must be valid UTF-8 encoded text. (Use g_utf8_validate() on all
     * text before trying to use UTF-8 utility functions with it.)
     * <p>
     * Note you must ensure {@code dest} is at least 4 * @n to fit the
     * largest possible UTF-8 characters
     */
    public static java.lang.String utf8Strncpy(java.lang.String dest, java.lang.String src, long n) {
        try {
            var RESULT = (MemoryAddress) g_utf8_strncpy.invokeExact(Interop.allocateNativeString(dest).handle(), Interop.allocateNativeString(src).handle(), n);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_strrchr = Interop.downcallHandle(
        "g_utf8_strrchr",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Find the rightmost occurrence of the given Unicode character
     * in a UTF-8 encoded string, while limiting the search to {@code len} bytes.
     * If {@code len} is -1, allow unbounded search.
     */
    public static java.lang.String utf8Strrchr(java.lang.String p, long len, int c) {
        try {
            var RESULT = (MemoryAddress) g_utf8_strrchr.invokeExact(Interop.allocateNativeString(p).handle(), len, c);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_strreverse = Interop.downcallHandle(
        "g_utf8_strreverse",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Reverses a UTF-8 string. {@code str} must be valid UTF-8 encoded text.
     * (Use g_utf8_validate() on all text before trying to use UTF-8
     * utility functions with it.)
     * <p>
     * This function is intended for programmatic uses of reversed strings.
     * It pays no attention to decomposed characters, combining marks, byte
     * order marks, directional indicators (LRM, LRO, etc) and similar
     * characters which might need special handling when reversing a string
     * for display purposes.
     * <p>
     * Note that unlike g_strreverse(), this function returns
     * newly-allocated memory, which should be freed with g_free() when
     * no longer needed.
     */
    public static java.lang.String utf8Strreverse(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_utf8_strreverse.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_strup = Interop.downcallHandle(
        "g_utf8_strup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Converts all Unicode characters in the string that have a case
     * to uppercase. The exact manner that this is done depends
     * on the current locale, and may result in the number of
     * characters in the string increasing. (For instance, the
     * German ess-zet will be changed to SS.)
     */
    public static java.lang.String utf8Strup(java.lang.String str, long len) {
        try {
            var RESULT = (MemoryAddress) g_utf8_strup.invokeExact(Interop.allocateNativeString(str).handle(), len);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_substring = Interop.downcallHandle(
        "g_utf8_substring",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Copies a substring out of a UTF-8 encoded string.
     * The substring will contain {@code end_pos} - {@code start_pos} characters.
     * <p>
     * Since GLib 2.72, {@code -1} can be passed to {@code end_pos} to indicate the
     * end of the string.
     */
    public static java.lang.String utf8Substring(java.lang.String str, long startPos, long endPos) {
        try {
            var RESULT = (MemoryAddress) g_utf8_substring.invokeExact(Interop.allocateNativeString(str).handle(), startPos, endPos);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_to_ucs4 = Interop.downcallHandle(
        "g_utf8_to_ucs4",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convert a string from UTF-8 to a 32-bit fixed width
     * representation as UCS-4. A trailing 0 character will be added to the
     * string after the converted text.
     */
    public static PointerInteger utf8ToUcs4(java.lang.String str, long len, PointerLong itemsRead, PointerLong itemsWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_utf8_to_ucs4.invokeExact(Interop.allocateNativeString(str).handle(), len, itemsRead.handle(), itemsWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerInteger(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_to_ucs4_fast = Interop.downcallHandle(
        "g_utf8_to_ucs4_fast",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Convert a string from UTF-8 to a 32-bit fixed width
     * representation as UCS-4, assuming valid UTF-8 input.
     * This function is roughly twice as fast as g_utf8_to_ucs4()
     * but does no error checking on the input. A trailing 0 character
     * will be added to the string after the converted text.
     */
    public static PointerInteger utf8ToUcs4Fast(java.lang.String str, long len, PointerLong itemsWritten) {
        try {
            var RESULT = (MemoryAddress) g_utf8_to_ucs4_fast.invokeExact(Interop.allocateNativeString(str).handle(), len, itemsWritten.handle());
            return new PointerInteger(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_to_utf16 = Interop.downcallHandle(
        "g_utf8_to_utf16",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convert a string from UTF-8 to UTF-16. A 0 character will be
     * added to the result after the converted text.
     */
    public static PointerShort utf8ToUtf16(java.lang.String str, long len, PointerLong itemsRead, PointerLong itemsWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_utf8_to_utf16.invokeExact(Interop.allocateNativeString(str).handle(), len, itemsRead.handle(), itemsWritten.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerShort(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_validate = Interop.downcallHandle(
        "g_utf8_validate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Validates UTF-8 encoded text. {@code str} is the text to validate;
     * if {@code str} is nul-terminated, then {@code max_len} can be -1, otherwise
     * {@code max_len} should be the number of bytes to validate.
     * If {@code end} is non-{@code null}, then the end of the valid range
     * will be stored there (i.e. the start of the first invalid
     * character if some bytes were invalid, or the end of the text
     * being validated otherwise).
     * <p>
     * Note that g_utf8_validate() returns {@code false} if {@code max_len} is
     * positive and any of the {@code max_len} bytes are nul.
     * <p>
     * Returns {@code true} if all of {@code str} was valid. Many GLib and GTK+
     * routines require valid UTF-8 as input; so data read from a file
     * or the network should be checked with g_utf8_validate() before
     * doing anything else with it.
     */
    public static boolean utf8Validate(byte[] str, long maxLen, PointerString end) {
        try {
            var RESULT = (int) g_utf8_validate.invokeExact(Interop.allocateNativeArray(str).handle(), maxLen, end.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_utf8_validate_len = Interop.downcallHandle(
        "g_utf8_validate_len",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Validates UTF-8 encoded text.
     * <p>
     * As with g_utf8_validate(), but {@code max_len} must be set, and hence this function
     * will always return {@code false} if any of the bytes of {@code str} are nul.
     */
    public static boolean utf8ValidateLen(byte[] str, long maxLen, PointerString end) {
        try {
            var RESULT = (int) g_utf8_validate_len.invokeExact(Interop.allocateNativeArray(str).handle(), maxLen, end.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uuid_string_is_valid = Interop.downcallHandle(
        "g_uuid_string_is_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses the string {@code str} and verify if it is a UUID.
     * <p>
     * The function accepts the following syntax:
     * <p>
     * <ul>
     * <li>simple forms (e.g. {@code f81d4fae-7dec-11d0-a765-00a0c91e6bf6})
     * </ul>
     * <p>
     * Note that hyphens are required within the UUID string itself,
     * as per the aforementioned RFC.
     */
    public static boolean uuidStringIsValid(java.lang.String str) {
        try {
            var RESULT = (int) g_uuid_string_is_valid.invokeExact(Interop.allocateNativeString(str).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_uuid_string_random = Interop.downcallHandle(
        "g_uuid_string_random",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Generates a random UUID (RFC 4122 version 4) as a string. It has the same
     * randomness guarantees as {@link Rand}, so must not be used for cryptographic
     * purposes such as key generation, nonces, salts or one-time pads.
     */
    public static java.lang.String uuidStringRandom() {
        try {
            var RESULT = (MemoryAddress) g_uuid_string_random.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_get_gtype = Interop.downcallHandle(
        "g_variant_get_gtype",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG)
    );
    
    public static org.gtk.gobject.Type variantGetGtype() {
        try {
            var RESULT = (long) g_variant_get_gtype.invokeExact();
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_is_object_path = Interop.downcallHandle(
        "g_variant_is_object_path",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines if a given string is a valid D-Bus object path.  You
     * should ensure that a string is a valid D-Bus object path before
     * passing it to g_variant_new_object_path().
     * <p>
     * A valid object path starts with {@code /} followed by zero or more
     * sequences of characters separated by {@code /} characters.  Each sequence
     * must contain only the characters {@code [A-Z][a-z][0-9]_}.  No sequence
     * (including the one following the final {@code /} character) may be empty.
     */
    public static boolean variantIsObjectPath(java.lang.String string) {
        try {
            var RESULT = (int) g_variant_is_object_path.invokeExact(Interop.allocateNativeString(string).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_is_signature = Interop.downcallHandle(
        "g_variant_is_signature",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines if a given string is a valid D-Bus type signature.  You
     * should ensure that a string is a valid D-Bus type signature before
     * passing it to g_variant_new_signature().
     * <p>
     * D-Bus type signatures consist of zero or more definite {@link VariantType}
     * strings in sequence.
     */
    public static boolean variantIsSignature(java.lang.String string) {
        try {
            var RESULT = (int) g_variant_is_signature.invokeExact(Interop.allocateNativeString(string).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_parse = Interop.downcallHandle(
        "g_variant_parse",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses a {@link Variant} from a text representation.
     * <p>
     * A single {@link Variant} is parsed from the content of {@code text}.
     * <p>
     * The format is described [here][gvariant-text].
     * <p>
     * The memory at {@code limit} will never be accessed and the parser behaves as
     * if the character at {@code limit} is the nul terminator.  This has the
     * effect of bounding {@code text}.
     * <p>
     * If {@code endptr} is non-{@code null} then {@code text} is permitted to contain data
     * following the value that this function parses and {@code endptr} will be
     * updated to point to the first character past the end of the text
     * parsed by this function.  If {@code endptr} is {@code null} and there is extra data
     * then an error is returned.
     * <p>
     * If {@code type} is non-{@code null} then the value will be parsed to have that
     * type.  This may result in additional parse errors (in the case that
     * the parsed value doesn't fit the type) but may also result in fewer
     * errors (in the case that the type would have been ambiguous, such as
     * with empty arrays).
     * <p>
     * In the event that the parsing is successful, the resulting {@link Variant}
     * is returned. It is never floating, and must be freed with
     * g_variant_unref().
     * <p>
     * In case of any error, {@code null} will be returned.  If {@code error} is non-{@code null}
     * then it will be set to reflect the error that occurred.
     * <p>
     * Officially, the language understood by the parser is "any string
     * produced by g_variant_print()".
     * <p>
     * There may be implementation specific restrictions on deeply nested values,
     * which would result in a {@link VariantParseError#RECURSION} error. {@link Variant} is
     * guaranteed to handle nesting up to at least 64 levels.
     */
    public static Variant variantParse(VariantType type, java.lang.String text, java.lang.String limit, java.lang.String[] endptr) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_variant_parse.invokeExact(type.handle(), Interop.allocateNativeString(text).handle(), Interop.allocateNativeString(limit).handle(), Interop.allocateNativeArray(endptr).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_parse_error_print_context = Interop.downcallHandle(
        "g_variant_parse_error_print_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Pretty-prints a message showing the context of a {@link Variant} parse
     * error within the string for which parsing was attempted.
     * <p>
     * The resulting string is suitable for output to the console or other
     * monospace media where newlines are treated in the usual way.
     * <p>
     * The message will typically look something like one of the following:
     * <p>
     * <pre>{@code 
     * unterminated string constant:
     *   (1, 2, 3, 'abc
     *             ^^^^
     * }</pre>
     * <p>
     * or
     * <p>
     * <pre>{@code 
     * unable to find a common type:
     *   [1, 2, 3, 'str']
     *    ^        ^^^^^
     * }</pre>
     * <p>
     * The format of the message may change in a future version.
     * <p>
     * {@code error} must have come from a failed attempt to g_variant_parse() and
     * {@code source_str} must be exactly the same string that caused the error.
     * If {@code source_str} was not nul-terminated when you passed it to
     * g_variant_parse() then you must add nul termination before using this
     * function.
     */
    public static java.lang.String variantParseErrorPrintContext(Error error, java.lang.String sourceStr) {
        try {
            var RESULT = (MemoryAddress) g_variant_parse_error_print_context.invokeExact(error.handle(), Interop.allocateNativeString(sourceStr).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_parse_error_quark = Interop.downcallHandle(
        "g_variant_parse_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark variantParseErrorQuark() {
        try {
            var RESULT = (int) g_variant_parse_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_type_checked_ = Interop.downcallHandle(
        "g_variant_type_checked_",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static VariantType variantTypeChecked(java.lang.String arg0) {
        try {
            var RESULT = (MemoryAddress) g_variant_type_checked_.invokeExact(Interop.allocateNativeString(arg0).handle());
            return new VariantType(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_type_string_get_depth_ = Interop.downcallHandle(
        "g_variant_type_string_get_depth_",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    public static long variantTypeStringGetDepth(java.lang.String typeString) {
        try {
            var RESULT = (long) g_variant_type_string_get_depth_.invokeExact(Interop.allocateNativeString(typeString).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_type_string_is_valid = Interop.downcallHandle(
        "g_variant_type_string_is_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code type_string} is a valid GVariant type string.  This call is
     * equivalent to calling g_variant_type_string_scan() and confirming
     * that the following character is a nul terminator.
     */
    public static boolean variantTypeStringIsValid(java.lang.String typeString) {
        try {
            var RESULT = (int) g_variant_type_string_is_valid.invokeExact(Interop.allocateNativeString(typeString).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_type_string_scan = Interop.downcallHandle(
        "g_variant_type_string_scan",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Scan for a single complete and valid GVariant type string in {@code string}.
     * The memory pointed to by {@code limit} (or bytes beyond it) is never
     * accessed.
     * <p>
     * If a valid type string is found, {@code endptr} is updated to point to the
     * first character past the end of the string that was found and {@code true}
     * is returned.
     * <p>
     * If there is no valid type string starting at {@code string}, or if the type
     * string does not end before {@code limit} then {@code false} is returned.
     * <p>
     * For the simple case of checking if a string is a valid type string,
     * see g_variant_type_string_is_valid().
     */
    public static boolean variantTypeStringScan(java.lang.String string, java.lang.String limit, PointerString endptr) {
        try {
            var RESULT = (int) g_variant_type_string_scan.invokeExact(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(limit).handle(), endptr.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_vasprintf = Interop.downcallHandle(
        "g_vasprintf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * An implementation of the GNU vasprintf() function which supports
     * positional parameters, as specified in the Single Unix Specification.
     * This function is similar to g_vsprintf(), except that it allocates a
     * string to hold the output, instead of putting the output in a buffer
     * you allocate in advance.
     * <p>
     * The returned value in {@code string} is guaranteed to be non-NULL, unless
     * {@code format} contains {@code %lc} or {@code %ls} conversions, which can fail if no
     * multibyte representation is available for the given character.
     * <p>
     * {@code glib/gprintf.h} must be explicitly included in order to use this function.
     */
    public static int vasprintf(java.lang.String[] string, java.lang.String format, VaList args) {
        try {
            var RESULT = (int) g_vasprintf.invokeExact(Interop.allocateNativeArray(string).handle(), Interop.allocateNativeString(format).handle(), args);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_vfprintf = Interop.downcallHandle(
        "g_vfprintf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * An implementation of the standard fprintf() function which supports
     * positional parameters, as specified in the Single Unix Specification.
     * <p>
     * {@code glib/gprintf.h} must be explicitly included in order to use this function.
     */
    public static int vfprintf(java.lang.foreign.MemoryAddress file, java.lang.String format, VaList args) {
        try {
            var RESULT = (int) g_vfprintf.invokeExact(file, Interop.allocateNativeString(format).handle(), args);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_vprintf = Interop.downcallHandle(
        "g_vprintf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * An implementation of the standard vprintf() function which supports
     * positional parameters, as specified in the Single Unix Specification.
     * <p>
     * {@code glib/gprintf.h} must be explicitly included in order to use this function.
     */
    public static int vprintf(java.lang.String format, VaList args) {
        try {
            var RESULT = (int) g_vprintf.invokeExact(Interop.allocateNativeString(format).handle(), args);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_vsnprintf = Interop.downcallHandle(
        "g_vsnprintf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A safer form of the standard vsprintf() function. The output is guaranteed
     * to not exceed @n characters (including the terminating nul character), so
     * it is easy to ensure that a buffer overflow cannot occur.
     * <p>
     * See also g_strdup_vprintf().
     * <p>
     * In versions of GLib prior to 1.2.3, this function may return -1 if the
     * output was truncated, and the truncated string may not be nul-terminated.
     * In versions prior to 1.3.12, this function returns the length of the output
     * string.
     * <p>
     * The return value of g_vsnprintf() conforms to the vsnprintf() function
     * as standardized in ISO C99. Note that this is different from traditional
     * vsnprintf(), which returns the length of the output string.
     * <p>
     * The format string may contain positional parameters, as specified in
     * the Single Unix Specification.
     */
    public static int vsnprintf(java.lang.String string, long n, java.lang.String format, VaList args) {
        try {
            var RESULT = (int) g_vsnprintf.invokeExact(Interop.allocateNativeString(string).handle(), n, Interop.allocateNativeString(format).handle(), args);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_vsprintf = Interop.downcallHandle(
        "g_vsprintf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * An implementation of the standard vsprintf() function which supports
     * positional parameters, as specified in the Single Unix Specification.
     * <p>
     * {@code glib/gprintf.h} must be explicitly included in order to use this function.
     */
    public static int vsprintf(java.lang.String string, java.lang.String format, VaList args) {
        try {
            var RESULT = (int) g_vsprintf.invokeExact(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(format).handle(), args);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_warn_message = Interop.downcallHandle(
        "g_warn_message",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Internal function used to print messages from the public g_warn_if_reached()
     * and g_warn_if_fail() macros.
     */
    public static void warnMessage(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String warnexpr) {
        try {
            g_warn_message.invokeExact(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(warnexpr).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean __cbHookCheckFunc(MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (HookCheckFunc) Interop.signalRegistry.get(hash);
        return handler.onHookCheckFunc();
    }
    
    public static boolean __cbIOFunc(MemoryAddress source, int condition, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IOFunc) Interop.signalRegistry.get(hash);
        return handler.onIOFunc(new IOChannel(Refcounted.get(source, false)), new IOCondition(condition));
    }
    
    public static java.lang.foreign.MemoryAddress __cbThreadFunc(MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (ThreadFunc) Interop.signalRegistry.get(hash);
        return handler.onThreadFunc();
    }
    
    public static boolean __cbHookCheckMarshaller(MemoryAddress hook, MemoryAddress marshalData) {
        int hash = marshalData.get(ValueLayout.JAVA_INT, 0);
        var handler = (HookCheckMarshaller) Interop.signalRegistry.get(hash);
        return handler.onHookCheckMarshaller(new Hook(Refcounted.get(hook, false)));
    }
    
    public static boolean __cbNodeTraverseFunc(MemoryAddress node, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (NodeTraverseFunc) Interop.signalRegistry.get(hash);
        return handler.onNodeTraverseFunc(new Node(Refcounted.get(node, false)));
    }
    
    public static void __cbHookFunc(MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (HookFunc) Interop.signalRegistry.get(hash);
        handler.onHookFunc();
    }
    
    public static void __cbTestFixtureFunc(MemoryAddress fixture, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TestFixtureFunc) Interop.signalRegistry.get(hash);
        handler.onTestFixtureFunc(fixture);
    }
    
    public static java.lang.foreign.MemoryAddress __cbCopyFunc(MemoryAddress src, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (CopyFunc) Interop.signalRegistry.get(hash);
        return handler.onCopyFunc(src);
    }
    
    public static boolean __cbHookFindFunc(MemoryAddress hook, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (HookFindFunc) Interop.signalRegistry.get(hash);
        return handler.onHookFindFunc(new Hook(Refcounted.get(hook, false)));
    }
    
    public static boolean __cbRegexEvalCallback(MemoryAddress matchInfo, MemoryAddress result, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (RegexEvalCallback) Interop.signalRegistry.get(hash);
        return handler.onRegexEvalCallback(new MatchInfo(Refcounted.get(matchInfo, false)), new String(Refcounted.get(result, false)));
    }
    
    public static boolean __cbUnixFDSourceFunc(int fd, int condition, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (UnixFDSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onUnixFDSourceFunc(fd, new IOCondition(condition));
    }
    
    public static void __cbSpawnChildSetupFunc(MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (SpawnChildSetupFunc) Interop.signalRegistry.get(hash);
        handler.onSpawnChildSetupFunc();
    }
    
    public static void __cbDestroyNotify(MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (DestroyNotify) Interop.signalRegistry.get(hash);
        handler.onDestroyNotify();
    }
    
    public static void __cbChildWatchFunc(int pid, int waitStatus, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ChildWatchFunc) Interop.signalRegistry.get(hash);
        handler.onChildWatchFunc(new Pid(pid), waitStatus);
    }
    
    public static void __cbTestDataFunc(MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TestDataFunc) Interop.signalRegistry.get(hash);
        handler.onTestDataFunc();
    }
    
    public static int __cbCompareDataFunc(MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (CompareDataFunc) Interop.signalRegistry.get(hash);
        return handler.onCompareDataFunc(a, b);
    }
    
    public static boolean __cbTraverseFunc(MemoryAddress key, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TraverseFunc) Interop.signalRegistry.get(hash);
        return handler.onTraverseFunc(key, value);
    }
    
    public static void __cbFunc(MemoryAddress data, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (Func) Interop.signalRegistry.get(hash);
        handler.onFunc();
    }
    
    public static LogWriterOutput __cbLogWriterFunc(int logLevel, MemoryAddress fields, long nFields, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (LogWriterFunc) Interop.signalRegistry.get(hash);
        return handler.onLogWriterFunc(new LogLevelFlags(logLevel), new PointerProxy<LogField>(fields, LogField.class), nFields);
    }
    
    public static int __cbSequenceIterCompareFunc(MemoryAddress a, MemoryAddress b, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SequenceIterCompareFunc) Interop.signalRegistry.get(hash);
        return handler.onSequenceIterCompareFunc(new SequenceIter(Refcounted.get(a, false)), new SequenceIter(Refcounted.get(b, false)));
    }
    
    public static void __cbHookMarshaller(MemoryAddress hook, MemoryAddress marshalData) {
        int hash = marshalData.get(ValueLayout.JAVA_INT, 0);
        var handler = (HookMarshaller) Interop.signalRegistry.get(hash);
        handler.onHookMarshaller(new Hook(Refcounted.get(hook, false)));
    }
    
    public static boolean __cbOptionParseFunc(MemoryAddress context, MemoryAddress group, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (OptionParseFunc) Interop.signalRegistry.get(hash);
        return handler.onOptionParseFunc(new OptionContext(Refcounted.get(context, false)), new OptionGroup(Refcounted.get(group, false)));
    }
    
    public static boolean __cbOptionArgFunc(MemoryAddress optionName, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (OptionArgFunc) Interop.signalRegistry.get(hash);
        return handler.onOptionArgFunc(optionName.getUtf8String(0), value.getUtf8String(0));
    }
    
    public static boolean __cbTestLogFatalFunc(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TestLogFatalFunc) Interop.signalRegistry.get(hash);
        return handler.onTestLogFatalFunc(logDomain.getUtf8String(0), new LogLevelFlags(logLevel), message.getUtf8String(0));
    }
    
    public static boolean __cbSourceFunc(MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (SourceFunc) Interop.signalRegistry.get(hash);
        return handler.onSourceFunc();
    }
    
    public static void __cbOptionErrorFunc(MemoryAddress context, MemoryAddress group, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (OptionErrorFunc) Interop.signalRegistry.get(hash);
        handler.onOptionErrorFunc(new OptionContext(Refcounted.get(context, false)), new OptionGroup(Refcounted.get(group, false)));
    }
    
    public static boolean __cbTraverseNodeFunc(MemoryAddress node, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TraverseNodeFunc) Interop.signalRegistry.get(hash);
        return handler.onTraverseNodeFunc(new TreeNode(Refcounted.get(node, false)));
    }
    
    public static void __cbHFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (HFunc) Interop.signalRegistry.get(hash);
        handler.onHFunc(key, value);
    }
    
    public static java.lang.foreign.MemoryAddress __cbDuplicateFunc(MemoryAddress data, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DuplicateFunc) Interop.signalRegistry.get(hash);
        return handler.onDuplicateFunc();
    }
    
    public static void __cbFreeFunc(MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (FreeFunc) Interop.signalRegistry.get(hash);
        handler.onFreeFunc();
    }
    
    public static boolean __cbHRFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (HRFunc) Interop.signalRegistry.get(hash);
        return handler.onHRFunc(key, value);
    }
    
    public static void __cbLogFunc(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (LogFunc) Interop.signalRegistry.get(hash);
        handler.onLogFunc(logDomain.getUtf8String(0), new LogLevelFlags(logLevel), message.getUtf8String(0));
    }
    
    public static void __cbNodeForeachFunc(MemoryAddress node, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (NodeForeachFunc) Interop.signalRegistry.get(hash);
        handler.onNodeForeachFunc(new Node(Refcounted.get(node, false)));
    }
    
    public static void __cbDataForeachFunc(int keyId, MemoryAddress data, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (DataForeachFunc) Interop.signalRegistry.get(hash);
        handler.onDataForeachFunc(new Quark(keyId));
    }
    
    public static java.lang.String __cbTranslateFunc(MemoryAddress str, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TranslateFunc) Interop.signalRegistry.get(hash);
        return handler.onTranslateFunc(str.getUtf8String(0));
    }
    
}

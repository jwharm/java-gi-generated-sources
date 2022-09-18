package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    /**
     * A wrapper for the POSIX access() function. This function is used to
     * test a pathname for one or several of read, write or execute
     * permissions, or just existence.
     * 
     * On Windows, the file protection mechanism is not at all POSIX-like,
     * and the underlying function in the C library only checks the
     * FAT-style READONLY attribute, and does not look at the ACL of a
     * file at all. This function is this in practise almost useless on
     * Windows. Software that needs to handle file permissions on Windows
     * more exactly should use the Win32 API.
     * 
     * See your C library manual for more details about access().
     */
    public static int access(java.lang.String filename, int mode) {
        var RESULT = gtk_h.g_access(Interop.allocateNativeString(filename).handle(), mode);
        return RESULT;
    }
    
    /**
     * This function is similar to g_malloc(), allocating (@n_blocks * @n_block_bytes)
     * bytes, but care is taken to align the allocated memory to with the given
     * alignment value. Additionally, it will detect possible overflow during
     * multiplication.
     * 
     * Aligned memory allocations returned by this function can only be
     * freed using g_aligned_free().
     */
    public static jdk.incubator.foreign.MemoryAddress alignedAlloc(long nBlocks, long nBlockBytes, long alignment) {
        var RESULT = gtk_h.g_aligned_alloc(nBlocks, nBlockBytes, alignment);
        return RESULT;
    }
    
    /**
     * This function is similar to g_aligned_alloc(), but it will
     * also clear the allocated memory before returning it.
     */
    public static jdk.incubator.foreign.MemoryAddress alignedAlloc0(long nBlocks, long nBlockBytes, long alignment) {
        var RESULT = gtk_h.g_aligned_alloc0(nBlocks, nBlockBytes, alignment);
        return RESULT;
    }
    
    /**
     * Frees the memory allocated by g_aligned_alloc().
     */
    public static void alignedFree(jdk.incubator.foreign.MemoryAddress mem) {
        gtk_h.g_aligned_free(mem);
    }
    
    /**
     * Determines the numeric value of a character as a decimal digit.
     * Differs from g_unichar_digit_value() because it takes a char, so
     * there&<code>#39</code> s no worry about sign extension if characters are signed.
     */
    public static int asciiDigitValue(byte c) {
        var RESULT = gtk_h.g_ascii_digit_value(c);
        return RESULT;
    }
    
    /**
     * Converts a <code>#gdouble</code> to a string, using the &<code>#39</code> .&<code>#39</code>  as
     * decimal point.
     * 
     * This function generates enough precision that converting
     * the string back using g_ascii_strtod() gives the same machine-number
     * (on machines with IEEE compatible 64bit doubles). It is
     * guaranteed that the size of the resulting string will never
     * be larger than <code>G_ASCII_DTOSTR_BUF_SIZE</code> bytes, including the terminating
     * nul character, which is always added.
     */
    public static java.lang.String asciiDtostr(java.lang.String buffer, int bufLen, double d) {
        var RESULT = gtk_h.g_ascii_dtostr(Interop.allocateNativeString(buffer).handle(), bufLen, d);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a <code>#gdouble</code> to a string, using the &<code>#39</code> .&<code>#39</code>  as
     * decimal point. To format the number you pass in
     * a printf()-style format string. Allowed conversion
     * specifiers are &<code>#39</code> e&<code>#39</code> , &<code>#39</code> E&<code>#39</code> , &<code>#39</code> f&<code>#39</code> , &<code>#39</code> F&<code>#39</code> , &<code>#39</code> g&<code>#39</code>  and &<code>#39</code> G&<code>#39</code> .
     * <p>
     * The @format must just be a single format specifier
     * starting with <code><code></code> /code>, expecting a <code>#gdouble</code> argument.
     * 
     * The returned buffer is guaranteed to be nul-terminated.
     * 
     * If you just want to want to serialize the value into a
     * string, use g_ascii_dtostr().
     */
    public static java.lang.String asciiFormatd(java.lang.String buffer, int bufLen, java.lang.String format, double d) {
        var RESULT = gtk_h.g_ascii_formatd(Interop.allocateNativeString(buffer).handle(), bufLen, Interop.allocateNativeString(format).handle(), d);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Compare two strings, ignoring the case of ASCII characters.
     * 
     * Unlike the BSD strcasecmp() function, this only recognizes standard
     * ASCII letters and ignores the locale, treating all non-ASCII
     * bytes as if they are not letters.
     * 
     * This function should be used only on strings that are known to be
     * in encodings where the bytes corresponding to ASCII letters always
     * represent themselves. This includes UTF-8 and the ISO-8859-*
     * charsets, but not for instance double-byte encodings like the
     * Windows Codepage 932, where the trailing bytes of double-byte
     * characters include all ASCII letters. If you compare two CP932
     * strings using this function, you will get false matches.
     * 
     * Both @s1 and @s2 must be non-<code>null</code>
     */
    public static int asciiStrcasecmp(java.lang.String s1, java.lang.String s2) {
        var RESULT = gtk_h.g_ascii_strcasecmp(Interop.allocateNativeString(s1).handle(), Interop.allocateNativeString(s2).handle());
        return RESULT;
    }
    
    /**
     * Converts all upper case ASCII letters to lower case ASCII letters.
     */
    public static java.lang.String asciiStrdown(java.lang.String str, long len) {
        var RESULT = gtk_h.g_ascii_strdown(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Compare @s1 and @s2, ignoring the case of ASCII characters and any
     * characters after the first @n in each string. If either string is
     * less than @n bytes long, comparison will stop at the first nul byte
     * encountered.
     * 
     * Unlike the BSD strcasecmp() function, this only recognizes standard
     * ASCII letters and ignores the locale, treating all non-ASCII
     * characters as if they are not letters.
     * 
     * The same warning as in g_ascii_strcasecmp() applies: Use this
     * function only on strings known to be in encodings where bytes
     * corresponding to ASCII letters always represent themselves.
     */
    public static int asciiStrncasecmp(java.lang.String s1, java.lang.String s2, long n) {
        var RESULT = gtk_h.g_ascii_strncasecmp(Interop.allocateNativeString(s1).handle(), Interop.allocateNativeString(s2).handle(), n);
        return RESULT;
    }
    
    /**
     * Converts a string to a <code>#gdouble</code> value.
     * 
     * This function behaves like the standard strtod() function
     * does in the C locale. It does this without actually changing
     * the current locale, since that would not be thread-safe.
     * A limitation of the implementation is that this function
     * will still accept localized versions of infinities and NANs.
     * 
     * This function is typically used when reading configuration
     * files or other non-user input that should be locale independent.
     * To handle input from the user you should normally use the
     * locale-sensitive system strtod() function.
     * 
     * To convert from a <code>#gdouble</code> to a string in a locale-insensitive
     * way, use g_ascii_dtostr().
     * 
     * If the correct value would cause overflow, plus or minus <code>HUGE_VAL</code> is returned (according to the sign of the value), and <code>ERANGE</code> is
     * stored in <code>errno</code>  If the correct value would cause underflow,
     * zero is returned and <code>ERANGE</code> is stored in <code>errno</code> 
     * 
     * This function resets <code>errno</code> before calling strtod() so that
     * you can reliably detect overflow and underflow.
     */
    public static double asciiStrtod(java.lang.String nptr, java.lang.String[] endptr) {
        var RESULT = gtk_h.g_ascii_strtod(Interop.allocateNativeString(nptr).handle(), Interop.allocateNativeArray(endptr).handle());
        return RESULT;
    }
    
    /**
     * Converts a string to a <code>#gint64</code> value.
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
     * If the correct value would cause overflow, <code>G_MAXINT64</code> or <code>G_MININT64</code> is returned, and <code>ERANGE</code> is stored in <code>errno</code>.
     * If the base is outside the valid range, zero is returned, and<code>EINVAL</code> is stored in <code>errno</code>. If the
     * string conversion fails, zero is returned, and @endptr returns @nptr
     * (if @endptr is non-<code>null</code> .
     */
    public static long asciiStrtoll(java.lang.String nptr, java.lang.String[] endptr, int base) {
        var RESULT = gtk_h.g_ascii_strtoll(Interop.allocateNativeString(nptr).handle(), Interop.allocateNativeArray(endptr).handle(), base);
        return RESULT;
    }
    
    /**
     * Converts a string to a <code>#guint64</code> value.
     * This function behaves like the standard strtoull() function
     * does in the C locale. It does this without actually
     * changing the current locale, since that would not be
     * thread-safe.
     * <p>
     * Note that input with a leading minus sign (<code>-</code>) is accepted, and will return
     * the negation of the parsed number, unless that would overflow a <code>#guint64</code> 
     * Critically, this means you cannot assume that a short fixed length input will
     * never result in a low return value, as the input could have a leading <code>-</code>.
     * <p>
     * This function is typically used when reading configuration
     * files or other non-user input that should be locale independent.
     * To handle input from the user you should normally use the
     * locale-sensitive system strtoull() function.
     * <p>
     * If the correct value would cause overflow, <code>G_MAXUINT64</code> is returned, and <code>ERANGE</code> is stored in <code>errno</code>.
     * If the base is outside the valid range, zero is returned, and<code>EINVAL</code> is stored in <code>errno</code>.
     * If the string conversion fails, zero is returned, and @endptr returns
     * @nptr (if @endptr is non-<code>null</code> .
     */
    public static long asciiStrtoull(java.lang.String nptr, java.lang.String[] endptr, int base) {
        var RESULT = gtk_h.g_ascii_strtoull(Interop.allocateNativeString(nptr).handle(), Interop.allocateNativeArray(endptr).handle(), base);
        return RESULT;
    }
    
    /**
     * Converts all lower case ASCII letters to upper case ASCII letters.
     */
    public static java.lang.String asciiStrup(java.lang.String str, long len) {
        var RESULT = gtk_h.g_ascii_strup(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Convert a character to ASCII lower case.
     * 
     * Unlike the standard C library tolower() function, this only
     * recognizes standard ASCII letters and ignores the locale, returning
     * all non-ASCII characters unchanged, even if they are lower case
     * letters in a particular character set. Also unlike the standard
     * library function, this takes and returns a char, not an int, so
     * don&<code>#39</code> t call it on <code>EOF</code> but no need to worry about casting to <code>#guchar</code> before passing a possibly non-ASCII character in.
     */
    public static byte asciiTolower(byte c) {
        var RESULT = gtk_h.g_ascii_tolower(c);
        return RESULT;
    }
    
    /**
     * Convert a character to ASCII upper case.
     * 
     * Unlike the standard C library toupper() function, this only
     * recognizes standard ASCII letters and ignores the locale, returning
     * all non-ASCII characters unchanged, even if they are upper case
     * letters in a particular character set. Also unlike the standard
     * library function, this takes and returns a char, not an int, so
     * don&<code>#39</code> t call it on <code>EOF</code> but no need to worry about casting to <code>#guchar</code> before passing a possibly non-ASCII character in.
     */
    public static byte asciiToupper(byte c) {
        var RESULT = gtk_h.g_ascii_toupper(c);
        return RESULT;
    }
    
    /**
     * Determines the numeric value of a character as a hexadecimal
     * digit. Differs from g_unichar_xdigit_value() because it takes
     * a char, so there&<code>#39</code> s no worry about sign extension if characters
     * are signed.
     */
    public static int asciiXdigitValue(byte c) {
        var RESULT = gtk_h.g_ascii_xdigit_value(c);
        return RESULT;
    }
    
    public static void assertWarning(java.lang.String logDomain, java.lang.String file, int line, java.lang.String prettyFunction, java.lang.String expression) {
        gtk_h.g_assert_warning(Interop.allocateNativeString(logDomain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(prettyFunction).handle(), Interop.allocateNativeString(expression).handle());
    }
    
    public static void assertionMessage(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String message) {
        gtk_h.g_assertion_message(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(message).handle());
    }
    
    public static void assertionMessageCmpstr(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, java.lang.String arg1, java.lang.String cmp, java.lang.String arg2) {
        gtk_h.g_assertion_message_cmpstr(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle(), Interop.allocateNativeString(arg1).handle(), Interop.allocateNativeString(cmp).handle(), Interop.allocateNativeString(arg2).handle());
    }
    
    public static void assertionMessageCmpstrv(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, java.lang.String arg1, java.lang.String arg2, long firstWrongIdx) {
        gtk_h.g_assertion_message_cmpstrv(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle(), Interop.allocateNativeString(arg1).handle(), Interop.allocateNativeString(arg2).handle(), firstWrongIdx);
    }
    
    public static void assertionMessageError(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, Error error, Quark errorDomain, int errorCode) {
        gtk_h.g_assertion_message_error(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle(), error.handle(), errorDomain.getValue(), errorCode);
    }
    
    /**
     * Internal function used to print messages from the public g_assert() and
     * g_assert_not_reached() macros.
     */
    public static void assertionMessageExpr(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr) {
        gtk_h.g_assertion_message_expr(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(expr).handle());
    }
    
    /**
     * Atomically adds @val to the value of @atomic.
     * <p>
     * Think of this operation as an atomic version of<code>{ tmp = *atomic; *atomic += val; return tmp; }</code>.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While @atomic has a <code>volatile</code> qualifier, this is a historical artifact and
     * the pointer passed to it should not be <code>volatile</code>.
     */
    public static long atomicPointerAdd(jdk.incubator.foreign.MemoryAddress atomic, long val) {
        var RESULT = gtk_h.g_atomic_pointer_add(atomic, val);
        return RESULT;
    }
    
    /**
     * Performs an atomic bitwise &<code>#39</code> and&<code>#39</code>  of the value of @atomic and @val,
     * storing the result back in @atomic.
     * <p>
     * Think of this operation as an atomic version of<code>{ tmp = *atomic; *atomic &<code>#38</code> = val; return tmp; }</code>.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While @atomic has a <code>volatile</code> qualifier, this is a historical artifact and
     * the pointer passed to it should not be <code>volatile</code>.
     */
    public static long atomicPointerAnd(jdk.incubator.foreign.MemoryAddress atomic, long val) {
        var RESULT = gtk_h.g_atomic_pointer_and(atomic, val);
        return RESULT;
    }
    
    /**
     * Compares @atomic to @oldval and, if equal, sets it to @newval.
     * If @atomic was not equal to @oldval then no change occurs.
     * <p>
     * This compare and exchange is done atomically.
     * <p>
     * Think of this operation as an atomic version of<code>{ if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }</code>.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While @atomic has a <code>volatile</code> qualifier, this is a historical artifact and
     * the pointer passed to it should not be <code>volatile</code>.
     */
    public static boolean atomicPointerCompareAndExchange(jdk.incubator.foreign.MemoryAddress atomic, jdk.incubator.foreign.MemoryAddress oldval, jdk.incubator.foreign.MemoryAddress newval) {
        var RESULT = gtk_h.g_atomic_pointer_compare_and_exchange(atomic, oldval, newval);
        return (RESULT != 0);
    }
    
    /**
     * Gets the current value of @atomic.
     * <p>
     * This call acts as a full compiler and hardware
     * memory barrier (before the get).
     * <p>
     * While @atomic has a <code>volatile</code> qualifier, this is a historical artifact and
     * the pointer passed to it should not be <code>volatile</code>.
     */
    public static jdk.incubator.foreign.MemoryAddress atomicPointerGet(jdk.incubator.foreign.MemoryAddress atomic) {
        var RESULT = gtk_h.g_atomic_pointer_get(atomic);
        return RESULT;
    }
    
    /**
     * Performs an atomic bitwise &<code>#39</code> or&<code>#39</code>  of the value of @atomic and @val,
     * storing the result back in @atomic.
     * <p>
     * Think of this operation as an atomic version of<code>{ tmp = *atomic; *atomic |= val; return tmp; }</code>.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While @atomic has a <code>volatile</code> qualifier, this is a historical artifact and
     * the pointer passed to it should not be <code>volatile</code>.
     */
    public static long atomicPointerOr(jdk.incubator.foreign.MemoryAddress atomic, long val) {
        var RESULT = gtk_h.g_atomic_pointer_or(atomic, val);
        return RESULT;
    }
    
    /**
     * Sets the value of @atomic to @newval.
     * <p>
     * This call acts as a full compiler and hardware
     * memory barrier (after the set).
     * <p>
     * While @atomic has a <code>volatile</code> qualifier, this is a historical artifact and
     * the pointer passed to it should not be <code>volatile</code>.
     */
    public static void atomicPointerSet(jdk.incubator.foreign.MemoryAddress atomic, jdk.incubator.foreign.MemoryAddress newval) {
        gtk_h.g_atomic_pointer_set(atomic, newval);
    }
    
    /**
     * Performs an atomic bitwise &<code>#39</code> xor&<code>#39</code>  of the value of @atomic and @val,
     * storing the result back in @atomic.
     * <p>
     * Think of this operation as an atomic version of<code>{ tmp = *atomic; *atomic ^= val; return tmp; }</code>.
     * <p>
     * This call acts as a full compiler and hardware memory barrier.
     * <p>
     * While @atomic has a <code>volatile</code> qualifier, this is a historical artifact and
     * the pointer passed to it should not be <code>volatile</code>.
     */
    public static long atomicPointerXor(jdk.incubator.foreign.MemoryAddress atomic, long val) {
        var RESULT = gtk_h.g_atomic_pointer_xor(atomic, val);
        return RESULT;
    }
    
    /**
     * Atomically acquires a reference on the data pointed by @mem_block.
     */
    public static jdk.incubator.foreign.MemoryAddress atomicRcBoxAcquire(jdk.incubator.foreign.MemoryAddress memBlock) {
        var RESULT = gtk_h.g_atomic_rc_box_acquire(memBlock);
        return RESULT;
    }
    
    /**
     * Allocates @block_size bytes of memory, and adds atomic
     * reference counting semantics to it.
     * 
     * The data will be freed when its reference count drops to
     * zero.
     * 
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     */
    public static jdk.incubator.foreign.MemoryAddress atomicRcBoxAlloc(long blockSize) {
        var RESULT = gtk_h.g_atomic_rc_box_alloc(blockSize);
        return RESULT;
    }
    
    /**
     * Allocates @block_size bytes of memory, and adds atomic
     * reference counting semantics to it.
     * 
     * The contents of the returned data is set to zero.
     * 
     * The data will be freed when its reference count drops to
     * zero.
     * 
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     */
    public static jdk.incubator.foreign.MemoryAddress atomicRcBoxAlloc0(long blockSize) {
        var RESULT = gtk_h.g_atomic_rc_box_alloc0(blockSize);
        return RESULT;
    }
    
    /**
     * Allocates a new block of data with atomic reference counting
     * semantics, and copies @block_size bytes of @mem_block
     * into it.
     */
    public static jdk.incubator.foreign.MemoryAddress atomicRcBoxDup(long blockSize, jdk.incubator.foreign.MemoryAddress memBlock) {
        var RESULT = gtk_h.g_atomic_rc_box_dup(blockSize, memBlock);
        return RESULT;
    }
    
    /**
     * Retrieves the size of the reference counted data pointed by @mem_block.
     */
    public static long atomicRcBoxGetSize(jdk.incubator.foreign.MemoryAddress memBlock) {
        var RESULT = gtk_h.g_atomic_rc_box_get_size(memBlock);
        return RESULT;
    }
    
    /**
     * Atomically releases a reference on the data pointed by @mem_block.
     * 
     * If the reference was the last one, it will free the
     * resources allocated for @mem_block.
     */
    public static void atomicRcBoxRelease(jdk.incubator.foreign.MemoryAddress memBlock) {
        gtk_h.g_atomic_rc_box_release(memBlock);
    }
    
    /**
     * Encode a sequence of binary data into its Base-64 stringified
     * representation.
     */
    public static java.lang.String base64Encode(byte[] data, long len) {
        var RESULT = gtk_h.g_base64_encode(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Find the position of the first bit set in @mask, searching
     * from (but not including) @nth_bit upwards. Bits are numbered
     * from 0 (least significant) to sizeof(<code>#gulong</code>  * 8 - 1 (31 or 63,
     * usually). To start searching from the 0th bit, set @nth_bit to -1.
     */
    public static int bitNthLsf(long mask, int nthBit) {
        var RESULT = gtk_h.g_bit_nth_lsf(mask, nthBit);
        return RESULT;
    }
    
    /**
     * Find the position of the first bit set in @mask, searching
     * from (but not including) @nth_bit downwards. Bits are numbered
     * from 0 (least significant) to sizeof(<code>#gulong</code>  * 8 - 1 (31 or 63,
     * usually). To start searching from the last bit, set @nth_bit to
     * -1 or GLIB_SIZEOF_LONG * 8.
     */
    public static int bitNthMsf(long mask, int nthBit) {
        var RESULT = gtk_h.g_bit_nth_msf(mask, nthBit);
        return RESULT;
    }
    
    /**
     * Gets the number of bits used to hold @number,
     * e.g. if @number is 4, 3 bits are needed.
     */
    public static int bitStorage(long number) {
        var RESULT = gtk_h.g_bit_storage(number);
        return RESULT;
    }
    
    public static Quark bookmarkFileErrorQuark() {
        var RESULT = gtk_h.g_bookmark_file_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Behaves exactly like g_build_filename(), but takes the path elements
     * as a va_list. This function is mainly meant for language bindings.
     */
    public static java.lang.String buildFilenameValist(java.lang.String firstElement, VaList args) {
        var RESULT = gtk_h.g_build_filename_valist(Interop.allocateNativeString(firstElement).handle(), args);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Behaves exactly like g_build_filename(), but takes the path elements
     * as a string array, instead of varargs. This function is mainly
     * meant for language bindings.
     */
    public static java.lang.String buildFilenamev(java.lang.String[] args) {
        var RESULT = gtk_h.g_build_filenamev(Interop.allocateNativeArray(args).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Behaves exactly like g_build_path(), but takes the path elements
     * as a string array, instead of varargs. This function is mainly
     * meant for language bindings.
     */
    public static java.lang.String buildPathv(java.lang.String separator, java.lang.String[] args) {
        var RESULT = gtk_h.g_build_pathv(Interop.allocateNativeString(separator).handle(), Interop.allocateNativeArray(args).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Transfers the data from the {@link org.gtk.glib.ByteArray} into a new immutable {@link org.gtk.glib.Bytes} 
     * 
     * The {@link org.gtk.glib.ByteArray} is freed unless the reference count of @array is greater
     * than one, the {@link org.gtk.glib.ByteArray} wrapper is preserved but the size of @array
     * will be set to zero.
     * 
     * This is identical to using g_bytes_new_take() and g_byte_array_free()
     * together.
     */
    public static Bytes byteArrayFreeToBytes(byte[] array) {
        var RESULT = gtk_h.g_byte_array_free_to_bytes(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, array)).handle());
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Atomically decrements the reference count of @array by one. If the
     * reference count drops to 0, all memory allocated by the array is
     * released. This function is thread-safe and may be called from any
     * thread.
     */
    public static void byteArrayUnref(byte[] array) {
        gtk_h.g_byte_array_unref(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, array)).handle());
    }
    
    /**
     * Gets the canonical file name from @filename. All triple slashes are turned into
     * single slashes, and all <code>..</code> and <code>.</code>s resolved against @relative_to.
     * 
     * Symlinks are not followed, and the returned path is guaranteed to be absolute.
     * 
     * If @filename is an absolute path, @relative_to is ignored. Otherwise,
     * @relative_to will be prepended to @filename to make it absolute. @relative_to
     * must be an absolute path, or <code>null</code>  If @relative_to is <code>null</code>  it&<code>#39</code> ll fallback
     * to g_get_current_dir().
     * 
     * This function never fails, and will canonicalize file paths even if they don&<code>#39</code> t
     * exist.
     * 
     * No file system I/O is done.
     */
    public static java.lang.String canonicalizeFilename(java.lang.String filename, java.lang.String relativeTo) {
        var RESULT = gtk_h.g_canonicalize_filename(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(relativeTo).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * A wrapper for the POSIX chdir() function. The function changes the
     * current directory of the process to @path.
     * 
     * See your C library manual for more details about chdir().
     */
    public static int chdir(java.lang.String path) {
        var RESULT = gtk_h.g_chdir(Interop.allocateNativeString(path).handle());
        return RESULT;
    }
    
    /**
     * Checks that the GLib library in use is compatible with the
     * given version.
     * <p>
     * Generally you would pass in the constants <code>GLIB_MAJOR_VERSION</code> 
     * <code>GLIB_MINOR_VERSION</code>  <code>GLIB_MICRO_VERSION</code> as the three arguments
     * to this function; that produces a check that the library in use
     * is compatible with the version of GLib the application or module
     * was compiled against.
     * <p>
     * Compatibility is defined by two things: first the version
     * of the running library is newer than the version<code>@required_major.required_minor.@required_micro</code>. Second
     * the running library must be binary compatible with the
     * version <code>@required_major.@required_minor.@required_micro</code>
     * (same major version.)
     */
    public static java.lang.String checkVersion(int requiredMajor, int requiredMinor, int requiredMicro) {
        var RESULT = gtk_h.glib_check_version(requiredMajor, requiredMinor, requiredMicro);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the length in bytes of digests of type @checksum_type
     */
    public static long checksumTypeGetLength(ChecksumType checksumType) {
        var RESULT = gtk_h.g_checksum_type_get_length(checksumType.getValue());
        return RESULT;
    }
    
    /**
     * Sets a function to be called when the child indicated by @pid
     * exits, at a default priority, <code>G_PRIORITY_DEFAULT</code> 
     * 
     * If you obtain @pid from g_spawn_async() or g_spawn_async_with_pipes()
     * you will need to pass {@link org.gtk.glib.SpawnFlags<code>#DO_NOT_REAP_CHILD</code>  as flag to
     * the spawn function for the child watching to work.
     * 
     * Note that on platforms where {@link org.gtk.glib.Pid} must be explicitly closed
     * (see g_spawn_close_pid()) @pid must not be closed while the
     * source is still active. Typically, you will want to call
     * g_spawn_close_pid() in the callback function for the source.
     * 
     * GLib supports only a single callback per process id.
     * On POSIX platforms, the same restrictions mentioned for
     * g_child_watch_source_new() apply to this function.
     * 
     * This internally creates a main loop source using
     * g_child_watch_source_new() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you
     * need greater control.
     */
    public static int childWatchAdd(Pid pid, ChildWatchFunc function) {
        try {
            var RESULT = gtk_h.g_child_watch_add(pid.getValue(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbChildWatchFunc",
                            MethodType.methodType(void.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets a function to be called when the child indicated by @pid
     * exits, at the priority @priority.
     * 
     * If you obtain @pid from g_spawn_async() or g_spawn_async_with_pipes()
     * you will need to pass {@link org.gtk.glib.SpawnFlags<code>#DO_NOT_REAP_CHILD</code>  as flag to
     * the spawn function for the child watching to work.
     * 
     * In many programs, you will want to call g_spawn_check_wait_status()
     * in the callback to determine whether or not the child exited
     * successfully.
     * 
     * Also, note that on platforms where {@link org.gtk.glib.Pid} must be explicitly closed
     * (see g_spawn_close_pid()) @pid must not be closed while the source
     * is still active.  Typically, you should invoke g_spawn_close_pid()
     * in the callback function for the source.
     * 
     * GLib supports only a single callback per process id.
     * On POSIX platforms, the same restrictions mentioned for
     * g_child_watch_source_new() apply to this function.
     * 
     * This internally creates a main loop source using
     * g_child_watch_source_new() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you
     * need greater control.
     */
    public static int childWatchAddFull(int priority, Pid pid, ChildWatchFunc function) {
        try {
            var RESULT = gtk_h.g_child_watch_add_full(priority, pid.getValue(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbChildWatchFunc",
                            MethodType.methodType(void.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new child_watch source.
     * <p>
     * The source will not initially be associated with any {@link org.gtk.glib.MainContext} and must be added to one with g_source_attach() before it will be
     * executed.
     * <p>
     * Note that child watch sources can only be used in conjunction with<code>g_spawn...</code> when the {@link org.gtk.glib.SpawnFlags<code>#DO_NOT_REAP_CHILD</code>  flag is used.
     * <p>
     * Note that on platforms where {@link org.gtk.glib.Pid} must be explicitly closed
     * (see g_spawn_close_pid()) @pid must not be closed while the
     * source is still active. Typically, you will want to call
     * g_spawn_close_pid() in the callback function for the source.
     * <p>
     * On POSIX platforms, the following restrictions apply to this API
     * due to limitations in POSIX process interfaces:
     * <p>
     * * @pid must be a child of this process
     * * @pid must be positive
     * * the application must not call <code>waitpid</code> with a non-positive
     *   first argument, for instance in another thread
     * * the application must not wait for @pid to exit by any other
     *   mechanism, including <code>waitpid(pid, ...)</code> or a second child-watch
     *   source for the same @pid
     * * the application must not ignore <code>SIGCHLD</code>
     * <p>
     * If any of those conditions are not met, this and related APIs will
     * not work correctly. This can often be diagnosed via a GLib warning
     * stating that <code>ECHILD</code> was received by <code>waitpid</code>.
     * <p>
     * Calling <code>waitpid</code> for specific processes other than @pid remains a
     * valid thing to do.
     */
    public static Source childWatchSourceNew(Pid pid) {
        var RESULT = gtk_h.g_child_watch_source_new(pid.getValue());
        return new Source(References.get(RESULT, true));
    }
    
    /**
     * This wraps the close() call; in case of error, <code>errno</code> will be
     * preserved, but the error will also be stored as a {@link org.gtk.glib.Error} in @error.
     * 
     * Besides using {@link org.gtk.glib.Error}  there is another major reason to prefer this
     * function over the call provided by the system; on Unix, it will
     * attempt to correctly handle <code>EINTR</code>  which has platform-specific
     * semantics.
     */
    public static boolean close(int fd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_close(fd, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Computes the checksum for a binary @data. This is a
     * convenience wrapper for g_checksum_new(), g_checksum_get_string()
     * and g_checksum_free().
     * 
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeChecksumForBytes(ChecksumType checksumType, Bytes data) {
        var RESULT = gtk_h.g_compute_checksum_for_bytes(checksumType.getValue(), data.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Computes the checksum for a binary @data of @length. This is a
     * convenience wrapper for g_checksum_new(), g_checksum_get_string()
     * and g_checksum_free().
     * 
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeChecksumForData(ChecksumType checksumType, byte[] data, long length) {
        var RESULT = gtk_h.g_compute_checksum_for_data(checksumType.getValue(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), length);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Computes the checksum of a string.
     * 
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeChecksumForString(ChecksumType checksumType, java.lang.String str, long length) {
        var RESULT = gtk_h.g_compute_checksum_for_string(checksumType.getValue(), Interop.allocateNativeString(str).handle(), length);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Computes the HMAC for a binary @data. This is a
     * convenience wrapper for g_hmac_new(), g_hmac_get_string()
     * and g_hmac_unref().
     * 
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeHmacForBytes(ChecksumType digestType, Bytes key, Bytes data) {
        var RESULT = gtk_h.g_compute_hmac_for_bytes(digestType.getValue(), key.handle(), data.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Computes the HMAC for a binary @data of @length. This is a
     * convenience wrapper for g_hmac_new(), g_hmac_get_string()
     * and g_hmac_unref().
     * 
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeHmacForData(ChecksumType digestType, byte[] key, long keyLen, byte[] data, long length) {
        var RESULT = gtk_h.g_compute_hmac_for_data(digestType.getValue(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, key)).handle(), keyLen, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), length);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Computes the HMAC for a string.
     * 
     * The hexadecimal string returned will be in lower case.
     */
    public static java.lang.String computeHmacForString(ChecksumType digestType, byte[] key, long keyLen, java.lang.String str, long length) {
        var RESULT = gtk_h.g_compute_hmac_for_string(digestType.getValue(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, key)).handle(), keyLen, Interop.allocateNativeString(str).handle(), length);
        return RESULT.getUtf8String(0);
    }
    
    public static Quark convertErrorQuark() {
        var RESULT = gtk_h.g_convert_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Frees all the data elements of the datalist.
     * The data elements&<code>#39</code>  destroy functions are called
     * if they have been set.
     */
    public static void datalistClear(Data[] datalist) {
        gtk_h.g_datalist_clear(Interop.allocateNativeArray(datalist).handle());
    }
    
    /**
     * Calls the given function for each data element of the datalist. The
     * function is called with each data element&<code>#39</code> s {@link org.gtk.glib.Quark} id and data,
     * together with the given @user_data parameter. Note that this
     * function is NOT thread-safe. So unless @datalist can be protected
     * from any modifications during invocation of this function, it should
     * not be called.
     * 
     * @func can make changes to @datalist, but the iteration will not
     * reflect changes made during the g_datalist_foreach() call, other
     * than skipping over elements that are removed.
     */
    public static void datalistForeach(Data[] datalist, DataForeachFunc func) {
        try {
            gtk_h.g_datalist_foreach(Interop.allocateNativeArray(datalist).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDataForeachFunc",
                            MethodType.methodType(void.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets a data element, using its string identifier. This is slower than
     * g_datalist_id_get_data() because it compares strings.
     */
    public static jdk.incubator.foreign.MemoryAddress datalistGetData(Data[] datalist, java.lang.String key) {
        var RESULT = gtk_h.g_datalist_get_data(Interop.allocateNativeArray(datalist).handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets flags values packed in together with the datalist.
     * See g_datalist_set_flags().
     */
    public static int datalistGetFlags(Data[] datalist) {
        var RESULT = gtk_h.g_datalist_get_flags(Interop.allocateNativeArray(datalist).handle());
        return RESULT;
    }
    
    /**
     * This is a variant of g_datalist_id_get_data() which
     * returns a &<code>#39</code> duplicate&<code>#39</code>  of the value. @dup_func defines the
     * meaning of &<code>#39</code> duplicate&<code>#39</code>  in this context, it could e.g.
     * take a reference on a ref-counted object.
     * 
     * If the @key_id is not set in the datalist then @dup_func
     * will be called with a <code>null</code> argument.
     * 
     * Note that @dup_func is called while the datalist is locked, so it
     * is not allowed to read or modify the datalist.
     * 
     * This function can be useful to avoid races when multiple
     * threads are using the same datalist and the same key.
     */
    public static jdk.incubator.foreign.MemoryAddress datalistIdDupData(Data[] datalist, Quark keyId, DuplicateFunc dupFunc) {
        try {
            var RESULT = gtk_h.g_datalist_id_dup_data(Interop.allocateNativeArray(datalist).handle(), keyId.getValue(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDuplicateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(dupFunc.hashCode(), dupFunc)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Retrieves the data element corresponding to @key_id.
     */
    public static jdk.incubator.foreign.MemoryAddress datalistIdGetData(Data[] datalist, Quark keyId) {
        var RESULT = gtk_h.g_datalist_id_get_data(Interop.allocateNativeArray(datalist).handle(), keyId.getValue());
        return RESULT;
    }
    
    /**
     * Removes an element, without calling its destroy notification
     * function.
     */
    public static jdk.incubator.foreign.MemoryAddress datalistIdRemoveNoNotify(Data[] datalist, Quark keyId) {
        var RESULT = gtk_h.g_datalist_id_remove_no_notify(Interop.allocateNativeArray(datalist).handle(), keyId.getValue());
        return RESULT;
    }
    
    /**
     * Sets the data corresponding to the given {@link org.gtk.glib.Quark} id, and the
     * function to be called when the element is removed from the datalist.
     * Any previous data with the same key is removed, and its destroy
     * function is called.
     */
    public static void datalistIdSetDataFull(Data[] datalist, Quark keyId, jdk.incubator.foreign.MemoryAddress data, DestroyNotify destroyFunc) {
        gtk_h.g_datalist_id_set_data_full(Interop.allocateNativeArray(datalist).handle(), keyId.getValue(), data, 
                    Interop.cbDestroyNotifySymbol());
    }
    
    /**
     * Resets the datalist to <code>null</code>  It does not free any memory or call
     * any destroy functions.
     */
    public static void datalistInit(Data[] datalist) {
        gtk_h.g_datalist_init(Interop.allocateNativeArray(datalist).handle());
    }
    
    /**
     * Turns on flag values for a data list. This function is used
     * to keep a small number of boolean flags in an object with
     * a data list without using any additional space. It is
     * not generally useful except in circumstances where space
     * is very tight. (It is used in the base {@link org.gtk.gobject.Object} type, for
     * example.)
     */
    public static void datalistSetFlags(Data[] datalist, int flags) {
        gtk_h.g_datalist_set_flags(Interop.allocateNativeArray(datalist).handle(), flags);
    }
    
    /**
     * Turns off flag values for a data list. See g_datalist_unset_flags()
     */
    public static void datalistUnsetFlags(Data[] datalist, int flags) {
        gtk_h.g_datalist_unset_flags(Interop.allocateNativeArray(datalist).handle(), flags);
    }
    
    /**
     * Destroys the dataset, freeing all memory allocated, and calling any
     * destroy functions set for data elements.
     */
    public static void datasetDestroy(jdk.incubator.foreign.MemoryAddress datasetLocation) {
        gtk_h.g_dataset_destroy(datasetLocation);
    }
    
    /**
     * Calls the given function for each data element which is associated
     * with the given location. Note that this function is NOT thread-safe.
     * So unless @dataset_location can be protected from any modifications
     * during invocation of this function, it should not be called.
     * 
     * @func can make changes to the dataset, but the iteration will not
     * reflect changes made during the g_dataset_foreach() call, other
     * than skipping over elements that are removed.
     */
    public static void datasetForeach(jdk.incubator.foreign.MemoryAddress datasetLocation, DataForeachFunc func) {
        try {
            gtk_h.g_dataset_foreach(datasetLocation, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDataForeachFunc",
                            MethodType.methodType(void.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the data element corresponding to a {@link org.gtk.glib.Quark}
     */
    public static jdk.incubator.foreign.MemoryAddress datasetIdGetData(jdk.incubator.foreign.MemoryAddress datasetLocation, Quark keyId) {
        var RESULT = gtk_h.g_dataset_id_get_data(datasetLocation, keyId.getValue());
        return RESULT;
    }
    
    /**
     * Removes an element, without calling its destroy notification
     * function.
     */
    public static jdk.incubator.foreign.MemoryAddress datasetIdRemoveNoNotify(jdk.incubator.foreign.MemoryAddress datasetLocation, Quark keyId) {
        var RESULT = gtk_h.g_dataset_id_remove_no_notify(datasetLocation, keyId.getValue());
        return RESULT;
    }
    
    /**
     * Sets the data element associated with the given {@link org.gtk.glib.Quark} id, and also
     * the function to call when the data element is destroyed. Any
     * previous data with the same key is removed, and its destroy function
     * is called.
     */
    public static void datasetIdSetDataFull(jdk.incubator.foreign.MemoryAddress datasetLocation, Quark keyId, jdk.incubator.foreign.MemoryAddress data, DestroyNotify destroyFunc) {
        gtk_h.g_dataset_id_set_data_full(datasetLocation, keyId.getValue(), data, 
                    Interop.cbDestroyNotifySymbol());
    }
    
    /**
     * Returns the number of days in a month, taking leap
     * years into account.
     */
    public static byte dateGetDaysInMonth(DateMonth month, DateYear year) {
        var RESULT = gtk_h.g_date_get_days_in_month(month.getValue(), year.getValue());
        return RESULT;
    }
    
    /**
     * Returns the number of weeks in the year, where weeks
     * are taken to start on Monday. Will be 52 or 53. The
     * date must be valid. (Years always have 52 7-day periods,
     * plus 1 or 2 extra days depending on whether it&<code>#39</code> s a leap
     * year. This function is basically telling you how many
     * Mondays are in the year, i.e. there are 53 Mondays if
     * one of the extra days happens to be a Monday.)
     */
    public static byte dateGetMondayWeeksInYear(DateYear year) {
        var RESULT = gtk_h.g_date_get_monday_weeks_in_year(year.getValue());
        return RESULT;
    }
    
    /**
     * Returns the number of weeks in the year, where weeks
     * are taken to start on Sunday. Will be 52 or 53. The
     * date must be valid. (Years always have 52 7-day periods,
     * plus 1 or 2 extra days depending on whether it&<code>#39</code> s a leap
     * year. This function is basically telling you how many
     * Sundays are in the year, i.e. there are 53 Sundays if
     * one of the extra days happens to be a Sunday.)
     */
    public static byte dateGetSundayWeeksInYear(DateYear year) {
        var RESULT = gtk_h.g_date_get_sunday_weeks_in_year(year.getValue());
        return RESULT;
    }
    
    /**
     * Returns <code>true</code> if the year is a leap year.
     * 
     * For the purposes of this function, leap year is every year
     * divisible by 4 unless that year is divisible by 100. If it
     * is divisible by 100 it would be a leap year only if that year
     * is also divisible by 400.
     */
    public static boolean dateIsLeapYear(DateYear year) {
        var RESULT = gtk_h.g_date_is_leap_year(year.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Generates a printed representation of the date, in a
     * {@link [locale]}{@link [setlocale]}-specific way.
     * Works just like the platform&<code>#39</code> s C library strftime() function,
     * but only accepts date-related formats; time-related formats
     * give undefined results. Date must be valid. Unlike strftime()
     * (which uses the locale encoding), works on a UTF-8 format
     * string and stores a UTF-8 result.
     * 
     * This function does not provide any conversion specifiers in
     * addition to those implemented by the platform&<code>#39</code> s C library.
     * For example, don&<code>#39</code> t expect that using g_date_strftime() would
     * make the \\<code>F</code> provided by the C99 strftime() work on Windows
     * where the C library only complies to C89.
     */
    public static long dateStrftime(java.lang.String s, long slen, java.lang.String format, Date date) {
        var RESULT = gtk_h.g_date_strftime(Interop.allocateNativeString(s).handle(), slen, Interop.allocateNativeString(format).handle(), date.handle());
        return RESULT;
    }
    
    /**
     * Returns <code>true</code> if the day of the month is valid (a day is valid if it&<code>#39</code> s
     * between 1 and 31 inclusive).
     */
    public static boolean dateValidDay(DateDay day) {
        var RESULT = gtk_h.g_date_valid_day(day.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the day-month-year triplet forms a valid, existing day
     * in the range of days {@link org.gtk.glib.Date} understands (Year 1 or later, no more than
     * a few thousand years in the future).
     */
    public static boolean dateValidDmy(DateDay day, DateMonth month, DateYear year) {
        var RESULT = gtk_h.g_date_valid_dmy(day.getValue(), month.getValue(), year.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the Julian day is valid. Anything greater than zero
     * is basically a valid Julian, though there is a 32-bit limit.
     */
    public static boolean dateValidJulian(int julianDate) {
        var RESULT = gtk_h.g_date_valid_julian(julianDate);
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the month value is valid. The 12 {@link org.gtk.glib.DateMonth} enumeration values are the only valid months.
     */
    public static boolean dateValidMonth(DateMonth month) {
        var RESULT = gtk_h.g_date_valid_month(month.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the weekday is valid. The seven {@link org.gtk.glib.DateWeekday} enumeration
     * values are the only valid weekdays.
     */
    public static boolean dateValidWeekday(DateWeekday weekday) {
        var RESULT = gtk_h.g_date_valid_weekday(weekday.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the year is valid. Any year greater than 0 is valid,
     * though there is a 16-bit limit to what {@link org.gtk.glib.Date} will understand.
     */
    public static boolean dateValidYear(DateYear year) {
        var RESULT = gtk_h.g_date_valid_year(year.getValue());
        return (RESULT != 0);
    }
    
    /**
     * This is a variant of g_dgettext() that allows specifying a locale
     * category instead of always using <code>LC_MESSAGES</code>. See g_dgettext() for
     * more information about how this functions differs from calling
     * dcgettext() directly.
     */
    public static java.lang.String dcgettext(java.lang.String domain, java.lang.String msgid, int category) {
        var RESULT = gtk_h.g_dcgettext(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(msgid).handle(), category);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * This function is a wrapper of dgettext() which does not translate
     * the message if the default domain as set with textdomain() has no
     * translations for the current locale.
     * 
     * The advantage of using this function over dgettext() proper is that
     * libraries using this function (like GTK+) will not use translations
     * if the application using the library does not have translations for
     * the current locale.  This results in a consistent English-only
     * interface instead of one having partial translations.  For this
     * feature to work, the call to textdomain() and setlocale() should
     * precede any g_dgettext() invocations.  For GTK+, it means calling
     * textdomain() before gtk_init or its variants.
     * 
     * This function disables translations if and only if upon its first
     * call all the following conditions hold:
     * 
     * - @domain is not <code>null</code> 
     * - textdomain() has been called to set a default text domain
     * 
     * - there is no translations available for the default text domain
     *   and the current locale
     * 
     * - current locale is not &<code>#34</code> C&<code>#34</code>  or any English locales (those
     *   starting with &<code>#34</code> en_&<code>#34</code> )
     * 
     * Note that this behavior may not be desired for example if an application
     * has its untranslated messages in a language other than English. In those
     * cases the application should call textdomain() after initializing GTK+.
     * 
     * Applications should normally not use this function directly,
     * but use the _() macro for translations.
     */
    public static java.lang.String dgettext(java.lang.String domain, java.lang.String msgid) {
        var RESULT = gtk_h.g_dgettext(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(msgid).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a subdirectory in the preferred directory for temporary
     * files (as returned by g_get_tmp_dir()).
     * 
     * @tmpl should be a string in the GLib file name encoding containing
     * a sequence of six &<code>#39</code> X&<code>#39</code>  characters, as the parameter to g_mkstemp().
     * However, unlike these functions, the template should only be a
     * basename, no directory components are allowed. If template is
     * <code>null</code>  a default template is used.
     * 
     * Note that in contrast to g_mkdtemp() (and mkdtemp()) @tmpl is not
     * modified, and might thus be a read-only literal string.
     */
    public static java.lang.String dirMakeTmp(java.lang.String tmpl) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dir_make_tmp(Interop.allocateNativeString(tmpl).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Compares two <code>#gpointer</code> arguments and returns <code>true</code> if they are equal.
     * It can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using opaque pointers compared by pointer value as
     * keys in a {@link org.gtk.glib.HashTable} 
     * <p>
     * This equality function is also appropriate for keys that are integers
     * stored in pointers, such as <code>GINT_TO_POINTER (n)</code>.
     */
    public static boolean directEqual(jdk.incubator.foreign.MemoryAddress v1, jdk.incubator.foreign.MemoryAddress v2) {
        var RESULT = gtk_h.g_direct_equal(v1, v2);
        return (RESULT != 0);
    }
    
    /**
     * Converts a gpointer to a hash value.
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using opaque pointers compared by pointer value as keys in a
     * {@link org.gtk.glib.HashTable} 
     * <p>
     * This hash function is also appropriate for keys that are integers
     * stored in pointers, such as <code>GINT_TO_POINTER (n)</code>.
     */
    public static int directHash(jdk.incubator.foreign.MemoryAddress v) {
        var RESULT = gtk_h.g_direct_hash(v);
        return RESULT;
    }
    
    /**
     * This function is a wrapper of dngettext() which does not translate
     * the message if the default domain as set with textdomain() has no
     * translations for the current locale.
     * 
     * See g_dgettext() for details of how this differs from dngettext()
     * proper.
     */
    public static java.lang.String dngettext(java.lang.String domain, java.lang.String msgid, java.lang.String msgidPlural, long n) {
        var RESULT = gtk_h.g_dngettext(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(msgid).handle(), Interop.allocateNativeString(msgidPlural).handle(), n);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Compares the two <code>#gdouble</code> values being pointed to and returns
     * <code>true</code> if they are equal.
     * It can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using non-<code>null</code> pointers to doubles as keys in a
     * {@link org.gtk.glib.HashTable}
     */
    public static boolean doubleEqual(jdk.incubator.foreign.MemoryAddress v1, jdk.incubator.foreign.MemoryAddress v2) {
        var RESULT = gtk_h.g_double_equal(v1, v2);
        return (RESULT != 0);
    }
    
    /**
     * Converts a pointer to a <code>#gdouble</code> to a hash value.
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using non-<code>null</code> pointers to doubles as keys in a {@link org.gtk.glib.HashTable}
     */
    public static int doubleHash(jdk.incubator.foreign.MemoryAddress v) {
        var RESULT = gtk_h.g_double_hash(v);
        return RESULT;
    }
    
    /**
     * This function is a variant of g_dgettext() which supports
     * a disambiguating message context. GNU gettext uses the
     * &<code>#39</code> \\004&<code>#39</code>  character to separate the message context and
     * message id in @msgctxtid.
     * If 0 is passed as @msgidoffset, this function will fall back to
     * trying to use the deprecated convention of using &<code>#34</code> |&<code>#34</code>  as a separation
     * character.
     * 
     * This uses g_dgettext() internally. See that functions for differences
     * with dgettext() proper.
     * 
     * Applications should normally not use this function directly,
     * but use the C_() macro for translations with context.
     */
    public static java.lang.String dpgettext(java.lang.String domain, java.lang.String msgctxtid, long msgidoffset) {
        var RESULT = gtk_h.g_dpgettext(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(msgctxtid).handle(), msgidoffset);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * This function is a variant of g_dgettext() which supports
     * a disambiguating message context. GNU gettext uses the
     * &<code>#39</code> \\004&<code>#39</code>  character to separate the message context and
     * message id in @msgctxtid.
     * 
     * This uses g_dgettext() internally. See that functions for differences
     * with dgettext() proper.
     * 
     * This function differs from C_() in that it is not a macro and
     * thus you may use non-string-literals as context and msgid arguments.
     */
    public static java.lang.String dpgettext2(java.lang.String domain, java.lang.String context, java.lang.String msgid) {
        var RESULT = gtk_h.g_dpgettext2(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(context).handle(), Interop.allocateNativeString(msgid).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the value of the environment variable @variable in the
     * provided list @envp.
     */
    public static java.lang.String environGetenv(java.lang.String[] envp, java.lang.String variable) {
        var RESULT = gtk_h.g_environ_getenv(Interop.allocateNativeArray(envp).handle(), Interop.allocateNativeString(variable).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a {@link org.gtk.glib.FileError} constant based on the passed-in @err_no.
     * <p>
     * For example, if you pass in <code>EEXIST</code> this function returns
     * {@link org.gtk.glib.FileError<code>#EXIST</code>   Unlike <code>errno</code> values, you can portably
     * assume that all {@link org.gtk.glib.FileError} values will exist.
     * 
     * Normally a {@link org.gtk.glib.FileError} value goes into a {@link org.gtk.glib.Error} returned
     * from a function that manipulates files. So you would use
     * g_file_error_from_errno() when constructing a {@link org.gtk.glib.Error}
     */
    public static FileError fileErrorFromErrno(int errNo) {
        var RESULT = gtk_h.g_file_error_from_errno(errNo);
        return FileError.fromValue(RESULT);
    }
    
    public static Quark fileErrorQuark() {
        var RESULT = gtk_h.g_file_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Opens a file for writing in the preferred directory for temporary
     * files (as returned by g_get_tmp_dir()).
     * 
     * @tmpl should be a string in the GLib file name encoding containing
     * a sequence of six &<code>#39</code> X&<code>#39</code>  characters, as the parameter to g_mkstemp().
     * However, unlike these functions, the template should only be a
     * basename, no directory components are allowed. If template is
     * <code>null</code>  a default template is used.
     * 
     * Note that in contrast to g_mkstemp() (and mkstemp()) @tmpl is not
     * modified, and might thus be a read-only literal string.
     * 
     * Upon success, and if @name_used is non-<code>null</code>  the actual name used
     * is returned in @name_used. This string should be freed with g_free()
     * when not needed any longer. The returned name is in the GLib file
     * name encoding.
     */
    public static int fileOpenTmp(java.lang.String tmpl, java.lang.String[] nameUsed) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_open_tmp(Interop.allocateNativeString(tmpl).handle(), Interop.allocateNativeArray(nameUsed).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads the contents of the symbolic link @filename like the POSIX
     * readlink() function.  The returned string is in the encoding used
     * for filenames. Use g_filename_to_utf8() to convert it to UTF-8.
     */
    public static java.lang.String fileReadLink(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_read_link(Interop.allocateNativeString(filename).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Writes all of @contents to a file named @filename. This is a convenience
     * wrapper around calling g_file_set_contents_full() with <code>flags</code> set to<code>G_FILE_SET_CONTENTS_CONSISTENT | G_FILE_SET_CONTENTS_ONLY_EXISTING</code> and<code>mode</code> set to <code>0666</code>.
     */
    public static boolean fileSetContents(java.lang.String filename, byte[] contents, long length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_contents(Interop.allocateNativeString(filename).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, contents)).handle(), length, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Writes all of @contents to a file named @filename, with good error checking.
     * If a file called @filename already exists it will be overwritten.
     * <p>
     * @flags control the properties of the write operation: whether it&<code>#8217</code> s atomic,
     * and what the tradeoff is between returning quickly or being resilient to
     * system crashes.
     * <p>
     * As this function performs file I/O, it is recommended to not call it anywhere
     * where blocking would cause problems, such as in the main loop of a graphical
     * application. In particular, if @flags has any value other than
     * {@link org.gtk.glib.FileSetContentsFlags<code>#NONE</code>  then this function may call <code>fsync()</code>.
     * <p>
     * If {@link org.gtk.glib.FileSetContentsFlags<code>#CONSISTENT</code>  is set in @flags, the operation is atomic
     * in the sense that it is first written to a temporary file which is then
     * renamed to the final name.
     * <p>
     * Notes:
     * <p>
     * <li>On UNIX, if @filename already exists hard links to @filename will break.
     *   Also since the file is recreated, existing permissions, access control
     *   lists, metadata etc. may be lost. If @filename is a symbolic link,
     *   the link itself will be replaced, not the linked file.
     * <p>
     * <li>On UNIX, if @filename already exists and is non-empty, and if the system
     *   supports it (via a journalling filesystem or equivalent), and if
     *   {@link org.gtk.glib.FileSetContentsFlags<code>#CONSISTENT</code>  is set in @flags, the <code>fsync()</code> call (or
     *   equivalent) will be used to ensure atomic replacement: @filename
     *   will contain either its old contents or @contents, even in the face of
     *   system power loss, the disk being unsafely removed, etc.
     * 
     * - On UNIX, if @filename does not already exist or is empty, there is a
     *   possibility that system power loss etc. after calling this function will
     *   leave @filename empty or full of NUL bytes, depending on the underlying
     *   filesystem, unless {@link org.gtk.glib.FileSetContentsFlags<code>#DURABLE</code>  and
     *   {@link org.gtk.glib.FileSetContentsFlags<code>#CONSISTENT</code>  are set in @flags.
     * 
     * - On Windows renaming a file will not remove an existing file with the
     *   new name, so on Windows there is a race condition between the existing
     *   file being removed and the temporary file being renamed.
     * 
     * - On Windows there is no way to remove a file that is open to some
     *   process, or mapped into memory. Thus, this function will fail if
     *   @filename already exists and is open.
     * 
     * If the call was successful, it returns <code>true</code>  If the call was not successful,
     * it returns <code>false</code> and sets @error. The error domain is <code>G_FILE_ERROR</code> 
     * Possible error codes are those in the {@link org.gtk.glib.FileError} enumeration.
     * 
     * Note that the name for the temporary file is constructed by appending up
     * to 7 characters to @filename.
     * 
     * If the file didn&<code>#8217</code> t exist before and is created, it will be given the
     * permissions from @mode. Otherwise, the permissions of the existing file may
     * be changed to @mode depending on @flags, or they may remain unchanged.
     */
    public static boolean fileSetContentsFull(java.lang.String filename, byte[] contents, long length, int flags, int mode) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_file_set_contents_full(Interop.allocateNativeString(filename).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, contents)).handle(), length, flags, mode, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if any of the tests in the bitfield @test are
     * <code>true</code>  For example, <code>(G_FILE_TEST_EXISTS | G_FILE_TEST_IS_DIR)</code>
     * will return <code>true</code> if the file exists; the check whether it&<code>#39</code> s a
     * directory doesn&<code>#39</code> t matter since the existence test is <code>true</code>  With
     * the current set of available tests, there&<code>#39</code> s no point passing in
     * more than one test at a time.
     * <p>
     * Apart from {@link org.gtk.glib.FileTest<code>#IS_SYMLINK</code>  all tests follow symbolic links,
     * so for a symbolic link to a regular file g_file_test() will return
     * <code>true</code> for both {@link org.gtk.glib.FileTest<code>#IS_SYMLINK</code>  and {@link org.gtk.glib.FileTest<code>#IS_REGULAR</code>  
     * <p>
     * Note, that for a dangling symbolic link g_file_test() will return
     * <code>true</code> for {@link org.gtk.glib.FileTest<code>#IS_SYMLINK</code>  and <code>false</code> for all other flags.
     * <p>
     * You should never use g_file_test() to test whether it is safe
     * to perform an operation, because there is always the possibility
     * of the condition changing before you actually perform the operation.
     * For example, you might think you could use {@link org.gtk.glib.FileTest<code>#IS_SYMLINK</code>  to know whether it is safe to write to a file without being
     * tricked into writing into a different location. It doesn&<code>#39</code> t work!
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *  // DON&<code>#39</code> T DO THIS
     *  if (!g_file_test (filename, G_FILE_TEST_IS_SYMLINK))
     *    {
     *      fd = g_open (filename, O_WRONLY);
     *      // write to fd
     *    }
     * ]}|
     * <p>
     * Another thing to note is that {@link org.gtk.glib.FileTest<code>#EXISTS</code>  and
     * {@link org.gtk.glib.FileTest<code>#IS_EXECUTABLE</code>  are implemented using the access()
     * system call. This usually doesn&<code>#39</code> t matter, but if your program
     * is setuid or setgid it means that these tests will give you
     * the answer for the real user ID and group ID, rather than the
     * effective user ID and group ID.
     * <p>
     * On Windows, there are no symlinks, so testing for
     * {@link org.gtk.glib.FileTest<code>#IS_SYMLINK</code>  will always return <code>false</code>  Testing for
     * {@link org.gtk.glib.FileTest<code>#IS_EXECUTABLE</code>  will just check that the file exists and
     * its name indicates that it is executable, checking for well-known
     * extensions and those listed in the <code>PATHEXT</code> environment variable.
     */
    public static boolean fileTest(java.lang.String filename, int test) {
        var RESULT = gtk_h.g_file_test(Interop.allocateNativeString(filename).handle(), test);
        return (RESULT != 0);
    }
    
    /**
     * Returns the display basename for the particular filename, guaranteed
     * to be valid UTF-8. The display name might not be identical to the filename,
     * for instance there might be problems converting it to UTF-8, and some files
     * can be translated in the display.
     * 
     * If GLib cannot make sense of the encoding of @filename, as a last resort it
     * replaces unknown characters with U+FFFD, the Unicode replacement character.
     * You can search the result for the UTF-8 encoding of this character (which is
     * &<code>#34</code> \\357\\277\\275&<code>#34</code>  in octal notation) to find out if @filename was in an invalid
     * encoding.
     * 
     * You must pass the whole absolute pathname to this functions so that
     * translation of well known locations can be done.
     * 
     * This function is preferred over g_filename_display_name() if you know the
     * whole path, as it allows translation.
     */
    public static java.lang.String filenameDisplayBasename(java.lang.String filename) {
        var RESULT = gtk_h.g_filename_display_basename(Interop.allocateNativeString(filename).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a filename into a valid UTF-8 string. The conversion is
     * not necessarily reversible, so you should keep the original around
     * and use the return value of this function only for display purposes.
     * Unlike g_filename_to_utf8(), the result is guaranteed to be non-<code>null</code> even if the filename actually isn&<code>#39</code> t in the GLib file name encoding.
     * 
     * If GLib cannot make sense of the encoding of @filename, as a last resort it
     * replaces unknown characters with U+FFFD, the Unicode replacement character.
     * You can search the result for the UTF-8 encoding of this character (which is
     * &<code>#34</code> \\357\\277\\275&<code>#34</code>  in octal notation) to find out if @filename was in an invalid
     * encoding.
     * 
     * If you know the whole pathname of the file you should use
     * g_filename_display_basename(), since that allows location-based
     * translation of filenames.
     */
    public static java.lang.String filenameDisplayName(java.lang.String filename) {
        var RESULT = gtk_h.g_filename_display_name(Interop.allocateNativeString(filename).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts an escaped ASCII-encoded URI to a local filename in the
     * encoding used for filenames.
     */
    public static java.lang.String filenameFromUri(java.lang.String uri, java.lang.String[] hostname) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_filename_from_uri(Interop.allocateNativeString(uri).handle(), Interop.allocateNativeArray(hostname).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts an absolute filename to an escaped ASCII-encoded URI, with the path
     * component following Section 3.3. of RFC 2396.
     */
    public static java.lang.String filenameToUri(java.lang.String filename, java.lang.String hostname) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_filename_to_uri(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(hostname).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Locates the first executable named @program in the user&<code>#39</code> s path, in the
     * same way that execvp() would locate it. Returns an allocated string
     * with the absolute path name, or <code>null</code> if the program is not found in
     * the path. If @program is already an absolute path, returns a copy of
     * @program if @program exists and is executable, and <code>null</code> otherwise.
     *  
     * On Windows, if @program does not have a file type suffix, tries
     * with the suffixes .exe, .cmd, .bat and .com, and the suffixes in
     * the <code>PATHEXT</code> environment variable.
     * <p>
     * On Windows, it looks for the file in the same way as CreateProcess()
     * would. This means first in the directory where the executing
     * program was loaded from, then in the current directory, then in the
     * Windows 32-bit system directory, then in the Windows directory, and
     * finally in the directories in the <code>PATH</code> environment variable. If
     * the program is found, the return value contains the full name
     * including the type suffix.
     */
    public static java.lang.String findProgramInPath(java.lang.String program) {
        var RESULT = gtk_h.g_find_program_in_path(Interop.allocateNativeString(program).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Formats a size (for example the size of a file) into a human readable
     * string.  Sizes are rounded to the nearest size prefix (kB, MB, GB)
     * and are displayed rounded to the nearest tenth. E.g. the file size
     * 3292528 bytes will be converted into the string &<code>#34</code> 3.2 MB&<code>#34</code> . The returned string
     * is UTF-8, and may use a non-breaking space to separate the number and units,
     * to ensure they aren&<code>#8217</code> t separated when line wrapped.
     * 
     * The prefix units base is 1000 (i.e. 1 kB is 1000 bytes).
     * 
     * This string should be freed with g_free() when not needed any longer.
     * 
     * See g_format_size_full() for more options about how the size might be
     * formatted.
     */
    public static java.lang.String formatSize(long size) {
        var RESULT = gtk_h.g_format_size(size);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Formats a size.
     * 
     * This function is similar to g_format_size() but allows for flags
     * that modify the output. See {@link org.gtk.glib.FormatSizeFlags}
     */
    public static java.lang.String formatSizeFull(long size, int flags) {
        var RESULT = gtk_h.g_format_size_full(size, flags);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Frees the memory pointed to by @mem.
     * 
     * If @mem is <code>null</code> it simply returns, so there is no need to check @mem
     * against <code>null</code> before calling this function.
     */
    public static void free(jdk.incubator.foreign.MemoryAddress mem) {
        gtk_h.g_free(mem);
    }
    
    /**
     * Gets a human-readable name for the application, as set by
     * g_set_application_name(). This name should be localized if
     * possible, and is intended for display to the user.  Contrast with
     * g_get_prgname(), which gets a non-localized name. If
     * g_set_application_name() has not been called, returns the result of
     * g_get_prgname() (which may be <code>null</code> if g_set_prgname() has also not
     * been called).
     */
    public static java.lang.String getApplicationName() {
        var RESULT = gtk_h.g_get_application_name();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Obtains the character set for the {@link [current locale]}{@link [setlocale]}; you
     * might use this character set as an argument to g_convert(), to convert
     * from the current locale&<code>#39</code> s encoding to some other encoding. (Frequently
     * g_locale_to_utf8() and g_locale_from_utf8() are nice shortcuts, though.)
     * <p>
     * On Windows the character set returned by this function is the
     * so-called system default ANSI code-page. That is the character set
     * used by the &<code>#34</code> narrow&<code>#34</code>  versions of C library and Win32 functions that
     * handle file names. It might be different from the character set
     * used by the C library&<code>#39</code> s current locale.
     * <p>
     * On Linux, the character set is found by consulting nl_langinfo() if
     * available. If not, the environment variables <code>LC_ALL</code>, <code>LC_CTYPE</code>, <code>LANG</code>
     * and <code>CHARSET</code> are queried in order.
     * 
     * The return value is <code>true</code> if the locale&<code>#39</code> s encoding is UTF-8, in that
     * case you can perhaps avoid calling g_convert().
     * 
     * The string returned in @charset is not allocated, and should not be
     * freed.
     */
    public static boolean getCharset(java.lang.String[] charset) {
        var RESULT = gtk_h.g_get_charset(Interop.allocateNativeArray(charset).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the character set for the current locale.
     */
    public static java.lang.String getCodeset() {
        var RESULT = gtk_h.g_get_codeset();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Obtains the character set used by the console attached to the process,
     * which is suitable for printing output to the terminal.
     * 
     * Usually this matches the result returned by g_get_charset(), but in
     * environments where the locale&<code>#39</code> s character set does not match the encoding
     * of the console this function tries to guess a more suitable value instead.
     * 
     * On Windows the character set returned by this function is the
     * output code page used by the console associated with the calling process.
     * If the codepage can&<code>#39</code> t be determined (for example because there is no
     * console attached) UTF-8 is assumed.
     * 
     * The return value is <code>true</code> if the locale&<code>#39</code> s encoding is UTF-8, in that
     * case you can perhaps avoid calling g_convert().
     * 
     * The string returned in @charset is not allocated, and should not be
     * freed.
     */
    public static boolean getConsoleCharset(java.lang.String[] charset) {
        var RESULT = gtk_h.g_get_console_charset(Interop.allocateNativeArray(charset).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the current directory.
     * 
     * The returned string should be freed when no longer needed.
     * The encoding of the returned string is system defined.
     * On Windows, it is always UTF-8.
     * 
     * Since GLib 2.40, this function will return the value of the &<code>#34</code> PWD&<code>#34</code> 
     * environment variable if it is set and it happens to be the same as
     * the current directory.  This can make a difference in the case that
     * the current directory is the target of a symbolic link.
     */
    public static java.lang.String getCurrentDir() {
        var RESULT = gtk_h.g_get_current_dir();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines the preferred character sets used for filenames.
     * The first character set from the @charsets is the filename encoding, the
     * subsequent character sets are used when trying to generate a displayable
     * representation of a filename, see g_filename_display_name().
     * <p>
     * On Unix, the character sets are determined by consulting the
     * environment variables <code>G_FILENAME_ENCODING</code> and <code>G_BROKEN_FILENAMES</code>.
     * On Windows, the character set used in the GLib API is always UTF-8
     * and said environment variables have no effect.
     * <p><code>G_FILENAME_ENCODING</code> may be set to a comma-separated list of
     * character set names. The special token &<code>#34</code> \\@locale&<code>#34</code>  is taken
     * to  mean the character set for the {@link [current locale]}{@link [setlocale]}.
     * If <code>G_FILENAME_ENCODING</code> is not set, but <code>G_BROKEN_FILENAMES</code> is,
     * the character set of the current locale is taken as the filename
     * encoding. If neither environment variable  is set, UTF-8 is taken
     * as the filename encoding, but the character set of the current locale
     * is also put in the list of encodings.
     * <p>
     * The returned @charsets belong to GLib and must not be freed.
     * <p>
     * Note that on Unix, regardless of the locale character set or<code>G_FILENAME_ENCODING</code> value, the actual file names present
     * on a system might be in any random encoding or just gibberish.
     */
    public static boolean getFilenameCharsets(java.lang.String[] filenameCharsets) {
        var RESULT = gtk_h.g_get_filename_charsets(Interop.allocateNativeArray(filenameCharsets).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the current user&<code>#39</code> s home directory.
     * <p>
     * As with most UNIX tools, this function will return the value of the<code>HOME</code> environment variable if it is set to an existing absolute path
     * name, falling back to the <code>passwd</code> file in the case that it is unset.
     * <p>
     * If the path given in <code>HOME</code> is non-absolute, does not exist, or is
     * not a directory, the result is undefined.
     * <p>
     * Before version 2.36 this function would ignore the <code>HOME</code> environment
     * variable, taking the value from the <code>passwd</code> database instead. This was
     * changed to increase the compatibility of GLib with other programs (and
     * the XDG basedir specification) and to increase testability of programs
     * based on GLib (by making it easier to run them from test frameworks).
     * <p>
     * If your program has a strong requirement for either the new or the
     * old behaviour (and if you don&<code>#39</code> t wish to increase your GLib
     * dependency to ensure that the new behaviour is in effect) then you
     * should either directly check the <code>HOME</code> environment variable yourself
     * or unset it before calling any functions in GLib.
     */
    public static java.lang.String getHomeDir() {
        var RESULT = gtk_h.g_get_home_dir();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Return a name for the machine.
     * 
     * The returned name is not necessarily a fully-qualified domain name,
     * or even present in DNS or some other name service at all. It need
     * not even be unique on your local network or site, but usually it
     * is. Callers should not rely on the return value having any specific
     * properties like uniqueness for security purposes. Even if the name
     * of the machine is changed while an application is running, the
     * return value from this function does not change. The returned
     * string is owned by GLib and should not be modified or freed. If no
     * name can be determined, a default fixed string &<code>#34</code> localhost&<code>#34</code>  is
     * returned.
     * 
     * The encoding of the returned string is UTF-8.
     */
    public static java.lang.String getHostName() {
        var RESULT = gtk_h.g_get_host_name();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Queries the system monotonic time.
     * 
     * The monotonic clock will always increase and doesn&<code>#39</code> t suffer
     * discontinuities when the user (or NTP) changes the system time.  It
     * may or may not continue to tick during times where the machine is
     * suspended.
     * 
     * We try to use the clock that corresponds as closely as possible to
     * the passage of time as measured by system calls such as poll() but it
     * may not always be possible to do this.
     */
    public static long getMonotonicTime() {
        var RESULT = gtk_h.g_get_monotonic_time();
        return RESULT;
    }
    
    /**
     * Determine the approximate number of threads that the system will
     * schedule simultaneously for this process.  This is intended to be
     * used as a parameter to g_thread_pool_new() for CPU bound tasks and
     * similar cases.
     */
    public static int getNumProcessors() {
        var RESULT = gtk_h.g_get_num_processors();
        return RESULT;
    }
    
    /**
     * Get information about the operating system.
     * <p>
     * On Linux this comes from the <code>/etc/os-release</code> file. On other systems, it may
     * come from a variety of sources. You can either use the standard key names
     * like <code>G_OS_INFO_KEY_NAME</code> or pass any UTF-8 string key name. For example,<code>/etc/os-release</code> provides a number of other less commonly used values that may
     * be useful. No key is guaranteed to be provided, so the caller should always
     * check if the result is <code>null</code>
     */
    public static java.lang.String getOsInfo(java.lang.String keyName) {
        var RESULT = gtk_h.g_get_os_info(Interop.allocateNativeString(keyName).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of the program. This name should not be localized,
     * in contrast to g_get_application_name().
     * 
     * If you are using {@link org.gtk.gio.Application} the program name is set in
     * g_application_run(). In case of GDK or GTK+ it is set in
     * gdk_init(), which is called by gtk_init() and the
     * {@link org.gtk.gtk.Application} :startup handler. The program name is found by
     * taking the last component of @argv{@link [0]}.
     */
    public static java.lang.String getPrgname() {
        var RESULT = gtk_h.g_get_prgname();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the real name of the user. This usually comes from the user&<code>#39</code> s
     * entry in the <code>passwd</code> file. The encoding of the returned string is
     * system-defined. (On Windows, it is, however, always UTF-8.) If the
     * real user name cannot be determined, the string &<code>#34</code> Unknown&<code>#34</code>  is
     * returned.
     */
    public static java.lang.String getRealName() {
        var RESULT = gtk_h.g_get_real_name();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Queries the system wall-clock time.
     * 
     * This call is functionally equivalent to g_get_current_time() except
     * that the return value is often more convenient than dealing with a
     * {@link org.gtk.glib.TimeVal} 
     * 
     * You should only use this call if you are actually interested in the real
     * wall-clock time.  g_get_monotonic_time() is probably more useful for
     * measuring intervals.
     */
    public static long getRealTime() {
        var RESULT = gtk_h.g_get_real_time();
        return RESULT;
    }
    
    /**
     * Gets the directory to use for temporary files.
     * <p>
     * On UNIX, this is taken from the <code>TMPDIR</code> environment variable.
     * If the variable is not set, <code>P_tmpdir</code> is
     * used, as defined by the system C library. Failing that, a
     * hard-coded default of &<code>#34</code> /tmp&<code>#34</code>  is returned.
     * <p>
     * On Windows, the <code>TEMP</code> environment variable is used, with the
     * root directory of the Windows installation (eg: &<code>#34</code> C:\\&<code>#34</code> ) used
     * as a default.
     * 
     * The encoding of the returned string is system-defined. On Windows,
     * it is always UTF-8. The return value is never <code>null</code> or the empty
     * string.
     */
    public static java.lang.String getTmpDir() {
        var RESULT = gtk_h.g_get_tmp_dir();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a base directory in which to store non-essential, cached
     * data specific to particular user.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * {@link [XDG Base Directory Specification]}(http://www.freedesktop.org/Standards/basedir-spec).
     * In this case the directory retrieved will be <code>XDG_CACHE_HOME</code>.
     * <p>
     * On Windows it follows XDG Base Directory Specification if <code>XDG_CACHE_HOME</code> is defined.
     * If <code>XDG_CACHE_HOME</code> is undefined, the directory that serves as a common
     * repository for temporary Internet files is used instead. A typical path is<code>C:\\Documents and Settings\\username\\Local Settings\\Temporary Internet Files</code>.
     * See the {@link [documentation for <code>FOLDERID_InternetCache</code>]}(https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * 
     * The return value is cached and modifying it at runtime is not supported, as
     * it&<code>#8217</code> s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserCacheDir() {
        var RESULT = gtk_h.g_get_user_cache_dir();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a base directory in which to store user-specific application
     * configuration information such as user preferences and settings.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * {@link [XDG Base Directory Specification]}(http://www.freedesktop.org/Standards/basedir-spec).
     * In this case the directory retrieved will be <code>XDG_CONFIG_HOME</code>.
     * <p>
     * On Windows it follows XDG Base Directory Specification if <code>XDG_CONFIG_HOME</code> is defined.
     * If <code>XDG_CONFIG_HOME</code> is undefined, the folder to use for local (as opposed
     * to roaming) application data is used instead. See the
     * {@link [documentation for <code>FOLDERID_LocalAppData</code>]}(https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * Note that in this case on Windows it will be  the same
     * as what g_get_user_data_dir() returns.
     * 
     * The return value is cached and modifying it at runtime is not supported, as
     * it&<code>#8217</code> s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserConfigDir() {
        var RESULT = gtk_h.g_get_user_config_dir();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a base directory in which to access application data such
     * as icons that is customized for a particular user.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * {@link [XDG Base Directory Specification]}(http://www.freedesktop.org/Standards/basedir-spec).
     * In this case the directory retrieved will be <code>XDG_DATA_HOME</code>.
     * <p>
     * On Windows it follows XDG Base Directory Specification if <code>XDG_DATA_HOME</code>
     * is defined. If <code>XDG_DATA_HOME</code> is undefined, the folder to use for local (as
     * opposed to roaming) application data is used instead. See the
     * {@link [documentation for <code>FOLDERID_LocalAppData</code>]}(https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * Note that in this case on Windows it will be the same
     * as what g_get_user_config_dir() returns.
     * 
     * The return value is cached and modifying it at runtime is not supported, as
     * it&<code>#8217</code> s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserDataDir() {
        var RESULT = gtk_h.g_get_user_data_dir();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the user name of the current user. The encoding of the returned
     * string is system-defined. On UNIX, it might be the preferred file name
     * encoding, or something else, and there is no guarantee that it is even
     * consistent on a machine. On Windows, it is always UTF-8.
     */
    public static java.lang.String getUserName() {
        var RESULT = gtk_h.g_get_user_name();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a directory that is unique to the current user on the local
     * system.
     * <p>
     * This is determined using the mechanisms described
     * in the
     * {@link [XDG Base Directory Specification]}(http://www.freedesktop.org/Standards/basedir-spec).
     * This is the directory
     * specified in the <code>XDG_RUNTIME_DIR</code> environment variable.
     * In the case that this variable is not set, we return the value of
     * g_get_user_cache_dir(), after verifying that it exists.
     * 
     * The return value is cached and modifying it at runtime is not supported, as
     * it&<code>#8217</code> s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserRuntimeDir() {
        var RESULT = gtk_h.g_get_user_runtime_dir();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the full path of a special directory using its logical id.
     * <p>
     * On UNIX this is done using the XDG special user directories.
     * For compatibility with existing practise, {@link org.gtk.glib.UserDirectory<code>#DIRECTORY_DESKTOP</code>  falls back to <code>$HOME/Desktop</code> when XDG special user directories have
     * not been set up.
     * 
     * Depending on the platform, the user might be able to change the path
     * of the special directory without requiring the session to restart; GLib
     * will not reflect any change once the special directories are loaded.
     */
    public static java.lang.String getUserSpecialDir(UserDirectory directory) {
        var RESULT = gtk_h.g_get_user_special_dir(directory.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a base directory in which to store state files specific to
     * particular user.
     * <p>
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * {@link [XDG Base Directory Specification]}(http://www.freedesktop.org/Standards/basedir-spec).
     * In this case the directory retrieved will be <code>XDG_STATE_HOME</code>.
     * <p>
     * On Windows it follows XDG Base Directory Specification if <code>XDG_STATE_HOME</code> is defined.
     * If <code>XDG_STATE_HOME</code> is undefined, the folder to use for local (as opposed
     * to roaming) application data is used instead. See the
     * {@link [documentation for <code>FOLDERID_LocalAppData</code>]}(https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * Note that in this case on Windows it will be the same
     * as what g_get_user_data_dir() returns.
     * 
     * The return value is cached and modifying it at runtime is not supported, as
     * it&<code>#8217</code> s not thread-safe to modify environment variables at runtime.
     */
    public static java.lang.String getUserStateDir() {
        var RESULT = gtk_h.g_get_user_state_dir();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the value of an environment variable.
     * 
     * On UNIX, the name and value are byte strings which might or might not
     * be in some consistent character set and encoding. On Windows, they are
     * in UTF-8.
     * On Windows, in case the environment variable&<code>#39</code> s value contains
     * references to other environment variables, they are expanded.
     */
    public static java.lang.String getenv(java.lang.String variable) {
        var RESULT = gtk_h.g_getenv(Interop.allocateNativeString(variable).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * This is a convenience function for using a {@link org.gtk.glib.HashTable} as a set.  It
     * is equivalent to calling g_hash_table_replace() with @key as both the
     * key and the value.
     * 
     * In particular, this means that if @key already exists in the hash table, then
     * the old copy of @key in the hash table is freed and @key replaces it in the
     * table.
     * 
     * When a hash table only ever contains keys that have themselves as the
     * corresponding value it is able to be stored more efficiently.  See
     * the discussion in the section description.
     * 
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean hashTableAdd(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_add(hashTable.handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Checks if @key is in @hash_table.
     */
    public static boolean hashTableContains(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_contains(hashTable.handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Destroys all keys and values in the {@link org.gtk.glib.HashTable} and decrements its
     * reference count by 1. If keys and/or values are dynamically allocated,
     * you should either free them first or create the {@link org.gtk.glib.HashTable} with destroy
     * notifiers using g_hash_table_new_full(). In the latter case the destroy
     * functions you supplied will be called on all keys and values during the
     * destruction phase.
     */
    public static void hashTableDestroy(org.gtk.glib.HashTable hashTable) {
        gtk_h.g_hash_table_destroy(hashTable.handle());
    }
    
    /**
     * Inserts a new key and value into a {@link org.gtk.glib.HashTable} 
     * 
     * If the key already exists in the {@link org.gtk.glib.HashTable} its current
     * value is replaced with the new value. If you supplied a
     * @value_destroy_func when creating the {@link org.gtk.glib.HashTable}  the old
     * value is freed using that function. If you supplied a
     * @key_destroy_func when creating the {@link org.gtk.glib.HashTable}  the passed
     * key is freed using that function.
     * 
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean hashTableInsert(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_hash_table_insert(hashTable.handle(), key, value);
        return (RESULT != 0);
    }
    
    /**
     * Looks up a key in a {@link org.gtk.glib.HashTable}  Note that this function cannot
     * distinguish between a key that is not present and one which is present
     * and has the value <code>null</code>  If you need this distinction, use
     * g_hash_table_lookup_extended().
     */
    public static jdk.incubator.foreign.MemoryAddress hashTableLookup(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_lookup(hashTable.handle(), key);
        return RESULT;
    }
    
    /**
     * Looks up a key in the {@link org.gtk.glib.HashTable}  returning the original key and the
     * associated value and a <code>#gboolean</code> which is <code>true</code> if the key was found. This
     * is useful if you need to free the memory allocated for the original key,
     * for example before calling g_hash_table_remove().
     * 
     * You can actually pass <code>null</code> for @lookup_key to test
     * whether the <code>null</code> key exists, provided the hash and equal functions
     * of @hash_table are <code>null</code> safe.
     */
    public static boolean hashTableLookupExtended(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress lookupKey, jdk.incubator.foreign.MemoryAddress origKey, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_hash_table_lookup_extended(hashTable.handle(), lookupKey, origKey, value);
        return (RESULT != 0);
    }
    
    /**
     * Creates a new {@link org.gtk.glib.HashTable} like g_hash_table_new_full() with a reference
     * count of 1.
     * 
     * It inherits the hash function, the key equal function, the key destroy function,
     * as well as the value destroy function, from @other_hash_table.
     * 
     * The returned hash table will be empty; it will not contain the keys
     * or values from @other_hash_table.
     */
    public static org.gtk.glib.HashTable hashTableNewSimilar(org.gtk.glib.HashTable otherHashTable) {
        var RESULT = gtk_h.g_hash_table_new_similar(otherHashTable.handle());
        return new org.gtk.glib.HashTable(References.get(RESULT, true));
    }
    
    /**
     * Removes a key and its associated value from a {@link org.gtk.glib.HashTable} 
     * 
     * If the {@link org.gtk.glib.HashTable} was created using g_hash_table_new_full(), the
     * key and value are freed using the supplied destroy functions, otherwise
     * you have to make sure that any dynamically allocated values are freed
     * yourself.
     */
    public static boolean hashTableRemove(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_remove(hashTable.handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Removes all keys and their associated values from a {@link org.gtk.glib.HashTable} 
     * 
     * If the {@link org.gtk.glib.HashTable} was created using g_hash_table_new_full(),
     * the keys and values are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     */
    public static void hashTableRemoveAll(org.gtk.glib.HashTable hashTable) {
        gtk_h.g_hash_table_remove_all(hashTable.handle());
    }
    
    /**
     * Inserts a new key and value into a {@link org.gtk.glib.HashTable} similar to
     * g_hash_table_insert(). The difference is that if the key
     * already exists in the {@link org.gtk.glib.HashTable}  it gets replaced by the
     * new key. If you supplied a @value_destroy_func when creating
     * the {@link org.gtk.glib.HashTable}  the old value is freed using that function.
     * If you supplied a @key_destroy_func when creating the
     * {@link org.gtk.glib.HashTable}  the old key is freed using that function.
     * 
     * Starting from GLib 2.40, this function returns a boolean value to
     * indicate whether the newly added value was already in the hash table
     * or not.
     */
    public static boolean hashTableReplace(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_hash_table_replace(hashTable.handle(), key, value);
        return (RESULT != 0);
    }
    
    /**
     * Returns the number of elements contained in the {@link org.gtk.glib.HashTable}
     */
    public static int hashTableSize(org.gtk.glib.HashTable hashTable) {
        var RESULT = gtk_h.g_hash_table_size(hashTable.handle());
        return RESULT;
    }
    
    /**
     * Removes a key and its associated value from a {@link org.gtk.glib.HashTable} without
     * calling the key and value destroy functions.
     */
    public static boolean hashTableSteal(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress key) {
        var RESULT = gtk_h.g_hash_table_steal(hashTable.handle(), key);
        return (RESULT != 0);
    }
    
    /**
     * Removes all keys and their associated values from a {@link org.gtk.glib.HashTable} without calling the key and value destroy functions.
     */
    public static void hashTableStealAll(org.gtk.glib.HashTable hashTable) {
        gtk_h.g_hash_table_steal_all(hashTable.handle());
    }
    
    /**
     * Looks up a key in the {@link org.gtk.glib.HashTable}  stealing the original key and the
     * associated value and returning <code>true</code> if the key was found. If the key was
     * not found, <code>false</code> is returned.
     * 
     * If found, the stolen key and value are removed from the hash table without
     * calling the key and value destroy functions, and ownership is transferred to
     * the caller of this method; as with g_hash_table_steal().
     * 
     * You can pass <code>null</code> for @lookup_key, provided the hash and equal functions
     * of @hash_table are <code>null</code> safe.
     */
    public static boolean hashTableStealExtended(org.gtk.glib.HashTable hashTable, jdk.incubator.foreign.MemoryAddress lookupKey, jdk.incubator.foreign.MemoryAddress stolenKey, jdk.incubator.foreign.MemoryAddress stolenValue) {
        var RESULT = gtk_h.g_hash_table_steal_extended(hashTable.handle(), lookupKey, stolenKey, stolenValue);
        return (RESULT != 0);
    }
    
    /**
     * Atomically decrements the reference count of @hash_table by one.
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     */
    public static void hashTableUnref(org.gtk.glib.HashTable hashTable) {
        gtk_h.g_hash_table_unref(hashTable.handle());
    }
    
    /**
     * Destroys a {@link org.gtk.glib.Hook}  given its ID.
     */
    public static boolean hookDestroy(HookList hookList, long hookId) {
        var RESULT = gtk_h.g_hook_destroy(hookList.handle(), hookId);
        return (RESULT != 0);
    }
    
    /**
     * Removes one {@link org.gtk.glib.Hook} from a {@link org.gtk.glib.HookList}  marking it
     * inactive and calling g_hook_unref() on it.
     */
    public static void hookDestroyLink(HookList hookList, Hook hook) {
        gtk_h.g_hook_destroy_link(hookList.handle(), hook.handle());
    }
    
    /**
     * Calls the {@link org.gtk.glib.HookList} @finalize_hook function if it exists,
     * and frees the memory allocated for the {@link org.gtk.glib.Hook}
     */
    public static void hookFree(HookList hookList, Hook hook) {
        gtk_h.g_hook_free(hookList.handle(), hook.handle());
    }
    
    /**
     * Inserts a {@link org.gtk.glib.Hook} into a {@link org.gtk.glib.HookList}  before a given {@link org.gtk.glib.Hook}
     */
    public static void hookInsertBefore(HookList hookList, Hook sibling, Hook hook) {
        gtk_h.g_hook_insert_before(hookList.handle(), sibling.handle(), hook.handle());
    }
    
    /**
     * Prepends a {@link org.gtk.glib.Hook} on the start of a {@link org.gtk.glib.HookList}
     */
    public static void hookPrepend(HookList hookList, Hook hook) {
        gtk_h.g_hook_prepend(hookList.handle(), hook.handle());
    }
    
    /**
     * Decrements the reference count of a {@link org.gtk.glib.Hook} 
     * If the reference count falls to 0, the {@link org.gtk.glib.Hook} is removed
     * from the {@link org.gtk.glib.HookList} and g_hook_free() is called to free it.
     */
    public static void hookUnref(HookList hookList, Hook hook) {
        gtk_h.g_hook_unref(hookList.handle(), hook.handle());
    }
    
    /**
     * Tests if @hostname contains segments with an ASCII-compatible
     * encoding of an Internationalized Domain Name. If this returns
     * <code>true</code>  you should decode the hostname with g_hostname_to_unicode()
     * before displaying it to the user.
     * 
     * Note that a hostname might contain a mix of encoded and unencoded
     * segments, and so it is possible for g_hostname_is_non_ascii() and
     * g_hostname_is_ascii_encoded() to both return <code>true</code> for a name.
     */
    public static boolean hostnameIsAsciiEncoded(java.lang.String hostname) {
        var RESULT = gtk_h.g_hostname_is_ascii_encoded(Interop.allocateNativeString(hostname).handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests if @hostname is the string form of an IPv4 or IPv6 address.
     * (Eg, &<code>#34</code> 192.168.0.1&<code>#34</code> .)
     * 
     * Since 2.66, IPv6 addresses with a zone-id are accepted (RFC6874).
     */
    public static boolean hostnameIsIpAddress(java.lang.String hostname) {
        var RESULT = gtk_h.g_hostname_is_ip_address(Interop.allocateNativeString(hostname).handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests if @hostname contains Unicode characters. If this returns
     * <code>true</code>  you need to encode the hostname with g_hostname_to_ascii()
     * before using it in non-IDN-aware contexts.
     * 
     * Note that a hostname might contain a mix of encoded and unencoded
     * segments, and so it is possible for g_hostname_is_non_ascii() and
     * g_hostname_is_ascii_encoded() to both return <code>true</code> for a name.
     */
    public static boolean hostnameIsNonAscii(java.lang.String hostname) {
        var RESULT = gtk_h.g_hostname_is_non_ascii(Interop.allocateNativeString(hostname).handle());
        return (RESULT != 0);
    }
    
    /**
     * Converts @hostname to its canonical ASCII form; an ASCII-only
     * string containing no uppercase letters and not ending with a
     * trailing dot.
     */
    public static java.lang.String hostnameToAscii(java.lang.String hostname) {
        var RESULT = gtk_h.g_hostname_to_ascii(Interop.allocateNativeString(hostname).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts @hostname to its canonical presentation form; a UTF-8
     * string in Unicode normalization form C, containing no uppercase
     * letters, no forbidden characters, and no ASCII-encoded segments,
     * and not ending with a trailing dot.
     * 
     * Of course if @hostname is not an internationalized hostname, then
     * the canonical presentation form will be entirely ASCII.
     */
    public static java.lang.String hostnameToUnicode(java.lang.String hostname) {
        var RESULT = gtk_h.g_hostname_to_unicode(Interop.allocateNativeString(hostname).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Same as the standard UNIX routine iconv_open(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation.
     * 
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     */
    public static IConv iconvOpen(java.lang.String toCodeset, java.lang.String fromCodeset) {
        var RESULT = gtk_h.g_iconv_open(Interop.allocateNativeString(toCodeset).handle(), Interop.allocateNativeString(fromCodeset).handle());
        return new IConv(References.get(RESULT, false));
    }
    
    /**
     * Adds a function to be called whenever there are no higher priority
     * events pending to the default main loop. The function is given the
     * default idle priority, <code>G_PRIORITY_DEFAULT_IDLE</code>   If the function
     * returns <code>false</code> it is automatically removed from the list of event
     * sources and will not be called again.
     * 
     * See {@link [memory management of sources]}{@link [mainloop-memory-management]} for details
     * on how to handle the return value and memory management of @data.
     * 
     * This internally creates a main loop source using g_idle_source_new()
     * and attaches it to the global {@link org.gtk.glib.MainContext} using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     */
    public static int idleAdd(SourceFunc function) {
        try {
            var RESULT = gtk_h.g_idle_add(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Adds a function to be called whenever there are no higher priority
     * events pending.
     * 
     * If the function returns <code>G_SOURCE_REMOVE</code> or <code>false</code> it is automatically
     * removed from the list of event sources and will not be called again.
     * 
     * See {@link [memory management of sources]}{@link [mainloop-memory-management]} for details
     * on how to handle the return value and memory management of @data.
     * 
     * This internally creates a main loop source using g_idle_source_new()
     * and attaches it to the global {@link org.gtk.glib.MainContext} using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     */
    public static int idleAddFull(int priority, SourceFunc function) {
        try {
            var RESULT = gtk_h.g_idle_add_full(priority, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes the idle function with the given data.
     */
    public static boolean idleRemoveByData(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_idle_remove_by_data(data);
        return (RESULT != 0);
    }
    
    /**
     * Creates a new idle source.
     * 
     * The source will not initially be associated with any {@link org.gtk.glib.MainContext} and must be added to one with g_source_attach() before it will be
     * executed. Note that the default priority for idle sources is
     * <code>G_PRIORITY_DEFAULT_IDLE</code>  as compared to other sources which
     * have a default priority of <code>G_PRIORITY_DEFAULT</code>
     */
    public static Source idleSourceNew() {
        var RESULT = gtk_h.g_idle_source_new();
        return new Source(References.get(RESULT, true));
    }
    
    /**
     * Compares the two <code>#gint64</code> values being pointed to and returns
     * <code>true</code> if they are equal.
     * It can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using non-<code>null</code> pointers to 64-bit integers as keys in a
     * {@link org.gtk.glib.HashTable}
     */
    public static boolean int64Equal(jdk.incubator.foreign.MemoryAddress v1, jdk.incubator.foreign.MemoryAddress v2) {
        var RESULT = gtk_h.g_int64_equal(v1, v2);
        return (RESULT != 0);
    }
    
    /**
     * Converts a pointer to a <code>#gint64</code> to a hash value.
     * 
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using non-<code>null</code> pointers to 64-bit integer values as keys in a
     * {@link org.gtk.glib.HashTable}
     */
    public static int int64Hash(jdk.incubator.foreign.MemoryAddress v) {
        var RESULT = gtk_h.g_int64_hash(v);
        return RESULT;
    }
    
    /**
     * Compares the two <code>#gint</code> values being pointed to and returns
     * <code>true</code> if they are equal.
     * It can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using non-<code>null</code> pointers to integers as keys in a
     * {@link org.gtk.glib.HashTable} 
     * <p>
     * Note that this function acts on pointers to <code>#gint</code>  not on <code>#gint</code> directly: if your hash table&<code>#39</code> s keys are of the form<code>GINT_TO_POINTER (n)</code>, use g_direct_equal() instead.
     */
    public static boolean intEqual(jdk.incubator.foreign.MemoryAddress v1, jdk.incubator.foreign.MemoryAddress v2) {
        var RESULT = gtk_h.g_int_equal(v1, v2);
        return (RESULT != 0);
    }
    
    /**
     * Converts a pointer to a <code>#gint</code> to a hash value.
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using non-<code>null</code> pointers to integer values as keys in a {@link org.gtk.glib.HashTable} 
     * <p>
     * Note that this function acts on pointers to <code>#gint</code>  not on <code>#gint</code> directly: if your hash table&<code>#39</code> s keys are of the form<code>GINT_TO_POINTER (n)</code>, use g_direct_hash() instead.
     */
    public static int intHash(jdk.incubator.foreign.MemoryAddress v) {
        var RESULT = gtk_h.g_int_hash(v);
        return RESULT;
    }
    
    /**
     * Returns a canonical representation for @string. Interned strings
     * can be compared for equality by comparing the pointers, instead of
     * using strcmp(). g_intern_static_string() does not copy the string,
     * therefore @string must not be freed or modified.
     * 
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     */
    public static java.lang.String internStaticString(java.lang.String string) {
        var RESULT = gtk_h.g_intern_static_string(Interop.allocateNativeString(string).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a canonical representation for @string. Interned strings
     * can be compared for equality by comparing the pointers, instead of
     * using strcmp().
     * 
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     */
    public static java.lang.String internString(java.lang.String string) {
        var RESULT = gtk_h.g_intern_string(Interop.allocateNativeString(string).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Adds the {@link org.gtk.glib.IOChannel} into the default main loop context
     * with the default priority.
     */
    public static int ioAddWatch(IOChannel channel, int condition, IOFunc func) {
        try {
            var RESULT = gtk_h.g_io_add_watch(channel.handle(), condition, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbIOFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Adds the {@link org.gtk.glib.IOChannel} into the default main loop context
     * with the given priority.
     * 
     * This internally creates a main loop source using g_io_create_watch()
     * and attaches it to the main loop context with g_source_attach().
     * You can do these steps manually if you need greater control.
     */
    public static int ioAddWatchFull(IOChannel channel, int priority, int condition, IOFunc func) {
        try {
            var RESULT = gtk_h.g_io_add_watch_full(channel.handle(), priority, condition, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbIOFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Converts an <code>errno</code> error number to a {@link org.gtk.glib.IOChannelError}
     */
    public static IOChannelError ioChannelErrorFromErrno(int en) {
        var RESULT = gtk_h.g_io_channel_error_from_errno(en);
        return IOChannelError.fromValue(RESULT);
    }
    
    public static Quark ioChannelErrorQuark() {
        var RESULT = gtk_h.g_io_channel_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Creates a {@link org.gtk.glib.Source} that&<code>#39</code> s dispatched when @condition is met for the
     * given @channel. For example, if condition is {@link org.gtk.glib.IOCondition<code>#IN</code>   the source will
     * be dispatched when there&<code>#39</code> s data available for reading.
     * 
     * The callback function invoked by the {@link org.gtk.glib.Source} should be added with
     * g_source_set_callback(), but it has type {@link org.gtk.glib.IOFunc} (not {@link org.gtk.glib.SourceFunc} .
     * 
     * g_io_add_watch() is a simpler interface to this same functionality, for
     * the case where you want to add the source to the default main loop context
     * at the default priority.
     * 
     * On Windows, polling a {@link org.gtk.glib.Source} created to watch a channel for a socket
     * puts the socket in non-blocking mode. This is a side-effect of the
     * implementation and unavoidable.
     */
    public static Source ioCreateWatch(IOChannel channel, int condition) {
        var RESULT = gtk_h.g_io_create_watch(channel.handle(), condition);
        return new Source(References.get(RESULT, true));
    }
    
    public static Quark keyFileErrorQuark() {
        var RESULT = gtk_h.g_key_file_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * The default log handler set up by GLib; g_log_set_default_handler()
     * allows to install an alternate default log handler.
     * This is used if no log handler has been set for the particular log
     * domain and log level combination. It outputs the message to stderr
     * or stdout and if the log level is fatal it calls G_BREAKPOINT(). It automatically
     * prints a new-line character after the message, so one does not need to be
     * manually included in @message.
     * <p>
     * The behavior of this log handler can be influenced by a number of
     * environment variables:
     * <p>
     * <li><code>G_MESSAGES_PREFIXED</code>: A :-separated list of log levels for which
     *   messages should be prefixed by the program name and PID of the
     *   application.
     * <p>
     * <li><code>G_MESSAGES_DEBUG</code>: A space-separated list of log domains for
     *   which debug and informational messages are printed. By default
     *   these messages are not printed.
     * 
     * stderr is used for levels {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_ERROR</code>   {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_CRITICAL</code>  
     * {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_WARNING</code>  and {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_MESSAGE</code>   stdout is used for
     * the rest, unless stderr was requested by
     * g_log_writer_default_set_use_stderr().
     * 
     * This has no effect if structured logging is enabled; see
     * {@link [Using Structured Logging]}{@link [using-structured-logging]}.
     */
    public static void logDefaultHandler(java.lang.String logDomain, int logLevel, java.lang.String message, jdk.incubator.foreign.MemoryAddress unusedData) {
        gtk_h.g_log_default_handler(Interop.allocateNativeString(logDomain).handle(), logLevel, Interop.allocateNativeString(message).handle(), unusedData);
    }
    
    /**
     * Return whether debug output from the GLib logging system is enabled.
     * <p>
     * Note that this should not be used to conditionalise calls to g_debug() or
     * other logging functions; it should only be used from <code>GLogWriterFunc</code> implementations.
     * <p>
     * Note also that the value of this does not depend on <code>G_MESSAGES_DEBUG</code>; see
     * the docs for g_log_set_debug_enabled().
     */
    public static boolean logGetDebugEnabled() {
        var RESULT = gtk_h.g_log_get_debug_enabled();
        return (RESULT != 0);
    }
    
    /**
     * Removes the log handler.
     * 
     * This has no effect if structured logging is enabled; see
     * {@link [Using Structured Logging]}{@link [using-structured-logging]}.
     */
    public static void logRemoveHandler(java.lang.String logDomain, int handlerId) {
        gtk_h.g_log_remove_handler(Interop.allocateNativeString(logDomain).handle(), handlerId);
    }
    
    /**
     * Sets the message levels which are always fatal, in any log domain.
     * When a message with any of these levels is logged the program terminates.
     * You can only set the levels defined by GLib to be fatal.
     * {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_ERROR</code>  is always fatal.
     * <p>
     * You can also make some message levels fatal at runtime by setting
     * the <code>G_DEBUG</code> environment variable (see
     * {@link [Running GLib Applications]}(glib-running.html)).
     * 
     * Libraries should not call this function, as it affects all messages logged
     * by a process, including those from other libraries.
     * 
     * Structured log messages (using g_log_structured() and
     * g_log_structured_array()) are fatal only if the default log writer is used;
     * otherwise it is up to the writer function to determine which log messages
     * are fatal. See {@link [Using Structured Logging]}{@link [using-structured-logging]}.
     */
    public static int logSetAlwaysFatal(int fatalMask) {
        var RESULT = gtk_h.g_log_set_always_fatal(fatalMask);
        return RESULT;
    }
    
    /**
     * Enable or disable debug output from the GLib logging system for all domains.
     * This value interacts disjunctively with <code>G_MESSAGES_DEBUG</code> &<code>#8212</code>  if either of
     * them would allow a debug message to be outputted, it will be.
     * 
     * Note that this should not be used from within library code to enable debug
     * output &<code>#8212</code>  it is intended for external use.
     */
    public static void logSetDebugEnabled(boolean enabled) {
        gtk_h.g_log_set_debug_enabled(enabled ? 1 : 0);
    }
    
    /**
     * Sets the log levels which are fatal in the given domain.
     * {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_ERROR</code>  is always fatal.
     * 
     * This has no effect on structured log messages (using g_log_structured() or
     * g_log_structured_array()). To change the fatal behaviour for specific log
     * messages, programs must install a custom log writer function using
     * g_log_set_writer_func(). See
     * {@link [Using Structured Logging]}{@link [using-structured-logging]}.
     * 
     * This function is mostly intended to be used with
     * {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_CRITICAL</code>    You should typically not set
     * {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_WARNING</code>   {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_MESSAGE</code>   {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_INFO</code>  or
     * {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_DEBUG</code>  as fatal except inside of test programs.
     */
    public static int logSetFatalMask(java.lang.String logDomain, int fatalMask) {
        var RESULT = gtk_h.g_log_set_fatal_mask(Interop.allocateNativeString(logDomain).handle(), fatalMask);
        return RESULT;
    }
    
    /**
     * Sets the log handler for a domain and a set of log levels.
     * 
     * To handle fatal and recursive messages the @log_levels parameter
     * must be combined with the {@link org.gtk.glib.LogLevelFlags<code>#FLAG_FATAL</code>  and {@link org.gtk.glib.LogLevelFlags<code>#FLAG_RECURSION</code>  bit flags.
     * 
     * Note that since the {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_ERROR</code>  log level is always fatal, if
     * you want to set a handler for this log level you must combine it with
     * {@link org.gtk.glib.LogLevelFlags<code>#FLAG_FATAL</code>  
     * 
     * This has no effect if structured logging is enabled; see
     * {@link [Using Structured Logging]}{@link [using-structured-logging]}.
     * 
     * Here is an example for adding a log handler for all warning messages
     * in the default domain:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * g_log_set_handler (NULL, G_LOG_LEVEL_WARNING | G_LOG_FLAG_FATAL
     *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
     * ]}|
     * 
     * This example adds a log handler for all critical messages from GTK+:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * g_log_set_handler (&<code>#34</code> Gtk&<code>#34</code> , G_LOG_LEVEL_CRITICAL | G_LOG_FLAG_FATAL
     *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
     * ]}|
     * 
     * This example adds a log handler for all messages from GLib:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * g_log_set_handler (&<code>#34</code> GLib&<code>#34</code> , G_LOG_LEVEL_MASK | G_LOG_FLAG_FATAL
     *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
     * ]}|
     */
    public static int logSetHandler(java.lang.String logDomain, int logLevels, LogFunc logFunc) {
        try {
            var RESULT = gtk_h.g_log_set_handler(Interop.allocateNativeString(logDomain).handle(), logLevels, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbLogFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(logFunc.hashCode(), logFunc)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_log_set_handler(), but takes a destroy notify for the @user_data.
     * 
     * This has no effect if structured logging is enabled; see
     * {@link [Using Structured Logging]}{@link [using-structured-logging]}.
     */
    public static int logSetHandlerFull(java.lang.String logDomain, int logLevels, LogFunc logFunc) {
        try {
            var RESULT = gtk_h.g_log_set_handler_full(Interop.allocateNativeString(logDomain).handle(), logLevels, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbLogFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(logFunc.hashCode(), logFunc)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Set a writer function which will be called to format and write out each log
     * message. Each program should set a writer function, or the default writer
     * (g_log_writer_default()) will be used.
     * 
     * Libraries **must not** call this function &<code>#8212</code>  only programs are allowed to
     * install a writer function, as there must be a single, central point where
     * log messages are formatted and outputted.
     * 
     * There can only be one writer function. It is an error to set more than one.
     */
    public static void logSetWriterFunc(LogWriterFunc func) {
        try {
            gtk_h.g_log_set_writer_func(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbLogWriterFunc",
                            MethodType.methodType(int.class, int.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Log a message with structured data. The message will be passed through to the
     * log writer set by the application using g_log_set_writer_func(). If the
     * message is fatal (i.e. its log level is {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_ERROR</code>  , the program will
     * be aborted at the end of this function.
     * <p>
     * See g_log_structured() for more documentation.
     * <p>
     * This assumes that @log_level is already present in @fields (typically as the<code>PRIORITY</code> field).
     */
    public static void logStructuredArray(int logLevel, LogField[] fields, long nFields) {
        gtk_h.g_log_structured_array(logLevel, Interop.allocateNativeArray(fields).handle(), nFields);
    }
    
    /**
     * Log a message with structured data, accepting the data within a {@link org.gtk.glib.Variant}  This
     * version is especially useful for use in other languages, via introspection.
     * 
     * The only mandatory item in the @fields dictionary is the &<code>#34</code> MESSAGE&<code>#34</code>  which must
     * contain the text shown to the user.
     * 
     * The values in the @fields dictionary are likely to be of type String
     * (<code>G_VARIANT_TYPE_STRING</code> . Array of bytes (<code>G_VARIANT_TYPE_BYTESTRING</code>  is also
     * supported. In this case the message is handled as binary and will be forwarded
     * to the log writer as such. The size of the array should not be higher than
     * <code>G_MAXSSIZE</code>  Otherwise it will be truncated to this size. For other types
     * g_variant_print() will be used to convert the value into a string.
     * 
     * For more details on its usage and about the parameters, see g_log_structured().
     */
    public static void logVariant(java.lang.String logDomain, int logLevel, Variant fields) {
        gtk_h.g_log_variant(Interop.allocateNativeString(logDomain).handle(), logLevel, fields.handle());
    }
    
    /**
     * Format a structured log message and output it to the default log destination
     * for the platform. On Linux, this is typically the systemd journal, falling
     * back to <code>stdout</code> or <code>stderr</code> if running from the terminal or if output is
     * being redirected to a file.
     * <p>
     * Support for other platform-specific logging mechanisms may be added in
     * future. Distributors of GLib may modify this function to impose their own
     * (documented) platform-specific log writing policies.
     * <p>
     * This is suitable for use as a {@link org.gtk.glib.LogWriterFunc}  and is the default writer used
     * if no other is set using g_log_set_writer_func().
     * <p>
     * As with g_log_default_handler(), this function drops debug and informational
     * messages unless their log domain (or <code>all</code>) is listed in the space-separated<code>G_MESSAGES_DEBUG</code> environment variable.
     * 
     * g_log_writer_default() uses the mask set by g_log_set_always_fatal() to
     * determine which messages are fatal. When using a custom writer func instead it is
     * up to the writer function to determine which log messages are fatal.
     */
    public static LogWriterOutput logWriterDefault(int logLevel, LogField[] fields, long nFields, jdk.incubator.foreign.MemoryAddress userData) {
        var RESULT = gtk_h.g_log_writer_default(logLevel, Interop.allocateNativeArray(fields).handle(), nFields, userData);
        return LogWriterOutput.fromValue(RESULT);
    }
    
    /**
     * Configure whether the built-in log functions
     * (g_log_default_handler() for the old-style API, and both
     * g_log_writer_default() and g_log_writer_standard_streams() for the
     * structured API) will output all log messages to <code>stderr</code>.
     * <p>
     * By default, log messages of levels {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_INFO</code>  and
     * {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_DEBUG</code>  are sent to <code>stdout</code>, and other log messages are
     * sent to <code>stderr</code>. This is problematic for applications that intend
     * to reserve <code>stdout</code> for structured output such as JSON or XML.
     * 
     * This function sets global state. It is not thread-aware, and should be
     * called at the very start of a program, before creating any other threads
     * or creating objects that could create worker threads of their own.
     */
    public static void logWriterDefaultSetUseStderr(boolean useStderr) {
        gtk_h.g_log_writer_default_set_use_stderr(useStderr ? 1 : 0);
    }
    
    /**
     * Check whether g_log_writer_default() and g_log_default_handler() would
     * ignore a message with the given domain and level.
     * <p>
     * As with g_log_default_handler(), this function drops debug and informational
     * messages unless their log domain (or <code>all</code>) is listed in the space-separated<code>G_MESSAGES_DEBUG</code> environment variable.
     * <p>
     * This can be used when implementing log writers with the same filtering
     * behaviour as the default, but a different destination or output format:
     * <p>
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   if (g_log_writer_default_would_drop (log_level, log_domain))
     *     return G_LOG_WRITER_HANDLED;
     * ]}|
     * <p>
     * or to skip an expensive computation if it is only needed for a debugging
     * message, and <code>G_MESSAGES_DEBUG</code> is not set:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   if (!g_log_writer_default_would_drop (G_LOG_LEVEL_DEBUG, G_LOG_DOMAIN))
     *     {
     *       gchar *result = expensive_computation (my_object);
     * 
     *       g_debug (&<code>#34</code> my_object result: <code>s</code> <code>#34</code> , result);
     *       g_free (result);
     *     }
     * ]}|
     */
    public static boolean logWriterDefaultWouldDrop(int logLevel, java.lang.String logDomain) {
        var RESULT = gtk_h.g_log_writer_default_would_drop(logLevel, Interop.allocateNativeString(logDomain).handle());
        return (RESULT != 0);
    }
    
    /**
     * Format a structured log message as a string suitable for outputting to the
     * terminal (or elsewhere). This will include the values of all fields it knows
     * how to interpret, which includes <code>MESSAGE</code> and <code>GLIB_DOMAIN</code> (see the
     * documentation for g_log_structured()). It does not include values from
     * unknown fields.
     * 
     * The returned string does **not** have a trailing new-line character. It is
     * encoded in the character set of the current locale, which is not necessarily
     * UTF-8.
     */
    public static java.lang.String logWriterFormatFields(int logLevel, LogField[] fields, long nFields, boolean useColor) {
        var RESULT = gtk_h.g_log_writer_format_fields(logLevel, Interop.allocateNativeArray(fields).handle(), nFields, useColor ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Check whether the given @output_fd file descriptor is a connection to the
     * systemd journal, or something else (like a log file or <code>stdout</code> or<code>stderr</code>).
     * 
     * Invalid file descriptors are accepted and return <code>false</code>  which allows for
     * the following construct without needing any additional error handling:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   is_journald = g_log_writer_is_journald (fileno (stderr));
     * ]}|
     */
    public static boolean logWriterIsJournald(int outputFd) {
        var RESULT = gtk_h.g_log_writer_is_journald(outputFd);
        return (RESULT != 0);
    }
    
    /**
     * Format a structured log message and send it to the systemd journal as a set
     * of key&<code>#8211</code> value pairs. All fields are sent to the journal, but if a field has
     * length zero (indicating program-specific data) then only its key will be
     * sent.
     * 
     * This is suitable for use as a {@link org.gtk.glib.LogWriterFunc} 
     * 
     * If GLib has been compiled without systemd support, this function is still
     * defined, but will always return {@link org.gtk.glib.LogWriterOutput<code>#UNHANDLED</code>
     */
    public static LogWriterOutput logWriterJournald(int logLevel, LogField[] fields, long nFields, jdk.incubator.foreign.MemoryAddress userData) {
        var RESULT = gtk_h.g_log_writer_journald(logLevel, Interop.allocateNativeArray(fields).handle(), nFields, userData);
        return LogWriterOutput.fromValue(RESULT);
    }
    
    /**
     * Format a structured log message and print it to either <code>stdout</code> or <code>stderr</code>,
     * depending on its log level. {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_INFO</code>  and {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_DEBUG</code>  messages
     * are sent to <code>stdout</code>, or to <code>stderr</code> if requested by
     * g_log_writer_default_set_use_stderr();
     * all other log levels are sent to <code>stderr</code>. Only fields
     * which are understood by this function are included in the formatted string
     * which is printed.
     * 
     * If the output stream supports ANSI color escape sequences, they will be used
     * in the output.
     * 
     * A trailing new-line character is added to the log message when it is printed.
     * 
     * This is suitable for use as a {@link org.gtk.glib.LogWriterFunc}
     */
    public static LogWriterOutput logWriterStandardStreams(int logLevel, LogField[] fields, long nFields, jdk.incubator.foreign.MemoryAddress userData) {
        var RESULT = gtk_h.g_log_writer_standard_streams(logLevel, Interop.allocateNativeArray(fields).handle(), nFields, userData);
        return LogWriterOutput.fromValue(RESULT);
    }
    
    /**
     * Check whether the given @output_fd file descriptor supports ANSI color
     * escape sequences. If so, they can safely be used when formatting log
     * messages.
     */
    public static boolean logWriterSupportsColor(int outputFd) {
        var RESULT = gtk_h.g_log_writer_supports_color(outputFd);
        return (RESULT != 0);
    }
    
    /**
     * Logs an error or debugging message.
     * 
     * If the log level has been set as fatal, G_BREAKPOINT() is called
     * to terminate the program. See the documentation for G_BREAKPOINT() for
     * details of the debugging options this provides.
     * 
     * If g_log_default_handler() is used as the log handler function, a new-line
     * character will automatically be appended to @..., and need not be entered
     * manually.
     * 
     * If {@link [structured logging is enabled]}{@link [using-structured-logging]} this will
     * output via the structured log writer function (see g_log_set_writer_func()).
     */
    public static void logv(java.lang.String logDomain, int logLevel, java.lang.String format, VaList args) {
        gtk_h.g_logv(Interop.allocateNativeString(logDomain).handle(), logLevel, Interop.allocateNativeString(format).handle(), args);
    }
    
    /**
     * Returns the global default main context. This is the main context
     * used for main loop functions when a main loop is not explicitly
     * specified, and corresponds to the &<code>#34</code> main&<code>#34</code>  main loop. See also
     * g_main_context_get_thread_default().
     */
    public static MainContext mainContextDefault() {
        var RESULT = gtk_h.g_main_context_default();
        return new MainContext(References.get(RESULT, false));
    }
    
    /**
     * Gets the thread-default {@link org.gtk.glib.MainContext} for this thread. Asynchronous
     * operations that want to be able to be run in contexts other than
     * the default one should call this method or
     * g_main_context_ref_thread_default() to get a {@link org.gtk.glib.MainContext} to add
     * their <code>#GSources</code> to. (Note that even in single-threaded
     * programs applications may sometimes want to temporarily push a
     * non-default context, so it is not safe to assume that this will
     * always return <code>null</code> if you are running in the default thread.)
     * 
     * If you need to hold a reference on the context, use
     * g_main_context_ref_thread_default() instead.
     */
    public static MainContext mainContextGetThreadDefault() {
        var RESULT = gtk_h.g_main_context_get_thread_default();
        return new MainContext(References.get(RESULT, false));
    }
    
    /**
     * Gets the thread-default {@link org.gtk.glib.MainContext} for this thread, as with
     * g_main_context_get_thread_default(), but also adds a reference to
     * it with g_main_context_ref(). In addition, unlike
     * g_main_context_get_thread_default(), if the thread-default context
     * is the global default context, this will return that {@link org.gtk.glib.MainContext} (with a ref added to it) rather than returning <code>null</code>
     */
    public static MainContext mainContextRefThreadDefault() {
        var RESULT = gtk_h.g_main_context_ref_thread_default();
        return new MainContext(References.get(RESULT, true));
    }
    
    /**
     * Returns the currently firing source for this thread.
     */
    public static Source mainCurrentSource() {
        var RESULT = gtk_h.g_main_current_source();
        return new Source(References.get(RESULT, false));
    }
    
    /**
     * Returns the depth of the stack of calls to
     * g_main_context_dispatch() on any {@link org.gtk.glib.MainContext} in the current thread.
     *  That is, when called from the toplevel, it gives 0. When
     * called from within a callback from g_main_context_iteration()
     * (or g_main_loop_run(), etc.) it returns 1. When called from within
     * a callback to a recursive call to g_main_context_iteration(),
     * it returns 2. And so forth.
     * 
     * This function is useful in a situation like the following:
     * Imagine an extremely simple &<code>#34</code> garbage collected&<code>#34</code>  system.
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
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
     *   for (l = free_list; l; l = l-&<code>#62</code> next);
     *     g_free (l-&<code>#62</code> data);
     *   g_list_free (free_list);
     *   free_list = NULL;
     *  }
     * 
     * [...]}
     * 
     * while (TRUE);
     *  {
     *    g_main_context_iteration (NULL, TRUE);
     *    free_allocated_memory();
     *   }
     * ]|
     * 
     * This works from an application, however, if you want to do the same
     * thing from a library, it gets more difficult, since you no longer
     * control the main loop. You might think you can simply use an idle
     * function to make the call to free_allocated_memory(), but that
     * doesn&<code>#39</code> t work, since the idle function could be called from a
     * recursive callback. This can be fixed by using g_main_depth()
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * gpointer
     * allocate_memory (gsize size)
     * {
     *   FreeListBlock *block = g_new (FreeListBlock, 1);
     *   block-&<code>#62</code> mem = g_malloc (size);
     *   block-&<code>#62</code> depth = g_main_depth ();
     *   free_list = g_list_prepend (free_list, block);
     *   return block-&<code>#62</code> mem;
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
     *       GList *next = l-&<code>#62</code> next;
     *       FreeListBlock *block = l-&<code>#62</code> data;
     *       if (block-&<code>#62</code> depth &<code>#62</code>  depth)
     *         {
     *           g_free (block-&<code>#62</code> mem);
     *           g_free (block);
     *           free_list = g_list_delete_link (free_list, l);
     *         }
     *               
     *       l = next;
     *     }
     *   }
     * ]}|
     * 
     * There is a temptation to use g_main_depth() to solve
     * problems with reentrancy. For instance, while waiting for data
     * to be received from the network in response to a menu item,
     * the menu item might be selected again. It might seem that
     * one could make the menu item&<code>#39</code> s callback return immediately
     * and do nothing if g_main_depth() returns a value greater than 1.
     * However, this should be avoided since the user then sees selecting
     * the menu item do nothing. Furthermore, you&<code>#39</code> ll find yourself adding
     * these checks all over your code, since there are doubtless many,
     * many things that the user could do. Instead, you can use the
     * following techniques:
     * 
     * 1. Use gtk_widget_set_sensitive() or modal dialogs to prevent
     *    the user from interacting with elements while the main
     *    loop is recursing.
     * 
     * 2. Avoid main loop recursion in situations where you can&<code>#39</code> t handle
     *    arbitrary  callbacks. Instead, structure your code so that you
     *    simply return to the main loop and then get called again when
     *    there is more work to do.
     */
    public static int mainDepth() {
        var RESULT = gtk_h.g_main_depth();
        return RESULT;
    }
    
    /**
     * Allocates @n_bytes bytes of memory.
     * If @n_bytes is 0 it returns <code>null</code>
     */
    public static jdk.incubator.foreign.MemoryAddress malloc(long nBytes) {
        var RESULT = gtk_h.g_malloc(nBytes);
        return RESULT;
    }
    
    /**
     * Allocates @n_bytes bytes of memory, initialized to 0&<code>#39</code> s.
     * If @n_bytes is 0 it returns <code>null</code>
     */
    public static jdk.incubator.foreign.MemoryAddress malloc0(long nBytes) {
        var RESULT = gtk_h.g_malloc0(nBytes);
        return RESULT;
    }
    
    /**
     * This function is similar to g_malloc0(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static jdk.incubator.foreign.MemoryAddress malloc0N(long nBlocks, long nBlockBytes) {
        var RESULT = gtk_h.g_malloc0_n(nBlocks, nBlockBytes);
        return RESULT;
    }
    
    /**
     * This function is similar to g_malloc(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static jdk.incubator.foreign.MemoryAddress mallocN(long nBlocks, long nBlockBytes) {
        var RESULT = gtk_h.g_malloc_n(nBlocks, nBlockBytes);
        return RESULT;
    }
    
    public static Quark markupErrorQuark() {
        var RESULT = gtk_h.g_markup_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Escapes text so that the markup parser will parse it verbatim.
     * Less than, greater than, ampersand, etc. are replaced with the
     * corresponding entities. This function would typically be used
     * when writing out a file to be parsed with the markup parser.
     * 
     * Note that this function doesn&<code>#39</code> t protect whitespace and line endings
     * from being processed according to the XML rules for normalization
     * of line endings and attribute values.
     * 
     * Note also that this function will produce character references in
     * the range of &<code>#38</code> <code>#x1</code>  ... &<code>#38</code> <code>#x1f</code>  for all control sequences
     * except for tabstop, newline and carriage return.  The character
     * references in this range are not valid XML 1.0, but they are
     * valid XML 1.1 and will be accepted by the GMarkup parser.
     */
    public static java.lang.String markupEscapeText(java.lang.String text, long length) {
        var RESULT = gtk_h.g_markup_escape_text(Interop.allocateNativeString(text).handle(), length);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Formats the data in @args according to @format, escaping
     * all string and character arguments in the fashion
     * of g_markup_escape_text(). See g_markup_printf_escaped().
     */
    public static java.lang.String markupVprintfEscaped(java.lang.String format, VaList args) {
        var RESULT = gtk_h.g_markup_vprintf_escaped(Interop.allocateNativeString(format).handle(), args);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Allocates @byte_size bytes of memory, and copies @byte_size bytes into it
     * from @mem. If @mem is <code>null</code> it returns <code>null</code> 
     * 
     * This replaces g_memdup(), which was prone to integer overflows when
     * converting the argument from a <code>#gsize</code> to a <code>#guint</code>
     */
    public static jdk.incubator.foreign.MemoryAddress memdup2(jdk.incubator.foreign.MemoryAddress mem, long byteSize) {
        var RESULT = gtk_h.g_memdup2(mem, byteSize);
        return RESULT;
    }
    
    /**
     * Create a directory if it doesn&<code>#39</code> t already exist. Create intermediate
     * parent directories as needed, too.
     */
    public static int mkdirWithParents(java.lang.String pathname, int mode) {
        var RESULT = gtk_h.g_mkdir_with_parents(Interop.allocateNativeString(pathname).handle(), mode);
        return RESULT;
    }
    
    /**
     * Creates a temporary directory. See the mkdtemp() documentation
     * on most UNIX-like systems.
     * 
     * The parameter is a string that should follow the rules for
     * mkdtemp() templates, i.e. contain the string &<code>#34</code> XXXXXX&<code>#34</code> .
     * g_mkdtemp() is slightly more flexible than mkdtemp() in that the
     * sequence does not have to occur at the very end of the template.
     * The X string will be modified to form the name of a directory that
     * didn&<code>#39</code> t exist.
     * The string should be in the GLib file name encoding. Most importantly,
     * on Windows it should be in UTF-8.
     * 
     * If you are going to be creating a temporary directory inside the
     * directory returned by g_get_tmp_dir(), you might want to use
     * g_dir_make_tmp() instead.
     */
    public static java.lang.String mkdtemp(java.lang.String tmpl) {
        var RESULT = gtk_h.g_mkdtemp(Interop.allocateNativeString(tmpl).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a temporary directory. See the mkdtemp() documentation
     * on most UNIX-like systems.
     * 
     * The parameter is a string that should follow the rules for
     * mkdtemp() templates, i.e. contain the string &<code>#34</code> XXXXXX&<code>#34</code> .
     * g_mkdtemp_full() is slightly more flexible than mkdtemp() in that the
     * sequence does not have to occur at the very end of the template
     * and you can pass a @mode. The X string will be modified to form
     * the name of a directory that didn&<code>#39</code> t exist. The string should be
     * in the GLib file name encoding. Most importantly, on Windows it
     * should be in UTF-8.
     * 
     * If you are going to be creating a temporary directory inside the
     * directory returned by g_get_tmp_dir(), you might want to use
     * g_dir_make_tmp() instead.
     */
    public static java.lang.String mkdtempFull(java.lang.String tmpl, int mode) {
        var RESULT = gtk_h.g_mkdtemp_full(Interop.allocateNativeString(tmpl).handle(), mode);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Opens a temporary file. See the mkstemp() documentation
     * on most UNIX-like systems.
     * 
     * The parameter is a string that should follow the rules for
     * mkstemp() templates, i.e. contain the string &<code>#34</code> XXXXXX&<code>#34</code> .
     * g_mkstemp() is slightly more flexible than mkstemp() in that the
     * sequence does not have to occur at the very end of the template.
     * The X string will be modified to form the name of a file that
     * didn&<code>#39</code> t exist. The string should be in the GLib file name encoding.
     * Most importantly, on Windows it should be in UTF-8.
     */
    public static int mkstemp(java.lang.String tmpl) {
        var RESULT = gtk_h.g_mkstemp(Interop.allocateNativeString(tmpl).handle());
        return RESULT;
    }
    
    /**
     * Opens a temporary file. See the mkstemp() documentation
     * on most UNIX-like systems.
     * 
     * The parameter is a string that should follow the rules for
     * mkstemp() templates, i.e. contain the string &<code>#34</code> XXXXXX&<code>#34</code> .
     * g_mkstemp_full() is slightly more flexible than mkstemp()
     * in that the sequence does not have to occur at the very end of the
     * template and you can pass a @mode and additional @flags. The X
     * string will be modified to form the name of a file that didn&<code>#39</code> t exist.
     * The string should be in the GLib file name encoding. Most importantly,
     * on Windows it should be in UTF-8.
     */
    public static int mkstempFull(java.lang.String tmpl, int flags, int mode) {
        var RESULT = gtk_h.g_mkstemp_full(Interop.allocateNativeString(tmpl).handle(), flags, mode);
        return RESULT;
    }
    
    /**
     * Set the pointer at the specified location to <code>null</code>
     */
    public static void nullifyPointer(jdk.incubator.foreign.MemoryAddress nullifyLocation) {
        gtk_h.g_nullify_pointer(nullifyLocation);
    }
    
    public static Quark numberParserErrorQuark() {
        var RESULT = gtk_h.g_number_parser_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Prompts the user with<code>{@link [E]}xit, {@link [H]}alt, show {@link [S]}tack trace or {@link [P]}roceed</code>.
     * This function is intended to be used for debugging use only.
     * The following example shows how it can be used together with
     * the g_log() functions.
     * <p>
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * <code>#include</code> &<code>#60</code> glib.h&<code>#62</code> 
     * <p>
     * static void
     * log_handler (const gchar   *log_domain,
     *              GLogLevelFlags log_level,
     *              const gchar   *message,
     *              gpointer       user_data)
     * {
     *   g_log_default_handler (log_domain, log_level, message, user_data);
     * <p>
     *   g_on_error_query (MY_PROGRAM_NAME);
     * }
     * <p>
     * int
     * main (int argc, char *argv[]})
     * {
     *   g_log_set_handler (MY_LOG_DOMAIN,
     *                      G_LOG_LEVEL_WARNING |
     *                      G_LOG_LEVEL_ERROR |
     *                      G_LOG_LEVEL_CRITICAL,
     *                      log_handler,
     *                      NULL);
     *   ...
     * ]|
     * <p>
     * If &<code>#34</code> {@link [E]}xit&<code>#34</code>  is selected, the application terminates with a call
     * to _exit(0).
     * <p>
     * If &<code>#34</code> {@link [S]}tack&<code>#34</code>  trace is selected, g_on_error_stack_trace() is called.
     * This invokes gdb, which attaches to the current process and shows
     * a stack trace. The prompt is then shown again.
     * <p>
     * If &<code>#34</code> {@link [P]}roceed&<code>#34</code>  is selected, the function returns.
     * <p>
     * This function may cause different actions on non-UNIX platforms.
     * <p>
     * On Windows consider using the <code>G_DEBUGGER</code> environment
     * variable (see {@link [Running GLib Applications]}(glib-running.html)) and
     * calling g_on_error_stack_trace() instead.
     */
    public static void onErrorQuery(java.lang.String prgName) {
        gtk_h.g_on_error_query(Interop.allocateNativeString(prgName).handle());
    }
    
    /**
     * Invokes gdb, which attaches to the current process and shows a
     * stack trace. Called by g_on_error_query() when the &<code>#34</code> {@link [S]}tack trace&<code>#34</code> 
     * option is selected. You can get the current process&<code>#39</code> s program name
     * with g_get_prgname(), assuming that you have called gtk_init() or
     * gdk_init().
     * <p>
     * This function may cause different actions on non-UNIX platforms.
     * <p>
     * When running on Windows, this function is *not* called by
     * g_on_error_query(). If called directly, it will raise an
     * exception, which will crash the program. If the <code>G_DEBUGGER</code> environment
     * variable is set, a debugger will be invoked to attach and
     * handle that exception (see {@link [Running GLib Applications]}(glib-running.html)).
     */
    public static void onErrorStackTrace(java.lang.String prgName) {
        gtk_h.g_on_error_stack_trace(Interop.allocateNativeString(prgName).handle());
    }
    
    /**
     * Function to be called when starting a critical initialization
     * section. The argument @location must point to a static
     * 0-initialized variable that will be set to a value other than 0 at
     * the end of the initialization section. In combination with
     * g_once_init_leave() and the unique address @value_location, it can
     * be ensured that an initialization section will be executed only once
     * during a program&<code>#39</code> s life time, and that concurrent threads are
     * blocked until initialization completed. To be used in constructs
     * like this:
     * <p>
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   static gsize initialization_value = 0;
     * <p>
     *   if (g_once_init_enter (&<code>#38</code> initialization_value))
     *     {
     *       gsize setup_value = 42; // initialization code here
     * <p>
     *       g_once_init_leave (&<code>#38</code> initialization_value, setup_value);
     *     }
     * <p>
     *   // use initialization_value here
     * ]}|
     * <p>
     * While @location has a <code>volatile</code> qualifier, this is a historical artifact and
     * the pointer passed to it should not be <code>volatile</code>.
     */
    public static boolean onceInitEnter(jdk.incubator.foreign.MemoryAddress location) {
        var RESULT = gtk_h.g_once_init_enter(location);
        return (RESULT != 0);
    }
    
    /**
     * Counterpart to g_once_init_enter(). Expects a location of a static
     * 0-initialized initialization variable, and an initialization value
     * other than 0. Sets the variable to the initialization value, and
     * releases concurrent threads blocking in g_once_init_enter() on this
     * initialization variable.
     * <p>
     * While @location has a <code>volatile</code> qualifier, this is a historical artifact and
     * the pointer passed to it should not be <code>volatile</code>.
     */
    public static void onceInitLeave(jdk.incubator.foreign.MemoryAddress location, long result) {
        gtk_h.g_once_init_leave(location, result);
    }
    
    public static Quark optionErrorQuark() {
        var RESULT = gtk_h.g_option_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Parses a string containing debugging options
     * into a <code>guint</code> containing bit flags. This is used
     * within GDK and GTK+ to parse the debug options passed on the
     * command line or through environment variables.
     * 
     * If @string is equal to &<code>#34</code> all&<code>#34</code> , all flags are set. Any flags
     * specified along with &<code>#34</code> all&<code>#34</code>  in @string are inverted; thus,
     * &<code>#34</code> all,foo,bar&<code>#34</code>  or &<code>#34</code> foo,bar,all&<code>#34</code>  sets all flags except those
     * corresponding to &<code>#34</code> foo&<code>#34</code>  and &<code>#34</code> bar&<code>#34</code> .
     * 
     * If @string is equal to &<code>#34</code> help&<code>#34</code> , all the available keys in @keys
     * are printed out to standard error.
     */
    public static int parseDebugString(java.lang.String string, DebugKey[] keys, int nkeys) {
        var RESULT = gtk_h.g_parse_debug_string(Interop.allocateNativeString(string).handle(), Interop.allocateNativeArray(keys).handle(), nkeys);
        return RESULT;
    }
    
    /**
     * Gets the last component of the filename.
     * 
     * If @file_name ends with a directory separator it gets the component
     * before the last slash. If @file_name consists only of directory
     * separators (and on Windows, possibly a drive letter), a single
     * separator is returned. If @file_name is empty, it gets &<code>#34</code> .&<code>#34</code> .
     */
    public static java.lang.String pathGetBasename(java.lang.String fileName) {
        var RESULT = gtk_h.g_path_get_basename(Interop.allocateNativeString(fileName).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the directory components of a file name. For example, the directory
     * component of <code>/usr/bin/test</code> is <code>/usr/bin</code>. The directory component of <code>/</code>
     * is <code>/</code>.
     * 
     * If the file name has no directory components &<code>#34</code> .&<code>#34</code>  is returned.
     * The returned string should be freed when no longer needed.
     */
    public static java.lang.String pathGetDirname(java.lang.String fileName) {
        var RESULT = gtk_h.g_path_get_dirname(Interop.allocateNativeString(fileName).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns <code>true</code> if the given @file_name is an absolute file name.
     * Note that this is a somewhat vague concept on Windows.
     * 
     * On POSIX systems, an absolute file name is well-defined. It always
     * starts from the single root directory. For example &<code>#34</code> /usr/local&<code>#34</code> .
     * 
     * On Windows, the concepts of current drive and drive-specific
     * current directory introduce vagueness. This function interprets as
     * an absolute file name one that either begins with a directory
     * separator such as &<code>#34</code> \\Users\\tml&<code>#34</code>  or begins with the root on a drive,
     * for example &<code>#34</code> C:\\Windows&<code>#34</code> . The first case also includes UNC paths
     * such as &<code>#34</code> \\\\\\\\myserver\\docs\\foo&<code>#34</code> . In all cases, either slashes or
     * backslashes are accepted.
     * 
     * Note that a file name relative to the current drive root does not
     * truly specify a file uniquely over time and across processes, as
     * the current drive is a per-process value and can be changed.
     * 
     * File names relative the current directory on some specific drive,
     * such as &<code>#34</code> D:foo/bar&<code>#34</code> , are not interpreted as absolute by this
     * function, but they obviously are not relative to the normal current
     * directory as returned by getcwd() or g_get_current_dir()
     * either. Such paths should be avoided, or need to be handled using
     * Windows-specific code.
     */
    public static boolean pathIsAbsolute(java.lang.String fileName) {
        var RESULT = gtk_h.g_path_is_absolute(Interop.allocateNativeString(fileName).handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns a pointer into @file_name after the root component,
     * i.e. after the &<code>#34</code> /&<code>#34</code>  in UNIX or &<code>#34</code> C:\\&<code>#34</code>  under Windows. If @file_name
     * is not an absolute path it returns <code>null</code>
     */
    public static java.lang.String pathSkipRoot(java.lang.String fileName) {
        var RESULT = gtk_h.g_path_skip_root(Interop.allocateNativeString(fileName).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Matches a string against a pattern given as a string. If this
     * function is to be called in a loop, it&<code>#39</code> s more efficient to compile
     * the pattern once with g_pattern_spec_new() and call
     * g_pattern_match_string() repeatedly.
     */
    public static boolean patternMatchSimple(java.lang.String pattern, java.lang.String string) {
        var RESULT = gtk_h.g_pattern_match_simple(Interop.allocateNativeString(pattern).handle(), Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * This is equivalent to g_bit_lock, but working on pointers (or other
     * pointer-sized values).
     * <p>
     * For portability reasons, you may only lock on the bottom 32 bits of
     * the pointer.
     * <p>
     * While @address has a <code>volatile</code> qualifier, this is a historical
     * artifact and the argument passed to it should not be <code>volatile</code>.
     */
    public static void pointerBitLock(jdk.incubator.foreign.MemoryAddress address, int lockBit) {
        gtk_h.g_pointer_bit_lock(address, lockBit);
    }
    
    /**
     * This is equivalent to g_bit_trylock(), but working on pointers (or
     * other pointer-sized values).
     * <p>
     * For portability reasons, you may only lock on the bottom 32 bits of
     * the pointer.
     * <p>
     * While @address has a <code>volatile</code> qualifier, this is a historical
     * artifact and the argument passed to it should not be <code>volatile</code>.
     */
    public static boolean pointerBitTrylock(jdk.incubator.foreign.MemoryAddress address, int lockBit) {
        var RESULT = gtk_h.g_pointer_bit_trylock(address, lockBit);
        return (RESULT != 0);
    }
    
    /**
     * This is equivalent to g_bit_unlock, but working on pointers (or other
     * pointer-sized values).
     * <p>
     * For portability reasons, you may only lock on the bottom 32 bits of
     * the pointer.
     * <p>
     * While @address has a <code>volatile</code> qualifier, this is a historical
     * artifact and the argument passed to it should not be <code>volatile</code>.
     */
    public static void pointerBitUnlock(jdk.incubator.foreign.MemoryAddress address, int lockBit) {
        gtk_h.g_pointer_bit_unlock(address, lockBit);
    }
    
    /**
     * Polls @fds, as with the poll() system call, but portably. (On
     * systems that don&<code>#39</code> t have poll(), it is emulated using select().)
     * This is used internally by {@link org.gtk.glib.MainContext}  but it can be called
     * directly if you need to block until a file descriptor is ready, but
     * don&<code>#39</code> t want to run the full main loop.
     * 
     * Each element of @fds is a {@link org.gtk.glib.PollFD} describing a single file
     * descriptor to poll. The @fd field indicates the file descriptor,
     * and the @events field indicates the events to poll for. On return,
     * the @revents fields will be filled with the events that actually
     * occurred.
     * 
     * On POSIX systems, the file descriptors in @fds can be any sort of
     * file descriptor, but the situation is much more complicated on
     * Windows. If you need to use g_poll() in code that has to run on
     * Windows, the easiest solution is to construct all of your
     * <code>#GPollFDs</code> with g_io_channel_win32_make_pollfd().
     */
    public static int poll(PollFD fds, int nfds, int timeout) {
        var RESULT = gtk_h.g_poll(fds.handle(), nfds, timeout);
        return RESULT;
    }
    
    /**
     * Prefixes @prefix to an existing error message. If @err or *@err is
     * <code>null</code> (i.e.: no error variable) then do nothing.
     */
    public static void prefixErrorLiteral(Error[] err, java.lang.String prefix) {
        gtk_h.g_prefix_error_literal(Interop.allocateNativeArray(err).handle(), Interop.allocateNativeString(prefix).handle());
    }
    
    /**
     * Calculates the maximum space needed to store the output
     * of the sprintf() function.
     */
    public static long printfStringUpperBound(java.lang.String format, VaList args) {
        var RESULT = gtk_h.g_printf_string_upper_bound(Interop.allocateNativeString(format).handle(), args);
        return RESULT;
    }
    
    /**
     * If @dest is <code>null</code>  free @src; otherwise, moves @src into *@dest.
     * The error variable @dest points to must be <code>null</code> 
     * 
     * @src must be non-<code>null</code> 
     * 
     * Note that @src is no longer valid after this call. If you want
     * to keep using the same GError*, you need to set it to <code>null</code> after calling this function on it.
     */
    public static void propagateError(Error[] dest, Error src) {
        gtk_h.g_propagate_error(Interop.allocateNativeArray(dest).handle(), src.handle());
    }
    
    /**
     * This is just like the standard C qsort() function, but
     * the comparison routine accepts a user data argument.
     * 
     * This is guaranteed to be a stable sort since version 2.32.
     */
    public static void qsortWithData(jdk.incubator.foreign.MemoryAddress pbase, int totalElems, long size, CompareDataFunc compareFunc) {
        try {
            gtk_h.g_qsort_with_data(pbase, totalElems, size, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(compareFunc.hashCode(), compareFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the {@link org.gtk.glib.Quark} identifying the given (static) string. If the
     * string does not currently have an associated {@link org.gtk.glib.Quark}  a new {@link org.gtk.glib.Quark} is created, linked to the given string.
     * 
     * Note that this function is identical to g_quark_from_string() except
     * that if a new {@link org.gtk.glib.Quark} is created the string itself is used rather
     * than a copy. This saves memory, but can only be used if the string
     * will continue to exist until the program terminates. It can be used
     * with statically allocated strings in the main program, but not with
     * statically allocated memory in dynamically loaded modules, if you
     * expect to ever unload the module again (e.g. do not use this
     * function in GTK+ theme engines).
     * 
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     */
    public static Quark quarkFromStaticString(java.lang.String string) {
        var RESULT = gtk_h.g_quark_from_static_string(Interop.allocateNativeString(string).handle());
        return new Quark(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.glib.Quark} identifying the given string. If the string does
     * not currently have an associated {@link org.gtk.glib.Quark}  a new {@link org.gtk.glib.Quark} is created,
     * using a copy of the string.
     * 
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     */
    public static Quark quarkFromString(java.lang.String string) {
        var RESULT = gtk_h.g_quark_from_string(Interop.allocateNativeString(string).handle());
        return new Quark(RESULT);
    }
    
    /**
     * Gets the string associated with the given {@link org.gtk.glib.Quark}
     */
    public static java.lang.String quarkToString(Quark quark) {
        var RESULT = gtk_h.g_quark_to_string(quark.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the {@link org.gtk.glib.Quark} associated with the given string, or 0 if string is
     * <code>null</code> or it has no associated {@link org.gtk.glib.Quark} 
     * 
     * If you want the GQuark to be created if it doesn&<code>#39</code> t already exist,
     * use g_quark_from_string() or g_quark_from_static_string().
     * 
     * This function must not be used before library constructors have finished
     * running.
     */
    public static Quark quarkTryString(java.lang.String string) {
        var RESULT = gtk_h.g_quark_try_string(Interop.allocateNativeString(string).handle());
        return new Quark(RESULT);
    }
    
    /**
     * Returns a random <code>#gdouble</code> equally distributed over the range 
     *         
     *       
     *     
     *     
     *       Returns a random <code>#gdouble</code> equally distributed over the range [0..1).
     */
    public static double randomDouble() {
        var RESULT = gtk_h.g_random_double();
        return RESULT;
    }
    
    /**
     * Returns a random <code>#gdouble</code> equally distributed over the range
     * 
     *         
     *       
     *     
     *     
     *       Returns a random <code>#gdouble</code> equally distributed over the range
     * [@begin..@end).
     */
    public static double randomDoubleRange(double begin, double end) {
        var RESULT = gtk_h.g_random_double_range(begin, end);
        return RESULT;
    }
    
    /**
     * Return a random <code>#guint32</code> equally distributed over the range
     * {@link [0..2^32-1]}.
     */
    public static int randomInt() {
        var RESULT = gtk_h.g_random_int();
        return RESULT;
    }
    
    /**
     * Returns a random <code>#gint32</code> equally distributed over the range
     * {@link [@begin..@end-1] (ref=)}.
     */
    public static int randomIntRange(int begin, int end) {
        var RESULT = gtk_h.g_random_int_range(begin, end);
        return RESULT;
    }
    
    /**
     * Sets the seed for the global random number generator, which is used
     * by the g_random_* functions, to @seed.
     */
    public static void randomSetSeed(int seed) {
        gtk_h.g_random_set_seed(seed);
    }
    
    /**
     * Acquires a reference on the data pointed by @mem_block.
     */
    public static jdk.incubator.foreign.MemoryAddress rcBoxAcquire(jdk.incubator.foreign.MemoryAddress memBlock) {
        var RESULT = gtk_h.g_rc_box_acquire(memBlock);
        return RESULT;
    }
    
    /**
     * Allocates @block_size bytes of memory, and adds reference
     * counting semantics to it.
     * 
     * The data will be freed when its reference count drops to
     * zero.
     * 
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     */
    public static jdk.incubator.foreign.MemoryAddress rcBoxAlloc(long blockSize) {
        var RESULT = gtk_h.g_rc_box_alloc(blockSize);
        return RESULT;
    }
    
    /**
     * Allocates @block_size bytes of memory, and adds reference
     * counting semantics to it.
     * 
     * The contents of the returned data is set to zero.
     * 
     * The data will be freed when its reference count drops to
     * zero.
     * 
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     */
    public static jdk.incubator.foreign.MemoryAddress rcBoxAlloc0(long blockSize) {
        var RESULT = gtk_h.g_rc_box_alloc0(blockSize);
        return RESULT;
    }
    
    /**
     * Allocates a new block of data with reference counting
     * semantics, and copies @block_size bytes of @mem_block
     * into it.
     */
    public static jdk.incubator.foreign.MemoryAddress rcBoxDup(long blockSize, jdk.incubator.foreign.MemoryAddress memBlock) {
        var RESULT = gtk_h.g_rc_box_dup(blockSize, memBlock);
        return RESULT;
    }
    
    /**
     * Retrieves the size of the reference counted data pointed by @mem_block.
     */
    public static long rcBoxGetSize(jdk.incubator.foreign.MemoryAddress memBlock) {
        var RESULT = gtk_h.g_rc_box_get_size(memBlock);
        return RESULT;
    }
    
    /**
     * Releases a reference on the data pointed by @mem_block.
     * 
     * If the reference was the last one, it will free the
     * resources allocated for @mem_block.
     */
    public static void rcBoxRelease(jdk.incubator.foreign.MemoryAddress memBlock) {
        gtk_h.g_rc_box_release(memBlock);
    }
    
    /**
     * Reallocates the memory pointed to by @mem, so that it now has space for
     * @n_bytes bytes of memory. It returns the new address of the memory, which may
     * have been moved. @mem may be <code>null</code>  in which case it&<code>#39</code> s considered to
     * have zero-length. @n_bytes may be 0, in which case <code>null</code> will be returned
     * and @mem will be freed unless it is <code>null</code>
     */
    public static jdk.incubator.foreign.MemoryAddress realloc(jdk.incubator.foreign.MemoryAddress mem, long nBytes) {
        var RESULT = gtk_h.g_realloc(mem, nBytes);
        return RESULT;
    }
    
    /**
     * This function is similar to g_realloc(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static jdk.incubator.foreign.MemoryAddress reallocN(jdk.incubator.foreign.MemoryAddress mem, long nBlocks, long nBlockBytes) {
        var RESULT = gtk_h.g_realloc_n(mem, nBlocks, nBlockBytes);
        return RESULT;
    }
    
    /**
     * Acquires a reference on a string.
     */
    public static java.lang.String refStringAcquire(java.lang.String str) {
        var RESULT = gtk_h.g_ref_string_acquire(Interop.allocateNativeString(str).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the length of @str.
     */
    public static long refStringLength(java.lang.String str) {
        var RESULT = gtk_h.g_ref_string_length(Interop.allocateNativeString(str).handle());
        return RESULT;
    }
    
    /**
     * Creates a new reference counted string and copies the contents of @str
     * into it.
     */
    public static java.lang.String refStringNew(java.lang.String str) {
        var RESULT = gtk_h.g_ref_string_new(Interop.allocateNativeString(str).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a new reference counted string and copies the content of @str
     * into it.
     * 
     * If you call this function multiple times with the same @str, or with
     * the same contents of @str, it will return a new reference, instead of
     * creating a new string.
     */
    public static java.lang.String refStringNewIntern(java.lang.String str) {
        var RESULT = gtk_h.g_ref_string_new_intern(Interop.allocateNativeString(str).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a new reference counted string and copies the contents of @str
     * into it, up to @len bytes.
     * 
     * Since this function does not stop at nul bytes, it is the caller&<code>#39</code> s
     * responsibility to ensure that @str has at least @len addressable bytes.
     */
    public static java.lang.String refStringNewLen(java.lang.String str, long len) {
        var RESULT = gtk_h.g_ref_string_new_len(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Releases a reference on a string; if it was the last reference, the
     * resources allocated by the string are freed as well.
     */
    public static void refStringRelease(java.lang.String str) {
        gtk_h.g_ref_string_release(Interop.allocateNativeString(str).handle());
    }
    
    public static Quark regexErrorQuark() {
        var RESULT = gtk_h.g_regex_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Escapes the nul characters in @string to &<code>#34</code> \\x00&<code>#34</code> .  It can be used
     * to compile a regex with embedded nul characters.
     * 
     * For completeness, @length can be -1 for a nul-terminated string.
     * In this case the output string will be of course equal to @string.
     */
    public static java.lang.String regexEscapeNul(java.lang.String string, int length) {
        var RESULT = gtk_h.g_regex_escape_nul(Interop.allocateNativeString(string).handle(), length);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Escapes the special characters used for regular expressions
     * in @string, for instance &<code>#34</code> a.b*c&<code>#34</code>  becomes &<code>#34</code> a\\.b\\*c&<code>#34</code> . This
     * function is useful to dynamically generate regular expressions.
     * 
     * @string can contain nul characters that are replaced with &<code>#34</code> \\0&<code>#34</code> ,
     * in this case remember to specify the correct length of @string
     * in @length.
     */
    public static java.lang.String regexEscapeString(java.lang.String[] string, int length) {
        var RESULT = gtk_h.g_regex_escape_string(Interop.allocateNativeArray(string).handle(), length);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Scans for a match in @string for @pattern.
     * 
     * This function is equivalent to g_regex_match() but it does not
     * require to compile the pattern with g_regex_new(), avoiding some
     * lines of code when you need just to do a match without extracting
     * substrings, capture counts, and so on.
     * 
     * If this function is to be called on the same @pattern more than
     * once, it&<code>#39</code> s more efficient to compile the pattern once with
     * g_regex_new() and then use g_regex_match().
     */
    public static boolean regexMatchSimple(java.lang.String pattern, java.lang.String string, int compileOptions, int matchOptions) {
        var RESULT = gtk_h.g_regex_match_simple(Interop.allocateNativeString(pattern).handle(), Interop.allocateNativeString(string).handle(), compileOptions, matchOptions);
        return (RESULT != 0);
    }
    
    /**
     * Resets the cache used for g_get_user_special_dir(), so
     * that the latest on-disk version is used. Call this only
     * if you just changed the data on disk yourself.
     * 
     * Due to thread safety issues this may cause leaking of strings
     * that were previously returned from g_get_user_special_dir()
     * that can&<code>#39</code> t be freed. We ensure to only leak the data for
     * the directories that actually changed value though.
     */
    public static void reloadUserSpecialDirsCache() {
        gtk_h.g_reload_user_special_dirs_cache();
    }
    
    /**
     * Internal function used to print messages from the public g_return_if_fail()
     * and g_return_val_if_fail() macros.
     */
    public static void returnIfFailWarning(java.lang.String logDomain, java.lang.String prettyFunction, java.lang.String expression) {
        gtk_h.g_return_if_fail_warning(Interop.allocateNativeString(logDomain).handle(), Interop.allocateNativeString(prettyFunction).handle(), Interop.allocateNativeString(expression).handle());
    }
    
    /**
     * A wrapper for the POSIX rmdir() function. The rmdir() function
     * deletes a directory from the filesystem.
     * 
     * See your C library manual for more details about how rmdir() works
     * on your system.
     */
    public static int rmdir(java.lang.String filename) {
        var RESULT = gtk_h.g_rmdir(Interop.allocateNativeString(filename).handle());
        return RESULT;
    }
    
    /**
     * Returns the data that @iter points to.
     */
    public static jdk.incubator.foreign.MemoryAddress sequenceGet(SequenceIter iter) {
        var RESULT = gtk_h.g_sequence_get(iter.handle());
        return RESULT;
    }
    
    /**
     * Inserts a new item just before the item pointed to by @iter.
     */
    public static SequenceIter sequenceInsertBefore(SequenceIter iter, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_insert_before(iter.handle(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Moves the item pointed to by @src to the position indicated by @dest.
     * After calling this function @dest will point to the position immediately
     * after @src. It is allowed for @src and @dest to point into different
     * sequences.
     */
    public static void sequenceMove(SequenceIter src, SequenceIter dest) {
        gtk_h.g_sequence_move(src.handle(), dest.handle());
    }
    
    /**
     * Inserts the (@begin, @end) range at the destination pointed to by @dest.
     * The @begin and @end iters must point into the same sequence. It is
     * allowed for @dest to point to a different sequence than the one pointed
     * into by @begin and @end.
     * 
     * If @dest is <code>null</code>  the range indicated by @begin and @end is
     * removed from the sequence. If @dest points to a place within
     * the (@begin, @end) range, the range does not move.
     */
    public static void sequenceMoveRange(SequenceIter dest, SequenceIter begin, SequenceIter end) {
        gtk_h.g_sequence_move_range(dest.handle(), begin.handle(), end.handle());
    }
    
    /**
     * Finds an iterator somewhere in the range (@begin, @end). This
     * iterator will be close to the middle of the range, but is not
     * guaranteed to be exactly in the middle.
     * 
     * The @begin and @end iterators must both point to the same sequence
     * and @begin must come before or be equal to @end in the sequence.
     */
    public static SequenceIter sequenceRangeGetMidpoint(SequenceIter begin, SequenceIter end) {
        var RESULT = gtk_h.g_sequence_range_get_midpoint(begin.handle(), end.handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Removes the item pointed to by @iter. It is an error to pass the
     * end iterator to this function.
     * 
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed item.
     */
    public static void sequenceRemove(SequenceIter iter) {
        gtk_h.g_sequence_remove(iter.handle());
    }
    
    /**
     * Removes all items in the (@begin, @end) range.
     * 
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed items.
     */
    public static void sequenceRemoveRange(SequenceIter begin, SequenceIter end) {
        gtk_h.g_sequence_remove_range(begin.handle(), end.handle());
    }
    
    /**
     * Changes the data for the item pointed to by @iter to be @data. If
     * the sequence has a data destroy function associated with it, that
     * function is called on the existing data that @iter pointed to.
     */
    public static void sequenceSet(SequenceIter iter, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_sequence_set(iter.handle(), data);
    }
    
    /**
     * Swaps the items pointed to by @a and @b. It is allowed for @a and @b
     * to point into difference sequences.
     */
    public static void sequenceSwap(SequenceIter a, SequenceIter b) {
        gtk_h.g_sequence_swap(a.handle(), b.handle());
    }
    
    /**
     * Sets a human-readable name for the application. This name should be
     * localized if possible, and is intended for display to the user.
     * Contrast with g_set_prgname(), which sets a non-localized name.
     * g_set_prgname() will be called automatically by gtk_init(),
     * but g_set_application_name() will not.
     * 
     * Note that for thread safety reasons, this function can only
     * be called once.
     * 
     * The application name will be used in contexts such as error messages,
     * or when displaying an application&<code>#39</code> s name in the task list.
     */
    public static void setApplicationName(java.lang.String applicationName) {
        gtk_h.g_set_application_name(Interop.allocateNativeString(applicationName).handle());
    }
    
    /**
     * Does nothing if @err is <code>null</code>  if @err is non-<code>null</code>  then *@err
     * must be <code>null</code>  A new {@link org.gtk.glib.Error} is created and assigned to *@err.
     * Unlike g_set_error(), @message is not a printf()-style format string.
     * Use this function if @message contains text you don&<code>#39</code> t have control over,
     * that could include printf() escape sequences.
     */
    public static void setErrorLiteral(Error[] err, Quark domain, int code, java.lang.String message) {
        gtk_h.g_set_error_literal(Interop.allocateNativeArray(err).handle(), domain.getValue(), code, Interop.allocateNativeString(message).handle());
    }
    
    /**
     * Sets the name of the program. This name should not be localized,
     * in contrast to g_set_application_name().
     * 
     * If you are using {@link org.gtk.gio.Application} the program name is set in
     * g_application_run(). In case of GDK or GTK+ it is set in
     * gdk_init(), which is called by gtk_init() and the
     * {@link org.gtk.gtk.Application} :startup handler. The program name is found by
     * taking the last component of @argv{@link [0]}.
     * 
     * Since GLib 2.72, this function can be called multiple times
     * and is fully thread safe. Prior to GLib 2.72, this function
     * could only be called once per process.
     */
    public static void setPrgname(java.lang.String prgname) {
        gtk_h.g_set_prgname(Interop.allocateNativeString(prgname).handle());
    }
    
    /**
     * Sets an environment variable. On UNIX, both the variable&<code>#39</code> s name and
     * value can be arbitrary byte strings, except that the variable&<code>#39</code> s name
     * cannot contain &<code>#39</code> =&<code>#39</code> . On Windows, they should be in UTF-8.
     * 
     * Note that on some systems, when variables are overwritten, the memory
     * used for the previous variables and its value isn&<code>#39</code> t reclaimed.
     * 
     * You should be mindful of the fact that environment variable handling
     * in UNIX is not thread-safe, and your program may crash if one thread
     * calls g_setenv() while another thread is calling getenv(). (And note
     * that many functions, such as gettext(), call getenv() internally.)
     * This function is only safe to use at the very start of your program,
     * before creating any other threads (or creating objects that create
     * worker threads of their own).
     * 
     * If you need to set up the environment for a child process, you can
     * use g_get_environ() to get an environment array, modify that with
     * g_environ_setenv() and g_environ_unsetenv(), and then pass that
     * array directly to execvpe(), g_spawn_async(), or the like.
     */
    public static boolean setenv(java.lang.String variable, java.lang.String value, boolean overwrite) {
        var RESULT = gtk_h.g_setenv(Interop.allocateNativeString(variable).handle(), Interop.allocateNativeString(value).handle(), overwrite ? 1 : 0);
        return (RESULT != 0);
    }
    
    public static Quark shellErrorQuark() {
        var RESULT = gtk_h.g_shell_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Quotes a string so that the shell (/bin/sh) will interpret the
     * quoted string to mean @unquoted_string.
     * 
     * If you pass a filename to the shell, for example, you should first
     * quote it with this function.
     * 
     * The return value must be freed with g_free().
     * 
     * The quoting style used is undefined (single or double quotes may be
     * used).
     */
    public static java.lang.String shellQuote(java.lang.String unquotedString) {
        var RESULT = gtk_h.g_shell_quote(Interop.allocateNativeString(unquotedString).handle());
        return RESULT.getUtf8String(0);
    }
    
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
     * g_shell_quote(). If it fails, it returns <code>null</code> and sets the
     * error.
     * <p>
     * The @quoted_string need not actually contain quoted or escaped text;
     * g_shell_unquote() simply goes through the string and unquotes/unescapes
     * anything that the shell would. Both single and double quotes are
     * handled, as are escapes including escaped newlines.
     * <p>
     * The return value must be freed with g_free().
     * <p>
     * Possible errors are in the <code>G_SHELL_ERROR</code> domain.
     * <p>
     * Shell quoting rules are a bit strange. Single quotes preserve the
     * literal string exactly. escape sequences are not allowed; not even<code>\\&<code>#39</code> </code> - if you want a <code>&<code>#39</code> </code> in the quoted text, you have to do something
     * like <code>&<code>#39</code> foo&<code>#39</code> \\&<code>#39</code> &<code>#39</code> bar&<code>#39</code> </code>. Double quotes allow <code>$</code>, <pre>, <code>&<code>#34</code> </code>, <code>\\</code>, and
     * newline to be escaped with backslash. Otherwise double quotes
     * preserve things literally.
     */
    public static java.lang.String shellUnquote(java.lang.String quotedString) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_shell_unquote(Interop.allocateNativeString(quotedString).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Allocates a block of memory from the slice allocator.
     * <p>
     * The block address handed out can be expected to be aligned
     * to at least <code>1 * sizeof (void*)</code>, though in general slices
     * are <code>2 * sizeof (void*)</code> bytes aligned; if a <code>malloc()</code>
     * fallback implementation is used instead, the alignment may
     * be reduced in a libc dependent fashion.
     * <p>
     * Note that the underlying slice allocation mechanism can
     * be changed with the {@link [<code>G_SLICE=always-malloc</code>]}{@link [G_SLICE]}
     * environment variable.
     */
    public static jdk.incubator.foreign.MemoryAddress sliceAlloc(long blockSize) {
        var RESULT = gtk_h.g_slice_alloc(blockSize);
        return RESULT;
    }
    
    /**
     * Allocates a block of memory via g_slice_alloc() and initializes
     * the returned memory to 0. Note that the underlying slice allocation
     * mechanism can be changed with the {@link [<code>G_SLICE=always-malloc</code>]}{@link [G_SLICE]}
     * environment variable.
     */
    public static jdk.incubator.foreign.MemoryAddress sliceAlloc0(long blockSize) {
        var RESULT = gtk_h.g_slice_alloc0(blockSize);
        return RESULT;
    }
    
    /**
     * Allocates a block of memory from the slice allocator
     * and copies @block_size bytes into it from @mem_block.
     * 
     * @mem_block must be non-<code>null</code> if @block_size is non-zero.
     */
    public static jdk.incubator.foreign.MemoryAddress sliceCopy(long blockSize, jdk.incubator.foreign.MemoryAddress memBlock) {
        var RESULT = gtk_h.g_slice_copy(blockSize, memBlock);
        return RESULT;
    }
    
    /**
     * Frees a block of memory.
     * <p>
     * The memory must have been allocated via g_slice_alloc() or
     * g_slice_alloc0() and the @block_size has to match the size
     * specified upon allocation. Note that the exact release behaviour
     * can be changed with the {@link [<code>G_DEBUG=gc-friendly</code>]}{@link [G_DEBUG]} environment
     * variable, also see {@link [<code>G_SLICE</code>]}{@link [G_SLICE]} for related debugging options.
     * 
     * If @mem_block is <code>null</code>  this function does nothing.
     */
    public static void sliceFree1(long blockSize, jdk.incubator.foreign.MemoryAddress memBlock) {
        gtk_h.g_slice_free1(blockSize, memBlock);
    }
    
    /**
     * Frees a linked list of memory blocks of structure type @type.
     * <p>
     * The memory blocks must be equal-sized, allocated via
     * g_slice_alloc() or g_slice_alloc0() and linked together by a
     * @next pointer (similar to {@link org.gtk.glib.SList} . The offset of the @next
     * field in each block is passed as third argument.
     * Note that the exact release behaviour can be changed with the
     * {@link [<code>G_DEBUG=gc-friendly</code>]}{@link [G_DEBUG]} environment variable, also see
     * {@link [<code>G_SLICE</code>]}{@link [G_SLICE]} for related debugging options.
     * 
     * If @mem_chain is <code>null</code>  this function does nothing.
     */
    public static void sliceFreeChainWithOffset(long blockSize, jdk.incubator.foreign.MemoryAddress memChain, long nextOffset) {
        gtk_h.g_slice_free_chain_with_offset(blockSize, memChain, nextOffset);
    }
    
    public static long sliceGetConfig(SliceConfig ckey) {
        var RESULT = gtk_h.g_slice_get_config(ckey.getValue());
        return RESULT;
    }
    
    public static void sliceSetConfig(SliceConfig ckey, long value) {
        gtk_h.g_slice_set_config(ckey.getValue(), value);
    }
    
    /**
     * Removes the source with the given ID from the default main context. You must
     * use g_source_destroy() for sources added to a non-default main context.
     * 
     * The ID of a {@link org.gtk.glib.Source} is given by g_source_get_id(), or will be
     * returned by the functions g_source_attach(), g_idle_add(),
     * g_idle_add_full(), g_timeout_add(), g_timeout_add_full(),
     * g_child_watch_add(), g_child_watch_add_full(), g_io_add_watch(), and
     * g_io_add_watch_full().
     * 
     * It is a programmer error to attempt to remove a non-existent source.
     * 
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
        var RESULT = gtk_h.g_source_remove(tag);
        return (RESULT != 0);
    }
    
    /**
     * Removes a source from the default main loop context given the
     * source functions and user data. If multiple sources exist with the
     * same source functions and user data, only one will be destroyed.
     */
    public static boolean sourceRemoveByFuncsUserData(SourceFuncs funcs, jdk.incubator.foreign.MemoryAddress userData) {
        var RESULT = gtk_h.g_source_remove_by_funcs_user_data(funcs.handle(), userData);
        return (RESULT != 0);
    }
    
    /**
     * Removes a source from the default main loop context given the user
     * data for the callback. If multiple sources exist with the same user
     * data, only one will be destroyed.
     */
    public static boolean sourceRemoveByUserData(jdk.incubator.foreign.MemoryAddress userData) {
        var RESULT = gtk_h.g_source_remove_by_user_data(userData);
        return (RESULT != 0);
    }
    
    /**
     * Sets the name of a source using its ID.
     * 
     * This is a convenience utility to set source names from the return
     * value of g_idle_add(), g_timeout_add(), etc.
     * 
     * It is a programmer error to attempt to set the name of a non-existent
     * source.
     * 
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
        gtk_h.g_source_set_name_by_id(tag, Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Gets the smallest prime number from a built-in array of primes which
     * is larger than @num. This is used within GLib to calculate the optimum
     * size of a {@link org.gtk.glib.HashTable} 
     * 
     * The built-in array of primes ranges from 11 to 13845163 such that
     * each prime is approximately 1.5-2 times the previous prime.
     */
    public static int spacedPrimesClosest(int num) {
        var RESULT = gtk_h.g_spaced_primes_closest(num);
        return RESULT;
    }
    
    /**
     * Set @error if @wait_status indicates the child exited abnormally
     * (e.g. with a nonzero exit code, or via a fatal signal).
     * 
     * The g_spawn_sync() and g_child_watch_add() family of APIs return the
     * status of subprocesses encoded in a platform-specific way.
     * On Unix, this is guaranteed to be in the same format waitpid() returns,
     * and on Windows it is guaranteed to be the result of GetExitCodeProcess().
     * 
     * Prior to the introduction of this function in GLib 2.34, interpreting
     * @wait_status required use of platform-specific APIs, which is problematic
     * for software using GLib as a cross-platform layer.
     * 
     * Additionally, many programs simply want to determine whether or not
     * the child exited successfully, and either propagate a {@link org.gtk.glib.Error} or
     * print a message to standard error. In that common case, this function
     * can be used. Note that the error message in @error will contain
     * human-readable information about the wait status.
     * 
     * The @domain and @code of @error have special semantics in the case
     * where the process has an &<code>#34</code> exit code&<code>#34</code> , as opposed to being killed by
     * a signal. On Unix, this happens if WIFEXITED() would be true of
     * @wait_status. On Windows, it is always the case.
     * 
     * The special semantics are that the actual exit code will be the
     * code set in @error, and the domain will be <code>G_SPAWN_EXIT_ERROR</code> 
     * This allows you to differentiate between different exit codes.
     * 
     * If the process was terminated by some means other than an exit
     * status (for example if it was killed by a signal), the domain will be
     * <code>G_SPAWN_ERROR</code> and the code will be {@link org.gtk.glib.SpawnError<code>#FAILED</code>  
     * 
     * This function just offers convenience; you can of course also check
     * the available platform via a macro such as <code>G_OS_UNIX</code>  and use
     * WIFEXITED() and WEXITSTATUS() on @wait_status directly. Do not attempt
     * to scan or parse the error message string; it may be translated and/or
     * change in future versions of GLib.
     * 
     * Prior to version 2.70, g_spawn_check_exit_status() provides the same
     * functionality, although under a misleading name.
     */
    public static boolean spawnCheckWaitStatus(int waitStatus) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_spawn_check_wait_status(waitStatus, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * On some platforms, notably Windows, the {@link org.gtk.glib.Pid} type represents a resource
     * which must be closed to prevent resource leaking. g_spawn_close_pid()
     * is provided for this purpose. It should be used on all platforms, even
     * though it doesn&<code>#39</code> t do anything under UNIX.
     */
    public static void spawnClosePid(Pid pid) {
        gtk_h.g_spawn_close_pid(pid.getValue());
    }
    
    /**
     * A simple version of g_spawn_async() that parses a command line with
     * g_shell_parse_argv() and passes it to g_spawn_async().
     * 
     * Runs a command line in the background. Unlike g_spawn_async(), the
     * {@link org.gtk.glib.SpawnFlags<code>#SEARCH_PATH</code>  flag is enabled, other flags are not. Note
     * that {@link org.gtk.glib.SpawnFlags<code>#SEARCH_PATH</code>  can have security implications, so
     * consider using g_spawn_async() directly if appropriate. Possible
     * errors are those from g_shell_parse_argv() and g_spawn_async().
     * 
     * The same concerns on Windows apply as for g_spawn_command_line_sync().
     */
    public static boolean spawnCommandLineAsync(java.lang.String commandLine) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_spawn_command_line_async(Interop.allocateNativeString(commandLine).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    public static Quark spawnErrorQuark() {
        var RESULT = gtk_h.g_spawn_error_quark();
        return new Quark(RESULT);
    }
    
    public static Quark spawnExitErrorQuark() {
        var RESULT = gtk_h.g_spawn_exit_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Copies a nul-terminated string into the dest buffer, include the
     * trailing nul, and return a pointer to the trailing nul byte.
     * This is useful for concatenating multiple strings together
     * without having to repeatedly scan for the end.
     */
    public static java.lang.String stpcpy(java.lang.String dest, java.lang.String src) {
        var RESULT = gtk_h.g_stpcpy(Interop.allocateNativeString(dest).handle(), Interop.allocateNativeString(src).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Compares two strings for byte-by-byte equality and returns <code>true</code> if they are equal. It can be passed to g_hash_table_new() as the
     * @key_equal_func parameter, when using non-<code>null</code> strings as keys in a
     * {@link org.gtk.glib.HashTable} 
     * 
     * This function is typically used for hash table comparisons, but can be used
     * for general purpose comparisons of non-<code>null</code> strings. For a <code>null</code> safe string
     * comparison function, see g_strcmp0().
     */
    public static boolean strEqual(jdk.incubator.foreign.MemoryAddress v1, jdk.incubator.foreign.MemoryAddress v2) {
        var RESULT = gtk_h.g_str_equal(v1, v2);
        return (RESULT != 0);
    }
    
    /**
     * Looks whether the string @str begins with @prefix.
     */
    public static boolean strHasPrefix(java.lang.String str, java.lang.String prefix) {
        var RESULT = gtk_h.g_str_has_prefix(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(prefix).handle());
        return (RESULT != 0);
    }
    
    /**
     * Looks whether the string @str ends with @suffix.
     */
    public static boolean strHasSuffix(java.lang.String str, java.lang.String suffix) {
        var RESULT = gtk_h.g_str_has_suffix(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(suffix).handle());
        return (RESULT != 0);
    }
    
    /**
     * Converts a string to a hash value.
     * <p>
     * This function implements the widely used &<code>#34</code> djb&<code>#34</code>  hash apparently
     * posted by Daniel Bernstein to comp.lang.c some time ago.  The 32
     * bit unsigned hash value starts at 5381 and for each byte &<code>#39</code> c&<code>#39</code>  in
     * the string, is updated: <code>hash = hash * 33 + c</code>. This function
     * uses the signed value of each byte.
     * 
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using non-<code>null</code> strings as keys in a {@link org.gtk.glib.HashTable} 
     * 
     * Note that this function may not be a perfect fit for all use cases.
     * For example, it produces some hash collisions with strings as short
     * as 2.
     */
    public static int strHash(jdk.incubator.foreign.MemoryAddress v) {
        var RESULT = gtk_h.g_str_hash(v);
        return RESULT;
    }
    
    /**
     * Determines if a string is pure ASCII. A string is pure ASCII if it
     * contains no bytes with the high bit set.
     */
    public static boolean strIsAscii(java.lang.String str) {
        var RESULT = gtk_h.g_str_is_ascii(Interop.allocateNativeString(str).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a search conducted for @search_term should match
     * @potential_hit.
     * 
     * This function calls g_str_tokenize_and_fold() on both
     * @search_term and @potential_hit.  ASCII alternates are never taken
     * for @search_term but will be taken for @potential_hit according to
     * the value of @accept_alternates.
     * 
     * A hit occurs when each folded token in @search_term is a prefix of a
     * folded token from @potential_hit.
     * 
     * Depending on how you&<code>#39</code> re performing the search, it will typically be
     * faster to call g_str_tokenize_and_fold() on each string in
     * your corpus and build an index on the returned folded tokens, then
     * call g_str_tokenize_and_fold() on the search term and
     * perform lookups into that index.
     * 
     * As some examples, searching for &<code>#8216</code> fred&<code>#8217</code>  would match the potential hit
     * &<code>#8216</code> Smith, Fred&<code>#8217</code>  and also &<code>#8216</code> Fr&<code>#233</code> d&<code>#233</code> ric&<code>#8217</code> .  Searching for &<code>#8216</code> Fr&<code>#233</code> d&<code>#8217</code>  would match
     * &<code>#8216</code> Fr&<code>#233</code> d&<code>#233</code> ric&<code>#8217</code>  but not &<code>#8216</code> Frederic&<code>#8217</code>  (due to the one-directional nature of
     * accent matching).  Searching &<code>#8216</code> fo&<code>#8217</code>  would match &<code>#8216</code> Foo&<code>#8217</code>  and &<code>#8216</code> Bar Foo
     * Baz&<code>#8217</code> , but not &<code>#8216</code> SFO&<code>#8217</code>  (because no word has &<code>#8216</code> fo&<code>#8217</code>  as a prefix).
     */
    public static boolean strMatchString(java.lang.String searchTerm, java.lang.String potentialHit, boolean acceptAlternates) {
        var RESULT = gtk_h.g_str_match_string(Interop.allocateNativeString(searchTerm).handle(), Interop.allocateNativeString(potentialHit).handle(), acceptAlternates ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Transliterate @str to plain ASCII.
     * <p>
     * For best results, @str should be in composed normalised form.
     * <p>
     * This function performs a reasonably good set of character
     * replacements.  The particular set of replacements that is done may
     * change by version or even by runtime environment.
     * <p>
     * If the source language of @str is known, it can used to improve the
     * accuracy of the translation by passing it as @from_locale.  It should
     * be a valid POSIX locale string (of the form<code>language{@link [_territory]}{@link [.codeset]}{@link [@modifier] (ref=)}</code>).
     * <p>
     * If @from_locale is <code>null</code> then the current locale is used.
     * <p>
     * If you want to do translation for no specific locale, and you want it
     * to be done independently of the currently locale, specify <code>&<code>#34</code> C&<code>#34</code> </code> for
     * @from_locale.
     */
    public static java.lang.String strToAscii(java.lang.String str, java.lang.String fromLocale) {
        var RESULT = gtk_h.g_str_to_ascii(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(fromLocale).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * For each character in @string, if the character is not in @valid_chars,
     * replaces the character with @substitutor.
     * 
     * Modifies @string in place, and return @string itself, not a copy. The
     * return value is to allow nesting such as:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   g_ascii_strup (g_strcanon (str, &<code>#34</code> abc&<code>#34</code> , &<code>#39</code> ?&<code>#39</code> ))
     * ]}|
     * 
     * In order to modify a copy, you may use g_strdup():
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   reformatted = g_strcanon (g_strdup (const_str), &<code>#34</code> abc&<code>#34</code> , &<code>#39</code> ?&<code>#39</code> );
     *   ...
     *   g_free (reformatted);
     * ]}|
     */
    public static java.lang.String strcanon(java.lang.String string, java.lang.String validChars, byte substitutor) {
        var RESULT = gtk_h.g_strcanon(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(validChars).handle(), substitutor);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Removes trailing whitespace from a string.
     * 
     * This function doesn&<code>#39</code> t allocate or reallocate any memory;
     * it modifies @string in place. Therefore, it cannot be used
     * on statically allocated strings.
     * 
     * The pointer to @string is returned to allow the nesting of functions.
     * 
     * Also see g_strchug() and g_strstrip().
     */
    public static java.lang.String strchomp(java.lang.String string) {
        var RESULT = gtk_h.g_strchomp(Interop.allocateNativeString(string).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Removes leading whitespace from a string, by moving the rest
     * of the characters forward.
     * 
     * This function doesn&<code>#39</code> t allocate or reallocate any memory;
     * it modifies @string in place. Therefore, it cannot be used on
     * statically allocated strings.
     * 
     * The pointer to @string is returned to allow the nesting of functions.
     * 
     * Also see g_strchomp() and g_strstrip().
     */
    public static java.lang.String strchug(java.lang.String string) {
        var RESULT = gtk_h.g_strchug(Interop.allocateNativeString(string).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Compares @str1 and @str2 like strcmp(). Handles <code>null</code> gracefully by sorting it before non-<code>null</code> strings.
     * Comparing two <code>null</code> pointers returns 0.
     */
    public static int strcmp0(java.lang.String str1, java.lang.String str2) {
        var RESULT = gtk_h.g_strcmp0(Interop.allocateNativeString(str1).handle(), Interop.allocateNativeString(str2).handle());
        return RESULT;
    }
    
    /**
     * Replaces all escaped characters with their one byte equivalent.
     * 
     * This function does the reverse conversion of g_strescape().
     */
    public static java.lang.String strcompress(java.lang.String source) {
        var RESULT = gtk_h.g_strcompress(Interop.allocateNativeString(source).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts any delimiter characters in @string to @new_delimiter.
     * 
     * Any characters in @string which are found in @delimiters are
     * changed to the @new_delimiter character. Modifies @string in place,
     * and returns @string itself, not a copy.
     * 
     * The return value is to allow nesting such as:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   g_ascii_strup (g_strdelimit (str, &<code>#34</code> abc&<code>#34</code> , &<code>#39</code> ?&<code>#39</code> ))
     * ]}|
     * 
     * In order to modify a copy, you may use g_strdup():
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   reformatted = g_strdelimit (g_strdup (const_str), &<code>#34</code> abc&<code>#34</code> , &<code>#39</code> ?&<code>#39</code> );
     *   ...
     *   g_free (reformatted);
     * ]}|
     */
    public static java.lang.String strdelimit(java.lang.String string, java.lang.String delimiters, byte newDelimiter) {
        var RESULT = gtk_h.g_strdelimit(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(delimiters).handle(), newDelimiter);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Duplicates a string. If @str is <code>null</code> it returns <code>null</code> 
     * The returned string should be freed with g_free()
     * when no longer needed.
     */
    public static java.lang.String strdup(java.lang.String str) {
        var RESULT = gtk_h.g_strdup(Interop.allocateNativeString(str).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Similar to the standard C vsprintf() function but safer, since it
     * calculates the maximum space required and allocates memory to hold
     * the result. The returned string should be freed with g_free() when
     * no longer needed.
     * <p>
     * The returned string is guaranteed to be non-NULL, unless @format
     * contains <code><code>lc</code> /code> or <code><code>ls</code> /code> conversions, which can fail if no multibyte
     * representation is available for the given character.
     * 
     * See also g_vasprintf(), which offers the same functionality, but
     * additionally returns the length of the allocated string.
     */
    public static java.lang.String strdupVprintf(java.lang.String format, VaList args) {
        var RESULT = gtk_h.g_strdup_vprintf(Interop.allocateNativeString(format).handle(), args);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a string corresponding to the given error code, e.g. &<code>#34</code> no
     * such process&<code>#34</code> . Unlike strerror(), this always returns a string in
     * UTF-8 encoding, and the pointer is guaranteed to remain valid for
     * the lifetime of the process.
     * 
     * Note that the string may be translated according to the current locale.
     * 
     * The value of <code>errno</code> will not be changed by this function. However, it may
     * be changed by intermediate function calls, so you should save its value
     * as soon as the call returns:
     * |{@link [
     *   int saved_errno;
     * 
     *   ret = read (blah);
     *   saved_errno = errno;
     * 
     *   g_strerror (saved_errno);
     * ]}|
     */
    public static java.lang.String strerror(int errnum) {
        var RESULT = gtk_h.g_strerror(errnum);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Escapes the special characters &<code>#39</code> \\b&<code>#39</code> , &<code>#39</code> \\f&<code>#39</code> , &<code>#39</code> \\n&<code>#39</code> , &<code>#39</code> \\r&<code>#39</code> , &<code>#39</code> \\t&<code>#39</code> , &<code>#39</code> \\v&<code>#39</code> , &<code>#39</code> \\&<code>#39</code> 
     * and &<code>#39</code> &<code>#34</code> &<code>#39</code>  in the string @source by inserting a &<code>#39</code> \\&<code>#39</code>  before
     * them. Additionally all characters in the range 0x01-0x1F (everything
     * below SPACE) and in the range 0x7F-0xFF (all non-ASCII chars) are
     * replaced with a &<code>#39</code> \\&<code>#39</code>  followed by their octal representation.
     * Characters supplied in @exceptions are not escaped.
     * 
     * g_strcompress() does the reverse conversion.
     */
    public static java.lang.String strescape(java.lang.String source, java.lang.String exceptions) {
        var RESULT = gtk_h.g_strescape(Interop.allocateNativeString(source).handle(), Interop.allocateNativeString(exceptions).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Frees a <code>null</code> terminated array of strings, as well as each
     * string it contains.
     * 
     * If @str_array is <code>null</code>  this function simply returns.
     */
    public static void strfreev(java.lang.String[] strArray) {
        gtk_h.g_strfreev(Interop.allocateNativeArray(strArray).handle());
    }
    
    /**
     * An auxiliary function for gettext() support (see Q_()).
     */
    public static java.lang.String stripContext(java.lang.String msgid, java.lang.String msgval) {
        var RESULT = gtk_h.g_strip_context(Interop.allocateNativeString(msgid).handle(), Interop.allocateNativeString(msgval).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Joins a number of strings together to form one long string, with the
     * optional @separator inserted between each of them. The returned string
     * should be freed with g_free().
     * 
     * If @str_array has no items, the return value will be an
     * empty string. If @str_array contains a single item, @separator will not
     * appear in the resulting string.
     */
    public static java.lang.String strjoinv(java.lang.String separator, java.lang.String[] strArray) {
        var RESULT = gtk_h.g_strjoinv(Interop.allocateNativeString(separator).handle(), Interop.allocateNativeArray(strArray).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Portability wrapper that calls strlcat() on systems which have it,
     * and emulates it otherwise. Appends nul-terminated @src string to @dest,
     * guaranteeing nul-termination for @dest. The total size of @dest won&<code>#39</code> t
     * exceed @dest_size.
     * 
     * At most @dest_size - 1 characters will be copied. Unlike strncat(),
     * @dest_size is the full size of dest, not the space left over. This
     * function does not allocate memory. It always nul-terminates (unless
     * @dest_size == 0 or there were no nul characters in the @dest_size
     * characters of dest to start with).
     * 
     * Caveat: this is supposedly a more secure alternative to strcat() or
     * strncat(), but for real security g_strconcat() is harder to mess up.
     */
    public static long strlcat(java.lang.String dest, java.lang.String src, long destSize) {
        var RESULT = gtk_h.g_strlcat(Interop.allocateNativeString(dest).handle(), Interop.allocateNativeString(src).handle(), destSize);
        return RESULT;
    }
    
    /**
     * Portability wrapper that calls strlcpy() on systems which have it,
     * and emulates strlcpy() otherwise. Copies @src to @dest; @dest is
     * guaranteed to be nul-terminated; @src must be nul-terminated;
     * @dest_size is the buffer size, not the number of bytes to copy.
     * 
     * At most @dest_size - 1 characters will be copied. Always nul-terminates
     * (unless @dest_size is 0). This function does not allocate memory. Unlike
     * strncpy(), this function doesn&<code>#39</code> t pad @dest (so it&<code>#39</code> s often faster). It
     * returns the size of the attempted result, strlen (src), so if
     * @retval &<code>#62</code> = @dest_size, truncation occurred.
     * 
     * Caveat: strlcpy() is supposedly more secure than strcpy() or strncpy(),
     * but if you really want to avoid screwups, g_strdup() is an even better
     * idea.
     */
    public static long strlcpy(java.lang.String dest, java.lang.String src, long destSize) {
        var RESULT = gtk_h.g_strlcpy(Interop.allocateNativeString(dest).handle(), Interop.allocateNativeString(src).handle(), destSize);
        return RESULT;
    }
    
    /**
     * Duplicates the first @n bytes of a string, returning a newly-allocated
     * buffer @n + 1 bytes long which will always be nul-terminated. If @str
     * is less than @n bytes long the buffer is padded with nuls. If @str is
     * <code>null</code> it returns <code>null</code>  The returned value should be freed when no longer
     * needed.
     * 
     * To copy a number of characters from a UTF-8 encoded string,
     * use g_utf8_strncpy() instead.
     */
    public static java.lang.String strndup(java.lang.String str, long n) {
        var RESULT = gtk_h.g_strndup(Interop.allocateNativeString(str).handle(), n);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a new string @length bytes long filled with @fill_char.
     * The returned string should be freed when no longer needed.
     */
    public static java.lang.String strnfill(long length, byte fillChar) {
        var RESULT = gtk_h.g_strnfill(length, fillChar);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Reverses all of the bytes in a string. For example,<code>g_strreverse (&<code>#34</code> abcdef&<code>#34</code> )</code> will result in &<code>#34</code> fedcba&<code>#34</code> .
     * 
     * Note that g_strreverse() doesn&<code>#39</code> t work on UTF-8 strings
     * containing multibyte characters. For that purpose, use
     * g_utf8_strreverse().
     */
    public static java.lang.String strreverse(java.lang.String string) {
        var RESULT = gtk_h.g_strreverse(Interop.allocateNativeString(string).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Searches the string @haystack for the last occurrence
     * of the string @needle.
     */
    public static java.lang.String strrstr(java.lang.String haystack, java.lang.String needle) {
        var RESULT = gtk_h.g_strrstr(Interop.allocateNativeString(haystack).handle(), Interop.allocateNativeString(needle).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Searches the string @haystack for the last occurrence
     * of the string @needle, limiting the length of the search
     * to @haystack_len.
     */
    public static java.lang.String strrstrLen(java.lang.String haystack, long haystackLen, java.lang.String needle) {
        var RESULT = gtk_h.g_strrstr_len(Interop.allocateNativeString(haystack).handle(), haystackLen, Interop.allocateNativeString(needle).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a string describing the given signal, e.g. &<code>#34</code> Segmentation fault&<code>#34</code> .
     * You should use this function in preference to strsignal(), because it
     * returns a string in UTF-8 encoding, and since not all platforms support
     * the strsignal() function.
     */
    public static java.lang.String strsignal(int signum) {
        var RESULT = gtk_h.g_strsignal(signum);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Searches the string @haystack for the first occurrence
     * of the string @needle, limiting the length of the search
     * to @haystack_len.
     */
    public static java.lang.String strstrLen(java.lang.String haystack, long haystackLen, java.lang.String needle) {
        var RESULT = gtk_h.g_strstr_len(Interop.allocateNativeString(haystack).handle(), haystackLen, Interop.allocateNativeString(needle).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a string to a <code>#gdouble</code> value.
     * It calls the standard strtod() function to handle the conversion, but
     * if the string is not completely converted it attempts the conversion
     * again with g_ascii_strtod(), and returns the best match.
     * 
     * This function should seldom be used. The normal situation when reading
     * numbers not for human consumption is to use g_ascii_strtod(). Only when
     * you know that you must expect both locale formatted and C formatted numbers
     * should you use this. Make sure that you don&<code>#39</code> t pass strings such as comma
     * separated lists of values, since the commas may be interpreted as a decimal
     * point in some locales, causing unexpected results.
     */
    public static double strtod(java.lang.String nptr, java.lang.String[] endptr) {
        var RESULT = gtk_h.g_strtod(Interop.allocateNativeString(nptr).handle(), Interop.allocateNativeArray(endptr).handle());
        return RESULT;
    }
    
    /**
     * Checks if @strv contains @str. @strv must not be <code>null</code>
     */
    public static boolean strvContains(java.lang.String strv, java.lang.String str) {
        var RESULT = gtk_h.g_strv_contains(Interop.allocateNativeString(strv).handle(), Interop.allocateNativeString(str).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @strv1 and @strv2 contain exactly the same elements in exactly the
     * same order. Elements are compared using g_str_equal(). To match independently
     * of order, sort the arrays first (using g_qsort_with_data() or similar).
     * 
     * Two empty arrays are considered equal. Neither @strv1 not @strv2 may be
     * <code>null</code>
     */
    public static boolean strvEqual(java.lang.String strv1, java.lang.String strv2) {
        var RESULT = gtk_h.g_strv_equal(Interop.allocateNativeString(strv1).handle(), Interop.allocateNativeString(strv2).handle());
        return (RESULT != 0);
    }
    
    public static org.gtk.gobject.Type strvGetType() {
        var RESULT = gtk_h.g_strv_get_type();
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Returns the length of the given <code>null</code> terminated
     * string array @str_array. @str_array must not be <code>null</code>
     */
    public static int strvLength(java.lang.String[] strArray) {
        var RESULT = gtk_h.g_strv_length(Interop.allocateNativeArray(strArray).handle());
        return RESULT;
    }
    
    /**
     * Create a new test case, similar to g_test_create_case(). However
     * the test is assumed to use no fixture, and test suites are automatically
     * created on the fly and added to the root fixture, based on the
     * slash-separated portions of @testpath. The @test_data argument
     * will be passed as first argument to @test_func.
     * <p>
     * If @testpath includes the component &<code>#34</code> subprocess&<code>#34</code>  anywhere in it,
     * the test will be skipped by default, and only run if explicitly
     * required via the <code>-p</code> command-line option or g_test_trap_subprocess().
     * <p>
     * No component of @testpath may start with a dot (<code>.</code>) if the
     * <code>G_TEST_OPTION_ISOLATE_DIRS</code> option is being used; and it is recommended to
     * do so even if it isn&<code>#8217</code> t.
     */
    public static void testAddDataFunc(java.lang.String testpath, TestDataFunc testFunc) {
        try {
            gtk_h.g_test_add_data_func(Interop.allocateNativeString(testpath).handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(testFunc.hashCode(), testFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTestDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Create a new test case, as with g_test_add_data_func(), but freeing
     * @test_data after the test run is complete.
     */
    public static void testAddDataFuncFull(java.lang.String testpath, TestDataFunc testFunc) {
        try {
            gtk_h.g_test_add_data_func_full(Interop.allocateNativeString(testpath).handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(testFunc.hashCode(), testFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTestDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void testAddVtable(java.lang.String testpath, long dataSize, TestFixtureFunc dataSetup, TestFixtureFunc dataTest, TestFixtureFunc dataTeardown) {
        try {
            gtk_h.g_test_add_vtable(Interop.allocateNativeString(testpath).handle(), dataSize, 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(dataSetup.hashCode(), dataSetup)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void testAssertExpectedMessagesInternal(java.lang.String domain, java.lang.String file, int line, java.lang.String func) {
        gtk_h.g_test_assert_expected_messages_internal(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle());
    }
    
    /**
     * This function adds a message to test reports that
     * associates a bug URI with a test case.
     * 
     * Bug URIs are constructed from a base URI set with g_test_bug_base()
     * and @bug_uri_snippet. If g_test_bug_base() has not been called, it is
     * assumed to be the empty string, so a full URI can be provided to
     * g_test_bug() instead.
     * 
     * Since GLib 2.70, the base URI is not prepended to @bug_uri_snippet if it
     * is already a valid URI.
     */
    public static void testBug(java.lang.String bugUriSnippet) {
        gtk_h.g_test_bug(Interop.allocateNativeString(bugUriSnippet).handle());
    }
    
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
     * portion to @uri_pattern, or by replacing the special string<code><code>s</code> /code> within @uri_pattern if that is present.
     * 
     * If g_test_bug_base() is not called, bug URIs are formed solely
     * from the value provided by g_test_bug().
     */
    public static void testBugBase(java.lang.String uriPattern) {
        gtk_h.g_test_bug_base(Interop.allocateNativeString(uriPattern).handle());
    }
    
    /**
     * Create a new {@link org.gtk.glib.TestCase}  named @test_name.
     * 
     * This API is fairly low level, and calling g_test_add() or g_test_add_func()
     * is preferable.
     * 
     * When this test is executed, a fixture structure of size @data_size
     * will be automatically allocated and filled with zeros. Then @data_setup is
     * called to initialize the fixture. After fixture setup, the actual test
     * function @data_test is called. Once the test run completes, the
     * fixture structure is torn down by calling @data_teardown and
     * after that the memory is automatically released by the test framework.
     * 
     * Splitting up a test run into fixture setup, test function and
     * fixture teardown is most useful if the same fixture type is used for
     * multiple tests. In this cases, g_test_create_case() will be
     * called with the same type of fixture (the @data_size argument), but varying
     * @test_name and @data_test arguments.
     */
    public static TestCase testCreateCase(java.lang.String testName, long dataSize, TestFixtureFunc dataSetup, TestFixtureFunc dataTest, TestFixtureFunc dataTeardown) {
        try {
            var RESULT = gtk_h.g_test_create_case(Interop.allocateNativeString(testName).handle(), dataSize, 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(dataSetup.hashCode(), dataSetup)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTestFixtureFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
            return new TestCase(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Create a new test suite with the name @suite_name.
     */
    public static TestSuite testCreateSuite(java.lang.String suiteName) {
        var RESULT = gtk_h.g_test_create_suite(Interop.allocateNativeString(suiteName).handle());
        return new TestSuite(References.get(RESULT, false));
    }
    
    /**
     * Indicates that a message with the given @log_domain and @log_level,
     * with text matching @pattern, is expected to be logged. When this
     * message is logged, it will not be printed, and the test case will
     * not abort.
     * 
     * This API may only be used with the old logging API (g_log() without
     * <code>G_LOG_USE_STRUCTURED</code> defined). It will not work with the structured logging
     * API. See {@link [Testing for Messages]}{@link [testing-for-messages]}.
     * 
     * Use g_test_assert_expected_messages() to assert that all
     * previously-expected messages have been seen and suppressed.
     * 
     * You can call this multiple times in a row, if multiple messages are
     * expected as a result of a single call. (The messages must appear in
     * the same order as the calls to g_test_expect_message().)
     * 
     * For example:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   // g_main_context_push_thread_default() should fail if the
     *   // context is already owned by another thread.
     *   g_test_expect_message (G_LOG_DOMAIN,
     *                          G_LOG_LEVEL_CRITICAL,
     *                          &<code>#34</code> assertion*acquired_context*failed&<code>#34</code> );
     *   g_main_context_push_thread_default (bad_context);
     *   g_test_assert_expected_messages ();
     * ]}|
     * 
     * Note that you cannot use this to test g_error() messages, since
     * g_error() intentionally never returns even if the program doesn&<code>#39</code> t
     * abort; use g_test_trap_subprocess() in this case.
     * 
     * If messages at {@link org.gtk.glib.LogLevelFlags<code>#LEVEL_DEBUG</code>  are emitted, but not explicitly
     * expected via g_test_expect_message() then they will be ignored.
     */
    public static void testExpectMessage(java.lang.String logDomain, int logLevel, java.lang.String pattern) {
        gtk_h.g_test_expect_message(Interop.allocateNativeString(logDomain).handle(), logLevel, Interop.allocateNativeString(pattern).handle());
    }
    
    /**
     * Indicates that a test failed. This function can be called
     * multiple times from the same test. You can use this function
     * if your test failed in a recoverable way.
     * 
     * Do not use this function if the failure of a test could cause
     * other tests to malfunction.
     * 
     * Calling this function will not stop the test from running, you
     * need to return from the test function yourself. So you can
     * produce additional diagnostic messages or even continue running
     * the test.
     * 
     * If not called from inside a test, this function does nothing.
     * 
     * Note that unlike g_test_skip() and g_test_incomplete(), this
     * function does not log a message alongside the test failure.
     * If details of the test failure are available, either log them with
     * g_test_message() before g_test_fail(), or use g_test_fail_printf()
     * instead.
     */
    public static void testFail() {
        gtk_h.g_test_fail();
    }
    
    /**
     * Returns whether a test has already failed. This will
     * be the case when g_test_fail(), g_test_incomplete()
     * or g_test_skip() have been called, but also if an
     * assertion has failed.
     * 
     * This can be useful to return early from a test if
     * continuing after a failed assertion might be harmful.
     * 
     * The return value of this function is only meaningful
     * if it is called from inside a test function.
     */
    public static boolean testFailed() {
        var RESULT = gtk_h.g_test_failed();
        return (RESULT != 0);
    }
    
    /**
     * Gets the pathname of the directory containing test files of the type
     * specified by @file_type.
     * 
     * This is approximately the same as calling g_test_build_filename(&<code>#34</code> .&<code>#34</code> ),
     * but you don&<code>#39</code> t need to free the return value.
     */
    public static java.lang.String testGetDir(TestFileType fileType) {
        var RESULT = gtk_h.g_test_get_dir(fileType.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the test path for the test currently being run.
     * 
     * In essence, it will be the same string passed as the first argument to
     * e.g. g_test_add() when the test was added.
     * 
     * This function returns a valid string only within a test function.
     */
    public static java.lang.String testGetPath() {
        var RESULT = gtk_h.g_test_get_path();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the toplevel test suite for the test path API.
     */
    public static TestSuite testGetRoot() {
        var RESULT = gtk_h.g_test_get_root();
        return new TestSuite(References.get(RESULT, false));
    }
    
    /**
     * Indicates that a test failed because of some incomplete
     * functionality. This function can be called multiple times
     * from the same test.
     * 
     * Calling this function will not stop the test from running, you
     * need to return from the test function yourself. So you can
     * produce additional diagnostic messages or even continue running
     * the test.
     * 
     * If not called from inside a test, this function does nothing.
     */
    public static void testIncomplete(java.lang.String msg) {
        gtk_h.g_test_incomplete(Interop.allocateNativeString(msg).handle());
    }
    
    /**
     * Installs a non-error fatal log handler which can be
     * used to decide whether log messages which are counted
     * as fatal abort the program.
     * 
     * The use case here is that you are running a test case
     * that depends on particular libraries or circumstances
     * and cannot prevent certain known critical or warning
     * messages. So you install a handler that compares the
     * domain and message to precisely not abort in such a case.
     * 
     * Note that the handler is reset at the beginning of
     * any test case, so you have to set it inside each test
     * function which needs the special behavior.
     * 
     * This handler has no effect on g_error messages.
     * 
     * This handler also has no effect on structured log messages (using
     * g_log_structured() or g_log_structured_array()). To change the fatal
     * behaviour for specific log messages, programs must install a custom log
     * writer function using g_log_set_writer_func().See
     * {@link [Using Structured Logging]}{@link [using-structured-logging]}.
     */
    public static void testLogSetFatalHandler(TestLogFatalFunc logFunc) {
        try {
            gtk_h.g_test_log_set_fatal_handler(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTestLogFatalFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(logFunc.hashCode(), logFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static java.lang.String testLogTypeName(TestLogType logType) {
        var RESULT = gtk_h.g_test_log_type_name(logType.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * This function enqueus a callback @destroy_func to be executed
     * during the next test case teardown phase. This is most useful
     * to auto destruct allocated test resources at the end of a test run.
     * Resources are released in reverse queue order, that means enqueueing
     * callback A before callback B will cause B() to be called before
     * A() during teardown.
     */
    public static void testQueueDestroy(DestroyNotify destroyFunc, jdk.incubator.foreign.MemoryAddress destroyData) {
        gtk_h.g_test_queue_destroy(
                    Interop.cbDestroyNotifySymbol(), destroyData);
    }
    
    /**
     * Enqueue a pointer to be released with g_free() during the next
     * teardown phase. This is equivalent to calling g_test_queue_destroy()
     * with a destroy callback of g_free().
     */
    public static void testQueueFree(jdk.incubator.foreign.MemoryAddress gfreePointer) {
        gtk_h.g_test_queue_free(gfreePointer);
    }
    
    /**
     * Get a reproducible random floating point number,
     * see g_test_rand_int() for details on test case random numbers.
     */
    public static double testRandDouble() {
        var RESULT = gtk_h.g_test_rand_double();
        return RESULT;
    }
    
    /**
     * Get a reproducible random floating pointer number out of a specified range,
     * see g_test_rand_int() for details on test case random numbers.
     */
    public static double testRandDoubleRange(double rangeStart, double rangeEnd) {
        var RESULT = gtk_h.g_test_rand_double_range(rangeStart, rangeEnd);
        return RESULT;
    }
    
    /**
     * Get a reproducible random integer number.
     * 
     * The random numbers generated by the g_test_rand_*() family of functions
     * change with every new test program start, unless the --seed option is
     * given when starting test programs.
     * 
     * For individual test cases however, the random number generator is
     * reseeded, to avoid dependencies between tests and to make --seed
     * effective for all test cases.
     */
    public static int testRandInt() {
        var RESULT = gtk_h.g_test_rand_int();
        return RESULT;
    }
    
    /**
     * Get a reproducible random integer number out of a specified range,
     * see g_test_rand_int() for details on test case random numbers.
     */
    public static int testRandIntRange(int begin, int end) {
        var RESULT = gtk_h.g_test_rand_int_range(begin, end);
        return RESULT;
    }
    
    /**
     * Runs all tests under the toplevel suite which can be retrieved
     * with g_test_get_root(). Similar to g_test_run_suite(), the test
     * cases to be run are filtered according to test path arguments
     * (<code>-p testpath</code> and <code>-s testpath</code>) as parsed by g_test_init().
     * g_test_run_suite() or g_test_run() may only be called once in a
     * program.
     * <p>
     * In general, the tests and sub-suites within each suite are run in
     * the order in which they are defined. However, note that prior to
     * GLib 2.36, there was a bug in the <code>g_test_add_*</code>
     * functions which caused them to create multiple suites with the same
     * name, meaning that if you created tests &<code>#34</code> /foo/simple&<code>#34</code> ,
     * &<code>#34</code> /bar/simple&<code>#34</code> , and &<code>#34</code> /foo/using-bar&<code>#34</code>  in that order, they would get
     * run in that order (since g_test_run() would run the first &<code>#34</code> /foo&<code>#34</code> 
     * suite, then the &<code>#34</code> /bar&<code>#34</code>  suite, then the second &<code>#34</code> /foo&<code>#34</code>  suite). As of
     * 2.36, this bug is fixed, and adding the tests in that order would
     * result in a running order of &<code>#34</code> /foo/simple&<code>#34</code> , &<code>#34</code> /foo/using-bar&<code>#34</code> ,
     * &<code>#34</code> /bar/simple&<code>#34</code> . If this new ordering is sub-optimal (because it puts
     * more-complicated tests before simpler ones, making it harder to
     * figure out exactly what has failed), you can fix it by changing the
     * test paths to group tests by suite in a way that will result in the
     * desired running order. Eg, &<code>#34</code> /simple/foo&<code>#34</code> , &<code>#34</code> /simple/bar&<code>#34</code> ,
     * &<code>#34</code> /complex/foo-using-bar&<code>#34</code> .
     * 
     * However, you should never make the actual result of a test depend
     * on the order that tests are run in. If you need to ensure that some
     * particular code runs before or after a given test case, use
     * g_test_add(), which lets you specify setup and teardown functions.
     * 
     * If all tests are skipped or marked as incomplete (expected failures),
     * this function will return 0 if producing TAP output, or 77 (treated
     * as &<code>#34</code> skip test&<code>#34</code>  by Automake) otherwise.
     */
    public static int testRun() {
        var RESULT = gtk_h.g_test_run();
        return RESULT;
    }
    
    /**
     * Execute the tests within @suite and all nested <code>#GTestSuites</code> 
     * The test suites to be executed are filtered according to
     * test path arguments (<code>-p testpath</code> and <code>-s testpath</code>) as parsed by
     * g_test_init(). See the g_test_run() documentation for more
     * information on the order that tests are run in.
     * 
     * g_test_run_suite() or g_test_run() may only be called once
     * in a program.
     */
    public static int testRunSuite(TestSuite suite) {
        var RESULT = gtk_h.g_test_run_suite(suite.handle());
        return RESULT;
    }
    
    /**
     * Changes the behaviour of the various <code>g_assert_*()</code> macros,
     * g_test_assert_expected_messages() and the various<code>g_test_trap_assert_*()</code> macros to not abort to program, but instead
     * call g_test_fail() and continue. (This also changes the behavior of
     * g_test_fail() so that it will not cause the test program to abort
     * after completing the failed test.)
     * 
     * Note that the g_assert_not_reached() and g_assert() macros are not
     * affected by this.
     * 
     * This function can only be called after g_test_init().
     */
    public static void testSetNonfatalAssertions() {
        gtk_h.g_test_set_nonfatal_assertions();
    }
    
    /**
     * Indicates that a test was skipped.
     * 
     * Calling this function will not stop the test from running, you
     * need to return from the test function yourself. So you can
     * produce additional diagnostic messages or even continue running
     * the test.
     * 
     * If not called from inside a test, this function does nothing.
     */
    public static void testSkip(java.lang.String msg) {
        gtk_h.g_test_skip(Interop.allocateNativeString(msg).handle());
    }
    
    /**
     * Returns <code>true</code> (after g_test_init() has been called) if the test
     * program is running under g_test_trap_subprocess().
     */
    public static boolean testSubprocess() {
        var RESULT = gtk_h.g_test_subprocess();
        return (RESULT != 0);
    }
    
    /**
     * Set the summary for a test, which describes what the test checks, and how it
     * goes about checking it. This may be included in test report output, and is
     * useful documentation for anyone reading the source code or modifying a test
     * in future. It must be a single line.
     * 
     * This should be called at the top of a test function.
     * 
     * For example:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * static void
     * test_array_sort (void)
     * {
     *   g_test_summary (&<code>#34</code> Test my_array_sort() sorts the array correctly and stably, &<code>#34</code> 
     *                   &<code>#34</code> including testing zero length and one-element arrays.&<code>#34</code> );
     * 
     *   &<code>#8230</code> 
     * }
     * ]}|
     */
    public static void testSummary(java.lang.String summary) {
        gtk_h.g_test_summary(Interop.allocateNativeString(summary).handle());
    }
    
    /**
     * Get the number of seconds since the last start of the timer with
     * g_test_timer_start().
     */
    public static double testTimerElapsed() {
        var RESULT = gtk_h.g_test_timer_elapsed();
        return RESULT;
    }
    
    /**
     * Report the last result of g_test_timer_elapsed().
     */
    public static double testTimerLast() {
        var RESULT = gtk_h.g_test_timer_last();
        return RESULT;
    }
    
    /**
     * Start a timing test. Call g_test_timer_elapsed() when the task is supposed
     * to be done. Call this function again to restart the timer.
     */
    public static void testTimerStart() {
        gtk_h.g_test_timer_start();
    }
    
    public static void testTrapAssertions(java.lang.String domain, java.lang.String file, int line, java.lang.String func, long assertionFlags, java.lang.String pattern) {
        gtk_h.g_test_trap_assertions(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), assertionFlags, Interop.allocateNativeString(pattern).handle());
    }
    
    /**
     * Check the result of the last g_test_trap_subprocess() call.
     */
    public static boolean testTrapHasPassed() {
        var RESULT = gtk_h.g_test_trap_has_passed();
        return (RESULT != 0);
    }
    
    /**
     * Check the result of the last g_test_trap_subprocess() call.
     */
    public static boolean testTrapReachedTimeout() {
        var RESULT = gtk_h.g_test_trap_reached_timeout();
        return (RESULT != 0);
    }
    
    /**
     * Respawns the test program to run only @test_path in a subprocess.
     * This can be used for a test case that might not return, or that
     * might abort.
     * <p>
     * If @test_path is <code>null</code> then the same test is re-run in a subprocess.
     * You can use g_test_subprocess() to determine whether the test is in
     * a subprocess or not.
     * <p>
     * @test_path can also be the name of the parent test, followed by
     * &<code>#34</code> <code>/subprocess/</code>&<code>#34</code>  and then a name for the specific subtest (or just
     * ending with &<code>#34</code> <code>/subprocess</code>&<code>#34</code>  if the test only has one child test);
     * tests with names of this form will automatically be skipped in the
     * parent process.
     * <p>
     * If @usec_timeout is non-0, the test subprocess is aborted and
     * considered failing if its run time exceeds it.
     * <p>
     * The subprocess behavior can be configured with the
     * {@link org.gtk.glib.TestSubprocessFlags} flags.
     * <p>
     * You can use methods such as g_test_trap_assert_passed(),
     * g_test_trap_assert_failed(), and g_test_trap_assert_stderr() to
     * check the results of the subprocess. (But note that
     * g_test_trap_assert_stdout() and g_test_trap_assert_stderr()
     * cannot be used if @test_flags specifies that the child should
     * inherit the parent stdout/stderr.)
     * <p>
     * If your <code>main ()</code> needs to behave differently in
     * the subprocess, you can call g_test_subprocess() (after calling
     * g_test_init()) to see whether you are in a subprocess.
     * <p>
     * The following example tests that calling<code>my_object_new(1000000)</code> will abort with an error
     * message.
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
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
     *     g_test_trap_assert_stderr (&<code>#34</code> *ERROR*too large*&<code>#34</code> );
     *   }
     * 
     *   int
     *   main (int argc, char **argv)
     *   {
     *     g_test_init (&<code>#38</code> argc, &<code>#38</code> argv, NULL);
     * 
     *     g_test_add_func (&<code>#34</code> /myobject/create_large_object&<code>#34</code> ,
     *                      test_create_large_object);
     *     return g_test_run ();
     *   }
     * ]}|
     */
    public static void testTrapSubprocess(java.lang.String testPath, long usecTimeout, int testFlags) {
        gtk_h.g_test_trap_subprocess(Interop.allocateNativeString(testPath).handle(), usecTimeout, testFlags);
    }
    
    public static Quark threadErrorQuark() {
        var RESULT = gtk_h.g_thread_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Terminates the current thread.
     * 
     * If another thread is waiting for us using g_thread_join() then the
     * waiting thread will be woken up and get @retval as the return value
     * of g_thread_join().
     * 
     * Calling g_thread_exit() with a parameter @retval is equivalent to
     * returning @retval from the function @func, as given to g_thread_new().
     * 
     * You must only call g_thread_exit() from a thread that you created
     * yourself with g_thread_new() or related APIs. You must not call
     * this function from a thread created with another threading library
     * or or from within a {@link org.gtk.glib.ThreadPool}
     */
    public static void threadExit(jdk.incubator.foreign.MemoryAddress retval) {
        gtk_h.g_thread_exit(retval);
    }
    
    /**
     * This function will return the maximum @interval that a
     * thread will wait in the thread pool for new tasks before
     * being stopped.
     * 
     * If this function returns 0, threads waiting in the thread
     * pool for new work are not stopped.
     */
    public static int threadPoolGetMaxIdleTime() {
        var RESULT = gtk_h.g_thread_pool_get_max_idle_time();
        return RESULT;
    }
    
    /**
     * Returns the maximal allowed number of unused threads.
     */
    public static int threadPoolGetMaxUnusedThreads() {
        var RESULT = gtk_h.g_thread_pool_get_max_unused_threads();
        return RESULT;
    }
    
    /**
     * Returns the number of currently unused threads.
     */
    public static int threadPoolGetNumUnusedThreads() {
        var RESULT = gtk_h.g_thread_pool_get_num_unused_threads();
        return RESULT;
    }
    
    /**
     * This function will set the maximum @interval that a thread
     * waiting in the pool for new tasks can be idle for before
     * being stopped. This function is similar to calling
     * g_thread_pool_stop_unused_threads() on a regular timeout,
     * except this is done on a per thread basis.
     * 
     * By setting @interval to 0, idle threads will not be stopped.
     * 
     * The default value is 15000 (15 seconds).
     */
    public static void threadPoolSetMaxIdleTime(int interval) {
        gtk_h.g_thread_pool_set_max_idle_time(interval);
    }
    
    /**
     * Sets the maximal number of unused threads to @max_threads.
     * If @max_threads is -1, no limit is imposed on the number
     * of unused threads.
     * 
     * The default value is 2.
     */
    public static void threadPoolSetMaxUnusedThreads(int maxThreads) {
        gtk_h.g_thread_pool_set_max_unused_threads(maxThreads);
    }
    
    /**
     * Stops all currently unused threads. This does not change the
     * maximal number of unused threads. This function can be used to
     * regularly stop all unused threads e.g. from g_timeout_add().
     */
    public static void threadPoolStopUnusedThreads() {
        gtk_h.g_thread_pool_stop_unused_threads();
    }
    
    /**
     * This function returns the {@link org.gtk.glib.Thread} corresponding to the
     * current thread. Note that this function does not increase
     * the reference count of the returned struct.
     * 
     * This function will return a {@link org.gtk.glib.Thread} even for threads that
     * were not created by GLib (i.e. those created by other threading
     * APIs). This may be useful for thread identification purposes
     * (i.e. comparisons) but you must not use GLib functions (such
     * as g_thread_join()) on these threads.
     */
    public static Thread threadSelf() {
        var RESULT = gtk_h.g_thread_self();
        return new Thread(References.get(RESULT, false));
    }
    
    /**
     * Causes the calling thread to voluntarily relinquish the CPU, so
     * that other threads can run.
     * 
     * This function is often used as a method to make busy wait less evil.
     */
    public static void threadYield() {
        gtk_h.g_thread_yield();
    }
    
    /**
     * Sets a function to be called at regular intervals, with the default
     * priority, <code>G_PRIORITY_DEFAULT</code> 
     * 
     * The given @function is called repeatedly until it returns <code>G_SOURCE_REMOVE</code> or <code>false</code>  at which point the timeout is automatically destroyed and the
     * function will not be called again. The first call to the function will be
     * at the end of the first @interval.
     * 
     * Note that timeout functions may be delayed, due to the processing of other
     * event sources. Thus they should not be relied on for precise timing.
     * After each call to the timeout function, the time of the next
     * timeout is recalculated based on the current time and the given interval
     * (it does not try to &<code>#39</code> catch up&<code>#39</code>  time lost in delays).
     * 
     * See {@link [memory management of sources]}{@link [mainloop-memory-management]} for details
     * on how to handle the return value and memory management of @data.
     * 
     * If you want to have a timer in the &<code>#34</code> seconds&<code>#34</code>  range and do not care
     * about the exact time of the first call of the timer, use the
     * g_timeout_add_seconds() function; this function allows for more
     * optimizations and more efficient system power usage.
     * 
     * This internally creates a main loop source using g_timeout_source_new()
     * and attaches it to the global {@link org.gtk.glib.MainContext} using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     * 
     * It is safe to call this function from any thread.
     * 
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     */
    public static int timeoutAdd(int interval, SourceFunc function) {
        try {
            var RESULT = gtk_h.g_timeout_add(interval, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets a function to be called at regular intervals, with the given
     * priority.  The function is called repeatedly until it returns
     * <code>false</code>  at which point the timeout is automatically destroyed and
     * the function will not be called again.  The @notify function is
     * called when the timeout is destroyed.  The first call to the
     * function will be at the end of the first @interval.
     * 
     * Note that timeout functions may be delayed, due to the processing of other
     * event sources. Thus they should not be relied on for precise timing.
     * After each call to the timeout function, the time of the next
     * timeout is recalculated based on the current time and the given interval
     * (it does not try to &<code>#39</code> catch up&<code>#39</code>  time lost in delays).
     * 
     * See {@link [memory management of sources]}{@link [mainloop-memory-management]} for details
     * on how to handle the return value and memory management of @data.
     * 
     * This internally creates a main loop source using g_timeout_source_new()
     * and attaches it to the global {@link org.gtk.glib.MainContext} using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     * 
     * The interval given is in terms of monotonic time, not wall clock time.
     * See g_get_monotonic_time().
     */
    public static int timeoutAddFull(int priority, int interval, SourceFunc function) {
        try {
            var RESULT = gtk_h.g_timeout_add_full(priority, interval, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets a function to be called at regular intervals with the default
     * priority, <code>G_PRIORITY_DEFAULT</code> 
     * 
     * The function is called repeatedly until it returns <code>G_SOURCE_REMOVE</code> or <code>false</code>  at which point the timeout is automatically destroyed
     * and the function will not be called again.
     * 
     * This internally creates a main loop source using
     * g_timeout_source_new_seconds() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you need
     * greater control. Also see g_timeout_add_seconds_full().
     * 
     * It is safe to call this function from any thread.
     * 
     * Note that the first call of the timer may not be precise for timeouts
     * of one second. If you need finer precision and have such a timeout,
     * you may want to use g_timeout_add() instead.
     * 
     * See {@link [memory management of sources]}{@link [mainloop-memory-management]} for details
     * on how to handle the return value and memory management of @data.
     * 
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     */
    public static int timeoutAddSeconds(int interval, SourceFunc function) {
        try {
            var RESULT = gtk_h.g_timeout_add_seconds(interval, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets a function to be called at regular intervals, with @priority.
     * 
     * The function is called repeatedly until it returns <code>G_SOURCE_REMOVE</code> or <code>false</code>  at which point the timeout is automatically destroyed and
     * the function will not be called again.
     * 
     * Unlike g_timeout_add(), this function operates at whole second granularity.
     * The initial starting point of the timer is determined by the implementation
     * and the implementation is expected to group multiple timers together so that
     * they fire all at the same time. To allow this grouping, the @interval to the
     * first timer is rounded and can deviate up to one second from the specified
     * interval. Subsequent timer iterations will generally run at the specified
     * interval.
     * 
     * Note that timeout functions may be delayed, due to the processing of other
     * event sources. Thus they should not be relied on for precise timing.
     * After each call to the timeout function, the time of the next
     * timeout is recalculated based on the current time and the given @interval
     * 
     * See {@link [memory management of sources]}{@link [mainloop-memory-management]} for details
     * on how to handle the return value and memory management of @data.
     * 
     * If you want timing more precise than whole seconds, use g_timeout_add()
     * instead.
     * 
     * The grouping of timers to fire at the same time results in a more power
     * and CPU efficient behavior so if your timer is in multiples of seconds
     * and you don&<code>#39</code> t require the first timer exactly one second from now, the
     * use of g_timeout_add_seconds() is preferred over g_timeout_add().
     * 
     * This internally creates a main loop source using
     * g_timeout_source_new_seconds() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you need
     * greater control.
     * 
     * It is safe to call this function from any thread.
     * 
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     */
    public static int timeoutAddSecondsFull(int priority, int interval, SourceFunc function) {
        try {
            var RESULT = gtk_h.g_timeout_add_seconds_full(priority, interval, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new timeout source.
     * 
     * The source will not initially be associated with any {@link org.gtk.glib.MainContext} and must be added to one with g_source_attach() before it will be
     * executed.
     * 
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     */
    public static Source timeoutSourceNew(int interval) {
        var RESULT = gtk_h.g_timeout_source_new(interval);
        return new Source(References.get(RESULT, true));
    }
    
    /**
     * Creates a new timeout source.
     * 
     * The source will not initially be associated with any {@link org.gtk.glib.MainContext} and must be added to one with g_source_attach() before it will be
     * executed.
     * 
     * The scheduling granularity/accuracy of this timeout source will be
     * in seconds.
     * 
     * The interval given is in terms of monotonic time, not wall clock time.
     * See g_get_monotonic_time().
     */
    public static Source timeoutSourceNewSeconds(int interval) {
        var RESULT = gtk_h.g_timeout_source_new_seconds(interval);
        return new Source(References.get(RESULT, true));
    }
    
    /**
     * Attempts to allocate @n_bytes, and returns <code>null</code> on failure.
     * Contrast with g_malloc(), which aborts the program on failure.
     */
    public static jdk.incubator.foreign.MemoryAddress tryMalloc(long nBytes) {
        var RESULT = gtk_h.g_try_malloc(nBytes);
        return RESULT;
    }
    
    /**
     * Attempts to allocate @n_bytes, initialized to 0&<code>#39</code> s, and returns <code>null</code> on
     * failure. Contrast with g_malloc0(), which aborts the program on failure.
     */
    public static jdk.incubator.foreign.MemoryAddress tryMalloc0(long nBytes) {
        var RESULT = gtk_h.g_try_malloc0(nBytes);
        return RESULT;
    }
    
    /**
     * This function is similar to g_try_malloc0(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static jdk.incubator.foreign.MemoryAddress tryMalloc0N(long nBlocks, long nBlockBytes) {
        var RESULT = gtk_h.g_try_malloc0_n(nBlocks, nBlockBytes);
        return RESULT;
    }
    
    /**
     * This function is similar to g_try_malloc(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static jdk.incubator.foreign.MemoryAddress tryMallocN(long nBlocks, long nBlockBytes) {
        var RESULT = gtk_h.g_try_malloc_n(nBlocks, nBlockBytes);
        return RESULT;
    }
    
    /**
     * Attempts to realloc @mem to a new size, @n_bytes, and returns <code>null</code> on failure. Contrast with g_realloc(), which aborts the program
     * on failure.
     * 
     * If @mem is <code>null</code>  behaves the same as g_try_malloc().
     */
    public static jdk.incubator.foreign.MemoryAddress tryRealloc(jdk.incubator.foreign.MemoryAddress mem, long nBytes) {
        var RESULT = gtk_h.g_try_realloc(mem, nBytes);
        return RESULT;
    }
    
    /**
     * This function is similar to g_try_realloc(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     */
    public static jdk.incubator.foreign.MemoryAddress tryReallocN(jdk.incubator.foreign.MemoryAddress mem, long nBlocks, long nBlockBytes) {
        var RESULT = gtk_h.g_try_realloc_n(mem, nBlocks, nBlockBytes);
        return RESULT;
    }
    
    /**
     * Determines the break type of @c. @c should be a Unicode character
     * (to derive a character from UTF-8 encoded text, use
     * g_utf8_get_char()). The break type is used to find word and line
     * breaks (&<code>#34</code> text boundaries&<code>#34</code> ), Pango implements the Unicode boundary
     * resolution algorithms and normally you would use a function such
     * as pango_break() instead of caring about break types yourself.
     */
    public static UnicodeBreakType unicharBreakType(int c) {
        var RESULT = gtk_h.g_unichar_break_type(c);
        return UnicodeBreakType.fromValue(RESULT);
    }
    
    /**
     * Determines the canonical combining class of a Unicode character.
     */
    public static int unicharCombiningClass(int uc) {
        var RESULT = gtk_h.g_unichar_combining_class(uc);
        return RESULT;
    }
    
    /**
     * Determines the numeric value of a character as a decimal
     * digit.
     */
    public static int unicharDigitValue(int c) {
        var RESULT = gtk_h.g_unichar_digit_value(c);
        return RESULT;
    }
    
    /**
     * Looks up the {@link org.gtk.glib.UnicodeScript} for a particular character (as defined
     * by Unicode Standard Annex \\<code>#24</code> . No check is made for @ch being a
     * valid Unicode character; if you pass in invalid character, the
     * result is undefined.
     * 
     * This function is equivalent to pango_script_for_unichar() and the
     * two are interchangeable.
     */
    public static UnicodeScript unicharGetScript(int ch) {
        var RESULT = gtk_h.g_unichar_get_script(ch);
        return UnicodeScript.fromValue(RESULT);
    }
    
    /**
     * Determines whether a character is alphanumeric.
     * Given some UTF-8 text, obtain a character value
     * with g_utf8_get_char().
     */
    public static boolean unicharIsalnum(int c) {
        var RESULT = gtk_h.g_unichar_isalnum(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a character is alphabetic (i.e. a letter).
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIsalpha(int c) {
        var RESULT = gtk_h.g_unichar_isalpha(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a character is a control character.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIscntrl(int c) {
        var RESULT = gtk_h.g_unichar_iscntrl(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines if a given character is assigned in the Unicode
     * standard.
     */
    public static boolean unicharIsdefined(int c) {
        var RESULT = gtk_h.g_unichar_isdefined(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a character is numeric (i.e. a digit).  This
     * covers ASCII 0-9 and also digits in other languages/scripts.  Given
     * some UTF-8 text, obtain a character value with g_utf8_get_char().
     */
    public static boolean unicharIsdigit(int c) {
        var RESULT = gtk_h.g_unichar_isdigit(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a character is printable and not a space
     * (returns <code>false</code> for control characters, format characters, and
     * spaces). g_unichar_isprint() is similar, but returns <code>true</code> for
     * spaces. Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIsgraph(int c) {
        var RESULT = gtk_h.g_unichar_isgraph(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a character is a lowercase letter.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIslower(int c) {
        var RESULT = gtk_h.g_unichar_islower(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a character is a mark (non-spacing mark,
     * combining mark, or enclosing mark in Unicode speak).
     * Given some UTF-8 text, obtain a character value
     * with g_utf8_get_char().
     * 
     * Note: in most cases where isalpha characters are allowed,
     * ismark characters should be allowed to as they are essential
     * for writing most European languages as well as many non-Latin
     * scripts.
     */
    public static boolean unicharIsmark(int c) {
        var RESULT = gtk_h.g_unichar_ismark(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a character is printable.
     * Unlike g_unichar_isgraph(), returns <code>true</code> for spaces.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIsprint(int c) {
        var RESULT = gtk_h.g_unichar_isprint(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a character is punctuation or a symbol.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     */
    public static boolean unicharIspunct(int c) {
        var RESULT = gtk_h.g_unichar_ispunct(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines whether a character is a space, tab, or line separator
     * (newline, carriage return, etc.).  Given some UTF-8 text, obtain a
     * character value with g_utf8_get_char().
     * 
     * (Note: don&<code>#39</code> t use this to do word breaking; you have to use
     * Pango or equivalent to get word breaking right, the algorithm
     * is fairly complex.)
     */
    public static boolean unicharIsspace(int c) {
        var RESULT = gtk_h.g_unichar_isspace(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines if a character is titlecase. Some characters in
     * Unicode which are composites, such as the DZ digraph
     * have three case variants instead of just two. The titlecase
     * form is used at the beginning of a word where only the
     * first letter is capitalized. The titlecase form of the DZ
     * digraph is U+01F2 LATIN CAPITAL LETTTER D WITH SMALL LETTER Z.
     */
    public static boolean unicharIstitle(int c) {
        var RESULT = gtk_h.g_unichar_istitle(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines if a character is uppercase.
     */
    public static boolean unicharIsupper(int c) {
        var RESULT = gtk_h.g_unichar_isupper(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines if a character is typically rendered in a double-width
     * cell.
     */
    public static boolean unicharIswide(int c) {
        var RESULT = gtk_h.g_unichar_iswide(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines if a character is typically rendered in a double-width
     * cell under legacy East Asian locales.  If a character is wide according to
     * g_unichar_iswide(), then it is also reported wide with this function, but
     * the converse is not necessarily true. See the
     * {@link [Unicode Standard Annex <code>#11</code> }(http://www.unicode.org/reports/tr11/)
     * for details.
     * 
     * If a character passes the g_unichar_iswide() test then it will also pass
     * this test, but not the other way around.  Note that some characters may
     * pass both this test and g_unichar_iszerowidth().
     */
    public static boolean unicharIswideCjk(int c) {
        var RESULT = gtk_h.g_unichar_iswide_cjk(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines if a character is a hexadecimal digit.
     */
    public static boolean unicharIsxdigit(int c) {
        var RESULT = gtk_h.g_unichar_isxdigit(c);
        return (RESULT != 0);
    }
    
    /**
     * Determines if a given character typically takes zero width when rendered.
     * The return value is <code>true</code> for all non-spacing and enclosing marks
     * (e.g., combining accents), format characters, zero-width
     * space, but not U+00AD SOFT HYPHEN.
     * 
     * A typical use of this function is with one of g_unichar_iswide() or
     * g_unichar_iswide_cjk() to determine the number of cells a string occupies
     * when displayed on a grid display (terminals).  However, note that not all
     * terminals support zero-width rendering of zero-width marks.
     */
    public static boolean unicharIszerowidth(int c) {
        var RESULT = gtk_h.g_unichar_iszerowidth(c);
        return (RESULT != 0);
    }
    
    /**
     * Converts a single character to UTF-8.
     */
    public static int unicharToUtf8(int c, java.lang.String outbuf) {
        var RESULT = gtk_h.g_unichar_to_utf8(c, Interop.allocateNativeString(outbuf).handle());
        return RESULT;
    }
    
    /**
     * Converts a character to lower case.
     */
    public static int unicharTolower(int c) {
        var RESULT = gtk_h.g_unichar_tolower(c);
        return RESULT;
    }
    
    /**
     * Converts a character to the titlecase.
     */
    public static int unicharTotitle(int c) {
        var RESULT = gtk_h.g_unichar_totitle(c);
        return RESULT;
    }
    
    /**
     * Converts a character to uppercase.
     */
    public static int unicharToupper(int c) {
        var RESULT = gtk_h.g_unichar_toupper(c);
        return RESULT;
    }
    
    /**
     * Classifies a Unicode character by type.
     */
    public static UnicodeType unicharType(int c) {
        var RESULT = gtk_h.g_unichar_type(c);
        return UnicodeType.fromValue(RESULT);
    }
    
    /**
     * Checks whether @ch is a valid Unicode character. Some possible
     * integer values of @ch will not be valid. 0 is considered a valid
     * character, though it&<code>#39</code> s normally a string terminator.
     */
    public static boolean unicharValidate(int ch) {
        var RESULT = gtk_h.g_unichar_validate(ch);
        return (RESULT != 0);
    }
    
    /**
     * Determines the numeric value of a character as a hexadecimal
     * digit.
     */
    public static int unicharXdigitValue(int c) {
        var RESULT = gtk_h.g_unichar_xdigit_value(c);
        return RESULT;
    }
    
    /**
     * Looks up the Unicode script for @iso15924.  ISO 15924 assigns four-letter
     * codes to scripts.  For example, the code for Arabic is &<code>#39</code> Arab&<code>#39</code> .
     * This function accepts four letter codes encoded as a @guint32 in a
     * big-endian fashion.  That is, the code expected for Arabic is
     * 0x41726162 (0x41 is ASCII code for &<code>#39</code> A&<code>#39</code> , 0x72 is ASCII code for &<code>#39</code> r&<code>#39</code> , etc).
     * 
     * See
     * {@link [Codes for the representation of names of scripts]}(http://unicode.org/iso15924/codelists.html)
     * for details.
     */
    public static UnicodeScript unicodeScriptFromIso15924(int iso15924) {
        var RESULT = gtk_h.g_unicode_script_from_iso15924(iso15924);
        return UnicodeScript.fromValue(RESULT);
    }
    
    /**
     * Looks up the ISO 15924 code for @script.  ISO 15924 assigns four-letter
     * codes to scripts.  For example, the code for Arabic is &<code>#39</code> Arab&<code>#39</code> .  The
     * four letter codes are encoded as a @guint32 by this function in a
     * big-endian fashion.  That is, the code returned for Arabic is
     * 0x41726162 (0x41 is ASCII code for &<code>#39</code> A&<code>#39</code> , 0x72 is ASCII code for &<code>#39</code> r&<code>#39</code> , etc).
     * 
     * See
     * {@link [Codes for the representation of names of scripts]}(http://unicode.org/iso15924/codelists.html)
     * for details.
     */
    public static int unicodeScriptToIso15924(UnicodeScript script) {
        var RESULT = gtk_h.g_unicode_script_to_iso15924(script.getValue());
        return RESULT;
    }
    
    public static Quark unixErrorQuark() {
        var RESULT = gtk_h.g_unix_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Sets a function to be called when the IO condition, as specified by
     * @condition becomes true for @fd.
     * 
     * @function will be called when the specified IO condition becomes
     * <code>true</code>   The function is expected to clear whatever event caused the
     * IO condition to become true and return <code>true</code> in order to be notified
     * when it happens again.  If @function returns <code>false</code> then the watch
     * will be cancelled.
     * 
     * The return value of this function can be passed to g_source_remove()
     * to cancel the watch at any time that it exists.
     * 
     * The source will never close the fd -- you must do it yourself.
     */
    public static int unixFdAdd(int fd, int condition, UnixFDSourceFunc function) {
        try {
            var RESULT = gtk_h.g_unix_fd_add(fd, condition, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbUnixFDSourceFunc",
                            MethodType.methodType(boolean.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets a function to be called when the IO condition, as specified by
     * @condition becomes true for @fd.
     * 
     * This is the same as g_unix_fd_add(), except that it allows you to
     * specify a non-default priority and a provide a {@link org.gtk.glib.DestroyNotify} for
     * @user_data.
     */
    public static int unixFdAddFull(int priority, int fd, int condition, UnixFDSourceFunc function) {
        try {
            var RESULT = gtk_h.g_unix_fd_add_full(priority, fd, condition, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbUnixFDSourceFunc",
                            MethodType.methodType(boolean.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a {@link org.gtk.glib.Source} to watch for a particular IO condition on a file
     * descriptor.
     * 
     * The source will never close the fd -- you must do it yourself.
     */
    public static Source unixFdSourceNew(int fd, int condition) {
        var RESULT = gtk_h.g_unix_fd_source_new(fd, condition);
        return new Source(References.get(RESULT, true));
    }
    
    /**
     * Get the <code>passwd</code> file entry for the given @user_name using <code>getpwnam_r()</code>.
     * This can fail if the given @user_name doesn&<code>#8217</code> t exist.
     * <p>
     * The returned <code>struct passwd</code> has been allocated using g_malloc() and should
     * be freed using g_free(). The strings referenced by the returned struct are
     * included in the same allocation, so are valid until the <code>struct passwd</code> is
     * freed.
     * <p>
     * This function is safe to call from multiple threads concurrently.
     * <p>
     * You will need to include <code>pwd.h</code> to get the definition of <code>struct passwd</code>.
     */
    public static jdk.incubator.foreign.MemoryAddress unixGetPasswdEntry(java.lang.String userName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_unix_get_passwd_entry(Interop.allocateNativeString(userName).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Control the non-blocking state of the given file descriptor,
     * according to @nonblock. On most systems this uses <code>O_NONBLOCK</code>  but
     * on some older ones may use <code>O_NDELAY</code>
     */
    public static boolean unixSetFdNonblocking(int fd, boolean nonblock) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_unix_set_fd_nonblocking(fd, nonblock ? 1 : 0, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * A convenience function for g_unix_signal_source_new(), which
     * attaches to the default {@link org.gtk.glib.MainContext}   You can remove the watch
     * using g_source_remove().
     */
    public static int unixSignalAdd(int signum, SourceFunc handler) {
        try {
            var RESULT = gtk_h.g_unix_signal_add(signum, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)));
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * A convenience function for g_unix_signal_source_new(), which
     * attaches to the default {@link org.gtk.glib.MainContext}   You can remove the watch
     * using g_source_remove().
     */
    public static int unixSignalAddFull(int priority, int signum, SourceFunc handler) {
        try {
            var RESULT = gtk_h.g_unix_signal_add_full(priority, signum, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Create a {@link org.gtk.glib.Source} that will be dispatched upon delivery of the UNIX
     * signal @signum.  In GLib versions before 2.36, only <code>SIGHUP</code>, <code>SIGINT</code>,<code>SIGTERM</code> can be monitored.  In GLib 2.36, <code>SIGUSR1</code> and <code>SIGUSR2</code>
     * were added. In GLib 2.54, <code>SIGWINCH</code> was added.
     * <p>
     * Note that unlike the UNIX default, all sources which have created a
     * watch will be dispatched, regardless of which underlying thread
     * invoked g_unix_signal_source_new().
     * <p>
     * For example, an effective use of this function is to handle <code>SIGTERM</code>
     * cleanly; flushing any outstanding files, and then calling
     * g_main_loop_quit ().  It is not safe to do any of this a regular
     * UNIX signal handler; your handler may be invoked while malloc() or
     * another library function is running, causing reentrancy if you
     * attempt to use it from the handler.  None of the GLib/GObject API
     * is safe against this kind of reentrancy.
     * 
     * The interaction of this source when combined with native UNIX
     * functions like sigprocmask() is not defined.
     * 
     * The source will not initially be associated with any {@link org.gtk.glib.MainContext} and must be added to one with g_source_attach() before it will be
     * executed.
     */
    public static Source unixSignalSourceNew(int signum) {
        var RESULT = gtk_h.g_unix_signal_source_new(signum);
        return new Source(References.get(RESULT, true));
    }
    
    /**
     * A wrapper for the POSIX unlink() function. The unlink() function
     * deletes a name from the filesystem. If this was the last link to the
     * file and no processes have it opened, the diskspace occupied by the
     * file is freed.
     * 
     * See your C library manual for more details about unlink(). Note
     * that on Windows, it is in general not possible to delete files that
     * are open to some process, or mapped into memory.
     */
    public static int unlink(java.lang.String filename) {
        var RESULT = gtk_h.g_unlink(Interop.allocateNativeString(filename).handle());
        return RESULT;
    }
    
    /**
     * Removes an environment variable from the environment.
     * 
     * Note that on some systems, when variables are overwritten, the
     * memory used for the previous variables and its value isn&<code>#39</code> t reclaimed.
     * 
     * You should be mindful of the fact that environment variable handling
     * in UNIX is not thread-safe, and your program may crash if one thread
     * calls g_unsetenv() while another thread is calling getenv(). (And note
     * that many functions, such as gettext(), call getenv() internally.) This
     * function is only safe to use at the very start of your program, before
     * creating any other threads (or creating objects that create worker
     * threads of their own).
     * 
     * If you need to set up the environment for a child process, you can
     * use g_get_environ() to get an environment array, modify that with
     * g_environ_setenv() and g_environ_unsetenv(), and then pass that
     * array directly to execvpe(), g_spawn_async(), or the like.
     */
    public static void unsetenv(java.lang.String variable) {
        gtk_h.g_unsetenv(Interop.allocateNativeString(variable).handle());
    }
    
    /**
     * Creates a new {@link org.gtk.glib.Uri} from the given components according to @flags.
     * 
     * See also g_uri_build_with_user(), which allows specifying the
     * components of the &<code>#34</code> userinfo&<code>#34</code>  separately.
     */
    public static Uri uriBuild(int flags, java.lang.String scheme, java.lang.String userinfo, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_build(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(userinfo).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return new Uri(References.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link org.gtk.glib.Uri} from the given components according to @flags
     * ({@link org.gtk.glib.UriFlags<code>#HAS_PASSWORD</code>  is added unconditionally). The @flags must be
     * coherent with the passed values, in particular use <code><code></code> /code>-encoded values with
     * {@link org.gtk.glib.UriFlags<code>#ENCODED</code>  
     * 
     * In contrast to g_uri_build(), this allows specifying the components
     * of the &<code>#8216</code> userinfo&<code>#8217</code>  field separately. Note that @user must be non-<code>null</code> if either @password or @auth_params is non-<code>null</code>
     */
    public static Uri uriBuildWithUser(int flags, java.lang.String scheme, java.lang.String user, java.lang.String password, java.lang.String authParams, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_build_with_user(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(user).handle(), Interop.allocateNativeString(password).handle(), Interop.allocateNativeString(authParams).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return new Uri(References.get(RESULT, true));
    }
    
    public static Quark uriErrorQuark() {
        var RESULT = gtk_h.g_uri_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Escapes arbitrary data for use in a URI.
     * <p>
     * Normally all characters that are not &<code>#8216</code> unreserved&<code>#8217</code>  (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in @reserved_chars_allowed
     * they are not escaped. This is useful for the &<code>#8216</code> reserved&<code>#8217</code>  characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     * <p>
     * Though technically incorrect, this will also allow escaping nul
     * bytes as <code><code></code> /code><code>00</code>.
     */
    public static java.lang.String uriEscapeBytes(byte[] unescaped, long length, java.lang.String reservedCharsAllowed) {
        var RESULT = gtk_h.g_uri_escape_bytes(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, unescaped)).handle(), length, Interop.allocateNativeString(reservedCharsAllowed).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Escapes a string for use in a URI.
     * 
     * Normally all characters that are not &<code>#34</code> unreserved&<code>#34</code>  (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in @reserved_chars_allowed
     * they are not escaped. This is useful for the &<code>#34</code> reserved&<code>#34</code>  characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     */
    public static java.lang.String uriEscapeString(java.lang.String unescaped, java.lang.String reservedCharsAllowed, boolean allowUtf8) {
        var RESULT = gtk_h.g_uri_escape_string(Interop.allocateNativeString(unescaped).handle(), Interop.allocateNativeString(reservedCharsAllowed).handle(), allowUtf8 ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses @uri_string according to @flags, to determine whether it is a valid
     * {@link [absolute URI]}{@link [relative-absolute-uris]}, i.e. it does not need to be resolved
     * relative to another URI using g_uri_parse_relative().
     * 
     * If it&<code>#8217</code> s not a valid URI, an error is returned explaining how it&<code>#8217</code> s invalid.
     * 
     * See g_uri_split(), and the definition of {@link org.gtk.glib.UriFlags}  for more
     * information on the effect of @flags.
     */
    public static boolean uriIsValid(java.lang.String uriString, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_is_valid(Interop.allocateNativeString(uriString).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Joins the given components together according to @flags to create
     * an absolute URI string. @path may not be <code>null</code> (though it may be the empty
     * string).
     * <p>
     * When @host is present, @path must either be empty or begin with a slash (<code>/</code>)
     * character. When @host is not present, @path cannot begin with two slash
     *    characters (<code>//</code>). See
     * {@link [RFC 3986, section 3]}(https://tools.ietf.org/html/rfc3986<code>#section</code> 3).
     * 
     * See also g_uri_join_with_user(), which allows specifying the
     * components of the &<code>#8216</code> userinfo&<code>#8217</code>  separately.
     * 
     * {@link org.gtk.glib.UriFlags<code>#HAS_PASSWORD</code>  and {@link org.gtk.glib.UriFlags<code>#HAS_AUTH_PARAMS</code>  are ignored if set
     * in @flags.
     */
    public static java.lang.String uriJoin(int flags, java.lang.String scheme, java.lang.String userinfo, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_join(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(userinfo).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Joins the given components together according to @flags to create
     * an absolute URI string. @path may not be <code>null</code> (though it may be the empty
     * string).
     * 
     * In contrast to g_uri_join(), this allows specifying the components
     * of the &<code>#8216</code> userinfo&<code>#8217</code>  separately. It otherwise behaves the same.
     * 
     * {@link org.gtk.glib.UriFlags<code>#HAS_PASSWORD</code>  and {@link org.gtk.glib.UriFlags<code>#HAS_AUTH_PARAMS</code>  are ignored if set
     * in @flags.
     */
    public static java.lang.String uriJoinWithUser(int flags, java.lang.String scheme, java.lang.String user, java.lang.String password, java.lang.String authParams, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_join_with_user(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(user).handle(), Interop.allocateNativeString(password).handle(), Interop.allocateNativeString(authParams).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses @uri_string according to @flags. If the result is not a
     * valid {@link [absolute URI]}{@link [relative-absolute-uris]}, it will be discarded, and an
     * error returned.
     */
    public static Uri uriParse(java.lang.String uriString, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_parse(Interop.allocateNativeString(uriString).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Uri(References.get(RESULT, true));
    }
    
    /**
     * Many URI schemes include one or more attribute/value pairs as part of the URI
     * value. This method can be used to parse them into a hash table. When an
     * attribute has multiple occurrences, the last value is the final returned
     * value. If you need to handle repeated attributes differently, use
     * {@link org.gtk.glib.UriParamsIter} 
     * <p>
     * The @params string is assumed to still be <code><code></code> /code>-encoded, but the returned
     * values will be fully decoded. (Thus it is possible that the returned values
     * may contain <code>=</code> or @separators, if the value was encoded in the input.)
     * Invalid <code><code></code> /code>-encoding is treated as with the {@link org.gtk.glib.UriFlags<code>#PARSE_RELAXED</code>  rules for g_uri_parse(). (However, if @params is the path or query string
     * from a {@link org.gtk.glib.Uri} that was parsed without {@link org.gtk.glib.UriFlags<code>#PARSE_RELAXED</code>  and
     * {@link org.gtk.glib.UriFlags<code>#ENCODED</code>   then you already know that it does not contain any
     * invalid encoding.)
     * <p>
     * {@link org.gtk.glib.UriParamsFlags<code>#WWW_FORM</code>  is handled as documented for g_uri_params_iter_init().
     * <p>
     * If {@link org.gtk.glib.UriParamsFlags<code>#CASE_INSENSITIVE</code>  is passed to @flags, attributes will be
     * compared case-insensitively, so a params string <code>attr=123&<code>#38</code> Attr=456</code> will only
     * return a single attribute&<code>#8211</code> value pair, <code>Attr=456</code>. Case will be preserved in
     * the returned attributes.
     * 
     * If @params cannot be parsed (for example, it contains two @separators
     * characters in a row), then @error is set and <code>null</code> is returned.
     */
    public static org.gtk.glib.HashTable uriParseParams(java.lang.String params, long length, java.lang.String separators, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_parse_params(Interop.allocateNativeString(params).handle(), length, Interop.allocateNativeString(separators).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.HashTable(References.get(RESULT, true));
    }
    
    /**
     * Gets the scheme portion of a URI string.
     * {@link [RFC 3986]}(https://tools.ietf.org/html/rfc3986<code>#section</code> 3) decodes the scheme
     * as:
     * |{@link [
     * URI = scheme &<code>#34</code> :&<code>#34</code>  hier-part [ &<code>#34</code> ?&<code>#34</code>  query ]} {@link [ &<code>#34</code> <code>#</code> <code>#34</code>  fragment ]}
     * ]|
     * Common schemes include <code>file</code>, <code>https</code>, <code>svn+ssh</code>, etc.
     */
    public static java.lang.String uriParseScheme(java.lang.String uri) {
        var RESULT = gtk_h.g_uri_parse_scheme(Interop.allocateNativeString(uri).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the scheme portion of a URI string.
     * {@link [RFC 3986]}(https://tools.ietf.org/html/rfc3986<code>#section</code> 3) decodes the scheme
     * as:
     * |{@link [
     * URI = scheme &<code>#34</code> :&<code>#34</code>  hier-part [ &<code>#34</code> ?&<code>#34</code>  query ]} {@link [ &<code>#34</code> <code>#</code> <code>#34</code>  fragment ]}
     * ]|
     * Common schemes include <code>file</code>, <code>https</code>, <code>svn+ssh</code>, etc.
     * 
     * Unlike g_uri_parse_scheme(), the returned scheme is normalized to
     * all-lowercase and does not need to be freed.
     */
    public static java.lang.String uriPeekScheme(java.lang.String uri) {
        var RESULT = gtk_h.g_uri_peek_scheme(Interop.allocateNativeString(uri).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses @uri_ref according to @flags and, if it is a
     * {@link [relative URI]}{@link [relative-absolute-uris]}, resolves it relative to
     * @base_uri_string. If the result is not a valid absolute URI, it will be
     * discarded, and an error returned.
     * 
     * (If @base_uri_string is <code>null</code>  this just returns @uri_ref, or
     * <code>null</code> if @uri_ref is invalid or not absolute.)
     */
    public static java.lang.String uriResolveRelative(java.lang.String baseUriString, java.lang.String uriRef, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_resolve_relative(Interop.allocateNativeString(baseUriString).handle(), Interop.allocateNativeString(uriRef).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Unescapes a segment of an escaped string as binary data.
     * 
     * Note that in contrast to g_uri_unescape_string(), this does allow
     * nul bytes to appear in the output.
     * 
     * If any of the characters in @illegal_characters appears as an escaped
     * character in @escaped_string, then that is an error and <code>null</code> will be
     * returned. This is useful if you want to avoid for instance having a slash
     * being expanded in an escaped path element, which might confuse pathname
     * handling.
     */
    public static Bytes uriUnescapeBytes(java.lang.String escapedString, long length, java.lang.String illegalCharacters) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_unescape_bytes(Interop.allocateNativeString(escapedString).handle(), length, Interop.allocateNativeString(illegalCharacters).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Unescapes a segment of an escaped string.
     * <p>
     * If any of the characters in @illegal_characters or the NUL
     * character appears as an escaped character in @escaped_string, then
     * that is an error and <code>null</code> will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     * <p>
     * Note: <code>NUL</code> byte is not accepted in the output, in contrast to
     * g_uri_unescape_bytes().
     */
    public static java.lang.String uriUnescapeSegment(java.lang.String escapedString, java.lang.String escapedStringEnd, java.lang.String illegalCharacters) {
        var RESULT = gtk_h.g_uri_unescape_segment(Interop.allocateNativeString(escapedString).handle(), Interop.allocateNativeString(escapedStringEnd).handle(), Interop.allocateNativeString(illegalCharacters).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Unescapes a whole escaped string.
     * 
     * If any of the characters in @illegal_characters or the NUL
     * character appears as an escaped character in @escaped_string, then
     * that is an error and <code>null</code> will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     */
    public static java.lang.String uriUnescapeString(java.lang.String escapedString, java.lang.String illegalCharacters) {
        var RESULT = gtk_h.g_uri_unescape_string(Interop.allocateNativeString(escapedString).handle(), Interop.allocateNativeString(illegalCharacters).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Pauses the current thread for the given number of microseconds.
     * 
     * There are 1 million microseconds per second (represented by the
     * <code>G_USEC_PER_SEC</code> macro). g_usleep() may have limited precision,
     * depending on hardware and operating system; don&<code>#39</code> t rely on the exact
     * length of the sleep.
     */
    public static void usleep(long microseconds) {
        gtk_h.g_usleep(microseconds);
    }
    
    /**
     * Converts a string into a form that is independent of case. The
     * result will not correspond to any particular case, but can be
     * compared for equality or ordered with the results of calling
     * g_utf8_casefold() on other strings.
     * 
     * Note that calling g_utf8_casefold() followed by g_utf8_collate() is
     * only an approximation to the correct linguistic case insensitive
     * ordering, though it is a fairly good one. Getting this exactly
     * right would require a more sophisticated collation function that
     * takes case sensitivity into account. GLib does not currently
     * provide such a function.
     */
    public static java.lang.String utf8Casefold(java.lang.String str, long len) {
        var RESULT = gtk_h.g_utf8_casefold(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Compares two strings for ordering using the linguistically
     * correct rules for the {@link [current locale]}{@link [setlocale]}.
     * When sorting a large number of strings, it will be significantly
     * faster to obtain collation keys with g_utf8_collate_key() and
     * compare the keys with strcmp() when sorting instead of sorting
     * the original strings.
     * 
     * If the two strings are not comparable due to being in different collation
     * sequences, the result is undefined. This can happen if the strings are in
     * different language scripts, for example.
     */
    public static int utf8Collate(java.lang.String str1, java.lang.String str2) {
        var RESULT = gtk_h.g_utf8_collate(Interop.allocateNativeString(str1).handle(), Interop.allocateNativeString(str2).handle());
        return RESULT;
    }
    
    /**
     * Converts a string into a collation key that can be compared
     * with other collation keys produced by the same function using
     * strcmp().
     * 
     * The results of comparing the collation keys of two strings
     * with strcmp() will always be the same as comparing the two
     * original keys with g_utf8_collate().
     * 
     * Note that this function depends on the {@link [current locale]}{@link [setlocale]}.
     */
    public static java.lang.String utf8CollateKey(java.lang.String str, long len) {
        var RESULT = gtk_h.g_utf8_collate_key(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a string into a collation key that can be compared
     * with other collation keys produced by the same function using strcmp().
     * 
     * In order to sort filenames correctly, this function treats the dot &<code>#39</code> .&<code>#39</code> 
     * as a special case. Most dictionary orderings seem to consider it
     * insignificant, thus producing the ordering &<code>#34</code> event.c&<code>#34</code>  &<code>#34</code> eventgenerator.c&<code>#34</code> 
     * &<code>#34</code> event.h&<code>#34</code>  instead of &<code>#34</code> event.c&<code>#34</code>  &<code>#34</code> event.h&<code>#34</code>  &<code>#34</code> eventgenerator.c&<code>#34</code> . Also, we
     * would like to treat numbers intelligently so that &<code>#34</code> file1&<code>#34</code>  &<code>#34</code> file10&<code>#34</code>  &<code>#34</code> file5&<code>#34</code> 
     * is sorted as &<code>#34</code> file1&<code>#34</code>  &<code>#34</code> file5&<code>#34</code>  &<code>#34</code> file10&<code>#34</code> .
     * 
     * Note that this function depends on the {@link [current locale]}{@link [setlocale]}.
     */
    public static java.lang.String utf8CollateKeyForFilename(java.lang.String str, long len) {
        var RESULT = gtk_h.g_utf8_collate_key_for_filename(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Finds the start of the next UTF-8 character in the string after @p.
     * 
     * @p does not have to be at the beginning of a UTF-8 character. No check
     * is made to see if the character found is actually valid other than
     * it starts with an appropriate byte.
     * 
     * If @end is <code>null</code>  the return value will never be <code>null</code>  if the end of the
     * string is reached, a pointer to the terminating nul byte is returned. If
     * @end is non-<code>null</code>  the return value will be <code>null</code> if the end of the string
     * is reached.
     */
    public static java.lang.String utf8FindNextChar(java.lang.String p, java.lang.String end) {
        var RESULT = gtk_h.g_utf8_find_next_char(Interop.allocateNativeString(p).handle(), Interop.allocateNativeString(end).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Given a position @p with a UTF-8 encoded string @str, find the start
     * of the previous UTF-8 character starting before @p. Returns <code>null</code> if no
     * UTF-8 characters are present in @str before @p.
     * 
     * @p does not have to be at the beginning of a UTF-8 character. No check
     * is made to see if the character found is actually valid other than
     * it starts with an appropriate byte.
     */
    public static java.lang.String utf8FindPrevChar(java.lang.String str, java.lang.String p) {
        var RESULT = gtk_h.g_utf8_find_prev_char(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(p).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a sequence of bytes encoded as UTF-8 to a Unicode character.
     * 
     * If @p does not point to a valid UTF-8 encoded character, results
     * are undefined. If you are not sure that the bytes are complete
     * valid Unicode characters, you should use g_utf8_get_char_validated()
     * instead.
     */
    public static int utf8GetChar(java.lang.String p) {
        var RESULT = gtk_h.g_utf8_get_char(Interop.allocateNativeString(p).handle());
        return RESULT;
    }
    
    /**
     * Convert a sequence of bytes encoded as UTF-8 to a Unicode character.
     * This function checks for incomplete characters, for invalid characters
     * such as characters that are out of the range of Unicode, and for
     * overlong encodings of valid characters.
     * 
     * Note that g_utf8_get_char_validated() returns (gunichar)-2 if
     * @max_len is positive and any of the bytes in the first UTF-8 character
     * sequence are nul.
     */
    public static int utf8GetCharValidated(java.lang.String p, long maxLen) {
        var RESULT = gtk_h.g_utf8_get_char_validated(Interop.allocateNativeString(p).handle(), maxLen);
        return RESULT;
    }
    
    /**
     * If the provided string is valid UTF-8, return a copy of it. If not,
     * return a copy in which bytes that could not be interpreted as valid Unicode
     * are replaced with the Unicode replacement character (U+FFFD).
     * 
     * For example, this is an appropriate function to use if you have received
     * a string that was incorrectly declared to be UTF-8, and you need a valid
     * UTF-8 version of it that can be logged or displayed to the user, with the
     * assumption that it is close enough to ASCII or UTF-8 to be mostly
     * readable as-is.
     */
    public static java.lang.String utf8MakeValid(java.lang.String str, long len) {
        var RESULT = gtk_h.g_utf8_make_valid(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a string into canonical form, standardizing
     * such issues as whether a character with an accent
     * is represented as a base character and combining
     * accent or as a single precomposed character. The
     * string has to be valid UTF-8, otherwise <code>null</code> is
     * returned. You should generally call g_utf8_normalize()
     * before comparing two Unicode strings.
     * 
     * The normalization mode {@link org.gtk.glib.NormalizeMode<code>#DEFAULT</code>  only
     * standardizes differences that do not affect the
     * text content, such as the above-mentioned accent
     * representation. {@link org.gtk.glib.NormalizeMode<code>#ALL</code>  also standardizes
     * the &<code>#34</code> compatibility&<code>#34</code>  characters in Unicode, such
     * as SUPERSCRIPT THREE to the standard forms
     * (in this case DIGIT THREE). Formatting information
     * may be lost but for most text operations such
     * characters should be considered the same.
     * 
     * {@link org.gtk.glib.NormalizeMode<code>#DEFAULT_COMPOSE</code>  and {@link org.gtk.glib.NormalizeMode<code>#ALL_COMPOSE</code>  are like {@link org.gtk.glib.NormalizeMode<code>#DEFAULT</code>  and {@link org.gtk.glib.NormalizeMode<code>#ALL</code>  
     * but returned a result with composed forms rather
     * than a maximally decomposed form. This is often
     * useful if you intend to convert the string to
     * a legacy encoding or pass it to a system with
     * less capable Unicode handling.
     */
    public static java.lang.String utf8Normalize(java.lang.String str, long len, NormalizeMode mode) {
        var RESULT = gtk_h.g_utf8_normalize(Interop.allocateNativeString(str).handle(), len, mode.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts from an integer character offset to a pointer to a position
     * within the string.
     * 
     * Since 2.10, this function allows to pass a negative @offset to
     * step backwards. It is usually worth stepping backwards from the end
     * instead of forwards if @offset is in the last fourth of the string,
     * since moving forward is about 3 times faster than moving backward.
     * 
     * Note that this function doesn&<code>#39</code> t abort when reaching the end of @str.
     * Therefore you should be sure that @offset is within string boundaries
     * before calling that function. Call g_utf8_strlen() when unsure.
     * This limitation exists as this function is called frequently during
     * text rendering and therefore has to be as fast as possible.
     */
    public static java.lang.String utf8OffsetToPointer(java.lang.String str, long offset) {
        var RESULT = gtk_h.g_utf8_offset_to_pointer(Interop.allocateNativeString(str).handle(), offset);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts from a pointer to position within a string to an integer
     * character offset.
     * 
     * Since 2.10, this function allows @pos to be before @str, and returns
     * a negative offset in this case.
     */
    public static long utf8PointerToOffset(java.lang.String str, java.lang.String pos) {
        var RESULT = gtk_h.g_utf8_pointer_to_offset(Interop.allocateNativeString(str).handle(), Interop.allocateNativeString(pos).handle());
        return RESULT;
    }
    
    /**
     * Finds the previous UTF-8 character in the string before @p.
     * 
     * @p does not have to be at the beginning of a UTF-8 character. No check
     * is made to see if the character found is actually valid other than
     * it starts with an appropriate byte. If @p might be the first
     * character of the string, you must use g_utf8_find_prev_char() instead.
     */
    public static java.lang.String utf8PrevChar(java.lang.String p) {
        var RESULT = gtk_h.g_utf8_prev_char(Interop.allocateNativeString(p).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Finds the leftmost occurrence of the given Unicode character
     * in a UTF-8 encoded string, while limiting the search to @len bytes.
     * If @len is -1, allow unbounded search.
     */
    public static java.lang.String utf8Strchr(java.lang.String p, long len, int c) {
        var RESULT = gtk_h.g_utf8_strchr(Interop.allocateNativeString(p).handle(), len, c);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts all Unicode characters in the string that have a case
     * to lowercase. The exact manner that this is done depends
     * on the current locale, and may result in the number of
     * characters in the string changing.
     */
    public static java.lang.String utf8Strdown(java.lang.String str, long len) {
        var RESULT = gtk_h.g_utf8_strdown(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Computes the length of the string in characters, not including
     * the terminating nul character. If the @max&<code>#39</code> th byte falls in the
     * middle of a character, the last (partial) character is not counted.
     */
    public static long utf8Strlen(java.lang.String p, long max) {
        var RESULT = gtk_h.g_utf8_strlen(Interop.allocateNativeString(p).handle(), max);
        return RESULT;
    }
    
    /**
     * Like the standard C strncpy() function, but copies a given number
     * of characters instead of a given number of bytes. The @src string
     * must be valid UTF-8 encoded text. (Use g_utf8_validate() on all
     * text before trying to use UTF-8 utility functions with it.)
     * 
     * Note you must ensure @dest is at least 4 * @n to fit the
     * largest possible UTF-8 characters
     */
    public static java.lang.String utf8Strncpy(java.lang.String dest, java.lang.String src, long n) {
        var RESULT = gtk_h.g_utf8_strncpy(Interop.allocateNativeString(dest).handle(), Interop.allocateNativeString(src).handle(), n);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Find the rightmost occurrence of the given Unicode character
     * in a UTF-8 encoded string, while limiting the search to @len bytes.
     * If @len is -1, allow unbounded search.
     */
    public static java.lang.String utf8Strrchr(java.lang.String p, long len, int c) {
        var RESULT = gtk_h.g_utf8_strrchr(Interop.allocateNativeString(p).handle(), len, c);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Reverses a UTF-8 string. @str must be valid UTF-8 encoded text.
     * (Use g_utf8_validate() on all text before trying to use UTF-8
     * utility functions with it.)
     * 
     * This function is intended for programmatic uses of reversed strings.
     * It pays no attention to decomposed characters, combining marks, byte
     * order marks, directional indicators (LRM, LRO, etc) and similar
     * characters which might need special handling when reversing a string
     * for display purposes.
     * 
     * Note that unlike g_strreverse(), this function returns
     * newly-allocated memory, which should be freed with g_free() when
     * no longer needed.
     */
    public static java.lang.String utf8Strreverse(java.lang.String str, long len) {
        var RESULT = gtk_h.g_utf8_strreverse(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts all Unicode characters in the string that have a case
     * to uppercase. The exact manner that this is done depends
     * on the current locale, and may result in the number of
     * characters in the string increasing. (For instance, the
     * German ess-zet will be changed to SS.)
     */
    public static java.lang.String utf8Strup(java.lang.String str, long len) {
        var RESULT = gtk_h.g_utf8_strup(Interop.allocateNativeString(str).handle(), len);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Copies a substring out of a UTF-8 encoded string.
     * The substring will contain @end_pos - @start_pos characters.
     * <p>
     * Since GLib 2.72, <code>-1</code> can be passed to @end_pos to indicate the
     * end of the string.
     */
    public static java.lang.String utf8Substring(java.lang.String str, long startPos, long endPos) {
        var RESULT = gtk_h.g_utf8_substring(Interop.allocateNativeString(str).handle(), startPos, endPos);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Validates UTF-8 encoded text. @str is the text to validate;
     * if @str is nul-terminated, then @max_len can be -1, otherwise
     * @max_len should be the number of bytes to validate.
     * If @end is non-<code>null</code>  then the end of the valid range
     * will be stored there (i.e. the start of the first invalid
     * character if some bytes were invalid, or the end of the text
     * being validated otherwise).
     * 
     * Note that g_utf8_validate() returns <code>false</code> if @max_len is
     * positive and any of the @max_len bytes are nul.
     * 
     * Returns <code>true</code> if all of @str was valid. Many GLib and GTK+
     * routines require valid UTF-8 as input; so data read from a file
     * or the network should be checked with g_utf8_validate() before
     * doing anything else with it.
     */
    public static boolean utf8Validate(byte[] str, long maxLen, java.lang.String[] end) {
        var RESULT = gtk_h.g_utf8_validate(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, str)).handle(), maxLen, Interop.allocateNativeArray(end).handle());
        return (RESULT != 0);
    }
    
    /**
     * Validates UTF-8 encoded text.
     * 
     * As with g_utf8_validate(), but @max_len must be set, and hence this function
     * will always return <code>false</code> if any of the bytes of @str are nul.
     */
    public static boolean utf8ValidateLen(byte[] str, long maxLen, java.lang.String[] end) {
        var RESULT = gtk_h.g_utf8_validate_len(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, str)).handle(), maxLen, Interop.allocateNativeArray(end).handle());
        return (RESULT != 0);
    }
    
    /**
     * Parses the string @str and verify if it is a UUID.
     * <p>
     * The function accepts the following syntax:
     * <p>
     * <li>simple forms (e.g. <code>f81d4fae-7dec-11d0-a765-00a0c91e6bf6</code>)
     * 
     * Note that hyphens are required within the UUID string itself,
     * as per the aforementioned RFC.
     */
    public static boolean uuidStringIsValid(java.lang.String str) {
        var RESULT = gtk_h.g_uuid_string_is_valid(Interop.allocateNativeString(str).handle());
        return (RESULT != 0);
    }
    
    /**
     * Generates a random UUID (RFC 4122 version 4) as a string. It has the same
     * randomness guarantees as {@link org.gtk.glib.Rand}  so must not be used for cryptographic
     * purposes such as key generation, nonces, salts or one-time pads.
     */
    public static java.lang.String uuidStringRandom() {
        var RESULT = gtk_h.g_uuid_string_random();
        return RESULT.getUtf8String(0);
    }
    
    public static org.gtk.gobject.Type variantGetGtype() {
        var RESULT = gtk_h.g_variant_get_gtype();
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Determines if a given string is a valid D-Bus object path.  You
     * should ensure that a string is a valid D-Bus object path before
     * passing it to g_variant_new_object_path().
     * <p>
     * A valid object path starts with <code>/</code> followed by zero or more
     * sequences of characters separated by <code>/</code> characters.  Each sequence
     * must contain only the characters <code>{@link [A-Z]}{@link [a-z]}{@link [0-9]}_</code>.  No sequence
     * (including the one following the final <code>/</code> character) may be empty.
     */
    public static boolean variantIsObjectPath(java.lang.String string) {
        var RESULT = gtk_h.g_variant_is_object_path(Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines if a given string is a valid D-Bus type signature.  You
     * should ensure that a string is a valid D-Bus type signature before
     * passing it to g_variant_new_signature().
     * 
     * D-Bus type signatures consist of zero or more definite {@link org.gtk.glib.VariantType} strings in sequence.
     */
    public static boolean variantIsSignature(java.lang.String string) {
        var RESULT = gtk_h.g_variant_is_signature(Interop.allocateNativeString(string).handle());
        return (RESULT != 0);
    }
    
    /**
     * Parses a {@link org.gtk.glib.Variant} from a text representation.
     * 
     * A single {@link org.gtk.glib.Variant} is parsed from the content of @text.
     * 
     * The format is described {@link [here]}{@link [gvariant-text]}.
     * 
     * The memory at @limit will never be accessed and the parser behaves as
     * if the character at @limit is the nul terminator.  This has the
     * effect of bounding @text.
     * 
     * If @endptr is non-<code>null</code> then @text is permitted to contain data
     * following the value that this function parses and @endptr will be
     * updated to point to the first character past the end of the text
     * parsed by this function.  If @endptr is <code>null</code> and there is extra data
     * then an error is returned.
     * 
     * If @type is non-<code>null</code> then the value will be parsed to have that
     * type.  This may result in additional parse errors (in the case that
     * the parsed value doesn&<code>#39</code> t fit the type) but may also result in fewer
     * errors (in the case that the type would have been ambiguous, such as
     * with empty arrays).
     * 
     * In the event that the parsing is successful, the resulting {@link org.gtk.glib.Variant} is returned. It is never floating, and must be freed with
     * g_variant_unref().
     * 
     * In case of any error, <code>null</code> will be returned.  If @error is non-<code>null</code> then it will be set to reflect the error that occurred.
     * 
     * Officially, the language understood by the parser is &<code>#34</code> any string
     * produced by g_variant_print()&<code>#34</code> .
     * 
     * There may be implementation specific restrictions on deeply nested values,
     * which would result in a {@link org.gtk.glib.VariantParseError<code>#RECURSION</code>  error. {@link org.gtk.glib.Variant} is
     * guaranteed to handle nesting up to at least 64 levels.
     */
    public static Variant variantParse(VariantType type, java.lang.String text, java.lang.String limit, java.lang.String[] endptr) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_variant_parse(type.handle(), Interop.allocateNativeString(text).handle(), Interop.allocateNativeString(limit).handle(), Interop.allocateNativeArray(endptr).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Variant(References.get(RESULT, true));
    }
    
    /**
     * Pretty-prints a message showing the context of a {@link org.gtk.glib.Variant} parse
     * error within the string for which parsing was attempted.
     * 
     * The resulting string is suitable for output to the console or other
     * monospace media where newlines are treated in the usual way.
     * 
     * The message will typically look something like one of the following:
     * 
     * |{@link [
     * unterminated string constant:
     *   (1, 2, 3, &<code>#39</code> abc
     *             ^^^^
     * ]}|
     * 
     * or
     * 
     * |{@link [
     * unable to find a common type:
     *   [1, 2, 3, &<code>#39</code> str&<code>#39</code> ]}
     *    ^        ^^^^^
     * ]|
     * 
     * The format of the message may change in a future version.
     * 
     * @error must have come from a failed attempt to g_variant_parse() and
     * @source_str must be exactly the same string that caused the error.
     * If @source_str was not nul-terminated when you passed it to
     * g_variant_parse() then you must add nul termination before using this
     * function.
     */
    public static java.lang.String variantParseErrorPrintContext(Error error, java.lang.String sourceStr) {
        var RESULT = gtk_h.g_variant_parse_error_print_context(error.handle(), Interop.allocateNativeString(sourceStr).handle());
        return RESULT.getUtf8String(0);
    }
    
    public static Quark variantParseErrorQuark() {
        var RESULT = gtk_h.g_variant_parse_error_quark();
        return new Quark(RESULT);
    }
    
    public static VariantType variantTypeChecked(java.lang.String arg0) {
        var RESULT = gtk_h.g_variant_type_checked_(Interop.allocateNativeString(arg0).handle());
        return new VariantType(References.get(RESULT, false));
    }
    
    public static long variantTypeStringGetDepth(java.lang.String typeString) {
        var RESULT = gtk_h.g_variant_type_string_get_depth_(Interop.allocateNativeString(typeString).handle());
        return RESULT;
    }
    
    /**
     * Checks if @type_string is a valid GVariant type string.  This call is
     * equivalent to calling g_variant_type_string_scan() and confirming
     * that the following character is a nul terminator.
     */
    public static boolean variantTypeStringIsValid(java.lang.String typeString) {
        var RESULT = gtk_h.g_variant_type_string_is_valid(Interop.allocateNativeString(typeString).handle());
        return (RESULT != 0);
    }
    
    /**
     * Scan for a single complete and valid GVariant type string in @string.
     * The memory pointed to by @limit (or bytes beyond it) is never
     * accessed.
     * 
     * If a valid type string is found, @endptr is updated to point to the
     * first character past the end of the string that was found and <code>true</code> is returned.
     * 
     * If there is no valid type string starting at @string, or if the type
     * string does not end before @limit then <code>false</code> is returned.
     * 
     * For the simple case of checking if a string is a valid type string,
     * see g_variant_type_string_is_valid().
     */
    public static boolean variantTypeStringScan(java.lang.String string, java.lang.String limit, java.lang.String[] endptr) {
        var RESULT = gtk_h.g_variant_type_string_scan(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(limit).handle(), Interop.allocateNativeArray(endptr).handle());
        return (RESULT != 0);
    }
    
    /**
     * An implementation of the GNU vasprintf() function which supports
     * positional parameters, as specified in the Single Unix Specification.
     * This function is similar to g_vsprintf(), except that it allocates a
     * string to hold the output, instead of putting the output in a buffer
     * you allocate in advance.
     * <p>
     * The returned value in @string is guaranteed to be non-NULL, unless
     * @format contains <code><code>lc</code> /code> or <code><code>ls</code> /code> conversions, which can fail if no
     * multibyte representation is available for the given character.
     * <p><code>glib/gprintf.h</code> must be explicitly included in order to use this function.
     */
    public static int vasprintf(java.lang.String[] string, java.lang.String format, VaList args) {
        var RESULT = gtk_h.g_vasprintf(Interop.allocateNativeArray(string).handle(), Interop.allocateNativeString(format).handle(), args);
        return RESULT;
    }
    
    /**
     * An implementation of the standard fprintf() function which supports
     * positional parameters, as specified in the Single Unix Specification.
     * <p><code>glib/gprintf.h</code> must be explicitly included in order to use this function.
     */
    public static int vfprintf(jdk.incubator.foreign.MemoryAddress file, java.lang.String format, VaList args) {
        var RESULT = gtk_h.g_vfprintf(file, Interop.allocateNativeString(format).handle(), args);
        return RESULT;
    }
    
    /**
     * An implementation of the standard vprintf() function which supports
     * positional parameters, as specified in the Single Unix Specification.
     * <p><code>glib/gprintf.h</code> must be explicitly included in order to use this function.
     */
    public static int vprintf(java.lang.String format, VaList args) {
        var RESULT = gtk_h.g_vprintf(Interop.allocateNativeString(format).handle(), args);
        return RESULT;
    }
    
    /**
     * A safer form of the standard vsprintf() function. The output is guaranteed
     * to not exceed @n characters (including the terminating nul character), so
     * it is easy to ensure that a buffer overflow cannot occur.
     * 
     * See also g_strdup_vprintf().
     * 
     * In versions of GLib prior to 1.2.3, this function may return -1 if the
     * output was truncated, and the truncated string may not be nul-terminated.
     * In versions prior to 1.3.12, this function returns the length of the output
     * string.
     * 
     * The return value of g_vsnprintf() conforms to the vsnprintf() function
     * as standardized in ISO C99. Note that this is different from traditional
     * vsnprintf(), which returns the length of the output string.
     * 
     * The format string may contain positional parameters, as specified in
     * the Single Unix Specification.
     */
    public static int vsnprintf(java.lang.String string, long n, java.lang.String format, VaList args) {
        var RESULT = gtk_h.g_vsnprintf(Interop.allocateNativeString(string).handle(), n, Interop.allocateNativeString(format).handle(), args);
        return RESULT;
    }
    
    /**
     * An implementation of the standard vsprintf() function which supports
     * positional parameters, as specified in the Single Unix Specification.
     * <p><code>glib/gprintf.h</code> must be explicitly included in order to use this function.
     */
    public static int vsprintf(java.lang.String string, java.lang.String format, VaList args) {
        var RESULT = gtk_h.g_vsprintf(Interop.allocateNativeString(string).handle(), Interop.allocateNativeString(format).handle(), args);
        return RESULT;
    }
    
    /**
     * Internal function used to print messages from the public g_warn_if_reached()
     * and g_warn_if_fail() macros.
     */
    public static void warnMessage(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String warnexpr) {
        gtk_h.g_warn_message(Interop.allocateNativeString(domain).handle(), Interop.allocateNativeString(file).handle(), line, Interop.allocateNativeString(func).handle(), Interop.allocateNativeString(warnexpr).handle());
    }
    
}

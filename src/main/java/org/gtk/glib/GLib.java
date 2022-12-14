package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GLib namespace.
 */
public final class GLib {
    
    static {
        LibLoad.loadLibrary("glib-2.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
public static final int ANALYZER_ANALYZING = 1;
    
/**
 * A good size for a buffer to be passed into g_ascii_dtostr().
 * It is guaranteed to be enough for all output of that function
 * on systems with 64bit IEEE-compatible doubles.
 * <p>
 * The typical usage would be something like:
 * <pre>{@code <!-- language="C" -->
 *   char buf[G_ASCII_DTOSTR_BUF_SIZE];
 * 
 *   fprintf (out, "value=%s\\n", g_ascii_dtostr (buf, sizeof (buf), value));
 * }</pre>
 */
public static final int ASCII_DTOSTR_BUF_SIZE = 39;
    
/**
 * Specifies one of the possible types of byte order.
 * See {@code G_BYTE_ORDER}.
 */
public static final int BIG_ENDIAN = 4321;
    
/**
 * The set of uppercase ASCII alphabet characters.
 * Used for specifying valid identifier characters
 * in {@link ScannerConfig}.
 */
public static final java.lang.String CSET_A_2_Z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
/**
 * The set of ASCII digits.
 * Used for specifying valid identifier characters
 * in {@link ScannerConfig}.
 */
public static final java.lang.String CSET_DIGITS = "0123456789";
    
/**
 * The set of lowercase ASCII alphabet characters.
 * Used for specifying valid identifier characters
 * in {@link ScannerConfig}.
 */
public static final java.lang.String CSET_a_2_z = "abcdefghijklmnopqrstuvwxyz";
    
/**
 * A bitmask that restricts the possible flags passed to
 * g_datalist_set_flags(). Passing a flags value where
 * flags &amp; ~G_DATALIST_FLAGS_MASK != 0 is an error.
 */
public static final int DATALIST_FLAGS_MASK = 3;
    
/**
 * Represents an invalid {@link DateDay}.
 */
public static final int DATE_BAD_DAY = 0;
    
/**
 * Represents an invalid Julian day number.
 */
public static final int DATE_BAD_JULIAN = 0;
    
/**
 * Represents an invalid year.
 */
public static final int DATE_BAD_YEAR = 0;
    
/**
 * The directory separator character.
 * This is '/' on UNIX machines and '\\' under Windows.
 */
public static final int DIR_SEPARATOR = 47;
    
/**
 * The directory separator as a string.
 * This is "/" on UNIX machines and "\\" under Windows.
 */
public static final java.lang.String DIR_SEPARATOR_S = "/";
    
/**
 * The base of natural logarithms.
 */
public static final double E = 2.718282d;
    
/**
 * This is the platform dependent conversion specifier for scanning and
 * printing values of type {@code gint16}. It is a string literal, but doesn't
 * include the percent-sign, such that you can add precision and length
 * modifiers between percent-sign and conversion specifier.
 * <pre>{@code <!-- language="C" -->
 * gint16 in;
 * gint32 out;
 * sscanf ("42", "%" G_GINT16_FORMAT, &in)
 * out = in * 1000;
 * g_print ("%" G_GINT32_FORMAT, out);
 * }</pre>
 */
public static final java.lang.String GINT16_FORMAT = "hi";
    
/**
 * The platform dependent length modifier for conversion specifiers
 * for scanning and printing values of type {@code gint16} or {@code guint16}. It
 * is a string literal, but doesn't include the percent-sign, such
 * that you can add precision and length modifiers between percent-sign
 * and conversion specifier and append a conversion specifier.
 * <p>
 * The following example prints "0x7b";
 * <pre>{@code <!-- language="C" -->
 * gint16 value = 123;
 * g_print ("%#" G_GINT16_MODIFIER "x", value);
 * }</pre>
 */
public static final java.lang.String GINT16_MODIFIER = "h";
    
/**
 * This is the platform dependent conversion specifier for scanning
 * and printing values of type {@code gint32}. See also {@code G_GINT16_FORMAT}.
 */
public static final java.lang.String GINT32_FORMAT = "i";
    
/**
 * The platform dependent length modifier for conversion specifiers
 * for scanning and printing values of type {@code gint32} or {@code guint32}. It
 * is a string literal. See also {@code G_GINT16_MODIFIER}.
 */
public static final java.lang.String GINT32_MODIFIER = "";
    
/**
 * This is the platform dependent conversion specifier for scanning
 * and printing values of type {@code gint64}. See also {@code G_GINT16_FORMAT}.
 * <p>
 * Some platforms do not support scanning and printing 64-bit integers,
 * even though the types are supported. On such platforms {@code G_GINT64_FORMAT}
 * is not defined. Note that scanf() may not support 64-bit integers, even
 * if {@code G_GINT64_FORMAT} is defined. Due to its weak error handling, scanf()
 * is not recommended for parsing anyway; consider using g_ascii_strtoull()
 * instead.
 */
public static final java.lang.String GINT64_FORMAT = "li";
    
/**
 * The platform dependent length modifier for conversion specifiers
 * for scanning and printing values of type {@code gint64} or {@code guint64}.
 * It is a string literal.
 * <p>
 * Some platforms do not support printing 64-bit integers, even
 * though the types are supported. On such platforms {@code G_GINT64_MODIFIER}
 * is not defined.
 */
public static final java.lang.String GINT64_MODIFIER = "l";
    
/**
 * This is the platform dependent conversion specifier for scanning
 * and printing values of type {@code gintptr}.
 */
public static final java.lang.String GINTPTR_FORMAT = "li";
    
/**
 * The platform dependent length modifier for conversion specifiers
 * for scanning and printing values of type {@code gintptr} or {@code guintptr}.
 * It is a string literal.
 */
public static final java.lang.String GINTPTR_MODIFIER = "l";
    
/**
 * Expands to "" on all modern compilers, and to  __FUNCTION__ on gcc
 * version 2.x. Don't use it.
 */
public static final java.lang.String GNUC_FUNCTION = "";
    
/**
 * Expands to "" on all modern compilers, and to __PRETTY_FUNCTION__
 * on gcc version 2.x. Don't use it.
 */
public static final java.lang.String GNUC_PRETTY_FUNCTION = "";
    
/**
 * This is the platform dependent conversion specifier for scanning
 * and printing values of type {@code gsize}. See also {@code G_GINT16_FORMAT}.
 */
public static final java.lang.String GSIZE_FORMAT = "lu";
    
/**
 * The platform dependent length modifier for conversion specifiers
 * for scanning and printing values of type {@code gsize}. It
 * is a string literal.
 */
public static final java.lang.String GSIZE_MODIFIER = "l";
    
/**
 * This is the platform dependent conversion specifier for scanning
 * and printing values of type {@code gssize}. See also {@code G_GINT16_FORMAT}.
 */
public static final java.lang.String GSSIZE_FORMAT = "li";
    
/**
 * The platform dependent length modifier for conversion specifiers
 * for scanning and printing values of type {@code gssize}. It
 * is a string literal.
 */
public static final java.lang.String GSSIZE_MODIFIER = "l";
    
/**
 * This is the platform dependent conversion specifier for scanning
 * and printing values of type {@code guint16}. See also {@code G_GINT16_FORMAT}
 */
public static final java.lang.String GUINT16_FORMAT = "hu";
    
/**
 * This is the platform dependent conversion specifier for scanning
 * and printing values of type {@code guint32}. See also {@code G_GINT16_FORMAT}.
 */
public static final java.lang.String GUINT32_FORMAT = "u";
    
/**
 * This is the platform dependent conversion specifier for scanning
 * and printing values of type {@code guint64}. See also {@code G_GINT16_FORMAT}.
 * <p>
 * Some platforms do not support scanning and printing 64-bit integers,
 * even though the types are supported. On such platforms {@code G_GUINT64_FORMAT}
 * is not defined.  Note that scanf() may not support 64-bit integers, even
 * if {@code G_GINT64_FORMAT} is defined. Due to its weak error handling, scanf()
 * is not recommended for parsing anyway; consider using g_ascii_strtoull()
 * instead.
 */
public static final java.lang.String GUINT64_FORMAT = "lu";
    
/**
 * This is the platform dependent conversion specifier
 * for scanning and printing values of type {@code guintptr}.
 */
public static final java.lang.String GUINTPTR_FORMAT = "lu";
    
public static final int HAVE_GINT64 = 1;
    
public static final int HAVE_GNUC_VARARGS = 1;
    
/**
 * Defined to 1 if gcc-style visibility handling is supported.
 */
public static final int HAVE_GNUC_VISIBILITY = 1;
    
public static final int HAVE_GROWING_STACK = 0;
    
public static final int HAVE_ISO_VARARGS = 1;
    
/**
 * The position of the first bit which is not reserved for internal
 * use be the {@link Hook} implementation, i.e.
 * {@code 1 << G_HOOK_FLAG_USER_SHIFT} is the first
 * bit which can be used for application-defined flags.
 */
public static final int HOOK_FLAG_USER_SHIFT = 4;
    
/**
 * The bias by which exponents in double-precision floats are offset.
 */
public static final int IEEE754_DOUBLE_BIAS = 1023;
    
/**
 * The bias by which exponents in single-precision floats are offset.
 */
public static final int IEEE754_FLOAT_BIAS = 127;
    
/**
 * The name of the main group of a desktop entry file, as defined in the
 * <a href="http://freedesktop.org/Standards/desktop-entry-spec">Desktop Entry Specification</a>.
 * Consult the specification for more
 * details about the meanings of the keys below.
 */
public static final java.lang.String KEY_FILE_DESKTOP_GROUP = "Desktop Entry";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a string list
 * giving the available application actions.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_ACTIONS = "Actions";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a list
 * of strings giving the categories in which the desktop entry
 * should be shown in a menu.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_CATEGORIES = "Categories";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a localized
 * string giving the tooltip for the desktop entry.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_COMMENT = "Comment";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a boolean
 * set to true if the application is D-Bus activatable.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_DBUS_ACTIVATABLE = "DBusActivatable";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a string
 * giving the command line to execute. It is only valid for desktop
 * entries with the {@code Application} type.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_EXEC = "Exec";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a localized
 * string giving the generic name of the desktop entry.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_GENERIC_NAME = "GenericName";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a boolean
 * stating whether the desktop entry has been deleted by the user.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_HIDDEN = "Hidden";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a localized
 * string giving the name of the icon to be displayed for the desktop
 * entry.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_ICON = "Icon";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a list
 * of strings giving the MIME types supported by this desktop entry.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_MIME_TYPE = "MimeType";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a localized
 * string giving the specific name of the desktop entry.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_NAME = "Name";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a list of
 * strings identifying the environments that should not display the
 * desktop entry.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_NOT_SHOW_IN = "NotShowIn";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a boolean
 * stating whether the desktop entry should be shown in menus.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_NO_DISPLAY = "NoDisplay";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a list of
 * strings identifying the environments that should display the
 * desktop entry.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_ONLY_SHOW_IN = "OnlyShowIn";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a string
 * containing the working directory to run the program in. It is only
 * valid for desktop entries with the {@code Application} type.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_PATH = "Path";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a boolean
 * stating whether the application supports the
 * <a href="http://www.freedesktop.org/Standards/startup-notification-spec">Startup Notification Protocol Specification</a>.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_STARTUP_NOTIFY = "StartupNotify";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is string
 * identifying the WM class or name hint of a window that the application
 * will create, which can be used to emulate Startup Notification with
 * older applications.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_STARTUP_WM_CLASS = "StartupWMClass";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a boolean
 * stating whether the program should be run in a terminal window.
 * <p>
 * It is only valid for desktop entries with the {@code Application} type.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_TERMINAL = "Terminal";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a string
 * giving the file name of a binary on disk used to determine if the
 * program is actually installed. It is only valid for desktop entries
 * with the {@code Application} type.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_TRY_EXEC = "TryExec";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a string
 * giving the type of the desktop entry.
 * <p>
 * Usually {@code G_KEY_FILE_DESKTOP_TYPE_APPLICATION},
 * {@code G_KEY_FILE_DESKTOP_TYPE_LINK}, or
 * {@code G_KEY_FILE_DESKTOP_TYPE_DIRECTORY}.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_TYPE = "Type";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a string
 * giving the URL to access. It is only valid for desktop entries
 * with the {@code Link} type.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_URL = "URL";
    
/**
 * A key under {@code G_KEY_FILE_DESKTOP_GROUP}, whose value is a string
 * giving the version of the Desktop Entry Specification used for
 * the desktop entry file.
 */
public static final java.lang.String KEY_FILE_DESKTOP_KEY_VERSION = "Version";
    
/**
 * The value of the {@code G_KEY_FILE_DESKTOP_KEY_TYPE}, key for desktop
 * entries representing applications.
 */
public static final java.lang.String KEY_FILE_DESKTOP_TYPE_APPLICATION = "Application";
    
/**
 * The value of the {@code G_KEY_FILE_DESKTOP_KEY_TYPE}, key for desktop
 * entries representing directories.
 */
public static final java.lang.String KEY_FILE_DESKTOP_TYPE_DIRECTORY = "Directory";
    
/**
 * The value of the {@code G_KEY_FILE_DESKTOP_KEY_TYPE}, key for desktop
 * entries representing links to documents.
 */
public static final java.lang.String KEY_FILE_DESKTOP_TYPE_LINK = "Link";
    
/**
 * Specifies one of the possible types of byte order.
 * See {@code G_BYTE_ORDER}.
 */
public static final int LITTLE_ENDIAN = 1234;
    
/**
 * The natural logarithm of 10.
 */
public static final double LN10 = 2.302585d;
    
/**
 * The natural logarithm of 2.
 */
public static final double LN2 = 0.693147d;
    
/**
 * Multiplying the base 2 exponent by this number yields the base 10 exponent.
 */
public static final double LOG_2_BASE_10 = 0.30103d;
    
/**
 * Defines the log domain. See <a href="#log-domains">Log Domains</a>.
 * <p>
 * Libraries should define this so that any messages
 * which they log can be differentiated from messages from other
 * libraries and application code. But be careful not to define
 * it in any public header files.
 * <p>
 * Log domains must be unique, and it is recommended that they are the
 * application or library name, optionally followed by a hyphen and a sub-domain
 * name. For example, {@code bloatpad} or {@code bloatpad-io}.
 * <p>
 * If undefined, it defaults to the default {@code null} (or {@code ""}) log domain; this is
 * not advisable, as it cannot be filtered against using the {@code G_MESSAGES_DEBUG}
 * environment variable.
 * <p>
 * For example, GTK+ uses this in its {@code Makefile.am}:
 * <pre>{@code 
 * AM_CPPFLAGS = -DG_LOG_DOMAIN=\\"Gtk\\"
 * }</pre>
 * <p>
 * Applications can choose to leave it as the default {@code null} (or {@code ""})
 * domain. However, defining the domain offers the same advantages as
 * above.
 */
public static final byte LOG_DOMAIN = 0;
    
/**
 * GLib log levels that are considered fatal by default.
 * <p>
 * This is not used if structured logging is enabled; see
 * [Using Structured Logging][using-structured-logging].
 */
public static final int LOG_FATAL_MASK = 5;
    
/**
 * Log levels below 1&lt;&lt;G_LOG_LEVEL_USER_SHIFT are used by GLib.
 * Higher bits can be used for user-defined log levels.
 */
public static final int LOG_LEVEL_USER_SHIFT = 8;
    
/**
 * The major version number of the GLib library.
 * <p>
 * Like {@code glib_major_version}, but from the headers used at
 * application compile time, rather than from the library
 * linked against at application run time.
 */
public static final int MAJOR_VERSION = 2;
    
/**
 * The maximum value which can be held in a {@code gint16}.
 */
public static final short MAXINT16 = 32767;
    
/**
 * The maximum value which can be held in a {@code gint32}.
 */
public static final int MAXINT32 = 2147483647;
    
/**
 * The maximum value which can be held in a {@code gint64}.
 */
public static final long MAXINT64 = 9223372036854775807L;
    
/**
 * The maximum value which can be held in a {@code gint8}.
 */
public static final byte MAXINT8 = 127;
    
/**
 * The maximum value which can be held in a {@code guint16}.
 */
public static final short MAXUINT16 = -1;
    
/**
 * The maximum value which can be held in a {@code guint32}.
 */
public static final int MAXUINT32 = -1;
    
/**
 * The maximum value which can be held in a {@code guint64}.
 */
public static final long MAXUINT64 = -1L;
    
/**
 * The maximum value which can be held in a {@code guint8}.
 */
public static final byte MAXUINT8 = -1;
    
/**
 * The micro version number of the GLib library.
 * <p>
 * Like {@code gtk_micro_version}, but from the headers used at
 * application compile time, rather than from the library
 * linked against at application run time.
 */
public static final int MICRO_VERSION = 0;
    
/**
 * The minimum value which can be held in a {@code gint16}.
 */
public static final short MININT16 = -32768;
    
/**
 * The minimum value which can be held in a {@code gint32}.
 */
public static final int MININT32 = -2147483648;
    
/**
 * The minimum value which can be held in a {@code gint64}.
 */
public static final long MININT64 = -9223372036854775808L;
    
/**
 * The minimum value which can be held in a {@code gint8}.
 */
public static final byte MININT8 = -128;
    
/**
 * The minor version number of the GLib library.
 * <p>
 * Like {@code gtk_minor_version}, but from the headers used at
 * application compile time, rather than from the library
 * linked against at application run time.
 */
public static final int MINOR_VERSION = 74;
    
public static final java.lang.String MODULE_SUFFIX = "so";
    
/**
 * If a long option in the main group has this name, it is not treated as a
 * regular option. Instead it collects all non-option arguments which would
 * otherwise be left in {@code argv}. The option must be of type
 * {@link OptionArg#CALLBACK}, {@link OptionArg#STRING_ARRAY}
 * or {@link OptionArg#FILENAME_ARRAY}.
 * <p>
 * Using {@code G_OPTION_REMAINING} instead of simply scanning {@code argv}
 * for leftover arguments has the advantage that GOption takes care of
 * necessary encoding conversions for strings or filenames.
 */
public static final java.lang.String OPTION_REMAINING = "";
    
/**
 * Specifies one of the possible types of byte order
 * (currently unused). See {@code G_BYTE_ORDER}.
 */
public static final int PDP_ENDIAN = 3412;
    
/**
 * The value of pi (ratio of circle's circumference to its diameter).
 */
public static final double PI = 3.141593d;
    
/**
 * A format specifier that can be used in printf()-style format strings
 * when printing a {@link Pid}.
 */
public static final java.lang.String PID_FORMAT = "i";
    
/**
 * Pi divided by 2.
 */
public static final double PI_2 = 1.570796d;
    
/**
 * Pi divided by 4.
 */
public static final double PI_4 = 0.785398d;
    
/**
 * A format specifier that can be used in printf()-style format strings
 * when printing the {@code fd} member of a {@link PollFD}.
 */
public static final java.lang.String POLLFD_FORMAT = "%d";
    
/**
 * Use this for default priority event sources.
 * <p>
 * In GLib this priority is used when adding timeout functions
 * with g_timeout_add(). In GDK this priority is used for events
 * from the X server.
 */
public static final int PRIORITY_DEFAULT = 0;
    
/**
 * Use this for default priority idle functions.
 * <p>
 * In GLib this priority is used when adding idle functions with
 * g_idle_add().
 */
public static final int PRIORITY_DEFAULT_IDLE = 200;
    
/**
 * Use this for high priority event sources.
 * <p>
 * It is not used within GLib or GTK+.
 */
public static final int PRIORITY_HIGH = -100;
    
/**
 * Use this for high priority idle functions.
 * <p>
 * GTK+ uses {@code G_PRIORITY_HIGH_IDLE} + 10 for resizing operations,
 * and {@code G_PRIORITY_HIGH_IDLE} + 20 for redrawing operations. (This is
 * done to ensure that any pending resizes are processed before any
 * pending redraws, so that widgets are not redrawn twice unnecessarily.)
 */
public static final int PRIORITY_HIGH_IDLE = 100;
    
/**
 * Use this for very low priority background tasks.
 * <p>
 * It is not used within GLib or GTK+.
 */
public static final int PRIORITY_LOW = 300;
    
/**
 * The search path separator character.
 * This is ':' on UNIX machines and ';' under Windows.
 */
public static final int SEARCHPATH_SEPARATOR = 58;
    
/**
 * The search path separator as a string.
 * This is ":" on UNIX machines and ";" under Windows.
 */
public static final java.lang.String SEARCHPATH_SEPARATOR_S = ":";
    
public static final int SIZEOF_LONG = 8;
    
public static final int SIZEOF_SIZE_T = 8;
    
public static final int SIZEOF_SSIZE_T = 8;
    
public static final int SIZEOF_VOID_P = 8;
    
/**
 * Use this macro as the return value of a {@link SourceFunc} to leave
 * the {@link Source} in the main loop.
 */
public static final boolean SOURCE_CONTINUE = true;
    
/**
 * Use this macro as the return value of a {@link SourceFunc} to remove
 * the {@link Source} from the main loop.
 */
public static final boolean SOURCE_REMOVE = false;
    
/**
 * The square root of two.
 */
public static final double SQRT2 = 1.414214d;
    
/**
 * The standard delimiters, used in g_strdelimit().
 */
public static final java.lang.String STR_DELIMITERS = "_-|> <.";
    
public static final int SYSDEF_AF_INET = 2;
    
public static final int SYSDEF_AF_INET6 = 10;
    
public static final int SYSDEF_AF_UNIX = 1;
    
public static final int SYSDEF_MSG_DONTROUTE = 4;
    
public static final int SYSDEF_MSG_OOB = 1;
    
public static final int SYSDEF_MSG_PEEK = 2;
    
/**
 * Creates a unique temporary directory for each unit test and uses
 * g_set_user_dirs() to set XDG directories to point into subdirectories of it
 * for the duration of the unit test. The directory tree is cleaned up after the
 * test finishes successfully. Note that this doesn???t take effect until
 * g_test_run() is called, so calls to (for example) g_get_user_home_dir() will
 * return the system-wide value when made in a test program???s main() function.
 * <p>
 * The following functions will return subdirectories of the temporary directory
 * when this option is used. The specific subdirectory paths in use are not
 * guaranteed to be stable API ??? always use a getter function to retrieve them.
 * <ul>
 * <li>g_get_home_dir()
 * <li>g_get_user_cache_dir()
 * <li>g_get_system_config_dirs()
 * <li>g_get_user_config_dir()
 * <li>g_get_system_data_dirs()
 * <li>g_get_user_data_dir()
 * <li>g_get_user_state_dir()
 * <li>g_get_user_runtime_dir()
 * </ul>
 * <p>
 * The subdirectories may not be created by the test harness; as with normal
 * calls to functions like g_get_user_cache_dir(), the caller must be prepared
 * to create the directory if it doesn???t exist.
 */
public static final java.lang.String TEST_OPTION_ISOLATE_DIRS = "isolate_dirs";
    
/**
 * Evaluates to a time span of one day.
 */
public static final long TIME_SPAN_DAY = 86400000000L;
    
/**
 * Evaluates to a time span of one hour.
 */
public static final long TIME_SPAN_HOUR = 3600000000L;
    
/**
 * Evaluates to a time span of one millisecond.
 */
public static final long TIME_SPAN_MILLISECOND = 1000L;
    
/**
 * Evaluates to a time span of one minute.
 */
public static final long TIME_SPAN_MINUTE = 60000000L;
    
/**
 * Evaluates to a time span of one second.
 */
public static final long TIME_SPAN_SECOND = 1000000L;
    
/**
 * The maximum length (in codepoints) of a compatibility or canonical
 * decomposition of a single Unicode character.
 * <p>
 * This is as defined by Unicode 6.1.
 */
public static final int UNICHAR_MAX_DECOMPOSITION_LENGTH = 18;
    
/**
 * Generic delimiters characters as defined in
 * <a href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. Includes {@code :/?#[]@}.
 */
public static final java.lang.String URI_RESERVED_CHARS_GENERIC_DELIMITERS = ":/?#[]@";
    
/**
 * Subcomponent delimiter characters as defined in
 * <a href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. Includes {@code !$&'()*+,;=}.
 */
public static final java.lang.String URI_RESERVED_CHARS_SUBCOMPONENT_DELIMITERS = "!$&'()*+,;=";
    
/**
 * Number of microseconds in one second (1 million).
 * This macro is provided for code readability.
 */
public static final int USEC_PER_SEC = 1000000;
    
public static final int VA_COPY_AS_ARRAY = 1;
    
/**
 * A macro that should be defined by the user prior to including
 * the glib.h header.
 * The definition should be one of the predefined GLib version
 * macros: {@code GLIB_VERSION_2_26}, {@code GLIB_VERSION_2_28},...
 * <p>
 * This macro defines the earliest version of GLib that the package is
 * required to be able to compile against.
 * <p>
 * If the compiler is configured to warn about the use of deprecated
 * functions, then using functions that were deprecated in version
 * {@code GLIB_VERSION_MIN_REQUIRED} or earlier will cause warnings (but
 * using functions deprecated in later releases will not).
 */
public static final int VERSION_MIN_REQUIRED = 2;
    
public static final int WIN32_MSG_HANDLE = 19981206;
    
public static final int macro__has_attribute___noreturn__ = 0;

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
 * @param filename a pathname in the GLib file name encoding
 *     (UTF-8 on Windows)
 * @param mode as in access()
 * @return zero if the pathname refers to an existing file system
 *     object that has all the tested permissions, or -1 otherwise
 *     or on error.
 */
public static int access(java.lang.String filename, int mode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_access.invokeExact(
                    Marshal.stringToAddress.marshal(filename, SCOPE),
                    mode);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * This function is similar to g_malloc(), allocating ({@code n_blocks} * {@code n_block_bytes})
 * bytes, but care is taken to align the allocated memory to with the given
 * alignment value. Additionally, it will detect possible overflow during
 * multiplication.
 * <p>
 * If the allocation fails (because the system is out of memory),
 * the program is terminated.
 * <p>
 * Aligned memory allocations returned by this function can only be
 * freed using g_aligned_free().
 * @param nBlocks the number of blocks to allocate
 * @param nBlockBytes the size of each block in bytes
 * @param alignment the alignment to be enforced, which must be a positive power of 2
 *   and a multiple of {@code sizeof(void*)}
 * @return the allocated memory
 */
public static @Nullable java.lang.foreign.MemoryAddress alignedAlloc(long nBlocks, long nBlockBytes, long alignment) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_aligned_alloc.invokeExact(
                nBlocks,
                nBlockBytes,
                alignment);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * This function is similar to g_aligned_alloc(), but it will
 * also clear the allocated memory before returning it.
 * @param nBlocks the number of blocks to allocate
 * @param nBlockBytes the size of each block in bytes
 * @param alignment the alignment to be enforced, which must be a positive power of 2
 *   and a multiple of {@code sizeof(void*)}
 * @return the allocated, cleared memory
 */
public static @Nullable java.lang.foreign.MemoryAddress alignedAlloc0(long nBlocks, long nBlockBytes, long alignment) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_aligned_alloc0.invokeExact(
                nBlocks,
                nBlockBytes,
                alignment);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Frees the memory allocated by g_aligned_alloc().
 * @param mem the memory to deallocate
 */
public static void alignedFree(@Nullable java.lang.foreign.MemoryAddress mem) {
    try {
        DowncallHandles.g_aligned_free.invokeExact((Addressable) (mem == null ? MemoryAddress.NULL : (Addressable) mem));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Determines the numeric value of a character as a decimal digit.
 * Differs from g_unichar_digit_value() because it takes a char, so
 * there's no worry about sign extension if characters are signed.
 * @param c an ASCII character
 * @return If {@code c} is a decimal digit (according to g_ascii_isdigit()),
 *    its numeric value. Otherwise, -1.
 */
public static int asciiDigitValue(byte c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_ascii_digit_value.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param buffer A buffer to place the resulting string in
 * @param bufLen The length of the buffer.
 * @param d The {@code gdouble} to convert
 * @return The pointer to the buffer with the converted string.
 */
public static java.lang.String asciiDtostr(java.lang.String buffer, int bufLen, double d) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ascii_dtostr.invokeExact(
                    Marshal.stringToAddress.marshal(buffer, SCOPE),
                    bufLen,
                    d);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param buffer A buffer to place the resulting string in
 * @param bufLen The length of the buffer.
 * @param format The printf()-style format to use for the
 *   code to use for converting
 * @param d The {@code gdouble} to convert
 * @return The pointer to the buffer with the converted string.
 */
public static java.lang.String asciiFormatd(java.lang.String buffer, int bufLen, java.lang.String format, double d) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ascii_formatd.invokeExact(
                    Marshal.stringToAddress.marshal(buffer, SCOPE),
                    bufLen,
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    d);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param s1 string to compare with {@code s2}
 * @param s2 string to compare with {@code s1}
 * @return 0 if the strings match, a negative value if {@code s1} &lt; {@code s2},
 *     or a positive value if {@code s1} &gt; {@code s2}.
 */
public static int asciiStrcasecmp(java.lang.String s1, java.lang.String s2) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_ascii_strcasecmp.invokeExact(
                    Marshal.stringToAddress.marshal(s1, SCOPE),
                    Marshal.stringToAddress.marshal(s2, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Converts all upper case ASCII letters to lower case ASCII letters.
 * @param str a string
 * @param len length of {@code str} in bytes, or -1 if {@code str} is nul-terminated
 * @return a newly-allocated string, with all the upper case
 *     characters in {@code str} converted to lower case, with semantics that
 *     exactly match g_ascii_tolower(). (Note that this is unlike the
 *     old g_strdown(), which modified the string in place.)
 */
public static java.lang.String asciiStrdown(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ascii_strdown.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param str a string
 * @param base base of a parsed number
 * @param min a lower bound (inclusive)
 * @param max an upper bound (inclusive)
 * @param outNum a return location for a number
 * @return {@code true} if {@code str} was a number, otherwise {@code false}.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean asciiStringToSigned(java.lang.String str, int base, long min, long max, Out<Long> outNum) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment outNumPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_ascii_string_to_signed.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    base,
                    min,
                    max,
                    (Addressable) (outNum == null ? MemoryAddress.NULL : (Addressable) outNumPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (outNum != null) outNum.set(outNumPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param str a string
 * @param base base of a parsed number
 * @param min a lower bound (inclusive)
 * @param max an upper bound (inclusive)
 * @param outNum a return location for a number
 * @return {@code true} if {@code str} was a number, otherwise {@code false}.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean asciiStringToUnsigned(java.lang.String str, int base, long min, long max, Out<Long> outNum) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment outNumPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_ascii_string_to_unsigned.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    base,
                    min,
                    max,
                    (Addressable) (outNum == null ? MemoryAddress.NULL : (Addressable) outNumPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (outNum != null) outNum.set(outNumPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Compare {@code s1} and {@code s2}, ignoring the case of ASCII characters and any
 * characters after the first {@code n} in each string. If either string is
 * less than {@code n} bytes long, comparison will stop at the first nul byte
 * encountered.
 * <p>
 * Unlike the BSD strcasecmp() function, this only recognizes standard
 * ASCII letters and ignores the locale, treating all non-ASCII
 * characters as if they are not letters.
 * <p>
 * The same warning as in g_ascii_strcasecmp() applies: Use this
 * function only on strings known to be in encodings where bytes
 * corresponding to ASCII letters always represent themselves.
 * @param s1 string to compare with {@code s2}
 * @param s2 string to compare with {@code s1}
 * @param n number of characters to compare
 * @return 0 if the strings match, a negative value if {@code s1} &lt; {@code s2},
 *     or a positive value if {@code s1} &gt; {@code s2}.
 */
public static int asciiStrncasecmp(java.lang.String s1, java.lang.String s2, long n) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_ascii_strncasecmp.invokeExact(
                    Marshal.stringToAddress.marshal(s1, SCOPE),
                    Marshal.stringToAddress.marshal(s2, SCOPE),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * @param nptr the string to convert to a numeric value.
 * @param endptr if non-{@code null}, it returns the
 *           character after the last character used in the conversion.
 * @return the {@code gdouble} value.
 */
public static double asciiStrtod(java.lang.String nptr, @Nullable Out<java.lang.String> endptr) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment endptrPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.g_ascii_strtod.invokeExact(
                    Marshal.stringToAddress.marshal(nptr, SCOPE),
                    (Addressable) (endptr == null ? MemoryAddress.NULL : (Addressable) endptrPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (endptr != null) endptr.set(Marshal.addressToString.marshal(endptrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return RESULT;
    }
}

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
 * @param nptr the string to convert to a numeric value.
 * @param endptr if non-{@code null}, it returns the
 *           character after the last character used in the conversion.
 * @param base to be used for the conversion, 2..36 or 0
 * @return the {@code gint64} value or zero on error.
 */
public static long asciiStrtoll(java.lang.String nptr, @Nullable Out<java.lang.String> endptr, int base) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment endptrPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_ascii_strtoll.invokeExact(
                    Marshal.stringToAddress.marshal(nptr, SCOPE),
                    (Addressable) (endptr == null ? MemoryAddress.NULL : (Addressable) endptrPOINTER.address()),
                    base);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (endptr != null) endptr.set(Marshal.addressToString.marshal(endptrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return RESULT;
    }
}

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
 * @param nptr the string to convert to a numeric value.
 * @param endptr if non-{@code null}, it returns the
 *           character after the last character used in the conversion.
 * @param base to be used for the conversion, 2..36 or 0
 * @return the {@code guint64} value or zero on error.
 */
public static long asciiStrtoull(java.lang.String nptr, @Nullable Out<java.lang.String> endptr, int base) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment endptrPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_ascii_strtoull.invokeExact(
                    Marshal.stringToAddress.marshal(nptr, SCOPE),
                    (Addressable) (endptr == null ? MemoryAddress.NULL : (Addressable) endptrPOINTER.address()),
                    base);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (endptr != null) endptr.set(Marshal.addressToString.marshal(endptrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return RESULT;
    }
}

/**
 * Converts all lower case ASCII letters to upper case ASCII letters.
 * @param str a string
 * @param len length of {@code str} in bytes, or -1 if {@code str} is nul-terminated
 * @return a newly allocated string, with all the lower case
 *     characters in {@code str} converted to upper case, with semantics that
 *     exactly match g_ascii_toupper(). (Note that this is unlike the
 *     old g_strup(), which modified the string in place.)
 */
public static java.lang.String asciiStrup(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ascii_strup.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param c any character
 * @return the result of converting {@code c} to lower case. If {@code c} is
 *     not an ASCII upper case letter, {@code c} is returned unchanged.
 */
public static byte asciiTolower(byte c) {
    byte RESULT;
    try {
        RESULT = (byte) DowncallHandles.g_ascii_tolower.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param c any character
 * @return the result of converting {@code c} to upper case. If {@code c} is not
 *    an ASCII lower case letter, {@code c} is returned unchanged.
 */
public static byte asciiToupper(byte c) {
    byte RESULT;
    try {
        RESULT = (byte) DowncallHandles.g_ascii_toupper.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Determines the numeric value of a character as a hexadecimal
 * digit. Differs from g_unichar_xdigit_value() because it takes
 * a char, so there's no worry about sign extension if characters
 * are signed.
 * @param c an ASCII character.
 * @return If {@code c} is a hex digit (according to g_ascii_isxdigit()),
 *     its numeric value. Otherwise, -1.
 */
public static int asciiXdigitValue(byte c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_ascii_xdigit_value.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

public static void assertWarning(java.lang.String logDomain, java.lang.String file, int line, java.lang.String prettyFunction, java.lang.String expression) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_assert_warning.invokeExact(
                    Marshal.stringToAddress.marshal(logDomain, SCOPE),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(prettyFunction, SCOPE),
                    Marshal.stringToAddress.marshal(expression, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static void assertionMessage(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String message) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_assertion_message.invokeExact(
                    Marshal.stringToAddress.marshal(domain, SCOPE),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(func, SCOPE),
                    Marshal.stringToAddress.marshal(message, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static void assertionMessageCmpstr(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, java.lang.String arg1, java.lang.String cmp, java.lang.String arg2) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_assertion_message_cmpstr.invokeExact(
                    Marshal.stringToAddress.marshal(domain, SCOPE),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(func, SCOPE),
                    Marshal.stringToAddress.marshal(expr, SCOPE),
                    Marshal.stringToAddress.marshal(arg1, SCOPE),
                    Marshal.stringToAddress.marshal(cmp, SCOPE),
                    Marshal.stringToAddress.marshal(arg2, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static void assertionMessageCmpstrv(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, java.lang.String arg1, java.lang.String arg2, long firstWrongIdx) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_assertion_message_cmpstrv.invokeExact(
                    Marshal.stringToAddress.marshal(domain, SCOPE),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(func, SCOPE),
                    Marshal.stringToAddress.marshal(expr, SCOPE),
                    Marshal.stringToAddress.marshal(arg1, SCOPE),
                    Marshal.stringToAddress.marshal(arg2, SCOPE),
                    firstWrongIdx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static void assertionMessageError(java.lang.String domain, java.lang.String file, int line, java.lang.String func, java.lang.String expr, org.gtk.glib.Error error, org.gtk.glib.Quark errorDomain, int errorCode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_assertion_message_error.invokeExact(
                    Marshal.stringToAddress.marshal(domain, SCOPE),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(func, SCOPE),
                    Marshal.stringToAddress.marshal(expr, SCOPE),
                    error.handle(),
                    errorDomain.getValue().intValue(),
                    errorCode);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Internal function used to print messages from the public g_assert() and
 * g_assert_not_reached() macros.
 * @param domain log domain
 * @param file file containing the assertion
 * @param line line number of the assertion
 * @param func function containing the assertion
 * @param expr expression which failed
 */
public static void assertionMessageExpr(@Nullable java.lang.String domain, java.lang.String file, int line, java.lang.String func, @Nullable java.lang.String expr) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_assertion_message_expr.invokeExact(
                    (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(func, SCOPE),
                    (Addressable) (expr == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(expr, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Specifies a function to be called at normal program termination.
 * <p>
 * Since GLib 2.8.2, on Windows g_atexit() actually is a preprocessor
 * macro that maps to a call to the atexit() function in the C
 * library. This means that in case the code that calls g_atexit(),
 * i.e. atexit(), is in a DLL, the function will be called when the
 * DLL is detached from the program. This typically makes more sense
 * than that the function is called when the GLib DLL is detached,
 * which happened earlier when g_atexit() was a function in the GLib
 * DLL.
 * <p>
 * The behaviour of atexit() in the context of dynamically loaded
 * modules is not formally specified and varies wildly.
 * <p>
 * On POSIX systems, calling g_atexit() (or atexit()) in a dynamically
 * loaded module which is unloaded before the program terminates might
 * well cause a crash at program exit.
 * <p>
 * Some POSIX systems implement atexit() like Windows, and have each
 * dynamically loaded module maintain an own atexit chain that is
 * called when the module is unloaded.
 * <p>
 * On other POSIX systems, before a dynamically loaded module is
 * unloaded, the registered atexit functions (if any) residing in that
 * module are called, regardless where the code that registered them
 * resided. This is presumably the most robust approach.
 * <p>
 * As can be seen from the above, for portability it's best to avoid
 * calling g_atexit() (or atexit()) except in the main executable of a
 * program.
 * @param func the function to call on normal program termination.
 * @deprecated It is best to avoid g_atexit().
 */
@Deprecated
public static void atexit(org.gtk.glib.VoidFunc func) {
    try {
        DowncallHandles.g_atexit.invokeExact((Addressable) func.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @param val the value to add
 * @return the value of {@code atomic} before the add, signed
 */
public static int atomicIntAdd(PointerInteger atomic, int val) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_int_add.invokeExact(
                atomic.handle(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @param val the value to 'and'
 * @return the value of {@code atomic} before the operation, unsigned
 */
public static int atomicIntAnd(PointerInteger atomic, int val) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_int_and.invokeExact(
                atomic.handle(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @param oldval the value to compare with
 * @param newval the value to conditionally replace with
 * @return {@code true} if the exchange took place
 */
public static boolean atomicIntCompareAndExchange(PointerInteger atomic, int oldval, int newval) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_int_compare_and_exchange.invokeExact(
                atomic.handle(),
                oldval,
                newval);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Compares {@code atomic} to {@code oldval} and, if equal, sets it to {@code newval}.
 * If {@code atomic} was not equal to {@code oldval} then no change occurs.
 * In any case the value of {@code atomic} before this operation is stored in {@code preval}.
 * <p>
 * This compare and exchange is done atomically.
 * <p>
 * Think of this operation as an atomic version of
 * {@code { *preval = *atomic; if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }}.
 * <p>
 * This call acts as a full compiler and hardware memory barrier.
 * <p>
 * See also g_atomic_int_compare_and_exchange()
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @param oldval the value to compare with
 * @param newval the value to conditionally replace with
 * @param preval the contents of {@code atomic} before this operation
 * @return {@code true} if the exchange took place
 */
public static boolean atomicIntCompareAndExchangeFull(PointerInteger atomic, int oldval, int newval, Out<Integer> preval) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment prevalPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_atomic_int_compare_and_exchange_full.invokeExact(
                    atomic.handle(),
                    oldval,
                    newval,
                    (Addressable) prevalPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                preval.set(prevalPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @return {@code true} if the resultant value is zero
 */
public static boolean atomicIntDecAndTest(PointerInteger atomic) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_int_dec_and_test.invokeExact(atomic.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Sets the {@code atomic} to {@code newval} and returns the old value from {@code atomic}.
 * <p>
 * This exchange is done atomically.
 * <p>
 * Think of this operation as an atomic version of
 * {@code { tmp = *atomic; *atomic = val; return tmp; }}.
 * <p>
 * This call acts as a full compiler and hardware memory barrier.
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @param newval the value to replace with
 * @return the value of {@code atomic} before the exchange, signed
 */
public static int atomicIntExchange(PointerInteger atomic, int newval) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_int_exchange.invokeExact(
                atomic.handle(),
                newval);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * This function existed before g_atomic_int_add() returned the prior
 * value of the integer (which it now does).  It is retained only for
 * compatibility reasons.  Don't use this function in new code.
 * @param atomic a pointer to a {@code gint}
 * @param val the value to add
 * @return the value of {@code atomic} before the add, signed
 * @deprecated Use g_atomic_int_add() instead.
 */
@Deprecated
public static int atomicIntExchangeAndAdd(PointerInteger atomic, int val) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_int_exchange_and_add.invokeExact(
                atomic.handle(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the current value of {@code atomic}.
 * <p>
 * This call acts as a full compiler and hardware
 * memory barrier (before the get).
 * <p>
 * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
 * the pointer passed to it should not be {@code volatile}.
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @return the value of the integer
 */
public static int atomicIntGet(PointerInteger atomic) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_int_get.invokeExact(atomic.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Increments the value of {@code atomic} by 1.
 * <p>
 * Think of this operation as an atomic version of {@code { *atomic += 1; }}.
 * <p>
 * This call acts as a full compiler and hardware memory barrier.
 * <p>
 * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
 * the pointer passed to it should not be {@code volatile}.
 * @param atomic a pointer to a {@code gint} or {@code guint}
 */
public static void atomicIntInc(PointerInteger atomic) {
    try {
        DowncallHandles.g_atomic_int_inc.invokeExact(atomic.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @param val the value to 'or'
 * @return the value of {@code atomic} before the operation, unsigned
 */
public static int atomicIntOr(PointerInteger atomic, int val) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_int_or.invokeExact(
                atomic.handle(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Sets the value of {@code atomic} to {@code newval}.
 * <p>
 * This call acts as a full compiler and hardware
 * memory barrier (after the set).
 * <p>
 * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
 * the pointer passed to it should not be {@code volatile}.
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @param newval a new value to store
 */
public static void atomicIntSet(PointerInteger atomic, int newval) {
    try {
        DowncallHandles.g_atomic_int_set.invokeExact(
                atomic.handle(),
                newval);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param atomic a pointer to a {@code gint} or {@code guint}
 * @param val the value to 'xor'
 * @return the value of {@code atomic} before the operation, unsigned
 */
public static int atomicIntXor(PointerInteger atomic, int val) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_int_xor.invokeExact(
                atomic.handle(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param atomic a pointer to a {@code gpointer}-sized value
 * @param val the value to add
 * @return the value of {@code atomic} before the add, signed
 */
public static long atomicPointerAdd(java.lang.foreign.MemoryAddress atomic, long val) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_atomic_pointer_add.invokeExact(
                (Addressable) atomic,
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param atomic a pointer to a {@code gpointer}-sized value
 * @param val the value to 'and'
 * @return the value of {@code atomic} before the operation, unsigned
 */
public static long atomicPointerAnd(java.lang.foreign.MemoryAddress atomic, long val) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_atomic_pointer_and.invokeExact(
                (Addressable) atomic,
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param atomic a pointer to a {@code gpointer}-sized value
 * @param oldval the value to compare with
 * @param newval the value to conditionally replace with
 * @return {@code true} if the exchange took place
 */
public static boolean atomicPointerCompareAndExchange(java.lang.foreign.MemoryAddress atomic, @Nullable java.lang.foreign.MemoryAddress oldval, @Nullable java.lang.foreign.MemoryAddress newval) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_pointer_compare_and_exchange.invokeExact(
                (Addressable) atomic,
                (Addressable) (oldval == null ? MemoryAddress.NULL : (Addressable) oldval),
                (Addressable) (newval == null ? MemoryAddress.NULL : (Addressable) newval));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Compares {@code atomic} to {@code oldval} and, if equal, sets it to {@code newval}.
 * If {@code atomic} was not equal to {@code oldval} then no change occurs.
 * In any case the value of {@code atomic} before this operation is stored in {@code preval}.
 * <p>
 * This compare and exchange is done atomically.
 * <p>
 * Think of this operation as an atomic version of
 * {@code { *preval = *atomic; if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }}.
 * <p>
 * This call acts as a full compiler and hardware memory barrier.
 * <p>
 * See also g_atomic_pointer_compare_and_exchange()
 * @param atomic a pointer to a {@code gpointer}-sized value
 * @param oldval the value to compare with
 * @param newval the value to conditionally replace with
 * @param preval the contents of {@code atomic} before this operation
 * @return {@code true} if the exchange took place
 */
public static boolean atomicPointerCompareAndExchangeFull(java.lang.foreign.MemoryAddress atomic, @Nullable java.lang.foreign.MemoryAddress oldval, @Nullable java.lang.foreign.MemoryAddress newval, Out<java.lang.foreign.MemoryAddress> preval) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment prevalPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_atomic_pointer_compare_and_exchange_full.invokeExact(
                    (Addressable) atomic,
                    (Addressable) (oldval == null ? MemoryAddress.NULL : (Addressable) oldval),
                    (Addressable) (newval == null ? MemoryAddress.NULL : (Addressable) newval),
                    (Addressable) prevalPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                preval.set(prevalPOINTER.get(Interop.valueLayout.ADDRESS, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Sets the {@code atomic} to {@code newval} and returns the old value from {@code atomic}.
 * <p>
 * This exchange is done atomically.
 * <p>
 * Think of this operation as an atomic version of
 * {@code { tmp = *atomic; *atomic = val; return tmp; }}.
 * <p>
 * This call acts as a full compiler and hardware memory barrier.
 * @param atomic a pointer to a {@code gpointer}-sized value
 * @param newval the value to replace with
 * @return the value of {@code atomic} before the exchange
 */
public static @Nullable java.lang.foreign.MemoryAddress atomicPointerExchange(@Nullable java.lang.foreign.MemoryAddress atomic, @Nullable java.lang.foreign.MemoryAddress newval) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_atomic_pointer_exchange.invokeExact(
                (Addressable) (atomic == null ? MemoryAddress.NULL : (Addressable) atomic),
                (Addressable) (newval == null ? MemoryAddress.NULL : (Addressable) newval));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the current value of {@code atomic}.
 * <p>
 * This call acts as a full compiler and hardware
 * memory barrier (before the get).
 * <p>
 * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
 * the pointer passed to it should not be {@code volatile}.
 * @param atomic a pointer to a {@code gpointer}-sized value
 * @return the value of the pointer
 */
public static @Nullable java.lang.foreign.MemoryAddress atomicPointerGet(java.lang.foreign.MemoryAddress atomic) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_atomic_pointer_get.invokeExact((Addressable) atomic);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param atomic a pointer to a {@code gpointer}-sized value
 * @param val the value to 'or'
 * @return the value of {@code atomic} before the operation, unsigned
 */
public static long atomicPointerOr(java.lang.foreign.MemoryAddress atomic, long val) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_atomic_pointer_or.invokeExact(
                (Addressable) atomic,
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Sets the value of {@code atomic} to {@code newval}.
 * <p>
 * This call acts as a full compiler and hardware
 * memory barrier (after the set).
 * <p>
 * While {@code atomic} has a {@code volatile} qualifier, this is a historical artifact and
 * the pointer passed to it should not be {@code volatile}.
 * @param atomic a pointer to a {@code gpointer}-sized value
 * @param newval a new value to store
 */
public static void atomicPointerSet(java.lang.foreign.MemoryAddress atomic, @Nullable java.lang.foreign.MemoryAddress newval) {
    try {
        DowncallHandles.g_atomic_pointer_set.invokeExact(
                (Addressable) atomic,
                (Addressable) (newval == null ? MemoryAddress.NULL : (Addressable) newval));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param atomic a pointer to a {@code gpointer}-sized value
 * @param val the value to 'xor'
 * @return the value of {@code atomic} before the operation, unsigned
 */
public static long atomicPointerXor(java.lang.foreign.MemoryAddress atomic, long val) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_atomic_pointer_xor.invokeExact(
                (Addressable) atomic,
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Atomically acquires a reference on the data pointed by {@code mem_block}.
 * @param memBlock a pointer to reference counted data
 * @return a pointer to the data,
 *   with its reference count increased
 */
public static java.lang.foreign.MemoryAddress atomicRcBoxAcquire(java.lang.foreign.MemoryAddress memBlock) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_atomic_rc_box_acquire.invokeExact((Addressable) memBlock);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocates {@code block_size} bytes of memory, and adds atomic
 * reference counting semantics to it.
 * <p>
 * The data will be freed when its reference count drops to
 * zero.
 * <p>
 * The allocated data is guaranteed to be suitably aligned for any
 * built-in type.
 * @param blockSize the size of the allocation, must be greater than 0
 * @return a pointer to the allocated memory
 */
public static java.lang.foreign.MemoryAddress atomicRcBoxAlloc(long blockSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_atomic_rc_box_alloc.invokeExact(blockSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param blockSize the size of the allocation, must be greater than 0
 * @return a pointer to the allocated memory
 */
public static java.lang.foreign.MemoryAddress atomicRcBoxAlloc0(long blockSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_atomic_rc_box_alloc0.invokeExact(blockSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocates a new block of data with atomic reference counting
 * semantics, and copies {@code block_size} bytes of {@code mem_block}
 * into it.
 * @param blockSize the number of bytes to copy, must be greater than 0
 * @param memBlock the memory to copy
 * @return a pointer to the allocated
 *   memory
 */
public static java.lang.foreign.MemoryAddress atomicRcBoxDup(long blockSize, java.lang.foreign.MemoryAddress memBlock) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_atomic_rc_box_dup.invokeExact(
                blockSize,
                (Addressable) memBlock);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Retrieves the size of the reference counted data pointed by {@code mem_block}.
 * @param memBlock a pointer to reference counted data
 * @return the size of the data, in bytes
 */
public static long atomicRcBoxGetSize(java.lang.foreign.MemoryAddress memBlock) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_atomic_rc_box_get_size.invokeExact((Addressable) memBlock);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Atomically releases a reference on the data pointed by {@code mem_block}.
 * <p>
 * If the reference was the last one, it will free the
 * resources allocated for {@code mem_block}.
 * @param memBlock a pointer to reference counted data
 */
public static void atomicRcBoxRelease(java.lang.foreign.MemoryAddress memBlock) {
    try {
        DowncallHandles.g_atomic_rc_box_release.invokeExact((Addressable) memBlock);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Atomically releases a reference on the data pointed by {@code mem_block}.
 * <p>
 * If the reference was the last one, it will call {@code clear_func}
 * to clear the contents of {@code mem_block}, and then will free the
 * resources allocated for {@code mem_block}.
 * @param memBlock a pointer to reference counted data
 * @param clearFunc a function to call when clearing the data
 */
public static void atomicRcBoxReleaseFull(java.lang.foreign.MemoryAddress memBlock, org.gtk.glib.DestroyNotify clearFunc) {
    try {
        DowncallHandles.g_atomic_rc_box_release_full.invokeExact(
                (Addressable) memBlock,
                (Addressable) clearFunc.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Atomically compares the current value of {@code arc} with {@code val}.
 * @param arc the address of an atomic reference count variable
 * @param val the value to compare
 * @return {@code true} if the reference count is the same
 *   as the given value
 */
public static boolean atomicRefCountCompare(PointerInteger arc, int val) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_ref_count_compare.invokeExact(
                arc.handle(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Atomically decreases the reference count.
 * <p>
 * If {@code true} is returned, the reference count reached 0. After this point, {@code arc}
 * is an undefined state and must be reinitialized with
 * g_atomic_ref_count_init() to be used again.
 * @param arc the address of an atomic reference count variable
 * @return {@code true} if the reference count reached 0, and {@code false} otherwise
 */
public static boolean atomicRefCountDec(PointerInteger arc) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_atomic_ref_count_dec.invokeExact(arc.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Atomically increases the reference count.
 * @param arc the address of an atomic reference count variable
 */
public static void atomicRefCountInc(PointerInteger arc) {
    try {
        DowncallHandles.g_atomic_ref_count_inc.invokeExact(arc.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Initializes a reference count variable to 1.
 * @param arc the address of an atomic reference count variable
 */
public static void atomicRefCountInit(PointerInteger arc) {
    try {
        DowncallHandles.g_atomic_ref_count_init.invokeExact(arc.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Decode a sequence of Base-64 encoded text into binary data.  Note
 * that the returned binary data is not necessarily zero-terminated,
 * so it should not be used as a character string.
 * @param text zero-terminated string with base64 text to decode
 * @param outLen The length of the decoded data is written here
 * @return newly allocated buffer containing the binary data
 *               that {@code text} represents. The returned buffer must
 *               be freed with g_free().
 */
public static byte[] base64Decode(java.lang.String text, Out<Long> outLen) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment outLenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_base64_decode.invokeExact(
                    Marshal.stringToAddress.marshal(text, SCOPE),
                    (Addressable) outLenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                outLen.set(outLenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), outLen.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE);
    }
}

/**
 * Decode a sequence of Base-64 encoded text into binary data
 * by overwriting the input data.
 * @param text zero-terminated
 *        string with base64 text to decode
 * @param outLen The length of the decoded data is written here
 * @return The binary data that {@code text} responds. This pointer
 *               is the same as the input {@code text}.
 */
public static PointerByte base64DecodeInplace(Out<byte[]> text, Out<Long> outLen) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment textPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment outLenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_base64_decode_inplace.invokeExact(
                    (Addressable) textPOINTER.address(),
                    (Addressable) outLenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                outLen.set(outLenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        text.set(MemorySegment.ofAddress(textPOINTER.get(Interop.valueLayout.ADDRESS, 0), outLen.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
        return new PointerByte(RESULT);
    }
}

/**
 * Incrementally decode a sequence of binary data from its Base-64 stringified
 * representation. By calling this function multiple times you can convert
 * data in chunks to avoid having to have the full encoded data in memory.
 * <p>
 * The output buffer must be large enough to fit all the data that will
 * be written to it. Since base64 encodes 3 bytes in 4 chars you need
 * at least: ({@code len} / 4) * 3 + 3 bytes (+ 3 may be needed in case of non-zero
 * state).
 * @param in binary input data
 * @param len max length of {@code in} data to decode
 * @param out output buffer
 * @param state Saved state between steps, initialize to 0
 * @param save Saved state between steps, initialize to 0
 * @return The number of bytes of output that was written
 */
public static long base64DecodeStep(byte[] in, long len, byte[] out, Out<Integer> state, Out<Integer> save) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment statePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment savePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_base64_decode_step.invokeExact(
                    Interop.allocateNativeArray(in, false, SCOPE),
                    len,
                    Interop.allocateNativeArray(out, false, SCOPE),
                    (Addressable) statePOINTER.address(),
                    (Addressable) savePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                state.set(statePOINTER.get(Interop.valueLayout.C_INT, 0));
                save.set(savePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT;
    }
}

/**
 * Encode a sequence of binary data into its Base-64 stringified
 * representation.
 * @param data the binary data to encode
 * @param len the length of {@code data}
 * @return a newly allocated, zero-terminated Base-64
 *               encoded string representing {@code data}. The returned string must
 *               be freed with g_free().
 */
public static java.lang.String base64Encode(byte[] data, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_base64_encode.invokeExact(
                    (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false, SCOPE)),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Flush the status from a sequence of calls to g_base64_encode_step().
 * <p>
 * The output buffer must be large enough to fit all the data that will
 * be written to it. It will need up to 4 bytes, or up to 5 bytes if
 * line-breaking is enabled.
 * <p>
 * The {@code out} array will not be automatically nul-terminated.
 * @param breakLines whether to break long lines
 * @param out pointer to destination buffer
 * @param state Saved state from g_base64_encode_step()
 * @param save Saved state from g_base64_encode_step()
 * @return The number of bytes of output that was written
 */
public static long base64EncodeClose(boolean breakLines, byte[] out, Out<Integer> state, Out<Integer> save) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment statePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment savePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_base64_encode_close.invokeExact(
                    Marshal.booleanToInteger.marshal(breakLines, null).intValue(),
                    Interop.allocateNativeArray(out, false, SCOPE),
                    (Addressable) statePOINTER.address(),
                    (Addressable) savePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                state.set(statePOINTER.get(Interop.valueLayout.C_INT, 0));
                save.set(savePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT;
    }
}

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
 * @param in the binary data to encode
 * @param len the length of {@code in}
 * @param breakLines whether to break long lines
 * @param out pointer to destination buffer
 * @param state Saved state between steps, initialize to 0
 * @param save Saved state between steps, initialize to 0
 * @return The number of bytes of output that was written
 */
public static long base64EncodeStep(byte[] in, long len, boolean breakLines, byte[] out, Out<Integer> state, Out<Integer> save) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment statePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment savePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_base64_encode_step.invokeExact(
                    Interop.allocateNativeArray(in, false, SCOPE),
                    len,
                    Marshal.booleanToInteger.marshal(breakLines, null).intValue(),
                    Interop.allocateNativeArray(out, false, SCOPE),
                    (Addressable) statePOINTER.address(),
                    (Addressable) savePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                state.set(statePOINTER.get(Interop.valueLayout.C_INT, 0));
                save.set(savePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT;
    }
}

/**
 * Gets the name of the file without any leading directory
 * components. It returns a pointer into the given file name
 * string.
 * @param fileName the name of the file
 * @return the name of the file without any leading
 *     directory components
 * @deprecated Use g_path_get_basename() instead, but notice
 *     that g_path_get_basename() allocates new memory for the
 *     returned string, unlike this function which returns a pointer
 *     into the argument.
 */
@Deprecated
public static java.lang.String basename(java.lang.String fileName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_basename.invokeExact(Marshal.stringToAddress.marshal(fileName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Sets the indicated {@code lock_bit} in {@code address}.  If the bit is already
 * set, this call will block until g_bit_unlock() unsets the
 * corresponding bit.
 * <p>
 * Attempting to lock on two different bits within the same integer is
 * not supported and will very probably cause deadlocks.
 * <p>
 * The value of the bit that is set is (1u &lt;&lt; {@code bit}).  If {@code bit} is not
 * between 0 and 31 then the result is undefined.
 * <p>
 * This function accesses {@code address} atomically.  All other accesses to
 * {@code address} must be atomic in order for this function to work
 * reliably. While {@code address} has a {@code volatile} qualifier, this is a historical
 * artifact and the argument passed to it should not be {@code volatile}.
 * @param address a pointer to an integer
 * @param lockBit a bit value between 0 and 31
 */
public static void bitLock(PointerInteger address, int lockBit) {
    try {
        DowncallHandles.g_bit_lock.invokeExact(
                address.handle(),
                lockBit);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Find the position of the first bit set in {@code mask}, searching
 * from (but not including) {@code nth_bit} upwards. Bits are numbered
 * from 0 (least significant) to sizeof({@code gulong}) * 8 - 1 (31 or 63,
 * usually). To start searching from the 0th bit, set {@code nth_bit} to -1.
 * @param mask a {@code gulong} containing flags
 * @param nthBit the index of the bit to start the search from
 * @return the index of the first bit set which is higher than {@code nth_bit}, or -1
 *    if no higher bits are set
 */
public static int bitNthLsf(long mask, int nthBit) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_bit_nth_lsf.invokeExact(
                mask,
                nthBit);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Find the position of the first bit set in {@code mask}, searching
 * from (but not including) {@code nth_bit} downwards. Bits are numbered
 * from 0 (least significant) to sizeof({@code gulong}) * 8 - 1 (31 or 63,
 * usually). To start searching from the last bit, set {@code nth_bit} to
 * -1 or GLIB_SIZEOF_LONG * 8.
 * @param mask a {@code gulong} containing flags
 * @param nthBit the index of the bit to start the search from
 * @return the index of the first bit set which is lower than {@code nth_bit}, or -1
 *    if no lower bits are set
 */
public static int bitNthMsf(long mask, int nthBit) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_bit_nth_msf.invokeExact(
                mask,
                nthBit);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Gets the number of bits used to hold {@code number},
 * e.g. if {@code number} is 4, 3 bits are needed.
 * @param number a {@code guint}
 * @return the number of bits used to hold {@code number}
 */
public static int bitStorage(long number) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_bit_storage.invokeExact(number);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Sets the indicated {@code lock_bit} in {@code address}, returning {@code true} if
 * successful.  If the bit is already set, returns {@code false} immediately.
 * <p>
 * Attempting to lock on two different bits within the same integer is
 * not supported.
 * <p>
 * The value of the bit that is set is (1u &lt;&lt; {@code bit}).  If {@code bit} is not
 * between 0 and 31 then the result is undefined.
 * <p>
 * This function accesses {@code address} atomically.  All other accesses to
 * {@code address} must be atomic in order for this function to work
 * reliably. While {@code address} has a {@code volatile} qualifier, this is a historical
 * artifact and the argument passed to it should not be {@code volatile}.
 * @param address a pointer to an integer
 * @param lockBit a bit value between 0 and 31
 * @return {@code true} if the lock was acquired
 */
public static boolean bitTrylock(PointerInteger address, int lockBit) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_bit_trylock.invokeExact(
                address.handle(),
                lockBit);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Clears the indicated {@code lock_bit} in {@code address}.  If another thread is
 * currently blocked in g_bit_lock() on this same bit then it will be
 * woken up.
 * <p>
 * This function accesses {@code address} atomically.  All other accesses to
 * {@code address} must be atomic in order for this function to work
 * reliably. While {@code address} has a {@code volatile} qualifier, this is a historical
 * artifact and the argument passed to it should not be {@code volatile}.
 * @param address a pointer to an integer
 * @param lockBit a bit value between 0 and 31
 */
public static void bitUnlock(PointerInteger address, int lockBit) {
    try {
        DowncallHandles.g_bit_unlock.invokeExact(
                address.handle(),
                lockBit);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static org.gtk.glib.Quark bookmarkFileErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_bookmark_file_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Creates a filename from a series of elements using the correct
 * separator for filenames.
 * <p>
 * On Unix, this function behaves identically to {@code g_build_path
 * (G_DIR_SEPARATOR_S, first_element, ....)}.
 * <p>
 * On Windows, it takes into account that either the backslash
 * ({@code \\} or slash ({@code /}) can be used as separator in filenames, but
 * otherwise behaves as on UNIX. When file pathname separators need
 * to be inserted, the one that last previously occurred in the
 * parameters (reading from left to right) is used.
 * <p>
 * No attempt is made to force the resulting filename to be an absolute
 * path. If the first element is a relative path, the result will
 * be a relative path.
 * @param firstElement the first element in the path
 * @param varargs remaining elements in path, terminated by {@code null}
 * @return a newly-allocated string that
 *     must be freed with g_free().
 */
public static java.lang.String buildFilename(java.lang.String firstElement, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_build_filename.invokeExact(
                    Marshal.stringToAddress.marshal(firstElement, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Behaves exactly like g_build_filename(), but takes the path elements
 * as a va_list. This function is mainly meant for language bindings.
 * @param firstElement the first element in the path
 * @param args va_list of remaining elements in path
 * @return a newly-allocated string that
 *     must be freed with g_free().
 */
public static java.lang.String buildFilenameValist(java.lang.String firstElement, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_build_filename_valist.invokeExact(
                    Marshal.stringToAddress.marshal(firstElement, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Behaves exactly like g_build_filename(), but takes the path elements
 * as a string array, instead of varargs. This function is mainly
 * meant for language bindings.
 * @param args {@code null}-terminated
 *     array of strings containing the path elements.
 * @return a newly-allocated string that
 *     must be freed with g_free().
 */
public static java.lang.String buildFilenamev(java.lang.String[] args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_build_filenamev.invokeExact(Interop.allocateNativeArray(args, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Creates a path from a series of elements using {@code separator} as the
 * separator between elements. At the boundary between two elements,
 * any trailing occurrences of separator in the first element, or
 * leading occurrences of separator in the second element are removed
 * and exactly one copy of the separator is inserted.
 * <p>
 * Empty elements are ignored.
 * <p>
 * The number of leading copies of the separator on the result is
 * the same as the number of leading copies of the separator on
 * the first non-empty element.
 * <p>
 * The number of trailing copies of the separator on the result is
 * the same as the number of trailing copies of the separator on
 * the last non-empty element. (Determination of the number of
 * trailing copies is done without stripping leading copies, so
 * if the separator is {@code ABA}, then {@code ABABA} has 1 trailing copy.)
 * <p>
 * However, if there is only a single non-empty element, and there
 * are no characters in that element not part of the leading or
 * trailing separators, then the result is exactly the original value
 * of that element.
 * <p>
 * Other than for determination of the number of leading and trailing
 * copies of the separator, elements consisting only of copies
 * of the separator are ignored.
 * @param separator a string used to separator the elements of the path.
 * @param firstElement the first element in the path
 * @param varargs remaining elements in path, terminated by {@code null}
 * @return a newly-allocated string that
 *     must be freed with g_free().
 */
public static java.lang.String buildPath(java.lang.String separator, java.lang.String firstElement, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_build_path.invokeExact(
                    Marshal.stringToAddress.marshal(separator, SCOPE),
                    Marshal.stringToAddress.marshal(firstElement, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Behaves exactly like g_build_path(), but takes the path elements
 * as a string array, instead of varargs. This function is mainly
 * meant for language bindings.
 * @param separator a string used to separator the elements of the path.
 * @param args {@code null}-terminated
 *     array of strings containing the path elements.
 * @return a newly-allocated string that
 *     must be freed with g_free().
 */
public static java.lang.String buildPathv(java.lang.String separator, java.lang.String[] args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_build_pathv.invokeExact(
                    Marshal.stringToAddress.marshal(separator, SCOPE),
                    Interop.allocateNativeArray(args, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Frees the memory allocated by the {@link ByteArray}. If {@code free_segment} is
 * {@code true} it frees the actual byte data. If the reference count of
 * {@code array} is greater than one, the {@link ByteArray} wrapper is preserved but
 * the size of {@code array} will be set to zero.
 * @param array a {@link ByteArray}
 * @param freeSegment if {@code true} the actual byte data is freed as well
 * @return the element data if {@code free_segment} is {@code false}, otherwise
 *          {@code null}.  The element data should be freed using g_free().
 */
public static PointerByte byteArrayFree(byte[] array, boolean freeSegment) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_free.invokeExact(
                    Interop.allocateNativeArray(array, false, SCOPE),
                    Marshal.booleanToInteger.marshal(freeSegment, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
}

/**
 * Transfers the data from the {@link ByteArray} into a new immutable {@link Bytes}.
 * <p>
 * The {@link ByteArray} is freed unless the reference count of {@code array} is greater
 * than one, the {@link ByteArray} wrapper is preserved but the size of {@code array}
 * will be set to zero.
 * <p>
 * This is identical to using g_bytes_new_take() and g_byte_array_free()
 * together.
 * @param array a {@link ByteArray}
 * @return a new immutable {@link Bytes} representing same
 *     byte data that was in the array
 */
public static org.gtk.glib.Bytes byteArrayFreeToBytes(byte[] array) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_free_to_bytes.invokeExact(Interop.allocateNativeArray(array, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Creates a new {@link ByteArray} with a reference count of 1.
 * @return the new {@link ByteArray}
 */
public static PointerByte byteArrayNew() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
}

/**
 * Create byte array containing the data. The data will be owned by the array
 * and will be freed with g_free(), i.e. it could be allocated using g_strdup().
 * <p>
 * Do not use it if {@code len} is greater than {@code G_MAXUINT}. {@link ByteArray}
 * stores the length of its data in {@code guint}, which may be shorter than
 * {@code gsize}.
 * @param data byte data for the array
 * @param len length of {@code data}
 * @return a new {@link ByteArray}
 */
public static PointerByte byteArrayNewTake(byte[] data, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_new_take.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
}

/**
 * Frees the data in the array and resets the size to zero, while
 * the underlying array is preserved for use elsewhere and returned
 * to the caller.
 * @param array a {@link ByteArray}.
 * @param len pointer to retrieve the number of
 *    elements of the original array
 * @return the element data, which should be
 *     freed using g_free().
 */
public static PointerByte byteArraySteal(byte[] array, Out<Long> len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment lenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_byte_array_steal.invokeExact(
                    Interop.allocateNativeArray(array, false, SCOPE),
                    (Addressable) (len == null ? MemoryAddress.NULL : (Addressable) lenPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (len != null) len.set(lenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new PointerByte(RESULT);
    }
}

/**
 * Atomically decrements the reference count of {@code array} by one. If the
 * reference count drops to 0, all memory allocated by the array is
 * released. This function is thread-safe and may be called from any
 * thread.
 * @param array A {@link ByteArray}
 */
public static void byteArrayUnref(byte[] array) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_byte_array_unref.invokeExact(Interop.allocateNativeArray(array, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * @param filename the name of the file
 * @param relativeTo the relative directory, or {@code null}
 * to use the current working directory
 * @return a newly allocated string with the
 * canonical file path
 */
public static java.lang.String canonicalizeFilename(java.lang.String filename, @Nullable java.lang.String relativeTo) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_canonicalize_filename.invokeExact(
                    Marshal.stringToAddress.marshal(filename, SCOPE),
                    (Addressable) (relativeTo == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(relativeTo, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * A wrapper for the POSIX chdir() function. The function changes the
 * current directory of the process to {@code path}.
 * <p>
 * See your C library manual for more details about chdir().
 * @param path a pathname in the GLib file name encoding
 *     (UTF-8 on Windows)
 * @return 0 on success, -1 if an error occurred.
 */
public static int chdir(java.lang.String path) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_chdir.invokeExact(Marshal.stringToAddress.marshal(path, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * @param requiredMajor the required major version
 * @param requiredMinor the required minor version
 * @param requiredMicro the required micro version
 * @return {@code null} if the GLib library is
 *   compatible with the given version, or a string describing the
 *   version mismatch. The returned string is owned by GLib and must
 *   not be modified or freed.
 */
public static @Nullable java.lang.String checkVersion(int requiredMajor, int requiredMinor, int requiredMicro) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.glib_check_version.invokeExact(
                requiredMajor,
                requiredMinor,
                requiredMicro);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Gets the length in bytes of digests of type {@code checksum_type}
 * @param checksumType a {@link ChecksumType}
 * @return the checksum length, or -1 if {@code checksum_type} is
 * not supported.
 */
public static long checksumTypeGetLength(org.gtk.glib.ChecksumType checksumType) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_checksum_type_get_length.invokeExact(checksumType.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param pid process id to watch. On POSIX the positive pid of a child
 *   process. On Windows a handle for a process (which doesn't have
 *   to be a child).
 * @param function function to call
 * @return the ID (greater than 0) of the event source.
 */
public static int childWatchAdd(org.gtk.glib.Pid pid, org.gtk.glib.ChildWatchFunc function) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_child_watch_add.invokeExact(
                pid.getValue().intValue(),
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param priority the priority of the idle source. Typically this will be in the
 *   range between {@code G_PRIORITY_DEFAULT_IDLE} and {@code G_PRIORITY_HIGH_IDLE}.
 * @param pid process to watch. On POSIX the positive pid of a child process. On
 * Windows a handle for a process (which doesn't have to be a child).
 * @param function function to call
 * @param notify function to call when the idle is removed, or {@code null}
 * @return the ID (greater than 0) of the event source.
 */
public static int childWatchAddFull(int priority, org.gtk.glib.Pid pid, org.gtk.glib.ChildWatchFunc function, @Nullable org.gtk.glib.DestroyNotify notify) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_child_watch_add_full.invokeExact(
                priority,
                pid.getValue().intValue(),
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param pid process to watch. On POSIX the positive pid of a child process. On
 * Windows a handle for a process (which doesn't have to be a child).
 * @return the newly-created child watch source
 */
public static org.gtk.glib.Source childWatchSourceNew(org.gtk.glib.Pid pid) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_child_watch_source_new.invokeExact(pid.getValue().intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Clears a numeric handler, such as a {@link Source} ID.
 * <p>
 * {@code tag_ptr} must be a valid pointer to the variable holding the handler.
 * <p>
 * If the ID is zero then this function does nothing.
 * Otherwise, clear_func() is called with the ID as a parameter, and the tag is
 * set to zero.
 * <p>
 * A macro is also included that allows this function to be used without
 * pointer casts.
 * @param tagPtr a pointer to the handler ID
 * @param clearFunc the function to call to clear the handler
 */
public static void clearHandleId(PointerInteger tagPtr, org.gtk.glib.ClearHandleFunc clearFunc) {
    try {
        DowncallHandles.g_clear_handle_id.invokeExact(
                tagPtr.handle(),
                (Addressable) clearFunc.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Clears a pointer to a {@link List}, freeing it and, optionally, freeing its elements using {@code destroy}.
 * <p>
 * {@code list_ptr} must be a valid pointer. If {@code list_ptr} points to a null {@link List}, this does nothing.
 * @param listPtr a {@link List} return location
 * @param destroy the function to pass to g_list_free_full() or {@code null} to not free elements
 */
public static void clearList(PointerProxy<org.gtk.glib.List> listPtr, @Nullable org.gtk.glib.DestroyNotify destroy) {
    try {
        DowncallHandles.g_clear_list.invokeExact(
                listPtr.handle(),
                (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Clears a reference to a variable.
 * <p>
 * {@code pp} must not be {@code null}.
 * <p>
 * If the reference is {@code null} then this function does nothing.
 * Otherwise, the variable is destroyed using {@code destroy} and the
 * pointer is set to {@code null}.
 * <p>
 * A macro is also included that allows this function to be used without
 * pointer casts. This will mask any warnings about incompatible function types
 * or calling conventions, so you must ensure that your {@code destroy} function is
 * compatible with being called as {@code GDestroyNotify} using the standard calling
 * convention for the platform that GLib was compiled for; otherwise the program
 * will experience undefined behaviour.
 * @param pp a pointer to a variable, struct member etc. holding a
 *    pointer
 * @param destroy a function to which a gpointer can be passed, to destroy *{@code pp}
 */
public static void clearPointer(java.lang.foreign.MemoryAddress pp, org.gtk.glib.DestroyNotify destroy) {
    try {
        DowncallHandles.g_clear_pointer.invokeExact(
                (Addressable) pp,
                (Addressable) destroy.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Clears a pointer to a {@link SList}, freeing it and, optionally, freeing its elements using {@code destroy}.
 * <p>
 * {@code slist_ptr} must be a valid pointer. If {@code slist_ptr} points to a null {@link SList}, this does nothing.
 * @param slistPtr a {@link SList} return location
 * @param destroy the function to pass to g_slist_free_full() or {@code null} to not free elements
 */
public static void clearSlist(PointerProxy<org.gtk.glib.SList> slistPtr, @Nullable org.gtk.glib.DestroyNotify destroy) {
    try {
        DowncallHandles.g_clear_slist.invokeExact(
                slistPtr.handle(),
                (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * This wraps the close() call; in case of error, {@code errno} will be
 * preserved, but the error will also be stored as a {@link Error} in {@code error}.
 * <p>
 * Besides using {@link Error}, there is another major reason to prefer this
 * function over the call provided by the system; on Unix, it will
 * attempt to correctly handle {@code EINTR}, which has platform-specific
 * semantics.
 * @param fd A file descriptor
 * @return {@code true} on success, {@code false} if there was an error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean close(int fd) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_close.invokeExact(fd,(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Computes the checksum for a binary {@code data}. This is a
 * convenience wrapper for g_checksum_new(), g_checksum_get_string()
 * and g_checksum_free().
 * <p>
 * The hexadecimal string returned will be in lower case.
 * @param checksumType a {@link ChecksumType}
 * @param data binary blob to compute the digest of
 * @return the digest of the binary data as a
 *   string in hexadecimal, or {@code null} if g_checksum_new() fails for
 *   {@code checksum_type}. The returned string should be freed with g_free() when
 *   done using it.
 */
public static @Nullable java.lang.String computeChecksumForBytes(org.gtk.glib.ChecksumType checksumType, org.gtk.glib.Bytes data) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_compute_checksum_for_bytes.invokeExact(
                checksumType.getValue(),
                data.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Computes the checksum for a binary {@code data} of {@code length}. This is a
 * convenience wrapper for g_checksum_new(), g_checksum_get_string()
 * and g_checksum_free().
 * <p>
 * The hexadecimal string returned will be in lower case.
 * @param checksumType a {@link ChecksumType}
 * @param data binary blob to compute the digest of
 * @param length length of {@code data}
 * @return the digest of the binary data as a
 *   string in hexadecimal, or {@code null} if g_checksum_new() fails for
 *   {@code checksum_type}. The returned string should be freed with g_free() when
 *   done using it.
 */
public static @Nullable java.lang.String computeChecksumForData(org.gtk.glib.ChecksumType checksumType, byte[] data, long length) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_compute_checksum_for_data.invokeExact(
                    checksumType.getValue(),
                    Interop.allocateNativeArray(data, false, SCOPE),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Computes the checksum of a string.
 * <p>
 * The hexadecimal string returned will be in lower case.
 * @param checksumType a {@link ChecksumType}
 * @param str the string to compute the checksum of
 * @param length the length of the string, or -1 if the string is null-terminated.
 * @return the checksum as a hexadecimal string,
 *   or {@code null} if g_checksum_new() fails for {@code checksum_type}. The returned string
 *   should be freed with g_free() when done using it.
 */
public static @Nullable java.lang.String computeChecksumForString(org.gtk.glib.ChecksumType checksumType, java.lang.String str, long length) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_compute_checksum_for_string.invokeExact(
                    checksumType.getValue(),
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Computes the HMAC for a binary {@code data}. This is a
 * convenience wrapper for g_hmac_new(), g_hmac_get_string()
 * and g_hmac_unref().
 * <p>
 * The hexadecimal string returned will be in lower case.
 * @param digestType a {@link ChecksumType} to use for the HMAC
 * @param key the key to use in the HMAC
 * @param data binary blob to compute the HMAC of
 * @return the HMAC of the binary data as a string in hexadecimal.
 *   The returned string should be freed with g_free() when done using it.
 */
public static java.lang.String computeHmacForBytes(org.gtk.glib.ChecksumType digestType, org.gtk.glib.Bytes key, org.gtk.glib.Bytes data) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_compute_hmac_for_bytes.invokeExact(
                digestType.getValue(),
                key.handle(),
                data.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Computes the HMAC for a binary {@code data} of {@code length}. This is a
 * convenience wrapper for g_hmac_new(), g_hmac_get_string()
 * and g_hmac_unref().
 * <p>
 * The hexadecimal string returned will be in lower case.
 * @param digestType a {@link ChecksumType} to use for the HMAC
 * @param key the key to use in the HMAC
 * @param keyLen the length of the key
 * @param data binary blob to compute the HMAC of
 * @param length length of {@code data}
 * @return the HMAC of the binary data as a string in hexadecimal.
 *   The returned string should be freed with g_free() when done using it.
 */
public static java.lang.String computeHmacForData(org.gtk.glib.ChecksumType digestType, byte[] key, long keyLen, byte[] data, long length) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_compute_hmac_for_data.invokeExact(
                    digestType.getValue(),
                    Interop.allocateNativeArray(key, false, SCOPE),
                    keyLen,
                    Interop.allocateNativeArray(data, false, SCOPE),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Computes the HMAC for a string.
 * <p>
 * The hexadecimal string returned will be in lower case.
 * @param digestType a {@link ChecksumType} to use for the HMAC
 * @param key the key to use in the HMAC
 * @param keyLen the length of the key
 * @param str the string to compute the HMAC for
 * @param length the length of the string, or -1 if the string is nul-terminated
 * @return the HMAC as a hexadecimal string.
 *     The returned string should be freed with g_free()
 *     when done using it.
 */
public static java.lang.String computeHmacForString(org.gtk.glib.ChecksumType digestType, byte[] key, long keyLen, java.lang.String str, long length) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_compute_hmac_for_string.invokeExact(
                    digestType.getValue(),
                    Interop.allocateNativeArray(key, false, SCOPE),
                    keyLen,
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param str the string to convert.
 * @param len the length of the string in bytes, or -1 if the string is
 *                 nul-terminated (Note that some encodings may allow nul
 *                 bytes to occur inside strings. In that case, using -1
 *                 for the {@code len} parameter is unsafe)
 * @param toCodeset name of character set into which to convert {@code str}
 * @param fromCodeset character set of {@code str}.
 * @param bytesRead location to store the number of bytes in
 *                 the input string that were successfully converted, or {@code null}.
 *                 Even if the conversion was successful, this may be
 *                 less than {@code len} if there were partial characters
 *                 at the end of the input. If the error
 *                 {@link ConvertError#ILLEGAL_SEQUENCE} occurs, the value
 *                 stored will be the byte offset after the last valid
 *                 input sequence.
 * @param bytesWritten the number of bytes stored in
 *                 the output buffer (not including the terminating nul).
 * @return If the conversion was successful, a newly allocated buffer
 *          containing the converted string, which must be freed with g_free().
 *          Otherwise {@code null} and {@code error} will be set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static byte[] convert(byte[] str, long len, java.lang.String toCodeset, java.lang.String fromCodeset, Out<Long> bytesRead, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment bytesReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_convert.invokeExact(
                    Interop.allocateNativeArray(str, false, SCOPE),
                    len,
                    Marshal.stringToAddress.marshal(toCodeset, SCOPE),
                    Marshal.stringToAddress.marshal(fromCodeset, SCOPE),
                    (Addressable) (bytesRead == null ? MemoryAddress.NULL : (Addressable) bytesReadPOINTER.address()),
                    (Addressable) (bytesWritten == null ? MemoryAddress.NULL : (Addressable) bytesWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (bytesRead != null) bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (bytesWritten != null) bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), bytesWritten.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE);
    }
}

public static org.gtk.glib.Quark convertErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_convert_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

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
 * @param str the string to convert.
 * @param len the length of the string in bytes, or -1 if the string is
 *                 nul-terminated (Note that some encodings may allow nul
 *                 bytes to occur inside strings. In that case, using -1
 *                 for the {@code len} parameter is unsafe)
 * @param toCodeset name of character set into which to convert {@code str}
 * @param fromCodeset character set of {@code str}.
 * @param fallback UTF-8 string to use in place of characters not
 *                present in the target encoding. (The string must be
 *                representable in the target encoding).
 *                If {@code null}, characters not in the target encoding will
 *                be represented as Unicode escapes \\uxxxx or \\Uxxxxyyyy.
 * @param bytesRead location to store the number of bytes in
 *                the input string that were successfully converted, or {@code null}.
 *                Even if the conversion was successful, this may be
 *                less than {@code len} if there were partial characters
 *                at the end of the input.
 * @param bytesWritten the number of bytes stored in
 *                 the output buffer (not including the terminating nul).
 * @return If the conversion was successful, a newly allocated buffer
 *          containing the converted string, which must be freed with g_free().
 *          Otherwise {@code null} and {@code error} will be set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static byte[] convertWithFallback(byte[] str, long len, java.lang.String toCodeset, java.lang.String fromCodeset, java.lang.String fallback, Out<Long> bytesRead, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment bytesReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_convert_with_fallback.invokeExact(
                    Interop.allocateNativeArray(str, false, SCOPE),
                    len,
                    Marshal.stringToAddress.marshal(toCodeset, SCOPE),
                    Marshal.stringToAddress.marshal(fromCodeset, SCOPE),
                    Marshal.stringToAddress.marshal(fallback, SCOPE),
                    (Addressable) (bytesRead == null ? MemoryAddress.NULL : (Addressable) bytesReadPOINTER.address()),
                    (Addressable) (bytesWritten == null ? MemoryAddress.NULL : (Addressable) bytesWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (bytesRead != null) bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (bytesWritten != null) bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), bytesWritten.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE);
    }
}

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
 * @param str the string to convert.
 * @param len the length of the string in bytes, or -1 if the string is
 *                 nul-terminated (Note that some encodings may allow nul
 *                 bytes to occur inside strings. In that case, using -1
 *                 for the {@code len} parameter is unsafe)
 * @param converter conversion descriptor from g_iconv_open()
 * @param bytesRead location to store the number of bytes in
 *                 the input string that were successfully converted, or {@code null}.
 *                 Even if the conversion was successful, this may be
 *                 less than {@code len} if there were partial characters
 *                 at the end of the input. If the error
 *                 {@link ConvertError#ILLEGAL_SEQUENCE} occurs, the value
 *                 stored will be the byte offset after the last valid
 *                 input sequence.
 * @param bytesWritten the number of bytes stored in
 *                 the output buffer (not including the terminating nul).
 * @return If the conversion was successful, a newly allocated buffer
 *               containing the converted string, which must be freed with
 *               g_free(). Otherwise {@code null} and {@code error} will be set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static byte[] convertWithIconv(byte[] str, long len, org.gtk.glib.IConv converter, Out<Long> bytesRead, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment bytesReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_convert_with_iconv.invokeExact(
                    Interop.allocateNativeArray(str, false, SCOPE),
                    len,
                    converter.handle(),
                    (Addressable) (bytesRead == null ? MemoryAddress.NULL : (Addressable) bytesReadPOINTER.address()),
                    (Addressable) (bytesWritten == null ? MemoryAddress.NULL : (Addressable) bytesWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (bytesRead != null) bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (bytesWritten != null) bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), bytesWritten.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE);
    }
}

/**
 * Frees all the data elements of the datalist.
 * The data elements' destroy functions are called
 * if they have been set.
 * @param datalist a datalist.
 */
public static void datalistClear(PointerProxy<org.gtk.glib.Data> datalist) {
    try {
        DowncallHandles.g_datalist_clear.invokeExact(datalist.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param datalist a datalist.
 * @param func the function to call for each data element.
 */
public static void datalistForeach(PointerProxy<org.gtk.glib.Data> datalist, org.gtk.glib.DataForeachFunc func) {
    try {
        DowncallHandles.g_datalist_foreach.invokeExact(
                datalist.handle(),
                (Addressable) func.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Gets a data element, using its string identifier. This is slower than
 * g_datalist_id_get_data() because it compares strings.
 * @param datalist a datalist.
 * @param key the string identifying a data element.
 * @return the data element, or {@code null} if it
 *          is not found.
 */
public static @Nullable java.lang.foreign.MemoryAddress datalistGetData(PointerProxy<org.gtk.glib.Data> datalist, java.lang.String key) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_datalist_get_data.invokeExact(
                    datalist.handle(),
                    Marshal.stringToAddress.marshal(key, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Gets flags values packed in together with the datalist.
 * See g_datalist_set_flags().
 * @param datalist pointer to the location that holds a list
 * @return the flags of the datalist
 */
public static int datalistGetFlags(PointerProxy<org.gtk.glib.Data> datalist) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_datalist_get_flags.invokeExact(datalist.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param datalist location of a datalist
 * @param keyId the {@link Quark} identifying a data element
 * @param dupFunc function to duplicate the old value
 * @return the result of calling {@code dup_func} on the value
 *     associated with {@code key_id} in {@code datalist}, or {@code null} if not set.
 *     If {@code dup_func} is {@code null}, the value is returned unmodified.
 */
public static @Nullable java.lang.foreign.MemoryAddress datalistIdDupData(PointerProxy<org.gtk.glib.Data> datalist, org.gtk.glib.Quark keyId, @Nullable org.gtk.glib.DuplicateFunc dupFunc) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_datalist_id_dup_data.invokeExact(
                datalist.handle(),
                keyId.getValue().intValue(),
                (Addressable) (dupFunc == null ? MemoryAddress.NULL : (Addressable) dupFunc.toCallback()),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Retrieves the data element corresponding to {@code key_id}.
 * @param datalist a datalist.
 * @param keyId the {@link Quark} identifying a data element.
 * @return the data element, or {@code null} if
 *          it is not found.
 */
public static @Nullable java.lang.foreign.MemoryAddress datalistIdGetData(PointerProxy<org.gtk.glib.Data> datalist, org.gtk.glib.Quark keyId) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_datalist_id_get_data.invokeExact(
                datalist.handle(),
                keyId.getValue().intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Removes multiple keys from a datalist.
 * <p>
 * This is more efficient than calling g_datalist_id_remove_data()
 * multiple times in a row.
 * @param datalist a datalist
 * @param keys keys to remove
 * @param nKeys length of {@code keys}, must be &lt;= 16
 */
public static void datalistIdRemoveMultiple(PointerProxy<org.gtk.glib.Data> datalist, org.gtk.glib.Quark[] keys, long nKeys) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_datalist_id_remove_multiple.invokeExact(
                    datalist.handle(),
                    Interop.allocateNativeArray(org.gtk.glib.Quark.getIntegerValues(keys), false, SCOPE),
                    nKeys);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Removes an element, without calling its destroy notification
 * function.
 * @param datalist a datalist.
 * @param keyId the {@link Quark} identifying a data element.
 * @return the data previously stored at {@code key_id},
 *          or {@code null} if none.
 */
public static @Nullable java.lang.foreign.MemoryAddress datalistIdRemoveNoNotify(PointerProxy<org.gtk.glib.Data> datalist, org.gtk.glib.Quark keyId) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_datalist_id_remove_no_notify.invokeExact(
                datalist.handle(),
                keyId.getValue().intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Compares the member that is associated with {@code key_id} in
 * {@code datalist} to {@code oldval}, and if they are the same, replace
 * {@code oldval} with {@code newval}.
 * <p>
 * This is like a typical atomic compare-and-exchange
 * operation, for a member of {@code datalist}.
 * <p>
 * If the previous value was replaced then ownership of the
 * old value ({@code oldval}) is passed to the caller, including
 * the registered destroy notify for it (passed out in {@code old_destroy}).
 * Its up to the caller to free this as they wish, which may
 * or may not include using {@code old_destroy} as sometimes replacement
 * should not destroy the object in the normal way.
 * @param datalist location of a datalist
 * @param keyId the {@link Quark} identifying a data element
 * @param oldval the old value to compare against
 * @param newval the new value to replace it with
 * @param destroy destroy notify for the new value
 * @param oldDestroy destroy notify for the existing value
 * @return {@code true} if the existing value for {@code key_id} was replaced
 *  by {@code newval}, {@code false} otherwise.
 */
public static boolean datalistIdReplaceData(PointerProxy<org.gtk.glib.Data> datalist, org.gtk.glib.Quark keyId, @Nullable java.lang.foreign.MemoryAddress oldval, @Nullable java.lang.foreign.MemoryAddress newval, @Nullable org.gtk.glib.DestroyNotify destroy, @Nullable Out<org.gtk.glib.DestroyNotify> oldDestroy) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment oldDestroyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_datalist_id_replace_data.invokeExact(
                    datalist.handle(),
                    keyId.getValue().intValue(),
                    (Addressable) (oldval == null ? MemoryAddress.NULL : (Addressable) oldval),
                    (Addressable) (newval == null ? MemoryAddress.NULL : (Addressable) newval),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    (Addressable) (oldDestroy == null ? MemoryAddress.NULL : (Addressable) oldDestroyPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (oldDestroy != null) oldDestroy.set(null /* Unsupported parameter type */);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Sets the data corresponding to the given {@link Quark} id, and the
 * function to be called when the element is removed from the datalist.
 * Any previous data with the same key is removed, and its destroy
 * function is called.
 * @param datalist a datalist.
 * @param keyId the {@link Quark} to identify the data element.
 * @param destroyFunc the function to call when the data element is
 *                removed. This function will be called with the data
 *                element and can be used to free any memory allocated
 *                for it. If {@code data} is {@code null}, then {@code destroy_func} must
 *                also be {@code null}.
 */
public static void datalistIdSetDataFull(PointerProxy<org.gtk.glib.Data> datalist, org.gtk.glib.Quark keyId, @Nullable org.gtk.glib.DestroyNotify destroyFunc) {
    try {
        DowncallHandles.g_datalist_id_set_data_full.invokeExact(
                datalist.handle(),
                keyId.getValue().intValue(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) (destroyFunc == null ? MemoryAddress.NULL : (Addressable) destroyFunc.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Resets the datalist to {@code null}. It does not free any memory or call
 * any destroy functions.
 * @param datalist a pointer to a pointer to a datalist.
 */
public static void datalistInit(PointerProxy<org.gtk.glib.Data> datalist) {
    try {
        DowncallHandles.g_datalist_init.invokeExact(datalist.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Turns on flag values for a data list. This function is used
 * to keep a small number of boolean flags in an object with
 * a data list without using any additional space. It is
 * not generally useful except in circumstances where space
 * is very tight. (It is used in the base {@link org.gtk.gobject.GObject} type, for
 * example.)
 * @param datalist pointer to the location that holds a list
 * @param flags the flags to turn on. The values of the flags are
 *   restricted by {@code G_DATALIST_FLAGS_MASK} (currently
 *   3; giving two possible boolean flags).
 *   A value for {@code flags} that doesn't fit within the mask is
 *   an error.
 */
public static void datalistSetFlags(PointerProxy<org.gtk.glib.Data> datalist, int flags) {
    try {
        DowncallHandles.g_datalist_set_flags.invokeExact(
                datalist.handle(),
                flags);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Turns off flag values for a data list. See g_datalist_unset_flags()
 * @param datalist pointer to the location that holds a list
 * @param flags the flags to turn off. The values of the flags are
 *   restricted by {@code G_DATALIST_FLAGS_MASK} (currently
 *   3: giving two possible boolean flags).
 *   A value for {@code flags} that doesn't fit within the mask is
 *   an error.
 */
public static void datalistUnsetFlags(PointerProxy<org.gtk.glib.Data> datalist, int flags) {
    try {
        DowncallHandles.g_datalist_unset_flags.invokeExact(
                datalist.handle(),
                flags);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Destroys the dataset, freeing all memory allocated, and calling any
 * destroy functions set for data elements.
 * @param datasetLocation the location identifying the dataset.
 */
public static void datasetDestroy(java.lang.foreign.MemoryAddress datasetLocation) {
    try {
        DowncallHandles.g_dataset_destroy.invokeExact((Addressable) datasetLocation);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Calls the given function for each data element which is associated
 * with the given location. Note that this function is NOT thread-safe.
 * So unless {@code dataset_location} can be protected from any modifications
 * during invocation of this function, it should not be called.
 * <p>
 * {@code func} can make changes to the dataset, but the iteration will not
 * reflect changes made during the g_dataset_foreach() call, other
 * than skipping over elements that are removed.
 * @param datasetLocation the location identifying the dataset.
 * @param func the function to call for each data element.
 */
public static void datasetForeach(java.lang.foreign.MemoryAddress datasetLocation, org.gtk.glib.DataForeachFunc func) {
    try {
        DowncallHandles.g_dataset_foreach.invokeExact(
                (Addressable) datasetLocation,
                (Addressable) func.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Gets the data element corresponding to a {@link Quark}.
 * @param datasetLocation the location identifying the dataset.
 * @param keyId the {@link Quark} id to identify the data element.
 * @return the data element corresponding to
 *          the {@link Quark}, or {@code null} if it is not found.
 */
public static @Nullable java.lang.foreign.MemoryAddress datasetIdGetData(java.lang.foreign.MemoryAddress datasetLocation, org.gtk.glib.Quark keyId) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_dataset_id_get_data.invokeExact(
                (Addressable) datasetLocation,
                keyId.getValue().intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Removes an element, without calling its destroy notification
 * function.
 * @param datasetLocation the location identifying the dataset.
 * @param keyId the {@link Quark} ID identifying the data element.
 * @return the data previously stored at {@code key_id},
 *          or {@code null} if none.
 */
public static @Nullable java.lang.foreign.MemoryAddress datasetIdRemoveNoNotify(java.lang.foreign.MemoryAddress datasetLocation, org.gtk.glib.Quark keyId) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_dataset_id_remove_no_notify.invokeExact(
                (Addressable) datasetLocation,
                keyId.getValue().intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Sets the data element associated with the given {@link Quark} id, and also
 * the function to call when the data element is destroyed. Any
 * previous data with the same key is removed, and its destroy function
 * is called.
 * @param datasetLocation the location identifying the dataset.
 * @param keyId the {@link Quark} id to identify the data element.
 * @param destroyFunc the function to call when the data element is
 *                removed. This function will be called with the data
 *                element and can be used to free any memory allocated
 *                for it.
 */
public static void datasetIdSetDataFull(java.lang.foreign.MemoryAddress datasetLocation, org.gtk.glib.Quark keyId, org.gtk.glib.DestroyNotify destroyFunc) {
    try {
        DowncallHandles.g_dataset_id_set_data_full.invokeExact(
                (Addressable) datasetLocation,
                keyId.getValue().intValue(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) destroyFunc.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Returns the number of days in a month, taking leap
 * years into account.
 * @param month month
 * @param year year
 * @return number of days in {@code month} during the {@code year}
 */
public static byte dateGetDaysInMonth(org.gtk.glib.DateMonth month, org.gtk.glib.DateYear year) {
    byte RESULT;
    try {
        RESULT = (byte) DowncallHandles.g_date_get_days_in_month.invokeExact(
                month.getValue(),
                year.getValue().shortValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns the number of weeks in the year, where weeks
 * are taken to start on Monday. Will be 52 or 53. The
 * date must be valid. (Years always have 52 7-day periods,
 * plus 1 or 2 extra days depending on whether it's a leap
 * year. This function is basically telling you how many
 * Mondays are in the year, i.e. there are 53 Mondays if
 * one of the extra days happens to be a Monday.)
 * @param year a year
 * @return number of Mondays in the year
 */
public static byte dateGetMondayWeeksInYear(org.gtk.glib.DateYear year) {
    byte RESULT;
    try {
        RESULT = (byte) DowncallHandles.g_date_get_monday_weeks_in_year.invokeExact(year.getValue().shortValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns the number of weeks in the year, where weeks
 * are taken to start on Sunday. Will be 52 or 53. The
 * date must be valid. (Years always have 52 7-day periods,
 * plus 1 or 2 extra days depending on whether it's a leap
 * year. This function is basically telling you how many
 * Sundays are in the year, i.e. there are 53 Sundays if
 * one of the extra days happens to be a Sunday.)
 * @param year year to count weeks in
 * @return the number of weeks in {@code year}
 */
public static byte dateGetSundayWeeksInYear(org.gtk.glib.DateYear year) {
    byte RESULT;
    try {
        RESULT = (byte) DowncallHandles.g_date_get_sunday_weeks_in_year.invokeExact(year.getValue().shortValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns {@code true} if the year is a leap year.
 * <p>
 * For the purposes of this function, leap year is every year
 * divisible by 4 unless that year is divisible by 100. If it
 * is divisible by 100 it would be a leap year only if that year
 * is also divisible by 400.
 * @param year year to check
 * @return {@code true} if the year is a leap year
 */
public static boolean dateIsLeapYear(org.gtk.glib.DateYear year) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_date_is_leap_year.invokeExact(year.getValue().shortValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

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
 * @param s destination buffer
 * @param slen buffer size
 * @param format format string
 * @param date valid {@link Date}
 * @return number of characters written to the buffer, or 0 the buffer was too small
 */
public static long dateStrftime(java.lang.String s, long slen, java.lang.String format, org.gtk.glib.Date date) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_date_strftime.invokeExact(
                    Marshal.stringToAddress.marshal(s, SCOPE),
                    slen,
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    date.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Returns {@code true} if the day of the month is valid (a day is valid if it's
 * between 1 and 31 inclusive).
 * @param day day to check
 * @return {@code true} if the day is valid
 */
public static boolean dateValidDay(org.gtk.glib.DateDay day) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_date_valid_day.invokeExact(day.getValue().byteValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Returns {@code true} if the day-month-year triplet forms a valid, existing day
 * in the range of days {@link Date} understands (Year 1 or later, no more than
 * a few thousand years in the future).
 * @param day day
 * @param month month
 * @param year year
 * @return {@code true} if the date is a valid one
 */
public static boolean dateValidDmy(org.gtk.glib.DateDay day, org.gtk.glib.DateMonth month, org.gtk.glib.DateYear year) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_date_valid_dmy.invokeExact(
                day.getValue().byteValue(),
                month.getValue(),
                year.getValue().shortValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Returns {@code true} if the Julian day is valid. Anything greater than zero
 * is basically a valid Julian, though there is a 32-bit limit.
 * @param julianDate Julian day to check
 * @return {@code true} if the Julian day is valid
 */
public static boolean dateValidJulian(int julianDate) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_date_valid_julian.invokeExact(julianDate);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Returns {@code true} if the month value is valid. The 12 {@link DateMonth}
 * enumeration values are the only valid months.
 * @param month month
 * @return {@code true} if the month is valid
 */
public static boolean dateValidMonth(org.gtk.glib.DateMonth month) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_date_valid_month.invokeExact(month.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Returns {@code true} if the weekday is valid. The seven {@link DateWeekday} enumeration
 * values are the only valid weekdays.
 * @param weekday weekday
 * @return {@code true} if the weekday is valid
 */
public static boolean dateValidWeekday(org.gtk.glib.DateWeekday weekday) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_date_valid_weekday.invokeExact(weekday.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Returns {@code true} if the year is valid. Any year greater than 0 is valid,
 * though there is a 16-bit limit to what {@link Date} will understand.
 * @param year year
 * @return {@code true} if the year is valid
 */
public static boolean dateValidYear(org.gtk.glib.DateYear year) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_date_valid_year.invokeExact(year.getValue().shortValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * This is a variant of g_dgettext() that allows specifying a locale
 * category instead of always using {@code LC_MESSAGES}. See g_dgettext() for
 * more information about how this functions differs from calling
 * dcgettext() directly.
 * @param domain the translation domain to use, or {@code null} to use
 *   the domain set with textdomain()
 * @param msgid message to translate
 * @param category a locale category
 * @return the translated string for the given locale category
 */
public static java.lang.String dcgettext(@Nullable java.lang.String domain, java.lang.String msgid, int category) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dcgettext.invokeExact(
                    (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)),
                    Marshal.stringToAddress.marshal(msgid, SCOPE),
                    category);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * <ul>
 * <li>{@code domain} is not {@code null}
 * </ul>
 * <ul>
 * <li>textdomain() has been called to set a default text domain
 * </ul>
 * <ul>
 * <li>there is no translations available for the default text domain
 *   and the current locale
 * </ul>
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
 * @param domain the translation domain to use, or {@code null} to use
 *   the domain set with textdomain()
 * @param msgid message to translate
 * @return The translated string
 */
public static java.lang.String dgettext(@Nullable java.lang.String domain, java.lang.String msgid) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dgettext.invokeExact(
                    (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)),
                    Marshal.stringToAddress.marshal(msgid, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param tmpl Template for directory name,
 *     as in g_mkdtemp(), basename only, or {@code null} for a default template
 * @return The actual name used. This string
 *     should be freed with g_free() when not needed any longer and is
 *     is in the GLib file name encoding. In case of errors, {@code null} is
 *     returned and {@code error} will be set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String dirMakeTmp(@Nullable java.lang.String tmpl) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dir_make_tmp.invokeExact((Addressable) (tmpl == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(tmpl, SCOPE)),(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Compares two {@code gpointer} arguments and returns {@code true} if they are equal.
 * It can be passed to g_hash_table_new() as the {@code key_equal_func}
 * parameter, when using opaque pointers compared by pointer value as
 * keys in a {@link HashTable}.
 * <p>
 * This equality function is also appropriate for keys that are integers
 * stored in pointers, such as {@code GINT_TO_POINTER (n)}.
 * @param v1 a key
 * @param v2 a key to compare with {@code v1}
 * @return {@code true} if the two keys match.
 */
public static boolean directEqual(@Nullable java.lang.foreign.MemoryAddress v1, @Nullable java.lang.foreign.MemoryAddress v2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_direct_equal.invokeExact(
                (Addressable) (v1 == null ? MemoryAddress.NULL : (Addressable) v1),
                (Addressable) (v2 == null ? MemoryAddress.NULL : (Addressable) v2));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Converts a gpointer to a hash value.
 * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
 * when using opaque pointers compared by pointer value as keys in a
 * {@link HashTable}.
 * <p>
 * This hash function is also appropriate for keys that are integers
 * stored in pointers, such as {@code GINT_TO_POINTER (n)}.
 * @param v a {@code gpointer} key
 * @return a hash value corresponding to the key.
 */
public static int directHash(@Nullable java.lang.foreign.MemoryAddress v) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_direct_hash.invokeExact((Addressable) (v == null ? MemoryAddress.NULL : (Addressable) v));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * This function is a wrapper of dngettext() which does not translate
 * the message if the default domain as set with textdomain() has no
 * translations for the current locale.
 * <p>
 * See g_dgettext() for details of how this differs from dngettext()
 * proper.
 * @param domain the translation domain to use, or {@code null} to use
 *   the domain set with textdomain()
 * @param msgid message to translate
 * @param msgidPlural plural form of the message
 * @param n the quantity for which translation is needed
 * @return The translated string
 */
public static java.lang.String dngettext(@Nullable java.lang.String domain, java.lang.String msgid, java.lang.String msgidPlural, long n) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dngettext.invokeExact(
                    (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)),
                    Marshal.stringToAddress.marshal(msgid, SCOPE),
                    Marshal.stringToAddress.marshal(msgidPlural, SCOPE),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Compares the two {@code gdouble} values being pointed to and returns
 * {@code true} if they are equal.
 * It can be passed to g_hash_table_new() as the {@code key_equal_func}
 * parameter, when using non-{@code null} pointers to doubles as keys in a
 * {@link HashTable}.
 * @param v1 a pointer to a {@code gdouble} key
 * @param v2 a pointer to a {@code gdouble} key to compare with {@code v1}
 * @return {@code true} if the two keys match.
 */
public static boolean doubleEqual(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_double_equal.invokeExact(
                (Addressable) v1,
                (Addressable) v2);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Converts a pointer to a {@code gdouble} to a hash value.
 * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
 * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
 * when using non-{@code null} pointers to doubles as keys in a {@link HashTable}.
 * @param v a pointer to a {@code gdouble} key
 * @return a hash value corresponding to the key.
 */
public static int doubleHash(java.lang.foreign.MemoryAddress v) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_double_hash.invokeExact((Addressable) v);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param domain the translation domain to use, or {@code null} to use
 *   the domain set with textdomain()
 * @param msgctxtid a combined message context and message id, separated
 *   by a \\004 character
 * @param msgidoffset the offset of the message id in {@code msgctxid}
 * @return The translated string
 */
public static java.lang.String dpgettext(@Nullable java.lang.String domain, java.lang.String msgctxtid, long msgidoffset) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dpgettext.invokeExact(
                    (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)),
                    Marshal.stringToAddress.marshal(msgctxtid, SCOPE),
                    msgidoffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param domain the translation domain to use, or {@code null} to use
 *   the domain set with textdomain()
 * @param context the message context
 * @param msgid the message
 * @return The translated string
 */
public static java.lang.String dpgettext2(@Nullable java.lang.String domain, java.lang.String context, java.lang.String msgid) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dpgettext2.invokeExact(
                    (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)),
                    Marshal.stringToAddress.marshal(context, SCOPE),
                    Marshal.stringToAddress.marshal(msgid, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Returns the value of the environment variable {@code variable} in the
 * provided list {@code envp}.
 * @param envp an environment list (eg, as returned from g_get_environ()), or {@code null}
 *     for an empty environment list
 * @param variable the environment variable to get
 * @return the value of the environment variable, or {@code null} if
 *     the environment variable is not set in {@code envp}. The returned
 *     string is owned by {@code envp}, and will be freed if {@code variable} is
 *     set or unset again.
 */
public static @Nullable java.lang.String environGetenv(@Nullable java.lang.String[] envp, java.lang.String variable) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_environ_getenv.invokeExact(
                    (Addressable) (envp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envp, false, SCOPE)),
                    Marshal.stringToAddress.marshal(variable, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Sets the environment variable {@code variable} in the provided list
 * {@code envp} to {@code value}.
 * @param envp an environment list that can be freed using g_strfreev() (e.g., as
 *     returned from g_get_environ()), or {@code null} for an empty
 *     environment list
 * @param variable the environment variable to set, must not
 *     contain '='
 * @param value the value for to set the variable to
 * @param overwrite whether to change the variable if it already exists
 * @return the updated environment list. Free it using g_strfreev().
 */
public static PointerString environSetenv(@Nullable java.lang.String[] envp, java.lang.String variable, java.lang.String value, boolean overwrite) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_environ_setenv.invokeExact(
                    (Addressable) (envp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envp, false, SCOPE)),
                    Marshal.stringToAddress.marshal(variable, SCOPE),
                    Marshal.stringToAddress.marshal(value, SCOPE),
                    Marshal.booleanToInteger.marshal(overwrite, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

/**
 * Removes the environment variable {@code variable} from the provided
 * environment {@code envp}.
 * @param envp an environment list that can be freed using g_strfreev() (e.g., as
 *     returned from g_get_environ()), or {@code null} for an empty environment list
 * @param variable the environment variable to remove, must not
 *     contain '='
 * @return the updated environment list. Free it using g_strfreev().
 */
public static PointerString environUnsetenv(@Nullable java.lang.String[] envp, java.lang.String variable) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_environ_unsetenv.invokeExact(
                    (Addressable) (envp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envp, false, SCOPE)),
                    Marshal.stringToAddress.marshal(variable, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * @param errNo an "errno" value
 * @return {@link FileError} corresponding to the given {@code err_no}
 */
public static org.gtk.glib.FileError fileErrorFromErrno(int errNo) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_file_error_from_errno.invokeExact(errNo);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.FileError.of(RESULT);
}

public static org.gtk.glib.Quark fileErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_file_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

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
 * @param filename name of a file to read contents from, in the GLib file name encoding
 * @param contents location to store an allocated string, use g_free() to free
 *     the returned string
 * @param length location to store length in bytes of the contents, or {@code null}
 * @return {@code true} on success, {@code false} if an error occurred
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean fileGetContents(java.lang.String filename, Out<byte[]> contents, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment contentsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_get_contents.invokeExact(
                    Marshal.stringToAddress.marshal(filename, SCOPE),
                    (Addressable) contentsPOINTER.address(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
        contents.set(MemorySegment.ofAddress(contentsPOINTER.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param tmpl Template for file name, as in
 *     g_mkstemp(), basename only, or {@code null} for a default template
 * @param nameUsed location to store actual name used,
 *     or {@code null}
 * @return A file handle (as from open()) to the file opened for
 *     reading and writing. The file is opened in binary mode on platforms
 *     where there is a difference. The file handle should be closed with
 *     close(). In case of errors, -1 is returned and {@code error} will be set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static int fileOpenTmp(@Nullable java.lang.String tmpl, Out<java.lang.String> nameUsed) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment nameUsedPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_open_tmp.invokeExact(
                    (Addressable) (tmpl == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(tmpl, SCOPE)),
                    (Addressable) nameUsedPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                nameUsed.set(Marshal.addressToString.marshal(nameUsedPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return RESULT;
    }
}

/**
 * Reads the contents of the symbolic link {@code filename} like the POSIX
 * readlink() function.  The returned string is in the encoding used
 * for filenames. Use g_filename_to_utf8() to convert it to UTF-8.
 * @param filename the symbolic link
 * @return A newly-allocated string with
 *     the contents of the symbolic link, or {@code null} if an error occurred.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String fileReadLink(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_read_link.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE),(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Writes all of {@code contents} to a file named {@code filename}. This is a convenience
 * wrapper around calling g_file_set_contents_full() with {@code flags} set to
 * {@code G_FILE_SET_CONTENTS_CONSISTENT | G_FILE_SET_CONTENTS_ONLY_EXISTING} and
 * {@code mode} set to {@code 0666}.
 * @param filename name of a file to write {@code contents} to, in the GLib file name
 *   encoding
 * @param contents string to write to the file
 * @param length length of {@code contents}, or -1 if {@code contents} is a nul-terminated string
 * @return {@code true} on success, {@code false} if an error occurred
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean fileSetContents(java.lang.String filename, byte[] contents, long length) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_contents.invokeExact(
                    Marshal.stringToAddress.marshal(filename, SCOPE),
                    Interop.allocateNativeArray(contents, false, SCOPE),
                    length,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Writes all of {@code contents} to a file named {@code filename}, with good error checking.
 * If a file called {@code filename} already exists it will be overwritten.
 * <p>
 * {@code flags} control the properties of the write operation: whether it???s atomic,
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
 * <ul>
 * <li>On UNIX, if {@code filename} already exists hard links to {@code filename} will break.
 *   Also since the file is recreated, existing permissions, access control
 *   lists, metadata etc. may be lost. If {@code filename} is a symbolic link,
 *   the link itself will be replaced, not the linked file.
 * </ul>
 * <ul>
 * <li>On UNIX, if {@code filename} already exists and is non-empty, and if the system
 *   supports it (via a journalling filesystem or equivalent), and if
 *   {@link FileSetContentsFlags#CONSISTENT} is set in {@code flags}, the {@code fsync()} call (or
 *   equivalent) will be used to ensure atomic replacement: {@code filename}
 *   will contain either its old contents or {@code contents}, even in the face of
 *   system power loss, the disk being unsafely removed, etc.
 * </ul>
 * <ul>
 * <li>On UNIX, if {@code filename} does not already exist or is empty, there is a
 *   possibility that system power loss etc. after calling this function will
 *   leave {@code filename} empty or full of NUL bytes, depending on the underlying
 *   filesystem, unless {@link FileSetContentsFlags#DURABLE} and
 *   {@link FileSetContentsFlags#CONSISTENT} are set in {@code flags}.
 * </ul>
 * <ul>
 * <li>On Windows renaming a file will not remove an existing file with the
 *   new name, so on Windows there is a race condition between the existing
 *   file being removed and the temporary file being renamed.
 * </ul>
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
 * If the file didn???t exist before and is created, it will be given the
 * permissions from {@code mode}. Otherwise, the permissions of the existing file may
 * be changed to {@code mode} depending on {@code flags}, or they may remain unchanged.
 * @param filename name of a file to write {@code contents} to, in the GLib file name
 *   encoding
 * @param contents string to write to the file
 * @param length length of {@code contents}, or -1 if {@code contents} is a nul-terminated string
 * @param flags flags controlling the safety vs speed of the operation
 * @param mode file mode, as passed to {@code open()}; typically this will be {@code 0666}
 * @return {@code true} on success, {@code false} if an error occurred
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean fileSetContentsFull(java.lang.String filename, byte[] contents, long length, org.gtk.glib.FileSetContentsFlags flags, int mode) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_set_contents_full.invokeExact(
                    Marshal.stringToAddress.marshal(filename, SCOPE),
                    Interop.allocateNativeArray(contents, false, SCOPE),
                    length,
                    flags.getValue(),
                    mode,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param filename a filename to test in the
 *     GLib file name encoding
 * @param test bitfield of {@link FileTest} flags
 * @return whether a test was {@code true}
 */
public static boolean fileTest(java.lang.String filename, org.gtk.glib.FileTest test) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_test.invokeExact(
                    Marshal.stringToAddress.marshal(filename, SCOPE),
                    test.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param filename an absolute pathname in the
 *     GLib file name encoding
 * @return a newly allocated string containing
 *   a rendition of the basename of the filename in valid UTF-8
 */
public static java.lang.String filenameDisplayBasename(java.lang.String filename) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_display_basename.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param filename a pathname hopefully in the
 *     GLib file name encoding
 * @return a newly allocated string containing
 *   a rendition of the filename in valid UTF-8
 */
public static java.lang.String filenameDisplayName(java.lang.String filename) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_display_name.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Converts an escaped ASCII-encoded URI to a local filename in the
 * encoding used for filenames.
 * @param uri a uri describing a filename (escaped, encoded in ASCII).
 * @param hostname Location to store hostname for the URI.
 *            If there is no hostname in the URI, {@code null} will be
 *            stored in this location.
 * @return a newly-allocated string holding
 *               the resulting filename, or {@code null} on an error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String filenameFromUri(java.lang.String uri, @Nullable Out<java.lang.String> hostname) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment hostnamePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_from_uri.invokeExact(
                    Marshal.stringToAddress.marshal(uri, SCOPE),
                    (Addressable) (hostname == null ? MemoryAddress.NULL : (Addressable) hostnamePOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (hostname != null) hostname.set(Marshal.addressToString.marshal(hostnamePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param utf8string a UTF-8 encoded string.
 * @param len the length of the string, or -1 if the string is
 *                 nul-terminated.
 * @param bytesRead location to store the number of bytes in
 *                 the input string that were successfully converted, or {@code null}.
 *                 Even if the conversion was successful, this may be
 *                 less than {@code len} if there were partial characters
 *                 at the end of the input. If the error
 *                 {@link ConvertError#ILLEGAL_SEQUENCE} occurs, the value
 *                 stored will be the byte offset after the last valid
 *                 input sequence.
 * @param bytesWritten the number of bytes stored in
 *                 the output buffer (not including the terminating nul).
 * @return The converted string, or {@code null} on an error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String filenameFromUtf8(java.lang.String utf8string, long len, Out<Long> bytesRead, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment bytesReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_from_utf8.invokeExact(
                    Marshal.stringToAddress.marshal(utf8string, SCOPE),
                    len,
                    (Addressable) (bytesRead == null ? MemoryAddress.NULL : (Addressable) bytesReadPOINTER.address()),
                    (Addressable) (bytesWritten == null ? MemoryAddress.NULL : (Addressable) bytesWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (bytesRead != null) bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (bytesWritten != null) bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Converts an absolute filename to an escaped ASCII-encoded URI, with the path
 * component following Section 3.3. of RFC 2396.
 * @param filename an absolute filename specified in the GLib file
 *     name encoding, which is the on-disk file name bytes on Unix, and UTF-8
 *     on Windows
 * @param hostname A UTF-8 encoded hostname, or {@code null} for none.
 * @return a newly-allocated string holding the resulting
 *               URI, or {@code null} on an error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String filenameToUri(java.lang.String filename, @Nullable java.lang.String hostname) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_to_uri.invokeExact(
                    Marshal.stringToAddress.marshal(filename, SCOPE),
                    (Addressable) (hostname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(hostname, SCOPE)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param opsysstring a string in the encoding for filenames
 * @param len the length of the string, or -1 if the string is
 *                 nul-terminated (Note that some encodings may allow nul
 *                 bytes to occur inside strings. In that case, using -1
 *                 for the {@code len} parameter is unsafe)
 * @param bytesRead location to store the number of bytes in the
 *                 input string that were successfully converted, or {@code null}.
 *                 Even if the conversion was successful, this may be
 *                 less than {@code len} if there were partial characters
 *                 at the end of the input. If the error
 *                 {@link ConvertError#ILLEGAL_SEQUENCE} occurs, the value
 *                 stored will be the byte offset after the last valid
 *                 input sequence.
 * @param bytesWritten the number of bytes stored in the output
 *                 buffer (not including the terminating nul).
 * @return The converted string, or {@code null} on an error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String filenameToUtf8(java.lang.String opsysstring, long len, Out<Long> bytesRead, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment bytesReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_to_utf8.invokeExact(
                    Marshal.stringToAddress.marshal(opsysstring, SCOPE),
                    len,
                    (Addressable) (bytesRead == null ? MemoryAddress.NULL : (Addressable) bytesReadPOINTER.address()),
                    (Addressable) (bytesWritten == null ? MemoryAddress.NULL : (Addressable) bytesWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (bytesRead != null) bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (bytesWritten != null) bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param program a program name in the GLib file name encoding
 * @return a newly-allocated
 *   string with the absolute path, or {@code null}
 */
public static @Nullable java.lang.String findProgramInPath(java.lang.String program) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_find_program_in_path.invokeExact(Marshal.stringToAddress.marshal(program, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Formats a size (for example the size of a file) into a human readable
 * string.  Sizes are rounded to the nearest size prefix (kB, MB, GB)
 * and are displayed rounded to the nearest tenth. E.g. the file size
 * 3292528 bytes will be converted into the string "3.2 MB". The returned string
 * is UTF-8, and may use a non-breaking space to separate the number and units,
 * to ensure they aren???t separated when line wrapped.
 * <p>
 * The prefix units base is 1000 (i.e. 1 kB is 1000 bytes).
 * <p>
 * This string should be freed with g_free() when not needed any longer.
 * <p>
 * See g_format_size_full() for more options about how the size might be
 * formatted.
 * @param size a size in bytes
 * @return a newly-allocated formatted string containing
 *   a human readable file size
 */
public static java.lang.String formatSize(long size) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_format_size.invokeExact(size);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Formats a size (for example the size of a file) into a human
 * readable string. Sizes are rounded to the nearest size prefix
 * (KB, MB, GB) and are displayed rounded to the nearest tenth.
 * E.g. the file size 3292528 bytes will be converted into the
 * string "3.1 MB".
 * <p>
 * The prefix units base is 1024 (i.e. 1 KB is 1024 bytes).
 * <p>
 * This string should be freed with g_free() when not needed any longer.
 * @param size a size in bytes
 * @return a newly-allocated formatted string
 *   containing a human readable file size
 * @deprecated This function is broken due to its use of SI
 *     suffixes to denote IEC units. Use g_format_size() instead.
 */
@Deprecated
public static java.lang.String formatSizeForDisplay(long size) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_format_size_for_display.invokeExact(size);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Formats a size.
 * <p>
 * This function is similar to g_format_size() but allows for flags
 * that modify the output. See {@link FormatSizeFlags}.
 * @param size a size in bytes
 * @param flags {@link FormatSizeFlags} to modify the output
 * @return a newly-allocated formatted string
 *   containing a human readable file size
 */
public static java.lang.String formatSizeFull(long size, org.gtk.glib.FormatSizeFlags flags) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_format_size_full.invokeExact(
                size,
                flags.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * An implementation of the standard fprintf() function which supports
 * positional parameters, as specified in the Single Unix Specification.
 * <p>
 * {@code glib/gprintf.h} must be explicitly included in order to use this function.
 * @param file the stream to write to.
 * @param format a standard printf() format string, but notice
 *          [string precision pitfalls][string-precision]
 * @param varargs the arguments to insert in the output.
 * @return the number of bytes printed.
 */
public static int fprintf(java.lang.foreign.MemoryAddress file, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_fprintf.invokeExact(
                    (Addressable) file,
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Frees the memory pointed to by {@code mem}.
 * <p>
 * If {@code mem} is {@code null} it simply returns, so there is no need to check {@code mem}
 * against {@code null} before calling this function.
 * @param mem the memory to free
 */
public static void free(@Nullable java.lang.foreign.MemoryAddress mem) {
    try {
        DowncallHandles.g_free.invokeExact((Addressable) (mem == null ? MemoryAddress.NULL : (Addressable) mem));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Gets a human-readable name for the application, as set by
 * g_set_application_name(). This name should be localized if
 * possible, and is intended for display to the user.  Contrast with
 * g_get_prgname(), which gets a non-localized name. If
 * g_set_application_name() has not been called, returns the result of
 * g_get_prgname() (which may be {@code null} if g_set_prgname() has also not
 * been called).
 * @return human-readable application
 *   name. May return {@code null}
 */
public static @Nullable java.lang.String getApplicationName() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_application_name.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * @param charset return location for character set
 *   name, or {@code null}.
 * @return {@code true} if the returned charset is UTF-8
 */
public static boolean getCharset(@Nullable Out<java.lang.String> charset) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment charsetPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_get_charset.invokeExact((Addressable) (charset == null ? MemoryAddress.NULL : (Addressable) charsetPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (charset != null) charset.set(Marshal.addressToString.marshal(charsetPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Gets the character set for the current locale.
 * @return a newly allocated string containing the name
 *     of the character set. This string must be freed with g_free().
 */
public static java.lang.String getCodeset() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_codeset.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * @param charset return location for character set
 *   name, or {@code null}.
 * @return {@code true} if the returned charset is UTF-8
 */
public static boolean getConsoleCharset(@Nullable Out<java.lang.String> charset) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment charsetPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_get_console_charset.invokeExact((Addressable) (charset == null ? MemoryAddress.NULL : (Addressable) charsetPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (charset != null) charset.set(Marshal.addressToString.marshal(charsetPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @return the current directory
 */
public static java.lang.String getCurrentDir() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_current_dir.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Equivalent to the UNIX gettimeofday() function, but portable.
 * <p>
 * You may find g_get_real_time() to be more convenient.
 * @param result {@link TimeVal} structure in which to store current time.
 * @deprecated {@link TimeVal} is not year-2038-safe. Use g_get_real_time()
 *    instead.
 */
@Deprecated
public static void getCurrentTime(org.gtk.glib.TimeVal result) {
    try {
        DowncallHandles.g_get_current_time.invokeExact(result.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @return the list of environment variables
 */
public static PointerString getEnviron() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_get_environ.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * @param filenameCharsets return location for the {@code null}-terminated list of encoding names
 * @return {@code true} if the filename encoding is UTF-8.
 */
public static boolean getFilenameCharsets(java.lang.String[] filenameCharsets) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_get_filename_charsets.invokeExact(Interop.allocateNativeArray(filenameCharsets, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @return the current user's home directory
 */
public static java.lang.String getHomeDir() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_home_dir.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * @return the host name of the machine.
 */
public static java.lang.String getHostName() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_host_name.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * @return a {@code null}-terminated array of strings owned by GLib
 *    that must not be modified or freed.
 */
public static PointerString getLanguageNames() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_get_language_names.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * @param categoryName a locale category name
 * @return a {@code null}-terminated array of strings owned by
 *    the thread g_get_language_names_with_category was called from.
 *    It must not be modified or freed. It must be copied if planned to be used in another thread.
 */
public static PointerString getLanguageNamesWithCategory(java.lang.String categoryName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_get_language_names_with_category.invokeExact(Marshal.stringToAddress.marshal(categoryName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * @param locale a locale identifier
 * @return a newly
 *   allocated array of newly allocated strings with the locale variants. Free with
 *   g_strfreev().
 */
public static PointerString getLocaleVariants(java.lang.String locale) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_get_locale_variants.invokeExact(Marshal.stringToAddress.marshal(locale, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * @return the monotonic time, in microseconds
 */
public static long getMonotonicTime() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_get_monotonic_time.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Determine the approximate number of threads that the system will
 * schedule simultaneously for this process.  This is intended to be
 * used as a parameter to g_thread_pool_new() for CPU bound tasks and
 * similar cases.
 * @return Number of schedulable threads, always greater than 0
 */
public static int getNumProcessors() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_get_num_processors.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Get information about the operating system.
 * <p>
 * On Linux this comes from the {@code /etc/os-release} file. On other systems, it may
 * come from a variety of sources. You can either use the standard key names
 * like {@code G_OS_INFO_KEY_NAME} or pass any UTF-8 string key name. For example,
 * {@code /etc/os-release} provides a number of other less commonly used values that may
 * be useful. No key is guaranteed to be provided, so the caller should always
 * check if the result is {@code null}.
 * @param keyName a key for the OS info being requested, for example {@code G_OS_INFO_KEY_NAME}.
 * @return The associated value for the requested key or {@code null} if
 *   this information is not provided.
 */
public static @Nullable java.lang.String getOsInfo(java.lang.String keyName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_get_os_info.invokeExact(Marshal.stringToAddress.marshal(keyName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Gets the name of the program. This name should not be localized,
 * in contrast to g_get_application_name().
 * <p>
 * If you are using {@link org.gtk.gio.Application} the program name is set in
 * g_application_run(). In case of GDK or GTK+ it is set in
 * gdk_init(), which is called by gtk_init() and the
 * {@code GtkApplication}::startup handler. The program name is found by
 * taking the last component of {@code argv}[0].
 * @return the name of the program,
 *   or {@code null} if it has not been set yet. The returned string belongs
 *   to GLib and must not be modified or freed.
 */
public static @Nullable java.lang.String getPrgname() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_prgname.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Gets the real name of the user. This usually comes from the user's
 * entry in the {@code passwd} file. The encoding of the returned string is
 * system-defined. (On Windows, it is, however, always UTF-8.) If the
 * real user name cannot be determined, the string "Unknown" is
 * returned.
 * @return the user's real name.
 */
public static java.lang.String getRealName() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_real_name.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * @return the number of microseconds since January 1, 1970 UTC.
 */
public static long getRealTime() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_get_real_time.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * it???s not thread-safe to modify environment variables at runtime.
 * @return a {@code null}-terminated array of strings owned by GLib that must not be
 *     modified or freed.
 */
public static PointerString getSystemConfigDirs() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_get_system_config_dirs.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * it???s not thread-safe to modify environment variables at runtime.
 * @return a {@code null}-terminated array of strings owned by GLib that must not be
 *     modified or freed.
 */
public static PointerString getSystemDataDirs() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_get_system_data_dirs.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * @return the directory to use for temporary files.
 */
public static java.lang.String getTmpDir() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_tmp_dir.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * it???s not thread-safe to modify environment variables at runtime.
 * @return a string owned by GLib that
 *   must not be modified or freed.
 */
public static java.lang.String getUserCacheDir() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_user_cache_dir.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * it???s not thread-safe to modify environment variables at runtime.
 * @return a string owned by GLib that
 *   must not be modified or freed.
 */
public static java.lang.String getUserConfigDir() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_user_config_dir.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * it???s not thread-safe to modify environment variables at runtime.
 * @return a string owned by GLib that must
 *   not be modified or freed.
 */
public static java.lang.String getUserDataDir() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_user_data_dir.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Gets the user name of the current user. The encoding of the returned
 * string is system-defined. On UNIX, it might be the preferred file name
 * encoding, or something else, and there is no guarantee that it is even
 * consistent on a machine. On Windows, it is always UTF-8.
 * @return the user name of the current user.
 */
public static java.lang.String getUserName() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_user_name.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * it???s not thread-safe to modify environment variables at runtime.
 * @return a string owned by GLib that must not be
 *     modified or freed.
 */
public static java.lang.String getUserRuntimeDir() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_user_runtime_dir.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * @param directory the logical id of special directory
 * @return the path to the specified special
 *   directory, or {@code null} if the logical id was not found. The returned string is
 *   owned by GLib and should not be modified or freed.
 */
public static @Nullable java.lang.String getUserSpecialDir(org.gtk.glib.UserDirectory directory) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_user_special_dir.invokeExact(directory.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * it???s not thread-safe to modify environment variables at runtime.
 * @return a string owned by GLib that
 *   must not be modified or freed.
 */
public static java.lang.String getUserStateDir() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_get_user_state_dir.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Returns the value of an environment variable.
 * <p>
 * On UNIX, the name and value are byte strings which might or might not
 * be in some consistent character set and encoding. On Windows, they are
 * in UTF-8.
 * On Windows, in case the environment variable's value contains
 * references to other environment variables, they are expanded.
 * @param variable the environment variable to get
 * @return the value of the environment variable, or {@code null} if
 *     the environment variable is not found. The returned string
 *     may be overwritten by the next call to g_getenv(), g_setenv()
 *     or g_unsetenv().
 */
public static @Nullable java.lang.String getenv(java.lang.String variable) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_getenv.invokeExact(Marshal.stringToAddress.marshal(variable, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param hashTable a {@link HashTable}
 * @param key a key to insert
 * @return {@code true} if the key did not exist yet
 */
public static boolean hashTableAdd(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_hash_table_add.invokeExact(
                hashTable.handle(),
                (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Checks if {@code key} is in {@code hash_table}.
 * @param hashTable a {@link HashTable}
 * @param key a key to check
 * @return {@code true} if {@code key} is in {@code hash_table}, {@code false} otherwise.
 */
public static boolean hashTableContains(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_hash_table_contains.invokeExact(
                hashTable.handle(),
                (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Destroys all keys and values in the {@link HashTable} and decrements its
 * reference count by 1. If keys and/or values are dynamically allocated,
 * you should either free them first or create the {@link HashTable} with destroy
 * notifiers using g_hash_table_new_full(). In the latter case the destroy
 * functions you supplied will be called on all keys and values during the
 * destruction phase.
 * @param hashTable a {@link HashTable}
 */
public static void hashTableDestroy(org.gtk.glib.HashTable hashTable) {
    try {
        DowncallHandles.g_hash_table_destroy.invokeExact(hashTable.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param hashTable a {@link HashTable}
 * @param key a key to insert
 * @param value the value to associate with the key
 * @return {@code true} if the key did not exist yet
 */
public static boolean hashTableInsert(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_hash_table_insert.invokeExact(
                hashTable.handle(),
                (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key),
                (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Looks up a key in a {@link HashTable}. Note that this function cannot
 * distinguish between a key that is not present and one which is present
 * and has the value {@code null}. If you need this distinction, use
 * g_hash_table_lookup_extended().
 * @param hashTable a {@link HashTable}
 * @param key the key to look up
 * @return the associated value, or {@code null} if the key is not found
 */
public static @Nullable java.lang.foreign.MemoryAddress hashTableLookup(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_hash_table_lookup.invokeExact(
                hashTable.handle(),
                (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Looks up a key in the {@link HashTable}, returning the original key and the
 * associated value and a {@code gboolean} which is {@code true} if the key was found. This
 * is useful if you need to free the memory allocated for the original key,
 * for example before calling g_hash_table_remove().
 * <p>
 * You can actually pass {@code null} for {@code lookup_key} to test
 * whether the {@code null} key exists, provided the hash and equal functions
 * of {@code hash_table} are {@code null}-safe.
 * @param hashTable a {@link HashTable}
 * @param lookupKey the key to look up
 * @param origKey return location for the original key
 * @param value return location for the value associated
 * with the key
 * @return {@code true} if the key was found in the {@link HashTable}
 */
public static boolean hashTableLookupExtended(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress lookupKey, @Nullable Out<java.lang.foreign.MemoryAddress> origKey, @Nullable Out<java.lang.foreign.MemoryAddress> value) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment origKeyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_lookup_extended.invokeExact(
                    hashTable.handle(),
                    (Addressable) (lookupKey == null ? MemoryAddress.NULL : (Addressable) lookupKey),
                    (Addressable) (origKey == null ? MemoryAddress.NULL : (Addressable) origKeyPOINTER.address()),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (origKey != null) origKey.set(origKeyPOINTER.get(Interop.valueLayout.ADDRESS, 0));
                if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Creates a new {@link HashTable} like g_hash_table_new_full() with a reference
 * count of 1.
 * <p>
 * It inherits the hash function, the key equal function, the key destroy function,
 * as well as the value destroy function, from {@code other_hash_table}.
 * <p>
 * The returned hash table will be empty; it will not contain the keys
 * or values from {@code other_hash_table}.
 * @param otherHashTable Another {@link HashTable}
 * @return a new {@link HashTable}
 */
public static org.gtk.glib.HashTable hashTableNewSimilar(org.gtk.glib.HashTable otherHashTable) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_hash_table_new_similar.invokeExact(otherHashTable.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.HashTable.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Removes a key and its associated value from a {@link HashTable}.
 * <p>
 * If the {@link HashTable} was created using g_hash_table_new_full(), the
 * key and value are freed using the supplied destroy functions, otherwise
 * you have to make sure that any dynamically allocated values are freed
 * yourself.
 * @param hashTable a {@link HashTable}
 * @param key the key to remove
 * @return {@code true} if the key was found and removed from the {@link HashTable}
 */
public static boolean hashTableRemove(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_hash_table_remove.invokeExact(
                hashTable.handle(),
                (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Removes all keys and their associated values from a {@link HashTable}.
 * <p>
 * If the {@link HashTable} was created using g_hash_table_new_full(),
 * the keys and values are freed using the supplied destroy functions,
 * otherwise you have to make sure that any dynamically allocated
 * values are freed yourself.
 * @param hashTable a {@link HashTable}
 */
public static void hashTableRemoveAll(org.gtk.glib.HashTable hashTable) {
    try {
        DowncallHandles.g_hash_table_remove_all.invokeExact(hashTable.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param hashTable a {@link HashTable}
 * @param key a key to insert
 * @param value the value to associate with the key
 * @return {@code true} if the key did not exist yet
 */
public static boolean hashTableReplace(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_hash_table_replace.invokeExact(
                hashTable.handle(),
                (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key),
                (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) value));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Returns the number of elements contained in the {@link HashTable}.
 * @param hashTable a {@link HashTable}
 * @return the number of key/value pairs in the {@link HashTable}.
 */
public static int hashTableSize(org.gtk.glib.HashTable hashTable) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_hash_table_size.invokeExact(hashTable.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Removes a key and its associated value from a {@link HashTable} without
 * calling the key and value destroy functions.
 * @param hashTable a {@link HashTable}
 * @param key the key to remove
 * @return {@code true} if the key was found and removed from the {@link HashTable}
 */
public static boolean hashTableSteal(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress key) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_hash_table_steal.invokeExact(
                hashTable.handle(),
                (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) key));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Removes all keys and their associated values from a {@link HashTable}
 * without calling the key and value destroy functions.
 * @param hashTable a {@link HashTable}
 */
public static void hashTableStealAll(org.gtk.glib.HashTable hashTable) {
    try {
        DowncallHandles.g_hash_table_steal_all.invokeExact(hashTable.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param hashTable a {@link HashTable}
 * @param lookupKey the key to look up
 * @param stolenKey return location for the
 *    original key
 * @param stolenValue return location
 *    for the value associated with the key
 * @return {@code true} if the key was found in the {@link HashTable}
 */
public static boolean hashTableStealExtended(org.gtk.glib.HashTable hashTable, @Nullable java.lang.foreign.MemoryAddress lookupKey, @Nullable Out<java.lang.foreign.MemoryAddress> stolenKey, @Nullable Out<java.lang.foreign.MemoryAddress> stolenValue) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment stolenKeyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment stolenValuePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hash_table_steal_extended.invokeExact(
                    hashTable.handle(),
                    (Addressable) (lookupKey == null ? MemoryAddress.NULL : (Addressable) lookupKey),
                    (Addressable) (stolenKey == null ? MemoryAddress.NULL : (Addressable) stolenKeyPOINTER.address()),
                    (Addressable) (stolenValue == null ? MemoryAddress.NULL : (Addressable) stolenValuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (stolenKey != null) stolenKey.set(stolenKeyPOINTER.get(Interop.valueLayout.ADDRESS, 0));
                if (stolenValue != null) stolenValue.set(stolenValuePOINTER.get(Interop.valueLayout.ADDRESS, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Atomically decrements the reference count of {@code hash_table} by one.
 * If the reference count drops to 0, all keys and values will be
 * destroyed, and all memory allocated by the hash table is released.
 * This function is MT-safe and may be called from any thread.
 * @param hashTable a valid {@link HashTable}
 */
public static void hashTableUnref(org.gtk.glib.HashTable hashTable) {
    try {
        DowncallHandles.g_hash_table_unref.invokeExact(hashTable.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Destroys a {@link Hook}, given its ID.
 * @param hookList a {@link HookList}
 * @param hookId a hook ID
 * @return {@code true} if the {@link Hook} was found in the {@link HookList} and destroyed
 */
public static boolean hookDestroy(org.gtk.glib.HookList hookList, long hookId) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_hook_destroy.invokeExact(
                hookList.handle(),
                hookId);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Removes one {@link Hook} from a {@link HookList}, marking it
 * inactive and calling g_hook_unref() on it.
 * @param hookList a {@link HookList}
 * @param hook the {@link Hook} to remove
 */
public static void hookDestroyLink(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook) {
    try {
        DowncallHandles.g_hook_destroy_link.invokeExact(
                hookList.handle(),
                hook.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Calls the {@link HookList} {@code finalize_hook} function if it exists,
 * and frees the memory allocated for the {@link Hook}.
 * @param hookList a {@link HookList}
 * @param hook the {@link Hook} to free
 */
public static void hookFree(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook) {
    try {
        DowncallHandles.g_hook_free.invokeExact(
                hookList.handle(),
                hook.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Inserts a {@link Hook} into a {@link HookList}, before a given {@link Hook}.
 * @param hookList a {@link HookList}
 * @param sibling the {@link Hook} to insert the new {@link Hook} before
 * @param hook the {@link Hook} to insert
 */
public static void hookInsertBefore(org.gtk.glib.HookList hookList, @Nullable org.gtk.glib.Hook sibling, org.gtk.glib.Hook hook) {
    try {
        DowncallHandles.g_hook_insert_before.invokeExact(
                hookList.handle(),
                (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                hook.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Prepends a {@link Hook} on the start of a {@link HookList}.
 * @param hookList a {@link HookList}
 * @param hook the {@link Hook} to add to the start of {@code hook_list}
 */
public static void hookPrepend(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook) {
    try {
        DowncallHandles.g_hook_prepend.invokeExact(
                hookList.handle(),
                hook.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Decrements the reference count of a {@link Hook}.
 * If the reference count falls to 0, the {@link Hook} is removed
 * from the {@link HookList} and g_hook_free() is called to free it.
 * @param hookList a {@link HookList}
 * @param hook the {@link Hook} to unref
 */
public static void hookUnref(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook) {
    try {
        DowncallHandles.g_hook_unref.invokeExact(
                hookList.handle(),
                hook.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Tests if {@code hostname} contains segments with an ASCII-compatible
 * encoding of an Internationalized Domain Name. If this returns
 * {@code true}, you should decode the hostname with g_hostname_to_unicode()
 * before displaying it to the user.
 * <p>
 * Note that a hostname might contain a mix of encoded and unencoded
 * segments, and so it is possible for g_hostname_is_non_ascii() and
 * g_hostname_is_ascii_encoded() to both return {@code true} for a name.
 * @param hostname a hostname
 * @return {@code true} if {@code hostname} contains any ASCII-encoded
 * segments.
 */
public static boolean hostnameIsAsciiEncoded(java.lang.String hostname) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hostname_is_ascii_encoded.invokeExact(Marshal.stringToAddress.marshal(hostname, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Tests if {@code hostname} is the string form of an IPv4 or IPv6 address.
 * (Eg, "192.168.0.1".)
 * <p>
 * Since 2.66, IPv6 addresses with a zone-id are accepted (RFC6874).
 * @param hostname a hostname (or IP address in string form)
 * @return {@code true} if {@code hostname} is an IP address
 */
public static boolean hostnameIsIpAddress(java.lang.String hostname) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hostname_is_ip_address.invokeExact(Marshal.stringToAddress.marshal(hostname, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Tests if {@code hostname} contains Unicode characters. If this returns
 * {@code true}, you need to encode the hostname with g_hostname_to_ascii()
 * before using it in non-IDN-aware contexts.
 * <p>
 * Note that a hostname might contain a mix of encoded and unencoded
 * segments, and so it is possible for g_hostname_is_non_ascii() and
 * g_hostname_is_ascii_encoded() to both return {@code true} for a name.
 * @param hostname a hostname
 * @return {@code true} if {@code hostname} contains any non-ASCII characters
 */
public static boolean hostnameIsNonAscii(java.lang.String hostname) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hostname_is_non_ascii.invokeExact(Marshal.stringToAddress.marshal(hostname, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Converts {@code hostname} to its canonical ASCII form; an ASCII-only
 * string containing no uppercase letters and not ending with a
 * trailing dot.
 * @param hostname a valid UTF-8 or ASCII hostname
 * @return an ASCII hostname, which must be freed,
 *    or {@code null} if {@code hostname} is in some way invalid.
 */
public static @Nullable java.lang.String hostnameToAscii(java.lang.String hostname) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hostname_to_ascii.invokeExact(Marshal.stringToAddress.marshal(hostname, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Converts {@code hostname} to its canonical presentation form; a UTF-8
 * string in Unicode normalization form C, containing no uppercase
 * letters, no forbidden characters, and no ASCII-encoded segments,
 * and not ending with a trailing dot.
 * <p>
 * Of course if {@code hostname} is not an internationalized hostname, then
 * the canonical presentation form will be entirely ASCII.
 * @param hostname a valid UTF-8 or ASCII hostname
 * @return a UTF-8 hostname, which must be freed,
 *    or {@code null} if {@code hostname} is in some way invalid.
 */
public static @Nullable java.lang.String hostnameToUnicode(java.lang.String hostname) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hostname_to_unicode.invokeExact(Marshal.stringToAddress.marshal(hostname, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param converter conversion descriptor from g_iconv_open()
 * @param inbuf bytes to convert
 * @param inbytesLeft inout parameter, bytes remaining to convert in {@code inbuf}
 * @param outbuf converted output bytes
 * @param outbytesLeft inout parameter, bytes available to fill in {@code outbuf}
 * @return count of non-reversible conversions, or -1 on error
 */
public static long iconv(org.gtk.glib.IConv converter, PointerString inbuf, Out<Long> inbytesLeft, PointerString outbuf, Out<Long> outbytesLeft) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment inbytesLeftPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment outbytesLeftPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_iconv.invokeExact(
                    converter.handle(),
                    inbuf.handle(),
                    (Addressable) inbytesLeftPOINTER.address(),
                    outbuf.handle(),
                    (Addressable) outbytesLeftPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                inbytesLeft.set(inbytesLeftPOINTER.get(Interop.valueLayout.C_LONG, 0));
                outbytesLeft.set(outbytesLeftPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT;
    }
}

/**
 * Same as the standard UNIX routine iconv_open(), but
 * may be implemented via libiconv on UNIX flavors that lack
 * a native implementation.
 * <p>
 * GLib provides g_convert() and g_locale_to_utf8() which are likely
 * more convenient than the raw iconv wrappers.
 * @param toCodeset destination codeset
 * @param fromCodeset source codeset
 * @return a "conversion descriptor", or (GIConv)-1 if
 *  opening the converter failed.
 */
public static org.gtk.glib.IConv iconvOpen(java.lang.String toCodeset, java.lang.String fromCodeset) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_iconv_open.invokeExact(
                    Marshal.stringToAddress.marshal(toCodeset, SCOPE),
                    Marshal.stringToAddress.marshal(fromCodeset, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.IConv.fromAddress.marshal(RESULT, null);
    }
}

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
 * @param function function to call
 * @return the ID (greater than 0) of the event source.
 */
public static int idleAdd(org.gtk.glib.SourceFunc function) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_idle_add.invokeExact(
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param priority the priority of the idle source. Typically this will be in the
 *   range between {@code G_PRIORITY_DEFAULT_IDLE} and {@code G_PRIORITY_HIGH_IDLE}.
 * @param function function to call
 * @param notify function to call when the idle is removed, or {@code null}
 * @return the ID (greater than 0) of the event source.
 */
public static int idleAddFull(int priority, org.gtk.glib.SourceFunc function, @Nullable org.gtk.glib.DestroyNotify notify) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_idle_add_full.invokeExact(
                priority,
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Adds a function to be called whenever there are no higher priority
 * events pending to the default main loop. The function is given the
 * default idle priority, {@code G_PRIORITY_DEFAULT_IDLE}.
 * <p>
 * The function will only be called once and then the source will be
 * automatically removed from the main context.
 * <p>
 * This function otherwise behaves like g_idle_add().
 * @param function function to call
 * @return the ID (greater than 0) of the event source
 */
public static int idleAddOnce(org.gtk.glib.SourceOnceFunc function) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_idle_add_once.invokeExact(
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Removes the idle function with the given data.
 * @return {@code true} if an idle source was found and removed.
 */
public static boolean idleRemoveByData() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_idle_remove_by_data.invokeExact((Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Creates a new idle source.
 * <p>
 * The source will not initially be associated with any {@link MainContext}
 * and must be added to one with g_source_attach() before it will be
 * executed. Note that the default priority for idle sources is
 * {@code G_PRIORITY_DEFAULT_IDLE}, as compared to other sources which
 * have a default priority of {@code G_PRIORITY_DEFAULT}.
 * @return the newly-created idle source
 */
public static org.gtk.glib.Source idleSourceNew() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_idle_source_new.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Compares the two {@code gint64} values being pointed to and returns
 * {@code true} if they are equal.
 * It can be passed to g_hash_table_new() as the {@code key_equal_func}
 * parameter, when using non-{@code null} pointers to 64-bit integers as keys in a
 * {@link HashTable}.
 * @param v1 a pointer to a {@code gint64} key
 * @param v2 a pointer to a {@code gint64} key to compare with {@code v1}
 * @return {@code true} if the two keys match.
 */
public static boolean int64Equal(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_int64_equal.invokeExact(
                (Addressable) v1,
                (Addressable) v2);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Converts a pointer to a {@code gint64} to a hash value.
 * <p>
 * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
 * when using non-{@code null} pointers to 64-bit integer values as keys in a
 * {@link HashTable}.
 * @param v a pointer to a {@code gint64} key
 * @return a hash value corresponding to the key.
 */
public static int int64Hash(java.lang.foreign.MemoryAddress v) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_int64_hash.invokeExact((Addressable) v);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param v1 a pointer to a {@code gint} key
 * @param v2 a pointer to a {@code gint} key to compare with {@code v1}
 * @return {@code true} if the two keys match.
 */
public static boolean intEqual(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_int_equal.invokeExact(
                (Addressable) v1,
                (Addressable) v2);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Converts a pointer to a {@code gint} to a hash value.
 * It can be passed to g_hash_table_new() as the {@code hash_func} parameter,
 * when using non-{@code null} pointers to integer values as keys in a {@link HashTable}.
 * <p>
 * Note that this function acts on pointers to {@code gint}, not on {@code gint}
 * directly: if your hash table's keys are of the form
 * {@code GINT_TO_POINTER (n)}, use g_direct_hash() instead.
 * @param v a pointer to a {@code gint} key
 * @return a hash value corresponding to the key.
 */
public static int intHash(java.lang.foreign.MemoryAddress v) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_int_hash.invokeExact((Addressable) v);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns a canonical representation for {@code string}. Interned strings
 * can be compared for equality by comparing the pointers, instead of
 * using strcmp(). g_intern_static_string() does not copy the string,
 * therefore {@code string} must not be freed or modified.
 * <p>
 * This function must not be used before library constructors have finished
 * running. In particular, this means it cannot be used to initialize global
 * variables in C++.
 * @param string a static string
 * @return a canonical representation for the string
 */
public static java.lang.String internStaticString(@Nullable java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_intern_static_string.invokeExact((Addressable) (string == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(string, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Returns a canonical representation for {@code string}. Interned strings
 * can be compared for equality by comparing the pointers, instead of
 * using strcmp().
 * <p>
 * This function must not be used before library constructors have finished
 * running. In particular, this means it cannot be used to initialize global
 * variables in C++.
 * @param string a string
 * @return a canonical representation for the string
 */
public static java.lang.String internString(@Nullable java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_intern_string.invokeExact((Addressable) (string == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(string, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Adds the {@link IOChannel} into the default main loop context
 * with the default priority.
 * @param channel a {@link IOChannel}
 * @param condition the condition to watch for
 * @param func the function to call when the condition is satisfied
 * @return the event source id
 */
public static int ioAddWatch(org.gtk.glib.IOChannel channel, org.gtk.glib.IOCondition condition, org.gtk.glib.IOFunc func) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_io_add_watch.invokeExact(
                channel.handle(),
                condition.getValue(),
                (Addressable) func.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Adds the {@link IOChannel} into the default main loop context
 * with the given priority.
 * <p>
 * This internally creates a main loop source using g_io_create_watch()
 * and attaches it to the main loop context with g_source_attach().
 * You can do these steps manually if you need greater control.
 * @param channel a {@link IOChannel}
 * @param priority the priority of the {@link IOChannel} source
 * @param condition the condition to watch for
 * @param func the function to call when the condition is satisfied
 * @param notify the function to call when the source is removed
 * @return the event source id
 */
public static int ioAddWatchFull(org.gtk.glib.IOChannel channel, int priority, org.gtk.glib.IOCondition condition, org.gtk.glib.IOFunc func, org.gtk.glib.DestroyNotify notify) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_io_add_watch_full.invokeExact(
                channel.handle(),
                priority,
                condition.getValue(),
                (Addressable) func.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) notify.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Converts an {@code errno} error number to a {@link IOChannelError}.
 * @param en an {@code errno} error number, e.g. {@code EINVAL}
 * @return a {@link IOChannelError} error number, e.g.
 *      {@link IOChannelError#INVAL}.
 */
public static org.gtk.glib.IOChannelError ioChannelErrorFromErrno(int en) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_io_channel_error_from_errno.invokeExact(en);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.IOChannelError.of(RESULT);
}

public static org.gtk.glib.Quark ioChannelErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_io_channel_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

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
 * @param channel a {@link IOChannel} to watch
 * @param condition conditions to watch for
 * @return a new {@link Source}
 */
public static org.gtk.glib.Source ioCreateWatch(org.gtk.glib.IOChannel channel, org.gtk.glib.IOCondition condition) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_io_create_watch.invokeExact(
                channel.handle(),
                condition.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

public static org.gtk.glib.Quark keyFileErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_key_file_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Gets the names of all variables set in the environment.
 * <p>
 * Programs that want to be portable to Windows should typically use
 * this function and g_getenv() instead of using the environ array
 * from the C library directly. On Windows, the strings in the environ
 * array are in system codepage encoding, while in most of the typical
 * use cases for environment variables in GLib-using programs you want
 * the UTF-8 encoding that this function and g_getenv() provide.
 * @return a {@code null}-terminated list of strings which must be freed with
 *     g_strfreev().
 */
public static PointerString listenv() {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_listenv.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * @param utf8string a UTF-8 encoded string
 * @param len the length of the string, or -1 if the string is
 *                 nul-terminated.
 * @param bytesRead location to store the number of bytes in the
 *                 input string that were successfully converted, or {@code null}.
 *                 Even if the conversion was successful, this may be
 *                 less than {@code len} if there were partial characters
 *                 at the end of the input. If the error
 *                 {@link ConvertError#ILLEGAL_SEQUENCE} occurs, the value
 *                 stored will be the byte offset after the last valid
 *                 input sequence.
 * @param bytesWritten the number of bytes stored in the output
 *                 buffer (not including the terminating nul).
 * @return A newly-allocated buffer containing the converted string,
 *          or {@code null} on an error, and error will be set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static byte[] localeFromUtf8(java.lang.String utf8string, long len, Out<Long> bytesRead, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment bytesReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_locale_from_utf8.invokeExact(
                    Marshal.stringToAddress.marshal(utf8string, SCOPE),
                    len,
                    (Addressable) (bytesRead == null ? MemoryAddress.NULL : (Addressable) bytesReadPOINTER.address()),
                    (Addressable) (bytesWritten == null ? MemoryAddress.NULL : (Addressable) bytesWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (bytesRead != null) bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (bytesWritten != null) bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), bytesWritten.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE);
    }
}

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
 * @param opsysstring a string in the
 *                 encoding of the current locale. On Windows
 *                 this means the system codepage.
 * @param len the length of the string, or -1 if the string is
 *                 nul-terminated (Note that some encodings may allow nul
 *                 bytes to occur inside strings. In that case, using -1
 *                 for the {@code len} parameter is unsafe)
 * @param bytesRead location to store the number of bytes in the
 *                 input string that were successfully converted, or {@code null}.
 *                 Even if the conversion was successful, this may be
 *                 less than {@code len} if there were partial characters
 *                 at the end of the input. If the error
 *                 {@link ConvertError#ILLEGAL_SEQUENCE} occurs, the value
 *                 stored will be the byte offset after the last valid
 *                 input sequence.
 * @param bytesWritten the number of bytes stored in the output
 *                 buffer (not including the terminating nul).
 * @return The converted string, or {@code null} on an error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String localeToUtf8(byte[] opsysstring, long len, Out<Long> bytesRead, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment bytesReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_locale_to_utf8.invokeExact(
                    Interop.allocateNativeArray(opsysstring, false, SCOPE),
                    len,
                    (Addressable) (bytesRead == null ? MemoryAddress.NULL : (Addressable) bytesReadPOINTER.address()),
                    (Addressable) (bytesWritten == null ? MemoryAddress.NULL : (Addressable) bytesWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (bytesRead != null) bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (bytesWritten != null) bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Logs an error or debugging message.
 * <p>
 * If the log level has been set as fatal, G_BREAKPOINT() is called
 * to terminate the program. See the documentation for G_BREAKPOINT() for
 * details of the debugging options this provides.
 * <p>
 * If g_log_default_handler() is used as the log handler function, a new-line
 * character will automatically be appended to {@code .}.., and need not be entered
 * manually.
 * <p>
 * If [structured logging is enabled][using-structured-logging] this will
 * output via the structured log writer function (see g_log_set_writer_func()).
 * @param logDomain the log domain, usually {@code G_LOG_DOMAIN}, or {@code null}
 *   for the default
 * @param logLevel the log level, either from {@link LogLevelFlags}
 *   or a user-defined level
 * @param format the message format. See the {@code printf()} documentation
 * @param varargs the parameters to insert into the format string
 */
public static void log(@Nullable java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_log.invokeExact(
                    (Addressable) (logDomain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(logDomain, SCOPE)),
                    logLevel.getValue(),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * <ul>
 * <li>{@code G_MESSAGES_PREFIXED}: A :-separated list of log levels for which
 *   messages should be prefixed by the program name and PID of the
 *   application.
 * </ul>
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
 * @param logDomain the log domain of the message, or {@code null} for the
 * default "" application domain
 * @param logLevel the level of the message
 * @param message the message
 */
public static void logDefaultHandler(@Nullable java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, @Nullable java.lang.String message) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_log_default_handler.invokeExact(
                    (Addressable) (logDomain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(logDomain, SCOPE)),
                    logLevel.getValue(),
                    (Addressable) (message == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(message, SCOPE)),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Return whether debug output from the GLib logging system is enabled.
 * <p>
 * Note that this should not be used to conditionalise calls to g_debug() or
 * other logging functions; it should only be used from {@code GLogWriterFunc}
 * implementations.
 * <p>
 * Note also that the value of this does not depend on {@code G_MESSAGES_DEBUG}; see
 * the docs for g_log_set_debug_enabled().
 * @return {@code true} if debug output is enabled, {@code false} otherwise
 */
public static boolean logGetDebugEnabled() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_log_get_debug_enabled.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Removes the log handler.
 * <p>
 * This has no effect if structured logging is enabled; see
 * [Using Structured Logging][using-structured-logging].
 * @param logDomain the log domain
 * @param handlerId the id of the handler, which was returned
 *     in g_log_set_handler()
 */
public static void logRemoveHandler(java.lang.String logDomain, int handlerId) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_log_remove_handler.invokeExact(
                    Marshal.stringToAddress.marshal(logDomain, SCOPE),
                    handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Sets the message levels which are always fatal, in any log domain.
 * When a message with any of these levels is logged the program terminates.
 * You can only set the levels defined by GLib to be fatal.
 * {@link LogLevelFlags#LEVEL_ERROR} is always fatal.
 * <p>
 * You can also make some message levels fatal at runtime by setting
 * the {@code G_DEBUG} environment variable (see
 * <a href="glib-running.html">Running GLib Applications</a>).
 * <p>
 * Libraries should not call this function, as it affects all messages logged
 * by a process, including those from other libraries.
 * <p>
 * Structured log messages (using g_log_structured() and
 * g_log_structured_array()) are fatal only if the default log writer is used;
 * otherwise it is up to the writer function to determine which log messages
 * are fatal. See [Using Structured Logging][using-structured-logging].
 * @param fatalMask the mask containing bits set for each level
 *     of error which is to be fatal
 * @return the old fatal mask
 */
public static org.gtk.glib.LogLevelFlags logSetAlwaysFatal(org.gtk.glib.LogLevelFlags fatalMask) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_log_set_always_fatal.invokeExact(fatalMask.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.LogLevelFlags(RESULT);
}

/**
 * Enable or disable debug output from the GLib logging system for all domains.
 * This value interacts disjunctively with {@code G_MESSAGES_DEBUG} ??? if either of
 * them would allow a debug message to be outputted, it will be.
 * <p>
 * Note that this should not be used from within library code to enable debug
 * output ??? it is intended for external use.
 * @param enabled {@code true} to enable debug output, {@code false} otherwise
 */
public static void logSetDebugEnabled(boolean enabled) {
    try {
        DowncallHandles.g_log_set_debug_enabled.invokeExact(Marshal.booleanToInteger.marshal(enabled, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Installs a default log handler which is used if no
 * log handler has been set for the particular log domain
 * and log level combination. By default, GLib uses
 * g_log_default_handler() as default log handler.
 * <p>
 * This has no effect if structured logging is enabled; see
 * [Using Structured Logging][using-structured-logging].
 * @param logFunc the log handler function
 * @return the previous default log handler
 */
public static org.gtk.glib.LogFunc logSetDefaultHandler(org.gtk.glib.LogFunc logFunc) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_log_set_default_handler.invokeExact(
                (Addressable) logFunc.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return null /* Unsupported parameter type */;
}

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
 * @param logDomain the log domain
 * @param fatalMask the new fatal mask
 * @return the old fatal mask for the log domain
 */
public static org.gtk.glib.LogLevelFlags logSetFatalMask(java.lang.String logDomain, org.gtk.glib.LogLevelFlags fatalMask) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_log_set_fatal_mask.invokeExact(
                    Marshal.stringToAddress.marshal(logDomain, SCOPE),
                    fatalMask.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.LogLevelFlags(RESULT);
    }
}

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
 * <pre>{@code <!-- language="C" -->
 * g_log_set_handler (NULL, G_LOG_LEVEL_WARNING | G_LOG_FLAG_FATAL
 *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
 * }</pre>
 * <p>
 * This example adds a log handler for all critical messages from GTK+:
 * <pre>{@code <!-- language="C" -->
 * g_log_set_handler ("Gtk", G_LOG_LEVEL_CRITICAL | G_LOG_FLAG_FATAL
 *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
 * }</pre>
 * <p>
 * This example adds a log handler for all messages from GLib:
 * <pre>{@code <!-- language="C" -->
 * g_log_set_handler ("GLib", G_LOG_LEVEL_MASK | G_LOG_FLAG_FATAL
 *                    | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
 * }</pre>
 * @param logDomain the log domain, or {@code null} for the default ""
 *    application domain
 * @param logLevels the log levels to apply the log handler for.
 *    To handle fatal and recursive messages as well, combine
 *    the log levels with the {@link LogLevelFlags#FLAG_FATAL} and
 *    {@link LogLevelFlags#FLAG_RECURSION} bit flags.
 * @param logFunc the log handler function
 * @return the id of the new handler
 */
public static int logSetHandler(@Nullable java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevels, org.gtk.glib.LogFunc logFunc) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_log_set_handler.invokeExact(
                    (Addressable) (logDomain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(logDomain, SCOPE)),
                    logLevels.getValue(),
                    (Addressable) logFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Like g_log_set_handler(), but takes a destroy notify for the {@code user_data}.
 * <p>
 * This has no effect if structured logging is enabled; see
 * [Using Structured Logging][using-structured-logging].
 * @param logDomain the log domain, or {@code null} for the default ""
 *   application domain
 * @param logLevels the log levels to apply the log handler for.
 *   To handle fatal and recursive messages as well, combine
 *   the log levels with the {@link LogLevelFlags#FLAG_FATAL} and
 *   {@link LogLevelFlags#FLAG_RECURSION} bit flags.
 * @param logFunc the log handler function
 * @param destroy destroy notify for {@code user_data}, or {@code null}
 * @return the id of the new handler
 */
public static int logSetHandlerFull(@Nullable java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevels, org.gtk.glib.LogFunc logFunc, org.gtk.glib.DestroyNotify destroy) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_log_set_handler_full.invokeExact(
                    (Addressable) (logDomain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(logDomain, SCOPE)),
                    logLevels.getValue(),
                    (Addressable) logFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Set a writer function which will be called to format and write out each log
 * message. Each program should set a writer function, or the default writer
 * (g_log_writer_default()) will be used.
 * <p>
 * Libraries <strong>must not</strong> call this function ??? only programs are allowed to
 * install a writer function, as there must be a single, central point where
 * log messages are formatted and outputted.
 * <p>
 * There can only be one writer function. It is an error to set more than one.
 * @param func log writer function, which must not be {@code null}
 * @param userDataFree function to free {@code user_data} once it???s
 *    finished with, if non-{@code null}
 */
public static void logSetWriterFunc(@Nullable org.gtk.glib.LogWriterFunc func, org.gtk.glib.DestroyNotify userDataFree) {
    try {
        DowncallHandles.g_log_set_writer_func.invokeExact(
                (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                (Addressable) MemoryAddress.NULL,
                (Addressable) userDataFree.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Log a message with structured data.
 * <p>
 * The message will be passed through to the log writer set by the application
 * using g_log_set_writer_func(). If the message is fatal (i.e. its log level
 * is {@link LogLevelFlags#LEVEL_ERROR}), the program will be aborted by calling
 * G_BREAKPOINT() at the end of this function. If the log writer returns
 * {@link LogWriterOutput#UNHANDLED} (failure), no other fallback writers will be tried.
 * See the documentation for {@link LogWriterFunc} for information on chaining
 * writers.
 * <p>
 * The structured data is provided as key???value pairs, where keys are UTF-8
 * strings, and values are arbitrary pointers ??? typically pointing to UTF-8
 * strings, but that is not a requirement. To pass binary (non-nul-terminated)
 * structured data, use g_log_structured_array(). The keys for structured data
 * should follow the [systemd journal
 * fields](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html)
 * specification. It is suggested that custom keys are namespaced according to
 * the code which sets them. For example, custom keys from GLib all have a
 * {@code GLIB_} prefix.
 * <p>
 * The {@code log_domain} will be converted into a {@code GLIB_DOMAIN} field. {@code log_level} will
 * be converted into a
 * <a href="https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#PRIORITY=">`PRIORITY`</a>
 * field. The format string will have its placeholders substituted for the provided
 * values and be converted into a
 * <a href="https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#MESSAGE=">`MESSAGE`</a>
 * field.
 * <p>
 * Other fields you may commonly want to pass into this function:
 * <p>
 *  * <a href="https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#MESSAGE_ID=">`MESSAGE_ID`</a>
 *  * <a href="https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#CODE_FILE=">`CODE_FILE`</a>
 *  * <a href="https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#CODE_LINE=">`CODE_LINE`</a>
 *  * <a href="https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#CODE_FUNC=">`CODE_FUNC`</a>
 *  * <a href="https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#ERRNO=">`ERRNO`</a>
 * <p>
 * Note that {@code CODE_FILE}, {@code CODE_LINE} and {@code CODE_FUNC} are automatically set by
 * the logging macros, G_DEBUG_HERE(), g_message(), g_warning(), g_critical(),
 * g_error(), etc, if the symbols {@code G_LOG_USE_STRUCTURED} is defined before including
 * {@code glib.h}.
 * <p>
 * For example:
 * <pre>{@code <!-- language="C" -->
 * g_log_structured (G_LOG_DOMAIN, G_LOG_LEVEL_DEBUG,
 *                   "MESSAGE_ID", "06d4df59e6c24647bfe69d2c27ef0b4e",
 *                   "MY_APPLICATION_CUSTOM_FIELD", "some debug string",
 *                   "MESSAGE", "This is a debug message about pointer %p and integer %u.",
 *                   some_pointer, some_integer);
 * }</pre>
 * <p>
 * Note that each {@code MESSAGE_ID} must be [uniquely and randomly
 * generated](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html{@code MESSAGE_ID}=).
 * If adding a {@code MESSAGE_ID}, consider shipping a [message
 * catalog](https://www.freedesktop.org/wiki/Software/systemd/catalog/) with
 * your software.
 * <p>
 * To pass a user data pointer to the log writer function which is specific to
 * this logging call, you must use g_log_structured_array() and pass the pointer
 * as a field with {@link LogField}.length set to zero, otherwise it will be
 * interpreted as a string.
 * <p>
 * For example:
 * <pre>{@code <!-- language="C" -->
 * const GLogField fields[] = {
 *   { "MESSAGE", "This is a debug message.", -1 },
 *   { "MESSAGE_ID", "fcfb2e1e65c3494386b74878f1abf893", -1 },
 *   { "MY_APPLICATION_CUSTOM_FIELD", "some debug string", -1 },
 *   { "MY_APPLICATION_STATE", state_object, 0 },
 * };
 * g_log_structured_array (G_LOG_LEVEL_DEBUG, fields, G_N_ELEMENTS (fields));
 * }</pre>
 * <p>
 * Note also that, even if no other structured fields are specified, there
 * must always be a {@code MESSAGE} key before the format string. The {@code MESSAGE}-format
 * pair has to be the last of the key-value pairs, and {@code MESSAGE} is the only
 * field for which printf()-style formatting is supported.
 * <p>
 * The default writer function for {@code stdout} and {@code stderr} will automatically
 * append a new-line character after the message, so you should not add one
 * manually to the format string.
 * @param logDomain log domain, usually {@code G_LOG_DOMAIN}
 * @param logLevel log level, either from {@link LogLevelFlags}, or a user-defined
 *    level
 * @param varargs key-value pairs of structured data to add to the log entry, followed
 *    by the key "MESSAGE", followed by a printf()-style message format,
 *    followed by parameters to insert in the format string
 */
public static void logStructured(java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_log_structured.invokeExact(
                    Marshal.stringToAddress.marshal(logDomain, SCOPE),
                    logLevel.getValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * @param logLevel log level, either from {@link LogLevelFlags}, or a user-defined
 *    level
 * @param fields key???value pairs of structured data to add
 *    to the log message
 * @param nFields number of elements in the {@code fields} array
 */
public static void logStructuredArray(org.gtk.glib.LogLevelFlags logLevel, org.gtk.glib.LogField[] fields, long nFields) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_log_structured_array.invokeExact(
                    logLevel.getValue(),
                    Interop.allocateNativeArray(fields, org.gtk.glib.LogField.getMemoryLayout(), false, SCOPE),
                    nFields);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static void logStructuredStandard(java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, java.lang.String file, java.lang.String line, java.lang.String func, java.lang.String messageFormat, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_log_structured_standard.invokeExact(
                    Marshal.stringToAddress.marshal(logDomain, SCOPE),
                    logLevel.getValue(),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    Marshal.stringToAddress.marshal(line, SCOPE),
                    Marshal.stringToAddress.marshal(func, SCOPE),
                    Marshal.stringToAddress.marshal(messageFormat, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * @param logDomain log domain, usually {@code G_LOG_DOMAIN}
 * @param logLevel log level, either from {@link LogLevelFlags}, or a user-defined
 *    level
 * @param fields a dictionary ({@link Variant} of the type {@code G_VARIANT_TYPE_VARDICT})
 * containing the key-value pairs of message data.
 */
public static void logVariant(@Nullable java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, org.gtk.glib.Variant fields) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_log_variant.invokeExact(
                    (Addressable) (logDomain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(logDomain, SCOPE)),
                    logLevel.getValue(),
                    fields.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * @param logLevel log level, either from {@link LogLevelFlags}, or a user-defined
 *    level
 * @param fields key???value pairs of structured data forming
 *    the log message
 * @param nFields number of elements in the {@code fields} array
 * @return {@link LogWriterOutput#HANDLED} on success, {@link LogWriterOutput#UNHANDLED} otherwise
 */
public static org.gtk.glib.LogWriterOutput logWriterDefault(org.gtk.glib.LogLevelFlags logLevel, org.gtk.glib.LogField[] fields, long nFields) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_log_writer_default.invokeExact(
                    logLevel.getValue(),
                    Interop.allocateNativeArray(fields, org.gtk.glib.LogField.getMemoryLayout(), false, SCOPE),
                    nFields,
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.LogWriterOutput.of(RESULT);
    }
}

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
 * @param useStderr If {@code true}, use {@code stderr} for log messages that would
 *  normally have appeared on {@code stdout}
 */
public static void logWriterDefaultSetUseStderr(boolean useStderr) {
    try {
        DowncallHandles.g_log_writer_default_set_use_stderr.invokeExact(Marshal.booleanToInteger.marshal(useStderr, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * <pre>{@code <!-- language="C" -->
 *   if (g_log_writer_default_would_drop (log_level, log_domain))
 *     return G_LOG_WRITER_HANDLED;
 * }</pre>
 * <p>
 * or to skip an expensive computation if it is only needed for a debugging
 * message, and {@code G_MESSAGES_DEBUG} is not set:
 * <pre>{@code <!-- language="C" -->
 *   if (!g_log_writer_default_would_drop (G_LOG_LEVEL_DEBUG, G_LOG_DOMAIN))
 *     {
 *       gchar *result = expensive_computation (my_object);
 * 
 *       g_debug ("my_object result: %s", result);
 *       g_free (result);
 *     }
 * }</pre>
 * @param logLevel log level, either from {@link LogLevelFlags}, or a user-defined
 *    level
 * @param logDomain log domain
 * @return {@code true} if the log message would be dropped by GLib's
 *  default log handlers
 */
public static boolean logWriterDefaultWouldDrop(org.gtk.glib.LogLevelFlags logLevel, @Nullable java.lang.String logDomain) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_log_writer_default_would_drop.invokeExact(
                    logLevel.getValue(),
                    (Addressable) (logDomain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(logDomain, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Format a structured log message as a string suitable for outputting to the
 * terminal (or elsewhere). This will include the values of all fields it knows
 * how to interpret, which includes {@code MESSAGE} and {@code GLIB_DOMAIN} (see the
 * documentation for g_log_structured()). It does not include values from
 * unknown fields.
 * <p>
 * The returned string does <strong>not</strong> have a trailing new-line character. It is
 * encoded in the character set of the current locale, which is not necessarily
 * UTF-8.
 * @param logLevel log level, either from {@link LogLevelFlags}, or a user-defined
 *    level
 * @param fields key???value pairs of structured data forming
 *    the log message
 * @param nFields number of elements in the {@code fields} array
 * @param useColor {@code true} to use ANSI color escape sequences when formatting the
 *    message, {@code false} to not
 * @return string containing the formatted log message, in
 *    the character set of the current locale
 */
public static java.lang.String logWriterFormatFields(org.gtk.glib.LogLevelFlags logLevel, org.gtk.glib.LogField[] fields, long nFields, boolean useColor) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_log_writer_format_fields.invokeExact(
                    logLevel.getValue(),
                    Interop.allocateNativeArray(fields, org.gtk.glib.LogField.getMemoryLayout(), false, SCOPE),
                    nFields,
                    Marshal.booleanToInteger.marshal(useColor, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param outputFd output file descriptor to check
 * @return {@code true} if {@code output_fd} points to the journal, {@code false} otherwise
 */
public static boolean logWriterIsJournald(int outputFd) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_log_writer_is_journald.invokeExact(outputFd);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Format a structured log message and send it to the systemd journal as a set
 * of key???value pairs. All fields are sent to the journal, but if a field has
 * length zero (indicating program-specific data) then only its key will be
 * sent.
 * <p>
 * This is suitable for use as a {@link LogWriterFunc}.
 * <p>
 * If GLib has been compiled without systemd support, this function is still
 * defined, but will always return {@link LogWriterOutput#UNHANDLED}.
 * @param logLevel log level, either from {@link LogLevelFlags}, or a user-defined
 *    level
 * @param fields key???value pairs of structured data forming
 *    the log message
 * @param nFields number of elements in the {@code fields} array
 * @return {@link LogWriterOutput#HANDLED} on success, {@link LogWriterOutput#UNHANDLED} otherwise
 */
public static org.gtk.glib.LogWriterOutput logWriterJournald(org.gtk.glib.LogLevelFlags logLevel, org.gtk.glib.LogField[] fields, long nFields) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_log_writer_journald.invokeExact(
                    logLevel.getValue(),
                    Interop.allocateNativeArray(fields, org.gtk.glib.LogField.getMemoryLayout(), false, SCOPE),
                    nFields,
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.LogWriterOutput.of(RESULT);
    }
}

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
 * @param logLevel log level, either from {@link LogLevelFlags}, or a user-defined
 *    level
 * @param fields key???value pairs of structured data forming
 *    the log message
 * @param nFields number of elements in the {@code fields} array
 * @return {@link LogWriterOutput#HANDLED} on success, {@link LogWriterOutput#UNHANDLED} otherwise
 */
public static org.gtk.glib.LogWriterOutput logWriterStandardStreams(org.gtk.glib.LogLevelFlags logLevel, org.gtk.glib.LogField[] fields, long nFields) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_log_writer_standard_streams.invokeExact(
                    logLevel.getValue(),
                    Interop.allocateNativeArray(fields, org.gtk.glib.LogField.getMemoryLayout(), false, SCOPE),
                    nFields,
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.LogWriterOutput.of(RESULT);
    }
}

/**
 * Check whether the given {@code output_fd} file descriptor supports ANSI color
 * escape sequences. If so, they can safely be used when formatting log
 * messages.
 * @param outputFd output file descriptor to check
 * @return {@code true} if ANSI color escapes are supported, {@code false} otherwise
 */
public static boolean logWriterSupportsColor(int outputFd) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_log_writer_supports_color.invokeExact(outputFd);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Logs an error or debugging message.
 * <p>
 * If the log level has been set as fatal, G_BREAKPOINT() is called
 * to terminate the program. See the documentation for G_BREAKPOINT() for
 * details of the debugging options this provides.
 * <p>
 * If g_log_default_handler() is used as the log handler function, a new-line
 * character will automatically be appended to {@code .}.., and need not be entered
 * manually.
 * <p>
 * If [structured logging is enabled][using-structured-logging] this will
 * output via the structured log writer function (see g_log_set_writer_func()).
 * @param logDomain the log domain, or {@code null} for the default ""
 * application domain
 * @param logLevel the log level
 * @param format the message format. See the printf() documentation
 * @param args the parameters to insert into the format string
 */
public static void logv(@Nullable java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_logv.invokeExact(
                    (Addressable) (logDomain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(logDomain, SCOPE)),
                    logLevel.getValue(),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Returns the global default main context. This is the main context
 * used for main loop functions when a main loop is not explicitly
 * specified, and corresponds to the "main" main loop. See also
 * g_main_context_get_thread_default().
 * @return the global default main context.
 */
public static org.gtk.glib.MainContext mainContextDefault() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_main_context_default.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.MainContext.fromAddress.marshal(RESULT, null);
}

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
 * @return the thread-default {@link MainContext}, or
 * {@code null} if the thread-default context is the global default context.
 */
public static @Nullable org.gtk.glib.MainContext mainContextGetThreadDefault() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_main_context_get_thread_default.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.MainContext.fromAddress.marshal(RESULT, null);
}

/**
 * Gets the thread-default {@link MainContext} for this thread, as with
 * g_main_context_get_thread_default(), but also adds a reference to
 * it with g_main_context_ref(). In addition, unlike
 * g_main_context_get_thread_default(), if the thread-default context
 * is the global default context, this will return that {@link MainContext}
 * (with a ref added to it) rather than returning {@code null}.
 * @return the thread-default {@link MainContext}. Unref
 *     with g_main_context_unref() when you are done with it.
 */
public static org.gtk.glib.MainContext mainContextRefThreadDefault() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_main_context_ref_thread_default.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.MainContext.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Returns the currently firing source for this thread.
 * @return The currently firing source or {@code null}.
 */
public static @Nullable org.gtk.glib.Source mainCurrentSource() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_main_current_source.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
}

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
 * @return The main loop recursion level in the current thread
 */
public static int mainDepth() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_main_depth.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocates {@code n_bytes} bytes of memory.
 * If {@code n_bytes} is 0 it returns {@code null}.
 * <p>
 * If the allocation fails (because the system is out of memory),
 * the program is terminated.
 * @param nBytes the number of bytes to allocate
 * @return a pointer to the allocated memory
 */
public static @Nullable java.lang.foreign.MemoryAddress malloc(long nBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_malloc.invokeExact(nBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocates {@code n_bytes} bytes of memory, initialized to 0's.
 * If {@code n_bytes} is 0 it returns {@code null}.
 * <p>
 * If the allocation fails (because the system is out of memory),
 * the program is terminated.
 * @param nBytes the number of bytes to allocate
 * @return a pointer to the allocated memory
 */
public static @Nullable java.lang.foreign.MemoryAddress malloc0(long nBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_malloc0.invokeExact(nBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * This function is similar to g_malloc0(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
 * but care is taken to detect possible overflow during multiplication.
 * <p>
 * If the allocation fails (because the system is out of memory),
 * the program is terminated.
 * @param nBlocks the number of blocks to allocate
 * @param nBlockBytes the size of each block in bytes
 * @return a pointer to the allocated memory
 */
public static @Nullable java.lang.foreign.MemoryAddress malloc0N(long nBlocks, long nBlockBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_malloc0_n.invokeExact(
                nBlocks,
                nBlockBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * This function is similar to g_malloc(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
 * but care is taken to detect possible overflow during multiplication.
 * <p>
 * If the allocation fails (because the system is out of memory),
 * the program is terminated.
 * @param nBlocks the number of blocks to allocate
 * @param nBlockBytes the size of each block in bytes
 * @return a pointer to the allocated memory
 */
public static @Nullable java.lang.foreign.MemoryAddress mallocN(long nBlocks, long nBlockBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_malloc_n.invokeExact(
                nBlocks,
                nBlockBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Collects the attributes of the element from the data passed to the
 * {@link MarkupParser} start_element function, dealing with common error
 * conditions and supporting boolean values.
 * <p>
 * This utility function is not required to write a parser but can save
 * a lot of typing.
 * <p>
 * The {@code element_name}, {@code attribute_names}, {@code attribute_values} and {@code error}
 * parameters passed to the start_element callback should be passed
 * unmodified to this function.
 * <p>
 * Following these arguments is a list of "supported" attributes to collect.
 * It is an error to specify multiple attributes with the same name. If any
 * attribute not in the list appears in the {@code attribute_names} array then an
 * unknown attribute error will result.
 * <p>
 * The {@link MarkupCollectType} field allows specifying the type of collection
 * to perform and if a given attribute must appear or is optional.
 * <p>
 * The attribute name is simply the name of the attribute to collect.
 * <p>
 * The pointer should be of the appropriate type (see the descriptions
 * under {@link MarkupCollectType}) and may be {@code null} in case a particular
 * attribute is to be allowed but ignored.
 * <p>
 * This function deals with issuing errors for missing attributes
 * (of type {@link MarkupError#MISSING_ATTRIBUTE}), unknown attributes
 * (of type {@link MarkupError#UNKNOWN_ATTRIBUTE}) and duplicate
 * attributes (of type {@link MarkupError#INVALID_CONTENT}) as well
 * as parse errors for boolean-valued attributes (again of type
 * {@link MarkupError#INVALID_CONTENT}). In all of these cases {@code false}
 * will be returned and {@code error} will be set as appropriate.
 * @param elementName the current tag name
 * @param attributeNames the attribute names
 * @param attributeValues the attribute values
 * @param error a pointer to a {@link Error} or {@code null}
 * @param firstType the {@link MarkupCollectType} of the first attribute
 * @param firstAttr the name of the first attribute
 * @param varargs a pointer to the storage location of the first attribute
 *     (or {@code null}), followed by more types names and pointers, ending
 *     with {@link MarkupCollectType#INVALID}
 * @return {@code true} if successful
 */
public static boolean markupCollectAttributes(java.lang.String elementName, PointerString attributeNames, PointerString attributeValues, PointerProxy<org.gtk.glib.Error> error, org.gtk.glib.MarkupCollectType firstType, java.lang.String firstAttr, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_markup_collect_attributes.invokeExact(
                    Marshal.stringToAddress.marshal(elementName, SCOPE),
                    attributeNames.handle(),
                    attributeValues.handle(),
                    error.handle(),
                    firstType.getValue(),
                    Marshal.stringToAddress.marshal(firstAttr, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Quark markupErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_markup_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

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
 * the range of &amp;{@code x1}; ... &amp;{@code x1f}; for all control sequences
 * except for tabstop, newline and carriage return.  The character
 * references in this range are not valid XML 1.0, but they are
 * valid XML 1.1 and will be accepted by the GMarkup parser.
 * @param text some valid UTF-8 text
 * @param length length of {@code text} in bytes, or -1 if the text is nul-terminated
 * @return a newly allocated string with the escaped text
 */
public static java.lang.String markupEscapeText(java.lang.String text, long length) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_markup_escape_text.invokeExact(
                    Marshal.stringToAddress.marshal(text, SCOPE),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Formats arguments according to {@code format}, escaping
 * all string and character arguments in the fashion
 * of g_markup_escape_text(). This is useful when you
 * want to insert literal strings into XML-style markup
 * output, without having to worry that the strings
 * might themselves contain markup.
 * <pre>{@code <!-- language="C" -->
 * const char *store = "Fortnum & Mason";
 * const char *item = "Tea";
 * char *output;
 * 
 * output = g_markup_printf_escaped ("<purchase>"
 *                                   "<store>%s</store>"
 *                                   "<item>%s</item>"
 *                                   "</purchase>",
 *                                   store, item);
 * }</pre>
 * @param format printf() style format string
 * @param varargs the arguments to insert in the format string
 * @return newly allocated result from formatting
 *    operation. Free with g_free().
 */
public static java.lang.String markupPrintfEscaped(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_markup_printf_escaped.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Formats the data in {@code args} according to {@code format}, escaping
 * all string and character arguments in the fashion
 * of g_markup_escape_text(). See g_markup_printf_escaped().
 * @param format printf() style format string
 * @param args variable argument list, similar to vprintf()
 * @return newly allocated result from formatting
 *  operation. Free with g_free().
 */
public static java.lang.String markupVprintfEscaped(java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_markup_vprintf_escaped.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Checks whether the allocator used by g_malloc() is the system's
 * malloc implementation. If it returns {@code true} memory allocated with
 * malloc() can be used interchangeably with memory allocated using g_malloc().
 * This function is useful for avoiding an extra copy of allocated memory returned
 * by a non-GLib-based API.
 * @return if {@code true}, malloc() and g_malloc() can be mixed.
 * @deprecated GLib always uses the system malloc, so this function always
 * returns {@code true}.
 */
@Deprecated
public static boolean memIsSystemMalloc() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_mem_is_system_malloc.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * GLib used to support some tools for memory profiling, but this
 * no longer works. There are many other useful tools for memory
 * profiling these days which can be used instead.
 * @deprecated Use other memory profiling tools instead
 */
@Deprecated
public static void memProfile() {
    try {
        DowncallHandles.g_mem_profile.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * This function used to let you override the memory allocation function.
 * However, its use was incompatible with the use of global constructors
 * in GLib and GIO, because those use the GLib allocators before main is
 * reached. Therefore this function is now deprecated and is just a stub.
 * @param vtable table of memory allocation routines.
 * @deprecated This function now does nothing. Use other memory
 * profiling tools instead
 */
@Deprecated
public static void memSetVtable(org.gtk.glib.MemVTable vtable) {
    try {
        DowncallHandles.g_mem_set_vtable.invokeExact(vtable.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Allocates {@code byte_size} bytes of memory, and copies {@code byte_size} bytes into it
 * from {@code mem}. If {@code mem} is {@code null} it returns {@code null}.
 * @param mem the memory to copy.
 * @param byteSize the number of bytes to copy.
 * @return a pointer to the newly-allocated copy of the memory, or {@code null} if {@code mem}
 *  is {@code null}.
 * @deprecated Use g_memdup2() instead, as it accepts a {@code gsize} argument
 *     for {@code byte_size}, avoiding the possibility of overflow in a {@code gsize} ??? {@code guint}
 *     conversion
 */
@Deprecated
public static @Nullable java.lang.foreign.MemoryAddress memdup(@Nullable java.lang.foreign.MemoryAddress mem, int byteSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_memdup.invokeExact(
                (Addressable) (mem == null ? MemoryAddress.NULL : (Addressable) mem),
                byteSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocates {@code byte_size} bytes of memory, and copies {@code byte_size} bytes into it
 * from {@code mem}. If {@code mem} is {@code null} it returns {@code null}.
 * <p>
 * This replaces g_memdup(), which was prone to integer overflows when
 * converting the argument from a {@code gsize} to a {@code guint}.
 * @param mem the memory to copy.
 * @param byteSize the number of bytes to copy.
 * @return a pointer to the newly-allocated copy of the memory,
 *    or {@code null} if {@code mem} is {@code null}.
 */
public static @Nullable java.lang.foreign.MemoryAddress memdup2(@Nullable java.lang.foreign.MemoryAddress mem, long byteSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_memdup2.invokeExact(
                (Addressable) (mem == null ? MemoryAddress.NULL : (Addressable) mem),
                byteSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Create a directory if it doesn't already exist. Create intermediate
 * parent directories as needed, too.
 * @param pathname a pathname in the GLib file name encoding
 * @param mode permissions to use for newly created directories
 * @return 0 if the directory already exists, or was successfully
 * created. Returns -1 if an error occurred, with errno set.
 */
public static int mkdirWithParents(java.lang.String pathname, int mode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mkdir_with_parents.invokeExact(
                    Marshal.stringToAddress.marshal(pathname, SCOPE),
                    mode);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * @param tmpl template directory name
 * @return A pointer to {@code tmpl}, which has been
 *     modified to hold the directory name.  In case of errors, {@code null} is
 *     returned and {@code errno} will be set.
 */
public static @Nullable java.lang.String mkdtemp(java.lang.String tmpl) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mkdtemp.invokeExact(Marshal.stringToAddress.marshal(tmpl, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param tmpl template directory name
 * @param mode permissions to create the temporary directory with
 * @return A pointer to {@code tmpl}, which has been
 *     modified to hold the directory name. In case of errors, {@code null} is
 *     returned, and {@code errno} will be set.
 */
public static @Nullable java.lang.String mkdtempFull(java.lang.String tmpl, int mode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mkdtemp_full.invokeExact(
                    Marshal.stringToAddress.marshal(tmpl, SCOPE),
                    mode);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param tmpl template filename
 * @return A file handle (as from open()) to the file
 *     opened for reading and writing. The file is opened in binary
 *     mode on platforms where there is a difference. The file handle
 *     should be closed with close(). In case of errors, -1 is
 *     returned and {@code errno} will be set.
 */
public static int mkstemp(java.lang.String tmpl) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mkstemp.invokeExact(Marshal.stringToAddress.marshal(tmpl, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * @param tmpl template filename
 * @param flags flags to pass to an open() call in addition to O_EXCL
 *     and O_CREAT, which are passed automatically
 * @param mode permissions to create the temporary file with
 * @return A file handle (as from open()) to the file
 *     opened for reading and writing. The file handle should be
 *     closed with close(). In case of errors, -1 is returned
 *     and {@code errno} will be set.
 */
public static int mkstempFull(java.lang.String tmpl, int flags, int mode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mkstemp_full.invokeExact(
                    Marshal.stringToAddress.marshal(tmpl, SCOPE),
                    flags,
                    mode);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Set the pointer at the specified location to {@code null}.
 * @param nullifyLocation the memory address of the pointer.
 */
public static void nullifyPointer(java.lang.foreign.MemoryAddress nullifyLocation) {
    try {
        DowncallHandles.g_nullify_pointer.invokeExact((Addressable) nullifyLocation);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static org.gtk.glib.Quark numberParserErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_number_parser_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Prompts the user with
 * {@code [E]xit, [H]alt, show [S]tack trace or [P]roceed}.
 * This function is intended to be used for debugging use only.
 * The following example shows how it can be used together with
 * the g_log() functions.
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
 * }}</pre>
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
 * variable (see <a href="glib-running.html">Running GLib Applications</a>) and
 * calling g_on_error_stack_trace() instead.
 * @param prgName the program name, needed by gdb for the "[S]tack trace"
 *     option. If {@code prg_name} is {@code null}, g_get_prgname() is called to get
 *     the program name (which will work correctly if gdk_init() or
 *     gtk_init() has been called)
 */
public static void onErrorQuery(java.lang.String prgName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_on_error_query.invokeExact(Marshal.stringToAddress.marshal(prgName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Invokes gdb, which attaches to the current process and shows a
 * stack trace. Called by g_on_error_query() when the "[S]tack trace"
 * option is selected. You can get the current process's program name
 * with g_get_prgname(), assuming that you have called gtk_init() or
 * gdk_init().
 * <p>
 * This function may cause different actions on non-UNIX platforms.
 * <p>
 * When running on Windows, this function is <em>not</em> called by
 * g_on_error_query(). If called directly, it will raise an
 * exception, which will crash the program. If the {@code G_DEBUGGER} environment
 * variable is set, a debugger will be invoked to attach and
 * handle that exception (see <a href="glib-running.html">Running GLib Applications</a>).
 * @param prgName the program name, needed by gdb for the "[S]tack trace"
 *     option
 */
public static void onErrorStackTrace(java.lang.String prgName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_on_error_stack_trace.invokeExact(Marshal.stringToAddress.marshal(prgName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * @param location location of a static initializable variable
 *    containing 0
 * @return {@code true} if the initialization section should be entered,
 *     {@code false} and blocks otherwise
 */
public static boolean onceInitEnter(java.lang.foreign.MemoryAddress location) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_once_init_enter.invokeExact((Addressable) location);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Counterpart to g_once_init_enter(). Expects a location of a static
 * 0-initialized initialization variable, and an initialization value
 * other than 0. Sets the variable to the initialization value, and
 * releases concurrent threads blocking in g_once_init_enter() on this
 * initialization variable.
 * <p>
 * While {@code location} has a {@code volatile} qualifier, this is a historical artifact and
 * the pointer passed to it should not be {@code volatile}.
 * @param location location of a static initializable variable
 *    containing 0
 * @param result new non-0 value for *{@code value_location}
 */
public static void onceInitLeave(java.lang.foreign.MemoryAddress location, long result) {
    try {
        DowncallHandles.g_once_init_leave.invokeExact(
                (Addressable) location,
                result);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static org.gtk.glib.Quark optionErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_option_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

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
 * @param string a list of debug options separated by colons, spaces, or
 * commas, or {@code null}.
 * @param keys pointer to an array of {@link DebugKey} which associate
 *     strings with bit flags.
 * @param nkeys the number of {@code GDebugKeys} in the array.
 * @return the combined set of bit flags.
 */
public static int parseDebugString(@Nullable java.lang.String string, org.gtk.glib.DebugKey[] keys, int nkeys) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_parse_debug_string.invokeExact(
                    (Addressable) (string == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(string, SCOPE)),
                    Interop.allocateNativeArray(keys, org.gtk.glib.DebugKey.getMemoryLayout(), false, SCOPE),
                    nkeys);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Gets the last component of the filename.
 * <p>
 * If {@code file_name} ends with a directory separator it gets the component
 * before the last slash. If {@code file_name} consists only of directory
 * separators (and on Windows, possibly a drive letter), a single
 * separator is returned. If {@code file_name} is empty, it gets ".".
 * @param fileName the name of the file
 * @return a newly allocated string
 *    containing the last component of the filename
 */
public static java.lang.String pathGetBasename(java.lang.String fileName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_path_get_basename.invokeExact(Marshal.stringToAddress.marshal(fileName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Gets the directory components of a file name. For example, the directory
 * component of {@code /usr/bin/test} is {@code /usr/bin}. The directory component of {@code /}
 * is {@code /}.
 * <p>
 * If the file name has no directory components "." is returned.
 * The returned string should be freed when no longer needed.
 * @param fileName the name of the file
 * @return the directory components of the file
 */
public static java.lang.String pathGetDirname(java.lang.String fileName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_path_get_dirname.invokeExact(Marshal.stringToAddress.marshal(fileName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param fileName a file name
 * @return {@code true} if {@code file_name} is absolute
 */
public static boolean pathIsAbsolute(java.lang.String fileName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_path_is_absolute.invokeExact(Marshal.stringToAddress.marshal(fileName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Returns a pointer into {@code file_name} after the root component,
 * i.e. after the "/" in UNIX or "C:\\" under Windows. If {@code file_name}
 * is not an absolute path it returns {@code null}.
 * @param fileName a file name
 * @return a pointer into {@code file_name} after the
 *     root component
 */
public static @Nullable java.lang.String pathSkipRoot(java.lang.String fileName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_path_skip_root.invokeExact(Marshal.stringToAddress.marshal(fileName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Matches a string against a compiled pattern. Passing the correct
 * length of the string given is mandatory. The reversed string can be
 * omitted by passing {@code null}, this is more efficient if the reversed
 * version of the string to be matched is not at hand, as
 * g_pattern_match() will only construct it if the compiled pattern
 * requires reverse matches.
 * <p>
 * Note that, if the user code will (possibly) match a string against a
 * multitude of patterns containing wildcards, chances are high that
 * some patterns will require a reversed string. In this case, it's
 * more efficient to provide the reversed string to avoid multiple
 * constructions thereof in the various calls to g_pattern_match().
 * <p>
 * Note also that the reverse of a UTF-8 encoded string can in general
 * not be obtained by g_strreverse(). This works only if the string
 * does not contain any multibyte characters. GLib offers the
 * g_utf8_strreverse() function to reverse UTF-8 encoded strings.
 * @param pspec a {@link PatternSpec}
 * @param stringLength the length of {@code string} (in bytes, i.e. strlen(),
 *     not g_utf8_strlen())
 * @param string the UTF-8 encoded string to match
 * @param stringReversed the reverse of {@code string} or {@code null}
 * @return {@code true} if {@code string} matches {@code pspec}
 * @deprecated Use g_pattern_spec_match() instead
 */
@Deprecated
public static boolean patternMatch(org.gtk.glib.PatternSpec pspec, int stringLength, java.lang.String string, @Nullable java.lang.String stringReversed) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pattern_match.invokeExact(
                    pspec.handle(),
                    stringLength,
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    (Addressable) (stringReversed == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(stringReversed, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Matches a string against a pattern given as a string. If this
 * function is to be called in a loop, it's more efficient to compile
 * the pattern once with g_pattern_spec_new() and call
 * g_pattern_match_string() repeatedly.
 * @param pattern the UTF-8 encoded pattern
 * @param string the UTF-8 encoded string to match
 * @return {@code true} if {@code string} matches {@code pspec}
 */
public static boolean patternMatchSimple(java.lang.String pattern, java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pattern_match_simple.invokeExact(
                    Marshal.stringToAddress.marshal(pattern, SCOPE),
                    Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Matches a string against a compiled pattern. If the string is to be
 * matched against more than one pattern, consider using
 * g_pattern_match() instead while supplying the reversed string.
 * @param pspec a {@link PatternSpec}
 * @param string the UTF-8 encoded string to match
 * @return {@code true} if {@code string} matches {@code pspec}
 * @deprecated Use g_pattern_spec_match_string() instead
 */
@Deprecated
public static boolean patternMatchString(org.gtk.glib.PatternSpec pspec, java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_pattern_match_string.invokeExact(
                    pspec.handle(),
                    Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * This is equivalent to g_bit_lock, but working on pointers (or other
 * pointer-sized values).
 * <p>
 * For portability reasons, you may only lock on the bottom 32 bits of
 * the pointer.
 * <p>
 * While {@code address} has a {@code volatile} qualifier, this is a historical
 * artifact and the argument passed to it should not be {@code volatile}.
 * @param address a pointer to a {@code gpointer}-sized value
 * @param lockBit a bit value between 0 and 31
 */
public static void pointerBitLock(java.lang.foreign.MemoryAddress address, int lockBit) {
    try {
        DowncallHandles.g_pointer_bit_lock.invokeExact(
                (Addressable) address,
                lockBit);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * This is equivalent to g_bit_trylock(), but working on pointers (or
 * other pointer-sized values).
 * <p>
 * For portability reasons, you may only lock on the bottom 32 bits of
 * the pointer.
 * <p>
 * While {@code address} has a {@code volatile} qualifier, this is a historical
 * artifact and the argument passed to it should not be {@code volatile}.
 * @param address a pointer to a {@code gpointer}-sized value
 * @param lockBit a bit value between 0 and 31
 * @return {@code true} if the lock was acquired
 */
public static boolean pointerBitTrylock(java.lang.foreign.MemoryAddress address, int lockBit) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_pointer_bit_trylock.invokeExact(
                (Addressable) address,
                lockBit);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * This is equivalent to g_bit_unlock, but working on pointers (or other
 * pointer-sized values).
 * <p>
 * For portability reasons, you may only lock on the bottom 32 bits of
 * the pointer.
 * <p>
 * While {@code address} has a {@code volatile} qualifier, this is a historical
 * artifact and the argument passed to it should not be {@code volatile}.
 * @param address a pointer to a {@code gpointer}-sized value
 * @param lockBit a bit value between 0 and 31
 */
public static void pointerBitUnlock(java.lang.foreign.MemoryAddress address, int lockBit) {
    try {
        DowncallHandles.g_pointer_bit_unlock.invokeExact(
                (Addressable) address,
                lockBit);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param fds file descriptors to poll
 * @param nfds the number of file descriptors in {@code fds}
 * @param timeout amount of time to wait, in milliseconds, or -1 to wait forever
 * @return the number of entries in {@code fds} whose {@code revents} fields
 * were filled in, or 0 if the operation timed out, or -1 on error or
 * if the call was interrupted.
 */
public static int poll(org.gtk.glib.PollFD fds, int nfds, int timeout) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_poll.invokeExact(
                fds.handle(),
                nfds,
                timeout);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Formats a string according to {@code format} and prefix it to an existing
 * error message. If {@code err} is {@code null} (ie: no error variable) then do
 * nothing.
 * <p>
 * If *{@code err} is {@code null} (ie: an error variable is present but there is no
 * error condition) then also do nothing.
 * @param err a return location for a {@link Error}
 * @param format printf()-style format string
 * @param varargs arguments to {@code format}
 */
public static void prefixError(@Nullable Out<org.gtk.glib.Error> err, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment errPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.g_prefix_error.invokeExact(
                    (Addressable) errPOINTER.address(),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                err.set(org.gtk.glib.Error.fromAddress.marshal(errPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
    }
}

/**
 * Prefixes {@code prefix} to an existing error message. If {@code err} or *{@code err} is
 * {@code null} (i.e.: no error variable) then do nothing.
 * @param err a return location for a {@link Error}, or {@code null}
 * @param prefix string to prefix {@code err} with
 */
public static void prefixErrorLiteral(@Nullable PointerProxy<org.gtk.glib.Error> err, java.lang.String prefix) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_prefix_error_literal.invokeExact(
                    err.handle(),
                    Marshal.stringToAddress.marshal(prefix, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Outputs a formatted message via the print handler.
 * The default print handler simply outputs the message to stdout, without
 * appending a trailing new-line character. Typically, {@code format} should end with
 * its own new-line character.
 * <p>
 * g_print() should not be used from within libraries for debugging
 * messages, since it may be redirected by applications to special
 * purpose message windows or even files. Instead, libraries should
 * use g_log(), g_log_structured(), or the convenience macros g_message(),
 * g_warning() and g_error().
 * @param format the message format. See the printf() documentation
 * @param varargs the parameters to insert into the format string
 */
public static void print(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_print.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Outputs a formatted message via the error message handler.
 * The default handler simply outputs the message to stderr, without appending
 * a trailing new-line character. Typically, {@code format} should end with its own
 * new-line character.
 * <p>
 * g_printerr() should not be used from within libraries.
 * Instead g_log() or g_log_structured() should be used, or the convenience
 * macros g_message(), g_warning() and g_error().
 * @param format the message format. See the printf() documentation
 * @param varargs the parameters to insert into the format string
 */
public static void printerr(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_printerr.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * An implementation of the standard printf() function which supports
 * positional parameters, as specified in the Single Unix Specification.
 * <p>
 * As with the standard printf(), this does not automatically append a trailing
 * new-line character to the message, so typically {@code format} should end with its
 * own new-line character.
 * <p>
 * {@code glib/gprintf.h} must be explicitly included in order to use this function.
 * @param format a standard printf() format string, but notice
 *          [string precision pitfalls][string-precision]
 * @param varargs the arguments to insert in the output.
 * @return the number of bytes printed.
 */
public static int printf(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_printf.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Calculates the maximum space needed to store the output
 * of the sprintf() function.
 * @param format the format string. See the printf() documentation
 * @param args the parameters to be inserted into the format string
 * @return the maximum space needed to store the formatted string
 */
public static long printfStringUpperBound(java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_printf_string_upper_bound.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * If {@code dest} is {@code null}, free {@code src}; otherwise, moves {@code src} into *{@code dest}.
 * The error variable {@code dest} points to must be {@code null}.
 * <p>
 * {@code src} must be non-{@code null}.
 * <p>
 * Note that {@code src} is no longer valid after this call. If you want
 * to keep using the same GError*, you need to set it to {@code null}
 * after calling this function on it.
 * @param dest error return location
 * @param src error to move into the return location
 */
public static void propagateError(@Nullable Out<org.gtk.glib.Error> dest, org.gtk.glib.Error src) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment destPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.g_propagate_error.invokeExact(
                    (Addressable) destPOINTER.address(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                dest.set(org.gtk.glib.Error.fromAddress.marshal(destPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        src.yieldOwnership();
    }
}

/**
 * If {@code dest} is {@code null}, free {@code src}; otherwise, moves {@code src} into *{@code dest}.
 * *{@code dest} must be {@code null}. After the move, add a prefix as with
 * g_prefix_error().
 * @param dest error return location
 * @param src error to move into the return location
 * @param format printf()-style format string
 * @param varargs arguments to {@code format}
 */
public static void propagatePrefixedError(PointerProxy<org.gtk.glib.Error> dest, org.gtk.glib.Error src, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_propagate_prefixed_error.invokeExact(
                    dest.handle(),
                    src.handle(),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Checks whether {@code needle} exists in {@code haystack}. If the element is found, {@code true} is
 * returned and the element???s index is returned in {@code index_} (if non-{@code null}).
 * Otherwise, {@code false} is returned and {@code index_} is undefined. If {@code needle} exists
 * multiple times in {@code haystack}, the index of the first instance is returned.
 * <p>
 * This does pointer comparisons only. If you want to use more complex equality
 * checks, such as string comparisons, use g_ptr_array_find_with_equal_func().
 * @param haystack pointer array to be searched
 * @param needle pointer to look for
 * @param index return location for the index of
 *    the element, if found
 * @return {@code true} if {@code needle} is one of the elements of {@code haystack}
 */
public static boolean ptrArrayFind(java.lang.foreign.MemoryAddress[] haystack, @Nullable java.lang.foreign.MemoryAddress needle, Out<Integer> index) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment indexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_ptr_array_find.invokeExact(
                    Interop.allocateNativeArray(haystack, false, SCOPE),
                    (Addressable) (needle == null ? MemoryAddress.NULL : (Addressable) needle),
                    (Addressable) (index == null ? MemoryAddress.NULL : (Addressable) indexPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (index != null) index.set(indexPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Checks whether {@code needle} exists in {@code haystack}, using the given {@code equal_func}.
 * If the element is found, {@code true} is returned and the element???s index is
 * returned in {@code index_} (if non-{@code null}). Otherwise, {@code false} is returned and {@code index_}
 * is undefined. If {@code needle} exists multiple times in {@code haystack}, the index of
 * the first instance is returned.
 * <p>
 * {@code equal_func} is called with the element from the array as its first parameter,
 * and {@code needle} as its second parameter. If {@code equal_func} is {@code null}, pointer
 * equality is used.
 * @param haystack pointer array to be searched
 * @param needle pointer to look for
 * @param equalFunc the function to call for each element, which should
 *    return {@code true} when the desired element is found; or {@code null} to use pointer
 *    equality
 * @param index return location for the index of
 *    the element, if found
 * @return {@code true} if {@code needle} is one of the elements of {@code haystack}
 */
public static boolean ptrArrayFindWithEqualFunc(java.lang.foreign.MemoryAddress[] haystack, @Nullable java.lang.foreign.MemoryAddress needle, @Nullable org.gtk.glib.EqualFunc equalFunc, Out<Integer> index) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment indexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_ptr_array_find_with_equal_func.invokeExact(
                    Interop.allocateNativeArray(haystack, false, SCOPE),
                    (Addressable) (needle == null ? MemoryAddress.NULL : (Addressable) needle),
                    (Addressable) (equalFunc == null ? MemoryAddress.NULL : (Addressable) equalFunc.toCallback()),
                    (Addressable) (index == null ? MemoryAddress.NULL : (Addressable) indexPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (index != null) index.set(indexPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * This is just like the standard C qsort() function, but
 * the comparison routine accepts a user data argument.
 * <p>
 * This is guaranteed to be a stable sort since version 2.32.
 * @param pbase start of array to sort
 * @param totalElems elements in the array
 * @param size size of each element
 * @param compareFunc function to compare elements
 */
public static void qsortWithData(java.lang.foreign.MemoryAddress pbase, int totalElems, long size, org.gtk.glib.CompareDataFunc compareFunc) {
    try {
        DowncallHandles.g_qsort_with_data.invokeExact(
                (Addressable) pbase,
                totalElems,
                size,
                (Addressable) compareFunc.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param string a string
 * @return the {@link Quark} identifying the string, or 0 if {@code string} is {@code null}
 */
public static org.gtk.glib.Quark quarkFromStaticString(@Nullable java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_quark_from_static_string.invokeExact((Addressable) (string == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(string, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
}

/**
 * Gets the {@link Quark} identifying the given string. If the string does
 * not currently have an associated {@link Quark}, a new {@link Quark} is created,
 * using a copy of the string.
 * <p>
 * This function must not be used before library constructors have finished
 * running. In particular, this means it cannot be used to initialize global
 * variables in C++.
 * @param string a string
 * @return the {@link Quark} identifying the string, or 0 if {@code string} is {@code null}
 */
public static org.gtk.glib.Quark quarkFromString(@Nullable java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_quark_from_string.invokeExact((Addressable) (string == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(string, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
}

/**
 * Gets the string associated with the given {@link Quark}.
 * @param quark a {@link Quark}.
 * @return the string associated with the {@link Quark}
 */
public static java.lang.String quarkToString(org.gtk.glib.Quark quark) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_quark_to_string.invokeExact(quark.getValue().intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Gets the {@link Quark} associated with the given string, or 0 if string is
 * {@code null} or it has no associated {@link Quark}.
 * <p>
 * If you want the GQuark to be created if it doesn't already exist,
 * use g_quark_from_string() or g_quark_from_static_string().
 * <p>
 * This function must not be used before library constructors have finished
 * running.
 * @param string a string
 * @return the {@link Quark} associated with the string, or 0 if {@code string} is
 *     {@code null} or there is no {@link Quark} associated with it
 */
public static org.gtk.glib.Quark quarkTryString(@Nullable java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_quark_try_string.invokeExact((Addressable) (string == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(string, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
}

/**
 * Returns a random {@code gdouble} equally distributed over the range [0..1).
 * @return a random number
 */
public static double randomDouble() {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.g_random_double.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns a random {@code gdouble} equally distributed over the range
 * [{@code begin}..{@code end}).
 * @param begin lower closed bound of the interval
 * @param end upper open bound of the interval
 * @return a random number
 */
public static double randomDoubleRange(double begin, double end) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.g_random_double_range.invokeExact(
                begin,
                end);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Return a random {@code guint32} equally distributed over the range
 * [0..2^32-1].
 * @return a random number
 */
public static int randomInt() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_random_int.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns a random {@code gint32} equally distributed over the range
 * {@code end-1}.
 * @param begin lower closed bound of the interval
 * @param end upper open bound of the interval
 * @return a random number
 */
public static int randomIntRange(int begin, int end) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_random_int_range.invokeExact(
                begin,
                end);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Sets the seed for the global random number generator, which is used
 * by the g_random_* functions, to {@code seed}.
 * @param seed a value to reinitialize the global random number generator
 */
public static void randomSetSeed(int seed) {
    try {
        DowncallHandles.g_random_set_seed.invokeExact(seed);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Acquires a reference on the data pointed by {@code mem_block}.
 * @param memBlock a pointer to reference counted data
 * @return a pointer to the data,
 *   with its reference count increased
 */
public static java.lang.foreign.MemoryAddress rcBoxAcquire(java.lang.foreign.MemoryAddress memBlock) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_rc_box_acquire.invokeExact((Addressable) memBlock);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocates {@code block_size} bytes of memory, and adds reference
 * counting semantics to it.
 * <p>
 * The data will be freed when its reference count drops to
 * zero.
 * <p>
 * The allocated data is guaranteed to be suitably aligned for any
 * built-in type.
 * @param blockSize the size of the allocation, must be greater than 0
 * @return a pointer to the allocated memory
 */
public static java.lang.foreign.MemoryAddress rcBoxAlloc(long blockSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_rc_box_alloc.invokeExact(blockSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param blockSize the size of the allocation, must be greater than 0
 * @return a pointer to the allocated memory
 */
public static java.lang.foreign.MemoryAddress rcBoxAlloc0(long blockSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_rc_box_alloc0.invokeExact(blockSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocates a new block of data with reference counting
 * semantics, and copies {@code block_size} bytes of {@code mem_block}
 * into it.
 * @param blockSize the number of bytes to copy, must be greater than 0
 * @param memBlock the memory to copy
 * @return a pointer to the allocated
 *   memory
 */
public static java.lang.foreign.MemoryAddress rcBoxDup(long blockSize, java.lang.foreign.MemoryAddress memBlock) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_rc_box_dup.invokeExact(
                blockSize,
                (Addressable) memBlock);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Retrieves the size of the reference counted data pointed by {@code mem_block}.
 * @param memBlock a pointer to reference counted data
 * @return the size of the data, in bytes
 */
public static long rcBoxGetSize(java.lang.foreign.MemoryAddress memBlock) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_rc_box_get_size.invokeExact((Addressable) memBlock);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Releases a reference on the data pointed by {@code mem_block}.
 * <p>
 * If the reference was the last one, it will free the
 * resources allocated for {@code mem_block}.
 * @param memBlock a pointer to reference counted data
 */
public static void rcBoxRelease(java.lang.foreign.MemoryAddress memBlock) {
    try {
        DowncallHandles.g_rc_box_release.invokeExact((Addressable) memBlock);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Releases a reference on the data pointed by {@code mem_block}.
 * <p>
 * If the reference was the last one, it will call {@code clear_func}
 * to clear the contents of {@code mem_block}, and then will free the
 * resources allocated for {@code mem_block}.
 * @param memBlock a pointer to reference counted data
 * @param clearFunc a function to call when clearing the data
 */
public static void rcBoxReleaseFull(java.lang.foreign.MemoryAddress memBlock, org.gtk.glib.DestroyNotify clearFunc) {
    try {
        DowncallHandles.g_rc_box_release_full.invokeExact(
                (Addressable) memBlock,
                (Addressable) clearFunc.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Reallocates the memory pointed to by {@code mem}, so that it now has space for
 * {@code n_bytes} bytes of memory. It returns the new address of the memory, which may
 * have been moved. {@code mem} may be {@code null}, in which case it's considered to
 * have zero-length. {@code n_bytes} may be 0, in which case {@code null} will be returned
 * and {@code mem} will be freed unless it is {@code null}.
 * <p>
 * If the allocation fails (because the system is out of memory),
 * the program is terminated.
 * @param mem the memory to reallocate
 * @param nBytes new size of the memory in bytes
 * @return the new address of the allocated memory
 */
public static @Nullable java.lang.foreign.MemoryAddress realloc(@Nullable java.lang.foreign.MemoryAddress mem, long nBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_realloc.invokeExact(
                (Addressable) (mem == null ? MemoryAddress.NULL : (Addressable) mem),
                nBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * This function is similar to g_realloc(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
 * but care is taken to detect possible overflow during multiplication.
 * <p>
 * If the allocation fails (because the system is out of memory),
 * the program is terminated.
 * @param mem the memory to reallocate
 * @param nBlocks the number of blocks to allocate
 * @param nBlockBytes the size of each block in bytes
 * @return the new address of the allocated memory
 */
public static @Nullable java.lang.foreign.MemoryAddress reallocN(@Nullable java.lang.foreign.MemoryAddress mem, long nBlocks, long nBlockBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_realloc_n.invokeExact(
                (Addressable) (mem == null ? MemoryAddress.NULL : (Addressable) mem),
                nBlocks,
                nBlockBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Compares the current value of {@code rc} with {@code val}.
 * @param rc the address of a reference count variable
 * @param val the value to compare
 * @return {@code true} if the reference count is the same
 *   as the given value
 */
public static boolean refCountCompare(PointerInteger rc, int val) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_ref_count_compare.invokeExact(
                rc.handle(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Decreases the reference count.
 * <p>
 * If {@code true} is returned, the reference count reached 0. After this point, {@code rc}
 * is an undefined state and must be reinitialized with
 * g_ref_count_init() to be used again.
 * @param rc the address of a reference count variable
 * @return {@code true} if the reference count reached 0, and {@code false} otherwise
 */
public static boolean refCountDec(PointerInteger rc) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_ref_count_dec.invokeExact(rc.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Increases the reference count.
 * @param rc the address of a reference count variable
 */
public static void refCountInc(PointerInteger rc) {
    try {
        DowncallHandles.g_ref_count_inc.invokeExact(rc.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Initializes a reference count variable to 1.
 * @param rc the address of a reference count variable
 */
public static void refCountInit(PointerInteger rc) {
    try {
        DowncallHandles.g_ref_count_init.invokeExact(rc.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Acquires a reference on a string.
 * @param str a reference counted string
 * @return the given string, with its reference count increased
 */
public static java.lang.String refStringAcquire(java.lang.String str) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ref_string_acquire.invokeExact(Marshal.stringToAddress.marshal(str, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Retrieves the length of {@code str}.
 * @param str a reference counted string
 * @return the length of the given string, in bytes
 */
public static long refStringLength(java.lang.String str) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_ref_string_length.invokeExact(Marshal.stringToAddress.marshal(str, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Creates a new reference counted string and copies the contents of {@code str}
 * into it.
 * @param str a NUL-terminated string
 * @return the newly created reference counted string
 */
public static java.lang.String refStringNew(java.lang.String str) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ref_string_new.invokeExact(Marshal.stringToAddress.marshal(str, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Creates a new reference counted string and copies the content of {@code str}
 * into it.
 * <p>
 * If you call this function multiple times with the same {@code str}, or with
 * the same contents of {@code str}, it will return a new reference, instead of
 * creating a new string.
 * @param str a NUL-terminated string
 * @return the newly created reference
 *   counted string, or a new reference to an existing string
 */
public static java.lang.String refStringNewIntern(java.lang.String str) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ref_string_new_intern.invokeExact(Marshal.stringToAddress.marshal(str, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Creates a new reference counted string and copies the contents of {@code str}
 * into it, up to {@code len} bytes.
 * <p>
 * Since this function does not stop at nul bytes, it is the caller's
 * responsibility to ensure that {@code str} has at least {@code len} addressable bytes.
 * @param str a string
 * @param len length of {@code str} to use, or -1 if {@code str} is nul-terminated
 * @return the newly created reference counted string
 */
public static java.lang.String refStringNewLen(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ref_string_new_len.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Releases a reference on a string; if it was the last reference, the
 * resources allocated by the string are freed as well.
 * @param str a reference counted string
 */
public static void refStringRelease(java.lang.String str) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_ref_string_release.invokeExact(Marshal.stringToAddress.marshal(str, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * @param replacement the replacement string
 * @param hasReferences location to store information about
 *   references in {@code replacement} or {@code null}
 * @return whether {@code replacement} is a valid replacement string
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean regexCheckReplacement(java.lang.String replacement, Out<Boolean> hasReferences) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment hasReferencesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_check_replacement.invokeExact(
                    Marshal.stringToAddress.marshal(replacement, SCOPE),
                    (Addressable) (hasReferences == null ? MemoryAddress.NULL : (Addressable) hasReferencesPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (hasReferences != null) hasReferences.set(hasReferencesPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Quark regexErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_regex_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Escapes the nul characters in {@code string} to "\\x00".  It can be used
 * to compile a regex with embedded nul characters.
 * <p>
 * For completeness, {@code length} can be -1 for a nul-terminated string.
 * In this case the output string will be of course equal to {@code string}.
 * @param string the string to escape
 * @param length the length of {@code string}
 * @return a newly-allocated escaped string
 */
public static java.lang.String regexEscapeNul(java.lang.String string, int length) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_escape_nul.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Escapes the special characters used for regular expressions
 * in {@code string}, for instance "a.b*c" becomes "a\\.b\\*c". This
 * function is useful to dynamically generate regular expressions.
 * <p>
 * {@code string} can contain nul characters that are replaced with "\\0",
 * in this case remember to specify the correct length of {@code string}
 * in {@code length}.
 * @param string the string to escape
 * @param length the length of {@code string}, in bytes, or -1 if {@code string} is nul-terminated
 * @return a newly-allocated escaped string
 */
public static java.lang.String regexEscapeString(java.lang.String[] string, int length) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_escape_string.invokeExact(
                    Interop.allocateNativeArray(string, false, SCOPE),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param pattern the regular expression
 * @param string the string to scan for matches
 * @param compileOptions compile options for the regular expression, or 0
 * @param matchOptions match options, or 0
 * @return {@code true} if the string matched, {@code false} otherwise
 */
public static boolean regexMatchSimple(java.lang.String pattern, java.lang.String string, org.gtk.glib.RegexCompileFlags compileOptions, org.gtk.glib.RegexMatchFlags matchOptions) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_match_simple.invokeExact(
                    Marshal.stringToAddress.marshal(pattern, SCOPE),
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    compileOptions.getValue(),
                    matchOptions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param pattern the regular expression
 * @param string the string to scan for matches
 * @param compileOptions compile options for the regular expression, or 0
 * @param matchOptions match options, or 0
 * @return a {@code null}-terminated array of strings. Free
 * it using g_strfreev()
 */
public static PointerString regexSplitSimple(java.lang.String pattern, java.lang.String string, org.gtk.glib.RegexCompileFlags compileOptions, org.gtk.glib.RegexMatchFlags matchOptions) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_split_simple.invokeExact(
                    Marshal.stringToAddress.marshal(pattern, SCOPE),
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    compileOptions.getValue(),
                    matchOptions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
        DowncallHandles.g_reload_user_special_dirs_cache.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Internal function used to print messages from the public g_return_if_fail()
 * and g_return_val_if_fail() macros.
 * @param logDomain log domain
 * @param prettyFunction function containing the assertion
 * @param expression expression which failed
 */
public static void returnIfFailWarning(@Nullable java.lang.String logDomain, java.lang.String prettyFunction, @Nullable java.lang.String expression) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_return_if_fail_warning.invokeExact(
                    (Addressable) (logDomain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(logDomain, SCOPE)),
                    Marshal.stringToAddress.marshal(prettyFunction, SCOPE),
                    (Addressable) (expression == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(expression, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * A wrapper for the POSIX rmdir() function. The rmdir() function
 * deletes a directory from the filesystem.
 * <p>
 * See your C library manual for more details about how rmdir() works
 * on your system.
 * @param filename a pathname in the GLib file name encoding
 *     (UTF-8 on Windows)
 * @return 0 if the directory was successfully removed, -1 if an error
 *    occurred
 */
public static int rmdir(java.lang.String filename) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_rmdir.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Returns the data that {@code iter} points to.
 * @param iter a {@link SequenceIter}
 * @return the data that {@code iter} points to
 */
public static @Nullable java.lang.foreign.MemoryAddress sequenceGet(org.gtk.glib.SequenceIter iter) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_sequence_get.invokeExact(iter.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Inserts a new item just before the item pointed to by {@code iter}.
 * @param iter a {@link SequenceIter}
 * @return an iterator pointing to the new item
 */
public static org.gtk.glib.SequenceIter sequenceInsertBefore(org.gtk.glib.SequenceIter iter) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_sequence_insert_before.invokeExact(
                iter.handle(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
}

/**
 * Moves the item pointed to by {@code src} to the position indicated by {@code dest}.
 * After calling this function {@code dest} will point to the position immediately
 * after {@code src}. It is allowed for {@code src} and {@code dest} to point into different
 * sequences.
 * @param src a {@link SequenceIter} pointing to the item to move
 * @param dest a {@link SequenceIter} pointing to the position to which
 *     the item is moved
 */
public static void sequenceMove(org.gtk.glib.SequenceIter src, org.gtk.glib.SequenceIter dest) {
    try {
        DowncallHandles.g_sequence_move.invokeExact(
                src.handle(),
                dest.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Inserts the ({@code begin}, {@code end}) range at the destination pointed to by {@code dest}.
 * The {@code begin} and {@code end} iters must point into the same sequence. It is
 * allowed for {@code dest} to point to a different sequence than the one pointed
 * into by {@code begin} and {@code end}.
 * <p>
 * If {@code dest} is {@code null}, the range indicated by {@code begin} and {@code end} is
 * removed from the sequence. If {@code dest} points to a place within
 * the ({@code begin}, {@code end}) range, the range does not move.
 * @param dest a {@link SequenceIter}
 * @param begin a {@link SequenceIter}
 * @param end a {@link SequenceIter}
 */
public static void sequenceMoveRange(org.gtk.glib.SequenceIter dest, org.gtk.glib.SequenceIter begin, org.gtk.glib.SequenceIter end) {
    try {
        DowncallHandles.g_sequence_move_range.invokeExact(
                dest.handle(),
                begin.handle(),
                end.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Finds an iterator somewhere in the range ({@code begin}, {@code end}). This
 * iterator will be close to the middle of the range, but is not
 * guaranteed to be exactly in the middle.
 * <p>
 * The {@code begin} and {@code end} iterators must both point to the same sequence
 * and {@code begin} must come before or be equal to {@code end} in the sequence.
 * @param begin a {@link SequenceIter}
 * @param end a {@link SequenceIter}
 * @return a {@link SequenceIter} pointing somewhere in the
 *    ({@code begin}, {@code end}) range
 */
public static org.gtk.glib.SequenceIter sequenceRangeGetMidpoint(org.gtk.glib.SequenceIter begin, org.gtk.glib.SequenceIter end) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_sequence_range_get_midpoint.invokeExact(
                begin.handle(),
                end.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
}

/**
 * Removes the item pointed to by {@code iter}. It is an error to pass the
 * end iterator to this function.
 * <p>
 * If the sequence has a data destroy function associated with it, this
 * function is called on the data for the removed item.
 * @param iter a {@link SequenceIter}
 */
public static void sequenceRemove(org.gtk.glib.SequenceIter iter) {
    try {
        DowncallHandles.g_sequence_remove.invokeExact(iter.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Removes all items in the ({@code begin}, {@code end}) range.
 * <p>
 * If the sequence has a data destroy function associated with it, this
 * function is called on the data for the removed items.
 * @param begin a {@link SequenceIter}
 * @param end a {@link SequenceIter}
 */
public static void sequenceRemoveRange(org.gtk.glib.SequenceIter begin, org.gtk.glib.SequenceIter end) {
    try {
        DowncallHandles.g_sequence_remove_range.invokeExact(
                begin.handle(),
                end.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Changes the data for the item pointed to by {@code iter} to be {@code data}. If
 * the sequence has a data destroy function associated with it, that
 * function is called on the existing data that {@code iter} pointed to.
 * @param iter a {@link SequenceIter}
 */
public static void sequenceSet(org.gtk.glib.SequenceIter iter) {
    try {
        DowncallHandles.g_sequence_set.invokeExact(
                iter.handle(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Swaps the items pointed to by {@code a} and {@code b}. It is allowed for {@code a} and {@code b}
 * to point into difference sequences.
 * @param a a {@link SequenceIter}
 * @param b a {@link SequenceIter}
 */
public static void sequenceSwap(org.gtk.glib.SequenceIter a, org.gtk.glib.SequenceIter b) {
    try {
        DowncallHandles.g_sequence_swap.invokeExact(
                a.handle(),
                b.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param applicationName localized name of the application
 */
public static void setApplicationName(java.lang.String applicationName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_set_application_name.invokeExact(Marshal.stringToAddress.marshal(applicationName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Does nothing if {@code err} is {@code null}; if {@code err} is non-{@code null}, then *{@code err}
 * must be {@code null}. A new {@link Error} is created and assigned to *{@code err}.
 * @param err a return location for a {@link Error}
 * @param domain error domain
 * @param code error code
 * @param format printf()-style format
 * @param varargs args for {@code format}
 */
public static void setError(@Nullable Out<org.gtk.glib.Error> err, org.gtk.glib.Quark domain, int code, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment errPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.g_set_error.invokeExact(
                    (Addressable) errPOINTER.address(),
                    domain.getValue().intValue(),
                    code,
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                err.set(org.gtk.glib.Error.fromAddress.marshal(errPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
    }
}

/**
 * Does nothing if {@code err} is {@code null}; if {@code err} is non-{@code null}, then *{@code err}
 * must be {@code null}. A new {@link Error} is created and assigned to *{@code err}.
 * Unlike g_set_error(), {@code message} is not a printf()-style format string.
 * Use this function if {@code message} contains text you don't have control over,
 * that could include printf() escape sequences.
 * @param err a return location for a {@link Error}
 * @param domain error domain
 * @param code error code
 * @param message error message
 */
public static void setErrorLiteral(@Nullable Out<org.gtk.glib.Error> err, org.gtk.glib.Quark domain, int code, java.lang.String message) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment errPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.g_set_error_literal.invokeExact(
                    (Addressable) errPOINTER.address(),
                    domain.getValue().intValue(),
                    code,
                    Marshal.stringToAddress.marshal(message, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                err.set(org.gtk.glib.Error.fromAddress.marshal(errPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
    }
}

/**
 * Sets the name of the program. This name should not be localized,
 * in contrast to g_set_application_name().
 * <p>
 * If you are using {@link org.gtk.gio.Application} the program name is set in
 * g_application_run(). In case of GDK or GTK+ it is set in
 * gdk_init(), which is called by gtk_init() and the
 * {@code GtkApplication}::startup handler. The program name is found by
 * taking the last component of {@code argv}[0].
 * <p>
 * Since GLib 2.72, this function can be called multiple times
 * and is fully thread safe. Prior to GLib 2.72, this function
 * could only be called once per process.
 * @param prgname the name of the program.
 */
public static void setPrgname(java.lang.String prgname) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_set_prgname.invokeExact(Marshal.stringToAddress.marshal(prgname, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Sets the print handler.
 * <p>
 * Any messages passed to g_print() will be output via
 * the new handler. The default handler simply outputs
 * the message to stdout. By providing your own handler
 * you can redirect the output, to a GTK+ widget or a
 * log file for example.
 * @param func the new print handler
 * @return the old print handler
 */
public static org.gtk.glib.PrintFunc setPrintHandler(org.gtk.glib.PrintFunc func) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_set_print_handler.invokeExact((Addressable) func.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return null /* Unsupported parameter type */;
}

/**
 * Sets the handler for printing error messages.
 * <p>
 * Any messages passed to g_printerr() will be output via
 * the new handler. The default handler simply outputs the
 * message to stderr. By providing your own handler you can
 * redirect the output, to a GTK+ widget or a log file for
 * example.
 * @param func the new error message handler
 * @return the old error message handler
 */
public static org.gtk.glib.PrintFunc setPrinterrHandler(org.gtk.glib.PrintFunc func) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_set_printerr_handler.invokeExact((Addressable) func.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return null /* Unsupported parameter type */;
}

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
 * @param variable the environment variable to set, must not
 *     contain '='.
 * @param value the value for to set the variable to.
 * @param overwrite whether to change the variable if it already exists.
 * @return {@code false} if the environment variable couldn't be set.
 */
public static boolean setenv(java.lang.String variable, java.lang.String value, boolean overwrite) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_setenv.invokeExact(
                    Marshal.stringToAddress.marshal(variable, SCOPE),
                    Marshal.stringToAddress.marshal(value, SCOPE),
                    Marshal.booleanToInteger.marshal(overwrite, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Quark shellErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_shell_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

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
 * only whitespace), {@link ShellError#EMPTY_STRING} will be returned. It???s
 * guaranteed that {@code argvp} will be a non-empty array if this function returns
 * successfully.
 * <p>
 * Free the returned vector with g_strfreev().
 * @param commandLine command line to parse
 * @param argcp return location for number of args
 * @param argvp return location for array of args
 * @return {@code true} on success, {@code false} if error set
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean shellParseArgv(java.lang.String commandLine, Out<Integer> argcp, @Nullable Out<java.lang.String[]> argvp) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment argcpPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment argvpPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_shell_parse_argv.invokeExact(
                    Marshal.stringToAddress.marshal(commandLine, SCOPE),
                    (Addressable) (argcp == null ? MemoryAddress.NULL : (Addressable) argcpPOINTER.address()),
                    (Addressable) (argvp == null ? MemoryAddress.NULL : (Addressable) argvpPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (argcp != null) argcp.set(argcpPOINTER.get(Interop.valueLayout.C_INT, 0));
        java.lang.String[] argvpARRAY = new java.lang.String[argcp.get().intValue()];
        for (int I = 0; I < argcp.get().intValue(); I++) {
            var OBJ = argvpPOINTER.get(Interop.valueLayout.ADDRESS, I);
            argvpARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
        argvp.set(argvpARRAY);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param unquotedString a literal string
 * @return quoted string
 */
public static java.lang.String shellQuote(java.lang.String unquotedString) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_shell_quote.invokeExact(Marshal.stringToAddress.marshal(unquotedString, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
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
 * @param quotedString shell-quoted string
 * @return an unquoted string
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String shellUnquote(java.lang.String quotedString) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_shell_unquote.invokeExact(Marshal.stringToAddress.marshal(quotedString, SCOPE),(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param blockSize the number of bytes to allocate
 * @return a pointer to the allocated memory block, which will
 *   be {@code null} if and only if {@code mem_size} is 0
 */
public static @Nullable java.lang.foreign.MemoryAddress sliceAlloc(long blockSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_slice_alloc.invokeExact(blockSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocates a block of memory via g_slice_alloc() and initializes
 * the returned memory to 0. Note that the underlying slice allocation
 * mechanism can be changed with the [{@code G_SLICE=always-malloc}][G_SLICE]
 * environment variable.
 * @param blockSize the number of bytes to allocate
 * @return a pointer to the allocated block, which will be {@code null} if and only
 *    if {@code mem_size} is 0
 */
public static @Nullable java.lang.foreign.MemoryAddress sliceAlloc0(long blockSize) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_slice_alloc0.invokeExact(blockSize);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocates a block of memory from the slice allocator
 * and copies {@code block_size} bytes into it from {@code mem_block}.
 * <p>
 * {@code mem_block} must be non-{@code null} if {@code block_size} is non-zero.
 * @param blockSize the number of bytes to allocate
 * @param memBlock the memory to copy
 * @return a pointer to the allocated memory block, which will be {@code null} if and
 *    only if {@code mem_size} is 0
 */
public static @Nullable java.lang.foreign.MemoryAddress sliceCopy(long blockSize, @Nullable java.lang.foreign.MemoryAddress memBlock) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_slice_copy.invokeExact(
                blockSize,
                (Addressable) (memBlock == null ? MemoryAddress.NULL : (Addressable) memBlock));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param blockSize the size of the block
 * @param memBlock a pointer to the block to free
 */
public static void sliceFree1(long blockSize, @Nullable java.lang.foreign.MemoryAddress memBlock) {
    try {
        DowncallHandles.g_slice_free1.invokeExact(
                blockSize,
                (Addressable) (memBlock == null ? MemoryAddress.NULL : (Addressable) memBlock));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param blockSize the size of the blocks
 * @param memChain a pointer to the first block of the chain
 * @param nextOffset the offset of the {@code next} field in the blocks
 */
public static void sliceFreeChainWithOffset(long blockSize, @Nullable java.lang.foreign.MemoryAddress memChain, long nextOffset) {
    try {
        DowncallHandles.g_slice_free_chain_with_offset.invokeExact(
                blockSize,
                (Addressable) (memChain == null ? MemoryAddress.NULL : (Addressable) memChain),
                nextOffset);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static long sliceGetConfig(org.gtk.glib.SliceConfig ckey) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_slice_get_config.invokeExact(ckey.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

public static PointerLong sliceGetConfigState(org.gtk.glib.SliceConfig ckey, long address, PointerInteger nValues) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_slice_get_config_state.invokeExact(
                ckey.getValue(),
                address,
                nValues.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new PointerLong(RESULT);
}

public static void sliceSetConfig(org.gtk.glib.SliceConfig ckey, long value) {
    try {
        DowncallHandles.g_slice_set_config.invokeExact(
                ckey.getValue(),
                value);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * A safer form of the standard sprintf() function. The output is guaranteed
 * to not exceed {@code n} characters (including the terminating nul character), so
 * it is easy to ensure that a buffer overflow cannot occur.
 * <p>
 * See also g_strdup_printf().
 * <p>
 * In versions of GLib prior to 1.2.3, this function may return -1 if the
 * output was truncated, and the truncated string may not be nul-terminated.
 * In versions prior to 1.3.12, this function returns the length of the output
 * string.
 * <p>
 * The return value of g_snprintf() conforms to the snprintf()
 * function as standardized in ISO C99. Note that this is different from
 * traditional snprintf(), which returns the length of the output string.
 * <p>
 * The format string may contain positional parameters, as specified in
 * the Single Unix Specification.
 * @param string the buffer to hold the output.
 * @param n the maximum number of bytes to produce (including the
 *     terminating nul character).
 * @param format a standard printf() format string, but notice
 *          [string precision pitfalls][string-precision]
 * @param varargs the arguments to insert in the output.
 * @return the number of bytes which would be produced if the buffer
 *     was large enough.
 */
public static int snprintf(java.lang.String string, long n, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_snprintf.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    n,
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * @param tag the ID of the source to remove.
 * @return {@code true} if the source was found and removed.
 */
public static boolean sourceRemove(int tag) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_source_remove.invokeExact(tag);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Removes a source from the default main loop context given the
 * source functions and user data. If multiple sources exist with the
 * same source functions and user data, only one will be destroyed.
 * @param funcs The {@code source_funcs} passed to g_source_new()
 * @return {@code true} if a source was found and removed.
 */
public static boolean sourceRemoveByFuncsUserData(org.gtk.glib.SourceFuncs funcs) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_source_remove_by_funcs_user_data.invokeExact(
                funcs.handle(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Removes a source from the default main loop context given the user
 * data for the callback. If multiple sources exist with the same user
 * data, only one will be destroyed.
 * @return {@code true} if a source was found and removed.
 */
public static boolean sourceRemoveByUserData() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_source_remove_by_user_data.invokeExact((Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

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
 * @param tag a {@link Source} ID
 * @param name debug name for the source
 */
public static void sourceSetNameById(int tag, java.lang.String name) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_source_set_name_by_id.invokeExact(
                    tag,
                    Marshal.stringToAddress.marshal(name, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Gets the smallest prime number from a built-in array of primes which
 * is larger than {@code num}. This is used within GLib to calculate the optimum
 * size of a {@link HashTable}.
 * <p>
 * The built-in array of primes ranges from 11 to 13845163 such that
 * each prime is approximately 1.5-2 times the previous prime.
 * @param num a {@code guint}
 * @return the smallest prime number from a built-in array of primes
 *     which is larger than {@code num}
 */
public static int spacedPrimesClosest(int num) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_spaced_primes_closest.invokeExact(num);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * windows on the right screen, you may want to use {@code GdkAppLaunchContext},
 * {@link org.gtk.gio.AppLaunchContext}, or set the {@code DISPLAY} environment variable.
 * <p>
 * Note that the returned {@code child_pid} on Windows is a handle to the child
 * process and not its identifier. Process handles and process identifiers
 * are different concepts on Windows.
 * @param workingDirectory child's current working
 *     directory, or {@code null} to inherit parent's
 * @param argv child's argument vector
 * @param envp child's environment, or {@code null} to inherit parent's
 * @param flags flags from {@link SpawnFlags}
 * @param childSetup function to run in the child just before exec()
 * @param childPid return location for child process reference, or {@code null}
 * @return {@code true} on success, {@code false} if error is set
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean spawnAsync(@Nullable java.lang.String workingDirectory, java.lang.String[] argv, @Nullable java.lang.String[] envp, org.gtk.glib.SpawnFlags flags, @Nullable org.gtk.glib.SpawnChildSetupFunc childSetup, @Nullable org.gtk.glib.Pid childPid) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment childPidPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_spawn_async.invokeExact(
                    (Addressable) (workingDirectory == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(workingDirectory, SCOPE)),
                    Interop.allocateNativeArray(argv, false, SCOPE),
                    (Addressable) (envp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envp, false, SCOPE)),
                    flags.getValue(),
                    (Addressable) (childSetup == null ? MemoryAddress.NULL : (Addressable) childSetup.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (childPid == null ? MemoryAddress.NULL : (Addressable) childPidPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (childPid != null) childPid.setValue(childPidPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Executes a child program asynchronously.
 * <p>
 * Identical to g_spawn_async_with_pipes_and_fds() but with {@code n_fds} set to zero,
 * so no FD assignments are used.
 * @param workingDirectory child's current working directory, or {@code null} to inherit parent's, in the GLib file name encoding
 * @param argv child's argument vector, in the GLib file name encoding;
 *   it must be non-empty and {@code null}-terminated
 * @param envp child's environment, or {@code null} to inherit parent's, in the GLib file name encoding
 * @param flags flags from {@link SpawnFlags}
 * @param childSetup function to run in the child just before exec()
 * @param childPid return location for child process ID, or {@code null}
 * @param stdinFd file descriptor to use for child's stdin, or {@code -1}
 * @param stdoutFd file descriptor to use for child's stdout, or {@code -1}
 * @param stderrFd file descriptor to use for child's stderr, or {@code -1}
 * @return {@code true} on success, {@code false} if an error was set
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean spawnAsyncWithFds(@Nullable java.lang.String workingDirectory, java.lang.String[] argv, @Nullable java.lang.String[] envp, org.gtk.glib.SpawnFlags flags, @Nullable org.gtk.glib.SpawnChildSetupFunc childSetup, @Nullable org.gtk.glib.Pid childPid, int stdinFd, int stdoutFd, int stderrFd) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment childPidPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_spawn_async_with_fds.invokeExact(
                    (Addressable) (workingDirectory == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(workingDirectory, SCOPE)),
                    Interop.allocateNativeArray(argv, false, SCOPE),
                    (Addressable) (envp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envp, false, SCOPE)),
                    flags.getValue(),
                    (Addressable) (childSetup == null ? MemoryAddress.NULL : (Addressable) childSetup.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (childPid == null ? MemoryAddress.NULL : (Addressable) childPidPOINTER.address()),
                    stdinFd,
                    stdoutFd,
                    stderrFd,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (childPid != null) childPid.setValue(childPidPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Identical to g_spawn_async_with_pipes_and_fds() but with {@code n_fds} set to zero,
 * so no FD assignments are used.
 * @param workingDirectory child's current working
 *     directory, or {@code null} to inherit parent's, in the GLib file name encoding
 * @param argv child's argument
 *     vector, in the GLib file name encoding; it must be non-empty and {@code null}-terminated
 * @param envp child's environment, or {@code null} to inherit parent's, in the GLib file
 *     name encoding
 * @param flags flags from {@link SpawnFlags}
 * @param childSetup function to run in the child just before exec()
 * @param childPid return location for child process ID, or {@code null}
 * @param standardInput return location for file descriptor to write to child's stdin, or {@code null}
 * @param standardOutput return location for file descriptor to read child's stdout, or {@code null}
 * @param standardError return location for file descriptor to read child's stderr, or {@code null}
 * @return {@code true} on success, {@code false} if an error was set
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean spawnAsyncWithPipes(@Nullable java.lang.String workingDirectory, java.lang.String[] argv, @Nullable java.lang.String[] envp, org.gtk.glib.SpawnFlags flags, @Nullable org.gtk.glib.SpawnChildSetupFunc childSetup, @Nullable org.gtk.glib.Pid childPid, Out<Integer> standardInput, Out<Integer> standardOutput, Out<Integer> standardError) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment childPidPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment standardInputPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment standardOutputPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment standardErrorPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_spawn_async_with_pipes.invokeExact(
                    (Addressable) (workingDirectory == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(workingDirectory, SCOPE)),
                    Interop.allocateNativeArray(argv, false, SCOPE),
                    (Addressable) (envp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envp, false, SCOPE)),
                    flags.getValue(),
                    (Addressable) (childSetup == null ? MemoryAddress.NULL : (Addressable) childSetup.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (childPid == null ? MemoryAddress.NULL : (Addressable) childPidPOINTER.address()),
                    (Addressable) (standardInput == null ? MemoryAddress.NULL : (Addressable) standardInputPOINTER.address()),
                    (Addressable) (standardOutput == null ? MemoryAddress.NULL : (Addressable) standardOutputPOINTER.address()),
                    (Addressable) (standardError == null ? MemoryAddress.NULL : (Addressable) standardErrorPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (childPid != null) childPid.setValue(childPidPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (standardInput != null) standardInput.set(standardInputPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (standardOutput != null) standardOutput.set(standardOutputPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (standardError != null) standardError.set(standardErrorPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * {@link SpawnFlags#CHILD_INHERITS_STDIN} means that the child will inherit the parent's
 * standard input (by default, the child's standard input is attached to
 * {@code /dev/null}). {@link SpawnFlags#STDIN_FROM_DEV_NULL} explicitly imposes the default
 * behavior. Both flags cannot be enabled at the same time and, in both cases,
 * the {@code stdin_pipe_out} argument is ignored.
 * <p>
 * {@link SpawnFlags#STDOUT_TO_DEV_NULL} means that the child's standard output
 * will be discarded (by default, it goes to the same location as the parent's
 * standard output). {@link SpawnFlags#CHILD_INHERITS_STDOUT} explicitly imposes the
 * default behavior. Both flags cannot be enabled at the same time and, in
 * both cases, the {@code stdout_pipe_out} argument is ignored.
 * <p>
 * {@link SpawnFlags#STDERR_TO_DEV_NULL} means that the child's standard error
 * will be discarded (by default, it goes to the same location as the parent's
 * standard error). {@link SpawnFlags#CHILD_INHERITS_STDERR} explicitly imposes the
 * default behavior. Both flags cannot be enabled at the same time and, in
 * both cases, the {@code stderr_pipe_out} argument is ignored.
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
 * windows on the right screen, you may want to use {@code GdkAppLaunchContext},
 * {@link org.gtk.gio.AppLaunchContext}, or set the {@code DISPLAY} environment variable.
 * @param workingDirectory child's current working
 *     directory, or {@code null} to inherit parent's, in the GLib file name encoding
 * @param argv child's argument
 *     vector, in the GLib file name encoding; it must be non-empty and {@code null}-terminated
 * @param envp child's environment, or {@code null} to inherit parent's, in the GLib file
 *     name encoding
 * @param flags flags from {@link SpawnFlags}
 * @param childSetup function to run in the child just before {@code exec()}
 * @param stdinFd file descriptor to use for child's stdin, or {@code -1}
 * @param stdoutFd file descriptor to use for child's stdout, or {@code -1}
 * @param stderrFd file descriptor to use for child's stderr, or {@code -1}
 * @param sourceFds array of FDs from the parent
 *    process to make available in the child process
 * @param targetFds array of FDs to remap
 *    {@code source_fds} to in the child process
 * @param nFds number of FDs in {@code source_fds} and {@code target_fds}
 * @param childPidOut return location for child process ID, or {@code null}
 * @param stdinPipeOut return location for file descriptor to write to child's stdin, or {@code null}
 * @param stdoutPipeOut return location for file descriptor to read child's stdout, or {@code null}
 * @param stderrPipeOut return location for file descriptor to read child's stderr, or {@code null}
 * @return {@code true} on success, {@code false} if an error was set
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean spawnAsyncWithPipesAndFds(@Nullable java.lang.String workingDirectory, java.lang.String[] argv, @Nullable java.lang.String[] envp, org.gtk.glib.SpawnFlags flags, @Nullable org.gtk.glib.SpawnChildSetupFunc childSetup, int stdinFd, int stdoutFd, int stderrFd, int[] sourceFds, int[] targetFds, long nFds, @Nullable org.gtk.glib.Pid childPidOut, Out<Integer> stdinPipeOut, Out<Integer> stdoutPipeOut, Out<Integer> stderrPipeOut) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment childPidOutPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment stdinPipeOutPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment stdoutPipeOutPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment stderrPipeOutPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_spawn_async_with_pipes_and_fds.invokeExact(
                    (Addressable) (workingDirectory == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(workingDirectory, SCOPE)),
                    Interop.allocateNativeArray(argv, false, SCOPE),
                    (Addressable) (envp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envp, false, SCOPE)),
                    flags.getValue(),
                    (Addressable) (childSetup == null ? MemoryAddress.NULL : (Addressable) childSetup.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    stdinFd,
                    stdoutFd,
                    stderrFd,
                    (Addressable) (sourceFds == null ? MemoryAddress.NULL : Interop.allocateNativeArray(sourceFds, false, SCOPE)),
                    (Addressable) (targetFds == null ? MemoryAddress.NULL : Interop.allocateNativeArray(targetFds, false, SCOPE)),
                    nFds,
                    (Addressable) (childPidOut == null ? MemoryAddress.NULL : (Addressable) childPidOutPOINTER.address()),
                    (Addressable) (stdinPipeOut == null ? MemoryAddress.NULL : (Addressable) stdinPipeOutPOINTER.address()),
                    (Addressable) (stdoutPipeOut == null ? MemoryAddress.NULL : (Addressable) stdoutPipeOutPOINTER.address()),
                    (Addressable) (stderrPipeOut == null ? MemoryAddress.NULL : (Addressable) stderrPipeOutPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (childPidOut != null) childPidOut.setValue(childPidOutPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (stdinPipeOut != null) stdinPipeOut.set(stdinPipeOutPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (stdoutPipeOut != null) stdoutPipeOut.set(stdoutPipeOutPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (stderrPipeOut != null) stderrPipeOut.set(stderrPipeOutPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * An old name for g_spawn_check_wait_status(), deprecated because its
 * name is misleading.
 * <p>
 * Despite the name of the function, {@code wait_status} must be the wait status
 * as returned by g_spawn_sync(), g_subprocess_get_status(), {@code waitpid()},
 * etc. On Unix platforms, it is incorrect for it to be the exit status
 * as passed to {@code exit()} or returned by g_subprocess_get_exit_status() or
 * {@code WEXITSTATUS()}.
 * @param waitStatus A status as returned from g_spawn_sync()
 * @return {@code true} if child exited successfully, {@code false} otherwise (and
 *     {@code error} will be set)
 * @throws GErrorException See {@link org.gtk.glib.Error}
 * @deprecated Use g_spawn_check_wait_status() instead, and check whether your code is conflating wait and exit statuses.
 */
@Deprecated
public static boolean spawnCheckExitStatus(int waitStatus) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_spawn_check_exit_status.invokeExact(waitStatus,(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param waitStatus A platform-specific wait status as returned from g_spawn_sync()
 * @return {@code true} if child exited successfully, {@code false} otherwise (and
 *   {@code error} will be set)
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean spawnCheckWaitStatus(int waitStatus) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_spawn_check_wait_status.invokeExact(waitStatus,(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * On some platforms, notably Windows, the {@link Pid} type represents a resource
 * which must be closed to prevent resource leaking. g_spawn_close_pid()
 * is provided for this purpose. It should be used on all platforms, even
 * though it doesn't do anything under UNIX.
 * @param pid The process reference to close
 */
public static void spawnClosePid(org.gtk.glib.Pid pid) {
    try {
        DowncallHandles.g_spawn_close_pid.invokeExact(pid.getValue().intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param commandLine a command line
 * @return {@code true} on success, {@code false} if error is set
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean spawnCommandLineAsync(java.lang.String commandLine) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_spawn_command_line_async.invokeExact(Marshal.stringToAddress.marshal(commandLine, SCOPE),(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param commandLine a command line
 * @param standardOutput return location for child output
 * @param standardError return location for child errors
 * @param waitStatus return location for child wait status, as returned by waitpid()
 * @return {@code true} on success, {@code false} if an error was set
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean spawnCommandLineSync(java.lang.String commandLine, byte[] standardOutput, byte[] standardError, Out<Integer> waitStatus) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment waitStatusPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_spawn_command_line_sync.invokeExact(
                    Marshal.stringToAddress.marshal(commandLine, SCOPE),
                    (Addressable) (standardOutput == null ? MemoryAddress.NULL : Interop.allocateNativeArray(standardOutput, false, SCOPE)),
                    (Addressable) (standardError == null ? MemoryAddress.NULL : Interop.allocateNativeArray(standardError, false, SCOPE)),
                    (Addressable) (waitStatus == null ? MemoryAddress.NULL : (Addressable) waitStatusPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (waitStatus != null) waitStatus.set(waitStatusPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Quark spawnErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_spawn_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

public static org.gtk.glib.Quark spawnExitErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_spawn_exit_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

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
 * @param workingDirectory child's current working
 *     directory, or {@code null} to inherit parent's
 * @param argv child's argument vector, which must be non-empty and {@code null}-terminated
 * @param envp child's environment, or {@code null} to inherit parent's
 * @param flags flags from {@link SpawnFlags}
 * @param childSetup function to run in the child just before exec()
 * @param standardOutput return location for child output, or {@code null}
 * @param standardError return location for child error messages, or {@code null}
 * @param waitStatus return location for child wait status, as returned by waitpid(), or {@code null}
 * @return {@code true} on success, {@code false} if an error was set
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean spawnSync(@Nullable java.lang.String workingDirectory, java.lang.String[] argv, @Nullable java.lang.String[] envp, org.gtk.glib.SpawnFlags flags, @Nullable org.gtk.glib.SpawnChildSetupFunc childSetup, byte[] standardOutput, byte[] standardError, Out<Integer> waitStatus) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment waitStatusPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_spawn_sync.invokeExact(
                    (Addressable) (workingDirectory == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(workingDirectory, SCOPE)),
                    Interop.allocateNativeArray(argv, false, SCOPE),
                    (Addressable) (envp == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envp, false, SCOPE)),
                    flags.getValue(),
                    (Addressable) (childSetup == null ? MemoryAddress.NULL : (Addressable) childSetup.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (standardOutput == null ? MemoryAddress.NULL : Interop.allocateNativeArray(standardOutput, false, SCOPE)),
                    (Addressable) (standardError == null ? MemoryAddress.NULL : Interop.allocateNativeArray(standardError, false, SCOPE)),
                    (Addressable) (waitStatus == null ? MemoryAddress.NULL : (Addressable) waitStatusPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (waitStatus != null) waitStatus.set(waitStatusPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * An implementation of the standard sprintf() function which supports
 * positional parameters, as specified in the Single Unix Specification.
 * <p>
 * Note that it is usually better to use g_snprintf(), to avoid the
 * risk of buffer overflow.
 * <p>
 * {@code glib/gprintf.h} must be explicitly included in order to use this function.
 * <p>
 * See also g_strdup_printf().
 * @param string A pointer to a memory buffer to contain the resulting string. It
 *          is up to the caller to ensure that the allocated buffer is large
 *          enough to hold the formatted result
 * @param format a standard printf() format string, but notice
 *          [string precision pitfalls][string-precision]
 * @param varargs the arguments to insert in the output.
 * @return the number of bytes printed.
 */
public static int sprintf(java.lang.String string, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_sprintf.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Copies a nul-terminated string into the dest buffer, include the
 * trailing nul, and return a pointer to the trailing nul byte.
 * This is useful for concatenating multiple strings together
 * without having to repeatedly scan for the end.
 * @param dest destination buffer.
 * @param src source string.
 * @return a pointer to trailing nul byte.
 */
public static java.lang.String stpcpy(java.lang.String dest, java.lang.String src) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_stpcpy.invokeExact(
                    Marshal.stringToAddress.marshal(dest, SCOPE),
                    Marshal.stringToAddress.marshal(src, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Compares two strings for byte-by-byte equality and returns {@code true}
 * if they are equal. It can be passed to g_hash_table_new() as the
 * {@code key_equal_func} parameter, when using non-{@code null} strings as keys in a
 * {@link HashTable}.
 * <p>
 * This function is typically used for hash table comparisons, but can be used
 * for general purpose comparisons of non-{@code null} strings. For a {@code null}-safe string
 * comparison function, see g_strcmp0().
 * @param v1 a key
 * @param v2 a key to compare with {@code v1}
 * @return {@code true} if the two keys match
 */
public static boolean strEqual(java.lang.foreign.MemoryAddress v1, java.lang.foreign.MemoryAddress v2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_str_equal.invokeExact(
                (Addressable) v1,
                (Addressable) v2);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Looks whether the string {@code str} begins with {@code prefix}.
 * @param str a nul-terminated string
 * @param prefix the nul-terminated prefix to look for
 * @return {@code true} if {@code str} begins with {@code prefix}, {@code false} otherwise.
 */
public static boolean strHasPrefix(java.lang.String str, java.lang.String prefix) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_str_has_prefix.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    Marshal.stringToAddress.marshal(prefix, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Looks whether the string {@code str} ends with {@code suffix}.
 * @param str a nul-terminated string
 * @param suffix the nul-terminated suffix to look for
 * @return {@code true} if {@code str} end with {@code suffix}, {@code false} otherwise.
 */
public static boolean strHasSuffix(java.lang.String str, java.lang.String suffix) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_str_has_suffix.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    Marshal.stringToAddress.marshal(suffix, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param v a string key
 * @return a hash value corresponding to the key
 */
public static int strHash(java.lang.foreign.MemoryAddress v) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_str_hash.invokeExact((Addressable) v);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Determines if a string is pure ASCII. A string is pure ASCII if it
 * contains no bytes with the high bit set.
 * @param str a string
 * @return {@code true} if {@code str} is ASCII
 */
public static boolean strIsAscii(java.lang.String str) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_str_is_ascii.invokeExact(Marshal.stringToAddress.marshal(str, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * As some examples, searching for ???fred??? would match the potential hit
 * ???Smith, Fred??? and also ???Fr??d??ric???.  Searching for ???Fr??d??? would match
 * ???Fr??d??ric??? but not ???Frederic??? (due to the one-directional nature of
 * accent matching).  Searching ???fo??? would match ???Foo??? and ???Bar Foo
 * Baz???, but not ???SFO??? (because no word has ???fo??? as a prefix).
 * @param searchTerm the search term from the user
 * @param potentialHit the text that may be a hit
 * @param acceptAlternates {@code true} to accept ASCII alternates
 * @return {@code true} if {@code potential_hit} is a hit
 */
public static boolean strMatchString(java.lang.String searchTerm, java.lang.String potentialHit, boolean acceptAlternates) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_str_match_string.invokeExact(
                    Marshal.stringToAddress.marshal(searchTerm, SCOPE),
                    Marshal.stringToAddress.marshal(potentialHit, SCOPE),
                    Marshal.booleanToInteger.marshal(acceptAlternates, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param str a string, in UTF-8
 * @param fromLocale the source locale, if known
 * @return a string in plain ASCII
 */
public static java.lang.String strToAscii(java.lang.String str, @Nullable java.lang.String fromLocale) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_str_to_ascii.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    (Addressable) (fromLocale == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fromLocale, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param string a string
 * @param translitLocale the language code (like 'de' or
 *   'en_GB') from which {@code string} originates
 * @param asciiAlternates a
 *   return location for ASCII alternates
 * @return the folded tokens
 */
public static PointerString strTokenizeAndFold(java.lang.String string, @Nullable java.lang.String translitLocale, java.lang.String[] asciiAlternates) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_str_tokenize_and_fold.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    (Addressable) (translitLocale == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(translitLocale, SCOPE)),
                    Interop.allocateNativeArray(asciiAlternates, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

/**
 * For each character in {@code string}, if the character is not in {@code valid_chars},
 * replaces the character with {@code substitutor}.
 * <p>
 * Modifies {@code string} in place, and return {@code string} itself, not a copy. The
 * return value is to allow nesting such as:
 * <pre>{@code <!-- language="C" -->
 *   g_ascii_strup (g_strcanon (str, "abc", '?'))
 * }</pre>
 * <p>
 * In order to modify a copy, you may use g_strdup():
 * <pre>{@code <!-- language="C" -->
 *   reformatted = g_strcanon (g_strdup (const_str), "abc", '?');
 *   ...
 *   g_free (reformatted);
 * }</pre>
 * @param string a nul-terminated array of bytes
 * @param validChars bytes permitted in {@code string}
 * @param substitutor replacement character for disallowed bytes
 * @return the modified {@code string}
 */
public static java.lang.String strcanon(java.lang.String string, java.lang.String validChars, byte substitutor) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strcanon.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    Marshal.stringToAddress.marshal(validChars, SCOPE),
                    substitutor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * A case-insensitive string comparison, corresponding to the standard
 * strcasecmp() function on platforms which support it.
 * @param s1 a string
 * @param s2 a string to compare with {@code s1}
 * @return 0 if the strings match, a negative value if {@code s1} &lt; {@code s2},
 *     or a positive value if {@code s1} &gt; {@code s2}.
 * @deprecated See g_strncasecmp() for a discussion of why this
 *     function is deprecated and how to replace it.
 */
@Deprecated
public static int strcasecmp(java.lang.String s1, java.lang.String s2) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_strcasecmp.invokeExact(
                    Marshal.stringToAddress.marshal(s1, SCOPE),
                    Marshal.stringToAddress.marshal(s2, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * @param string a string to remove the trailing whitespace from
 * @return {@code string}
 */
public static java.lang.String strchomp(java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strchomp.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param string a string to remove the leading whitespace from
 * @return {@code string}
 */
public static java.lang.String strchug(java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strchug.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Compares {@code str1} and {@code str2} like strcmp(). Handles {@code null}
 * gracefully by sorting it before non-{@code null} strings.
 * Comparing two {@code null} pointers returns 0.
 * @param str1 a C string or {@code null}
 * @param str2 another C string or {@code null}
 * @return an integer less than, equal to, or greater than zero, if {@code str1} is &lt;, == or &gt; than {@code str2}.
 */
public static int strcmp0(@Nullable java.lang.String str1, @Nullable java.lang.String str2) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_strcmp0.invokeExact(
                    (Addressable) (str1 == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(str1, SCOPE)),
                    (Addressable) (str2 == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(str2, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Replaces all escaped characters with their one byte equivalent.
 * <p>
 * This function does the reverse conversion of g_strescape().
 * @param source a string to compress
 * @return a newly-allocated copy of {@code source} with all escaped
 *     character compressed
 */
public static java.lang.String strcompress(java.lang.String source) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strcompress.invokeExact(Marshal.stringToAddress.marshal(source, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Concatenates all of the given strings into one long string. The
 * returned string should be freed with g_free() when no longer needed.
 * <p>
 * The variable argument list must end with {@code null}. If you forget the {@code null},
 * g_strconcat() will start appending random memory junk to your string.
 * <p>
 * Note that this function is usually not the right function to use to
 * assemble a translated message from pieces, since proper translation
 * often requires the pieces to be reordered.
 * @param string1 the first string to add, which must not be {@code null}
 * @param varargs a {@code null}-terminated list of strings to append to the string
 * @return a newly-allocated string containing all the string arguments
 */
public static java.lang.String strconcat(java.lang.String string1, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strconcat.invokeExact(
                    Marshal.stringToAddress.marshal(string1, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Converts any delimiter characters in {@code string} to {@code new_delimiter}.
 * <p>
 * Any characters in {@code string} which are found in {@code delimiters} are
 * changed to the {@code new_delimiter} character. Modifies {@code string} in place,
 * and returns {@code string} itself, not a copy.
 * <p>
 * The return value is to allow nesting such as:
 * <pre>{@code <!-- language="C" -->
 *   g_ascii_strup (g_strdelimit (str, "abc", '?'))
 * }</pre>
 * <p>
 * In order to modify a copy, you may use g_strdup():
 * <pre>{@code <!-- language="C" -->
 *   reformatted = g_strdelimit (g_strdup (const_str), "abc", '?');
 *   ...
 *   g_free (reformatted);
 * }</pre>
 * @param string the string to convert
 * @param delimiters a string containing the current delimiters,
 *     or {@code null} to use the standard delimiters defined in {@code G_STR_DELIMITERS}
 * @param newDelimiter the new delimiter character
 * @return the modified {@code string}
 */
public static java.lang.String strdelimit(java.lang.String string, @Nullable java.lang.String delimiters, byte newDelimiter) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strdelimit.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    (Addressable) (delimiters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(delimiters, SCOPE)),
                    newDelimiter);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Converts a string to lower case.
 * @param string the string to convert.
 * @return the string
 * @deprecated This function is totally broken for the reasons discussed
 * in the g_strncasecmp() docs - use g_ascii_strdown() or g_utf8_strdown()
 * instead.
 */
@Deprecated
public static java.lang.String strdown(java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strdown.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Duplicates a string. If {@code str} is {@code null} it returns {@code null}.
 * The returned string should be freed with g_free()
 * when no longer needed.
 * @param str the string to duplicate
 * @return a newly-allocated copy of {@code str}
 */
public static java.lang.String strdup(@Nullable java.lang.String str) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strdup.invokeExact((Addressable) (str == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(str, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Similar to the standard C sprintf() function but safer, since it
 * calculates the maximum space required and allocates memory to hold
 * the result. The returned string should be freed with g_free() when no
 * longer needed.
 * <p>
 * The returned string is guaranteed to be non-NULL, unless {@code format}
 * contains {@code %lc} or {@code %ls} conversions, which can fail if no multibyte
 * representation is available for the given character.
 * @param format a standard printf() format string, but notice
 *     [string precision pitfalls][string-precision]
 * @param varargs the parameters to insert into the format string
 * @return a newly-allocated string holding the result
 */
public static java.lang.String strdupPrintf(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strdup_printf.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param format a standard printf() format string, but notice
 *     [string precision pitfalls][string-precision]
 * @param args the list of parameters to insert into the format string
 * @return a newly-allocated string holding the result
 */
public static java.lang.String strdupVprintf(java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strdup_vprintf.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Copies {@code null}-terminated array of strings. The copy is a deep copy;
 * the new array should be freed by first freeing each string, then
 * the array itself. g_strfreev() does this for you. If called
 * on a {@code null} value, g_strdupv() simply returns {@code null}.
 * @param strArray a {@code null}-terminated array of strings
 * @return a new {@code null}-terminated array of strings.
 */
public static @Nullable PointerString strdupv(@Nullable PointerString strArray) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strdupv.invokeExact((Addressable) (strArray == null ? MemoryAddress.NULL : strArray.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * @param errnum the system error number. See the standard C {@code errno}
 *     documentation
 * @return a UTF-8 string describing the error code. If the error code
 *     is unknown, it returns a string like "Unknown error: &lt;code&gt;".
 */
public static java.lang.String strerror(int errnum) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_strerror.invokeExact(errnum);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Escapes the special characters '\\b', '\\f', '\\n', '\\r', '\\t', '\\v', '\\'
 * and '"' in the string {@code source} by inserting a '\\' before
 * them. Additionally all characters in the range 0x01-0x1F (everything
 * below SPACE) and in the range 0x7F-0xFF (all non-ASCII chars) are
 * replaced with a '\\' followed by their octal representation.
 * Characters supplied in {@code exceptions} are not escaped.
 * <p>
 * g_strcompress() does the reverse conversion.
 * @param source a string to escape
 * @param exceptions a string of characters not to escape in {@code source}
 * @return a newly-allocated copy of {@code source} with certain
 *     characters escaped. See above.
 */
public static java.lang.String strescape(java.lang.String source, @Nullable java.lang.String exceptions) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strescape.invokeExact(
                    Marshal.stringToAddress.marshal(source, SCOPE),
                    (Addressable) (exceptions == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(exceptions, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Frees a {@code null}-terminated array of strings, as well as each
 * string it contains.
 * <p>
 * If {@code str_array} is {@code null}, this function simply returns.
 * @param strArray a {@code null}-terminated array of strings to free
 */
public static void strfreev(@Nullable PointerString strArray) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_strfreev.invokeExact((Addressable) (strArray == null ? MemoryAddress.NULL : strArray.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * An auxiliary function for gettext() support (see Q_()).
 * @param msgid a string
 * @param msgval another string
 * @return {@code msgval}, unless {@code msgval} is identical to {@code msgid}
 *     and contains a '|' character, in which case a pointer to
 *     the substring of msgid after the first '|' character is returned.
 */
public static java.lang.String stripContext(java.lang.String msgid, java.lang.String msgval) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strip_context.invokeExact(
                    Marshal.stringToAddress.marshal(msgid, SCOPE),
                    Marshal.stringToAddress.marshal(msgval, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Joins a number of strings together to form one long string, with the
 * optional {@code separator} inserted between each of them. The returned string
 * should be freed with g_free().
 * @param separator a string to insert between each of the
 *     strings, or {@code null}
 * @param varargs a {@code null}-terminated list of strings to join
 * @return a newly-allocated string containing all of the strings joined
 *     together, with {@code separator} between them
 */
public static java.lang.String strjoin(@Nullable java.lang.String separator, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strjoin.invokeExact(
                    (Addressable) (separator == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(separator, SCOPE)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Joins a number of strings together to form one long string, with the
 * optional {@code separator} inserted between each of them. The returned string
 * should be freed with g_free().
 * <p>
 * If {@code str_array} has no items, the return value will be an
 * empty string. If {@code str_array} contains a single item, {@code separator} will not
 * appear in the resulting string.
 * @param separator a string to insert between each of the
 *     strings, or {@code null}
 * @param strArray a {@code null}-terminated array of strings to join
 * @return a newly-allocated string containing all of the strings joined
 *     together, with {@code separator} between them
 */
public static java.lang.String strjoinv(@Nullable java.lang.String separator, PointerString strArray) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strjoinv.invokeExact(
                    (Addressable) (separator == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(separator, SCOPE)),
                    strArray.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param dest destination buffer, already containing one nul-terminated string
 * @param src source buffer
 * @param destSize length of {@code dest} buffer in bytes (not length of existing string
 *     inside {@code dest})
 * @return size of attempted result, which is MIN (dest_size, strlen
 *     (original dest)) + strlen (src), so if retval &gt;= dest_size,
 *     truncation occurred.
 */
public static long strlcat(java.lang.String dest, java.lang.String src, long destSize) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_strlcat.invokeExact(
                    Marshal.stringToAddress.marshal(dest, SCOPE),
                    Marshal.stringToAddress.marshal(src, SCOPE),
                    destSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * {@code retval} &gt;= {@code dest_size}, truncation occurred.
 * <p>
 * Caveat: strlcpy() is supposedly more secure than strcpy() or strncpy(),
 * but if you really want to avoid screwups, g_strdup() is an even better
 * idea.
 * @param dest destination buffer
 * @param src source buffer
 * @param destSize length of {@code dest} in bytes
 * @return length of {@code src}
 */
public static long strlcpy(java.lang.String dest, java.lang.String src, long destSize) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_strlcpy.invokeExact(
                    Marshal.stringToAddress.marshal(dest, SCOPE),
                    Marshal.stringToAddress.marshal(src, SCOPE),
                    destSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * A case-insensitive string comparison, corresponding to the standard
 * strncasecmp() function on platforms which support it. It is similar
 * to g_strcasecmp() except it only compares the first {@code n} characters of
 * the strings.
 * @param s1 a string
 * @param s2 a string to compare with {@code s1}
 * @param n the maximum number of characters to compare
 * @return 0 if the strings match, a negative value if {@code s1} &lt; {@code s2},
 *     or a positive value if {@code s1} &gt; {@code s2}.
 * @deprecated The problem with g_strncasecmp() is that it does
 *     the comparison by calling toupper()/tolower(). These functions
 *     are locale-specific and operate on single bytes. However, it is
 *     impossible to handle things correctly from an internationalization
 *     standpoint by operating on bytes, since characters may be multibyte.
 *     Thus g_strncasecmp() is broken if your string is guaranteed to be
 *     ASCII, since it is locale-sensitive, and it's broken if your string
 *     is localized, since it doesn't work on many encodings at all,
 *     including UTF-8, EUC-JP, etc.
 * <p>
 *     There are therefore two replacement techniques: g_ascii_strncasecmp(),
 *     which only works on ASCII and is not locale-sensitive, and
 *     g_utf8_casefold() followed by strcmp() on the resulting strings,
 *     which is good for case-insensitive sorting of UTF-8.
 */
@Deprecated
public static int strncasecmp(java.lang.String s1, java.lang.String s2, int n) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_strncasecmp.invokeExact(
                    Marshal.stringToAddress.marshal(s1, SCOPE),
                    Marshal.stringToAddress.marshal(s2, SCOPE),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Duplicates the first {@code n} bytes of a string, returning a newly-allocated
 * buffer {@code n} + 1 bytes long which will always be nul-terminated. If {@code str}
 * is less than {@code n} bytes long the buffer is padded with nuls. If {@code str} is
 * {@code null} it returns {@code null}. The returned value should be freed when no longer
 * needed.
 * <p>
 * To copy a number of characters from a UTF-8 encoded string,
 * use g_utf8_strncpy() instead.
 * @param str the string to duplicate
 * @param n the maximum number of bytes to copy from {@code str}
 * @return a newly-allocated buffer containing the first {@code n} bytes
 *     of {@code str}, nul-terminated
 */
public static java.lang.String strndup(java.lang.String str, long n) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strndup.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Creates a new string {@code length} bytes long filled with {@code fill_char}.
 * The returned string should be freed when no longer needed.
 * @param length the length of the new string
 * @param fillChar the byte to fill the string with
 * @return a newly-allocated string filled the {@code fill_char}
 */
public static java.lang.String strnfill(long length, byte fillChar) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_strnfill.invokeExact(
                length,
                fillChar);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Reverses all of the bytes in a string. For example,
 * {@code g_strreverse ("abcdef")} will result in "fedcba".
 * <p>
 * Note that g_strreverse() doesn't work on UTF-8 strings
 * containing multibyte characters. For that purpose, use
 * g_utf8_strreverse().
 * @param string the string to reverse
 * @return the same pointer passed in as {@code string}
 */
public static java.lang.String strreverse(java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strreverse.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Searches the string {@code haystack} for the last occurrence
 * of the string {@code needle}.
 * @param haystack a nul-terminated string
 * @param needle the nul-terminated string to search for
 * @return a pointer to the found occurrence, or
 *    {@code null} if not found.
 */
public static java.lang.String strrstr(java.lang.String haystack, java.lang.String needle) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strrstr.invokeExact(
                    Marshal.stringToAddress.marshal(haystack, SCOPE),
                    Marshal.stringToAddress.marshal(needle, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Searches the string {@code haystack} for the last occurrence
 * of the string {@code needle}, limiting the length of the search
 * to {@code haystack_len}.
 * @param haystack a nul-terminated string
 * @param haystackLen the maximum length of {@code haystack} in bytes. A length of -1
 *     can be used to mean "search the entire string", like g_strrstr().
 * @param needle the nul-terminated string to search for
 * @return a pointer to the found occurrence, or
 *    {@code null} if not found.
 */
public static java.lang.String strrstrLen(java.lang.String haystack, long haystackLen, java.lang.String needle) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strrstr_len.invokeExact(
                    Marshal.stringToAddress.marshal(haystack, SCOPE),
                    haystackLen,
                    Marshal.stringToAddress.marshal(needle, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Returns a string describing the given signal, e.g. "Segmentation fault".
 * You should use this function in preference to strsignal(), because it
 * returns a string in UTF-8 encoding, and since not all platforms support
 * the strsignal() function.
 * @param signum the signal number. See the {@code signal} documentation
 * @return a UTF-8 string describing the signal. If the signal is unknown,
 *     it returns "unknown signal (&lt;signum&gt;)".
 */
public static java.lang.String strsignal(int signum) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_strsignal.invokeExact(signum);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

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
 * @param string a string to split
 * @param delimiter a string which specifies the places at which to split
 *     the string. The delimiter is not included in any of the resulting
 *     strings, unless {@code max_tokens} is reached.
 * @param maxTokens the maximum number of pieces to split {@code string} into.
 *     If this is less than 1, the string is split completely.
 * @return a newly-allocated {@code null}-terminated array of strings. Use
 *    g_strfreev() to free it.
 */
public static PointerString strsplit(java.lang.String string, java.lang.String delimiter, int maxTokens) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strsplit.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    Marshal.stringToAddress.marshal(delimiter, SCOPE),
                    maxTokens);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

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
 * @param string The string to be tokenized
 * @param delimiters A nul-terminated string containing bytes that are used
 *     to split the string (it can accept an empty string, which will result
 *     in no string splitting).
 * @param maxTokens The maximum number of tokens to split {@code string} into.
 *     If this is less than 1, the string is split completely
 * @return a newly-allocated {@code null}-terminated array of strings. Use
 *    g_strfreev() to free it.
 */
public static PointerString strsplitSet(java.lang.String string, java.lang.String delimiters, int maxTokens) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strsplit_set.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    Marshal.stringToAddress.marshal(delimiters, SCOPE),
                    maxTokens);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

/**
 * Searches the string {@code haystack} for the first occurrence
 * of the string {@code needle}, limiting the length of the search
 * to {@code haystack_len}.
 * @param haystack a nul-terminated string
 * @param haystackLen the maximum length of {@code haystack} in bytes. A length of -1
 *     can be used to mean "search the entire string", like {@code strstr()}.
 * @param needle the string to search for
 * @return a pointer to the found occurrence, or
 *    {@code null} if not found.
 */
public static java.lang.String strstrLen(java.lang.String haystack, long haystackLen, java.lang.String needle) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strstr_len.invokeExact(
                    Marshal.stringToAddress.marshal(haystack, SCOPE),
                    haystackLen,
                    Marshal.stringToAddress.marshal(needle, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param nptr the string to convert to a numeric value.
 * @param endptr if non-{@code null}, it returns the
 *           character after the last character used in the conversion.
 * @return the {@code gdouble} value.
 */
public static double strtod(java.lang.String nptr, @Nullable Out<java.lang.String> endptr) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment endptrPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.g_strtod.invokeExact(
                    Marshal.stringToAddress.marshal(nptr, SCOPE),
                    (Addressable) (endptr == null ? MemoryAddress.NULL : (Addressable) endptrPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (endptr != null) endptr.set(Marshal.addressToString.marshal(endptrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return RESULT;
    }
}

/**
 * Converts a string to upper case.
 * @param string the string to convert
 * @return the string
 * @deprecated This function is totally broken for the reasons
 *     discussed in the g_strncasecmp() docs - use g_ascii_strup()
 *     or g_utf8_strup() instead.
 */
@Deprecated
public static java.lang.String strup(java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strup.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Checks if {@code strv} contains {@code str}. {@code strv} must not be {@code null}.
 * @param strv a {@code null}-terminated array of strings
 * @param str a string
 * @return {@code true} if {@code str} is an element of {@code strv}, according to g_str_equal().
 */
public static boolean strvContains(java.lang.String strv, java.lang.String str) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_strv_contains.invokeExact(
                    Marshal.stringToAddress.marshal(strv, SCOPE),
                    Marshal.stringToAddress.marshal(str, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Checks if {@code strv1} and {@code strv2} contain exactly the same elements in exactly the
 * same order. Elements are compared using g_str_equal(). To match independently
 * of order, sort the arrays first (using g_qsort_with_data() or similar).
 * <p>
 * Two empty arrays are considered equal. Neither {@code strv1} not {@code strv2} may be
 * {@code null}.
 * @param strv1 a {@code null}-terminated array of strings
 * @param strv2 another {@code null}-terminated array of strings
 * @return {@code true} if {@code strv1} and {@code strv2} are equal
 */
public static boolean strvEqual(java.lang.String strv1, java.lang.String strv2) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_strv_equal.invokeExact(
                    Marshal.stringToAddress.marshal(strv1, SCOPE),
                    Marshal.stringToAddress.marshal(strv2, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Type strvGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_strv_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

/**
 * Returns the length of the given {@code null}-terminated
 * string array {@code str_array}. {@code str_array} must not be {@code null}.
 * @param strArray a {@code null}-terminated array of strings
 * @return length of {@code str_array}.
 */
public static int strvLength(PointerString strArray) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_strv_length.invokeExact(strArray.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * do so even if it isn???t.
 * @param testpath /-separated test case path name for the test.
 * @param testFunc The test function to invoke for this test.
 */
public static void testAddDataFunc(java.lang.String testpath, org.gtk.glib.TestDataFunc testFunc) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_add_data_func.invokeExact(
                    Marshal.stringToAddress.marshal(testpath, SCOPE),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) testFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Create a new test case, as with g_test_add_data_func(), but freeing
 * {@code test_data} after the test run is complete.
 * @param testpath /-separated test case path name for the test.
 * @param testFunc The test function to invoke for this test.
 * @param dataFreeFunc {@link DestroyNotify} for {@code test_data}.
 */
public static void testAddDataFuncFull(java.lang.String testpath, org.gtk.glib.TestDataFunc testFunc, org.gtk.glib.DestroyNotify dataFreeFunc) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_add_data_func_full.invokeExact(
                    Marshal.stringToAddress.marshal(testpath, SCOPE),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) testFunc.toCallback(),
                    (Addressable) dataFreeFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Create a new test case, similar to g_test_create_case(). However
 * the test is assumed to use no fixture, and test suites are automatically
 * created on the fly and added to the root fixture, based on the
 * slash-separated portions of {@code testpath}.
 * <p>
 * If {@code testpath} includes the component "subprocess" anywhere in it,
 * the test will be skipped by default, and only run if explicitly
 * required via the {@code -p} command-line option or g_test_trap_subprocess().
 * <p>
 * No component of {@code testpath} may start with a dot ({@code .}) if the
 * {@code G_TEST_OPTION_ISOLATE_DIRS} option is being used; and it is recommended to
 * do so even if it isn???t.
 * @param testpath /-separated test case path name for the test.
 * @param testFunc The test function to invoke for this test.
 */
public static void testAddFunc(java.lang.String testpath, org.gtk.glib.TestFunc testFunc) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_add_func.invokeExact(
                    Marshal.stringToAddress.marshal(testpath, SCOPE),
                    (Addressable) testFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static void testAddVtable(java.lang.String testpath, long dataSize, org.gtk.glib.TestFixtureFunc dataSetup, org.gtk.glib.TestFixtureFunc dataTest, org.gtk.glib.TestFixtureFunc dataTeardown) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_add_vtable.invokeExact(
                    Marshal.stringToAddress.marshal(testpath, SCOPE),
                    dataSize,
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) dataSetup.toCallback(),
                    (Addressable) dataTest.toCallback(),
                    (Addressable) dataTeardown.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static void testAssertExpectedMessagesInternal(java.lang.String domain, java.lang.String file, int line, java.lang.String func) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_assert_expected_messages_internal.invokeExact(
                    Marshal.stringToAddress.marshal(domain, SCOPE),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(func, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * @param bugUriSnippet Bug specific bug tracker URI or URI portion.
 */
public static void testBug(java.lang.String bugUriSnippet) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_bug.invokeExact(Marshal.stringToAddress.marshal(bugUriSnippet, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
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
 * portion to {@code uri_pattern}, or by replacing the special string
 * {@code %s} within {@code uri_pattern} if that is present.
 * <p>
 * If g_test_bug_base() is not called, bug URIs are formed solely
 * from the value provided by g_test_bug().
 * @param uriPattern the base pattern for bug URIs
 */
public static void testBugBase(java.lang.String uriPattern) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_bug_base.invokeExact(Marshal.stringToAddress.marshal(uriPattern, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Creates the pathname to a data file that is required for a test.
 * <p>
 * This function is conceptually similar to g_build_filename() except
 * that the first argument has been replaced with a {@link TestFileType}
 * argument.
 * <p>
 * The data file should either have been distributed with the module
 * containing the test ({@link TestFileType#DIST}) or built as part of the build
 * system of that module ({@link TestFileType#BUILT}).
 * <p>
 * In order for this function to work in srcdir != builddir situations,
 * the G_TEST_SRCDIR and G_TEST_BUILDDIR environment variables need to
 * have been defined.  As of 2.38, this is done by the glib.mk
 * included in GLib.  Please ensure that your copy is up to date before
 * using this function.
 * <p>
 * In case neither variable is set, this function will fall back to
 * using the dirname portion of argv[0], possibly removing ".libs".
 * This allows for casual running of tests directly from the commandline
 * in the srcdir == builddir case and should also support running of
 * installed tests, assuming the data files have been installed in the
 * same relative path as the test binary.
 * @param fileType the type of file (built vs. distributed)
 * @param firstPath the first segment of the pathname
 * @param varargs {@code null}-terminated additional path segments
 * @return the path of the file, to be freed using g_free()
 */
public static java.lang.String testBuildFilename(org.gtk.glib.TestFileType fileType, java.lang.String firstPath, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_build_filename.invokeExact(
                    fileType.getValue(),
                    Marshal.stringToAddress.marshal(firstPath, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param testName the name for the test case
 * @param dataSize the size of the fixture data structure
 * @param dataSetup the function to set up the fixture data
 * @param dataTest the actual test function
 * @param dataTeardown the function to teardown the fixture data
 * @return a newly allocated {@link TestCase}.
 */
public static org.gtk.glib.TestCase testCreateCase(java.lang.String testName, long dataSize, org.gtk.glib.TestFixtureFunc dataSetup, org.gtk.glib.TestFixtureFunc dataTest, org.gtk.glib.TestFixtureFunc dataTeardown) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_create_case.invokeExact(
                    Marshal.stringToAddress.marshal(testName, SCOPE),
                    dataSize,
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) dataSetup.toCallback(),
                    (Addressable) dataTest.toCallback(),
                    (Addressable) dataTeardown.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TestCase.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Create a new test suite with the name {@code suite_name}.
 * @param suiteName a name for the suite
 * @return A newly allocated {@link TestSuite} instance.
 */
public static org.gtk.glib.TestSuite testCreateSuite(java.lang.String suiteName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_create_suite.invokeExact(Marshal.stringToAddress.marshal(suiteName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TestSuite.fromAddress.marshal(RESULT, null);
    }
}

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
 * @param logDomain the log domain of the message
 * @param logLevel the log level of the message
 * @param pattern a glob-style [pattern][glib-Glob-style-pattern-matching]
 */
public static void testExpectMessage(@Nullable java.lang.String logDomain, org.gtk.glib.LogLevelFlags logLevel, java.lang.String pattern) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_expect_message.invokeExact(
                    (Addressable) (logDomain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(logDomain, SCOPE)),
                    logLevel.getValue(),
                    Marshal.stringToAddress.marshal(pattern, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
        DowncallHandles.g_test_fail.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Equivalent to g_test_fail(), but also record a message like
 * g_test_skip_printf().
 * @param format the format string
 * @param varargs printf-like arguments to {@code format}
 */
public static void testFailPrintf(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_fail_printf.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * @return {@code true} if the test has failed
 */
public static boolean testFailed() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_test_failed.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Gets the pathname of the directory containing test files of the type
 * specified by {@code file_type}.
 * <p>
 * This is approximately the same as calling g_test_build_filename("."),
 * but you don't need to free the return value.
 * @param fileType the type of file (built vs. distributed)
 * @return the path of the directory, owned by GLib
 */
public static java.lang.String testGetDir(org.gtk.glib.TestFileType fileType) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_test_get_dir.invokeExact(fileType.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Gets the pathname to a data file that is required for a test.
 * <p>
 * This is the same as g_test_build_filename() with two differences.
 * The first difference is that you must only use this function from within
 * a testcase function.  The second difference is that you need not free
 * the return value ??? it will be automatically freed when the testcase
 * finishes running.
 * <p>
 * It is safe to use this function from a thread inside of a testcase
 * but you must ensure that all such uses occur before the main testcase
 * function returns (ie: it is best to ensure that all threads have been
 * joined).
 * @param fileType the type of file (built vs. distributed)
 * @param firstPath the first segment of the pathname
 * @param varargs {@code null}-terminated additional path segments
 * @return the path, automatically freed at the end of the testcase
 */
public static java.lang.String testGetFilename(org.gtk.glib.TestFileType fileType, java.lang.String firstPath, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_get_filename.invokeExact(
                    fileType.getValue(),
                    Marshal.stringToAddress.marshal(firstPath, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Gets the test path for the test currently being run.
 * <p>
 * In essence, it will be the same string passed as the first argument to
 * e.g. g_test_add() when the test was added.
 * <p>
 * This function returns a valid string only within a test function.
 * @return the test path for the test currently being run
 */
public static java.lang.String testGetPath() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_test_get_path.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Get the toplevel test suite for the test path API.
 * @return the toplevel {@link TestSuite}
 */
public static org.gtk.glib.TestSuite testGetRoot() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_test_get_root.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.TestSuite.fromAddress.marshal(RESULT, null);
}

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
 * @param msg explanation
 */
public static void testIncomplete(@Nullable java.lang.String msg) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_incomplete.invokeExact((Addressable) (msg == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(msg, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Equivalent to g_test_incomplete(), but the explanation is formatted
 * as if by g_strdup_printf().
 * @param format the format string
 * @param varargs printf-like arguments to {@code format}
 */
public static void testIncompletePrintf(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_incomplete_printf.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Initialize the GLib testing framework, e.g. by seeding the
 * test random number generator, the name for g_get_prgname()
 * and parsing test related command line args.
 * <p>
 * So far, the following arguments are understood:
 * <ul>
 * <li>{@code -l}: List test cases available in a test executable.
 * <li>{@code --seed=SEED}: Provide a random seed to reproduce test
 *   runs using random numbers.
 * <li>{@code --verbose}: Run tests verbosely.
 * <li>{@code -q}, {@code --quiet}: Run tests quietly.
 * <li>{@code -p PATH}: Execute all tests matching the given path.
 * <li>{@code -s PATH}: Skip all tests matching the given path.
 *   This can also be used to force a test to run that would otherwise
 *   be skipped (ie, a test whose name contains "/subprocess").
 * <li>{@code -m {perf|slow|thorough|quick|undefined|no-undefined}}: Execute tests according to these test modes:
 * </ul>
 * <p>
 *   {@code perf}: Performance tests, may take long and report results (off by default).
 * <p>
 *   {@code slow}, {@code thorough}: Slow and thorough tests, may take quite long and maximize coverage
 *   (off by default).
 * <p>
 *   {@code quick}: Quick tests, should run really quickly and give good coverage (the default).
 * <p>
 *   {@code undefined}: Tests for undefined behaviour, may provoke programming errors
 *   under g_test_trap_subprocess() or g_test_expect_message() to check
 *   that appropriate assertions or warnings are given (the default).
 * <p>
 *   {@code no-undefined}: Avoid tests for undefined behaviour
 * <ul>
 * <li>{@code --debug-log}: Debug test logging output.
 * </ul>
 * <p>
 * Options which can be passed to {@code .}.. are:
 * <ul>
 * <li>{@code "no_g_set_prgname"}: Causes g_test_init() to not call g_set_prgname().
 * <li>{@code G_TEST_OPTION_ISOLATE_DIRS}: Creates a unique temporary directory for each
 *    unit test and uses g_set_user_dirs() to set XDG directories to point into
 *    that temporary directory for the duration of the unit test. See the
 *    documentation for {@code G_TEST_OPTION_ISOLATE_DIRS}.
 * </ul>
 * <p>
 * Since 2.58, if tests are compiled with {@code G_DISABLE_ASSERT} defined,
 * g_test_init() will print an error and exit. This is to prevent no-op tests
 * from being executed, as g_assert() is commonly (erroneously) used in unit
 * tests, and is a no-op when compiled with {@code G_DISABLE_ASSERT}. Ensure your
 * tests are compiled without {@code G_DISABLE_ASSERT} defined.
 * @param argc Address of the {@code argc} parameter of the main() function.
 *        Changed if any arguments were handled.
 * @param argv Address of the {@code argv} parameter of main().
 *        Any parameters understood by g_test_init() stripped before return.
 * @param varargs {@code null}-terminated list of special options, documented below.
 */
public static void testInit(PointerInteger argc, PointerString argv, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_init.invokeExact(
                    argc.handle(),
                    argv.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

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
 * @param logFunc the log handler function.
 */
public static void testLogSetFatalHandler(org.gtk.glib.TestLogFatalFunc logFunc) {
    try {
        DowncallHandles.g_test_log_set_fatal_handler.invokeExact(
                (Addressable) logFunc.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static java.lang.String testLogTypeName(org.gtk.glib.TestLogType logType) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_test_log_type_name.invokeExact(logType.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Report the result of a performance or measurement test.
 * The test should generally strive to maximize the reported
 * quantities (larger values are better than smaller ones),
 * this and {@code maximized_quantity} can determine sorting
 * order for test result reports.
 * @param maximizedQuantity the reported value
 * @param format the format string of the report message
 * @param varargs arguments to pass to the printf() function
 */
public static void testMaximizedResult(double maximizedQuantity, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_maximized_result.invokeExact(
                    maximizedQuantity,
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Add a message to the test report.
 * @param format the format string
 * @param varargs printf-like arguments to {@code format}
 */
public static void testMessage(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_message.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Report the result of a performance or measurement test.
 * The test should generally strive to minimize the reported
 * quantities (smaller values are better than larger ones),
 * this and {@code minimized_quantity} can determine sorting
 * order for test result reports.
 * @param minimizedQuantity the reported value
 * @param format the format string of the report message
 * @param varargs arguments to pass to the printf() function
 */
public static void testMinimizedResult(double minimizedQuantity, java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_minimized_result.invokeExact(
                    minimizedQuantity,
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * This function enqueus a callback {@code destroy_func} to be executed
 * during the next test case teardown phase. This is most useful
 * to auto destruct allocated test resources at the end of a test run.
 * Resources are released in reverse queue order, that means enqueueing
 * callback A before callback B will cause B() to be called before
 * A() during teardown.
 * @param destroyFunc Destroy callback for teardown phase.
 */
public static void testQueueDestroy(org.gtk.glib.DestroyNotify destroyFunc) {
    try {
        DowncallHandles.g_test_queue_destroy.invokeExact(
                (Addressable) destroyFunc.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Enqueue a pointer to be released with g_free() during the next
 * teardown phase. This is equivalent to calling g_test_queue_destroy()
 * with a destroy callback of g_free().
 * @param gfreePointer the pointer to be stored.
 */
public static void testQueueFree(@Nullable java.lang.foreign.MemoryAddress gfreePointer) {
    try {
        DowncallHandles.g_test_queue_free.invokeExact((Addressable) (gfreePointer == null ? MemoryAddress.NULL : (Addressable) gfreePointer));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Get a reproducible random floating point number,
 * see g_test_rand_int() for details on test case random numbers.
 * @return a random number from the seeded random number generator.
 */
public static double testRandDouble() {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.g_test_rand_double.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Get a reproducible random floating pointer number out of a specified range,
 * see g_test_rand_int() for details on test case random numbers.
 * @param rangeStart the minimum value returned by this function
 * @param rangeEnd the minimum value not returned by this function
 * @return a number with {@code range_start} &lt;= number &lt; {@code range_end}.
 */
public static double testRandDoubleRange(double rangeStart, double rangeEnd) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.g_test_rand_double_range.invokeExact(
                rangeStart,
                rangeEnd);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @return a random number from the seeded random number generator.
 */
public static int testRandInt() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_test_rand_int.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Get a reproducible random integer number out of a specified range,
 * see g_test_rand_int() for details on test case random numbers.
 * @param begin the minimum value returned by this function
 * @param end the smallest value not to be returned by this function
 * @return a number with {@code begin} &lt;= number &lt; {@code end}.
 */
public static int testRandIntRange(int begin, int end) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_test_rand_int_range.invokeExact(
                begin,
                end);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @return 0 on success, 1 on failure (assuming it returns at all),
 *   0 or 77 if all tests were skipped with g_test_skip() and/or
 *   g_test_incomplete()
 */
public static int testRun() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_test_run.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Execute the tests within {@code suite} and all nested {@code GTestSuites}.
 * The test suites to be executed are filtered according to
 * test path arguments ({@code -p testpath} and {@code -s testpath}) as parsed by
 * g_test_init(). See the g_test_run() documentation for more
 * information on the order that tests are run in.
 * <p>
 * g_test_run_suite() or g_test_run() may only be called once
 * in a program.
 * @param suite a {@link TestSuite}
 * @return 0 on success
 */
public static int testRunSuite(org.gtk.glib.TestSuite suite) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_test_run_suite.invokeExact(suite.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
        DowncallHandles.g_test_set_nonfatal_assertions.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Indicates that a test was skipped.
 * <p>
 * Calling this function will not stop the test from running, you
 * need to return from the test function yourself. So you can
 * produce additional diagnostic messages or even continue running
 * the test.
 * <p>
 * If not called from inside a test, this function does nothing.
 * @param msg explanation
 */
public static void testSkip(@Nullable java.lang.String msg) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_skip.invokeExact((Addressable) (msg == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(msg, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Equivalent to g_test_skip(), but the explanation is formatted
 * as if by g_strdup_printf().
 * @param format the format string
 * @param varargs printf-like arguments to {@code format}
 */
public static void testSkipPrintf(java.lang.String format, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_skip_printf.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Returns {@code true} (after g_test_init() has been called) if the test
 * program is running under g_test_trap_subprocess().
 * @return {@code true} if the test program is running under
 * g_test_trap_subprocess().
 */
public static boolean testSubprocess() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_test_subprocess.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

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
 *   ???
 * }
 * }</pre>
 * @param summary One or two sentences summarising what the test checks, and how it
 *    checks it.
 */
public static void testSummary(java.lang.String summary) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_summary.invokeExact(Marshal.stringToAddress.marshal(summary, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Get the number of seconds since the last start of the timer with
 * g_test_timer_start().
 * @return the time since the last start of the timer in seconds, as a double
 */
public static double testTimerElapsed() {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.g_test_timer_elapsed.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Report the last result of g_test_timer_elapsed().
 * @return the last result of g_test_timer_elapsed(), as a double
 */
public static double testTimerLast() {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.g_test_timer_last.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Start a timing test. Call g_test_timer_elapsed() when the task is supposed
 * to be done. Call this function again to restart the timer.
 */
public static void testTimerStart() {
    try {
        DowncallHandles.g_test_timer_start.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

public static void testTrapAssertions(java.lang.String domain, java.lang.String file, int line, java.lang.String func, long assertionFlags, java.lang.String pattern) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_trap_assertions.invokeExact(
                    Marshal.stringToAddress.marshal(domain, SCOPE),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(func, SCOPE),
                    assertionFlags,
                    Marshal.stringToAddress.marshal(pattern, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Fork the current test program to execute a test case that might
 * not return or that might abort.
 * <p>
 * If {@code usec_timeout} is non-0, the forked test case is aborted and
 * considered failing if its run time exceeds it.
 * <p>
 * The forking behavior can be configured with the {@link TestTrapFlags} flags.
 * <p>
 * In the following example, the test code forks, the forked child
 * process produces some sample output and exits successfully.
 * The forking parent process then asserts successful child program
 * termination and validates child program outputs.
 * <pre>{@code <!-- language="C" -->
 *   static void
 *   test_fork_patterns (void)
 *   {
 *     if (g_test_trap_fork (0, G_TEST_TRAP_SILENCE_STDOUT | G_TEST_TRAP_SILENCE_STDERR))
 *       {
 *         g_print ("some stdout text: somagic17\\n");
 *         g_printerr ("some stderr text: semagic43\\n");
 *         exit (0); // successful test run
 *       }
 *     g_test_trap_assert_passed ();
 *     g_test_trap_assert_stdout ("*somagic17*");
 *     g_test_trap_assert_stderr ("*semagic43*");
 *   }
 * }</pre>
 * @param usecTimeout Timeout for the forked test in micro seconds.
 * @param testTrapFlags Flags to modify forking behaviour.
 * @return {@code true} for the forked child and {@code false} for the executing parent process.
 * @deprecated This function is implemented only on Unix platforms,
 * and is not always reliable due to problems inherent in
 * fork-without-exec. Use g_test_trap_subprocess() instead.
 */
@Deprecated
public static boolean testTrapFork(long usecTimeout, org.gtk.glib.TestTrapFlags testTrapFlags) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_test_trap_fork.invokeExact(
                usecTimeout,
                testTrapFlags.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Check the result of the last g_test_trap_subprocess() call.
 * @return {@code true} if the last test subprocess terminated successfully.
 */
public static boolean testTrapHasPassed() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_test_trap_has_passed.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Check the result of the last g_test_trap_subprocess() call.
 * @return {@code true} if the last test subprocess got killed due to a timeout.
 */
public static boolean testTrapReachedTimeout() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_test_trap_reached_timeout.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

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
 *     g_test_trap_subprocess (NULL, 0, G_TEST_SUBPROCESS_DEFAULT);
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
 * @param testPath Test to run in a subprocess
 * @param usecTimeout Timeout for the subprocess test in micro seconds.
 * @param testFlags Flags to modify subprocess behaviour.
 */
public static void testTrapSubprocess(@Nullable java.lang.String testPath, long usecTimeout, org.gtk.glib.TestSubprocessFlags testFlags) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_test_trap_subprocess.invokeExact(
                    (Addressable) (testPath == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(testPath, SCOPE)),
                    usecTimeout,
                    testFlags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

public static org.gtk.glib.Quark threadErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_thread_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

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
 * @param retval the return value of this thread
 */
public static void threadExit(@Nullable java.lang.foreign.MemoryAddress retval) {
    try {
        DowncallHandles.g_thread_exit.invokeExact((Addressable) (retval == null ? MemoryAddress.NULL : (Addressable) retval));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * This function will return the maximum {@code interval} that a
 * thread will wait in the thread pool for new tasks before
 * being stopped.
 * <p>
 * If this function returns 0, threads waiting in the thread
 * pool for new work are not stopped.
 * @return the maximum {@code interval} (milliseconds) to wait
 *     for new tasks in the thread pool before stopping the
 *     thread
 */
public static int threadPoolGetMaxIdleTime() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_thread_pool_get_max_idle_time.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns the maximal allowed number of unused threads.
 * @return the maximal number of unused threads
 */
public static int threadPoolGetMaxUnusedThreads() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_thread_pool_get_max_unused_threads.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns the number of currently unused threads.
 * @return the number of currently unused threads
 */
public static int threadPoolGetNumUnusedThreads() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_thread_pool_get_num_unused_threads.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param interval the maximum {@code interval} (in milliseconds)
 *     a thread can be idle
 */
public static void threadPoolSetMaxIdleTime(int interval) {
    try {
        DowncallHandles.g_thread_pool_set_max_idle_time.invokeExact(interval);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets the maximal number of unused threads to {@code max_threads}.
 * If {@code max_threads} is -1, no limit is imposed on the number
 * of unused threads.
 * <p>
 * The default value is 2.
 * @param maxThreads maximal number of unused threads
 */
public static void threadPoolSetMaxUnusedThreads(int maxThreads) {
    try {
        DowncallHandles.g_thread_pool_set_max_unused_threads.invokeExact(maxThreads);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Stops all currently unused threads. This does not change the
 * maximal number of unused threads. This function can be used to
 * regularly stop all unused threads e.g. from g_timeout_add().
 */
public static void threadPoolStopUnusedThreads() {
    try {
        DowncallHandles.g_thread_pool_stop_unused_threads.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @return the {@link Thread} representing the current thread
 */
public static org.gtk.glib.Thread threadSelf() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_thread_self.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.Thread.fromAddress.marshal(RESULT, null);
}

/**
 * Causes the calling thread to voluntarily relinquish the CPU, so
 * that other threads can run.
 * <p>
 * This function is often used as a method to make busy wait less evil.
 */
public static void threadYield() {
    try {
        DowncallHandles.g_thread_yield.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Converts a string containing an ISO 8601 encoded date and time
 * to a {@link TimeVal} and puts it into {@code time_}.
 * <p>
 * {@code iso_date} must include year, month, day, hours, minutes, and
 * seconds. It can optionally include fractions of a second and a time
 * zone indicator. (In the absence of any time zone indication, the
 * timestamp is assumed to be in local time.)
 * <p>
 * Any leading or trailing space in {@code iso_date} is ignored.
 * <p>
 * This function was deprecated, along with {@link TimeVal} itself, in GLib 2.62.
 * Equivalent functionality is available using code like:
 * <pre>{@code 
 * GDateTime *dt = g_date_time_new_from_iso8601 (iso8601_string, NULL);
 * gint64 time_val = g_date_time_to_unix (dt);
 * g_date_time_unref (dt);
 * }</pre>
 * @param isoDate an ISO 8601 encoded date string
 * @param time a {@link TimeVal}
 * @return {@code true} if the conversion was successful.
 * @deprecated {@link TimeVal} is not year-2038-safe. Use
 *    g_date_time_new_from_iso8601() instead.
 */
@Deprecated
public static boolean timeValFromIso8601(java.lang.String isoDate, org.gtk.glib.TimeVal time) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_time_val_from_iso8601.invokeExact(
                    Marshal.stringToAddress.marshal(isoDate, SCOPE),
                    time.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param interval the time between calls to the function, in milliseconds
 *    (1/1000ths of a second)
 * @param function function to call
 * @return the ID (greater than 0) of the event source.
 */
public static int timeoutAdd(int interval, org.gtk.glib.SourceFunc function) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_timeout_add.invokeExact(
                interval,
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param priority the priority of the timeout source. Typically this will be in
 *   the range between {@code G_PRIORITY_DEFAULT} and {@code G_PRIORITY_HIGH}.
 * @param interval the time between calls to the function, in milliseconds
 *   (1/1000ths of a second)
 * @param function function to call
 * @param notify function to call when the timeout is removed, or {@code null}
 * @return the ID (greater than 0) of the event source.
 */
public static int timeoutAddFull(int priority, int interval, org.gtk.glib.SourceFunc function, @Nullable org.gtk.glib.DestroyNotify notify) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_timeout_add_full.invokeExact(
                priority,
                interval,
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Sets a function to be called after {@code interval} milliseconds have elapsed,
 * with the default priority, {@code G_PRIORITY_DEFAULT}.
 * <p>
 * The given {@code function} is called once and then the source will be automatically
 * removed from the main context.
 * <p>
 * This function otherwise behaves like g_timeout_add().
 * @param interval the time after which the function will be called, in
 *   milliseconds (1/1000ths of a second)
 * @param function function to call
 * @return the ID (greater than 0) of the event source
 */
public static int timeoutAddOnce(int interval, org.gtk.glib.SourceOnceFunc function) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_timeout_add_once.invokeExact(
                interval,
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param interval the time between calls to the function, in seconds
 * @param function function to call
 * @return the ID (greater than 0) of the event source.
 */
public static int timeoutAddSeconds(int interval, org.gtk.glib.SourceFunc function) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_timeout_add_seconds.invokeExact(
                interval,
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param priority the priority of the timeout source. Typically this will be in
 *   the range between {@code G_PRIORITY_DEFAULT} and {@code G_PRIORITY_HIGH}.
 * @param interval the time between calls to the function, in seconds
 * @param function function to call
 * @param notify function to call when the timeout is removed, or {@code null}
 * @return the ID (greater than 0) of the event source.
 */
public static int timeoutAddSecondsFull(int priority, int interval, org.gtk.glib.SourceFunc function, @Nullable org.gtk.glib.DestroyNotify notify) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_timeout_add_seconds_full.invokeExact(
                priority,
                interval,
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Creates a new timeout source.
 * <p>
 * The source will not initially be associated with any {@link MainContext}
 * and must be added to one with g_source_attach() before it will be
 * executed.
 * <p>
 * The interval given is in terms of monotonic time, not wall clock
 * time.  See g_get_monotonic_time().
 * @param interval the timeout interval in milliseconds.
 * @return the newly-created timeout source
 */
public static org.gtk.glib.Source timeoutSourceNew(int interval) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_timeout_source_new.invokeExact(interval);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

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
 * @param interval the timeout interval in seconds
 * @return the newly-created timeout source
 */
public static org.gtk.glib.Source timeoutSourceNewSeconds(int interval) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_timeout_source_new_seconds.invokeExact(interval);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Returns the height of a {@link TrashStack}.
 * <p>
 * Note that execution of this function is of O(N) complexity
 * where N denotes the number of items on the stack.
 * @param stackP a {@link TrashStack}
 * @return the height of the stack
 * @deprecated {@link TrashStack} is deprecated without replacement
 */
@Deprecated
public static int trashStackHeight(PointerProxy<org.gtk.glib.TrashStack> stackP) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_trash_stack_height.invokeExact(stackP.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns the element at the top of a {@link TrashStack}
 * which may be {@code null}.
 * @param stackP a {@link TrashStack}
 * @return the element at the top of the stack
 * @deprecated {@link TrashStack} is deprecated without replacement
 */
@Deprecated
public static @Nullable java.lang.foreign.MemoryAddress trashStackPeek(PointerProxy<org.gtk.glib.TrashStack> stackP) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_trash_stack_peek.invokeExact(stackP.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Pops a piece of memory off a {@link TrashStack}.
 * @param stackP a {@link TrashStack}
 * @return the element at the top of the stack
 * @deprecated {@link TrashStack} is deprecated without replacement
 */
@Deprecated
public static @Nullable java.lang.foreign.MemoryAddress trashStackPop(PointerProxy<org.gtk.glib.TrashStack> stackP) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_trash_stack_pop.invokeExact(stackP.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Pushes a piece of memory onto a {@link TrashStack}.
 * @param stackP a {@link TrashStack}
 * @param dataP the piece of memory to push on the stack
 * @deprecated {@link TrashStack} is deprecated without replacement
 */
@Deprecated
public static void trashStackPush(PointerProxy<org.gtk.glib.TrashStack> stackP, java.lang.foreign.MemoryAddress dataP) {
    try {
        DowncallHandles.g_trash_stack_push.invokeExact(
                stackP.handle(),
                (Addressable) dataP);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Attempts to allocate {@code n_bytes}, and returns {@code null} on failure.
 * Contrast with g_malloc(), which aborts the program on failure.
 * @param nBytes number of bytes to allocate.
 * @return the allocated memory, or {@code null}.
 */
public static @Nullable java.lang.foreign.MemoryAddress tryMalloc(long nBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_try_malloc.invokeExact(nBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Attempts to allocate {@code n_bytes}, initialized to 0's, and returns {@code null} on
 * failure. Contrast with g_malloc0(), which aborts the program on failure.
 * @param nBytes number of bytes to allocate
 * @return the allocated memory, or {@code null}
 */
public static @Nullable java.lang.foreign.MemoryAddress tryMalloc0(long nBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_try_malloc0.invokeExact(nBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * This function is similar to g_try_malloc0(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
 * but care is taken to detect possible overflow during multiplication.
 * @param nBlocks the number of blocks to allocate
 * @param nBlockBytes the size of each block in bytes
 * @return the allocated memory, or {@code null}
 */
public static @Nullable java.lang.foreign.MemoryAddress tryMalloc0N(long nBlocks, long nBlockBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_try_malloc0_n.invokeExact(
                nBlocks,
                nBlockBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * This function is similar to g_try_malloc(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
 * but care is taken to detect possible overflow during multiplication.
 * @param nBlocks the number of blocks to allocate
 * @param nBlockBytes the size of each block in bytes
 * @return the allocated memory, or {@code null}.
 */
public static @Nullable java.lang.foreign.MemoryAddress tryMallocN(long nBlocks, long nBlockBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_try_malloc_n.invokeExact(
                nBlocks,
                nBlockBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Attempts to realloc {@code mem} to a new size, {@code n_bytes}, and returns {@code null}
 * on failure. Contrast with g_realloc(), which aborts the program
 * on failure.
 * <p>
 * If {@code mem} is {@code null}, behaves the same as g_try_malloc().
 * @param mem previously-allocated memory, or {@code null}.
 * @param nBytes number of bytes to allocate.
 * @return the allocated memory, or {@code null}.
 */
public static @Nullable java.lang.foreign.MemoryAddress tryRealloc(@Nullable java.lang.foreign.MemoryAddress mem, long nBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_try_realloc.invokeExact(
                (Addressable) (mem == null ? MemoryAddress.NULL : (Addressable) mem),
                nBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * This function is similar to g_try_realloc(), allocating ({@code n_blocks} * {@code n_block_bytes}) bytes,
 * but care is taken to detect possible overflow during multiplication.
 * @param mem previously-allocated memory, or {@code null}.
 * @param nBlocks the number of blocks to allocate
 * @param nBlockBytes the size of each block in bytes
 * @return the allocated memory, or {@code null}.
 */
public static @Nullable java.lang.foreign.MemoryAddress tryReallocN(@Nullable java.lang.foreign.MemoryAddress mem, long nBlocks, long nBlockBytes) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_try_realloc_n.invokeExact(
                (Addressable) (mem == null ? MemoryAddress.NULL : (Addressable) mem),
                nBlocks,
                nBlockBytes);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Convert a string from UCS-4 to UTF-16. A 0 character will be
 * added to the result after the converted text.
 * @param str a UCS-4 encoded string
 * @param len the maximum length (number of characters) of {@code str} to use.
 *     If {@code len} &lt; 0, then the string is nul-terminated.
 * @param itemsRead location to store number of
 *     bytes read, or {@code null}. If an error occurs then the index of the invalid
 *     input is stored here.
 * @param itemsWritten location to store number
 *     of {@code gunichar2}  written, or {@code null}. The value stored here does not include
 *     the trailing 0.
 * @return a pointer to a newly allocated UTF-16 string.
 *     This value must be freed with g_free(). If an error occurs,
 *     {@code null} will be returned and {@code error} set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static PointerShort ucs4ToUtf16(PointerInteger str, long len, Out<Long> itemsRead, Out<Long> itemsWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment itemsReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment itemsWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ucs4_to_utf16.invokeExact(
                    str.handle(),
                    len,
                    (Addressable) (itemsRead == null ? MemoryAddress.NULL : (Addressable) itemsReadPOINTER.address()),
                    (Addressable) (itemsWritten == null ? MemoryAddress.NULL : (Addressable) itemsWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (itemsRead != null) itemsRead.set(itemsReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (itemsWritten != null) itemsWritten.set(itemsWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new PointerShort(RESULT);
    }
}

/**
 * Convert a string from a 32-bit fixed width representation as UCS-4.
 * to UTF-8. The result will be terminated with a 0 byte.
 * @param str a UCS-4 encoded string
 * @param len the maximum length (number of characters) of {@code str} to use.
 *     If {@code len} &lt; 0, then the string is nul-terminated.
 * @param itemsRead location to store number of
 *     characters read, or {@code null}.
 * @param itemsWritten location to store number
 *     of bytes written or {@code null}. The value here stored does not include the
 *     trailing 0 byte.
 * @return a pointer to a newly allocated UTF-8 string.
 *     This value must be freed with g_free(). If an error occurs,
 *     {@code null} will be returned and {@code error} set. In that case, {@code items_read}
 *     will be set to the position of the first invalid input character.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String ucs4ToUtf8(PointerInteger str, long len, Out<Long> itemsRead, Out<Long> itemsWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment itemsReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment itemsWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_ucs4_to_utf8.invokeExact(
                    str.handle(),
                    len,
                    (Addressable) (itemsRead == null ? MemoryAddress.NULL : (Addressable) itemsReadPOINTER.address()),
                    (Addressable) (itemsWritten == null ? MemoryAddress.NULL : (Addressable) itemsWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (itemsRead != null) itemsRead.set(itemsReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (itemsWritten != null) itemsWritten.set(itemsWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Determines the break type of {@code c}. {@code c} should be a Unicode character
 * (to derive a character from UTF-8 encoded text, use
 * g_utf8_get_char()). The break type is used to find word and line
 * breaks ("text boundaries"), Pango implements the Unicode boundary
 * resolution algorithms and normally you would use a function such
 * as pango_break() instead of caring about break types yourself.
 * @param c a Unicode character
 * @return the break type of {@code c}
 */
public static org.gtk.glib.UnicodeBreakType unicharBreakType(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_break_type.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.UnicodeBreakType.of(RESULT);
}

/**
 * Determines the canonical combining class of a Unicode character.
 * @param uc a Unicode character
 * @return the combining class of the character
 */
public static int unicharCombiningClass(int uc) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_combining_class.invokeExact(uc);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Performs a single composition step of the
 * Unicode canonical composition algorithm.
 * <p>
 * This function includes algorithmic Hangul Jamo composition,
 * but it is not exactly the inverse of g_unichar_decompose().
 * No composition can have either of {@code a} or {@code b} equal to zero.
 * To be precise, this function composes if and only if
 * there exists a Primary Composite P which is canonically
 * equivalent to the sequence &lt;{@code a},{@code b}&gt;.  See the Unicode
 * Standard for the definition of Primary Composite.
 * <p>
 * If {@code a} and {@code b} do not compose a new character, {@code ch} is set to zero.
 * <p>
 * See
 * <a href="http://unicode.org/reports/tr15/">UAX#15</a>
 * for details.
 * @param a a Unicode character
 * @param b a Unicode character
 * @param ch return location for the composed character
 * @return {@code true} if the characters could be composed
 */
public static boolean unicharCompose(int a, int b, Out<Integer> ch) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment chPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unichar_compose.invokeExact(
                    a,
                    b,
                    (Addressable) chPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                ch.set(chPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Performs a single decomposition step of the
 * Unicode canonical decomposition algorithm.
 * <p>
 * This function does not include compatibility
 * decompositions. It does, however, include algorithmic
 * Hangul Jamo decomposition, as well as 'singleton'
 * decompositions which replace a character by a single
 * other character. In the case of singletons *{@code b} will
 * be set to zero.
 * <p>
 * If {@code ch} is not decomposable, *{@code a} is set to {@code ch} and *{@code b}
 * is set to zero.
 * <p>
 * Note that the way Unicode decomposition pairs are
 * defined, it is guaranteed that {@code b} would not decompose
 * further, but {@code a} may itself decompose.  To get the full
 * canonical decomposition for {@code ch}, one would need to
 * recursively call this function on {@code a}.  Or use
 * g_unichar_fully_decompose().
 * <p>
 * See
 * <a href="http://unicode.org/reports/tr15/">UAX#15</a>
 * for details.
 * @param ch a Unicode character
 * @param a return location for the first component of {@code ch}
 * @param b return location for the second component of {@code ch}
 * @return {@code true} if the character could be decomposed
 */
public static boolean unicharDecompose(int ch, Out<Integer> a, Out<Integer> b) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment aPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment bPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unichar_decompose.invokeExact(
                    ch,
                    (Addressable) aPOINTER.address(),
                    (Addressable) bPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                a.set(aPOINTER.get(Interop.valueLayout.C_INT, 0));
                b.set(bPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Determines the numeric value of a character as a decimal
 * digit.
 * @param c a Unicode character
 * @return If {@code c} is a decimal digit (according to
 * g_unichar_isdigit()), its numeric value. Otherwise, -1.
 */
public static int unicharDigitValue(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_digit_value.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * @param ch a Unicode character.
 * @param compat whether perform canonical or compatibility decomposition
 * @param result location to store decomposed result, or {@code null}
 * @param resultLen length of {@code result}
 * @return the length of the full decomposition.
 */
public static long unicharFullyDecompose(int ch, boolean compat, Out<Integer> result, long resultLen) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment resultPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_unichar_fully_decompose.invokeExact(
                    ch,
                    Marshal.booleanToInteger.marshal(compat, null).intValue(),
                    (Addressable) (result == null ? MemoryAddress.NULL : (Addressable) resultPOINTER.address()),
                    resultLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (result != null) result.set(resultPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT;
    }
}

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
 * @param ch a Unicode character
 * @param mirroredCh location to store the mirrored character
 * @return {@code true} if {@code ch} has a mirrored character, {@code false} otherwise
 */
public static boolean unicharGetMirrorChar(int ch, PointerInteger mirroredCh) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_get_mirror_char.invokeExact(
                ch,
                mirroredCh.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Looks up the {@link UnicodeScript} for a particular character (as defined
 * by Unicode Standard Annex \\{@code 24}). No check is made for {@code ch} being a
 * valid Unicode character; if you pass in invalid character, the
 * result is undefined.
 * <p>
 * This function is equivalent to pango_script_for_unichar() and the
 * two are interchangeable.
 * @param ch a Unicode character
 * @return the {@link UnicodeScript} for the character.
 */
public static org.gtk.glib.UnicodeScript unicharGetScript(int ch) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_get_script.invokeExact(ch);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.UnicodeScript.of(RESULT);
}

/**
 * Determines whether a character is alphanumeric.
 * Given some UTF-8 text, obtain a character value
 * with g_utf8_get_char().
 * @param c a Unicode character
 * @return {@code true} if {@code c} is an alphanumeric character
 */
public static boolean unicharIsalnum(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_isalnum.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines whether a character is alphabetic (i.e. a letter).
 * Given some UTF-8 text, obtain a character value with
 * g_utf8_get_char().
 * @param c a Unicode character
 * @return {@code true} if {@code c} is an alphabetic character
 */
public static boolean unicharIsalpha(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_isalpha.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines whether a character is a control character.
 * Given some UTF-8 text, obtain a character value with
 * g_utf8_get_char().
 * @param c a Unicode character
 * @return {@code true} if {@code c} is a control character
 */
public static boolean unicharIscntrl(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_iscntrl.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines if a given character is assigned in the Unicode
 * standard.
 * @param c a Unicode character
 * @return {@code true} if the character has an assigned value
 */
public static boolean unicharIsdefined(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_isdefined.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines whether a character is numeric (i.e. a digit).  This
 * covers ASCII 0-9 and also digits in other languages/scripts.  Given
 * some UTF-8 text, obtain a character value with g_utf8_get_char().
 * @param c a Unicode character
 * @return {@code true} if {@code c} is a digit
 */
public static boolean unicharIsdigit(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_isdigit.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines whether a character is printable and not a space
 * (returns {@code false} for control characters, format characters, and
 * spaces). g_unichar_isprint() is similar, but returns {@code true} for
 * spaces. Given some UTF-8 text, obtain a character value with
 * g_utf8_get_char().
 * @param c a Unicode character
 * @return {@code true} if {@code c} is printable unless it's a space
 */
public static boolean unicharIsgraph(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_isgraph.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines whether a character is a lowercase letter.
 * Given some UTF-8 text, obtain a character value with
 * g_utf8_get_char().
 * @param c a Unicode character
 * @return {@code true} if {@code c} is a lowercase letter
 */
public static boolean unicharIslower(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_islower.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

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
 * @param c a Unicode character
 * @return {@code true} if {@code c} is a mark character
 */
public static boolean unicharIsmark(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_ismark.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines whether a character is printable.
 * Unlike g_unichar_isgraph(), returns {@code true} for spaces.
 * Given some UTF-8 text, obtain a character value with
 * g_utf8_get_char().
 * @param c a Unicode character
 * @return {@code true} if {@code c} is printable
 */
public static boolean unicharIsprint(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_isprint.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines whether a character is punctuation or a symbol.
 * Given some UTF-8 text, obtain a character value with
 * g_utf8_get_char().
 * @param c a Unicode character
 * @return {@code true} if {@code c} is a punctuation or symbol character
 */
public static boolean unicharIspunct(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_ispunct.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines whether a character is a space, tab, or line separator
 * (newline, carriage return, etc.).  Given some UTF-8 text, obtain a
 * character value with g_utf8_get_char().
 * <p>
 * (Note: don't use this to do word breaking; you have to use
 * Pango or equivalent to get word breaking right, the algorithm
 * is fairly complex.)
 * @param c a Unicode character
 * @return {@code true} if {@code c} is a space character
 */
public static boolean unicharIsspace(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_isspace.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines if a character is titlecase. Some characters in
 * Unicode which are composites, such as the DZ digraph
 * have three case variants instead of just two. The titlecase
 * form is used at the beginning of a word where only the
 * first letter is capitalized. The titlecase form of the DZ
 * digraph is U+01F2 LATIN CAPITAL LETTTER D WITH SMALL LETTER Z.
 * @param c a Unicode character
 * @return {@code true} if the character is titlecase
 */
public static boolean unicharIstitle(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_istitle.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines if a character is uppercase.
 * @param c a Unicode character
 * @return {@code true} if {@code c} is an uppercase character
 */
public static boolean unicharIsupper(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_isupper.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines if a character is typically rendered in a double-width
 * cell.
 * @param c a Unicode character
 * @return {@code true} if the character is wide
 */
public static boolean unicharIswide(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_iswide.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

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
 * @param c a Unicode character
 * @return {@code true} if the character is wide in legacy East Asian locales
 */
public static boolean unicharIswideCjk(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_iswide_cjk.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines if a character is a hexadecimal digit.
 * @param c a Unicode character.
 * @return {@code true} if the character is a hexadecimal digit
 */
public static boolean unicharIsxdigit(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_isxdigit.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

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
 * @param c a Unicode character
 * @return {@code true} if the character has zero width
 */
public static boolean unicharIszerowidth(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_iszerowidth.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Converts a single character to UTF-8.
 * @param c a Unicode character code
 * @param outbuf output buffer, must have at
 *       least 6 bytes of space. If {@code null}, the length will be computed and
 *       returned and nothing will be written to {@code outbuf}.
 * @return number of bytes written
 */
public static int unicharToUtf8(int c, @Nullable Out<java.lang.String> outbuf) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment outbufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unichar_to_utf8.invokeExact(
                    c,
                    (Addressable) (outbuf == null ? MemoryAddress.NULL : (Addressable) outbufPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (outbuf != null) outbuf.set(Marshal.addressToString.marshal(outbufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return RESULT;
    }
}

/**
 * Converts a character to lower case.
 * @param c a Unicode character.
 * @return the result of converting {@code c} to lower case.
 *               If {@code c} is not an upperlower or titlecase character,
 *               or has no lowercase equivalent {@code c} is returned unchanged.
 */
public static int unicharTolower(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_tolower.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Converts a character to the titlecase.
 * @param c a Unicode character
 * @return the result of converting {@code c} to titlecase.
 *               If {@code c} is not an uppercase or lowercase character,
 *               {@code c} is returned unchanged.
 */
public static int unicharTotitle(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_totitle.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Converts a character to uppercase.
 * @param c a Unicode character
 * @return the result of converting {@code c} to uppercase.
 *               If {@code c} is not a lowercase or titlecase character,
 *               or has no upper case equivalent {@code c} is returned unchanged.
 */
public static int unicharToupper(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_toupper.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Classifies a Unicode character by type.
 * @param c a Unicode character
 * @return the type of the character.
 */
public static org.gtk.glib.UnicodeType unicharType(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_type.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.UnicodeType.of(RESULT);
}

/**
 * Checks whether {@code ch} is a valid Unicode character. Some possible
 * integer values of {@code ch} will not be valid. 0 is considered a valid
 * character, though it's normally a string terminator.
 * @param ch a Unicode character
 * @return {@code true} if {@code ch} is a valid Unicode character
 */
public static boolean unicharValidate(int ch) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_validate.invokeExact(ch);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Determines the numeric value of a character as a hexadecimal
 * digit.
 * @param c a Unicode character
 * @return If {@code c} is a hex digit (according to
 * g_unichar_isxdigit()), its numeric value. Otherwise, -1.
 */
public static int unicharXdigitValue(int c) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unichar_xdigit_value.invokeExact(c);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Computes the canonical decomposition of a Unicode character.
 * @param ch a Unicode character.
 * @param resultLen location to store the length of the return value.
 * @return a newly allocated string of Unicode characters.
 *   {@code result_len} is set to the resulting length of the string.
 * @deprecated Use the more flexible g_unichar_fully_decompose()
 *   instead.
 */
@Deprecated
public static PointerInteger unicodeCanonicalDecomposition(int ch, PointerLong resultLen) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_unicode_canonical_decomposition.invokeExact(
                ch,
                resultLen.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new PointerInteger(RESULT);
}

/**
 * Computes the canonical ordering of a string in-place.
 * This rearranges decomposed characters in the string
 * according to their combining classes.  See the Unicode
 * manual for more information.
 * @param string a UCS-4 encoded string.
 * @param len the maximum length of {@code string} to use.
 */
public static void unicodeCanonicalOrdering(PointerInteger string, long len) {
    try {
        DowncallHandles.g_unicode_canonical_ordering.invokeExact(
                string.handle(),
                len);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

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
 * @param iso15924 a Unicode script
 * @return the Unicode script for {@code iso15924}, or
 *   of {@link UnicodeScript#INVALID_CODE} if {@code iso15924} is zero and
 *   {@link UnicodeScript#UNKNOWN} if {@code iso15924} is unknown.
 */
public static org.gtk.glib.UnicodeScript unicodeScriptFromIso15924(int iso15924) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unicode_script_from_iso15924.invokeExact(iso15924);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gtk.glib.UnicodeScript.of(RESULT);
}

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
 * @param script a Unicode script
 * @return the ISO 15924 code for {@code script}, encoded as an integer,
 *   of zero if {@code script} is {@link UnicodeScript#INVALID_CODE} or
 *   ISO 15924 code 'Zzzz' (script code for UNKNOWN) if {@code script} is not understood.
 */
public static int unicodeScriptToIso15924(org.gtk.glib.UnicodeScript script) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unicode_script_to_iso15924.invokeExact(script.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

public static org.gtk.glib.Quark unixErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unix_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

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
 * @param fd a file descriptor
 * @param condition IO conditions to watch for on {@code fd}
 * @param function a {@link UnixFDSourceFunc}
 * @return the ID (greater than 0) of the event source
 */
public static int unixFdAdd(int fd, org.gtk.glib.IOCondition condition, org.gtk.glib.UnixFDSourceFunc function) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unix_fd_add.invokeExact(
                fd,
                condition.getValue(),
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Sets a function to be called when the IO condition, as specified by
 * {@code condition} becomes true for {@code fd}.
 * <p>
 * This is the same as g_unix_fd_add(), except that it allows you to
 * specify a non-default priority and a provide a {@link DestroyNotify} for
 * {@code user_data}.
 * @param priority the priority of the source
 * @param fd a file descriptor
 * @param condition IO conditions to watch for on {@code fd}
 * @param function a {@link UnixFDSourceFunc}
 * @param notify function to call when the idle is removed, or {@code null}
 * @return the ID (greater than 0) of the event source
 */
public static int unixFdAddFull(int priority, int fd, org.gtk.glib.IOCondition condition, org.gtk.glib.UnixFDSourceFunc function, org.gtk.glib.DestroyNotify notify) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unix_fd_add_full.invokeExact(
                priority,
                fd,
                condition.getValue(),
                (Addressable) function.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) notify.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Creates a {@link Source} to watch for a particular IO condition on a file
 * descriptor.
 * <p>
 * The source will never close the fd -- you must do it yourself.
 * @param fd a file descriptor
 * @param condition IO conditions to watch for on {@code fd}
 * @return the newly created {@link Source}
 */
public static org.gtk.glib.Source unixFdSourceNew(int fd, org.gtk.glib.IOCondition condition) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_source_new.invokeExact(
                fd,
                condition.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Get the {@code passwd} file entry for the given {@code user_name} using {@code getpwnam_r()}.
 * This can fail if the given {@code user_name} doesn???t exist.
 * <p>
 * The returned {@code struct passwd} has been allocated using g_malloc() and should
 * be freed using g_free(). The strings referenced by the returned struct are
 * included in the same allocation, so are valid until the {@code struct passwd} is
 * freed.
 * <p>
 * This function is safe to call from multiple threads concurrently.
 * <p>
 * You will need to include {@code pwd.h} to get the definition of {@code struct passwd}.
 * @param userName the username to get the passwd file entry for
 * @return passwd entry, or {@code null} on error; free the returned
 *    value with g_free()
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static @Nullable java.lang.foreign.MemoryAddress unixGetPasswdEntry(java.lang.String userName) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_get_passwd_entry.invokeExact(Marshal.stringToAddress.marshal(userName, SCOPE),(Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
}

/**
 * Similar to the UNIX pipe() call, but on modern systems like Linux
 * uses the pipe2() system call, which atomically creates a pipe with
 * the configured flags. The only supported flag currently is
 * {@code FD_CLOEXEC}. If for example you want to configure {@code O_NONBLOCK}, that
 * must still be done separately with fcntl().
 * <p>
 * This function does not take {@code O_CLOEXEC}, it takes {@code FD_CLOEXEC} as if
 * for fcntl(); these are different on Linux/glibc.
 * @param fds Array of two integers
 * @param flags Bitfield of file descriptor flags, as for fcntl()
 * @return {@code true} on success, {@code false} if not (and errno will be set).
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean unixOpenPipe(int[] fds, int flags) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_open_pipe.invokeExact(
                    Interop.allocateNativeArray(fds, false, SCOPE),
                    flags,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Control the non-blocking state of the given file descriptor,
 * according to {@code nonblock}. On most systems this uses {@code O_NONBLOCK}, but
 * on some older ones may use {@code O_NDELAY}.
 * @param fd A file descriptor
 * @param nonblock If {@code true}, set the descriptor to be non-blocking
 * @return {@code true} if successful
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean unixSetFdNonblocking(int fd, boolean nonblock) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_set_fd_nonblocking.invokeExact(
                    fd,
                    Marshal.booleanToInteger.marshal(nonblock, null).intValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * A convenience function for g_unix_signal_source_new(), which
 * attaches to the default {@link MainContext}.  You can remove the watch
 * using g_source_remove().
 * @param signum Signal number
 * @param handler Callback
 * @return An ID (greater than 0) for the event source
 */
public static int unixSignalAdd(int signum, org.gtk.glib.SourceFunc handler) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unix_signal_add.invokeExact(
                signum,
                (Addressable) handler.toCallback(),
                (Addressable) MemoryAddress.NULL);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * A convenience function for g_unix_signal_source_new(), which
 * attaches to the default {@link MainContext}.  You can remove the watch
 * using g_source_remove().
 * @param priority the priority of the signal source. Typically this will be in
 *            the range between {@code G_PRIORITY_DEFAULT} and {@code G_PRIORITY_HIGH}.
 * @param signum Signal number
 * @param handler Callback
 * @param notify {@link DestroyNotify} for {@code handler}
 * @return An ID (greater than 0) for the event source
 */
public static int unixSignalAddFull(int priority, int signum, org.gtk.glib.SourceFunc handler, org.gtk.glib.DestroyNotify notify) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_unix_signal_add_full.invokeExact(
                priority,
                signum,
                (Addressable) handler.toCallback(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) notify.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

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
 * g_main_loop_quit().  It is not safe to do any of this from a regular
 * UNIX signal handler; such a handler may be invoked while malloc() or
 * another library function is running, causing reentrancy issues if the
 * handler attempts to use those functions.  None of the GLib/GObject
 * API is safe against this kind of reentrancy.
 * <p>
 * The interaction of this source when combined with native UNIX
 * functions like sigprocmask() is not defined.
 * <p>
 * The source will not initially be associated with any {@link MainContext}
 * and must be added to one with g_source_attach() before it will be
 * executed.
 * @param signum A signal number
 * @return A newly created {@link Source}
 */
public static org.gtk.glib.Source unixSignalSourceNew(int signum) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_unix_signal_source_new.invokeExact(signum);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * A wrapper for the POSIX unlink() function. The unlink() function
 * deletes a name from the filesystem. If this was the last link to the
 * file and no processes have it opened, the diskspace occupied by the
 * file is freed.
 * <p>
 * See your C library manual for more details about unlink(). Note
 * that on Windows, it is in general not possible to delete files that
 * are open to some process, or mapped into memory.
 * @param filename a pathname in the GLib file name encoding
 *     (UTF-8 on Windows)
 * @return 0 if the name was successfully deleted, -1 if an error
 *    occurred
 */
public static int unlink(java.lang.String filename) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unlink.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * @param variable the environment variable to remove, must
 *     not contain '='
 */
public static void unsetenv(java.lang.String variable) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_unsetenv.invokeExact(Marshal.stringToAddress.marshal(variable, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Creates a new {@link Uri} from the given components according to {@code flags}.
 * <p>
 * See also g_uri_build_with_user(), which allows specifying the
 * components of the "userinfo" separately.
 * @param flags flags describing how to build the {@link Uri}
 * @param scheme the URI scheme
 * @param userinfo the userinfo component, or {@code null}
 * @param host the host component, or {@code null}
 * @param port the port, or {@code -1}
 * @param path the path component
 * @param query the query component, or {@code null}
 * @param fragment the fragment, or {@code null}
 * @return a new {@link Uri}
 */
public static org.gtk.glib.Uri uriBuild(org.gtk.glib.UriFlags flags, java.lang.String scheme, @Nullable java.lang.String userinfo, @Nullable java.lang.String host, int port, java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_build.invokeExact(
                    flags.getValue(),
                    Marshal.stringToAddress.marshal(scheme, SCOPE),
                    (Addressable) (userinfo == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(userinfo, SCOPE)),
                    (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, SCOPE)),
                    port,
                    Marshal.stringToAddress.marshal(path, SCOPE),
                    (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, SCOPE)),
                    (Addressable) (fragment == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fragment, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Uri.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Creates a new {@link Uri} from the given components according to {@code flags}
 * ({@link UriFlags#HAS_PASSWORD} is added unconditionally). The {@code flags} must be
 * coherent with the passed values, in particular use {@code %}-encoded values with
 * {@link UriFlags#ENCODED}.
 * <p>
 * In contrast to g_uri_build(), this allows specifying the components
 * of the ???userinfo??? field separately. Note that {@code user} must be non-{@code null}
 * if either {@code password} or {@code auth_params} is non-{@code null}.
 * @param flags flags describing how to build the {@link Uri}
 * @param scheme the URI scheme
 * @param user the user component of the userinfo, or {@code null}
 * @param password the password component of the userinfo, or {@code null}
 * @param authParams the auth params of the userinfo, or {@code null}
 * @param host the host component, or {@code null}
 * @param port the port, or {@code -1}
 * @param path the path component
 * @param query the query component, or {@code null}
 * @param fragment the fragment, or {@code null}
 * @return a new {@link Uri}
 */
public static org.gtk.glib.Uri uriBuildWithUser(org.gtk.glib.UriFlags flags, java.lang.String scheme, @Nullable java.lang.String user, @Nullable java.lang.String password, @Nullable java.lang.String authParams, @Nullable java.lang.String host, int port, java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_build_with_user.invokeExact(
                    flags.getValue(),
                    Marshal.stringToAddress.marshal(scheme, SCOPE),
                    (Addressable) (user == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(user, SCOPE)),
                    (Addressable) (password == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(password, SCOPE)),
                    (Addressable) (authParams == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(authParams, SCOPE)),
                    (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, SCOPE)),
                    port,
                    Marshal.stringToAddress.marshal(path, SCOPE),
                    (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, SCOPE)),
                    (Addressable) (fragment == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fragment, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Uri.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

public static org.gtk.glib.Quark uriErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_uri_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Escapes arbitrary data for use in a URI.
 * <p>
 * Normally all characters that are not ???unreserved??? (i.e. ASCII
 * alphanumerical characters plus dash, dot, underscore and tilde) are
 * escaped. But if you specify characters in {@code reserved_chars_allowed}
 * they are not escaped. This is useful for the ???reserved??? characters
 * in the URI specification, since those are allowed unescaped in some
 * portions of a URI.
 * <p>
 * Though technically incorrect, this will also allow escaping nul
 * bytes as {@code %}{@code 00}.
 * @param unescaped the unescaped input data.
 * @param length the length of {@code unescaped}
 * @param reservedCharsAllowed a string of reserved
 *   characters that are allowed to be used, or {@code null}.
 * @return an escaped version of {@code unescaped}.
 *     The returned string should be freed when no longer needed.
 */
public static java.lang.String uriEscapeBytes(byte[] unescaped, long length, @Nullable java.lang.String reservedCharsAllowed) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_escape_bytes.invokeExact(
                    Interop.allocateNativeArray(unescaped, false, SCOPE),
                    length,
                    (Addressable) (reservedCharsAllowed == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(reservedCharsAllowed, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Escapes a string for use in a URI.
 * <p>
 * Normally all characters that are not "unreserved" (i.e. ASCII
 * alphanumerical characters plus dash, dot, underscore and tilde) are
 * escaped. But if you specify characters in {@code reserved_chars_allowed}
 * they are not escaped. This is useful for the "reserved" characters
 * in the URI specification, since those are allowed unescaped in some
 * portions of a URI.
 * @param unescaped the unescaped input string.
 * @param reservedCharsAllowed a string of reserved
 *   characters that are allowed to be used, or {@code null}.
 * @param allowUtf8 {@code true} if the result can include UTF-8 characters.
 * @return an escaped version of {@code unescaped}. The
 * returned string should be freed when no longer needed.
 */
public static java.lang.String uriEscapeString(java.lang.String unescaped, @Nullable java.lang.String reservedCharsAllowed, boolean allowUtf8) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_escape_string.invokeExact(
                    Marshal.stringToAddress.marshal(unescaped, SCOPE),
                    (Addressable) (reservedCharsAllowed == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(reservedCharsAllowed, SCOPE)),
                    Marshal.booleanToInteger.marshal(allowUtf8, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Parses {@code uri_string} according to {@code flags}, to determine whether it is a valid
 * [absolute URI][relative-absolute-uris], i.e. it does not need to be resolved
 * relative to another URI using g_uri_parse_relative().
 * <p>
 * If it???s not a valid URI, an error is returned explaining how it???s invalid.
 * <p>
 * See g_uri_split(), and the definition of {@link UriFlags}, for more
 * information on the effect of {@code flags}.
 * @param uriString a string containing an absolute URI
 * @param flags flags for parsing {@code uri_string}
 * @return {@code true} if {@code uri_string} is a valid absolute URI, {@code false} on error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean uriIsValid(java.lang.String uriString, org.gtk.glib.UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_uri_is_valid.invokeExact(
                    Marshal.stringToAddress.marshal(uriString, SCOPE),
                    flags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * components of the ???userinfo??? separately.
 * <p>
 * {@link UriFlags#HAS_PASSWORD} and {@link UriFlags#HAS_AUTH_PARAMS} are ignored if set
 * in {@code flags}.
 * @param flags flags describing how to build the URI string
 * @param scheme the URI scheme, or {@code null}
 * @param userinfo the userinfo component, or {@code null}
 * @param host the host component, or {@code null}
 * @param port the port, or {@code -1}
 * @param path the path component
 * @param query the query component, or {@code null}
 * @param fragment the fragment, or {@code null}
 * @return an absolute URI string
 */
public static java.lang.String uriJoin(org.gtk.glib.UriFlags flags, @Nullable java.lang.String scheme, @Nullable java.lang.String userinfo, @Nullable java.lang.String host, int port, java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_join.invokeExact(
                    flags.getValue(),
                    (Addressable) (scheme == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(scheme, SCOPE)),
                    (Addressable) (userinfo == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(userinfo, SCOPE)),
                    (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, SCOPE)),
                    port,
                    Marshal.stringToAddress.marshal(path, SCOPE),
                    (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, SCOPE)),
                    (Addressable) (fragment == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fragment, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Joins the given components together according to {@code flags} to create
 * an absolute URI string. {@code path} may not be {@code null} (though it may be the empty
 * string).
 * <p>
 * In contrast to g_uri_join(), this allows specifying the components
 * of the ???userinfo??? separately. It otherwise behaves the same.
 * <p>
 * {@link UriFlags#HAS_PASSWORD} and {@link UriFlags#HAS_AUTH_PARAMS} are ignored if set
 * in {@code flags}.
 * @param flags flags describing how to build the URI string
 * @param scheme the URI scheme, or {@code null}
 * @param user the user component of the userinfo, or {@code null}
 * @param password the password component of the userinfo, or
 *   {@code null}
 * @param authParams the auth params of the userinfo, or
 *   {@code null}
 * @param host the host component, or {@code null}
 * @param port the port, or {@code -1}
 * @param path the path component
 * @param query the query component, or {@code null}
 * @param fragment the fragment, or {@code null}
 * @return an absolute URI string
 */
public static java.lang.String uriJoinWithUser(org.gtk.glib.UriFlags flags, @Nullable java.lang.String scheme, @Nullable java.lang.String user, @Nullable java.lang.String password, @Nullable java.lang.String authParams, @Nullable java.lang.String host, int port, java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_join_with_user.invokeExact(
                    flags.getValue(),
                    (Addressable) (scheme == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(scheme, SCOPE)),
                    (Addressable) (user == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(user, SCOPE)),
                    (Addressable) (password == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(password, SCOPE)),
                    (Addressable) (authParams == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(authParams, SCOPE)),
                    (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, SCOPE)),
                    port,
                    Marshal.stringToAddress.marshal(path, SCOPE),
                    (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, SCOPE)),
                    (Addressable) (fragment == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fragment, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Splits an URI list conforming to the text/uri-list
 * mime type defined in RFC 2483 into individual URIs,
 * discarding any comments. The URIs are not validated.
 * @param uriList an URI list
 * @return a newly allocated {@code null}-terminated list
 *   of strings holding the individual URIs. The array should be freed
 *   with g_strfreev().
 */
public static PointerString uriListExtractUris(java.lang.String uriList) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_list_extract_uris.invokeExact(Marshal.stringToAddress.marshal(uriList, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
}

/**
 * Parses {@code uri_string} according to {@code flags}. If the result is not a
 * valid [absolute URI][relative-absolute-uris], it will be discarded, and an
 * error returned.
 * @param uriString a string representing an absolute URI
 * @param flags flags describing how to parse {@code uri_string}
 * @return a new {@link Uri}, or NULL on error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gtk.glib.Uri uriParse(java.lang.String uriString, org.gtk.glib.UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_parse.invokeExact(
                    Marshal.stringToAddress.marshal(uriString, SCOPE),
                    flags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        var OBJECT = org.gtk.glib.Uri.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

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
 * return a single attribute???value pair, {@code Attr=456}. Case will be preserved in
 * the returned attributes.
 * <p>
 * If {@code params} cannot be parsed (for example, it contains two {@code separators}
 * characters in a row), then {@code error} is set and {@code null} is returned.
 * @param params a {@code %}-encoded string containing {@code attribute=value}
 *   parameters
 * @param length the length of {@code params}, or {@code -1} if it is nul-terminated
 * @param separators the separator byte character set between parameters. (usually
 *   {@code &}, but sometimes {@code ;} or both {@code &;}). Note that this function works on
 *   bytes not characters, so it can't be used to delimit UTF-8 strings for
 *   anything but ASCII characters. You may pass an empty set, in which case
 *   no splitting will occur.
 * @param flags flags to modify the way the parameters are handled.
 * @return A hash table of attribute/value pairs, with both names and values
 *     fully-decoded; or {@code null} on error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gtk.glib.HashTable uriParseParams(java.lang.String params, long length, java.lang.String separators, org.gtk.glib.UriParamsFlags flags) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_parse_params.invokeExact(
                    Marshal.stringToAddress.marshal(params, SCOPE),
                    length,
                    Marshal.stringToAddress.marshal(separators, SCOPE),
                    flags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        var OBJECT = org.gtk.glib.HashTable.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Gets the scheme portion of a URI string.
 * <a href="https://tools.ietf.org/html/rfc3986#section-3">RFC 3986</a> decodes the scheme
 * as:
 * <pre>{@code 
 * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
 * }</pre>
 * Common schemes include {@code file}, {@code https}, {@code svn+ssh}, etc.
 * @param uri a valid URI.
 * @return The ???scheme??? component of the URI, or
 *     {@code null} on error. The returned string should be freed when no longer needed.
 */
public static @Nullable java.lang.String uriParseScheme(java.lang.String uri) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_parse_scheme.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param uri a valid URI.
 * @return The ???scheme??? component of the URI, or
 *     {@code null} on error. The returned string is normalized to all-lowercase, and
 *     interned via g_intern_string(), so it does not need to be freed.
 */
public static @Nullable java.lang.String uriPeekScheme(java.lang.String uri) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_peek_scheme.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Parses {@code uri_ref} according to {@code flags} and, if it is a
 * [relative URI][relative-absolute-uris], resolves it relative to
 * {@code base_uri_string}. If the result is not a valid absolute URI, it will be
 * discarded, and an error returned.
 * <p>
 * (If {@code base_uri_string} is {@code null}, this just returns {@code uri_ref}, or
 * {@code null} if {@code uri_ref} is invalid or not absolute.)
 * @param baseUriString a string representing a base URI
 * @param uriRef a string representing a relative or absolute URI
 * @param flags flags describing how to parse {@code uri_ref}
 * @return the resolved URI string,
 * or NULL on error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String uriResolveRelative(@Nullable java.lang.String baseUriString, java.lang.String uriRef, org.gtk.glib.UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_resolve_relative.invokeExact(
                    (Addressable) (baseUriString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(baseUriString, SCOPE)),
                    Marshal.stringToAddress.marshal(uriRef, SCOPE),
                    flags.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param uriRef a string containing a relative or absolute URI
 * @param flags flags for parsing {@code uri_ref}
 * @param scheme on return, contains
 *    the scheme (converted to lowercase), or {@code null}
 * @param userinfo on return, contains
 *    the userinfo, or {@code null}
 * @param host on return, contains the
 *    host, or {@code null}
 * @param port on return, contains the
 *    port, or {@code -1}
 * @param path on return, contains the
 *    path
 * @param query on return, contains the
 *    query, or {@code null}
 * @param fragment on return, contains
 *    the fragment, or {@code null}
 * @return {@code true} if {@code uri_ref} parsed successfully, {@code false}
 *   on error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean uriSplit(java.lang.String uriRef, org.gtk.glib.UriFlags flags, @Nullable Out<java.lang.String> scheme, @Nullable Out<java.lang.String> userinfo, @Nullable Out<java.lang.String> host, Out<Integer> port, @Nullable Out<java.lang.String> path, @Nullable Out<java.lang.String> query, @Nullable Out<java.lang.String> fragment) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment schemePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment userinfoPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment hostPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment portPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment pathPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment queryPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment fragmentPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_uri_split.invokeExact(
                    Marshal.stringToAddress.marshal(uriRef, SCOPE),
                    flags.getValue(),
                    (Addressable) (scheme == null ? MemoryAddress.NULL : (Addressable) schemePOINTER.address()),
                    (Addressable) (userinfo == null ? MemoryAddress.NULL : (Addressable) userinfoPOINTER.address()),
                    (Addressable) (host == null ? MemoryAddress.NULL : (Addressable) hostPOINTER.address()),
                    (Addressable) (port == null ? MemoryAddress.NULL : (Addressable) portPOINTER.address()),
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                    (Addressable) (query == null ? MemoryAddress.NULL : (Addressable) queryPOINTER.address()),
                    (Addressable) (fragment == null ? MemoryAddress.NULL : (Addressable) fragmentPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (scheme != null) scheme.set(Marshal.addressToString.marshal(schemePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (userinfo != null) userinfo.set(Marshal.addressToString.marshal(userinfoPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (host != null) host.set(Marshal.addressToString.marshal(hostPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (port != null) port.set(portPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (path != null) path.set(Marshal.addressToString.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (query != null) query.set(Marshal.addressToString.marshal(queryPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (fragment != null) fragment.set(Marshal.addressToString.marshal(fragmentPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parses {@code uri_string} (which must be an [absolute URI][relative-absolute-uris])
 * according to {@code flags}, and returns the pieces relevant to connecting to a host.
 * See the documentation for g_uri_split() for more details; this is
 * mostly a wrapper around that function with simpler arguments.
 * However, it will return an error if {@code uri_string} is a relative URI,
 * or does not contain a hostname component.
 * @param uriString a string containing an absolute URI
 * @param flags flags for parsing {@code uri_string}
 * @param scheme on return, contains
 *    the scheme (converted to lowercase), or {@code null}
 * @param host on return, contains the
 *    host, or {@code null}
 * @param port on return, contains the
 *    port, or {@code -1}
 * @return {@code true} if {@code uri_string} parsed successfully,
 *   {@code false} on error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean uriSplitNetwork(java.lang.String uriString, org.gtk.glib.UriFlags flags, @Nullable Out<java.lang.String> scheme, @Nullable Out<java.lang.String> host, Out<Integer> port) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment schemePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment hostPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment portPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_uri_split_network.invokeExact(
                    Marshal.stringToAddress.marshal(uriString, SCOPE),
                    flags.getValue(),
                    (Addressable) (scheme == null ? MemoryAddress.NULL : (Addressable) schemePOINTER.address()),
                    (Addressable) (host == null ? MemoryAddress.NULL : (Addressable) hostPOINTER.address()),
                    (Addressable) (port == null ? MemoryAddress.NULL : (Addressable) portPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (scheme != null) scheme.set(Marshal.addressToString.marshal(schemePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (host != null) host.set(Marshal.addressToString.marshal(hostPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (port != null) port.set(portPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param uriRef a string containing a relative or absolute URI
 * @param flags flags for parsing {@code uri_ref}
 * @param scheme on return, contains
 *    the scheme (converted to lowercase), or {@code null}
 * @param user on return, contains
 *    the user, or {@code null}
 * @param password on return, contains
 *    the password, or {@code null}
 * @param authParams on return, contains
 *    the auth_params, or {@code null}
 * @param host on return, contains the
 *    host, or {@code null}
 * @param port on return, contains the
 *    port, or {@code -1}
 * @param path on return, contains the
 *    path
 * @param query on return, contains the
 *    query, or {@code null}
 * @param fragment on return, contains
 *    the fragment, or {@code null}
 * @return {@code true} if {@code uri_ref} parsed successfully, {@code false}
 *   on error.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static boolean uriSplitWithUser(java.lang.String uriRef, org.gtk.glib.UriFlags flags, @Nullable Out<java.lang.String> scheme, @Nullable Out<java.lang.String> user, @Nullable Out<java.lang.String> password, @Nullable Out<java.lang.String> authParams, @Nullable Out<java.lang.String> host, Out<Integer> port, @Nullable Out<java.lang.String> path, @Nullable Out<java.lang.String> query, @Nullable Out<java.lang.String> fragment) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment schemePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment userPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment passwordPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment authParamsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment hostPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment portPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemorySegment pathPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment queryPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment fragmentPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_uri_split_with_user.invokeExact(
                    Marshal.stringToAddress.marshal(uriRef, SCOPE),
                    flags.getValue(),
                    (Addressable) (scheme == null ? MemoryAddress.NULL : (Addressable) schemePOINTER.address()),
                    (Addressable) (user == null ? MemoryAddress.NULL : (Addressable) userPOINTER.address()),
                    (Addressable) (password == null ? MemoryAddress.NULL : (Addressable) passwordPOINTER.address()),
                    (Addressable) (authParams == null ? MemoryAddress.NULL : (Addressable) authParamsPOINTER.address()),
                    (Addressable) (host == null ? MemoryAddress.NULL : (Addressable) hostPOINTER.address()),
                    (Addressable) (port == null ? MemoryAddress.NULL : (Addressable) portPOINTER.address()),
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                    (Addressable) (query == null ? MemoryAddress.NULL : (Addressable) queryPOINTER.address()),
                    (Addressable) (fragment == null ? MemoryAddress.NULL : (Addressable) fragmentPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (scheme != null) scheme.set(Marshal.addressToString.marshal(schemePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (user != null) user.set(Marshal.addressToString.marshal(userPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (password != null) password.set(Marshal.addressToString.marshal(passwordPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (authParams != null) authParams.set(Marshal.addressToString.marshal(authParamsPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (host != null) host.set(Marshal.addressToString.marshal(hostPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (port != null) port.set(portPOINTER.get(Interop.valueLayout.C_INT, 0));
                if (path != null) path.set(Marshal.addressToString.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (query != null) query.set(Marshal.addressToString.marshal(queryPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                if (fragment != null) fragment.set(Marshal.addressToString.marshal(fragmentPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param escapedString A URI-escaped string
 * @param length the length (in bytes) of {@code escaped_string} to escape, or {@code -1} if it
 *   is nul-terminated.
 * @param illegalCharacters a string of illegal characters
 *   not to be allowed, or {@code null}.
 * @return an unescaped version of {@code escaped_string}
 *     or {@code null} on error (if decoding failed, using {@link UriError#FAILED} error
 *     code). The returned {@link Bytes} should be unreffed when no longer needed.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gtk.glib.Bytes uriUnescapeBytes(java.lang.String escapedString, long length, @Nullable java.lang.String illegalCharacters) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_unescape_bytes.invokeExact(
                    Marshal.stringToAddress.marshal(escapedString, SCOPE),
                    length,
                    (Addressable) (illegalCharacters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(illegalCharacters, SCOPE)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

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
 * @param escapedString A string, may be {@code null}
 * @param escapedStringEnd Pointer to end of {@code escaped_string},
 *   may be {@code null}
 * @param illegalCharacters An optional string of illegal
 *   characters not to be allowed, may be {@code null}
 * @return an unescaped version of {@code escaped_string},
 * or {@code null} on error. The returned string should be freed when no longer
 * needed.  As a special case if {@code null} is given for {@code escaped_string}, this
 * function will return {@code null}.
 */
public static @Nullable java.lang.String uriUnescapeSegment(@Nullable java.lang.String escapedString, @Nullable java.lang.String escapedStringEnd, @Nullable java.lang.String illegalCharacters) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_unescape_segment.invokeExact(
                    (Addressable) (escapedString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(escapedString, SCOPE)),
                    (Addressable) (escapedStringEnd == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(escapedStringEnd, SCOPE)),
                    (Addressable) (illegalCharacters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(illegalCharacters, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Unescapes a whole escaped string.
 * <p>
 * If any of the characters in {@code illegal_characters} or the NUL
 * character appears as an escaped character in {@code escaped_string}, then
 * that is an error and {@code null} will be returned. This is useful if you
 * want to avoid for instance having a slash being expanded in an
 * escaped path element, which might confuse pathname handling.
 * @param escapedString an escaped string to be unescaped.
 * @param illegalCharacters a string of illegal characters
 *   not to be allowed, or {@code null}.
 * @return an unescaped version of {@code escaped_string}.
 * The returned string should be freed when no longer needed.
 */
public static @Nullable java.lang.String uriUnescapeString(java.lang.String escapedString, @Nullable java.lang.String illegalCharacters) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_unescape_string.invokeExact(
                    Marshal.stringToAddress.marshal(escapedString, SCOPE),
                    (Addressable) (illegalCharacters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(illegalCharacters, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Pauses the current thread for the given number of microseconds.
 * <p>
 * There are 1 million microseconds per second (represented by the
 * {@code G_USEC_PER_SEC} macro). g_usleep() may have limited precision,
 * depending on hardware and operating system; don't rely on the exact
 * length of the sleep.
 * @param microseconds number of microseconds to pause
 */
public static void usleep(long microseconds) {
    try {
        DowncallHandles.g_usleep.invokeExact(microseconds);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Convert a string from UTF-16 to UCS-4. The result will be
 * nul-terminated.
 * @param str a UTF-16 encoded string
 * @param len the maximum length (number of {@code gunichar2}) of {@code str} to use.
 *     If {@code len} &lt; 0, then the string is nul-terminated.
 * @param itemsRead location to store number of
 *     words read, or {@code null}. If {@code null}, then {@link ConvertError#PARTIAL_INPUT} will
 *     be returned in case {@code str} contains a trailing partial character. If
 *     an error occurs then the index of the invalid input is stored here.
 * @param itemsWritten location to store number
 *     of characters written, or {@code null}. The value stored here does not include
 *     the trailing 0 character.
 * @return a pointer to a newly allocated UCS-4 string.
 *     This value must be freed with g_free(). If an error occurs,
 *     {@code null} will be returned and {@code error} set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static PointerInteger utf16ToUcs4(PointerShort str, long len, Out<Long> itemsRead, Out<Long> itemsWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment itemsReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment itemsWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf16_to_ucs4.invokeExact(
                    str.handle(),
                    len,
                    (Addressable) (itemsRead == null ? MemoryAddress.NULL : (Addressable) itemsReadPOINTER.address()),
                    (Addressable) (itemsWritten == null ? MemoryAddress.NULL : (Addressable) itemsWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (itemsRead != null) itemsRead.set(itemsReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (itemsWritten != null) itemsWritten.set(itemsWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new PointerInteger(RESULT);
    }
}

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
 * @param str a UTF-16 encoded string
 * @param len the maximum length (number of {@code gunichar2}) of {@code str} to use.
 *     If {@code len} &lt; 0, then the string is nul-terminated.
 * @param itemsRead location to store number of
 *     words read, or {@code null}. If {@code null}, then {@link ConvertError#PARTIAL_INPUT} will
 *     be returned in case {@code str} contains a trailing partial character. If
 *     an error occurs then the index of the invalid input is stored here.
 *     It???s guaranteed to be non-negative.
 * @param itemsWritten location to store number
 *     of bytes written, or {@code null}. The value stored here does not include the
 *     trailing 0 byte. It???s guaranteed to be non-negative.
 * @return a pointer to a newly allocated UTF-8 string.
 *     This value must be freed with g_free(). If an error occurs,
 *     {@code null} will be returned and {@code error} set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static java.lang.String utf16ToUtf8(PointerShort str, long len, Out<Long> itemsRead, Out<Long> itemsWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment itemsReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment itemsWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf16_to_utf8.invokeExact(
                    str.handle(),
                    len,
                    (Addressable) (itemsRead == null ? MemoryAddress.NULL : (Addressable) itemsReadPOINTER.address()),
                    (Addressable) (itemsWritten == null ? MemoryAddress.NULL : (Addressable) itemsWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (itemsRead != null) itemsRead.set(itemsReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (itemsWritten != null) itemsWritten.set(itemsWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param str a UTF-8 encoded string
 * @param len length of {@code str}, in bytes, or -1 if {@code str} is nul-terminated.
 * @return a newly allocated string, that is a
 *   case independent form of {@code str}.
 */
public static java.lang.String utf8Casefold(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_casefold.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param str1 a UTF-8 encoded string
 * @param str2 a UTF-8 encoded string
 * @return &lt; 0 if {@code str1} compares before {@code str2},
 *   0 if they compare equal, &gt; 0 if {@code str1} compares after {@code str2}.
 */
public static int utf8Collate(java.lang.String str1, java.lang.String str2) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_utf8_collate.invokeExact(
                    Marshal.stringToAddress.marshal(str1, SCOPE),
                    Marshal.stringToAddress.marshal(str2, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * @param str a UTF-8 encoded string.
 * @param len length of {@code str}, in bytes, or -1 if {@code str} is nul-terminated.
 * @return a newly allocated string. This string should
 *   be freed with g_free() when you are done with it.
 */
public static java.lang.String utf8CollateKey(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_collate_key.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param str a UTF-8 encoded string.
 * @param len length of {@code str}, in bytes, or -1 if {@code str} is nul-terminated.
 * @return a newly allocated string. This string should
 *   be freed with g_free() when you are done with it.
 */
public static java.lang.String utf8CollateKeyForFilename(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_collate_key_for_filename.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Finds the start of the next UTF-8 character in the string after {@code p}.
 * <p>
 * {@code p} does not have to be at the beginning of a UTF-8 character. No check
 * is made to see if the character found is actually valid other than
 * it starts with an appropriate byte.
 * <p>
 * If {@code end} is {@code null}, the return value will never be {@code null}: if the end of the
 * string is reached, a pointer to the terminating nul byte is returned. If
 * {@code end} is non-{@code null}, the return value will be {@code null} if the end of the string
 * is reached.
 * @param p a pointer to a position within a UTF-8 encoded string
 * @param end a pointer to the byte following the end of the string,
 *     or {@code null} to indicate that the string is nul-terminated
 * @return a pointer to the found character or {@code null} if {@code end} is
 *    set and is reached
 */
public static @Nullable java.lang.String utf8FindNextChar(java.lang.String p, @Nullable java.lang.String end) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_find_next_char.invokeExact(
                    Marshal.stringToAddress.marshal(p, SCOPE),
                    (Addressable) (end == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(end, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Given a position {@code p} with a UTF-8 encoded string {@code str}, find the start
 * of the previous UTF-8 character starting before {@code p}. Returns {@code null} if no
 * UTF-8 characters are present in {@code str} before {@code p}.
 * <p>
 * {@code p} does not have to be at the beginning of a UTF-8 character. No check
 * is made to see if the character found is actually valid other than
 * it starts with an appropriate byte.
 * @param str pointer to the beginning of a UTF-8 encoded string
 * @param p pointer to some position within {@code str}
 * @return a pointer to the found character or {@code null}.
 */
public static @Nullable java.lang.String utf8FindPrevChar(java.lang.String str, java.lang.String p) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_find_prev_char.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    Marshal.stringToAddress.marshal(p, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Converts a sequence of bytes encoded as UTF-8 to a Unicode character.
 * <p>
 * If {@code p} does not point to a valid UTF-8 encoded character, results
 * are undefined. If you are not sure that the bytes are complete
 * valid Unicode characters, you should use g_utf8_get_char_validated()
 * instead.
 * @param p a pointer to Unicode character encoded as UTF-8
 * @return the resulting character
 */
public static int utf8GetChar(java.lang.String p) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_utf8_get_char.invokeExact(Marshal.stringToAddress.marshal(p, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Convert a sequence of bytes encoded as UTF-8 to a Unicode character.
 * This function checks for incomplete characters, for invalid characters
 * such as characters that are out of the range of Unicode, and for
 * overlong encodings of valid characters.
 * <p>
 * Note that g_utf8_get_char_validated() returns (gunichar)-2 if
 * {@code max_len} is positive and any of the bytes in the first UTF-8 character
 * sequence are nul.
 * @param p a pointer to Unicode character encoded as UTF-8
 * @param maxLen the maximum number of bytes to read, or -1 if {@code p} is nul-terminated
 * @return the resulting character. If {@code p} points to a partial
 *     sequence at the end of a string that could begin a valid
 *     character (or if {@code max_len} is zero), returns (gunichar)-2;
 *     otherwise, if {@code p} does not point to a valid UTF-8 encoded
 *     Unicode character, returns (gunichar)-1.
 */
public static int utf8GetCharValidated(java.lang.String p, long maxLen) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_utf8_get_char_validated.invokeExact(
                    Marshal.stringToAddress.marshal(p, SCOPE),
                    maxLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

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
 * @param str string to coerce into UTF-8
 * @param len the maximum length of {@code str} to use, in bytes. If {@code len} &lt; 0,
 *     then the string is nul-terminated.
 * @return a valid UTF-8 string whose content resembles {@code str}
 */
public static java.lang.String utf8MakeValid(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_make_valid.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param str a UTF-8 encoded string.
 * @param len length of {@code str}, in bytes, or -1 if {@code str} is nul-terminated.
 * @param mode the type of normalization to perform.
 * @return a newly allocated string, that
 *   is the normalized form of {@code str}, or {@code null} if {@code str}
 *   is not valid UTF-8.
 */
public static @Nullable java.lang.String utf8Normalize(java.lang.String str, long len, org.gtk.glib.NormalizeMode mode) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_normalize.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len,
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param str a UTF-8 encoded string
 * @param offset a character offset within {@code str}
 * @return the resulting pointer
 */
public static java.lang.String utf8OffsetToPointer(java.lang.String str, long offset) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_offset_to_pointer.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Converts from a pointer to position within a string to an integer
 * character offset.
 * <p>
 * Since 2.10, this function allows {@code pos} to be before {@code str}, and returns
 * a negative offset in this case.
 * @param str a UTF-8 encoded string
 * @param pos a pointer to a position within {@code str}
 * @return the resulting character offset
 */
public static long utf8PointerToOffset(java.lang.String str, java.lang.String pos) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_utf8_pointer_to_offset.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    Marshal.stringToAddress.marshal(pos, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Finds the previous UTF-8 character in the string before {@code p}.
 * <p>
 * {@code p} does not have to be at the beginning of a UTF-8 character. No check
 * is made to see if the character found is actually valid other than
 * it starts with an appropriate byte. If {@code p} might be the first
 * character of the string, you must use g_utf8_find_prev_char() instead.
 * @param p a pointer to a position within a UTF-8 encoded string
 * @return a pointer to the found character
 */
public static java.lang.String utf8PrevChar(java.lang.String p) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_prev_char.invokeExact(Marshal.stringToAddress.marshal(p, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Finds the leftmost occurrence of the given Unicode character
 * in a UTF-8 encoded string, while limiting the search to {@code len} bytes.
 * If {@code len} is -1, allow unbounded search.
 * @param p a nul-terminated UTF-8 encoded string
 * @param len the maximum length of {@code p}
 * @param c a Unicode character
 * @return {@code null} if the string does not contain the character,
 *     otherwise, a pointer to the start of the leftmost occurrence
 *     of the character in the string.
 */
public static @Nullable java.lang.String utf8Strchr(java.lang.String p, long len, int c) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_strchr.invokeExact(
                    Marshal.stringToAddress.marshal(p, SCOPE),
                    len,
                    c);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Converts all Unicode characters in the string that have a case
 * to lowercase. The exact manner that this is done depends
 * on the current locale, and may result in the number of
 * characters in the string changing.
 * @param str a UTF-8 encoded string
 * @param len length of {@code str}, in bytes, or -1 if {@code str} is nul-terminated.
 * @return a newly allocated string, with all characters
 *    converted to lowercase.
 */
public static java.lang.String utf8Strdown(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_strdown.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Computes the length of the string in characters, not including
 * the terminating nul character. If the {@code max}'th byte falls in the
 * middle of a character, the last (partial) character is not counted.
 * @param p pointer to the start of a UTF-8 encoded string
 * @param max the maximum number of bytes to examine. If {@code max}
 *       is less than 0, then the string is assumed to be
 *       nul-terminated. If {@code max} is 0, {@code p} will not be examined and
 *       may be {@code null}. If {@code max} is greater than 0, up to {@code max}
 *       bytes are examined
 * @return the length of the string in characters
 */
public static long utf8Strlen(java.lang.String p, long max) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_utf8_strlen.invokeExact(
                    Marshal.stringToAddress.marshal(p, SCOPE),
                    max);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Like the standard C strncpy() function, but copies a given number
 * of characters instead of a given number of bytes. The {@code src} string
 * must be valid UTF-8 encoded text. (Use g_utf8_validate() on all
 * text before trying to use UTF-8 utility functions with it.)
 * <p>
 * Note you must ensure {@code dest} is at least 4 * {@code n} + 1 to fit the
 * largest possible UTF-8 characters
 * @param dest buffer to fill with characters from {@code src}
 * @param src UTF-8 encoded string
 * @param n character count
 * @return {@code dest}
 */
public static java.lang.String utf8Strncpy(java.lang.String dest, java.lang.String src, long n) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_strncpy.invokeExact(
                    Marshal.stringToAddress.marshal(dest, SCOPE),
                    Marshal.stringToAddress.marshal(src, SCOPE),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Find the rightmost occurrence of the given Unicode character
 * in a UTF-8 encoded string, while limiting the search to {@code len} bytes.
 * If {@code len} is -1, allow unbounded search.
 * @param p a nul-terminated UTF-8 encoded string
 * @param len the maximum length of {@code p}
 * @param c a Unicode character
 * @return {@code null} if the string does not contain the character,
 *     otherwise, a pointer to the start of the rightmost occurrence
 *     of the character in the string.
 */
public static @Nullable java.lang.String utf8Strrchr(java.lang.String p, long len, int c) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_strrchr.invokeExact(
                    Marshal.stringToAddress.marshal(p, SCOPE),
                    len,
                    c);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

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
 * @param str a UTF-8 encoded string
 * @param len the maximum length of {@code str} to use, in bytes. If {@code len} &lt; 0,
 *     then the string is nul-terminated.
 * @return a newly-allocated string which is the reverse of {@code str}
 */
public static java.lang.String utf8Strreverse(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_strreverse.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Converts all Unicode characters in the string that have a case
 * to uppercase. The exact manner that this is done depends
 * on the current locale, and may result in the number of
 * characters in the string increasing. (For instance, the
 * German ess-zet will be changed to SS.)
 * @param str a UTF-8 encoded string
 * @param len length of {@code str}, in bytes, or -1 if {@code str} is nul-terminated.
 * @return a newly allocated string, with all characters
 *    converted to uppercase.
 */
public static java.lang.String utf8Strup(java.lang.String str, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_strup.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Copies a substring out of a UTF-8 encoded string.
 * The substring will contain {@code end_pos} - {@code start_pos} characters.
 * <p>
 * Since GLib 2.72, {@code -1} can be passed to {@code end_pos} to indicate the
 * end of the string.
 * @param str a UTF-8 encoded string
 * @param startPos a character offset within {@code str}
 * @param endPos another character offset within {@code str},
 *   or {@code -1} to indicate the end of the string
 * @return a newly allocated copy of the requested
 *     substring. Free with g_free() when no longer needed.
 */
public static java.lang.String utf8Substring(java.lang.String str, long startPos, long endPos) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_substring.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    startPos,
                    endPos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Convert a string from UTF-8 to a 32-bit fixed width
 * representation as UCS-4. A trailing 0 character will be added to the
 * string after the converted text.
 * @param str a UTF-8 encoded string
 * @param len the maximum length of {@code str} to use, in bytes. If {@code len} &lt; 0,
 *     then the string is nul-terminated.
 * @param itemsRead location to store number of
 *    bytes read, or {@code null}.
 *     If {@code null}, then {@link ConvertError#PARTIAL_INPUT} will be
 *     returned in case {@code str} contains a trailing partial
 *     character. If an error occurs then the index of the
 *     invalid input is stored here.
 * @param itemsWritten location to store number
 *     of characters written or {@code null}. The value here stored does not include
 *     the trailing 0 character.
 * @return a pointer to a newly allocated UCS-4 string.
 *     This value must be freed with g_free(). If an error occurs,
 *     {@code null} will be returned and {@code error} set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static PointerInteger utf8ToUcs4(java.lang.String str, long len, Out<Long> itemsRead, Out<Long> itemsWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment itemsReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment itemsWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_to_ucs4.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len,
                    (Addressable) (itemsRead == null ? MemoryAddress.NULL : (Addressable) itemsReadPOINTER.address()),
                    (Addressable) (itemsWritten == null ? MemoryAddress.NULL : (Addressable) itemsWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (itemsRead != null) itemsRead.set(itemsReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (itemsWritten != null) itemsWritten.set(itemsWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new PointerInteger(RESULT);
    }
}

/**
 * Convert a string from UTF-8 to a 32-bit fixed width
 * representation as UCS-4, assuming valid UTF-8 input.
 * This function is roughly twice as fast as g_utf8_to_ucs4()
 * but does no error checking on the input. A trailing 0 character
 * will be added to the string after the converted text.
 * @param str a UTF-8 encoded string
 * @param len the maximum length of {@code str} to use, in bytes. If {@code len} &lt; 0,
 *     then the string is nul-terminated.
 * @param itemsWritten location to store the
 *     number of characters in the result, or {@code null}.
 * @return a pointer to a newly allocated UCS-4 string.
 *     This value must be freed with g_free().
 */
public static PointerInteger utf8ToUcs4Fast(java.lang.String str, long len, Out<Long> itemsWritten) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment itemsWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_to_ucs4_fast.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len,
                    (Addressable) (itemsWritten == null ? MemoryAddress.NULL : (Addressable) itemsWrittenPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (itemsWritten != null) itemsWritten.set(itemsWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new PointerInteger(RESULT);
    }
}

/**
 * Convert a string from UTF-8 to UTF-16. A 0 character will be
 * added to the result after the converted text.
 * @param str a UTF-8 encoded string
 * @param len the maximum length (number of bytes) of {@code str} to use.
 *     If {@code len} &lt; 0, then the string is nul-terminated.
 * @param itemsRead location to store number of
 *     bytes read, or {@code null}. If {@code null}, then {@link ConvertError#PARTIAL_INPUT} will
 *     be returned in case {@code str} contains a trailing partial character. If
 *     an error occurs then the index of the invalid input is stored here.
 * @param itemsWritten location to store number
 *     of {@code gunichar2} written, or {@code null}. The value stored here does not include
 *     the trailing 0.
 * @return a pointer to a newly allocated UTF-16 string.
 *     This value must be freed with g_free(). If an error occurs,
 *     {@code null} will be returned and {@code error} set.
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static PointerShort utf8ToUtf16(java.lang.String str, long len, Out<Long> itemsRead, Out<Long> itemsWritten) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment itemsReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment itemsWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_utf8_to_utf16.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    len,
                    (Addressable) (itemsRead == null ? MemoryAddress.NULL : (Addressable) itemsReadPOINTER.address()),
                    (Addressable) (itemsWritten == null ? MemoryAddress.NULL : (Addressable) itemsWrittenPOINTER.address()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
                if (itemsRead != null) itemsRead.set(itemsReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
                if (itemsWritten != null) itemsWritten.set(itemsWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new PointerShort(RESULT);
    }
}

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
 * @param str a pointer to character data
 * @param maxLen max bytes to validate, or -1 to go until NUL
 * @param end return location for end of valid data
 * @return {@code true} if the text was valid UTF-8
 */
public static boolean utf8Validate(byte[] str, long maxLen, @Nullable Out<java.lang.String> end) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment endPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_utf8_validate.invokeExact(
                    Interop.allocateNativeArray(str, false, SCOPE),
                    maxLen,
                    (Addressable) (end == null ? MemoryAddress.NULL : (Addressable) endPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (end != null) end.set(Marshal.addressToString.marshal(endPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Validates UTF-8 encoded text.
 * <p>
 * As with g_utf8_validate(), but {@code max_len} must be set, and hence this function
 * will always return {@code false} if any of the bytes of {@code str} are nul.
 * @param str a pointer to character data
 * @param maxLen max bytes to validate
 * @param end return location for end of valid data
 * @return {@code true} if the text was valid UTF-8
 */
public static boolean utf8ValidateLen(byte[] str, long maxLen, @Nullable Out<java.lang.String> end) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment endPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_utf8_validate_len.invokeExact(
                    Interop.allocateNativeArray(str, false, SCOPE),
                    maxLen,
                    (Addressable) (end == null ? MemoryAddress.NULL : (Addressable) endPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (end != null) end.set(Marshal.addressToString.marshal(endPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parses the string {@code str} and verify if it is a UUID.
 * <p>
 * The function accepts the following syntax:
 * <ul>
 * <li>simple forms (e.g. {@code f81d4fae-7dec-11d0-a765-00a0c91e6bf6})
 * </ul>
 * <p>
 * Note that hyphens are required within the UUID string itself,
 * as per the aforementioned RFC.
 * @param str a string representing a UUID
 * @return {@code true} if {@code str} is a valid UUID, {@code false} otherwise.
 */
public static boolean uuidStringIsValid(java.lang.String str) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_uuid_string_is_valid.invokeExact(Marshal.stringToAddress.marshal(str, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Generates a random UUID (RFC 4122 version 4) as a string. It has the same
 * randomness guarantees as {@link Rand}, so must not be used for cryptographic
 * purposes such as key generation, nonces, salts or one-time pads.
 * @return A string that should be freed with g_free().
 */
public static java.lang.String uuidStringRandom() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_uuid_string_random.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

public static org.gtk.glib.Type variantGetGtype() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.g_variant_get_gtype.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

/**
 * Determines if a given string is a valid D-Bus object path.  You
 * should ensure that a string is a valid D-Bus object path before
 * passing it to g_variant_new_object_path().
 * <p>
 * A valid object path starts with {@code /} followed by zero or more
 * sequences of characters separated by {@code /} characters.  Each sequence
 * must contain only the characters {@code [A-Z][a-z][0-9]_}.  No sequence
 * (including the one following the final {@code /} character) may be empty.
 * @param string a normal C nul-terminated string
 * @return {@code true} if {@code string} is a D-Bus object path
 */
public static boolean variantIsObjectPath(java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_is_object_path.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Determines if a given string is a valid D-Bus type signature.  You
 * should ensure that a string is a valid D-Bus type signature before
 * passing it to g_variant_new_signature().
 * <p>
 * D-Bus type signatures consist of zero or more definite {@link VariantType}
 * strings in sequence.
 * @param string a normal C nul-terminated string
 * @return {@code true} if {@code string} is a D-Bus type signature
 */
public static boolean variantIsSignature(java.lang.String string) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_is_signature.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param type a {@link VariantType}, or {@code null}
 * @param text a string containing a GVariant in text form
 * @param limit a pointer to the end of {@code text}, or {@code null}
 * @param endptr a location to store the end pointer, or {@code null}
 * @return a non-floating reference to a {@link Variant}, or {@code null}
 * @throws GErrorException See {@link org.gtk.glib.Error}
 */
public static org.gtk.glib.Variant variantParse(@Nullable org.gtk.glib.VariantType type, java.lang.String text, @Nullable java.lang.String limit, @Nullable PointerString endptr) throws io.github.jwharm.javagi.GErrorException {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_parse.invokeExact(
                    (Addressable) (type == null ? MemoryAddress.NULL : type.handle()),
                    Marshal.stringToAddress.marshal(text, SCOPE),
                    (Addressable) (limit == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(limit, SCOPE)),
                    (Addressable) (endptr == null ? MemoryAddress.NULL : endptr.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Pretty-prints a message showing the context of a {@link Variant} parse
 * error within the string for which parsing was attempted.
 * <p>
 * The resulting string is suitable for output to the console or other
 * monospace media where newlines are treated in the usual way.
 * <p>
 * The message will typically look something like one of the following:
 * <pre>{@code 
 * unterminated string constant:
 *   (1, 2, 3, 'abc
 *             ^^^^
 * }</pre>
 * <p>
 * or
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
 * @param error a {@link Error} from the {@link VariantParseError} domain
 * @param sourceStr the string that was given to the parser
 * @return the printed message
 */
public static java.lang.String variantParseErrorPrintContext(org.gtk.glib.Error error, java.lang.String sourceStr) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_parse_error_print_context.invokeExact(
                    error.handle(),
                    Marshal.stringToAddress.marshal(sourceStr, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

public static org.gtk.glib.Quark variantParseErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_variant_parse_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Same as g_variant_error_quark().
 * @deprecated Use g_variant_parse_error_quark() instead.
 */
@Deprecated
public static org.gtk.glib.Quark variantParserGetErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_variant_parser_get_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

public static org.gtk.glib.VariantType variantTypeChecked(java.lang.String arg0) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_variant_type_checked_.invokeExact(Marshal.stringToAddress.marshal(arg0, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.VariantType.fromAddress.marshal(RESULT, null);
    }
}

public static long variantTypeStringGetDepth(java.lang.String typeString) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_variant_type_string_get_depth_.invokeExact(Marshal.stringToAddress.marshal(typeString, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Checks if {@code type_string} is a valid GVariant type string.  This call is
 * equivalent to calling g_variant_type_string_scan() and confirming
 * that the following character is a nul terminator.
 * @param typeString a pointer to any string
 * @return {@code true} if {@code type_string} is exactly one valid type string
 * <p>
 * Since 2.24
 */
public static boolean variantTypeStringIsValid(java.lang.String typeString) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_string_is_valid.invokeExact(Marshal.stringToAddress.marshal(typeString, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param string a pointer to any string
 * @param limit the end of {@code string}, or {@code null}
 * @param endptr location to store the end pointer, or {@code null}
 * @return {@code true} if a valid type string was found
 */
public static boolean variantTypeStringScan(java.lang.String string, @Nullable java.lang.String limit, @Nullable Out<java.lang.String> endptr) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment endptrPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_variant_type_string_scan.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    (Addressable) (limit == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(limit, SCOPE)),
                    (Addressable) (endptr == null ? MemoryAddress.NULL : (Addressable) endptrPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (endptr != null) endptr.set(Marshal.addressToString.marshal(endptrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

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
 * @param string the return location for the newly-allocated string,
 *   which will be {@code null} if (and only if) this function fails
 * @param format a standard printf() format string, but notice
 *          [string precision pitfalls][string-precision]
 * @param args the list of arguments to insert in the output.
 * @return the number of bytes printed, or {@code -1} on failure
 */
public static int vasprintf(PointerString string, java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vasprintf.invokeExact(
                    string.handle(),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * An implementation of the standard fprintf() function which supports
 * positional parameters, as specified in the Single Unix Specification.
 * <p>
 * {@code glib/gprintf.h} must be explicitly included in order to use this function.
 * @param file the stream to write to.
 * @param format a standard printf() format string, but notice
 *          [string precision pitfalls][string-precision]
 * @param args the list of arguments to insert in the output.
 * @return the number of bytes printed.
 */
public static int vfprintf(java.lang.foreign.MemoryAddress file, java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vfprintf.invokeExact(
                    (Addressable) file,
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * An implementation of the standard vprintf() function which supports
 * positional parameters, as specified in the Single Unix Specification.
 * <p>
 * {@code glib/gprintf.h} must be explicitly included in order to use this function.
 * @param format a standard printf() format string, but notice
 *          [string precision pitfalls][string-precision]
 * @param args the list of arguments to insert in the output.
 * @return the number of bytes printed.
 */
public static int vprintf(java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vprintf.invokeExact(
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * A safer form of the standard vsprintf() function. The output is guaranteed
 * to not exceed {@code n} characters (including the terminating nul character), so
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
 * @param string the buffer to hold the output.
 * @param n the maximum number of bytes to produce (including the
 *     terminating nul character).
 * @param format a standard printf() format string, but notice
 *          [string precision pitfalls][string-precision]
 * @param args the list of arguments to insert in the output.
 * @return the number of bytes which would be produced if the buffer
 *  was large enough.
 */
public static int vsnprintf(java.lang.String string, long n, java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vsnprintf.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    n,
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * An implementation of the standard vsprintf() function which supports
 * positional parameters, as specified in the Single Unix Specification.
 * <p>
 * {@code glib/gprintf.h} must be explicitly included in order to use this function.
 * @param string the buffer to hold the output.
 * @param format a standard printf() format string, but notice
 *          [string precision pitfalls][string-precision]
 * @param args the list of arguments to insert in the output.
 * @return the number of bytes printed.
 */
public static int vsprintf(java.lang.String string, java.lang.String format, VaList args) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vsprintf.invokeExact(
                    Marshal.stringToAddress.marshal(string, SCOPE),
                    Marshal.stringToAddress.marshal(format, SCOPE),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
}

/**
 * Internal function used to print messages from the public g_warn_if_reached()
 * and g_warn_if_fail() macros.
 * @param domain log domain
 * @param file file containing the warning
 * @param line line number of the warning
 * @param func function containing the warning
 * @param warnexpr expression which failed
 */
public static void warnMessage(@Nullable java.lang.String domain, java.lang.String file, int line, java.lang.String func, @Nullable java.lang.String warnexpr) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.g_warn_message.invokeExact(
                    (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)),
                    Marshal.stringToAddress.marshal(file, SCOPE),
                    line,
                    Marshal.stringToAddress.marshal(func, SCOPE),
                    (Addressable) (warnexpr == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(warnexpr, SCOPE)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}
    
    private static class DowncallHandles {

private static final MethodHandle g_access = Interop.downcallHandle(
        "g_access",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_aligned_alloc = Interop.downcallHandle(
        "g_aligned_alloc",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_aligned_alloc0 = Interop.downcallHandle(
        "g_aligned_alloc0",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_aligned_free = Interop.downcallHandle(
        "g_aligned_free",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ascii_digit_value = Interop.downcallHandle(
        "g_ascii_digit_value",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle g_ascii_dtostr = Interop.downcallHandle(
        "g_ascii_dtostr",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle g_ascii_formatd = Interop.downcallHandle(
        "g_ascii_formatd",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle g_ascii_strcasecmp = Interop.downcallHandle(
        "g_ascii_strcasecmp",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ascii_strdown = Interop.downcallHandle(
        "g_ascii_strdown",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_ascii_string_to_signed = Interop.downcallHandle(
        "g_ascii_string_to_signed",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ascii_string_to_unsigned = Interop.downcallHandle(
        "g_ascii_string_to_unsigned",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ascii_strncasecmp = Interop.downcallHandle(
        "g_ascii_strncasecmp",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_ascii_strtod = Interop.downcallHandle(
        "g_ascii_strtod",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ascii_strtoll = Interop.downcallHandle(
        "g_ascii_strtoll",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_ascii_strtoull = Interop.downcallHandle(
        "g_ascii_strtoull",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_ascii_strup = Interop.downcallHandle(
        "g_ascii_strup",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_ascii_tolower = Interop.downcallHandle(
        "g_ascii_tolower",
        FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle g_ascii_toupper = Interop.downcallHandle(
        "g_ascii_toupper",
        FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle g_ascii_xdigit_value = Interop.downcallHandle(
        "g_ascii_xdigit_value",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle g_assert_warning = Interop.downcallHandle(
        "g_assert_warning",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_assertion_message = Interop.downcallHandle(
        "g_assertion_message",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_assertion_message_cmpstr = Interop.downcallHandle(
        "g_assertion_message_cmpstr",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_assertion_message_cmpstrv = Interop.downcallHandle(
        "g_assertion_message_cmpstrv",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_assertion_message_error = Interop.downcallHandle(
        "g_assertion_message_error",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_assertion_message_expr = Interop.downcallHandle(
        "g_assertion_message_expr",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atexit = Interop.downcallHandle(
        "g_atexit",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_int_add = Interop.downcallHandle(
        "g_atomic_int_add",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_atomic_int_and = Interop.downcallHandle(
        "g_atomic_int_and",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_atomic_int_compare_and_exchange = Interop.downcallHandle(
        "g_atomic_int_compare_and_exchange",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_atomic_int_compare_and_exchange_full = Interop.downcallHandle(
        "g_atomic_int_compare_and_exchange_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_int_dec_and_test = Interop.downcallHandle(
        "g_atomic_int_dec_and_test",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_int_exchange = Interop.downcallHandle(
        "g_atomic_int_exchange",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_atomic_int_exchange_and_add = Interop.downcallHandle(
        "g_atomic_int_exchange_and_add",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_atomic_int_get = Interop.downcallHandle(
        "g_atomic_int_get",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_int_inc = Interop.downcallHandle(
        "g_atomic_int_inc",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_int_or = Interop.downcallHandle(
        "g_atomic_int_or",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_atomic_int_set = Interop.downcallHandle(
        "g_atomic_int_set",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_atomic_int_xor = Interop.downcallHandle(
        "g_atomic_int_xor",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_atomic_pointer_add = Interop.downcallHandle(
        "g_atomic_pointer_add",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_atomic_pointer_and = Interop.downcallHandle(
        "g_atomic_pointer_and",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_atomic_pointer_compare_and_exchange = Interop.downcallHandle(
        "g_atomic_pointer_compare_and_exchange",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_pointer_compare_and_exchange_full = Interop.downcallHandle(
        "g_atomic_pointer_compare_and_exchange_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_pointer_exchange = Interop.downcallHandle(
        "g_atomic_pointer_exchange",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_pointer_get = Interop.downcallHandle(
        "g_atomic_pointer_get",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_pointer_or = Interop.downcallHandle(
        "g_atomic_pointer_or",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_atomic_pointer_set = Interop.downcallHandle(
        "g_atomic_pointer_set",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_pointer_xor = Interop.downcallHandle(
        "g_atomic_pointer_xor",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_atomic_rc_box_acquire = Interop.downcallHandle(
        "g_atomic_rc_box_acquire",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_rc_box_alloc = Interop.downcallHandle(
        "g_atomic_rc_box_alloc",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_atomic_rc_box_alloc0 = Interop.downcallHandle(
        "g_atomic_rc_box_alloc0",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_atomic_rc_box_dup = Interop.downcallHandle(
        "g_atomic_rc_box_dup",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_rc_box_get_size = Interop.downcallHandle(
        "g_atomic_rc_box_get_size",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_rc_box_release = Interop.downcallHandle(
        "g_atomic_rc_box_release",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_rc_box_release_full = Interop.downcallHandle(
        "g_atomic_rc_box_release_full",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_ref_count_compare = Interop.downcallHandle(
        "g_atomic_ref_count_compare",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_atomic_ref_count_dec = Interop.downcallHandle(
        "g_atomic_ref_count_dec",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_ref_count_inc = Interop.downcallHandle(
        "g_atomic_ref_count_inc",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_atomic_ref_count_init = Interop.downcallHandle(
        "g_atomic_ref_count_init",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_base64_decode = Interop.downcallHandle(
        "g_base64_decode",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_base64_decode_inplace = Interop.downcallHandle(
        "g_base64_decode_inplace",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_base64_decode_step = Interop.downcallHandle(
        "g_base64_decode_step",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_base64_encode = Interop.downcallHandle(
        "g_base64_encode",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_base64_encode_close = Interop.downcallHandle(
        "g_base64_encode_close",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_base64_encode_step = Interop.downcallHandle(
        "g_base64_encode_step",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_basename = Interop.downcallHandle(
        "g_basename",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_bit_lock = Interop.downcallHandle(
        "g_bit_lock",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_bit_nth_lsf = Interop.downcallHandle(
        "g_bit_nth_lsf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_bit_nth_msf = Interop.downcallHandle(
        "g_bit_nth_msf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_bit_storage = Interop.downcallHandle(
        "g_bit_storage",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_bit_trylock = Interop.downcallHandle(
        "g_bit_trylock",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_bit_unlock = Interop.downcallHandle(
        "g_bit_unlock",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_bookmark_file_error_quark = Interop.downcallHandle(
        "g_bookmark_file_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_build_filename = Interop.downcallHandle(
        "g_build_filename",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_build_filename_valist = Interop.downcallHandle(
        "g_build_filename_valist",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_build_filenamev = Interop.downcallHandle(
        "g_build_filenamev",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_build_path = Interop.downcallHandle(
        "g_build_path",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_build_pathv = Interop.downcallHandle(
        "g_build_pathv",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_byte_array_free = Interop.downcallHandle(
        "g_byte_array_free",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_byte_array_free_to_bytes = Interop.downcallHandle(
        "g_byte_array_free_to_bytes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_byte_array_new = Interop.downcallHandle(
        "g_byte_array_new",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_byte_array_new_take = Interop.downcallHandle(
        "g_byte_array_new_take",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_byte_array_steal = Interop.downcallHandle(
        "g_byte_array_steal",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_byte_array_unref = Interop.downcallHandle(
        "g_byte_array_unref",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_canonicalize_filename = Interop.downcallHandle(
        "g_canonicalize_filename",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_chdir = Interop.downcallHandle(
        "g_chdir",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle glib_check_version = Interop.downcallHandle(
        "glib_check_version",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_checksum_type_get_length = Interop.downcallHandle(
        "g_checksum_type_get_length",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_child_watch_add = Interop.downcallHandle(
        "g_child_watch_add",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_child_watch_add_full = Interop.downcallHandle(
        "g_child_watch_add_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_child_watch_source_new = Interop.downcallHandle(
        "g_child_watch_source_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_clear_handle_id = Interop.downcallHandle(
        "g_clear_handle_id",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_clear_list = Interop.downcallHandle(
        "g_clear_list",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_clear_pointer = Interop.downcallHandle(
        "g_clear_pointer",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_clear_slist = Interop.downcallHandle(
        "g_clear_slist",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_close = Interop.downcallHandle(
        "g_close",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_compute_checksum_for_bytes = Interop.downcallHandle(
        "g_compute_checksum_for_bytes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_compute_checksum_for_data = Interop.downcallHandle(
        "g_compute_checksum_for_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_compute_checksum_for_string = Interop.downcallHandle(
        "g_compute_checksum_for_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_compute_hmac_for_bytes = Interop.downcallHandle(
        "g_compute_hmac_for_bytes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_compute_hmac_for_data = Interop.downcallHandle(
        "g_compute_hmac_for_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_compute_hmac_for_string = Interop.downcallHandle(
        "g_compute_hmac_for_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_convert = Interop.downcallHandle(
        "g_convert",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_convert_error_quark = Interop.downcallHandle(
        "g_convert_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_convert_with_fallback = Interop.downcallHandle(
        "g_convert_with_fallback",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_convert_with_iconv = Interop.downcallHandle(
        "g_convert_with_iconv",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_datalist_clear = Interop.downcallHandle(
        "g_datalist_clear",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_datalist_foreach = Interop.downcallHandle(
        "g_datalist_foreach",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_datalist_get_data = Interop.downcallHandle(
        "g_datalist_get_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_datalist_get_flags = Interop.downcallHandle(
        "g_datalist_get_flags",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_datalist_id_dup_data = Interop.downcallHandle(
        "g_datalist_id_dup_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_datalist_id_get_data = Interop.downcallHandle(
        "g_datalist_id_get_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_datalist_id_remove_multiple = Interop.downcallHandle(
        "g_datalist_id_remove_multiple",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_datalist_id_remove_no_notify = Interop.downcallHandle(
        "g_datalist_id_remove_no_notify",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_datalist_id_replace_data = Interop.downcallHandle(
        "g_datalist_id_replace_data",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_datalist_id_set_data_full = Interop.downcallHandle(
        "g_datalist_id_set_data_full",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_datalist_init = Interop.downcallHandle(
        "g_datalist_init",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_datalist_set_flags = Interop.downcallHandle(
        "g_datalist_set_flags",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_datalist_unset_flags = Interop.downcallHandle(
        "g_datalist_unset_flags",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_dataset_destroy = Interop.downcallHandle(
        "g_dataset_destroy",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_dataset_foreach = Interop.downcallHandle(
        "g_dataset_foreach",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_dataset_id_get_data = Interop.downcallHandle(
        "g_dataset_id_get_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_dataset_id_remove_no_notify = Interop.downcallHandle(
        "g_dataset_id_remove_no_notify",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_dataset_id_set_data_full = Interop.downcallHandle(
        "g_dataset_id_set_data_full",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_date_get_days_in_month = Interop.downcallHandle(
        "g_date_get_days_in_month",
        FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
        false
);

private static final MethodHandle g_date_get_monday_weeks_in_year = Interop.downcallHandle(
        "g_date_get_monday_weeks_in_year",
        FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_SHORT),
        false
);

private static final MethodHandle g_date_get_sunday_weeks_in_year = Interop.downcallHandle(
        "g_date_get_sunday_weeks_in_year",
        FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_SHORT),
        false
);

private static final MethodHandle g_date_is_leap_year = Interop.downcallHandle(
        "g_date_is_leap_year",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
        false
);

private static final MethodHandle g_date_strftime = Interop.downcallHandle(
        "g_date_strftime",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_date_valid_day = Interop.downcallHandle(
        "g_date_valid_day",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle g_date_valid_dmy = Interop.downcallHandle(
        "g_date_valid_dmy",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
        false
);

private static final MethodHandle g_date_valid_julian = Interop.downcallHandle(
        "g_date_valid_julian",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_date_valid_month = Interop.downcallHandle(
        "g_date_valid_month",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_date_valid_weekday = Interop.downcallHandle(
        "g_date_valid_weekday",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_date_valid_year = Interop.downcallHandle(
        "g_date_valid_year",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
        false
);

private static final MethodHandle g_dcgettext = Interop.downcallHandle(
        "g_dcgettext",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_dgettext = Interop.downcallHandle(
        "g_dgettext",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_dir_make_tmp = Interop.downcallHandle(
        "g_dir_make_tmp",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_direct_equal = Interop.downcallHandle(
        "g_direct_equal",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_direct_hash = Interop.downcallHandle(
        "g_direct_hash",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_dngettext = Interop.downcallHandle(
        "g_dngettext",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_double_equal = Interop.downcallHandle(
        "g_double_equal",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_double_hash = Interop.downcallHandle(
        "g_double_hash",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_dpgettext = Interop.downcallHandle(
        "g_dpgettext",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_dpgettext2 = Interop.downcallHandle(
        "g_dpgettext2",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_environ_getenv = Interop.downcallHandle(
        "g_environ_getenv",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_environ_setenv = Interop.downcallHandle(
        "g_environ_setenv",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_environ_unsetenv = Interop.downcallHandle(
        "g_environ_unsetenv",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_file_error_from_errno = Interop.downcallHandle(
        "g_file_error_from_errno",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_file_error_quark = Interop.downcallHandle(
        "g_file_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_file_get_contents = Interop.downcallHandle(
        "g_file_get_contents",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_file_open_tmp = Interop.downcallHandle(
        "g_file_open_tmp",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_file_read_link = Interop.downcallHandle(
        "g_file_read_link",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_file_set_contents = Interop.downcallHandle(
        "g_file_set_contents",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_file_set_contents_full = Interop.downcallHandle(
        "g_file_set_contents_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_file_test = Interop.downcallHandle(
        "g_file_test",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_filename_display_basename = Interop.downcallHandle(
        "g_filename_display_basename",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_filename_display_name = Interop.downcallHandle(
        "g_filename_display_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_filename_from_uri = Interop.downcallHandle(
        "g_filename_from_uri",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_filename_from_utf8 = Interop.downcallHandle(
        "g_filename_from_utf8",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_filename_to_uri = Interop.downcallHandle(
        "g_filename_to_uri",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_filename_to_utf8 = Interop.downcallHandle(
        "g_filename_to_utf8",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_find_program_in_path = Interop.downcallHandle(
        "g_find_program_in_path",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_format_size = Interop.downcallHandle(
        "g_format_size",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_format_size_for_display = Interop.downcallHandle(
        "g_format_size_for_display",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_format_size_full = Interop.downcallHandle(
        "g_format_size_full",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_fprintf = Interop.downcallHandle(
        "g_fprintf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_free = Interop.downcallHandle(
        "g_free",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_application_name = Interop.downcallHandle(
        "g_get_application_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_charset = Interop.downcallHandle(
        "g_get_charset",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_codeset = Interop.downcallHandle(
        "g_get_codeset",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_console_charset = Interop.downcallHandle(
        "g_get_console_charset",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_current_dir = Interop.downcallHandle(
        "g_get_current_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_current_time = Interop.downcallHandle(
        "g_get_current_time",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_environ = Interop.downcallHandle(
        "g_get_environ",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_get_filename_charsets = Interop.downcallHandle(
        "g_get_filename_charsets",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_home_dir = Interop.downcallHandle(
        "g_get_home_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_host_name = Interop.downcallHandle(
        "g_get_host_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_language_names = Interop.downcallHandle(
        "g_get_language_names",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_get_language_names_with_category = Interop.downcallHandle(
        "g_get_language_names_with_category",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_locale_variants = Interop.downcallHandle(
        "g_get_locale_variants",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_monotonic_time = Interop.downcallHandle(
        "g_get_monotonic_time",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_get_num_processors = Interop.downcallHandle(
        "g_get_num_processors",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_get_os_info = Interop.downcallHandle(
        "g_get_os_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_prgname = Interop.downcallHandle(
        "g_get_prgname",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_real_name = Interop.downcallHandle(
        "g_get_real_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_real_time = Interop.downcallHandle(
        "g_get_real_time",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_get_system_config_dirs = Interop.downcallHandle(
        "g_get_system_config_dirs",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_get_system_data_dirs = Interop.downcallHandle(
        "g_get_system_data_dirs",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_get_tmp_dir = Interop.downcallHandle(
        "g_get_tmp_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_user_cache_dir = Interop.downcallHandle(
        "g_get_user_cache_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_user_config_dir = Interop.downcallHandle(
        "g_get_user_config_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_user_data_dir = Interop.downcallHandle(
        "g_get_user_data_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_user_name = Interop.downcallHandle(
        "g_get_user_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_user_runtime_dir = Interop.downcallHandle(
        "g_get_user_runtime_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_get_user_special_dir = Interop.downcallHandle(
        "g_get_user_special_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_get_user_state_dir = Interop.downcallHandle(
        "g_get_user_state_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_getenv = Interop.downcallHandle(
        "g_getenv",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_add = Interop.downcallHandle(
        "g_hash_table_add",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_contains = Interop.downcallHandle(
        "g_hash_table_contains",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_destroy = Interop.downcallHandle(
        "g_hash_table_destroy",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_insert = Interop.downcallHandle(
        "g_hash_table_insert",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_lookup = Interop.downcallHandle(
        "g_hash_table_lookup",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_lookup_extended = Interop.downcallHandle(
        "g_hash_table_lookup_extended",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_new_similar = Interop.downcallHandle(
        "g_hash_table_new_similar",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_remove = Interop.downcallHandle(
        "g_hash_table_remove",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_remove_all = Interop.downcallHandle(
        "g_hash_table_remove_all",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_replace = Interop.downcallHandle(
        "g_hash_table_replace",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_size = Interop.downcallHandle(
        "g_hash_table_size",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_steal = Interop.downcallHandle(
        "g_hash_table_steal",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_steal_all = Interop.downcallHandle(
        "g_hash_table_steal_all",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_steal_extended = Interop.downcallHandle(
        "g_hash_table_steal_extended",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hash_table_unref = Interop.downcallHandle(
        "g_hash_table_unref",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hook_destroy = Interop.downcallHandle(
        "g_hook_destroy",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_hook_destroy_link = Interop.downcallHandle(
        "g_hook_destroy_link",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hook_free = Interop.downcallHandle(
        "g_hook_free",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hook_insert_before = Interop.downcallHandle(
        "g_hook_insert_before",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hook_prepend = Interop.downcallHandle(
        "g_hook_prepend",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hook_unref = Interop.downcallHandle(
        "g_hook_unref",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hostname_is_ascii_encoded = Interop.downcallHandle(
        "g_hostname_is_ascii_encoded",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hostname_is_ip_address = Interop.downcallHandle(
        "g_hostname_is_ip_address",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hostname_is_non_ascii = Interop.downcallHandle(
        "g_hostname_is_non_ascii",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hostname_to_ascii = Interop.downcallHandle(
        "g_hostname_to_ascii",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_hostname_to_unicode = Interop.downcallHandle(
        "g_hostname_to_unicode",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_iconv = Interop.downcallHandle(
        "g_iconv",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_iconv_open = Interop.downcallHandle(
        "g_iconv_open",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_idle_add = Interop.downcallHandle(
        "g_idle_add",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_idle_add_full = Interop.downcallHandle(
        "g_idle_add_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_idle_add_once = Interop.downcallHandle(
        "g_idle_add_once",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_idle_remove_by_data = Interop.downcallHandle(
        "g_idle_remove_by_data",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_idle_source_new = Interop.downcallHandle(
        "g_idle_source_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_int64_equal = Interop.downcallHandle(
        "g_int64_equal",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_int64_hash = Interop.downcallHandle(
        "g_int64_hash",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_int_equal = Interop.downcallHandle(
        "g_int_equal",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_int_hash = Interop.downcallHandle(
        "g_int_hash",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_intern_static_string = Interop.downcallHandle(
        "g_intern_static_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_intern_string = Interop.downcallHandle(
        "g_intern_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_io_add_watch = Interop.downcallHandle(
        "g_io_add_watch",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_io_add_watch_full = Interop.downcallHandle(
        "g_io_add_watch_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_io_channel_error_from_errno = Interop.downcallHandle(
        "g_io_channel_error_from_errno",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_io_channel_error_quark = Interop.downcallHandle(
        "g_io_channel_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_io_create_watch = Interop.downcallHandle(
        "g_io_create_watch",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_key_file_error_quark = Interop.downcallHandle(
        "g_key_file_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_listenv = Interop.downcallHandle(
        "g_listenv",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_locale_from_utf8 = Interop.downcallHandle(
        "g_locale_from_utf8",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_locale_to_utf8 = Interop.downcallHandle(
        "g_locale_to_utf8",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log = Interop.downcallHandle(
        "g_log",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_log_default_handler = Interop.downcallHandle(
        "g_log_default_handler",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_get_debug_enabled = Interop.downcallHandle(
        "g_log_get_debug_enabled",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_log_remove_handler = Interop.downcallHandle(
        "g_log_remove_handler",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_log_set_always_fatal = Interop.downcallHandle(
        "g_log_set_always_fatal",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_log_set_debug_enabled = Interop.downcallHandle(
        "g_log_set_debug_enabled",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_log_set_default_handler = Interop.downcallHandle(
        "g_log_set_default_handler",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_set_fatal_mask = Interop.downcallHandle(
        "g_log_set_fatal_mask",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_log_set_handler = Interop.downcallHandle(
        "g_log_set_handler",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_set_handler_full = Interop.downcallHandle(
        "g_log_set_handler_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_set_writer_func = Interop.downcallHandle(
        "g_log_set_writer_func",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_structured = Interop.downcallHandle(
        "g_log_structured",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        true
);

private static final MethodHandle g_log_structured_array = Interop.downcallHandle(
        "g_log_structured_array",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_log_structured_standard = Interop.downcallHandle(
        "g_log_structured_standard",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_log_variant = Interop.downcallHandle(
        "g_log_variant",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_writer_default = Interop.downcallHandle(
        "g_log_writer_default",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_writer_default_set_use_stderr = Interop.downcallHandle(
        "g_log_writer_default_set_use_stderr",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_log_writer_default_would_drop = Interop.downcallHandle(
        "g_log_writer_default_would_drop",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_writer_format_fields = Interop.downcallHandle(
        "g_log_writer_format_fields",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_log_writer_is_journald = Interop.downcallHandle(
        "g_log_writer_is_journald",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_log_writer_journald = Interop.downcallHandle(
        "g_log_writer_journald",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_writer_standard_streams = Interop.downcallHandle(
        "g_log_writer_standard_streams",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_log_writer_supports_color = Interop.downcallHandle(
        "g_log_writer_supports_color",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_logv = Interop.downcallHandle(
        "g_logv",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_main_context_default = Interop.downcallHandle(
        "g_main_context_default",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_main_context_get_thread_default = Interop.downcallHandle(
        "g_main_context_get_thread_default",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_main_context_ref_thread_default = Interop.downcallHandle(
        "g_main_context_ref_thread_default",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_main_current_source = Interop.downcallHandle(
        "g_main_current_source",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_main_depth = Interop.downcallHandle(
        "g_main_depth",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_malloc = Interop.downcallHandle(
        "g_malloc",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_malloc0 = Interop.downcallHandle(
        "g_malloc0",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_malloc0_n = Interop.downcallHandle(
        "g_malloc0_n",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_malloc_n = Interop.downcallHandle(
        "g_malloc_n",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_markup_collect_attributes = Interop.downcallHandle(
        "g_markup_collect_attributes",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_markup_error_quark = Interop.downcallHandle(
        "g_markup_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_markup_escape_text = Interop.downcallHandle(
        "g_markup_escape_text",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_markup_printf_escaped = Interop.downcallHandle(
        "g_markup_printf_escaped",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_markup_vprintf_escaped = Interop.downcallHandle(
        "g_markup_vprintf_escaped",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_mem_is_system_malloc = Interop.downcallHandle(
        "g_mem_is_system_malloc",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_mem_profile = Interop.downcallHandle(
        "g_mem_profile",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_mem_set_vtable = Interop.downcallHandle(
        "g_mem_set_vtable",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_memdup = Interop.downcallHandle(
        "g_memdup",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_memdup2 = Interop.downcallHandle(
        "g_memdup2",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_mkdir_with_parents = Interop.downcallHandle(
        "g_mkdir_with_parents",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_mkdtemp = Interop.downcallHandle(
        "g_mkdtemp",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_mkdtemp_full = Interop.downcallHandle(
        "g_mkdtemp_full",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_mkstemp = Interop.downcallHandle(
        "g_mkstemp",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_mkstemp_full = Interop.downcallHandle(
        "g_mkstemp_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_nullify_pointer = Interop.downcallHandle(
        "g_nullify_pointer",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_number_parser_error_quark = Interop.downcallHandle(
        "g_number_parser_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_on_error_query = Interop.downcallHandle(
        "g_on_error_query",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_on_error_stack_trace = Interop.downcallHandle(
        "g_on_error_stack_trace",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_once_init_enter = Interop.downcallHandle(
        "g_once_init_enter",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_once_init_leave = Interop.downcallHandle(
        "g_once_init_leave",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_option_error_quark = Interop.downcallHandle(
        "g_option_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_parse_debug_string = Interop.downcallHandle(
        "g_parse_debug_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_path_get_basename = Interop.downcallHandle(
        "g_path_get_basename",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_path_get_dirname = Interop.downcallHandle(
        "g_path_get_dirname",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_path_is_absolute = Interop.downcallHandle(
        "g_path_is_absolute",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_path_skip_root = Interop.downcallHandle(
        "g_path_skip_root",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_pattern_match = Interop.downcallHandle(
        "g_pattern_match",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_pattern_match_simple = Interop.downcallHandle(
        "g_pattern_match_simple",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_pattern_match_string = Interop.downcallHandle(
        "g_pattern_match_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_pointer_bit_lock = Interop.downcallHandle(
        "g_pointer_bit_lock",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_pointer_bit_trylock = Interop.downcallHandle(
        "g_pointer_bit_trylock",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_pointer_bit_unlock = Interop.downcallHandle(
        "g_pointer_bit_unlock",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_poll = Interop.downcallHandle(
        "g_poll",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_prefix_error = Interop.downcallHandle(
        "g_prefix_error",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_prefix_error_literal = Interop.downcallHandle(
        "g_prefix_error_literal",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_print = Interop.downcallHandle(
        "g_print",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_printerr = Interop.downcallHandle(
        "g_printerr",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_printf = Interop.downcallHandle(
        "g_printf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_printf_string_upper_bound = Interop.downcallHandle(
        "g_printf_string_upper_bound",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_propagate_error = Interop.downcallHandle(
        "g_propagate_error",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_propagate_prefixed_error = Interop.downcallHandle(
        "g_propagate_prefixed_error",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_ptr_array_find = Interop.downcallHandle(
        "g_ptr_array_find",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ptr_array_find_with_equal_func = Interop.downcallHandle(
        "g_ptr_array_find_with_equal_func",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_qsort_with_data = Interop.downcallHandle(
        "g_qsort_with_data",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_quark_from_static_string = Interop.downcallHandle(
        "g_quark_from_static_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_quark_from_string = Interop.downcallHandle(
        "g_quark_from_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_quark_to_string = Interop.downcallHandle(
        "g_quark_to_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_quark_try_string = Interop.downcallHandle(
        "g_quark_try_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_random_double = Interop.downcallHandle(
        "g_random_double",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle g_random_double_range = Interop.downcallHandle(
        "g_random_double_range",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle g_random_int = Interop.downcallHandle(
        "g_random_int",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_random_int_range = Interop.downcallHandle(
        "g_random_int_range",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_random_set_seed = Interop.downcallHandle(
        "g_random_set_seed",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_rc_box_acquire = Interop.downcallHandle(
        "g_rc_box_acquire",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_rc_box_alloc = Interop.downcallHandle(
        "g_rc_box_alloc",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_rc_box_alloc0 = Interop.downcallHandle(
        "g_rc_box_alloc0",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_rc_box_dup = Interop.downcallHandle(
        "g_rc_box_dup",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_rc_box_get_size = Interop.downcallHandle(
        "g_rc_box_get_size",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_rc_box_release = Interop.downcallHandle(
        "g_rc_box_release",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_rc_box_release_full = Interop.downcallHandle(
        "g_rc_box_release_full",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_realloc = Interop.downcallHandle(
        "g_realloc",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_realloc_n = Interop.downcallHandle(
        "g_realloc_n",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_ref_count_compare = Interop.downcallHandle(
        "g_ref_count_compare",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_ref_count_dec = Interop.downcallHandle(
        "g_ref_count_dec",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ref_count_inc = Interop.downcallHandle(
        "g_ref_count_inc",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ref_count_init = Interop.downcallHandle(
        "g_ref_count_init",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ref_string_acquire = Interop.downcallHandle(
        "g_ref_string_acquire",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ref_string_length = Interop.downcallHandle(
        "g_ref_string_length",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ref_string_new = Interop.downcallHandle(
        "g_ref_string_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ref_string_new_intern = Interop.downcallHandle(
        "g_ref_string_new_intern",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ref_string_new_len = Interop.downcallHandle(
        "g_ref_string_new_len",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_ref_string_release = Interop.downcallHandle(
        "g_ref_string_release",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_regex_check_replacement = Interop.downcallHandle(
        "g_regex_check_replacement",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_regex_error_quark = Interop.downcallHandle(
        "g_regex_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_regex_escape_nul = Interop.downcallHandle(
        "g_regex_escape_nul",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_regex_escape_string = Interop.downcallHandle(
        "g_regex_escape_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_regex_match_simple = Interop.downcallHandle(
        "g_regex_match_simple",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_regex_split_simple = Interop.downcallHandle(
        "g_regex_split_simple",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_reload_user_special_dirs_cache = Interop.downcallHandle(
        "g_reload_user_special_dirs_cache",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_return_if_fail_warning = Interop.downcallHandle(
        "g_return_if_fail_warning",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_rmdir = Interop.downcallHandle(
        "g_rmdir",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sequence_get = Interop.downcallHandle(
        "g_sequence_get",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sequence_insert_before = Interop.downcallHandle(
        "g_sequence_insert_before",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sequence_move = Interop.downcallHandle(
        "g_sequence_move",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sequence_move_range = Interop.downcallHandle(
        "g_sequence_move_range",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sequence_range_get_midpoint = Interop.downcallHandle(
        "g_sequence_range_get_midpoint",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sequence_remove = Interop.downcallHandle(
        "g_sequence_remove",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sequence_remove_range = Interop.downcallHandle(
        "g_sequence_remove_range",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sequence_set = Interop.downcallHandle(
        "g_sequence_set",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sequence_swap = Interop.downcallHandle(
        "g_sequence_swap",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_set_application_name = Interop.downcallHandle(
        "g_set_application_name",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_set_error = Interop.downcallHandle(
        "g_set_error",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_set_error_literal = Interop.downcallHandle(
        "g_set_error_literal",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_set_prgname = Interop.downcallHandle(
        "g_set_prgname",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_set_print_handler = Interop.downcallHandle(
        "g_set_print_handler",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_set_printerr_handler = Interop.downcallHandle(
        "g_set_printerr_handler",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_setenv = Interop.downcallHandle(
        "g_setenv",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_shell_error_quark = Interop.downcallHandle(
        "g_shell_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_shell_parse_argv = Interop.downcallHandle(
        "g_shell_parse_argv",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_shell_quote = Interop.downcallHandle(
        "g_shell_quote",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_shell_unquote = Interop.downcallHandle(
        "g_shell_unquote",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_slice_alloc = Interop.downcallHandle(
        "g_slice_alloc",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_slice_alloc0 = Interop.downcallHandle(
        "g_slice_alloc0",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_slice_copy = Interop.downcallHandle(
        "g_slice_copy",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_slice_free1 = Interop.downcallHandle(
        "g_slice_free1",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_slice_free_chain_with_offset = Interop.downcallHandle(
        "g_slice_free_chain_with_offset",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_slice_get_config = Interop.downcallHandle(
        "g_slice_get_config",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_slice_get_config_state = Interop.downcallHandle(
        "g_slice_get_config_state",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_slice_set_config = Interop.downcallHandle(
        "g_slice_set_config",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_snprintf = Interop.downcallHandle(
        "g_snprintf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_source_remove = Interop.downcallHandle(
        "g_source_remove",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_source_remove_by_funcs_user_data = Interop.downcallHandle(
        "g_source_remove_by_funcs_user_data",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_source_remove_by_user_data = Interop.downcallHandle(
        "g_source_remove_by_user_data",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_source_set_name_by_id = Interop.downcallHandle(
        "g_source_set_name_by_id",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_spaced_primes_closest = Interop.downcallHandle(
        "g_spaced_primes_closest",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_spawn_async = Interop.downcallHandle(
        "g_spawn_async",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_spawn_async_with_fds = Interop.downcallHandle(
        "g_spawn_async_with_fds",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_spawn_async_with_pipes = Interop.downcallHandle(
        "g_spawn_async_with_pipes",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_spawn_async_with_pipes_and_fds = Interop.downcallHandle(
        "g_spawn_async_with_pipes_and_fds",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_spawn_check_exit_status = Interop.downcallHandle(
        "g_spawn_check_exit_status",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_spawn_check_wait_status = Interop.downcallHandle(
        "g_spawn_check_wait_status",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_spawn_close_pid = Interop.downcallHandle(
        "g_spawn_close_pid",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_spawn_command_line_async = Interop.downcallHandle(
        "g_spawn_command_line_async",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_spawn_command_line_sync = Interop.downcallHandle(
        "g_spawn_command_line_sync",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_spawn_error_quark = Interop.downcallHandle(
        "g_spawn_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_spawn_exit_error_quark = Interop.downcallHandle(
        "g_spawn_exit_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_spawn_sync = Interop.downcallHandle(
        "g_spawn_sync",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_sprintf = Interop.downcallHandle(
        "g_sprintf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_stpcpy = Interop.downcallHandle(
        "g_stpcpy",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_str_equal = Interop.downcallHandle(
        "g_str_equal",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_str_has_prefix = Interop.downcallHandle(
        "g_str_has_prefix",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_str_has_suffix = Interop.downcallHandle(
        "g_str_has_suffix",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_str_hash = Interop.downcallHandle(
        "g_str_hash",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_str_is_ascii = Interop.downcallHandle(
        "g_str_is_ascii",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_str_match_string = Interop.downcallHandle(
        "g_str_match_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_str_to_ascii = Interop.downcallHandle(
        "g_str_to_ascii",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_str_tokenize_and_fold = Interop.downcallHandle(
        "g_str_tokenize_and_fold",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strcanon = Interop.downcallHandle(
        "g_strcanon",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle g_strcasecmp = Interop.downcallHandle(
        "g_strcasecmp",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strchomp = Interop.downcallHandle(
        "g_strchomp",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strchug = Interop.downcallHandle(
        "g_strchug",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strcmp0 = Interop.downcallHandle(
        "g_strcmp0",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strcompress = Interop.downcallHandle(
        "g_strcompress",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strconcat = Interop.downcallHandle(
        "g_strconcat",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_strdelimit = Interop.downcallHandle(
        "g_strdelimit",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle g_strdown = Interop.downcallHandle(
        "g_strdown",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strdup = Interop.downcallHandle(
        "g_strdup",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strdup_printf = Interop.downcallHandle(
        "g_strdup_printf",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_strdup_vprintf = Interop.downcallHandle(
        "g_strdup_vprintf",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strdupv = Interop.downcallHandle(
        "g_strdupv",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strerror = Interop.downcallHandle(
        "g_strerror",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_strescape = Interop.downcallHandle(
        "g_strescape",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strfreev = Interop.downcallHandle(
        "g_strfreev",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strip_context = Interop.downcallHandle(
        "g_strip_context",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strjoin = Interop.downcallHandle(
        "g_strjoin",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_strjoinv = Interop.downcallHandle(
        "g_strjoinv",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strlcat = Interop.downcallHandle(
        "g_strlcat",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_strlcpy = Interop.downcallHandle(
        "g_strlcpy",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_strncasecmp = Interop.downcallHandle(
        "g_strncasecmp",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_strndup = Interop.downcallHandle(
        "g_strndup",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_strnfill = Interop.downcallHandle(
        "g_strnfill",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle g_strreverse = Interop.downcallHandle(
        "g_strreverse",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strrstr = Interop.downcallHandle(
        "g_strrstr",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strrstr_len = Interop.downcallHandle(
        "g_strrstr_len",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strsignal = Interop.downcallHandle(
        "g_strsignal",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_strsplit = Interop.downcallHandle(
        "g_strsplit",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_strsplit_set = Interop.downcallHandle(
        "g_strsplit_set",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_strstr_len = Interop.downcallHandle(
        "g_strstr_len",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strtod = Interop.downcallHandle(
        "g_strtod",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strup = Interop.downcallHandle(
        "g_strup",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strv_contains = Interop.downcallHandle(
        "g_strv_contains",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strv_equal = Interop.downcallHandle(
        "g_strv_equal",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_strv_get_type = Interop.downcallHandle(
        "g_strv_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_strv_length = Interop.downcallHandle(
        "g_strv_length",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_add_data_func = Interop.downcallHandle(
        "g_test_add_data_func",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_add_data_func_full = Interop.downcallHandle(
        "g_test_add_data_func_full",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_add_func = Interop.downcallHandle(
        "g_test_add_func",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_add_vtable = Interop.downcallHandle(
        "g_test_add_vtable",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_assert_expected_messages_internal = Interop.downcallHandle(
        "g_test_assert_expected_messages_internal",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_bug = Interop.downcallHandle(
        "g_test_bug",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_bug_base = Interop.downcallHandle(
        "g_test_bug_base",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_build_filename = Interop.downcallHandle(
        "g_test_build_filename",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_test_create_case = Interop.downcallHandle(
        "g_test_create_case",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_create_suite = Interop.downcallHandle(
        "g_test_create_suite",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_expect_message = Interop.downcallHandle(
        "g_test_expect_message",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_fail = Interop.downcallHandle(
        "g_test_fail",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_test_fail_printf = Interop.downcallHandle(
        "g_test_fail_printf",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_test_failed = Interop.downcallHandle(
        "g_test_failed",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_get_dir = Interop.downcallHandle(
        "g_test_get_dir",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_get_filename = Interop.downcallHandle(
        "g_test_get_filename",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_test_get_path = Interop.downcallHandle(
        "g_test_get_path",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_get_root = Interop.downcallHandle(
        "g_test_get_root",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_incomplete = Interop.downcallHandle(
        "g_test_incomplete",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_incomplete_printf = Interop.downcallHandle(
        "g_test_incomplete_printf",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_test_init = Interop.downcallHandle(
        "g_test_init",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_test_log_set_fatal_handler = Interop.downcallHandle(
        "g_test_log_set_fatal_handler",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_log_type_name = Interop.downcallHandle(
        "g_test_log_type_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_maximized_result = Interop.downcallHandle(
        "g_test_maximized_result",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_test_message = Interop.downcallHandle(
        "g_test_message",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_test_minimized_result = Interop.downcallHandle(
        "g_test_minimized_result",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_test_queue_destroy = Interop.downcallHandle(
        "g_test_queue_destroy",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_queue_free = Interop.downcallHandle(
        "g_test_queue_free",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_rand_double = Interop.downcallHandle(
        "g_test_rand_double",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle g_test_rand_double_range = Interop.downcallHandle(
        "g_test_rand_double_range",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle g_test_rand_int = Interop.downcallHandle(
        "g_test_rand_int",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_rand_int_range = Interop.downcallHandle(
        "g_test_rand_int_range",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_run = Interop.downcallHandle(
        "g_test_run",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_run_suite = Interop.downcallHandle(
        "g_test_run_suite",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_set_nonfatal_assertions = Interop.downcallHandle(
        "g_test_set_nonfatal_assertions",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_test_skip = Interop.downcallHandle(
        "g_test_skip",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_skip_printf = Interop.downcallHandle(
        "g_test_skip_printf",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        true
);

private static final MethodHandle g_test_subprocess = Interop.downcallHandle(
        "g_test_subprocess",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_summary = Interop.downcallHandle(
        "g_test_summary",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_timer_elapsed = Interop.downcallHandle(
        "g_test_timer_elapsed",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle g_test_timer_last = Interop.downcallHandle(
        "g_test_timer_last",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle g_test_timer_start = Interop.downcallHandle(
        "g_test_timer_start",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_test_trap_assertions = Interop.downcallHandle(
        "g_test_trap_assertions",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_test_trap_fork = Interop.downcallHandle(
        "g_test_trap_fork",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_trap_has_passed = Interop.downcallHandle(
        "g_test_trap_has_passed",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_trap_reached_timeout = Interop.downcallHandle(
        "g_test_trap_reached_timeout",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_test_trap_subprocess = Interop.downcallHandle(
        "g_test_trap_subprocess",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_thread_error_quark = Interop.downcallHandle(
        "g_thread_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_thread_exit = Interop.downcallHandle(
        "g_thread_exit",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_thread_pool_get_max_idle_time = Interop.downcallHandle(
        "g_thread_pool_get_max_idle_time",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_thread_pool_get_max_unused_threads = Interop.downcallHandle(
        "g_thread_pool_get_max_unused_threads",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_thread_pool_get_num_unused_threads = Interop.downcallHandle(
        "g_thread_pool_get_num_unused_threads",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_thread_pool_set_max_idle_time = Interop.downcallHandle(
        "g_thread_pool_set_max_idle_time",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_thread_pool_set_max_unused_threads = Interop.downcallHandle(
        "g_thread_pool_set_max_unused_threads",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_thread_pool_stop_unused_threads = Interop.downcallHandle(
        "g_thread_pool_stop_unused_threads",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_thread_self = Interop.downcallHandle(
        "g_thread_self",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_thread_yield = Interop.downcallHandle(
        "g_thread_yield",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle g_time_val_from_iso8601 = Interop.downcallHandle(
        "g_time_val_from_iso8601",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_timeout_add = Interop.downcallHandle(
        "g_timeout_add",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_timeout_add_full = Interop.downcallHandle(
        "g_timeout_add_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_timeout_add_once = Interop.downcallHandle(
        "g_timeout_add_once",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_timeout_add_seconds = Interop.downcallHandle(
        "g_timeout_add_seconds",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_timeout_add_seconds_full = Interop.downcallHandle(
        "g_timeout_add_seconds_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_timeout_source_new = Interop.downcallHandle(
        "g_timeout_source_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_timeout_source_new_seconds = Interop.downcallHandle(
        "g_timeout_source_new_seconds",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_trash_stack_height = Interop.downcallHandle(
        "g_trash_stack_height",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_trash_stack_peek = Interop.downcallHandle(
        "g_trash_stack_peek",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_trash_stack_pop = Interop.downcallHandle(
        "g_trash_stack_pop",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_trash_stack_push = Interop.downcallHandle(
        "g_trash_stack_push",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_try_malloc = Interop.downcallHandle(
        "g_try_malloc",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_try_malloc0 = Interop.downcallHandle(
        "g_try_malloc0",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_try_malloc0_n = Interop.downcallHandle(
        "g_try_malloc0_n",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_try_malloc_n = Interop.downcallHandle(
        "g_try_malloc_n",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_try_realloc = Interop.downcallHandle(
        "g_try_realloc",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_try_realloc_n = Interop.downcallHandle(
        "g_try_realloc_n",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_ucs4_to_utf16 = Interop.downcallHandle(
        "g_ucs4_to_utf16",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_ucs4_to_utf8 = Interop.downcallHandle(
        "g_ucs4_to_utf8",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unichar_break_type = Interop.downcallHandle(
        "g_unichar_break_type",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_combining_class = Interop.downcallHandle(
        "g_unichar_combining_class",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_compose = Interop.downcallHandle(
        "g_unichar_compose",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unichar_decompose = Interop.downcallHandle(
        "g_unichar_decompose",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unichar_digit_value = Interop.downcallHandle(
        "g_unichar_digit_value",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_fully_decompose = Interop.downcallHandle(
        "g_unichar_fully_decompose",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_unichar_get_mirror_char = Interop.downcallHandle(
        "g_unichar_get_mirror_char",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unichar_get_script = Interop.downcallHandle(
        "g_unichar_get_script",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_isalnum = Interop.downcallHandle(
        "g_unichar_isalnum",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_isalpha = Interop.downcallHandle(
        "g_unichar_isalpha",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_iscntrl = Interop.downcallHandle(
        "g_unichar_iscntrl",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_isdefined = Interop.downcallHandle(
        "g_unichar_isdefined",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_isdigit = Interop.downcallHandle(
        "g_unichar_isdigit",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_isgraph = Interop.downcallHandle(
        "g_unichar_isgraph",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_islower = Interop.downcallHandle(
        "g_unichar_islower",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_ismark = Interop.downcallHandle(
        "g_unichar_ismark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_isprint = Interop.downcallHandle(
        "g_unichar_isprint",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_ispunct = Interop.downcallHandle(
        "g_unichar_ispunct",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_isspace = Interop.downcallHandle(
        "g_unichar_isspace",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_istitle = Interop.downcallHandle(
        "g_unichar_istitle",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_isupper = Interop.downcallHandle(
        "g_unichar_isupper",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_iswide = Interop.downcallHandle(
        "g_unichar_iswide",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_iswide_cjk = Interop.downcallHandle(
        "g_unichar_iswide_cjk",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_isxdigit = Interop.downcallHandle(
        "g_unichar_isxdigit",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_iszerowidth = Interop.downcallHandle(
        "g_unichar_iszerowidth",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_to_utf8 = Interop.downcallHandle(
        "g_unichar_to_utf8",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unichar_tolower = Interop.downcallHandle(
        "g_unichar_tolower",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_totitle = Interop.downcallHandle(
        "g_unichar_totitle",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_toupper = Interop.downcallHandle(
        "g_unichar_toupper",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_type = Interop.downcallHandle(
        "g_unichar_type",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_validate = Interop.downcallHandle(
        "g_unichar_validate",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unichar_xdigit_value = Interop.downcallHandle(
        "g_unichar_xdigit_value",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unicode_canonical_decomposition = Interop.downcallHandle(
        "g_unicode_canonical_decomposition",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unicode_canonical_ordering = Interop.downcallHandle(
        "g_unicode_canonical_ordering",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_unicode_script_from_iso15924 = Interop.downcallHandle(
        "g_unicode_script_from_iso15924",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unicode_script_to_iso15924 = Interop.downcallHandle(
        "g_unicode_script_to_iso15924",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unix_error_quark = Interop.downcallHandle(
        "g_unix_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unix_fd_add = Interop.downcallHandle(
        "g_unix_fd_add",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unix_fd_add_full = Interop.downcallHandle(
        "g_unix_fd_add_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unix_fd_source_new = Interop.downcallHandle(
        "g_unix_fd_source_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unix_get_passwd_entry = Interop.downcallHandle(
        "g_unix_get_passwd_entry",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unix_open_pipe = Interop.downcallHandle(
        "g_unix_open_pipe",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unix_set_fd_nonblocking = Interop.downcallHandle(
        "g_unix_set_fd_nonblocking",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unix_signal_add = Interop.downcallHandle(
        "g_unix_signal_add",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unix_signal_add_full = Interop.downcallHandle(
        "g_unix_signal_add_full",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unix_signal_source_new = Interop.downcallHandle(
        "g_unix_signal_source_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_unlink = Interop.downcallHandle(
        "g_unlink",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_unsetenv = Interop.downcallHandle(
        "g_unsetenv",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_build = Interop.downcallHandle(
        "g_uri_build",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_build_with_user = Interop.downcallHandle(
        "g_uri_build_with_user",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_error_quark = Interop.downcallHandle(
        "g_uri_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_uri_escape_bytes = Interop.downcallHandle(
        "g_uri_escape_bytes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_escape_string = Interop.downcallHandle(
        "g_uri_escape_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_uri_is_valid = Interop.downcallHandle(
        "g_uri_is_valid",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_join = Interop.downcallHandle(
        "g_uri_join",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_join_with_user = Interop.downcallHandle(
        "g_uri_join_with_user",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_list_extract_uris = Interop.downcallHandle(
        "g_uri_list_extract_uris",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_parse = Interop.downcallHandle(
        "g_uri_parse",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_parse_params = Interop.downcallHandle(
        "g_uri_parse_params",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_parse_scheme = Interop.downcallHandle(
        "g_uri_parse_scheme",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_peek_scheme = Interop.downcallHandle(
        "g_uri_peek_scheme",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_resolve_relative = Interop.downcallHandle(
        "g_uri_resolve_relative",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_split = Interop.downcallHandle(
        "g_uri_split",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_split_network = Interop.downcallHandle(
        "g_uri_split_network",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_split_with_user = Interop.downcallHandle(
        "g_uri_split_with_user",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_unescape_bytes = Interop.downcallHandle(
        "g_uri_unescape_bytes",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_unescape_segment = Interop.downcallHandle(
        "g_uri_unescape_segment",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uri_unescape_string = Interop.downcallHandle(
        "g_uri_unescape_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_usleep = Interop.downcallHandle(
        "g_usleep",
        FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf16_to_ucs4 = Interop.downcallHandle(
        "g_utf16_to_ucs4",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf16_to_utf8 = Interop.downcallHandle(
        "g_utf16_to_utf8",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_casefold = Interop.downcallHandle(
        "g_utf8_casefold",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_collate = Interop.downcallHandle(
        "g_utf8_collate",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_collate_key = Interop.downcallHandle(
        "g_utf8_collate_key",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_collate_key_for_filename = Interop.downcallHandle(
        "g_utf8_collate_key_for_filename",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_find_next_char = Interop.downcallHandle(
        "g_utf8_find_next_char",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_find_prev_char = Interop.downcallHandle(
        "g_utf8_find_prev_char",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_get_char = Interop.downcallHandle(
        "g_utf8_get_char",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_get_char_validated = Interop.downcallHandle(
        "g_utf8_get_char_validated",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_make_valid = Interop.downcallHandle(
        "g_utf8_make_valid",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_normalize = Interop.downcallHandle(
        "g_utf8_normalize",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_utf8_offset_to_pointer = Interop.downcallHandle(
        "g_utf8_offset_to_pointer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_pointer_to_offset = Interop.downcallHandle(
        "g_utf8_pointer_to_offset",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_prev_char = Interop.downcallHandle(
        "g_utf8_prev_char",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_strchr = Interop.downcallHandle(
        "g_utf8_strchr",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_utf8_strdown = Interop.downcallHandle(
        "g_utf8_strdown",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_strlen = Interop.downcallHandle(
        "g_utf8_strlen",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_strncpy = Interop.downcallHandle(
        "g_utf8_strncpy",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_strrchr = Interop.downcallHandle(
        "g_utf8_strrchr",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_utf8_strreverse = Interop.downcallHandle(
        "g_utf8_strreverse",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_strup = Interop.downcallHandle(
        "g_utf8_strup",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_substring = Interop.downcallHandle(
        "g_utf8_substring",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_utf8_to_ucs4 = Interop.downcallHandle(
        "g_utf8_to_ucs4",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_to_ucs4_fast = Interop.downcallHandle(
        "g_utf8_to_ucs4_fast",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_to_utf16 = Interop.downcallHandle(
        "g_utf8_to_utf16",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_validate = Interop.downcallHandle(
        "g_utf8_validate",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_utf8_validate_len = Interop.downcallHandle(
        "g_utf8_validate_len",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uuid_string_is_valid = Interop.downcallHandle(
        "g_uuid_string_is_valid",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_uuid_string_random = Interop.downcallHandle(
        "g_uuid_string_random",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_variant_get_gtype = Interop.downcallHandle(
        "g_variant_get_gtype",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle g_variant_is_object_path = Interop.downcallHandle(
        "g_variant_is_object_path",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_variant_is_signature = Interop.downcallHandle(
        "g_variant_is_signature",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_variant_parse = Interop.downcallHandle(
        "g_variant_parse",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_variant_parse_error_print_context = Interop.downcallHandle(
        "g_variant_parse_error_print_context",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_variant_parse_error_quark = Interop.downcallHandle(
        "g_variant_parse_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_variant_parser_get_error_quark = Interop.downcallHandle(
        "g_variant_parser_get_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_variant_type_checked_ = Interop.downcallHandle(
        "g_variant_type_checked_",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_variant_type_string_get_depth_ = Interop.downcallHandle(
        "g_variant_type_string_get_depth_",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_variant_type_string_is_valid = Interop.downcallHandle(
        "g_variant_type_string_is_valid",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_variant_type_string_scan = Interop.downcallHandle(
        "g_variant_type_string_scan",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_vasprintf = Interop.downcallHandle(
        "g_vasprintf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_vfprintf = Interop.downcallHandle(
        "g_vfprintf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_vprintf = Interop.downcallHandle(
        "g_vprintf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_vsnprintf = Interop.downcallHandle(
        "g_vsnprintf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_vsprintf = Interop.downcallHandle(
        "g_vsprintf",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_warn_message = Interop.downcallHandle(
        "g_warn_message",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
    }
}

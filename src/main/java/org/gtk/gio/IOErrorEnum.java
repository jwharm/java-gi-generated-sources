package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by GIO functions.
 * <p>
 * Note that this domain may be extended in future GLib releases. In
 * general, new error codes either only apply to new APIs, or else
 * replace {@link IOErrorEnum#FAILED} in cases that were not explicitly
 * distinguished before. You should therefore avoid writing code like
 * <pre>{@code <!-- language="C" -->
 * if (g_error_matches (error, G_IO_ERROR, G_IO_ERROR_FAILED))
 *   {
 *     // Assume that this is EPRINTERONFIRE
 *     ...
 *   }
 * }</pre>
 * but should instead treat all unrecognized error codes the same as
 * {@link IOErrorEnum#FAILED}.
 * <p>
 * See also {@link PollableReturn} for a cheaper way of returning
 * {@link IOErrorEnum#WOULD_BLOCK} to callers without allocating a {@link org.gtk.glib.Error}.
 */
public class IOErrorEnum extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GIOErrorEnum";
    
    /**
     * Generic error condition for when an operation fails
     *     and no more specific {@link IOErrorEnum} value is defined.
     */
    public static final IOErrorEnum FAILED = new IOErrorEnum(0);
    
    /**
     * File not found.
     */
    public static final IOErrorEnum NOT_FOUND = new IOErrorEnum(1);
    
    /**
     * File already exists.
     */
    public static final IOErrorEnum EXISTS = new IOErrorEnum(2);
    
    /**
     * File is a directory.
     */
    public static final IOErrorEnum IS_DIRECTORY = new IOErrorEnum(3);
    
    /**
     * File is not a directory.
     */
    public static final IOErrorEnum NOT_DIRECTORY = new IOErrorEnum(4);
    
    /**
     * File is a directory that isn't empty.
     */
    public static final IOErrorEnum NOT_EMPTY = new IOErrorEnum(5);
    
    /**
     * File is not a regular file.
     */
    public static final IOErrorEnum NOT_REGULAR_FILE = new IOErrorEnum(6);
    
    /**
     * File is not a symbolic link.
     */
    public static final IOErrorEnum NOT_SYMBOLIC_LINK = new IOErrorEnum(7);
    
    /**
     * File cannot be mounted.
     */
    public static final IOErrorEnum NOT_MOUNTABLE_FILE = new IOErrorEnum(8);
    
    /**
     * Filename is too many characters.
     */
    public static final IOErrorEnum FILENAME_TOO_LONG = new IOErrorEnum(9);
    
    /**
     * Filename is invalid or contains invalid characters.
     */
    public static final IOErrorEnum INVALID_FILENAME = new IOErrorEnum(10);
    
    /**
     * File contains too many symbolic links.
     */
    public static final IOErrorEnum TOO_MANY_LINKS = new IOErrorEnum(11);
    
    /**
     * No space left on drive.
     */
    public static final IOErrorEnum NO_SPACE = new IOErrorEnum(12);
    
    /**
     * Invalid argument.
     */
    public static final IOErrorEnum INVALID_ARGUMENT = new IOErrorEnum(13);
    
    /**
     * Permission denied.
     */
    public static final IOErrorEnum PERMISSION_DENIED = new IOErrorEnum(14);
    
    /**
     * Operation (or one of its parameters) not supported
     */
    public static final IOErrorEnum NOT_SUPPORTED = new IOErrorEnum(15);
    
    /**
     * File isn't mounted.
     */
    public static final IOErrorEnum NOT_MOUNTED = new IOErrorEnum(16);
    
    /**
     * File is already mounted.
     */
    public static final IOErrorEnum ALREADY_MOUNTED = new IOErrorEnum(17);
    
    /**
     * File was closed.
     */
    public static final IOErrorEnum CLOSED = new IOErrorEnum(18);
    
    /**
     * Operation was cancelled. See {@link Cancellable}.
     */
    public static final IOErrorEnum CANCELLED = new IOErrorEnum(19);
    
    /**
     * Operations are still pending.
     */
    public static final IOErrorEnum PENDING = new IOErrorEnum(20);
    
    /**
     * File is read only.
     */
    public static final IOErrorEnum READ_ONLY = new IOErrorEnum(21);
    
    /**
     * Backup couldn't be created.
     */
    public static final IOErrorEnum CANT_CREATE_BACKUP = new IOErrorEnum(22);
    
    /**
     * File's Entity Tag was incorrect.
     */
    public static final IOErrorEnum WRONG_ETAG = new IOErrorEnum(23);
    
    /**
     * Operation timed out.
     */
    public static final IOErrorEnum TIMED_OUT = new IOErrorEnum(24);
    
    /**
     * Operation would be recursive.
     */
    public static final IOErrorEnum WOULD_RECURSE = new IOErrorEnum(25);
    
    /**
     * File is busy.
     */
    public static final IOErrorEnum BUSY = new IOErrorEnum(26);
    
    /**
     * Operation would block.
     */
    public static final IOErrorEnum WOULD_BLOCK = new IOErrorEnum(27);
    
    /**
     * Host couldn't be found (remote operations).
     */
    public static final IOErrorEnum HOST_NOT_FOUND = new IOErrorEnum(28);
    
    /**
     * Operation would merge files.
     */
    public static final IOErrorEnum WOULD_MERGE = new IOErrorEnum(29);
    
    /**
     * Operation failed and a helper program has
     *     already interacted with the user. Do not display any error dialog.
     */
    public static final IOErrorEnum FAILED_HANDLED = new IOErrorEnum(30);
    
    /**
     * The current process has too many files
     *     open and can't open any more. Duplicate descriptors do count toward
     *     this limit. Since 2.20
     */
    public static final IOErrorEnum TOO_MANY_OPEN_FILES = new IOErrorEnum(31);
    
    /**
     * The object has not been initialized. Since 2.22
     */
    public static final IOErrorEnum NOT_INITIALIZED = new IOErrorEnum(32);
    
    /**
     * The requested address is already in use. Since 2.22
     */
    public static final IOErrorEnum ADDRESS_IN_USE = new IOErrorEnum(33);
    
    /**
     * Need more input to finish operation. Since 2.24
     */
    public static final IOErrorEnum PARTIAL_INPUT = new IOErrorEnum(34);
    
    /**
     * The input data was invalid. Since 2.24
     */
    public static final IOErrorEnum INVALID_DATA = new IOErrorEnum(35);
    
    /**
     * A remote object generated an error that
     *     doesn't correspond to a locally registered {@link org.gtk.glib.Error} error
     *     domain. Use g_dbus_error_get_remote_error() to extract the D-Bus
     *     error name and g_dbus_error_strip_remote_error() to fix up the
     *     message so it matches what was received on the wire. Since 2.26.
     */
    public static final IOErrorEnum DBUS_ERROR = new IOErrorEnum(36);
    
    /**
     * Host unreachable. Since 2.26
     */
    public static final IOErrorEnum HOST_UNREACHABLE = new IOErrorEnum(37);
    
    /**
     * Network unreachable. Since 2.26
     */
    public static final IOErrorEnum NETWORK_UNREACHABLE = new IOErrorEnum(38);
    
    /**
     * Connection refused. Since 2.26
     */
    public static final IOErrorEnum CONNECTION_REFUSED = new IOErrorEnum(39);
    
    /**
     * Connection to proxy server failed. Since 2.26
     */
    public static final IOErrorEnum PROXY_FAILED = new IOErrorEnum(40);
    
    /**
     * Proxy authentication failed. Since 2.26
     */
    public static final IOErrorEnum PROXY_AUTH_FAILED = new IOErrorEnum(41);
    
    /**
     * Proxy server needs authentication. Since 2.26
     */
    public static final IOErrorEnum PROXY_NEED_AUTH = new IOErrorEnum(42);
    
    /**
     * Proxy connection is not allowed by ruleset.
     *     Since 2.26
     */
    public static final IOErrorEnum PROXY_NOT_ALLOWED = new IOErrorEnum(43);
    
    /**
     * Broken pipe. Since 2.36
     */
    public static final IOErrorEnum BROKEN_PIPE = new IOErrorEnum(44);
    
    /**
     * Connection closed by peer. Note that this
     *     is the same code as {@link IOErrorEnum#BROKEN_PIPE}; before 2.44 some
     *     "connection closed" errors returned {@link IOErrorEnum#BROKEN_PIPE}, but others
     *     returned {@link IOErrorEnum#FAILED}. Now they should all return the same
     *     value, which has this more logical name. Since 2.44.
     */
    public static final IOErrorEnum CONNECTION_CLOSED = new IOErrorEnum(44);
    
    /**
     * Transport endpoint is not connected. Since 2.44
     */
    public static final IOErrorEnum NOT_CONNECTED = new IOErrorEnum(45);
    
    /**
     * Message too large. Since 2.48.
     */
    public static final IOErrorEnum MESSAGE_TOO_LARGE = new IOErrorEnum(46);
    
    /**
     * No such device found. Since 2.74
     */
    public static final IOErrorEnum NO_SUCH_DEVICE = new IOErrorEnum(47);
    
    public IOErrorEnum(int value) {
        super(value);
    }
}

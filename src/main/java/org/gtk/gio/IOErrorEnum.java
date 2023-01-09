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
public enum IOErrorEnum implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Generic error condition for when an operation fails
     *     and no more specific {@link IOErrorEnum} value is defined.
     */
    FAILED(0),
    
    /**
     * File not found.
     */
    NOT_FOUND(1),
    
    /**
     * File already exists.
     */
    EXISTS(2),
    
    /**
     * File is a directory.
     */
    IS_DIRECTORY(3),
    
    /**
     * File is not a directory.
     */
    NOT_DIRECTORY(4),
    
    /**
     * File is a directory that isn't empty.
     */
    NOT_EMPTY(5),
    
    /**
     * File is not a regular file.
     */
    NOT_REGULAR_FILE(6),
    
    /**
     * File is not a symbolic link.
     */
    NOT_SYMBOLIC_LINK(7),
    
    /**
     * File cannot be mounted.
     */
    NOT_MOUNTABLE_FILE(8),
    
    /**
     * Filename is too many characters.
     */
    FILENAME_TOO_LONG(9),
    
    /**
     * Filename is invalid or contains invalid characters.
     */
    INVALID_FILENAME(10),
    
    /**
     * File contains too many symbolic links.
     */
    TOO_MANY_LINKS(11),
    
    /**
     * No space left on drive.
     */
    NO_SPACE(12),
    
    /**
     * Invalid argument.
     */
    INVALID_ARGUMENT(13),
    
    /**
     * Permission denied.
     */
    PERMISSION_DENIED(14),
    
    /**
     * Operation (or one of its parameters) not supported
     */
    NOT_SUPPORTED(15),
    
    /**
     * File isn't mounted.
     */
    NOT_MOUNTED(16),
    
    /**
     * File is already mounted.
     */
    ALREADY_MOUNTED(17),
    
    /**
     * File was closed.
     */
    CLOSED(18),
    
    /**
     * Operation was cancelled. See {@link Cancellable}.
     */
    CANCELLED(19),
    
    /**
     * Operations are still pending.
     */
    PENDING(20),
    
    /**
     * File is read only.
     */
    READ_ONLY(21),
    
    /**
     * Backup couldn't be created.
     */
    CANT_CREATE_BACKUP(22),
    
    /**
     * File's Entity Tag was incorrect.
     */
    WRONG_ETAG(23),
    
    /**
     * Operation timed out.
     */
    TIMED_OUT(24),
    
    /**
     * Operation would be recursive.
     */
    WOULD_RECURSE(25),
    
    /**
     * File is busy.
     */
    BUSY(26),
    
    /**
     * Operation would block.
     */
    WOULD_BLOCK(27),
    
    /**
     * Host couldn't be found (remote operations).
     */
    HOST_NOT_FOUND(28),
    
    /**
     * Operation would merge files.
     */
    WOULD_MERGE(29),
    
    /**
     * Operation failed and a helper program has
     *     already interacted with the user. Do not display any error dialog.
     */
    FAILED_HANDLED(30),
    
    /**
     * The current process has too many files
     *     open and can't open any more. Duplicate descriptors do count toward
     *     this limit. Since 2.20
     */
    TOO_MANY_OPEN_FILES(31),
    
    /**
     * The object has not been initialized. Since 2.22
     */
    NOT_INITIALIZED(32),
    
    /**
     * The requested address is already in use. Since 2.22
     */
    ADDRESS_IN_USE(33),
    
    /**
     * Need more input to finish operation. Since 2.24
     */
    PARTIAL_INPUT(34),
    
    /**
     * The input data was invalid. Since 2.24
     */
    INVALID_DATA(35),
    
    /**
     * A remote object generated an error that
     *     doesn't correspond to a locally registered {@link org.gtk.glib.Error} error
     *     domain. Use g_dbus_error_get_remote_error() to extract the D-Bus
     *     error name and g_dbus_error_strip_remote_error() to fix up the
     *     message so it matches what was received on the wire. Since 2.26.
     */
    DBUS_ERROR(36),
    
    /**
     * Host unreachable. Since 2.26
     */
    HOST_UNREACHABLE(37),
    
    /**
     * Network unreachable. Since 2.26
     */
    NETWORK_UNREACHABLE(38),
    
    /**
     * Connection refused. Since 2.26
     */
    CONNECTION_REFUSED(39),
    
    /**
     * Connection to proxy server failed. Since 2.26
     */
    PROXY_FAILED(40),
    
    /**
     * Proxy authentication failed. Since 2.26
     */
    PROXY_AUTH_FAILED(41),
    
    /**
     * Proxy server needs authentication. Since 2.26
     */
    PROXY_NEED_AUTH(42),
    
    /**
     * Proxy connection is not allowed by ruleset.
     *     Since 2.26
     */
    PROXY_NOT_ALLOWED(43),
    
    /**
     * Broken pipe. Since 2.36
     */
    BROKEN_PIPE(44),
    
    /**
     * Transport endpoint is not connected. Since 2.44
     */
    NOT_CONNECTED(45),
    
    /**
     * Message too large. Since 2.48.
     */
    MESSAGE_TOO_LARGE(46),
    
    /**
     * No such device found. Since 2.74
     */
    NO_SUCH_DEVICE(47);
    
    /**
     * Connection closed by peer. Note that this
     *     is the same code as {@link IOErrorEnum#BROKEN_PIPE}; before 2.44 some
     *     "connection closed" errors returned {@link IOErrorEnum#BROKEN_PIPE}, but others
     *     returned {@link IOErrorEnum#FAILED}. Now they should all return the same
     *     value, which has this more logical name. Since 2.44.
     */
    public static final IOErrorEnum CONNECTION_CLOSED = BROKEN_PIPE;
    
    private static final java.lang.String C_TYPE_NAME = "GIOErrorEnum";
    
    private final int value;
    
    /**
     * Create a new IOErrorEnum for the provided value
     * @param numeric value the enum value
     */
    IOErrorEnum(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new IOErrorEnum for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static IOErrorEnum of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            case 1 -> NOT_FOUND;
            case 2 -> EXISTS;
            case 3 -> IS_DIRECTORY;
            case 4 -> NOT_DIRECTORY;
            case 5 -> NOT_EMPTY;
            case 6 -> NOT_REGULAR_FILE;
            case 7 -> NOT_SYMBOLIC_LINK;
            case 8 -> NOT_MOUNTABLE_FILE;
            case 9 -> FILENAME_TOO_LONG;
            case 10 -> INVALID_FILENAME;
            case 11 -> TOO_MANY_LINKS;
            case 12 -> NO_SPACE;
            case 13 -> INVALID_ARGUMENT;
            case 14 -> PERMISSION_DENIED;
            case 15 -> NOT_SUPPORTED;
            case 16 -> NOT_MOUNTED;
            case 17 -> ALREADY_MOUNTED;
            case 18 -> CLOSED;
            case 19 -> CANCELLED;
            case 20 -> PENDING;
            case 21 -> READ_ONLY;
            case 22 -> CANT_CREATE_BACKUP;
            case 23 -> WRONG_ETAG;
            case 24 -> TIMED_OUT;
            case 25 -> WOULD_RECURSE;
            case 26 -> BUSY;
            case 27 -> WOULD_BLOCK;
            case 28 -> HOST_NOT_FOUND;
            case 29 -> WOULD_MERGE;
            case 30 -> FAILED_HANDLED;
            case 31 -> TOO_MANY_OPEN_FILES;
            case 32 -> NOT_INITIALIZED;
            case 33 -> ADDRESS_IN_USE;
            case 34 -> PARTIAL_INPUT;
            case 35 -> INVALID_DATA;
            case 36 -> DBUS_ERROR;
            case 37 -> HOST_UNREACHABLE;
            case 38 -> NETWORK_UNREACHABLE;
            case 39 -> CONNECTION_REFUSED;
            case 40 -> PROXY_FAILED;
            case 41 -> PROXY_AUTH_FAILED;
            case 42 -> PROXY_NEED_AUTH;
            case 43 -> PROXY_NOT_ALLOWED;
            case 44 -> BROKEN_PIPE;
            case 45 -> NOT_CONNECTED;
            case 46 -> MESSAGE_TOO_LARGE;
            case 47 -> NO_SUCH_DEVICE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}

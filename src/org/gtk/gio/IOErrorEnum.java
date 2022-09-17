package org.gtk.gio;

/**
 * Error codes returned by GIO functions.
 * 
 * Note that this domain may be extended in future GLib releases. In
 * general, new error codes either only apply to new APIs, or else
 * replace {@link org.gtk.gio.IOErrorEnum#FAILED} in cases that were not explicitly
 * distinguished before. You should therefore avoid writing code like
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 * if (g_error_matches (error, G_IO_ERROR, G_IO_ERROR_FAILED))
 *   {
 *     // Assume that this is EPRINTERONFIRE
 *     ...
 *   }
 * ]}|
 * but should instead treat all unrecognized error codes the same as
 * <code>G_IO_ERROR_FAILED.
 * 
 * See</code> also #GPollableReturn for a cheaper way of returning
 * {@link org.gtk.gio.IOErrorEnum#WOULD_BLOCK} to callers without allocating a #GError.
 */
public enum IOErrorEnum {

    /**
     * Generic error condition for when an operation fails
     *     and no more specific #GIOErrorEnum value is defined.
     */
    FAILED,
    
    /**
     * File not found.
     */
    NOT_FOUND,
    
    /**
     * File already exists.
     */
    EXISTS,
    
    /**
     * File is a directory.
     */
    IS_DIRECTORY,
    
    /**
     * File is not a directory.
     */
    NOT_DIRECTORY,
    
    /**
     * File is a directory that isn&#39;t empty.
     */
    NOT_EMPTY,
    
    /**
     * File is not a regular file.
     */
    NOT_REGULAR_FILE,
    
    /**
     * File is not a symbolic link.
     */
    NOT_SYMBOLIC_LINK,
    
    /**
     * File cannot be mounted.
     */
    NOT_MOUNTABLE_FILE,
    
    /**
     * Filename is too many characters.
     */
    FILENAME_TOO_LONG,
    
    /**
     * Filename is invalid or contains invalid characters.
     */
    INVALID_FILENAME,
    
    /**
     * File contains too many symbolic links.
     */
    TOO_MANY_LINKS,
    
    /**
     * No space left on drive.
     */
    NO_SPACE,
    
    /**
     * Invalid argument.
     */
    INVALID_ARGUMENT,
    
    /**
     * Permission denied.
     */
    PERMISSION_DENIED,
    
    /**
     * Operation (or one of its parameters) not supported
     */
    NOT_SUPPORTED,
    
    /**
     * File isn&#39;t mounted.
     */
    NOT_MOUNTED,
    
    /**
     * File is already mounted.
     */
    ALREADY_MOUNTED,
    
    /**
     * File was closed.
     */
    CLOSED,
    
    /**
     * Operation was cancelled. See #GCancellable.
     */
    CANCELLED,
    
    /**
     * Operations are still pending.
     */
    PENDING,
    
    /**
     * File is read only.
     */
    READ_ONLY,
    
    /**
     * Backup couldn&#39;t be created.
     */
    CANT_CREATE_BACKUP,
    
    /**
     * File&#39;s Entity Tag was incorrect.
     */
    WRONG_ETAG,
    
    /**
     * Operation timed out.
     */
    TIMED_OUT,
    
    /**
     * Operation would be recursive.
     */
    WOULD_RECURSE,
    
    /**
     * File is busy.
     */
    BUSY,
    
    /**
     * Operation would block.
     */
    WOULD_BLOCK,
    
    /**
     * Host couldn&#39;t be found (remote operations).
     */
    HOST_NOT_FOUND,
    
    /**
     * Operation would merge files.
     */
    WOULD_MERGE,
    
    /**
     * Operation failed and a helper program has
     *     already interacted with the user. Do not display any error dialog.
     */
    FAILED_HANDLED,
    
    /**
     * The current process has too many files
     *     open and can&#39;t open any more. Duplicate descriptors do count toward
     *     this limit. Since 2.20
     */
    TOO_MANY_OPEN_FILES,
    
    /**
     * The object has not been initialized. Since 2.22
     */
    NOT_INITIALIZED,
    
    /**
     * The requested address is already in use. Since 2.22
     */
    ADDRESS_IN_USE,
    
    /**
     * Need more input to finish operation. Since 2.24
     */
    PARTIAL_INPUT,
    
    /**
     * The input data was invalid. Since 2.24
     */
    INVALID_DATA,
    
    /**
     * A remote object generated an error that
     *     doesn&#39;t correspond to a locally registered #GError error
     *     domain. Use g_dbus_error_get_remote_error() to extract the D-Bus
     *     error name and g_dbus_error_strip_remote_error() to fix up the
     *     message so it matches what was received on the wire. Since 2.26.
     */
    DBUS_ERROR,
    
    /**
     * Host unreachable. Since 2.26
     */
    HOST_UNREACHABLE,
    
    /**
     * Network unreachable. Since 2.26
     */
    NETWORK_UNREACHABLE,
    
    /**
     * Connection refused. Since 2.26
     */
    CONNECTION_REFUSED,
    
    /**
     * Connection to proxy server failed. Since 2.26
     */
    PROXY_FAILED,
    
    /**
     * Proxy authentication failed. Since 2.26
     */
    PROXY_AUTH_FAILED,
    
    /**
     * Proxy server needs authentication. Since 2.26
     */
    PROXY_NEED_AUTH,
    
    /**
     * Proxy connection is not allowed by ruleset.
     *     Since 2.26
     */
    PROXY_NOT_ALLOWED,
    
    /**
     * Broken pipe. Since 2.36
     */
    BROKEN_PIPE,
    
    /**
     * Connection closed by peer. Note that this
     *     is the same code as <code>G_IO_ERROR_BROKEN_PIPE;</code> before 2.44 some
     *     &#34;connection closed&#34; errors returned <code>G_IO_ERROR_BROKEN_PIPE,</code> but others
     *     returned <code>G_IO_ERROR_FAILED.</code> Now they should all return the same
     *     value, which has this more logical name. Since 2.44.
     */
    CONNECTION_CLOSED,
    
    /**
     * Transport endpoint is not connected. Since 2.44
     */
    NOT_CONNECTED,
    
    /**
     * Message too large. Since 2.48.
     */
    MESSAGE_TOO_LARGE;
    
    public static IOErrorEnum fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FAILED -> 0;
            case NOT_FOUND -> 1;
            case EXISTS -> 2;
            case IS_DIRECTORY -> 3;
            case NOT_DIRECTORY -> 4;
            case NOT_EMPTY -> 5;
            case NOT_REGULAR_FILE -> 6;
            case NOT_SYMBOLIC_LINK -> 7;
            case NOT_MOUNTABLE_FILE -> 8;
            case FILENAME_TOO_LONG -> 9;
            case INVALID_FILENAME -> 10;
            case TOO_MANY_LINKS -> 11;
            case NO_SPACE -> 12;
            case INVALID_ARGUMENT -> 13;
            case PERMISSION_DENIED -> 14;
            case NOT_SUPPORTED -> 15;
            case NOT_MOUNTED -> 16;
            case ALREADY_MOUNTED -> 17;
            case CLOSED -> 18;
            case CANCELLED -> 19;
            case PENDING -> 20;
            case READ_ONLY -> 21;
            case CANT_CREATE_BACKUP -> 22;
            case WRONG_ETAG -> 23;
            case TIMED_OUT -> 24;
            case WOULD_RECURSE -> 25;
            case BUSY -> 26;
            case WOULD_BLOCK -> 27;
            case HOST_NOT_FOUND -> 28;
            case WOULD_MERGE -> 29;
            case FAILED_HANDLED -> 30;
            case TOO_MANY_OPEN_FILES -> 31;
            case NOT_INITIALIZED -> 32;
            case ADDRESS_IN_USE -> 33;
            case PARTIAL_INPUT -> 34;
            case INVALID_DATA -> 35;
            case DBUS_ERROR -> 36;
            case HOST_UNREACHABLE -> 37;
            case NETWORK_UNREACHABLE -> 38;
            case CONNECTION_REFUSED -> 39;
            case PROXY_FAILED -> 40;
            case PROXY_AUTH_FAILED -> 41;
            case PROXY_NEED_AUTH -> 42;
            case PROXY_NOT_ALLOWED -> 43;
            case BROKEN_PIPE -> 44;
            case CONNECTION_CLOSED -> 44;
            case NOT_CONNECTED -> 45;
            case MESSAGE_TOO_LARGE -> 46;
        };
    }

}

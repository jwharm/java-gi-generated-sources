package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Support for UNIX-domain (also known as local) sockets.
 * <p>
 * UNIX domain sockets are generally visible in the filesystem.
 * However, some systems support abstract socket names which are not
 * visible in the filesystem and not affected by the filesystem
 * permissions, visibility, etc. Currently this is only supported
 * under Linux. If you attempt to use abstract sockets on other
 * systems, function calls may return <code>G_IO_ERROR_NOT_SUPPORTED
 * errors.</code> You can use g_unix_socket_address_abstract_names_supported()
 * to see if abstract names are supported.
 * <p>
 * Since GLib 2.72, #GUnixSocketAddress is available on all platforms. It
 * requires underlying system support (such as Windows 10 with <code>AF_UNIX</code>) at
 * run time.
 * <p>
 * Before GLib 2.72, <code>&#60;gio/gunixsocketaddress.h&#62;</code> belonged to the UNIX-specific
 * GIO interfaces, thus you had to use the <code>gio-unix-2.0.pc</code> pkg-config file
 * when using it. This is no longer necessary since GLib 2.72.
 */
public class UnixSocketAddress extends SocketAddress implements SocketConnectable {

    public UnixSocketAddress(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to UnixSocketAddress */
    public static UnixSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new UnixSocketAddress(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String path) {
        Reference RESULT = References.get(gtk_h.g_unix_socket_address_new(Interop.allocateNativeString(path).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GUnixSocketAddress for @path.
     * 
     * To create abstract socket addresses, on systems that support that,
     * use g_unix_socket_address_new_abstract().
     */
    public UnixSocketAddress(java.lang.String path) {
        super(constructNew(path));
    }
    
    private static Reference constructNewAbstract(byte[] path, int pathLen) {
        Reference RESULT = References.get(gtk_h.g_unix_socket_address_new_abstract(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, path)).handle(), pathLen), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED
     * #GUnixSocketAddress</code> for @path.
     */
    public static UnixSocketAddress newAbstract(byte[] path, int pathLen) {
        return new UnixSocketAddress(constructNewAbstract(path, pathLen));
    }
    
    private static Reference constructNewWithType(byte[] path, int pathLen, UnixSocketAddressType type) {
        Reference RESULT = References.get(gtk_h.g_unix_socket_address_new_with_type(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, path)).handle(), pathLen, type.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GUnixSocketAddress of type @type with name @path.
     * <p>
     * If @type is <code>G_UNIX_SOCKET_ADDRESS_PATH,</code> this is equivalent to
     * calling g_unix_socket_address_new().
     * <p>
     * If @type is <code>G_UNIX_SOCKET_ADDRESS_ANONYMOUS,</code> @path and @path_len will be
     * ignored.
     * <p>
     * If @path_type is <code>G_UNIX_SOCKET_ADDRESS_ABSTRACT,</code> then @path_len
     * bytes of @path will be copied to the socket&#39;s path, and only those
     * bytes will be considered part of the name. (If @path_len is -1,
     * then @path is assumed to be NUL-terminated.) For example, if @path
     * was &#34;test&#34;, then calling g_socket_address_get_native_size() on the
     * returned socket would return 7 (2 bytes of overhead, 1 byte for the
     * abstract-socket indicator byte, and 4 bytes for the name &#34;test&#34;).
     * <p>
     * If @path_type is <code>G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED,</code> then
     * @path_len bytes of @path will be copied to the socket&#39;s path, the
     * rest of the path will be padded with 0 bytes, and the entire
     * zero-padded buffer will be considered the name. (As above, if
     * @path_len is -1, then @path is assumed to be NUL-terminated.) In
     * this case, g_socket_address_get_native_size() will always return
     * the full size of a <code>struct sockaddr_un</code>, although
     * g_unix_socket_address_get_path_len() will still return just the
     * length of @path.
     * 
     * {@link org.gtk.gio.UnixSocketAddressType#ABSTRACT} is preferred over
     * {@link org.gtk.gio.UnixSocketAddressType#ABSTRACT_PADDED} for new programs. Of course,
     * when connecting to a server created by another process, you must
     * use the appropriate type corresponding to how that process created
     * its listening socket.
     */
    public static UnixSocketAddress newWithType(byte[] path, int pathLen, UnixSocketAddressType type) {
        return new UnixSocketAddress(constructNewWithType(path, pathLen, type));
    }
    
    /**
     * Gets @address&#39;s type.
     */
    public UnixSocketAddressType getAddressType() {
        var RESULT = gtk_h.g_unix_socket_address_get_address_type(handle());
        return UnixSocketAddressType.fromValue(RESULT);
    }
    
    /**
     * Gets @address&#39;s path, or for abstract sockets the &#34;name&#34;.
     * 
     * Guaranteed to be zero-terminated, but an abstract socket
     * may contain embedded zeros, and thus you should use
     * g_unix_socket_address_get_path_len() to get the true length
     * of this string.
     */
    public java.lang.String getPath() {
        var RESULT = gtk_h.g_unix_socket_address_get_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the length of @address&#39;s path.
     * 
     * For details, see g_unix_socket_address_get_path().
     */
    public long getPathLen() {
        var RESULT = gtk_h.g_unix_socket_address_get_path_len(handle());
        return RESULT;
    }
    
    /**
     * Checks if abstract UNIX domain socket names are supported.
     */
    public static boolean abstractNamesSupported() {
        var RESULT = gtk_h.g_unix_socket_address_abstract_names_supported();
        return (RESULT != 0);
    }
    
}

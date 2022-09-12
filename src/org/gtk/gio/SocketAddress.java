package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSocketAddress is the equivalent of struct sockaddr in the BSD
 * sockets API. This is an abstract class; use #GInetSocketAddress
 * for internet sockets, or #GUnixSocketAddress for UNIX domain sockets.
 */
public class SocketAddress extends org.gtk.gobject.Object implements SocketConnectable {

    public SocketAddress(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketAddress */
    public static SocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new SocketAddress(gobject.getReference());
    }
    
    private static Reference constructNewFromNative(jdk.incubator.foreign.MemoryAddress native_, long len) {
        Reference RESULT = References.get(gtk_h.g_socket_address_new_from_native(native_, len), true);
        return RESULT;
    }
    
    /**
     * Creates a #GSocketAddress subclass corresponding to the native
     * struct sockaddr @native.
     */
    public static SocketAddress newFromNative(jdk.incubator.foreign.MemoryAddress native_, long len) {
        return new SocketAddress(constructNewFromNative(native_, len));
    }
    
    /**
     * Gets the socket family type of @address.
     */
    public SocketFamily getFamily() {
        var RESULT = gtk_h.g_socket_address_get_family(handle());
        return SocketFamily.fromValue(RESULT);
    }
    
    /**
     * Gets the size of @address's native struct sockaddr.
     * You can use this to allocate memory to pass to
     * g_socket_address_to_native().
     */
    public long getNativeSize() {
        var RESULT = gtk_h.g_socket_address_get_native_size(handle());
        return RESULT;
    }
    
    /**
     * Converts a #GSocketAddress to a native struct sockaddr, which can
     * be passed to low-level functions like connect() or bind().
     * 
     * If not enough space is available, a %G_IO_ERROR_NO_SPACE error
     * is returned. If the address type is not known on the system
     * then a %G_IO_ERROR_NOT_SUPPORTED error is returned.
     */
    public boolean toNative(jdk.incubator.foreign.MemoryAddress dest, long destlen) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_address_to_native(handle(), dest, destlen, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}

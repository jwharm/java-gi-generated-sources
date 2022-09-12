package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Objects that describe one or more potential socket endpoints
 * implement #GSocketConnectable. Callers can then use
 * g_socket_connectable_enumerate() to get a #GSocketAddressEnumerator
 * to try out each socket address in turn until one succeeds, as shown
 * in the sample code below.
 * 
 * |[<!-- language="C" -->
 * MyConnectionType *
 * connect_to_host (const char    *hostname,
 *                  guint16        port,
 *                  GCancellable  *cancellable,
 *                  GError       **error)
 * {
 *   MyConnection *conn = NULL;
 *   GSocketConnectable *addr;
 *   GSocketAddressEnumerator *enumerator;
 *   GSocketAddress *sockaddr;
 *   GError *conn_error = NULL;
 * 
 *   addr = g_network_address_new (hostname, port);
 *   enumerator = g_socket_connectable_enumerate (addr);
 *   g_object_unref (addr);
 * 
 *   // Try each sockaddr until we succeed. Record the first connection error,
 *   // but not any further ones (since they'll probably be basically the same
 *   // as the first).
 *   while (!conn && (sockaddr = g_socket_address_enumerator_next (enumerator, cancellable, error))
 *     {
 *       conn = connect_to_sockaddr (sockaddr, conn_error ? NULL : &conn_error);
 *       g_object_unref (sockaddr);
 *     }
 *   g_object_unref (enumerator);
 * 
 *   if (conn)
 *     {
 *       if (conn_error)
 *         {
 *           // We couldn't connect to the first address, but we succeeded
 *           // in connecting to a later address.
 *           g_error_free (conn_error);
 *         }
 *       return conn;
 *     }
 *   else if (error)
 *     {
 *       /// Either initial lookup failed, or else the caller cancelled us.
 *       if (conn_error)
 *         g_error_free (conn_error);
 *       return NULL;
 *     }
 *   else
 *     {
 *       g_error_propagate (error, conn_error);
 *       return NULL;
 *     }
 * }
 * ]|
 */
public interface SocketConnectable extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Creates a #GSocketAddressEnumerator for @connectable.
     */
    public default SocketAddressEnumerator enumerate() {
        var RESULT = gtk_h.g_socket_connectable_enumerate(handle());
        return new SocketAddressEnumerator(References.get(RESULT, true));
    }
    
    /**
     * Creates a #GSocketAddressEnumerator for @connectable that will
     * return a #GProxyAddress for each of its addresses that you must connect
     * to via a proxy.
     * 
     * If @connectable does not implement
     * g_socket_connectable_proxy_enumerate(), this will fall back to
     * calling g_socket_connectable_enumerate().
     */
    public default SocketAddressEnumerator proxyEnumerate() {
        var RESULT = gtk_h.g_socket_connectable_proxy_enumerate(handle());
        return new SocketAddressEnumerator(References.get(RESULT, true));
    }
    
    /**
     * Format a #GSocketConnectable as a string. This is a human-readable format for
     * use in debugging output, and is not a stable serialization format. It is not
     * suitable for use in user interfaces as it exposes too much information for a
     * user.
     * 
     * If the #GSocketConnectable implementation does not support string formatting,
     * the implementation’s type name will be returned as a fallback.
     */
    public default java.lang.String toString_() {
        var RESULT = gtk_h.g_socket_connectable_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    class SocketConnectableImpl extends org.gtk.gobject.Object implements SocketConnectable {
        public SocketConnectableImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}

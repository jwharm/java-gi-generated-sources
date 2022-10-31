package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Objects that describe one or more potential socket endpoints
 * implement {@link SocketConnectable}. Callers can then use
 * g_socket_connectable_enumerate() to get a {@link SocketAddressEnumerator}
 * to try out each socket address in turn until one succeeds, as shown
 * in the sample code below.
 * <pre>{@code <!-- language="C" -->
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
 * }</pre>
 */
public interface SocketConnectable extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to SocketConnectable if its GType is a (or inherits from) "GSocketConnectable".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SocketConnectable" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSocketConnectable", a ClassCastException will be thrown.
     */
    public static SocketConnectable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GSocketConnectable"))) {
            return new SocketConnectableImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GSocketConnectable");
        }
    }
    
    /**
     * Creates a {@link SocketAddressEnumerator} for {@code connectable}.
     * @return a new {@link SocketAddressEnumerator}.
     */
    default @NotNull org.gtk.gio.SocketAddressEnumerator enumerate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_connectable_enumerate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketAddressEnumerator(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a {@link SocketAddressEnumerator} for {@code connectable} that will
     * return a {@link ProxyAddress} for each of its addresses that you must connect
     * to via a proxy.
     * <p>
     * If {@code connectable} does not implement
     * g_socket_connectable_proxy_enumerate(), this will fall back to
     * calling g_socket_connectable_enumerate().
     * @return a new {@link SocketAddressEnumerator}.
     */
    default @NotNull org.gtk.gio.SocketAddressEnumerator proxyEnumerate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_connectable_proxy_enumerate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketAddressEnumerator(Refcounted.get(RESULT, true));
    }
    
    /**
     * Format a {@link SocketConnectable} as a string. This is a human-readable format for
     * use in debugging output, and is not a stable serialization format. It is not
     * suitable for use in user interfaces as it exposes too much information for a
     * user.
     * <p>
     * If the {@link SocketConnectable} implementation does not support string formatting,
     * the implementation’s type name will be returned as a fallback.
     * @return the formatted string
     */
    default @NotNull java.lang.String toString_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_connectable_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_socket_connectable_enumerate = Interop.downcallHandle(
            "g_socket_connectable_enumerate",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_socket_connectable_proxy_enumerate = Interop.downcallHandle(
            "g_socket_connectable_proxy_enumerate",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_socket_connectable_to_string = Interop.downcallHandle(
            "g_socket_connectable_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class SocketConnectableImpl extends org.gtk.gobject.Object implements SocketConnectable {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public SocketConnectableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

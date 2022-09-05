package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An IPv4 or IPv6 socket address; that is, the combination of a
 * #GInetAddress and a port number.
 */
public class InetSocketAddress extends SocketAddress implements SocketConnectable {

    public InetSocketAddress(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to InetSocketAddress */
    public static InetSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new InetSocketAddress(gobject.getProxy());
    }
    
    /**
     * Creates a new #GInetSocketAddress for @address and @port.
     */
    public InetSocketAddress(InetAddress address, short port) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_socket_address_new(address.HANDLE(), port), true));
    }
    
    /**
     * Creates a new #GInetSocketAddress for @address and @port.
     * 
     * If @address is an IPv6 address, it can also contain a scope ID
     * (separated from the address by a `%`).
     */
    public InetSocketAddress(java.lang.String address, int port) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_socket_address_new_from_string(Interop.allocateNativeString(address).HANDLE(), port), true));
    }
    
    /**
     * Gets @address's #GInetAddress.
     */
    public InetAddress getAddress() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_socket_address_get_address(HANDLE());
        return new InetAddress(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the `sin6_flowinfo` field from @address,
     * which must be an IPv6 address.
     */
    public int getFlowinfo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_socket_address_get_flowinfo(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets @address's port.
     */
    public short getPort() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_socket_address_get_port(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the `sin6_scope_id` field from @address,
     * which must be an IPv6 address.
     */
    public int getScopeId() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_socket_address_get_scope_id(HANDLE());
        return RESULT;
    }
    
}

package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Support for proxied #GInetSocketAddress.
 */
public class ProxyAddress extends InetSocketAddress implements SocketConnectable {

    public ProxyAddress(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ProxyAddress */
    public static ProxyAddress castFrom(org.gtk.gobject.Object gobject) {
        return new ProxyAddress(gobject.getProxy());
    }
    
    /**
     * Creates a new #GProxyAddress for @inetaddr with @protocol that should
     * tunnel through @dest_hostname and @dest_port.
     * 
     * (Note that this method doesn't set the #GProxyAddress:uri or
     * #GProxyAddress:destination-protocol fields; use g_object_new()
     * directly if you want to set those.)
     */
    public ProxyAddress(InetAddress inetaddr, short port, java.lang.String protocol, java.lang.String destHostname, short destPort, java.lang.String username, java.lang.String password) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_address_new(inetaddr.HANDLE(), port, Interop.getAllocator().allocateUtf8String(protocol), Interop.getAllocator().allocateUtf8String(destHostname), destPort, Interop.getAllocator().allocateUtf8String(username), Interop.getAllocator().allocateUtf8String(password)), true));
    }
    
    /**
     * Gets @proxy's destination hostname; that is, the name of the host
     * that will be connected to via the proxy, not the name of the proxy
     * itself.
     */
    public java.lang.String getDestinationHostname() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_address_get_destination_hostname(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @proxy's destination port; that is, the port on the
     * destination host that will be connected to via the proxy, not the
     * port number of the proxy itself.
     */
    public short getDestinationPort() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_address_get_destination_port(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the protocol that is being spoken to the destination
     * server; eg, "http" or "ftp".
     */
    public java.lang.String getDestinationProtocol() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_address_get_destination_protocol(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @proxy's password.
     */
    public java.lang.String getPassword() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_address_get_password(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @proxy's protocol. eg, "socks" or "http"
     */
    public java.lang.String getProtocol() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_address_get_protocol(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the proxy URI that @proxy was constructed from.
     */
    public java.lang.String getUri() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_address_get_uri(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @proxy's username.
     */
    public java.lang.String getUsername() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_address_get_username(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
}

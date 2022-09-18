package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Support for proxied {@link org.gtk.gio.InetSocketAddress}
 */
public class ProxyAddress extends InetSocketAddress implements SocketConnectable {

    public ProxyAddress(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ProxyAddress */
    public static ProxyAddress castFrom(org.gtk.gobject.Object gobject) {
        return new ProxyAddress(gobject.getReference());
    }
    
    private static Reference constructNew(InetAddress inetaddr, short port, java.lang.String protocol, java.lang.String destHostname, short destPort, java.lang.String username, java.lang.String password) {
        Reference RESULT = References.get(gtk_h.g_proxy_address_new(inetaddr.handle(), port, Interop.allocateNativeString(protocol).handle(), Interop.allocateNativeString(destHostname).handle(), destPort, Interop.allocateNativeString(username).handle(), Interop.allocateNativeString(password).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.ProxyAddress} for @inetaddr with @protocol that should
     * tunnel through @dest_hostname and @dest_port.
     * 
     * (Note that this method doesn&<code>#39</code> t set the {@link org.gtk.gio.ProxyAddress} uri or
     * {@link org.gtk.gio.ProxyAddress} destination-protocol fields; use g_object_new()
     * directly if you want to set those.)
     */
    public ProxyAddress(InetAddress inetaddr, short port, java.lang.String protocol, java.lang.String destHostname, short destPort, java.lang.String username, java.lang.String password) {
        super(constructNew(inetaddr, port, protocol, destHostname, destPort, username, password));
    }
    
    /**
     * Gets @proxy&<code>#39</code> s destination hostname; that is, the name of the host
     * that will be connected to via the proxy, not the name of the proxy
     * itself.
     */
    public java.lang.String getDestinationHostname() {
        var RESULT = gtk_h.g_proxy_address_get_destination_hostname(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @proxy&<code>#39</code> s destination port; that is, the port on the
     * destination host that will be connected to via the proxy, not the
     * port number of the proxy itself.
     */
    public short getDestinationPort() {
        var RESULT = gtk_h.g_proxy_address_get_destination_port(handle());
        return RESULT;
    }
    
    /**
     * Gets the protocol that is being spoken to the destination
     * server; eg, &<code>#34</code> http&<code>#34</code>  or &<code>#34</code> ftp&<code>#34</code> .
     */
    public java.lang.String getDestinationProtocol() {
        var RESULT = gtk_h.g_proxy_address_get_destination_protocol(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @proxy&<code>#39</code> s password.
     */
    public java.lang.String getPassword() {
        var RESULT = gtk_h.g_proxy_address_get_password(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @proxy&<code>#39</code> s protocol. eg, &<code>#34</code> socks&<code>#34</code>  or &<code>#34</code> http&<code>#34</code>
     */
    public java.lang.String getProtocol() {
        var RESULT = gtk_h.g_proxy_address_get_protocol(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the proxy URI that @proxy was constructed from.
     */
    public java.lang.String getUri() {
        var RESULT = gtk_h.g_proxy_address_get_uri(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @proxy&<code>#39</code> s username.
     */
    public java.lang.String getUsername() {
        var RESULT = gtk_h.g_proxy_address_get_username(handle());
        return RESULT.getUtf8String(0);
    }
    
}

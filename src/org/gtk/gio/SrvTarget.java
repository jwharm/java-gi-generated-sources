package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * SRV (service) records are used by some network protocols to provide
 * service-specific aliasing and load-balancing. For example, XMPP
 * (Jabber) uses SRV records to locate the XMPP server for a domain;
 * rather than connecting directly to "example.com" or assuming a
 * specific server hostname like "xmpp.example.com", an XMPP client
 * would look up the "xmpp-client" SRV record for "example.com", and
 * then connect to whatever host was pointed to by that record.
 * 
 * You can use g_resolver_lookup_service() or
 * g_resolver_lookup_service_async() to find the #GSrvTargets
 * for a given service. However, if you are simply planning to connect
 * to the remote service, you can use #GNetworkService's
 * #GSocketConnectable interface and not need to worry about
 * #GSrvTarget at all.
 */
public class SrvTarget extends io.github.jwharm.javagi.interop.ResourceBase {

    public SrvTarget(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new #GSrvTarget with the given parameters.
     * 
     * You should not need to use this; normally #GSrvTargets are
     * created by #GResolver.
     */
    public SrvTarget(java.lang.String hostname, short port, short priority, short weight) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_srv_target_new(Interop.getAllocator().allocateUtf8String(hostname), port, priority, weight), true));
    }
    
    /**
     * Copies @target
     */
    public SrvTarget copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_srv_target_copy(HANDLE());
        return new SrvTarget(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Frees @target
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_srv_target_free(HANDLE());
    }
    
    /**
     * Gets @target's hostname (in ASCII form; if you are going to present
     * this to the user, you should use g_hostname_is_ascii_encoded() to
     * check if it contains encoded Unicode segments, and use
     * g_hostname_to_unicode() to convert it if it does.)
     */
    public java.lang.String getHostname() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_srv_target_get_hostname(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @target's port
     */
    public short getPort() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_srv_target_get_port(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets @target's priority. You should not need to look at this;
     * #GResolver already sorts the targets according to the algorithm in
     * RFC 2782.
     */
    public short getPriority() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_srv_target_get_priority(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets @target's weight. You should not need to look at this;
     * #GResolver already sorts the targets according to the algorithm in
     * RFC 2782.
     */
    public short getWeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_srv_target_get_weight(HANDLE());
        return RESULT;
    }
    
}

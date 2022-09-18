package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * SRV (service) records are used by some network protocols to provide
 * service-specific aliasing and load-balancing. For example, XMPP
 * (Jabber) uses SRV records to locate the XMPP server for a domain;
 * rather than connecting directly to &<code>#34</code> example.com&<code>#34</code>  or assuming a
 * specific server hostname like &<code>#34</code> xmpp.example.com&<code>#34</code> , an XMPP client
 * would look up the &<code>#34</code> xmpp-client&<code>#34</code>  SRV record for &<code>#34</code> example.com&<code>#34</code> , and
 * then connect to whatever host was pointed to by that record.
 * 
 * You can use g_resolver_lookup_service() or
 * g_resolver_lookup_service_async() to find the <code>#GSrvTargets</code> for a given service. However, if you are simply planning to connect
 * to the remote service, you can use {@link org.gtk.gio.NetworkService} <code>#39</code> s
 * {@link org.gtk.gio.SocketConnectable} interface and not need to worry about
 * {@link org.gtk.gio.SrvTarget} at all.
 */
public class SrvTarget extends io.github.jwharm.javagi.ResourceBase {

    public SrvTarget(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String hostname, short port, short priority, short weight) {
        Reference RESULT = References.get(gtk_h.g_srv_target_new(Interop.allocateNativeString(hostname).handle(), port, priority, weight), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.SrvTarget} with the given parameters.
     * 
     * You should not need to use this; normally <code>#GSrvTargets</code> are
     * created by {@link org.gtk.gio.Resolver}
     */
    public SrvTarget(java.lang.String hostname, short port, short priority, short weight) {
        super(constructNew(hostname, port, priority, weight));
    }
    
    /**
     * Copies @target
     */
    public SrvTarget copy() {
        var RESULT = gtk_h.g_srv_target_copy(handle());
        return new SrvTarget(References.get(RESULT, true));
    }
    
    /**
     * Frees @target
     */
    public void free() {
        gtk_h.g_srv_target_free(handle());
    }
    
    /**
     * Gets @target&<code>#39</code> s hostname (in ASCII form; if you are going to present
     * this to the user, you should use g_hostname_is_ascii_encoded() to
     * check if it contains encoded Unicode segments, and use
     * g_hostname_to_unicode() to convert it if it does.)
     */
    public java.lang.String getHostname() {
        var RESULT = gtk_h.g_srv_target_get_hostname(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @target&<code>#39</code> s port
     */
    public short getPort() {
        var RESULT = gtk_h.g_srv_target_get_port(handle());
        return RESULT;
    }
    
    /**
     * Gets @target&<code>#39</code> s priority. You should not need to look at this;
     * {@link org.gtk.gio.Resolver} already sorts the targets according to the algorithm in
     * RFC 2782.
     */
    public short getPriority() {
        var RESULT = gtk_h.g_srv_target_get_priority(handle());
        return RESULT;
    }
    
    /**
     * Gets @target&<code>#39</code> s weight. You should not need to look at this;
     * {@link org.gtk.gio.Resolver} already sorts the targets according to the algorithm in
     * RFC 2782.
     */
    public short getWeight() {
        var RESULT = gtk_h.g_srv_target_get_weight(handle());
        return RESULT;
    }
    
    /**
     * Sorts @targets in place according to the algorithm in RFC 2782.
     */
    public static org.gtk.glib.List listSort(org.gtk.glib.List targets) {
        var RESULT = gtk_h.g_srv_target_list_sort(targets.handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
}

package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Like #GNetworkAddress does with hostnames, #GNetworkService
 * provides an easy way to resolve a SRV record, and then attempt to
 * connect to one of the hosts that implements that service, handling
 * service priority/weighting, multiple IP addresses, and multiple
 * address families.
 * 
 * See #GSrvTarget for more information about SRV records, and see
 * #GSocketConnectable for an example of using the connectable
 * interface.
 */
public class NetworkService extends org.gtk.gobject.Object implements SocketConnectable {

    public NetworkService(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NetworkService */
    public static NetworkService castFrom(org.gtk.gobject.Object gobject) {
        return new NetworkService(gobject.getReference());
    }
    
    /**
     * Creates a new #GNetworkService representing the given @service,
     * @protocol, and @domain. This will initially be unresolved; use the
     * #GSocketConnectable interface to resolve it.
     */
    public NetworkService(java.lang.String service, java.lang.String protocol, java.lang.String domain) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_service_new(Interop.allocateNativeString(service).HANDLE(), Interop.allocateNativeString(protocol).HANDLE(), Interop.allocateNativeString(domain).HANDLE()), true));
    }
    
    /**
     * Gets the domain that @srv serves. This might be either UTF-8 or
     * ASCII-encoded, depending on what @srv was created with.
     */
    public java.lang.String getDomain() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_service_get_domain(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @srv's protocol name (eg, "tcp").
     */
    public java.lang.String getProtocol() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_service_get_protocol(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     */
    public java.lang.String getScheme() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_service_get_scheme(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @srv's service name (eg, "ldap").
     */
    public java.lang.String getService() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_service_get_service(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Set's the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     */
    public void setScheme(java.lang.String scheme) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_network_service_set_scheme(HANDLE(), Interop.allocateNativeString(scheme).HANDLE());
    }
    
}

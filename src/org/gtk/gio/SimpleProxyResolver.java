package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.SimpleProxyResolver} is a simple {@link org.gtk.gio.ProxyResolver} implementation
 * that handles a single default proxy, multiple URI-scheme-specific
 * proxies, and a list of hosts that proxies should not be used for.
 * 
 * {@link org.gtk.gio.SimpleProxyResolver} is never the default proxy resolver, but it
 * can be used as the base class for another proxy resolver
 * implementation, or it can be created and used manually, such as
 * with g_socket_client_set_proxy_resolver().
 */
public class SimpleProxyResolver extends org.gtk.gobject.Object implements ProxyResolver {

    public SimpleProxyResolver(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SimpleProxyResolver */
    public static SimpleProxyResolver castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleProxyResolver(gobject.getReference());
    }
    
    /**
     * Sets the default proxy on @resolver, to be used for any URIs that
     * don&<code>#39</code> t match {@link org.gtk.gio.SimpleProxyResolver} ignore-hosts or a proxy set
     * via g_simple_proxy_resolver_set_uri_proxy().
     * 
     * If @default_proxy starts with &<code>#34</code> socks://&<code>#34</code> ,
     * {@link org.gtk.gio.SimpleProxyResolver} will treat it as referring to all three of
     * the socks5, socks4a, and socks4 proxy types.
     */
    public void setDefaultProxy(java.lang.String defaultProxy) {
        gtk_h.g_simple_proxy_resolver_set_default_proxy(handle(), Interop.allocateNativeString(defaultProxy).handle());
    }
    
    /**
     * Sets the list of ignored hosts.
     * 
     * See {@link org.gtk.gio.SimpleProxyResolver} ignore-hosts for more details on how the
     * @ignore_hosts argument is interpreted.
     */
    public void setIgnoreHosts(java.lang.String[] ignoreHosts) {
        gtk_h.g_simple_proxy_resolver_set_ignore_hosts(handle(), Interop.allocateNativeArray(ignoreHosts).handle());
    }
    
    /**
     * Adds a URI-scheme-specific proxy to @resolver; URIs whose scheme
     * matches @uri_scheme (and which don&<code>#39</code> t match
     * {@link org.gtk.gio.SimpleProxyResolver} ignore-hosts) will be proxied via @proxy.
     * 
     * As with {@link org.gtk.gio.SimpleProxyResolver} default-proxy, if @proxy starts with
     * &<code>#34</code> socks://&<code>#34</code> , {@link org.gtk.gio.SimpleProxyResolver} will treat it
     * as referring to all three of the socks5, socks4a, and socks4 proxy
     * types.
     */
    public void setUriProxy(java.lang.String uriScheme, java.lang.String proxy) {
        gtk_h.g_simple_proxy_resolver_set_uri_proxy(handle(), Interop.allocateNativeString(uriScheme).handle(), Interop.allocateNativeString(proxy).handle());
    }
    
    /**
     * Creates a new {@link org.gtk.gio.SimpleProxyResolver}  See
     * {@link org.gtk.gio.SimpleProxyResolver} default-proxy and
     * {@link org.gtk.gio.SimpleProxyResolver} ignore-hosts for more details on how the
     * arguments are interpreted.
     */
    public static ProxyResolver new_(java.lang.String defaultProxy, java.lang.String[] ignoreHosts) {
        var RESULT = gtk_h.g_simple_proxy_resolver_new(Interop.allocateNativeString(defaultProxy).handle(), Interop.allocateNativeArray(ignoreHosts).handle());
        return new ProxyResolver.ProxyResolverImpl(References.get(RESULT, true));
    }
    
}

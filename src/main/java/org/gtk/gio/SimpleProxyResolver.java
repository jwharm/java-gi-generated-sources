package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link SimpleProxyResolver} is a simple {@link ProxyResolver} implementation
 * that handles a single default proxy, multiple URI-scheme-specific
 * proxies, and a list of hosts that proxies should not be used for.
 * <p>
 * {@link SimpleProxyResolver} is never the default proxy resolver, but it
 * can be used as the base class for another proxy resolver
 * implementation, or it can be created and used manually, such as
 * with g_socket_client_set_proxy_resolver().
 */
public class SimpleProxyResolver extends org.gtk.gobject.Object implements ProxyResolver {

    public SimpleProxyResolver(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SimpleProxyResolver */
    public static SimpleProxyResolver castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleProxyResolver(gobject.refcounted());
    }
    
    /**
     * Sets the default proxy on {@code resolver}, to be used for any URIs that
     * don't match {@link SimpleProxyResolver}:ignore-hosts or a proxy set
     * via g_simple_proxy_resolver_set_uri_proxy().
     * <p>
     * If {@code default_proxy} starts with "socks://",
     * {@link SimpleProxyResolver} will treat it as referring to all three of
     * the socks5, socks4a, and socks4 proxy types.
     */
    public void setDefaultProxy(java.lang.String defaultProxy) {
        gtk_h.g_simple_proxy_resolver_set_default_proxy(handle(), Interop.allocateNativeString(defaultProxy).handle());
    }
    
    /**
     * Sets the list of ignored hosts.
     * <p>
     * See {@link SimpleProxyResolver}:ignore-hosts for more details on how the
     * {@code ignore_hosts} argument is interpreted.
     */
    public void setIgnoreHosts(java.lang.String[] ignoreHosts) {
        gtk_h.g_simple_proxy_resolver_set_ignore_hosts(handle(), Interop.allocateNativeArray(ignoreHosts).handle());
    }
    
    /**
     * Adds a URI-scheme-specific proxy to {@code resolver}; URIs whose scheme
     * matches {@code uri_scheme} (and which don't match
     * {@link SimpleProxyResolver}:ignore-hosts) will be proxied via {@code proxy}.
     * <p>
     * As with {@link SimpleProxyResolver}:default-proxy, if {@code proxy} starts with
     * "socks://", {@link SimpleProxyResolver} will treat it
     * as referring to all three of the socks5, socks4a, and socks4 proxy
     * types.
     */
    public void setUriProxy(java.lang.String uriScheme, java.lang.String proxy) {
        gtk_h.g_simple_proxy_resolver_set_uri_proxy(handle(), Interop.allocateNativeString(uriScheme).handle(), Interop.allocateNativeString(proxy).handle());
    }
    
    /**
     * Creates a new {@link SimpleProxyResolver}. See
     * {@link SimpleProxyResolver}:default-proxy and
     * {@link SimpleProxyResolver}:ignore-hosts for more details on how the
     * arguments are interpreted.
     */
    public static ProxyResolver new_(java.lang.String defaultProxy, java.lang.String[] ignoreHosts) {
        var RESULT = gtk_h.g_simple_proxy_resolver_new(Interop.allocateNativeString(defaultProxy).handle(), Interop.allocateNativeArray(ignoreHosts).handle());
        return new ProxyResolver.ProxyResolverImpl(Refcounted.get(RESULT, true));
    }
    
}

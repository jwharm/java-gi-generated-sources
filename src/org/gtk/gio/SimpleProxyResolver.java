package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSimpleProxyResolver is a simple #GProxyResolver implementation
 * that handles a single default proxy, multiple URI-scheme-specific
 * proxies, and a list of hosts that proxies should not be used for.
 * 
 * #GSimpleProxyResolver is never the default proxy resolver, but it
 * can be used as the base class for another proxy resolver
 * implementation, or it can be created and used manually, such as
 * with g_socket_client_set_proxy_resolver().
 */
public class SimpleProxyResolver extends org.gtk.gobject.Object implements ProxyResolver {

    public SimpleProxyResolver(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to SimpleProxyResolver */
    public static SimpleProxyResolver castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleProxyResolver(gobject.getProxy());
    }
    
    /**
     * Sets the default proxy on @resolver, to be used for any URIs that
     * don't match #GSimpleProxyResolver:ignore-hosts or a proxy set
     * via g_simple_proxy_resolver_set_uri_proxy().
     * 
     * If @default_proxy starts with "socks://",
     * #GSimpleProxyResolver will treat it as referring to all three of
     * the socks5, socks4a, and socks4 proxy types.
     */
    public void setDefaultProxy(java.lang.String defaultProxy) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_simple_proxy_resolver_set_default_proxy(HANDLE(), Interop.getAllocator().allocateUtf8String(defaultProxy));
    }
    
    /**
     * Sets the list of ignored hosts.
     * 
     * See #GSimpleProxyResolver:ignore-hosts for more details on how the
     * @ignore_hosts argument is interpreted.
     */
    public void setIgnoreHosts(java.lang.String[] ignoreHosts) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_simple_proxy_resolver_set_ignore_hosts(HANDLE(), Interop.allocateNativeArray(ignoreHosts));
    }
    
    /**
     * Adds a URI-scheme-specific proxy to @resolver; URIs whose scheme
     * matches @uri_scheme (and which don't match
     * #GSimpleProxyResolver:ignore-hosts) will be proxied via @proxy.
     * 
     * As with #GSimpleProxyResolver:default-proxy, if @proxy starts with
     * "socks://", #GSimpleProxyResolver will treat it
     * as referring to all three of the socks5, socks4a, and socks4 proxy
     * types.
     */
    public void setUriProxy(java.lang.String uriScheme, java.lang.String proxy) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_simple_proxy_resolver_set_uri_proxy(HANDLE(), Interop.getAllocator().allocateUtf8String(uriScheme), Interop.getAllocator().allocateUtf8String(proxy));
    }
    
}

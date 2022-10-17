package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle g_simple_proxy_resolver_set_default_proxy = Interop.downcallHandle(
        "g_simple_proxy_resolver_set_default_proxy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the default proxy on {@code resolver}, to be used for any URIs that
     * don't match {@link SimpleProxyResolver}:ignore-hosts or a proxy set
     * via g_simple_proxy_resolver_set_uri_proxy().
     * <p>
     * If {@code default_proxy} starts with "socks://",
     * {@link SimpleProxyResolver} will treat it as referring to all three of
     * the socks5, socks4a, and socks4 proxy types.
     */
    public @NotNull void setDefaultProxy(@NotNull java.lang.String defaultProxy) {
        try {
            g_simple_proxy_resolver_set_default_proxy.invokeExact(handle(), Interop.allocateNativeString(defaultProxy));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_simple_proxy_resolver_set_ignore_hosts = Interop.downcallHandle(
        "g_simple_proxy_resolver_set_ignore_hosts",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the list of ignored hosts.
     * <p>
     * See {@link SimpleProxyResolver}:ignore-hosts for more details on how the
     * {@code ignore_hosts} argument is interpreted.
     */
    public @NotNull void setIgnoreHosts(@NotNull java.lang.String[] ignoreHosts) {
        try {
            g_simple_proxy_resolver_set_ignore_hosts.invokeExact(handle(), Interop.allocateNativeArray(ignoreHosts));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_simple_proxy_resolver_set_uri_proxy = Interop.downcallHandle(
        "g_simple_proxy_resolver_set_uri_proxy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void setUriProxy(@NotNull java.lang.String uriScheme, @NotNull java.lang.String proxy) {
        try {
            g_simple_proxy_resolver_set_uri_proxy.invokeExact(handle(), Interop.allocateNativeString(uriScheme), Interop.allocateNativeString(proxy));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_simple_proxy_resolver_new = Interop.downcallHandle(
        "g_simple_proxy_resolver_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link SimpleProxyResolver}. See
     * {@link SimpleProxyResolver}:default-proxy and
     * {@link SimpleProxyResolver}:ignore-hosts for more details on how the
     * arguments are interpreted.
     */
    public static @NotNull ProxyResolver new_(@Nullable java.lang.String defaultProxy, @Nullable java.lang.String[] ignoreHosts) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_simple_proxy_resolver_new.invokeExact(Interop.allocateNativeString(defaultProxy), Interop.allocateNativeArray(ignoreHosts));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ProxyResolver.ProxyResolverImpl(Refcounted.get(RESULT, true));
    }
    
}

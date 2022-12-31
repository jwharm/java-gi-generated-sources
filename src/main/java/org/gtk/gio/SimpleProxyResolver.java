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
 * @version 2.36
 */
public class SimpleProxyResolver extends org.gtk.gobject.GObject implements org.gtk.gio.ProxyResolver {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleProxyResolver";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a SimpleProxyResolver proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SimpleProxyResolver(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SimpleProxyResolver> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SimpleProxyResolver(input, ownership);
    
    /**
     * Sets the default proxy on {@code resolver}, to be used for any URIs that
     * don't match {@link SimpleProxyResolver}:ignore-hosts or a proxy set
     * via g_simple_proxy_resolver_set_uri_proxy().
     * <p>
     * If {@code default_proxy} starts with "socks://",
     * {@link SimpleProxyResolver} will treat it as referring to all three of
     * the socks5, socks4a, and socks4 proxy types.
     * @param defaultProxy the default proxy to use
     */
    public void setDefaultProxy(@Nullable java.lang.String defaultProxy) {
        try {
            DowncallHandles.g_simple_proxy_resolver_set_default_proxy.invokeExact(
                    handle(),
                    (Addressable) (defaultProxy == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(defaultProxy, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the list of ignored hosts.
     * <p>
     * See {@link SimpleProxyResolver}:ignore-hosts for more details on how the
     * {@code ignore_hosts} argument is interpreted.
     * @param ignoreHosts {@code null}-terminated list of hosts/IP addresses
     *     to not use a proxy for
     */
    public void setIgnoreHosts(java.lang.String[] ignoreHosts) {
        try {
            DowncallHandles.g_simple_proxy_resolver_set_ignore_hosts.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(ignoreHosts, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param uriScheme the URI scheme to add a proxy for
     * @param proxy the proxy to use for {@code uri_scheme}
     */
    public void setUriProxy(java.lang.String uriScheme, java.lang.String proxy) {
        try {
            DowncallHandles.g_simple_proxy_resolver_set_uri_proxy.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(uriScheme, null),
                    Marshal.stringToAddress.marshal(proxy, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_simple_proxy_resolver_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new {@link SimpleProxyResolver}. See
     * {@link SimpleProxyResolver}:default-proxy and
     * {@link SimpleProxyResolver}:ignore-hosts for more details on how the
     * arguments are interpreted.
     * @param defaultProxy the default proxy to use, eg
     *     "socks://192.168.1.1"
     * @param ignoreHosts an optional list of hosts/IP addresses
     *     to not use a proxy for.
     * @return a new {@link SimpleProxyResolver}
     */
    public static org.gtk.gio.ProxyResolver new_(@Nullable java.lang.String defaultProxy, @Nullable java.lang.String[] ignoreHosts) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_proxy_resolver_new.invokeExact(
                    (Addressable) (defaultProxy == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(defaultProxy, null)),
                    (Addressable) (ignoreHosts == null ? MemoryAddress.NULL : Interop.allocateNativeArray(ignoreHosts, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ProxyResolver) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.ProxyResolver.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * A {@link SimpleProxyResolver.Builder} object constructs a {@link SimpleProxyResolver} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SimpleProxyResolver.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SimpleProxyResolver} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SimpleProxyResolver}.
         * @return A new instance of {@code SimpleProxyResolver} with the properties 
         *         that were set in the Builder object.
         */
        public SimpleProxyResolver build() {
            return (SimpleProxyResolver) org.gtk.gobject.GObject.newWithProperties(
                SimpleProxyResolver.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The default proxy URI that will be used for any URI that doesn't
         * match {@link SimpleProxyResolver}:ignore-hosts, and doesn't match any
         * of the schemes set with g_simple_proxy_resolver_set_uri_proxy().
         * <p>
         * Note that as a special case, if this URI starts with
         * "socks://", {@link SimpleProxyResolver} will treat it as referring
         * to all three of the socks5, socks4a, and socks4 proxy types.
         * @param defaultProxy The value for the {@code default-proxy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDefaultProxy(java.lang.String defaultProxy) {
            names.add("default-proxy");
            values.add(org.gtk.gobject.Value.create(defaultProxy));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_simple_proxy_resolver_set_default_proxy = Interop.downcallHandle(
            "g_simple_proxy_resolver_set_default_proxy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_proxy_resolver_set_ignore_hosts = Interop.downcallHandle(
            "g_simple_proxy_resolver_set_ignore_hosts",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_proxy_resolver_set_uri_proxy = Interop.downcallHandle(
            "g_simple_proxy_resolver_set_uri_proxy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_proxy_resolver_get_type = Interop.downcallHandle(
            "g_simple_proxy_resolver_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_simple_proxy_resolver_new = Interop.downcallHandle(
            "g_simple_proxy_resolver_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}

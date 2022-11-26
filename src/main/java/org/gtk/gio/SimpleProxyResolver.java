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
public class SimpleProxyResolver extends org.gtk.gobject.Object implements org.gtk.gio.ProxyResolver {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleProxyResolver";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a SimpleProxyResolver proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SimpleProxyResolver(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SimpleProxyResolver if its GType is a (or inherits from) "GSimpleProxyResolver".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SimpleProxyResolver} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSimpleProxyResolver", a ClassCastException will be thrown.
     */
    public static SimpleProxyResolver castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), SimpleProxyResolver.getType())) {
            return new SimpleProxyResolver(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSimpleProxyResolver");
        }
    }
    
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
                    (Addressable) (defaultProxy == null ? MemoryAddress.NULL : Interop.allocateNativeString(defaultProxy)));
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
    public void setIgnoreHosts(@NotNull java.lang.String[] ignoreHosts) {
        java.util.Objects.requireNonNull(ignoreHosts, "Parameter 'ignoreHosts' must not be null");
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
    public void setUriProxy(@NotNull java.lang.String uriScheme, @NotNull java.lang.String proxy) {
        java.util.Objects.requireNonNull(uriScheme, "Parameter 'uriScheme' must not be null");
        java.util.Objects.requireNonNull(proxy, "Parameter 'proxy' must not be null");
        try {
            DowncallHandles.g_simple_proxy_resolver_set_uri_proxy.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uriScheme),
                    Interop.allocateNativeString(proxy));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.gtk.gio.ProxyResolver new_(@Nullable java.lang.String defaultProxy, @Nullable java.lang.String[] ignoreHosts) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_proxy_resolver_new.invokeExact(
                    (Addressable) (defaultProxy == null ? MemoryAddress.NULL : Interop.allocateNativeString(defaultProxy)),
                    (Addressable) (ignoreHosts == null ? MemoryAddress.NULL : Interop.allocateNativeArray(ignoreHosts, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ProxyResolver.ProxyResolverImpl(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link SimpleProxyResolver.Build} object constructs a {@link SimpleProxyResolver} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SimpleProxyResolver} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SimpleProxyResolver} using {@link SimpleProxyResolver#castFrom}.
         * @return A new instance of {@code SimpleProxyResolver} with the properties 
         *         that were set in the Build object.
         */
        public SimpleProxyResolver construct() {
            return SimpleProxyResolver.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SimpleProxyResolver.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setDefaultProxy(java.lang.String defaultProxy) {
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

package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ProxyResolver} provides synchronous and asynchronous network proxy
 * resolution. {@link ProxyResolver} is used within {@link SocketClient} through
 * the method g_socket_connectable_proxy_enumerate().
 * <p>
 * Implementations of {@link ProxyResolver} based on libproxy and GNOME settings can
 * be found in glib-networking. GIO comes with an implementation for use inside
 * Flatpak portals.
 * @version 2.26
 */
public interface ProxyResolver extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyResolverImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ProxyResolverImpl(input);
    
    /**
     * Checks if {@code resolver} can be used on this system. (This is used
     * internally; g_proxy_resolver_get_default() will only return a proxy
     * resolver that returns {@code true} for this method.)
     * @return {@code true} if {@code resolver} is supported.
     */
    default boolean isSupported() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_proxy_resolver_is_supported.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Looks into the system proxy configuration to determine what proxy,
     * if any, to use to connect to {@code uri}. The returned proxy URIs are of
     * the form {@code <protocol>://[user[:password]@]host:port} or
     * {@code direct://}, where &lt;protocol&gt; could be http, rtsp, socks
     * or other proxying protocol.
     * <p>
     * If you don't know what network protocol is being used on the
     * socket, you should use {@code none} as the URI protocol.
     * In this case, the resolver might still return a generic proxy type
     * (such as SOCKS), but would not return protocol-specific proxy types
     * (such as http).
     * <p>
     * {@code direct://} is used when no proxy is needed.
     * Direct connection should not be attempted unless it is part of the
     * returned array of proxies.
     * @param uri a URI representing the destination to connect to
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return A
     *               NULL-terminated array of proxy URIs. Must be freed
     *               with g_strfreev().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default PointerString lookup(java.lang.String uri, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_proxy_resolver_lookup.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Asynchronous lookup of proxy. See g_proxy_resolver_lookup() for more
     * details.
     * @param uri a URI representing the destination to connect to
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call after resolution completes
     */
    default void lookupAsync(java.lang.String uri, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_proxy_resolver_lookup_async.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Call this function to obtain the array of proxy URIs when
     * g_proxy_resolver_lookup_async() is complete. See
     * g_proxy_resolver_lookup() for more details.
     * @param result the result passed to your {@link AsyncReadyCallback}
     * @return A
     *               NULL-terminated array of proxy URIs. Must be freed
     *               with g_strfreev().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default PointerString lookupFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_proxy_resolver_lookup_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_proxy_resolver_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the default {@link ProxyResolver} for the system.
     * @return the default {@link ProxyResolver}, which
     *     will be a dummy object if no proxy resolver is available
     */
    public static org.gtk.gio.ProxyResolver getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_resolver_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ProxyResolver) Interop.register(RESULT, org.gtk.gio.ProxyResolver.fromAddress).marshal(RESULT, null);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_resolver_is_supported = Interop.downcallHandle(
                "g_proxy_resolver_is_supported",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_resolver_lookup = Interop.downcallHandle(
                "g_proxy_resolver_lookup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_resolver_lookup_async = Interop.downcallHandle(
                "g_proxy_resolver_lookup_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_resolver_lookup_finish = Interop.downcallHandle(
                "g_proxy_resolver_lookup_finish",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_resolver_get_type = Interop.downcallHandle(
                "g_proxy_resolver_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_resolver_get_default = Interop.downcallHandle(
                "g_proxy_resolver_get_default",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * The ProxyResolverImpl type represents a native instance of the ProxyResolver interface.
     */
    class ProxyResolverImpl extends org.gtk.gobject.GObject implements ProxyResolver {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of ProxyResolver for the provided memory address.
         * @param address the memory address of the instance
         */
        public ProxyResolverImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_proxy_resolver_get_type != null;
    }
}

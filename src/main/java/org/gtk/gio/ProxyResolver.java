package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link ProxyResolver} provides synchronous and asynchronous network proxy
 * resolution. {@link ProxyResolver} is used within {@link SocketClient} through
 * the method g_socket_connectable_proxy_enumerate().
 * <p>
 * Implementations of {@link ProxyResolver} based on libproxy and GNOME settings can
 * be found in glib-networking. GIO comes with an implementation for use inside
 * Flatpak portals.
 */
public interface ProxyResolver extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_proxy_resolver_is_supported = Interop.downcallHandle(
        "g_proxy_resolver_is_supported",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code resolver} can be used on this system. (This is used
     * internally; g_proxy_resolver_get_default() will only return a proxy
     * resolver that returns {@code true} for this method.)
     */
    public default boolean isSupported() {
        try {
            var RESULT = (int) g_proxy_resolver_is_supported.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_resolver_lookup = Interop.downcallHandle(
        "g_proxy_resolver_lookup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public default PointerString lookup(java.lang.String uri, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_proxy_resolver_lookup.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_resolver_lookup_async = Interop.downcallHandle(
        "g_proxy_resolver_lookup_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronous lookup of proxy. See g_proxy_resolver_lookup() for more
     * details.
     */
    public default void lookupAsync(java.lang.String uri, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_proxy_resolver_lookup_async.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_resolver_lookup_finish = Interop.downcallHandle(
        "g_proxy_resolver_lookup_finish",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Call this function to obtain the array of proxy URIs when
     * g_proxy_resolver_lookup_async() is complete. See
     * g_proxy_resolver_lookup() for more details.
     */
    public default PointerString lookupFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_proxy_resolver_lookup_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_resolver_get_default = Interop.downcallHandle(
        "g_proxy_resolver_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@link ProxyResolver} for the system.
     */
    public static ProxyResolver getDefault() {
        try {
            var RESULT = (MemoryAddress) g_proxy_resolver_get_default.invokeExact();
            return new ProxyResolver.ProxyResolverImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class ProxyResolverImpl extends org.gtk.gobject.Object implements ProxyResolver {
        public ProxyResolverImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

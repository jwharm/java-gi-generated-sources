package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Proxy} handles connecting to a remote host via a given type of
 * proxy server. It is implemented by the 'gio-proxy' extension point.
 * The extensions are named after their proxy protocol name. As an
 * example, a SOCKS5 proxy implementation can be retrieved with the
 * name 'socks5' using the function
 * g_io_extension_point_get_extension_by_name().
 * @version 2.26
 */
public interface Proxy extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Given {@code connection} to communicate with a proxy (eg, a
     * {@link SocketConnection} that is connected to the proxy server), this
     * does the necessary handshake to connect to {@code proxy_address}, and if
     * required, wraps the {@link IOStream} to handle proxy payload.
     * @param connection a {@link IOStream}
     * @param proxyAddress a {@link ProxyAddress}
     * @param cancellable a {@link Cancellable}
     * @return a {@link IOStream} that will replace {@code connection}. This might
     *               be the same as {@code connection}, in which case a reference
     *               will be added.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.IOStream connect(@NotNull org.gtk.gio.IOStream connection, @NotNull org.gtk.gio.ProxyAddress proxyAddress, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        java.util.Objects.requireNonNull(proxyAddress, "Parameter 'proxyAddress' must not be null");
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_connect.invokeExact(handle(), connection.handle(), proxyAddress.handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.IOStream(Refcounted.get(RESULT, true));
    }
    
    /**
     * Asynchronous version of g_proxy_connect().
     * @param connection a {@link IOStream}
     * @param proxyAddress a {@link ProxyAddress}
     * @param cancellable a {@link Cancellable}
     * @param callback a {@link AsyncReadyCallback}
     */
    default void connectAsync(@NotNull org.gtk.gio.IOStream connection, @NotNull org.gtk.gio.ProxyAddress proxyAddress, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        java.util.Objects.requireNonNull(proxyAddress, "Parameter 'proxyAddress' must not be null");
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.g_proxy_connect_async.invokeExact(handle(), connection.handle(), proxyAddress.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * See g_proxy_connect().
     * @param result a {@link AsyncResult}
     * @return a {@link IOStream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default @NotNull org.gtk.gio.IOStream connectFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_connect_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.IOStream(Refcounted.get(RESULT, true));
    }
    
    /**
     * Some proxy protocols expect to be passed a hostname, which they
     * will resolve to an IP address themselves. Others, like SOCKS4, do
     * not allow this. This function will return {@code false} if {@code proxy} is
     * implementing such a protocol. When {@code false} is returned, the caller
     * should resolve the destination hostname first, and then pass a
     * {@link ProxyAddress} containing the stringified IP address to
     * g_proxy_connect() or g_proxy_connect_async().
     * @return {@code true} if hostname resolution is supported.
     */
    default boolean supportsHostname() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_proxy_supports_hostname.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Find the {@code gio-proxy} extension point for a proxy implementation that supports
     * the specified protocol.
     * @param protocol the proxy protocol name (e.g. http, socks, etc)
     * @return return a {@link Proxy} or NULL if protocol
     *               is not supported.
     */
    public static @Nullable org.gtk.gio.Proxy getDefaultForProtocol(@NotNull java.lang.String protocol) {
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_get_default_for_protocol.invokeExact(Interop.allocateNativeString(protocol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Proxy.ProxyImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_connect = Interop.downcallHandle(
            "g_proxy_connect",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_connect_async = Interop.downcallHandle(
            "g_proxy_connect_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_connect_finish = Interop.downcallHandle(
            "g_proxy_connect_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_supports_hostname = Interop.downcallHandle(
            "g_proxy_supports_hostname",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_get_default_for_protocol = Interop.downcallHandle(
            "g_proxy_get_default_for_protocol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class ProxyImpl extends org.gtk.gobject.Object implements Proxy {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public ProxyImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

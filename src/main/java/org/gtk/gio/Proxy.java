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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ProxyImpl(input);
    
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
    default org.gtk.gio.IOStream connect(org.gtk.gio.IOStream connection, org.gtk.gio.ProxyAddress proxyAddress, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_proxy_connect.invokeExact(
                        handle(),
                        connection.handle(),
                        proxyAddress.handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.IOStream) Interop.register(RESULT, org.gtk.gio.IOStream.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Asynchronous version of g_proxy_connect().
     * @param connection a {@link IOStream}
     * @param proxyAddress a {@link ProxyAddress}
     * @param cancellable a {@link Cancellable}
     * @param callback a {@link AsyncReadyCallback}
     */
    default void connectAsync(org.gtk.gio.IOStream connection, org.gtk.gio.ProxyAddress proxyAddress, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_proxy_connect_async.invokeExact(
                    handle(),
                    connection.handle(),
                    proxyAddress.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    default org.gtk.gio.IOStream connectFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_proxy_connect_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.IOStream) Interop.register(RESULT, org.gtk.gio.IOStream.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_proxy_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Find the {@code gio-proxy} extension point for a proxy implementation that supports
     * the specified protocol.
     * @param protocol the proxy protocol name (e.g. http, socks, etc)
     * @return return a {@link Proxy} or NULL if protocol
     *               is not supported.
     */
    public static @Nullable org.gtk.gio.Proxy getDefaultForProtocol(java.lang.String protocol) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_proxy_get_default_for_protocol.invokeExact(Marshal.stringToAddress.marshal(protocol, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gio.Proxy) Interop.register(RESULT, org.gtk.gio.Proxy.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_connect = Interop.downcallHandle(
                "g_proxy_connect",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_connect_async = Interop.downcallHandle(
                "g_proxy_connect_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_connect_finish = Interop.downcallHandle(
                "g_proxy_connect_finish",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_supports_hostname = Interop.downcallHandle(
                "g_proxy_supports_hostname",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_get_type = Interop.downcallHandle(
                "g_proxy_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_get_default_for_protocol = Interop.downcallHandle(
                "g_proxy_get_default_for_protocol",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * The ProxyImpl type represents a native instance of the Proxy interface.
     */
    class ProxyImpl extends org.gtk.gobject.GObject implements Proxy {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Proxy for the provided memory address.
         * @param address the memory address of the instance
         */
        public ProxyImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_proxy_get_type != null;
    }
}

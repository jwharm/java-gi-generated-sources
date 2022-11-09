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
     * Cast object to Proxy if its GType is a (or inherits from) "GProxy".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Proxy" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GProxy", a ClassCastException will be thrown.
     */
    public static Proxy castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GProxy"))) {
            return new ProxyImpl(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GProxy");
        }
    }
    
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
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return new org.gtk.gio.IOStream(RESULT, Ownership.FULL);
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
        try {
            DowncallHandles.g_proxy_connect_async.invokeExact(
                    handle(),
                    connection.handle(),
                    proxyAddress.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
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
        return new org.gtk.gio.IOStream(RESULT, Ownership.FULL);
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
            RESULT = (int) DowncallHandles.g_proxy_supports_hostname.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_get_default_for_protocol.invokeExact(
                    Interop.allocateNativeString(protocol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Proxy.ProxyImpl(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_connect = Interop.downcallHandle(
            "g_proxy_connect",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_connect_async = Interop.downcallHandle(
            "g_proxy_connect_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_connect_finish = Interop.downcallHandle(
            "g_proxy_connect_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_supports_hostname = Interop.downcallHandle(
            "g_proxy_supports_hostname",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_proxy_get_default_for_protocol = Interop.downcallHandle(
            "g_proxy_get_default_for_protocol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    class ProxyImpl extends org.gtk.gobject.Object implements Proxy {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public ProxyImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}

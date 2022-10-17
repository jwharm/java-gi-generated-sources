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
 */
public interface Proxy extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_proxy_connect = Interop.downcallHandle(
        "g_proxy_connect",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Given {@code connection} to communicate with a proxy (eg, a
     * {@link SocketConnection} that is connected to the proxy server), this
     * does the necessary handshake to connect to {@code proxy_address}, and if
     * required, wraps the {@link IOStream} to handle proxy payload.
     */
    default @NotNull IOStream connect(@NotNull IOStream connection, @NotNull ProxyAddress proxyAddress, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_proxy_connect.invokeExact(handle(), connection.handle(), proxyAddress.handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStream(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_proxy_connect_async = Interop.downcallHandle(
        "g_proxy_connect_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronous version of g_proxy_connect().
     */
    default @NotNull void connectAsync(@NotNull IOStream connection, @NotNull ProxyAddress proxyAddress, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_proxy_connect_async.invokeExact(handle(), connection.handle(), proxyAddress.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_proxy_connect_finish = Interop.downcallHandle(
        "g_proxy_connect_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * See g_proxy_connect().
     */
    default @NotNull IOStream connectFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_proxy_connect_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStream(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_proxy_supports_hostname = Interop.downcallHandle(
        "g_proxy_supports_hostname",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Some proxy protocols expect to be passed a hostname, which they
     * will resolve to an IP address themselves. Others, like SOCKS4, do
     * not allow this. This function will return {@code false} if {@code proxy} is
     * implementing such a protocol. When {@code false} is returned, the caller
     * should resolve the destination hostname first, and then pass a
     * {@link ProxyAddress} containing the stringified IP address to
     * g_proxy_connect() or g_proxy_connect_async().
     */
    default boolean supportsHostname() {
        int RESULT;
        try {
            RESULT = (int) g_proxy_supports_hostname.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_proxy_get_default_for_protocol = Interop.downcallHandle(
        "g_proxy_get_default_for_protocol",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Find the {@code gio-proxy} extension point for a proxy implementation that supports
     * the specified protocol.
     */
    public static @Nullable Proxy getDefaultForProtocol(@NotNull java.lang.String protocol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_proxy_get_default_for_protocol.invokeExact(Interop.allocateNativeString(protocol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Proxy.ProxyImpl(Refcounted.get(RESULT, true));
    }
    
    class ProxyImpl extends org.gtk.gobject.Object implements Proxy {
        public ProxyImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

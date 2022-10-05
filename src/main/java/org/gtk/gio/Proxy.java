package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link Proxy} handles connecting to a remote host via a given type of
 * proxy server. It is implemented by the 'gio-proxy' extension point.
 * The extensions are named after their proxy protocol name. As an
 * example, a SOCKS5 proxy implementation can be retrieved with the
 * name 'socks5' using the function
 * g_io_extension_point_get_extension_by_name().
 */
public interface Proxy extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_proxy_connect = Interop.downcallHandle(
        "g_proxy_connect",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Given {@code connection} to communicate with a proxy (eg, a
     * {@link SocketConnection} that is connected to the proxy server), this
     * does the necessary handshake to connect to {@code proxy_address}, and if
     * required, wraps the {@link IOStream} to handle proxy payload.
     */
    public default IOStream connect(IOStream connection, ProxyAddress proxyAddress, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_proxy_connect.invokeExact(handle(), connection.handle(), proxyAddress.handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new IOStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_connect_async = Interop.downcallHandle(
        "g_proxy_connect_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronous version of g_proxy_connect().
     */
    public default void connectAsync(IOStream connection, ProxyAddress proxyAddress, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_proxy_connect_async.invokeExact(handle(), connection.handle(), proxyAddress.handle(), cancellable.handle(), 
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
    
    static final MethodHandle g_proxy_connect_finish = Interop.downcallHandle(
        "g_proxy_connect_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * See g_proxy_connect().
     */
    public default IOStream connectFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_proxy_connect_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new IOStream(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_supports_hostname = Interop.downcallHandle(
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
    public default boolean supportsHostname() {
        try {
            var RESULT = (int) g_proxy_supports_hostname.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_get_default_for_protocol = Interop.downcallHandle(
        "g_proxy_get_default_for_protocol",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Find the {@code gio-proxy} extension point for a proxy implementation that supports
     * the specified protocol.
     */
    public static Proxy getDefaultForProtocol(java.lang.String protocol) {
        try {
            var RESULT = (MemoryAddress) g_proxy_get_default_for_protocol.invokeExact(Interop.allocateNativeString(protocol).handle());
            return new Proxy.ProxyImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class ProxyImpl extends org.gtk.gobject.Object implements Proxy {
        public ProxyImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}

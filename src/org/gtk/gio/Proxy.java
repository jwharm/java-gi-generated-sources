package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GProxy handles connecting to a remote host via a given type of
 * proxy server. It is implemented by the 'gio-proxy' extension point.
 * The extensions are named after their proxy protocol name. As an
 * example, a SOCKS5 proxy implementation can be retrieved with the
 * name 'socks5' using the function
 * g_io_extension_point_get_extension_by_name().
 */
public interface Proxy extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Given @connection to communicate with a proxy (eg, a
     * #GSocketConnection that is connected to the proxy server), this
     * does the necessary handshake to connect to @proxy_address, and if
     * required, wraps the #GIOStream to handle proxy payload.
     */
    public default IOStream connect(IOStream connection, ProxyAddress proxyAddress, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_proxy_connect(handle(), connection.handle(), proxyAddress.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronous version of g_proxy_connect().
     */
    public default void connectAsync(Proxy proxy, IOStream connection, ProxyAddress proxyAddress, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_proxy_connect_async(handle(), connection.handle(), proxyAddress.handle(), cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * See g_proxy_connect().
     */
    public default IOStream connectFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_proxy_connect_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStream(References.get(RESULT, true));
    }
    
    /**
     * Some proxy protocols expect to be passed a hostname, which they
     * will resolve to an IP address themselves. Others, like SOCKS4, do
     * not allow this. This function will return %FALSE if @proxy is
     * implementing such a protocol. When %FALSE is returned, the caller
     * should resolve the destination hostname first, and then pass a
     * #GProxyAddress containing the stringified IP address to
     * g_proxy_connect() or g_proxy_connect_async().
     */
    public default boolean supportsHostname() {
        var RESULT = gtk_h.g_proxy_supports_hostname(handle());
        return (RESULT != 0);
    }
    
    /**
     * Find the `gio-proxy` extension point for a proxy implementation that supports
     * the specified protocol.
     */
    public static Proxy getDefaultForProtocol(java.lang.String protocol) {
        var RESULT = gtk_h.g_proxy_get_default_for_protocol(Interop.allocateNativeString(protocol).handle());
        return new Proxy.ProxyImpl(References.get(RESULT, true));
    }
    
    class ProxyImpl extends org.gtk.gobject.Object implements Proxy {
        public ProxyImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}

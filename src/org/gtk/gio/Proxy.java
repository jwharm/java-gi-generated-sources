package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gio.Proxy} handles connecting to a remote host via a given type of
 * proxy server. It is implemented by the &<code>#39</code> gio-proxy&<code>#39</code>  extension point.
 * The extensions are named after their proxy protocol name. As an
 * example, a SOCKS5 proxy implementation can be retrieved with the
 * name &<code>#39</code> socks5&<code>#39</code>  using the function
 * g_io_extension_point_get_extension_by_name().
 */
public interface Proxy extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Given @connection to communicate with a proxy (eg, a
     * {@link org.gtk.gio.SocketConnection} that is connected to the proxy server), this
     * does the necessary handshake to connect to @proxy_address, and if
     * required, wraps the {@link org.gtk.gio.IOStream} to handle proxy payload.
     */
    public default IOStream connect(IOStream connection, ProxyAddress proxyAddress, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
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
    public default void connectAsync(IOStream connection, ProxyAddress proxyAddress, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_proxy_connect_async(handle(), connection.handle(), proxyAddress.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * See g_proxy_connect().
     */
    public default IOStream connectFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
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
     * not allow this. This function will return <code>false</code> if @proxy is
     * implementing such a protocol. When <code>false</code> is returned, the caller
     * should resolve the destination hostname first, and then pass a
     * {@link org.gtk.gio.ProxyAddress} containing the stringified IP address to
     * g_proxy_connect() or g_proxy_connect_async().
     */
    public default boolean supportsHostname() {
        var RESULT = gtk_h.g_proxy_supports_hostname(handle());
        return (RESULT != 0);
    }
    
    /**
     * Find the <code>gio-proxy</code> extension point for a proxy implementation that supports
     * the specified protocol.
     */
    public static Proxy getDefaultForProtocol(java.lang.String protocol) {
        var RESULT = gtk_h.g_proxy_get_default_for_protocol(Interop.allocateNativeString(protocol).handle());
        return new Proxy.ProxyImpl(References.get(RESULT, true));
    }
    
    class ProxyImpl extends org.gtk.gobject.Object implements Proxy {
        public ProxyImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}

package org.gtk.gio;

import org.gtk.gobject.*;
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
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_connect(HANDLE(), connection.HANDLE(), proxyAddress.HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new IOStream(References.get(RESULT, true));
    }
    
    /**
     * See g_proxy_connect().
     */
    public default IOStream connectFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_connect_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_proxy_supports_hostname(HANDLE());
        return (RESULT != 0);
    }
    
    class ProxyImpl extends org.gtk.gobject.Object implements Proxy {
        public ProxyImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}

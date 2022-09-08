package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GProxyResolver provides synchronous and asynchronous network proxy
 * resolution. #GProxyResolver is used within #GSocketClient through
 * the method g_socket_connectable_proxy_enumerate().
 * 
 * Implementations of #GProxyResolver based on libproxy and GNOME settings can
 * be found in glib-networking. GIO comes with an implementation for use inside
 * Flatpak portals.
 */
public interface ProxyResolver extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Checks if @resolver can be used on this system. (This is used
     * internally; g_proxy_resolver_get_default() will only return a proxy
     * resolver that returns %TRUE for this method.)
     */
    public default boolean isSupported() {
        var RESULT = gtk_h.g_proxy_resolver_is_supported(handle());
        return (RESULT != 0);
    }
    
    class ProxyResolverImpl extends org.gtk.gobject.Object implements ProxyResolver {
        public ProxyResolverImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}

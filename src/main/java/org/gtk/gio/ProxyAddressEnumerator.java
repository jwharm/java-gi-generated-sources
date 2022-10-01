package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link ProxyAddressEnumerator} is a wrapper around {@link SocketAddressEnumerator} which
 * takes the {@link SocketAddress} instances returned by the {@link SocketAddressEnumerator}
 * and wraps them in {@link ProxyAddress} instances, using the given
 * {@link ProxyAddressEnumerator}:proxy-resolver.
 * <p>
 * This enumerator will be returned (for example, by
 * g_socket_connectable_enumerate()) as appropriate when a proxy is configured;
 * there should be no need to manually wrap a {@link SocketAddressEnumerator} instance
 * with one.
 */
public class ProxyAddressEnumerator extends SocketAddressEnumerator {

    public ProxyAddressEnumerator(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ProxyAddressEnumerator */
    public static ProxyAddressEnumerator castFrom(org.gtk.gobject.Object gobject) {
        return new ProxyAddressEnumerator(gobject.refcounted());
    }
    
}

package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GProxyAddressEnumerator is a wrapper around #GSocketAddressEnumerator which
 * takes the #GSocketAddress instances returned by the #GSocketAddressEnumerator
 * and wraps them in #GProxyAddress instances, using the given
 * #GProxyAddressEnumerator:proxy-resolver.
 * 
 * This enumerator will be returned (for example, by
 * g_socket_connectable_enumerate()) as appropriate when a proxy is configured;
 * there should be no need to manually wrap a #GSocketAddressEnumerator instance
 * with one.
 */
public class ProxyAddressEnumerator extends SocketAddressEnumerator {

    public ProxyAddressEnumerator(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ProxyAddressEnumerator */
    public static ProxyAddressEnumerator castFrom(org.gtk.gobject.Object gobject) {
        return new ProxyAddressEnumerator(gobject.getReference());
    }
    
}

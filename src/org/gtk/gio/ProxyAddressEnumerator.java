package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.ProxyAddressEnumerator} is a wrapper around {@link org.gtk.gio.SocketAddressEnumerator} which
 * takes the {@link org.gtk.gio.SocketAddress} instances returned by the {@link org.gtk.gio.SocketAddressEnumerator} and wraps them in {@link org.gtk.gio.ProxyAddress} instances, using the given
 * {@link org.gtk.gio.ProxyAddressEnumerator} proxy-resolver.
 * 
 * This enumerator will be returned (for example, by
 * g_socket_connectable_enumerate()) as appropriate when a proxy is configured;
 * there should be no need to manually wrap a {@link org.gtk.gio.SocketAddressEnumerator} instance
 * with one.
 */
public class ProxyAddressEnumerator extends SocketAddressEnumerator {

    public ProxyAddressEnumerator(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ProxyAddressEnumerator */
    public static ProxyAddressEnumerator castFrom(org.gtk.gobject.Object gobject) {
        return new ProxyAddressEnumerator(gobject.getReference());
    }
    
}

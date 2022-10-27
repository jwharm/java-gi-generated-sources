package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class ProxyAddressEnumerator extends org.gtk.gio.SocketAddressEnumerator {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketAddressEnumerator.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.ProxyAddressEnumeratorPrivate.getMemoryLayout().withName("priv")
    ).withName("GProxyAddressEnumerator");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ProxyAddressEnumerator(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ProxyAddressEnumerator */
    public static ProxyAddressEnumerator castFrom(org.gtk.gobject.Object gobject) {
        return new ProxyAddressEnumerator(gobject.refcounted());
    }
}

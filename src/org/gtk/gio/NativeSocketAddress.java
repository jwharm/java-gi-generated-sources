package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A socket address of some unknown native type.
 */
public class NativeSocketAddress extends SocketAddress implements SocketConnectable {

    public NativeSocketAddress(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to NativeSocketAddress */
    public static NativeSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new NativeSocketAddress(gobject.getProxy());
    }
    
    /**
     * Creates a new #GNativeSocketAddress for @native and @len.
     */
    public NativeSocketAddress(jdk.incubator.foreign.MemoryAddress native_, long len) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_native_socket_address_new(native_, len), true));
    }
    
}

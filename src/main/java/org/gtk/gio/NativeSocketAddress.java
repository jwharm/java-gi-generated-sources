package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A socket address of some unknown native type.
 */
public class NativeSocketAddress extends SocketAddress implements SocketConnectable {

    public NativeSocketAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NativeSocketAddress */
    public static NativeSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new NativeSocketAddress(gobject.refcounted());
    }
    
    private static Refcounted constructNew(java.lang.foreign.MemoryAddress native_, long len) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_native_socket_address_new(native_, len), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link NativeSocketAddress} for {@code native} and {@code len}.
     */
    public NativeSocketAddress(java.lang.foreign.MemoryAddress native_, long len) {
        super(constructNew(native_, len));
    }
    
}

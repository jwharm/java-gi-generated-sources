package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A socket address of some unknown native type.
 */
public class NativeSocketAddress extends SocketAddress implements SocketConnectable {

    public NativeSocketAddress(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NativeSocketAddress */
    public static NativeSocketAddress castFrom(org.gtk.gobject.Object gobject) {
        return new NativeSocketAddress(gobject.getReference());
    }
    
    private static Reference constructNew(jdk.incubator.foreign.MemoryAddress native_, long len) {
        Reference RESULT = References.get(gtk_h.g_native_socket_address_new(native_, len), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GNativeSocketAddress for @native and @len.
     */
    public NativeSocketAddress(jdk.incubator.foreign.MemoryAddress native_, long len) {
        super(constructNew(native_, len));
    }
    
}

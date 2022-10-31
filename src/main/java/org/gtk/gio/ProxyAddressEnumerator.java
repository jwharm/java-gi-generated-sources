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
    
    private static final java.lang.String C_TYPE_NAME = "GProxyAddressEnumerator";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketAddressEnumerator.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    @ApiStatus.Internal
    public ProxyAddressEnumerator(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ProxyAddressEnumerator if its GType is a (or inherits from) "GProxyAddressEnumerator".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ProxyAddressEnumerator" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GProxyAddressEnumerator", a ClassCastException will be thrown.
     */
    public static ProxyAddressEnumerator castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GProxyAddressEnumerator"))) {
            return new ProxyAddressEnumerator(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GProxyAddressEnumerator");
        }
    }
}

package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link ProxyResolver} provides synchronous and asynchronous network proxy
 * resolution. {@link ProxyResolver} is used within {@link SocketClient} through
 * the method g_socket_connectable_proxy_enumerate().
 * <p>
 * Implementations of {@link ProxyResolver} based on libproxy and GNOME settings can
 * be found in glib-networking. GIO comes with an implementation for use inside
 * Flatpak portals.
 */
public interface ProxyResolver extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Checks if {@code resolver} can be used on this system. (This is used
     * internally; g_proxy_resolver_get_default() will only return a proxy
     * resolver that returns <code>true</code> for this method.)
     */
    public default boolean isSupported() {
        var RESULT = gtk_h.g_proxy_resolver_is_supported(handle());
        return (RESULT != 0);
    }
    
    /**
     * Asynchronous lookup of proxy. See g_proxy_resolver_lookup() for more
     * details.
     */
    public default void lookupAsync(java.lang.String uri, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_proxy_resolver_lookup_async(handle(), Interop.allocateNativeString(uri).handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the default {@link ProxyResolver} for the system.
     */
    public static ProxyResolver getDefault() {
        var RESULT = gtk_h.g_proxy_resolver_get_default();
        return new ProxyResolver.ProxyResolverImpl(References.get(RESULT, false));
    }
    
    class ProxyResolverImpl extends org.gtk.gobject.Object implements ProxyResolver {
        public ProxyResolverImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}

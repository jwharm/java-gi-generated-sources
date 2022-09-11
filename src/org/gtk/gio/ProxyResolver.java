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
    
    /**
     * Asynchronous lookup of proxy. See g_proxy_resolver_lookup() for more
     * details.
     */
    public default void lookupAsync(ProxyResolver resolver, java.lang.String uri, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_proxy_resolver_lookup_async(handle(), Interop.allocateNativeString(uri).handle(), cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the default #GProxyResolver for the system.
     */
    public static ProxyResolver getDefault() {
        var RESULT = gtk_h.g_proxy_resolver_get_default();
        return new ProxyResolver.ProxyResolverImpl(References.get(RESULT, false));
    }
    
    class ProxyResolverImpl extends org.gtk.gobject.Object implements ProxyResolver {
        public ProxyResolverImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}

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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.SocketAddressEnumerator.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ProxyAddressEnumerator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ProxyAddressEnumerator(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyAddressEnumerator> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ProxyAddressEnumerator(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_proxy_address_enumerator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ProxyAddressEnumerator.Builder} object constructs a {@link ProxyAddressEnumerator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ProxyAddressEnumerator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.SocketAddressEnumerator.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ProxyAddressEnumerator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ProxyAddressEnumerator}.
         * @return A new instance of {@code ProxyAddressEnumerator} with the properties 
         *         that were set in the Builder object.
         */
        public ProxyAddressEnumerator build() {
            return (ProxyAddressEnumerator) org.gtk.gobject.GObject.newWithProperties(
                ProxyAddressEnumerator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setConnectable(org.gtk.gio.SocketConnectable connectable) {
            names.add("connectable");
            values.add(org.gtk.gobject.Value.create(connectable));
            return this;
        }
        
        /**
         * The default port to use if {@link ProxyAddressEnumerator}:uri does not
         * specify one.
         * @param defaultPort The value for the {@code default-port} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDefaultPort(int defaultPort) {
            names.add("default-port");
            values.add(org.gtk.gobject.Value.create(defaultPort));
            return this;
        }
        
        /**
         * The proxy resolver to use.
         * @param proxyResolver The value for the {@code proxy-resolver} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProxyResolver(org.gtk.gio.ProxyResolver proxyResolver) {
            names.add("proxy-resolver");
            values.add(org.gtk.gobject.Value.create(proxyResolver));
            return this;
        }
        
        public Builder setUri(java.lang.String uri) {
            names.add("uri");
            values.add(org.gtk.gobject.Value.create(uri));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_proxy_address_enumerator_get_type = Interop.downcallHandle(
                "g_proxy_address_enumerator_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_proxy_address_enumerator_get_type != null;
    }
}

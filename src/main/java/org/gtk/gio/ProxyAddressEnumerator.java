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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketAddressEnumerator.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a ProxyAddressEnumerator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ProxyAddressEnumerator(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ProxyAddressEnumerator if its GType is a (or inherits from) "GProxyAddressEnumerator".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ProxyAddressEnumerator} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GProxyAddressEnumerator", a ClassCastException will be thrown.
     */
    public static ProxyAddressEnumerator castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ProxyAddressEnumerator.getType())) {
            return new ProxyAddressEnumerator(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GProxyAddressEnumerator");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_proxy_address_enumerator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.SocketAddressEnumerator.Build {
        
         /**
         * A {@link ProxyAddressEnumerator.Build} object constructs a {@link ProxyAddressEnumerator} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ProxyAddressEnumerator} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ProxyAddressEnumerator} using {@link ProxyAddressEnumerator#castFrom}.
         * @return A new instance of {@code ProxyAddressEnumerator} with the properties 
         *         that were set in the Build object.
         */
        public ProxyAddressEnumerator construct() {
            return ProxyAddressEnumerator.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ProxyAddressEnumerator.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setConnectable(org.gtk.gio.SocketConnectable connectable) {
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
        public Build setDefaultPort(int defaultPort) {
            names.add("default-port");
            values.add(org.gtk.gobject.Value.create(defaultPort));
            return this;
        }
        
        /**
         * The proxy resolver to use.
         * @param proxyResolver The value for the {@code proxy-resolver} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProxyResolver(org.gtk.gio.ProxyResolver proxyResolver) {
            names.add("proxy-resolver");
            values.add(org.gtk.gobject.Value.create(proxyResolver));
            return this;
        }
        
        public Build setUri(java.lang.String uri) {
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
}

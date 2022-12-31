package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Like {@link NetworkAddress} does with hostnames, {@link NetworkService}
 * provides an easy way to resolve a SRV record, and then attempt to
 * connect to one of the hosts that implements that service, handling
 * service priority/weighting, multiple IP addresses, and multiple
 * address families.
 * <p>
 * See {@link SrvTarget} for more information about SRV records, and see
 * {@link SocketConnectable} for an example of using the connectable
 * interface.
 */
public class NetworkService extends org.gtk.gobject.GObject implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNetworkService";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a NetworkService proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NetworkService(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetworkService> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NetworkService(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String service, java.lang.String protocol, java.lang.String domain) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_new.invokeExact(
                    Marshal.stringToAddress.marshal(service, null),
                    Marshal.stringToAddress.marshal(protocol, null),
                    Marshal.stringToAddress.marshal(domain, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link NetworkService} representing the given {@code service},
     * {@code protocol}, and {@code domain}. This will initially be unresolved; use the
     * {@link SocketConnectable} interface to resolve it.
     * @param service the service type to look up (eg, "ldap")
     * @param protocol the networking protocol to use for {@code service} (eg, "tcp")
     * @param domain the DNS domain to look up the service in
     */
    public NetworkService(java.lang.String service, java.lang.String protocol, java.lang.String domain) {
        super(constructNew(service, protocol, domain), Ownership.FULL);
    }
    
    /**
     * Gets the domain that {@code srv} serves. This might be either UTF-8 or
     * ASCII-encoded, depending on what {@code srv} was created with.
     * @return {@code srv}'s domain name
     */
    public java.lang.String getDomain() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_get_domain.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code srv}'s protocol name (eg, "tcp").
     * @return {@code srv}'s protocol name
     */
    public java.lang.String getProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_get_protocol.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     * @return {@code srv}'s scheme name
     */
    public java.lang.String getScheme() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_get_scheme.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code srv}'s service name (eg, "ldap").
     * @return {@code srv}'s service name
     */
    public java.lang.String getService() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_get_service.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Set's the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     * @param scheme a URI scheme
     */
    public void setScheme(java.lang.String scheme) {
        try {
            DowncallHandles.g_network_service_set_scheme.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(scheme, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_network_service_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link NetworkService.Builder} object constructs a {@link NetworkService} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NetworkService.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NetworkService} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NetworkService}.
         * @return A new instance of {@code NetworkService} with the properties 
         *         that were set in the Builder object.
         */
        public NetworkService build() {
            return (NetworkService) org.gtk.gobject.GObject.newWithProperties(
                NetworkService.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setDomain(java.lang.String domain) {
            names.add("domain");
            values.add(org.gtk.gobject.Value.create(domain));
            return this;
        }
        
        public Builder setProtocol(java.lang.String protocol) {
            names.add("protocol");
            values.add(org.gtk.gobject.Value.create(protocol));
            return this;
        }
        
        public Builder setScheme(java.lang.String scheme) {
            names.add("scheme");
            values.add(org.gtk.gobject.Value.create(scheme));
            return this;
        }
        
        public Builder setService(java.lang.String service) {
            names.add("service");
            values.add(org.gtk.gobject.Value.create(service));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_network_service_new = Interop.downcallHandle(
            "g_network_service_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_get_domain = Interop.downcallHandle(
            "g_network_service_get_domain",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_get_protocol = Interop.downcallHandle(
            "g_network_service_get_protocol",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_get_scheme = Interop.downcallHandle(
            "g_network_service_get_scheme",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_get_service = Interop.downcallHandle(
            "g_network_service_get_service",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_set_scheme = Interop.downcallHandle(
            "g_network_service_set_scheme",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_get_type = Interop.downcallHandle(
            "g_network_service_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}

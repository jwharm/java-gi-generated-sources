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
public class NetworkService extends org.gtk.gobject.Object implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNetworkService";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
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
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a NetworkService proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NetworkService(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to NetworkService if its GType is a (or inherits from) "GNetworkService".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code NetworkService} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GNetworkService", a ClassCastException will be thrown.
     */
    public static NetworkService castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GNetworkService"))) {
            return new NetworkService(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GNetworkService");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String service, @NotNull java.lang.String protocol, @NotNull java.lang.String domain) {
        java.util.Objects.requireNonNull(service, "Parameter 'service' must not be null");
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_new.invokeExact(
                    Interop.allocateNativeString(service),
                    Interop.allocateNativeString(protocol),
                    Interop.allocateNativeString(domain));
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
    public NetworkService(@NotNull java.lang.String service, @NotNull java.lang.String protocol, @NotNull java.lang.String domain) {
        super(constructNew(service, protocol, domain), Ownership.FULL);
    }
    
    /**
     * Gets the domain that {@code srv} serves. This might be either UTF-8 or
     * ASCII-encoded, depending on what {@code srv} was created with.
     * @return {@code srv}'s domain name
     */
    public @NotNull java.lang.String getDomain() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_get_domain.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets {@code srv}'s protocol name (eg, "tcp").
     * @return {@code srv}'s protocol name
     */
    public @NotNull java.lang.String getProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_get_protocol.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     * @return {@code srv}'s scheme name
     */
    public @NotNull java.lang.String getScheme() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_get_scheme.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets {@code srv}'s service name (eg, "ldap").
     * @return {@code srv}'s service name
     */
    public @NotNull java.lang.String getService() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_network_service_get_service.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Set's the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     * @param scheme a URI scheme
     */
    public void setScheme(@NotNull java.lang.String scheme) {
        java.util.Objects.requireNonNull(scheme, "Parameter 'scheme' must not be null");
        try {
            DowncallHandles.g_network_service_set_scheme.invokeExact(
                    handle(),
                    Interop.allocateNativeString(scheme));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_network_service_new = Interop.downcallHandle(
            "g_network_service_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_get_domain = Interop.downcallHandle(
            "g_network_service_get_domain",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_get_protocol = Interop.downcallHandle(
            "g_network_service_get_protocol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_get_scheme = Interop.downcallHandle(
            "g_network_service_get_scheme",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_get_service = Interop.downcallHandle(
            "g_network_service_get_service",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_network_service_set_scheme = Interop.downcallHandle(
            "g_network_service_set_scheme",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}

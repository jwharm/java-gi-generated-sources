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
public class NetworkService extends org.gtk.gobject.Object implements SocketConnectable {

    public NetworkService(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NetworkService */
    public static NetworkService castFrom(org.gtk.gobject.Object gobject) {
        return new NetworkService(gobject.refcounted());
    }
    
    private static final MethodHandle g_network_service_new = Interop.downcallHandle(
        "g_network_service_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String service, @NotNull java.lang.String protocol, @NotNull java.lang.String domain) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_network_service_new.invokeExact(Interop.allocateNativeString(service), Interop.allocateNativeString(protocol), Interop.allocateNativeString(domain)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link NetworkService} representing the given {@code service},
     * {@code protocol}, and {@code domain}. This will initially be unresolved; use the
     * {@link SocketConnectable} interface to resolve it.
     */
    public NetworkService(@NotNull java.lang.String service, @NotNull java.lang.String protocol, @NotNull java.lang.String domain) {
        super(constructNew(service, protocol, domain));
    }
    
    private static final MethodHandle g_network_service_get_domain = Interop.downcallHandle(
        "g_network_service_get_domain",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the domain that {@code srv} serves. This might be either UTF-8 or
     * ASCII-encoded, depending on what {@code srv} was created with.
     */
    public @NotNull java.lang.String getDomain() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_network_service_get_domain.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_network_service_get_protocol = Interop.downcallHandle(
        "g_network_service_get_protocol",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code srv}'s protocol name (eg, "tcp").
     */
    public @NotNull java.lang.String getProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_network_service_get_protocol.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_network_service_get_scheme = Interop.downcallHandle(
        "g_network_service_get_scheme",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     */
    public @NotNull java.lang.String getScheme() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_network_service_get_scheme.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_network_service_get_service = Interop.downcallHandle(
        "g_network_service_get_service",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code srv}'s service name (eg, "ldap").
     */
    public @NotNull java.lang.String getService() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_network_service_get_service.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_network_service_set_scheme = Interop.downcallHandle(
        "g_network_service_set_scheme",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set's the URI scheme used to resolve proxies. By default, the service name
     * is used as scheme.
     */
    public @NotNull void setScheme(@NotNull java.lang.String scheme) {
        try {
            g_network_service_set_scheme.invokeExact(handle(), Interop.allocateNativeString(scheme));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

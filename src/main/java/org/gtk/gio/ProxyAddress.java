package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Support for proxied {@link InetSocketAddress}.
 */
public class ProxyAddress extends InetSocketAddress implements SocketConnectable {

    public ProxyAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ProxyAddress */
    public static ProxyAddress castFrom(org.gtk.gobject.Object gobject) {
        return new ProxyAddress(gobject.refcounted());
    }
    
    static final MethodHandle g_proxy_address_new = Interop.downcallHandle(
        "g_proxy_address_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(InetAddress inetaddr, short port, java.lang.String protocol, java.lang.String destHostname, short destPort, java.lang.String username, java.lang.String password) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_proxy_address_new.invokeExact(inetaddr.handle(), port, Interop.allocateNativeString(protocol).handle(), Interop.allocateNativeString(destHostname).handle(), destPort, Interop.allocateNativeString(username).handle(), Interop.allocateNativeString(password).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link ProxyAddress} for {@code inetaddr} with {@code protocol} that should
     * tunnel through {@code dest_hostname} and {@code dest_port}.
     * <p>
     * (Note that this method doesn't set the {@link ProxyAddress}:uri or
     * {@link ProxyAddress}:destination-protocol fields; use g_object_new()
     * directly if you want to set those.)
     */
    public ProxyAddress(InetAddress inetaddr, short port, java.lang.String protocol, java.lang.String destHostname, short destPort, java.lang.String username, java.lang.String password) {
        super(constructNew(inetaddr, port, protocol, destHostname, destPort, username, password));
    }
    
    static final MethodHandle g_proxy_address_get_destination_hostname = Interop.downcallHandle(
        "g_proxy_address_get_destination_hostname",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s destination hostname; that is, the name of the host
     * that will be connected to via the proxy, not the name of the proxy
     * itself.
     */
    public java.lang.String getDestinationHostname() {
        try {
            var RESULT = (MemoryAddress) g_proxy_address_get_destination_hostname.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_address_get_destination_port = Interop.downcallHandle(
        "g_proxy_address_get_destination_port",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s destination port; that is, the port on the
     * destination host that will be connected to via the proxy, not the
     * port number of the proxy itself.
     */
    public short getDestinationPort() {
        try {
            var RESULT = (short) g_proxy_address_get_destination_port.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_address_get_destination_protocol = Interop.downcallHandle(
        "g_proxy_address_get_destination_protocol",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the protocol that is being spoken to the destination
     * server; eg, "http" or "ftp".
     */
    public java.lang.String getDestinationProtocol() {
        try {
            var RESULT = (MemoryAddress) g_proxy_address_get_destination_protocol.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_address_get_password = Interop.downcallHandle(
        "g_proxy_address_get_password",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s password.
     */
    public java.lang.String getPassword() {
        try {
            var RESULT = (MemoryAddress) g_proxy_address_get_password.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_address_get_protocol = Interop.downcallHandle(
        "g_proxy_address_get_protocol",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s protocol. eg, "socks" or "http"
     */
    public java.lang.String getProtocol() {
        try {
            var RESULT = (MemoryAddress) g_proxy_address_get_protocol.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_address_get_uri = Interop.downcallHandle(
        "g_proxy_address_get_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the proxy URI that {@code proxy} was constructed from.
     */
    public java.lang.String getUri() {
        try {
            var RESULT = (MemoryAddress) g_proxy_address_get_uri.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_proxy_address_get_username = Interop.downcallHandle(
        "g_proxy_address_get_username",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code proxy}'s username.
     */
    public java.lang.String getUsername() {
        try {
            var RESULT = (MemoryAddress) g_proxy_address_get_username.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

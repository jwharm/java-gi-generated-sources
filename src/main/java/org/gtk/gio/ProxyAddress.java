package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Support for proxied {@link InetSocketAddress}.
 * @version 2.26
 */
public class ProxyAddress extends org.gtk.gio.InetSocketAddress implements org.gtk.gio.SocketConnectable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GProxyAddress";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.InetSocketAddress.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ProxyAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ProxyAddress(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyAddress> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ProxyAddress(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.InetAddress inetaddr, short port, java.lang.String protocol, java.lang.String destHostname, short destPort, @Nullable java.lang.String username, @Nullable java.lang.String password) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_new.invokeExact(
                        inetaddr.handle(),
                        port,
                        Marshal.stringToAddress.marshal(protocol, SCOPE),
                        Marshal.stringToAddress.marshal(destHostname, SCOPE),
                        destPort,
                        (Addressable) (username == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(username, SCOPE)),
                        (Addressable) (password == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(password, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link ProxyAddress} for {@code inetaddr} with {@code protocol} that should
     * tunnel through {@code dest_hostname} and {@code dest_port}.
     * <p>
     * (Note that this method doesn't set the {@link ProxyAddress}:uri or
     * {@link ProxyAddress}:destination-protocol fields; use g_object_new()
     * directly if you want to set those.)
     * @param inetaddr The proxy server {@link InetAddress}.
     * @param port The proxy server port.
     * @param protocol The proxy protocol to support, in lower case (e.g. socks, http).
     * @param destHostname The destination hostname the proxy should tunnel to.
     * @param destPort The destination port to tunnel to.
     * @param username The username to authenticate to the proxy server
     *     (or {@code null}).
     * @param password The password to authenticate to the proxy server
     *     (or {@code null}).
     */
    public ProxyAddress(org.gtk.gio.InetAddress inetaddr, short port, java.lang.String protocol, java.lang.String destHostname, short destPort, @Nullable java.lang.String username, @Nullable java.lang.String password) {
        super(constructNew(inetaddr, port, protocol, destHostname, destPort, username, password));
        this.takeOwnership();
    }
    
    /**
     * Gets {@code proxy}'s destination hostname; that is, the name of the host
     * that will be connected to via the proxy, not the name of the proxy
     * itself.
     * @return the {@code proxy}'s destination hostname
     */
    public java.lang.String getDestinationHostname() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_destination_hostname.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code proxy}'s destination port; that is, the port on the
     * destination host that will be connected to via the proxy, not the
     * port number of the proxy itself.
     * @return the {@code proxy}'s destination port
     */
    public short getDestinationPort() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_proxy_address_get_destination_port.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the protocol that is being spoken to the destination
     * server; eg, "http" or "ftp".
     * @return the {@code proxy}'s destination protocol
     */
    public java.lang.String getDestinationProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_destination_protocol.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code proxy}'s password.
     * @return the {@code proxy}'s password
     */
    public @Nullable java.lang.String getPassword() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_password.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code proxy}'s protocol. eg, "socks" or "http"
     * @return the {@code proxy}'s protocol
     */
    public java.lang.String getProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_protocol.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the proxy URI that {@code proxy} was constructed from.
     * @return the {@code proxy}'s URI, or {@code null} if unknown
     */
    public @Nullable java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code proxy}'s username.
     * @return the {@code proxy}'s username
     */
    public @Nullable java.lang.String getUsername() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_proxy_address_get_username.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_proxy_address_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ProxyAddress.Builder} object constructs a {@link ProxyAddress} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ProxyAddress.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.InetSocketAddress.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ProxyAddress} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ProxyAddress}.
         * @return A new instance of {@code ProxyAddress} with the properties 
         *         that were set in the Builder object.
         */
        public ProxyAddress build() {
            return (ProxyAddress) org.gtk.gobject.GObject.newWithProperties(
                ProxyAddress.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setDestinationHostname(java.lang.String destinationHostname) {
            names.add("destination-hostname");
            values.add(org.gtk.gobject.Value.create(destinationHostname));
            return this;
        }
        
        public Builder setDestinationPort(int destinationPort) {
            names.add("destination-port");
            values.add(org.gtk.gobject.Value.create(destinationPort));
            return this;
        }
        
        /**
         * The protocol being spoke to the destination host, or {@code null} if
         * the {@link ProxyAddress} doesn't know.
         * @param destinationProtocol The value for the {@code destination-protocol} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDestinationProtocol(java.lang.String destinationProtocol) {
            names.add("destination-protocol");
            values.add(org.gtk.gobject.Value.create(destinationProtocol));
            return this;
        }
        
        public Builder setPassword(java.lang.String password) {
            names.add("password");
            values.add(org.gtk.gobject.Value.create(password));
            return this;
        }
        
        public Builder setProtocol(java.lang.String protocol) {
            names.add("protocol");
            values.add(org.gtk.gobject.Value.create(protocol));
            return this;
        }
        
        /**
         * The URI string that the proxy was constructed from (or {@code null}
         * if the creator didn't specify this).
         * @param uri The value for the {@code uri} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUri(java.lang.String uri) {
            names.add("uri");
            values.add(org.gtk.gobject.Value.create(uri));
            return this;
        }
        
        public Builder setUsername(java.lang.String username) {
            names.add("username");
            values.add(org.gtk.gobject.Value.create(username));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_proxy_address_new = Interop.downcallHandle(
                "g_proxy_address_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_proxy_address_get_destination_hostname = Interop.downcallHandle(
                "g_proxy_address_get_destination_hostname",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_proxy_address_get_destination_port = Interop.downcallHandle(
                "g_proxy_address_get_destination_port",
                FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_proxy_address_get_destination_protocol = Interop.downcallHandle(
                "g_proxy_address_get_destination_protocol",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_proxy_address_get_password = Interop.downcallHandle(
                "g_proxy_address_get_password",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_proxy_address_get_protocol = Interop.downcallHandle(
                "g_proxy_address_get_protocol",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_proxy_address_get_uri = Interop.downcallHandle(
                "g_proxy_address_get_uri",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_proxy_address_get_username = Interop.downcallHandle(
                "g_proxy_address_get_username",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_proxy_address_get_type = Interop.downcallHandle(
                "g_proxy_address_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_proxy_address_get_type != null;
    }
}

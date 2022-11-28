package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link InetAddress} represents an IPv4 or IPv6 internet address. Use
 * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_async() to
 * look up the {@link InetAddress} for a hostname. Use
 * g_resolver_lookup_by_address() or
 * g_resolver_lookup_by_address_async() to look up the hostname for a
 * {@link InetAddress}.
 * <p>
 * To actually connect to a remote host, you will need a
 * {@link InetSocketAddress} (which includes a {@link InetAddress} as well as a
 * port number).
 */
public class InetAddress extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInetAddress";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Create a InetAddress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InetAddress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to InetAddress if its GType is a (or inherits from) "GInetAddress".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code InetAddress} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GInetAddress", a ClassCastException will be thrown.
     */
    public static InetAddress castFrom(org.gtk.gobject.Object gobject) {
            return new InetAddress(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNewAny(@NotNull org.gtk.gio.SocketFamily family) {
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_new_any.invokeExact(
                    family.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link InetAddress} for the "any" address (unassigned/"don't
     * care") for {@code family}.
     * @param family the address family
     * @return a new {@link InetAddress} corresponding to the "any" address
     * for {@code family}.
     *     Free the returned object with g_object_unref().
     */
    public static InetAddress newAny(@NotNull org.gtk.gio.SocketFamily family) {
        return new InetAddress(constructNewAny(family), Ownership.FULL);
    }
    
    private static Addressable constructNewFromBytes(@NotNull byte[] bytes, @NotNull org.gtk.gio.SocketFamily family) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_new_from_bytes.invokeExact(
                    Interop.allocateNativeArray(bytes, false),
                    family.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link InetAddress} from the given {@code family} and {@code bytes}.
     * {@code bytes} should be 4 bytes for {@link SocketFamily#IPV4} and 16 bytes for
     * {@link SocketFamily#IPV6}.
     * @param bytes raw address data
     * @param family the address family of {@code bytes}
     * @return a new {@link InetAddress} corresponding to {@code family} and {@code bytes}.
     *     Free the returned object with g_object_unref().
     */
    public static InetAddress newFromBytes(@NotNull byte[] bytes, @NotNull org.gtk.gio.SocketFamily family) {
        return new InetAddress(constructNewFromBytes(bytes, family), Ownership.FULL);
    }
    
    private static Addressable constructNewFromString(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_new_from_string.invokeExact(
                    Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses {@code string} as an IP address and creates a new {@link InetAddress}.
     * @param string a string representation of an IP address
     * @return a new {@link InetAddress} corresponding
     * to {@code string}, or {@code null} if {@code string} could not be parsed.
     *     Free the returned object with g_object_unref().
     */
    public static InetAddress newFromString(@NotNull java.lang.String string) {
        return new InetAddress(constructNewFromString(string), Ownership.FULL);
    }
    
    private static Addressable constructNewLoopback(@NotNull org.gtk.gio.SocketFamily family) {
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_new_loopback.invokeExact(
                    family.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link InetAddress} for the loopback address for {@code family}.
     * @param family the address family
     * @return a new {@link InetAddress} corresponding to the loopback address
     * for {@code family}.
     *     Free the returned object with g_object_unref().
     */
    public static InetAddress newLoopback(@NotNull org.gtk.gio.SocketFamily family) {
        return new InetAddress(constructNewLoopback(family), Ownership.FULL);
    }
    
    /**
     * Checks if two {@link InetAddress} instances are equal, e.g. the same address.
     * @param otherAddress Another {@link InetAddress}.
     * @return {@code true} if {@code address} and {@code other_address} are equal, {@code false} otherwise.
     */
    public boolean equal(@NotNull org.gtk.gio.InetAddress otherAddress) {
        java.util.Objects.requireNonNull(otherAddress, "Parameter 'otherAddress' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_equal.invokeExact(
                    handle(),
                    otherAddress.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets {@code address}'s family
     * @return {@code address}'s family
     */
    public @NotNull org.gtk.gio.SocketFamily getFamily() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_family.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketFamily(RESULT);
    }
    
    /**
     * Tests whether {@code address} is the "any" address for its family.
     * @return {@code true} if {@code address} is the "any" address for its family.
     */
    public boolean getIsAny() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_any.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether {@code address} is a link-local address (that is, if it
     * identifies a host on a local network that is not connected to the
     * Internet).
     * @return {@code true} if {@code address} is a link-local address.
     */
    public boolean getIsLinkLocal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_link_local.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether {@code address} is the loopback address for its family.
     * @return {@code true} if {@code address} is the loopback address for its family.
     */
    public boolean getIsLoopback() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_loopback.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether {@code address} is a global multicast address.
     * @return {@code true} if {@code address} is a global multicast address.
     */
    public boolean getIsMcGlobal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_global.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether {@code address} is a link-local multicast address.
     * @return {@code true} if {@code address} is a link-local multicast address.
     */
    public boolean getIsMcLinkLocal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_link_local.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether {@code address} is a node-local multicast address.
     * @return {@code true} if {@code address} is a node-local multicast address.
     */
    public boolean getIsMcNodeLocal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_node_local.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether {@code address} is an organization-local multicast address.
     * @return {@code true} if {@code address} is an organization-local multicast address.
     */
    public boolean getIsMcOrgLocal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_org_local.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether {@code address} is a site-local multicast address.
     * @return {@code true} if {@code address} is a site-local multicast address.
     */
    public boolean getIsMcSiteLocal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_site_local.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether {@code address} is a multicast address.
     * @return {@code true} if {@code address} is a multicast address.
     */
    public boolean getIsMulticast() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_multicast.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether {@code address} is a site-local address such as 10.0.0.1
     * (that is, the address identifies a host on a local network that can
     * not be reached directly from the Internet, but which may have
     * outgoing Internet connectivity via a NAT or firewall).
     * @return {@code true} if {@code address} is a site-local address.
     */
    public boolean getIsSiteLocal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_inet_address_get_is_site_local.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the size of the native raw binary address for {@code address}. This
     * is the size of the data that you get from g_inet_address_to_bytes().
     * @return the number of bytes used for the native version of {@code address}.
     */
    public long getNativeSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_inet_address_get_native_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the raw binary address data from {@code address}.
     * @return a pointer to an internal array of the bytes in {@code address},
     * which should not be modified, stored, or freed. The size of this
     * array can be gotten with g_inet_address_get_native_size().
     */
    public PointerByte toBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_to_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Converts {@code address} to string form.
     * @return a representation of {@code address} as a string, which should be
     * freed after use.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_inet_address_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link InetAddress.Build} object constructs a {@link InetAddress} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link InetAddress} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InetAddress} using {@link InetAddress#castFrom}.
         * @return A new instance of {@code InetAddress} with the properties 
         *         that were set in the Build object.
         */
        public InetAddress construct() {
            return InetAddress.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    InetAddress.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setBytes(java.lang.foreign.MemoryAddress bytes) {
            names.add("bytes");
            values.add(org.gtk.gobject.Value.create(bytes));
            return this;
        }
        
        public Build setFamily(org.gtk.gio.SocketFamily family) {
            names.add("family");
            values.add(org.gtk.gobject.Value.create(family));
            return this;
        }
        
        /**
         * Whether this is the "any" address for its family.
         * See g_inet_address_get_is_any().
         * @param isAny The value for the {@code is-any} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsAny(boolean isAny) {
            names.add("is-any");
            values.add(org.gtk.gobject.Value.create(isAny));
            return this;
        }
        
        /**
         * Whether this is a link-local address.
         * See g_inet_address_get_is_link_local().
         * @param isLinkLocal The value for the {@code is-link-local} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsLinkLocal(boolean isLinkLocal) {
            names.add("is-link-local");
            values.add(org.gtk.gobject.Value.create(isLinkLocal));
            return this;
        }
        
        /**
         * Whether this is the loopback address for its family.
         * See g_inet_address_get_is_loopback().
         * @param isLoopback The value for the {@code is-loopback} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsLoopback(boolean isLoopback) {
            names.add("is-loopback");
            values.add(org.gtk.gobject.Value.create(isLoopback));
            return this;
        }
        
        /**
         * Whether this is a global multicast address.
         * See g_inet_address_get_is_mc_global().
         * @param isMcGlobal The value for the {@code is-mc-global} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsMcGlobal(boolean isMcGlobal) {
            names.add("is-mc-global");
            values.add(org.gtk.gobject.Value.create(isMcGlobal));
            return this;
        }
        
        /**
         * Whether this is a link-local multicast address.
         * See g_inet_address_get_is_mc_link_local().
         * @param isMcLinkLocal The value for the {@code is-mc-link-local} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsMcLinkLocal(boolean isMcLinkLocal) {
            names.add("is-mc-link-local");
            values.add(org.gtk.gobject.Value.create(isMcLinkLocal));
            return this;
        }
        
        /**
         * Whether this is a node-local multicast address.
         * See g_inet_address_get_is_mc_node_local().
         * @param isMcNodeLocal The value for the {@code is-mc-node-local} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsMcNodeLocal(boolean isMcNodeLocal) {
            names.add("is-mc-node-local");
            values.add(org.gtk.gobject.Value.create(isMcNodeLocal));
            return this;
        }
        
        /**
         * Whether this is an organization-local multicast address.
         * See g_inet_address_get_is_mc_org_local().
         * @param isMcOrgLocal The value for the {@code is-mc-org-local} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsMcOrgLocal(boolean isMcOrgLocal) {
            names.add("is-mc-org-local");
            values.add(org.gtk.gobject.Value.create(isMcOrgLocal));
            return this;
        }
        
        /**
         * Whether this is a site-local multicast address.
         * See g_inet_address_get_is_mc_site_local().
         * @param isMcSiteLocal The value for the {@code is-mc-site-local} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsMcSiteLocal(boolean isMcSiteLocal) {
            names.add("is-mc-site-local");
            values.add(org.gtk.gobject.Value.create(isMcSiteLocal));
            return this;
        }
        
        /**
         * Whether this is a multicast address.
         * See g_inet_address_get_is_multicast().
         * @param isMulticast The value for the {@code is-multicast} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsMulticast(boolean isMulticast) {
            names.add("is-multicast");
            values.add(org.gtk.gobject.Value.create(isMulticast));
            return this;
        }
        
        /**
         * Whether this is a site-local address.
         * See g_inet_address_get_is_loopback().
         * @param isSiteLocal The value for the {@code is-site-local} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsSiteLocal(boolean isSiteLocal) {
            names.add("is-site-local");
            values.add(org.gtk.gobject.Value.create(isSiteLocal));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_inet_address_new_any = Interop.downcallHandle(
            "g_inet_address_new_any",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_inet_address_new_from_bytes = Interop.downcallHandle(
            "g_inet_address_new_from_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_inet_address_new_from_string = Interop.downcallHandle(
            "g_inet_address_new_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_new_loopback = Interop.downcallHandle(
            "g_inet_address_new_loopback",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_inet_address_equal = Interop.downcallHandle(
            "g_inet_address_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_family = Interop.downcallHandle(
            "g_inet_address_get_family",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_any = Interop.downcallHandle(
            "g_inet_address_get_is_any",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_link_local = Interop.downcallHandle(
            "g_inet_address_get_is_link_local",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_loopback = Interop.downcallHandle(
            "g_inet_address_get_is_loopback",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_global = Interop.downcallHandle(
            "g_inet_address_get_is_mc_global",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_link_local = Interop.downcallHandle(
            "g_inet_address_get_is_mc_link_local",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_node_local = Interop.downcallHandle(
            "g_inet_address_get_is_mc_node_local",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_org_local = Interop.downcallHandle(
            "g_inet_address_get_is_mc_org_local",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_site_local = Interop.downcallHandle(
            "g_inet_address_get_is_mc_site_local",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_multicast = Interop.downcallHandle(
            "g_inet_address_get_is_multicast",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_is_site_local = Interop.downcallHandle(
            "g_inet_address_get_is_site_local",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_native_size = Interop.downcallHandle(
            "g_inet_address_get_native_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_to_bytes = Interop.downcallHandle(
            "g_inet_address_to_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_to_string = Interop.downcallHandle(
            "g_inet_address_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_inet_address_get_type = Interop.downcallHandle(
            "g_inet_address_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}

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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.InetAddressPrivate.getMemoryLayout().withName("priv")
    ).withName("GInetAddress");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public InetAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InetAddress */
    public static InetAddress castFrom(org.gtk.gobject.Object gobject) {
        return new InetAddress(gobject.refcounted());
    }
    
    private static Refcounted constructNewAny(@NotNull org.gtk.gio.SocketFamily family) {
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_inet_address_new_any.invokeExact(family.getValue()), true);
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
        return new InetAddress(constructNewAny(family));
    }
    
    private static Refcounted constructNewFromBytes(byte[] bytes, @NotNull org.gtk.gio.SocketFamily family) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_inet_address_new_from_bytes.invokeExact(Interop.allocateNativeArray(bytes, false), family.getValue()), true);
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
    public static InetAddress newFromBytes(byte[] bytes, @NotNull org.gtk.gio.SocketFamily family) {
        return new InetAddress(constructNewFromBytes(bytes, family));
    }
    
    private static Refcounted constructNewFromString(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_inet_address_new_from_string.invokeExact(Interop.allocateNativeString(string)), true);
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
        return new InetAddress(constructNewFromString(string));
    }
    
    private static Refcounted constructNewLoopback(@NotNull org.gtk.gio.SocketFamily family) {
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_inet_address_new_loopback.invokeExact(family.getValue()), true);
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
        return new InetAddress(constructNewLoopback(family));
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
            RESULT = (int) DowncallHandles.g_inet_address_equal.invokeExact(handle(), otherAddress.handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_family.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_any.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_link_local.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_loopback.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_global.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_link_local.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_node_local.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_org_local.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_mc_site_local.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_multicast.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_inet_address_get_is_site_local.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.g_inet_address_get_native_size.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_to_bytes.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_inet_address_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_inet_address_new_any = Interop.downcallHandle(
            "g_inet_address_new_any",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_inet_address_new_from_bytes = Interop.downcallHandle(
            "g_inet_address_new_from_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_inet_address_new_from_string = Interop.downcallHandle(
            "g_inet_address_new_from_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_new_loopback = Interop.downcallHandle(
            "g_inet_address_new_loopback",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_inet_address_equal = Interop.downcallHandle(
            "g_inet_address_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_family = Interop.downcallHandle(
            "g_inet_address_get_family",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_any = Interop.downcallHandle(
            "g_inet_address_get_is_any",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_link_local = Interop.downcallHandle(
            "g_inet_address_get_is_link_local",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_loopback = Interop.downcallHandle(
            "g_inet_address_get_is_loopback",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_global = Interop.downcallHandle(
            "g_inet_address_get_is_mc_global",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_link_local = Interop.downcallHandle(
            "g_inet_address_get_is_mc_link_local",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_node_local = Interop.downcallHandle(
            "g_inet_address_get_is_mc_node_local",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_org_local = Interop.downcallHandle(
            "g_inet_address_get_is_mc_org_local",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_mc_site_local = Interop.downcallHandle(
            "g_inet_address_get_is_mc_site_local",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_multicast = Interop.downcallHandle(
            "g_inet_address_get_is_multicast",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_is_site_local = Interop.downcallHandle(
            "g_inet_address_get_is_site_local",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_get_native_size = Interop.downcallHandle(
            "g_inet_address_get_native_size",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_to_bytes = Interop.downcallHandle(
            "g_inet_address_to_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_inet_address_to_string = Interop.downcallHandle(
            "g_inet_address_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}

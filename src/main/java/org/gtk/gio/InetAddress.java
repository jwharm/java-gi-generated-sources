package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public InetAddress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InetAddress */
    public static InetAddress castFrom(org.gtk.gobject.Object gobject) {
        return new InetAddress(gobject.refcounted());
    }
    
    static final MethodHandle g_inet_address_new_any = Interop.downcallHandle(
        "g_inet_address_new_any",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewAny(SocketFamily family) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_inet_address_new_any.invokeExact(family.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link InetAddress} for the "any" address (unassigned/"don't
     * care") for {@code family}.
     */
    public static InetAddress newAny(SocketFamily family) {
        return new InetAddress(constructNewAny(family));
    }
    
    static final MethodHandle g_inet_address_new_from_bytes = Interop.downcallHandle(
        "g_inet_address_new_from_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromBytes(byte[] bytes, SocketFamily family) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_inet_address_new_from_bytes.invokeExact(Interop.allocateNativeArray(bytes).handle(), family.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link InetAddress} from the given {@code family} and {@code bytes}.
     * {@code bytes} should be 4 bytes for {@link SocketFamily#IPV4} and 16 bytes for
     * {@link SocketFamily#IPV6}.
     */
    public static InetAddress newFromBytes(byte[] bytes, SocketFamily family) {
        return new InetAddress(constructNewFromBytes(bytes, family));
    }
    
    static final MethodHandle g_inet_address_new_from_string = Interop.downcallHandle(
        "g_inet_address_new_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromString(java.lang.String string) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_inet_address_new_from_string.invokeExact(Interop.allocateNativeString(string).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses {@code string} as an IP address and creates a new {@link InetAddress}.
     */
    public static InetAddress newFromString(java.lang.String string) {
        return new InetAddress(constructNewFromString(string));
    }
    
    static final MethodHandle g_inet_address_new_loopback = Interop.downcallHandle(
        "g_inet_address_new_loopback",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewLoopback(SocketFamily family) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_inet_address_new_loopback.invokeExact(family.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link InetAddress} for the loopback address for {@code family}.
     */
    public static InetAddress newLoopback(SocketFamily family) {
        return new InetAddress(constructNewLoopback(family));
    }
    
    static final MethodHandle g_inet_address_equal = Interop.downcallHandle(
        "g_inet_address_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if two {@link InetAddress} instances are equal, e.g. the same address.
     */
    public boolean equal(InetAddress otherAddress) {
        try {
            var RESULT = (int) g_inet_address_equal.invokeExact(handle(), otherAddress.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_family = Interop.downcallHandle(
        "g_inet_address_get_family",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code address}'s family
     */
    public SocketFamily getFamily() {
        try {
            var RESULT = (int) g_inet_address_get_family.invokeExact(handle());
            return new SocketFamily(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_any = Interop.downcallHandle(
        "g_inet_address_get_is_any",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is the "any" address for its family.
     */
    public boolean getIsAny() {
        try {
            var RESULT = (int) g_inet_address_get_is_any.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_link_local = Interop.downcallHandle(
        "g_inet_address_get_is_link_local",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is a link-local address (that is, if it
     * identifies a host on a local network that is not connected to the
     * Internet).
     */
    public boolean getIsLinkLocal() {
        try {
            var RESULT = (int) g_inet_address_get_is_link_local.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_loopback = Interop.downcallHandle(
        "g_inet_address_get_is_loopback",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is the loopback address for its family.
     */
    public boolean getIsLoopback() {
        try {
            var RESULT = (int) g_inet_address_get_is_loopback.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_mc_global = Interop.downcallHandle(
        "g_inet_address_get_is_mc_global",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is a global multicast address.
     */
    public boolean getIsMcGlobal() {
        try {
            var RESULT = (int) g_inet_address_get_is_mc_global.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_mc_link_local = Interop.downcallHandle(
        "g_inet_address_get_is_mc_link_local",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is a link-local multicast address.
     */
    public boolean getIsMcLinkLocal() {
        try {
            var RESULT = (int) g_inet_address_get_is_mc_link_local.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_mc_node_local = Interop.downcallHandle(
        "g_inet_address_get_is_mc_node_local",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is a node-local multicast address.
     */
    public boolean getIsMcNodeLocal() {
        try {
            var RESULT = (int) g_inet_address_get_is_mc_node_local.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_mc_org_local = Interop.downcallHandle(
        "g_inet_address_get_is_mc_org_local",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is an organization-local multicast address.
     */
    public boolean getIsMcOrgLocal() {
        try {
            var RESULT = (int) g_inet_address_get_is_mc_org_local.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_mc_site_local = Interop.downcallHandle(
        "g_inet_address_get_is_mc_site_local",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is a site-local multicast address.
     */
    public boolean getIsMcSiteLocal() {
        try {
            var RESULT = (int) g_inet_address_get_is_mc_site_local.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_multicast = Interop.downcallHandle(
        "g_inet_address_get_is_multicast",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is a multicast address.
     */
    public boolean getIsMulticast() {
        try {
            var RESULT = (int) g_inet_address_get_is_multicast.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_is_site_local = Interop.downcallHandle(
        "g_inet_address_get_is_site_local",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code address} is a site-local address such as 10.0.0.1
     * (that is, the address identifies a host on a local network that can
     * not be reached directly from the Internet, but which may have
     * outgoing Internet connectivity via a NAT or firewall).
     */
    public boolean getIsSiteLocal() {
        try {
            var RESULT = (int) g_inet_address_get_is_site_local.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_get_native_size = Interop.downcallHandle(
        "g_inet_address_get_native_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size of the native raw binary address for {@code address}. This
     * is the size of the data that you get from g_inet_address_to_bytes().
     */
    public long getNativeSize() {
        try {
            var RESULT = (long) g_inet_address_get_native_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_to_bytes = Interop.downcallHandle(
        "g_inet_address_to_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the raw binary address data from {@code address}.
     */
    public PointerByte toBytes() {
        try {
            var RESULT = (MemoryAddress) g_inet_address_to_bytes.invokeExact(handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_to_string = Interop.downcallHandle(
        "g_inet_address_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts {@code address} to string form.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) g_inet_address_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

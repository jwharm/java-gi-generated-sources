package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link InetAddressMask} represents a range of IPv4 or IPv6 addresses
 * described by a base address and a length indicating how many bits
 * of the base address are relevant for matching purposes. These are
 * often given in string form. Eg, "10.0.0.0/8", or "fe80::/10".
 */
public class InetAddressMask extends org.gtk.gobject.Object implements Initable {

    public InetAddressMask(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to InetAddressMask */
    public static InetAddressMask castFrom(org.gtk.gobject.Object gobject) {
        return new InetAddressMask(gobject.refcounted());
    }
    
    static final MethodHandle g_inet_address_mask_new = Interop.downcallHandle(
        "g_inet_address_mask_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(InetAddress addr, int length) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_inet_address_mask_new.invokeExact(addr.handle(), length, GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link InetAddressMask} representing all addresses whose
     * first {@code length} bits match {@code addr}.
     */
    public InetAddressMask(InetAddress addr, int length) throws GErrorException {
        super(constructNew(addr, length));
    }
    
    static final MethodHandle g_inet_address_mask_new_from_string = Interop.downcallHandle(
        "g_inet_address_mask_new_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromString(java.lang.String maskString) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_inet_address_mask_new_from_string.invokeExact(Interop.allocateNativeString(maskString).handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses {@code mask_string} as an IP address and (optional) length, and
     * creates a new {@link InetAddressMask}. The length, if present, is
     * delimited by a "/". If it is not present, then the length is
     * assumed to be the full length of the address.
     */
    public static InetAddressMask newFromString(java.lang.String maskString) throws GErrorException {
        return new InetAddressMask(constructNewFromString(maskString));
    }
    
    static final MethodHandle g_inet_address_mask_equal = Interop.downcallHandle(
        "g_inet_address_mask_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests if {@code mask} and {@code mask2} are the same mask.
     */
    public boolean equal(InetAddressMask mask2) {
        try {
            var RESULT = (int) g_inet_address_mask_equal.invokeExact(handle(), mask2.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_mask_get_address = Interop.downcallHandle(
        "g_inet_address_mask_get_address",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code mask}'s base address
     */
    public InetAddress getAddress() {
        try {
            var RESULT = (MemoryAddress) g_inet_address_mask_get_address.invokeExact(handle());
            return new InetAddress(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_mask_get_family = Interop.downcallHandle(
        "g_inet_address_mask_get_family",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link SocketFamily} of {@code mask}'s address
     */
    public SocketFamily getFamily() {
        try {
            var RESULT = (int) g_inet_address_mask_get_family.invokeExact(handle());
            return new SocketFamily(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_mask_get_length = Interop.downcallHandle(
        "g_inet_address_mask_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code mask}'s length
     */
    public int getLength() {
        try {
            var RESULT = (int) g_inet_address_mask_get_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_mask_matches = Interop.downcallHandle(
        "g_inet_address_mask_matches",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests if {@code address} falls within the range described by {@code mask}.
     */
    public boolean matches(InetAddress address) {
        try {
            var RESULT = (int) g_inet_address_mask_matches.invokeExact(handle(), address.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_inet_address_mask_to_string = Interop.downcallHandle(
        "g_inet_address_mask_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts {@code mask} back to its corresponding string form.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) g_inet_address_mask_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}

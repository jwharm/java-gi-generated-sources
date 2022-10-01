package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew(InetAddress addr, int length) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT = Refcounted.get(gtk_h.g_inet_address_mask_new(addr.handle(), length, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link InetAddressMask} representing all addresses whose
     * first {@code length} bits match {@code addr}.
     */
    public InetAddressMask(InetAddress addr, int length) throws GErrorException {
        super(constructNew(addr, length));
    }
    
    private static Refcounted constructNewFromString(java.lang.String maskString) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT = Refcounted.get(gtk_h.g_inet_address_mask_new_from_string(Interop.allocateNativeString(maskString).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    
    /**
     * Tests if {@code mask} and {@code mask2} are the same mask.
     */
    public boolean equal(InetAddressMask mask2) {
        var RESULT = gtk_h.g_inet_address_mask_equal(handle(), mask2.handle());
        return RESULT != 0;
    }
    
    /**
     * Gets {@code mask}'s base address
     */
    public InetAddress getAddress() {
        var RESULT = gtk_h.g_inet_address_mask_get_address(handle());
        return new InetAddress(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the {@link SocketFamily} of {@code mask}'s address
     */
    public SocketFamily getFamily() {
        var RESULT = gtk_h.g_inet_address_mask_get_family(handle());
        return new SocketFamily(RESULT);
    }
    
    /**
     * Gets {@code mask}'s length
     */
    public int getLength() {
        var RESULT = gtk_h.g_inet_address_mask_get_length(handle());
        return RESULT;
    }
    
    /**
     * Tests if {@code address} falls within the range described by {@code mask}.
     */
    public boolean matches(InetAddress address) {
        var RESULT = gtk_h.g_inet_address_mask_matches(handle(), address.handle());
        return RESULT != 0;
    }
    
    /**
     * Converts {@code mask} back to its corresponding string form.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.g_inet_address_mask_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}

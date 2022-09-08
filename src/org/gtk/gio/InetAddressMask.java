package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GInetAddressMask represents a range of IPv4 or IPv6 addresses
 * described by a base address and a length indicating how many bits
 * of the base address are relevant for matching purposes. These are
 * often given in string form. Eg, "10.0.0.0/8", or "fe80::/10".
 */
public class InetAddressMask extends org.gtk.gobject.Object implements Initable {

    public InetAddressMask(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to InetAddressMask */
    public static InetAddressMask castFrom(org.gtk.gobject.Object gobject) {
        return new InetAddressMask(gobject.getReference());
    }
    
    /**
     * Tests if @mask and @mask2 are the same mask.
     */
    public boolean equal(InetAddressMask mask2) {
        var RESULT = gtk_h.g_inet_address_mask_equal(handle(), mask2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets @mask's base address
     */
    public InetAddress getAddress() {
        var RESULT = gtk_h.g_inet_address_mask_get_address(handle());
        return new InetAddress(References.get(RESULT, false));
    }
    
    /**
     * Gets the #GSocketFamily of @mask's address
     */
    public SocketFamily getFamily() {
        var RESULT = gtk_h.g_inet_address_mask_get_family(handle());
        return SocketFamily.fromValue(RESULT);
    }
    
    /**
     * Gets @mask's length
     */
    public int getLength() {
        var RESULT = gtk_h.g_inet_address_mask_get_length(handle());
        return RESULT;
    }
    
    /**
     * Tests if @address falls within the range described by @mask.
     */
    public boolean matches(InetAddress address) {
        var RESULT = gtk_h.g_inet_address_mask_matches(handle(), address.handle());
        return (RESULT != 0);
    }
    
    /**
     * Converts @mask back to its corresponding string form.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.g_inet_address_mask_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}

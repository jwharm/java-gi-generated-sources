package org.gtk.gio;

import org.gtk.gobject.*;
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

    public InetAddressMask(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to InetAddressMask */
    public static InetAddressMask castFrom(org.gtk.gobject.Object gobject) {
        return new InetAddressMask(gobject.getProxy());
    }
    
    /**
     * Tests if @mask and @mask2 are the same mask.
     */
    public boolean equal(InetAddressMask mask2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_mask_equal(HANDLE(), mask2.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets @mask's base address
     */
    public InetAddress getAddress() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_mask_get_address(HANDLE());
        return new InetAddress(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the #GSocketFamily of @mask's address
     */
    public SocketFamily getFamily() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_mask_get_family(HANDLE());
        return SocketFamily.fromValue(RESULT);
    }
    
    /**
     * Gets @mask's length
     */
    public int getLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_mask_get_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Tests if @address falls within the range described by @mask.
     */
    public boolean matches(InetAddress address) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_mask_matches(HANDLE(), address.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Converts @mask back to its corresponding string form.
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_mask_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
}

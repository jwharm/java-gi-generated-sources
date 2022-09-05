package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GInetAddress represents an IPv4 or IPv6 internet address. Use
 * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_async() to
 * look up the #GInetAddress for a hostname. Use
 * g_resolver_lookup_by_address() or
 * g_resolver_lookup_by_address_async() to look up the hostname for a
 * #GInetAddress.
 * 
 * To actually connect to a remote host, you will need a
 * #GInetSocketAddress (which includes a #GInetAddress as well as a
 * port number).
 */
public class InetAddress extends org.gtk.gobject.Object {

    public InetAddress(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to InetAddress */
    public static InetAddress castFrom(org.gtk.gobject.Object gobject) {
        return new InetAddress(gobject.getProxy());
    }
    
    /**
     * Creates a #GInetAddress for the "any" address (unassigned/"don't
     * care") for @family.
     */
    public static InetAddress newAny(SocketFamily family) {
        return new InetAddress(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_new_any(family.getValue()), true));
    }
    
    /**
     * Creates a new #GInetAddress from the given @family and @bytes.
     * @bytes should be 4 bytes for %G_SOCKET_FAMILY_IPV4 and 16 bytes for
     * %G_SOCKET_FAMILY_IPV6.
     */
    public InetAddress(byte[] bytes, SocketFamily family) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_new_from_bytes(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, bytes), family.getValue()), true));
    }
    
    /**
     * Parses @string as an IP address and creates a new #GInetAddress.
     */
    public InetAddress(java.lang.String string) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_new_from_string(Interop.getAllocator().allocateUtf8String(string)), true));
    }
    
    /**
     * Creates a #GInetAddress for the loopback address for @family.
     */
    public static InetAddress newLoopback(SocketFamily family) {
        return new InetAddress(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_new_loopback(family.getValue()), true));
    }
    
    /**
     * Checks if two #GInetAddress instances are equal, e.g. the same address.
     */
    public boolean equal(InetAddress otherAddress) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_equal(HANDLE(), otherAddress.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets @address's family
     */
    public SocketFamily getFamily() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_family(HANDLE());
        return SocketFamily.fromValue(RESULT);
    }
    
    /**
     * Tests whether @address is the "any" address for its family.
     */
    public boolean getIsAny() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_any(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a link-local address (that is, if it
     * identifies a host on a local network that is not connected to the
     * Internet).
     */
    public boolean getIsLinkLocal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_link_local(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is the loopback address for its family.
     */
    public boolean getIsLoopback() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_loopback(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a global multicast address.
     */
    public boolean getIsMcGlobal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_mc_global(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a link-local multicast address.
     */
    public boolean getIsMcLinkLocal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_mc_link_local(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a node-local multicast address.
     */
    public boolean getIsMcNodeLocal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_mc_node_local(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is an organization-local multicast address.
     */
    public boolean getIsMcOrgLocal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_mc_org_local(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a site-local multicast address.
     */
    public boolean getIsMcSiteLocal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_mc_site_local(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a multicast address.
     */
    public boolean getIsMulticast() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_multicast(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a site-local address such as 10.0.0.1
     * (that is, the address identifies a host on a local network that can
     * not be reached directly from the Internet, but which may have
     * outgoing Internet connectivity via a NAT or firewall).
     */
    public boolean getIsSiteLocal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_is_site_local(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the size of the native raw binary address for @address. This
     * is the size of the data that you get from g_inet_address_to_bytes().
     */
    public long getNativeSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_get_native_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Converts @address to string form.
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_inet_address_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
}

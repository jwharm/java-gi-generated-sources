package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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

    public InetAddress(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to InetAddress */
    public static InetAddress castFrom(org.gtk.gobject.Object gobject) {
        return new InetAddress(gobject.getReference());
    }
    
    private static Reference constructNewAny(SocketFamily family) {
        Reference RESULT = References.get(gtk_h.g_inet_address_new_any(family.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a #GInetAddress for the &#34;any&#34; address (unassigned/&#34;don&#39;t
     * care&#34;) for @family.
     */
    public static InetAddress newAny(SocketFamily family) {
        return new InetAddress(constructNewAny(family));
    }
    
    private static Reference constructNewFromBytes(byte[] bytes, SocketFamily family) {
        Reference RESULT = References.get(gtk_h.g_inet_address_new_from_bytes(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, bytes)).handle(), family.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GInetAddress from the given @family and @bytes.
     * @bytes should be 4 bytes for {@link org.gtk.gio.SocketFamily#IPV4} and 16 bytes for
     * and 16 bytes for
     * %G_SOCKET_FAMILY_IPV6.
     */
    public static InetAddress newFromBytes(byte[] bytes, SocketFamily family) {
        return new InetAddress(constructNewFromBytes(bytes, family));
    }
    
    private static Reference constructNewFromString(java.lang.String string) {
        Reference RESULT = References.get(gtk_h.g_inet_address_new_from_string(Interop.allocateNativeString(string).handle()), true);
        return RESULT;
    }
    
    /**
     * Parses @string as an IP address and creates a new #GInetAddress.
     */
    public static InetAddress newFromString(java.lang.String string) {
        return new InetAddress(constructNewFromString(string));
    }
    
    private static Reference constructNewLoopback(SocketFamily family) {
        Reference RESULT = References.get(gtk_h.g_inet_address_new_loopback(family.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a #GInetAddress for the loopback address for @family.
     */
    public static InetAddress newLoopback(SocketFamily family) {
        return new InetAddress(constructNewLoopback(family));
    }
    
    /**
     * Checks if two #GInetAddress instances are equal, e.g. the same address.
     */
    public boolean equal(InetAddress otherAddress) {
        var RESULT = gtk_h.g_inet_address_equal(handle(), otherAddress.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets @address&#39;s family
     */
    public SocketFamily getFamily() {
        var RESULT = gtk_h.g_inet_address_get_family(handle());
        return SocketFamily.fromValue(RESULT);
    }
    
    /**
     * Tests whether @address is the &#34;any&#34; address for its family.
     */
    public boolean getIsAny() {
        var RESULT = gtk_h.g_inet_address_get_is_any(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a link-local address (that is, if it
     * identifies a host on a local network that is not connected to the
     * Internet).
     */
    public boolean getIsLinkLocal() {
        var RESULT = gtk_h.g_inet_address_get_is_link_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is the loopback address for its family.
     */
    public boolean getIsLoopback() {
        var RESULT = gtk_h.g_inet_address_get_is_loopback(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a global multicast address.
     */
    public boolean getIsMcGlobal() {
        var RESULT = gtk_h.g_inet_address_get_is_mc_global(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a link-local multicast address.
     */
    public boolean getIsMcLinkLocal() {
        var RESULT = gtk_h.g_inet_address_get_is_mc_link_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a node-local multicast address.
     */
    public boolean getIsMcNodeLocal() {
        var RESULT = gtk_h.g_inet_address_get_is_mc_node_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is an organization-local multicast address.
     */
    public boolean getIsMcOrgLocal() {
        var RESULT = gtk_h.g_inet_address_get_is_mc_org_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a site-local multicast address.
     */
    public boolean getIsMcSiteLocal() {
        var RESULT = gtk_h.g_inet_address_get_is_mc_site_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a multicast address.
     */
    public boolean getIsMulticast() {
        var RESULT = gtk_h.g_inet_address_get_is_multicast(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether @address is a site-local address such as 10.0.0.1
     * (that is, the address identifies a host on a local network that can
     * not be reached directly from the Internet, but which may have
     * outgoing Internet connectivity via a NAT or firewall).
     */
    public boolean getIsSiteLocal() {
        var RESULT = gtk_h.g_inet_address_get_is_site_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the size of the native raw binary address for @address. This
     * is the size of the data that you get from g_inet_address_to_bytes().
     */
    public long getNativeSize() {
        var RESULT = gtk_h.g_inet_address_get_native_size(handle());
        return RESULT;
    }
    
    /**
     * Converts @address to string form.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.g_inet_address_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
}

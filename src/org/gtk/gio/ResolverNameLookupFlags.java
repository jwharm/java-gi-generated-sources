package org.gtk.gio;

/**
 * Flags to modify lookup behavior.
 */
public class ResolverNameLookupFlags {

    /**
     * default behavior (same as g_resolver_lookup_by_name())
     */
    public static final int DEFAULT = 0;
    
    /**
     * only resolve ipv4 addresses
     */
    public static final int IPV4_ONLY = 1;
    
    /**
     * only resolve ipv6 addresses
     */
    public static final int IPV6_ONLY = 2;
    
}

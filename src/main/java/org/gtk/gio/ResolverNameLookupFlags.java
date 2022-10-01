package org.gtk.gio;

/**
 * Flags to modify lookup behavior.
 */
public class ResolverNameLookupFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * default behavior (same as g_resolver_lookup_by_name())
     */
    public static final ResolverNameLookupFlags DEFAULT = new ResolverNameLookupFlags(0);
    
    /**
     * only resolve ipv4 addresses
     */
    public static final ResolverNameLookupFlags IPV4_ONLY = new ResolverNameLookupFlags(1);
    
    /**
     * only resolve ipv6 addresses
     */
    public static final ResolverNameLookupFlags IPV6_ONLY = new ResolverNameLookupFlags(2);
    
    public ResolverNameLookupFlags(int value) {
        super(value);
    }
    
}

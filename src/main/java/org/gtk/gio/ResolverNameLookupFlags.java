package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to modify lookup behavior.
 * @version 2.60
 */
public class ResolverNameLookupFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GResolverNameLookupFlags";
    
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
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ResolverNameLookupFlags or(ResolverNameLookupFlags mask) {
        return new ResolverNameLookupFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ResolverNameLookupFlags combined(ResolverNameLookupFlags mask, ResolverNameLookupFlags... masks) {
        int value = mask.getValue();        for (ResolverNameLookupFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ResolverNameLookupFlags(value);
    }
}

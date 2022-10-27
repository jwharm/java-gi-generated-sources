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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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

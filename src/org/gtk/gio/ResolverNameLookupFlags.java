package org.gtk.gio;

/**
 * Flags to modify lookup behavior.
 */
public class ResolverNameLookupFlags {

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
    
    private int value;
    
    public ResolverNameLookupFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ResolverNameLookupFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ResolverNameLookupFlags combined(ResolverNameLookupFlags mask) {
        return new ResolverNameLookupFlags(this.getValue() | mask.getValue());
    }
    
    public static ResolverNameLookupFlags combined(ResolverNameLookupFlags mask, ResolverNameLookupFlags... masks) {
        int value = mask.getValue();
        for (ResolverNameLookupFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ResolverNameLookupFlags(value);
    }
    
}

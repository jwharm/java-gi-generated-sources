package org.gtk.gio;

/**
 * GResourceLookupFlags determine how resource path lookups are handled.
 */
public class ResourceLookupFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final ResourceLookupFlags NONE = new ResourceLookupFlags(0);
    
    public ResourceLookupFlags(int value) {
        super(value);
    }
    
}

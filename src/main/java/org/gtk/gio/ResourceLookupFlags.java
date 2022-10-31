package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GResourceLookupFlags determine how resource path lookups are handled.
 * @version 2.32
 */
public class ResourceLookupFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GResourceLookupFlags";
    
    /**
     * No flags set.
     */
    public static final ResourceLookupFlags NONE = new ResourceLookupFlags(0);
    
    public ResourceLookupFlags(int value) {
        super(value);
    }
}

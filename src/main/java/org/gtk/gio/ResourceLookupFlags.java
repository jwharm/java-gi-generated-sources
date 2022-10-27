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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No flags set.
     */
    public static final ResourceLookupFlags NONE = new ResourceLookupFlags(0);
    
    public ResourceLookupFlags(int value) {
        super(value);
    }
}

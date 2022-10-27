package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GEmblemOrigin is used to add information about the origin of the emblem
 * to {@link Emblem}.
 * @version 2.18
 */
public class EmblemOrigin extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Emblem of unknown origin
     */
    public static final EmblemOrigin UNKNOWN = new EmblemOrigin(0);
    
    /**
     * Emblem adds device-specific information
     */
    public static final EmblemOrigin DEVICE = new EmblemOrigin(1);
    
    /**
     * Emblem depicts live metadata, such as "readonly"
     */
    public static final EmblemOrigin LIVEMETADATA = new EmblemOrigin(2);
    
    /**
     * Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)
     */
    public static final EmblemOrigin TAG = new EmblemOrigin(3);
    
    public EmblemOrigin(int value) {
        super(value);
    }
}

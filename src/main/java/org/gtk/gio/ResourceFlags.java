package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GResourceFlags give information about a particular file inside a resource
 * bundle.
 * @version 2.32
 */
public class ResourceFlags extends io.github.jwharm.javagi.Bitfield {
    
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
    public static final ResourceFlags NONE = new ResourceFlags(0);
    
    /**
     * The file is compressed.
     */
    public static final ResourceFlags COMPRESSED = new ResourceFlags(1);
    
    public ResourceFlags(int value) {
        super(value);
    }
}

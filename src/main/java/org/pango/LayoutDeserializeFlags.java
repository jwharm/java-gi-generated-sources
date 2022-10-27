package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that influence the behavior of {@link Layout#deserialize}.
 * <p>
 * New members may be added to this enumeration over time.
 * @version 1.50
 */
public class LayoutDeserializeFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Default behavior
     */
    public static final LayoutDeserializeFlags DEFAULT = new LayoutDeserializeFlags(0);
    
    /**
     * Apply context information
     *   from the serialization to the {@code PangoContext}
     */
    public static final LayoutDeserializeFlags CONTEXT = new LayoutDeserializeFlags(1);
    
    public LayoutDeserializeFlags(int value) {
        super(value);
    }
}

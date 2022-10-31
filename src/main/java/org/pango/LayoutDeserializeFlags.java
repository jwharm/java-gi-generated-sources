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
    
    private static final java.lang.String C_TYPE_NAME = "PangoLayoutDeserializeFlags";
    
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

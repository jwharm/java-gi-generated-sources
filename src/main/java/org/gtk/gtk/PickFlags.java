package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that influence the behavior of {@code Widget#pick}.
 */
public class PickFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The default behavior, include widgets that are receiving events
     */
    public static final PickFlags DEFAULT = new PickFlags(0);
    
    /**
     * Include widgets that are insensitive
     */
    public static final PickFlags INSENSITIVE = new PickFlags(1);
    
    /**
     * Include widgets that are marked as non-targetable. See {@code Widget:can-target}
     */
    public static final PickFlags NON_TARGETABLE = new PickFlags(2);
    
    public PickFlags(int value) {
        super(value);
    }
}

package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that influence the behavior of {@code Widget#pick}.
 */
public class PickFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPickFlags";
    
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

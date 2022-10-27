package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the side of the entry at which an icon is placed.
 */
public class EntryIconPosition extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * At the beginning of the entry (depending on the text direction).
     */
    public static final EntryIconPosition PRIMARY = new EntryIconPosition(0);
    
    /**
     * At the end of the entry (depending on the text direction).
     */
    public static final EntryIconPosition SECONDARY = new EntryIconPosition(1);
    
    public EntryIconPosition(int value) {
        super(value);
    }
}

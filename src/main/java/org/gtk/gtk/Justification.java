package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used for justifying the text inside a {@link Label} widget.
 */
public class Justification extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The text is placed at the left edge of the label.
     */
    public static final Justification LEFT = new Justification(0);
    
    /**
     * The text is placed at the right edge of the label.
     */
    public static final Justification RIGHT = new Justification(1);
    
    /**
     * The text is placed in the center of the label.
     */
    public static final Justification CENTER = new Justification(2);
    
    /**
     * The text is placed is distributed across the label.
     */
    public static final Justification FILL = new Justification(3);
    
    public Justification(int value) {
        super(value);
    }
}

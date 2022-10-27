package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes title centering behavior of a {@link HeaderBar} widget.
 * @version 1.0
 */
public class CenteringPolicy extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Keep the title centered when possible
     */
    public static final CenteringPolicy LOOSE = new CenteringPolicy(0);
    
    /**
     * Keep the title centered at all cost
     */
    public static final CenteringPolicy STRICT = new CenteringPolicy(1);
    
    public CenteringPolicy(int value) {
        super(value);
    }
}

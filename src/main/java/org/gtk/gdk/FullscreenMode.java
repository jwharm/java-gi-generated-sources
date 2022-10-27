package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Indicates which monitor a surface should span over when in fullscreen mode.
 */
public class FullscreenMode extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Fullscreen on current monitor only.
     */
    public static final FullscreenMode CURRENT_MONITOR = new FullscreenMode(0);
    
    /**
     * Span across all monitors when fullscreen.
     */
    public static final FullscreenMode ALL_MONITORS = new FullscreenMode(1);
    
    public FullscreenMode(int value) {
        super(value);
    }
}

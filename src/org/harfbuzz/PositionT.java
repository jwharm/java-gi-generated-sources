package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for holding a single coordinate value.
 * Contour points and other multi-dimensional data are
 * stored as tuples of #hb_position_t's.
 */
public class PositionT {

    private final int value;
    
    public PositionT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}

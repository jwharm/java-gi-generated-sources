package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding a set of integers. {@link set_t}'s are
 * used to gather and contain glyph IDs, Unicode code
 * points, and various other collections of discrete
 * values.
 */
public class SetT extends io.github.jwharm.javagi.ResourceBase {

    public SetT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}

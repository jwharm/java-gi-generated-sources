package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for holding a shaping plan.
 * <p>
 * Shape plans contain information about how HarfBuzz will shape a
 * particular text segment, based on the segment's properties and the
 * capabilities in the font face in use.
 * <p>
 * Shape plans can be queried about how shaping will perform, given a set
 * of specific input parameters (script, language, direction, features,
 * etc.).
 */
public class ShapePlanT extends io.github.jwharm.javagi.ResourceBase {

    public ShapePlanT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
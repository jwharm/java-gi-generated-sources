package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Font-wide extent values, measured in font units.
 * <p>
 * Note that typically {@code ascender} is positive and {@code descender}
 * negative, in coordinate systems that grow up.
 */
public class FontExtentsT extends io.github.jwharm.javagi.ResourceBase {

    public FontExtentsT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}

package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for holding variation-axis values.
 * <p>
 * The minimum, default, and maximum values are in un-normalized, user scales.
 * <p>
 * &lt;note&gt;Note: at present, the only flag defined for {@code flags} is
 * {@code HB_OT_VAR_AXIS_FLAG_HIDDEN}.&lt;/note&gt;
 */
public class OtVarAxisInfoT extends io.github.jwharm.javagi.ResourceBase {

    public OtVarAxisInfoT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
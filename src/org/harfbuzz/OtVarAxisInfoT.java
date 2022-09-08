package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for holding variation-axis values.
 * 
 * The minimum, default, and maximum values are in un-normalized, user scales.
 * 
 * <note>Note: at present, the only flag defined for @flags is
 * #HB_OT_VAR_AXIS_FLAG_HIDDEN.</note>
 */
public class OtVarAxisInfoT extends io.github.jwharm.javagi.interop.ResourceBase {

    public OtVarAxisInfoT(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}

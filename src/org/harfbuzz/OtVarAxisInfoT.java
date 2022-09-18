package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type for holding variation-axis values.
 * 
 * The minimum, default, and maximum values are in un-normalized, user scales.
 * 
 * &<code>#60</code> note&<code>#62</code> Note: at present, the only flag defined for @flags is
 * <code>#HB_OT_VAR_AXIS_FLAG_HIDDEN</code> &<code>#60</code> /note&<code>#62</code>
 */
public class OtVarAxisInfoT extends io.github.jwharm.javagi.ResourceBase {

    public OtVarAxisInfoT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}

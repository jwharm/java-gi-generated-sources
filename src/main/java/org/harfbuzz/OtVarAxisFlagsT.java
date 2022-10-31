package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for {@link OtVarAxisInfoT}.
 * @version 2.2.0
 */
public class OtVarAxisFlagsT extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_var_axis_flags_t";
    
    /**
     * The axis should not be exposed directly in user interfaces.
     */
    public static final OtVarAxisFlagsT HIDDEN = new OtVarAxisFlagsT(1);
    
    public OtVarAxisFlagsT(int value) {
        super(value);
    }
}

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
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public OtVarAxisFlagsT combined(OtVarAxisFlagsT mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static OtVarAxisFlagsT combined(OtVarAxisFlagsT mask, OtVarAxisFlagsT... masks) {
        for (OtVarAxisFlagsT arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}

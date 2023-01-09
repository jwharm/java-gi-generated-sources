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
    
    /**
     * Create a new OtVarAxisFlagsT with the provided value
     */
    public OtVarAxisFlagsT(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public OtVarAxisFlagsT or(OtVarAxisFlagsT... masks) {
        int value = this.getValue();
        for (OtVarAxisFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new OtVarAxisFlagsT(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static OtVarAxisFlagsT combined(OtVarAxisFlagsT mask, OtVarAxisFlagsT... masks) {
        int value = mask.getValue();
        for (OtVarAxisFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new OtVarAxisFlagsT(value);
    }
}

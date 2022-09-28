package org.harfbuzz;

/**
 * Flags for {@link ot_var_axis_info_t}.
 */
public class OtVarAxisFlagsT extends io.github.jwharm.javagi.Bitfield {

    /**
     * The axis should not be exposed directly in user interfaces.
     */
    public static final OtVarAxisFlagsT HIDDEN = new OtVarAxisFlagsT(1);
    
    public OtVarAxisFlagsT(int value) {
        super(value);
    }
    
}

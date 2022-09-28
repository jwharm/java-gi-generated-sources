package org.harfbuzz;

/**
 * Flags for {@link ot_var_axis_info_t}.
 */
public class OtVarAxisFlagsT {

    /**
     * The axis should not be exposed directly in user interfaces.
     */
    public static final OtVarAxisFlagsT HIDDEN = new OtVarAxisFlagsT(1);
    
    private int value;
    
    public OtVarAxisFlagsT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OtVarAxisFlagsT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public OtVarAxisFlagsT combined(OtVarAxisFlagsT mask) {
        return new OtVarAxisFlagsT(this.getValue() | mask.getValue());
    }
    
    public static OtVarAxisFlagsT combined(OtVarAxisFlagsT mask, OtVarAxisFlagsT... masks) {
        int value = mask.getValue();
        for (OtVarAxisFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new OtVarAxisFlagsT(value);
    }
    
}

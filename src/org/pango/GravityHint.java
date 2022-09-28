package org.pango;

/**
 * {@code PangoGravityHint} defines how horizontal scripts should behave in a
 * vertical context.
 * <p>
 * That is, English excerpts in a vertical paragraph for example.
 * <p>
 * See also {@code Pango.Gravity}
 */
public class GravityHint {

    /**
     * scripts will take their natural gravity based
     *   on the base gravity and the script.  This is the default.
     */
    public static final GravityHint NATURAL = new GravityHint(0);
    
    /**
     * always use the base gravity set, regardless of
     *   the script.
     */
    public static final GravityHint STRONG = new GravityHint(1);
    
    /**
     * for scripts not in their natural direction (eg.
     *   Latin in East gravity), choose per-script gravity such that every script
     *   respects the line progression. This means, Latin and Arabic will take
     *   opposite gravities and both flow top-to-bottom for example.
     */
    public static final GravityHint LINE = new GravityHint(2);
    
    private int value;
    
    public GravityHint(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(GravityHint[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

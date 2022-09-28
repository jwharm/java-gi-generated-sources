package org.gnome.adw;

/**
 * Describes the possible folding behavior of a {@link Flap} widget.
 */
public class FlapFoldPolicy {

    /**
     * Disable folding, the flap cannot reach narrow
     *   sizes.
     */
    public static final FlapFoldPolicy NEVER = new FlapFoldPolicy(0);
    
    /**
     * Keep the flap always folded.
     */
    public static final FlapFoldPolicy ALWAYS = new FlapFoldPolicy(1);
    
    /**
     * Fold and unfold the flap based on available
     *   space.
     */
    public static final FlapFoldPolicy AUTO = new FlapFoldPolicy(2);
    
    private int value;
    
    public FlapFoldPolicy(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FlapFoldPolicy[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

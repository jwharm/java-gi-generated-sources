package org.gnome.adw;

/**
 * Describes the possible transitions in a {@link Squeezer} widget.
 */
public class SqueezerTransitionType {

    /**
     * No transition
     */
    public static final SqueezerTransitionType NONE = new SqueezerTransitionType(0);
    
    /**
     * A cross-fade
     */
    public static final SqueezerTransitionType CROSSFADE = new SqueezerTransitionType(1);
    
    private int value;
    
    public SqueezerTransitionType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SqueezerTransitionType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

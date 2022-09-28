package org.gtk.gtk;

/**
 * These enumeration values describe the possible transitions
 * when the child of a {@code GtkRevealer} widget is shown or hidden.
 */
public class RevealerTransitionType {

    /**
     * No transition
     */
    public static final RevealerTransitionType NONE = new RevealerTransitionType(0);
    
    /**
     * Fade in
     */
    public static final RevealerTransitionType CROSSFADE = new RevealerTransitionType(1);
    
    /**
     * Slide in from the left
     */
    public static final RevealerTransitionType SLIDE_RIGHT = new RevealerTransitionType(2);
    
    /**
     * Slide in from the right
     */
    public static final RevealerTransitionType SLIDE_LEFT = new RevealerTransitionType(3);
    
    /**
     * Slide in from the bottom
     */
    public static final RevealerTransitionType SLIDE_UP = new RevealerTransitionType(4);
    
    /**
     * Slide in from the top
     */
    public static final RevealerTransitionType SLIDE_DOWN = new RevealerTransitionType(5);
    
    /**
     * Floop in from the left
     */
    public static final RevealerTransitionType SWING_RIGHT = new RevealerTransitionType(6);
    
    /**
     * Floop in from the right
     */
    public static final RevealerTransitionType SWING_LEFT = new RevealerTransitionType(7);
    
    /**
     * Floop in from the bottom
     */
    public static final RevealerTransitionType SWING_UP = new RevealerTransitionType(8);
    
    /**
     * Floop in from the top
     */
    public static final RevealerTransitionType SWING_DOWN = new RevealerTransitionType(9);
    
    private int value;
    
    public RevealerTransitionType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(RevealerTransitionType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

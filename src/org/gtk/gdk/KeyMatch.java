package org.gtk.gdk;

/**
 * Describes how well an event matches a given keyval and modifiers.
 * <p>
 * {@code GdkKeyMatch} values are returned by {@link KeyEvent#matches}.
 */
public class KeyMatch {

    /**
     * The key event does not match
     */
    public static final KeyMatch NONE = new KeyMatch(0);
    
    /**
     * The key event matches if keyboard state
     *   (specifically, the currently active group) is ignored
     */
    public static final KeyMatch PARTIAL = new KeyMatch(1);
    
    /**
     * The key event matches
     */
    public static final KeyMatch EXACT = new KeyMatch(2);
    
    private int value;
    
    public KeyMatch(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(KeyMatch[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

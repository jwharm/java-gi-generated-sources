package org.gtk.gdk;

/**
 * Defines the reference point of a surface and is used in {@code GdkPopupLayout}.
 */
public class Gravity {

    /**
     * the reference point is at the top left corner.
     */
    public static final Gravity NORTH_WEST = new Gravity(1);
    
    /**
     * the reference point is in the middle of the top edge.
     */
    public static final Gravity NORTH = new Gravity(2);
    
    /**
     * the reference point is at the top right corner.
     */
    public static final Gravity NORTH_EAST = new Gravity(3);
    
    /**
     * the reference point is at the middle of the left edge.
     */
    public static final Gravity WEST = new Gravity(4);
    
    /**
     * the reference point is at the center of the surface.
     */
    public static final Gravity CENTER = new Gravity(5);
    
    /**
     * the reference point is at the middle of the right edge.
     */
    public static final Gravity EAST = new Gravity(6);
    
    /**
     * the reference point is at the lower left corner.
     */
    public static final Gravity SOUTH_WEST = new Gravity(7);
    
    /**
     * the reference point is at the middle of the lower edge.
     */
    public static final Gravity SOUTH = new Gravity(8);
    
    /**
     * the reference point is at the lower right corner.
     */
    public static final Gravity SOUTH_EAST = new Gravity(9);
    
    /**
     * the reference point is at the top left corner of the
     *  surface itself, ignoring window manager decorations.
     */
    public static final Gravity STATIC = new Gravity(10);
    
    private int value;
    
    public Gravity(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Gravity[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

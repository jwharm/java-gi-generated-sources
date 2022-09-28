package org.gtk.gtk;

/**
 * Defines how content overflowing a given area should be handled.
 * <p>
 * This is used in {@link Widget#setOverflow}. The
 * {@code Gtk.Widget:overflow} property is modeled after the
 * CSS overflow property, but implements it only partially.
 */
public class Overflow {

    /**
     * No change is applied. Content is drawn at the specified
     *   position.
     */
    public static final Overflow VISIBLE = new Overflow(0);
    
    /**
     * Content is clipped to the bounds of the area. Content
     *   outside the area is not drawn and cannot be interacted with.
     */
    public static final Overflow HIDDEN = new Overflow(1);
    
    private int value;
    
    public Overflow(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Overflow[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

package org.gtk.gdk;

/**
 * Flags about a paintable object.
 * <p>
 * Implementations use these for optimizations such as caching.
 */
public class PaintableFlags {

    /**
     * The size is immutable.
     *   The {@code GdkPaintable::invalidate-size} signal will never be
     *   emitted.
     */
    public static final PaintableFlags SIZE = new PaintableFlags(1);
    
    /**
     * The content is immutable.
     *   The {@code GdkPaintable::invalidate-contents} signal will never be
     *   emitted.
     */
    public static final PaintableFlags CONTENTS = new PaintableFlags(2);
    
    private int value;
    
    public PaintableFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PaintableFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public PaintableFlags combined(PaintableFlags mask) {
        return new PaintableFlags(this.getValue() | mask.getValue());
    }
    
    public static PaintableFlags combined(PaintableFlags mask, PaintableFlags... masks) {
        int value = mask.getValue();
        for (PaintableFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PaintableFlags(value);
    }
    
}

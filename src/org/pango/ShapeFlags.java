package org.pango;

/**
 * Flags influencing the shaping process.
 * <p>
 * {@code PangoShapeFlags} can be passed to {@link Pango#shapeWithFlags}.
 */
public class ShapeFlags {

    /**
     * Default value
     */
    public static final ShapeFlags NONE = new ShapeFlags(0);
    
    /**
     * Round glyph positions and widths to whole device units
     *   This option should be set if the target renderer can't do subpixel positioning of glyphs
     */
    public static final ShapeFlags ROUND_POSITIONS = new ShapeFlags(1);
    
    private int value;
    
    public ShapeFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ShapeFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ShapeFlags combined(ShapeFlags mask) {
        return new ShapeFlags(this.getValue() | mask.getValue());
    }
    
    public static ShapeFlags combined(ShapeFlags mask, ShapeFlags... masks) {
        int value = mask.getValue();
        for (ShapeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ShapeFlags(value);
    }
    
}

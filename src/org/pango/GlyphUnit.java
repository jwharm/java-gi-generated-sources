package org.pango;

/**
 * The {@code PangoGlyphUnit} type is used to store dimensions within
 * Pango.
 * <p>
 * Dimensions are stored in 1/PANGO_SCALE of a device unit.
 * (A device unit might be a pixel for screen display, or
 * a point on a printer.) PANGO_SCALE is currently 1024, and
 * may change in the future (unlikely though), but you should not
 * depend on its exact value.
 * <p>
 * The PANGO_PIXELS() macro can be used to convert from glyph units
 * into device units with correct rounding.
 */
public class GlyphUnit {
    private int value;
    
    public GlyphUnit(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(GlyphUnit[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

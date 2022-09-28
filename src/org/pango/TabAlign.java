package org.pango;

/**
 * {@code PangoTabAlign} specifies where the text appears relative to the tab stop
 * position.
 */
public class TabAlign {

    /**
     * the text appears to the right of the tab stop position
     */
    public static final TabAlign LEFT = new TabAlign(0);
    
    /**
     * the text appears to the left of the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    public static final TabAlign RIGHT = new TabAlign(1);
    
    /**
     * the text is centered at the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    public static final TabAlign CENTER = new TabAlign(2);
    
    /**
     * text before the first occurrence of the decimal point
     *   character appears to the left of the tab stop position (until the available
     *   space is filled), the rest to the right. Since: 1.50
     */
    public static final TabAlign DECIMAL = new TabAlign(3);
    
    private int value;
    
    public TabAlign(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TabAlign[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

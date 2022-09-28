package org.pango;

/**
 * {@code PangoRenderPart} defines different items to render for such
 * purposes as setting colors.
 */
public class RenderPart {

    /**
     * the text itself
     */
    public static final RenderPart FOREGROUND = new RenderPart(0);
    
    /**
     * the area behind the text
     */
    public static final RenderPart BACKGROUND = new RenderPart(1);
    
    /**
     * underlines
     */
    public static final RenderPart UNDERLINE = new RenderPart(2);
    
    /**
     * strikethrough lines
     */
    public static final RenderPart STRIKETHROUGH = new RenderPart(3);
    
    /**
     * overlines
     */
    public static final RenderPart OVERLINE = new RenderPart(4);
    
    private int value;
    
    public RenderPart(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(RenderPart[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}

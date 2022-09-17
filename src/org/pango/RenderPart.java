package org.pango;

/**
 * <code>PangoRenderPart</code> defines different items to render for such
 * purposes as setting colors.
 */
public enum RenderPart {

    /**
     * the text itself
     */
    FOREGROUND,
    
    /**
     * the area behind the text
     */
    BACKGROUND,
    
    /**
     * underlines
     */
    UNDERLINE,
    
    /**
     * strikethrough lines
     */
    STRIKETHROUGH,
    
    /**
     * overlines
     */
    OVERLINE;
    
    public static RenderPart fromValue(int value) {
        return switch(value) {
            case 0 -> FOREGROUND;
            case 1 -> BACKGROUND;
            case 2 -> UNDERLINE;
            case 3 -> STRIKETHROUGH;
            case 4 -> OVERLINE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FOREGROUND -> 0;
            case BACKGROUND -> 1;
            case UNDERLINE -> 2;
            case STRIKETHROUGH -> 3;
            case OVERLINE -> 4;
        };
    }

}

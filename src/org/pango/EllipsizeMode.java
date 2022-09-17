package org.pango;

/**
 * <code>PangoEllipsizeMode</code> describes what sort of ellipsization
 * should be applied to text.
 * 
 * In the ellipsization process characters are removed from the
 * text in order to make it fit to a given width and replaced
 * with an ellipsis.
 */
public enum EllipsizeMode {

    /**
     * No ellipsization
     */
    NONE,
    
    /**
     * Omit characters at the start of the text
     */
    START,
    
    /**
     * Omit characters in the middle of the text
     */
    MIDDLE,
    
    /**
     * Omit characters at the end of the text
     */
    END;
    
    public static EllipsizeMode fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> START;
            case 2 -> MIDDLE;
            case 3 -> END;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case START -> 1;
            case MIDDLE -> 2;
            case END -> 3;
        };
    }

}

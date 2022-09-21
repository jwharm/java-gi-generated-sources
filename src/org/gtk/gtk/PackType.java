package org.gtk.gtk;

/**
 * Represents the packing location of a children in its parent.
 * <p>
 * See {@link WindowControls} for example.
 */
public enum PackType {

    /**
     * The child is packed into the start of the widget
     */
    START,
    
    /**
     * The child is packed into the end of the widget
     */
    END;
    
    public static PackType fromValue(int value) {
        return switch(value) {
            case 0 -> START;
            case 1 -> END;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case START -> 0;
            case END -> 1;
        };
    }

}

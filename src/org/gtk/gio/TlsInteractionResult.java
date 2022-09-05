package org.gtk.gio;

/**
 * #GTlsInteractionResult is returned by various functions in #GTlsInteraction
 * when finishing an interaction request.
 */
public enum TlsInteractionResult {

    /**
     * The interaction was unhandled (i.e. not
     *     implemented).
     */
    UNHANDLED,
    
    /**
     * The interaction completed, and resulting data
     *     is available.
     */
    HANDLED,
    
    /**
     * The interaction has failed, or was cancelled.
     *     and the operation should be aborted.
     */
    FAILED;
    
    public static TlsInteractionResult fromValue(int value) {
        return switch(value) {
            case 0 -> UNHANDLED;
            case 1 -> HANDLED;
            case 2 -> FAILED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNHANDLED -> 0;
            case HANDLED -> 1;
            case FAILED -> 2;
        };
    }

}

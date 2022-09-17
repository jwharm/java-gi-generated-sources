package org.gtk.gtk;

/**
 * The type of message being displayed in a {@link [class@MessageDialog]}.
 */
public enum MessageType {

    /**
     * Informational message
     */
    INFO,
    
    /**
     * Non-fatal warning message
     */
    WARNING,
    
    /**
     * Question requiring a choice
     */
    QUESTION,
    
    /**
     * Fatal error message
     */
    ERROR,
    
    /**
     * None of the above
     */
    OTHER;
    
    public static MessageType fromValue(int value) {
        return switch(value) {
            case 0 -> INFO;
            case 1 -> WARNING;
            case 2 -> QUESTION;
            case 3 -> ERROR;
            case 4 -> OTHER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INFO -> 0;
            case WARNING -> 1;
            case QUESTION -> 2;
            case ERROR -> 3;
            case OTHER -> 4;
        };
    }

}

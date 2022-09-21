package org.gtk.gtk;

/**
 * Describes how {@link LevelBar} contents should be rendered.
 * <p>
 * Note that this enumeration could be extended with additional modes
 * in the future.
 */
public enum LevelBarMode {

    /**
     * the bar has a continuous mode
     */
    CONTINUOUS,
    
    /**
     * the bar has a discrete mode
     */
    DISCRETE;
    
    public static LevelBarMode fromValue(int value) {
        return switch(value) {
            case 0 -> CONTINUOUS;
            case 1 -> DISCRETE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case CONTINUOUS -> 0;
            case DISCRETE -> 1;
        };
    }

}

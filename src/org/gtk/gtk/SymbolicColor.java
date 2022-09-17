package org.gtk.gtk;

/**
 * The indexes of colors passed to symbolic color rendering, such as
 * {@link org.gtk.gtk.SymbolicPaintable#snapshotSymbolic}.
 * 
 * More values may be added over time.
 */
public enum SymbolicColor {

    /**
     * The default foreground color
     */
    FOREGROUND,
    
    /**
     * Indication color for errors
     */
    ERROR,
    
    /**
     * Indication color for warnings
     */
    WARNING,
    
    /**
     * Indication color for success
     */
    SUCCESS;
    
    public static SymbolicColor fromValue(int value) {
        return switch(value) {
            case 0 -> FOREGROUND;
            case 1 -> ERROR;
            case 2 -> WARNING;
            case 3 -> SUCCESS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FOREGROUND -> 0;
            case ERROR -> 1;
            case WARNING -> 2;
            case SUCCESS -> 3;
        };
    }

}

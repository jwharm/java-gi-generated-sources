package org.gtk.gio;

/**
 * #GDataStreamNewlineType is used when checking for or setting the line endings for a given file.
 */
public enum DataStreamNewlineType {

    /**
     * Selects "LF" line endings, common on most modern UNIX platforms.
     */
    LF,
    
    /**
     * Selects "CR" line endings.
     */
    CR,
    
    /**
     * Selects "CR, LF" line ending, common on Microsoft Windows.
     */
    CR_LF,
    
    /**
     * Automatically try to handle any line ending type.
     */
    ANY;
    
    public static DataStreamNewlineType fromValue(int value) {
        return switch(value) {
            case 0 -> LF;
            case 1 -> CR;
            case 2 -> CR_LF;
            case 3 -> ANY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LF -> 0;
            case CR -> 1;
            case CR_LF -> 2;
            case ANY -> 3;
        };
    }

}
